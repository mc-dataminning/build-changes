import javax.annotation.Nullable;

public class crr extends csm implements cso {
   protected static final float a = 3.0F;
   protected static final float b = 5.0F;
   protected static final float c = 1.5F;
   protected static final ehx d = csm.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final ehx e = csm.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final ehx f = csm.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dga g = dfq.aq;
   public static final dfy<dfm> h = dfq.bk;
   public static final dga i = dfq.aU;
   public static final int j = 16;
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 0;
   public static final int n = 1;

   public crr(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(g, Integer.valueOf(0)).a(h, dfm.a).a(i, Integer.valueOf(0)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(g, h, i);
   }

   @Override
   public boolean c(dfa $$0, cos $$1, gu $$2) {
      return true;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      ehx $$4 = $$0.c(h) == dfm.c ? e : d;
      ehe $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }

   @Override
   public ehx c(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      ehe $$4 = $$0.n($$1, $$2);
      return f.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a_(dfa $$0, cos $$1, gu $$2) {
      return false;
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      ead $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dfa $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(apl.at)) {
            if ($$2.a(csn.mY)) {
               return this.n().a(g, Integer.valueOf(0));
            } else if ($$2.a(csn.mZ)) {
               int $$3 = $$2.c(g) > 0 ? 1 : 0;
               return this.n().a(g, Integer.valueOf($$3));
            } else {
               dfa $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(csn.mZ) ? this.n().a(g, $$4.c(g)) : csn.mY.n();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean e_(dfa $$0) {
      return $$0.c(i) == 0;
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
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
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      return $$1.a_($$2.d()).a(apl.at);
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == ha.b && $$2.a(csn.mZ) && $$2.c(g) > $$0.c(g)) {
         $$3.a($$4, $$0.a(g), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(i) != 1;
   }

   @Override
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         gu $$9 = $$2.b($$4);
         dfa $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(i) == 1 || !$$0.t($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   public float a(dfa $$0, cbn $$1, cos $$2, gu $$3) {
      return $$1.eR().d() instanceof ckj ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dfa $$0, cpm $$1, gu $$2, aru $$3, int $$4) {
      dfa $$5 = $$1.a_($$2.d());
      gu $$6 = $$2.c(2);
      dfa $$7 = $$1.a_($$6);
      dfm $$8 = dfm.a;
      if ($$4 >= 1) {
         if (!$$5.a(csn.mZ) || $$5.c(h) == dfm.a) {
            $$8 = dfm.b;
         } else if ($$5.a(csn.mZ) && $$5.c(h) != dfm.a) {
            $$8 = dfm.c;
            if ($$7.a(csn.mZ)) {
               $$1.a($$2.d(), $$5.a(h, dfm.b), 3);
               $$1.a($$6, $$7.a(h, dfm.a), 3);
            }
         }
      }

      int $$9 = $$0.c(g) != 1 && !$$7.a(csn.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.n().a(g, Integer.valueOf($$9)).a(h, $$8).a(i, Integer.valueOf($$10)), 3);
   }

   protected int a(cos $$0, gu $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(csn.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(cos $$0, gu $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(csn.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
