public class cwg extends cvn {
   private static final kz a = new ky() {
      private final ky c = new ky();

      @Override
      public cvs a(kw $$0, cvs $$1) {
         jk $$2 = $$0.d().c(djr.b);
         arj $$3 = $$0.b();
         eyw $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         jf $$8 = $$0.c().a($$2);
         dus $$9 = $$3.a_($$8);
         dvw $$10 = $$9.b() instanceof dhb ? $$9.c(((dhb)$$9.b()).c()) : dvw.a;
         double $$11;
         if ($$9.a(awv.O)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.l() || !$$3.a_($$8.e()).a(awv.O)) {
               return this.c.dispense($$0, $$1);
            }

            dus $$13 = $$3.a_($$8.e());
            dvw $$14 = $$13.b() instanceof dhb ? $$13.c(((dhb)$$13.b()).c()) : dvw.a;
            if ($$2 != jk.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         eyw $$18 = new eyw($$5, $$6 + $$11, $$7);
         cpv $$19 = cpv.a($$3, $$18.d, $$18.e, $$18.f, ((cwg)$$1.h()).b, $$1, null);
         $$3.b($$19);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(kw $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cpv.a b;

   public cwg(cpv.a $$0, cvn.a $$1) {
      super($$1);
      this.b = $$0;
      djr.a(this, a);
   }

   @Override
   public brs a(czp $$0) {
      dej $$1 = $$0.q();
      jf $$2 = $$0.a();
      dus $$3 = $$1.a_($$2);
      if (!$$3.a(awv.O)) {
         return brs.d;
      } else {
         cvs $$4 = $$0.n();
         dvw $$5 = $$3.b() instanceof dhb ? $$3.c(((dhb)$$3.b()).c()) : dvw.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         eyw $$7 = new eyw((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         cpv $$8 = cpv.a($$1, $$7.d, $$7.e, $$7.f, this.b, $$4, $$0.o());
         if (cpv.b($$1)) {
            for (btr $$10 : $$1.a_(null, $$8.cO())) {
               if ($$10 instanceof cpv) {
                  return brs.d;
               }
            }
         }

         if ($$1 instanceof arj $$11) {
            $$11.b($$8);
            $$11.a(dzp.t, $$2, dzp.a.a($$0.o(), $$11.a_($$2.e())));
         }

         $$4.h(1);
         return brs.a;
      }
   }
}
