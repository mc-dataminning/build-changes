public class cmx {
   private static final double a = 50.0;

   public static fbb a(bvi $$0, azh $$1) {
      int $$2 = 90;
      float $$3 = $$0.aZ + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = ayz.h($$1.i(), 4.0F, 8.0F);
      fbb $$5 = fbb.a(0.0F, $$3).c((double)$$4);
      return $$0.dt().e($$5);
   }

   public static boolean a(cmv $$0, fbb $$1) {
      fbb $$2 = new fbb($$0.dA(), $$0.dC(), $$0.dG());
      return $$1.f($$2) > a($$0) ? false : $$0.dV().a(new dfr($$2, $$1, dfr.a.a, dfr.b.a, $$0)).d() == faz.a.a;
   }

   private static double a(cmv $$0) {
      return Math.max(50.0, $$0.h(bwq.m));
   }
}
