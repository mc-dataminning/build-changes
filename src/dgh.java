import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dgh extends cyo implements dfo {
   public static final MapCodec<dgh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dlf.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dgh::new)
   );
   public static final dlz b = dcj.aE;
   public static final dmd<dme> c = dlv.af;
   public static final dmd<dmo> d = dlv.bi;
   public static final dlw e = dlv.C;
   protected static final eol f = dfq.e;
   protected static final eol g = dfq.d;
   protected static final eol h = cyo.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final eol i = cyo.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final eol j = cyo.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final eol k = cyo.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final eol l = cyo.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final eol m = cyo.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final eol n = cyo.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final eol o = cyo.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final eol[] F = a(f, h, l, i, m);
   protected static final eol[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final cyo J;
   protected final dlf H;

   @Override
   public MapCodec<? extends dgh> a() {
      return a;
   }

   private static eol[] a(eol $$0, eol $$1, eol $$2, eol $$3, eol $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(eol[]::new);
   }

   private static eol a(int $$0, eol $$1, eol $$2, eol $$3, eol $$4, eol $$5) {
      eol $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = eoi.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = eoi.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = eoi.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = eoi.a($$6, $$5);
      }

      return $$6;
   }

   protected dgh(dlf $$0, dle.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ie.c).a(c, dme.b).a(d, dmo.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean g_(dlf $$0) {
      return true;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return ($$0.c(c) == dme.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dlf $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dlf a(crg $$0) {
      ie $$1 = $$0.k();
      hz $$2 = $$0.a();
      egp $$3 = $$0.q().b_($$2);
      dlf $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != ie.a && ($$1 == ie.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dme.b : dme.a)
         .a(e, Boolean.valueOf($$3.a() == egq.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dmo i(dlf $$0, cut $$1, hz $$2) {
      ie $$3 = $$0.c(b);
      dlf $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         ie $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dmo.d;
            }

            return dmo.e;
         }
      }

      dlf $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         ie $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dmo.b;
            }

            return dmo.c;
         }
      }

      return dmo.a;
   }

   private static boolean c(dlf $$0, cut $$1, hz $$2, ie $$3) {
      dlf $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(dlf $$0) {
      return $$0.b() instanceof dgh;
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      ie $$2 = $$0.c(b);
      dmo $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == ie.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dfa.c).a(d, dmo.c);
                  case c:
                     return $$0.a(dfa.c).a(d, dmo.b);
                  case d:
                     return $$0.a(dfa.c).a(d, dmo.e);
                  case e:
                     return $$0.a(dfa.c).a(d, dmo.d);
                  default:
                     return $$0.a(dfa.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ie.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dfa.c).a(d, dmo.b);
                  case c:
                     return $$0.a(dfa.c).a(d, dmo.c);
                  case d:
                     return $$0.a(dfa.c).a(d, dmo.e);
                  case e:
                     return $$0.a(dfa.c).a(d, dmo.d);
                  case a:
                     return $$0.a(dfa.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(e) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
