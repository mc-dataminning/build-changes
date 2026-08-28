public class etv extends eqz {
   private boolean h;
   private boolean i;

   public etv(azv $$0, int $$1, int $$2) {
      super(ers.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public etv(tz $$0) {
      super(ers.K, $$0);
      this.h = $$0.q("Witch");
      this.i = $$0.q("Cat");
   }

   @Override
   protected void a(err $$0, tz $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(djz $$0, djw $$1, ecf $$2, azv $$3, eqt $$4, dih $$5, iu $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dmh.o.m(), dmh.o.m(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dmh.o.m(), dmh.o.m(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dmh.o.m(), dmh.o.m(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dmh.o.m(), dmh.o.m(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dmh.o.m(), dmh.o.m(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dmh.o.m(), dmh.o.m(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dmh.o.m(), dmh.o.m(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dmh.X.m(), dmh.X.m(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dmh.X.m(), dmh.X.m(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dmh.X.m(), dmh.X.m(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dmh.X.m(), dmh.X.m(), false);
         this.a($$0, dmh.el.m(), 2, 3, 2, $$4);
         this.a($$0, dmh.el.m(), 3, 3, 7, $$4);
         this.a($$0, dmh.a.m(), 1, 3, 4, $$4);
         this.a($$0, dmh.a.m(), 5, 3, 4, $$4);
         this.a($$0, dmh.a.m(), 5, 3, 5, $$4);
         this.a($$0, dmh.gP.m(), 1, 3, 5, $$4);
         this.a($$0, dmh.cL.m(), 3, 2, 6, $$4);
         this.a($$0, dmh.fS.m(), 4, 2, 6, $$4);
         this.a($$0, dmh.el.m(), 1, 2, 1, $$4);
         this.a($$0, dmh.el.m(), 5, 2, 1, $$4);
         eah $$7 = dmh.gj.m().b(duj.b, ja.c);
         eah $$8 = dmh.gj.m().b(duj.b, ja.f);
         eah $$9 = dmh.gj.m().b(duj.b, ja.e);
         eah $$10 = dmh.gj.m().b(duj.b, ja.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.b(duj.d, ebq.e), 0, 4, 1, $$4);
         this.a($$0, $$7.b(duj.d, ebq.d), 6, 4, 1, $$4);
         this.a($$0, $$10.b(duj.d, ebq.d), 0, 4, 8, $$4);
         this.a($$0, $$10.b(duj.d, ebq.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dmh.X.m(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            iu $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               cou $$14 = bwo.bI.a($$0.a(), bwn.d);
               if ($$14 != null) {
                  $$14.fZ();
                  $$14.b((double)$$13.u() + 0.5, (double)$$13.v(), (double)$$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bwn.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(djr $$0, eqt $$1) {
      if (!this.i) {
         iu $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cix $$3 = bwo.u.a($$0.a(), bwn.d);
            if ($$3 != null) {
               $$3.fZ();
               $$3.b((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bwn.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
