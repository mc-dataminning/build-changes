import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dnc extends dfi implements dmj {
   public static final MapCodec<dnc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsl.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dnc::new)
   );
   public static final dtf b = dje.aE;
   public static final dtj<dtk> c = dtb.af;
   public static final dtj<dtu> d = dtb.bi;
   public static final dtc e = dtb.C;
   protected static final exa f = dml.e;
   protected static final exa g = dml.d;
   protected static final exa h = dfi.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final exa i = dfi.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final exa j = dfi.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final exa k = dfi.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final exa l = dfi.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final exa m = dfi.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final exa n = dfi.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final exa o = dfi.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final exa[] F = a(f, h, l, i, m);
   protected static final exa[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dfi J;
   protected final dsl H;

   @Override
   public MapCodec<? extends dnc> a() {
      return a;
   }

   private static exa[] a(exa $$0, exa $$1, exa $$2, exa $$3, exa $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(exa[]::new);
   }

   private static exa a(int $$0, exa $$1, exa $$2, exa $$3, exa $$4, exa $$5) {
      exa $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = ewx.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = ewx.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = ewx.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = ewx.a($$6, $$5);
      }

      return $$6;
   }

   protected dnc(dsl $$0, dsk.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, jf.c).a(c, dtk.b).a(d, dtu.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean f_(dsl $$0) {
      return true;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return ($$0.c(c) == dtk.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dsl $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dsl a(cxn $$0) {
      jf $$1 = $$0.k();
      ja $$2 = $$0.a();
      eoj $$3 = $$0.q().b_($$2);
      dsl $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != jf.a && ($$1 == jf.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dtk.b : dtk.a)
         .a(e, Boolean.valueOf($$3.a() == eok.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dtu i(dsl $$0, dbm $$1, ja $$2) {
      jf $$3 = $$0.c(b);
      dsl $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         jf $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dtu.d;
            }

            return dtu.e;
         }
      }

      dsl $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         jf $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dtu.b;
            }

            return dtu.c;
         }
      }

      return dtu.a;
   }

   private static boolean c(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      dsl $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(dsl $$0) {
      return $$0.b() instanceof dnc;
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      jf $$2 = $$0.c(b);
      dtu $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jf.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dlv.c).a(d, dtu.c);
                  case c:
                     return $$0.a(dlv.c).a(d, dtu.b);
                  case d:
                     return $$0.a(dlv.c).a(d, dtu.e);
                  case e:
                     return $$0.a(dlv.c).a(d, dtu.d);
                  default:
                     return $$0.a(dlv.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jf.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dlv.c).a(d, dtu.b);
                  case c:
                     return $$0.a(dlv.c).a(d, dtu.c);
                  case d:
                     return $$0.a(dlv.c).a(d, dtu.e);
                  case e:
                     return $$0.a(dlv.c).a(d, dtu.d);
                  case a:
                     return $$0.a(dlv.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(e) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
