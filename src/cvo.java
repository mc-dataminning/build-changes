public class cvo extends cwl implements cxk {
   public static float a = 1.5F;

   public cvo(cwl.a $$0) {
      super($$0);
   }

   @Override
   public bsk a(dgi $$0, cox $$1, bsj $$2) {
      cwp $$3 = $$1.b($$2);
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awa.ii, awb.h, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
      if ($$0 instanceof ard $$4) {
         cpq.a(cpz::new, $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$1.b(awk.c.b(this));
      $$3.a(1, $$1);
      return bsk.a;
   }

   @Override
   public cpq a(dgi $$0, kb $$1, cwp $$2, jn $$3) {
      return new cpz($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }
}
