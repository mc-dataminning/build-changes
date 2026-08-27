public class eia extends eff {
   private boolean h;
   private boolean i;

   public eia(axr $$0, int $$1, int $$2) {
      super(efy.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public eia(tm $$0) {
      super(efy.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(efx $$0, tm $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(czs $$0, czq $$1, dqw $$2, axr $$3, eez $$4, cye $$5, ib $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dca.o.n(), dca.o.n(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dca.o.n(), dca.o.n(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dca.o.n(), dca.o.n(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dca.o.n(), dca.o.n(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dca.o.n(), dca.o.n(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dca.o.n(), dca.o.n(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dca.o.n(), dca.o.n(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dca.U.n(), dca.U.n(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dca.U.n(), dca.U.n(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dca.U.n(), dca.U.n(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dca.U.n(), dca.U.n(), false);
         this.a($$0, dca.dU.n(), 2, 3, 2, $$4);
         this.a($$0, dca.dU.n(), 3, 3, 7, $$4);
         this.a($$0, dca.a.n(), 1, 3, 4, $$4);
         this.a($$0, dca.a.n(), 5, 3, 4, $$4);
         this.a($$0, dca.a.n(), 5, 3, 5, $$4);
         this.a($$0, dca.gp.n(), 1, 3, 5, $$4);
         this.a($$0, dca.cA.n(), 3, 2, 6, $$4);
         this.a($$0, dca.ft.n(), 4, 2, 6, $$4);
         this.a($$0, dca.dU.n(), 1, 2, 1, $$4);
         this.a($$0, dca.dU.n(), 5, 2, 1, $$4);
         doz $$7 = dca.fK.n().a(djr.b, ih.c);
         doz $$8 = dca.fK.n().a(djr.b, ih.f);
         doz $$9 = dca.fK.n().a(djr.b, ih.e);
         doz $$10 = dca.fK.n().a(djr.b, ih.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(djr.d, dqi.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(djr.d, dqi.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(djr.d, dqi.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(djr.d, dqi.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dca.U.n(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            ib $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               chp $$14 = bqb.bn.a((cyx)$$0.E());
               if ($$14 != null) {
                  $$14.fS();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bqs.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(czm $$0, eez $$1) {
      if (!this.i) {
         ib $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            ccg $$3 = bqb.p.a((cyx)$$0.E());
            if ($$3 != null) {
               $$3.fS();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bqs.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
