import com.mojang.serialization.MapCodec;

public class dqn extends dkm {
   public static final MapCodec<dqn> a = b(dqn::new);

   @Override
   public MapCodec<dqn> a() {
      return a;
   }

   protected dqn(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      if (!$$0.a(cxt.sJ)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return btj.a;
      } else {
         jm $$7 = $$6.c();
         jm $$8 = $$7.o() == jm.a.b ? $$4.cO().g() : $$7;
         $$2.a(null, $$3, axf.vq, axg.e, 1.0F, 1.0F);
         $$2.a($$3, dko.er.m().b(dlh.b, $$8), 11);
         cmb $$9 = new cmb(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cxp(cxt.sM, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bwg.d($$5));
         $$2.a($$4, ecr.M, $$3);
         $$4.b(axp.c.b(cxt.sJ));
         return btj.a;
      }
   }
}
