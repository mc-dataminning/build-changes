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

public final class dys {
   private static final Codec<dyr> c = lt.ad.r().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dyr> b = Codec.either(d, c)
      .xmap($$0 -> (dyr)$$0.map(dys::a, Function.identity()), $$0 -> $$0 instanceof dys.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends dyr> a(jz<MapCodec<? extends dyr>> $$0) {
      a($$0, "blend_alpha", dys.d.e);
      a($$0, "blend_offset", dys.f.e);
      a($$0, "beardifier", dys.b.e);
      a($$0, "old_blended_noise", eoc.a);

      for (dys.l.a $$1 : dys.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dys.o.e);
      a($$0, "end_islands", dys.i.a);
      a($$0, "weird_scaled_sampler", dys.z.a);
      a($$0, "shifted_noise", dys.v.a);
      a($$0, "range_choice", dys.q.e);
      a($$0, "shift_a", dys.s.e);
      a($$0, "shift_b", dys.t.e);
      a($$0, "shift", dys.r.e);
      a($$0, "blend_density", dys.e.e);
      a($$0, "clamp", dys.g.a);

      for (dys.k.a $$2 : dys.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dys.y.a $$3 : dys.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dys.w.a);
      a($$0, "constant", dys.h.e);
      return a($$0, "y_clamped_gradient", dys.aa.a);
   }

   private static MapCodec<? extends dyr> a(jz<MapCodec<? extends dyr>> $$0, String $$1, ayh<? extends dyr> $$2) {
      return jz.a($$0, $$1, $$2.a());
   }

   static <A, O> ayh<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return ayh.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> ayh<O> a(Function<dyr, O> $$0, Function<O, dyr> $$1) {
      return a(dyr.d, $$0, $$1);
   }

   static <O> ayh<O> a(BiFunction<dyr, dyr, O> $$0, Function<O, dyr> $$1, Function<O, dyr> $$2) {
      return ayh.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dyr.d.fieldOf("argument1").forGetter($$1), dyr.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> ayh<O> a(MapCodec<O> $$0) {
      return ayh.a($$0);
   }

   private dys() {
   }

   public static dyr a(dyr $$0) {
      return new dys.l(dys.l.a.a, $$0);
   }

   public static dyr b(dyr $$0) {
      return new dys.l(dys.l.a.b, $$0);
   }

   public static dyr c(dyr $$0) {
      return new dys.l(dys.l.a.c, $$0);
   }

   public static dyr d(dyr $$0) {
      return new dys.l(dys.l.a.d, $$0);
   }

   public static dyr e(dyr $$0) {
      return new dys.l(dys.l.a.e, $$0);
   }

   public static dyr a(jm<eof.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dys.o(new dyr.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dyr a(jm<eof.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dyr a(jm<eof.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dyr a(dyr $$0, dyr $$1, double $$2, jm<eof.a> $$3) {
      return new dys.v($$0, a(), $$1, $$2, 0.0, new dyr.c($$3));
   }

   public static dyr a(jm<eof.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dyr b(jm<eof.a> $$0, double $$1, double $$2) {
      return new dys.o(new dyr.c($$0), $$1, $$2);
   }

   public static dyr a(jm<eof.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dyr a(dyr $$0, double $$1, double $$2, dyr $$3, dyr $$4) {
      return new dys.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dyr b(jm<eof.a> $$0) {
      return new dys.s(new dyr.c($$0));
   }

   public static dyr c(jm<eof.a> $$0) {
      return new dys.t(new dyr.c($$0));
   }

   public static dyr d(jm<eof.a> $$0) {
      return new dys.r(new dyr.c($$0));
   }

   public static dyr f(dyr $$0) {
      return new dys.e($$0);
   }

   public static dyr a(long $$0) {
      return new dys.i($$0);
   }

   public static dyr a(dyr $$0, jm<eof.a> $$1, dys.z.a $$2) {
      return new dys.z($$0, new dyr.c($$1), $$2);
   }

   public static dyr a(dyr $$0, dyr $$1) {
      return dys.y.a(dys.y.a.a, $$0, $$1);
   }

   public static dyr b(dyr $$0, dyr $$1) {
      return dys.y.a(dys.y.a.b, $$0, $$1);
   }

   public static dyr c(dyr $$0, dyr $$1) {
      return dys.y.a(dys.y.a.c, $$0, $$1);
   }

   public static dyr d(dyr $$0, dyr $$1) {
      return dys.y.a(dys.y.a.d, $$0, $$1);
   }

   public static dyr a(axp<dys.w.b, dys.w.a> $$0) {
      return new dys.w($$0);
   }

   public static dyr a() {
      return dys.h.f;
   }

   public static dyr a(double $$0) {
      return new dys.h($$0);
   }

   public static dyr a(int $$0, int $$1, double $$2, double $$3) {
      return new dys.aa($$0, $$1, $$2, $$3);
   }

   public static dyr a(dyr $$0, dys.k.a $$1) {
      return dys.k.a($$1, $$0);
   }

   private static dyr a(dyr $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dyr b() {
      return dys.d.a;
   }

   public static dyr c() {
      return dys.f.a;
   }

   public static dyr a(dyr $$0, dyr $$1, dyr $$2) {
      if ($$1 instanceof dys.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dyr $$4 = d($$0);
         dyr $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dyr a(dyr $$0, double $$1, dyr $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dys.y.a e, dyr f, dyr g, double h, double i) implements dys.y {
      @Override
      public double a(dyr.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, dyr.a $$1) {
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
      public dyr a(dyr.f $$0) {
         return $$0.apply(dys.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dys.y.a j() {
         return this.e;
      }

      @Override
      public dyr k() {
         return this.f;
      }

      @Override
      public dyr l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dyr.d {
      private static final MapCodec<dys.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dwy.e * 2, dwy.d * 2).fieldOf("from_y").forGetter(dys.aa::j),
                  Codec.intRange(dwy.e * 2, dwy.d * 2).fieldOf("to_y").forGetter(dys.aa::k),
                  dys.d.fieldOf("from_value").forGetter(dys.aa::l),
                  dys.d.fieldOf("to_value").forGetter(dys.aa::m)
               )
               .apply($$0, dys.aa::new)
      );
      public static final ayh<dys.aa> a = dys.a(i);

      @Override
      public double a(dyr.b $$0) {
         return ayo.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public ayh<? extends dyr> c() {
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

   protected static enum b implements dys.c {
      a;

      @Override
      public double a(dyr.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dyr.a $$1) {
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

   public interface c extends dyr.d {
      ayh<dyr> e = ayh.a(MapCodec.unit(dys.b.a));

      @Override
      default ayh<? extends dyr> c() {
         return e;
      }
   }

   protected static enum d implements dyr.d {
      a;

      public static final ayh<dyr> e = ayh.a(MapCodec.unit(a));

      @Override
      public double a(dyr.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dyr.a $$1) {
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
      public ayh<? extends dyr> c() {
         return e;
      }
   }

   static record e(dyr a) implements dys.x {
      static final ayh<dys.e> e = dys.a(dys.e::new, dys.e::j);

      @Override
      public double a(dyr.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dyr a(dyr.f $$0) {
         return $$0.apply(new dys.e(this.a.a($$0)));
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
      public ayh<? extends dyr> c() {
         return e;
      }

      @Override
      public dyr j() {
         return this.a;
      }
   }

   protected static enum f implements dyr.d {
      a;

      public static final ayh<dyr> e = ayh.a(MapCodec.unit(a));

      @Override
      public double a(dyr.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dyr.a $$1) {
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
      public ayh<? extends dyr> c() {
         return e;
      }
   }

   protected static record g(dyr e, double f, double g) implements dys.p {
      private static final MapCodec<dys.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dyr.b.fieldOf("input").forGetter(dys.g::aG_), dys.d.fieldOf("min").forGetter(dys.g::a), dys.d.fieldOf("max").forGetter(dys.g::b))
               .apply($$0, dys.g::new)
      );
      public static final ayh<dys.g> a = dys.a(h);

      @Override
      public double a(double $$0) {
         return ayo.a($$0, this.f, this.g);
      }

      @Override
      public dyr a(dyr.f $$0) {
         return new dys.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public ayh<? extends dyr> c() {
         return a;
      }

      @Override
      public dyr aG_() {
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

   static record h(double a) implements dyr.d {
      static final ayh<dys.h> e = dys.a(dys.d, dys.h::new, dys.h::j);
      static final dys.h f = new dys.h(0.0);

      @Override
      public void a(double[] $$0, dyr.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public ayh<? extends dyr> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dyr.d {
      public static final ayh<dys.i> a = ayh.a(MapCodec.unit(new dys.i(0L)));
      private static final float e = -0.9F;
      private final eoi f;

      public i(long $$0) {
         ayw $$1 = new dyz($$0);
         $$1.b(17292);
         this.f = new eoi($$1);
      }

      private static float a(eoi $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - ayo.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = ayo.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (ayo.e((float)$$10) * 3439.0F + ayo.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - ayo.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = ayo.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dyr.b $$0) {
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
      public ayh<? extends dyr> c() {
         return a;
      }
   }

   @azt
   public static record j(jm<dyr> a) implements dyr {
      @Override
      public double a(dyr.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dyr.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dyr a(dyr.f $$0) {
         return $$0.apply(new dys.j(new jm.a<>(this.a.a().a($$0))));
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
      public ayh<? extends dyr> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jm<dyr> j() {
         return this.a;
      }
   }

   protected static record k(dys.k.a a, dyr e, double f, double g) implements dys.p {
      public static dys.k a(dys.k.a $$0, dyr $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dys.k.a.a && $$0 != dys.k.a.b ? new dys.k($$0, $$1, $$3, $$4) : new dys.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dys.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = ayo.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dys.k b(dyr.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public ayh<? extends dyr> c() {
         return this.a.h;
      }

      public dys.k.a k() {
         return this.a;
      }

      @Override
      public dyr aG_() {
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

      static enum a implements azk {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final ayh<dys.k> h = dys.a($$0x -> dys.k.a(this, $$0x), dys.k::aG_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dys.l.a a, dyr e) implements dys.m {
      @Override
      public double a(dyr.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dyr.a $$1) {
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
      public dys.l.a j() {
         return this.a;
      }

      @Override
      public dyr k() {
         return this.e;
      }

      static enum a implements azk {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final ayh<dys.m> g = dys.a($$0x -> new dys.l(this, $$0x), dys.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dyr {
      dys.l.a j();

      dyr k();

      @Override
      default ayh<? extends dyr> c() {
         return this.j().g;
      }

      @Override
      default dyr a(dyr.f $$0) {
         return $$0.apply(new dys.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dys.n.a e, dyr f, double g, double h, double i) implements dys.p, dys.y {
      @Override
      public dys.y.a j() {
         return this.e == dys.n.a.a ? dys.y.a.b : dys.y.a.a;
      }

      @Override
      public dyr k() {
         return dys.a(this.i);
      }

      @Override
      public dyr l() {
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
      public dyr a(dyr.f $$0) {
         dyr $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dys.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dys.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dys.n.a m() {
         return this.e;
      }

      @Override
      public dyr aG_() {
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

   protected static record o(dyr.c f, @Deprecated double g, double h) implements dyr {
      public static final MapCodec<dys.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dyr.c.a.fieldOf("noise").forGetter(dys.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dys.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dys.o::l)
               )
               .apply($$0, dys.o::new)
      );
      public static final ayh<dys.o> e = dys.a(a);

      @Override
      public double a(dyr.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dyr.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dyr a(dyr.f $$0) {
         return $$0.apply(new dys.o($$0.a(this.f), this.g, this.h));
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
      public ayh<? extends dyr> c() {
         return e;
      }

      public dyr.c j() {
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

   interface p extends dyr {
      dyr aG_();

      @Override
      default double a(dyr.b $$0) {
         return this.a(this.aG_().a($$0));
      }

      @Override
      default void a(double[] $$0, dyr.a $$1) {
         this.aG_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dyr f, double g, double h, dyr i, dyr j) implements dyr {
      public static final MapCodec<dys.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dyr.d.fieldOf("input").forGetter(dys.q::j),
                  dys.d.fieldOf("min_inclusive").forGetter(dys.q::k),
                  dys.d.fieldOf("max_exclusive").forGetter(dys.q::l),
                  dyr.d.fieldOf("when_in_range").forGetter(dys.q::m),
                  dyr.d.fieldOf("when_out_of_range").forGetter(dys.q::n)
               )
               .apply($$0, dys.q::new)
      );
      public static final ayh<dys.q> e = dys.a(a);

      @Override
      public double a(dyr.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dyr.a $$1) {
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
      public dyr a(dyr.f $$0) {
         return $$0.apply(new dys.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public ayh<? extends dyr> c() {
         return e;
      }

      public dyr j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dyr m() {
         return this.i;
      }

      public dyr n() {
         return this.j;
      }
   }

   protected static record r(dyr.c a) implements dys.u {
      static final ayh<dys.r> e = dys.a(dyr.c.a, dys.r::new, dys.r::j);

      @Override
      public double a(dyr.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dyr a(dyr.f $$0) {
         return $$0.apply(new dys.r($$0.a(this.a)));
      }

      @Override
      public ayh<? extends dyr> c() {
         return e;
      }

      @Override
      public dyr.c j() {
         return this.a;
      }
   }

   protected static record s(dyr.c a) implements dys.u {
      static final ayh<dys.s> e = dys.a(dyr.c.a, dys.s::new, dys.s::j);

      @Override
      public double a(dyr.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dyr a(dyr.f $$0) {
         return $$0.apply(new dys.s($$0.a(this.a)));
      }

      @Override
      public ayh<? extends dyr> c() {
         return e;
      }

      @Override
      public dyr.c j() {
         return this.a;
      }
   }

   protected static record t(dyr.c a) implements dys.u {
      static final ayh<dys.t> e = dys.a(dyr.c.a, dys.t::new, dys.t::j);

      @Override
      public double a(dyr.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dyr a(dyr.f $$0) {
         return $$0.apply(new dys.t($$0.a(this.a)));
      }

      @Override
      public ayh<? extends dyr> c() {
         return e;
      }

      @Override
      public dyr.c j() {
         return this.a;
      }
   }

   interface u extends dyr {
      dyr.c j();

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
      default void a(double[] $$0, dyr.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dyr e, dyr f, dyr g, double h, double i, dyr.c j) implements dyr {
      private static final MapCodec<dys.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dyr.d.fieldOf("shift_x").forGetter(dys.v::j),
                  dyr.d.fieldOf("shift_y").forGetter(dys.v::k),
                  dyr.d.fieldOf("shift_z").forGetter(dys.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dys.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dys.v::n),
                  dyr.c.a.fieldOf("noise").forGetter(dys.v::o)
               )
               .apply($$0, dys.v::new)
      );
      public static final ayh<dys.v> a = dys.a(k);

      @Override
      public double a(dyr.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dyr.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dyr a(dyr.f $$0) {
         return $$0.apply(new dys.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public ayh<? extends dyr> c() {
         return a;
      }

      public dyr j() {
         return this.e;
      }

      public dyr k() {
         return this.f;
      }

      public dyr l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dyr.c o() {
         return this.j;
      }
   }

   public static record w(axp<dys.w.b, dys.w.a> e) implements dyr {
      private static final Codec<axp<dys.w.b, dys.w.a>> f = axp.a(dys.w.a.b);
      private static final MapCodec<dys.w> g = f.fieldOf("spline").xmap(dys.w::new, dys.w::j);
      public static final ayh<dys.w> a = dys.a(g);

      @Override
      public double a(dyr.b $$0) {
         return (double)this.e.a(new dys.w.b($$0));
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
      public void a(double[] $$0, dyr.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dyr a(dyr.f $$0) {
         return $$0.apply(new dys.w(this.e.a((axp.d<dys.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public ayh<? extends dyr> c() {
         return a;
      }

      public axp<dys.w.b, dys.w.a> j() {
         return this.e;
      }

      public static record a(jm<dyr> c) implements azq<dys.w.b> {
         public static final Codec<dys.w.a> b = dyr.c.xmap(dys.w.a::new, dys.w.a::a);

         @Override
         public String toString() {
            Optional<akq<dyr>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               akq<dyr> $$1 = $$0.get();
               if ($$1 == dzf.d) {
                  return "continents";
               }

               if ($$1 == dzf.e) {
                  return "erosion";
               }

               if ($$1 == dzf.f) {
                  return "weirdness";
               }

               if ($$1 == dzf.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dys.w.b $$0) {
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

         public dys.w.a a(dyr.f $$0) {
            return new dys.w.a(new jm.a<>(this.c.a().a($$0)));
         }

         public jm<dyr> a() {
            return this.c;
         }
      }

      public static record b(dyr.b a) {
      }
   }

   interface x extends dyr {
      dyr j();

      @Override
      default double a(dyr.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dyr.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dyr.b var1, double var2);
   }

   interface y extends dyr {
      Logger a = LogUtils.getLogger();

      static dys.y a(dys.y.a $$0, dyr $$1, dyr $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dys.y.a.c || $$0 == dys.y.a.d) {
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
         if ($$0 == dys.y.a.b || $$0 == dys.y.a.a) {
            if ($$1 instanceof dys.h $$11) {
               return new dys.n($$0 == dys.y.a.a ? dys.n.a.b : dys.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dys.h $$12) {
               return new dys.n($$0 == dys.y.a.a ? dys.n.a.b : dys.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dys.a($$0, $$1, $$2, $$9, $$10);
      }

      dys.y.a j();

      dyr k();

      dyr l();

      @Override
      default ayh<? extends dyr> c() {
         return this.j().e;
      }

      public static enum a implements azk {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final ayh<dys.y> e = dys.a((BiFunction<dyr, dyr, dys.y>)(($$0x, $$1) -> dys.y.a(this, $$0x, $$1)), dys.y::k, dys.y::l);
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

   protected static record z(dyr e, dyr.c f, dys.z.a g) implements dys.x {
      private static final MapCodec<dys.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dyr.d.fieldOf("input").forGetter(dys.z::j),
                  dyr.c.a.fieldOf("noise").forGetter(dys.z::k),
                  dys.z.a.c.fieldOf("rarity_value_mapper").forGetter(dys.z::l)
               )
               .apply($$0, dys.z::new)
      );
      public static final ayh<dys.z> a = dys.a(h);

      @Override
      public double a(dyr.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dyr a(dyr.f $$0) {
         return $$0.apply(new dys.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public ayh<? extends dyr> c() {
         return a;
      }

      @Override
      public dyr j() {
         return this.e;
      }

      public dyr.c k() {
         return this.f;
      }

      public dys.z.a l() {
         return this.g;
      }

      public static enum a implements azk {
         a("type_1", dzf.a::b, 2.0),
         b("type_2", dzf.a::a, 3.0);

         public static final Codec<dys.z.a> c = azk.a(dys.z.a::values);
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
