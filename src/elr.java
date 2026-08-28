public class elr extends eiv {
   private boolean h;
   private boolean i;

   public elr(ayo $$0, int $$1, int $$2) {
      super(ejo.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public elr(tx $$0) {
      super(ejo.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(ejn $$0, tx $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(ddc $$0, dda $$1, dui $$2, ayo $$3, eip $$4, dbn $$5, ja $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dfk.o.o(), dfk.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dfk.o.o(), dfk.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dfk.o.o(), dfk.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dfk.o.o(), dfk.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dfk.o.o(), dfk.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dfk.o.o(), dfk.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dfk.o.o(), dfk.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dfk.U.o(), dfk.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dfk.U.o(), dfk.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dfk.U.o(), dfk.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dfk.U.o(), dfk.U.o(), false);
         this.a($$0, dfk.dU.o(), 2, 3, 2, $$4);
         this.a($$0, dfk.dU.o(), 3, 3, 7, $$4);
         this.a($$0, dfk.a.o(), 1, 3, 4, $$4);
         this.a($$0, dfk.a.o(), 5, 3, 4, $$4);
         this.a($$0, dfk.a.o(), 5, 3, 5, $$4);
         this.a($$0, dfk.gp.o(), 1, 3, 5, $$4);
         this.a($$0, dfk.cA.o(), 3, 2, 6, $$4);
         this.a($$0, dfk.ft.o(), 4, 2, 6, $$4);
         this.a($$0, dfk.dU.o(), 1, 2, 1, $$4);
         this.a($$0, dfk.dU.o(), 5, 2, 1, $$4);
         dsl $$7 = dfk.fK.o().a(dnc.b, jf.c);
         dsl $$8 = dfk.fK.o().a(dnc.b, jf.f);
         dsl $$9 = dfk.fK.o().a(dnc.b, jf.e);
         dsl $$10 = dfk.fK.o().a(dnc.b, jf.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dnc.d, dtu.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dnc.d, dtu.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dnc.d, dtu.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dnc.d, dtu.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dfk.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            ja $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               ckh $$14 = bsn.bo.a((dcg)$$0.E());
               if ($$14 != null) {
                  $$14.fQ();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), btg.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dcv $$0, eip $$1) {
      if (!this.i) {
         ja $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cev $$3 = bsn.p.a((dcg)$$0.E());
            if ($$3 != null) {
               $$3.fQ();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), btg.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
