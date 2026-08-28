import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dps extends dhy implements doz {
   public static final MapCodec<dps> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvd.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, dps::new)
   );
   public static final dvx b = dlt.aF;
   public static final dwb<dwc> c = dvt.af;
   public static final dwb<dwm> d = dvt.bi;
   public static final dvu e = dvt.C;
   protected static final fab f = dpb.e;
   protected static final fab g = dpb.d;
   protected static final fab h = dhy.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final fab i = dhy.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final fab j = dhy.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final fab k = dhy.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final fab l = dhy.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final fab m = dhy.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final fab n = dhy.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final fab o = dhy.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final fab[] G = a(f, h, l, i, m);
   protected static final fab[] H = a(g, j, n, k, o);
   private static final int[] J = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dhy K;
   protected final dvd I;

   @Override
   public MapCodec<? extends dps> a() {
      return a;
   }

   private static fab[] a(fab $$0, fab $$1, fab $$2, fab $$3, fab $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(fab[]::new);
   }

   private static fab a(int $$0, fab $$1, fab $$2, fab $$3, fab $$4, fab $$5) {
      fab $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = ezy.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = ezy.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = ezy.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = ezy.a($$6, $$5);
      }

      return $$6;
   }

   protected dps(dvd $$0, dvc.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jl.c).b(c, dwc.b).b(d, dwm.a).b(e, Boolean.valueOf(false)));
      this.K = $$0.b();
      this.I = $$0;
   }

   @Override
   protected boolean g_(dvd $$0) {
      return true;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return ($$0.c(c) == dwc.a ? G : H)[J[this.q($$0)]];
   }

   private int q(dvd $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.K.e();
   }

   @Override
   public dvd a(czm $$0) {
      jl $$1 = $$0.k();
      jg $$2 = $$0.a();
      ere $$3 = $$0.q().b_($$2);
      dvd $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != jl.a && ($$1 == jl.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? dwc.b : dwc.a)
         .b(e, Boolean.valueOf($$3.a() == erf.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return $$1.o().d() ? $$0.b(d, e($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dwm e(dvd $$0, dea $$1, jg $$2) {
      jl $$3 = $$0.c(b);
      dvd $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jl $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dwm.d;
            }

            return dwm.e;
         }
      }

      dvd $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jl $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dwm.b;
            }

            return dwm.c;
         }
      }

      return dwm.a;
   }

   private static boolean c(dvd $$0, dea $$1, jg $$2, jl $$3) {
      dvd $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(dvd $$0) {
      return $$0.b() instanceof dps;
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      jl $$2 = $$0.c(b);
      dwm $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jl.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dol.c).b(d, dwm.c);
                  case c:
                     return $$0.a(dol.c).b(d, dwm.b);
                  case d:
                     return $$0.a(dol.c).b(d, dwm.e);
                  case e:
                     return $$0.a(dol.c).b(d, dwm.d);
                  default:
                     return $$0.a(dol.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jl.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dol.c).b(d, dwm.b);
                  case c:
                     return $$0.a(dol.c).b(d, dwm.c);
                  case d:
                     return $$0.a(dol.c).b(d, dwm.e);
                  case e:
                     return $$0.a(dol.c).b(d, dwm.d);
                  case a:
                     return $$0.a(dol.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(e) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
