public class cmw {
   private static final double a = 50.0;

   public static ezy a(bvh $$0, azu $$1) {
      int $$2 = 90;
      float $$3 = $$0.aY + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = azm.h($$1.i(), 4.0F, 8.0F);
      ezy $$5 = ezy.a(0.0F, $$3).c((double)$$4);
      return $$0.dt().e($$5);
   }

   public static boolean a(cmu $$0, ezy $$1) {
      ezy $$2 = new ezy($$0.dA(), $$0.dC(), $$0.dG());
      return $$1.f($$2) > a($$0) ? false : $$0.dV().a(new deu($$2, $$1, deu.a.a, deu.b.a, $$0)).d() == ezw.a.a;
   }

   private static double a(cmu $$0) {
      return Math.max(50.0, $$0.h(bwp.m));
   }
}
