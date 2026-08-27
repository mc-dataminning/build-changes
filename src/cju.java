public class cju extends cjg {
   private static final ih a = new ig() {
      private final ig c = new ig();

      @Override
      public cjl a(id $$0, cjl $$1) {
         ha $$2 = $$0.d().c(cvf.b);
         cqb $$3 = $$0.b();
         ehh $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         gw $$8 = $$0.c().a($$2);
         dfd $$9 = $$3.a_($$8);
         dgh $$10 = $$9.b() instanceof csr ? $$9.c(((csr)$$9.b()).c()) : dgh.a;
         double $$11;
         if ($$9.a(apv.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(apv.N)) {
               return this.c.dispense($$0, $$1);
            }

            dfd $$13 = $$3.a_($$8.d());
            dgh $$14 = $$13.b() instanceof csr ? $$13.c(((csr)$$13.b()).c()) : dgh.a;
            if ($$2 != ha.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cdr $$18 = cdr.a($$3, $$5, $$6 + $$11, $$7, ((cju)$$1.d()).b);
         if ($$1.A()) {
            $$18.b($$1.y());
         }

         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(id $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cdr.a b;

   public cju(cdr.a $$0, cjg.a $$1) {
      super($$1);
      this.b = $$0;
      cvf.a(this, a);
   }

   @Override
   public bhe a(clv $$0) {
      cqb $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfd $$3 = $$1.a_($$2);
      if (!$$3.a(apv.N)) {
         return bhe.e;
      } else {
         cjl $$4 = $$0.n();
         if (!$$1.B) {
            dgh $$5 = $$3.b() instanceof csr ? $$3.c(((csr)$$3.b()).c()) : dgh.a;
            double $$6 = 0.0;
            if ($$5.b()) {
               $$6 = 0.5;
            }

            cdr $$7 = cdr.a($$1, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5, this.b);
            if ($$4.A()) {
               $$7.b($$4.y());
            }

            $$1.b($$7);
            $$1.a(djn.t, $$2, djn.a.a($$0.o(), $$1.a_($$2.d())));
         }

         $$4.h(1);
         return bhe.a($$1.B);
      }
   }
}
