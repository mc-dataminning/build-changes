public class esv extends eqr {
   public static final int h = 12;
   public static final int i = 15;
   private boolean j;
   private boolean k;
   private boolean l;
   private boolean m;
   private static final esv.a n = new esv.a();

   public esv(azv $$0, int $$1, int $$2) {
      super(erk.G, $$1, 64, $$2, 12, 10, 15, a($$0));
   }

   public esv(tz $$0) {
      super(erk.G, $$0);
      this.j = $$0.q("placedMainChest");
      this.k = $$0.q("placedHiddenChest");
      this.l = $$0.q("placedTrap1");
      this.m = $$0.q("placedTrap2");
   }

   @Override
   protected void a(erj $$0, tz $$1) {
      super.a($$0, $$1);
      $$1.a("placedMainChest", this.j);
      $$1.a("placedHiddenChest", this.k);
      $$1.a("placedTrap1", this.l);
      $$1.a("placedTrap2", this.m);
   }

   @Override
   public void a(dju $$0, djr $$1, ebx $$2, azv $$3, eql $$4, dic $$5, iu $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 0, -4, 0, this.a - 1, 0, this.c - 1, false, $$3, n);
         this.a($$0, $$4, 2, 1, 2, 9, 2, 2, false, $$3, n);
         this.a($$0, $$4, 2, 1, 12, 9, 2, 12, false, $$3, n);
         this.a($$0, $$4, 2, 1, 3, 2, 2, 11, false, $$3, n);
         this.a($$0, $$4, 9, 1, 3, 9, 2, 11, false, $$3, n);
         this.a($$0, $$4, 1, 3, 1, 10, 6, 1, false, $$3, n);
         this.a($$0, $$4, 1, 3, 13, 10, 6, 13, false, $$3, n);
         this.a($$0, $$4, 1, 3, 2, 1, 6, 12, false, $$3, n);
         this.a($$0, $$4, 10, 3, 2, 10, 6, 12, false, $$3, n);
         this.a($$0, $$4, 2, 3, 2, 9, 3, 12, false, $$3, n);
         this.a($$0, $$4, 2, 6, 2, 9, 6, 12, false, $$3, n);
         this.a($$0, $$4, 3, 7, 3, 8, 7, 11, false, $$3, n);
         this.a($$0, $$4, 4, 8, 4, 7, 8, 10, false, $$3, n);
         this.a($$0, $$4, 3, 1, 3, 8, 2, 11);
         this.a($$0, $$4, 4, 3, 6, 7, 3, 9);
         this.a($$0, $$4, 2, 4, 2, 9, 5, 12);
         this.a($$0, $$4, 4, 6, 5, 7, 6, 9);
         this.a($$0, $$4, 5, 7, 6, 6, 7, 8);
         this.a($$0, $$4, 5, 1, 2, 6, 2, 2);
         this.a($$0, $$4, 5, 2, 12, 6, 2, 12);
         this.a($$0, $$4, 5, 5, 1, 6, 5, 1);
         this.a($$0, $$4, 5, 5, 13, 6, 5, 13);
         this.a($$0, dmc.a.m(), 1, 5, 5, $$4);
         this.a($$0, dmc.a.m(), 10, 5, 5, $$4);
         this.a($$0, dmc.a.m(), 1, 5, 9, $$4);
         this.a($$0, dmc.a.m(), 10, 5, 9, $$4);

         for (int $$7 = 0; $$7 <= 14; $$7 += 14) {
            this.a($$0, $$4, 2, 4, $$7, 2, 5, $$7, false, $$3, n);
            this.a($$0, $$4, 4, 4, $$7, 4, 5, $$7, false, $$3, n);
            this.a($$0, $$4, 7, 4, $$7, 7, 5, $$7, false, $$3, n);
            this.a($$0, $$4, 9, 4, $$7, 9, 5, $$7, false, $$3, n);
         }

         this.a($$0, $$4, 5, 6, 0, 6, 6, 0, false, $$3, n);

         for (int $$8 = 0; $$8 <= 11; $$8 += 11) {
            for (int $$9 = 2; $$9 <= 12; $$9 += 2) {
               this.a($$0, $$4, $$8, 4, $$9, $$8, 5, $$9, false, $$3, n);
            }

            this.a($$0, $$4, $$8, 6, 5, $$8, 6, 5, false, $$3, n);
            this.a($$0, $$4, $$8, 6, 9, $$8, 6, 9, false, $$3, n);
         }

         this.a($$0, $$4, 2, 7, 2, 2, 9, 2, false, $$3, n);
         this.a($$0, $$4, 9, 7, 2, 9, 9, 2, false, $$3, n);
         this.a($$0, $$4, 2, 7, 12, 2, 9, 12, false, $$3, n);
         this.a($$0, $$4, 9, 7, 12, 9, 9, 12, false, $$3, n);
         this.a($$0, $$4, 4, 9, 4, 4, 9, 4, false, $$3, n);
         this.a($$0, $$4, 7, 9, 4, 7, 9, 4, false, $$3, n);
         this.a($$0, $$4, 4, 9, 10, 4, 9, 10, false, $$3, n);
         this.a($$0, $$4, 7, 9, 10, 7, 9, 10, false, $$3, n);
         this.a($$0, $$4, 5, 9, 7, 6, 9, 7, false, $$3, n);
         dzz $$10 = dmc.da.m().b(duc.b, ja.f);
         dzz $$11 = dmc.da.m().b(duc.b, ja.e);
         dzz $$12 = dmc.da.m().b(duc.b, ja.d);
         dzz $$13 = dmc.da.m().b(duc.b, ja.c);
         this.a($$0, $$13, 5, 9, 6, $$4);
         this.a($$0, $$13, 6, 9, 6, $$4);
         this.a($$0, $$12, 5, 9, 8, $$4);
         this.a($$0, $$12, 6, 9, 8, $$4);
         this.a($$0, $$13, 4, 0, 0, $$4);
         this.a($$0, $$13, 5, 0, 0, $$4);
         this.a($$0, $$13, 6, 0, 0, $$4);
         this.a($$0, $$13, 7, 0, 0, $$4);
         this.a($$0, $$13, 4, 1, 8, $$4);
         this.a($$0, $$13, 4, 2, 9, $$4);
         this.a($$0, $$13, 4, 3, 10, $$4);
         this.a($$0, $$13, 7, 1, 8, $$4);
         this.a($$0, $$13, 7, 2, 9, $$4);
         this.a($$0, $$13, 7, 3, 10, $$4);
         this.a($$0, $$4, 4, 1, 9, 4, 1, 9, false, $$3, n);
         this.a($$0, $$4, 7, 1, 9, 7, 1, 9, false, $$3, n);
         this.a($$0, $$4, 4, 1, 10, 7, 2, 10, false, $$3, n);
         this.a($$0, $$4, 5, 4, 5, 6, 4, 5, false, $$3, n);
         this.a($$0, $$10, 4, 4, 5, $$4);
         this.a($$0, $$11, 7, 4, 5, $$4);

         for (int $$14 = 0; $$14 < 4; $$14++) {
            this.a($$0, $$12, 5, 0 - $$14, 6 + $$14, $$4);
            this.a($$0, $$12, 6, 0 - $$14, 6 + $$14, $$4);
            this.a($$0, $$4, 5, 0 - $$14, 7 + $$14, 6, 0 - $$14, 9 + $$14);
         }

         this.a($$0, $$4, 1, -3, 12, 10, -1, 13);
         this.a($$0, $$4, 1, -3, 1, 3, -1, 13);
         this.a($$0, $$4, 1, -3, 1, 9, -1, 5);

         for (int $$15 = 1; $$15 <= 13; $$15 += 2) {
            this.a($$0, $$4, 1, -3, $$15, 1, -2, $$15, false, $$3, n);
         }

         for (int $$16 = 2; $$16 <= 12; $$16 += 2) {
            this.a($$0, $$4, 1, -1, $$16, 3, -1, $$16, false, $$3, n);
         }

         this.a($$0, $$4, 2, -2, 1, 5, -2, 1, false, $$3, n);
         this.a($$0, $$4, 7, -2, 1, 9, -2, 1, false, $$3, n);
         this.a($$0, $$4, 6, -3, 1, 6, -3, 1, false, $$3, n);
         this.a($$0, $$4, 6, -1, 1, 6, -1, 1, false, $$3, n);
         this.a($$0, dmc.gd.m().b(dvd.b, ja.f).b(dvd.d, Boolean.valueOf(true)), 1, -3, 8, $$4);
         this.a($$0, dmc.gd.m().b(dvd.b, ja.e).b(dvd.d, Boolean.valueOf(true)), 4, -3, 8, $$4);
         this.a($$0, dmc.ge.m().b(dvc.f, Boolean.valueOf(true)).b(dvc.h, Boolean.valueOf(true)).b(dvc.c, Boolean.valueOf(true)), 2, -3, 8, $$4);
         this.a($$0, dmc.ge.m().b(dvc.f, Boolean.valueOf(true)).b(dvc.h, Boolean.valueOf(true)).b(dvc.c, Boolean.valueOf(true)), 3, -3, 8, $$4);
         dzz $$17 = dmc.cF.m().b(dsi.b, ebe.b).b(dsi.d, ebe.b);
         this.a($$0, $$17, 5, -3, 7, $$4);
         this.a($$0, $$17, 5, -3, 6, $$4);
         this.a($$0, $$17, 5, -3, 5, $$4);
         this.a($$0, $$17, 5, -3, 4, $$4);
         this.a($$0, $$17, 5, -3, 3, $$4);
         this.a($$0, $$17, 5, -3, 2, $$4);
         this.a($$0, dmc.cF.m().b(dsi.b, ebe.b).b(dsi.e, ebe.b), 5, -3, 1, $$4);
         this.a($$0, dmc.cF.m().b(dsi.c, ebe.b).b(dsi.e, ebe.b), 4, -3, 1, $$4);
         this.a($$0, dmc.cv.m(), 3, -3, 1, $$4);
         if (!this.l) {
            this.l = this.a($$0, $$4, $$3, 3, -2, 1, ja.c, eyv.A);
         }

         this.a($$0, dmc.fu.m().b(dvk.e, Boolean.valueOf(true)), 3, -2, 2, $$4);
         this.a($$0, dmc.gd.m().b(dvd.b, ja.c).b(dvd.d, Boolean.valueOf(true)), 7, -3, 1, $$4);
         this.a($$0, dmc.gd.m().b(dvd.b, ja.d).b(dvd.d, Boolean.valueOf(true)), 7, -3, 5, $$4);
         this.a($$0, dmc.ge.m().b(dvc.e, Boolean.valueOf(true)).b(dvc.g, Boolean.valueOf(true)).b(dvc.c, Boolean.valueOf(true)), 7, -3, 2, $$4);
         this.a($$0, dmc.ge.m().b(dvc.e, Boolean.valueOf(true)).b(dvc.g, Boolean.valueOf(true)).b(dvc.c, Boolean.valueOf(true)), 7, -3, 3, $$4);
         this.a($$0, dmc.ge.m().b(dvc.e, Boolean.valueOf(true)).b(dvc.g, Boolean.valueOf(true)).b(dvc.c, Boolean.valueOf(true)), 7, -3, 4, $$4);
         this.a($$0, dmc.cF.m().b(dsi.c, ebe.b).b(dsi.e, ebe.b), 8, -3, 6, $$4);
         this.a($$0, dmc.cF.m().b(dsi.e, ebe.b).b(dsi.d, ebe.b), 9, -3, 6, $$4);
         this.a($$0, dmc.cF.m().b(dsi.b, ebe.b).b(dsi.d, ebe.a), 9, -3, 5, $$4);
         this.a($$0, dmc.cv.m(), 9, -3, 4, $$4);
         this.a($$0, $$17, 9, -2, 4, $$4);
         if (!this.m) {
            this.m = this.a($$0, $$4, $$3, 9, -2, 3, ja.e, eyv.A);
         }

         this.a($$0, dmc.fu.m().b(dvk.d, Boolean.valueOf(true)), 8, -1, 3, $$4);
         this.a($$0, dmc.fu.m().b(dvk.d, Boolean.valueOf(true)), 8, -2, 3, $$4);
         if (!this.j) {
            this.j = this.a($$0, $$4, $$3, 8, -3, 3, eyv.z);
         }

         this.a($$0, dmc.cv.m(), 9, -3, 2, $$4);
         this.a($$0, dmc.cv.m(), 8, -3, 1, $$4);
         this.a($$0, dmc.cv.m(), 4, -3, 5, $$4);
         this.a($$0, dmc.cv.m(), 5, -2, 5, $$4);
         this.a($$0, dmc.cv.m(), 5, -1, 5, $$4);
         this.a($$0, dmc.cv.m(), 6, -3, 5, $$4);
         this.a($$0, dmc.cv.m(), 7, -2, 5, $$4);
         this.a($$0, dmc.cv.m(), 7, -1, 5, $$4);
         this.a($$0, dmc.cv.m(), 8, -3, 5, $$4);
         this.a($$0, $$4, 9, -1, 1, 9, -1, 5, false, $$3, n);
         this.a($$0, $$4, 8, -3, 8, 10, -1, 10);
         this.a($$0, dmc.eZ.m(), 8, -2, 11, $$4);
         this.a($$0, dmc.eZ.m(), 9, -2, 11, $$4);
         this.a($$0, dmc.eZ.m(), 10, -2, 11, $$4);
         dzz $$18 = dmc.dJ.m().b(dqs.e, ja.c).b(dqs.c, eak.b);
         this.a($$0, $$18, 8, -2, 12, $$4);
         this.a($$0, $$18, 9, -2, 12, $$4);
         this.a($$0, $$18, 10, -2, 12, $$4);
         this.a($$0, $$4, 8, -3, 8, 8, -3, 10, false, $$3, n);
         this.a($$0, $$4, 10, -3, 8, 10, -3, 10, false, $$3, n);
         this.a($$0, dmc.cv.m(), 10, -2, 9, $$4);
         this.a($$0, $$17, 8, -2, 9, $$4);
         this.a($$0, $$17, 8, -2, 10, $$4);
         this.a($$0, dmc.cF.m().b(dsi.b, ebe.b).b(dsi.d, ebe.b).b(dsi.c, ebe.b).b(dsi.e, ebe.b), 10, -1, 9, $$4);
         this.a($$0, dmc.by.m().b(dzr.a, ja.b), 9, -2, 8, $$4);
         this.a($$0, dmc.by.m().b(dzr.a, ja.e), 10, -2, 8, $$4);
         this.a($$0, dmc.by.m().b(dzr.a, ja.e), 10, -1, 8, $$4);
         this.a($$0, dmc.ev.m().b(dsn.e, ja.c), 10, -2, 10, $$4);
         if (!this.k) {
            this.k = this.a($$0, $$4, $$3, 9, -3, 10, eyv.z);
         }
      }
   }

   static class a extends eqx.a {
      @Override
      public void a(azv $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$0.i() < 0.4F) {
            this.a = dmc.m.m();
         } else {
            this.a = dmc.cv.m();
         }
      }
   }
}
