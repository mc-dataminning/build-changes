public class cjq extends cjc {
   private static final ij a = new ii() {
      private final ii c = new ii();

      @Override
      public cjh a(gx $$0, cjh $$1) {
         hc $$2 = $$0.e().c(cuy.a);
         cpx $$3 = $$0.g();
         double $$4 = $$0.a() + (double)$$2.j() * 1.125;
         double $$5 = Math.floor($$0.b()) + (double)$$2.k();
         double $$6 = $$0.c() + (double)$$2.l() * 1.125;
         gw $$7 = $$0.d().a($$2);
         dfl $$8 = $$3.a_($$7);
         dgp $$9 = $$8.b() instanceof csn ? $$8.c(((csn)$$8.b()).b()) : dgp.a;
         double $$10;
         if ($$8.a(apu.N)) {
            if ($$9.b()) {
               $$10 = 0.6;
            } else {
               $$10 = 0.1;
            }
         } else {
            if (!$$8.i() || !$$3.a_($$7.d()).a(apu.N)) {
               return this.c.dispense($$0, $$1);
            }

            dfl $$12 = $$3.a_($$7.d());
            dgp $$13 = $$12.b() instanceof csn ? $$12.c(((csn)$$12.b()).b()) : dgp.a;
            if ($$2 != hc.a && $$13.b()) {
               $$10 = -0.4;
            } else {
               $$10 = -0.9;
            }
         }

         cdn $$17 = cdn.a($$3, $$4, $$5 + $$10, $$6, ((cjq)$$1.d()).b);
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
   final cdn.a b;

   public cjq(cdn.a $$0, cjc.a $$1) {
      super($$1);
      this.b = $$0;
      cuy.a(this, a);
   }

   @Override
   public bha a(clr $$0) {
      cpx $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfl $$3 = $$1.a_($$2);
      if (!$$3.a(apu.N)) {
         return bha.e;
      } else {
         cjh $$4 = $$0.n();
         if (!$$1.B) {
            dgp $$5 = $$3.b() instanceof csn ? $$3.c(((csn)$$3.b()).b()) : dgp.a;
            double $$6 = 0.0;
            if ($$5.b()) {
               $$6 = 0.5;
            }

            cdn $$7 = cdn.a($$1, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5, this.b);
            if ($$4.A()) {
               $$7.b($$4.y());
            }

            $$1.b($$7);
            $$1.a(djv.t, $$2, djv.a.a($$0.o(), $$1.a_($$2.d())));
         }

         $$4.h(1);
         return bha.a($$1.B);
      }
   }
}
