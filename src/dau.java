public class dau extends cyz implements czx {
   public static float a = 1.5F;

   public dau(cyz.a $$0) {
      super($$0);
   }

   @Override
   public bud a(dja $$0, crc $$1, buc $$2) {
      czd $$3 = $$1.b($$2);
      if ($$0 instanceof arq $$4) {
         crx.a(($$2x, $$3x, $$4x) -> new csq($$1, $$0, $$1.dt().a(), $$1.bE().b(), $$1.dt().c()), $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awn.Dv, awo.g, 0.5F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
      $$1.b(awx.c.b(this));
      $$3.a(1, $$1);
      return bud.a;
   }

   @Override
   public crx a(dja $$0, jo $$1, czd $$2, ja $$3) {
      azv $$4 = $$0.C_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      feq $$8 = new feq($$5, $$6, $$7);
      csq $$9 = new csq($$0, $$1.a(), $$1.b(), $$1.c(), $$8);
      $$9.i($$8);
      return $$9;
   }

   @Override
   public void a(crx $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public czx.a a() {
      return czx.a.a().a(($$0, $$1) -> dol.a($$0, 1.0, feq.c)).a(6.6666665F).b(1.0F).a(1051).a();
   }
}
