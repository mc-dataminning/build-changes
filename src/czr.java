public class czr extends cyz {
   private final bwo<? extends ctp> a;

   public czr(bwo<? extends ctp> $$0, cyz.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bud a(dcy $$0) {
      dja $$1 = $$0.q();
      iu $$2 = $$0.a();
      eah $$3 = $$1.a_($$2);
      if (!$$3.a(axc.P)) {
         return bud.d;
      } else {
         czd $$4 = $$0.n();
         ebl $$5 = $$3.b() instanceof dlu ? $$3.c(((dlu)$$3.b()).c()) : ebl.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         feq $$7 = new feq((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         ctp $$8 = ctp.a($$1, $$7.d, $$7.e, $$7.f, this.a, bwn.o, $$4, $$0.o());
         if ($$8 == null) {
            return bud.d;
         } else {
            if (ctp.b($$1)) {
               for (bwf $$10 : $$1.a_(null, $$8.cR())) {
                  if ($$10 instanceof ctp) {
                     return bud.d;
                  }
               }
            }

            if ($$1 instanceof arq $$11) {
               $$11.b($$8);
               $$11.a(efh.t, $$2, efh.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return bud.a;
         }
      }
   }
}
