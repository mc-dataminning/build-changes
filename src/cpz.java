public class cpz extends cpl {
   private static final jn a = new jm() {
      private final jm c = new jm();

      @Override
      public cpq a(jk $$0, cpq $$1) {
         ih $$2 = $$0.d().c(dbk.b);
         apa $$3 = $$0.b();
         eov $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         ib $$8 = $$0.c().a($$2);
         dme $$9 = $$3.a_($$8);
         dni $$10 = $$9.b() instanceof cyu ? $$9.c(((cyu)$$9.b()).c()) : dni.a;
         double $$11;
         if ($$9.a(aue.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(aue.N)) {
               return this.c.dispense($$0, $$1);
            }

            dme $$13 = $$3.a_($$8.d());
            dni $$14 = $$13.b() instanceof cyu ? $$13.c(((cyu)$$13.b()).c()) : dni.a;
            if ($$2 != ih.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cjt $$18 = cjt.a($$3, $$5, $$6 + $$11, $$7, ((cpz)$$1.d()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(jk $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cjt.a b;

   public cpz(cjt.a $$0, cpl.a $$1) {
      super($$1);
      this.b = $$0;
      dbk.a(this, a);
   }

   @Override
   public bml a(crz $$0) {
      cwe $$1 = $$0.q();
      ib $$2 = $$0.a();
      dme $$3 = $$1.a_($$2);
      if (!$$3.a(aue.N)) {
         return bml.e;
      } else {
         cpq $$4 = $$0.n();
         if ($$1 instanceof apa $$5) {
            dni $$6 = $$3.b() instanceof cyu ? $$3.c(((cyu)$$3.b()).c()) : dni.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cjt $$8 = cjt.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dqr.t, $$2, dqr.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bml.a($$1.B);
      }
   }
}
