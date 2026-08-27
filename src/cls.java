public class cls extends cle {
   private static final je a = new jd() {
      private final jd c = new jd();

      @Override
      public clj a(jb $$0, clj $$1) {
         hx $$2 = $$0.d().c(cxf.b);
         ame $$3 = $$0.b();
         eju $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         ht $$8 = $$0.c().a($$2);
         dhi $$9 = $$3.a_($$8);
         dim $$10 = $$9.b() instanceof cup ? $$9.c(((cup)$$9.b()).c()) : dim.a;
         double $$11;
         if ($$9.a(arg.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(arg.N)) {
               return this.c.dispense($$0, $$1);
            }

            dhi $$13 = $$3.a_($$8.d());
            dim $$14 = $$13.b() instanceof cup ? $$13.c(((cup)$$13.b()).c()) : dim.a;
            if ($$2 != hx.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cfl $$18 = cfl.a($$3, $$5, $$6 + $$11, $$7, ((cls)$$1.d()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(jb $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cfl.a b;

   public cls(cfl.a $$0, cle.a $$1) {
      super($$1);
      this.b = $$0;
      cxf.a(this, a);
   }

   @Override
   public bix a(cnt $$0) {
      csa $$1 = $$0.q();
      ht $$2 = $$0.a();
      dhi $$3 = $$1.a_($$2);
      if (!$$3.a(arg.N)) {
         return bix.e;
      } else {
         clj $$4 = $$0.n();
         if ($$1 instanceof ame $$5) {
            dim $$6 = $$3.b() instanceof cup ? $$3.c(((cup)$$3.b()).c()) : dim.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cfl $$8 = cfl.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dls.t, $$2, dls.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bix.a($$1.B);
      }
   }
}
