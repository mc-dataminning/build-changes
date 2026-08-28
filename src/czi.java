public class czi extends cxk implements cyj {
   public czi(cxk.a $$0) {
      super($$0);
   }

   @Override
   public bti a(dhh $$0, cpw $$1, bth $$2) {
      cxo $$3 = $$1.b($$2);
      if ($$0 instanceof ash $$4) {
         cqp.a(($$2x, $$3x, $$4x) -> new crh($$1, $$0, $$1.dt().a(), $$1.bF().b(), $$1.dt().c()), $$4, $$3, $$1, 0.0F, 1.5F, 1.0F);
      }

      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), axf.CQ, axg.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
      $$1.b(axp.c.b(this));
      $$3.a(1, $$1);
      return bti.a;
   }

   @Override
   public cqp a(dhh $$0, ka $$1, cxo $$2, jm $$3) {
      bam $$4 = $$0.H_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fbx $$8 = new fbx($$5, $$6, $$7);
      crh $$9 = new crh($$0, $$1.a(), $$1.b(), $$1.c(), $$8);
      $$9.h($$8);
      return $$9;
   }

   @Override
   public void a(cqp $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cyj.a b() {
      return cyj.a.a().a(($$0, $$1) -> dms.a($$0, 1.0, fbx.c)).a(6.6666665F).b(1.0F).a(1051).a();
   }
}
