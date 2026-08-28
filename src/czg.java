public class czg extends cyo {
   private final bwj<? extends cte> a;

   public czg(bwj<? extends cte> $$0, cyo.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bty a(dcn $$0) {
      dip $$1 = $$0.q();
      iu $$2 = $$0.a();
      dzo $$3 = $$1.a_($$2);
      if (!$$3.a(axa.P)) {
         return bty.d;
      } else {
         cys $$4 = $$0.n();
         eas $$5 = $$3.b() instanceof dlj ? $$3.c(((dlj)$$3.b()).c()) : eas.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         fdw $$7 = new fdw((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         cte $$8 = cte.a($$1, $$7.d, $$7.e, $$7.f, this.a, bwi.o, $$4, $$0.o());
         if ($$8 == null) {
            return bty.d;
         } else {
            if (cte.b($$1)) {
               for (bwa $$10 : $$1.a_(null, $$8.cR())) {
                  if ($$10 instanceof cte) {
                     return bty.d;
                  }
               }
            }

            if ($$1 instanceof aro $$11) {
               $$11.b($$8);
               $$11.a(eeo.t, $$2, eeo.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return bty.a;
         }
      }
   }
}
