public interface dds extends bgr {
   eig c = csv.a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   eig x_ = csv.a(0.0, 16.0, 0.0, 16.0, 32.0, 16.0);
   eig y_ = eid.a(c, x_);

   default eig au_() {
      return y_;
   }

   double M();

   double N();

   double O();
}
