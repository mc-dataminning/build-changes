public class cyj extends cwl implements cxk {
   public static float a = 1.5F;

   public cyj(cwl.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dgi $$0, cox $$1, bsi $$2) {
      cwp $$3 = $$1.b($$2);
      if ($$0 instanceof arc $$4) {
         cpq.a(($$2x, $$3x, $$4x) -> new cqi($$1, $$0, $$1.du().a(), $$1.bF().b(), $$1.du().c()), $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), awa.Dg, awb.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
      $$1.b(awk.c.b(this));
      $$3.a(1, $$1);
      return bsj.a;
   }

   @Override
   public cpq a(dgi $$0, kb $$1, cwp $$2, jn $$3) {
      azh $$4 = $$0.H_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fba $$8 = new fba($$5, $$6, $$7);
      cqi $$9 = new cqi($$0, $$1.a(), $$1.b(), $$1.c(), $$8);
      $$9.h($$8);
      return $$9;
   }

   @Override
   public void a(cpq $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cxk.a b() {
      return cxk.a.a().a(($$0, $$1) -> dls.a($$0, 1.0, fba.c)).a(6.6666665F).b(1.0F).a(1051).a();
   }
}
