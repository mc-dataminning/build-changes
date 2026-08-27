public interface dib extends bjv {
   emv z_ = cwy.a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   emv A_ = cwy.a(0.0, 16.0, 0.0, 16.0, 32.0, 16.0);
   emv e = ems.a(z_, A_);

   default emv ak_() {
      return e;
   }

   double I();

   double J();

   double K();
}
