public interface djv extends blp {
   eos z_ = cys.a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   eos A_ = cys.a(0.0, 16.0, 0.0, 16.0, 32.0, 16.0);
   eos e = eop.a(z_, A_);

   default eos ak_() {
      return e;
   }

   double I();

   double J();

   double K();
}
