public class cva extends cul {
   private static final kt a = new ks() {
      private final ks c = new ks();

      @Override
      public cuq a(kq $$0, cuq $$1) {
         je $$2 = $$0.d().c(dhf.b);
         arf $$3 = $$0.b();
         evs $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         iz $$8 = $$0.c().a($$2);
         dsd $$9 = $$3.a_($$8);
         dth $$10 = $$9.b() instanceof dep ? $$9.c(((dep)$$9.b()).c()) : dth.a;
         double $$11;
         if ($$9.a(awp.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(awp.N)) {
               return this.c.dispense($$0, $$1);
            }

            dsd $$13 = $$3.a_($$8.d());
            dth $$14 = $$13.b() instanceof dep ? $$13.c(((dep)$$13.b()).c()) : dth.a;
            if ($$2 != je.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cou $$18 = cou.a($$3, $$5, $$6 + $$11, $$7, ((cva)$$1.g()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(kq $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cou.a b;

   public cva(cou.a $$0, cul.a $$1) {
      super($$1);
      this.b = $$0;
      dhf.a(this, a);
   }

   @Override
   public bqv a(cyd $$0) {
      dbz $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsd $$3 = $$1.a_($$2);
      if (!$$3.a(awp.N)) {
         return bqv.f;
      } else {
         cuq $$4 = $$0.n();
         if ($$1 instanceof arf $$5) {
            dth $$6 = $$3.b() instanceof dep ? $$3.c(((dep)$$3.b()).c()) : dth.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cou $$8 = cou.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dww.t, $$2, dww.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bqv.a($$1.B);
      }
   }
}
