package com.example.exer1textview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        tV = findViewById(R.id.tV);


    }

    public void click(View view) {
        tV.setTextColor(Color.GREEN);
        tV.setText("Oh, yea, I’ve been clicked!");

    }

}