public class cwt extends cxk implements cyj {
   public cwt(cxk.a $$0) {
      super($$0);
   }

   @Override
   public bti a(dhh $$0, cpw $$1, bth $$2) {
      cxo $$3 = $$1.b($$2);
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), axf.ja, axg.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
      if ($$0 instanceof ash $$4) {
         cqp.a(cra::new, $$4, $$3, $$1, -20.0F, 0.7F, 1.0F);
      }

      $$1.b(axp.c.b(this));
      $$3.a(1, $$1);
      return bti.a;
   }

   @Override
   public cqp a(dhh $$0, ka $$1, cxo $$2, jm $$3) {
      return new cra($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }

   @Override
   public cyj.a b() {
      return cyj.a.a().a(cyj.a.a.c() * 0.5F).b(cyj.a.a.d() * 1.25F).a();
   }
}
