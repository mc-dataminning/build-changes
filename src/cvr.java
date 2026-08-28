public class cvr extends cwj {
   public static float a = 1.5F;

   public cvr(cwj.a $$0) {
      super($$0);
   }

   @Override
   public bsi a(dgg $$0, cov $$1, bsh $$2) {
      cwn $$3 = $$1.b($$2);
      $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), avz.iO, awa.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
      if ($$0 instanceof arc $$4) {
         cpo.a(cpy::new, $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$1.b(awj.c.b(this));
      $$3.a(1, $$1);
      return bsi.a;
   }
}
