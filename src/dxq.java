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

public final class dxq {
   private static final Codec<dxp> c = lp.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dxp> b = Codec.either(d, c)
      .xmap($$0 -> (dxp)$$0.map(dxq::a, Function.identity()), $$0 -> $$0 instanceof dxq.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends dxp> a(jv<MapCodec<? extends dxp>> $$0) {
      a($$0, "blend_alpha", dxq.d.e);
      a($$0, "blend_offset", dxq.f.e);
      a($$0, "beardifier", dxq.b.e);
      a($$0, "old_blended_noise", emx.a);

      for (dxq.l.a $$1 : dxq.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dxq.o.e);
      a($$0, "end_islands", dxq.i.a);
      a($$0, "weird_scaled_sampler", dxq.z.a);
      a($$0, "shifted_noise", dxq.v.a);
      a($$0, "range_choice", dxq.q.e);
      a($$0, "shift_a", dxq.s.e);
      a($$0, "shift_b", dxq.t.e);
      a($$0, "shift", dxq.r.e);
      a($$0, "blend_density", dxq.e.e);
      a($$0, "clamp", dxq.g.a);

      for (dxq.k.a $$2 : dxq.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dxq.y.a $$3 : dxq.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dxq.w.a);
      a($$0, "constant", dxq.h.e);
      return a($$0, "y_clamped_gradient", dxq.aa.a);
   }

   private static MapCodec<? extends dxp> a(jv<MapCodec<? extends dxp>> $$0, String $$1, ays<? extends dxp> $$2) {
      return jv.a($$0, $$1, $$2.a());
   }

   static <A, O> ays<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return ays.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> ays<O> a(Function<dxp, O> $$0, Function<O, dxp> $$1) {
      return a(dxp.d, $$0, $$1);
   }

   static <O> ays<O> a(BiFunction<dxp, dxp, O> $$0, Function<O, dxp> $$1, Function<O, dxp> $$2) {
      return ays.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dxp.d.fieldOf("argument1").forGetter($$1), dxp.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> ays<O> a(MapCodec<O> $$0) {
      return ays.a($$0);
   }

   private dxq() {
   }

   public static dxp a(dxp $$0) {
      return new dxq.l(dxq.l.a.a, $$0);
   }

   public static dxp b(dxp $$0) {
      return new dxq.l(dxq.l.a.b, $$0);
   }

   public static dxp c(dxp $$0) {
      return new dxq.l(dxq.l.a.c, $$0);
   }

   public static dxp d(dxp $$0) {
      return new dxq.l(dxq.l.a.d, $$0);
   }

   public static dxp e(dxp $$0) {
      return new dxq.l(dxq.l.a.e, $$0);
   }

   public static dxp a(ji<ena.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dxq.o(new dxp.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dxp a(ji<ena.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dxp a(ji<ena.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dxp a(dxp $$0, dxp $$1, double $$2, ji<ena.a> $$3) {
      return new dxq.v($$0, a(), $$1, $$2, 0.0, new dxp.c($$3));
   }

   public static dxp a(ji<ena.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dxp b(ji<ena.a> $$0, double $$1, double $$2) {
      return new dxq.o(new dxp.c($$0), $$1, $$2);
   }

   public static dxp a(ji<ena.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dxp a(dxp $$0, double $$1, double $$2, dxp $$3, dxp $$4) {
      return new dxq.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dxp b(ji<ena.a> $$0) {
      return new dxq.s(new dxp.c($$0));
   }

   public static dxp c(ji<ena.a> $$0) {
      return new dxq.t(new dxp.c($$0));
   }

   public static dxp d(ji<ena.a> $$0) {
      return new dxq.r(new dxp.c($$0));
   }

   public static dxp f(dxp $$0) {
      return new dxq.e($$0);
   }

   public static dxp a(long $$0) {
      return new dxq.i($$0);
   }

   public static dxp a(dxp $$0, ji<ena.a> $$1, dxq.z.a $$2) {
      return new dxq.z($$0, new dxp.c($$1), $$2);
   }

   public static dxp a(dxp $$0, dxp $$1) {
      return dxq.y.a(dxq.y.a.a, $$0, $$1);
   }

   public static dxp b(dxp $$0, dxp $$1) {
      return dxq.y.a(dxq.y.a.b, $$0, $$1);
   }

   public static dxp c(dxp $$0, dxp $$1) {
      return dxq.y.a(dxq.y.a.c, $$0, $$1);
   }

   public static dxp d(dxp $$0, dxp $$1) {
      return dxq.y.a(dxq.y.a.d, $$0, $$1);
   }

   public static dxp a(aya<dxq.w.b, dxq.w.a> $$0) {
      return new dxq.w($$0);
   }

   public static dxp a() {
      return dxq.h.f;
   }

   public static dxp a(double $$0) {
      return new dxq.h($$0);
   }

   public static dxp a(int $$0, int $$1, double $$2, double $$3) {
      return new dxq.aa($$0, $$1, $$2, $$3);
   }

   public static dxp a(dxp $$0, dxq.k.a $$1) {
      return dxq.k.a($$1, $$0);
   }

   private static dxp a(dxp $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dxp b() {
      return dxq.d.a;
   }

   public static dxp c() {
      return dxq.f.a;
   }

   public static dxp a(dxp $$0, dxp $$1, dxp $$2) {
      if ($$1 instanceof dxq.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dxp $$4 = d($$0);
         dxp $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dxp a(dxp $$0, double $$1, dxp $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dxq.y.a e, dxp f, dxp g, double h, double i) implements dxq.y {
      @Override
      public double a(dxp.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, dxp.a $$1) {
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
      public dxp a(dxp.f $$0) {
         return $$0.apply(dxq.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dxq.y.a j() {
         return this.e;
      }

      @Override
      public dxp k() {
         return this.f;
      }

      @Override
      public dxp l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dxp.d {
      private static final MapCodec<dxq.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dvw.e * 2, dvw.d * 2).fieldOf("from_y").forGetter(dxq.aa::j),
                  Codec.intRange(dvw.e * 2, dvw.d * 2).fieldOf("to_y").forGetter(dxq.aa::k),
                  dxq.d.fieldOf("from_value").forGetter(dxq.aa::l),
                  dxq.d.fieldOf("to_value").forGetter(dxq.aa::m)
               )
               .apply($$0, dxq.aa::new)
      );
      public static final ays<dxq.aa> a = dxq.a(i);

      @Override
      public double a(dxp.b $$0) {
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
      public ays<? extends dxp> c() {
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

   protected static enum b implements dxq.c {
      a;

      @Override
      public double a(dxp.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dxp.a $$1) {
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

   public interface c extends dxp.d {
      ays<dxp> e = ays.a(MapCodec.unit(dxq.b.a));

      @Override
      default ays<? extends dxp> c() {
         return e;
      }
   }

   protected static enum d implements dxp.d {
      a;

      public static final ays<dxp> e = ays.a(MapCodec.unit(a));

      @Override
      public double a(dxp.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dxp.a $$1) {
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
      public ays<? extends dxp> c() {
         return e;
      }
   }

   static record e(dxp a) implements dxq.x {
      static final ays<dxq.e> e = dxq.a(dxq.e::new, dxq.e::j);

      @Override
      public double a(dxp.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dxp a(dxp.f $$0) {
         return $$0.apply(new dxq.e(this.a.a($$0)));
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
      public ays<? extends dxp> c() {
         return e;
      }

      @Override
      public dxp j() {
         return this.a;
      }
   }

   protected static enum f implements dxp.d {
      a;

      public static final ays<dxp> e = ays.a(MapCodec.unit(a));

      @Override
      public double a(dxp.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dxp.a $$1) {
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
      public ays<? extends dxp> c() {
         return e;
      }
   }

   protected static record g(dxp e, double f, double g) implements dxq.p {
      private static final MapCodec<dxq.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dxp.b.fieldOf("input").forGetter(dxq.g::az_), dxq.d.fieldOf("min").forGetter(dxq.g::a), dxq.d.fieldOf("max").forGetter(dxq.g::b))
               .apply($$0, dxq.g::new)
      );
      public static final ays<dxq.g> a = dxq.a(h);

      @Override
      public double a(double $$0) {
         return ayz.a($$0, this.f, this.g);
      }

      @Override
      public dxp a(dxp.f $$0) {
         return new dxq.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public ays<? extends dxp> c() {
         return a;
      }

      @Override
      public dxp az_() {
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

   static record h(double a) implements dxp.d {
      static final ays<dxq.h> e = dxq.a(dxq.d, dxq.h::new, dxq.h::j);
      static final dxq.h f = new dxq.h(0.0);

      @Override
      public void a(double[] $$0, dxp.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public ays<? extends dxp> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dxp.d {
      public static final ays<dxq.i> a = ays.a(MapCodec.unit(new dxq.i(0L)));
      private static final float e = -0.9F;
      private final end f;

      public i(long $$0) {
         azh $$1 = new dxx($$0);
         $$1.b(17292);
         this.f = new end($$1);
      }

      private static float a(end $$0, int $$1, int $$2) {
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
      public double a(dxp.b $$0) {
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
      public ays<? extends dxp> c() {
         return a;
      }
   }

   @bad
   public static record j(ji<dxp> a) implements dxp {
      @Override
      public double a(dxp.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dxp.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dxp a(dxp.f $$0) {
         return $$0.apply(new dxq.j(new ji.a<>(this.a.a().a($$0))));
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
      public ays<? extends dxp> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public ji<dxp> j() {
         return this.a;
      }
   }

   protected static record k(dxq.k.a a, dxp e, double f, double g) implements dxq.p {
      public static dxq.k a(dxq.k.a $$0, dxp $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dxq.k.a.a && $$0 != dxq.k.a.b ? new dxq.k($$0, $$1, $$3, $$4) : new dxq.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dxq.k.a $$0, double $$1) {
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

      public dxq.k b(dxp.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public ays<? extends dxp> c() {
         return this.a.h;
      }

      public dxq.k.a k() {
         return this.a;
      }

      @Override
      public dxp az_() {
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
         final ays<dxq.k> h = dxq.a($$0x -> dxq.k.a(this, $$0x), dxq.k::az_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dxq.l.a a, dxp e) implements dxq.m {
      @Override
      public double a(dxp.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dxp.a $$1) {
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
      public dxq.l.a j() {
         return this.a;
      }

      @Override
      public dxp k() {
         return this.e;
      }

      static enum a implements azu {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final ays<dxq.m> g = dxq.a($$0x -> new dxq.l(this, $$0x), dxq.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dxp {
      dxq.l.a j();

      dxp k();

      @Override
      default ays<? extends dxp> c() {
         return this.j().g;
      }

      @Override
      default dxp a(dxp.f $$0) {
         return $$0.apply(new dxq.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dxq.n.a e, dxp f, double g, double h, double i) implements dxq.p, dxq.y {
      @Override
      public dxq.y.a j() {
         return this.e == dxq.n.a.a ? dxq.y.a.b : dxq.y.a.a;
      }

      @Override
      public dxp k() {
         return dxq.a(this.i);
      }

      @Override
      public dxp l() {
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
      public dxp a(dxp.f $$0) {
         dxp $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dxq.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dxq.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dxq.n.a m() {
         return this.e;
      }

      @Override
      public dxp az_() {
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

   protected static record o(dxp.c f, @Deprecated double g, double h) implements dxp {
      public static final MapCodec<dxq.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxp.c.a.fieldOf("noise").forGetter(dxq.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dxq.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dxq.o::l)
               )
               .apply($$0, dxq.o::new)
      );
      public static final ays<dxq.o> e = dxq.a(a);

      @Override
      public double a(dxp.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dxp.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxp a(dxp.f $$0) {
         return $$0.apply(new dxq.o($$0.a(this.f), this.g, this.h));
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
      public ays<? extends dxp> c() {
         return e;
      }

      public dxp.c j() {
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

   interface p extends dxp {
      dxp az_();

      @Override
      default double a(dxp.b $$0) {
         return this.a(this.az_().a($$0));
      }

      @Override
      default void a(double[] $$0, dxp.a $$1) {
         this.az_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dxp f, double g, double h, dxp i, dxp j) implements dxp {
      public static final MapCodec<dxq.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxp.d.fieldOf("input").forGetter(dxq.q::j),
                  dxq.d.fieldOf("min_inclusive").forGetter(dxq.q::k),
                  dxq.d.fieldOf("max_exclusive").forGetter(dxq.q::l),
                  dxp.d.fieldOf("when_in_range").forGetter(dxq.q::m),
                  dxp.d.fieldOf("when_out_of_range").forGetter(dxq.q::n)
               )
               .apply($$0, dxq.q::new)
      );
      public static final ays<dxq.q> e = dxq.a(a);

      @Override
      public double a(dxp.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dxp.a $$1) {
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
      public dxp a(dxp.f $$0) {
         return $$0.apply(new dxq.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public ays<? extends dxp> c() {
         return e;
      }

      public dxp j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dxp m() {
         return this.i;
      }

      public dxp n() {
         return this.j;
      }
   }

   protected static record r(dxp.c a) implements dxq.u {
      static final ays<dxq.r> e = dxq.a(dxp.c.a, dxq.r::new, dxq.r::j);

      @Override
      public double a(dxp.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dxp a(dxp.f $$0) {
         return $$0.apply(new dxq.r($$0.a(this.a)));
      }

      @Override
      public ays<? extends dxp> c() {
         return e;
      }

      @Override
      public dxp.c j() {
         return this.a;
      }
   }

   protected static record s(dxp.c a) implements dxq.u {
      static final ays<dxq.s> e = dxq.a(dxp.c.a, dxq.s::new, dxq.s::j);

      @Override
      public double a(dxp.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dxp a(dxp.f $$0) {
         return $$0.apply(new dxq.s($$0.a(this.a)));
      }

      @Override
      public ays<? extends dxp> c() {
         return e;
      }

      @Override
      public dxp.c j() {
         return this.a;
      }
   }

   protected static record t(dxp.c a) implements dxq.u {
      static final ays<dxq.t> e = dxq.a(dxp.c.a, dxq.t::new, dxq.t::j);

      @Override
      public double a(dxp.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dxp a(dxp.f $$0) {
         return $$0.apply(new dxq.t($$0.a(this.a)));
      }

      @Override
      public ays<? extends dxp> c() {
         return e;
      }

      @Override
      public dxp.c j() {
         return this.a;
      }
   }

   interface u extends dxp {
      dxp.c j();

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
      default void a(double[] $$0, dxp.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dxp e, dxp f, dxp g, double h, double i, dxp.c j) implements dxp {
      private static final MapCodec<dxq.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxp.d.fieldOf("shift_x").forGetter(dxq.v::j),
                  dxp.d.fieldOf("shift_y").forGetter(dxq.v::k),
                  dxp.d.fieldOf("shift_z").forGetter(dxq.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dxq.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dxq.v::n),
                  dxp.c.a.fieldOf("noise").forGetter(dxq.v::o)
               )
               .apply($$0, dxq.v::new)
      );
      public static final ays<dxq.v> a = dxq.a(k);

      @Override
      public double a(dxp.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dxp.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxp a(dxp.f $$0) {
         return $$0.apply(new dxq.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public ays<? extends dxp> c() {
         return a;
      }

      public dxp j() {
         return this.e;
      }

      public dxp k() {
         return this.f;
      }

      public dxp l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dxp.c o() {
         return this.j;
      }
   }

   public static record w(aya<dxq.w.b, dxq.w.a> e) implements dxp {
      private static final Codec<aya<dxq.w.b, dxq.w.a>> f = aya.a(dxq.w.a.b);
      private static final MapCodec<dxq.w> g = f.fieldOf("spline").xmap(dxq.w::new, dxq.w::j);
      public static final ays<dxq.w> a = dxq.a(g);

      @Override
      public double a(dxp.b $$0) {
         return (double)this.e.a(new dxq.w.b($$0));
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
      public void a(double[] $$0, dxp.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxp a(dxp.f $$0) {
         return $$0.apply(new dxq.w(this.e.a((aya.d<dxq.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public ays<? extends dxp> c() {
         return a;
      }

      public aya<dxq.w.b, dxq.w.a> j() {
         return this.e;
      }

      public static record a(ji<dxp> c) implements baa<dxq.w.b> {
         public static final Codec<dxq.w.a> b = dxp.c.xmap(dxq.w.a::new, dxq.w.a::a);

         @Override
         public String toString() {
            Optional<ale<dxp>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               ale<dxp> $$1 = $$0.get();
               if ($$1 == dyd.d) {
                  return "continents";
               }

               if ($$1 == dyd.e) {
                  return "erosion";
               }

               if ($$1 == dyd.f) {
                  return "weirdness";
               }

               if ($$1 == dyd.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dxq.w.b $$0) {
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

         public dxq.w.a a(dxp.f $$0) {
            return new dxq.w.a(new ji.a<>(this.c.a().a($$0)));
         }

         public ji<dxp> a() {
            return this.c;
         }
      }

      public static record b(dxp.b a) {
      }
   }

   interface x extends dxp {
      dxp j();

      @Override
      default double a(dxp.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dxp.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dxp.b var1, double var2);
   }

   interface y extends dxp {
      Logger a = LogUtils.getLogger();

      static dxq.y a(dxq.y.a $$0, dxp $$1, dxp $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dxq.y.a.c || $$0 == dxq.y.a.d) {
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
         if ($$0 == dxq.y.a.b || $$0 == dxq.y.a.a) {
            if ($$1 instanceof dxq.h $$11) {
               return new dxq.n($$0 == dxq.y.a.a ? dxq.n.a.b : dxq.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dxq.h $$12) {
               return new dxq.n($$0 == dxq.y.a.a ? dxq.n.a.b : dxq.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dxq.a($$0, $$1, $$2, $$9, $$10);
      }

      dxq.y.a j();

      dxp k();

      dxp l();

      @Override
      default ays<? extends dxp> c() {
         return this.j().e;
      }

      public static enum a implements azu {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final ays<dxq.y> e = dxq.a((BiFunction<dxp, dxp, dxq.y>)(($$0x, $$1) -> dxq.y.a(this, $$0x, $$1)), dxq.y::k, dxq.y::l);
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

   protected static record z(dxp e, dxp.c f, dxq.z.a g) implements dxq.x {
      private static final MapCodec<dxq.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxp.d.fieldOf("input").forGetter(dxq.z::j),
                  dxp.c.a.fieldOf("noise").forGetter(dxq.z::k),
                  dxq.z.a.c.fieldOf("rarity_value_mapper").forGetter(dxq.z::l)
               )
               .apply($$0, dxq.z::new)
      );
      public static final ays<dxq.z> a = dxq.a(h);

      @Override
      public double a(dxp.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dxp a(dxp.f $$0) {
         return $$0.apply(new dxq.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public ays<? extends dxp> c() {
         return a;
      }

      @Override
      public dxp j() {
         return this.e;
      }

      public dxp.c k() {
         return this.f;
      }

      public dxq.z.a l() {
         return this.g;
      }

      public static enum a implements azu {
         a("type_1", dyd.a::b, 2.0),
         b("type_2", dyd.a::a, 3.0);

         public static final Codec<dxq.z.a> c = azu.a(dxq.z.a::values);
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
