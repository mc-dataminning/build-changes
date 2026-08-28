public class cwn extends cuj implements cvk {
   private static final int a = 10;

   public cwn(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      if (!$$0.x_()) {
         eww $$3 = $$1.by().e($$1.bO().a(0.8F));
         if (!$$0.a_(jd.a((jw)$$3)).r()) {
            $$3 = $$1.by().e($$1.bO().a(0.05F));
         }

         cof $$4 = new cof($$1, $$0, $$3.a(), $$3.b(), $$3.c());
         $$4.a($$1, $$1.dI(), $$1.dG(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$0.a(null, $$1.dv(), $$1.dx(), $$1.dB(), avo.Cr, avp.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      cuo $$5 = $$1.b($$2);
      $$1.gu().a(this, 10);
      $$1.b(avy.c.b(this));
      $$5.a(1, $$1);
      return bqr.a($$5, $$0.x_());
   }

   @Override
   public cnn a(dcu $$0, jw $$1, cuo $$2, ji $$3) {
      ayv $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      eww $$8 = new eww($$5, $$6, $$7);
      cof $$9 = new cof($$0, $$1.a(), $$1.b(), $$1.c(), $$8);
      $$9.i($$8);
      return $$9;
   }

   @Override
   public void a(cnn $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cvk.a c() {
      return cvk.a.a().a(($$0, $$1) -> dib.a($$0, 1.0, eww.b)).a(6.6666665F).b(1.0F).a(1051).a();
   }
}
