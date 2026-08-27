import com.mojang.serialization.MapCodec;

public class dlr extends dfc {
   public static final MapCodec<dlr> a = b(dlr::new);
   public static final dtt b = dlu.d;

   @Override
   public MapCodec<dlr> a() {
      return a;
   }

   public dlr(dtb.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, cly $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dca $$0, ir $$1, dtc $$2, brv $$3) {
      if (!$$3.cb()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      if ($$2.C) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.f() instanceof csc && new cyd($$4, $$5, $$0, $$6).b() ? bqc.e : bqc.a;
   }

   private static void d(dtc $$0, dca $$1, ir $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean d_(dtc $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, cuh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && dae.a(dag.v, $$3) == 0) {
         int $$5 = 1 + $$1.A.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dca $$0, ir $$1) {
      double $$2 = 0.5625;
      ayt $$3 = $$0.A;

      for (iw $$4 : iw.values()) {
         ir $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            iw.a $$6 = $$4.o();
            double $$7 = $$6 == iw.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == iw.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == iw.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(kv.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }
}
