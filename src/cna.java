public class cna extends cmm {
   private static final jj a = new ji() {
      private final ji c = new ji();

      @Override
      public cmr a(jg $$0, cmr $$1) {
         ic $$2 = $$0.d().c(cyo.b);
         amz $$3 = $$0.b();
         elm $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         hx $$8 = $$0.c().a($$2);
         dja $$9 = $$3.a_($$8);
         dke $$10 = $$9.b() instanceof cvy ? $$9.c(((cvy)$$9.b()).c()) : dke.a;
         double $$11;
         if ($$9.a(asb.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(asb.N)) {
               return this.c.dispense($$0, $$1);
            }

            dja $$13 = $$3.a_($$8.d());
            dke $$14 = $$13.b() instanceof cvy ? $$13.c(((cvy)$$13.b()).c()) : dke.a;
            if ($$2 != ic.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cgt $$18 = cgt.a($$3, $$5, $$6 + $$11, $$7, ((cna)$$1.d()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(jg $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cgt.a b;

   public cna(cgt.a $$0, cmm.a $$1) {
      super($$1);
      this.b = $$0;
      cyo.a(this, a);
   }

   @Override
   public bjv a(cpc $$0) {
      cti $$1 = $$0.q();
      hx $$2 = $$0.a();
      dja $$3 = $$1.a_($$2);
      if (!$$3.a(asb.N)) {
         return bjv.e;
      } else {
         cmr $$4 = $$0.n();
         if ($$1 instanceof amz $$5) {
            dke $$6 = $$3.b() instanceof cvy ? $$3.c(((cvy)$$3.b()).c()) : dke.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cgt $$8 = cgt.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dnk.t, $$2, dnk.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bjv.a($$1.B);
      }
   }
}
