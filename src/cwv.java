public class cwv extends cpn {
   public static final int a = 2;
   public static final ddb b = dcr.aE;
   private static final int c = 24000;
   private static final int d = 12000;
   private static final int e = 300;
   private static final efb f = cpn.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   public cwv(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(b);
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return f;
   }

   public int h(dcb $$0) {
      return $$0.c(b);
   }

   private boolean n(dcb $$0) {
      return this.h($$0) == 2;
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, amh.wL, ami.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(b, Integer.valueOf(this.h($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, amh.wM, ami.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         btx $$4 = bfn.aN.a((cmm)$$1);
         if ($$4 != null) {
            eei $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), apa.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.r_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dgl.i, $$2, dgl.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }

   public static boolean a(cls $$0, gu $$1) {
      return $$0.a_($$1.d()).a(amw.ci);
   }
}
