public class cxe extends cwm {
   private final but<? extends cqx> a;

   public cxe(but<? extends cqx> $$0, cwm.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsl a(daj $$0) {
      dgj $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwy $$3 = $$1.a_($$2);
      if (!$$3.a(awp.P)) {
         return bsl.d;
      } else {
         cwq $$4 = $$0.n();
         dyb $$5 = $$3.b() instanceof djc ? $$3.c(((djc)$$3.b()).c()) : dyb.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         fbb $$7 = new fbb((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         cqx $$8 = cqx.a($$1, $$7.d, $$7.e, $$7.f, this.a, bus.o, $$4, $$0.o());
         if ($$8 == null) {
            return bsl.d;
         } else {
            if (cqx.b($$1)) {
               for (bum $$10 : $$1.a_(null, $$8.cR())) {
                  if ($$10 instanceof cqx) {
                     return bsl.d;
                  }
               }
            }

            if ($$1 instanceof ard $$11) {
               $$11.b($$8);
               $$11.a(ebu.t, $$2, ebu.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return bsl.a;
         }
      }
   }
}
