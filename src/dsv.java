public interface dsv extends brl {
   eyr t_ = dhm.a(0.0, 11.0, 0.0, 16.0, 32.0, 16.0).e().get(0);

   default eyr am_() {
      return t_;
   }

   double L();

   double M();

   double O();

   boolean P();
}
