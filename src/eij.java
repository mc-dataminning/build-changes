public class eij extends efo {
   private boolean h;
   private boolean i;

   public eij(axt $$0, int $$1, int $$2) {
      super(egh.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public eij(to $$0) {
      super(egh.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(egg $$0, to $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dcj.o.n(), dcj.o.n(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dcj.o.n(), dcj.o.n(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dcj.o.n(), dcj.o.n(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dcj.o.n(), dcj.o.n(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dcj.o.n(), dcj.o.n(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dcj.o.n(), dcj.o.n(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dcj.o.n(), dcj.o.n(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dcj.U.n(), dcj.U.n(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dcj.U.n(), dcj.U.n(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dcj.U.n(), dcj.U.n(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dcj.U.n(), dcj.U.n(), false);
         this.a($$0, dcj.dU.n(), 2, 3, 2, $$4);
         this.a($$0, dcj.dU.n(), 3, 3, 7, $$4);
         this.a($$0, dcj.a.n(), 1, 3, 4, $$4);
         this.a($$0, dcj.a.n(), 5, 3, 4, $$4);
         this.a($$0, dcj.a.n(), 5, 3, 5, $$4);
         this.a($$0, dcj.gp.n(), 1, 3, 5, $$4);
         this.a($$0, dcj.cA.n(), 3, 2, 6, $$4);
         this.a($$0, dcj.ft.n(), 4, 2, 6, $$4);
         this.a($$0, dcj.dU.n(), 1, 2, 1, $$4);
         this.a($$0, dcj.dU.n(), 5, 2, 1, $$4);
         dpi $$7 = dcj.fK.n().a(dka.b, ij.c);
         dpi $$8 = dcj.fK.n().a(dka.b, ij.f);
         dpi $$9 = dcj.fK.n().a(dka.b, ij.e);
         dpi $$10 = dcj.fK.n().a(dka.b, ij.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dka.d, dqr.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dka.d, dqr.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dka.d, dqr.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dka.d, dqr.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dcj.U.n(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            id $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               chw $$14 = bqg.bn.a((czg)$$0.E());
               if ($$14 != null) {
                  $$14.fS();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bqx.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(czv $$0, efi $$1) {
      if (!this.i) {
         id $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            ccl $$3 = bqg.p.a((czg)$$0.E());
            if ($$3 != null) {
               $$3.fS();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bqx.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
