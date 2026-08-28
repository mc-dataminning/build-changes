public class eov extends elz {
   private boolean h;
   private boolean i;

   public eov(azv $$0, int $$1, int $$2) {
      super(ems.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public eov(un $$0) {
      super(ems.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(emr $$0, un $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dgd $$0, dgb $$1, dxk $$2, azv $$3, elt $$4, del $$5, jh $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dil.o.m(), dil.o.m(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dil.o.m(), dil.o.m(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dil.o.m(), dil.o.m(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dil.o.m(), dil.o.m(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dil.o.m(), dil.o.m(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dil.o.m(), dil.o.m(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dil.o.m(), dil.o.m(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dil.U.m(), dil.U.m(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dil.U.m(), dil.U.m(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dil.U.m(), dil.U.m(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dil.U.m(), dil.U.m(), false);
         this.a($$0, dil.dU.m(), 2, 3, 2, $$4);
         this.a($$0, dil.dU.m(), 3, 3, 7, $$4);
         this.a($$0, dil.a.m(), 1, 3, 4, $$4);
         this.a($$0, dil.a.m(), 5, 3, 4, $$4);
         this.a($$0, dil.a.m(), 5, 3, 5, $$4);
         this.a($$0, dil.gp.m(), 1, 3, 5, $$4);
         this.a($$0, dil.cA.m(), 3, 2, 6, $$4);
         this.a($$0, dil.ft.m(), 4, 2, 6, $$4);
         this.a($$0, dil.dU.m(), 1, 2, 1, $$4);
         this.a($$0, dil.dU.m(), 5, 2, 1, $$4);
         dvo $$7 = dil.fK.m().b(dqd.b, jm.c);
         dvo $$8 = dil.fK.m().b(dqd.b, jm.f);
         dvo $$9 = dil.fK.m().b(dqd.b, jm.e);
         dvo $$10 = dil.fK.m().b(dqd.b, jm.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.b(dqd.d, dww.e), 0, 4, 1, $$4);
         this.a($$0, $$7.b(dqd.d, dww.d), 6, 4, 1, $$4);
         this.a($$0, $$10.b(dqd.d, dww.d), 0, 4, 8, $$4);
         this.a($$0, $$10.b(dqd.d, dww.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dil.U.m(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            jh $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cml $$14 = bup.bo.a($$0.E(), buo.d);
               if ($$14 != null) {
                  $$14.gb();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), buo.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dfw $$0, elt $$1) {
      if (!this.i) {
         jh $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cgy $$3 = bup.p.a($$0.E(), buo.d);
            if ($$3 != null) {
               $$3.gb();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), buo.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
