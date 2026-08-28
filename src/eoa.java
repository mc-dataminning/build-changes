public class eoa extends ele {
   private boolean h;
   private boolean i;

   public eoa(azn $$0, int $$1, int $$2) {
      super(elx.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public eoa(ug $$0) {
      super(elx.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(elw $$0, ug $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dho.o.n(), dho.o.n(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dho.o.n(), dho.o.n(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dho.o.n(), dho.o.n(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dho.o.n(), dho.o.n(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dho.o.n(), dho.o.n(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dho.o.n(), dho.o.n(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dho.o.n(), dho.o.n(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dho.U.n(), dho.U.n(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dho.U.n(), dho.U.n(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dho.U.n(), dho.U.n(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dho.U.n(), dho.U.n(), false);
         this.a($$0, dho.dU.n(), 2, 3, 2, $$4);
         this.a($$0, dho.dU.n(), 3, 3, 7, $$4);
         this.a($$0, dho.a.n(), 1, 3, 4, $$4);
         this.a($$0, dho.a.n(), 5, 3, 4, $$4);
         this.a($$0, dho.a.n(), 5, 3, 5, $$4);
         this.a($$0, dho.gp.n(), 1, 3, 5, $$4);
         this.a($$0, dho.cA.n(), 3, 2, 6, $$4);
         this.a($$0, dho.ft.n(), 4, 2, 6, $$4);
         this.a($$0, dho.dU.n(), 1, 2, 1, $$4);
         this.a($$0, dho.dU.n(), 5, 2, 1, $$4);
         dus $$7 = dho.fK.n().b(dph.b, jk.c);
         dus $$8 = dho.fK.n().b(dph.b, jk.f);
         dus $$9 = dho.fK.n().b(dph.b, jk.e);
         dus $$10 = dho.fK.n().b(dph.b, jk.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.b(dph.d, dwb.e), 0, 4, 1, $$4);
         this.a($$0, $$7.b(dph.d, dwb.d), 6, 4, 1, $$4);
         this.a($$0, $$10.b(dph.d, dwb.d), 0, 4, 8, $$4);
         this.a($$0, $$10.b(dph.d, dwb.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dho.U.n(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            jf $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               clt $$14 = bty.bo.a($$0.E(), btx.d);
               if ($$14 != null) {
                  $$14.fW();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), btx.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dez $$0, eky $$1) {
      if (!this.i) {
         jf $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cgg $$3 = bty.p.a($$0.E(), btx.d);
            if ($$3 != null) {
               $$3.fW();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), btx.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
