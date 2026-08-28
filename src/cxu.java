public class cxu extends cwj implements cxi {
   public static float a = 1.5F;

   public cxu(cwj.a $$0) {
      super($$0);
   }

   @Override
   public bsi a(dgg $$0, cov $$1, bsh $$2) {
      cwn $$3 = $$1.b($$2);
      $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), avz.zo, awa.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
      if ($$0 instanceof arc $$4) {
         cpo.a(cpt::new, $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$1.b(awj.c.b(this));
      $$3.a(1, $$1);
      return bsi.a;
   }

   @Override
   public cpo a(dgg $$0, kb $$1, cwn $$2, jn $$3) {
      return new cpt($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }
}
