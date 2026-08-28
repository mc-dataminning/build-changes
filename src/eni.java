public class eni extends ekm {
   private boolean h;
   private boolean i;

   public eni(azk $$0, int $$1, int $$2) {
      super(elf.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public eni(uf $$0) {
      super(elf.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(ele $$0, uf $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, je $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dgx.o.o(), dgx.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dgx.o.o(), dgx.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dgx.o.o(), dgx.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dgx.o.o(), dgx.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dgx.o.o(), dgx.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dgx.o.o(), dgx.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dgx.o.o(), dgx.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dgx.U.o(), dgx.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dgx.U.o(), dgx.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dgx.U.o(), dgx.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dgx.U.o(), dgx.U.o(), false);
         this.a($$0, dgx.dU.o(), 2, 3, 2, $$4);
         this.a($$0, dgx.dU.o(), 3, 3, 7, $$4);
         this.a($$0, dgx.a.o(), 1, 3, 4, $$4);
         this.a($$0, dgx.a.o(), 5, 3, 4, $$4);
         this.a($$0, dgx.a.o(), 5, 3, 5, $$4);
         this.a($$0, dgx.gp.o(), 1, 3, 5, $$4);
         this.a($$0, dgx.cA.o(), 3, 2, 6, $$4);
         this.a($$0, dgx.ft.o(), 4, 2, 6, $$4);
         this.a($$0, dgx.dU.o(), 1, 2, 1, $$4);
         this.a($$0, dgx.dU.o(), 5, 2, 1, $$4);
         dua $$7 = dgx.fK.o().b(doq.b, jj.c);
         dua $$8 = dgx.fK.o().b(doq.b, jj.f);
         dua $$9 = dgx.fK.o().b(doq.b, jj.e);
         dua $$10 = dgx.fK.o().b(doq.b, jj.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.b(doq.d, dvj.e), 0, 4, 1, $$4);
         this.a($$0, $$7.b(doq.d, dvj.d), 6, 4, 1, $$4);
         this.a($$0, $$10.b(doq.d, dvj.d), 0, 4, 8, $$4);
         this.a($$0, $$10.b(doq.d, dvj.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dgx.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            je $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cll $$14 = btq.bo.a($$0.E(), btp.d);
               if ($$14 != null) {
                  $$14.fV();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), btp.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dei $$0, ekg $$1) {
      if (!this.i) {
         je $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cfy $$3 = btq.p.a($$0.E(), btp.d);
            if ($$3 != null) {
               $$3.fV();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), btp.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
