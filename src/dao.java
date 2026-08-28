public class dao extends czw {
   private final bxe<? extends cum> a;

   public dao(bxe<? extends cum> $$0, czw.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public but a(ddv $$0) {
      djz $$1 = $$0.q();
      iw $$2 = $$0.a();
      ebg $$3 = $$1.a_($$2);
      if (!$$3.a(axg.P)) {
         return but.d;
      } else {
         daa $$4 = $$0.n();
         eck $$5 = $$3.b() instanceof dmt ? $$3.c(((dmt)$$3.b()).c()) : eck.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         ffs $$7 = new ffs((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         cum $$8 = cum.a($$1, $$7.d, $$7.e, $$7.f, this.a, bxd.o, $$4, $$0.o());
         if ($$8 == null) {
            return but.d;
         } else {
            if (cum.b($$1)) {
               for (bwv $$10 : $$1.a_(null, $$8.cR())) {
                  if ($$10 instanceof cum) {
                     return but.d;
                  }
               }
            }

            if ($$1 instanceof aru $$11) {
               $$11.b($$8);
               $$11.a(egg.t, $$2, egg.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return but.a;
         }
      }
   }
}
