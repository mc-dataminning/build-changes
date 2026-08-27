import java.util.stream.IntStream;

public class daf extends csl implements czm {
   public static final dft a = cwe.aC;
   public static final dfx<dfy> b = dfp.af;
   public static final dfx<dgi> c = dfp.bi;
   public static final dfq d = dfp.C;
   protected static final ehw e = czo.d;
   protected static final ehw f = czo.c;
   protected static final ehw g = csl.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final ehw h = csl.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final ehw i = csl.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final ehw j = csl.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final ehw k = csl.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final ehw l = csl.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final ehw m = csl.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final ehw n = csl.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final ehw[] D = a(e, g, k, h, l);
   protected static final ehw[] E = a(f, i, m, j, n);
   private static final int[] F = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final csl G;
   private final dez H;

   private static ehw[] a(ehw $$0, ehw $$1, ehw $$2, ehw $$3, ehw $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(ehw[]::new);
   }

   private static ehw a(int $$0, ehw $$1, ehw $$2, ehw $$3, ehw $$4, ehw $$5) {
      ehw $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = eht.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = eht.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = eht.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = eht.a($$6, $$5);
      }

      return $$6;
   }

   protected daf(dez $$0, dey.d $$1) {
      super($$1);
      this.k(this.C.b().a(a, ha.c).a(b, dfy.b).a(c, dgi.a).a(d, Boolean.valueOf(false)));
      this.G = $$0.b();
      this.H = $$0;
   }

   @Override
   public boolean g_(dez $$0) {
      return true;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return ($$0.c(b) == dfy.a ? D : E)[F[this.n($$0)]];
   }

   private int n(dez $$0) {
      return $$0.c(c).ordinal() * 4 + $$0.c(a).e();
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, cbm $$3) {
      this.H.a($$1, $$2, $$3);
   }

   @Override
   public void a(cpm $$0, gu $$1, dez $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public float d() {
      return this.G.d();
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$0.a($$0.b())) {
         $$1.a(this.H, $$2, csm.a, $$2, false);
         this.G.b(this.H, $$1, $$2, $$3, false);
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         this.H.b($$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, bii $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dez $$0) {
      return this.G.e_($$0);
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      this.G.b($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      return this.H.a($$1, $$3, $$4, $$5);
   }

   @Override
   public void a(cpl $$0, gu $$1, cpd $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public dez a(clf $$0) {
      ha $$1 = $$0.k();
      gu $$2 = $$0.a();
      eac $$3 = $$0.q().b_($$2);
      dez $$4 = this.n()
         .a(a, $$0.g())
         .a(b, $$1 != ha.a && ($$1 == ha.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dfy.b : dfy.a)
         .a(d, Boolean.valueOf($$3.a() == ead.c));
      return $$4.a(c, i($$4, $$0.q(), $$2));
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(c, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dgi i(dez $$0, cor $$1, gu $$2) {
      ha $$3 = $$0.c(a);
      dez $$4 = $$1.a_($$2.a($$3));
      if (h($$4) && $$0.c(b) == $$4.c(b)) {
         ha $$5 = $$4.c(a);
         if ($$5.o() != $$0.c(a).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dgi.d;
            }

            return dgi.e;
         }
      }

      dez $$6 = $$1.a_($$2.a($$3.g()));
      if (h($$6) && $$0.c(b) == $$6.c(b)) {
         ha $$7 = $$6.c(a);
         if ($$7.o() != $$0.c(a).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dgi.b;
            }

            return dgi.c;
         }
      }

      return dgi.a;
   }

   private static boolean c(dez $$0, cor $$1, gu $$2, ha $$3) {
      dez $$4 = $$1.a_($$2.a($$3));
      return !h($$4) || $$4.c(a) != $$0.c(a) || $$4.c(b) != $$0.c(b);
   }

   public static boolean h(dez $$0) {
      return $$0.b() instanceof daf;
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      ha $$2 = $$0.c(a);
      dgi $$3 = $$0.c(c);
      switch ($$1) {
         case b:
            if ($$2.o() == ha.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(cyx.c).a(c, dgi.c);
                  case c:
                     return $$0.a(cyx.c).a(c, dgi.b);
                  case d:
                     return $$0.a(cyx.c).a(c, dgi.e);
                  case e:
                     return $$0.a(cyx.c).a(c, dgi.d);
                  default:
                     return $$0.a(cyx.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ha.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(cyx.c).a(c, dgi.b);
                  case c:
                     return $$0.a(cyx.c).a(c, dgi.c);
                  case d:
                     return $$0.a(cyx.c).a(c, dgi.e);
                  case e:
                     return $$0.a(cyx.c).a(c, dgi.d);
                  case a:
                     return $$0.a(cyx.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b, c, d);
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(d) ? ead.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }
}
