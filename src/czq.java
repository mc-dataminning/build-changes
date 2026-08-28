public class czq extends dag implements dbe {
   public czq(dag.a $$0) {
      super($$0);
   }

   @Override
   public bvc a(dkj $$0, csi $$1, bvb $$2) {
      dak $$3 = $$1.b($$2);
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awy.je, awz.g, 0.5F, 0.4F / ($$0.G_().i() * 0.4F + 0.8F));
      if ($$0 instanceof asb $$4) {
         ctd.a(cto::new, $$4, $$3, $$1, -20.0F, 0.7F, 1.0F);
      }

      $$1.b(axi.c.b(this));
      $$3.a(1, $$1);
      return bvc.a;
   }

   @Override
   public ctd a(dkj $$0, jq $$1, dak $$2, jc $$3) {
      return new cto($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }

   @Override
   public dbe.a a() {
      return dbe.a.a().a(dbe.a.a.c() * 0.5F).b(dbe.a.a.d() * 1.25F).a();
   }
}
