public class elj extends eio {
   private boolean h;
   private boolean i;

   public elj(aym $$0, int $$1, int $$2) {
      super(ejh.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public elj(tx $$0) {
      super(ejh.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(ejg $$0, tx $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dcz $$0, dcx $$1, due $$2, aym $$3, eii $$4, dbk $$5, ja $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dfh.o.o(), dfh.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dfh.o.o(), dfh.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dfh.o.o(), dfh.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dfh.o.o(), dfh.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dfh.o.o(), dfh.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dfh.o.o(), dfh.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dfh.o.o(), dfh.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dfh.U.o(), dfh.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dfh.U.o(), dfh.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dfh.U.o(), dfh.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dfh.U.o(), dfh.U.o(), false);
         this.a($$0, dfh.dU.o(), 2, 3, 2, $$4);
         this.a($$0, dfh.dU.o(), 3, 3, 7, $$4);
         this.a($$0, dfh.a.o(), 1, 3, 4, $$4);
         this.a($$0, dfh.a.o(), 5, 3, 4, $$4);
         this.a($$0, dfh.a.o(), 5, 3, 5, $$4);
         this.a($$0, dfh.gp.o(), 1, 3, 5, $$4);
         this.a($$0, dfh.cA.o(), 3, 2, 6, $$4);
         this.a($$0, dfh.ft.o(), 4, 2, 6, $$4);
         this.a($$0, dfh.dU.o(), 1, 2, 1, $$4);
         this.a($$0, dfh.dU.o(), 5, 2, 1, $$4);
         dsh $$7 = dfh.fK.o().a(dmz.b, jf.c);
         dsh $$8 = dfh.fK.o().a(dmz.b, jf.f);
         dsh $$9 = dfh.fK.o().a(dmz.b, jf.e);
         dsh $$10 = dfh.fK.o().a(dmz.b, jf.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dmz.d, dtq.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dmz.d, dtq.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dmz.d, dtq.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dmz.d, dtq.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dfh.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            ja $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               ckd $$14 = bsj.bo.a((dcd)$$0.E());
               if ($$14 != null) {
                  $$14.fQ();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), btc.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dcs $$0, eii $$1) {
      if (!this.i) {
         ja $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cer $$3 = bsj.p.a((dcd)$$0.E());
            if ($$3 != null) {
               $$3.fQ();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), btc.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
