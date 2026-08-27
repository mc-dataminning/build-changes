public class das extends csk {
   private static final dfy a = dfo.aT;
   private static final int b = 20;
   private static final int c = 8;

   public das(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public void a(cpk $$0, dey $$1, ehb $$2, ccd $$3) {
      int $$4 = a((cpl)$$0, $$1, $$2, (big)$$3);
      if ($$3.v() instanceof akj $$6) {
         $$6.a(ape.aE);
         ai.L.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(cpl $$0, dey $$1, ehb $$2, big $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cbr ? 20 : 8;
      if (!$$0.L().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(ehb $$0, ehf $$1) {
      hb $$2 = $$0.b();
      double $$3 = Math.abs(aro.e($$1.c) - 0.5);
      double $$4 = Math.abs(aro.e($$1.d) - 0.5);
      double $$5 = Math.abs(aro.e($$1.e) - 0.5);
      hb.a $$6 = $$2.o();
      double $$7;
      if ($$6 == hb.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == hb.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, aro.c(15.0 * aro.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(cpl $$0, dey $$1, int $$2, gv $$3, int $$4) {
      $$0.a($$3, $$1.a(a, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$0.c(a) != 0) {
         $$1.a($$2, $$0.a(a, Integer.valueOf(0)), 3);
      }
   }

   @Override
   public int a(dey $$0, coq $$1, gv $$2, hb $$3) {
      return $$0.c(a);
   }

   @Override
   public boolean f_(dey $$0) {
      return true;
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$1.r_() && !$$0.a($$3.b())) {
         if ($$0.c(a) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(a, Integer.valueOf(0)), 18);
         }
      }
   }
}
