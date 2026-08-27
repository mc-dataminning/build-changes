import com.mojang.serialization.MapCodec;

public class ddv extends dby {
   public static final MapCodec<ddv> a = b(ddv::new);

   @Override
   public MapCodec<ddv> a() {
      return a;
   }

   public ddv(doy.d $$0) {
      super($$0);
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      if ($$3.a(5) == 0) {
         ih $$4 = ih.b($$3);
         if ($$4 != ih.b) {
            ib $$5 = $$2.a($$4);
            doz $$6 = $$1.a_($$5);
            if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(kl.aC, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
