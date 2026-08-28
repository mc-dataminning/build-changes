public class cmp {
   private static final double a = 50.0;

   public static ezn a(bva $$0, azs $$1) {
      int $$2 = 90;
      float $$3 = $$0.aZ + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = azk.h($$1.i(), 4.0F, 8.0F);
      ezn $$5 = ezn.a(0.0F, $$3).c((double)$$4);
      return $$0.dv().e($$5);
   }

   public static boolean a(cmn $$0, ezn $$1) {
      ezn $$2 = new ezn($$0.dC(), $$0.dE(), $$0.dI());
      return $$1.f($$2) > a($$0) ? false : $$0.dX().a(new dej($$2, $$1, dej.a.a, dej.b.a, $$0)).d() == ezl.a.a;
   }

   private static double a(cmn $$0) {
      return Math.max(50.0, $$0.h(bwi.m));
   }
}
