public class dxl extends dux {
   private boolean h;
   private boolean i;

   public dxl(aru $$0, int $$1, int $$2) {
      super(dvq.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public dxl(qr $$0) {
      super(dvq.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(dvp $$0, qr $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(cqg $$0, cqe $$1, dgx $$2, aru $$3, dur $$4, cot $$5, gu $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, csn.o.n(), csn.o.n(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, csn.o.n(), csn.o.n(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, csn.o.n(), csn.o.n(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, csn.o.n(), csn.o.n(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, csn.o.n(), csn.o.n(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, csn.o.n(), csn.o.n(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, csn.o.n(), csn.o.n(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, csn.U.n(), csn.U.n(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, csn.U.n(), csn.U.n(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, csn.U.n(), csn.U.n(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, csn.U.n(), csn.U.n(), false);
         this.a($$0, csn.dU.n(), 2, 3, 2, $$4);
         this.a($$0, csn.dU.n(), 3, 3, 7, $$4);
         this.a($$0, csn.a.n(), 1, 3, 4, $$4);
         this.a($$0, csn.a.n(), 5, 3, 4, $$4);
         this.a($$0, csn.a.n(), 5, 3, 5, $$4);
         this.a($$0, csn.gp.n(), 1, 3, 5, $$4);
         this.a($$0, csn.cA.n(), 3, 2, 6, $$4);
         this.a($$0, csn.ft.n(), 4, 2, 6, $$4);
         this.a($$0, csn.dU.n(), 1, 2, 1, $$4);
         this.a($$0, csn.dU.n(), 5, 2, 1, $$4);
         dfa $$7 = csn.fK.n().a(dag.a, ha.c);
         dfa $$8 = csn.fK.n().a(dag.a, ha.f);
         dfa $$9 = csn.fK.n().a(dag.a, ha.e);
         dfa $$10 = csn.fK.n().a(dag.a, ha.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dag.c, dgj.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dag.c, dgj.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dag.c, dgj.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dag.c, dgj.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, csn.U.n(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            gu $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               bzr $$14 = bim.bj.a((cpm)$$0.C());
               if ($$14 != null) {
                  $$14.fF();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bjc.d, null, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(cqb $$0, dur $$1) {
      if (!this.i) {
         gu $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            bun $$3 = bim.m.a((cpm)$$0.C());
            if ($$3 != null) {
               $$3.fF();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bjc.d, null, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
