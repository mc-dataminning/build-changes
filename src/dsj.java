import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dsj extends dkm implements drq {
   public static final MapCodec<dsj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxv.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, dsj::new)
   );
   public static final dys<jm> b = dok.aF;
   public static final dys<dyt> c = dyl.ag;
   public static final dys<dzd> d = dyl.bj;
   public static final dym e = dyl.D;
   protected static final fcs f = drs.e;
   protected static final fcs g = drs.d;
   protected static final fcs h = dkm.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final fcs i = dkm.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final fcs j = dkm.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final fcs k = dkm.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final fcs l = dkm.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final fcs m = dkm.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final fcs n = dkm.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final fcs o = dkm.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final fcs[] G = a(f, h, l, i, m);
   protected static final fcs[] H = a(g, j, n, k, o);
   private static final int[] J = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dkm K;
   protected final dxv I;

   @Override
   public MapCodec<? extends dsj> a() {
      return a;
   }

   private static fcs[] a(fcs $$0, fcs $$1, fcs $$2, fcs $$3, fcs $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(fcs[]::new);
   }

   private static fcs a(int $$0, fcs $$1, fcs $$2, fcs $$3, fcs $$4, fcs $$5) {
      fcs $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = fcp.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = fcp.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = fcp.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = fcp.a($$6, $$5);
      }

      return $$6;
   }

   protected dsj(dxv $$0, dxu.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jm.c).b(c, dyt.b).b(d, dzd.a).b(e, Boolean.valueOf(false)));
      this.K = $$0.b();
      this.I = $$0;
   }

   @Override
   protected boolean g_(dxv $$0) {
      return true;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return ($$0.c(c) == dyt.a ? G : H)[J[this.q($$0)]];
   }

   private int q(dxv $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.K.e();
   }

   @Override
   public dxv a(dbg $$0) {
      jm $$1 = $$0.k();
      jh $$2 = $$0.a();
      etx $$3 = $$0.q().b_($$2);
      dxv $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != jm.a && ($$1 == jm.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? dyt.b : dyt.a)
         .b(e, Boolean.valueOf($$3.a() == ety.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static dzd e(dxv $$0, dgn $$1, jh $$2) {
      jm $$3 = $$0.c(b);
      dxv $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jm $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dzd.d;
            }

            return dzd.e;
         }
      }

      dxv $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jm $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dzd.b;
            }

            return dzd.c;
         }
      }

      return dzd.a;
   }

   private static boolean c(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      dxv $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(dxv $$0) {
      return $$0.b() instanceof dsj;
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      jm $$2 = $$0.c(b);
      dzd $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jm.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(drc.c).b(d, dzd.c);
                  case c:
                     return $$0.a(drc.c).b(d, dzd.b);
                  case d:
                     return $$0.a(drc.c).b(d, dzd.e);
                  case e:
                     return $$0.a(drc.c).b(d, dzd.d);
                  default:
                     return $$0.a(drc.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jm.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(drc.c).b(d, dzd.b);
                  case c:
                     return $$0.a(drc.c).b(d, dzd.c);
                  case d:
                     return $$0.a(drc.c).b(d, dzd.e);
                  case e:
                     return $$0.a(drc.c).b(d, dzd.d);
                  case a:
                     return $$0.a(drc.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(e) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
