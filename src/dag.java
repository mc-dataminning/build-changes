import java.util.stream.IntStream;

public class dag extends csm implements czn {
   public static final dfu a = cwf.aC;
   public static final dfy<dfz> b = dfq.af;
   public static final dfy<dgj> c = dfq.bi;
   public static final dfr d = dfq.C;
   protected static final ehx e = czp.d;
   protected static final ehx f = czp.c;
   protected static final ehx g = csm.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final ehx h = csm.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final ehx i = csm.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final ehx j = csm.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final ehx k = csm.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final ehx l = csm.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final ehx m = csm.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final ehx n = csm.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final ehx[] D = a(e, g, k, h, l);
   protected static final ehx[] E = a(f, i, m, j, n);
   private static final int[] F = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final csm G;
   private final dfa H;

   private static ehx[] a(ehx $$0, ehx $$1, ehx $$2, ehx $$3, ehx $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(ehx[]::new);
   }

   private static ehx a(int $$0, ehx $$1, ehx $$2, ehx $$3, ehx $$4, ehx $$5) {
      ehx $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = ehu.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = ehu.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = ehu.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = ehu.a($$6, $$5);
      }

      return $$6;
   }

   protected dag(dfa $$0, dez.d $$1) {
      super($$1);
      this.k(this.C.b().a(a, ha.c).a(b, dfz.b).a(c, dgj.a).a(d, Boolean.valueOf(false)));
      this.G = $$0.b();
      this.H = $$0;
   }

   @Override
   public boolean g_(dfa $$0) {
      return true;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return ($$0.c(b) == dfz.a ? D : E)[F[this.n($$0)]];
   }

   private int n(dfa $$0) {
      return $$0.c(c).ordinal() * 4 + $$0.c(a).e();
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, cbn $$3) {
      this.H.a($$1, $$2, $$3);
   }

   @Override
   public void a(cpn $$0, gu $$1, dfa $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public float d() {
      return this.G.d();
   }

   @Override
   public void b(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$0.a($$0.b())) {
         $$1.a(this.H, $$2, csn.a, $$2, false);
         this.G.b(this.H, $$1, $$2, $$3, false);
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         this.H.b($$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, bii $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dfa $$0) {
      return this.G.e_($$0);
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      this.G.b($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      return this.H.a($$1, $$3, $$4, $$5);
   }

   @Override
   public void a(cpm $$0, gu $$1, cpe $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public dfa a(clg $$0) {
      ha $$1 = $$0.k();
      gu $$2 = $$0.a();
      ead $$3 = $$0.q().b_($$2);
      dfa $$4 = this.n()
         .a(a, $$0.g())
         .a(b, $$1 != ha.a && ($$1 == ha.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dfz.b : dfz.a)
         .a(d, Boolean.valueOf($$3.a() == eae.c));
      return $$4.a(c, i($$4, $$0.q(), $$2));
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(c, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dgj i(dfa $$0, cos $$1, gu $$2) {
      ha $$3 = $$0.c(a);
      dfa $$4 = $$1.a_($$2.a($$3));
      if (h($$4) && $$0.c(b) == $$4.c(b)) {
         ha $$5 = $$4.c(a);
         if ($$5.o() != $$0.c(a).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dgj.d;
            }

            return dgj.e;
         }
      }

      dfa $$6 = $$1.a_($$2.a($$3.g()));
      if (h($$6) && $$0.c(b) == $$6.c(b)) {
         ha $$7 = $$6.c(a);
         if ($$7.o() != $$0.c(a).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dgj.b;
            }

            return dgj.c;
         }
      }

      return dgj.a;
   }

   private static boolean c(dfa $$0, cos $$1, gu $$2, ha $$3) {
      dfa $$4 = $$1.a_($$2.a($$3));
      return !h($$4) || $$4.c(a) != $$0.c(a) || $$4.c(b) != $$0.c(b);
   }

   public static boolean h(dfa $$0) {
      return $$0.b() instanceof dag;
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      ha $$2 = $$0.c(a);
      dgj $$3 = $$0.c(c);
      switch ($$1) {
         case b:
            if ($$2.o() == ha.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(cyy.c).a(c, dgj.c);
                  case c:
                     return $$0.a(cyy.c).a(c, dgj.b);
                  case d:
                     return $$0.a(cyy.c).a(c, dgj.e);
                  case e:
                     return $$0.a(cyy.c).a(c, dgj.d);
                  default:
                     return $$0.a(cyy.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ha.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(cyy.c).a(c, dgj.b);
                  case c:
                     return $$0.a(cyy.c).a(c, dgj.c);
                  case d:
                     return $$0.a(cyy.c).a(c, dgj.e);
                  case e:
                     return $$0.a(cyy.c).a(c, dgj.d);
                  case a:
                     return $$0.a(cyy.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, b, c, d);
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(d) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }
}
