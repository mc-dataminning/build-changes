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

public final class eck {
   private static final Codec<ecj> c = mb.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<ecj> b = Codec.either(d, c)
      .xmap($$0 -> (ecj)$$0.map(eck::a, Function.identity()), $$0 -> $$0 instanceof eck.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends ecj> a(ke<MapCodec<? extends ecj>> $$0) {
      a($$0, "blend_alpha", eck.d.e);
      a($$0, "blend_offset", eck.f.e);
      a($$0, "beardifier", eck.b.e);
      a($$0, "old_blended_noise", erx.a);

      for (eck.l.a $$1 : eck.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", eck.o.e);
      a($$0, "end_islands", eck.i.a);
      a($$0, "weird_scaled_sampler", eck.z.a);
      a($$0, "shifted_noise", eck.v.a);
      a($$0, "range_choice", eck.q.e);
      a($$0, "shift_a", eck.s.e);
      a($$0, "shift_b", eck.t.e);
      a($$0, "shift", eck.r.e);
      a($$0, "blend_density", eck.e.e);
      a($$0, "clamp", eck.g.a);

      for (eck.k.a $$2 : eck.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (eck.y.a $$3 : eck.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", eck.w.a);
      a($$0, "constant", eck.h.e);
      return a($$0, "y_clamped_gradient", eck.aa.a);
   }

   private static MapCodec<? extends ecj> a(ke<MapCodec<? extends ecj>> $$0, String $$1, ayr<? extends ecj> $$2) {
      return ke.a($$0, $$1, $$2.a());
   }

   static <A, O> ayr<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return ayr.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> ayr<O> a(Function<ecj, O> $$0, Function<O, ecj> $$1) {
      return a(ecj.d, $$0, $$1);
   }

   static <O> ayr<O> a(BiFunction<ecj, ecj, O> $$0, Function<O, ecj> $$1, Function<O, ecj> $$2) {
      return ayr.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(ecj.d.fieldOf("argument1").forGetter($$1), ecj.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> ayr<O> a(MapCodec<O> $$0) {
      return ayr.a($$0);
   }

   private eck() {
   }

   public static ecj a(ecj $$0) {
      return new eck.l(eck.l.a.a, $$0);
   }

   public static ecj b(ecj $$0) {
      return new eck.l(eck.l.a.b, $$0);
   }

   public static ecj c(ecj $$0) {
      return new eck.l(eck.l.a.c, $$0);
   }

   public static ecj d(ecj $$0) {
      return new eck.l(eck.l.a.d, $$0);
   }

   public static ecj e(ecj $$0) {
      return new eck.l(eck.l.a.e, $$0);
   }

   public static ecj a(jr<esa.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new eck.o(new ecj.c($$0), $$1, $$2), $$3, $$4);
   }

   public static ecj a(jr<esa.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static ecj a(jr<esa.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static ecj a(ecj $$0, ecj $$1, double $$2, jr<esa.a> $$3) {
      return new eck.v($$0, a(), $$1, $$2, 0.0, new ecj.c($$3));
   }

   public static ecj a(jr<esa.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static ecj b(jr<esa.a> $$0, double $$1, double $$2) {
      return new eck.o(new ecj.c($$0), $$1, $$2);
   }

   public static ecj a(jr<esa.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static ecj a(ecj $$0, double $$1, double $$2, ecj $$3, ecj $$4) {
      return new eck.q($$0, $$1, $$2, $$3, $$4);
   }

   public static ecj b(jr<esa.a> $$0) {
      return new eck.s(new ecj.c($$0));
   }

   public static ecj c(jr<esa.a> $$0) {
      return new eck.t(new ecj.c($$0));
   }

   public static ecj d(jr<esa.a> $$0) {
      return new eck.r(new ecj.c($$0));
   }

   public static ecj f(ecj $$0) {
      return new eck.e($$0);
   }

   public static ecj a(long $$0) {
      return new eck.i($$0);
   }

   public static ecj a(ecj $$0, jr<esa.a> $$1, eck.z.a $$2) {
      return new eck.z($$0, new ecj.c($$1), $$2);
   }

   public static ecj a(ecj $$0, ecj $$1) {
      return eck.y.a(eck.y.a.a, $$0, $$1);
   }

   public static ecj b(ecj $$0, ecj $$1) {
      return eck.y.a(eck.y.a.b, $$0, $$1);
   }

   public static ecj c(ecj $$0, ecj $$1) {
      return eck.y.a(eck.y.a.c, $$0, $$1);
   }

   public static ecj d(ecj $$0, ecj $$1) {
      return eck.y.a(eck.y.a.d, $$0, $$1);
   }

   public static ecj a(aya<eck.w.b, eck.w.a> $$0) {
      return new eck.w($$0);
   }

   public static ecj a() {
      return eck.h.f;
   }

   public static ecj a(double $$0) {
      return new eck.h($$0);
   }

   public static ecj a(int $$0, int $$1, double $$2, double $$3) {
      return new eck.aa($$0, $$1, $$2, $$3);
   }

   public static ecj a(ecj $$0, eck.k.a $$1) {
      return eck.k.a($$1, $$0);
   }

   private static ecj a(ecj $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static ecj b() {
      return eck.d.a;
   }

   public static ecj c() {
      return eck.f.a;
   }

   public static ecj a(ecj $$0, ecj $$1, ecj $$2) {
      if ($$1 instanceof eck.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         ecj $$4 = d($$0);
         ecj $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static ecj a(ecj $$0, double $$1, ecj $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(eck.y.a e, ecj f, ecj g, double h, double i) implements eck.y {
      @Override
      public double a(ecj.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, ecj.a $$1) {
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
      public ecj a(ecj.f $$0) {
         return $$0.apply(eck.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public eck.y.a j() {
         return this.e;
      }

      @Override
      public ecj k() {
         return this.f;
      }

      @Override
      public ecj l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements ecj.d {
      private static final MapCodec<eck.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(eaq.e * 2, eaq.d * 2).fieldOf("from_y").forGetter(eck.aa::j),
                  Codec.intRange(eaq.e * 2, eaq.d * 2).fieldOf("to_y").forGetter(eck.aa::k),
                  eck.d.fieldOf("from_value").forGetter(eck.aa::l),
                  eck.d.fieldOf("to_value").forGetter(eck.aa::m)
               )
               .apply($$0, eck.aa::new)
      );
      public static final ayr<eck.aa> a = eck.a(i);

      @Override
      public double a(ecj.b $$0) {
         return ayy.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public ayr<? extends ecj> c() {
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

   protected static enum b implements eck.c {
      a;

      @Override
      public double a(ecj.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, ecj.a $$1) {
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

   public interface c extends ecj.d {
      ayr<ecj> e = ayr.a(MapCodec.unit(eck.b.a));

      @Override
      default ayr<? extends ecj> c() {
         return e;
      }
   }

   protected static enum d implements ecj.d {
      a;

      public static final ayr<ecj> e = ayr.a(MapCodec.unit(a));

      @Override
      public double a(ecj.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, ecj.a $$1) {
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
      public ayr<? extends ecj> c() {
         return e;
      }
   }

   static record e(ecj a) implements eck.x {
      static final ayr<eck.e> e = eck.a(eck.e::new, eck.e::j);

      @Override
      public double a(ecj.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public ecj a(ecj.f $$0) {
         return $$0.apply(new eck.e(this.a.a($$0)));
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
      public ayr<? extends ecj> c() {
         return e;
      }

      @Override
      public ecj j() {
         return this.a;
      }
   }

   protected static enum f implements ecj.d {
      a;

      public static final ayr<ecj> e = ayr.a(MapCodec.unit(a));

      @Override
      public double a(ecj.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, ecj.a $$1) {
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
      public ayr<? extends ecj> c() {
         return e;
      }
   }

   protected static record g(ecj e, double f, double g) implements eck.p {
      private static final MapCodec<eck.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ecj.b.fieldOf("input").forGetter(eck.g::aD_), eck.d.fieldOf("min").forGetter(eck.g::a), eck.d.fieldOf("max").forGetter(eck.g::b))
               .apply($$0, eck.g::new)
      );
      public static final ayr<eck.g> a = eck.a(h);

      @Override
      public double a(double $$0) {
         return ayy.a($$0, this.f, this.g);
      }

      @Override
      public ecj a(ecj.f $$0) {
         return new eck.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public ayr<? extends ecj> c() {
         return a;
      }

      @Override
      public ecj aD_() {
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

   static record h(double a) implements ecj.d {
      static final ayr<eck.h> e = eck.a(eck.d, eck.h::new, eck.h::j);
      static final eck.h f = new eck.h(0.0);

      @Override
      public void a(double[] $$0, ecj.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public ayr<? extends ecj> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements ecj.d {
      public static final ayr<eck.i> a = ayr.a(MapCodec.unit(new eck.i(0L)));
      private static final float e = -0.9F;
      private final esd f;

      public i(long $$0) {
         azg $$1 = new ecr($$0);
         $$1.b(17292);
         this.f = new esd($$1);
      }

      private static float a(esd $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - ayy.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = ayy.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (ayy.e((float)$$10) * 3439.0F + ayy.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - ayy.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = ayy.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(ecj.b $$0) {
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
      public ayr<? extends ecj> c() {
         return a;
      }
   }

   @baf
   public static record j(jr<ecj> a) implements ecj {
      @Override
      public double a(ecj.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, ecj.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public ecj a(ecj.f $$0) {
         return $$0.apply(new eck.j(new jr.a<>(this.a.a().a($$0))));
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
      public ayr<? extends ecj> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jr<ecj> j() {
         return this.a;
      }
   }

   protected static record k(eck.k.a a, ecj e, double f, double g) implements eck.p {
      public static eck.k a(eck.k.a $$0, ecj $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != eck.k.a.a && $$0 != eck.k.a.b ? new eck.k($$0, $$1, $$3, $$4) : new eck.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(eck.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = ayy.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public eck.k b(ecj.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public ayr<? extends ecj> c() {
         return this.a.h;
      }

      public eck.k.a k() {
         return this.a;
      }

      @Override
      public ecj aD_() {
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

      static enum a implements azu {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final ayr<eck.k> h = eck.a($$0x -> eck.k.a(this, $$0x), eck.k::aD_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(eck.l.a a, ecj e) implements eck.m {
      @Override
      public double a(ecj.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, ecj.a $$1) {
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
      public eck.l.a j() {
         return this.a;
      }

      @Override
      public ecj k() {
         return this.e;
      }

      static enum a implements azu {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final ayr<eck.m> g = eck.a($$0x -> new eck.l(this, $$0x), eck.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends ecj {
      eck.l.a j();

      ecj k();

      @Override
      default ayr<? extends ecj> c() {
         return this.j().g;
      }

      @Override
      default ecj a(ecj.f $$0) {
         return $$0.apply(new eck.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(eck.n.a e, ecj f, double g, double h, double i) implements eck.p, eck.y {
      @Override
      public eck.y.a j() {
         return this.e == eck.n.a.a ? eck.y.a.b : eck.y.a.a;
      }

      @Override
      public ecj k() {
         return eck.a(this.i);
      }

      @Override
      public ecj l() {
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
      public ecj a(ecj.f $$0) {
         ecj $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == eck.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new eck.n(this.e, $$1, $$4, $$5, this.i);
      }

      public eck.n.a m() {
         return this.e;
      }

      @Override
      public ecj aD_() {
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

   protected static record o(ecj.c f, @Deprecated double g, double h) implements ecj {
      public static final MapCodec<eck.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ecj.c.a.fieldOf("noise").forGetter(eck.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(eck.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(eck.o::l)
               )
               .apply($$0, eck.o::new)
      );
      public static final ayr<eck.o> e = eck.a(a);

      @Override
      public double a(ecj.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, ecj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ecj a(ecj.f $$0) {
         return $$0.apply(new eck.o($$0.a(this.f), this.g, this.h));
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
      public ayr<? extends ecj> c() {
         return e;
      }

      public ecj.c j() {
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

   interface p extends ecj {
      ecj aD_();

      @Override
      default double a(ecj.b $$0) {
         return this.a(this.aD_().a($$0));
      }

      @Override
      default void a(double[] $$0, ecj.a $$1) {
         this.aD_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(ecj f, double g, double h, ecj i, ecj j) implements ecj {
      public static final MapCodec<eck.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ecj.d.fieldOf("input").forGetter(eck.q::j),
                  eck.d.fieldOf("min_inclusive").forGetter(eck.q::k),
                  eck.d.fieldOf("max_exclusive").forGetter(eck.q::l),
                  ecj.d.fieldOf("when_in_range").forGetter(eck.q::m),
                  ecj.d.fieldOf("when_out_of_range").forGetter(eck.q::n)
               )
               .apply($$0, eck.q::new)
      );
      public static final ayr<eck.q> e = eck.a(a);

      @Override
      public double a(ecj.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, ecj.a $$1) {
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
      public ecj a(ecj.f $$0) {
         return $$0.apply(new eck.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public ayr<? extends ecj> c() {
         return e;
      }

      public ecj j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public ecj m() {
         return this.i;
      }

      public ecj n() {
         return this.j;
      }
   }

   protected static record r(ecj.c a) implements eck.u {
      static final ayr<eck.r> e = eck.a(ecj.c.a, eck.r::new, eck.r::j);

      @Override
      public double a(ecj.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public ecj a(ecj.f $$0) {
         return $$0.apply(new eck.r($$0.a(this.a)));
      }

      @Override
      public ayr<? extends ecj> c() {
         return e;
      }

      @Override
      public ecj.c j() {
         return this.a;
      }
   }

   protected static record s(ecj.c a) implements eck.u {
      static final ayr<eck.s> e = eck.a(ecj.c.a, eck.s::new, eck.s::j);

      @Override
      public double a(ecj.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public ecj a(ecj.f $$0) {
         return $$0.apply(new eck.s($$0.a(this.a)));
      }

      @Override
      public ayr<? extends ecj> c() {
         return e;
      }

      @Override
      public ecj.c j() {
         return this.a;
      }
   }

   protected static record t(ecj.c a) implements eck.u {
      static final ayr<eck.t> e = eck.a(ecj.c.a, eck.t::new, eck.t::j);

      @Override
      public double a(ecj.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public ecj a(ecj.f $$0) {
         return $$0.apply(new eck.t($$0.a(this.a)));
      }

      @Override
      public ayr<? extends ecj> c() {
         return e;
      }

      @Override
      public ecj.c j() {
         return this.a;
      }
   }

   interface u extends ecj {
      ecj.c j();

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
      default void a(double[] $$0, ecj.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(ecj e, ecj f, ecj g, double h, double i, ecj.c j) implements ecj {
      private static final MapCodec<eck.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ecj.d.fieldOf("shift_x").forGetter(eck.v::j),
                  ecj.d.fieldOf("shift_y").forGetter(eck.v::k),
                  ecj.d.fieldOf("shift_z").forGetter(eck.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(eck.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(eck.v::n),
                  ecj.c.a.fieldOf("noise").forGetter(eck.v::o)
               )
               .apply($$0, eck.v::new)
      );
      public static final ayr<eck.v> a = eck.a(k);

      @Override
      public double a(ecj.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, ecj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ecj a(ecj.f $$0) {
         return $$0.apply(new eck.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public ayr<? extends ecj> c() {
         return a;
      }

      public ecj j() {
         return this.e;
      }

      public ecj k() {
         return this.f;
      }

      public ecj l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public ecj.c o() {
         return this.j;
      }
   }

   public static record w(aya<eck.w.b, eck.w.a> e) implements ecj {
      private static final Codec<aya<eck.w.b, eck.w.a>> f = aya.a(eck.w.a.b);
      private static final MapCodec<eck.w> g = f.fieldOf("spline").xmap(eck.w::new, eck.w::j);
      public static final ayr<eck.w> a = eck.a(g);

      @Override
      public double a(ecj.b $$0) {
         return (double)this.e.a(new eck.w.b($$0));
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
      public void a(double[] $$0, ecj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ecj a(ecj.f $$0) {
         return $$0.apply(new eck.w(this.e.a((aya.d<eck.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public ayr<? extends ecj> c() {
         return a;
      }

      public aya<eck.w.b, eck.w.a> j() {
         return this.e;
      }

      public static record a(jr<ecj> c) implements bab<eck.w.b> {
         public static final Codec<eck.w.a> b = ecj.c.xmap(eck.w.a::new, eck.w.a::a);

         @Override
         public String toString() {
            Optional<akt<ecj>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               akt<ecj> $$1 = $$0.get();
               if ($$1 == ecx.d) {
                  return "continents";
               }

               if ($$1 == ecx.e) {
                  return "erosion";
               }

               if ($$1 == ecx.f) {
                  return "weirdness";
               }

               if ($$1 == ecx.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(eck.w.b $$0) {
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

         public eck.w.a a(ecj.f $$0) {
            return new eck.w.a(new jr.a<>(this.c.a().a($$0)));
         }

         public jr<ecj> a() {
            return this.c;
         }
      }

      public static record b(ecj.b a) {
      }
   }

   interface x extends ecj {
      ecj j();

      @Override
      default double a(ecj.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, ecj.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(ecj.b var1, double var2);
   }

   interface y extends ecj {
      Logger a = LogUtils.getLogger();

      static eck.y a(eck.y.a $$0, ecj $$1, ecj $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == eck.y.a.c || $$0 == eck.y.a.d) {
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
         if ($$0 == eck.y.a.b || $$0 == eck.y.a.a) {
            if ($$1 instanceof eck.h $$11) {
               return new eck.n($$0 == eck.y.a.a ? eck.n.a.b : eck.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof eck.h $$12) {
               return new eck.n($$0 == eck.y.a.a ? eck.n.a.b : eck.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new eck.a($$0, $$1, $$2, $$9, $$10);
      }

      eck.y.a j();

      ecj k();

      ecj l();

      @Override
      default ayr<? extends ecj> c() {
         return this.j().e;
      }

      public static enum a implements azu {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final ayr<eck.y> e = eck.a((BiFunction<ecj, ecj, eck.y>)(($$0x, $$1) -> eck.y.a(this, $$0x, $$1)), eck.y::k, eck.y::l);
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

   protected static record z(ecj e, ecj.c f, eck.z.a g) implements eck.x {
      private static final MapCodec<eck.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ecj.d.fieldOf("input").forGetter(eck.z::j),
                  ecj.c.a.fieldOf("noise").forGetter(eck.z::k),
                  eck.z.a.c.fieldOf("rarity_value_mapper").forGetter(eck.z::l)
               )
               .apply($$0, eck.z::new)
      );
      public static final ayr<eck.z> a = eck.a(h);

      @Override
      public double a(ecj.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public ecj a(ecj.f $$0) {
         return $$0.apply(new eck.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public ayr<? extends ecj> c() {
         return a;
      }

      @Override
      public ecj j() {
         return this.e;
      }

      public ecj.c k() {
         return this.f;
      }

      public eck.z.a l() {
         return this.g;
      }

      public static enum a implements azu {
         a("type_1", ecx.a::b, 2.0),
         b("type_2", ecx.a::a, 3.0);

         public static final Codec<eck.z.a> c = azu.a(eck.z.a::values);
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
