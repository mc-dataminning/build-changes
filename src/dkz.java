import com.mojang.serialization.MapCodec;

public class dkz extends dfb {
   public static final MapCodec<dkz> a = b(dkz::new);

   @Override
   public MapCodec<dkz> a() {
      return a;
   }

   protected dkz(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected bqy a(cur $$0, dse $$1, dca $$2, iz $$3, cmz $$4, bqv $$5, evp $$6) {
      if (!$$0.a(cuu.rV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return bqy.a($$2.B);
      } else {
         je $$7 = $$6.b();
         je $$8 = $$7.o() == je.a.b ? $$4.cH().g() : $$7;
         $$2.a(null, $$3, awa.uT, awb.e, 1.0F, 1.0F);
         $$2.a($$3, dfd.ee.o().a(dfv.b, $$8), 11);
         cjj $$9 = new cjj(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cur(cuu.rY, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, btr.d($$5));
         $$2.a($$4, dwx.M, $$3);
         $$4.b(awk.c.b(cuu.rV));
         return bqy.a($$2.B);
      }
   }
}
