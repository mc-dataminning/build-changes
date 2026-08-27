import java.util.stream.IntStream;

public class dae extends csk implements czl {
   public static final dfs a = cwd.aC;
   public static final dfw<dfx> b = dfo.af;
   public static final dfw<dgh> c = dfo.bi;
   public static final dfp d = dfo.C;
   protected static final ehy e = czn.d;
   protected static final ehy f = czn.c;
   protected static final ehy g = csk.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final ehy h = csk.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final ehy i = csk.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final ehy j = csk.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final ehy k = csk.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final ehy l = csk.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final ehy m = csk.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final ehy n = csk.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final ehy[] D = a(e, g, k, h, l);
   protected static final ehy[] E = a(f, i, m, j, n);
   private static final int[] F = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final csk G;
   private final dey H;

   private static ehy[] a(ehy $$0, ehy $$1, ehy $$2, ehy $$3, ehy $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(ehy[]::new);
   }

   private static ehy a(int $$0, ehy $$1, ehy $$2, ehy $$3, ehy $$4, ehy $$5) {
      ehy $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = ehv.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = ehv.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = ehv.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = ehv.a($$6, $$5);
      }

      return $$6;
   }

   protected dae(dey $$0, dex.d $$1) {
      super($$1);
      this.k(this.C.b().a(a, hb.c).a(b, dfx.b).a(c, dgh.a).a(d, Boolean.valueOf(false)));
      this.G = $$0.b();
      this.H = $$0;
   }

   @Override
   public boolean g_(dey $$0) {
      return true;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return ($$0.c(b) == dfx.a ? D : E)[F[this.n($$0)]];
   }

   private int n(dey $$0) {
      return $$0.c(c).ordinal() * 4 + $$0.c(a).e();
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, cbl $$3) {
      this.H.a($$1, $$2, $$3);
   }

   @Override
   public void a(cpl $$0, gv $$1, dey $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public float d() {
      return this.G.d();
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$0.a($$0.b())) {
         $$1.a(this.H, $$2, csl.a, $$2, false);
         this.G.b(this.H, $$1, $$2, $$3, false);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         this.H.b($$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, big $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dey $$0) {
      return this.G.e_($$0);
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      this.G.b($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      return this.H.a($$1, $$3, $$4, $$5);
   }

   @Override
   public void a(cpk $$0, gv $$1, cpc $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public dey a(cle $$0) {
      hb $$1 = $$0.k();
      gv $$2 = $$0.a();
      eab $$3 = $$0.q().b_($$2);
      dey $$4 = this.n()
         .a(a, $$0.g())
         .a(b, $$1 != hb.a && ($$1 == hb.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dfx.b : dfx.a)
         .a(d, Boolean.valueOf($$3.a() == eac.c));
      return $$4.a(c, i($$4, $$0.q(), $$2));
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(c, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dgh i(dey $$0, coq $$1, gv $$2) {
      hb $$3 = $$0.c(a);
      dey $$4 = $$1.a_($$2.a($$3));
      if (h($$4) && $$0.c(b) == $$4.c(b)) {
         hb $$5 = $$4.c(a);
         if ($$5.o() != $$0.c(a).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dgh.d;
            }

            return dgh.e;
         }
      }

      dey $$6 = $$1.a_($$2.a($$3.g()));
      if (h($$6) && $$0.c(b) == $$6.c(b)) {
         hb $$7 = $$6.c(a);
         if ($$7.o() != $$0.c(a).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dgh.b;
            }

            return dgh.c;
         }
      }

      return dgh.a;
   }

   private static boolean c(dey $$0, coq $$1, gv $$2, hb $$3) {
      dey $$4 = $$1.a_($$2.a($$3));
      return !h($$4) || $$4.c(a) != $$0.c(a) || $$4.c(b) != $$0.c(b);
   }

   public static boolean h(dey $$0) {
      return $$0.b() instanceof dae;
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      hb $$2 = $$0.c(a);
      dgh $$3 = $$0.c(c);
      switch ($$1) {
         case b:
            if ($$2.o() == hb.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(cyw.c).a(c, dgh.c);
                  case c:
                     return $$0.a(cyw.c).a(c, dgh.b);
                  case d:
                     return $$0.a(cyw.c).a(c, dgh.e);
                  case e:
                     return $$0.a(cyw.c).a(c, dgh.d);
                  default:
                     return $$0.a(cyw.c);
               }
            }
            break;
         case c:
            if ($$2.o() == hb.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(cyw.c).a(c, dgh.b);
                  case c:
                     return $$0.a(cyw.c).a(c, dgh.c);
                  case d:
                     return $$0.a(cyw.c).a(c, dgh.e);
                  case e:
                     return $$0.a(cyw.c).a(c, dgh.d);
                  case a:
                     return $$0.a(cyw.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b, c, d);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(d) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
