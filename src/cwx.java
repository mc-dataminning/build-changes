import com.mojang.serialization.MapCodec;

public class cwx extends cva {
   public static final MapCodec<cwx> a = b(cwx::new);

   @Override
   public MapCodec<cwx> a() {
      return a;
   }

   public cwx(dhh.d $$0) {
      super($$0);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      if ($$3.a(5) == 0) {
         hx $$4 = hx.b($$3);
         if ($$4 != hx.b) {
            ht $$5 = $$2.a($$4);
            dhi $$6 = $$1.a_($$5);
            if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(js.az, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
