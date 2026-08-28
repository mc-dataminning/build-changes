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

public final class ecl {
   private static final Codec<eck> c = mb.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<eck> b = Codec.either(d, c)
      .xmap($$0 -> (eck)$$0.map(ecl::a, Function.identity()), $$0 -> $$0 instanceof ecl.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends eck> a(ke<MapCodec<? extends eck>> $$0) {
      a($$0, "blend_alpha", ecl.d.e);
      a($$0, "blend_offset", ecl.f.e);
      a($$0, "beardifier", ecl.b.e);
      a($$0, "old_blended_noise", ery.a);

      for (ecl.l.a $$1 : ecl.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", ecl.o.e);
      a($$0, "end_islands", ecl.i.a);
      a($$0, "weird_scaled_sampler", ecl.z.a);
      a($$0, "shifted_noise", ecl.v.a);
      a($$0, "range_choice", ecl.q.e);
      a($$0, "shift_a", ecl.s.e);
      a($$0, "shift_b", ecl.t.e);
      a($$0, "shift", ecl.r.e);
      a($$0, "blend_density", ecl.e.e);
      a($$0, "clamp", ecl.g.a);

      for (ecl.k.a $$2 : ecl.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (ecl.y.a $$3 : ecl.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", ecl.w.a);
      a($$0, "constant", ecl.h.e);
      return a($$0, "y_clamped_gradient", ecl.aa.a);
   }

   private static MapCodec<? extends eck> a(ke<MapCodec<? extends eck>> $$0, String $$1, ays<? extends eck> $$2) {
      return ke.a($$0, $$1, $$2.a());
   }

   static <A, O> ays<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return ays.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> ays<O> a(Function<eck, O> $$0, Function<O, eck> $$1) {
      return a(eck.d, $$0, $$1);
   }

   static <O> ays<O> a(BiFunction<eck, eck, O> $$0, Function<O, eck> $$1, Function<O, eck> $$2) {
      return ays.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(eck.d.fieldOf("argument1").forGetter($$1), eck.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> ays<O> a(MapCodec<O> $$0) {
      return ays.a($$0);
   }

   private ecl() {
   }

   public static eck a(eck $$0) {
      return new ecl.l(ecl.l.a.a, $$0);
   }

   public static eck b(eck $$0) {
      return new ecl.l(ecl.l.a.b, $$0);
   }

   public static eck c(eck $$0) {
      return new ecl.l(ecl.l.a.c, $$0);
   }

   public static eck d(eck $$0) {
      return new ecl.l(ecl.l.a.d, $$0);
   }

   public static eck e(eck $$0) {
      return new ecl.l(ecl.l.a.e, $$0);
   }

   public static eck a(jr<esb.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new ecl.o(new eck.c($$0), $$1, $$2), $$3, $$4);
   }

   public static eck a(jr<esb.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static eck a(jr<esb.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static eck a(eck $$0, eck $$1, double $$2, jr<esb.a> $$3) {
      return new ecl.v($$0, a(), $$1, $$2, 0.0, new eck.c($$3));
   }

   public static eck a(jr<esb.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static eck b(jr<esb.a> $$0, double $$1, double $$2) {
      return new ecl.o(new eck.c($$0), $$1, $$2);
   }

   public static eck a(jr<esb.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static eck a(eck $$0, double $$1, double $$2, eck $$3, eck $$4) {
      return new ecl.q($$0, $$1, $$2, $$3, $$4);
   }

   public static eck b(jr<esb.a> $$0) {
      return new ecl.s(new eck.c($$0));
   }

   public static eck c(jr<esb.a> $$0) {
      return new ecl.t(new eck.c($$0));
   }

   public static eck d(jr<esb.a> $$0) {
      return new ecl.r(new eck.c($$0));
   }

   public static eck f(eck $$0) {
      return new ecl.e($$0);
   }

   public static eck a(long $$0) {
      return new ecl.i($$0);
   }

   public static eck a(eck $$0, jr<esb.a> $$1, ecl.z.a $$2) {
      return new ecl.z($$0, new eck.c($$1), $$2);
   }

   public static eck a(eck $$0, eck $$1) {
      return ecl.y.a(ecl.y.a.a, $$0, $$1);
   }

   public static eck b(eck $$0, eck $$1) {
      return ecl.y.a(ecl.y.a.b, $$0, $$1);
   }

   public static eck c(eck $$0, eck $$1) {
      return ecl.y.a(ecl.y.a.c, $$0, $$1);
   }

   public static eck d(eck $$0, eck $$1) {
      return ecl.y.a(ecl.y.a.d, $$0, $$1);
   }

   public static eck a(ayb<ecl.w.b, ecl.w.a> $$0) {
      return new ecl.w($$0);
   }

   public static eck a() {
      return ecl.h.f;
   }

   public static eck a(double $$0) {
      return new ecl.h($$0);
   }

   public static eck a(int $$0, int $$1, double $$2, double $$3) {
      return new ecl.aa($$0, $$1, $$2, $$3);
   }

   public static eck a(eck $$0, ecl.k.a $$1) {
      return ecl.k.a($$1, $$0);
   }

   private static eck a(eck $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static eck b() {
      return ecl.d.a;
   }

   public static eck c() {
      return ecl.f.a;
   }

   public static eck a(eck $$0, eck $$1, eck $$2) {
      if ($$1 instanceof ecl.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         eck $$4 = d($$0);
         eck $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static eck a(eck $$0, double $$1, eck $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(ecl.y.a e, eck f, eck g, double h, double i) implements ecl.y {
      @Override
      public double a(eck.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, eck.a $$1) {
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
      public eck a(eck.f $$0) {
         return $$0.apply(ecl.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public ecl.y.a j() {
         return this.e;
      }

      @Override
      public eck k() {
         return this.f;
      }

      @Override
      public eck l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements eck.d {
      private static final MapCodec<ecl.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(ear.e * 2, ear.d * 2).fieldOf("from_y").forGetter(ecl.aa::j),
                  Codec.intRange(ear.e * 2, ear.d * 2).fieldOf("to_y").forGetter(ecl.aa::k),
                  ecl.d.fieldOf("from_value").forGetter(ecl.aa::l),
                  ecl.d.fieldOf("to_value").forGetter(ecl.aa::m)
               )
               .apply($$0, ecl.aa::new)
      );
      public static final ays<ecl.aa> a = ecl.a(i);

      @Override
      public double a(eck.b $$0) {
         return ayz.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public ays<? extends eck> c() {
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

   protected static enum b implements ecl.c {
      a;

      @Override
      public double a(eck.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, eck.a $$1) {
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

   public interface c extends eck.d {
      ays<eck> e = ays.a(MapCodec.unit(ecl.b.a));

      @Override
      default ays<? extends eck> c() {
         return e;
      }
   }

   protected static enum d implements eck.d {
      a;

      public static final ays<eck> e = ays.a(MapCodec.unit(a));

      @Override
      public double a(eck.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, eck.a $$1) {
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
      public ays<? extends eck> c() {
         return e;
      }
   }

   static record e(eck a) implements ecl.x {
      static final ays<ecl.e> e = ecl.a(ecl.e::new, ecl.e::j);

      @Override
      public double a(eck.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public eck a(eck.f $$0) {
         return $$0.apply(new ecl.e(this.a.a($$0)));
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
      public ays<? extends eck> c() {
         return e;
      }

      @Override
      public eck j() {
         return this.a;
      }
   }

   protected static enum f implements eck.d {
      a;

      public static final ays<eck> e = ays.a(MapCodec.unit(a));

      @Override
      public double a(eck.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, eck.a $$1) {
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
      public ays<? extends eck> c() {
         return e;
      }
   }

   protected static record g(eck e, double f, double g) implements ecl.p {
      private static final MapCodec<ecl.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(eck.b.fieldOf("input").forGetter(ecl.g::aD_), ecl.d.fieldOf("min").forGetter(ecl.g::a), ecl.d.fieldOf("max").forGetter(ecl.g::b))
               .apply($$0, ecl.g::new)
      );
      public static final ays<ecl.g> a = ecl.a(h);

      @Override
      public double a(double $$0) {
         return ayz.a($$0, this.f, this.g);
      }

      @Override
      public eck a(eck.f $$0) {
         return new ecl.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public ays<? extends eck> c() {
         return a;
      }

      @Override
      public eck aD_() {
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

   static record h(double a) implements eck.d {
      static final ays<ecl.h> e = ecl.a(ecl.d, ecl.h::new, ecl.h::j);
      static final ecl.h f = new ecl.h(0.0);

      @Override
      public void a(double[] $$0, eck.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public ays<? extends eck> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements eck.d {
      public static final ays<ecl.i> a = ays.a(MapCodec.unit(new ecl.i(0L)));
      private static final float e = -0.9F;
      private final ese f;

      public i(long $$0) {
         azh $$1 = new ecs($$0);
         $$1.b(17292);
         this.f = new ese($$1);
      }

      private static float a(ese $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - ayz.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = ayz.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (ayz.e((float)$$10) * 3439.0F + ayz.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - ayz.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = ayz.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(eck.b $$0) {
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
      public ays<? extends eck> c() {
         return a;
      }
   }

   @bag
   public static record j(jr<eck> a) implements eck {
      @Override
      public double a(eck.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, eck.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public eck a(eck.f $$0) {
         return $$0.apply(new ecl.j(new jr.a<>(this.a.a().a($$0))));
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
      public ays<? extends eck> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jr<eck> j() {
         return this.a;
      }
   }

   protected static record k(ecl.k.a a, eck e, double f, double g) implements ecl.p {
      public static ecl.k a(ecl.k.a $$0, eck $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != ecl.k.a.a && $$0 != ecl.k.a.b ? new ecl.k($$0, $$1, $$3, $$4) : new ecl.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(ecl.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = ayz.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public ecl.k b(eck.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public ays<? extends eck> c() {
         return this.a.h;
      }

      public ecl.k.a k() {
         return this.a;
      }

      @Override
      public eck aD_() {
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

      static enum a implements azv {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final ays<ecl.k> h = ecl.a($$0x -> ecl.k.a(this, $$0x), ecl.k::aD_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(ecl.l.a a, eck e) implements ecl.m {
      @Override
      public double a(eck.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, eck.a $$1) {
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
      public ecl.l.a j() {
         return this.a;
      }

      @Override
      public eck k() {
         return this.e;
      }

      static enum a implements azv {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final ays<ecl.m> g = ecl.a($$0x -> new ecl.l(this, $$0x), ecl.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends eck {
      ecl.l.a j();

      eck k();

      @Override
      default ays<? extends eck> c() {
         return this.j().g;
      }

      @Override
      default eck a(eck.f $$0) {
         return $$0.apply(new ecl.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(ecl.n.a e, eck f, double g, double h, double i) implements ecl.p, ecl.y {
      @Override
      public ecl.y.a j() {
         return this.e == ecl.n.a.a ? ecl.y.a.b : ecl.y.a.a;
      }

      @Override
      public eck k() {
         return ecl.a(this.i);
      }

      @Override
      public eck l() {
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
      public eck a(eck.f $$0) {
         eck $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == ecl.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new ecl.n(this.e, $$1, $$4, $$5, this.i);
      }

      public ecl.n.a m() {
         return this.e;
      }

      @Override
      public eck aD_() {
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

   protected static record o(eck.c f, @Deprecated double g, double h) implements eck {
      public static final MapCodec<ecl.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eck.c.a.fieldOf("noise").forGetter(ecl.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(ecl.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(ecl.o::l)
               )
               .apply($$0, ecl.o::new)
      );
      public static final ays<ecl.o> e = ecl.a(a);

      @Override
      public double a(eck.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, eck.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eck a(eck.f $$0) {
         return $$0.apply(new ecl.o($$0.a(this.f), this.g, this.h));
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
      public ays<? extends eck> c() {
         return e;
      }

      public eck.c j() {
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

   interface p extends eck {
      eck aD_();

      @Override
      default double a(eck.b $$0) {
         return this.a(this.aD_().a($$0));
      }

      @Override
      default void a(double[] $$0, eck.a $$1) {
         this.aD_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(eck f, double g, double h, eck i, eck j) implements eck {
      public static final MapCodec<ecl.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eck.d.fieldOf("input").forGetter(ecl.q::j),
                  ecl.d.fieldOf("min_inclusive").forGetter(ecl.q::k),
                  ecl.d.fieldOf("max_exclusive").forGetter(ecl.q::l),
                  eck.d.fieldOf("when_in_range").forGetter(ecl.q::m),
                  eck.d.fieldOf("when_out_of_range").forGetter(ecl.q::n)
               )
               .apply($$0, ecl.q::new)
      );
      public static final ays<ecl.q> e = ecl.a(a);

      @Override
      public double a(eck.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, eck.a $$1) {
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
      public eck a(eck.f $$0) {
         return $$0.apply(new ecl.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public ays<? extends eck> c() {
         return e;
      }

      public eck j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public eck m() {
         return this.i;
      }

      public eck n() {
         return this.j;
      }
   }

   protected static record r(eck.c a) implements ecl.u {
      static final ays<ecl.r> e = ecl.a(eck.c.a, ecl.r::new, ecl.r::j);

      @Override
      public double a(eck.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public eck a(eck.f $$0) {
         return $$0.apply(new ecl.r($$0.a(this.a)));
      }

      @Override
      public ays<? extends eck> c() {
         return e;
      }

      @Override
      public eck.c j() {
         return this.a;
      }
   }

   protected static record s(eck.c a) implements ecl.u {
      static final ays<ecl.s> e = ecl.a(eck.c.a, ecl.s::new, ecl.s::j);

      @Override
      public double a(eck.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public eck a(eck.f $$0) {
         return $$0.apply(new ecl.s($$0.a(this.a)));
      }

      @Override
      public ays<? extends eck> c() {
         return e;
      }

      @Override
      public eck.c j() {
         return this.a;
      }
   }

   protected static record t(eck.c a) implements ecl.u {
      static final ays<ecl.t> e = ecl.a(eck.c.a, ecl.t::new, ecl.t::j);

      @Override
      public double a(eck.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public eck a(eck.f $$0) {
         return $$0.apply(new ecl.t($$0.a(this.a)));
      }

      @Override
      public ays<? extends eck> c() {
         return e;
      }

      @Override
      public eck.c j() {
         return this.a;
      }
   }

   interface u extends eck {
      eck.c j();

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
      default void a(double[] $$0, eck.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(eck e, eck f, eck g, double h, double i, eck.c j) implements eck {
      private static final MapCodec<ecl.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eck.d.fieldOf("shift_x").forGetter(ecl.v::j),
                  eck.d.fieldOf("shift_y").forGetter(ecl.v::k),
                  eck.d.fieldOf("shift_z").forGetter(ecl.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(ecl.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(ecl.v::n),
                  eck.c.a.fieldOf("noise").forGetter(ecl.v::o)
               )
               .apply($$0, ecl.v::new)
      );
      public static final ays<ecl.v> a = ecl.a(k);

      @Override
      public double a(eck.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, eck.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eck a(eck.f $$0) {
         return $$0.apply(new ecl.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public ays<? extends eck> c() {
         return a;
      }

      public eck j() {
         return this.e;
      }

      public eck k() {
         return this.f;
      }

      public eck l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public eck.c o() {
         return this.j;
      }
   }

   public static record w(ayb<ecl.w.b, ecl.w.a> e) implements eck {
      private static final Codec<ayb<ecl.w.b, ecl.w.a>> f = ayb.a(ecl.w.a.b);
      private static final MapCodec<ecl.w> g = f.fieldOf("spline").xmap(ecl.w::new, ecl.w::j);
      public static final ays<ecl.w> a = ecl.a(g);

      @Override
      public double a(eck.b $$0) {
         return (double)this.e.a(new ecl.w.b($$0));
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
      public void a(double[] $$0, eck.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eck a(eck.f $$0) {
         return $$0.apply(new ecl.w(this.e.a((ayb.d<ecl.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public ays<? extends eck> c() {
         return a;
      }

      public ayb<ecl.w.b, ecl.w.a> j() {
         return this.e;
      }

      public static record a(jr<eck> c) implements bac<ecl.w.b> {
         public static final Codec<ecl.w.a> b = eck.c.xmap(ecl.w.a::new, ecl.w.a::a);

         @Override
         public String toString() {
            Optional<aku<eck>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               aku<eck> $$1 = $$0.get();
               if ($$1 == ecy.d) {
                  return "continents";
               }

               if ($$1 == ecy.e) {
                  return "erosion";
               }

               if ($$1 == ecy.f) {
                  return "weirdness";
               }

               if ($$1 == ecy.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(ecl.w.b $$0) {
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

         public ecl.w.a a(eck.f $$0) {
            return new ecl.w.a(new jr.a<>(this.c.a().a($$0)));
         }

         public jr<eck> a() {
            return this.c;
         }
      }

      public static record b(eck.b a) {
      }
   }

   interface x extends eck {
      eck j();

      @Override
      default double a(eck.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, eck.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(eck.b var1, double var2);
   }

   interface y extends eck {
      Logger a = LogUtils.getLogger();

      static ecl.y a(ecl.y.a $$0, eck $$1, eck $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == ecl.y.a.c || $$0 == ecl.y.a.d) {
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
         if ($$0 == ecl.y.a.b || $$0 == ecl.y.a.a) {
            if ($$1 instanceof ecl.h $$11) {
               return new ecl.n($$0 == ecl.y.a.a ? ecl.n.a.b : ecl.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof ecl.h $$12) {
               return new ecl.n($$0 == ecl.y.a.a ? ecl.n.a.b : ecl.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new ecl.a($$0, $$1, $$2, $$9, $$10);
      }

      ecl.y.a j();

      eck k();

      eck l();

      @Override
      default ays<? extends eck> c() {
         return this.j().e;
      }

      public static enum a implements azv {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final ays<ecl.y> e = ecl.a((BiFunction<eck, eck, ecl.y>)(($$0x, $$1) -> ecl.y.a(this, $$0x, $$1)), ecl.y::k, ecl.y::l);
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

   protected static record z(eck e, eck.c f, ecl.z.a g) implements ecl.x {
      private static final MapCodec<ecl.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eck.d.fieldOf("input").forGetter(ecl.z::j),
                  eck.c.a.fieldOf("noise").forGetter(ecl.z::k),
                  ecl.z.a.c.fieldOf("rarity_value_mapper").forGetter(ecl.z::l)
               )
               .apply($$0, ecl.z::new)
      );
      public static final ays<ecl.z> a = ecl.a(h);

      @Override
      public double a(eck.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public eck a(eck.f $$0) {
         return $$0.apply(new ecl.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public ays<? extends eck> c() {
         return a;
      }

      @Override
      public eck j() {
         return this.e;
      }

      public eck.c k() {
         return this.f;
      }

      public ecl.z.a l() {
         return this.g;
      }

      public static enum a implements azv {
         a("type_1", ecy.a::b, 2.0),
         b("type_2", ecy.a::a, 3.0);

         public static final Codec<ecl.z.a> c = azv.a(ecl.z.a::values);
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
