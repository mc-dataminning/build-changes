public class cjg extends cis {
   private static final ih a = new ig() {
      private final ig c = new ig();

      @Override
      public cix a(gv $$0, cix $$1) {
         ha $$2 = $$0.e().c(cum.a);
         cpl $$3 = $$0.g();
         double $$4 = $$0.a() + (double)$$2.j() * 1.125;
         double $$5 = Math.floor($$0.b()) + (double)$$2.k();
         double $$6 = $$0.c() + (double)$$2.l() * 1.125;
         gu $$7 = $$0.d().a($$2);
         dez $$8 = $$3.a_($$7);
         dgd $$9 = $$8.b() instanceof csb ? $$8.c(((csb)$$8.b()).b()) : dgd.a;
         double $$10;
         if ($$8.a(apl.N)) {
            if ($$9.b()) {
               $$10 = 0.6;
            } else {
               $$10 = 0.1;
            }
         } else {
            if (!$$8.i() || !$$3.a_($$7.d()).a(apl.N)) {
               return this.c.dispense($$0, $$1);
            }

            dez $$12 = $$3.a_($$7.d());
            dgd $$13 = $$12.b() instanceof csb ? $$12.c(((csb)$$12.b()).b()) : dgd.a;
            if ($$2 != ha.a && $$13.b()) {
               $$10 = -0.4;
            } else {
               $$10 = -0.9;
            }
         }

         cdd $$17 = cdd.a($$3, $$4, $$5 + $$10, $$6, ((cjg)$$1.d()).b);
         if ($$1.A()) {
            $$17.b($$1.y());
         }

         $$3.b($$17);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(gv $$0) {
         $$0.g().c(1000, $$0.d(), 0);
      }
   };
   final cdd.a b;

   public cjg(cdd.a $$0, cis.a $$1) {
      super($$1);
      this.b = $$0;
      cum.a(this, a);
   }

   @Override
   public bgq a(clh $$0) {
      cpl $$1 = $$0.q();
      gu $$2 = $$0.a();
      dez $$3 = $$1.a_($$2);
      if (!$$3.a(apl.N)) {
         return bgq.e;
      } else {
         cix $$4 = $$0.n();
         if (!$$1.B) {
            dgd $$5 = $$3.b() instanceof csb ? $$3.c(((csb)$$3.b()).b()) : dgd.a;
            double $$6 = 0.0;
            if ($$5.b()) {
               $$6 = 0.5;
            }

            cdd $$7 = cdd.a($$1, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5, this.b);
            if ($$4.A()) {
               $$7.b($$4.y());
            }

            $$1.b($$7);
            $$1.a(djj.t, $$2, djj.a.a($$0.o(), $$1.a_($$2.d())));
         }

         $$4.h(1);
         return bgq.a($$1.B);
      }
   }
}
