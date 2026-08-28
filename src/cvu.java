public class cvu extends cwm {
   public static float a = 1.5F;

   public cvu(cwm.a $$0) {
      super($$0);
   }

   @Override
   public bsl a(dgj $$0, coy $$1, bsk $$2) {
      cwq $$3 = $$1.b($$2);
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awa.iO, awb.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
      if ($$0 instanceof ard $$4) {
         cpr.a(cqb::new, $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$1.b(awk.c.b(this));
      $$3.a(1, $$1);
      return bsl.a;
   }
}
