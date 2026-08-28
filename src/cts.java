public class cts extends cuj implements cvg {
   public cts(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqt a(cyb $$0) {
      dbx $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsb $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dfm.h($$3) && !dfn.g($$3) && !dfo.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (del.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, del.a($$1, $$2));
            $$1.a($$0.o(), dwu.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dsr.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dwu.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bqt.a($$1.B);
      } else {
         return bqt.f;
      }
   }

   private void a(dbx $$0, iz $$1) {
      azg $$2 = $$0.E_();
      $$0.a(null, $$1, avz.iK, awa.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cno a(dbx $$0, js $$1, cuo $$2, je $$3) {
      azg $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      cns $$8 = new cns($$0, $$1.a(), $$1.b(), $$1.c(), $$5, $$6, $$7);
      $$8.a($$2);
      return $$8;
   }

   @Override
   public void a(cno $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cvg.a c() {
      return cvg.a.a().a(($$0, $$1) -> dhd.a($$0, 1.0, evq.b)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
