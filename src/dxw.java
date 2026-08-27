public class dxw extends dvi {
   private boolean h;
   private boolean i;

   public dxw(ase $$0, int $$1, int $$2) {
      super(dwb.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public dxw(qy $$0) {
      super(dwb.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(dwa $$0, qy $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(cqr $$0, cqp $$1, dhi $$2, ase $$3, dvc $$4, cpe $$5, gw $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, csy.o.n(), csy.o.n(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, csy.o.n(), csy.o.n(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, csy.o.n(), csy.o.n(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, csy.o.n(), csy.o.n(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, csy.o.n(), csy.o.n(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, csy.o.n(), csy.o.n(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, csy.o.n(), csy.o.n(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, csy.U.n(), csy.U.n(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, csy.U.n(), csy.U.n(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, csy.U.n(), csy.U.n(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, csy.U.n(), csy.U.n(), false);
         this.a($$0, csy.dU.n(), 2, 3, 2, $$4);
         this.a($$0, csy.dU.n(), 3, 3, 7, $$4);
         this.a($$0, csy.a.n(), 1, 3, 4, $$4);
         this.a($$0, csy.a.n(), 5, 3, 4, $$4);
         this.a($$0, csy.a.n(), 5, 3, 5, $$4);
         this.a($$0, csy.gp.n(), 1, 3, 5, $$4);
         this.a($$0, csy.cA.n(), 3, 2, 6, $$4);
         this.a($$0, csy.ft.n(), 4, 2, 6, $$4);
         this.a($$0, csy.dU.n(), 1, 2, 1, $$4);
         this.a($$0, csy.dU.n(), 5, 2, 1, $$4);
         dfl $$7 = csy.fK.n().a(dar.a, hc.c);
         dfl $$8 = csy.fK.n().a(dar.a, hc.f);
         dfl $$9 = csy.fK.n().a(dar.a, hc.e);
         dfl $$10 = csy.fK.n().a(dar.a, hc.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dar.c, dgu.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dar.c, dgu.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dar.c, dgu.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dar.c, dgu.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, csy.U.n(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            gw $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               caa $$14 = biw.bj.a((cpx)$$0.C());
               if ($$14 != null) {
                  $$14.fI();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bjm.d, null, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(cqm $$0, dvc $$1) {
      if (!this.i) {
         gw $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            buw $$3 = biw.m.a((cpx)$$0.C());
            if ($$3 != null) {
               $$3.fI();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bjm.d, null, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
