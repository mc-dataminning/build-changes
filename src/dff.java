import com.mojang.serialization.MapCodec;

public class dff extends czf {
   public static final MapCodec<dff> a = b(dff::new);
   public static final dmv b = dfi.d;

   @Override
   public MapCodec<dff> a() {
      return a;
   }

   public dff(dmd.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, cia $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, bof $$3) {
      if (!$$3.bQ()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.d() instanceof cnl && new crx($$4, $$5, $$0, $$6).b() ? bmn.e : bmn.a;
   }

   private static void d(dme $$0, cwe $$1, ib $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean e_(dme $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, cpq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && cua.a(cuc.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(cwe $$0, ib $$1) {
      double $$2 = 0.5625;
      awt $$3 = $$0.z;

      for (ih $$4 : ih.values()) {
         ib $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            ih.a $$6 = $$4.o();
            double $$7 = $$6 == ih.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == ih.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == ih.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(jv.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }
}
