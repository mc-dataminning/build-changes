public class etc extends eqg {
   private boolean h;
   private boolean i;

   public etc(azt $$0, int $$1, int $$2) {
      super(eqz.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public etc(tx $$0) {
      super(eqz.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(eqy $$0, tx $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(djo $$0, djl $$1, ebm $$2, azt $$3, eqa $$4, dhw $$5, iu $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dlw.o.m(), dlw.o.m(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dlw.o.m(), dlw.o.m(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dlw.o.m(), dlw.o.m(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dlw.o.m(), dlw.o.m(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dlw.o.m(), dlw.o.m(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dlw.o.m(), dlw.o.m(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dlw.o.m(), dlw.o.m(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dlw.X.m(), dlw.X.m(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dlw.X.m(), dlw.X.m(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dlw.X.m(), dlw.X.m(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dlw.X.m(), dlw.X.m(), false);
         this.a($$0, dlw.eh.m(), 2, 3, 2, $$4);
         this.a($$0, dlw.eh.m(), 3, 3, 7, $$4);
         this.a($$0, dlw.a.m(), 1, 3, 4, $$4);
         this.a($$0, dlw.a.m(), 5, 3, 4, $$4);
         this.a($$0, dlw.a.m(), 5, 3, 5, $$4);
         this.a($$0, dlw.gL.m(), 1, 3, 5, $$4);
         this.a($$0, dlw.cI.m(), 3, 2, 6, $$4);
         this.a($$0, dlw.fO.m(), 4, 2, 6, $$4);
         this.a($$0, dlw.eh.m(), 1, 2, 1, $$4);
         this.a($$0, dlw.eh.m(), 5, 2, 1, $$4);
         dzo $$7 = dlw.gf.m().b(dtu.b, ja.c);
         dzo $$8 = dlw.gf.m().b(dtu.b, ja.f);
         dzo $$9 = dlw.gf.m().b(dtu.b, ja.e);
         dzo $$10 = dlw.gf.m().b(dtu.b, ja.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.b(dtu.d, eax.e), 0, 4, 1, $$4);
         this.a($$0, $$7.b(dtu.d, eax.d), 6, 4, 1, $$4);
         this.a($$0, $$10.b(dtu.d, eax.d), 0, 4, 8, $$4);
         this.a($$0, $$10.b(dtu.d, eax.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dlw.X.m(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            iu $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               coj $$14 = bwj.bI.a($$0.a(), bwi.d);
               if ($$14 != null) {
                  $$14.fY();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bwi.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(djg $$0, eqa $$1) {
      if (!this.i) {
         iu $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cir $$3 = bwj.u.a($$0.a(), bwi.d);
            if ($$3 != null) {
               $$3.fY();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bwi.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
