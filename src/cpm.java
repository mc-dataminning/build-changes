public class cpm extends coy {
   private static final jl a = new jk() {
      private final jk c = new jk();

      @Override
      public cpd a(ji $$0, cpd $$1) {
         ie $$2 = $$0.d().c(dax.b);
         aow $$3 = $$0.b();
         enz $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         hz $$8 = $$0.c().a($$2);
         dlj $$9 = $$3.a_($$8);
         dmn $$10 = $$9.b() instanceof cyh ? $$9.c(((cyh)$$9.b()).c()) : dmn.a;
         double $$11;
         if ($$9.a(aua.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(aua.N)) {
               return this.c.dispense($$0, $$1);
            }

            dlj $$13 = $$3.a_($$8.d());
            dmn $$14 = $$13.b() instanceof cyh ? $$13.c(((cyh)$$13.b()).c()) : dmn.a;
            if ($$2 != ie.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cje $$18 = cje.a($$3, $$5, $$6 + $$11, $$7, ((cpm)$$1.d()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(ji $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cje.a b;

   public cpm(cje.a $$0, coy.a $$1) {
      super($$1);
      this.b = $$0;
      dax.a(this, a);
   }

   @Override
   public blw a(crm $$0) {
      cvr $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlj $$3 = $$1.a_($$2);
      if (!$$3.a(aua.N)) {
         return blw.e;
      } else {
         cpd $$4 = $$0.n();
         if ($$1 instanceof aow $$5) {
            dmn $$6 = $$3.b() instanceof cyh ? $$3.c(((cyh)$$3.b()).c()) : dmn.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cje $$8 = cje.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dpw.t, $$2, dpw.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return blw.a($$1.B);
      }
   }
}
