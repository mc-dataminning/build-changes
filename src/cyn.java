public class cyn extends cxc implements cyb {
   public static float a = 1.5F;

   public cyn(cxc.a $$0) {
      super($$0);
   }

   @Override
   public bta a(dgz $$0, cpo $$1, bsz $$2) {
      cxg $$3 = $$1.b($$2);
      $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), awv.zp, aww.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
      if ($$0 instanceof arx $$4) {
         cqh.a(cqm::new, $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$1.b(axf.c.b(this));
      $$3.a(1, $$1);
      return bta.a;
   }

   @Override
   public cqh a(dgz $$0, ka $$1, cxg $$2, jm $$3) {
      return new cqm($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }
}
