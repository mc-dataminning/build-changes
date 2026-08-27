public class eke extends ehj {
   private boolean h;
   private boolean i;

   public eke(aym $$0, int $$1, int $$2) {
      super(eic.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public eke(ud $$0) {
      super(eic.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(eib $$0, ud $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, io $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dec.o.n(), dec.o.n(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dec.o.n(), dec.o.n(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dec.o.n(), dec.o.n(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dec.o.n(), dec.o.n(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dec.o.n(), dec.o.n(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dec.o.n(), dec.o.n(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dec.o.n(), dec.o.n(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dec.U.n(), dec.U.n(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dec.U.n(), dec.U.n(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dec.U.n(), dec.U.n(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dec.U.n(), dec.U.n(), false);
         this.a($$0, dec.dU.n(), 2, 3, 2, $$4);
         this.a($$0, dec.dU.n(), 3, 3, 7, $$4);
         this.a($$0, dec.a.n(), 1, 3, 4, $$4);
         this.a($$0, dec.a.n(), 5, 3, 4, $$4);
         this.a($$0, dec.a.n(), 5, 3, 5, $$4);
         this.a($$0, dec.gp.n(), 1, 3, 5, $$4);
         this.a($$0, dec.cA.n(), 3, 2, 6, $$4);
         this.a($$0, dec.ft.n(), 4, 2, 6, $$4);
         this.a($$0, dec.dU.n(), 1, 2, 1, $$4);
         this.a($$0, dec.dU.n(), 5, 2, 1, $$4);
         drd $$7 = dec.fK.n().a(dlu.b, it.c);
         drd $$8 = dec.fK.n().a(dlu.b, it.f);
         drd $$9 = dec.fK.n().a(dlu.b, it.e);
         drd $$10 = dec.fK.n().a(dlu.b, it.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dlu.d, dsm.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dlu.d, dsm.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dlu.d, dsm.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dlu.d, dsm.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dec.U.n(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            io $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cju $$14 = bsc.bo.a((daz)$$0.E());
               if ($$14 != null) {
                  $$14.fT();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bsu.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dbo $$0, ehd $$1) {
      if (!this.i) {
         io $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cej $$3 = bsc.p.a((daz)$$0.E());
            if ($$3 != null) {
               $$3.fT();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bsu.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
