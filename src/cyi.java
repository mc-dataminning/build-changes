public class cyi extends cwk implements cxj {
   public static float a = 1.5F;

   public cyi(cwk.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dgh $$0, cow $$1, bsi $$2) {
      cwo $$3 = $$1.b($$2);
      if ($$0 instanceof ard $$4) {
         cpp.a(($$2x, $$3x, $$4x) -> new cqh($$1, $$0, $$1.dt().a(), $$1.bF().b(), $$1.dt().c()), $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awa.Df, awb.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
      $$1.b(awk.c.b(this));
      $$3.a(1, $$1);
      return bsj.a;
   }

   @Override
   public cpp a(dgh $$0, kb $$1, cwo $$2, jn $$3) {
      azh $$4 = $$0.H_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      faz $$8 = new faz($$5, $$6, $$7);
      cqh $$9 = new cqh($$0, $$1.a(), $$1.b(), $$1.c(), $$8);
      $$9.i($$8);
      return $$9;
   }

   @Override
   public void a(cpp $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cxj.a b() {
      return cxj.a.a().a(($$0, $$1) -> dlr.a($$0, 1.0, faz.c)).a(6.6666665F).b(1.0F).a(1051).a();
   }
}
