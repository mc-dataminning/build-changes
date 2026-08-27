import javax.annotation.Nullable;

public class crq extends csl implements csn {
   protected static final float a = 3.0F;
   protected static final float b = 5.0F;
   protected static final float c = 1.5F;
   protected static final ehw d = csl.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final ehw e = csl.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final ehw f = csl.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dfz g = dfp.aq;
   public static final dfx<dfl> h = dfp.bk;
   public static final dfz i = dfp.aU;
   public static final int j = 16;
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 0;
   public static final int n = 1;

   public crq(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(g, Integer.valueOf(0)).a(h, dfl.a).a(i, Integer.valueOf(0)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(g, h, i);
   }

   @Override
   public boolean c(dez $$0, cor $$1, gu $$2) {
      return true;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      ehw $$4 = $$0.c(h) == dfl.c ? e : d;
      ehd $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }

   @Override
   public ehw c(dez $$0, cor $$1, gu $$2, ehi $$3) {
      ehd $$4 = $$0.n($$1, $$2);
      return f.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a_(dez $$0, cor $$1, gu $$2) {
      return false;
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      eac $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dez $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(apl.at)) {
            if ($$2.a(csm.mY)) {
               return this.n().a(g, Integer.valueOf(0));
            } else if ($$2.a(csm.mZ)) {
               int $$3 = $$2.c(g) > 0 ? 1 : 0;
               return this.n().a(g, Integer.valueOf($$3));
            } else {
               dez $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(csm.mZ) ? this.n().a(g, $$4.c(g)) : csm.mY.n();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean e_(dez $$0) {
      return $$0.c(i) == 0;
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
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
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return $$1.a_($$2.d()).a(apl.at);
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == ha.b && $$2.a(csm.mZ) && $$2.c(g) > $$0.c(g)) {
         $$3.a($$4, $$0.a(g), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(i) != 1;
   }

   @Override
   public boolean a(cpl $$0, aru $$1, gu $$2, dez $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dez $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         gu $$9 = $$2.b($$4);
         dez $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(i) == 1 || !$$0.t($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   public float a(dez $$0, cbm $$1, cor $$2, gu $$3) {
      return $$1.eR().d() instanceof cki ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dez $$0, cpl $$1, gu $$2, aru $$3, int $$4) {
      dez $$5 = $$1.a_($$2.d());
      gu $$6 = $$2.c(2);
      dez $$7 = $$1.a_($$6);
      dfl $$8 = dfl.a;
      if ($$4 >= 1) {
         if (!$$5.a(csm.mZ) || $$5.c(h) == dfl.a) {
            $$8 = dfl.b;
         } else if ($$5.a(csm.mZ) && $$5.c(h) != dfl.a) {
            $$8 = dfl.c;
            if ($$7.a(csm.mZ)) {
               $$1.a($$2.d(), $$5.a(h, dfl.b), 3);
               $$1.a($$6, $$7.a(h, dfl.a), 3);
            }
         }
      }

      int $$9 = $$0.c(g) != 1 && !$$7.a(csm.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.n().a(g, Integer.valueOf($$9)).a(h, $$8).a(i, Integer.valueOf($$10)), 3);
   }

   protected int a(cor $$0, gu $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(csm.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(cor $$0, gu $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(csm.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
