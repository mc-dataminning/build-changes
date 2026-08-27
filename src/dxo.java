public class dxo extends dva {
   private boolean h;
   private boolean i;

   public dxo(ash $$0, int $$1, int $$2) {
      super(dvt.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public dxo(qw $$0) {
      super(dvt.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(dvs $$0, qw $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, cte.o.o(), cte.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, cte.o.o(), cte.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, cte.o.o(), cte.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, cte.o.o(), cte.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, cte.o.o(), cte.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, cte.o.o(), cte.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, cte.o.o(), cte.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, cte.U.o(), cte.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, cte.U.o(), cte.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, cte.U.o(), cte.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, cte.U.o(), cte.U.o(), false);
         this.a($$0, cte.dU.o(), 2, 3, 2, $$4);
         this.a($$0, cte.dU.o(), 3, 3, 7, $$4);
         this.a($$0, cte.a.o(), 1, 3, 4, $$4);
         this.a($$0, cte.a.o(), 5, 3, 4, $$4);
         this.a($$0, cte.a.o(), 5, 3, 5, $$4);
         this.a($$0, cte.gp.o(), 1, 3, 5, $$4);
         this.a($$0, cte.cA.o(), 3, 2, 6, $$4);
         this.a($$0, cte.ft.o(), 4, 2, 6, $$4);
         this.a($$0, cte.dU.o(), 1, 2, 1, $$4);
         this.a($$0, cte.dU.o(), 5, 2, 1, $$4);
         dfd $$7 = cte.fK.o().a(dau.b, ha.c);
         dfd $$8 = cte.fK.o().a(dau.b, ha.f);
         dfd $$9 = cte.fK.o().a(dau.b, ha.e);
         dfd $$10 = cte.fK.o().a(dau.b, ha.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dau.d, dgm.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dau.d, dgm.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dau.d, dgm.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dau.d, dgm.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, cte.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            gw $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cae $$14 = bja.bj.a((cqb)$$0.C());
               if ($$14 != null) {
                  $$14.fJ();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bjq.d, null, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(cqq $$0, duu $$1) {
      if (!this.i) {
         gw $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            bva $$3 = bja.m.a((cqb)$$0.C());
            if ($$3 != null) {
               $$3.fJ();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bjq.d, null, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
