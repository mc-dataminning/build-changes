import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dsi extends dkl implements drp {
   public static final MapCodec<dsi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxu.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, dsi::new)
   );
   public static final dyr<jm> b = doj.aF;
   public static final dyr<dys> c = dyk.ag;
   public static final dyr<dzc> d = dyk.bj;
   public static final dyl e = dyk.D;
   protected static final fcr f = drr.e;
   protected static final fcr g = drr.d;
   protected static final fcr h = dkl.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final fcr i = dkl.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final fcr j = dkl.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final fcr k = dkl.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final fcr l = dkl.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final fcr m = dkl.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final fcr n = dkl.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final fcr o = dkl.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final fcr[] G = a(f, h, l, i, m);
   protected static final fcr[] H = a(g, j, n, k, o);
   private static final int[] J = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dkl K;
   protected final dxu I;

   @Override
   public MapCodec<? extends dsi> a() {
      return a;
   }

   private static fcr[] a(fcr $$0, fcr $$1, fcr $$2, fcr $$3, fcr $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(fcr[]::new);
   }

   private static fcr a(int $$0, fcr $$1, fcr $$2, fcr $$3, fcr $$4, fcr $$5) {
      fcr $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = fco.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = fco.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = fco.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = fco.a($$6, $$5);
      }

      return $$6;
   }

   protected dsi(dxu $$0, dxt.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jm.c).b(c, dys.b).b(d, dzc.a).b(e, Boolean.valueOf(false)));
      this.K = $$0.b();
      this.I = $$0;
   }

   @Override
   protected boolean g_(dxu $$0) {
      return true;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return ($$0.c(c) == dys.a ? G : H)[J[this.q($$0)]];
   }

   private int q(dxu $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.K.e();
   }

   @Override
   public dxu a(dbf $$0) {
      jm $$1 = $$0.k();
      jh $$2 = $$0.a();
      etw $$3 = $$0.q().b_($$2);
      dxu $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != jm.a && ($$1 == jm.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? dys.b : dys.a)
         .b(e, Boolean.valueOf($$3.a() == etx.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static dzc e(dxu $$0, dgm $$1, jh $$2) {
      jm $$3 = $$0.c(b);
      dxu $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jm $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dzc.d;
            }

            return dzc.e;
         }
      }

      dxu $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jm $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dzc.b;
            }

            return dzc.c;
         }
      }

      return dzc.a;
   }

   private static boolean c(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      dxu $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(dxu $$0) {
      return $$0.b() instanceof dsi;
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      jm $$2 = $$0.c(b);
      dzc $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jm.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(drb.c).b(d, dzc.c);
                  case c:
                     return $$0.a(drb.c).b(d, dzc.b);
                  case d:
                     return $$0.a(drb.c).b(d, dzc.e);
                  case e:
                     return $$0.a(drb.c).b(d, dzc.d);
                  default:
                     return $$0.a(drb.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jm.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(drb.c).b(d, dzc.b);
                  case c:
                     return $$0.a(drb.c).b(d, dzc.c);
                  case d:
                     return $$0.a(drb.c).b(d, dzc.e);
                  case e:
                     return $$0.a(drb.c).b(d, dzc.d);
                  case a:
                     return $$0.a(drb.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(e) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
