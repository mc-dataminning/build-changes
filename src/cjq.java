public class cjq extends cke {
   public cjq(cke.a $$0) {
      super($$0);
   }

   @Override
   public bib a(cmt $$0) {
      ccx $$1 = $$0.o();
      cqz $$2 = $$0.q();
      ht $$3 = $$0.a();
      dgb $$4 = $$2.a_($$3);
      if (!cuo.h($$4) && !cup.g($$4) && !cuq.g($$4)) {
         ht $$5 = $$3.a($$0.k());
         if (ctn.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, aqd.hU, aqe.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
            dgb $$6 = ctn.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dkl.i, $$3);
            ckj $$7 = $$0.n();
            if ($$1 instanceof alr) {
               al.y.a((alr)$$1, $$5, $$7);
               $$7.a(1, $$1, $$1x -> $$1x.d($$0.p()));
            }

            return bib.a($$2.x_());
         } else {
            return bib.e;
         }
      } else {
         $$2.a($$1, $$3, aqd.hU, aqe.e, 1.0F, $$2.E_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dgr.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dkl.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, $$1x -> $$1x.d($$0.p()));
         }

         return bib.a($$2.x_());
      }
   }
}
