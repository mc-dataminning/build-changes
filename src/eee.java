public class eee extends ebj {
   private boolean h;
   private boolean i;

   public eee(awp $$0, int $$1, int $$2) {
      super(ecc.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public eee(sw $$0) {
      super(ecc.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(ecb $$0, sw $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, hz $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, cyu.o.o(), cyu.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, cyu.o.o(), cyu.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, cyu.o.o(), cyu.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, cyu.o.o(), cyu.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, cyu.o.o(), cyu.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, cyu.o.o(), cyu.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, cyu.o.o(), cyu.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, cyu.U.o(), cyu.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, cyu.U.o(), cyu.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, cyu.U.o(), cyu.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, cyu.U.o(), cyu.U.o(), false);
         this.a($$0, cyu.dU.o(), 2, 3, 2, $$4);
         this.a($$0, cyu.dU.o(), 3, 3, 7, $$4);
         this.a($$0, cyu.a.o(), 1, 3, 4, $$4);
         this.a($$0, cyu.a.o(), 5, 3, 4, $$4);
         this.a($$0, cyu.a.o(), 5, 3, 5, $$4);
         this.a($$0, cyu.gp.o(), 1, 3, 5, $$4);
         this.a($$0, cyu.cA.o(), 3, 2, 6, $$4);
         this.a($$0, cyu.ft.o(), 4, 2, 6, $$4);
         this.a($$0, cyu.dU.o(), 1, 2, 1, $$4);
         this.a($$0, cyu.dU.o(), 5, 2, 1, $$4);
         dlj $$7 = cyu.fK.o().a(dgl.b, ie.c);
         dlj $$8 = cyu.fK.o().a(dgl.b, ie.f);
         dlj $$9 = cyu.fK.o().a(dgl.b, ie.e);
         dlj $$10 = cyu.fK.o().a(dgl.b, ie.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dgl.d, dms.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dgl.d, dms.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dgl.d, dms.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dgl.d, dms.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, cyu.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            hz $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cfh $$14 = bnw.bm.a((cvr)$$0.E());
               if ($$14 != null) {
                  $$14.fL();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bom.d, null, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(cwg $$0, ebd $$1) {
      if (!this.i) {
         hz $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            caa $$3 = bnw.o.a((cvr)$$0.E());
            if ($$3 != null) {
               $$3.fL();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bom.d, null, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
