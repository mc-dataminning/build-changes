public class clx extends clj {
   private static final ji a = new jh() {
      private final jh c = new jh();

      @Override
      public clo a(jf $$0, clo $$1) {
         ib $$2 = $$0.d().c(cxk.b);
         ami $$3 = $$0.b();
         ejz $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         hx $$8 = $$0.c().a($$2);
         dhn $$9 = $$3.a_($$8);
         dir $$10 = $$9.b() instanceof cuu ? $$9.c(((cuu)$$9.b()).c()) : dir.a;
         double $$11;
         if ($$9.a(ark.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(ark.N)) {
               return this.c.dispense($$0, $$1);
            }

            dhn $$13 = $$3.a_($$8.d());
            dir $$14 = $$13.b() instanceof cuu ? $$13.c(((cuu)$$13.b()).c()) : dir.a;
            if ($$2 != ib.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cfq $$18 = cfq.a($$3, $$5, $$6 + $$11, $$7, ((clx)$$1.d()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(jf $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cfq.a b;

   public clx(cfq.a $$0, clj.a $$1) {
      super($$1);
      this.b = $$0;
      cxk.a(this, a);
   }

   @Override
   public bjb a(cny $$0) {
      csf $$1 = $$0.q();
      hx $$2 = $$0.a();
      dhn $$3 = $$1.a_($$2);
      if (!$$3.a(ark.N)) {
         return bjb.e;
      } else {
         clo $$4 = $$0.n();
         if ($$1 instanceof ami $$5) {
            dir $$6 = $$3.b() instanceof cuu ? $$3.c(((cuu)$$3.b()).c()) : dir.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cfq $$8 = cfq.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dlx.t, $$2, dlx.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bjb.a($$1.B);
      }
   }
}
