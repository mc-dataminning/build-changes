public class cng extends cms {
   private static final jj a = new ji() {
      private final ji c = new ji();

      @Override
      public cmx a(jg $$0, cmx $$1) {
         ic $$2 = $$0.d().c(cyu.b);
         and $$3 = $$0.b();
         els $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         hx $$8 = $$0.c().a($$2);
         djg $$9 = $$3.a_($$8);
         dkk $$10 = $$9.b() instanceof cwe ? $$9.c(((cwe)$$9.b()).c()) : dkk.a;
         double $$11;
         if ($$9.a(asg.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(asg.N)) {
               return this.c.dispense($$0, $$1);
            }

            djg $$13 = $$3.a_($$8.d());
            dkk $$14 = $$13.b() instanceof cwe ? $$13.c(((cwe)$$13.b()).c()) : dkk.a;
            if ($$2 != ic.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cgz $$18 = cgz.a($$3, $$5, $$6 + $$11, $$7, ((cng)$$1.d()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(jg $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cgz.a b;

   public cng(cgz.a $$0, cms.a $$1) {
      super($$1);
      this.b = $$0;
      cyu.a(this, a);
   }

   @Override
   public bka a(cpi $$0) {
      cto $$1 = $$0.q();
      hx $$2 = $$0.a();
      djg $$3 = $$1.a_($$2);
      if (!$$3.a(asg.N)) {
         return bka.e;
      } else {
         cmx $$4 = $$0.n();
         if ($$1 instanceof and $$5) {
            dkk $$6 = $$3.b() instanceof cwe ? $$3.c(((cwe)$$3.b()).c()) : dkk.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cgz $$8 = cgz.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dnq.t, $$2, dnq.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bka.a($$1.B);
      }
   }
}
