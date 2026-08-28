public class emg extends ejk {
   private boolean h;
   private boolean i;

   public emg(ayv $$0, int $$1, int $$2) {
      super(ekd.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public emg(ua $$0) {
      super(ekd.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(ekc $$0, ua $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, jd $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dfy.o.o(), dfy.o.o(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dfy.o.o(), dfy.o.o(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dfy.o.o(), dfy.o.o(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dfy.o.o(), dfy.o.o(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dfy.o.o(), dfy.o.o(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dfy.o.o(), dfy.o.o(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dfy.o.o(), dfy.o.o(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dfy.U.o(), dfy.U.o(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dfy.U.o(), dfy.U.o(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dfy.U.o(), dfy.U.o(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dfy.U.o(), dfy.U.o(), false);
         this.a($$0, dfy.dU.o(), 2, 3, 2, $$4);
         this.a($$0, dfy.dU.o(), 3, 3, 7, $$4);
         this.a($$0, dfy.a.o(), 1, 3, 4, $$4);
         this.a($$0, dfy.a.o(), 5, 3, 4, $$4);
         this.a($$0, dfy.a.o(), 5, 3, 5, $$4);
         this.a($$0, dfy.gp.o(), 1, 3, 5, $$4);
         this.a($$0, dfy.cA.o(), 3, 2, 6, $$4);
         this.a($$0, dfy.ft.o(), 4, 2, 6, $$4);
         this.a($$0, dfy.dU.o(), 1, 2, 1, $$4);
         this.a($$0, dfy.dU.o(), 5, 2, 1, $$4);
         dta $$7 = dfy.fK.o().a(dnr.b, ji.c);
         dta $$8 = dfy.fK.o().a(dnr.b, ji.f);
         dta $$9 = dfy.fK.o().a(dnr.b, ji.e);
         dta $$10 = dfy.fK.o().a(dnr.b, ji.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.a(dnr.d, duj.e), 0, 4, 1, $$4);
         this.a($$0, $$7.a(dnr.d, duj.d), 6, 4, 1, $$4);
         this.a($$0, $$10.a(dnr.d, duj.d), 0, 4, 8, $$4);
         this.a($$0, $$10.a(dnr.d, duj.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dfy.U.o(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            jd $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               ckr $$14 = bsw.bo.a((dcu)$$0.E());
               if ($$14 != null) {
                  $$14.fP();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), btp.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(ddj $$0, eje $$1) {
      if (!this.i) {
         jd $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cff $$3 = bsw.p.a((dcu)$$0.E());
            if ($$3 != null) {
               $$3.fP();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), btp.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
