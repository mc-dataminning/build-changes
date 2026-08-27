import javax.annotation.Nullable;

public class dbc extends csl {
   public static final int a = 2;
   public static final int b = 1;
   public static final int c = 4;
   private static final ehw f = csl.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final ehw g = csl.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dfz d = dfp.aE;
   public static final dfz e = dfp.aD;

   public dbc(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(d, Integer.valueOf(0)).a(e, Integer.valueOf(1)));
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, bii $$3) {
      if (!$$3.bS()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cpl $$0, dez $$1, gu $$2, bii $$3, float $$4) {
      if (!($$3 instanceof bzt)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(cpl $$0, dez $$1, gu $$2, bii $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(csm.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(cpl $$0, gu $$1, dez $$2) {
      $$0.a(null, $$1, aow.yl, aox.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(e);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(e, Integer.valueOf($$3 - 1)), 2);
         $$0.a(djj.f, $$1, djj.a.a($$2));
         $$0.c(2001, $$1, csl.i($$2));
      }
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(d);
         if ($$4 < 2) {
            $$1.a(null, $$2, aow.ym, aox.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(d, Integer.valueOf($$4 + 1)), 2);
            $$1.a(djj.c, $$2, djj.a.a($$0));
         } else {
            $$1.a(null, $$2, aow.yn, aox.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(djj.f, $$2, djj.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(e); $$5++) {
               $$1.c(2001, $$2, csl.i($$0));
               bvk $$6 = bim.bd.a((cpl)$$1);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.i($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(cor $$0, gu $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(cor $$0, gu $$1) {
      return $$0.a_($$1).a(apl.H);
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2005, $$2, 0);
      }
   }

   private boolean a(cpl $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(cpl $$0, cbm $$1, gu $$2, dez $$3, @Nullable dcl $$4, cix $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   public boolean a(dez $$0, clf $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      dez $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : super.a($$0);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return $$0.c(e) > 1 ? g : f;
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(d, e);
   }

   private boolean a(cpl $$0, bii $$1) {
      if ($$1 instanceof bvk || $$1 instanceof bue) {
         return false;
      } else {
         return !($$1 instanceof biy) ? false : $$1 instanceof cbm || $$0.X().b(cph.c);
      }
   }
}
