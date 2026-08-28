public class cmb {
   private static final double a = 50.0;

   public static eyw a(bun $$0, azn $$1) {
      int $$2 = 90;
      float $$3 = $$0.aV + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = azf.h($$1.i(), 4.0F, 8.0F);
      eyw $$5 = eyw.a(0.0F, $$3).c((double)$$4);
      return $$0.dq().e($$5);
   }

   public static boolean a(clz $$0, eyw $$1) {
      eyw $$2 = new eyw($$0.dx(), $$0.dz(), $$0.dD());
      return $$1.f($$2) > a($$0) ? false : $$0.dS().a(new ddr($$2, $$1, ddr.a.a, ddr.b.a, $$0)).d() == eyu.a.a;
   }

   private static double a(clz $$0) {
      return Math.max(50.0, $$0.h(bvu.m));
   }
}
