public class dxu extends dvg {
   private boolean h;
   private boolean i;

   public dxu(asc $$0, int $$1, int $$2) {
      super(dvz.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public dxu(qy $$0) {
      super(dvz.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(dvy $$0, qy $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(cqp $$0, cqn $$1, dhg $$2, asc $$3, dva $$4, cpc $$5, gw $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, csw.o.n(), csw.o.n(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, csw.o.n(), csw.o.n(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, csw.o.n(), csw.o.n(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, csw.o.n(), csw.o.n(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, csw.o.n(), csw.o.n(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, csw.o.n(), csw.o.n(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, csw.o.n(), csw.o.n(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, csw.U.n(), csw.U.n(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, csw.U.n(), csw.U.n(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, csw.U.n(), csw.U.n(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, csw.U.n(), csw.U.n(), false);
         this.a($$0, csw.dU.n(), 2, 3, 2, $$4);
         this.a($$0, csw.dU.n(), 3, 3, 7, $$4);
         this.a($$0, csw.a.n(), 1, 3, 4, $$4);
         this.a($$0, csw.a.n(), 5, 3, 4, $$4);
         this.a($$0, csw.a.n(), 5, 3, 5, $$4);
         this.a($$0, csw.gp.n(), 1, 3, 5, $$4);
         this.a($$0, csw.cA.n(), 3, 2, 6, $$4);
         this.a($$0, csw.ft.n(), 4, 2, 6, $$4);
         this.a($$0, csw.dU.n(), 1, 2, 1, $$4);
         this.a($$0, csw.dU.n(), 5, 2, 1, $$4);
         dfj $$7 = csw.fK.n().a(dap.a, hc.c);
         dfj $$8 = csw.fK.n().a(dap.a, hc.f);
         dfj $$9 = csw.fK.n().a(dap.a, hc.e);
         dfj $$10 = csw.fK.n().a(dap.a, hc.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dap.c, dgs.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dap.c, dgs.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dap.c, dgs.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dap.c, dgs.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, csw.U.n(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            gw $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               bzy $$14 = biu.bj.a((cpv)$$0.C());
               if ($$14 != null) {
                  $$14.fI();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bjk.d, null, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(cqk $$0, dva $$1) {
      if (!this.i) {
         gw $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            buu $$3 = biu.m.a((cpv)$$0.C());
            if ($$3 != null) {
               $$3.fI();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bjk.d, null, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
