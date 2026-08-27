public class cqt extends cqf {
   private static final jo a = new jn() {
      private final jn c = new jn();

      @Override
      public cqk a(jl $$0, cqk $$1) {
         ih $$2 = $$0.d().c(dcf.b);
         apf $$3 = $$0.b();
         epr $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         ib $$8 = $$0.c().a($$2);
         dmz $$9 = $$3.a_($$8);
         dod $$10 = $$9.b() instanceof czp ? $$9.c(((czp)$$9.b()).c()) : dod.a;
         double $$11;
         if ($$9.a(aun.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(aun.N)) {
               return this.c.dispense($$0, $$1);
            }

            dmz $$13 = $$3.a_($$8.d());
            dod $$14 = $$13.b() instanceof czp ? $$13.c(((czp)$$13.b()).c()) : dod.a;
            if ($$2 != ih.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         ckn $$18 = ckn.a($$3, $$5, $$6 + $$11, $$7, ((cqt)$$1.d()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(jl $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final ckn.a b;

   public cqt(ckn.a $$0, cqf.a $$1) {
      super($$1);
      this.b = $$0;
      dcf.a(this, a);
   }

   @Override
   public bnc a(csu $$0) {
      cwz $$1 = $$0.q();
      ib $$2 = $$0.a();
      dmz $$3 = $$1.a_($$2);
      if (!$$3.a(aun.N)) {
         return bnc.e;
      } else {
         cqk $$4 = $$0.n();
         if ($$1 instanceof apf $$5) {
            dod $$6 = $$3.b() instanceof czp ? $$3.c(((czp)$$3.b()).c()) : dod.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            ckn $$8 = ckn.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(drn.t, $$2, drn.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bnc.a($$1.B);
      }
   }
}
