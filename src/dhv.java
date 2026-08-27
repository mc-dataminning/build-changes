import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dhv extends dac implements dhc {
   public static final MapCodec<dhv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dnb.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dhv::new)
   );
   public static final dnv b = ddx.aE;
   public static final dnz<doa> c = dnr.af;
   public static final dnz<dok> d = dnr.bi;
   public static final dns e = dnr.C;
   protected static final eqm f = dhe.e;
   protected static final eqm g = dhe.d;
   protected static final eqm h = dac.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final eqm i = dac.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final eqm j = dac.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final eqm k = dac.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final eqm l = dac.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final eqm m = dac.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final eqm n = dac.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final eqm o = dac.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final eqm[] F = a(f, h, l, i, m);
   protected static final eqm[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dac J;
   protected final dnb H;

   @Override
   public MapCodec<? extends dhv> a() {
      return a;
   }

   private static eqm[] a(eqm $$0, eqm $$1, eqm $$2, eqm $$3, eqm $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(eqm[]::new);
   }

   private static eqm a(int $$0, eqm $$1, eqm $$2, eqm $$3, eqm $$4, eqm $$5) {
      eqm $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = eqj.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = eqj.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = eqj.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = eqj.a($$6, $$5);
      }

      return $$6;
   }

   protected dhv(dnb $$0, dna.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ih.c).a(c, doa.b).a(d, dok.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean g_(dnb $$0) {
      return true;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return ($$0.c(c) == doa.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dnb $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dnb a(csu $$0) {
      ih $$1 = $$0.k();
      ib $$2 = $$0.a();
      eip $$3 = $$0.q().b_($$2);
      dnb $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != ih.a && ($$1 == ih.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? doa.b : doa.a)
         .a(e, Boolean.valueOf($$3.a() == eiq.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dok i(dnb $$0, cwh $$1, ib $$2) {
      ih $$3 = $$0.c(b);
      dnb $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         ih $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dok.d;
            }

            return dok.e;
         }
      }

      dnb $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         ih $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dok.b;
            }

            return dok.c;
         }
      }

      return dok.a;
   }

   private static boolean c(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      dnb $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(dnb $$0) {
      return $$0.b() instanceof dhv;
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      ih $$2 = $$0.c(b);
      dok $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == ih.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dgo.c).a(d, dok.c);
                  case c:
                     return $$0.a(dgo.c).a(d, dok.b);
                  case d:
                     return $$0.a(dgo.c).a(d, dok.e);
                  case e:
                     return $$0.a(dgo.c).a(d, dok.d);
                  default:
                     return $$0.a(dgo.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ih.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dgo.c).a(d, dok.b);
                  case c:
                     return $$0.a(dgo.c).a(d, dok.c);
                  case d:
                     return $$0.a(dgo.c).a(d, dok.e);
                  case e:
                     return $$0.a(dgo.c).a(d, dok.d);
                  case a:
                     return $$0.a(dgo.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(e) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}
