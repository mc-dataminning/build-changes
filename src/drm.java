import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class drm extends djn implements dqt {
   public static final MapCodec<drm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwy.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, drm::new)
   );
   public static final dxv<jn> b = dnl.aF;
   public static final dxv<dxw> c = dxo.ai;
   public static final dxv<dyg> d = dxo.bl;
   public static final dxp e = dxo.J;
   protected static final fbv f = dqv.e;
   protected static final fbv g = dqv.d;
   protected static final fbv h = djn.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final fbv i = djn.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final fbv j = djn.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final fbv k = djn.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final fbv l = djn.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final fbv m = djn.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final fbv n = djn.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final fbv o = djn.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final fbv[] G = a(f, h, l, i, m);
   protected static final fbv[] H = a(g, j, n, k, o);
   private static final int[] J = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final djn K;
   protected final dwy I;

   @Override
   public MapCodec<? extends drm> a() {
      return a;
   }

   private static fbv[] a(fbv $$0, fbv $$1, fbv $$2, fbv $$3, fbv $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(fbv[]::new);
   }

   private static fbv a(int $$0, fbv $$1, fbv $$2, fbv $$3, fbv $$4, fbv $$5) {
      fbv $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = fbs.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = fbs.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = fbs.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = fbs.a($$6, $$5);
      }

      return $$6;
   }

   protected drm(dwy $$0, dwx.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jn.c).b(c, dxw.b).b(d, dyg.a).b(e, Boolean.valueOf(false)));
      this.K = $$0.b();
      this.I = $$0;
   }

   @Override
   protected boolean g_(dwy $$0) {
      return true;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return ($$0.c(c) == dxw.a ? G : H)[J[this.q($$0)]];
   }

   private int q(dwy $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.K.e();
   }

   @Override
   public dwy a(dah $$0) {
      jn $$1 = $$0.k();
      ji $$2 = $$0.a();
      eta $$3 = $$0.q().b_($$2);
      dwy $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != jn.a && ($$1 == jn.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? dxw.b : dxw.a)
         .b(e, Boolean.valueOf($$3.a() == etb.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static dyg e(dwy $$0, dfo $$1, ji $$2) {
      jn $$3 = $$0.c(b);
      dwy $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jn $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dyg.d;
            }

            return dyg.e;
         }
      }

      dwy $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jn $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dyg.b;
            }

            return dyg.c;
         }
      }

      return dyg.a;
   }

   private static boolean c(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      dwy $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(dwy $$0) {
      return $$0.b() instanceof drm;
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      jn $$2 = $$0.c(b);
      dyg $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jn.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dqf.c).b(d, dyg.c);
                  case c:
                     return $$0.a(dqf.c).b(d, dyg.b);
                  case d:
                     return $$0.a(dqf.c).b(d, dyg.e);
                  case e:
                     return $$0.a(dqf.c).b(d, dyg.d);
                  default:
                     return $$0.a(dqf.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jn.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dqf.c).b(d, dyg.b);
                  case c:
                     return $$0.a(dqf.c).b(d, dyg.c);
                  case d:
                     return $$0.a(dqf.c).b(d, dyg.e);
                  case e:
                     return $$0.a(dqf.c).b(d, dyg.d);
                  case a:
                     return $$0.a(dqf.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(e) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
