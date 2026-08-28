public class cum extends ctx {
   private static final ku a = new kt() {
      private final kt c = new kt();

      @Override
      public cuc a(kr $$0, cuc $$1) {
         jf $$2 = $$0.d().c(dhm.b);
         aqm $$3 = $$0.b();
         ewf $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         ja $$8 = $$0.c().a($$2);
         dsk $$9 = $$3.a_($$8);
         dto $$10 = $$9.b() instanceof dew ? $$9.c(((dew)$$9.b()).c()) : dto.a;
         double $$11;
         if ($$9.a(avw.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(avw.N)) {
               return this.c.dispense($$0, $$1);
            }

            dsk $$13 = $$3.a_($$8.d());
            dto $$14 = $$13.b() instanceof dew ? $$13.c(((dew)$$13.b()).c()) : dto.a;
            if ($$2 != jf.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cof $$18 = cof.a($$3, $$5, $$6 + $$11, $$7, ((cum)$$1.g()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(kr $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cof.a b;

   public cum(cof.a $$0, ctx.a $$1) {
      super($$1);
      this.b = $$0;
      dhm.a(this, a);
   }

   @Override
   public bqg a(cxo $$0) {
      dcf $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsk $$3 = $$1.a_($$2);
      if (!$$3.a(avw.N)) {
         return bqg.f;
      } else {
         cuc $$4 = $$0.n();
         if ($$1 instanceof aqm $$5) {
            dto $$6 = $$3.b() instanceof dew ? $$3.c(((dew)$$3.b()).c()) : dto.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cof $$8 = cof.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dxg.t, $$2, dxg.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bqg.a($$1.B);
      }
   }
}
