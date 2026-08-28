public class czm extends cyu {
   private final bwm<? extends ctk> a;

   public czm(bwm<? extends ctk> $$0, cyu.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bub a(dct $$0) {
      div $$1 = $$0.q();
      iu $$2 = $$0.a();
      dzz $$3 = $$1.a_($$2);
      if (!$$3.a(axc.P)) {
         return bub.d;
      } else {
         cyy $$4 = $$0.n();
         ebd $$5 = $$3.b() instanceof dlp ? $$3.c(((dlp)$$3.b()).c()) : ebd.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         fei $$7 = new fei((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         ctk $$8 = ctk.a($$1, $$7.d, $$7.e, $$7.f, this.a, bwl.o, $$4, $$0.o());
         if ($$8 == null) {
            return bub.d;
         } else {
            if (ctk.b($$1)) {
               for (bwd $$10 : $$1.a_(null, $$8.cR())) {
                  if ($$10 instanceof ctk) {
                     return bub.d;
                  }
               }
            }

            if ($$1 instanceof arq $$11) {
               $$11.b($$8);
               $$11.a(eez.t, $$2, eez.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return bub.a;
         }
      }
   }
}
