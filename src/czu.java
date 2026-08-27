public class czu extends csm {
   public static final int a = 2;
   public static final dga b = dfq.aE;
   private static final int c = 24000;
   private static final int d = 12000;
   private static final int e = 300;
   private static final ehx f = csm.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   public czu(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(b);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return f;
   }

   public int h(dfa $$0) {
      return $$0.c(b);
   }

   private boolean n(dfa $$0) {
      return this.h($$0) == 2;
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, aow.wL, aox.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(b, Integer.valueOf(this.h($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, aow.wM, aox.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         bww $$4 = bim.aN.a((cpm)$$1);
         if ($$4 != null) {
            ehe $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), arp.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.r_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(djk.i, $$2, djk.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }

   public static boolean a(cos $$0, gu $$1) {
      return $$0.a_($$1.d()).a(apl.ck);
   }
}
