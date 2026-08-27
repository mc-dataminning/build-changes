public class cnp extends cnb {
   private static final jj a = new ji() {
      private final ji c = new ji();

      @Override
      public cng a(jg $$0, cng $$1) {
         ic $$2 = $$0.d().c(czd.b);
         ane $$3 = $$0.b();
         emc $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         hx $$8 = $$0.c().a($$2);
         djp $$9 = $$3.a_($$8);
         dkt $$10 = $$9.b() instanceof cwn ? $$9.c(((cwn)$$9.b()).c()) : dkt.a;
         double $$11;
         if ($$9.a(asi.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(asi.N)) {
               return this.c.dispense($$0, $$1);
            }

            djp $$13 = $$3.a_($$8.d());
            dkt $$14 = $$13.b() instanceof cwn ? $$13.c(((cwn)$$13.b()).c()) : dkt.a;
            if ($$2 != ic.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         chi $$18 = chi.a($$3, $$5, $$6 + $$11, $$7, ((cnp)$$1.d()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(jg $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final chi.a b;

   public cnp(chi.a $$0, cnb.a $$1) {
      super($$1);
      this.b = $$0;
      czd.a(this, a);
   }

   @Override
   public bkc a(cpr $$0) {
      ctx $$1 = $$0.q();
      hx $$2 = $$0.a();
      djp $$3 = $$1.a_($$2);
      if (!$$3.a(asi.N)) {
         return bkc.e;
      } else {
         cng $$4 = $$0.n();
         if ($$1 instanceof ane $$5) {
            dkt $$6 = $$3.b() instanceof cwn ? $$3.c(((cwn)$$3.b()).c()) : dkt.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            chi $$8 = chi.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dnz.t, $$2, dnz.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bkc.a($$1.B);
      }
   }
}
