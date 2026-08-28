public class cve extends cul {
   private static final kx a = new kw() {
      private final kw c = new kw();

      @Override
      public cuq a(ku $$0, cuq $$1) {
         ji $$2 = $$0.d().c(did.b);
         aqu $$3 = $$0.b();
         exc $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         jd $$8 = $$0.c().a($$2);
         dtc $$9 = $$3.a_($$8);
         dug $$10 = $$9.b() instanceof dfn ? $$9.c(((dfn)$$9.b()).c()) : dug.a;
         double $$11;
         if ($$9.a(awe.O)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.e()).a(awe.O)) {
               return this.c.dispense($$0, $$1);
            }

            dtc $$13 = $$3.a_($$8.e());
            dug $$14 = $$13.b() instanceof dfn ? $$13.c(((dfn)$$13.b()).c()) : dug.a;
            if ($$2 != ji.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cot $$18 = cot.a($$3, $$5, $$6 + $$11, $$7, ((cve)$$1.g()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(ku $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cot.a b;

   public cve(cot.a $$0, cul.a $$1) {
      super($$1);
      this.b = $$0;
      did.a(this, a);
   }

   @Override
   public bqr a(cyf $$0) {
      dcw $$1 = $$0.q();
      jd $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      if (!$$3.a(awe.O)) {
         return bqr.f;
      } else {
         cuq $$4 = $$0.n();
         if ($$1 instanceof aqu $$5) {
            dug $$6 = $$3.b() instanceof dfn ? $$3.c(((dfn)$$3.b()).c()) : dug.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cot $$8 = cot.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dxz.t, $$2, dxz.a.a($$0.o(), $$5.a_($$2.e())));
         }

         $$4.h(1);
         return bqr.a($$1.B);
      }
   }
}
