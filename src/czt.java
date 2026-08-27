public class czt extends csl {
   public static final int a = 2;
   public static final dfz b = dfp.aE;
   private static final int c = 24000;
   private static final int d = 12000;
   private static final int e = 300;
   private static final ehw f = csl.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   public czt(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(b);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return f;
   }

   public int h(dez $$0) {
      return $$0.c(b);
   }

   private boolean n(dez $$0) {
      return this.h($$0) == 2;
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, aow.wL, aox.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(b, Integer.valueOf(this.h($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, aow.wM, aox.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         bwv $$4 = bim.aN.a((cpl)$$1);
         if ($$4 != null) {
            ehd $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), arp.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.r_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(djj.i, $$2, djj.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }

   public static boolean a(cor $$0, gu $$1) {
      return $$0.a_($$1.d()).a(apl.ck);
   }
}
