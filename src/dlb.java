import com.mojang.serialization.MapCodec;

public class dlb extends dfa {
   public static final MapCodec<dlb> a = b(dlb::new);
   public static final dsu b = dle.d;

   @Override
   public MapCodec<dlb> a() {
      return a;
   }

   public dlb(dsc.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, cmy $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dbz $$0, iz $$1, dsd $$2, bsv $$3) {
      if (!$$3.bW()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.g() instanceof cso && new cyb($$4, $$5, $$0, $$6).b() ? bqx.e : bqx.a;
   }

   private static void d(dsd $$0, dbz $$1, iz $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean d_(dsd $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, cuq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && dac.a(dae.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dbz $$0, iz $$1) {
      double $$2 = 0.5625;
      azh $$3 = $$0.z;

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
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }
}
