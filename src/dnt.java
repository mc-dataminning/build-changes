import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dnt extends dfy implements dna {
   public static final MapCodec<dnt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtc.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dnt::new)
   );
   public static final dtw b = dju.aE;
   public static final dua<dub> c = dts.af;
   public static final dua<dul> d = dts.bi;
   public static final dtt e = dts.C;
   protected static final exv f = dnc.e;
   protected static final exv g = dnc.d;
   protected static final exv h = dfy.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final exv i = dfy.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final exv j = dfy.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final exv k = dfy.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final exv l = dfy.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final exv m = dfy.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final exv n = dfy.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final exv o = dfy.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final exv[] F = a(f, h, l, i, m);
   protected static final exv[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dfy J;
   protected final dtc H;

   @Override
   public MapCodec<? extends dnt> a() {
      return a;
   }

   private static exv[] a(exv $$0, exv $$1, exv $$2, exv $$3, exv $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(exv[]::new);
   }

   private static exv a(int $$0, exv $$1, exv $$2, exv $$3, exv $$4, exv $$5) {
      exv $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = exs.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = exs.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = exs.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = exs.a($$6, $$5);
      }

      return $$6;
   }

   protected dnt(dtc $$0, dtb.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ji.c).a(c, dub.b).a(d, dul.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
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
      ji $$1 = $$0.k();
      jd $$2 = $$0.a();
      epe $$3 = $$0.q().b_($$2);
      dtc $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != ji.a && ($$1 == ji.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dub.b : dub.a)
         .a(e, Boolean.valueOf($$3.a() == epf.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dul i(dtc $$0, dcc $$1, jd $$2) {
      ji $$3 = $$0.c(b);
      dtc $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         ji $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dul.d;
            }

            return dul.e;
         }
      }

      dtc $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         ji $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dul.b;
            }

            return dul.c;
         }
      }

      return dul.a;
   }

   private static boolean c(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      dtc $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(dtc $$0) {
      return $$0.b() instanceof dnt;
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      ji $$2 = $$0.c(b);
      dul $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == ji.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dmm.c).a(d, dul.c);
                  case c:
                     return $$0.a(dmm.c).a(d, dul.b);
                  case d:
                     return $$0.a(dmm.c).a(d, dul.e);
                  case e:
                     return $$0.a(dmm.c).a(d, dul.d);
                  default:
                     return $$0.a(dmm.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ji.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dmm.c).a(d, dul.b);
                  case c:
                     return $$0.a(dmm.c).a(d, dul.c);
                  case d:
                     return $$0.a(dmm.c).a(d, dul.e);
                  case e:
                     return $$0.a(dmm.c).a(d, dul.d);
                  case a:
                     return $$0.a(dmm.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
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
