public interface dfp extends bij {
   ekb c = cut.a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   ekb d = cut.a(0.0, 16.0, 0.0, 16.0, 32.0, 16.0);
   ekb e = ejy.a(c, d);

   default ekb h() {
      return e;
   }

   double H();

   double I();

   double K();
}
