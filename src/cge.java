public class cge {
   private static final double a = 50.0;

   public static eov a(box $$0, awt $$1) {
      int $$2 = 90;
      float $$3 = $$0.aX + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = awm.i($$1.i(), 4.0F, 8.0F);
      eov $$5 = eov.a(0.0F, $$3).a((double)$$4);
      return $$0.dh().e($$5);
   }

   public static boolean a(cgc $$0, eov $$1) {
      eov $$2 = new eov($$0.do(), $$0.dq(), $$0.du());
      return $$1.f($$2) > 50.0 ? false : $$0.dJ().a(new cvn($$2, $$1, cvn.a.a, cvn.b.a, $$0)).c() == eot.a.a;
   }
}
