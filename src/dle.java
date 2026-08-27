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

public final class dle {
   private static final Codec<dld> c = jy.ag.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dld> b = Codec.either(d, c)
      .xmap($$0 -> (dld)$$0.map(dle::a, Function.identity()), $$0 -> $$0 instanceof dle.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dld> a(io<Codec<? extends dld>> $$0) {
      a($$0, "blend_alpha", dle.d.e);
      a($$0, "blend_offset", dle.f.e);
      a($$0, "beardifier", dle.b.e);
      a($$0, "old_blended_noise", eae.a);

      for (dle.l.a $$1 : dle.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dle.o.e);
      a($$0, "end_islands", dle.i.a);
      a($$0, "weird_scaled_sampler", dle.z.a);
      a($$0, "shifted_noise", dle.v.a);
      a($$0, "range_choice", dle.q.e);
      a($$0, "shift_a", dle.s.e);
      a($$0, "shift_b", dle.t.e);
      a($$0, "shift", dle.r.e);
      a($$0, "blend_density", dle.e.e);
      a($$0, "clamp", dle.g.a);

      for (dle.k.a $$2 : dle.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dle.y.a $$3 : dle.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dle.w.a);
      a($$0, "constant", dle.h.e);
      return a($$0, "y_clamped_gradient", dle.aa.a);
   }

   private static Codec<? extends dld> a(io<Codec<? extends dld>> $$0, String $$1, ass<? extends dld> $$2) {
      return io.a($$0, $$1, $$2.a());
   }

   static <A, O> ass<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return ass.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> ass<O> a(Function<dld, O> $$0, Function<O, dld> $$1) {
      return a(dld.d, $$0, $$1);
   }

   static <O> ass<O> a(BiFunction<dld, dld, O> $$0, Function<O, dld> $$1, Function<O, dld> $$2) {
      return ass.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dld.d.fieldOf("argument1").forGetter($$1), dld.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> ass<O> a(MapCodec<O> $$0) {
      return ass.a($$0);
   }

   private dle() {
   }

   public static dld a(dld $$0) {
      return new dle.l(dle.l.a.a, $$0);
   }

   public static dld b(dld $$0) {
      return new dle.l(dle.l.a.b, $$0);
   }

   public static dld c(dld $$0) {
      return new dle.l(dle.l.a.c, $$0);
   }

   public static dld d(dld $$0) {
      return new dle.l(dle.l.a.d, $$0);
   }

   public static dld e(dld $$0) {
      return new dle.l(dle.l.a.e, $$0);
   }

   public static dld a(ib<eah.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dle.o(new dld.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dld a(ib<eah.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dld a(ib<eah.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dld a(dld $$0, dld $$1, double $$2, ib<eah.a> $$3) {
      return new dle.v($$0, a(), $$1, $$2, 0.0, new dld.c($$3));
   }

   public static dld a(ib<eah.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dld b(ib<eah.a> $$0, double $$1, double $$2) {
      return new dle.o(new dld.c($$0), $$1, $$2);
   }

   public static dld a(ib<eah.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dld a(dld $$0, double $$1, double $$2, dld $$3, dld $$4) {
      return new dle.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dld b(ib<eah.a> $$0) {
      return new dle.s(new dld.c($$0));
   }

   public static dld c(ib<eah.a> $$0) {
      return new dle.t(new dld.c($$0));
   }

   public static dld d(ib<eah.a> $$0) {
      return new dle.r(new dld.c($$0));
   }

   public static dld f(dld $$0) {
      return new dle.e($$0);
   }

   public static dld a(long $$0) {
      return new dle.i($$0);
   }

   public static dld a(dld $$0, ib<eah.a> $$1, dle.z.a $$2) {
      return new dle.z($$0, new dld.c($$1), $$2);
   }

   public static dld a(dld $$0, dld $$1) {
      return dle.y.a(dle.y.a.a, $$0, $$1);
   }

   public static dld b(dld $$0, dld $$1) {
      return dle.y.a(dle.y.a.b, $$0, $$1);
   }

   public static dld c(dld $$0, dld $$1) {
      return dle.y.a(dle.y.a.c, $$0, $$1);
   }

   public static dld d(dld $$0, dld $$1) {
      return dle.y.a(dle.y.a.d, $$0, $$1);
   }

   public static dld a(asb<dle.w.b, dle.w.a> $$0) {
      return new dle.w($$0);
   }

   public static dld a() {
      return dle.h.f;
   }

   public static dld a(double $$0) {
      return new dle.h($$0);
   }

   public static dld a(int $$0, int $$1, double $$2, double $$3) {
      return new dle.aa($$0, $$1, $$2, $$3);
   }

   public static dld a(dld $$0, dle.k.a $$1) {
      return dle.k.a($$1, $$0);
   }

   private static dld a(dld $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dld b() {
      return dle.d.a;
   }

   public static dld c() {
      return dle.f.a;
   }

   public static dld a(dld $$0, dld $$1, dld $$2) {
      if ($$1 instanceof dle.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dld $$4 = d($$0);
         dld $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dld a(dld $$0, double $$1, dld $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dle.y.a e, dld f, dld g, double h, double i) implements dle.y {
      @Override
      public double a(dld.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dld.a $$1) {
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
      public dld a(dld.f $$0) {
         return $$0.apply(dle.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dle.y.a j() {
         return this.e;
      }

      @Override
      public dld k() {
         return this.f;
      }

      @Override
      public dld l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dld.d {
      private static final MapCodec<dle.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(djk.e * 2, djk.d * 2).fieldOf("from_y").forGetter(dle.aa::j),
                  Codec.intRange(djk.e * 2, djk.d * 2).fieldOf("to_y").forGetter(dle.aa::k),
                  dle.d.fieldOf("from_value").forGetter(dle.aa::l),
                  dle.d.fieldOf("to_value").forGetter(dle.aa::m)
               )
               .apply($$0, dle.aa::new)
      );
      public static final ass<dle.aa> a = dle.a(i);

      @Override
      public double a(dld.b $$0) {
         return asy.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public ass<? extends dld> c() {
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

   protected static enum b implements dle.c {
      a;

      @Override
      public double a(dld.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dld.a $$1) {
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

   public interface c extends dld.d {
      ass<dld> e = ass.a(MapCodec.unit(dle.b.a));

      @Override
      default ass<? extends dld> c() {
         return e;
      }
   }

   protected static enum d implements dld.d {
      a;

      public static final ass<dld> e = ass.a(MapCodec.unit(a));

      @Override
      public double a(dld.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dld.a $$1) {
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
      public ass<? extends dld> c() {
         return e;
      }
   }

   static record e(dld a) implements dle.x {
      static final ass<dle.e> e = dle.a(dle.e::new, dle.e::j);

      @Override
      public double a(dld.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dld a(dld.f $$0) {
         return $$0.apply(new dle.e(this.a.a($$0)));
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
      public ass<? extends dld> c() {
         return e;
      }

      @Override
      public dld j() {
         return this.a;
      }
   }

   protected static enum f implements dld.d {
      a;

      public static final ass<dld> e = ass.a(MapCodec.unit(a));

      @Override
      public double a(dld.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dld.a $$1) {
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
      public ass<? extends dld> c() {
         return e;
      }
   }

   protected static record g(dld e, double f, double g) implements dle.p {
      private static final MapCodec<dle.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dld.b.fieldOf("input").forGetter(dle.g::az_), dle.d.fieldOf("min").forGetter(dle.g::a), dle.d.fieldOf("max").forGetter(dle.g::b))
               .apply($$0, dle.g::new)
      );
      public static final ass<dle.g> a = dle.a(h);

      @Override
      public double a(double $$0) {
         return asy.a($$0, this.f, this.g);
      }

      @Override
      public dld a(dld.f $$0) {
         return new dle.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public ass<? extends dld> c() {
         return a;
      }

      @Override
      public dld az_() {
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

   static record h(double a) implements dld.d {
      static final ass<dle.h> e = dle.a(dle.d, dle.h::new, dle.h::j);
      static final dle.h f = new dle.h(0.0);

      @Override
      public void a(double[] $$0, dld.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public ass<? extends dld> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dld.d {
      public static final ass<dle.i> a = ass.a(MapCodec.unit(new dle.i(0L)));
      private static final float e = -0.9F;
      private final eak f;

      public i(long $$0) {
         ate $$1 = new dll($$0);
         $$1.b(17292);
         this.f = new eak($$1);
      }

      private static float a(eak $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - asy.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = asy.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (asy.e((float)$$10) * 3439.0F + asy.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - asy.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = asy.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dld.b $$0) {
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
      public ass<? extends dld> c() {
         return a;
      }
   }

   @aua
   public static record j(ib<dld> a) implements dld {
      @Override
      public double a(dld.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dld.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dld a(dld.f $$0) {
         return $$0.apply(new dle.j(new ib.a<>(this.a.a().a($$0))));
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
      public ass<? extends dld> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public ib<dld> j() {
         return this.a;
      }
   }

   protected static record k(dle.k.a a, dld e, double f, double g) implements dle.p {
      public static dle.k a(dle.k.a $$0, dld $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dle.k.a.a && $$0 != dle.k.a.b ? new dle.k($$0, $$1, $$3, $$4) : new dle.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dle.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = asy.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dle.k b(dld.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public ass<? extends dld> c() {
         return this.a.h;
      }

      public dle.k.a k() {
         return this.a;
      }

      @Override
      public dld az_() {
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

      static enum a implements atr {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final ass<dle.k> h = dle.a($$0x -> dle.k.a(this, $$0x), dle.k::az_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dle.l.a a, dld e) implements dle.m {
      @Override
      public double a(dld.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dld.a $$1) {
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
      public dle.l.a j() {
         return this.a;
      }

      @Override
      public dld k() {
         return this.e;
      }

      static enum a implements atr {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final ass<dle.m> g = dle.a($$0x -> new dle.l(this, $$0x), dle.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dld {
      dle.l.a j();

      dld k();

      @Override
      default ass<? extends dld> c() {
         return this.j().g;
      }

      @Override
      default dld a(dld.f $$0) {
         return $$0.apply(new dle.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dle.n.a e, dld f, double g, double h, double i) implements dle.p, dle.y {
      @Override
      public dle.y.a j() {
         return this.e == dle.n.a.a ? dle.y.a.b : dle.y.a.a;
      }

      @Override
      public dld k() {
         return dle.a(this.i);
      }

      @Override
      public dld l() {
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
      public dld a(dld.f $$0) {
         dld $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dle.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dle.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dle.n.a m() {
         return this.e;
      }

      @Override
      public dld az_() {
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

   protected static record o(dld.c f, @Deprecated double g, double h) implements dld {
      public static final MapCodec<dle.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dld.c.a.fieldOf("noise").forGetter(dle.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dle.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dle.o::l)
               )
               .apply($$0, dle.o::new)
      );
      public static final ass<dle.o> e = dle.a(a);

      @Override
      public double a(dld.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dld.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dld a(dld.f $$0) {
         return $$0.apply(new dle.o($$0.a(this.f), this.g, this.h));
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
      public ass<? extends dld> c() {
         return e;
      }

      public dld.c j() {
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

   interface p extends dld {
      dld az_();

      @Override
      default double a(dld.b $$0) {
         return this.a(this.az_().a($$0));
      }

      @Override
      default void a(double[] $$0, dld.a $$1) {
         this.az_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dld f, double g, double h, dld i, dld j) implements dld {
      public static final MapCodec<dle.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dld.d.fieldOf("input").forGetter(dle.q::j),
                  dle.d.fieldOf("min_inclusive").forGetter(dle.q::k),
                  dle.d.fieldOf("max_exclusive").forGetter(dle.q::l),
                  dld.d.fieldOf("when_in_range").forGetter(dle.q::m),
                  dld.d.fieldOf("when_out_of_range").forGetter(dle.q::n)
               )
               .apply($$0, dle.q::new)
      );
      public static final ass<dle.q> e = dle.a(a);

      @Override
      public double a(dld.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dld.a $$1) {
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
      public dld a(dld.f $$0) {
         return $$0.apply(new dle.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public ass<? extends dld> c() {
         return e;
      }

      public dld j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dld m() {
         return this.i;
      }

      public dld n() {
         return this.j;
      }
   }

   protected static record r(dld.c a) implements dle.u {
      static final ass<dle.r> e = dle.a(dld.c.a, dle.r::new, dle.r::j);

      @Override
      public double a(dld.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dld a(dld.f $$0) {
         return $$0.apply(new dle.r($$0.a(this.a)));
      }

      @Override
      public ass<? extends dld> c() {
         return e;
      }

      @Override
      public dld.c j() {
         return this.a;
      }
   }

   protected static record s(dld.c a) implements dle.u {
      static final ass<dle.s> e = dle.a(dld.c.a, dle.s::new, dle.s::j);

      @Override
      public double a(dld.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dld a(dld.f $$0) {
         return $$0.apply(new dle.s($$0.a(this.a)));
      }

      @Override
      public ass<? extends dld> c() {
         return e;
      }

      @Override
      public dld.c j() {
         return this.a;
      }
   }

   protected static record t(dld.c a) implements dle.u {
      static final ass<dle.t> e = dle.a(dld.c.a, dle.t::new, dle.t::j);

      @Override
      public double a(dld.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dld a(dld.f $$0) {
         return $$0.apply(new dle.t($$0.a(this.a)));
      }

      @Override
      public ass<? extends dld> c() {
         return e;
      }

      @Override
      public dld.c j() {
         return this.a;
      }
   }

   interface u extends dld {
      dld.c j();

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
      default void a(double[] $$0, dld.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dld e, dld f, dld g, double h, double i, dld.c j) implements dld {
      private static final MapCodec<dle.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dld.d.fieldOf("shift_x").forGetter(dle.v::j),
                  dld.d.fieldOf("shift_y").forGetter(dle.v::k),
                  dld.d.fieldOf("shift_z").forGetter(dle.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dle.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dle.v::n),
                  dld.c.a.fieldOf("noise").forGetter(dle.v::o)
               )
               .apply($$0, dle.v::new)
      );
      public static final ass<dle.v> a = dle.a(k);

      @Override
      public double a(dld.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dld.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dld a(dld.f $$0) {
         return $$0.apply(new dle.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public ass<? extends dld> c() {
         return a;
      }

      public dld j() {
         return this.e;
      }

      public dld k() {
         return this.f;
      }

      public dld l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dld.c o() {
         return this.j;
      }
   }

   public static record w(asb<dle.w.b, dle.w.a> e) implements dld {
      private static final Codec<asb<dle.w.b, dle.w.a>> f = asb.a(dle.w.a.b);
      private static final MapCodec<dle.w> g = f.fieldOf("spline").xmap(dle.w::new, dle.w::j);
      public static final ass<dle.w> a = dle.a(g);

      @Override
      public double a(dld.b $$0) {
         return (double)this.e.a(new dle.w.b($$0));
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
      public void a(double[] $$0, dld.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dld a(dld.f $$0) {
         return $$0.apply(new dle.w(this.e.a((asb.d<dle.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public ass<? extends dld> c() {
         return a;
      }

      public asb<dle.w.b, dle.w.a> j() {
         return this.e;
      }

      public static record a(ib<dld> c) implements atx<dle.w.b> {
         public static final Codec<dle.w.a> b = dld.c.xmap(dle.w.a::new, dle.w.a::a);

         @Override
         public String toString() {
            Optional<afv<dld>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               afv<dld> $$1 = $$0.get();
               if ($$1 == dlr.d) {
                  return "continents";
               }

               if ($$1 == dlr.e) {
                  return "erosion";
               }

               if ($$1 == dlr.f) {
                  return "weirdness";
               }

               if ($$1 == dlr.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dle.w.b $$0) {
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

         public dle.w.a a(dld.f $$0) {
            return new dle.w.a(new ib.a<>(this.c.a().a($$0)));
         }

         public ib<dld> a() {
            return this.c;
         }
      }

      public static record b(dld.b a) {
      }
   }

   interface x extends dld {
      dld j();

      @Override
      default double a(dld.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dld.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dld.b var1, double var2);
   }

   interface y extends dld {
      Logger a = LogUtils.getLogger();

      static dle.y a(dle.y.a $$0, dld $$1, dld $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dle.y.a.c || $$0 == dle.y.a.d) {
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
         if ($$0 == dle.y.a.b || $$0 == dle.y.a.a) {
            if ($$1 instanceof dle.h $$11) {
               return new dle.n($$0 == dle.y.a.a ? dle.n.a.b : dle.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dle.h $$12) {
               return new dle.n($$0 == dle.y.a.a ? dle.n.a.b : dle.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dle.a($$0, $$1, $$2, $$9, $$10);
      }

      dle.y.a j();

      dld k();

      dld l();

      @Override
      default ass<? extends dld> c() {
         return this.j().e;
      }

      public static enum a implements atr {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final ass<dle.y> e = dle.a((BiFunction<dld, dld, dle.y>)(($$0x, $$1) -> dle.y.a(this, $$0x, $$1)), dle.y::k, dle.y::l);
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

   protected static record z(dld e, dld.c f, dle.z.a g) implements dle.x {
      private static final MapCodec<dle.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dld.d.fieldOf("input").forGetter(dle.z::j),
                  dld.c.a.fieldOf("noise").forGetter(dle.z::k),
                  dle.z.a.c.fieldOf("rarity_value_mapper").forGetter(dle.z::l)
               )
               .apply($$0, dle.z::new)
      );
      public static final ass<dle.z> a = dle.a(h);

      @Override
      public double a(dld.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dld a(dld.f $$0) {
         return $$0.apply(new dle.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public ass<? extends dld> c() {
         return a;
      }

      @Override
      public dld j() {
         return this.e;
      }

      public dld.c k() {
         return this.f;
      }

      public dle.z.a l() {
         return this.g;
      }

      public static enum a implements atr {
         a("type_1", dlr.a::b, 2.0),
         b("type_2", dlr.a::a, 3.0);

         public static final Codec<dle.z.a> c = atr.a(dle.z.a::values);
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
