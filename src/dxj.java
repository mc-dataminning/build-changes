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

public final class dxj {
   private static final Codec<dxi> c = lp.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dxi> b = Codec.either(d, c)
      .xmap($$0 -> (dxi)$$0.map(dxj::a, Function.identity()), $$0 -> $$0 instanceof dxj.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends dxi> a(jv<MapCodec<? extends dxi>> $$0) {
      a($$0, "blend_alpha", dxj.d.e);
      a($$0, "blend_offset", dxj.f.e);
      a($$0, "beardifier", dxj.b.e);
      a($$0, "old_blended_noise", emq.a);

      for (dxj.l.a $$1 : dxj.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dxj.o.e);
      a($$0, "end_islands", dxj.i.a);
      a($$0, "weird_scaled_sampler", dxj.z.a);
      a($$0, "shifted_noise", dxj.v.a);
      a($$0, "range_choice", dxj.q.e);
      a($$0, "shift_a", dxj.s.e);
      a($$0, "shift_b", dxj.t.e);
      a($$0, "shift", dxj.r.e);
      a($$0, "blend_density", dxj.e.e);
      a($$0, "clamp", dxj.g.a);

      for (dxj.k.a $$2 : dxj.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dxj.y.a $$3 : dxj.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dxj.w.a);
      a($$0, "constant", dxj.h.e);
      return a($$0, "y_clamped_gradient", dxj.aa.a);
   }

   private static MapCodec<? extends dxi> a(jv<MapCodec<? extends dxi>> $$0, String $$1, ayn<? extends dxi> $$2) {
      return jv.a($$0, $$1, $$2.a());
   }

   static <A, O> ayn<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return ayn.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> ayn<O> a(Function<dxi, O> $$0, Function<O, dxi> $$1) {
      return a(dxi.d, $$0, $$1);
   }

   static <O> ayn<O> a(BiFunction<dxi, dxi, O> $$0, Function<O, dxi> $$1, Function<O, dxi> $$2) {
      return ayn.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dxi.d.fieldOf("argument1").forGetter($$1), dxi.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> ayn<O> a(MapCodec<O> $$0) {
      return ayn.a($$0);
   }

   private dxj() {
   }

   public static dxi a(dxi $$0) {
      return new dxj.l(dxj.l.a.a, $$0);
   }

   public static dxi b(dxi $$0) {
      return new dxj.l(dxj.l.a.b, $$0);
   }

   public static dxi c(dxi $$0) {
      return new dxj.l(dxj.l.a.c, $$0);
   }

   public static dxi d(dxi $$0) {
      return new dxj.l(dxj.l.a.d, $$0);
   }

   public static dxi e(dxi $$0) {
      return new dxj.l(dxj.l.a.e, $$0);
   }

   public static dxi a(ji<emt.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dxj.o(new dxi.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dxi a(ji<emt.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dxi a(ji<emt.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dxi a(dxi $$0, dxi $$1, double $$2, ji<emt.a> $$3) {
      return new dxj.v($$0, a(), $$1, $$2, 0.0, new dxi.c($$3));
   }

   public static dxi a(ji<emt.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dxi b(ji<emt.a> $$0, double $$1, double $$2) {
      return new dxj.o(new dxi.c($$0), $$1, $$2);
   }

   public static dxi a(ji<emt.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dxi a(dxi $$0, double $$1, double $$2, dxi $$3, dxi $$4) {
      return new dxj.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dxi b(ji<emt.a> $$0) {
      return new dxj.s(new dxi.c($$0));
   }

   public static dxi c(ji<emt.a> $$0) {
      return new dxj.t(new dxi.c($$0));
   }

   public static dxi d(ji<emt.a> $$0) {
      return new dxj.r(new dxi.c($$0));
   }

   public static dxi f(dxi $$0) {
      return new dxj.e($$0);
   }

   public static dxi a(long $$0) {
      return new dxj.i($$0);
   }

   public static dxi a(dxi $$0, ji<emt.a> $$1, dxj.z.a $$2) {
      return new dxj.z($$0, new dxi.c($$1), $$2);
   }

   public static dxi a(dxi $$0, dxi $$1) {
      return dxj.y.a(dxj.y.a.a, $$0, $$1);
   }

   public static dxi b(dxi $$0, dxi $$1) {
      return dxj.y.a(dxj.y.a.b, $$0, $$1);
   }

   public static dxi c(dxi $$0, dxi $$1) {
      return dxj.y.a(dxj.y.a.c, $$0, $$1);
   }

   public static dxi d(dxi $$0, dxi $$1) {
      return dxj.y.a(dxj.y.a.d, $$0, $$1);
   }

   public static dxi a(axw<dxj.w.b, dxj.w.a> $$0) {
      return new dxj.w($$0);
   }

   public static dxi a() {
      return dxj.h.f;
   }

   public static dxi a(double $$0) {
      return new dxj.h($$0);
   }

   public static dxi a(int $$0, int $$1, double $$2, double $$3) {
      return new dxj.aa($$0, $$1, $$2, $$3);
   }

   public static dxi a(dxi $$0, dxj.k.a $$1) {
      return dxj.k.a($$1, $$0);
   }

   private static dxi a(dxi $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dxi b() {
      return dxj.d.a;
   }

   public static dxi c() {
      return dxj.f.a;
   }

   public static dxi a(dxi $$0, dxi $$1, dxi $$2) {
      if ($$1 instanceof dxj.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dxi $$4 = d($$0);
         dxi $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dxi a(dxi $$0, double $$1, dxi $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dxj.y.a e, dxi f, dxi g, double h, double i) implements dxj.y {
      @Override
      public double a(dxi.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, dxi.a $$1) {
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
      public dxi a(dxi.f $$0) {
         return $$0.apply(dxj.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dxj.y.a j() {
         return this.e;
      }

      @Override
      public dxi k() {
         return this.f;
      }

      @Override
      public dxi l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dxi.d {
      private static final MapCodec<dxj.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dvp.e * 2, dvp.d * 2).fieldOf("from_y").forGetter(dxj.aa::j),
                  Codec.intRange(dvp.e * 2, dvp.d * 2).fieldOf("to_y").forGetter(dxj.aa::k),
                  dxj.d.fieldOf("from_value").forGetter(dxj.aa::l),
                  dxj.d.fieldOf("to_value").forGetter(dxj.aa::m)
               )
               .apply($$0, dxj.aa::new)
      );
      public static final ayn<dxj.aa> a = dxj.a(i);

      @Override
      public double a(dxi.b $$0) {
         return ayu.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public ayn<? extends dxi> c() {
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

   protected static enum b implements dxj.c {
      a;

      @Override
      public double a(dxi.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dxi.a $$1) {
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

   public interface c extends dxi.d {
      ayn<dxi> e = ayn.a(MapCodec.unit(dxj.b.a));

      @Override
      default ayn<? extends dxi> c() {
         return e;
      }
   }

   protected static enum d implements dxi.d {
      a;

      public static final ayn<dxi> e = ayn.a(MapCodec.unit(a));

      @Override
      public double a(dxi.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dxi.a $$1) {
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
      public ayn<? extends dxi> c() {
         return e;
      }
   }

   static record e(dxi a) implements dxj.x {
      static final ayn<dxj.e> e = dxj.a(dxj.e::new, dxj.e::j);

      @Override
      public double a(dxi.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dxi a(dxi.f $$0) {
         return $$0.apply(new dxj.e(this.a.a($$0)));
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
      public ayn<? extends dxi> c() {
         return e;
      }

      @Override
      public dxi j() {
         return this.a;
      }
   }

   protected static enum f implements dxi.d {
      a;

      public static final ayn<dxi> e = ayn.a(MapCodec.unit(a));

      @Override
      public double a(dxi.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dxi.a $$1) {
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
      public ayn<? extends dxi> c() {
         return e;
      }
   }

   protected static record g(dxi e, double f, double g) implements dxj.p {
      private static final MapCodec<dxj.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dxi.b.fieldOf("input").forGetter(dxj.g::aB_), dxj.d.fieldOf("min").forGetter(dxj.g::a), dxj.d.fieldOf("max").forGetter(dxj.g::b))
               .apply($$0, dxj.g::new)
      );
      public static final ayn<dxj.g> a = dxj.a(h);

      @Override
      public double a(double $$0) {
         return ayu.a($$0, this.f, this.g);
      }

      @Override
      public dxi a(dxi.f $$0) {
         return new dxj.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public ayn<? extends dxi> c() {
         return a;
      }

      @Override
      public dxi aB_() {
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

   static record h(double a) implements dxi.d {
      static final ayn<dxj.h> e = dxj.a(dxj.d, dxj.h::new, dxj.h::j);
      static final dxj.h f = new dxj.h(0.0);

      @Override
      public void a(double[] $$0, dxi.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public ayn<? extends dxi> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dxi.d {
      public static final ayn<dxj.i> a = ayn.a(MapCodec.unit(new dxj.i(0L)));
      private static final float e = -0.9F;
      private final emw f;

      public i(long $$0) {
         azc $$1 = new dxq($$0);
         $$1.b(17292);
         this.f = new emw($$1);
      }

      private static float a(emw $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - ayu.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = ayu.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (ayu.e((float)$$10) * 3439.0F + ayu.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - ayu.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = ayu.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dxi.b $$0) {
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
      public ayn<? extends dxi> c() {
         return a;
      }
   }

   @azy
   public static record j(ji<dxi> a) implements dxi {
      @Override
      public double a(dxi.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dxi.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dxi a(dxi.f $$0) {
         return $$0.apply(new dxj.j(new ji.a<>(this.a.a().a($$0))));
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
      public ayn<? extends dxi> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public ji<dxi> j() {
         return this.a;
      }
   }

   protected static record k(dxj.k.a a, dxi e, double f, double g) implements dxj.p {
      public static dxj.k a(dxj.k.a $$0, dxi $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dxj.k.a.a && $$0 != dxj.k.a.b ? new dxj.k($$0, $$1, $$3, $$4) : new dxj.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dxj.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = ayu.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dxj.k b(dxi.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public ayn<? extends dxi> c() {
         return this.a.h;
      }

      public dxj.k.a k() {
         return this.a;
      }

      @Override
      public dxi aB_() {
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

      static enum a implements azp {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final ayn<dxj.k> h = dxj.a($$0x -> dxj.k.a(this, $$0x), dxj.k::aB_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dxj.l.a a, dxi e) implements dxj.m {
      @Override
      public double a(dxi.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dxi.a $$1) {
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
      public dxj.l.a j() {
         return this.a;
      }

      @Override
      public dxi k() {
         return this.e;
      }

      static enum a implements azp {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final ayn<dxj.m> g = dxj.a($$0x -> new dxj.l(this, $$0x), dxj.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dxi {
      dxj.l.a j();

      dxi k();

      @Override
      default ayn<? extends dxi> c() {
         return this.j().g;
      }

      @Override
      default dxi a(dxi.f $$0) {
         return $$0.apply(new dxj.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dxj.n.a e, dxi f, double g, double h, double i) implements dxj.p, dxj.y {
      @Override
      public dxj.y.a j() {
         return this.e == dxj.n.a.a ? dxj.y.a.b : dxj.y.a.a;
      }

      @Override
      public dxi k() {
         return dxj.a(this.i);
      }

      @Override
      public dxi l() {
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
      public dxi a(dxi.f $$0) {
         dxi $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dxj.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dxj.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dxj.n.a m() {
         return this.e;
      }

      @Override
      public dxi aB_() {
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

   protected static record o(dxi.c f, @Deprecated double g, double h) implements dxi {
      public static final MapCodec<dxj.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxi.c.a.fieldOf("noise").forGetter(dxj.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dxj.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dxj.o::l)
               )
               .apply($$0, dxj.o::new)
      );
      public static final ayn<dxj.o> e = dxj.a(a);

      @Override
      public double a(dxi.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dxi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxi a(dxi.f $$0) {
         return $$0.apply(new dxj.o($$0.a(this.f), this.g, this.h));
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
      public ayn<? extends dxi> c() {
         return e;
      }

      public dxi.c j() {
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

   interface p extends dxi {
      dxi aB_();

      @Override
      default double a(dxi.b $$0) {
         return this.a(this.aB_().a($$0));
      }

      @Override
      default void a(double[] $$0, dxi.a $$1) {
         this.aB_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dxi f, double g, double h, dxi i, dxi j) implements dxi {
      public static final MapCodec<dxj.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxi.d.fieldOf("input").forGetter(dxj.q::j),
                  dxj.d.fieldOf("min_inclusive").forGetter(dxj.q::k),
                  dxj.d.fieldOf("max_exclusive").forGetter(dxj.q::l),
                  dxi.d.fieldOf("when_in_range").forGetter(dxj.q::m),
                  dxi.d.fieldOf("when_out_of_range").forGetter(dxj.q::n)
               )
               .apply($$0, dxj.q::new)
      );
      public static final ayn<dxj.q> e = dxj.a(a);

      @Override
      public double a(dxi.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dxi.a $$1) {
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
      public dxi a(dxi.f $$0) {
         return $$0.apply(new dxj.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public ayn<? extends dxi> c() {
         return e;
      }

      public dxi j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dxi m() {
         return this.i;
      }

      public dxi n() {
         return this.j;
      }
   }

   protected static record r(dxi.c a) implements dxj.u {
      static final ayn<dxj.r> e = dxj.a(dxi.c.a, dxj.r::new, dxj.r::j);

      @Override
      public double a(dxi.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dxi a(dxi.f $$0) {
         return $$0.apply(new dxj.r($$0.a(this.a)));
      }

      @Override
      public ayn<? extends dxi> c() {
         return e;
      }

      @Override
      public dxi.c j() {
         return this.a;
      }
   }

   protected static record s(dxi.c a) implements dxj.u {
      static final ayn<dxj.s> e = dxj.a(dxi.c.a, dxj.s::new, dxj.s::j);

      @Override
      public double a(dxi.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dxi a(dxi.f $$0) {
         return $$0.apply(new dxj.s($$0.a(this.a)));
      }

      @Override
      public ayn<? extends dxi> c() {
         return e;
      }

      @Override
      public dxi.c j() {
         return this.a;
      }
   }

   protected static record t(dxi.c a) implements dxj.u {
      static final ayn<dxj.t> e = dxj.a(dxi.c.a, dxj.t::new, dxj.t::j);

      @Override
      public double a(dxi.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dxi a(dxi.f $$0) {
         return $$0.apply(new dxj.t($$0.a(this.a)));
      }

      @Override
      public ayn<? extends dxi> c() {
         return e;
      }

      @Override
      public dxi.c j() {
         return this.a;
      }
   }

   interface u extends dxi {
      dxi.c j();

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
      default void a(double[] $$0, dxi.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dxi e, dxi f, dxi g, double h, double i, dxi.c j) implements dxi {
      private static final MapCodec<dxj.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxi.d.fieldOf("shift_x").forGetter(dxj.v::j),
                  dxi.d.fieldOf("shift_y").forGetter(dxj.v::k),
                  dxi.d.fieldOf("shift_z").forGetter(dxj.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dxj.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dxj.v::n),
                  dxi.c.a.fieldOf("noise").forGetter(dxj.v::o)
               )
               .apply($$0, dxj.v::new)
      );
      public static final ayn<dxj.v> a = dxj.a(k);

      @Override
      public double a(dxi.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dxi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxi a(dxi.f $$0) {
         return $$0.apply(new dxj.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public ayn<? extends dxi> c() {
         return a;
      }

      public dxi j() {
         return this.e;
      }

      public dxi k() {
         return this.f;
      }

      public dxi l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dxi.c o() {
         return this.j;
      }
   }

   public static record w(axw<dxj.w.b, dxj.w.a> e) implements dxi {
      private static final Codec<axw<dxj.w.b, dxj.w.a>> f = axw.a(dxj.w.a.b);
      private static final MapCodec<dxj.w> g = f.fieldOf("spline").xmap(dxj.w::new, dxj.w::j);
      public static final ayn<dxj.w> a = dxj.a(g);

      @Override
      public double a(dxi.b $$0) {
         return (double)this.e.a(new dxj.w.b($$0));
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
      public void a(double[] $$0, dxi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxi a(dxi.f $$0) {
         return $$0.apply(new dxj.w(this.e.a((axw.d<dxj.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public ayn<? extends dxi> c() {
         return a;
      }

      public axw<dxj.w.b, dxj.w.a> j() {
         return this.e;
      }

      public static record a(ji<dxi> c) implements azv<dxj.w.b> {
         public static final Codec<dxj.w.a> b = dxi.c.xmap(dxj.w.a::new, dxj.w.a::a);

         @Override
         public String toString() {
            Optional<ala<dxi>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               ala<dxi> $$1 = $$0.get();
               if ($$1 == dxw.d) {
                  return "continents";
               }

               if ($$1 == dxw.e) {
                  return "erosion";
               }

               if ($$1 == dxw.f) {
                  return "weirdness";
               }

               if ($$1 == dxw.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dxj.w.b $$0) {
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

         public dxj.w.a a(dxi.f $$0) {
            return new dxj.w.a(new ji.a<>(this.c.a().a($$0)));
         }

         public ji<dxi> a() {
            return this.c;
         }
      }

      public static record b(dxi.b a) {
      }
   }

   interface x extends dxi {
      dxi j();

      @Override
      default double a(dxi.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dxi.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dxi.b var1, double var2);
   }

   interface y extends dxi {
      Logger a = LogUtils.getLogger();

      static dxj.y a(dxj.y.a $$0, dxi $$1, dxi $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dxj.y.a.c || $$0 == dxj.y.a.d) {
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
         if ($$0 == dxj.y.a.b || $$0 == dxj.y.a.a) {
            if ($$1 instanceof dxj.h $$11) {
               return new dxj.n($$0 == dxj.y.a.a ? dxj.n.a.b : dxj.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dxj.h $$12) {
               return new dxj.n($$0 == dxj.y.a.a ? dxj.n.a.b : dxj.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dxj.a($$0, $$1, $$2, $$9, $$10);
      }

      dxj.y.a j();

      dxi k();

      dxi l();

      @Override
      default ayn<? extends dxi> c() {
         return this.j().e;
      }

      public static enum a implements azp {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final ayn<dxj.y> e = dxj.a((BiFunction<dxi, dxi, dxj.y>)(($$0x, $$1) -> dxj.y.a(this, $$0x, $$1)), dxj.y::k, dxj.y::l);
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

   protected static record z(dxi e, dxi.c f, dxj.z.a g) implements dxj.x {
      private static final MapCodec<dxj.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxi.d.fieldOf("input").forGetter(dxj.z::j),
                  dxi.c.a.fieldOf("noise").forGetter(dxj.z::k),
                  dxj.z.a.c.fieldOf("rarity_value_mapper").forGetter(dxj.z::l)
               )
               .apply($$0, dxj.z::new)
      );
      public static final ayn<dxj.z> a = dxj.a(h);

      @Override
      public double a(dxi.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dxi a(dxi.f $$0) {
         return $$0.apply(new dxj.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public ayn<? extends dxi> c() {
         return a;
      }

      @Override
      public dxi j() {
         return this.e;
      }

      public dxi.c k() {
         return this.f;
      }

      public dxj.z.a l() {
         return this.g;
      }

      public static enum a implements azp {
         a("type_1", dxw.a::b, 2.0),
         b("type_2", dxw.a::a, 3.0);

         public static final Codec<dxj.z.a> c = azp.a(dxj.z.a::values);
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
