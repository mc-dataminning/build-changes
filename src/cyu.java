public class cyu extends czj implements dah {
   public cyu(czj.a $$0) {
      super($$0);
   }

   @Override
   public bug a(ddi $$0) {
      djm $$1 = $$0.q();
      iv $$2 = $$0.a();
      eat $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dnh.i($$3) && !dni.h($$3) && !dnj.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (dme.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, dme.a($$1, $$2));
            $$1.a($$0.o(), eft.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.b(ebj.u, Boolean.valueOf(true)));
         $$1.a($$0.o(), eft.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bug.a;
      } else {
         return bug.d;
      }
   }

   private void a(djm $$0, iv $$1) {
      azv $$2 = $$0.C_();
      $$0.a(null, $$1, awn.jn, awo.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public csh a(djm $$0, jp $$1, czn $$2, jb $$3) {
      azv $$4 = $$0.C_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      ffc $$8 = new ffc($$5, $$6, $$7);
      csl $$9 = new csl($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(csh $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public dah.a a() {
      return dah.a.a().a(($$0, $$1) -> dox.a($$0, 1.0, ffc.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
