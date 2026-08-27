public class cfg extends cfu {
   public cfg(cfu.a $$0) {
      super($$0);
   }

   @Override
   public bdx a(cij $$0) {
      byo $$1 = $$0.o();
      cmm $$2 = $$0.q();
      gu $$3 = $$0.a();
      dcb $$4 = $$2.a_($$3);
      if (!cqa.h($$4) && !cqb.g($$4) && !cqc.g($$4)) {
         gu $$5 = $$3.a($$0.k());
         if (cpb.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, amh.hS, ami.e, 1.0F, $$2.y_().i() * 0.4F + 0.8F);
            dcb $$6 = cpb.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dgl.i, $$3);
            cfz $$7 = $$0.n();
            if ($$1 instanceof aig) {
               ai.y.a((aig)$$1, $$5, $$7);
               $$7.a(1, $$1, $$1x -> $$1x.d($$0.p()));
            }

            return bdx.a($$2.r_());
         } else {
            return bdx.e;
         }
      } else {
         $$2.a($$1, $$3, amh.hS, ami.e, 1.0F, $$2.y_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dcr.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dgl.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, $$1x -> $$1x.d($$0.p()));
         }

         return bdx.a($$2.r_());
      }
   }
}
