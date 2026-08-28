public class eld extends eii {
   private boolean h;
   private boolean i;

   public eld(azh $$0, int $$1, int $$2) {
      super(ejb.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public eld(us $$0) {
      super(ejb.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(eja $$0, us $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dct $$0, dcr $$1, dtz $$2, azh $$3, eic $$4, dbf $$5, iz $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dfb.o.o(), dfb.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dfb.o.o(), dfb.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dfb.o.o(), dfb.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dfb.o.o(), dfb.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dfb.o.o(), dfb.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dfb.o.o(), dfb.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dfb.o.o(), dfb.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dfb.U.o(), dfb.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dfb.U.o(), dfb.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dfb.U.o(), dfb.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dfb.U.o(), dfb.U.o(), false);
         this.a($$0, dfb.dU.o(), 2, 3, 2, $$4);
         this.a($$0, dfb.dU.o(), 3, 3, 7, $$4);
         this.a($$0, dfb.a.o(), 1, 3, 4, $$4);
         this.a($$0, dfb.a.o(), 5, 3, 4, $$4);
         this.a($$0, dfb.a.o(), 5, 3, 5, $$4);
         this.a($$0, dfb.gp.o(), 1, 3, 5, $$4);
         this.a($$0, dfb.cA.o(), 3, 2, 6, $$4);
         this.a($$0, dfb.ft.o(), 4, 2, 6, $$4);
         this.a($$0, dfb.dU.o(), 1, 2, 1, $$4);
         this.a($$0, dfb.dU.o(), 5, 2, 1, $$4);
         dsc $$7 = dfb.fK.o().a(dmt.b, je.c);
         dsc $$8 = dfb.fK.o().a(dmt.b, je.f);
         dsc $$9 = dfb.fK.o().a(dmt.b, je.e);
         dsc $$10 = dfb.fK.o().a(dmt.b, je.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dmt.d, dtl.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dmt.d, dtl.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dmt.d, dtl.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dmt.d, dtl.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dfb.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            iz $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               ckt $$14 = bta.bo.a((dby)$$0.E());
               if ($$14 != null) {
                  $$14.fU();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), btt.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dcn $$0, eic $$1) {
      if (!this.i) {
         iz $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cfi $$3 = bta.p.a((dby)$$0.E());
            if ($$3 != null) {
               $$3.fU();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), btt.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
