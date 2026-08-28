import com.mojang.serialization.MapCodec;

public class dqx extends dku {
   public static final MapCodec<dqx> a = b(dqx::new);

   @Override
   public MapCodec<dqx> a() {
      return a;
   }

   protected dqx(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      if (!$$0.a(cyc.sW)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return btq.a;
      } else {
         jo $$7 = $$6.c();
         jo $$8 = $$7.o() == jo.a.b ? $$4.cO().g() : $$7;
         $$2.a(null, $$3, awk.vG, awl.e, 1.0F, 1.0F);
         $$2.a($$3, dkw.er.m().b(dlp.b, $$8), 11);
         cmn $$9 = new cmn(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cxy(cyc.sZ, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bwr.d($$5));
         $$2.a($$4, edm.M, $$3);
         $$4.b(awu.c.b(cyc.sW));
         return btq.a;
      }
   }
}
