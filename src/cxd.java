public class cxd extends cxu implements cys {
   public cxd(cxu.a $$0) {
      super($$0);
   }

   @Override
   public btq a(dhp $$0, cqi $$1, btp $$2) {
      cxy $$3 = $$1.b($$2);
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awk.jb, awl.g, 0.5F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
      if ($$0 instanceof arn $$4) {
         crb.a(crm::new, $$4, $$3, $$1, -20.0F, 0.7F, 1.0F);
      }

      $$1.b(awu.c.b(this));
      $$3.a(1, $$1);
      return btq.a;
   }

   @Override
   public crb a(dhp $$0, kc $$1, cxy $$2, jo $$3) {
      return new crm($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }

   @Override
   public cys.a b() {
      return cys.a.a().a(cys.a.a.c() * 0.5F).b(cys.a.a.d() * 1.25F).a();
   }
}
