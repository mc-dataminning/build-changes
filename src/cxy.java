import javax.annotation.Nullable;

public class cxy extends cup implements csn {
   public static final dfz b = dfp.at;
   public static final int c = 4;
   private static final int d = 3;
   private static final int e = 1;
   private static final ehw f = csl.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final ehw g = csl.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final ehw h = csl.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final ehw i = csl.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final ehw[] j = new ehw[]{csl.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), f};
   private static final ehw[] k = new ehw[]{h, csl.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), g, g, g};

   public cxy(dey.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      return this.n();
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return $$0.c(a) == dfv.a ? j[Math.min(Math.abs(4 - ($$0.c(b) + 1)), j.length - 1)] : k[$$0.c(b)];
   }

   @Override
   public ehw c(dez $$0, cor $$1, gu $$2, ehi $$3) {
      if ($$0.c(b) == 0) {
         return h;
      } else {
         return $$0.c(a) == dfv.b ? i : super.c($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if (b($$0.c(b))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : csm.a.n();
      }
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return h($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean d(dez $$0, cor $$1, gu $$2) {
      return $$0.a(csm.cC);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(b);
      super.a($$0);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, bii $$3) {
      if ($$3 instanceof bzf && $$1.X().b(cph.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dez $$0, clf $$1) {
      return false;
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, biy $$3, cix $$4) {
   }

   @Override
   public boolean e_(dez $$0) {
      return $$0.c(a) == dfv.b && !this.n($$0);
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      float $$4 = cuc.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(akk $$0, dez $$1, gu $$2, int $$3) {
      int $$4 = Math.min($$1.c(b) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dez $$5 = $$1.a(b, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(a, dfv.a), 3);
         }
      }
   }

   private static boolean a(cpo $$0, gu $$1) {
      dez $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(csm.kB);
   }

   private static boolean b(cpo $$0, gu $$1) {
      return cuc.a($$0, $$1);
   }

   private static boolean h(dez $$0) {
      return $$0.a(csm.kB) && $$0.c(a) == dfv.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(cpo $$0, gu $$1, dez $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dez $$0) {
      return $$0.c(b) >= 4;
   }

   @Nullable
   private cxy.a c(cpo $$0, gu $$1, dez $$2) {
      if (h($$2)) {
         return new cxy.a($$1, $$2);
      } else {
         gu $$3 = $$1.d();
         dez $$4 = $$0.a_($$3);
         return h($$4) ? new cxy.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      cxy.a $$3 = this.c($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(b) + 1);
   }

   @Override
   public boolean a(cpl $$0, aru $$1, gu $$2, dez $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dez $$3) {
      cxy.a $$4 = this.c($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(gu a, dez b) {
   }
}
