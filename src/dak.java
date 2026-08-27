public interface dak extends bdq {
   efb c = cpn.a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   efb x_ = cpn.a(0.0, 16.0, 0.0, 16.0, 32.0, 16.0);
   efb y_ = eey.a(c, x_);

   default efb aq_() {
      return y_;
   }

   double G();

   double I();

   double J();
}
