import com.mojang.serialization.MapCodec;

public class dkv extends dex {
   public static final MapCodec<dkv> a = b(dkv::new);

   @Override
   public MapCodec<dkv> a() {
      return a;
   }

   protected dkv(drz.d $$0) {
      super($$0);
   }

   @Override
   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      if (!$$0.a(cuq.rV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return bqu.a($$2.B);
      } else {
         je $$7 = $$6.b();
         je $$8 = $$7.o() == je.a.b ? $$4.cH().g() : $$7;
         $$2.a(null, $$3, avz.uT, awa.e, 1.0F, 1.0F);
         $$2.a($$3, dez.ee.o().a(dfr.b, $$8), 11);
         cjf $$9 = new cjf(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cun(cuq.rY, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, btn.d($$5));
         $$2.a($$4, dwt.M, $$3);
         $$4.b(awj.c.b(cuq.rV));
         return bqu.a($$2.B);
      }
   }
}
