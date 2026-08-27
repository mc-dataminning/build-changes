public interface ddj extends bgj {
   ehx c = csm.a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   ehx x_ = csm.a(0.0, 16.0, 0.0, 16.0, 32.0, 16.0);
   ehx y_ = ehu.a(c, x_);

   default ehx aq_() {
      return y_;
   }

   double G();

   double H();

   double J();
}
