public class daj extends cyo implements czm {
   public static float a = 1.5F;

   public daj(cyo.a $$0) {
      super($$0);
   }

   @Override
   public bty a(dip $$0, cqs $$1, btx $$2) {
      cys $$3 = $$1.b($$2);
      if ($$0 instanceof aro $$4) {
         crm.a(($$2x, $$3x, $$4x) -> new csf($$1, $$0, $$1.dt().a(), $$1.bE().b(), $$1.dt().c()), $$4, $$3, $$1, 0.0F, a, 1.0F);
      }

      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awl.Dp, awm.g, 0.5F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
      $$1.b(awv.c.b(this));
      $$3.a(1, $$1);
      return bty.a;
   }

   @Override
   public crm a(dip $$0, jo $$1, cys $$2, ja $$3) {
      azt $$4 = $$0.C_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fdw $$8 = new fdw($$5, $$6, $$7);
      csf $$9 = new csf($$0, $$1.a(), $$1.b(), $$1.c(), $$8);
      $$9.i($$8);
      return $$9;
   }

   @Override
   public void a(crm $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public czm.a a() {
      return czm.a.a().a(($$0, $$1) -> doa.a($$0, 1.0, fdw.c)).a(6.6666665F).b(1.0F).a(1051).a();
   }
}
