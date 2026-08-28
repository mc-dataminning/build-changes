import com.mojang.serialization.MapCodec;

public class dgv extends dey {
   public static final MapCodec<dgv> a = b(dgv::new);

   @Override
   public MapCodec<dgv> a() {
      return a;
   }

   public dgv(dsa.d $$0) {
      super($$0);
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      if ($$3.a(5) == 0) {
         je $$4 = je.b($$3);
         if ($$4 != je.b) {
            iz $$5 = $$2.a($$4);
            dsb $$6 = $$1.a_($$5);
            if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(li.aE, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
