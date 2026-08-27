public interface dhb extends bje {
   elu x_ = cvz.a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   elu y_ = cvz.a(0.0, 16.0, 0.0, 16.0, 32.0, 16.0);
   elu e = elr.a(x_, y_);

   default elu aj_() {
      return e;
   }

   double I();

   double J();

   double K();
}
