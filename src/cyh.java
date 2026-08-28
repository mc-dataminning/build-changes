public class cyh extends cwj implements cxi {
   public static float a = 1.5F;

   public cyh(cwj.a $$0) {
      super($$0);
   }

   @Override
   public bsi a(dgg $$0, cov $$1, bsh $$2) {
      cwn $$3 = $$1.b($$2);
      if ($$0 instanceof arc $$4) {
         cpo.a(($$2x, $$3x, $$4x) -> new cqg($$1, $$0, $$1.du().a(), $$1.bF().b(), $$1.du().c()), $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), avz.Df, awa.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
      $$1.b(awj.c.b(this));
      $$3.a(1, $$1);
      return bsi.a;
   }

   @Override
   public cpo a(dgg $$0, kb $$1, cwn $$2, jn $$3) {
      azg $$4 = $$0.H_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fay $$8 = new fay($$5, $$6, $$7);
      cqg $$9 = new cqg($$0, $$1.a(), $$1.b(), $$1.c(), $$8);
      $$9.h($$8);
      return $$9;
   }

   @Override
   public void a(cpo $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cxi.a b() {
      return cxi.a.a().a(($$0, $$1) -> dlq.a($$0, 1.0, fay.c)).a(6.6666665F).b(1.0F).a(1051).a();
   }
}
