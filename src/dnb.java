import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dnb extends dfh implements dmi {
   public static final MapCodec<dnb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsk.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dnb::new)
   );
   public static final dte b = djd.aE;
   public static final dti<dtj> c = dta.af;
   public static final dti<dtt> d = dta.bi;
   public static final dtb e = dta.C;
   protected static final ewy f = dmk.e;
   protected static final ewy g = dmk.d;
   protected static final ewy h = dfh.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final ewy i = dfh.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final ewy j = dfh.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final ewy k = dfh.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final ewy l = dfh.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final ewy m = dfh.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final ewy n = dfh.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final ewy o = dfh.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final ewy[] F = a(f, h, l, i, m);
   protected static final ewy[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dfh J;
   protected final dsk H;

   @Override
   public MapCodec<? extends dnb> a() {
      return a;
   }

   private static ewy[] a(ewy $$0, ewy $$1, ewy $$2, ewy $$3, ewy $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(ewy[]::new);
   }

   private static ewy a(int $$0, ewy $$1, ewy $$2, ewy $$3, ewy $$4, ewy $$5) {
      ewy $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = ewv.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = ewv.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = ewv.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = ewv.a($$6, $$5);
      }

      return $$6;
   }

   protected dnb(dsk $$0, dsj.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, jf.c).a(c, dtj.b).a(d, dtt.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean f_(dsk $$0) {
      return true;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return ($$0.c(c) == dtj.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dsk $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dsk a(cxm $$0) {
      jf $$1 = $$0.k();
      ja $$2 = $$0.a();
      eoh $$3 = $$0.q().b_($$2);
      dsk $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != jf.a && ($$1 == jf.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dtj.b : dtj.a)
         .a(e, Boolean.valueOf($$3.a() == eoi.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dtt i(dsk $$0, dbl $$1, ja $$2) {
      jf $$3 = $$0.c(b);
      dsk $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         jf $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dtt.d;
            }

            return dtt.e;
         }
      }

      dsk $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         jf $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dtt.b;
            }

            return dtt.c;
         }
      }

      return dtt.a;
   }

   private static boolean c(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      dsk $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(dsk $$0) {
      return $$0.b() instanceof dnb;
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      jf $$2 = $$0.c(b);
      dtt $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jf.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dlu.c).a(d, dtt.c);
                  case c:
                     return $$0.a(dlu.c).a(d, dtt.b);
                  case d:
                     return $$0.a(dlu.c).a(d, dtt.e);
                  case e:
                     return $$0.a(dlu.c).a(d, dtt.d);
                  default:
                     return $$0.a(dlu.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jf.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dlu.c).a(d, dtt.b);
                  case c:
                     return $$0.a(dlu.c).a(d, dtt.c);
                  case d:
                     return $$0.a(dlu.c).a(d, dtt.e);
                  case e:
                     return $$0.a(dlu.c).a(d, dtt.d);
                  case a:
                     return $$0.a(dlu.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(e) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}
