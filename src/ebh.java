public class ebh extends dym {
   private boolean h;
   private boolean i;

   public ebh(auf $$0, int $$1, int $$2) {
      super(dzf.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public ebh(sj $$0) {
      super(dzf.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(dze $$0, sj $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, hv $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, cwb.o.o(), cwb.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, cwb.o.o(), cwb.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, cwb.o.o(), cwb.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, cwb.o.o(), cwb.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, cwb.o.o(), cwb.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, cwb.o.o(), cwb.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, cwb.o.o(), cwb.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, cwb.U.o(), cwb.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, cwb.U.o(), cwb.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, cwb.U.o(), cwb.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, cwb.U.o(), cwb.U.o(), false);
         this.a($$0, cwb.dU.o(), 2, 3, 2, $$4);
         this.a($$0, cwb.dU.o(), 3, 3, 7, $$4);
         this.a($$0, cwb.a.o(), 1, 3, 4, $$4);
         this.a($$0, cwb.a.o(), 5, 3, 4, $$4);
         this.a($$0, cwb.a.o(), 5, 3, 5, $$4);
         this.a($$0, cwb.gp.o(), 1, 3, 5, $$4);
         this.a($$0, cwb.cA.o(), 3, 2, 6, $$4);
         this.a($$0, cwb.ft.o(), 4, 2, 6, $$4);
         this.a($$0, cwb.dU.o(), 1, 2, 1, $$4);
         this.a($$0, cwb.dU.o(), 5, 2, 1, $$4);
         dip $$7 = cwb.fK.o().a(dds.b, ia.c);
         dip $$8 = cwb.fK.o().a(dds.b, ia.f);
         dip $$9 = cwb.fK.o().a(dds.b, ia.e);
         dip $$10 = cwb.fK.o().a(dds.b, ia.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dds.d, djy.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dds.d, djy.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dds.d, djy.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dds.d, djy.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, cwb.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            hv $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               ccp $$14 = blj.bl.a((csy)$$0.D());
               if ($$14 != null) {
                  $$14.fJ();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), blz.d, null, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(ctn $$0, dyg $$1) {
      if (!this.i) {
         hv $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            bxl $$3 = blj.n.a((csy)$$0.D());
            if ($$3 != null) {
               $$3.fJ();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), blz.d, null, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
