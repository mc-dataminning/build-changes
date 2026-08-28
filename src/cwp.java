public class cwp extends cvx {
   private static final lb a = new la() {
      private final la c = new la();

      @Override
      public cwb a(ky $$0, cwb $$1) {
         jm $$2 = $$0.d().c(dkj.b);
         arn $$3 = $$0.b();
         ezn $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         jh $$8 = $$0.c().a($$2);
         dvj $$9 = $$3.a_($$8);
         dwn $$10 = $$9.b() instanceof dht ? $$9.c(((dht)$$9.b()).c()) : dwn.a;
         double $$11;
         if ($$9.a(axa.O)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.l() || !$$3.a_($$8.e()).a(axa.O)) {
               return this.c.dispense($$0, $$1);
            }

            dvj $$13 = $$3.a_($$8.e());
            dwn $$14 = $$13.b() instanceof dht ? $$13.c(((dht)$$13.b()).c()) : dwn.a;
            if ($$2 != jm.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         ezn $$18 = new ezn($$5, $$6 + $$11, $$7);
         cqk $$19 = cqk.a($$3, $$18.d, $$18.e, $$18.f, ((cwp)$$1.h()).b, $$1, null);
         $$3.b($$19);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(ky $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cqk.a b;

   public cwp(cqk.a $$0, cvx.a $$1) {
      super($$1);
      this.b = $$0;
      dkj.a(this, a);
   }

   @Override
   public bsd a(czu $$0) {
      dfb $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvj $$3 = $$1.a_($$2);
      if (!$$3.a(axa.O)) {
         return bsd.d;
      } else {
         cwb $$4 = $$0.n();
         dwn $$5 = $$3.b() instanceof dht ? $$3.c(((dht)$$3.b()).c()) : dwn.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         ezn $$7 = new ezn((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         cqk $$8 = cqk.a($$1, $$7.d, $$7.e, $$7.f, this.b, $$4, $$0.o());
         if (cqk.b($$1)) {
            for (bue $$10 : $$1.a_(null, $$8.cS())) {
               if ($$10 instanceof cqk) {
                  return bsd.d;
               }
            }
         }

         if ($$1 instanceof arn $$11) {
            $$11.b($$8);
            $$11.a(eag.t, $$2, eag.a.a($$0.o(), $$11.a_($$2.e())));
         }

         $$4.h(1);
         return bsd.a;
      }
   }
}
