public class eaf extends dxk {
   private boolean h;
   private boolean i;

   public eaf(atw $$0, int $$1, int $$2) {
      super(dyd.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public eaf(sd $$0) {
      super(dyd.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(dyc $$0, sd $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, hx $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, cvh.o.o(), cvh.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, cvh.o.o(), cvh.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, cvh.o.o(), cvh.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, cvh.o.o(), cvh.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, cvh.o.o(), cvh.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, cvh.o.o(), cvh.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, cvh.o.o(), cvh.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, cvh.U.o(), cvh.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, cvh.U.o(), cvh.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, cvh.U.o(), cvh.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, cvh.U.o(), cvh.U.o(), false);
         this.a($$0, cvh.dU.o(), 2, 3, 2, $$4);
         this.a($$0, cvh.dU.o(), 3, 3, 7, $$4);
         this.a($$0, cvh.a.o(), 1, 3, 4, $$4);
         this.a($$0, cvh.a.o(), 5, 3, 4, $$4);
         this.a($$0, cvh.a.o(), 5, 3, 5, $$4);
         this.a($$0, cvh.gp.o(), 1, 3, 5, $$4);
         this.a($$0, cvh.cA.o(), 3, 2, 6, $$4);
         this.a($$0, cvh.ft.o(), 4, 2, 6, $$4);
         this.a($$0, cvh.dU.o(), 1, 2, 1, $$4);
         this.a($$0, cvh.dU.o(), 5, 2, 1, $$4);
         dhn $$7 = cvh.fK.o().a(dcy.b, ib.c);
         dhn $$8 = cvh.fK.o().a(dcy.b, ib.f);
         dhn $$9 = cvh.fK.o().a(dcy.b, ib.e);
         dhn $$10 = cvh.fK.o().a(dcy.b, ib.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dcy.d, diw.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dcy.d, diw.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dcy.d, diw.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dcy.d, diw.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, cvh.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            hx $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               ccd $$14 = bkz.bj.a((csf)$$0.D());
               if ($$14 != null) {
                  $$14.fK();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), blp.d, null, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(csu $$0, dxe $$1) {
      if (!this.i) {
         hx $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            bwz $$3 = bkz.m.a((csf)$$0.D());
            if ($$3 != null) {
               $$3.fK();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), blp.d, null, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
