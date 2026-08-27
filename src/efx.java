public class efx extends edc {
   private boolean h;
   private boolean i;

   public efx(axd $$0, int $$1, int $$2) {
      super(edv.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public efx(ta $$0) {
      super(edv.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(edu $$0, ta $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(cxw $$0, cxu $$1, doy $$2, axd $$3, ecw $$4, cwi $$5, ib $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dae.o.o(), dae.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dae.o.o(), dae.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dae.o.o(), dae.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dae.o.o(), dae.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dae.o.o(), dae.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dae.o.o(), dae.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dae.o.o(), dae.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dae.U.o(), dae.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dae.U.o(), dae.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dae.U.o(), dae.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dae.U.o(), dae.U.o(), false);
         this.a($$0, dae.dU.o(), 2, 3, 2, $$4);
         this.a($$0, dae.dU.o(), 3, 3, 7, $$4);
         this.a($$0, dae.a.o(), 1, 3, 4, $$4);
         this.a($$0, dae.a.o(), 5, 3, 4, $$4);
         this.a($$0, dae.a.o(), 5, 3, 5, $$4);
         this.a($$0, dae.gp.o(), 1, 3, 5, $$4);
         this.a($$0, dae.cA.o(), 3, 2, 6, $$4);
         this.a($$0, dae.ft.o(), 4, 2, 6, $$4);
         this.a($$0, dae.dU.o(), 1, 2, 1, $$4);
         this.a($$0, dae.dU.o(), 5, 2, 1, $$4);
         dnb $$7 = dae.fK.o().a(dhv.b, ih.c);
         dnb $$8 = dae.fK.o().a(dhv.b, ih.f);
         dnb $$9 = dae.fK.o().a(dhv.b, ih.e);
         dnb $$10 = dae.fK.o().a(dhv.b, ih.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dhv.d, dok.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dhv.d, dok.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dhv.d, dok.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dhv.d, dok.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dae.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            ib $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cgq $$14 = bpd.bo.a((cxb)$$0.E());
               if ($$14 != null) {
                  $$14.fS();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bpt.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(cxq $$0, ecw $$1) {
      if (!this.i) {
         ib $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cbh $$3 = bpd.q.a((cxb)$$0.E());
            if ($$3 != null) {
               $$3.fS();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bpt.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
