public class epc extends emg {
   private boolean h;
   private boolean i;

   public epc(azu $$0, int $$1, int $$2) {
      super(emz.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public epc(ul $$0) {
      super(emz.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(emy $$0, ul $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dis.o.m(), dis.o.m(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dis.o.m(), dis.o.m(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dis.o.m(), dis.o.m(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dis.o.m(), dis.o.m(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dis.o.m(), dis.o.m(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dis.o.m(), dis.o.m(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dis.o.m(), dis.o.m(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dis.U.m(), dis.U.m(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dis.U.m(), dis.U.m(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dis.U.m(), dis.U.m(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dis.U.m(), dis.U.m(), false);
         this.a($$0, dis.dU.m(), 2, 3, 2, $$4);
         this.a($$0, dis.dU.m(), 3, 3, 7, $$4);
         this.a($$0, dis.a.m(), 1, 3, 4, $$4);
         this.a($$0, dis.a.m(), 5, 3, 4, $$4);
         this.a($$0, dis.a.m(), 5, 3, 5, $$4);
         this.a($$0, dis.gp.m(), 1, 3, 5, $$4);
         this.a($$0, dis.cA.m(), 3, 2, 6, $$4);
         this.a($$0, dis.ft.m(), 4, 2, 6, $$4);
         this.a($$0, dis.dU.m(), 1, 2, 1, $$4);
         this.a($$0, dis.dU.m(), 5, 2, 1, $$4);
         dvv $$7 = dis.fK.m().b(dqk.b, jm.c);
         dvv $$8 = dis.fK.m().b(dqk.b, jm.f);
         dvv $$9 = dis.fK.m().b(dqk.b, jm.e);
         dvv $$10 = dis.fK.m().b(dqk.b, jm.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.b(dqk.d, dxd.e), 0, 4, 1, $$4);
         this.a($$0, $$7.b(dqk.d, dxd.d), 6, 4, 1, $$4);
         this.a($$0, $$10.b(dqk.d, dxd.d), 0, 4, 8, $$4);
         this.a($$0, $$10.b(dqk.d, dxd.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dis.U.m(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            jh $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cmo $$14 = bus.bE.a($$0.a(), bur.d);
               if ($$14 != null) {
                  $$14.ai();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bur.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dgd $$0, ema $$1) {
      if (!this.i) {
         jh $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            chb $$3 = bus.u.a($$0.a(), bur.d);
            if ($$3 != null) {
               $$3.ai();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bur.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
