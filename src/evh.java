public class evh extends esl {
   private boolean h;
   private boolean i;

   public evh(bai $$0, int $$1, int $$2) {
      super(ete.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public evh(ua $$0) {
      super(ete.K, $$0);
      this.h = $$0.b("Witch", false);
      this.i = $$0.b("Cat", false);
   }

   @Override
   protected void a(etd $$0, ua $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dnq.o.m(), dnq.o.m(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dnq.o.m(), dnq.o.m(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dnq.o.m(), dnq.o.m(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dnq.o.m(), dnq.o.m(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dnq.o.m(), dnq.o.m(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dnq.o.m(), dnq.o.m(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dnq.o.m(), dnq.o.m(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dnq.X.m(), dnq.X.m(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dnq.X.m(), dnq.X.m(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dnq.X.m(), dnq.X.m(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dnq.X.m(), dnq.X.m(), false);
         this.a($$0, dnq.el.m(), 2, 3, 2, $$4);
         this.a($$0, dnq.el.m(), 3, 3, 7, $$4);
         this.a($$0, dnq.a.m(), 1, 3, 4, $$4);
         this.a($$0, dnq.a.m(), 5, 3, 4, $$4);
         this.a($$0, dnq.a.m(), 5, 3, 5, $$4);
         this.a($$0, dnq.gP.m(), 1, 3, 5, $$4);
         this.a($$0, dnq.cL.m(), 3, 2, 6, $$4);
         this.a($$0, dnq.fS.m(), 4, 2, 6, $$4);
         this.a($$0, dnq.el.m(), 1, 2, 1, $$4);
         this.a($$0, dnq.el.m(), 5, 2, 1, $$4);
         ebq $$7 = dnq.gj.m().b(dvs.b, jc.c);
         ebq $$8 = dnq.gj.m().b(dvs.b, jc.f);
         ebq $$9 = dnq.gj.m().b(dvs.b, jc.e);
         ebq $$10 = dnq.gj.m().b(dvs.b, jc.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.b(dvs.d, ecz.e), 0, 4, 1, $$4);
         this.a($$0, $$7.b(dvs.d, ecz.d), 6, 4, 1, $$4);
         this.a($$0, $$10.b(dvs.d, ecz.d), 0, 4, 8, $$4);
         this.a($$0, $$10.b(dvs.d, ecz.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dnq.X.m(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            iw $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cqa $$14 = bxn.bJ.a($$0.a(), bxm.d);
               if ($$14 != null) {
                  $$14.gc();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bxm.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dla $$0, esf $$1) {
      if (!this.i) {
         iw $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cjy $$3 = bxn.v.a($$0.a(), bxm.d);
            if ($$3 != null) {
               $$3.gc();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bxm.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
