public class cuk extends ctv {
   private static final ku a = new kt() {
      private final kt c = new kt();

      @Override
      public cua a(kr $$0, cua $$1) {
         jf $$2 = $$0.d().c(dhk.b);
         aqk $$3 = $$0.b();
         evz $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         ja $$8 = $$0.c().a($$2);
         dsh $$9 = $$3.a_($$8);
         dtl $$10 = $$9.b() instanceof deu ? $$9.c(((deu)$$9.b()).c()) : dtl.a;
         double $$11;
         if ($$9.a(avu.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(avu.N)) {
               return this.c.dispense($$0, $$1);
            }

            dsh $$13 = $$3.a_($$8.d());
            dtl $$14 = $$13.b() instanceof deu ? $$13.c(((deu)$$13.b()).c()) : dtl.a;
            if ($$2 != jf.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         coc $$18 = coc.a($$3, $$5, $$6 + $$11, $$7, ((cuk)$$1.g()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(kr $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final coc.a b;

   public cuk(coc.a $$0, ctv.a $$1) {
      super($$1);
      this.b = $$0;
      dhk.a(this, a);
   }

   @Override
   public bqd a(cxm $$0) {
      dcd $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsh $$3 = $$1.a_($$2);
      if (!$$3.a(avu.N)) {
         return bqd.f;
      } else {
         cua $$4 = $$0.n();
         if ($$1 instanceof aqk $$5) {
            dtl $$6 = $$3.b() instanceof deu ? $$3.c(((deu)$$3.b()).c()) : dtl.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            coc $$8 = coc.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dxa.t, $$2, dxa.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bqd.a($$1.B);
      }
   }
}
