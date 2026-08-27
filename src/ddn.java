public interface ddn extends bgm {
   eib c = csq.a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   eib x_ = csq.a(0.0, 16.0, 0.0, 16.0, 32.0, 16.0);
   eib y_ = ehy.a(c, x_);

   default eib ap_() {
      return y_;
   }

   double G();

   double H();

   double J();
}
