public class cgi extends cfu {
   private static final ih a = new ig() {
      private final ig c = new ig();

      @Override
      public cfz a(gv $$0, cfz $$1) {
         ha $$2 = $$0.e().c(cro.a);
         cmm $$3 = $$0.g();
         double $$4 = $$0.a() + (double)$$2.j() * 1.125;
         double $$5 = Math.floor($$0.b()) + (double)$$2.k();
         double $$6 = $$0.c() + (double)$$2.l() * 1.125;
         gu $$7 = $$0.d().a($$2);
         dcb $$8 = $$3.a_($$7);
         ddf $$9 = $$8.b() instanceof cpd ? $$8.c(((cpd)$$8.b()).b()) : ddf.a;
         double $$10;
         if ($$8.a(amw.N)) {
            if ($$9.b()) {
               $$10 = 0.6;
            } else {
               $$10 = 0.1;
            }
         } else {
            if (!$$8.i() || !$$3.a_($$7.d()).a(amw.N)) {
               return this.c.dispense($$0, $$1);
            }

            dcb $$12 = $$3.a_($$7.d());
            ddf $$13 = $$12.b() instanceof cpd ? $$12.c(((cpd)$$12.b()).b()) : ddf.a;
            if ($$2 != ha.a && $$13.b()) {
               $$10 = -0.4;
            } else {
               $$10 = -0.9;
            }
         }

         caf $$17 = caf.a($$3, $$4, $$5 + $$10, $$6, ((cgi)$$1.d()).b);
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
   final caf.a b;

   public cgi(caf.a $$0, cfu.a $$1) {
      super($$1);
      this.b = $$0;
      cro.a(this, a);
   }

   @Override
   public bdx a(cij $$0) {
      cmm $$1 = $$0.q();
      gu $$2 = $$0.a();
      dcb $$3 = $$1.a_($$2);
      if (!$$3.a(amw.N)) {
         return bdx.e;
      } else {
         cfz $$4 = $$0.n();
         if (!$$1.B) {
            ddf $$5 = $$3.b() instanceof cpd ? $$3.c(((cpd)$$3.b()).b()) : ddf.a;
            double $$6 = 0.0;
            if ($$5.b()) {
               $$6 = 0.5;
            }

            caf $$7 = caf.a($$1, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5, this.b);
            if ($$4.A()) {
               $$7.b($$4.y());
            }

            $$1.b($$7);
            $$1.a(dgl.t, $$2, dgl.a.a($$0.o(), $$1.a_($$2.d())));
         }

         $$4.h(1);
         return bdx.a($$1.B);
      }
   }
}
