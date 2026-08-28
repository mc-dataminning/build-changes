public class esa extends epe {
   private boolean h;
   private boolean i;

   public esa(azs $$0, int $$1, int $$2) {
      super(epx.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public esa(tw $$0) {
      super(epx.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(epw $$0, tw $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dkw.o.m(), dkw.o.m(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dkw.o.m(), dkw.o.m(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dkw.o.m(), dkw.o.m(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dkw.o.m(), dkw.o.m(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dkw.o.m(), dkw.o.m(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dkw.o.m(), dkw.o.m(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dkw.o.m(), dkw.o.m(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dkw.X.m(), dkw.X.m(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dkw.X.m(), dkw.X.m(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dkw.X.m(), dkw.X.m(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dkw.X.m(), dkw.X.m(), false);
         this.a($$0, dkw.eh.m(), 2, 3, 2, $$4);
         this.a($$0, dkw.eh.m(), 3, 3, 7, $$4);
         this.a($$0, dkw.a.m(), 1, 3, 4, $$4);
         this.a($$0, dkw.a.m(), 5, 3, 4, $$4);
         this.a($$0, dkw.a.m(), 5, 3, 5, $$4);
         this.a($$0, dkw.gL.m(), 1, 3, 5, $$4);
         this.a($$0, dkw.cI.m(), 3, 2, 6, $$4);
         this.a($$0, dkw.fO.m(), 4, 2, 6, $$4);
         this.a($$0, dkw.eh.m(), 1, 2, 1, $$4);
         this.a($$0, dkw.eh.m(), 5, 2, 1, $$4);
         dym $$7 = dkw.gf.m().b(dsu.b, jo.c);
         dym $$8 = dkw.gf.m().b(dsu.b, jo.f);
         dym $$9 = dkw.gf.m().b(dsu.b, jo.e);
         dym $$10 = dkw.gf.m().b(dsu.b, jo.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.b(dsu.d, dzv.e), 0, 4, 1, $$4);
         this.a($$0, $$7.b(dsu.d, dzv.d), 6, 4, 1, $$4);
         this.a($$0, $$10.b(dsu.d, dzv.d), 0, 4, 8, $$4);
         this.a($$0, $$10.b(dsu.d, dzv.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dkw.X.m(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            jj $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cnz $$14 = bwb.bH.a($$0.a(), bwa.d);
               if ($$14 != null) {
                  $$14.fY();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bwa.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dig $$0, eoy $$1) {
      if (!this.i) {
         jj $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cij $$3 = bwb.u.a($$0.a(), bwa.d);
            if ($$3 != null) {
               $$3.fY();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bwa.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
