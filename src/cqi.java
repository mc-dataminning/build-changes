public class cqi {
   private static final double a = 50.0;

   public static fgc a(byf $$0, bai $$1) {
      int $$2 = 90;
      float $$3 = $$0.aX + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = azz.h($$1.i(), 4.0F, 8.0F);
      fgc $$5 = fgc.a(0.0F, $$3).c((double)$$4);
      return $$0.dt().e($$5);
   }

   public static boolean a(cqg $$0, fgc $$1) {
      fgc $$2 = new fgc($$0.dA(), $$0.dC(), $$0.dG());
      return $$1.f($$2) > a($$0) ? false : $$0.dV().a(new djq($$2, $$1, djq.a.a, djq.b.a, $$0)).d() == fga.a.a;
   }

   private static double a(cqg $$0) {
      return Math.max(50.0, $$0.h(bzl.m));
   }
}
