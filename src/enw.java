public class enw extends ela {
   private boolean h;
   private boolean i;

   public enw(azl $$0, int $$1, int $$2) {
      super(elt.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public enw(uf $$0) {
      super(elt.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(els $$0, uf $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dhl.o.o(), dhl.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dhl.o.o(), dhl.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dhl.o.o(), dhl.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dhl.o.o(), dhl.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dhl.o.o(), dhl.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dhl.o.o(), dhl.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dhl.o.o(), dhl.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dhl.U.o(), dhl.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dhl.U.o(), dhl.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dhl.U.o(), dhl.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dhl.U.o(), dhl.U.o(), false);
         this.a($$0, dhl.dU.o(), 2, 3, 2, $$4);
         this.a($$0, dhl.dU.o(), 3, 3, 7, $$4);
         this.a($$0, dhl.a.o(), 1, 3, 4, $$4);
         this.a($$0, dhl.a.o(), 5, 3, 4, $$4);
         this.a($$0, dhl.a.o(), 5, 3, 5, $$4);
         this.a($$0, dhl.gp.o(), 1, 3, 5, $$4);
         this.a($$0, dhl.cA.o(), 3, 2, 6, $$4);
         this.a($$0, dhl.ft.o(), 4, 2, 6, $$4);
         this.a($$0, dhl.dU.o(), 1, 2, 1, $$4);
         this.a($$0, dhl.dU.o(), 5, 2, 1, $$4);
         duo $$7 = dhl.fK.o().b(dpe.b, jj.c);
         duo $$8 = dhl.fK.o().b(dpe.b, jj.f);
         duo $$9 = dhl.fK.o().b(dpe.b, jj.e);
         duo $$10 = dhl.fK.o().b(dpe.b, jj.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.b(dpe.d, dvx.e), 0, 4, 1, $$4);
         this.a($$0, $$7.b(dpe.d, dvx.d), 6, 4, 1, $$4);
         this.a($$0, $$10.b(dpe.d, dvx.d), 0, 4, 8, $$4);
         this.a($$0, $$10.b(dpe.d, dvx.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dhl.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            je $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               clq $$14 = btv.bo.a($$0.E(), btu.d);
               if ($$14 != null) {
                  $$14.fW();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), btu.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dew $$0, eku $$1) {
      if (!this.i) {
         je $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cgd $$3 = btv.p.a($$0.E(), btu.d);
            if ($$3 != null) {
               $$3.fW();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), btu.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
