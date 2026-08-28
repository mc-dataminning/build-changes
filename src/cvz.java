public class cvz extends cty implements cuv {
   private static final int a = 10;

   public cvz(cty.a $$0) {
      super($$0);
   }

   @Override
   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      if (!$$0.x_()) {
         ewh $$3 = $$1.bz().e($$1.bP().a(0.8F));
         if (!$$0.a_(ja.a($$3)).r()) {
            $$3 = $$1.bz().e($$1.bP().a(0.05F));
         }

         cnv $$4 = new cnv($$1, $$0, $$3.a(), $$3.b(), $$3.c());
         $$4.a($$1, $$1.dJ(), $$1.dH(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$0.a(null, $$1.dw(), $$1.dy(), $$1.dC(), avh.Cq, avi.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      cud $$5 = $$1.b($$2);
      $$1.gv().a(this, 10);
      $$1.b(avr.c.b(this));
      $$5.a(1, $$1);
      return bqi.a($$5, $$0.x_());
   }

   @Override
   public cnd a(dcg $$0, jt $$1, cud $$2, jf $$3) {
      ayo $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      ewh $$8 = new ewh($$5, $$6, $$7);
      cnv $$9 = new cnv($$0, $$1.a(), $$1.b(), $$1.c(), $$8);
      $$9.j($$8);
      return $$9;
   }

   @Override
   public void a(cnd $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cuv.a c() {
      return cuv.a.a().a(($$0, $$1) -> dhn.a($$0, 1.0, ewh.b)).a(6.6666665F).b(1.0F).a(1051).a();
   }
}
