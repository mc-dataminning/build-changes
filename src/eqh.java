public class eqh extends enl {
   private boolean h;
   private boolean i;

   public eqh(azh $$0, int $$1, int $$2) {
      super(eoe.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public eqh(tq $$0) {
      super(eoe.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(eod $$0, tq $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dhh $$0, dhf $$1, dyu $$2, azh $$3, enf $$4, dfp $$5, ji $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, djp.o.m(), djp.o.m(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, djp.o.m(), djp.o.m(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, djp.o.m(), djp.o.m(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, djp.o.m(), djp.o.m(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, djp.o.m(), djp.o.m(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, djp.o.m(), djp.o.m(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, djp.o.m(), djp.o.m(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, djp.X.m(), djp.X.m(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, djp.X.m(), djp.X.m(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, djp.X.m(), djp.X.m(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, djp.X.m(), djp.X.m(), false);
         this.a($$0, djp.eh.m(), 2, 3, 2, $$4);
         this.a($$0, djp.eh.m(), 3, 3, 7, $$4);
         this.a($$0, djp.a.m(), 1, 3, 4, $$4);
         this.a($$0, djp.a.m(), 5, 3, 4, $$4);
         this.a($$0, djp.a.m(), 5, 3, 5, $$4);
         this.a($$0, djp.gL.m(), 1, 3, 5, $$4);
         this.a($$0, djp.cI.m(), 3, 2, 6, $$4);
         this.a($$0, djp.fO.m(), 4, 2, 6, $$4);
         this.a($$0, djp.eh.m(), 1, 2, 1, $$4);
         this.a($$0, djp.eh.m(), 5, 2, 1, $$4);
         dwy $$7 = djp.gf.m().b(drm.b, jn.c);
         dwy $$8 = djp.gf.m().b(drm.b, jn.f);
         dwy $$9 = djp.gf.m().b(drm.b, jn.e);
         dwy $$10 = djp.gf.m().b(drm.b, jn.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.b(drm.d, dyg.e), 0, 4, 1, $$4);
         this.a($$0, $$7.b(drm.d, dyg.d), 6, 4, 1, $$4);
         this.a($$0, $$10.b(drm.d, dyg.d), 0, 4, 8, $$4);
         this.a($$0, $$10.b(drm.d, dyg.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, djp.X.m(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            ji $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cmp $$14 = but.bH.a($$0.a(), bus.d);
               if ($$14 != null) {
                  $$14.fY();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bus.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dha $$0, enf $$1) {
      if (!this.i) {
         ji $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            chc $$3 = but.u.a($$0.a(), bus.d);
            if ($$3 != null) {
               $$3.fY();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bus.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
