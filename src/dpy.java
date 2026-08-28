import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dpy extends die implements dpf {
   public static final MapCodec<dpy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvj.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, dpy::new)
   );
   public static final dwd b = dlz.aF;
   public static final dwh<dwi> c = dvz.af;
   public static final dwh<dws> d = dvz.bi;
   public static final dwa e = dvz.C;
   protected static final fah f = dph.e;
   protected static final fah g = dph.d;
   protected static final fah h = die.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final fah i = die.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final fah j = die.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final fah k = die.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final fah l = die.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final fah m = die.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final fah n = die.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final fah o = die.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final fah[] G = a(f, h, l, i, m);
   protected static final fah[] H = a(g, j, n, k, o);
   private static final int[] J = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final die K;
   protected final dvj I;

   @Override
   public MapCodec<? extends dpy> a() {
      return a;
   }

   private static fah[] a(fah $$0, fah $$1, fah $$2, fah $$3, fah $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(fah[]::new);
   }

   private static fah a(int $$0, fah $$1, fah $$2, fah $$3, fah $$4, fah $$5) {
      fah $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = fae.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = fae.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = fae.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = fae.a($$6, $$5);
      }

      return $$6;
   }

   protected dpy(dvj $$0, dvi.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jm.c).b(c, dwi.b).b(d, dws.a).b(e, Boolean.valueOf(false)));
      this.K = $$0.b();
      this.I = $$0;
   }

   @Override
   protected boolean g_(dvj $$0) {
      return true;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return ($$0.c(c) == dwi.a ? G : H)[J[this.q($$0)]];
   }

   private int q(dvj $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.K.e();
   }

   @Override
   public dvj a(czs $$0) {
      jm $$1 = $$0.k();
      jh $$2 = $$0.a();
      erk $$3 = $$0.q().b_($$2);
      dvj $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != jm.a && ($$1 == jm.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? dwi.b : dwi.a)
         .b(e, Boolean.valueOf($$3.a() == erl.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return $$1.o().d() ? $$0.b(d, e($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dws e(dvj $$0, deg $$1, jh $$2) {
      jm $$3 = $$0.c(b);
      dvj $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jm $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dws.d;
            }

            return dws.e;
         }
      }

      dvj $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jm $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dws.b;
            }

            return dws.c;
         }
      }

      return dws.a;
   }

   private static boolean c(dvj $$0, deg $$1, jh $$2, jm $$3) {
      dvj $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(dvj $$0) {
      return $$0.b() instanceof dpy;
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      jm $$2 = $$0.c(b);
      dws $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jm.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dor.c).b(d, dws.c);
                  case c:
                     return $$0.a(dor.c).b(d, dws.b);
                  case d:
                     return $$0.a(dor.c).b(d, dws.e);
                  case e:
                     return $$0.a(dor.c).b(d, dws.d);
                  default:
                     return $$0.a(dor.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jm.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dor.c).b(d, dws.b);
                  case c:
                     return $$0.a(dor.c).b(d, dws.c);
                  case d:
                     return $$0.a(dor.c).b(d, dws.e);
                  case e:
                     return $$0.a(dor.c).b(d, dws.d);
                  case a:
                     return $$0.a(dor.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(e) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
