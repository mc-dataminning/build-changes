public class czk extends dag implements dbe {
   public static final float a = 1.5F;

   public czk(dag.a $$0) {
      super($$0);
   }

   @Override
   public bvc a(dkj $$0, csi $$1, bvb $$2) {
      dak $$3 = $$1.b($$2);
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awy.il, awz.h, 0.5F, 0.4F / ($$0.G_().i() * 0.4F + 0.8F));
      if ($$0 instanceof asb $$4) {
         ctd.a(ctm::new, $$4, $$3, $$1, 0.0F, 1.5F, 1.0F);
      }

      $$1.b(axi.c.b(this));
      $$3.a(1, $$1);
      return bvc.a;
   }

   @Override
   public ctd a(dkj $$0, jq $$1, dak $$2, jc $$3) {
      return new ctm($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }
}
