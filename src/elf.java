public class elf extends eik {
   private boolean h;
   private boolean i;

   public elf(azh $$0, int $$1, int $$2) {
      super(ejd.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public elf(us $$0) {
      super(ejd.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(ejc $$0, us $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dcv $$0, dct $$1, dub $$2, azh $$3, eie $$4, dbh $$5, iz $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dfd.o.o(), dfd.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dfd.o.o(), dfd.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dfd.o.o(), dfd.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dfd.o.o(), dfd.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dfd.o.o(), dfd.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dfd.o.o(), dfd.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dfd.o.o(), dfd.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dfd.U.o(), dfd.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dfd.U.o(), dfd.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dfd.U.o(), dfd.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dfd.U.o(), dfd.U.o(), false);
         this.a($$0, dfd.dU.o(), 2, 3, 2, $$4);
         this.a($$0, dfd.dU.o(), 3, 3, 7, $$4);
         this.a($$0, dfd.a.o(), 1, 3, 4, $$4);
         this.a($$0, dfd.a.o(), 5, 3, 4, $$4);
         this.a($$0, dfd.a.o(), 5, 3, 5, $$4);
         this.a($$0, dfd.gp.o(), 1, 3, 5, $$4);
         this.a($$0, dfd.cA.o(), 3, 2, 6, $$4);
         this.a($$0, dfd.ft.o(), 4, 2, 6, $$4);
         this.a($$0, dfd.dU.o(), 1, 2, 1, $$4);
         this.a($$0, dfd.dU.o(), 5, 2, 1, $$4);
         dse $$7 = dfd.fK.o().a(dmv.b, je.c);
         dse $$8 = dfd.fK.o().a(dmv.b, je.f);
         dse $$9 = dfd.fK.o().a(dmv.b, je.e);
         dse $$10 = dfd.fK.o().a(dmv.b, je.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dmv.d, dtn.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dmv.d, dtn.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dmv.d, dtn.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dmv.d, dtn.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dfd.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            iz $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               ckv $$14 = btc.bo.a((dca)$$0.E());
               if ($$14 != null) {
                  $$14.fU();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), btv.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dcp $$0, eie $$1) {
      if (!this.i) {
         iz $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cfk $$3 = btc.p.a((dca)$$0.E());
            if ($$3 != null) {
               $$3.fU();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), btv.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
