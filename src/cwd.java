public class cwd extends cvk {
   private static final ky a = new kx() {
      private final kx c = new kx();

      @Override
      public cvp a(kv $$0, cvp $$1) {
         jj $$2 = $$0.d().c(djo.b);
         arh $$3 = $$0.b();
         eys $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         je $$8 = $$0.c().a($$2);
         duo $$9 = $$3.a_($$8);
         dvs $$10 = $$9.b() instanceof dgy ? $$9.c(((dgy)$$9.b()).c()) : dvs.a;
         double $$11;
         if ($$9.a(awt.O)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.l() || !$$3.a_($$8.e()).a(awt.O)) {
               return this.c.dispense($$0, $$1);
            }

            duo $$13 = $$3.a_($$8.e());
            dvs $$14 = $$13.b() instanceof dgy ? $$13.c(((dgy)$$13.b()).c()) : dvs.a;
            if ($$2 != jj.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         eys $$18 = new eys($$5, $$6 + $$11, $$7);
         cps $$19 = cps.a($$3, $$18.d, $$18.e, $$18.f, ((cwd)$$1.h()).b, $$1, null);
         $$3.b($$19);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(kv $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cps.a b;

   public cwd(cps.a $$0, cvk.a $$1) {
      super($$1);
      this.b = $$0;
      djo.a(this, a);
   }

   @Override
   public brp a(czm $$0) {
      deg $$1 = $$0.q();
      je $$2 = $$0.a();
      duo $$3 = $$1.a_($$2);
      if (!$$3.a(awt.O)) {
         return brp.d;
      } else {
         cvp $$4 = $$0.n();
         dvs $$5 = $$3.b() instanceof dgy ? $$3.c(((dgy)$$3.b()).c()) : dvs.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         eys $$7 = new eys((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         cps $$8 = cps.a($$1, $$7.d, $$7.e, $$7.f, this.b, $$4, $$0.o());
         if (cps.b($$1)) {
            for (bto $$10 : $$1.a_(null, $$8.cO())) {
               if ($$10 instanceof cps) {
                  return brp.d;
               }
            }
         }

         if ($$1 instanceof arh $$11) {
            $$11.b($$8);
            $$11.a(dzl.t, $$2, dzl.a.a($$0.o(), $$11.a_($$2.e())));
         }

         $$4.h(1);
         return brp.a;
      }
   }
}
