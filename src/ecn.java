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

public final class ecn {
   private static final Codec<ecm> c = mb.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<ecm> b = Codec.either(d, c)
      .xmap($$0 -> (ecm)$$0.map(ecn::a, Function.identity()), $$0 -> $$0 instanceof ecn.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends ecm> a(ke<MapCodec<? extends ecm>> $$0) {
      a($$0, "blend_alpha", ecn.d.e);
      a($$0, "blend_offset", ecn.f.e);
      a($$0, "beardifier", ecn.b.e);
      a($$0, "old_blended_noise", esa.a);

      for (ecn.l.a $$1 : ecn.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", ecn.o.e);
      a($$0, "end_islands", ecn.i.a);
      a($$0, "weird_scaled_sampler", ecn.z.a);
      a($$0, "shifted_noise", ecn.v.a);
      a($$0, "range_choice", ecn.q.e);
      a($$0, "shift_a", ecn.s.e);
      a($$0, "shift_b", ecn.t.e);
      a($$0, "shift", ecn.r.e);
      a($$0, "blend_density", ecn.e.e);
      a($$0, "clamp", ecn.g.a);

      for (ecn.k.a $$2 : ecn.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (ecn.y.a $$3 : ecn.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", ecn.w.a);
      a($$0, "constant", ecn.h.e);
      return a($$0, "y_clamped_gradient", ecn.aa.a);
   }

   private static MapCodec<? extends ecm> a(ke<MapCodec<? extends ecm>> $$0, String $$1, ays<? extends ecm> $$2) {
      return ke.a($$0, $$1, $$2.a());
   }

   static <A, O> ays<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return ays.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> ays<O> a(Function<ecm, O> $$0, Function<O, ecm> $$1) {
      return a(ecm.d, $$0, $$1);
   }

   static <O> ays<O> a(BiFunction<ecm, ecm, O> $$0, Function<O, ecm> $$1, Function<O, ecm> $$2) {
      return ays.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(ecm.d.fieldOf("argument1").forGetter($$1), ecm.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> ays<O> a(MapCodec<O> $$0) {
      return ays.a($$0);
   }

   private ecn() {
   }

   public static ecm a(ecm $$0) {
      return new ecn.l(ecn.l.a.a, $$0);
   }

   public static ecm b(ecm $$0) {
      return new ecn.l(ecn.l.a.b, $$0);
   }

   public static ecm c(ecm $$0) {
      return new ecn.l(ecn.l.a.c, $$0);
   }

   public static ecm d(ecm $$0) {
      return new ecn.l(ecn.l.a.d, $$0);
   }

   public static ecm e(ecm $$0) {
      return new ecn.l(ecn.l.a.e, $$0);
   }

   public static ecm a(jr<esd.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new ecn.o(new ecm.c($$0), $$1, $$2), $$3, $$4);
   }

   public static ecm a(jr<esd.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static ecm a(jr<esd.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static ecm a(ecm $$0, ecm $$1, double $$2, jr<esd.a> $$3) {
      return new ecn.v($$0, a(), $$1, $$2, 0.0, new ecm.c($$3));
   }

   public static ecm a(jr<esd.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static ecm b(jr<esd.a> $$0, double $$1, double $$2) {
      return new ecn.o(new ecm.c($$0), $$1, $$2);
   }

   public static ecm a(jr<esd.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static ecm a(ecm $$0, double $$1, double $$2, ecm $$3, ecm $$4) {
      return new ecn.q($$0, $$1, $$2, $$3, $$4);
   }

   public static ecm b(jr<esd.a> $$0) {
      return new ecn.s(new ecm.c($$0));
   }

   public static ecm c(jr<esd.a> $$0) {
      return new ecn.t(new ecm.c($$0));
   }

   public static ecm d(jr<esd.a> $$0) {
      return new ecn.r(new ecm.c($$0));
   }

   public static ecm f(ecm $$0) {
      return new ecn.e($$0);
   }

   public static ecm a(long $$0) {
      return new ecn.i($$0);
   }

   public static ecm a(ecm $$0, jr<esd.a> $$1, ecn.z.a $$2) {
      return new ecn.z($$0, new ecm.c($$1), $$2);
   }

   public static ecm a(ecm $$0, ecm $$1) {
      return ecn.y.a(ecn.y.a.a, $$0, $$1);
   }

   public static ecm b(ecm $$0, ecm $$1) {
      return ecn.y.a(ecn.y.a.b, $$0, $$1);
   }

   public static ecm c(ecm $$0, ecm $$1) {
      return ecn.y.a(ecn.y.a.c, $$0, $$1);
   }

   public static ecm d(ecm $$0, ecm $$1) {
      return ecn.y.a(ecn.y.a.d, $$0, $$1);
   }

   public static ecm a(ayb<ecn.w.b, ecn.w.a> $$0) {
      return new ecn.w($$0);
   }

   public static ecm a() {
      return ecn.h.f;
   }

   public static ecm a(double $$0) {
      return new ecn.h($$0);
   }

   public static ecm a(int $$0, int $$1, double $$2, double $$3) {
      return new ecn.aa($$0, $$1, $$2, $$3);
   }

   public static ecm a(ecm $$0, ecn.k.a $$1) {
      return ecn.k.a($$1, $$0);
   }

   private static ecm a(ecm $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static ecm b() {
      return ecn.d.a;
   }

   public static ecm c() {
      return ecn.f.a;
   }

   public static ecm a(ecm $$0, ecm $$1, ecm $$2) {
      if ($$1 instanceof ecn.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         ecm $$4 = d($$0);
         ecm $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static ecm a(ecm $$0, double $$1, ecm $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(ecn.y.a e, ecm f, ecm g, double h, double i) implements ecn.y {
      @Override
      public double a(ecm.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, ecm.a $$1) {
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
      public ecm a(ecm.f $$0) {
         return $$0.apply(ecn.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public ecn.y.a j() {
         return this.e;
      }

      @Override
      public ecm k() {
         return this.f;
      }

      @Override
      public ecm l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements ecm.d {
      private static final MapCodec<ecn.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(eat.e * 2, eat.d * 2).fieldOf("from_y").forGetter(ecn.aa::j),
                  Codec.intRange(eat.e * 2, eat.d * 2).fieldOf("to_y").forGetter(ecn.aa::k),
                  ecn.d.fieldOf("from_value").forGetter(ecn.aa::l),
                  ecn.d.fieldOf("to_value").forGetter(ecn.aa::m)
               )
               .apply($$0, ecn.aa::new)
      );
      public static final ays<ecn.aa> a = ecn.a(i);

      @Override
      public double a(ecm.b $$0) {
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
      public ays<? extends ecm> c() {
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

   protected static enum b implements ecn.c {
      a;

      @Override
      public double a(ecm.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, ecm.a $$1) {
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

   public interface c extends ecm.d {
      ays<ecm> e = ays.a(MapCodec.unit(ecn.b.a));

      @Override
      default ays<? extends ecm> c() {
         return e;
      }
   }

   protected static enum d implements ecm.d {
      a;

      public static final ays<ecm> e = ays.a(MapCodec.unit(a));

      @Override
      public double a(ecm.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, ecm.a $$1) {
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
      public ays<? extends ecm> c() {
         return e;
      }
   }

   static record e(ecm a) implements ecn.x {
      static final ays<ecn.e> e = ecn.a(ecn.e::new, ecn.e::j);

      @Override
      public double a(ecm.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public ecm a(ecm.f $$0) {
         return $$0.apply(new ecn.e(this.a.a($$0)));
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
      public ays<? extends ecm> c() {
         return e;
      }

      @Override
      public ecm j() {
         return this.a;
      }
   }

   protected static enum f implements ecm.d {
      a;

      public static final ays<ecm> e = ays.a(MapCodec.unit(a));

      @Override
      public double a(ecm.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, ecm.a $$1) {
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
      public ays<? extends ecm> c() {
         return e;
      }
   }

   protected static record g(ecm e, double f, double g) implements ecn.p {
      private static final MapCodec<ecn.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ecm.b.fieldOf("input").forGetter(ecn.g::aD_), ecn.d.fieldOf("min").forGetter(ecn.g::a), ecn.d.fieldOf("max").forGetter(ecn.g::b))
               .apply($$0, ecn.g::new)
      );
      public static final ays<ecn.g> a = ecn.a(h);

      @Override
      public double a(double $$0) {
         return ayz.a($$0, this.f, this.g);
      }

      @Override
      public ecm a(ecm.f $$0) {
         return new ecn.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public ays<? extends ecm> c() {
         return a;
      }

      @Override
      public ecm aD_() {
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

   static record h(double a) implements ecm.d {
      static final ays<ecn.h> e = ecn.a(ecn.d, ecn.h::new, ecn.h::j);
      static final ecn.h f = new ecn.h(0.0);

      @Override
      public void a(double[] $$0, ecm.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public ays<? extends ecm> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements ecm.d {
      public static final ays<ecn.i> a = ays.a(MapCodec.unit(new ecn.i(0L)));
      private static final float e = -0.9F;
      private final esg f;

      public i(long $$0) {
         azh $$1 = new ecu($$0);
         $$1.b(17292);
         this.f = new esg($$1);
      }

      private static float a(esg $$0, int $$1, int $$2) {
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
      public double a(ecm.b $$0) {
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
      public ays<? extends ecm> c() {
         return a;
      }
   }

   @bag
   public static record j(jr<ecm> a) implements ecm {
      @Override
      public double a(ecm.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, ecm.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public ecm a(ecm.f $$0) {
         return $$0.apply(new ecn.j(new jr.a<>(this.a.a().a($$0))));
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
      public ays<? extends ecm> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jr<ecm> j() {
         return this.a;
      }
   }

   protected static record k(ecn.k.a a, ecm e, double f, double g) implements ecn.p {
      public static ecn.k a(ecn.k.a $$0, ecm $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != ecn.k.a.a && $$0 != ecn.k.a.b ? new ecn.k($$0, $$1, $$3, $$4) : new ecn.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(ecn.k.a $$0, double $$1) {
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

      public ecn.k b(ecm.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public ays<? extends ecm> c() {
         return this.a.h;
      }

      public ecn.k.a k() {
         return this.a;
      }

      @Override
      public ecm aD_() {
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
         final ays<ecn.k> h = ecn.a($$0x -> ecn.k.a(this, $$0x), ecn.k::aD_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(ecn.l.a a, ecm e) implements ecn.m {
      @Override
      public double a(ecm.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, ecm.a $$1) {
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
      public ecn.l.a j() {
         return this.a;
      }

      @Override
      public ecm k() {
         return this.e;
      }

      static enum a implements azv {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final ays<ecn.m> g = ecn.a($$0x -> new ecn.l(this, $$0x), ecn.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends ecm {
      ecn.l.a j();

      ecm k();

      @Override
      default ays<? extends ecm> c() {
         return this.j().g;
      }

      @Override
      default ecm a(ecm.f $$0) {
         return $$0.apply(new ecn.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(ecn.n.a e, ecm f, double g, double h, double i) implements ecn.p, ecn.y {
      @Override
      public ecn.y.a j() {
         return this.e == ecn.n.a.a ? ecn.y.a.b : ecn.y.a.a;
      }

      @Override
      public ecm k() {
         return ecn.a(this.i);
      }

      @Override
      public ecm l() {
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
      public ecm a(ecm.f $$0) {
         ecm $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == ecn.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new ecn.n(this.e, $$1, $$4, $$5, this.i);
      }

      public ecn.n.a m() {
         return this.e;
      }

      @Override
      public ecm aD_() {
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

   protected static record o(ecm.c f, @Deprecated double g, double h) implements ecm {
      public static final MapCodec<ecn.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ecm.c.a.fieldOf("noise").forGetter(ecn.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(ecn.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(ecn.o::l)
               )
               .apply($$0, ecn.o::new)
      );
      public static final ays<ecn.o> e = ecn.a(a);

      @Override
      public double a(ecm.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, ecm.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ecm a(ecm.f $$0) {
         return $$0.apply(new ecn.o($$0.a(this.f), this.g, this.h));
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
      public ays<? extends ecm> c() {
         return e;
      }

      public ecm.c j() {
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

   interface p extends ecm {
      ecm aD_();

      @Override
      default double a(ecm.b $$0) {
         return this.a(this.aD_().a($$0));
      }

      @Override
      default void a(double[] $$0, ecm.a $$1) {
         this.aD_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(ecm f, double g, double h, ecm i, ecm j) implements ecm {
      public static final MapCodec<ecn.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ecm.d.fieldOf("input").forGetter(ecn.q::j),
                  ecn.d.fieldOf("min_inclusive").forGetter(ecn.q::k),
                  ecn.d.fieldOf("max_exclusive").forGetter(ecn.q::l),
                  ecm.d.fieldOf("when_in_range").forGetter(ecn.q::m),
                  ecm.d.fieldOf("when_out_of_range").forGetter(ecn.q::n)
               )
               .apply($$0, ecn.q::new)
      );
      public static final ays<ecn.q> e = ecn.a(a);

      @Override
      public double a(ecm.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, ecm.a $$1) {
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
      public ecm a(ecm.f $$0) {
         return $$0.apply(new ecn.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public ays<? extends ecm> c() {
         return e;
      }

      public ecm j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public ecm m() {
         return this.i;
      }

      public ecm n() {
         return this.j;
      }
   }

   protected static record r(ecm.c a) implements ecn.u {
      static final ays<ecn.r> e = ecn.a(ecm.c.a, ecn.r::new, ecn.r::j);

      @Override
      public double a(ecm.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public ecm a(ecm.f $$0) {
         return $$0.apply(new ecn.r($$0.a(this.a)));
      }

      @Override
      public ays<? extends ecm> c() {
         return e;
      }

      @Override
      public ecm.c j() {
         return this.a;
      }
   }

   protected static record s(ecm.c a) implements ecn.u {
      static final ays<ecn.s> e = ecn.a(ecm.c.a, ecn.s::new, ecn.s::j);

      @Override
      public double a(ecm.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public ecm a(ecm.f $$0) {
         return $$0.apply(new ecn.s($$0.a(this.a)));
      }

      @Override
      public ays<? extends ecm> c() {
         return e;
      }

      @Override
      public ecm.c j() {
         return this.a;
      }
   }

   protected static record t(ecm.c a) implements ecn.u {
      static final ays<ecn.t> e = ecn.a(ecm.c.a, ecn.t::new, ecn.t::j);

      @Override
      public double a(ecm.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public ecm a(ecm.f $$0) {
         return $$0.apply(new ecn.t($$0.a(this.a)));
      }

      @Override
      public ays<? extends ecm> c() {
         return e;
      }

      @Override
      public ecm.c j() {
         return this.a;
      }
   }

   interface u extends ecm {
      ecm.c j();

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
      default void a(double[] $$0, ecm.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(ecm e, ecm f, ecm g, double h, double i, ecm.c j) implements ecm {
      private static final MapCodec<ecn.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ecm.d.fieldOf("shift_x").forGetter(ecn.v::j),
                  ecm.d.fieldOf("shift_y").forGetter(ecn.v::k),
                  ecm.d.fieldOf("shift_z").forGetter(ecn.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(ecn.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(ecn.v::n),
                  ecm.c.a.fieldOf("noise").forGetter(ecn.v::o)
               )
               .apply($$0, ecn.v::new)
      );
      public static final ays<ecn.v> a = ecn.a(k);

      @Override
      public double a(ecm.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, ecm.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ecm a(ecm.f $$0) {
         return $$0.apply(new ecn.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public ays<? extends ecm> c() {
         return a;
      }

      public ecm j() {
         return this.e;
      }

      public ecm k() {
         return this.f;
      }

      public ecm l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public ecm.c o() {
         return this.j;
      }
   }

   public static record w(ayb<ecn.w.b, ecn.w.a> e) implements ecm {
      private static final Codec<ayb<ecn.w.b, ecn.w.a>> f = ayb.a(ecn.w.a.b);
      private static final MapCodec<ecn.w> g = f.fieldOf("spline").xmap(ecn.w::new, ecn.w::j);
      public static final ays<ecn.w> a = ecn.a(g);

      @Override
      public double a(ecm.b $$0) {
         return (double)this.e.a(new ecn.w.b($$0));
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
      public void a(double[] $$0, ecm.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ecm a(ecm.f $$0) {
         return $$0.apply(new ecn.w(this.e.a((ayb.d<ecn.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public ays<? extends ecm> c() {
         return a;
      }

      public ayb<ecn.w.b, ecn.w.a> j() {
         return this.e;
      }

      public static record a(jr<ecm> c) implements bac<ecn.w.b> {
         public static final Codec<ecn.w.a> b = ecm.c.xmap(ecn.w.a::new, ecn.w.a::a);

         @Override
         public String toString() {
            Optional<aku<ecm>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               aku<ecm> $$1 = $$0.get();
               if ($$1 == eda.d) {
                  return "continents";
               }

               if ($$1 == eda.e) {
                  return "erosion";
               }

               if ($$1 == eda.f) {
                  return "weirdness";
               }

               if ($$1 == eda.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(ecn.w.b $$0) {
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

         public ecn.w.a a(ecm.f $$0) {
            return new ecn.w.a(new jr.a<>(this.c.a().a($$0)));
         }

         public jr<ecm> a() {
            return this.c;
         }
      }

      public static record b(ecm.b a) {
      }
   }

   interface x extends ecm {
      ecm j();

      @Override
      default double a(ecm.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, ecm.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(ecm.b var1, double var2);
   }

   interface y extends ecm {
      Logger a = LogUtils.getLogger();

      static ecn.y a(ecn.y.a $$0, ecm $$1, ecm $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == ecn.y.a.c || $$0 == ecn.y.a.d) {
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
         if ($$0 == ecn.y.a.b || $$0 == ecn.y.a.a) {
            if ($$1 instanceof ecn.h $$11) {
               return new ecn.n($$0 == ecn.y.a.a ? ecn.n.a.b : ecn.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof ecn.h $$12) {
               return new ecn.n($$0 == ecn.y.a.a ? ecn.n.a.b : ecn.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new ecn.a($$0, $$1, $$2, $$9, $$10);
      }

      ecn.y.a j();

      ecm k();

      ecm l();

      @Override
      default ays<? extends ecm> c() {
         return this.j().e;
      }

      public static enum a implements azv {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final ays<ecn.y> e = ecn.a((BiFunction<ecm, ecm, ecn.y>)(($$0x, $$1) -> ecn.y.a(this, $$0x, $$1)), ecn.y::k, ecn.y::l);
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

   protected static record z(ecm e, ecm.c f, ecn.z.a g) implements ecn.x {
      private static final MapCodec<ecn.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ecm.d.fieldOf("input").forGetter(ecn.z::j),
                  ecm.c.a.fieldOf("noise").forGetter(ecn.z::k),
                  ecn.z.a.c.fieldOf("rarity_value_mapper").forGetter(ecn.z::l)
               )
               .apply($$0, ecn.z::new)
      );
      public static final ays<ecn.z> a = ecn.a(h);

      @Override
      public double a(ecm.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public ecm a(ecm.f $$0) {
         return $$0.apply(new ecn.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public ays<? extends ecm> c() {
         return a;
      }

      @Override
      public ecm j() {
         return this.e;
      }

      public ecm.c k() {
         return this.f;
      }

      public ecn.z.a l() {
         return this.g;
      }

      public static enum a implements azv {
         a("type_1", eda.a::b, 2.0),
         b("type_2", eda.a::a, 3.0);

         public static final Codec<ecn.z.a> c = azv.a(ecn.z.a::values);
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
