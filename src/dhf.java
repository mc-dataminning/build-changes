import com.mojang.serialization.MapCodec;

public class dhf extends dfi {
   public static final MapCodec<dhf> a = b(dhf::new);

   @Override
   public MapCodec<dhf> a() {
      return a;
   }

   public dhf(dsk.d $$0) {
      super($$0);
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      if ($$3.a(5) == 0) {
         jf $$4 = jf.b($$3);
         if ($$4 != jf.b) {
            ja $$5 = $$2.a($$4);
            dsl $$6 = $$1.a_($$5);
            if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(lj.aE, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
