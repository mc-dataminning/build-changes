import com.mojang.serialization.MapCodec;

public class dma extends dfy {
   public static final MapCodec<dma> a = b(dma::new);
   public static final dtt b = dmd.d;

   @Override
   public MapCodec<dma> a() {
      return a;
   }

   public dma(dtb.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(dtc $$0, dcw $$1, jd $$2, cmx $$3) {
      d($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcw $$0, jd $$1, dtc $$2, bsr $$3) {
      if (!$$3.bX()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, eww $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.g() instanceof cso && new cyd($$4, $$5, $$0, $$6).b() ? bqt.e : bqt.a;
   }

   private static void d(dtc $$0, dcw $$1, jd $$2) {
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
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, cuq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bqc.a(1, 5));
      }
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dcw $$0, jd $$1) {
      double $$2 = 0.5625;
      ayw $$3 = $$0.z;

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
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
   }
}
