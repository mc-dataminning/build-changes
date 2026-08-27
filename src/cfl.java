public class cfl {
   private static final double a = 50.0;

   public static ens a(bog $$0, awo $$1) {
      int $$2 = 90;
      float $$3 = $$0.aW + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = awh.i($$1.i(), 4.0F, 8.0F);
      ens $$5 = ens.a(0.0F, $$3).a((double)$$4);
      return $$0.dk().e($$5);
   }

   public static boolean a(cfj $$0, ens $$1) {
      ens $$2 = new ens($$0.dr(), $$0.dt(), $$0.dx());
      return $$1.f($$2) > 50.0 ? false : $$0.dM().a(new cuw($$2, $$1, cuw.a.a, cuw.b.a, $$0)).c() == enq.a.a;
   }
}
