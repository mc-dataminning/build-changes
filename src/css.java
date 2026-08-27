public class css extends ctj implements cug {
   public css(ctj.a $$0) {
      super($$0);
   }

   @Override
   public bpu a(cxb $$0) {
      dax $$1 = $$0.q();
      io $$2 = $$0.a();
      drb $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dem.h($$3) && !den.g($$3) && !deo.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (ddl.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, ddl.a($$1, $$2));
            $$1.a($$0.o(), dvu.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(drr.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dvu.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bpu.a($$1.B);
      } else {
         return bpu.e;
      }
   }

   private void a(dax $$0, io $$1) {
      ayk $$2 = $$0.E_();
      $$0.a(null, $$1, avh.iK, avi.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cmo a(dax $$0, jh $$1, cto $$2, it $$3) {
      ayk $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      cms $$8 = new cms($$0, $$1.a(), $$1.b(), $$1.c(), $$5, $$6, $$7);
      $$8.a($$2);
      return $$8;
   }

   @Override
   public void a(cmo $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cug.a c() {
      return cug.a.a().a(($$0, $$1) -> dgd.a($$0, 1.0, euk.b)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
