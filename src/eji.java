public class eji extends egn {
   private boolean h;
   private boolean i;

   public eji(ayg $$0, int $$1, int $$2) {
      super(ehg.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public eji(ua $$0) {
      super(ehg.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(ehf $$0, ua $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, in $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, ddg.o.n(), ddg.o.n(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, ddg.o.n(), ddg.o.n(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, ddg.o.n(), ddg.o.n(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, ddg.o.n(), ddg.o.n(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, ddg.o.n(), ddg.o.n(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, ddg.o.n(), ddg.o.n(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, ddg.o.n(), ddg.o.n(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, ddg.U.n(), ddg.U.n(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, ddg.U.n(), ddg.U.n(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, ddg.U.n(), ddg.U.n(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, ddg.U.n(), ddg.U.n(), false);
         this.a($$0, ddg.dU.n(), 2, 3, 2, $$4);
         this.a($$0, ddg.dU.n(), 3, 3, 7, $$4);
         this.a($$0, ddg.a.n(), 1, 3, 4, $$4);
         this.a($$0, ddg.a.n(), 5, 3, 4, $$4);
         this.a($$0, ddg.a.n(), 5, 3, 5, $$4);
         this.a($$0, ddg.gp.n(), 1, 3, 5, $$4);
         this.a($$0, ddg.cA.n(), 3, 2, 6, $$4);
         this.a($$0, ddg.ft.n(), 4, 2, 6, $$4);
         this.a($$0, ddg.dU.n(), 1, 2, 1, $$4);
         this.a($$0, ddg.dU.n(), 5, 2, 1, $$4);
         dqh $$7 = ddg.fK.n().a(dky.b, is.c);
         dqh $$8 = ddg.fK.n().a(dky.b, is.f);
         dqh $$9 = ddg.fK.n().a(dky.b, is.e);
         dqh $$10 = ddg.fK.n().a(dky.b, is.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dky.d, drq.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dky.d, drq.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dky.d, drq.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dky.d, drq.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, ddg.U.n(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            in $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cjd $$14 = brn.bn.a((dad)$$0.E());
               if ($$14 != null) {
                  $$14.fT();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bse.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(das $$0, egh $$1) {
      if (!this.i) {
         in $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cds $$3 = brn.p.a((dad)$$0.E());
            if ($$3 != null) {
               $$3.fT();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bse.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
