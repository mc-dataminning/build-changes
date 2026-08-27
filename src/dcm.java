import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dcm extends cut implements dbt {
   public static final MapCodec<dcm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgw.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), t()).apply($$0, dcm::new)
   );
   public static final dhq b = cyo.aE;
   public static final dhu<dhv> c = dhm.af;
   public static final dhu<dif> d = dhm.bi;
   public static final dhn e = dhm.C;
   protected static final ekb f = dbv.e;
   protected static final ekb g = dbv.d;
   protected static final ekb h = cut.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final ekb i = cut.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final ekb j = cut.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final ekb k = cut.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final ekb l = cut.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final ekb m = cut.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final ekb n = cut.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final ekb o = cut.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final ekb[] F = a(f, h, l, i, m);
   protected static final ekb[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final cut J;
   protected final dgw H;

   @Override
   public MapCodec<? extends dcm> a() {
      return a;
   }

   private static ekb[] a(ekb $$0, ekb $$1, ekb $$2, ekb $$3, ekb $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(ekb[]::new);
   }

   private static ekb a(int $$0, ekb $$1, ekb $$2, ekb $$3, ekb $$4, ekb $$5) {
      ekb $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = ejy.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = ejy.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = ejy.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = ejy.a($$6, $$5);
      }

      return $$6;
   }

   protected dcm(dgw $$0, dgv.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, hx.c).a(c, dhv.b).a(d, dif.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   public boolean g_(dgw $$0) {
      return true;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return ($$0.c(c) == dhv.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dgw $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dgw a(cnj $$0) {
      hx $$1 = $$0.k();
      ht $$2 = $$0.a();
      ecg $$3 = $$0.q().b_($$2);
      dgw $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != hx.a && ($$1 == hx.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dhv.b : dhv.a)
         .a(e, Boolean.valueOf($$3.a() == ech.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dif i(dgw $$0, cqy $$1, ht $$2) {
      hx $$3 = $$0.c(b);
      dgw $$4 = $$1.a_($$2.a($$3));
      if (h($$4) && $$0.c(c) == $$4.c(c)) {
         hx $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dif.d;
            }

            return dif.e;
         }
      }

      dgw $$6 = $$1.a_($$2.a($$3.g()));
      if (h($$6) && $$0.c(c) == $$6.c(c)) {
         hx $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dif.b;
            }

            return dif.c;
         }
      }

      return dif.a;
   }

   private static boolean c(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      dgw $$4 = $$1.a_($$2.a($$3));
      return !h($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean h(dgw $$0) {
      return $$0.b() instanceof dcm;
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      hx $$2 = $$0.c(b);
      dif $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == hx.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dbf.c).a(d, dif.c);
                  case c:
                     return $$0.a(dbf.c).a(d, dif.b);
                  case d:
                     return $$0.a(dbf.c).a(d, dif.e);
                  case e:
                     return $$0.a(dbf.c).a(d, dif.d);
                  default:
                     return $$0.a(dbf.c);
               }
            }
            break;
         case c:
            if ($$2.o() == hx.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dbf.c).a(d, dif.b);
                  case c:
                     return $$0.a(dbf.c).a(d, dif.c);
                  case d:
                     return $$0.a(dbf.c).a(d, dif.e);
                  case e:
                     return $$0.a(dbf.c).a(d, dif.d);
                  case a:
                     return $$0.a(dbf.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(e) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
