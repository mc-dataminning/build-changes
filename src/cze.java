public class cze extends czu implements das {
   public cze(czu.a $$0) {
      super($$0);
   }

   @Override
   public bur a(djx $$0, crx $$1, buq $$2) {
      czy $$3 = $$1.b($$2);
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awp.je, awq.g, 0.5F, 0.4F / ($$0.G_().i() * 0.4F + 0.8F));
      if ($$0 instanceof ars $$4) {
         css.a(ctd::new, $$4, $$3, $$1, -20.0F, 0.7F, 1.0F);
      }

      $$1.b(awz.c.b(this));
      $$3.a(1, $$1);
      return bur.a;
   }

   @Override
   public css a(djx $$0, jp $$1, czy $$2, jb $$3) {
      return new ctd($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }

   @Override
   public das.a a() {
      return das.a.a().a(das.a.a.c() * 0.5F).b(das.a.a.d() * 1.25F).a();
   }
}
