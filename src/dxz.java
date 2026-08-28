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

public final class dxz {
   private static final Codec<dxy> c = lq.ad.r().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dxy> b = Codec.either(d, c)
      .xmap($$0 -> (dxy)$$0.map(dxz::a, Function.identity()), $$0 -> $$0 instanceof dxz.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends dxy> a(jw<MapCodec<? extends dxy>> $$0) {
      a($$0, "blend_alpha", dxz.d.e);
      a($$0, "blend_offset", dxz.f.e);
      a($$0, "beardifier", dxz.b.e);
      a($$0, "old_blended_noise", enh.a);

      for (dxz.l.a $$1 : dxz.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dxz.o.e);
      a($$0, "end_islands", dxz.i.a);
      a($$0, "weird_scaled_sampler", dxz.z.a);
      a($$0, "shifted_noise", dxz.v.a);
      a($$0, "range_choice", dxz.q.e);
      a($$0, "shift_a", dxz.s.e);
      a($$0, "shift_b", dxz.t.e);
      a($$0, "shift", dxz.r.e);
      a($$0, "blend_density", dxz.e.e);
      a($$0, "clamp", dxz.g.a);

      for (dxz.k.a $$2 : dxz.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dxz.y.a $$3 : dxz.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dxz.w.a);
      a($$0, "constant", dxz.h.e);
      return a($$0, "y_clamped_gradient", dxz.aa.a);
   }

   private static MapCodec<? extends dxy> a(jw<MapCodec<? extends dxy>> $$0, String $$1, axz<? extends dxy> $$2) {
      return jw.a($$0, $$1, $$2.a());
   }

   static <A, O> axz<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return axz.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> axz<O> a(Function<dxy, O> $$0, Function<O, dxy> $$1) {
      return a(dxy.d, $$0, $$1);
   }

   static <O> axz<O> a(BiFunction<dxy, dxy, O> $$0, Function<O, dxy> $$1, Function<O, dxy> $$2) {
      return axz.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dxy.d.fieldOf("argument1").forGetter($$1), dxy.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> axz<O> a(MapCodec<O> $$0) {
      return axz.a($$0);
   }

   private dxz() {
   }

   public static dxy a(dxy $$0) {
      return new dxz.l(dxz.l.a.a, $$0);
   }

   public static dxy b(dxy $$0) {
      return new dxz.l(dxz.l.a.b, $$0);
   }

   public static dxy c(dxy $$0) {
      return new dxz.l(dxz.l.a.c, $$0);
   }

   public static dxy d(dxy $$0) {
      return new dxz.l(dxz.l.a.d, $$0);
   }

   public static dxy e(dxy $$0) {
      return new dxz.l(dxz.l.a.e, $$0);
   }

   public static dxy a(jj<enk.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dxz.o(new dxy.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dxy a(jj<enk.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dxy a(jj<enk.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dxy a(dxy $$0, dxy $$1, double $$2, jj<enk.a> $$3) {
      return new dxz.v($$0, a(), $$1, $$2, 0.0, new dxy.c($$3));
   }

   public static dxy a(jj<enk.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dxy b(jj<enk.a> $$0, double $$1, double $$2) {
      return new dxz.o(new dxy.c($$0), $$1, $$2);
   }

   public static dxy a(jj<enk.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dxy a(dxy $$0, double $$1, double $$2, dxy $$3, dxy $$4) {
      return new dxz.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dxy b(jj<enk.a> $$0) {
      return new dxz.s(new dxy.c($$0));
   }

   public static dxy c(jj<enk.a> $$0) {
      return new dxz.t(new dxy.c($$0));
   }

   public static dxy d(jj<enk.a> $$0) {
      return new dxz.r(new dxy.c($$0));
   }

   public static dxy f(dxy $$0) {
      return new dxz.e($$0);
   }

   public static dxy a(long $$0) {
      return new dxz.i($$0);
   }

   public static dxy a(dxy $$0, jj<enk.a> $$1, dxz.z.a $$2) {
      return new dxz.z($$0, new dxy.c($$1), $$2);
   }

   public static dxy a(dxy $$0, dxy $$1) {
      return dxz.y.a(dxz.y.a.a, $$0, $$1);
   }

   public static dxy b(dxy $$0, dxy $$1) {
      return dxz.y.a(dxz.y.a.b, $$0, $$1);
   }

   public static dxy c(dxy $$0, dxy $$1) {
      return dxz.y.a(dxz.y.a.c, $$0, $$1);
   }

   public static dxy d(dxy $$0, dxy $$1) {
      return dxz.y.a(dxz.y.a.d, $$0, $$1);
   }

   public static dxy a(axh<dxz.w.b, dxz.w.a> $$0) {
      return new dxz.w($$0);
   }

   public static dxy a() {
      return dxz.h.f;
   }

   public static dxy a(double $$0) {
      return new dxz.h($$0);
   }

   public static dxy a(int $$0, int $$1, double $$2, double $$3) {
      return new dxz.aa($$0, $$1, $$2, $$3);
   }

   public static dxy a(dxy $$0, dxz.k.a $$1) {
      return dxz.k.a($$1, $$0);
   }

   private static dxy a(dxy $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dxy b() {
      return dxz.d.a;
   }

   public static dxy c() {
      return dxz.f.a;
   }

   public static dxy a(dxy $$0, dxy $$1, dxy $$2) {
      if ($$1 instanceof dxz.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dxy $$4 = d($$0);
         dxy $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dxy a(dxy $$0, double $$1, dxy $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dxz.y.a e, dxy f, dxy g, double h, double i) implements dxz.y {
      @Override
      public double a(dxy.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, dxy.a $$1) {
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
      public dxy a(dxy.f $$0) {
         return $$0.apply(dxz.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dxz.y.a j() {
         return this.e;
      }

      @Override
      public dxy k() {
         return this.f;
      }

      @Override
      public dxy l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dxy.d {
      private static final MapCodec<dxz.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dwf.e * 2, dwf.d * 2).fieldOf("from_y").forGetter(dxz.aa::j),
                  Codec.intRange(dwf.e * 2, dwf.d * 2).fieldOf("to_y").forGetter(dxz.aa::k),
                  dxz.d.fieldOf("from_value").forGetter(dxz.aa::l),
                  dxz.d.fieldOf("to_value").forGetter(dxz.aa::m)
               )
               .apply($$0, dxz.aa::new)
      );
      public static final axz<dxz.aa> a = dxz.a(i);

      @Override
      public double a(dxy.b $$0) {
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
      public axz<? extends dxy> c() {
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

   protected static enum b implements dxz.c {
      a;

      @Override
      public double a(dxy.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dxy.a $$1) {
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

   public interface c extends dxy.d {
      axz<dxy> e = axz.a(MapCodec.unit(dxz.b.a));

      @Override
      default axz<? extends dxy> c() {
         return e;
      }
   }

   protected static enum d implements dxy.d {
      a;

      public static final axz<dxy> e = axz.a(MapCodec.unit(a));

      @Override
      public double a(dxy.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dxy.a $$1) {
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
      public axz<? extends dxy> c() {
         return e;
      }
   }

   static record e(dxy a) implements dxz.x {
      static final axz<dxz.e> e = dxz.a(dxz.e::new, dxz.e::j);

      @Override
      public double a(dxy.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dxy a(dxy.f $$0) {
         return $$0.apply(new dxz.e(this.a.a($$0)));
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
      public axz<? extends dxy> c() {
         return e;
      }

      @Override
      public dxy j() {
         return this.a;
      }
   }

   protected static enum f implements dxy.d {
      a;

      public static final axz<dxy> e = axz.a(MapCodec.unit(a));

      @Override
      public double a(dxy.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dxy.a $$1) {
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
      public axz<? extends dxy> c() {
         return e;
      }
   }

   protected static record g(dxy e, double f, double g) implements dxz.p {
      private static final MapCodec<dxz.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dxy.b.fieldOf("input").forGetter(dxz.g::aC_), dxz.d.fieldOf("min").forGetter(dxz.g::a), dxz.d.fieldOf("max").forGetter(dxz.g::b))
               .apply($$0, dxz.g::new)
      );
      public static final axz<dxz.g> a = dxz.a(h);

      @Override
      public double a(double $$0) {
         return ayg.a($$0, this.f, this.g);
      }

      @Override
      public dxy a(dxy.f $$0) {
         return new dxz.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public axz<? extends dxy> c() {
         return a;
      }

      @Override
      public dxy aC_() {
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

   static record h(double a) implements dxy.d {
      static final axz<dxz.h> e = dxz.a(dxz.d, dxz.h::new, dxz.h::j);
      static final dxz.h f = new dxz.h(0.0);

      @Override
      public void a(double[] $$0, dxy.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public axz<? extends dxy> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dxy.d {
      public static final axz<dxz.i> a = axz.a(MapCodec.unit(new dxz.i(0L)));
      private static final float e = -0.9F;
      private final enn f;

      public i(long $$0) {
         ayo $$1 = new dyg($$0);
         $$1.b(17292);
         this.f = new enn($$1);
      }

      private static float a(enn $$0, int $$1, int $$2) {
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
      public double a(dxy.b $$0) {
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
      public axz<? extends dxy> c() {
         return a;
      }
   }

   @azl
   public static record j(jj<dxy> a) implements dxy {
      @Override
      public double a(dxy.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dxy.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dxy a(dxy.f $$0) {
         return $$0.apply(new dxz.j(new jj.a<>(this.a.a().a($$0))));
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
      public axz<? extends dxy> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jj<dxy> j() {
         return this.a;
      }
   }

   protected static record k(dxz.k.a a, dxy e, double f, double g) implements dxz.p {
      public static dxz.k a(dxz.k.a $$0, dxy $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dxz.k.a.a && $$0 != dxz.k.a.b ? new dxz.k($$0, $$1, $$3, $$4) : new dxz.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dxz.k.a $$0, double $$1) {
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

      public dxz.k b(dxy.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public axz<? extends dxy> c() {
         return this.a.h;
      }

      public dxz.k.a k() {
         return this.a;
      }

      @Override
      public dxy aC_() {
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
         final axz<dxz.k> h = dxz.a($$0x -> dxz.k.a(this, $$0x), dxz.k::aC_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dxz.l.a a, dxy e) implements dxz.m {
      @Override
      public double a(dxy.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dxy.a $$1) {
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
      public dxz.l.a j() {
         return this.a;
      }

      @Override
      public dxy k() {
         return this.e;
      }

      static enum a implements azc {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final axz<dxz.m> g = dxz.a($$0x -> new dxz.l(this, $$0x), dxz.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dxy {
      dxz.l.a j();

      dxy k();

      @Override
      default axz<? extends dxy> c() {
         return this.j().g;
      }

      @Override
      default dxy a(dxy.f $$0) {
         return $$0.apply(new dxz.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dxz.n.a e, dxy f, double g, double h, double i) implements dxz.p, dxz.y {
      @Override
      public dxz.y.a j() {
         return this.e == dxz.n.a.a ? dxz.y.a.b : dxz.y.a.a;
      }

      @Override
      public dxy k() {
         return dxz.a(this.i);
      }

      @Override
      public dxy l() {
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
      public dxy a(dxy.f $$0) {
         dxy $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dxz.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dxz.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dxz.n.a m() {
         return this.e;
      }

      @Override
      public dxy aC_() {
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

   protected static record o(dxy.c f, @Deprecated double g, double h) implements dxy {
      public static final MapCodec<dxz.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxy.c.a.fieldOf("noise").forGetter(dxz.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dxz.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dxz.o::l)
               )
               .apply($$0, dxz.o::new)
      );
      public static final axz<dxz.o> e = dxz.a(a);

      @Override
      public double a(dxy.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dxy.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxy a(dxy.f $$0) {
         return $$0.apply(new dxz.o($$0.a(this.f), this.g, this.h));
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
      public axz<? extends dxy> c() {
         return e;
      }

      public dxy.c j() {
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

   interface p extends dxy {
      dxy aC_();

      @Override
      default double a(dxy.b $$0) {
         return this.a(this.aC_().a($$0));
      }

      @Override
      default void a(double[] $$0, dxy.a $$1) {
         this.aC_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dxy f, double g, double h, dxy i, dxy j) implements dxy {
      public static final MapCodec<dxz.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxy.d.fieldOf("input").forGetter(dxz.q::j),
                  dxz.d.fieldOf("min_inclusive").forGetter(dxz.q::k),
                  dxz.d.fieldOf("max_exclusive").forGetter(dxz.q::l),
                  dxy.d.fieldOf("when_in_range").forGetter(dxz.q::m),
                  dxy.d.fieldOf("when_out_of_range").forGetter(dxz.q::n)
               )
               .apply($$0, dxz.q::new)
      );
      public static final axz<dxz.q> e = dxz.a(a);

      @Override
      public double a(dxy.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dxy.a $$1) {
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
      public dxy a(dxy.f $$0) {
         return $$0.apply(new dxz.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public axz<? extends dxy> c() {
         return e;
      }

      public dxy j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dxy m() {
         return this.i;
      }

      public dxy n() {
         return this.j;
      }
   }

   protected static record r(dxy.c a) implements dxz.u {
      static final axz<dxz.r> e = dxz.a(dxy.c.a, dxz.r::new, dxz.r::j);

      @Override
      public double a(dxy.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dxy a(dxy.f $$0) {
         return $$0.apply(new dxz.r($$0.a(this.a)));
      }

      @Override
      public axz<? extends dxy> c() {
         return e;
      }

      @Override
      public dxy.c j() {
         return this.a;
      }
   }

   protected static record s(dxy.c a) implements dxz.u {
      static final axz<dxz.s> e = dxz.a(dxy.c.a, dxz.s::new, dxz.s::j);

      @Override
      public double a(dxy.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dxy a(dxy.f $$0) {
         return $$0.apply(new dxz.s($$0.a(this.a)));
      }

      @Override
      public axz<? extends dxy> c() {
         return e;
      }

      @Override
      public dxy.c j() {
         return this.a;
      }
   }

   protected static record t(dxy.c a) implements dxz.u {
      static final axz<dxz.t> e = dxz.a(dxy.c.a, dxz.t::new, dxz.t::j);

      @Override
      public double a(dxy.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dxy a(dxy.f $$0) {
         return $$0.apply(new dxz.t($$0.a(this.a)));
      }

      @Override
      public axz<? extends dxy> c() {
         return e;
      }

      @Override
      public dxy.c j() {
         return this.a;
      }
   }

   interface u extends dxy {
      dxy.c j();

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
      default void a(double[] $$0, dxy.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dxy e, dxy f, dxy g, double h, double i, dxy.c j) implements dxy {
      private static final MapCodec<dxz.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxy.d.fieldOf("shift_x").forGetter(dxz.v::j),
                  dxy.d.fieldOf("shift_y").forGetter(dxz.v::k),
                  dxy.d.fieldOf("shift_z").forGetter(dxz.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dxz.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dxz.v::n),
                  dxy.c.a.fieldOf("noise").forGetter(dxz.v::o)
               )
               .apply($$0, dxz.v::new)
      );
      public static final axz<dxz.v> a = dxz.a(k);

      @Override
      public double a(dxy.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dxy.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxy a(dxy.f $$0) {
         return $$0.apply(new dxz.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public axz<? extends dxy> c() {
         return a;
      }

      public dxy j() {
         return this.e;
      }

      public dxy k() {
         return this.f;
      }

      public dxy l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dxy.c o() {
         return this.j;
      }
   }

   public static record w(axh<dxz.w.b, dxz.w.a> e) implements dxy {
      private static final Codec<axh<dxz.w.b, dxz.w.a>> f = axh.a(dxz.w.a.b);
      private static final MapCodec<dxz.w> g = f.fieldOf("spline").xmap(dxz.w::new, dxz.w::j);
      public static final axz<dxz.w> a = dxz.a(g);

      @Override
      public double a(dxy.b $$0) {
         return (double)this.e.a(new dxz.w.b($$0));
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
      public void a(double[] $$0, dxy.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxy a(dxy.f $$0) {
         return $$0.apply(new dxz.w(this.e.a((axh.d<dxz.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public axz<? extends dxy> c() {
         return a;
      }

      public axh<dxz.w.b, dxz.w.a> j() {
         return this.e;
      }

      public static record a(jj<dxy> c) implements azi<dxz.w.b> {
         public static final Codec<dxz.w.a> b = dxy.c.xmap(dxz.w.a::new, dxz.w.a::a);

         @Override
         public String toString() {
            Optional<akj<dxy>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               akj<dxy> $$1 = $$0.get();
               if ($$1 == dym.d) {
                  return "continents";
               }

               if ($$1 == dym.e) {
                  return "erosion";
               }

               if ($$1 == dym.f) {
                  return "weirdness";
               }

               if ($$1 == dym.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dxz.w.b $$0) {
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

         public dxz.w.a a(dxy.f $$0) {
            return new dxz.w.a(new jj.a<>(this.c.a().a($$0)));
         }

         public jj<dxy> a() {
            return this.c;
         }
      }

      public static record b(dxy.b a) {
      }
   }

   interface x extends dxy {
      dxy j();

      @Override
      default double a(dxy.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dxy.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dxy.b var1, double var2);
   }

   interface y extends dxy {
      Logger a = LogUtils.getLogger();

      static dxz.y a(dxz.y.a $$0, dxy $$1, dxy $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dxz.y.a.c || $$0 == dxz.y.a.d) {
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
         if ($$0 == dxz.y.a.b || $$0 == dxz.y.a.a) {
            if ($$1 instanceof dxz.h $$11) {
               return new dxz.n($$0 == dxz.y.a.a ? dxz.n.a.b : dxz.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dxz.h $$12) {
               return new dxz.n($$0 == dxz.y.a.a ? dxz.n.a.b : dxz.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dxz.a($$0, $$1, $$2, $$9, $$10);
      }

      dxz.y.a j();

      dxy k();

      dxy l();

      @Override
      default axz<? extends dxy> c() {
         return this.j().e;
      }

      public static enum a implements azc {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final axz<dxz.y> e = dxz.a((BiFunction<dxy, dxy, dxz.y>)(($$0x, $$1) -> dxz.y.a(this, $$0x, $$1)), dxz.y::k, dxz.y::l);
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

   protected static record z(dxy e, dxy.c f, dxz.z.a g) implements dxz.x {
      private static final MapCodec<dxz.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxy.d.fieldOf("input").forGetter(dxz.z::j),
                  dxy.c.a.fieldOf("noise").forGetter(dxz.z::k),
                  dxz.z.a.c.fieldOf("rarity_value_mapper").forGetter(dxz.z::l)
               )
               .apply($$0, dxz.z::new)
      );
      public static final axz<dxz.z> a = dxz.a(h);

      @Override
      public double a(dxy.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dxy a(dxy.f $$0) {
         return $$0.apply(new dxz.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public axz<? extends dxy> c() {
         return a;
      }

      @Override
      public dxy j() {
         return this.e;
      }

      public dxy.c k() {
         return this.f;
      }

      public dxz.z.a l() {
         return this.g;
      }

      public static enum a implements azc {
         a("type_1", dym.a::b, 2.0),
         b("type_2", dym.a::a, 3.0);

         public static final Codec<dxz.z.a> c = azc.a(dxz.z.a::values);
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
