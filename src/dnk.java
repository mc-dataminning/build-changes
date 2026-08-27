import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dnk extends dfc implements dmr {
   public static final MapCodec<dnk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtc.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dnk::new)
   );
   public static final dtw b = djc.aE;
   public static final dua<dub> c = dts.af;
   public static final dua<dul> d = dts.bi;
   public static final dtt e = dts.C;
   protected static final exn f = dmt.e;
   protected static final exn g = dmt.d;
   protected static final exn h = dfc.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final exn i = dfc.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final exn j = dfc.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final exn k = dfc.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final exn l = dfc.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final exn m = dfc.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final exn n = dfc.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final exn o = dfc.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final exn[] F = a(f, h, l, i, m);
   protected static final exn[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dfc J;
   protected final dtc H;

   @Override
   public MapCodec<? extends dnk> a() {
      return a;
   }

   private static exn[] a(exn $$0, exn $$1, exn $$2, exn $$3, exn $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(exn[]::new);
   }

   private static exn a(int $$0, exn $$1, exn $$2, exn $$3, exn $$4, exn $$5) {
      exn $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = exk.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = exk.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = exk.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = exk.a($$6, $$5);
      }

      return $$6;
   }

   protected dnk(dtc $$0, dtb.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, iw.c).a(c, dub.b).a(d, dul.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return ($$0.c(c) == dub.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dtc $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dtc a(cyd $$0) {
      iw $$1 = $$0.k();
      ir $$2 = $$0.a();
      epe $$3 = $$0.q().b_($$2);
      dtc $$4 = this.n()
         .a(b, $$0.g())
         .a(c, $$1 != iw.a && ($$1 == iw.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dub.b : dub.a)
         .a(e, Boolean.valueOf($$3.a() == epf.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dul i(dtc $$0, dbg $$1, ir $$2) {
      iw $$3 = $$0.c(b);
      dtc $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         iw $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dul.d;
            }

            return dul.e;
         }
      }

      dtc $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         iw $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dul.b;
            }

            return dul.c;
         }
      }

      return dul.a;
   }

   private static boolean c(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      dtc $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(dtc $$0) {
      return $$0.b() instanceof dnk;
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      iw $$2 = $$0.c(b);
      dul $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == iw.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dmd.c).a(d, dul.c);
                  case c:
                     return $$0.a(dmd.c).a(d, dul.b);
                  case d:
                     return $$0.a(dmd.c).a(d, dul.e);
                  case e:
                     return $$0.a(dmd.c).a(d, dul.d);
                  default:
                     return $$0.a(dmd.c);
               }
            }
            break;
         case c:
            if ($$2.o() == iw.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dmd.c).a(d, dul.b);
                  case c:
                     return $$0.a(dmd.c).a(d, dul.c);
                  case d:
                     return $$0.a(dmd.c).a(d, dul.e);
                  case e:
                     return $$0.a(dmd.c).a(d, dul.d);
                  case a:
                     return $$0.a(dmd.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(e) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
