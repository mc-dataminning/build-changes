import com.mojang.serialization.MapCodec;

public class dms extends dku {
   public static final MapCodec<dms> a = b(dms::new);

   @Override
   public MapCodec<dms> a() {
      return a;
   }

   public dms(dyl.d $$0) {
      super($$0);
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if ($$3.a(5) == 0) {
         jo $$4 = jo.b($$3);
         if ($$4 != jo.b) {
            jj $$5 = $$2.a($$4);
            dym $$6 = $$1.a_($$5);
            if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(lv.aH, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
