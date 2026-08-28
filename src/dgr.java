import com.mojang.serialization.MapCodec;

public class dgr extends deu {
   public static final MapCodec<dgr> a = b(dgr::new);

   @Override
   public MapCodec<dgr> a() {
      return a;
   }

   public dgr(drw.d $$0) {
      super($$0);
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      if ($$3.a(5) == 0) {
         je $$4 = je.b($$3);
         if ($$4 != je.b) {
            iz $$5 = $$2.a($$4);
            drx $$6 = $$1.a_($$5);
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
