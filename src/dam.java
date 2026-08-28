public class dam extends czu {
   private final bxc<? extends cuk> a;

   public dam(bxc<? extends cuk> $$0, czu.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bur a(ddt $$0) {
      djx $$1 = $$0.q();
      iv $$2 = $$0.a();
      ebe $$3 = $$1.a_($$2);
      if (!$$3.a(axe.P)) {
         return bur.d;
      } else {
         czy $$4 = $$0.n();
         eci $$5 = $$3.b() instanceof dmr ? $$3.c(((dmr)$$3.b()).c()) : eci.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         ffq $$7 = new ffq((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         cuk $$8 = cuk.a($$1, $$7.d, $$7.e, $$7.f, this.a, bxb.o, $$4, $$0.o());
         if ($$8 == null) {
            return bur.d;
         } else {
            if (cuk.b($$1)) {
               for (bwt $$10 : $$1.a_(null, $$8.cR())) {
                  if ($$10 instanceof cuk) {
                     return bur.d;
                  }
               }
            }

            if ($$1 instanceof ars $$11) {
               $$11.b($$8);
               $$11.a(ege.t, $$2, ege.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return bur.a;
         }
      }
   }
}
