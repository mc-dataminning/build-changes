import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class drk extends djl implements dqr {
   public static final MapCodec<drk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dww.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, drk::new)
   );
   public static final dxt<jn> b = dnj.aF;
   public static final dxt<dxu> c = dxm.ai;
   public static final dxt<dye> d = dxm.bl;
   public static final dxn e = dxm.J;
   protected static final fbt f = dqt.e;
   protected static final fbt g = dqt.d;
   protected static final fbt h = djl.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final fbt i = djl.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final fbt j = djl.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final fbt k = djl.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final fbt l = djl.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final fbt m = djl.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final fbt n = djl.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final fbt o = djl.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final fbt[] G = a(f, h, l, i, m);
   protected static final fbt[] H = a(g, j, n, k, o);
   private static final int[] J = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final djl K;
   protected final dww I;

   @Override
   public MapCodec<? extends drk> a() {
      return a;
   }

   private static fbt[] a(fbt $$0, fbt $$1, fbt $$2, fbt $$3, fbt $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(fbt[]::new);
   }

   private static fbt a(int $$0, fbt $$1, fbt $$2, fbt $$3, fbt $$4, fbt $$5) {
      fbt $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = fbq.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = fbq.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = fbq.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = fbq.a($$6, $$5);
      }

      return $$6;
   }

   protected drk(dww $$0, dwv.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jn.c).b(c, dxu.b).b(d, dye.a).b(e, Boolean.valueOf(false)));
      this.K = $$0.b();
      this.I = $$0;
   }

   @Override
   protected boolean g_(dww $$0) {
      return true;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return ($$0.c(c) == dxu.a ? G : H)[J[this.q($$0)]];
   }

   private int q(dww $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.K.e();
   }

   @Override
   public dww a(daf $$0) {
      jn $$1 = $$0.k();
      ji $$2 = $$0.a();
      esy $$3 = $$0.q().b_($$2);
      dww $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != jn.a && ($$1 == jn.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? dxu.b : dxu.a)
         .b(e, Boolean.valueOf($$3.a() == esz.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static dye e(dww $$0, dfm $$1, ji $$2) {
      jn $$3 = $$0.c(b);
      dww $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jn $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dye.d;
            }

            return dye.e;
         }
      }

      dww $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jn $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dye.b;
            }

            return dye.c;
         }
      }

      return dye.a;
   }

   private static boolean c(dww $$0, dfm $$1, ji $$2, jn $$3) {
      dww $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(dww $$0) {
      return $$0.b() instanceof drk;
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      jn $$2 = $$0.c(b);
      dye $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jn.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dqd.c).b(d, dye.c);
                  case c:
                     return $$0.a(dqd.c).b(d, dye.b);
                  case d:
                     return $$0.a(dqd.c).b(d, dye.e);
                  case e:
                     return $$0.a(dqd.c).b(d, dye.d);
                  default:
                     return $$0.a(dqd.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jn.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dqd.c).b(d, dye.b);
                  case c:
                     return $$0.a(dqd.c).b(d, dye.c);
                  case d:
                     return $$0.a(dqd.c).b(d, dye.e);
                  case e:
                     return $$0.a(dqd.c).b(d, dye.d);
                  case a:
                     return $$0.a(dqd.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(e) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
