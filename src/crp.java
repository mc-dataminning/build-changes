import javax.annotation.Nullable;

public class crp extends csk implements csm {
   protected static final float a = 3.0F;
   protected static final float b = 5.0F;
   protected static final float c = 1.5F;
   protected static final ehy d = csk.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final ehy e = csk.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final ehy f = csk.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dfy g = dfo.aq;
   public static final dfw<dfk> h = dfo.bk;
   public static final dfy i = dfo.aU;
   public static final int j = 16;
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 0;
   public static final int n = 1;

   public crp(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(g, Integer.valueOf(0)).a(h, dfk.a).a(i, Integer.valueOf(0)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(g, h, i);
   }

   @Override
   public boolean c(dey $$0, coq $$1, gv $$2) {
      return true;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      ehy $$4 = $$0.c(h) == dfk.c ? e : d;
      ehf $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }

   @Override
   public ehy c(dey $$0, coq $$1, gv $$2, ehk $$3) {
      ehf $$4 = $$0.n($$1, $$2);
      return f.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a_(dey $$0, coq $$1, gv $$2) {
      return false;
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      eab $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dey $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(apj.at)) {
            if ($$2.a(csl.mY)) {
               return this.n().a(g, Integer.valueOf(0));
            } else if ($$2.a(csl.mZ)) {
               int $$3 = $$2.c(g) > 0 ? 1 : 0;
               return this.n().a(g, Integer.valueOf($$3));
            } else {
               dey $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(csl.mZ) ? this.n().a(g, $$4.c(g)) : csl.mY.n();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean e_(dey $$0) {
      return $$0.c(i) == 0;
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$0.c(i) == 0) {
         if ($$3.a(3) == 0 && $$1.t($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return $$1.a_($$2.d()).a(apj.at);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == hb.b && $$2.a(csl.mZ) && $$2.c(g) > $$0.c(g)) {
         $$3.a($$4, $$0.a(g), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(i) != 1;
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return true;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         gv $$9 = $$2.b($$4);
         dey $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(i) == 1 || !$$0.t($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   public float a(dey $$0, cbl $$1, coq $$2, gv $$3) {
      return $$1.eR().d() instanceof ckh ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dey $$0, cpk $$1, gv $$2, art $$3, int $$4) {
      dey $$5 = $$1.a_($$2.d());
      gv $$6 = $$2.c(2);
      dey $$7 = $$1.a_($$6);
      dfk $$8 = dfk.a;
      if ($$4 >= 1) {
         if (!$$5.a(csl.mZ) || $$5.c(h) == dfk.a) {
            $$8 = dfk.b;
         } else if ($$5.a(csl.mZ) && $$5.c(h) != dfk.a) {
            $$8 = dfk.c;
            if ($$7.a(csl.mZ)) {
               $$1.a($$2.d(), $$5.a(h, dfk.b), 3);
               $$1.a($$6, $$7.a(h, dfk.a), 3);
            }
         }
      }

      int $$9 = $$0.c(g) != 1 && !$$7.a(csl.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.n().a(g, Integer.valueOf($$9)).a(h, $$8).a(i, Integer.valueOf($$10)), 3);
   }

   protected int a(coq $$0, gv $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(csl.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(coq $$0, gv $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(csl.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
