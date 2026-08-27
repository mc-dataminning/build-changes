public class dbd extends csv {
   private static final dgj a = dfz.aT;
   private static final int b = 20;
   private static final int c = 8;

   public dbd(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public void a(cpv $$0, dfj $$1, ehj $$2, ccm $$3) {
      int $$4 = a((cpw)$$0, $$1, $$2, (biq)$$3);
      if ($$3.v() instanceof aks $$6) {
         $$6.a(apo.aE);
         al.L.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(cpw $$0, dfj $$1, ehj $$2, biq $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cca ? 20 : 8;
      if (!$$0.L().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(ehj $$0, ehn $$1) {
      hc $$2 = $$0.b();
      double $$3 = Math.abs(arx.e($$1.c) - 0.5);
      double $$4 = Math.abs(arx.e($$1.d) - 0.5);
      double $$5 = Math.abs(arx.e($$1.e) - 0.5);
      hc.a $$6 = $$2.o();
      double $$7;
      if ($$6 == hc.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == hc.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, arx.c(15.0 * arx.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(cpw $$0, dfj $$1, int $$2, gw $$3, int $$4) {
      $$0.a($$3, $$1.a(a, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   public void a(dfj $$0, akr $$1, gw $$2, asc $$3) {
      if ($$0.c(a) != 0) {
         $$1.a($$2, $$0.a(a, Integer.valueOf(0)), 3);
      }
   }

   @Override
   public int a(dfj $$0, cpb $$1, gw $$2, hc $$3) {
      return $$0.c(a);
   }

   @Override
   public boolean f_(dfj $$0) {
      return true;
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(a) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(a, Integer.valueOf(0)), 18);
         }
      }
   }
}
