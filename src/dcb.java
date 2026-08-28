public class dcb extends dag implements dbe {
   public static float a = 1.5F;

   public dcb(dag.a $$0) {
      super($$0);
   }

   @Override
   public bvc a(dkj $$0, csi $$1, bvb $$2) {
      dak $$3 = $$1.b($$2);
      if ($$0 instanceof asb $$4) {
         ctd.a(($$2x, $$3x, $$4x) -> new ctw($$1, $$0, $$1.dt().a(), $$1.bD().b(), $$1.dt().c()), $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awy.Dv, awz.g, 0.5F, 0.4F / ($$0.G_().i() * 0.4F + 0.8F));
      $$1.b(axi.c.b(this));
      $$3.a(1, $$1);
      return bvc.a;
   }

   @Override
   public ctd a(dkj $$0, jq $$1, dak $$2, jc $$3) {
      bai $$4 = $$0.G_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fgc $$8 = new fgc($$5, $$6, $$7);
      ctw $$9 = new ctw($$0, $$1.a(), $$1.b(), $$1.c(), $$8);
      $$9.i($$8);
      return $$9;
   }

   @Override
   public void a(ctd $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public dbe.a a() {
      return dbe.a.a().a(($$0, $$1) -> dpu.a($$0, 1.0, fgc.c)).a(6.6666665F).b(1.0F).a(1051).a();
   }
}
