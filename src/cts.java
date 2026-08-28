public class cts extends cuj implements cvk {
   public cts(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqq a(cyd $$0) {
      dcu $$1 = $$0.q();
      jd $$2 = $$0.a();
      dta $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dgk.h($$3) && !dgl.g($$3) && !dgm.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (dfj.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dfj.a($$1, $$2));
            $$1.a($$0.o(), dxw.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dtq.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dxw.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bqq.a($$1.B);
      } else {
         return bqq.f;
      }
   }

   private void a(dcu $$0, jd $$1) {
      ayv $$2 = $$0.E_();
      $$0.a(null, $$1, avo.iK, avp.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cnn a(dcu $$0, jw $$1, cuo $$2, ji $$3) {
      ayv $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      eww $$8 = new eww($$5, $$6, $$7);
      cnr $$9 = new cnr($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(cnn $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cvk.a c() {
      return cvk.a.a().a(($$0, $$1) -> dib.a($$0, 1.0, eww.b)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
