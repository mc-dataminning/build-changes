public class cza extends cxc implements cyb {
   public static float a = 1.5F;

   public cza(cxc.a $$0) {
      super($$0);
   }

   @Override
   public bta a(dgz $$0, cpo $$1, bsz $$2) {
      cxg $$3 = $$1.b($$2);
      if ($$0 instanceof arx $$4) {
         cqh.a(($$2x, $$3x, $$4x) -> new cqz($$1, $$0, $$1.du().a(), $$1.bF().b(), $$1.du().c()), $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), awv.Dg, aww.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
      $$1.b(axf.c.b(this));
      $$3.a(1, $$1);
      return bta.a;
   }

   @Override
   public cqh a(dgz $$0, ka $$1, cxg $$2, jm $$3) {
      bac $$4 = $$0.H_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fbr $$8 = new fbr($$5, $$6, $$7);
      cqz $$9 = new cqz($$0, $$1.a(), $$1.b(), $$1.c(), $$8);
      $$9.h($$8);
      return $$9;
   }

   @Override
   public void a(cqh $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cyb.a b() {
      return cyb.a.a().a(($$0, $$1) -> dmj.a($$0, 1.0, fbr.c)).a(6.6666665F).b(1.0F).a(1051).a();
   }
}
