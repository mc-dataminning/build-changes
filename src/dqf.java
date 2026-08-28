import com.mojang.serialization.MapCodec;

public class dqf extends dke {
   public static final MapCodec<dqf> a = b(dqf::new);

   @Override
   public MapCodec<dqf> a() {
      return a;
   }

   protected dqf(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      if (!$$0.a(cxo.sJ)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bte.a;
      } else {
         jm $$7 = $$6.c();
         jm $$8 = $$7.o() == jm.a.b ? $$4.cO().g() : $$7;
         $$2.a(null, $$3, axf.vp, axg.e, 1.0F, 1.0F);
         $$2.a($$3, dkg.er.m().b(dkz.b, $$8), 11);
         clw $$9 = new clw(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cxk(cxo.sM, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bwb.d($$5));
         $$2.a($$4, ecj.M, $$3);
         $$4.b(axp.c.b(cxo.sJ));
         return bte.a;
      }
   }
}
