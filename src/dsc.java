import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dsc extends dkd implements drj {
   public static final MapCodec<dsc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxo.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, dsc::new)
   );
   public static final dyl<jm> b = dob.aF;
   public static final dyl<dym> c = dye.ai;
   public static final dyl<dyw> d = dye.bl;
   public static final dyf e = dye.J;
   protected static final fcl f = drl.e;
   protected static final fcl g = drl.d;
   protected static final fcl h = dkd.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final fcl i = dkd.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final fcl j = dkd.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final fcl k = dkd.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final fcl l = dkd.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final fcl m = dkd.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final fcl n = dkd.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final fcl o = dkd.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final fcl[] G = a(f, h, l, i, m);
   protected static final fcl[] H = a(g, j, n, k, o);
   private static final int[] J = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dkd K;
   protected final dxo I;

   @Override
   public MapCodec<? extends dsc> a() {
      return a;
   }

   private static fcl[] a(fcl $$0, fcl $$1, fcl $$2, fcl $$3, fcl $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(fcl[]::new);
   }

   private static fcl a(int $$0, fcl $$1, fcl $$2, fcl $$3, fcl $$4, fcl $$5) {
      fcl $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = fci.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = fci.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = fci.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = fci.a($$6, $$5);
      }

      return $$6;
   }

   protected dsc(dxo $$0, dxn.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jm.c).b(c, dym.b).b(d, dyw.a).b(e, Boolean.valueOf(false)));
      this.K = $$0.b();
      this.I = $$0;
   }

   @Override
   protected boolean g_(dxo $$0) {
      return true;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return ($$0.c(c) == dym.a ? G : H)[J[this.q($$0)]];
   }

   private int q(dxo $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.K.e();
   }

   @Override
   public dxo a(dax $$0) {
      jm $$1 = $$0.k();
      jh $$2 = $$0.a();
      etq $$3 = $$0.q().b_($$2);
      dxo $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != jm.a && ($$1 == jm.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? dym.b : dym.a)
         .b(e, Boolean.valueOf($$3.a() == etr.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static dyw e(dxo $$0, dge $$1, jh $$2) {
      jm $$3 = $$0.c(b);
      dxo $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jm $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dyw.d;
            }

            return dyw.e;
         }
      }

      dxo $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jm $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dyw.b;
            }

            return dyw.c;
         }
      }

      return dyw.a;
   }

   private static boolean c(dxo $$0, dge $$1, jh $$2, jm $$3) {
      dxo $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(dxo $$0) {
      return $$0.b() instanceof dsc;
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      jm $$2 = $$0.c(b);
      dyw $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jm.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dqv.c).b(d, dyw.c);
                  case c:
                     return $$0.a(dqv.c).b(d, dyw.b);
                  case d:
                     return $$0.a(dqv.c).b(d, dyw.e);
                  case e:
                     return $$0.a(dqv.c).b(d, dyw.d);
                  default:
                     return $$0.a(dqv.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jm.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dqv.c).b(d, dyw.b);
                  case c:
                     return $$0.a(dqv.c).b(d, dyw.c);
                  case d:
                     return $$0.a(dqv.c).b(d, dyw.e);
                  case e:
                     return $$0.a(dqv.c).b(d, dyw.d);
                  case a:
                     return $$0.a(dqv.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(e) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
