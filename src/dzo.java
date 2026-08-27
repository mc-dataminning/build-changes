public class dzo extends dwt {
   private boolean h;
   private boolean i;

   public dzo(ato $$0, int $$1, int $$2) {
      super(dxm.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public dzo(rz $$0) {
      super(dxm.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(dxl $$0, rz $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, cuv.o.o(), cuv.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, cuv.o.o(), cuv.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, cuv.o.o(), cuv.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, cuv.o.o(), cuv.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, cuv.o.o(), cuv.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, cuv.o.o(), cuv.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, cuv.o.o(), cuv.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, cuv.U.o(), cuv.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, cuv.U.o(), cuv.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, cuv.U.o(), cuv.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, cuv.U.o(), cuv.U.o(), false);
         this.a($$0, cuv.dU.o(), 2, 3, 2, $$4);
         this.a($$0, cuv.dU.o(), 3, 3, 7, $$4);
         this.a($$0, cuv.a.o(), 1, 3, 4, $$4);
         this.a($$0, cuv.a.o(), 5, 3, 4, $$4);
         this.a($$0, cuv.a.o(), 5, 3, 5, $$4);
         this.a($$0, cuv.gp.o(), 1, 3, 5, $$4);
         this.a($$0, cuv.cA.o(), 3, 2, 6, $$4);
         this.a($$0, cuv.ft.o(), 4, 2, 6, $$4);
         this.a($$0, cuv.dU.o(), 1, 2, 1, $$4);
         this.a($$0, cuv.dU.o(), 5, 2, 1, $$4);
         dgw $$7 = cuv.fK.o().a(dcm.b, hx.c);
         dgw $$8 = cuv.fK.o().a(dcm.b, hx.f);
         dgw $$9 = cuv.fK.o().a(dcm.b, hx.e);
         dgw $$10 = cuv.fK.o().a(dcm.b, hx.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dcm.d, dif.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dcm.d, dif.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dcm.d, dif.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dcm.d, dif.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, cuv.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            ht $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cbq $$14 = bkm.bj.a((crs)$$0.C());
               if ($$14 != null) {
                  $$14.fJ();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), blc.d, null, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(csh $$0, dwn $$1) {
      if (!this.i) {
         ht $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            bwm $$3 = bkm.m.a((crs)$$0.C());
            if ($$3 != null) {
               $$3.fJ();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), blc.d, null, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
