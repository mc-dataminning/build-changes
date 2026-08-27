import java.util.stream.IntStream;

public class dap extends csv implements czw {
   public static final dgd a = cwo.aC;
   public static final dgh<dgi> b = dfz.af;
   public static final dgh<dgs> c = dfz.bi;
   public static final dga d = dfz.C;
   protected static final eig e = czy.d;
   protected static final eig f = czy.c;
   protected static final eig g = csv.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final eig h = csv.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final eig i = csv.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final eig j = csv.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final eig k = csv.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final eig l = csv.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final eig m = csv.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final eig n = csv.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final eig[] D = a(e, g, k, h, l);
   protected static final eig[] E = a(f, i, m, j, n);
   private static final int[] F = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final csv G;
   private final dfj H;

   private static eig[] a(eig $$0, eig $$1, eig $$2, eig $$3, eig $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(eig[]::new);
   }

   private static eig a(int $$0, eig $$1, eig $$2, eig $$3, eig $$4, eig $$5) {
      eig $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = eid.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = eid.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = eid.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = eid.a($$6, $$5);
      }

      return $$6;
   }

   protected dap(dfj $$0, dfi.d $$1) {
      super($$1);
      this.k(this.C.b().a(a, hc.c).a(b, dgi.b).a(c, dgs.a).a(d, Boolean.valueOf(false)));
      this.G = $$0.b();
      this.H = $$0;
   }

   @Override
   public boolean g_(dfj $$0) {
      return true;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return ($$0.c(b) == dgi.a ? D : E)[F[this.n($$0)]];
   }

   private int n(dfj $$0) {
      return $$0.c(c).ordinal() * 4 + $$0.c(a).e();
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, cbu $$3) {
      this.H.a($$1, $$2, $$3);
   }

   @Override
   public void a(cpw $$0, gw $$1, dfj $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public float d() {
      return this.G.d();
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$0.a($$0.b())) {
         $$1.a(this.H, $$2, csw.a, $$2, false);
         this.G.b(this.H, $$1, $$2, $$3, false);
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         this.H.b($$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, biq $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dfj $$0) {
      return this.G.e_($$0);
   }

   @Override
   public void b(dfj $$0, akr $$1, gw $$2, asc $$3) {
      this.G.b($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfj $$0, akr $$1, gw $$2, asc $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      return this.H.a($$1, $$3, $$4, $$5);
   }

   @Override
   public void a(cpv $$0, gw $$1, cpn $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public dfj a(cln $$0) {
      hc $$1 = $$0.k();
      gw $$2 = $$0.a();
      eam $$3 = $$0.q().b_($$2);
      dfj $$4 = this.n()
         .a(a, $$0.g())
         .a(b, $$1 != hc.a && ($$1 == hc.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dgi.b : dgi.a)
         .a(d, Boolean.valueOf($$3.a() == ean.c));
      return $$4.a(c, i($$4, $$0.q(), $$2));
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(c, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dgs i(dfj $$0, cpb $$1, gw $$2) {
      hc $$3 = $$0.c(a);
      dfj $$4 = $$1.a_($$2.a($$3));
      if (h($$4) && $$0.c(b) == $$4.c(b)) {
         hc $$5 = $$4.c(a);
         if ($$5.o() != $$0.c(a).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dgs.d;
            }

            return dgs.e;
         }
      }

      dfj $$6 = $$1.a_($$2.a($$3.g()));
      if (h($$6) && $$0.c(b) == $$6.c(b)) {
         hc $$7 = $$6.c(a);
         if ($$7.o() != $$0.c(a).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dgs.b;
            }

            return dgs.c;
         }
      }

      return dgs.a;
   }

   private static boolean c(dfj $$0, cpb $$1, gw $$2, hc $$3) {
      dfj $$4 = $$1.a_($$2.a($$3));
      return !h($$4) || $$4.c(a) != $$0.c(a) || $$4.c(b) != $$0.c(b);
   }

   public static boolean h(dfj $$0) {
      return $$0.b() instanceof dap;
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      hc $$2 = $$0.c(a);
      dgs $$3 = $$0.c(c);
      switch ($$1) {
         case b:
            if ($$2.o() == hc.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(czh.c).a(c, dgs.c);
                  case c:
                     return $$0.a(czh.c).a(c, dgs.b);
                  case d:
                     return $$0.a(czh.c).a(c, dgs.e);
                  case e:
                     return $$0.a(czh.c).a(c, dgs.d);
                  default:
                     return $$0.a(czh.c);
               }
            }
            break;
         case c:
            if ($$2.o() == hc.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(czh.c).a(c, dgs.b);
                  case c:
                     return $$0.a(czh.c).a(c, dgs.c);
                  case d:
                     return $$0.a(czh.c).a(c, dgs.e);
                  case e:
                     return $$0.a(czh.c).a(c, dgs.d);
                  case a:
                     return $$0.a(czh.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, b, c, d);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(d) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
