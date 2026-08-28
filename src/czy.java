public class czy extends czg {
   private final bwr<? extends ctw> a;

   public czy(bwr<? extends ctw> $$0, czg.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bug a(ddf $$0) {
      djh $$1 = $$0.q();
      iv $$2 = $$0.a();
      eao $$3 = $$1.a_($$2);
      if (!$$3.a(axc.P)) {
         return bug.d;
      } else {
         czk $$4 = $$0.n();
         ebs $$5 = $$3.b() instanceof dmb ? $$3.c(((dmb)$$3.b()).c()) : ebs.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         fex $$7 = new fex((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         ctw $$8 = ctw.a($$1, $$7.d, $$7.e, $$7.f, this.a, bwq.o, $$4, $$0.o());
         if ($$8 == null) {
            return bug.d;
         } else {
            if (ctw.b($$1)) {
               for (bwi $$10 : $$1.a_(null, $$8.cQ())) {
                  if ($$10 instanceof ctw) {
                     return bug.d;
                  }
               }
            }

            if ($$1 instanceof arq $$11) {
               $$11.b($$8);
               $$11.a(efo.t, $$2, efo.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return bug.a;
         }
      }
   }
}
