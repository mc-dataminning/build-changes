public class cld {
   private static final double a = 50.0;

   public static evt a(btr $$0, azh $$1) {
      int $$2 = 90;
      float $$3 = $$0.ba + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = ayz.i($$1.i(), 4.0F, 8.0F);
      evt $$5 = evt.a(0.0F, $$3).a((double)$$4);
      return $$0.dn().e($$5);
   }

   public static boolean a(clb $$0, evt $$1) {
      evt $$2 = new evt($$0.du(), $$0.dw(), $$0.dA());
      return $$1.f($$2) > 50.0 ? false : $$0.dP().a(new dbj($$2, $$1, dbj.a.a, dbj.b.a, $$0)).c() == evr.a.a;
   }
}
