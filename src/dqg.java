import com.mojang.serialization.MapCodec;

public class dqg extends dkd {
   public static final MapCodec<dqg> a = b(dqg::new);

   @Override
   public MapCodec<dqg> a() {
      return a;
   }

   protected dqg(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      if (!$$0.a(cxk.sS)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bta.a;
      } else {
         jm $$7 = $$6.c();
         jm $$8 = $$7.o() == jm.a.b ? $$4.cO().g() : $$7;
         $$2.a(null, $$3, awv.vw, aww.e, 1.0F, 1.0F);
         $$2.a($$3, dkf.er.m().b(dky.b, $$8), 11);
         cls $$9 = new cls(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cxg(cxk.sV, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bvx.d($$5));
         $$2.a($$4, eck.M, $$3);
         $$4.b(axf.c.b(cxk.sS));
         return bta.a;
      }
   }
}
