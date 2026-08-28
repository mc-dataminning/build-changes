import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dmu extends dfa implements dmb {
   public static final MapCodec<dmu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsd.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dmu::new)
   );
   public static final dsx b = diw.aE;
   public static final dtb<dtc> c = dst.af;
   public static final dtb<dtm> d = dst.bi;
   public static final dsu e = dst.C;
   protected static final ewl f = dmd.e;
   protected static final ewl g = dmd.d;
   protected static final ewl h = dfa.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final ewl i = dfa.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final ewl j = dfa.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final ewl k = dfa.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final ewl l = dfa.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final ewl m = dfa.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final ewl n = dfa.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final ewl o = dfa.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final ewl[] F = a(f, h, l, i, m);
   protected static final ewl[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dfa J;
   protected final dsd H;

   @Override
   public MapCodec<? extends dmu> a() {
      return a;
   }

   private static ewl[] a(ewl $$0, ewl $$1, ewl $$2, ewl $$3, ewl $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(ewl[]::new);
   }

   private static ewl a(int $$0, ewl $$1, ewl $$2, ewl $$3, ewl $$4, ewl $$5) {
      ewl $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = ewi.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = ewi.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = ewi.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = ewi.a($$6, $$5);
      }

      return $$6;
   }

   protected dmu(dsd $$0, dsc.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, je.c).a(c, dtc.b).a(d, dtm.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean f_(dsd $$0) {
      return true;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return ($$0.c(c) == dtc.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dsd $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dsd a(cyb $$0) {
      je $$1 = $$0.k();
      iz $$2 = $$0.a();
      enw $$3 = $$0.q().b_($$2);
      dsd $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != je.a && ($$1 == je.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dtc.b : dtc.a)
         .a(e, Boolean.valueOf($$3.a() == enx.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dtm i(dsd $$0, dbf $$1, iz $$2) {
      je $$3 = $$0.c(b);
      dsd $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         je $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dtm.d;
            }

            return dtm.e;
         }
      }

      dsd $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         je $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dtm.b;
            }

            return dtm.c;
         }
      }

      return dtm.a;
   }

   private static boolean c(dsd $$0, dbf $$1, iz $$2, je $$3) {
      dsd $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(dsd $$0) {
      return $$0.b() instanceof dmu;
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      je $$2 = $$0.c(b);
      dtm $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == je.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dln.c).a(d, dtm.c);
                  case c:
                     return $$0.a(dln.c).a(d, dtm.b);
                  case d:
                     return $$0.a(dln.c).a(d, dtm.e);
                  case e:
                     return $$0.a(dln.c).a(d, dtm.d);
                  default:
                     return $$0.a(dln.c);
               }
            }
            break;
         case c:
            if ($$2.o() == je.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dln.c).a(d, dtm.b);
                  case c:
                     return $$0.a(dln.c).a(d, dtm.c);
                  case d:
                     return $$0.a(dln.c).a(d, dtm.e);
                  case e:
                     return $$0.a(dln.c).a(d, dtm.d);
                  case a:
                     return $$0.a(dln.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(e) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
