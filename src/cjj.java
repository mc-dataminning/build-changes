public class cjj extends civ {
   private static final ij a = new ii() {
      private final ii c = new ii();

      @Override
      public cja a(gx $$0, cja $$1) {
         hc $$2 = $$0.e().c(cur.a);
         cpq $$3 = $$0.g();
         double $$4 = $$0.a() + (double)$$2.j() * 1.125;
         double $$5 = Math.floor($$0.b()) + (double)$$2.k();
         double $$6 = $$0.c() + (double)$$2.l() * 1.125;
         gw $$7 = $$0.d().a($$2);
         dfe $$8 = $$3.a_($$7);
         dgi $$9 = $$8.b() instanceof csg ? $$8.c(((csg)$$8.b()).b()) : dgi.a;
         double $$10;
         if ($$8.a(apo.N)) {
            if ($$9.b()) {
               $$10 = 0.6;
            } else {
               $$10 = 0.1;
            }
         } else {
            if (!$$8.i() || !$$3.a_($$7.d()).a(apo.N)) {
               return this.c.dispense($$0, $$1);
            }

            dfe $$12 = $$3.a_($$7.d());
            dgi $$13 = $$12.b() instanceof csg ? $$12.c(((csg)$$12.b()).b()) : dgi.a;
            if ($$2 != hc.a && $$13.b()) {
               $$10 = -0.4;
            } else {
               $$10 = -0.9;
            }
         }

         cdg $$17 = cdg.a($$3, $$4, $$5 + $$10, $$6, ((cjj)$$1.d()).b);
         if ($$1.A()) {
            $$17.b($$1.y());
         }

         $$3.b($$17);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(gx $$0) {
         $$0.g().c(1000, $$0.d(), 0);
      }
   };
   final cdg.a b;

   public cjj(cdg.a $$0, civ.a $$1) {
      super($$1);
      this.b = $$0;
      cur.a(this, a);
   }

   @Override
   public bgt a(clk $$0) {
      cpq $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfe $$3 = $$1.a_($$2);
      if (!$$3.a(apo.N)) {
         return bgt.e;
      } else {
         cja $$4 = $$0.n();
         if (!$$1.B) {
            dgi $$5 = $$3.b() instanceof csg ? $$3.c(((csg)$$3.b()).b()) : dgi.a;
            double $$6 = 0.0;
            if ($$5.b()) {
               $$6 = 0.5;
            }

            cdg $$7 = cdg.a($$1, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5, this.b);
            if ($$4.A()) {
               $$7.b($$4.y());
            }

            $$1.b($$7);
            $$1.a(djo.t, $$2, djo.a.a($$0.o(), $$1.a_($$2.d())));
         }

         $$4.h(1);
         return bgt.a($$1.B);
      }
   }
}
