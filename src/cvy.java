public class cvy extends ctx implements cuu {
   private static final int a = 10;

   public cvy(ctx.a $$0) {
      super($$0);
   }

   @Override
   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      if (!$$0.x_()) {
         ewf $$3 = $$1.by().e($$1.bO().a(0.8F));
         if (!$$0.a_(ja.a($$3)).r()) {
            $$3 = $$1.by().e($$1.bO().a(0.05F));
         }

         cnu $$4 = new cnu($$1, $$0, $$3.a(), $$3.b(), $$3.c());
         $$4.a($$1, $$1.dI(), $$1.dG(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$0.a(null, $$1.dv(), $$1.dx(), $$1.dB(), avh.Cq, avi.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      cuc $$5 = $$1.b($$2);
      $$1.gu().a(this, 10);
      $$1.b(avr.c.b(this));
      $$5.a(1, $$1);
      return bqh.a($$5, $$0.x_());
   }

   @Override
   public cnc a(dcf $$0, jt $$1, cuc $$2, jf $$3) {
      ayo $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      ewf $$8 = new ewf($$5, $$6, $$7);
      cnu $$9 = new cnu($$0, $$1.a(), $$1.b(), $$1.c(), $$8);
      $$9.i($$8);
      return $$9;
   }

   @Override
   public void a(cnc $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cuu.a c() {
      return cuu.a.a().a(($$0, $$1) -> dhm.a($$0, 1.0, ewf.b)).a(6.6666665F).b(1.0F).a(1051).a();
   }
}
