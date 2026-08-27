public class cus extends cuc {
   private static final km a = new kl() {
      private final kl c = new kl();

      @Override
      public cuh a(kj $$0, cuh $$1) {
         iw $$2 = $$0.d().c(dhi.b);
         aqt $$3 = $$0.b();
         ewu $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         ir $$8 = $$0.c().a($$2);
         dtc $$9 = $$3.a_($$8);
         dug $$10 = $$9.b() instanceof deq ? $$9.c(((deq)$$9.b()).c()) : dug.a;
         double $$11;
         if ($$9.a(awe.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(awe.N)) {
               return this.c.dispense($$0, $$1);
            }

            dtc $$13 = $$3.a_($$8.d());
            dug $$14 = $$13.b() instanceof deq ? $$13.c(((deq)$$13.b()).c()) : dug.a;
            if ($$2 != iw.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cnw $$18 = cnw.a($$3, $$5, $$6 + $$11, $$7, ((cus)$$1.f()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(kj $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cnw.a b;

   public cus(cnw.a $$0, cuc.a $$1) {
      super($$1);
      this.b = $$0;
      dhi.a(this, a);
   }

   @Override
   public bqa a(cyf $$0) {
      dca $$1 = $$0.q();
      ir $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      if (!$$3.a(awe.N)) {
         return bqa.e;
      } else {
         cuh $$4 = $$0.n();
         if ($$1 instanceof aqt $$5) {
            dug $$6 = $$3.b() instanceof deq ? $$3.c(((deq)$$3.b()).c()) : dug.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cnw $$8 = cnw.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dxv.t, $$2, dxv.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bqa.a($$1.C);
      }
   }
}
