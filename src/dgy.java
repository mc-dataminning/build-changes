import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dgy extends czf implements dgf {
   public static final MapCodec<dgy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dme.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dgy::new)
   );
   public static final dmy b = dda.aE;
   public static final dnc<dnd> c = dmu.af;
   public static final dnc<dnn> d = dmu.bi;
   public static final dmv e = dmu.C;
   protected static final epo f = dgh.e;
   protected static final epo g = dgh.d;
   protected static final epo h = czf.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final epo i = czf.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final epo j = czf.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final epo k = czf.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final epo l = czf.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final epo m = czf.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final epo n = czf.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final epo o = czf.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final epo[] F = a(f, h, l, i, m);
   protected static final epo[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final czf J;
   protected final dme H;

   @Override
   public MapCodec<? extends dgy> a() {
      return a;
   }

   private static epo[] a(epo $$0, epo $$1, epo $$2, epo $$3, epo $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(epo[]::new);
   }

   private static epo a(int $$0, epo $$1, epo $$2, epo $$3, epo $$4, epo $$5) {
      epo $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = epl.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = epl.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = epl.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = epl.a($$6, $$5);
      }

      return $$6;
   }

   protected dgy(dme $$0, dmd.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ih.c).a(c, dnd.b).a(d, dnn.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean g_(dme $$0) {
      return true;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return ($$0.c(c) == dnd.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dme $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dme a(crx $$0) {
      ih $$1 = $$0.k();
      ib $$2 = $$0.a();
      ehr $$3 = $$0.q().b_($$2);
      dme $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != ih.a && ($$1 == ih.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dnd.b : dnd.a)
         .a(e, Boolean.valueOf($$3.a() == ehs.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dnn i(dme $$0, cvk $$1, ib $$2) {
      ih $$3 = $$0.c(b);
      dme $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         ih $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dnn.d;
            }

            return dnn.e;
         }
      }

      dme $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         ih $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dnn.b;
            }

            return dnn.c;
         }
      }

      return dnn.a;
   }

   private static boolean c(dme $$0, cvk $$1, ib $$2, ih $$3) {
      dme $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(dme $$0) {
      return $$0.b() instanceof dgy;
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      ih $$2 = $$0.c(b);
      dnn $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == ih.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dfr.c).a(d, dnn.c);
                  case c:
                     return $$0.a(dfr.c).a(d, dnn.b);
                  case d:
                     return $$0.a(dfr.c).a(d, dnn.e);
                  case e:
                     return $$0.a(dfr.c).a(d, dnn.d);
                  default:
                     return $$0.a(dfr.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ih.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dfr.c).a(d, dnn.b);
                  case c:
                     return $$0.a(dfr.c).a(d, dnn.c);
                  case d:
                     return $$0.a(dfr.c).a(d, dnn.e);
                  case e:
                     return $$0.a(dfr.c).a(d, dnn.d);
                  case a:
                     return $$0.a(dfr.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(e) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
