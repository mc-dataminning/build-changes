public class eiz extends ege {
   private boolean h;
   private boolean i;

   public eiz(ayd $$0, int $$1, int $$2) {
      super(egx.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public eiz(ty $$0) {
      super(egx.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(egw $$0, ty $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dcx.o.n(), dcx.o.n(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dcx.o.n(), dcx.o.n(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dcx.o.n(), dcx.o.n(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dcx.o.n(), dcx.o.n(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dcx.o.n(), dcx.o.n(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dcx.o.n(), dcx.o.n(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dcx.o.n(), dcx.o.n(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dcx.U.n(), dcx.U.n(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dcx.U.n(), dcx.U.n(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dcx.U.n(), dcx.U.n(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dcx.U.n(), dcx.U.n(), false);
         this.a($$0, dcx.dU.n(), 2, 3, 2, $$4);
         this.a($$0, dcx.dU.n(), 3, 3, 7, $$4);
         this.a($$0, dcx.a.n(), 1, 3, 4, $$4);
         this.a($$0, dcx.a.n(), 5, 3, 4, $$4);
         this.a($$0, dcx.a.n(), 5, 3, 5, $$4);
         this.a($$0, dcx.gp.n(), 1, 3, 5, $$4);
         this.a($$0, dcx.cA.n(), 3, 2, 6, $$4);
         this.a($$0, dcx.ft.n(), 4, 2, 6, $$4);
         this.a($$0, dcx.dU.n(), 1, 2, 1, $$4);
         this.a($$0, dcx.dU.n(), 5, 2, 1, $$4);
         dpy $$7 = dcx.fK.n().a(dkp.b, ir.c);
         dpy $$8 = dcx.fK.n().a(dkp.b, ir.f);
         dpy $$9 = dcx.fK.n().a(dkp.b, ir.e);
         dpy $$10 = dcx.fK.n().a(dkp.b, ir.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dkp.d, drh.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dkp.d, drh.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dkp.d, drh.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dkp.d, drh.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dcx.U.n(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            im $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cih $$14 = bqr.bn.a((czu)$$0.E());
               if ($$14 != null) {
                  $$14.fT();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bri.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(daj $$0, efy $$1) {
      if (!this.i) {
         im $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            ccw $$3 = bqr.p.a((czu)$$0.E());
            if ($$3 != null) {
               $$3.fT();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bri.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
