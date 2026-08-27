import javax.annotation.Nullable;

public class dbd extends csm {
   public static final int a = 2;
   public static final int b = 1;
   public static final int c = 4;
   private static final ehx f = csm.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final ehx g = csm.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dga d = dfq.aE;
   public static final dga e = dfq.aD;

   public dbd(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(d, Integer.valueOf(0)).a(e, Integer.valueOf(1)));
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, bii $$3) {
      if (!$$3.bS()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cpm $$0, dfa $$1, gu $$2, bii $$3, float $$4) {
      if (!($$3 instanceof bzu)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(cpm $$0, dfa $$1, gu $$2, bii $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(csn.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(cpm $$0, gu $$1, dfa $$2) {
      $$0.a(null, $$1, aow.yg, aox.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(e);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(e, Integer.valueOf($$3 - 1)), 2);
         $$0.a(djk.f, $$1, djk.a.a($$2));
         $$0.c(2001, $$1, csm.i($$2));
      }
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(d);
         if ($$4 < 2) {
            $$1.a(null, $$2, aow.yh, aox.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(d, Integer.valueOf($$4 + 1)), 2);
            $$1.a(djk.c, $$2, djk.a.a($$0));
         } else {
            $$1.a(null, $$2, aow.yi, aox.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(djk.f, $$2, djk.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(e); $$5++) {
               $$1.c(2001, $$2, csm.i($$0));
               bvl $$6 = bim.bd.a((cpm)$$1);
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

   public static boolean a(cos $$0, gu $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(cos $$0, gu $$1) {
      return $$0.a_($$1).a(apl.H);
   }

   @Override
   public void b(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2005, $$2, 0);
      }
   }

   private boolean a(cpm $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(cpm $$0, cbn $$1, gu $$2, dfa $$3, @Nullable dcm $$4, ciy $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   public boolean a(dfa $$0, clg $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      dfa $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : super.a($$0);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return $$0.c(e) > 1 ? g : f;
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(d, e);
   }

   private boolean a(cpm $$0, bii $$1) {
      if ($$1 instanceof bvl || $$1 instanceof buf) {
         return false;
      } else {
         return !($$1 instanceof biy) ? false : $$1 instanceof cbn || $$0.X().b(cpi.c);
      }
   }
}
