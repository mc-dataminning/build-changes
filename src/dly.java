import com.mojang.serialization.MapCodec;

public class dly extends dfw {
   public static final MapCodec<dly> a = b(dly::new);
   public static final dtr b = dmb.d;

   @Override
   public MapCodec<dly> a() {
      return a;
   }

   public dly(dsz.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(dta $$0, dcu $$1, jd $$2, cmv $$3) {
      d($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, bsq $$3) {
      if (!$$3.bX()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.g() instanceof csm && new cyb($$4, $$5, $$0, $$6).b() ? bqs.e : bqs.a;
   }

   private static void d(dta $$0, dcu $$1, jd $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean d_(dta $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, cuo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bqb.a(1, 5));
      }
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dcu $$0, jd $$1) {
      double $$2 = 0.5625;
      ayv $$3 = $$0.z;

      for (ji $$4 : ji.values()) {
         jd $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            ji.a $$6 = $$4.o();
            double $$7 = $$6 == ji.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == ji.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == ji.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(lh.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }
}
