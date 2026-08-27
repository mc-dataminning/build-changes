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

public final class dlz {
   private static final Codec<dly> c = jy.ag.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dly> b = Codec.either(d, c)
      .xmap($$0 -> (dly)$$0.map(dlz::a, Function.identity()), $$0 -> $$0 instanceof dlz.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dly> a(io<Codec<? extends dly>> $$0) {
      a($$0, "blend_alpha", dlz.d.e);
      a($$0, "blend_offset", dlz.f.e);
      a($$0, "beardifier", dlz.b.e);
      a($$0, "old_blended_noise", ebg.a);

      for (dlz.l.a $$1 : dlz.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dlz.o.e);
      a($$0, "end_islands", dlz.i.a);
      a($$0, "weird_scaled_sampler", dlz.z.a);
      a($$0, "shifted_noise", dlz.v.a);
      a($$0, "range_choice", dlz.q.e);
      a($$0, "shift_a", dlz.s.e);
      a($$0, "shift_b", dlz.t.e);
      a($$0, "shift", dlz.r.e);
      a($$0, "blend_density", dlz.e.e);
      a($$0, "clamp", dlz.g.a);

      for (dlz.k.a $$2 : dlz.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dlz.y.a $$3 : dlz.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dlz.w.a);
      a($$0, "constant", dlz.h.e);
      return a($$0, "y_clamped_gradient", dlz.aa.a);
   }

   private static Codec<? extends dly> a(io<Codec<? extends dly>> $$0, String $$1, atc<? extends dly> $$2) {
      return io.a($$0, $$1, $$2.a());
   }

   static <A, O> atc<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return atc.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> atc<O> a(Function<dly, O> $$0, Function<O, dly> $$1) {
      return a(dly.d, $$0, $$1);
   }

   static <O> atc<O> a(BiFunction<dly, dly, O> $$0, Function<O, dly> $$1, Function<O, dly> $$2) {
      return atc.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dly.d.fieldOf("argument1").forGetter($$1), dly.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> atc<O> a(MapCodec<O> $$0) {
      return atc.a($$0);
   }

   private dlz() {
   }

   public static dly a(dly $$0) {
      return new dlz.l(dlz.l.a.a, $$0);
   }

   public static dly b(dly $$0) {
      return new dlz.l(dlz.l.a.b, $$0);
   }

   public static dly c(dly $$0) {
      return new dlz.l(dlz.l.a.c, $$0);
   }

   public static dly d(dly $$0) {
      return new dlz.l(dlz.l.a.d, $$0);
   }

   public static dly e(dly $$0) {
      return new dlz.l(dlz.l.a.e, $$0);
   }

   public static dly a(ib<ebj.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dlz.o(new dly.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dly a(ib<ebj.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dly a(ib<ebj.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dly a(dly $$0, dly $$1, double $$2, ib<ebj.a> $$3) {
      return new dlz.v($$0, a(), $$1, $$2, 0.0, new dly.c($$3));
   }

   public static dly a(ib<ebj.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dly b(ib<ebj.a> $$0, double $$1, double $$2) {
      return new dlz.o(new dly.c($$0), $$1, $$2);
   }

   public static dly a(ib<ebj.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dly a(dly $$0, double $$1, double $$2, dly $$3, dly $$4) {
      return new dlz.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dly b(ib<ebj.a> $$0) {
      return new dlz.s(new dly.c($$0));
   }

   public static dly c(ib<ebj.a> $$0) {
      return new dlz.t(new dly.c($$0));
   }

   public static dly d(ib<ebj.a> $$0) {
      return new dlz.r(new dly.c($$0));
   }

   public static dly f(dly $$0) {
      return new dlz.e($$0);
   }

   public static dly a(long $$0) {
      return new dlz.i($$0);
   }

   public static dly a(dly $$0, ib<ebj.a> $$1, dlz.z.a $$2) {
      return new dlz.z($$0, new dly.c($$1), $$2);
   }

   public static dly a(dly $$0, dly $$1) {
      return dlz.y.a(dlz.y.a.a, $$0, $$1);
   }

   public static dly b(dly $$0, dly $$1) {
      return dlz.y.a(dlz.y.a.b, $$0, $$1);
   }

   public static dly c(dly $$0, dly $$1) {
      return dlz.y.a(dlz.y.a.c, $$0, $$1);
   }

   public static dly d(dly $$0, dly $$1) {
      return dlz.y.a(dlz.y.a.d, $$0, $$1);
   }

   public static dly a(asl<dlz.w.b, dlz.w.a> $$0) {
      return new dlz.w($$0);
   }

   public static dly a() {
      return dlz.h.f;
   }

   public static dly a(double $$0) {
      return new dlz.h($$0);
   }

   public static dly a(int $$0, int $$1, double $$2, double $$3) {
      return new dlz.aa($$0, $$1, $$2, $$3);
   }

   public static dly a(dly $$0, dlz.k.a $$1) {
      return dlz.k.a($$1, $$0);
   }

   private static dly a(dly $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dly b() {
      return dlz.d.a;
   }

   public static dly c() {
      return dlz.f.a;
   }

   public static dly a(dly $$0, dly $$1, dly $$2) {
      if ($$1 instanceof dlz.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dly $$4 = d($$0);
         dly $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dly a(dly $$0, double $$1, dly $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dlz.y.a e, dly f, dly g, double h, double i) implements dlz.y {
      @Override
      public double a(dly.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dly.a $$1) {
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
      public dly a(dly.f $$0) {
         return $$0.apply(dlz.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dlz.y.a j() {
         return this.e;
      }

      @Override
      public dly k() {
         return this.f;
      }

      @Override
      public dly l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dly.d {
      private static final MapCodec<dlz.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dkf.e * 2, dkf.d * 2).fieldOf("from_y").forGetter(dlz.aa::j),
                  Codec.intRange(dkf.e * 2, dkf.d * 2).fieldOf("to_y").forGetter(dlz.aa::k),
                  dlz.d.fieldOf("from_value").forGetter(dlz.aa::l),
                  dlz.d.fieldOf("to_value").forGetter(dlz.aa::m)
               )
               .apply($$0, dlz.aa::new)
      );
      public static final atc<dlz.aa> a = dlz.a(i);

      @Override
      public double a(dly.b $$0) {
         return ati.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public atc<? extends dly> c() {
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

   protected static enum b implements dlz.c {
      a;

      @Override
      public double a(dly.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dly.a $$1) {
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

   public interface c extends dly.d {
      atc<dly> e = atc.a(MapCodec.unit(dlz.b.a));

      @Override
      default atc<? extends dly> c() {
         return e;
      }
   }

   protected static enum d implements dly.d {
      a;

      public static final atc<dly> e = atc.a(MapCodec.unit(a));

      @Override
      public double a(dly.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dly.a $$1) {
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
      public atc<? extends dly> c() {
         return e;
      }
   }

   static record e(dly a) implements dlz.x {
      static final atc<dlz.e> e = dlz.a(dlz.e::new, dlz.e::j);

      @Override
      public double a(dly.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dly a(dly.f $$0) {
         return $$0.apply(new dlz.e(this.a.a($$0)));
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
      public atc<? extends dly> c() {
         return e;
      }

      @Override
      public dly j() {
         return this.a;
      }
   }

   protected static enum f implements dly.d {
      a;

      public static final atc<dly> e = atc.a(MapCodec.unit(a));

      @Override
      public double a(dly.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dly.a $$1) {
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
      public atc<? extends dly> c() {
         return e;
      }
   }

   protected static record g(dly e, double f, double g) implements dlz.p {
      private static final MapCodec<dlz.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dly.b.fieldOf("input").forGetter(dlz.g::aB_), dlz.d.fieldOf("min").forGetter(dlz.g::a), dlz.d.fieldOf("max").forGetter(dlz.g::b))
               .apply($$0, dlz.g::new)
      );
      public static final atc<dlz.g> a = dlz.a(h);

      @Override
      public double a(double $$0) {
         return ati.a($$0, this.f, this.g);
      }

      @Override
      public dly a(dly.f $$0) {
         return new dlz.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public atc<? extends dly> c() {
         return a;
      }

      @Override
      public dly aB_() {
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

   static record h(double a) implements dly.d {
      static final atc<dlz.h> e = dlz.a(dlz.d, dlz.h::new, dlz.h::j);
      static final dlz.h f = new dlz.h(0.0);

      @Override
      public void a(double[] $$0, dly.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public atc<? extends dly> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dly.d {
      public static final atc<dlz.i> a = atc.a(MapCodec.unit(new dlz.i(0L)));
      private static final float e = -0.9F;
      private final ebm f;

      public i(long $$0) {
         ato $$1 = new dmg($$0);
         $$1.b(17292);
         this.f = new ebm($$1);
      }

      private static float a(ebm $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - ati.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = ati.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (ati.e((float)$$10) * 3439.0F + ati.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - ati.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = ati.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dly.b $$0) {
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
      public atc<? extends dly> c() {
         return a;
      }
   }

   @auk
   public static record j(ib<dly> a) implements dly {
      @Override
      public double a(dly.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dly.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dly a(dly.f $$0) {
         return $$0.apply(new dlz.j(new ib.a<>(this.a.a().a($$0))));
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
      public atc<? extends dly> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public ib<dly> j() {
         return this.a;
      }
   }

   protected static record k(dlz.k.a a, dly e, double f, double g) implements dlz.p {
      public static dlz.k a(dlz.k.a $$0, dly $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dlz.k.a.a && $$0 != dlz.k.a.b ? new dlz.k($$0, $$1, $$3, $$4) : new dlz.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dlz.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = ati.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dlz.k b(dly.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public atc<? extends dly> c() {
         return this.a.h;
      }

      public dlz.k.a k() {
         return this.a;
      }

      @Override
      public dly aB_() {
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

      static enum a implements aub {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final atc<dlz.k> h = dlz.a($$0x -> dlz.k.a(this, $$0x), dlz.k::aB_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dlz.l.a a, dly e) implements dlz.m {
      @Override
      public double a(dly.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dly.a $$1) {
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
      public dlz.l.a j() {
         return this.a;
      }

      @Override
      public dly k() {
         return this.e;
      }

      static enum a implements aub {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final atc<dlz.m> g = dlz.a($$0x -> new dlz.l(this, $$0x), dlz.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dly {
      dlz.l.a j();

      dly k();

      @Override
      default atc<? extends dly> c() {
         return this.j().g;
      }

      @Override
      default dly a(dly.f $$0) {
         return $$0.apply(new dlz.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dlz.n.a e, dly f, double g, double h, double i) implements dlz.p, dlz.y {
      @Override
      public dlz.y.a j() {
         return this.e == dlz.n.a.a ? dlz.y.a.b : dlz.y.a.a;
      }

      @Override
      public dly k() {
         return dlz.a(this.i);
      }

      @Override
      public dly l() {
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
      public dly a(dly.f $$0) {
         dly $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dlz.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dlz.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dlz.n.a m() {
         return this.e;
      }

      @Override
      public dly aB_() {
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

   protected static record o(dly.c f, @Deprecated double g, double h) implements dly {
      public static final MapCodec<dlz.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dly.c.a.fieldOf("noise").forGetter(dlz.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dlz.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dlz.o::l)
               )
               .apply($$0, dlz.o::new)
      );
      public static final atc<dlz.o> e = dlz.a(a);

      @Override
      public double a(dly.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dly.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dly a(dly.f $$0) {
         return $$0.apply(new dlz.o($$0.a(this.f), this.g, this.h));
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
      public atc<? extends dly> c() {
         return e;
      }

      public dly.c j() {
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

   interface p extends dly {
      dly aB_();

      @Override
      default double a(dly.b $$0) {
         return this.a(this.aB_().a($$0));
      }

      @Override
      default void a(double[] $$0, dly.a $$1) {
         this.aB_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dly f, double g, double h, dly i, dly j) implements dly {
      public static final MapCodec<dlz.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dly.d.fieldOf("input").forGetter(dlz.q::j),
                  dlz.d.fieldOf("min_inclusive").forGetter(dlz.q::k),
                  dlz.d.fieldOf("max_exclusive").forGetter(dlz.q::l),
                  dly.d.fieldOf("when_in_range").forGetter(dlz.q::m),
                  dly.d.fieldOf("when_out_of_range").forGetter(dlz.q::n)
               )
               .apply($$0, dlz.q::new)
      );
      public static final atc<dlz.q> e = dlz.a(a);

      @Override
      public double a(dly.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dly.a $$1) {
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
      public dly a(dly.f $$0) {
         return $$0.apply(new dlz.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public atc<? extends dly> c() {
         return e;
      }

      public dly j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dly m() {
         return this.i;
      }

      public dly n() {
         return this.j;
      }
   }

   protected static record r(dly.c a) implements dlz.u {
      static final atc<dlz.r> e = dlz.a(dly.c.a, dlz.r::new, dlz.r::j);

      @Override
      public double a(dly.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dly a(dly.f $$0) {
         return $$0.apply(new dlz.r($$0.a(this.a)));
      }

      @Override
      public atc<? extends dly> c() {
         return e;
      }

      @Override
      public dly.c j() {
         return this.a;
      }
   }

   protected static record s(dly.c a) implements dlz.u {
      static final atc<dlz.s> e = dlz.a(dly.c.a, dlz.s::new, dlz.s::j);

      @Override
      public double a(dly.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dly a(dly.f $$0) {
         return $$0.apply(new dlz.s($$0.a(this.a)));
      }

      @Override
      public atc<? extends dly> c() {
         return e;
      }

      @Override
      public dly.c j() {
         return this.a;
      }
   }

   protected static record t(dly.c a) implements dlz.u {
      static final atc<dlz.t> e = dlz.a(dly.c.a, dlz.t::new, dlz.t::j);

      @Override
      public double a(dly.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dly a(dly.f $$0) {
         return $$0.apply(new dlz.t($$0.a(this.a)));
      }

      @Override
      public atc<? extends dly> c() {
         return e;
      }

      @Override
      public dly.c j() {
         return this.a;
      }
   }

   interface u extends dly {
      dly.c j();

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
      default void a(double[] $$0, dly.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dly e, dly f, dly g, double h, double i, dly.c j) implements dly {
      private static final MapCodec<dlz.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dly.d.fieldOf("shift_x").forGetter(dlz.v::j),
                  dly.d.fieldOf("shift_y").forGetter(dlz.v::k),
                  dly.d.fieldOf("shift_z").forGetter(dlz.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dlz.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dlz.v::n),
                  dly.c.a.fieldOf("noise").forGetter(dlz.v::o)
               )
               .apply($$0, dlz.v::new)
      );
      public static final atc<dlz.v> a = dlz.a(k);

      @Override
      public double a(dly.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dly.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dly a(dly.f $$0) {
         return $$0.apply(new dlz.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public atc<? extends dly> c() {
         return a;
      }

      public dly j() {
         return this.e;
      }

      public dly k() {
         return this.f;
      }

      public dly l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dly.c o() {
         return this.j;
      }
   }

   public static record w(asl<dlz.w.b, dlz.w.a> e) implements dly {
      private static final Codec<asl<dlz.w.b, dlz.w.a>> f = asl.a(dlz.w.a.b);
      private static final MapCodec<dlz.w> g = f.fieldOf("spline").xmap(dlz.w::new, dlz.w::j);
      public static final atc<dlz.w> a = dlz.a(g);

      @Override
      public double a(dly.b $$0) {
         return (double)this.e.a(new dlz.w.b($$0));
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
      public void a(double[] $$0, dly.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dly a(dly.f $$0) {
         return $$0.apply(new dlz.w(this.e.a((asl.d<dlz.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public atc<? extends dly> c() {
         return a;
      }

      public asl<dlz.w.b, dlz.w.a> j() {
         return this.e;
      }

      public static record a(ib<dly> c) implements auh<dlz.w.b> {
         public static final Codec<dlz.w.a> b = dly.c.xmap(dlz.w.a::new, dlz.w.a::a);

         @Override
         public String toString() {
            Optional<agf<dly>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               agf<dly> $$1 = $$0.get();
               if ($$1 == dmm.d) {
                  return "continents";
               }

               if ($$1 == dmm.e) {
                  return "erosion";
               }

               if ($$1 == dmm.f) {
                  return "weirdness";
               }

               if ($$1 == dmm.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dlz.w.b $$0) {
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

         public dlz.w.a a(dly.f $$0) {
            return new dlz.w.a(new ib.a<>(this.c.a().a($$0)));
         }

         public ib<dly> a() {
            return this.c;
         }
      }

      public static record b(dly.b a) {
      }
   }

   interface x extends dly {
      dly j();

      @Override
      default double a(dly.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dly.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dly.b var1, double var2);
   }

   interface y extends dly {
      Logger a = LogUtils.getLogger();

      static dlz.y a(dlz.y.a $$0, dly $$1, dly $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dlz.y.a.c || $$0 == dlz.y.a.d) {
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
         if ($$0 == dlz.y.a.b || $$0 == dlz.y.a.a) {
            if ($$1 instanceof dlz.h $$11) {
               return new dlz.n($$0 == dlz.y.a.a ? dlz.n.a.b : dlz.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dlz.h $$12) {
               return new dlz.n($$0 == dlz.y.a.a ? dlz.n.a.b : dlz.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dlz.a($$0, $$1, $$2, $$9, $$10);
      }

      dlz.y.a j();

      dly k();

      dly l();

      @Override
      default atc<? extends dly> c() {
         return this.j().e;
      }

      public static enum a implements aub {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final atc<dlz.y> e = dlz.a((BiFunction<dly, dly, dlz.y>)(($$0x, $$1) -> dlz.y.a(this, $$0x, $$1)), dlz.y::k, dlz.y::l);
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

   protected static record z(dly e, dly.c f, dlz.z.a g) implements dlz.x {
      private static final MapCodec<dlz.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dly.d.fieldOf("input").forGetter(dlz.z::j),
                  dly.c.a.fieldOf("noise").forGetter(dlz.z::k),
                  dlz.z.a.c.fieldOf("rarity_value_mapper").forGetter(dlz.z::l)
               )
               .apply($$0, dlz.z::new)
      );
      public static final atc<dlz.z> a = dlz.a(h);

      @Override
      public double a(dly.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dly a(dly.f $$0) {
         return $$0.apply(new dlz.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public atc<? extends dly> c() {
         return a;
      }

      @Override
      public dly j() {
         return this.e;
      }

      public dly.c k() {
         return this.f;
      }

      public dlz.z.a l() {
         return this.g;
      }

      public static enum a implements aub {
         a("type_1", dmm.a::b, 2.0),
         b("type_2", dmm.a::a, 3.0);

         public static final Codec<dlz.z.a> c = aub.a(dlz.z.a::values);
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
