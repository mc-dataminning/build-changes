import com.mojang.serialization.MapCodec;

public class dkv extends deu {
   public static final MapCodec<dkv> a = b(dkv::new);
   public static final dso b = dky.d;

   @Override
   public MapCodec<dkv> a() {
      return a;
   }

   public dkv(drw.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, cms $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dbt $$0, iz $$1, drx $$2, bsp $$3) {
      if (!$$3.bW()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.g() instanceof csi && new cxv($$4, $$5, $$0, $$6).b() ? bqr.e : bqr.a;
   }

   private static void d(drx $$0, dbt $$1, iz $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean d_(drx $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, cuk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && czw.a(czy.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dbt $$0, iz $$1) {
      double $$2 = 0.5625;
      azc $$3 = $$0.z;

      for (je $$4 : je.values()) {
         iz $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            je.a $$6 = $$4.o();
            double $$7 = $$6 == je.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == je.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == je.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(ld.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
   }
}
