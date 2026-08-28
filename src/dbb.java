public class dbb extends czg implements dae {
   public static float a = 1.5F;

   public dbb(czg.a $$0) {
      super($$0);
   }

   @Override
   public bug a(djh $$0, crj $$1, buf $$2) {
      czk $$3 = $$1.b($$2);
      if ($$0 instanceof arq $$4) {
         cse.a(($$2x, $$3x, $$4x) -> new csx($$1, $$0, $$1.ds().a(), $$1.bC().b(), $$1.ds().c()), $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), awn.Dv, awo.g, 0.5F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
      $$1.b(awx.c.b(this));
      $$3.a(1, $$1);
      return bug.a;
   }

   @Override
   public cse a(djh $$0, jp $$1, czk $$2, jb $$3) {
      azv $$4 = $$0.C_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fex $$8 = new fex($$5, $$6, $$7);
      csx $$9 = new csx($$0, $$1.a(), $$1.b(), $$1.c(), $$8);
      $$9.i($$8);
      return $$9;
   }

   @Override
   public void a(cse $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public dae.a a() {
      return dae.a.a().a(($$0, $$1) -> dos.a($$0, 1.0, fex.c)).a(6.6666665F).b(1.0F).a(1051).a();
   }
}
