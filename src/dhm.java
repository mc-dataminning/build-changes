public interface dhm extends bjo {
   emf y_ = cwj.a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   emf z_ = cwj.a(0.0, 16.0, 0.0, 16.0, 32.0, 16.0);
   emf e = emc.a(y_, z_);

   default emf aj_() {
      return e;
   }

   double I();

   double J();

   double K();
}
