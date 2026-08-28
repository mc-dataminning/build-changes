import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dsb extends dke implements dri {
   public static final MapCodec<dsb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxn.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, dsb::new)
   );
   public static final dyk<jm> b = doc.aF;
   public static final dyk<dyl> c = dyd.ag;
   public static final dyk<dyv> d = dyd.bj;
   public static final dye e = dyd.D;
   protected static final fcm f = drk.e;
   protected static final fcm g = drk.d;
   protected static final fcm h = dke.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final fcm i = dke.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final fcm j = dke.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final fcm k = dke.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final fcm l = dke.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final fcm m = dke.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final fcm n = dke.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final fcm o = dke.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final fcm[] G = a(f, h, l, i, m);
   protected static final fcm[] H = a(g, j, n, k, o);
   private static final int[] J = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dke K;
   protected final dxn I;

   @Override
   public MapCodec<? extends dsb> a() {
      return a;
   }

   private static fcm[] a(fcm $$0, fcm $$1, fcm $$2, fcm $$3, fcm $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(fcm[]::new);
   }

   private static fcm a(int $$0, fcm $$1, fcm $$2, fcm $$3, fcm $$4, fcm $$5) {
      fcm $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = fcj.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = fcj.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = fcj.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = fcj.a($$6, $$5);
      }

      return $$6;
   }

   protected dsb(dxn $$0, dxm.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jm.c).b(c, dyl.b).b(d, dyv.a).b(e, Boolean.valueOf(false)));
      this.K = $$0.b();
      this.I = $$0;
   }

   @Override
   protected boolean g_(dxn $$0) {
      return true;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return ($$0.c(c) == dyl.a ? G : H)[J[this.q($$0)]];
   }

   private int q(dxn $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.K.e();
   }

   @Override
   public dxn a(dbb $$0) {
      jm $$1 = $$0.k();
      jh $$2 = $$0.a();
      etp $$3 = $$0.q().b_($$2);
      dxn $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != jm.a && ($$1 == jm.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? dyl.b : dyl.a)
         .b(e, Boolean.valueOf($$3.a() == etq.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static dyv e(dxn $$0, dgf $$1, jh $$2) {
      jm $$3 = $$0.c(b);
      dxn $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jm $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dyv.d;
            }

            return dyv.e;
         }
      }

      dxn $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jm $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dyv.b;
            }

            return dyv.c;
         }
      }

      return dyv.a;
   }

   private static boolean c(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      dxn $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(dxn $$0) {
      return $$0.b() instanceof dsb;
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      jm $$2 = $$0.c(b);
      dyv $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jm.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dqu.c).b(d, dyv.c);
                  case c:
                     return $$0.a(dqu.c).b(d, dyv.b);
                  case d:
                     return $$0.a(dqu.c).b(d, dyv.e);
                  case e:
                     return $$0.a(dqu.c).b(d, dyv.d);
                  default:
                     return $$0.a(dqu.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jm.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dqu.c).b(d, dyv.b);
                  case c:
                     return $$0.a(dqu.c).b(d, dyv.c);
                  case d:
                     return $$0.a(dqu.c).b(d, dyv.e);
                  case e:
                     return $$0.a(dqu.c).b(d, dyv.d);
                  case a:
                     return $$0.a(dqu.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(e) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
