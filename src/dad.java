public class dad extends csv {
   public static final int a = 2;
   public static final dgj b = dfz.aE;
   private static final int c = 24000;
   private static final int d = 12000;
   private static final int e = 300;
   private static final eig f = csv.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   public dad(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(b);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return f;
   }

   public int h(dfj $$0) {
      return $$0.c(b);
   }

   private boolean n(dfj $$0) {
      return this.h($$0) == 2;
   }

   @Override
   public void a(dfj $$0, akr $$1, gw $$2, asc $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, ape.wL, apf.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(b, Integer.valueOf(this.h($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, ape.wM, apf.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         bxd $$4 = biu.aN.a((cpv)$$1);
         if ($$4 != null) {
            ehn $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), arx.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.w_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(djt.i, $$2, djt.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }

   public static boolean a(cpb $$0, gw $$1) {
      return $$0.a_($$1.d()).a(apt.ck);
   }
}
