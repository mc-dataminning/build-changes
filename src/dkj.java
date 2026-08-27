public interface dkj extends bme {
   epo w_ = czf.a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   epo x_ = czf.a(0.0, 16.0, 0.0, 16.0, 32.0, 16.0);
   epo e = epl.a(w_, x_);

   default epo ak_() {
      return e;
   }

   double I();

   double J();

   double K();
}
