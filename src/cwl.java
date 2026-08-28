public class cwl extends cvt {
   private static final la a = new kz() {
      private final kz c = new kz();

      @Override
      public cvx a(kx $$0, cvx $$1) {
         jl $$2 = $$0.d().c(dkd.b);
         arm $$3 = $$0.b();
         ezh $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         jg $$8 = $$0.c().a($$2);
         dvd $$9 = $$3.a_($$8);
         dwh $$10 = $$9.b() instanceof dhn ? $$9.c(((dhn)$$9.b()).c()) : dwh.a;
         double $$11;
         if ($$9.a(awz.O)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.l() || !$$3.a_($$8.e()).a(awz.O)) {
               return this.c.dispense($$0, $$1);
            }

            dvd $$13 = $$3.a_($$8.e());
            dwh $$14 = $$13.b() instanceof dhn ? $$13.c(((dhn)$$13.b()).c()) : dwh.a;
            if ($$2 != jl.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         ezh $$18 = new ezh($$5, $$6 + $$11, $$7);
         cqf $$19 = cqf.a($$3, $$18.d, $$18.e, $$18.f, ((cwl)$$1.h()).b, $$1, null);
         $$3.b($$19);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(kx $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cqf.a b;

   public cwl(cqf.a $$0, cvt.a $$1) {
      super($$1);
      this.b = $$0;
      dkd.a(this, a);
   }

   @Override
   public bry a(czo $$0) {
      dev $$1 = $$0.q();
      jg $$2 = $$0.a();
      dvd $$3 = $$1.a_($$2);
      if (!$$3.a(awz.O)) {
         return bry.d;
      } else {
         cvx $$4 = $$0.n();
         dwh $$5 = $$3.b() instanceof dhn ? $$3.c(((dhn)$$3.b()).c()) : dwh.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         ezh $$7 = new ezh((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         cqf $$8 = cqf.a($$1, $$7.d, $$7.e, $$7.f, this.b, $$4, $$0.o());
         if (cqf.b($$1)) {
            for (btz $$10 : $$1.a_(null, $$8.cS())) {
               if ($$10 instanceof cqf) {
                  return bry.d;
               }
            }
         }

         if ($$1 instanceof arm $$11) {
            $$11.b($$8);
            $$11.a(eaa.t, $$2, eaa.a.a($$0.o(), $$11.a_($$2.e())));
         }

         $$4.h(1);
         return bry.a;
      }
   }
}
