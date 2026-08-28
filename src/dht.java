import com.mojang.serialization.MapCodec;

public class dht extends dfw {
   public static final MapCodec<dht> a = b(dht::new);

   @Override
   public MapCodec<dht> a() {
      return a;
   }

   public dht(dsz.d $$0) {
      super($$0);
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      if ($$3.a(5) == 0) {
         ji $$4 = ji.b($$3);
         if ($$4 != ji.b) {
            jd $$5 = $$2.a($$4);
            dta $$6 = $$1.a_($$5);
            if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(lm.aE, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
