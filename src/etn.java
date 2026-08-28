public class etn extends eqr {
   private boolean h;
   private boolean i;

   public etn(azv $$0, int $$1, int $$2) {
      super(erk.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public etn(tz $$0) {
      super(erk.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(erj $$0, tz $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, iu $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dmc.o.m(), dmc.o.m(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dmc.o.m(), dmc.o.m(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dmc.o.m(), dmc.o.m(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dmc.o.m(), dmc.o.m(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dmc.o.m(), dmc.o.m(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dmc.o.m(), dmc.o.m(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dmc.o.m(), dmc.o.m(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dmc.X.m(), dmc.X.m(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dmc.X.m(), dmc.X.m(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dmc.X.m(), dmc.X.m(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dmc.X.m(), dmc.X.m(), false);
         this.a($$0, dmc.ei.m(), 2, 3, 2, $$4);
         this.a($$0, dmc.ei.m(), 3, 3, 7, $$4);
         this.a($$0, dmc.a.m(), 1, 3, 4, $$4);
         this.a($$0, dmc.a.m(), 5, 3, 4, $$4);
         this.a($$0, dmc.a.m(), 5, 3, 5, $$4);
         this.a($$0, dmc.gM.m(), 1, 3, 5, $$4);
         this.a($$0, dmc.cJ.m(), 3, 2, 6, $$4);
         this.a($$0, dmc.fP.m(), 4, 2, 6, $$4);
         this.a($$0, dmc.ei.m(), 1, 2, 1, $$4);
         this.a($$0, dmc.ei.m(), 5, 2, 1, $$4);
         dzz $$7 = dmc.gg.m().b(duc.b, ja.c);
         dzz $$8 = dmc.gg.m().b(duc.b, ja.f);
         dzz $$9 = dmc.gg.m().b(duc.b, ja.e);
         dzz $$10 = dmc.gg.m().b(duc.b, ja.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.b(duc.d, ebi.e), 0, 4, 1, $$4);
         this.a($$0, $$7.b(duc.d, ebi.d), 6, 4, 1, $$4);
         this.a($$0, $$10.b(duc.d, ebi.d), 0, 4, 8, $$4);
         this.a($$0, $$10.b(duc.d, ebi.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dmc.X.m(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            iu $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               coq $$14 = bwm.bI.a($$0.a(), bwl.d);
               if ($$14 != null) {
                  $$14.fY();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bwl.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(djm $$0, eql $$1) {
      if (!this.i) {
         iu $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            civ $$3 = bwm.u.a($$0.a(), bwl.d);
            if ($$3 != null) {
               $$3.fY();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bwl.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
