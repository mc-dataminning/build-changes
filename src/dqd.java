import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dqd extends dij implements dpk {
   public static final MapCodec<dqd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvo.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, dqd::new)
   );
   public static final dwl<jm> b = dme.aF;
   public static final dwl<dwm> c = dwe.af;
   public static final dwl<dww> d = dwe.bi;
   public static final dwf e = dwe.C;
   protected static final fal f = dpm.e;
   protected static final fal g = dpm.d;
   protected static final fal h = dij.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final fal i = dij.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final fal j = dij.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final fal k = dij.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final fal l = dij.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final fal m = dij.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final fal n = dij.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final fal o = dij.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final fal[] G = a(f, h, l, i, m);
   protected static final fal[] H = a(g, j, n, k, o);
   private static final int[] J = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dij K;
   protected final dvo I;

   @Override
   public MapCodec<? extends dqd> a() {
      return a;
   }

   private static fal[] a(fal $$0, fal $$1, fal $$2, fal $$3, fal $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(fal[]::new);
   }

   private static fal a(int $$0, fal $$1, fal $$2, fal $$3, fal $$4, fal $$5) {
      fal $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = fai.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = fai.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = fai.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = fai.a($$6, $$5);
      }

      return $$6;
   }

   protected dqd(dvo $$0, dvn.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jm.c).b(c, dwm.b).b(d, dww.a).b(e, Boolean.valueOf(false)));
      this.K = $$0.b();
      this.I = $$0;
   }

   @Override
   protected boolean g_(dvo $$0) {
      return true;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return ($$0.c(c) == dwm.a ? G : H)[J[this.q($$0)]];
   }

   private int q(dvo $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.K.e();
   }

   @Override
   public dvo a(czw $$0) {
      jm $$1 = $$0.k();
      jh $$2 = $$0.a();
      ero $$3 = $$0.q().b_($$2);
      dvo $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != jm.a && ($$1 == jm.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? dwm.b : dwm.a)
         .b(e, Boolean.valueOf($$3.a() == erp.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static dww e(dvo $$0, dek $$1, jh $$2) {
      jm $$3 = $$0.c(b);
      dvo $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jm $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dww.d;
            }

            return dww.e;
         }
      }

      dvo $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jm $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dww.b;
            }

            return dww.c;
         }
      }

      return dww.a;
   }

   private static boolean c(dvo $$0, dek $$1, jh $$2, jm $$3) {
      dvo $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(dvo $$0) {
      return $$0.b() instanceof dqd;
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      jm $$2 = $$0.c(b);
      dww $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jm.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dow.c).b(d, dww.c);
                  case c:
                     return $$0.a(dow.c).b(d, dww.b);
                  case d:
                     return $$0.a(dow.c).b(d, dww.e);
                  case e:
                     return $$0.a(dow.c).b(d, dww.d);
                  default:
                     return $$0.a(dow.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jm.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dow.c).b(d, dww.b);
                  case c:
                     return $$0.a(dow.c).b(d, dww.c);
                  case d:
                     return $$0.a(dow.c).b(d, dww.e);
                  case e:
                     return $$0.a(dow.c).b(d, dww.d);
                  case a:
                     return $$0.a(dow.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(e) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
