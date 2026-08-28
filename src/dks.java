import com.mojang.serialization.MapCodec;

public class dks extends deu {
   public static final MapCodec<dks> a = b(dks::new);

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   protected dks(drw.d $$0) {
      super($$0);
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      if (!$$0.a(cun.rV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return bqr.a($$2.B);
      } else {
         je $$7 = $$6.b();
         je $$8 = $$7.o() == je.a.b ? $$4.cH().g() : $$7;
         $$2.a(null, $$3, avw.uT, avx.e, 1.0F, 1.0F);
         $$2.a($$3, dew.ee.n().a(dfo.b, $$8), 11);
         cjc $$9 = new cjc(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cuk(cun.rY, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, btk.d($$5));
         $$2.a($$4, dwq.M, $$3);
         $$4.b(awg.c.b(cun.rV));
         return bqr.a($$2.B);
      }
   }
}
