public class cwm extends cul implements cvi {
   private static final int a = 10;

   public cwm(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqw<cuq> a(dbz $$0, cmy $$1, bqu $$2) {
      if (!$$0.x_()) {
         evs $$3 = $$1.bx().e($$1.bN().a(0.8F));
         if (!$$0.a_(iz.a($$3)).r()) {
            $$3 = $$1.bx().e($$1.bN().a(0.05F));
         }

         coi $$4 = new coi($$1, $$0, $$3.a(), $$3.b(), $$3.c());
         $$4.a($$1, $$1.dH(), $$1.dF(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), awa.Cn, awb.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      cuq $$5 = $$1.b($$2);
      $$1.gx().a(this, 10);
      $$1.b(awk.c.b(this));
      $$5.a(1, $$1);
      return bqw.a($$5, $$0.x_());
   }

   @Override
   public cnq a(dbz $$0, js $$1, cuq $$2, je $$3) {
      azh $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      return new coi($$0, $$1.a(), $$1.b(), $$1.c(), $$5, $$6, $$7);
   }

   @Override
   public void a(cnq $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cvi.a c() {
      return cvi.a.a().a(($$0, $$1) -> dhf.a($$0, 1.0, evs.b)).a(6.6666665F).b(1.0F).a();
   }
}
