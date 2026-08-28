public class ctg extends ctx implements cuu {
   public ctg(ctx.a $$0) {
      super($$0);
   }

   @Override
   public bqg a(cxo $$0) {
      dcf $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsk $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dfv.h($$3) && !dfw.g($$3) && !dfx.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (deu.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, deu.a($$1, $$2));
            $$1.a($$0.o(), dxg.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dta.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dxg.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bqg.a($$1.B);
      } else {
         return bqg.f;
      }
   }

   private void a(dcf $$0, ja $$1) {
      ayo $$2 = $$0.E_();
      $$0.a(null, $$1, avh.iK, avi.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cnc a(dcf $$0, jt $$1, cuc $$2, jf $$3) {
      ayo $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      ewf $$8 = new ewf($$5, $$6, $$7);
      cng $$9 = new cng($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(cnc $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cuu.a c() {
      return cuu.a.a().a(($$0, $$1) -> dhm.a($$0, 1.0, ewf.b)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
