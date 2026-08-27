public class edx extends ebc {
   private boolean h;
   private boolean i;

   public edx(awo $$0, int $$1, int $$2) {
      super(ebv.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public edx(sw $$0) {
      super(ebv.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(ebu $$0, sw $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(cwi $$0, cwg $$1, dnc $$2, awo $$3, eaw $$4, cuu $$5, hz $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, cyq.o.o(), cyq.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, cyq.o.o(), cyq.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, cyq.o.o(), cyq.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, cyq.o.o(), cyq.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, cyq.o.o(), cyq.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, cyq.o.o(), cyq.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, cyq.o.o(), cyq.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, cyq.U.o(), cyq.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, cyq.U.o(), cyq.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, cyq.U.o(), cyq.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, cyq.U.o(), cyq.U.o(), false);
         this.a($$0, cyq.dU.o(), 2, 3, 2, $$4);
         this.a($$0, cyq.dU.o(), 3, 3, 7, $$4);
         this.a($$0, cyq.a.o(), 1, 3, 4, $$4);
         this.a($$0, cyq.a.o(), 5, 3, 4, $$4);
         this.a($$0, cyq.a.o(), 5, 3, 5, $$4);
         this.a($$0, cyq.gp.o(), 1, 3, 5, $$4);
         this.a($$0, cyq.cA.o(), 3, 2, 6, $$4);
         this.a($$0, cyq.ft.o(), 4, 2, 6, $$4);
         this.a($$0, cyq.dU.o(), 1, 2, 1, $$4);
         this.a($$0, cyq.dU.o(), 5, 2, 1, $$4);
         dlf $$7 = cyq.fK.o().a(dgh.b, ie.c);
         dlf $$8 = cyq.fK.o().a(dgh.b, ie.f);
         dlf $$9 = cyq.fK.o().a(dgh.b, ie.e);
         dlf $$10 = cyq.fK.o().a(dgh.b, ie.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dgh.d, dmo.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dgh.d, dmo.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dgh.d, dmo.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dgh.d, dmo.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, cyq.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            hz $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cfd $$14 = bnu.bm.a((cvn)$$0.E());
               if ($$14 != null) {
                  $$14.fL();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bok.d, null, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(cwc $$0, eaw $$1) {
      if (!this.i) {
         hz $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            bzw $$3 = bnu.o.a((cvn)$$0.E());
            if ($$3 != null) {
               $$3.fL();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bok.d, null, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
