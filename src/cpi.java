public class cpi extends cou {
   private static final jl a = new jk() {
      private final jk c = new jk();

      @Override
      public coz a(ji $$0, coz $$1) {
         ie $$2 = $$0.d().c(dat.b);
         aov $$3 = $$0.b();
         ens $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         hz $$8 = $$0.c().a($$2);
         dlf $$9 = $$3.a_($$8);
         dmj $$10 = $$9.b() instanceof cyd ? $$9.c(((cyd)$$9.b()).c()) : dmj.a;
         double $$11;
         if ($$9.a(atz.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(atz.N)) {
               return this.c.dispense($$0, $$1);
            }

            dlf $$13 = $$3.a_($$8.d());
            dmj $$14 = $$13.b() instanceof cyd ? $$13.c(((cyd)$$13.b()).c()) : dmj.a;
            if ($$2 != ie.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cja $$18 = cja.a($$3, $$5, $$6 + $$11, $$7, ((cpi)$$1.d()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(ji $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cja.a b;

   public cpi(cja.a $$0, cou.a $$1) {
      super($$1);
      this.b = $$0;
      dat.a(this, a);
   }

   @Override
   public blu a(cri $$0) {
      cvn $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlf $$3 = $$1.a_($$2);
      if (!$$3.a(atz.N)) {
         return blu.e;
      } else {
         coz $$4 = $$0.n();
         if ($$1 instanceof aov $$5) {
            dmj $$6 = $$3.b() instanceof cyd ? $$3.c(((cyd)$$3.b()).c()) : dmj.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cja $$8 = cja.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dpp.t, $$2, dpp.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return blu.a($$1.B);
      }
   }
}
