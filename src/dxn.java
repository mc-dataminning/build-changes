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

public final class dxn {
   private static final Codec<dxm> c = lp.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dxm> b = Codec.either(d, c)
      .xmap($$0 -> (dxm)$$0.map(dxn::a, Function.identity()), $$0 -> $$0 instanceof dxn.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends dxm> a(jv<MapCodec<? extends dxm>> $$0) {
      a($$0, "blend_alpha", dxn.d.e);
      a($$0, "blend_offset", dxn.f.e);
      a($$0, "beardifier", dxn.b.e);
      a($$0, "old_blended_noise", emu.a);

      for (dxn.l.a $$1 : dxn.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dxn.o.e);
      a($$0, "end_islands", dxn.i.a);
      a($$0, "weird_scaled_sampler", dxn.z.a);
      a($$0, "shifted_noise", dxn.v.a);
      a($$0, "range_choice", dxn.q.e);
      a($$0, "shift_a", dxn.s.e);
      a($$0, "shift_b", dxn.t.e);
      a($$0, "shift", dxn.r.e);
      a($$0, "blend_density", dxn.e.e);
      a($$0, "clamp", dxn.g.a);

      for (dxn.k.a $$2 : dxn.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dxn.y.a $$3 : dxn.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dxn.w.a);
      a($$0, "constant", dxn.h.e);
      return a($$0, "y_clamped_gradient", dxn.aa.a);
   }

   private static MapCodec<? extends dxm> a(jv<MapCodec<? extends dxm>> $$0, String $$1, ayr<? extends dxm> $$2) {
      return jv.a($$0, $$1, $$2.a());
   }

   static <A, O> ayr<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return ayr.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> ayr<O> a(Function<dxm, O> $$0, Function<O, dxm> $$1) {
      return a(dxm.d, $$0, $$1);
   }

   static <O> ayr<O> a(BiFunction<dxm, dxm, O> $$0, Function<O, dxm> $$1, Function<O, dxm> $$2) {
      return ayr.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dxm.d.fieldOf("argument1").forGetter($$1), dxm.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> ayr<O> a(MapCodec<O> $$0) {
      return ayr.a($$0);
   }

   private dxn() {
   }

   public static dxm a(dxm $$0) {
      return new dxn.l(dxn.l.a.a, $$0);
   }

   public static dxm b(dxm $$0) {
      return new dxn.l(dxn.l.a.b, $$0);
   }

   public static dxm c(dxm $$0) {
      return new dxn.l(dxn.l.a.c, $$0);
   }

   public static dxm d(dxm $$0) {
      return new dxn.l(dxn.l.a.d, $$0);
   }

   public static dxm e(dxm $$0) {
      return new dxn.l(dxn.l.a.e, $$0);
   }

   public static dxm a(ji<emx.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dxn.o(new dxm.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dxm a(ji<emx.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dxm a(ji<emx.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dxm a(dxm $$0, dxm $$1, double $$2, ji<emx.a> $$3) {
      return new dxn.v($$0, a(), $$1, $$2, 0.0, new dxm.c($$3));
   }

   public static dxm a(ji<emx.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dxm b(ji<emx.a> $$0, double $$1, double $$2) {
      return new dxn.o(new dxm.c($$0), $$1, $$2);
   }

   public static dxm a(ji<emx.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dxm a(dxm $$0, double $$1, double $$2, dxm $$3, dxm $$4) {
      return new dxn.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dxm b(ji<emx.a> $$0) {
      return new dxn.s(new dxm.c($$0));
   }

   public static dxm c(ji<emx.a> $$0) {
      return new dxn.t(new dxm.c($$0));
   }

   public static dxm d(ji<emx.a> $$0) {
      return new dxn.r(new dxm.c($$0));
   }

   public static dxm f(dxm $$0) {
      return new dxn.e($$0);
   }

   public static dxm a(long $$0) {
      return new dxn.i($$0);
   }

   public static dxm a(dxm $$0, ji<emx.a> $$1, dxn.z.a $$2) {
      return new dxn.z($$0, new dxm.c($$1), $$2);
   }

   public static dxm a(dxm $$0, dxm $$1) {
      return dxn.y.a(dxn.y.a.a, $$0, $$1);
   }

   public static dxm b(dxm $$0, dxm $$1) {
      return dxn.y.a(dxn.y.a.b, $$0, $$1);
   }

   public static dxm c(dxm $$0, dxm $$1) {
      return dxn.y.a(dxn.y.a.c, $$0, $$1);
   }

   public static dxm d(dxm $$0, dxm $$1) {
      return dxn.y.a(dxn.y.a.d, $$0, $$1);
   }

   public static dxm a(axz<dxn.w.b, dxn.w.a> $$0) {
      return new dxn.w($$0);
   }

   public static dxm a() {
      return dxn.h.f;
   }

   public static dxm a(double $$0) {
      return new dxn.h($$0);
   }

   public static dxm a(int $$0, int $$1, double $$2, double $$3) {
      return new dxn.aa($$0, $$1, $$2, $$3);
   }

   public static dxm a(dxm $$0, dxn.k.a $$1) {
      return dxn.k.a($$1, $$0);
   }

   private static dxm a(dxm $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dxm b() {
      return dxn.d.a;
   }

   public static dxm c() {
      return dxn.f.a;
   }

   public static dxm a(dxm $$0, dxm $$1, dxm $$2) {
      if ($$1 instanceof dxn.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dxm $$4 = d($$0);
         dxm $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dxm a(dxm $$0, double $$1, dxm $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dxn.y.a e, dxm f, dxm g, double h, double i) implements dxn.y {
      @Override
      public double a(dxm.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, dxm.a $$1) {
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
      public dxm a(dxm.f $$0) {
         return $$0.apply(dxn.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dxn.y.a j() {
         return this.e;
      }

      @Override
      public dxm k() {
         return this.f;
      }

      @Override
      public dxm l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dxm.d {
      private static final MapCodec<dxn.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dvt.e * 2, dvt.d * 2).fieldOf("from_y").forGetter(dxn.aa::j),
                  Codec.intRange(dvt.e * 2, dvt.d * 2).fieldOf("to_y").forGetter(dxn.aa::k),
                  dxn.d.fieldOf("from_value").forGetter(dxn.aa::l),
                  dxn.d.fieldOf("to_value").forGetter(dxn.aa::m)
               )
               .apply($$0, dxn.aa::new)
      );
      public static final ayr<dxn.aa> a = dxn.a(i);

      @Override
      public double a(dxm.b $$0) {
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
      public ayr<? extends dxm> c() {
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

   protected static enum b implements dxn.c {
      a;

      @Override
      public double a(dxm.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dxm.a $$1) {
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

   public interface c extends dxm.d {
      ayr<dxm> e = ayr.a(MapCodec.unit(dxn.b.a));

      @Override
      default ayr<? extends dxm> c() {
         return e;
      }
   }

   protected static enum d implements dxm.d {
      a;

      public static final ayr<dxm> e = ayr.a(MapCodec.unit(a));

      @Override
      public double a(dxm.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dxm.a $$1) {
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
      public ayr<? extends dxm> c() {
         return e;
      }
   }

   static record e(dxm a) implements dxn.x {
      static final ayr<dxn.e> e = dxn.a(dxn.e::new, dxn.e::j);

      @Override
      public double a(dxm.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dxm a(dxm.f $$0) {
         return $$0.apply(new dxn.e(this.a.a($$0)));
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
      public ayr<? extends dxm> c() {
         return e;
      }

      @Override
      public dxm j() {
         return this.a;
      }
   }

   protected static enum f implements dxm.d {
      a;

      public static final ayr<dxm> e = ayr.a(MapCodec.unit(a));

      @Override
      public double a(dxm.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dxm.a $$1) {
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
      public ayr<? extends dxm> c() {
         return e;
      }
   }

   protected static record g(dxm e, double f, double g) implements dxn.p {
      private static final MapCodec<dxn.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dxm.b.fieldOf("input").forGetter(dxn.g::az_), dxn.d.fieldOf("min").forGetter(dxn.g::a), dxn.d.fieldOf("max").forGetter(dxn.g::b))
               .apply($$0, dxn.g::new)
      );
      public static final ayr<dxn.g> a = dxn.a(h);

      @Override
      public double a(double $$0) {
         return ayy.a($$0, this.f, this.g);
      }

      @Override
      public dxm a(dxm.f $$0) {
         return new dxn.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public ayr<? extends dxm> c() {
         return a;
      }

      @Override
      public dxm az_() {
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

   static record h(double a) implements dxm.d {
      static final ayr<dxn.h> e = dxn.a(dxn.d, dxn.h::new, dxn.h::j);
      static final dxn.h f = new dxn.h(0.0);

      @Override
      public void a(double[] $$0, dxm.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public ayr<? extends dxm> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dxm.d {
      public static final ayr<dxn.i> a = ayr.a(MapCodec.unit(new dxn.i(0L)));
      private static final float e = -0.9F;
      private final ena f;

      public i(long $$0) {
         azg $$1 = new dxu($$0);
         $$1.b(17292);
         this.f = new ena($$1);
      }

      private static float a(ena $$0, int $$1, int $$2) {
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
      public double a(dxm.b $$0) {
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
      public ayr<? extends dxm> c() {
         return a;
      }
   }

   @bac
   public static record j(ji<dxm> a) implements dxm {
      @Override
      public double a(dxm.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dxm.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dxm a(dxm.f $$0) {
         return $$0.apply(new dxn.j(new ji.a<>(this.a.a().a($$0))));
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
      public ayr<? extends dxm> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public ji<dxm> j() {
         return this.a;
      }
   }

   protected static record k(dxn.k.a a, dxm e, double f, double g) implements dxn.p {
      public static dxn.k a(dxn.k.a $$0, dxm $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dxn.k.a.a && $$0 != dxn.k.a.b ? new dxn.k($$0, $$1, $$3, $$4) : new dxn.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dxn.k.a $$0, double $$1) {
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

      public dxn.k b(dxm.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public ayr<? extends dxm> c() {
         return this.a.h;
      }

      public dxn.k.a k() {
         return this.a;
      }

      @Override
      public dxm az_() {
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

      static enum a implements azt {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final ayr<dxn.k> h = dxn.a($$0x -> dxn.k.a(this, $$0x), dxn.k::az_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dxn.l.a a, dxm e) implements dxn.m {
      @Override
      public double a(dxm.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dxm.a $$1) {
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
      public dxn.l.a j() {
         return this.a;
      }

      @Override
      public dxm k() {
         return this.e;
      }

      static enum a implements azt {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final ayr<dxn.m> g = dxn.a($$0x -> new dxn.l(this, $$0x), dxn.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dxm {
      dxn.l.a j();

      dxm k();

      @Override
      default ayr<? extends dxm> c() {
         return this.j().g;
      }

      @Override
      default dxm a(dxm.f $$0) {
         return $$0.apply(new dxn.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dxn.n.a e, dxm f, double g, double h, double i) implements dxn.p, dxn.y {
      @Override
      public dxn.y.a j() {
         return this.e == dxn.n.a.a ? dxn.y.a.b : dxn.y.a.a;
      }

      @Override
      public dxm k() {
         return dxn.a(this.i);
      }

      @Override
      public dxm l() {
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
      public dxm a(dxm.f $$0) {
         dxm $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dxn.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dxn.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dxn.n.a m() {
         return this.e;
      }

      @Override
      public dxm az_() {
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

   protected static record o(dxm.c f, @Deprecated double g, double h) implements dxm {
      public static final MapCodec<dxn.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxm.c.a.fieldOf("noise").forGetter(dxn.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dxn.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dxn.o::l)
               )
               .apply($$0, dxn.o::new)
      );
      public static final ayr<dxn.o> e = dxn.a(a);

      @Override
      public double a(dxm.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dxm.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxm a(dxm.f $$0) {
         return $$0.apply(new dxn.o($$0.a(this.f), this.g, this.h));
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
      public ayr<? extends dxm> c() {
         return e;
      }

      public dxm.c j() {
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

   interface p extends dxm {
      dxm az_();

      @Override
      default double a(dxm.b $$0) {
         return this.a(this.az_().a($$0));
      }

      @Override
      default void a(double[] $$0, dxm.a $$1) {
         this.az_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dxm f, double g, double h, dxm i, dxm j) implements dxm {
      public static final MapCodec<dxn.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxm.d.fieldOf("input").forGetter(dxn.q::j),
                  dxn.d.fieldOf("min_inclusive").forGetter(dxn.q::k),
                  dxn.d.fieldOf("max_exclusive").forGetter(dxn.q::l),
                  dxm.d.fieldOf("when_in_range").forGetter(dxn.q::m),
                  dxm.d.fieldOf("when_out_of_range").forGetter(dxn.q::n)
               )
               .apply($$0, dxn.q::new)
      );
      public static final ayr<dxn.q> e = dxn.a(a);

      @Override
      public double a(dxm.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dxm.a $$1) {
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
      public dxm a(dxm.f $$0) {
         return $$0.apply(new dxn.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public ayr<? extends dxm> c() {
         return e;
      }

      public dxm j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dxm m() {
         return this.i;
      }

      public dxm n() {
         return this.j;
      }
   }

   protected static record r(dxm.c a) implements dxn.u {
      static final ayr<dxn.r> e = dxn.a(dxm.c.a, dxn.r::new, dxn.r::j);

      @Override
      public double a(dxm.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dxm a(dxm.f $$0) {
         return $$0.apply(new dxn.r($$0.a(this.a)));
      }

      @Override
      public ayr<? extends dxm> c() {
         return e;
      }

      @Override
      public dxm.c j() {
         return this.a;
      }
   }

   protected static record s(dxm.c a) implements dxn.u {
      static final ayr<dxn.s> e = dxn.a(dxm.c.a, dxn.s::new, dxn.s::j);

      @Override
      public double a(dxm.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dxm a(dxm.f $$0) {
         return $$0.apply(new dxn.s($$0.a(this.a)));
      }

      @Override
      public ayr<? extends dxm> c() {
         return e;
      }

      @Override
      public dxm.c j() {
         return this.a;
      }
   }

   protected static record t(dxm.c a) implements dxn.u {
      static final ayr<dxn.t> e = dxn.a(dxm.c.a, dxn.t::new, dxn.t::j);

      @Override
      public double a(dxm.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dxm a(dxm.f $$0) {
         return $$0.apply(new dxn.t($$0.a(this.a)));
      }

      @Override
      public ayr<? extends dxm> c() {
         return e;
      }

      @Override
      public dxm.c j() {
         return this.a;
      }
   }

   interface u extends dxm {
      dxm.c j();

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
      default void a(double[] $$0, dxm.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dxm e, dxm f, dxm g, double h, double i, dxm.c j) implements dxm {
      private static final MapCodec<dxn.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxm.d.fieldOf("shift_x").forGetter(dxn.v::j),
                  dxm.d.fieldOf("shift_y").forGetter(dxn.v::k),
                  dxm.d.fieldOf("shift_z").forGetter(dxn.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dxn.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dxn.v::n),
                  dxm.c.a.fieldOf("noise").forGetter(dxn.v::o)
               )
               .apply($$0, dxn.v::new)
      );
      public static final ayr<dxn.v> a = dxn.a(k);

      @Override
      public double a(dxm.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dxm.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxm a(dxm.f $$0) {
         return $$0.apply(new dxn.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public ayr<? extends dxm> c() {
         return a;
      }

      public dxm j() {
         return this.e;
      }

      public dxm k() {
         return this.f;
      }

      public dxm l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dxm.c o() {
         return this.j;
      }
   }

   public static record w(axz<dxn.w.b, dxn.w.a> e) implements dxm {
      private static final Codec<axz<dxn.w.b, dxn.w.a>> f = axz.a(dxn.w.a.b);
      private static final MapCodec<dxn.w> g = f.fieldOf("spline").xmap(dxn.w::new, dxn.w::j);
      public static final ayr<dxn.w> a = dxn.a(g);

      @Override
      public double a(dxm.b $$0) {
         return (double)this.e.a(new dxn.w.b($$0));
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
      public void a(double[] $$0, dxm.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxm a(dxm.f $$0) {
         return $$0.apply(new dxn.w(this.e.a((axz.d<dxn.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public ayr<? extends dxm> c() {
         return a;
      }

      public axz<dxn.w.b, dxn.w.a> j() {
         return this.e;
      }

      public static record a(ji<dxm> c) implements azz<dxn.w.b> {
         public static final Codec<dxn.w.a> b = dxm.c.xmap(dxn.w.a::new, dxn.w.a::a);

         @Override
         public String toString() {
            Optional<ald<dxm>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               ald<dxm> $$1 = $$0.get();
               if ($$1 == dya.d) {
                  return "continents";
               }

               if ($$1 == dya.e) {
                  return "erosion";
               }

               if ($$1 == dya.f) {
                  return "weirdness";
               }

               if ($$1 == dya.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dxn.w.b $$0) {
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

         public dxn.w.a a(dxm.f $$0) {
            return new dxn.w.a(new ji.a<>(this.c.a().a($$0)));
         }

         public ji<dxm> a() {
            return this.c;
         }
      }

      public static record b(dxm.b a) {
      }
   }

   interface x extends dxm {
      dxm j();

      @Override
      default double a(dxm.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dxm.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dxm.b var1, double var2);
   }

   interface y extends dxm {
      Logger a = LogUtils.getLogger();

      static dxn.y a(dxn.y.a $$0, dxm $$1, dxm $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dxn.y.a.c || $$0 == dxn.y.a.d) {
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
         if ($$0 == dxn.y.a.b || $$0 == dxn.y.a.a) {
            if ($$1 instanceof dxn.h $$11) {
               return new dxn.n($$0 == dxn.y.a.a ? dxn.n.a.b : dxn.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dxn.h $$12) {
               return new dxn.n($$0 == dxn.y.a.a ? dxn.n.a.b : dxn.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dxn.a($$0, $$1, $$2, $$9, $$10);
      }

      dxn.y.a j();

      dxm k();

      dxm l();

      @Override
      default ayr<? extends dxm> c() {
         return this.j().e;
      }

      public static enum a implements azt {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final ayr<dxn.y> e = dxn.a((BiFunction<dxm, dxm, dxn.y>)(($$0x, $$1) -> dxn.y.a(this, $$0x, $$1)), dxn.y::k, dxn.y::l);
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

   protected static record z(dxm e, dxm.c f, dxn.z.a g) implements dxn.x {
      private static final MapCodec<dxn.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxm.d.fieldOf("input").forGetter(dxn.z::j),
                  dxm.c.a.fieldOf("noise").forGetter(dxn.z::k),
                  dxn.z.a.c.fieldOf("rarity_value_mapper").forGetter(dxn.z::l)
               )
               .apply($$0, dxn.z::new)
      );
      public static final ayr<dxn.z> a = dxn.a(h);

      @Override
      public double a(dxm.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dxm a(dxm.f $$0) {
         return $$0.apply(new dxn.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public ayr<? extends dxm> c() {
         return a;
      }

      @Override
      public dxm j() {
         return this.e;
      }

      public dxm.c k() {
         return this.f;
      }

      public dxn.z.a l() {
         return this.g;
      }

      public static enum a implements azt {
         a("type_1", dya.a::b, 2.0),
         b("type_2", dya.a::a, 3.0);

         public static final Codec<dxn.z.a> c = azt.a(dxn.z.a::values);
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
