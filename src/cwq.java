public class cwq extends cxc {
   public cwq(cxc.a $$0) {
      super($$0);
   }

   @Override
   public bta a(daz $$0) {
      cpo $$1 = $$0.o();
      dgz $$2 = $$0.q();
      jh $$3 = $$0.a();
      dxo $$4 = $$2.a_($$3);
      if (!dks.i($$4) && !dkt.h($$4) && !dku.h($$4)) {
         jh $$5 = $$3.a($$0.k());
         if (djq.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, awv.jz, aww.e, 1.0F, $$2.H_().i() * 0.4F + 0.8F);
            dxo $$6 = djq.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, eck.i, $$3);
            cxg $$7 = $$0.n();
            if ($$1 instanceof ary) {
               ao.z.a((ary)$$1, $$5, $$7);
               $$7.a(1, $$1, bvx.d($$0.p()));
            }

            return bta.a;
         } else {
            return bta.d;
         }
      } else {
         $$2.a($$1, $$3, awv.jz, aww.e, 1.0F, $$2.H_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.b(dye.v, Boolean.valueOf(true)), 11);
         $$2.a($$1, eck.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bvx.d($$0.p()));
         }

         return bta.a;
      }
   }
}
