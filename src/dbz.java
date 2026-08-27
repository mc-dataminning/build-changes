import com.mojang.serialization.MapCodec;

public class dbz extends dac {
   public static final MapCodec<dbz> a = b(dbz::new);

   @Override
   public MapCodec<dbz> a() {
      return a;
   }

   public dbz(dna.d $$0) {
      super($$0);
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      if ($$3.a(5) == 0) {
         ih $$4 = ih.b($$3);
         if ($$4 != ih.b) {
            ib $$5 = $$2.a($$4);
            dnb $$6 = $$1.a_($$5);
            if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(kc.aC, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
