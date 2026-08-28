import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class doq extends dgv implements dnx {
   public static final MapCodec<doq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dua.a.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, doq::new)
   );
   public static final duu b = dkr.aE;
   public static final duy<duz> c = duq.af;
   public static final duy<dvj> d = duq.bi;
   public static final dur e = duq.C;
   protected static final eyx f = dnz.e;
   protected static final eyx g = dnz.d;
   protected static final eyx h = dgv.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final eyx i = dgv.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final eyx j = dgv.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final eyx k = dgv.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final eyx l = dgv.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final eyx m = dgv.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final eyx n = dgv.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final eyx o = dgv.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final eyx[] F = a(f, h, l, i, m);
   protected static final eyx[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dgv J;
   protected final dua H;

   @Override
   public MapCodec<? extends doq> a() {
      return a;
   }

   private static eyx[] a(eyx $$0, eyx $$1, eyx $$2, eyx $$3, eyx $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(eyx[]::new);
   }

   private static eyx a(int $$0, eyx $$1, eyx $$2, eyx $$3, eyx $$4, eyx $$5) {
      eyx $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = eyu.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = eyu.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = eyu.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = eyu.a($$6, $$5);
      }

      return $$6;
   }

   protected doq(dua $$0, dtz.d $$1) {
      super($$1);
      this.l(this.E.b().b(b, jj.c).b(c, duz.b).b(d, dvj.a).b(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean g_(dua $$0) {
      return true;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return ($$0.c(c) == duz.a ? F : G)[I[this.q($$0)]];
   }

   private int q(dua $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dua a(cyw $$0) {
      jj $$1 = $$0.k();
      je $$2 = $$0.a();
      eqb $$3 = $$0.q().b_($$2);
      dua $$4 = this.o()
         .b(b, $$0.g())
         .b(c, $$1 != jj.a && ($$1 == jj.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? duz.b : duz.a)
         .b(e, Boolean.valueOf($$3.a() == eqc.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return $$1.o().d() ? $$0.b(d, e($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dvj e(dua $$0, dcx $$1, je $$2) {
      jj $$3 = $$0.c(b);
      dua $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jj $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dvj.d;
            }

            return dvj.e;
         }
      }

      dua $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jj $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dvj.b;
            }

            return dvj.c;
         }
      }

      return dvj.a;
   }

   private static boolean c(dua $$0, dcx $$1, je $$2, jj $$3) {
      dua $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(dua $$0) {
      return $$0.b() instanceof doq;
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      jj $$2 = $$0.c(b);
      dvj $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jj.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dnj.c).b(d, dvj.c);
                  case c:
                     return $$0.a(dnj.c).b(d, dvj.b);
                  case d:
                     return $$0.a(dnj.c).b(d, dvj.e);
                  case e:
                     return $$0.a(dnj.c).b(d, dvj.d);
                  default:
                     return $$0.a(dnj.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jj.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dnj.c).b(d, dvj.b);
                  case c:
                     return $$0.a(dnj.c).b(d, dvj.c);
                  case d:
                     return $$0.a(dnj.c).b(d, dvj.e);
                  case e:
                     return $$0.a(dnj.c).b(d, dvj.d);
                  case a:
                     return $$0.a(dnj.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(e) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
