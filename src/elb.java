public class elb extends eig {
   private boolean h;
   private boolean i;

   public elb(azf $$0, int $$1, int $$2) {
      super(eiz.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public elb(ur $$0) {
      super(eiz.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(eiy $$0, ur $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dcr $$0, dcp $$1, dtx $$2, azf $$3, eia $$4, dbd $$5, iz $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dez.o.o(), dez.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dez.o.o(), dez.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dez.o.o(), dez.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dez.o.o(), dez.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dez.o.o(), dez.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dez.o.o(), dez.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dez.o.o(), dez.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dez.U.o(), dez.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dez.U.o(), dez.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dez.U.o(), dez.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dez.U.o(), dez.U.o(), false);
         this.a($$0, dez.dU.o(), 2, 3, 2, $$4);
         this.a($$0, dez.dU.o(), 3, 3, 7, $$4);
         this.a($$0, dez.a.o(), 1, 3, 4, $$4);
         this.a($$0, dez.a.o(), 5, 3, 4, $$4);
         this.a($$0, dez.a.o(), 5, 3, 5, $$4);
         this.a($$0, dez.gp.o(), 1, 3, 5, $$4);
         this.a($$0, dez.cA.o(), 3, 2, 6, $$4);
         this.a($$0, dez.ft.o(), 4, 2, 6, $$4);
         this.a($$0, dez.dU.o(), 1, 2, 1, $$4);
         this.a($$0, dez.dU.o(), 5, 2, 1, $$4);
         dsa $$7 = dez.fK.o().a(dmr.b, je.c);
         dsa $$8 = dez.fK.o().a(dmr.b, je.f);
         dsa $$9 = dez.fK.o().a(dmr.b, je.e);
         dsa $$10 = dez.fK.o().a(dmr.b, je.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dmr.d, dtj.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dmr.d, dtj.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dmr.d, dtj.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dmr.d, dtj.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dez.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            iz $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               ckr $$14 = bsy.bo.a((dbw)$$0.E());
               if ($$14 != null) {
                  $$14.fU();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), btr.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dcl $$0, eia $$1) {
      if (!this.i) {
         iz $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cfg $$3 = bsy.p.a((dbw)$$0.E());
            if ($$3 != null) {
               $$3.fU();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), btr.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
