import com.mojang.serialization.MapCodec;

public class dla extends dez {
   public static final MapCodec<dla> a = b(dla::new);
   public static final dst b = dld.d;

   @Override
   public MapCodec<dla> a() {
      return a;
   }

   public dla(dsb.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, cmx $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dby $$0, iz $$1, dsc $$2, bsu $$3) {
      if (!$$3.bW()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.g() instanceof csn && new cya($$4, $$5, $$0, $$6).b() ? bqw.e : bqw.a;
   }

   private static void d(dsc $$0, dby $$1, iz $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean d_(dsc $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, cup $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && dab.a(dad.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dby $$0, iz $$1) {
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
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }
}
