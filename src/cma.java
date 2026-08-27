public class cma extends cmt {
   public cma(cmt.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cmy $$0) {
      return true;
   }

   @Override
   public bkc<cmy> a(ctp $$0, cfi $$1, bka $$2) {
      cmy $$3 = $$1.b($$2);
      $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), ars.ic, art.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cgk $$4 = new cgk($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dE(), $$1.dC(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(asc.c.b(this));
      if (!$$1.fT().d) {
         $$3.h(1);
      }

      return bkc.a($$3, $$0.y_());
   }
}
