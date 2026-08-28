public class cxa extends cwi {
   private final bus<? extends cqt> a;

   public cxa(bus<? extends cqt> $$0, cwi.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsk a(daf $$0) {
      dfm $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvv $$3 = $$1.a_($$2);
      if (!$$3.a(axc.O)) {
         return bsk.d;
      } else {
         cwm $$4 = $$0.n();
         dwy $$5 = $$3.b() instanceof dif ? $$3.c(((dif)$$3.b()).c()) : dwy.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         ezy $$7 = new ezy((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         cqt $$8 = cqt.a($$1, $$7.d, $$7.e, $$7.f, this.a, bur.o, $$4, $$0.o());
         if ($$8 == null) {
            return bsk.d;
         } else {
            if (cqt.b($$1)) {
               for (bul $$10 : $$1.a_(null, $$8.cR())) {
                  if ($$10 instanceof cqt) {
                     return bsk.d;
                  }
               }
            }

            if ($$1 instanceof arp $$11) {
               $$11.b($$8);
               $$11.a(ear.t, $$2, ear.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return bsk.a;
         }
      }
   }
}
