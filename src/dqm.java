import com.mojang.serialization.MapCodec;

public class dqm extends dkl {
   public static final MapCodec<dqm> a = b(dqm::new);

   @Override
   public MapCodec<dqm> a() {
      return a;
   }

   protected dqm(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      if (!$$0.a(cxs.sJ)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bti.a;
      } else {
         jm $$7 = $$6.c();
         jm $$8 = $$7.o() == jm.a.b ? $$4.cO().g() : $$7;
         $$2.a(null, $$3, axf.vq, axg.e, 1.0F, 1.0F);
         $$2.a($$3, dkn.er.m().b(dlg.b, $$8), 11);
         cma $$9 = new cma(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cxo(cxs.sM, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bwf.d($$5));
         $$2.a($$4, ecq.M, $$3);
         $$4.b(axp.c.b(cxs.sJ));
         return bti.a;
      }
   }
}
