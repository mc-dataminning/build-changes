import com.mojang.serialization.MapCodec;

public class dbf extends cvf {
   public static final MapCodec<dbf> a = b(dbf::new);
   public static final die b = dbi.d;

   @Override
   public MapCodec<dbf> a() {
      return a;
   }

   public dbf(dhm.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cdz $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bkv $$3) {
      if (!$$3.bT()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.B) {
         a($$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }

      clo $$6 = $$3.b($$4);
      return $$6.d() instanceof cjh && new cnw($$3, $$4, $$6, $$5).b() ? bjb.d : bjb.a;
   }

   private static void d(dhn $$0, csf $$1, hx $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   public boolean e_(dhn $$0) {
      return $$0.c(b);
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, clo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && cqb.a(cqd.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(csf $$0, hx $$1) {
      double $$2 = 0.5625;
      atw $$3 = $$0.z;

      for (ib $$4 : ib.values()) {
         hx $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            ib.a $$6 = $$4.o();
            double $$7 = $$6 == ib.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == ib.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == ib.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(jq.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }
}
