public class eux extends esb {
   private boolean h;
   private boolean i;

   public eux(azz $$0, int $$1, int $$2) {
      super(esu.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public eux(ua $$0) {
      super(esu.K, $$0);
      this.h = $$0.b("Witch", false);
      this.i = $$0.b("Cat", false);
   }

   @Override
   protected void a(est $$0, ua $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dng.o.m(), dng.o.m(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dng.o.m(), dng.o.m(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dng.o.m(), dng.o.m(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dng.o.m(), dng.o.m(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dng.o.m(), dng.o.m(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dng.o.m(), dng.o.m(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dng.o.m(), dng.o.m(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dng.X.m(), dng.X.m(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dng.X.m(), dng.X.m(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dng.X.m(), dng.X.m(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dng.X.m(), dng.X.m(), false);
         this.a($$0, dng.el.m(), 2, 3, 2, $$4);
         this.a($$0, dng.el.m(), 3, 3, 7, $$4);
         this.a($$0, dng.a.m(), 1, 3, 4, $$4);
         this.a($$0, dng.a.m(), 5, 3, 4, $$4);
         this.a($$0, dng.a.m(), 5, 3, 5, $$4);
         this.a($$0, dng.gP.m(), 1, 3, 5, $$4);
         this.a($$0, dng.cL.m(), 3, 2, 6, $$4);
         this.a($$0, dng.fS.m(), 4, 2, 6, $$4);
         this.a($$0, dng.el.m(), 1, 2, 1, $$4);
         this.a($$0, dng.el.m(), 5, 2, 1, $$4);
         ebg $$7 = dng.gj.m().b(dvi.b, jc.c);
         ebg $$8 = dng.gj.m().b(dvi.b, jc.f);
         ebg $$9 = dng.gj.m().b(dvi.b, jc.e);
         ebg $$10 = dng.gj.m().b(dvi.b, jc.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.b(dvi.d, ecp.e), 0, 4, 1, $$4);
         this.a($$0, $$7.b(dvi.d, ecp.d), 6, 4, 1, $$4);
         this.a($$0, $$10.b(dvi.d, ecp.d), 0, 4, 8, $$4);
         this.a($$0, $$10.b(dvi.d, ecp.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dng.X.m(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            iw $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cpr $$14 = bxe.bJ.a($$0.a(), bxd.d);
               if ($$14 != null) {
                  $$14.gc();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bxd.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dkq $$0, erv $$1) {
      if (!this.i) {
         iw $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cjp $$3 = bxe.v.a($$0.a(), bxd.d);
            if ($$3 != null) {
               $$3.gc();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bxd.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
