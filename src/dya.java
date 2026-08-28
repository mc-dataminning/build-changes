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

public final class dya {
   private static final Codec<dxz> c = lq.ad.r().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dxz> b = Codec.either(d, c)
      .xmap($$0 -> (dxz)$$0.map(dya::a, Function.identity()), $$0 -> $$0 instanceof dya.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends dxz> a(jw<MapCodec<? extends dxz>> $$0) {
      a($$0, "blend_alpha", dya.d.e);
      a($$0, "blend_offset", dya.f.e);
      a($$0, "beardifier", dya.b.e);
      a($$0, "old_blended_noise", enj.a);

      for (dya.l.a $$1 : dya.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dya.o.e);
      a($$0, "end_islands", dya.i.a);
      a($$0, "weird_scaled_sampler", dya.z.a);
      a($$0, "shifted_noise", dya.v.a);
      a($$0, "range_choice", dya.q.e);
      a($$0, "shift_a", dya.s.e);
      a($$0, "shift_b", dya.t.e);
      a($$0, "shift", dya.r.e);
      a($$0, "blend_density", dya.e.e);
      a($$0, "clamp", dya.g.a);

      for (dya.k.a $$2 : dya.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dya.y.a $$3 : dya.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dya.w.a);
      a($$0, "constant", dya.h.e);
      return a($$0, "y_clamped_gradient", dya.aa.a);
   }

   private static MapCodec<? extends dxz> a(jw<MapCodec<? extends dxz>> $$0, String $$1, axz<? extends dxz> $$2) {
      return jw.a($$0, $$1, $$2.a());
   }

   static <A, O> axz<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return axz.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> axz<O> a(Function<dxz, O> $$0, Function<O, dxz> $$1) {
      return a(dxz.d, $$0, $$1);
   }

   static <O> axz<O> a(BiFunction<dxz, dxz, O> $$0, Function<O, dxz> $$1, Function<O, dxz> $$2) {
      return axz.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dxz.d.fieldOf("argument1").forGetter($$1), dxz.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> axz<O> a(MapCodec<O> $$0) {
      return axz.a($$0);
   }

   private dya() {
   }

   public static dxz a(dxz $$0) {
      return new dya.l(dya.l.a.a, $$0);
   }

   public static dxz b(dxz $$0) {
      return new dya.l(dya.l.a.b, $$0);
   }

   public static dxz c(dxz $$0) {
      return new dya.l(dya.l.a.c, $$0);
   }

   public static dxz d(dxz $$0) {
      return new dya.l(dya.l.a.d, $$0);
   }

   public static dxz e(dxz $$0) {
      return new dya.l(dya.l.a.e, $$0);
   }

   public static dxz a(jj<enm.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dya.o(new dxz.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dxz a(jj<enm.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dxz a(jj<enm.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dxz a(dxz $$0, dxz $$1, double $$2, jj<enm.a> $$3) {
      return new dya.v($$0, a(), $$1, $$2, 0.0, new dxz.c($$3));
   }

   public static dxz a(jj<enm.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dxz b(jj<enm.a> $$0, double $$1, double $$2) {
      return new dya.o(new dxz.c($$0), $$1, $$2);
   }

   public static dxz a(jj<enm.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dxz a(dxz $$0, double $$1, double $$2, dxz $$3, dxz $$4) {
      return new dya.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dxz b(jj<enm.a> $$0) {
      return new dya.s(new dxz.c($$0));
   }

   public static dxz c(jj<enm.a> $$0) {
      return new dya.t(new dxz.c($$0));
   }

   public static dxz d(jj<enm.a> $$0) {
      return new dya.r(new dxz.c($$0));
   }

   public static dxz f(dxz $$0) {
      return new dya.e($$0);
   }

   public static dxz a(long $$0) {
      return new dya.i($$0);
   }

   public static dxz a(dxz $$0, jj<enm.a> $$1, dya.z.a $$2) {
      return new dya.z($$0, new dxz.c($$1), $$2);
   }

   public static dxz a(dxz $$0, dxz $$1) {
      return dya.y.a(dya.y.a.a, $$0, $$1);
   }

   public static dxz b(dxz $$0, dxz $$1) {
      return dya.y.a(dya.y.a.b, $$0, $$1);
   }

   public static dxz c(dxz $$0, dxz $$1) {
      return dya.y.a(dya.y.a.c, $$0, $$1);
   }

   public static dxz d(dxz $$0, dxz $$1) {
      return dya.y.a(dya.y.a.d, $$0, $$1);
   }

   public static dxz a(axh<dya.w.b, dya.w.a> $$0) {
      return new dya.w($$0);
   }

   public static dxz a() {
      return dya.h.f;
   }

   public static dxz a(double $$0) {
      return new dya.h($$0);
   }

   public static dxz a(int $$0, int $$1, double $$2, double $$3) {
      return new dya.aa($$0, $$1, $$2, $$3);
   }

   public static dxz a(dxz $$0, dya.k.a $$1) {
      return dya.k.a($$1, $$0);
   }

   private static dxz a(dxz $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dxz b() {
      return dya.d.a;
   }

   public static dxz c() {
      return dya.f.a;
   }

   public static dxz a(dxz $$0, dxz $$1, dxz $$2) {
      if ($$1 instanceof dya.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dxz $$4 = d($$0);
         dxz $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dxz a(dxz $$0, double $$1, dxz $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dya.y.a e, dxz f, dxz g, double h, double i) implements dya.y {
      @Override
      public double a(dxz.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, dxz.a $$1) {
         this.f.a($$0, $$1);
         switch (this.e) {
            case a:
               double[] $$2 = new double[$$0.length];
               this.g.a($$2, $$1);

               for (int $$3 = 0; $$3 < $$0.length; $$3++) {
                  $$0[$$3] += $$2[$$3];
               }
               break;
            case b:
               for (int $$4 = 0; $$4 < $$0.length; $$4++) {
                  double $$5 = $$0[$$4];
                  $$0[$$4] = $$5 == 0.0 ? 0.0 : $$5 * this.g.a($$1.a($$4));
               }
               break;
            case c:
               double $$6 = this.g.a();

               for (int $$7 = 0; $$7 < $$0.length; $$7++) {
                  double $$8 = $$0[$$7];
                  $$0[$$7] = $$8 < $$6 ? $$8 : Math.min($$8, this.g.a($$1.a($$7)));
               }
               break;
            case d:
               double $$9 = this.g.b();

               for (int $$10 = 0; $$10 < $$0.length; $$10++) {
                  double $$11 = $$0[$$10];
                  $$0[$$10] = $$11 > $$9 ? $$11 : Math.max($$11, this.g.a($$1.a($$10)));
               }
         }
      }

      @Override
      public dxz a(dxz.f $$0) {
         return $$0.apply(dya.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dya.y.a j() {
         return this.e;
      }

      @Override
      public dxz k() {
         return this.f;
      }

      @Override
      public dxz l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dxz.d {
      private static final MapCodec<dya.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dwg.e * 2, dwg.d * 2).fieldOf("from_y").forGetter(dya.aa::j),
                  Codec.intRange(dwg.e * 2, dwg.d * 2).fieldOf("to_y").forGetter(dya.aa::k),
                  dya.d.fieldOf("from_value").forGetter(dya.aa::l),
                  dya.d.fieldOf("to_value").forGetter(dya.aa::m)
               )
               .apply($$0, dya.aa::new)
      );
      public static final axz<dya.aa> a = dya.a(i);

      @Override
      public double a(dxz.b $$0) {
         return ayg.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public axz<? extends dxz> c() {
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

   protected static enum b implements dya.c {
      a;

      @Override
      public double a(dxz.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dxz.a $$1) {
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

   public interface c extends dxz.d {
      axz<dxz> e = axz.a(MapCodec.unit(dya.b.a));

      @Override
      default axz<? extends dxz> c() {
         return e;
      }
   }

   protected static enum d implements dxz.d {
      a;

      public static final axz<dxz> e = axz.a(MapCodec.unit(a));

      @Override
      public double a(dxz.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dxz.a $$1) {
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
      public axz<? extends dxz> c() {
         return e;
      }
   }

   static record e(dxz a) implements dya.x {
      static final axz<dya.e> e = dya.a(dya.e::new, dya.e::j);

      @Override
      public double a(dxz.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dxz a(dxz.f $$0) {
         return $$0.apply(new dya.e(this.a.a($$0)));
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
      public axz<? extends dxz> c() {
         return e;
      }

      @Override
      public dxz j() {
         return this.a;
      }
   }

   protected static enum f implements dxz.d {
      a;

      public static final axz<dxz> e = axz.a(MapCodec.unit(a));

      @Override
      public double a(dxz.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dxz.a $$1) {
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
      public axz<? extends dxz> c() {
         return e;
      }
   }

   protected static record g(dxz e, double f, double g) implements dya.p {
      private static final MapCodec<dya.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dxz.b.fieldOf("input").forGetter(dya.g::aC_), dya.d.fieldOf("min").forGetter(dya.g::a), dya.d.fieldOf("max").forGetter(dya.g::b))
               .apply($$0, dya.g::new)
      );
      public static final axz<dya.g> a = dya.a(h);

      @Override
      public double a(double $$0) {
         return ayg.a($$0, this.f, this.g);
      }

      @Override
      public dxz a(dxz.f $$0) {
         return new dya.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public axz<? extends dxz> c() {
         return a;
      }

      @Override
      public dxz aC_() {
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

   static record h(double a) implements dxz.d {
      static final axz<dya.h> e = dya.a(dya.d, dya.h::new, dya.h::j);
      static final dya.h f = new dya.h(0.0);

      @Override
      public void a(double[] $$0, dxz.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public axz<? extends dxz> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dxz.d {
      public static final axz<dya.i> a = axz.a(MapCodec.unit(new dya.i(0L)));
      private static final float e = -0.9F;
      private final enp f;

      public i(long $$0) {
         ayo $$1 = new dyh($$0);
         $$1.b(17292);
         this.f = new enp($$1);
      }

      private static float a(enp $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - ayg.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = ayg.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (ayg.e((float)$$10) * 3439.0F + ayg.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - ayg.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = ayg.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dxz.b $$0) {
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
      public axz<? extends dxz> c() {
         return a;
      }
   }

   @azl
   public static record j(jj<dxz> a) implements dxz {
      @Override
      public double a(dxz.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dxz.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dxz a(dxz.f $$0) {
         return $$0.apply(new dya.j(new jj.a<>(this.a.a().a($$0))));
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
      public axz<? extends dxz> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jj<dxz> j() {
         return this.a;
      }
   }

   protected static record k(dya.k.a a, dxz e, double f, double g) implements dya.p {
      public static dya.k a(dya.k.a $$0, dxz $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dya.k.a.a && $$0 != dya.k.a.b ? new dya.k($$0, $$1, $$3, $$4) : new dya.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dya.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = ayg.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dya.k b(dxz.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public axz<? extends dxz> c() {
         return this.a.h;
      }

      public dya.k.a k() {
         return this.a;
      }

      @Override
      public dxz aC_() {
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

      static enum a implements azc {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final axz<dya.k> h = dya.a($$0x -> dya.k.a(this, $$0x), dya.k::aC_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dya.l.a a, dxz e) implements dya.m {
      @Override
      public double a(dxz.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dxz.a $$1) {
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
      public dya.l.a j() {
         return this.a;
      }

      @Override
      public dxz k() {
         return this.e;
      }

      static enum a implements azc {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final axz<dya.m> g = dya.a($$0x -> new dya.l(this, $$0x), dya.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dxz {
      dya.l.a j();

      dxz k();

      @Override
      default axz<? extends dxz> c() {
         return this.j().g;
      }

      @Override
      default dxz a(dxz.f $$0) {
         return $$0.apply(new dya.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dya.n.a e, dxz f, double g, double h, double i) implements dya.p, dya.y {
      @Override
      public dya.y.a j() {
         return this.e == dya.n.a.a ? dya.y.a.b : dya.y.a.a;
      }

      @Override
      public dxz k() {
         return dya.a(this.i);
      }

      @Override
      public dxz l() {
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
      public dxz a(dxz.f $$0) {
         dxz $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dya.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dya.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dya.n.a m() {
         return this.e;
      }

      @Override
      public dxz aC_() {
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

   protected static record o(dxz.c f, @Deprecated double g, double h) implements dxz {
      public static final MapCodec<dya.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxz.c.a.fieldOf("noise").forGetter(dya.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dya.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dya.o::l)
               )
               .apply($$0, dya.o::new)
      );
      public static final axz<dya.o> e = dya.a(a);

      @Override
      public double a(dxz.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dxz.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxz a(dxz.f $$0) {
         return $$0.apply(new dya.o($$0.a(this.f), this.g, this.h));
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
      public axz<? extends dxz> c() {
         return e;
      }

      public dxz.c j() {
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

   interface p extends dxz {
      dxz aC_();

      @Override
      default double a(dxz.b $$0) {
         return this.a(this.aC_().a($$0));
      }

      @Override
      default void a(double[] $$0, dxz.a $$1) {
         this.aC_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dxz f, double g, double h, dxz i, dxz j) implements dxz {
      public static final MapCodec<dya.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxz.d.fieldOf("input").forGetter(dya.q::j),
                  dya.d.fieldOf("min_inclusive").forGetter(dya.q::k),
                  dya.d.fieldOf("max_exclusive").forGetter(dya.q::l),
                  dxz.d.fieldOf("when_in_range").forGetter(dya.q::m),
                  dxz.d.fieldOf("when_out_of_range").forGetter(dya.q::n)
               )
               .apply($$0, dya.q::new)
      );
      public static final axz<dya.q> e = dya.a(a);

      @Override
      public double a(dxz.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dxz.a $$1) {
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
      public dxz a(dxz.f $$0) {
         return $$0.apply(new dya.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public axz<? extends dxz> c() {
         return e;
      }

      public dxz j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dxz m() {
         return this.i;
      }

      public dxz n() {
         return this.j;
      }
   }

   protected static record r(dxz.c a) implements dya.u {
      static final axz<dya.r> e = dya.a(dxz.c.a, dya.r::new, dya.r::j);

      @Override
      public double a(dxz.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dxz a(dxz.f $$0) {
         return $$0.apply(new dya.r($$0.a(this.a)));
      }

      @Override
      public axz<? extends dxz> c() {
         return e;
      }

      @Override
      public dxz.c j() {
         return this.a;
      }
   }

   protected static record s(dxz.c a) implements dya.u {
      static final axz<dya.s> e = dya.a(dxz.c.a, dya.s::new, dya.s::j);

      @Override
      public double a(dxz.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dxz a(dxz.f $$0) {
         return $$0.apply(new dya.s($$0.a(this.a)));
      }

      @Override
      public axz<? extends dxz> c() {
         return e;
      }

      @Override
      public dxz.c j() {
         return this.a;
      }
   }

   protected static record t(dxz.c a) implements dya.u {
      static final axz<dya.t> e = dya.a(dxz.c.a, dya.t::new, dya.t::j);

      @Override
      public double a(dxz.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dxz a(dxz.f $$0) {
         return $$0.apply(new dya.t($$0.a(this.a)));
      }

      @Override
      public axz<? extends dxz> c() {
         return e;
      }

      @Override
      public dxz.c j() {
         return this.a;
      }
   }

   interface u extends dxz {
      dxz.c j();

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
      default void a(double[] $$0, dxz.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dxz e, dxz f, dxz g, double h, double i, dxz.c j) implements dxz {
      private static final MapCodec<dya.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxz.d.fieldOf("shift_x").forGetter(dya.v::j),
                  dxz.d.fieldOf("shift_y").forGetter(dya.v::k),
                  dxz.d.fieldOf("shift_z").forGetter(dya.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dya.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dya.v::n),
                  dxz.c.a.fieldOf("noise").forGetter(dya.v::o)
               )
               .apply($$0, dya.v::new)
      );
      public static final axz<dya.v> a = dya.a(k);

      @Override
      public double a(dxz.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dxz.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxz a(dxz.f $$0) {
         return $$0.apply(new dya.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public axz<? extends dxz> c() {
         return a;
      }

      public dxz j() {
         return this.e;
      }

      public dxz k() {
         return this.f;
      }

      public dxz l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dxz.c o() {
         return this.j;
      }
   }

   public static record w(axh<dya.w.b, dya.w.a> e) implements dxz {
      private static final Codec<axh<dya.w.b, dya.w.a>> f = axh.a(dya.w.a.b);
      private static final MapCodec<dya.w> g = f.fieldOf("spline").xmap(dya.w::new, dya.w::j);
      public static final axz<dya.w> a = dya.a(g);

      @Override
      public double a(dxz.b $$0) {
         return (double)this.e.a(new dya.w.b($$0));
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
      public void a(double[] $$0, dxz.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxz a(dxz.f $$0) {
         return $$0.apply(new dya.w(this.e.a((axh.d<dya.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public axz<? extends dxz> c() {
         return a;
      }

      public axh<dya.w.b, dya.w.a> j() {
         return this.e;
      }

      public static record a(jj<dxz> c) implements azi<dya.w.b> {
         public static final Codec<dya.w.a> b = dxz.c.xmap(dya.w.a::new, dya.w.a::a);

         @Override
         public String toString() {
            Optional<akj<dxz>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               akj<dxz> $$1 = $$0.get();
               if ($$1 == dyn.d) {
                  return "continents";
               }

               if ($$1 == dyn.e) {
                  return "erosion";
               }

               if ($$1 == dyn.f) {
                  return "weirdness";
               }

               if ($$1 == dyn.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dya.w.b $$0) {
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

         public dya.w.a a(dxz.f $$0) {
            return new dya.w.a(new jj.a<>(this.c.a().a($$0)));
         }

         public jj<dxz> a() {
            return this.c;
         }
      }

      public static record b(dxz.b a) {
      }
   }

   interface x extends dxz {
      dxz j();

      @Override
      default double a(dxz.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dxz.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dxz.b var1, double var2);
   }

   interface y extends dxz {
      Logger a = LogUtils.getLogger();

      static dya.y a(dya.y.a $$0, dxz $$1, dxz $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dya.y.a.c || $$0 == dya.y.a.d) {
            boolean $$7 = $$3 >= $$6;
            boolean $$8 = $$4 >= $$5;
            if ($$7 || $$8) {
               a.warn("Creating a " + $$0 + " function between two non-overlapping inputs: " + $$1 + " and " + $$2);
            }
         }
         double $$9 = switch ($$0) {
            case a -> $$3 + $$4;
            case b -> $$3 > 0.0 && $$4 > 0.0 ? $$3 * $$4 : ($$5 < 0.0 && $$6 < 0.0 ? $$5 * $$6 : Math.min($$3 * $$6, $$5 * $$4));
            case c -> Math.min($$3, $$4);
            case d -> Math.max($$3, $$4);
         };

         double $$10 = switch ($$0) {
            case a -> $$5 + $$6;
            case b -> $$3 > 0.0 && $$4 > 0.0 ? $$5 * $$6 : ($$5 < 0.0 && $$6 < 0.0 ? $$3 * $$4 : Math.max($$3 * $$4, $$5 * $$6));
            case c -> Math.min($$5, $$6);
            case d -> Math.max($$5, $$6);
         };
         if ($$0 == dya.y.a.b || $$0 == dya.y.a.a) {
            if ($$1 instanceof dya.h $$11) {
               return new dya.n($$0 == dya.y.a.a ? dya.n.a.b : dya.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dya.h $$12) {
               return new dya.n($$0 == dya.y.a.a ? dya.n.a.b : dya.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dya.a($$0, $$1, $$2, $$9, $$10);
      }

      dya.y.a j();

      dxz k();

      dxz l();

      @Override
      default axz<? extends dxz> c() {
         return this.j().e;
      }

      public static enum a implements azc {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final axz<dya.y> e = dya.a((BiFunction<dxz, dxz, dya.y>)(($$0x, $$1) -> dya.y.a(this, $$0x, $$1)), dya.y::k, dya.y::l);
         private final String f;

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   protected static record z(dxz e, dxz.c f, dya.z.a g) implements dya.x {
      private static final MapCodec<dya.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxz.d.fieldOf("input").forGetter(dya.z::j),
                  dxz.c.a.fieldOf("noise").forGetter(dya.z::k),
                  dya.z.a.c.fieldOf("rarity_value_mapper").forGetter(dya.z::l)
               )
               .apply($$0, dya.z::new)
      );
      public static final axz<dya.z> a = dya.a(h);

      @Override
      public double a(dxz.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dxz a(dxz.f $$0) {
         return $$0.apply(new dya.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public axz<? extends dxz> c() {
         return a;
      }

      @Override
      public dxz j() {
         return this.e;
      }

      public dxz.c k() {
         return this.f;
      }

      public dya.z.a l() {
         return this.g;
      }

      public static enum a implements azc {
         a("type_1", dyn.a::b, 2.0),
         b("type_2", dyn.a::a, 3.0);

         public static final Codec<dya.z.a> c = azc.a(dya.z.a::values);
         private final String d;
         final Double2DoubleFunction e;
         final double f;

         private a(final String $$0, final Double2DoubleFunction $$1, final double $$2) {
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
