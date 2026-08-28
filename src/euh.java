public class euh extends erl {
   private boolean h;
   private boolean i;

   public euh(azv $$0, int $$1, int $$2) {
      super(ese.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public euh(tz $$0) {
      super(ese.K, $$0);
      this.h = $$0.o("Witch");
      this.i = $$0.o("Cat");
   }

   @Override
   protected void a(esd $$0, tz $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dmt.o.m(), dmt.o.m(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dmt.o.m(), dmt.o.m(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dmt.o.m(), dmt.o.m(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dmt.o.m(), dmt.o.m(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dmt.o.m(), dmt.o.m(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dmt.o.m(), dmt.o.m(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dmt.o.m(), dmt.o.m(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dmt.X.m(), dmt.X.m(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dmt.X.m(), dmt.X.m(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dmt.X.m(), dmt.X.m(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dmt.X.m(), dmt.X.m(), false);
         this.a($$0, dmt.el.m(), 2, 3, 2, $$4);
         this.a($$0, dmt.el.m(), 3, 3, 7, $$4);
         this.a($$0, dmt.a.m(), 1, 3, 4, $$4);
         this.a($$0, dmt.a.m(), 5, 3, 4, $$4);
         this.a($$0, dmt.a.m(), 5, 3, 5, $$4);
         this.a($$0, dmt.gP.m(), 1, 3, 5, $$4);
         this.a($$0, dmt.cL.m(), 3, 2, 6, $$4);
         this.a($$0, dmt.fS.m(), 4, 2, 6, $$4);
         this.a($$0, dmt.el.m(), 1, 2, 1, $$4);
         this.a($$0, dmt.el.m(), 5, 2, 1, $$4);
         eat $$7 = dmt.gj.m().b(duv.b, jb.c);
         eat $$8 = dmt.gj.m().b(duv.b, jb.f);
         eat $$9 = dmt.gj.m().b(duv.b, jb.e);
         eat $$10 = dmt.gj.m().b(duv.b, jb.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.b(duv.d, ecc.e), 0, 4, 1, $$4);
         this.a($$0, $$7.b(duv.d, ecc.d), 6, 4, 1, $$4);
         this.a($$0, $$10.b(duv.d, ecc.d), 0, 4, 8, $$4);
         this.a($$0, $$10.b(duv.d, ecc.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dmt.X.m(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            iv $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cpe $$14 = bwr.bI.a($$0.a(), bwq.d);
               if ($$14 != null) {
                  $$14.gb();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bwq.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dkd $$0, erf $$1) {
      if (!this.i) {
         iv $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cjc $$3 = bwr.u.a($$0.a(), bwq.d);
            if ($$3 != null) {
               $$3.gb();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bwq.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
