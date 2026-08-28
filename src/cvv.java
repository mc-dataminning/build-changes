public class cvv extends cwm implements cxl {
   public cvv(cwm.a $$0) {
      super($$0);
   }

   @Override
   public bsl a(dgj $$0, coy $$1, bsk $$2) {
      cwq $$3 = $$1.b($$2);
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awa.jb, awb.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
      if ($$0 instanceof ard $$4) {
         cpr.a(cqc::new, $$4, $$3, $$1, -20.0F, 0.7F, 1.0F);
      }

      $$1.b(awk.c.b(this));
      $$3.a(1, $$1);
      return bsl.a;
   }

   @Override
   public cpr a(dgj $$0, kb $$1, cwq $$2, jn $$3) {
      return new cqc($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }

   @Override
   public cxl.a b() {
      return cxl.a.a().a(cxl.a.a.c() * 0.5F).b(cxl.a.a.d() * 1.25F).a();
   }
}
