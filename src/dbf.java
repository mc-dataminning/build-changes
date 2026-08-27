public class dbf extends csx {
   private static final dgl a = dgb.aT;
   private static final int b = 20;
   private static final int c = 8;

   public dbf(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public void a(cpx $$0, dfl $$1, ehl $$2, cco $$3) {
      int $$4 = a((cpy)$$0, $$1, $$2, (bis)$$3);
      if ($$3.v() instanceof akt $$6) {
         $$6.a(app.aE);
         al.L.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(cpy $$0, dfl $$1, ehl $$2, bis $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof ccc ? 20 : 8;
      if (!$$0.L().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(ehl $$0, ehp $$1) {
      hc $$2 = $$0.b();
      double $$3 = Math.abs(ary.e($$1.c) - 0.5);
      double $$4 = Math.abs(ary.e($$1.d) - 0.5);
      double $$5 = Math.abs(ary.e($$1.e) - 0.5);
      hc.a $$6 = $$2.o();
      double $$7;
      if ($$6 == hc.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == hc.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, ary.c(15.0 * ary.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(cpy $$0, dfl $$1, int $$2, gw $$3, int $$4) {
      $$0.a($$3, $$1.a(a, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if ($$0.c(a) != 0) {
         $$1.a($$2, $$0.a(a, Integer.valueOf(0)), 3);
      }
   }

   @Override
   public int a(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$0.c(a);
   }

   @Override
   public boolean f_(dfl $$0) {
      return true;
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(a) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(a, Integer.valueOf(0)), 18);
         }
      }
   }
}
