import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dpe extends dhj implements dol {
   public static final MapCodec<dpe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(duo.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), u()).apply($$0, dpe::new)
   );
   public static final dvi b = dlf.aF;
   public static final dvm<dvn> c = dve.af;
   public static final dvm<dvx> d = dve.bi;
   public static final dvf e = dve.C;
   protected static final ezm f = don.e;
   protected static final ezm g = don.d;
   protected static final ezm h = dhj.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final ezm i = dhj.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final ezm j = dhj.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final ezm k = dhj.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final ezm l = dhj.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final ezm m = dhj.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final ezm n = dhj.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final ezm o = dhj.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final ezm[] G = a(f, h, l, i, m);
   protected static final ezm[] H = a(g, j, n, k, o);
   private static final int[] J = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dhj K;
   protected final duo I;

   @Override
   public MapCodec<? extends dpe> a() {
      return a;
   }

   private static ezm[] a(ezm $$0, ezm $$1, ezm $$2, ezm $$3, ezm $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(ezm[]::new);
   }

   private static ezm a(int $$0, ezm $$1, ezm $$2, ezm $$3, ezm $$4, ezm $$5) {
      ezm $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = ezj.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = ezj.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = ezj.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = ezj.a($$6, $$5);
      }

      return $$6;
   }

   protected dpe(duo $$0, dun.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jj.c).b(c, dvn.b).b(d, dvx.a).b(e, Boolean.valueOf(false)));
      this.K = $$0.b();
      this.I = $$0;
   }

   @Override
   protected boolean g_(duo $$0) {
      return true;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return ($$0.c(c) == dvn.a ? G : H)[J[this.q($$0)]];
   }

   private int q(duo $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.K.e();
   }

   @Override
   public duo a(czk $$0) {
      jj $$1 = $$0.k();
      je $$2 = $$0.a();
      eqp $$3 = $$0.q().b_($$2);
      duo $$4 = this.o()
         .b(b, $$0.g())
         .b(c, $$1 != jj.a && ($$1 == jj.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? dvn.b : dvn.a)
         .b(e, Boolean.valueOf($$3.a() == eqq.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return $$1.o().d() ? $$0.b(d, e($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dvx e(duo $$0, ddl $$1, je $$2) {
      jj $$3 = $$0.c(b);
      duo $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jj $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dvx.d;
            }

            return dvx.e;
         }
      }

      duo $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jj $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dvx.b;
            }

            return dvx.c;
         }
      }

      return dvx.a;
   }

   private static boolean c(duo $$0, ddl $$1, je $$2, jj $$3) {
      duo $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(duo $$0) {
      return $$0.b() instanceof dpe;
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      jj $$2 = $$0.c(b);
      dvx $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jj.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dnx.c).b(d, dvx.c);
                  case c:
                     return $$0.a(dnx.c).b(d, dvx.b);
                  case d:
                     return $$0.a(dnx.c).b(d, dvx.e);
                  case e:
                     return $$0.a(dnx.c).b(d, dvx.d);
                  default:
                     return $$0.a(dnx.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jj.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dnx.c).b(d, dvx.b);
                  case c:
                     return $$0.a(dnx.c).b(d, dvx.c);
                  case d:
                     return $$0.a(dnx.c).b(d, dvx.e);
                  case e:
                     return $$0.a(dnx.c).b(d, dvx.d);
                  case a:
                     return $$0.a(dnx.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(e) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
