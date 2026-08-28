public class cyk extends cwm implements cxl {
   public static float a = 1.5F;

   public cyk(cwm.a $$0) {
      super($$0);
   }

   @Override
   public bsl a(dgj $$0, coy $$1, bsk $$2) {
      cwq $$3 = $$1.b($$2);
      if ($$0 instanceof ard $$4) {
         cpr.a(($$2x, $$3x, $$4x) -> new cqj($$1, $$0, $$1.dt().a(), $$1.bF().b(), $$1.dt().c()), $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awa.Df, awb.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
      $$1.b(awk.c.b(this));
      $$3.a(1, $$1);
      return bsl.a;
   }

   @Override
   public cpr a(dgj $$0, kb $$1, cwq $$2, jn $$3) {
      azh $$4 = $$0.H_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fbb $$8 = new fbb($$5, $$6, $$7);
      cqj $$9 = new cqj($$0, $$1.a(), $$1.b(), $$1.c(), $$8);
      $$9.i($$8);
      return $$9;
   }

   @Override
   public void a(cpr $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cxl.a b() {
      return cxl.a.a().a(($$0, $$1) -> dlt.a($$0, 1.0, fbb.c)).a(6.6666665F).b(1.0F).a(1051).a();
   }
}
