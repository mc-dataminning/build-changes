public class clt {
   private static final double a = 50.0;

   public static eye a(buf $$0, azk $$1) {
      int $$2 = 90;
      float $$3 = $$0.aW + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = azc.h($$1.i(), 4.0F, 8.0F);
      eye $$5 = eye.a(0.0F, $$3).c((double)$$4);
      return $$0.dq().e($$5);
   }

   public static boolean a(clr $$0, eye $$1) {
      eye $$2 = new eye($$0.dx(), $$0.dz(), $$0.dD());
      return $$1.f($$2) > a($$0) ? false : $$0.dS().a(new dda($$2, $$1, dda.a.a, dda.b.a, $$0)).c() == eyc.a.a;
   }

   private static double a(clr $$0) {
      return Math.max(50.0, $$0.h(bvm.m));
   }
}
