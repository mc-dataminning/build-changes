public class clk extends ckw {
   private static final je a = new jd() {
      private final jd c = new jd();

      @Override
      public clb a(jb $$0, clb $$1) {
         hx $$2 = $$0.d().c(cwx.b);
         ama $$3 = $$0.b();
         eji $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         ht $$8 = $$0.c().a($$2);
         dgw $$9 = $$3.a_($$8);
         dia $$10 = $$9.b() instanceof cui ? $$9.c(((cui)$$9.b()).c()) : dia.a;
         double $$11;
         if ($$9.a(arc.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(arc.N)) {
               return this.c.dispense($$0, $$1);
            }

            dgw $$13 = $$3.a_($$8.d());
            dia $$14 = $$13.b() instanceof cui ? $$13.c(((cui)$$13.b()).c()) : dia.a;
            if ($$2 != hx.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cfd $$18 = cfd.a($$3, $$5, $$6 + $$11, $$7, ((clk)$$1.d()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(jb $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cfd.a b;

   public clk(cfd.a $$0, ckw.a $$1) {
      super($$1);
      this.b = $$0;
      cwx.a(this, a);
   }

   @Override
   public biq a(cnl $$0) {
      crs $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgw $$3 = $$1.a_($$2);
      if (!$$3.a(arc.N)) {
         return biq.e;
      } else {
         clb $$4 = $$0.n();
         if ($$1 instanceof ama $$5) {
            dia $$6 = $$3.b() instanceof cui ? $$3.c(((cui)$$3.b()).c()) : dia.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cfd $$8 = cfd.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dlg.t, $$2, dlg.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return biq.a($$1.B);
      }
   }
}
