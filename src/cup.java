public class cup extends cvg implements cwh {
   public cup(cvg.a $$0) {
      super($$0);
   }

   @Override
   public brk a(cyy $$0) {
      dds $$1 = $$0.q();
      je $$2 = $$0.a();
      dua $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dhj.i($$3) && !dhk.h($$3) && !dhl.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (dgi.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dgi.a($$1, $$2));
            $$1.a($$0.o(), dyx.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(duq.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dyx.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return brk.a;
      } else {
         return brk.d;
      }
   }

   private void a(dds $$0, je $$1) {
      azk $$2 = $$0.C_();
      $$0.a(null, $$1, awd.iL, awe.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public coi a(dds $$0, jx $$1, cvl $$2, jj $$3) {
      azk $$4 = $$0.C_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      eye $$8 = new eye($$5, $$6, $$7);
      com $$9 = new com($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(coi $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cwh.a c() {
      return cwh.a.a().a(($$0, $$1) -> dja.a($$0, 1.0, eye.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
