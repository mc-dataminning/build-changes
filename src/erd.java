public class erd extends eoh {
   private boolean h;
   private boolean i;

   public erd(bam $$0, int $$1, int $$2) {
      super(epa.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public erd(ux $$0) {
      super(epa.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(eoz $$0, ux $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dif $$0, did $$1, dzq $$2, bam $$3, eob $$4, dgn $$5, jh $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dkn.o.m(), dkn.o.m(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dkn.o.m(), dkn.o.m(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dkn.o.m(), dkn.o.m(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dkn.o.m(), dkn.o.m(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dkn.o.m(), dkn.o.m(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dkn.o.m(), dkn.o.m(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dkn.o.m(), dkn.o.m(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dkn.X.m(), dkn.X.m(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dkn.X.m(), dkn.X.m(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dkn.X.m(), dkn.X.m(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dkn.X.m(), dkn.X.m(), false);
         this.a($$0, dkn.eh.m(), 2, 3, 2, $$4);
         this.a($$0, dkn.eh.m(), 3, 3, 7, $$4);
         this.a($$0, dkn.a.m(), 1, 3, 4, $$4);
         this.a($$0, dkn.a.m(), 5, 3, 4, $$4);
         this.a($$0, dkn.a.m(), 5, 3, 5, $$4);
         this.a($$0, dkn.gE.m(), 1, 3, 5, $$4);
         this.a($$0, dkn.cI.m(), 3, 2, 6, $$4);
         this.a($$0, dkn.fH.m(), 4, 2, 6, $$4);
         this.a($$0, dkn.eh.m(), 1, 2, 1, $$4);
         this.a($$0, dkn.eh.m(), 5, 2, 1, $$4);
         dxu $$7 = dkn.fY.m().b(dsi.b, jm.c);
         dxu $$8 = dkn.fY.m().b(dsi.b, jm.f);
         dxu $$9 = dkn.fY.m().b(dsi.b, jm.e);
         dxu $$10 = dkn.fY.m().b(dsi.b, jm.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.b(dsi.d, dzc.e), 0, 4, 1, $$4);
         this.a($$0, $$7.b(dsi.d, dzc.d), 6, 4, 1, $$4);
         this.a($$0, $$10.b(dsi.d, dzc.d), 0, 4, 8, $$4);
         this.a($$0, $$10.b(dsi.d, dzc.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dkn.X.m(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            jh $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cnm $$14 = bvq.bI.a($$0.a(), bvp.d);
               if ($$14 != null) {
                  $$14.ai();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bvp.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dhy $$0, eob $$1) {
      if (!this.i) {
         jh $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            chz $$3 = bvq.u.a($$0.a(), bvp.d);
            if ($$3 != null) {
               $$3.ai();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bvp.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
