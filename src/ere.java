public class ere extends eoi {
   private boolean h;
   private boolean i;

   public ere(bam $$0, int $$1, int $$2) {
      super(epb.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public ere(ux $$0) {
      super(epb.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(epa $$0, ux $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, jh $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dko.o.m(), dko.o.m(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dko.o.m(), dko.o.m(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dko.o.m(), dko.o.m(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dko.o.m(), dko.o.m(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dko.o.m(), dko.o.m(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dko.o.m(), dko.o.m(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dko.o.m(), dko.o.m(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dko.X.m(), dko.X.m(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dko.X.m(), dko.X.m(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dko.X.m(), dko.X.m(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dko.X.m(), dko.X.m(), false);
         this.a($$0, dko.eh.m(), 2, 3, 2, $$4);
         this.a($$0, dko.eh.m(), 3, 3, 7, $$4);
         this.a($$0, dko.a.m(), 1, 3, 4, $$4);
         this.a($$0, dko.a.m(), 5, 3, 4, $$4);
         this.a($$0, dko.a.m(), 5, 3, 5, $$4);
         this.a($$0, dko.gE.m(), 1, 3, 5, $$4);
         this.a($$0, dko.cI.m(), 3, 2, 6, $$4);
         this.a($$0, dko.fH.m(), 4, 2, 6, $$4);
         this.a($$0, dko.eh.m(), 1, 2, 1, $$4);
         this.a($$0, dko.eh.m(), 5, 2, 1, $$4);
         dxv $$7 = dko.fY.m().b(dsj.b, jm.c);
         dxv $$8 = dko.fY.m().b(dsj.b, jm.f);
         dxv $$9 = dko.fY.m().b(dsj.b, jm.e);
         dxv $$10 = dko.fY.m().b(dsj.b, jm.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.b(dsj.d, dzd.e), 0, 4, 1, $$4);
         this.a($$0, $$7.b(dsj.d, dzd.d), 6, 4, 1, $$4);
         this.a($$0, $$10.b(dsj.d, dzd.d), 0, 4, 8, $$4);
         this.a($$0, $$10.b(dsj.d, dzd.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dko.X.m(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            jh $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cnn $$14 = bvr.bI.a($$0.a(), bvq.d);
               if ($$14 != null) {
                  $$14.ai();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bvq.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dhz $$0, eoc $$1) {
      if (!this.i) {
         jh $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cia $$3 = bvr.u.a($$0.a(), bvq.d);
            if ($$3 != null) {
               $$3.ai();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bvq.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
