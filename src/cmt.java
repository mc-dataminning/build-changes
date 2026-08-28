public class cmt {
   private static final double a = 50.0;

   public static ezr a(bve $$0, azv $$1) {
      int $$2 = 90;
      float $$3 = $$0.aZ + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = azn.h($$1.i(), 4.0F, 8.0F);
      ezr $$5 = ezr.a(0.0F, $$3).c((double)$$4);
      return $$0.dw().e($$5);
   }

   public static boolean a(cmr $$0, ezr $$1) {
      ezr $$2 = new ezr($$0.dD(), $$0.dF(), $$0.dJ());
      return $$1.f($$2) > a($$0) ? false : $$0.dY().a(new den($$2, $$1, den.a.a, den.b.a, $$0)).d() == ezp.a.a;
   }

   private static double a(cmr $$0) {
      return Math.max(50.0, $$0.h(bwm.m));
   }
}
