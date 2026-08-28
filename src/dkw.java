import com.mojang.serialization.MapCodec;

public class dkw extends dey {
   public static final MapCodec<dkw> a = b(dkw::new);

   @Override
   public MapCodec<dkw> a() {
      return a;
   }

   protected dkw(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      if (!$$0.a(cur.rV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return bqv.a($$2.B);
      } else {
         je $$7 = $$6.b();
         je $$8 = $$7.o() == je.a.b ? $$4.cH().g() : $$7;
         $$2.a(null, $$3, avz.uT, awa.e, 1.0F, 1.0F);
         $$2.a($$3, dfa.ee.o().a(dfs.b, $$8), 11);
         cjg $$9 = new cjg(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cuo(cur.rY, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bto.d($$5));
         $$2.a($$4, dwu.M, $$3);
         $$4.b(awj.c.b(cur.rV));
         return bqv.a($$2.B);
      }
   }
}
