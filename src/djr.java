import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class djr extends dby implements diy {
   public static final MapCodec<djr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(doz.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, djr::new)
   );
   public static final dpt b = dft.aE;
   public static final dpx<dpy> c = dpp.af;
   public static final dpx<dqi> d = dpp.bi;
   public static final dpq e = dpp.C;
   protected static final est f = dja.e;
   protected static final est g = dja.d;
   protected static final est h = dby.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final est i = dby.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final est j = dby.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final est k = dby.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final est l = dby.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final est m = dby.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final est n = dby.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final est o = dby.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final est[] F = a(f, h, l, i, m);
   protected static final est[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dby J;
   protected final doz H;

   @Override
   public MapCodec<? extends djr> a() {
      return a;
   }

   private static est[] a(est $$0, est $$1, est $$2, est $$3, est $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(est[]::new);
   }

   private static est a(int $$0, est $$1, est $$2, est $$3, est $$4, est $$5) {
      est $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = esq.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = esq.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = esq.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = esq.a($$6, $$5);
      }

      return $$6;
   }

   protected djr(doz $$0, doy.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ih.c).a(c, dpy.b).a(d, dqi.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean g_(doz $$0) {
      return true;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return ($$0.c(c) == dpy.a ? F : G)[I[this.n($$0)]];
   }

   private int n(doz $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public doz a(cuo $$0) {
      ih $$1 = $$0.k();
      ib $$2 = $$0.a();
      eks $$3 = $$0.q().b_($$2);
      doz $$4 = this.n()
         .a(b, $$0.g())
         .a(c, $$1 != ih.a && ($$1 == ih.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dpy.b : dpy.a)
         .a(e, Boolean.valueOf($$3.a() == ekt.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dqi i(doz $$0, cyd $$1, ib $$2) {
      ih $$3 = $$0.c(b);
      doz $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         ih $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dqi.d;
            }

            return dqi.e;
         }
      }

      doz $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         ih $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dqi.b;
            }

            return dqi.c;
         }
      }

      return dqi.a;
   }

   private static boolean c(doz $$0, cyd $$1, ib $$2, ih $$3) {
      doz $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(doz $$0) {
      return $$0.b() instanceof djr;
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      ih $$2 = $$0.c(b);
      dqi $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == ih.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dik.c).a(d, dqi.c);
                  case c:
                     return $$0.a(dik.c).a(d, dqi.b);
                  case d:
                     return $$0.a(dik.c).a(d, dqi.e);
                  case e:
                     return $$0.a(dik.c).a(d, dqi.d);
                  default:
                     return $$0.a(dik.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ih.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dik.c).a(d, dqi.b);
                  case c:
                     return $$0.a(dik.c).a(d, dqi.c);
                  case d:
                     return $$0.a(dik.c).a(d, dqi.e);
                  case e:
                     return $$0.a(dik.c).a(d, dqi.d);
                  case a:
                     return $$0.a(dik.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(e) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
