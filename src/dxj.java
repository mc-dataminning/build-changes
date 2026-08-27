public class dxj extends duv {
   private boolean h;
   private boolean i;

   public dxj(art $$0, int $$1, int $$2) {
      super(dvo.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public dxj(qs $$0) {
      super(dvo.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(dvn $$0, qs $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(cqe $$0, cqc $$1, dgv $$2, art $$3, dup $$4, cor $$5, gv $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, csl.o.n(), csl.o.n(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, csl.o.n(), csl.o.n(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, csl.o.n(), csl.o.n(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, csl.o.n(), csl.o.n(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, csl.o.n(), csl.o.n(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, csl.o.n(), csl.o.n(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, csl.o.n(), csl.o.n(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, csl.U.n(), csl.U.n(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, csl.U.n(), csl.U.n(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, csl.U.n(), csl.U.n(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, csl.U.n(), csl.U.n(), false);
         this.a($$0, csl.dU.n(), 2, 3, 2, $$4);
         this.a($$0, csl.dU.n(), 3, 3, 7, $$4);
         this.a($$0, csl.a.n(), 1, 3, 4, $$4);
         this.a($$0, csl.a.n(), 5, 3, 4, $$4);
         this.a($$0, csl.a.n(), 5, 3, 5, $$4);
         this.a($$0, csl.gp.n(), 1, 3, 5, $$4);
         this.a($$0, csl.cA.n(), 3, 2, 6, $$4);
         this.a($$0, csl.ft.n(), 4, 2, 6, $$4);
         this.a($$0, csl.dU.n(), 1, 2, 1, $$4);
         this.a($$0, csl.dU.n(), 5, 2, 1, $$4);
         dey $$7 = csl.fK.n().a(dae.a, hb.c);
         dey $$8 = csl.fK.n().a(dae.a, hb.f);
         dey $$9 = csl.fK.n().a(dae.a, hb.e);
         dey $$10 = csl.fK.n().a(dae.a, hb.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dae.c, dgh.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dae.c, dgh.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dae.c, dgh.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dae.c, dgh.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, csl.U.n(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            gv $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               bzp $$14 = bik.bj.a((cpk)$$0.C());
               if ($$14 != null) {
                  $$14.fF();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bja.d, null, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(cpz $$0, dup $$1) {
      if (!this.i) {
         gv $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            bul $$3 = bik.m.a((cpk)$$0.C());
            if ($$3 != null) {
               $$3.fF();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bja.d, null, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
