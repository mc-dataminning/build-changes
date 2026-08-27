import java.util.Arrays;

public class dfd extends cuu {
   public static final dgh<dgl> b = dfz.bg;
   public static final dga c = dfz.x;
   public static final float d = 4.0F;
   protected static final eig e = csv.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eig f = csv.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final eig g = csv.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final eig h = csv.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final eig i = csv.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eig j = csv.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float k = 2.0F;
   protected static final float l = 6.0F;
   protected static final float m = 10.0F;
   protected static final eig n = csv.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eig D = csv.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final eig E = csv.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final eig F = csv.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final eig G = csv.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eig H = csv.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final eig I = csv.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eig J = csv.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eig K = csv.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final eig L = csv.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final eig M = csv.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eig N = csv.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final eig[] O = a(true);
   private static final eig[] P = a(false);

   private static eig[] a(boolean $$0) {
      return Arrays.stream(hc.values()).map($$1 -> a($$1, $$0)).toArray(eig[]::new);
   }

   private static eig a(hc $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return eid.a(j, $$1 ? J : D);
         case b:
            return eid.a(i, $$1 ? I : n);
         case c:
            return eid.a(h, $$1 ? L : F);
         case d:
            return eid.a(g, $$1 ? K : E);
         case e:
            return eid.a(f, $$1 ? N : H);
         case f:
            return eid.a(e, $$1 ? M : G);
      }
   }

   public dfd(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, dgl.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dfj $$0) {
      return true;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return ($$0.c(c) ? O : P)[$$0.c(a).ordinal()];
   }

   private boolean a(dfj $$0, dfj $$1) {
      csv $$2 = $$0.c(b) == dgl.a ? csw.by : csw.br;
      return $$1.a($$2) && $$1.c(dfc.b) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, cbu $$3) {
      if (!$$0.B && $$3.fS().d) {
         gw $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         gw $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      dfj $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(csw.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, csv $$3, gw $$4, boolean $$5) {
      if ($$0.a((cpy)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      return new cjf($$2.c(b) == dgl.b ? csw.br : csw.by);
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
