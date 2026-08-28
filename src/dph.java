import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dph extends dhm implements doo {
   public static final MapCodec<dph> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dus.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, dph::new)
   );
   public static final dvm b = dli.aF;
   public static final dvq<dvr> c = dvi.af;
   public static final dvq<dwb> d = dvi.bi;
   public static final dvj e = dvi.C;
   protected static final ezq f = doq.e;
   protected static final ezq g = doq.d;
   protected static final ezq h = dhm.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final ezq i = dhm.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final ezq j = dhm.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final ezq k = dhm.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final ezq l = dhm.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final ezq m = dhm.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final ezq n = dhm.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final ezq o = dhm.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final ezq[] G = a(f, h, l, i, m);
   protected static final ezq[] H = a(g, j, n, k, o);
   private static final int[] J = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dhm K;
   protected final dus I;

   @Override
   public MapCodec<? extends dph> a() {
      return a;
   }

   private static ezq[] a(ezq $$0, ezq $$1, ezq $$2, ezq $$3, ezq $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(ezq[]::new);
   }

   private static ezq a(int $$0, ezq $$1, ezq $$2, ezq $$3, ezq $$4, ezq $$5) {
      ezq $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = ezn.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = ezn.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = ezn.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = ezn.a($$6, $$5);
      }

      return $$6;
   }

   protected dph(dus $$0, dur.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jk.c).b(c, dvr.b).b(d, dwb.a).b(e, Boolean.valueOf(false)));
      this.K = $$0.b();
      this.I = $$0;
   }

   @Override
   protected boolean g_(dus $$0) {
      return true;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return ($$0.c(c) == dvr.a ? G : H)[J[this.q($$0)]];
   }

   private int q(dus $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.K.e();
   }

   @Override
   public dus a(czn $$0) {
      jk $$1 = $$0.k();
      jf $$2 = $$0.a();
      eqt $$3 = $$0.q().b_($$2);
      dus $$4 = this.n()
         .b(b, $$0.g())
         .b(c, $$1 != jk.a && ($$1 == jk.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? dvr.b : dvr.a)
         .b(e, Boolean.valueOf($$3.a() == equ.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return $$1.o().d() ? $$0.b(d, e($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dwb e(dus $$0, ddo $$1, jf $$2) {
      jk $$3 = $$0.c(b);
      dus $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jk $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dwb.d;
            }

            return dwb.e;
         }
      }

      dus $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jk $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dwb.b;
            }

            return dwb.c;
         }
      }

      return dwb.a;
   }

   private static boolean c(dus $$0, ddo $$1, jf $$2, jk $$3) {
      dus $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(dus $$0) {
      return $$0.b() instanceof dph;
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      jk $$2 = $$0.c(b);
      dwb $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jk.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(doa.c).b(d, dwb.c);
                  case c:
                     return $$0.a(doa.c).b(d, dwb.b);
                  case d:
                     return $$0.a(doa.c).b(d, dwb.e);
                  case e:
                     return $$0.a(doa.c).b(d, dwb.d);
                  default:
                     return $$0.a(doa.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jk.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(doa.c).b(d, dwb.b);
                  case c:
                     return $$0.a(doa.c).b(d, dwb.c);
                  case d:
                     return $$0.a(doa.c).b(d, dwb.e);
                  case e:
                     return $$0.a(doa.c).b(d, dwb.d);
                  case a:
                     return $$0.a(doa.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(e) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
