public class ctv extends cum implements cvj {
   public ctv(cum.a $$0) {
      super($$0);
   }

   @Override
   public bqw a(cye $$0) {
      dca $$1 = $$0.q();
      iz $$2 = $$0.a();
      dse $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dfp.h($$3) && !dfq.g($$3) && !dfr.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (deo.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, deo.a($$1, $$2));
            $$1.a($$0.o(), dwx.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dsu.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dwx.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bqw.a($$1.B);
      } else {
         return bqw.f;
      }
   }

   private void a(dca $$0, iz $$1) {
      azh $$2 = $$0.E_();
      $$0.a(null, $$1, awa.iK, awb.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cnr a(dca $$0, js $$1, cur $$2, je $$3) {
      azh $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      cnv $$8 = new cnv($$0, $$1.a(), $$1.b(), $$1.c(), $$5, $$6, $$7);
      $$8.a($$2);
      return $$8;
   }

   @Override
   public void a(cnr $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cvj.a c() {
      return cvj.a.a().a(($$0, $$1) -> dhg.a($$0, 1.0, evt.b)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
