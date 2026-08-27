import com.mojang.serialization.MapCodec;

public class dga extends daa {
   public static final MapCodec<dga> a = b(dga::new);
   public static final dnq b = dgd.d;

   @Override
   public MapCodec<dga> a() {
      return a;
   }

   public dga(dmy.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, cis $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, bow $$3) {
      if (!$$3.bT()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.d() instanceof cof && new css($$4, $$5, $$0, $$6).b() ? bne.e : bne.a;
   }

   private static void d(dmz $$0, cwz $$1, ib $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean e_(dmz $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, cqk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && cuv.a(cux.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(cwz $$0, ib $$1) {
      double $$2 = 0.5625;
      axd $$3 = $$0.z;

      for (ih $$4 : ih.values()) {
         ib $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            ih.a $$6 = $$4.o();
            double $$7 = $$6 == ih.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == ih.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == ih.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(jw.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }
}
