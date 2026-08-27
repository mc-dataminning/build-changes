public class day extends csq {
   private static final dge a = dfu.aT;
   private static final int b = 20;
   private static final int c = 8;

   public day(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public void a(cpq $$0, dfe $$1, ehe $$2, cch $$3) {
      int $$4 = a((cpr)$$0, $$1, $$2, (bil)$$3);
      if ($$3.v() instanceof ako $$6) {
         $$6.a(apj.aE);
         al.L.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(cpr $$0, dfe $$1, ehe $$2, bil $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cbv ? 20 : 8;
      if (!$$0.L().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(ehe $$0, ehi $$1) {
      hc $$2 = $$0.b();
      double $$3 = Math.abs(ars.e($$1.c) - 0.5);
      double $$4 = Math.abs(ars.e($$1.d) - 0.5);
      double $$5 = Math.abs(ars.e($$1.e) - 0.5);
      hc.a $$6 = $$2.o();
      double $$7;
      if ($$6 == hc.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == hc.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, ars.c(15.0 * ars.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(cpr $$0, dfe $$1, int $$2, gw $$3, int $$4) {
      $$0.a($$3, $$1.a(a, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$0.c(a) != 0) {
         $$1.a($$2, $$0.a(a, Integer.valueOf(0)), 3);
      }
   }

   @Override
   public int a(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return $$0.c(a);
   }

   @Override
   public boolean f_(dfe $$0) {
      return true;
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$1.r_() && !$$0.a($$3.b())) {
         if ($$0.c(a) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(a, Integer.valueOf(0)), 18);
         }
      }
   }
}
