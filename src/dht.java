import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dht extends daa implements dha {
   public static final MapCodec<dht> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dmz.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dht::new)
   );
   public static final dnt b = ddv.aE;
   public static final dnx<dny> c = dnp.af;
   public static final dnx<doi> d = dnp.bi;
   public static final dnq e = dnp.C;
   protected static final eqk f = dhc.e;
   protected static final eqk g = dhc.d;
   protected static final eqk h = daa.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final eqk i = daa.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final eqk j = daa.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final eqk k = daa.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final eqk l = daa.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final eqk m = daa.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final eqk n = daa.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final eqk o = daa.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final eqk[] F = a(f, h, l, i, m);
   protected static final eqk[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final daa J;
   protected final dmz H;

   @Override
   public MapCodec<? extends dht> a() {
      return a;
   }

   private static eqk[] a(eqk $$0, eqk $$1, eqk $$2, eqk $$3, eqk $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(eqk[]::new);
   }

   private static eqk a(int $$0, eqk $$1, eqk $$2, eqk $$3, eqk $$4, eqk $$5) {
      eqk $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = eqh.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = eqh.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = eqh.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = eqh.a($$6, $$5);
      }

      return $$6;
   }

   protected dht(dmz $$0, dmy.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ih.c).a(c, dny.b).a(d, doi.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean g_(dmz $$0) {
      return true;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return ($$0.c(c) == dny.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dmz $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dmz a(css $$0) {
      ih $$1 = $$0.k();
      ib $$2 = $$0.a();
      ein $$3 = $$0.q().b_($$2);
      dmz $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != ih.a && ($$1 == ih.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dny.b : dny.a)
         .a(e, Boolean.valueOf($$3.a() == eio.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static doi i(dmz $$0, cwf $$1, ib $$2) {
      ih $$3 = $$0.c(b);
      dmz $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         ih $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return doi.d;
            }

            return doi.e;
         }
      }

      dmz $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         ih $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return doi.b;
            }

            return doi.c;
         }
      }

      return doi.a;
   }

   private static boolean c(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      dmz $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(dmz $$0) {
      return $$0.b() instanceof dht;
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      ih $$2 = $$0.c(b);
      doi $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == ih.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dgm.c).a(d, doi.c);
                  case c:
                     return $$0.a(dgm.c).a(d, doi.b);
                  case d:
                     return $$0.a(dgm.c).a(d, doi.e);
                  case e:
                     return $$0.a(dgm.c).a(d, doi.d);
                  default:
                     return $$0.a(dgm.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ih.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dgm.c).a(d, doi.b);
                  case c:
                     return $$0.a(dgm.c).a(d, doi.c);
                  case d:
                     return $$0.a(dgm.c).a(d, doi.e);
                  case e:
                     return $$0.a(dgm.c).a(d, doi.d);
                  case a:
                     return $$0.a(dgm.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(e) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}
