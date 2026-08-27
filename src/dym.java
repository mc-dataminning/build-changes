public class dym extends dvy {
   private boolean h;
   private boolean i;

   public dym(ate $$0, int $$1, int $$2) {
      super(dwr.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public dym(rt $$0) {
      super(dwr.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(dwq $$0, rt $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, cuc.o.o(), cuc.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, cuc.o.o(), cuc.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, cuc.o.o(), cuc.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, cuc.o.o(), cuc.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, cuc.o.o(), cuc.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, cuc.o.o(), cuc.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, cuc.o.o(), cuc.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, cuc.U.o(), cuc.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, cuc.U.o(), cuc.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, cuc.U.o(), cuc.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, cuc.U.o(), cuc.U.o(), false);
         this.a($$0, cuc.dU.o(), 2, 3, 2, $$4);
         this.a($$0, cuc.dU.o(), 3, 3, 7, $$4);
         this.a($$0, cuc.a.o(), 1, 3, 4, $$4);
         this.a($$0, cuc.a.o(), 5, 3, 4, $$4);
         this.a($$0, cuc.a.o(), 5, 3, 5, $$4);
         this.a($$0, cuc.gp.o(), 1, 3, 5, $$4);
         this.a($$0, cuc.cA.o(), 3, 2, 6, $$4);
         this.a($$0, cuc.ft.o(), 4, 2, 6, $$4);
         this.a($$0, cuc.dU.o(), 1, 2, 1, $$4);
         this.a($$0, cuc.dU.o(), 5, 2, 1, $$4);
         dgb $$7 = cuc.fK.o().a(dbs.b, hx.c);
         dgb $$8 = cuc.fK.o().a(dbs.b, hx.f);
         dgb $$9 = cuc.fK.o().a(dbs.b, hx.e);
         dgb $$10 = cuc.fK.o().a(dbs.b, hx.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dbs.d, dhk.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dbs.d, dhk.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dbs.d, dhk.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dbs.d, dhk.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, cuc.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            ht $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cbb $$14 = bjx.bj.a((cqz)$$0.C());
               if ($$14 != null) {
                  $$14.fJ();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bkn.d, null, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(cro $$0, dvs $$1) {
      if (!this.i) {
         ht $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            bvx $$3 = bjx.m.a((cqz)$$0.C());
            if ($$3 != null) {
               $$3.fJ();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bkn.d, null, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
