public class csu extends ctl implements cui {
   public csu(ctl.a $$0) {
      super($$0);
   }

   @Override
   public bpw a(cxd $$0) {
      daz $$1 = $$0.q();
      io $$2 = $$0.a();
      drd $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!deo.h($$3) && !dep.g($$3) && !deq.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (ddn.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, ddn.a($$1, $$2));
            $$1.a($$0.o(), dvw.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(drt.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dvw.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bpw.a($$1.B);
      } else {
         return bpw.e;
      }
   }

   private void a(daz $$0, io $$1) {
      aym $$2 = $$0.E_();
      $$0.a(null, $$1, avi.iK, avj.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cmq a(daz $$0, jh $$1, ctq $$2, it $$3) {
      aym $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      cmu $$8 = new cmu($$0, $$1.a(), $$1.b(), $$1.c(), $$5, $$6, $$7);
      $$8.a($$2);
      return $$8;
   }

   @Override
   public void a(cmq $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cui.a c() {
      return cui.a.a().a(($$0, $$1) -> dgf.a($$0, 1.0, eum.b)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
