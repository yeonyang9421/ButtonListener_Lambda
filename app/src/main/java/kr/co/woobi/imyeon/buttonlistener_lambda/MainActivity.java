package kr.co.woobi.imyeon.buttonlistener_lambda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btn1=(Button)findViewById(R.id.btn1)    ;
    btn1.setOnClickListener(clickListener);
    }

    View.OnClickListener clickListener=new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn1:
                    Toast.makeText(v.getContext(),((Button)v).getText(),Toast.LENGTH_SHORT ).show();
            }
        }
    };
}
