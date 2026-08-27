import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.doubles.Double2DoubleFunction;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.slf4j.Logger;

public final class dhe {
   private static final Codec<dhd> c = jb.ag.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dhd> b = Codec.either(d, c)
      .xmap($$0 -> (dhd)$$0.map(dhe::a, Function.identity()), $$0 -> $$0 instanceof dhe.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dhd> a(hr<Codec<? extends dhd>> $$0) {
      a($$0, "blend_alpha", dhe.d.e);
      a($$0, "blend_offset", dhe.f.e);
      a($$0, "beardifier", dhe.b.e);
      a($$0, "old_blended_noise", dwe.a);

      for (dhe.l.a $$1 : dhe.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dhe.o.e);
      a($$0, "end_islands", dhe.i.a);
      a($$0, "weird_scaled_sampler", dhe.z.a);
      a($$0, "shifted_noise", dhe.v.a);
      a($$0, "range_choice", dhe.q.e);
      a($$0, "shift_a", dhe.s.e);
      a($$0, "shift_b", dhe.t.e);
      a($$0, "shift", dhe.r.e);
      a($$0, "blend_density", dhe.e.e);
      a($$0, "clamp", dhe.g.a);

      for (dhe.k.a $$2 : dhe.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dhe.y.a $$3 : dhe.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dhe.w.a);
      a($$0, "constant", dhe.h.e);
      return a($$0, "y_clamped_gradient", dhe.aa.a);
   }

   private static Codec<? extends dhd> a(hr<Codec<? extends dhd>> $$0, String $$1, aou<? extends dhd> $$2) {
      return hr.a($$0, $$1, $$2.a());
   }

   static <A, O> aou<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return aou.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> aou<O> a(Function<dhd, O> $$0, Function<O, dhd> $$1) {
      return a(dhd.d, $$0, $$1);
   }

   static <O> aou<O> a(BiFunction<dhd, dhd, O> $$0, Function<O, dhd> $$1, Function<O, dhd> $$2) {
      return aou.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dhd.d.fieldOf("argument1").forGetter($$1), dhd.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> aou<O> a(MapCodec<O> $$0) {
      return aou.a($$0);
   }

   private dhe() {
   }

   public static dhd a(dhd $$0) {
      return new dhe.l(dhe.l.a.a, $$0);
   }

   public static dhd b(dhd $$0) {
      return new dhe.l(dhe.l.a.b, $$0);
   }

   public static dhd c(dhd $$0) {
      return new dhe.l(dhe.l.a.c, $$0);
   }

   public static dhd d(dhd $$0) {
      return new dhe.l(dhe.l.a.d, $$0);
   }

   public static dhd e(dhd $$0) {
      return new dhe.l(dhe.l.a.e, $$0);
   }

   public static dhd a(he<dwh.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dhe.o(new dhd.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dhd a(he<dwh.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dhd a(he<dwh.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dhd a(dhd $$0, dhd $$1, double $$2, he<dwh.a> $$3) {
      return new dhe.v($$0, a(), $$1, $$2, 0.0, new dhd.c($$3));
   }

   public static dhd a(he<dwh.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dhd b(he<dwh.a> $$0, double $$1, double $$2) {
      return new dhe.o(new dhd.c($$0), $$1, $$2);
   }

   public static dhd a(he<dwh.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dhd a(dhd $$0, double $$1, double $$2, dhd $$3, dhd $$4) {
      return new dhe.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dhd b(he<dwh.a> $$0) {
      return new dhe.s(new dhd.c($$0));
   }

   public static dhd c(he<dwh.a> $$0) {
      return new dhe.t(new dhd.c($$0));
   }

   public static dhd d(he<dwh.a> $$0) {
      return new dhe.r(new dhd.c($$0));
   }

   public static dhd f(dhd $$0) {
      return new dhe.e($$0);
   }

   public static dhd a(long $$0) {
      return new dhe.i($$0);
   }

   public static dhd a(dhd $$0, he<dwh.a> $$1, dhe.z.a $$2) {
      return new dhe.z($$0, new dhd.c($$1), $$2);
   }

   public static dhd a(dhd $$0, dhd $$1) {
      return dhe.y.a(dhe.y.a.a, $$0, $$1);
   }

   public static dhd b(dhd $$0, dhd $$1) {
      return dhe.y.a(dhe.y.a.b, $$0, $$1);
   }

   public static dhd c(dhd $$0, dhd $$1) {
      return dhe.y.a(dhe.y.a.c, $$0, $$1);
   }

   public static dhd d(dhd $$0, dhd $$1) {
      return dhe.y.a(dhe.y.a.d, $$0, $$1);
   }

   public static dhd a(aod<dhe.w.b, dhe.w.a> $$0) {
      return new dhe.w($$0);
   }

   public static dhd a() {
      return dhe.h.f;
   }

   public static dhd a(double $$0) {
      return new dhe.h($$0);
   }

   public static dhd a(int $$0, int $$1, double $$2, double $$3) {
      return new dhe.aa($$0, $$1, $$2, $$3);
   }

   public static dhd a(dhd $$0, dhe.k.a $$1) {
      return dhe.k.a($$1, $$0);
   }

   private static dhd a(dhd $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dhd b() {
      return dhe.d.a;
   }

   public static dhd c() {
      return dhe.f.a;
   }

   public static dhd a(dhd $$0, dhd $$1, dhd $$2) {
      if ($$1 instanceof dhe.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dhd $$4 = d($$0);
         dhd $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dhd a(dhd $$0, double $$1, dhd $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dhe.y.a e, dhd f, dhd g, double h, double i) implements dhe.y {
      @Override
      public double a(dhd.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dhd.a $$1) {
         this.f.a($$0, $$1);
         switch (this.e) {
            case a:
               double[] $$2 = new double[$$0.length];
               this.g.a($$2, $$1);

               for (int $$3 = 0; $$3 < $$0.length; $$3++) {
                  $$0[$$3] += $$2[$$3];
               }
               break;
            case d:
               double $$9 = this.g.b();

               for (int $$10 = 0; $$10 < $$0.length; $$10++) {
                  double $$11 = $$0[$$10];
                  $$0[$$10] = $$11 > $$9 ? $$11 : Math.max($$11, this.g.a($$1.a($$10)));
               }
               break;
            case c:
               double $$6 = this.g.a();

               for (int $$7 = 0; $$7 < $$0.length; $$7++) {
                  double $$8 = $$0[$$7];
                  $$0[$$7] = $$8 < $$6 ? $$8 : Math.min($$8, this.g.a($$1.a($$7)));
               }
               break;
            case b:
               for (int $$4 = 0; $$4 < $$0.length; $$4++) {
                  double $$5 = $$0[$$4];
                  $$0[$$4] = $$5 == 0.0 ? 0.0 : $$5 * this.g.a($$1.a($$4));
               }
         }
      }

      @Override
      public dhd a(dhd.f $$0) {
         return $$0.apply(dhe.y.a(this.e, this.f.a($$0), this.g.a($$0)));
      }

      @Override
      public double a() {
         return this.h;
      }

      @Override
      public double b() {
         return this.i;
      }

      @Override
      public dhe.y.a j() {
         return this.e;
      }

      @Override
      public dhd k() {
         return this.f;
      }

      @Override
      public dhd l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dhd.d {
      private static final MapCodec<dhe.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dfk.e * 2, dfk.d * 2).fieldOf("from_y").forGetter(dhe.aa::j),
                  Codec.intRange(dfk.e * 2, dfk.d * 2).fieldOf("to_y").forGetter(dhe.aa::k),
                  dhe.d.fieldOf("from_value").forGetter(dhe.aa::l),
                  dhe.d.fieldOf("to_value").forGetter(dhe.aa::m)
               )
               .apply($$0, dhe.aa::new)
      );
      public static final aou<dhe.aa> a = dhe.a(i);

      @Override
      public double a(dhd.b $$0) {
         return apa.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
      }

      @Override
      public double a() {
         return Math.min(this.g, this.h);
      }

      @Override
      public double b() {
         return Math.max(this.g, this.h);
      }

      @Override
      public aou<? extends dhd> c() {
         return a;
      }

      public int j() {
         return this.e;
      }

      public int k() {
         return this.f;
      }

      public double l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }
   }

   protected static enum b implements dhe.c {
      a;

      @Override
      public double a(dhd.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dhd.a $$1) {
         Arrays.fill($$0, 0.0);
      }

      @Override
      public double a() {
         return 0.0;
      }

      @Override
      public double b() {
         return 0.0;
      }
   }

   public interface c extends dhd.d {
      aou<dhd> e = aou.a(MapCodec.unit(dhe.b.a));

      @Override
      default aou<? extends dhd> c() {
         return e;
      }
   }

   protected static enum d implements dhd.d {
      a;

      public static final aou<dhd> e = aou.a(MapCodec.unit(a));

      @Override
      public double a(dhd.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dhd.a $$1) {
         Arrays.fill($$0, 1.0);
      }

      @Override
      public double a() {
         return 1.0;
      }

      @Override
      public double b() {
         return 1.0;
      }

      @Override
      public aou<? extends dhd> c() {
         return e;
      }
   }

   static record e(dhd a) implements dhe.x {
      static final aou<dhe.e> e = dhe.a(dhe.e::new, dhe.e::j);

      @Override
      public double a(dhd.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dhd a(dhd.f $$0) {
         return $$0.apply(new dhe.e(this.a.a($$0)));
      }

      @Override
      public double a() {
         return Double.NEGATIVE_INFINITY;
      }

      @Override
      public double b() {
         return Double.POSITIVE_INFINITY;
      }

      @Override
      public aou<? extends dhd> c() {
         return e;
      }

      @Override
      public dhd j() {
         return this.a;
      }
   }

   protected static enum f implements dhd.d {
      a;

      public static final aou<dhd> e = aou.a(MapCodec.unit(a));

      @Override
      public double a(dhd.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dhd.a $$1) {
         Arrays.fill($$0, 0.0);
      }

      @Override
      public double a() {
         return 0.0;
      }

      @Override
      public double b() {
         return 0.0;
      }

      @Override
      public aou<? extends dhd> c() {
         return e;
      }
   }

   protected static record g(dhd e, double f, double g) implements dhe.p {
      private static final MapCodec<dhe.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dhd.b.fieldOf("input").forGetter(dhe.g::as_), dhe.d.fieldOf("min").forGetter(dhe.g::a), dhe.d.fieldOf("max").forGetter(dhe.g::b))
               .apply($$0, dhe.g::new)
      );
      public static final aou<dhe.g> a = dhe.a(h);

      @Override
      public double a(double $$0) {
         return apa.a($$0, this.f, this.g);
      }

      @Override
      public dhd a(dhd.f $$0) {
         return new dhe.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public aou<? extends dhd> c() {
         return a;
      }

      @Override
      public dhd as_() {
         return this.e;
      }

      @Override
      public double a() {
         return this.f;
      }

      @Override
      public double b() {
         return this.g;
      }
   }

   static record h(double a) implements dhd.d {
      static final aou<dhe.h> e = dhe.a(dhe.d, dhe.h::new, dhe.h::j);
      static final dhe.h f = new dhe.h(0.0);

      @Override
      public void a(double[] $$0, dhd.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public aou<? extends dhd> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dhd.d {
      public static final aou<dhe.i> a = aou.a(MapCodec.unit(new dhe.i(0L)));
      private static final float e = -0.9F;
      private final dwk f;

      public i(long $$0) {
         apf $$1 = new dhl($$0);
         $$1.b(17292);
         this.f = new dwk($$1);
      }

      private static float a(dwk $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - apa.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = apa.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (apa.e((float)$$10) * 3439.0F + apa.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - apa.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = apa.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dhd.b $$0) {
         return ((double)a(this.f, $$0.a() / 8, $$0.c() / 8) - 8.0) / 128.0;
      }

      @Override
      public double a() {
         return -0.84375;
      }

      @Override
      public double b() {
         return 0.5625;
      }

      @Override
      public aou<? extends dhd> c() {
         return a;
      }
   }

   @aqa
   public static record j(he<dhd> a) implements dhd {
      @Override
      public double a(dhd.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dhd.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dhd a(dhd.f $$0) {
         return $$0.apply(new dhe.j(new he.a<>(this.a.a().a($$0))));
      }

      @Override
      public double a() {
         return this.a.b() ? this.a.a().a() : Double.NEGATIVE_INFINITY;
      }

      @Override
      public double b() {
         return this.a.b() ? this.a.a().b() : Double.POSITIVE_INFINITY;
      }

      @Override
      public aou<? extends dhd> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public he<dhd> j() {
         return this.a;
      }
   }

   protected static record k(dhe.k.a a, dhd e, double f, double g) implements dhe.p {
      public static dhe.k a(dhe.k.a $$0, dhd $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dhe.k.a.a && $$0 != dhe.k.a.b ? new dhe.k($$0, $$1, $$3, $$4) : new dhe.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dhe.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = apa.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dhe.k b(dhd.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public aou<? extends dhd> c() {
         return this.a.h;
      }

      public dhe.k.a k() {
         return this.a;
      }

      @Override
      public dhd as_() {
         return this.e;
      }

      @Override
      public double a() {
         return this.f;
      }

      @Override
      public double b() {
         return this.g;
      }

      static enum a implements apr {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final aou<dhe.k> h = dhe.a($$0x -> dhe.k.a(this, $$0x), dhe.k::as_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dhe.l.a a, dhd e) implements dhe.m {
      @Override
      public double a(dhd.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dhd.a $$1) {
         this.e.a($$0, $$1);
      }

      @Override
      public double a() {
         return this.e.a();
      }

      @Override
      public double b() {
         return this.e.b();
      }

      @Override
      public dhe.l.a j() {
         return this.a;
      }

      @Override
      public dhd k() {
         return this.e;
      }

      static enum a implements apr {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final aou<dhe.m> g = dhe.a($$0x -> new dhe.l(this, $$0x), dhe.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dhd {
      dhe.l.a j();

      dhd k();

      @Override
      default aou<? extends dhd> c() {
         return this.j().g;
      }

      @Override
      default dhd a(dhd.f $$0) {
         return $$0.apply(new dhe.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dhe.n.a e, dhd f, double g, double h, double i) implements dhe.p, dhe.y {
      @Override
      public dhe.y.a j() {
         return this.e == dhe.n.a.a ? dhe.y.a.b : dhe.y.a.a;
      }

      @Override
      public dhd k() {
         return dhe.a(this.i);
      }

      @Override
      public dhd l() {
         return this.f;
      }

      @Override
      public double a(double $$0) {
         return switch (this.e) {
            case a -> $$0 * this.i;
            case b -> $$0 + this.i;
         };
      }

      @Override
      public dhd a(dhd.f $$0) {
         dhd $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dhe.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dhe.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dhe.n.a m() {
         return this.e;
      }

      @Override
      public dhd as_() {
         return this.f;
      }

      @Override
      public double a() {
         return this.g;
      }

      @Override
      public double b() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      static enum a {
         a,
         b;
      }
   }

   protected static record o(dhd.c f, @Deprecated double g, double h) implements dhd {
      public static final MapCodec<dhe.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dhd.c.a.fieldOf("noise").forGetter(dhe.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dhe.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dhe.o::l)
               )
               .apply($$0, dhe.o::new)
      );
      public static final aou<dhe.o> e = dhe.a(a);

      @Override
      public double a(dhd.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dhd.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dhd a(dhd.f $$0) {
         return $$0.apply(new dhe.o($$0.a(this.f), this.g, this.h));
      }

      @Override
      public double a() {
         return -this.b();
      }

      @Override
      public double b() {
         return this.f.a();
      }

      @Override
      public aou<? extends dhd> c() {
         return e;
      }

      public dhd.c j() {
         return this.f;
      }

      @Deprecated
      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }
   }

   interface p extends dhd {
      dhd as_();

      @Override
      default double a(dhd.b $$0) {
         return this.a(this.as_().a($$0));
      }

      @Override
      default void a(double[] $$0, dhd.a $$1) {
         this.as_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dhd f, double g, double h, dhd i, dhd j) implements dhd {
      public static final MapCodec<dhe.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dhd.d.fieldOf("input").forGetter(dhe.q::j),
                  dhe.d.fieldOf("min_inclusive").forGetter(dhe.q::k),
                  dhe.d.fieldOf("max_exclusive").forGetter(dhe.q::l),
                  dhd.d.fieldOf("when_in_range").forGetter(dhe.q::m),
                  dhd.d.fieldOf("when_out_of_range").forGetter(dhe.q::n)
               )
               .apply($$0, dhe.q::new)
      );
      public static final aou<dhe.q> e = dhe.a(a);

      @Override
      public double a(dhd.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dhd.a $$1) {
         this.f.a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            double $$3 = $$0[$$2];
            if ($$3 >= this.g && $$3 < this.h) {
               $$0[$$2] = this.i.a($$1.a($$2));
            } else {
               $$0[$$2] = this.j.a($$1.a($$2));
            }
         }
      }

      @Override
      public dhd a(dhd.f $$0) {
         return $$0.apply(new dhe.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
      }

      @Override
      public double a() {
         return Math.min(this.i.a(), this.j.a());
      }

      @Override
      public double b() {
         return Math.max(this.i.b(), this.j.b());
      }

      @Override
      public aou<? extends dhd> c() {
         return e;
      }

      public dhd j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dhd m() {
         return this.i;
      }

      public dhd n() {
         return this.j;
      }
   }

   protected static record r(dhd.c a) implements dhe.u {
      static final aou<dhe.r> e = dhe.a(dhd.c.a, dhe.r::new, dhe.r::j);

      @Override
      public double a(dhd.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dhd a(dhd.f $$0) {
         return $$0.apply(new dhe.r($$0.a(this.a)));
      }

      @Override
      public aou<? extends dhd> c() {
         return e;
      }

      @Override
      public dhd.c j() {
         return this.a;
      }
   }

   protected static record s(dhd.c a) implements dhe.u {
      static final aou<dhe.s> e = dhe.a(dhd.c.a, dhe.s::new, dhe.s::j);

      @Override
      public double a(dhd.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dhd a(dhd.f $$0) {
         return $$0.apply(new dhe.s($$0.a(this.a)));
      }

      @Override
      public aou<? extends dhd> c() {
         return e;
      }

      @Override
      public dhd.c j() {
         return this.a;
      }
   }

   protected static record t(dhd.c a) implements dhe.u {
      static final aou<dhe.t> e = dhe.a(dhd.c.a, dhe.t::new, dhe.t::j);

      @Override
      public double a(dhd.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dhd a(dhd.f $$0) {
         return $$0.apply(new dhe.t($$0.a(this.a)));
      }

      @Override
      public aou<? extends dhd> c() {
         return e;
      }

      @Override
      public dhd.c j() {
         return this.a;
      }
   }

   interface u extends dhd {
      dhd.c j();

      @Override
      default double a() {
         return -this.b();
      }

      @Override
      default double b() {
         return this.j().a() * 4.0;
      }

      default double a(double $$0, double $$1, double $$2) {
         return this.j().a($$0 * 0.25, $$1 * 0.25, $$2 * 0.25) * 4.0;
      }

      @Override
      default void a(double[] $$0, dhd.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dhd e, dhd f, dhd g, double h, double i, dhd.c j) implements dhd {
      private static final MapCodec<dhe.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dhd.d.fieldOf("shift_x").forGetter(dhe.v::j),
                  dhd.d.fieldOf("shift_y").forGetter(dhe.v::k),
                  dhd.d.fieldOf("shift_z").forGetter(dhe.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dhe.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dhe.v::n),
                  dhd.c.a.fieldOf("noise").forGetter(dhe.v::o)
               )
               .apply($$0, dhe.v::new)
      );
      public static final aou<dhe.v> a = dhe.a(k);

      @Override
      public double a(dhd.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dhd.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dhd a(dhd.f $$0) {
         return $$0.apply(new dhe.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
      }

      @Override
      public double a() {
         return -this.b();
      }

      @Override
      public double b() {
         return this.j.a();
      }

      @Override
      public aou<? extends dhd> c() {
         return a;
      }

      public dhd j() {
         return this.e;
      }

      public dhd k() {
         return this.f;
      }

      public dhd l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dhd.c o() {
         return this.j;
      }
   }

   public static record w(aod<dhe.w.b, dhe.w.a> e) implements dhd {
      private static final Codec<aod<dhe.w.b, dhe.w.a>> f = aod.a(dhe.w.a.b);
      private static final MapCodec<dhe.w> g = f.fieldOf("spline").xmap(dhe.w::new, dhe.w::j);
      public static final aou<dhe.w> a = dhe.a(g);

      @Override
      public double a(dhd.b $$0) {
         return (double)this.e.a(new dhe.w.b($$0));
      }

      @Override
      public double a() {
         return (double)this.e.b();
      }

      @Override
      public double b() {
         return (double)this.e.c();
      }

      @Override
      public void a(double[] $$0, dhd.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dhd a(dhd.f $$0) {
         return $$0.apply(new dhe.w(this.e.a((aod.d<dhe.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public aou<? extends dhd> c() {
         return a;
      }

      public aod<dhe.w.b, dhe.w.a> j() {
         return this.e;
      }

      public static record a(he<dhd> c) implements apx<dhe.w.b> {
         public static final Codec<dhe.w.a> b = dhd.c.xmap(dhe.w.a::new, dhe.w.a::a);

         @Override
         public String toString() {
            Optional<acp<dhd>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               acp<dhd> $$1 = $$0.get();
               if ($$1 == dhr.d) {
                  return "continents";
               }

               if ($$1 == dhr.e) {
                  return "erosion";
               }

               if ($$1 == dhr.f) {
                  return "weirdness";
               }

               if ($$1 == dhr.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dhe.w.b $$0) {
            return (float)this.c.a().a($$0.a());
         }

         @Override
         public float b() {
            return this.c.b() ? (float)this.c.a().a() : Float.NEGATIVE_INFINITY;
         }

         @Override
         public float c() {
            return this.c.b() ? (float)this.c.a().b() : Float.POSITIVE_INFINITY;
         }

         public dhe.w.a a(dhd.f $$0) {
            return new dhe.w.a(new he.a<>(this.c.a().a($$0)));
         }

         public he<dhd> a() {
            return this.c;
         }
      }

      public static record b(dhd.b a) {
      }
   }

   interface x extends dhd {
      dhd j();

      @Override
      default double a(dhd.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dhd.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dhd.b var1, double var2);
   }

   interface y extends dhd {
      Logger a = LogUtils.getLogger();

      static dhe.y a(dhe.y.a $$0, dhd $$1, dhd $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dhe.y.a.c || $$0 == dhe.y.a.d) {
            boolean $$7 = $$3 >= $$6;
            boolean $$8 = $$4 >= $$5;
            if ($$7 || $$8) {
               a.warn("Creating a " + $$0 + " function between two non-overlapping inputs: " + $$1 + " and " + $$2);
            }
         }
         double $$9 = switch ($$0) {
            case a -> $$3 + $$4;
            case d -> Math.max($$3, $$4);
            case c -> Math.min($$3, $$4);
            case b -> $$3 > 0.0 && $$4 > 0.0 ? $$3 * $$4 : ($$5 < 0.0 && $$6 < 0.0 ? $$5 * $$6 : Math.min($$3 * $$6, $$5 * $$4));
         };

         double $$10 = switch ($$0) {
            case a -> $$5 + $$6;
            case d -> Math.max($$5, $$6);
            case c -> Math.min($$5, $$6);
            case b -> $$3 > 0.0 && $$4 > 0.0 ? $$5 * $$6 : ($$5 < 0.0 && $$6 < 0.0 ? $$3 * $$4 : Math.max($$3 * $$4, $$5 * $$6));
         };
         if ($$0 == dhe.y.a.b || $$0 == dhe.y.a.a) {
            if ($$1 instanceof dhe.h $$11) {
               return new dhe.n($$0 == dhe.y.a.a ? dhe.n.a.b : dhe.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dhe.h $$12) {
               return new dhe.n($$0 == dhe.y.a.a ? dhe.n.a.b : dhe.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dhe.a($$0, $$1, $$2, $$9, $$10);
      }

      dhe.y.a j();

      dhd k();

      dhd l();

      @Override
      default aou<? extends dhd> c() {
         return this.j().e;
      }

      public static enum a implements apr {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final aou<dhe.y> e = dhe.a((BiFunction<dhd, dhd, dhe.y>)(($$0x, $$1) -> dhe.y.a(this, $$0x, $$1)), dhe.y::k, dhe.y::l);
         private final String f;

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   protected static record z(dhd e, dhd.c f, dhe.z.a g) implements dhe.x {
      private static final MapCodec<dhe.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dhd.d.fieldOf("input").forGetter(dhe.z::j),
                  dhd.c.a.fieldOf("noise").forGetter(dhe.z::k),
                  dhe.z.a.c.fieldOf("rarity_value_mapper").forGetter(dhe.z::l)
               )
               .apply($$0, dhe.z::new)
      );
      public static final aou<dhe.z> a = dhe.a(h);

      @Override
      public double a(dhd.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dhd a(dhd.f $$0) {
         return $$0.apply(new dhe.z(this.e.a($$0), $$0.a(this.f), this.g));
      }

      @Override
      public double a() {
         return 0.0;
      }

      @Override
      public double b() {
         return this.g.f * this.f.a();
      }

      @Override
      public aou<? extends dhd> c() {
         return a;
      }

      @Override
      public dhd j() {
         return this.e;
      }

      public dhd.c k() {
         return this.f;
      }

      public dhe.z.a l() {
         return this.g;
      }

      public static enum a implements apr {
         a("type_1", dhr.a::b, 2.0),
         b("type_2", dhr.a::a, 3.0);

         public static final Codec<dhe.z.a> c = apr.a(dhe.z.a::values);
         private final String d;
         final Double2DoubleFunction e;
         final double f;

         private a(String $$0, Double2DoubleFunction $$1, double $$2) {
            this.d = $$0;
            this.e = $$1;
            this.f = $$2;
         }

         @Override
         public String c() {
            return this.d;
         }
      }
   }
}
