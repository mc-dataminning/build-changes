public class cvw extends ctv implements cus {
   private static final int a = 10;

   public cvw(ctv.a $$0) {
      super($$0);
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      if (!$$0.x_()) {
         evz $$3 = $$1.bx().e($$1.bN().a(0.8F));
         if (!$$0.a_(ja.a($$3)).r()) {
            $$3 = $$1.bx().e($$1.bN().a(0.05F));
         }

         cnr $$4 = new cnr($$1, $$0, $$3.a(), $$3.b(), $$3.c());
         $$4.a($$1, $$1.dH(), $$1.dF(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avf.Cq, avg.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      cua $$5 = $$1.b($$2);
      $$1.gt().a(this, 10);
      $$1.b(avp.c.b(this));
      $$5.a(1, $$1);
      return bqe.a($$5, $$0.x_());
   }

   @Override
   public cmz a(dcd $$0, jt $$1, cua $$2, jf $$3) {
      aym $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      return new cnr($$0, $$1.a(), $$1.b(), $$1.c(), $$5, $$6, $$7);
   }

   @Override
   public void a(cmz $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cus.a c() {
      return cus.a.a().a(($$0, $$1) -> dhk.a($$0, 1.0, evz.b)).a(6.6666665F).b(1.0F).a(1051).a();
   }
}
