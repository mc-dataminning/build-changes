public class cyf extends cyu implements czs {
   public cyf(cyu.a $$0) {
      super($$0);
   }

   @Override
   public bub a(dct $$0) {
      div $$1 = $$0.q();
      iu $$2 = $$0.a();
      dzz $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dmp.i($$3) && !dmq.h($$3) && !dmr.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (dln.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dln.a($$1, $$2));
            $$1.a($$0.o(), eez.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(eap.u, Boolean.valueOf(true)));
         $$1.a($$0.o(), eez.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bub.a;
      } else {
         return bub.d;
      }
   }

   private void a(div $$0, iu $$1) {
      azv $$2 = $$0.C_();
      $$0.a(null, $$1, awn.jl, awo.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public crs a(div $$0, jo $$1, cyy $$2, ja $$3) {
      azv $$4 = $$0.C_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fei $$8 = new fei($$5, $$6, $$7);
      crw $$9 = new crw($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(crs $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public czs.a a() {
      return czs.a.a().a(($$0, $$1) -> dog.a($$0, 1.0, fei.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
