public class ebs extends dyx {
   private boolean h;
   private boolean i;

   public ebs(aup $$0, int $$1, int $$2) {
      super(dzq.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public ebs(sl $$0) {
      super(dzq.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(dzp $$0, sl $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(cud $$0, cub $$1, dkx $$2, aup $$3, dyr $$4, csp $$5, hx $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, cwl.o.o(), cwl.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, cwl.o.o(), cwl.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, cwl.o.o(), cwl.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, cwl.o.o(), cwl.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, cwl.o.o(), cwl.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, cwl.o.o(), cwl.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, cwl.o.o(), cwl.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, cwl.U.o(), cwl.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, cwl.U.o(), cwl.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, cwl.U.o(), cwl.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, cwl.U.o(), cwl.U.o(), false);
         this.a($$0, cwl.dU.o(), 2, 3, 2, $$4);
         this.a($$0, cwl.dU.o(), 3, 3, 7, $$4);
         this.a($$0, cwl.a.o(), 1, 3, 4, $$4);
         this.a($$0, cwl.a.o(), 5, 3, 4, $$4);
         this.a($$0, cwl.a.o(), 5, 3, 5, $$4);
         this.a($$0, cwl.gp.o(), 1, 3, 5, $$4);
         this.a($$0, cwl.cA.o(), 3, 2, 6, $$4);
         this.a($$0, cwl.ft.o(), 4, 2, 6, $$4);
         this.a($$0, cwl.dU.o(), 1, 2, 1, $$4);
         this.a($$0, cwl.dU.o(), 5, 2, 1, $$4);
         dja $$7 = cwl.fK.o().a(dec.b, ic.c);
         dja $$8 = cwl.fK.o().a(dec.b, ic.f);
         dja $$9 = cwl.fK.o().a(dec.b, ic.e);
         dja $$10 = cwl.fK.o().a(dec.b, ic.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dec.d, dkj.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dec.d, dkj.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dec.d, dkj.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dec.d, dkj.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, cwl.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            hx $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               ccz $$14 = blt.bl.a((cti)$$0.E());
               if ($$14 != null) {
                  $$14.fJ();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bmj.d, null, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(ctx $$0, dyr $$1) {
      if (!this.i) {
         hx $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            bxv $$3 = blt.n.a((cti)$$0.E());
            if ($$3 != null) {
               $$3.fJ();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bmj.d, null, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
