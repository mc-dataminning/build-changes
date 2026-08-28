import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class drj extends djk implements dqq {
   public static final MapCodec<drj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwv.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, drj::new)
   );
   public static final dxs<jn> b = dni.aF;
   public static final dxs<dxt> c = dxl.ai;
   public static final dxs<dyd> d = dxl.bl;
   public static final dxm e = dxl.J;
   protected static final fbs f = dqs.e;
   protected static final fbs g = dqs.d;
   protected static final fbs h = djk.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final fbs i = djk.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final fbs j = djk.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final fbs k = djk.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final fbs l = djk.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final fbs m = djk.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final fbs n = djk.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final fbs o = djk.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final fbs[] G = a(f, h, l, i, m);
   protected static final fbs[] H = a(g, j, n, k, o);
   private static final int[] J = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final djk K;
   protected final dwv I;

   @Override
   public MapCodec<? extends drj> a() {
      return a;
   }

   private static fbs[] a(fbs $$0, fbs $$1, fbs $$2, fbs $$3, fbs $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(fbs[]::new);
   }

   private static fbs a(int $$0, fbs $$1, fbs $$2, fbs $$3, fbs $$4, fbs $$5) {
      fbs $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = fbp.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = fbp.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = fbp.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = fbp.a($$6, $$5);
      }

      return $$6;
   }

   protected drj(dwv $$0, dwu.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jn.c).b(c, dxt.b).b(d, dyd.a).b(e, Boolean.valueOf(false)));
      this.K = $$0.b();
      this.I = $$0;
   }

   @Override
   protected boolean g_(dwv $$0) {
      return true;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return ($$0.c(c) == dxt.a ? G : H)[J[this.q($$0)]];
   }

   private int q(dwv $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.K.e();
   }

   @Override
   public dwv a(dae $$0) {
      jn $$1 = $$0.k();
      ji $$2 = $$0.a();
      esx $$3 = $$0.q().b_($$2);
      dwv $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != jn.a && ($$1 == jn.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? dxt.b : dxt.a)
         .b(e, Boolean.valueOf($$3.a() == esy.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static dyd e(dwv $$0, dfl $$1, ji $$2) {
      jn $$3 = $$0.c(b);
      dwv $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jn $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dyd.d;
            }

            return dyd.e;
         }
      }

      dwv $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jn $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dyd.b;
            }

            return dyd.c;
         }
      }

      return dyd.a;
   }

   private static boolean c(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      dwv $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(dwv $$0) {
      return $$0.b() instanceof drj;
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      jn $$2 = $$0.c(b);
      dyd $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jn.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dqc.c).b(d, dyd.c);
                  case c:
                     return $$0.a(dqc.c).b(d, dyd.b);
                  case d:
                     return $$0.a(dqc.c).b(d, dyd.e);
                  case e:
                     return $$0.a(dqc.c).b(d, dyd.d);
                  default:
                     return $$0.a(dqc.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jn.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dqc.c).b(d, dyd.b);
                  case c:
                     return $$0.a(dqc.c).b(d, dyd.c);
                  case d:
                     return $$0.a(dqc.c).b(d, dyd.e);
                  case e:
                     return $$0.a(dqc.c).b(d, dyd.d);
                  case a:
                     return $$0.a(dqc.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(e) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }
}
