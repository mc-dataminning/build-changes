public class ekr extends eio {
   public static final int h = 12;
   public static final int i = 15;
   private boolean j;
   private boolean k;
   private boolean l;
   private boolean m;
   private static final ekr.a n = new ekr.a();

   public ekr(aym $$0, int $$1, int $$2) {
      super(ejh.G, $$1, 64, $$2, 12, 10, 15, a($$0));
   }

   public ekr(tx $$0) {
      super(ejh.G, $$0);
      this.j = $$0.q("placedMainChest");
      this.k = $$0.q("placedHiddenChest");
      this.l = $$0.q("placedTrap1");
      this.m = $$0.q("placedTrap2");
   }

   @Override
   protected void a(ejg $$0, tx $$1) {
      super.a($$0, $$1);
      $$1.a("placedMainChest", this.j);
      $$1.a("placedHiddenChest", this.k);
      $$1.a("placedTrap1", this.l);
      $$1.a("placedTrap2", this.m);
   }

   @Override
   public void a(dcz $$0, dcx $$1, due $$2, aym $$3, eii $$4, dbk $$5, ja $$6) {
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
         this.a($$0, dfh.a.o(), 1, 5, 5, $$4);
         this.a($$0, dfh.a.o(), 10, 5, 5, $$4);
         this.a($$0, dfh.a.o(), 1, 5, 9, $$4);
         this.a($$0, dfh.a.o(), 10, 5, 9, $$4);

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
         dsh $$10 = dfh.cQ.o().a(dmz.b, jf.f);
         dsh $$11 = dfh.cQ.o().a(dmz.b, jf.e);
         dsh $$12 = dfh.cQ.o().a(dmz.b, jf.d);
         dsh $$13 = dfh.cQ.o().a(dmz.b, jf.c);
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
         this.a($$0, dfh.fH.o().a(dnw.b, jf.f).a(dnw.d, Boolean.valueOf(true)), 1, -3, 8, $$4);
         this.a($$0, dfh.fH.o().a(dnw.b, jf.e).a(dnw.d, Boolean.valueOf(true)), 4, -3, 8, $$4);
         this.a($$0, dfh.fI.o().a(dnv.f, Boolean.valueOf(true)).a(dnv.h, Boolean.valueOf(true)).a(dnv.c, Boolean.valueOf(true)), 2, -3, 8, $$4);
         this.a($$0, dfh.fI.o().a(dnv.f, Boolean.valueOf(true)).a(dnv.h, Boolean.valueOf(true)).a(dnv.c, Boolean.valueOf(true)), 3, -3, 8, $$4);
         dsh $$17 = dfh.cw.o().a(dlh.b, dtm.b).a(dlh.d, dtm.b);
         this.a($$0, $$17, 5, -3, 7, $$4);
         this.a($$0, $$17, 5, -3, 6, $$4);
         this.a($$0, $$17, 5, -3, 5, $$4);
         this.a($$0, $$17, 5, -3, 4, $$4);
         this.a($$0, $$17, 5, -3, 3, $$4);
         this.a($$0, $$17, 5, -3, 2, $$4);
         this.a($$0, dfh.cw.o().a(dlh.b, dtm.b).a(dlh.e, dtm.b), 5, -3, 1, $$4);
         this.a($$0, dfh.cw.o().a(dlh.c, dtm.b).a(dlh.e, dtm.b), 4, -3, 1, $$4);
         this.a($$0, dfh.cn.o(), 3, -3, 1, $$4);
         if (!this.l) {
            this.l = this.a($$0, $$4, $$3, 3, -2, 1, jf.c, eqk.B);
         }

         this.a($$0, dfh.ff.o().a(dob.e, Boolean.valueOf(true)), 3, -2, 2, $$4);
         this.a($$0, dfh.fH.o().a(dnw.b, jf.c).a(dnw.d, Boolean.valueOf(true)), 7, -3, 1, $$4);
         this.a($$0, dfh.fH.o().a(dnw.b, jf.d).a(dnw.d, Boolean.valueOf(true)), 7, -3, 5, $$4);
         this.a($$0, dfh.fI.o().a(dnv.e, Boolean.valueOf(true)).a(dnv.g, Boolean.valueOf(true)).a(dnv.c, Boolean.valueOf(true)), 7, -3, 2, $$4);
         this.a($$0, dfh.fI.o().a(dnv.e, Boolean.valueOf(true)).a(dnv.g, Boolean.valueOf(true)).a(dnv.c, Boolean.valueOf(true)), 7, -3, 3, $$4);
         this.a($$0, dfh.fI.o().a(dnv.e, Boolean.valueOf(true)).a(dnv.g, Boolean.valueOf(true)).a(dnv.c, Boolean.valueOf(true)), 7, -3, 4, $$4);
         this.a($$0, dfh.cw.o().a(dlh.c, dtm.b).a(dlh.e, dtm.b), 8, -3, 6, $$4);
         this.a($$0, dfh.cw.o().a(dlh.e, dtm.b).a(dlh.d, dtm.b), 9, -3, 6, $$4);
         this.a($$0, dfh.cw.o().a(dlh.b, dtm.b).a(dlh.d, dtm.a), 9, -3, 5, $$4);
         this.a($$0, dfh.cn.o(), 9, -3, 4, $$4);
         this.a($$0, $$17, 9, -2, 4, $$4);
         if (!this.m) {
            this.m = this.a($$0, $$4, $$3, 9, -2, 3, jf.e, eqk.B);
         }

         this.a($$0, dfh.ff.o().a(dob.d, Boolean.valueOf(true)), 8, -1, 3, $$4);
         this.a($$0, dfh.ff.o().a(dob.d, Boolean.valueOf(true)), 8, -2, 3, $$4);
         if (!this.j) {
            this.j = this.a($$0, $$4, $$3, 8, -3, 3, eqk.A);
         }

         this.a($$0, dfh.cn.o(), 9, -3, 2, $$4);
         this.a($$0, dfh.cn.o(), 8, -3, 1, $$4);
         this.a($$0, dfh.cn.o(), 4, -3, 5, $$4);
         this.a($$0, dfh.cn.o(), 5, -2, 5, $$4);
         this.a($$0, dfh.cn.o(), 5, -1, 5, $$4);
         this.a($$0, dfh.cn.o(), 6, -3, 5, $$4);
         this.a($$0, dfh.cn.o(), 7, -2, 5, $$4);
         this.a($$0, dfh.cn.o(), 7, -1, 5, $$4);
         this.a($$0, dfh.cn.o(), 8, -3, 5, $$4);
         this.a($$0, $$4, 9, -1, 1, 9, -1, 5, false, $$3, n);
         this.a($$0, $$4, 8, -3, 8, 10, -1, 10);
         this.a($$0, dfh.eK.o(), 8, -2, 11, $$4);
         this.a($$0, dfh.eK.o(), 9, -2, 11, $$4);
         this.a($$0, dfh.eK.o(), 10, -2, 11, $$4);
         dsh $$18 = dfh.dw.o().a(djs.aE, jf.c).a(djs.K, dss.b);
         this.a($$0, $$18, 8, -2, 12, $$4);
         this.a($$0, $$18, 9, -2, 12, $$4);
         this.a($$0, $$18, 10, -2, 12, $$4);
         this.a($$0, $$4, 8, -3, 8, 8, -3, 10, false, $$3, n);
         this.a($$0, $$4, 10, -3, 8, 10, -3, 10, false, $$3, n);
         this.a($$0, dfh.cn.o(), 10, -2, 9, $$4);
         this.a($$0, $$17, 8, -2, 9, $$4);
         this.a($$0, $$17, 8, -2, 10, $$4);
         this.a($$0, dfh.cw.o().a(dlh.b, dtm.b).a(dlh.d, dtm.b).a(dlh.c, dtm.b).a(dlh.e, dtm.b), 10, -1, 9, $$4);
         this.a($$0, dfh.br.o().a(dsa.a, jf.b), 9, -2, 8, $$4);
         this.a($$0, dfh.br.o().a(dsa.a, jf.e), 10, -2, 8, $$4);
         this.a($$0, dfh.br.o().a(dsa.a, jf.e), 10, -1, 8, $$4);
         this.a($$0, dfh.eh.o().a(dlm.aE, jf.c), 10, -2, 10, $$4);
         if (!this.k) {
            this.k = this.a($$0, $$4, $$3, 9, -3, 10, eqk.A);
         }
      }
   }

   static class a extends eiu.a {
      @Override
      public void a(aym $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$0.i() < 0.4F) {
            this.a = dfh.m.o();
         } else {
            this.a = dfh.cn.o();
         }
      }
   }
}
