import javax.annotation.Nullable;

public class cyi extends cuz implements csx {
   public static final dgj b = dfz.at;
   public static final int c = 4;
   private static final int d = 3;
   private static final int e = 1;
   private static final eig f = csv.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final eig g = csv.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final eig h = csv.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final eig i = csv.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final eig[] j = new eig[]{csv.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), f};
   private static final eig[] k = new eig[]{h, csv.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), g, g, g};

   public cyi(dfi.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      return this.n();
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return $$0.c(a) == dgf.a ? j[Math.min(Math.abs(4 - ($$0.c(b) + 1)), j.length - 1)] : k[$$0.c(b)];
   }

   @Override
   public eig c(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      if ($$0.c(b) == 0) {
         return h;
      } else {
         return $$0.c(a) == dgf.b ? i : super.c($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if (b($$0.c(b))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : csw.a.n();
      }
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      return h($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean d(dfj $$0, cpb $$1, gw $$2) {
      return $$0.a(csw.cC);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(b);
      super.a($$0);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
      if ($$3 instanceof bzn && $$1.X().b(cpr.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dfj $$0, cln $$1) {
      return false;
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, bjg $$3, cjf $$4) {
   }

   @Override
   public boolean e_(dfj $$0) {
      return $$0.c(a) == dgf.b && !this.n($$0);
   }

   @Override
   public void b(dfj $$0, akr $$1, gw $$2, asc $$3) {
      float $$4 = cum.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(akr $$0, dfj $$1, gw $$2, int $$3) {
      int $$4 = Math.min($$1.c(b) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dfj $$5 = $$1.a(b, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(a, dgf.a), 3);
         }
      }
   }

   private static boolean a(cpy $$0, gw $$1) {
      dfj $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(csw.kB);
   }

   private static boolean b(cpy $$0, gw $$1) {
      return cum.a($$0, $$1);
   }

   private static boolean h(dfj $$0) {
      return $$0.a(csw.kB) && $$0.c(a) == dgf.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(cpy $$0, gw $$1, dfj $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dfj $$0) {
      return $$0.c(b) >= 4;
   }

   @Nullable
   private cyi.a c(cpy $$0, gw $$1, dfj $$2) {
      if (h($$2)) {
         return new cyi.a($$1, $$2);
      } else {
         gw $$3 = $$1.d();
         dfj $$4 = $$0.a_($$3);
         return h($$4) ? new cyi.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfj $$2) {
      cyi.a $$3 = this.c($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(b) + 1);
   }

   @Override
   public boolean a(cpv $$0, asc $$1, gw $$2, dfj $$3) {
      return true;
   }

   @Override
   public void a(akr $$0, asc $$1, gw $$2, dfj $$3) {
      cyi.a $$4 = this.c($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(gw a, dfj b) {
   }
}
