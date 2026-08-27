import java.util.stream.IntStream;

public class dak extends csq implements czr {
   public static final dfy a = cwj.aC;
   public static final dgc<dgd> b = dfu.af;
   public static final dgc<dgn> c = dfu.bi;
   public static final dfv d = dfu.C;
   protected static final eib e = czt.d;
   protected static final eib f = czt.c;
   protected static final eib g = csq.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final eib h = csq.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final eib i = csq.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final eib j = csq.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final eib k = csq.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final eib l = csq.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final eib m = csq.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final eib n = csq.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final eib[] D = a(e, g, k, h, l);
   protected static final eib[] E = a(f, i, m, j, n);
   private static final int[] F = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final csq G;
   private final dfe H;

   private static eib[] a(eib $$0, eib $$1, eib $$2, eib $$3, eib $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(eib[]::new);
   }

   private static eib a(int $$0, eib $$1, eib $$2, eib $$3, eib $$4, eib $$5) {
      eib $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = ehy.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = ehy.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = ehy.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = ehy.a($$6, $$5);
      }

      return $$6;
   }

   protected dak(dfe $$0, dfd.d $$1) {
      super($$1);
      this.k(this.C.b().a(a, hc.c).a(b, dgd.b).a(c, dgn.a).a(d, Boolean.valueOf(false)));
      this.G = $$0.b();
      this.H = $$0;
   }

   @Override
   public boolean g_(dfe $$0) {
      return true;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return ($$0.c(b) == dgd.a ? D : E)[F[this.n($$0)]];
   }

   private int n(dfe $$0) {
      return $$0.c(c).ordinal() * 4 + $$0.c(a).e();
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, cbp $$3) {
      this.H.a($$1, $$2, $$3);
   }

   @Override
   public void a(cpr $$0, gw $$1, dfe $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public float d() {
      return this.G.d();
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$0.a($$0.b())) {
         $$1.a(this.H, $$2, csr.a, $$2, false);
         this.G.b(this.H, $$1, $$2, $$3, false);
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         this.H.b($$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bil $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dfe $$0) {
      return this.G.e_($$0);
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      this.G.b($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      return this.H.a($$1, $$3, $$4, $$5);
   }

   @Override
   public void a(cpq $$0, gw $$1, cpi $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public dfe a(cli $$0) {
      hc $$1 = $$0.k();
      gw $$2 = $$0.a();
      eah $$3 = $$0.q().b_($$2);
      dfe $$4 = this.n()
         .a(a, $$0.g())
         .a(b, $$1 != hc.a && ($$1 == hc.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dgd.b : dgd.a)
         .a(d, Boolean.valueOf($$3.a() == eai.c));
      return $$4.a(c, i($$4, $$0.q(), $$2));
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(c, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dgn i(dfe $$0, cow $$1, gw $$2) {
      hc $$3 = $$0.c(a);
      dfe $$4 = $$1.a_($$2.a($$3));
      if (h($$4) && $$0.c(b) == $$4.c(b)) {
         hc $$5 = $$4.c(a);
         if ($$5.o() != $$0.c(a).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dgn.d;
            }

            return dgn.e;
         }
      }

      dfe $$6 = $$1.a_($$2.a($$3.g()));
      if (h($$6) && $$0.c(b) == $$6.c(b)) {
         hc $$7 = $$6.c(a);
         if ($$7.o() != $$0.c(a).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dgn.b;
            }

            return dgn.c;
         }
      }

      return dgn.a;
   }

   private static boolean c(dfe $$0, cow $$1, gw $$2, hc $$3) {
      dfe $$4 = $$1.a_($$2.a($$3));
      return !h($$4) || $$4.c(a) != $$0.c(a) || $$4.c(b) != $$0.c(b);
   }

   public static boolean h(dfe $$0) {
      return $$0.b() instanceof dak;
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      hc $$2 = $$0.c(a);
      dgn $$3 = $$0.c(c);
      switch ($$1) {
         case b:
            if ($$2.o() == hc.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(czc.c).a(c, dgn.c);
                  case c:
                     return $$0.a(czc.c).a(c, dgn.b);
                  case d:
                     return $$0.a(czc.c).a(c, dgn.e);
                  case e:
                     return $$0.a(czc.c).a(c, dgn.d);
                  default:
                     return $$0.a(czc.c);
               }
            }
            break;
         case c:
            if ($$2.o() == hc.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(czc.c).a(c, dgn.b);
                  case c:
                     return $$0.a(czc.c).a(c, dgn.c);
                  case d:
                     return $$0.a(czc.c).a(c, dgn.e);
                  case e:
                     return $$0.a(czc.c).a(c, dgn.d);
                  case a:
                     return $$0.a(czc.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b, c, d);
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(d) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
