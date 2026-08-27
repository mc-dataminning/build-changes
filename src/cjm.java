public class cjm extends cke {
   public cjm(cke.a $$0) {
      super($$0);
   }

   @Override
   public bib a(cmt $$0) {
      cqz $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgb $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!cuo.h($$3) && !cup.g($$3) && !cuq.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (ctn.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, ctn.a($$1, $$2));
            $$1.a($$0.o(), dkl.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dgr.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dkl.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bib.a($$1.B);
      } else {
         return bib.e;
      }
   }

   private void a(cqz $$0, ht $$1) {
      ate $$2 = $$0.E_();
      $$0.a(null, $$1, aqd.hF, aqe.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
