public class czs extends csk {
   public static final int a = 2;
   public static final dfy b = dfo.aE;
   private static final int c = 24000;
   private static final int d = 12000;
   private static final int e = 300;
   private static final ehy f = csk.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   public czs(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(b);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return f;
   }

   public int h(dey $$0) {
      return $$0.c(b);
   }

   private boolean n(dey $$0) {
      return this.h($$0) == 2;
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, aou.wL, aov.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(b, Integer.valueOf(this.h($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, aou.wM, aov.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         bwu $$4 = bik.aN.a((cpk)$$1);
         if ($$4 != null) {
            ehf $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), aro.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.r_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dji.i, $$2, dji.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }

   public static boolean a(coq $$0, gv $$1) {
      return $$0.a_($$1.d()).a(apj.ck);
   }
}
