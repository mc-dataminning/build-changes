public class cmk {
   private static final double a = 50.0;

   public static ezh a(buv $$0, azr $$1) {
      int $$2 = 90;
      float $$3 = $$0.aW + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = azj.h($$1.i(), 4.0F, 8.0F);
      ezh $$5 = ezh.a(0.0F, $$3).c((double)$$4);
      return $$0.dv().e($$5);
   }

   public static boolean a(cmi $$0, ezh $$1) {
      ezh $$2 = new ezh($$0.dC(), $$0.dE(), $$0.dI());
      return $$1.f($$2) > a($$0) ? false : $$0.dX().a(new ded($$2, $$1, ded.a.a, ded.b.a, $$0)).d() == ezf.a.a;
   }

   private static double a(cmi $$0) {
      return Math.max(50.0, $$0.h(bwd.m));
   }
}
