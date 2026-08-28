public class cvz extends cvg {
   private static final ky a = new kx() {
      private final kx c = new kx();

      @Override
      public cvl a(kv $$0, cvl $$1) {
         jj $$2 = $$0.d().c(dja.b);
         arg $$3 = $$0.b();
         eye $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         je $$8 = $$0.c().a($$2);
         dua $$9 = $$3.a_($$8);
         dve $$10 = $$9.b() instanceof dgk ? $$9.c(((dgk)$$9.b()).c()) : dve.a;
         double $$11;
         if ($$9.a(aws.O)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.l() || !$$3.a_($$8.e()).a(aws.O)) {
               return this.c.dispense($$0, $$1);
            }

            dua $$13 = $$3.a_($$8.e());
            dve $$14 = $$13.b() instanceof dgk ? $$13.c(((dgk)$$13.b()).c()) : dve.a;
            if ($$2 != jj.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         eye $$18 = new eye($$5, $$6 + $$11, $$7);
         cpm $$19 = cpm.a($$3, $$18.d, $$18.e, $$18.f, ((cvz)$$1.h()).b, $$1, null);
         if (cpm.b($$3)) {
            for (btj $$21 : $$3.a_(null, $$19.cO())) {
               if ($$21 instanceof cpm) {
                  return this.c.dispense($$0, $$1);
               }
            }
         }

         $$3.b($$19);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(kv $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cpm.a b;

   public cvz(cpm.a $$0, cvg.a $$1) {
      super($$1);
      this.b = $$0;
      dja.a(this, a);
   }

   @Override
   public brk a(cyy $$0) {
      dds $$1 = $$0.q();
      je $$2 = $$0.a();
      dua $$3 = $$1.a_($$2);
      if (!$$3.a(aws.O)) {
         return brk.d;
      } else {
         cvl $$4 = $$0.n();
         if ($$1 instanceof arg $$5) {
            dve $$6 = $$3.b() instanceof dgk ? $$3.c(((dgk)$$3.b()).c()) : dve.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            eye $$8 = new eye((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5);
            cpm $$9 = cpm.a($$5, $$8.d, $$8.e, $$8.f, this.b, $$4, $$0.o());
            if (cpm.b($$1)) {
               for (btj $$11 : $$1.a_(null, $$9.cO())) {
                  if ($$11 instanceof cpm) {
                     return brk.d;
                  }
               }
            }

            $$5.b($$9);
            $$5.a(dyx.t, $$2, dyx.a.a($$0.o(), $$5.a_($$2.e())));
         }

         $$4.h(1);
         return brk.a;
      }
   }
}
