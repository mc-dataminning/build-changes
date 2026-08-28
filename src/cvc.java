public class cvc extends cuj {
   private static final kx a = new kw() {
      private final kw c = new kw();

      @Override
      public cuo a(ku $$0, cuo $$1) {
         ji $$2 = $$0.d().c(dib.b);
         aqt $$3 = $$0.b();
         eww $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         jd $$8 = $$0.c().a($$2);
         dta $$9 = $$3.a_($$8);
         due $$10 = $$9.b() instanceof dfl ? $$9.c(((dfl)$$9.b()).c()) : due.a;
         double $$11;
         if ($$9.a(awd.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(awd.N)) {
               return this.c.dispense($$0, $$1);
            }

            dta $$13 = $$3.a_($$8.d());
            due $$14 = $$13.b() instanceof dfl ? $$13.c(((dfl)$$13.b()).c()) : due.a;
            if ($$2 != ji.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cor $$18 = cor.a($$3, $$5, $$6 + $$11, $$7, ((cvc)$$1.g()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(ku $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cor.a b;

   public cvc(cor.a $$0, cuj.a $$1) {
      super($$1);
      this.b = $$0;
      dib.a(this, a);
   }

   @Override
   public bqq a(cyd $$0) {
      dcu $$1 = $$0.q();
      jd $$2 = $$0.a();
      dta $$3 = $$1.a_($$2);
      if (!$$3.a(awd.N)) {
         return bqq.f;
      } else {
         cuo $$4 = $$0.n();
         if ($$1 instanceof aqt $$5) {
            due $$6 = $$3.b() instanceof dfl ? $$3.c(((dfl)$$3.b()).c()) : due.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cor $$8 = cor.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dxw.t, $$2, dxw.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bqq.a($$1.B);
      }
   }
}
