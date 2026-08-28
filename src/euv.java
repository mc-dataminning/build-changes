public class euv extends erz {
   private boolean h;
   private boolean i;

   public euv(azx $$0, int $$1, int $$2) {
      super(ess.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public euv(tz $$0) {
      super(ess.K, $$0);
      this.h = $$0.b("Witch", false);
      this.i = $$0.b("Cat", false);
   }

   @Override
   protected void a(esr $$0, tz $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, iv $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dne.o.m(), dne.o.m(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dne.o.m(), dne.o.m(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dne.o.m(), dne.o.m(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dne.o.m(), dne.o.m(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dne.o.m(), dne.o.m(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dne.o.m(), dne.o.m(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dne.o.m(), dne.o.m(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dne.X.m(), dne.X.m(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dne.X.m(), dne.X.m(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dne.X.m(), dne.X.m(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dne.X.m(), dne.X.m(), false);
         this.a($$0, dne.el.m(), 2, 3, 2, $$4);
         this.a($$0, dne.el.m(), 3, 3, 7, $$4);
         this.a($$0, dne.a.m(), 1, 3, 4, $$4);
         this.a($$0, dne.a.m(), 5, 3, 4, $$4);
         this.a($$0, dne.a.m(), 5, 3, 5, $$4);
         this.a($$0, dne.gP.m(), 1, 3, 5, $$4);
         this.a($$0, dne.cL.m(), 3, 2, 6, $$4);
         this.a($$0, dne.fS.m(), 4, 2, 6, $$4);
         this.a($$0, dne.el.m(), 1, 2, 1, $$4);
         this.a($$0, dne.el.m(), 5, 2, 1, $$4);
         ebe $$7 = dne.gj.m().b(dvg.b, jb.c);
         ebe $$8 = dne.gj.m().b(dvg.b, jb.f);
         ebe $$9 = dne.gj.m().b(dvg.b, jb.e);
         ebe $$10 = dne.gj.m().b(dvg.b, jb.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.b(dvg.d, ecn.e), 0, 4, 1, $$4);
         this.a($$0, $$7.b(dvg.d, ecn.d), 6, 4, 1, $$4);
         this.a($$0, $$10.b(dvg.d, ecn.d), 0, 4, 8, $$4);
         this.a($$0, $$10.b(dvg.d, ecn.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dne.X.m(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            iv $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cpp $$14 = bxc.bJ.a($$0.a(), bxb.d);
               if ($$14 != null) {
                  $$14.gc();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bxb.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dko $$0, ert $$1) {
      if (!this.i) {
         iv $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cjn $$3 = bxc.v.a($$0.a(), bxb.d);
            if ($$3 != null) {
               $$3.gc();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bxb.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
