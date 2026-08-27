import com.mojang.serialization.MapCodec;

public class dgc extends dac {
   public static final MapCodec<dgc> a = b(dgc::new);
   public static final dns b = dgf.d;

   @Override
   public MapCodec<dgc> a() {
      return a;
   }

   public dgc(dna.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, ciu $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, box $$3) {
      if (!$$3.bT()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.d() instanceof coh && new csu($$4, $$5, $$0, $$6).b() ? bnf.e : bnf.a;
   }

   private static void d(dnb $$0, cxb $$1, ib $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean e_(dnb $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, cqm $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && cux.a(cuz.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(cxb $$0, ib $$1) {
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
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }
}
