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

public final class dzq {
   private static final Codec<dzp> c = lu.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dzp> b = Codec.either(d, c)
      .xmap($$0 -> (dzp)$$0.map(dzq::a, Function.identity()), $$0 -> $$0 instanceof dzq.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends dzp> a(ka<MapCodec<? extends dzp>> $$0) {
      a($$0, "blend_alpha", dzq.d.e);
      a($$0, "blend_offset", dzq.f.e);
      a($$0, "beardifier", dzq.b.e);
      a($$0, "old_blended_noise", epb.a);

      for (dzq.l.a $$1 : dzq.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dzq.o.e);
      a($$0, "end_islands", dzq.i.a);
      a($$0, "weird_scaled_sampler", dzq.z.a);
      a($$0, "shifted_noise", dzq.v.a);
      a($$0, "range_choice", dzq.q.e);
      a($$0, "shift_a", dzq.s.e);
      a($$0, "shift_b", dzq.t.e);
      a($$0, "shift", dzq.r.e);
      a($$0, "blend_density", dzq.e.e);
      a($$0, "clamp", dzq.g.a);

      for (dzq.k.a $$2 : dzq.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dzq.y.a $$3 : dzq.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dzq.w.a);
      a($$0, "constant", dzq.h.e);
      return a($$0, "y_clamped_gradient", dzq.aa.a);
   }

   private static MapCodec<? extends dzp> a(ka<MapCodec<? extends dzp>> $$0, String $$1, ayv<? extends dzp> $$2) {
      return ka.a($$0, $$1, $$2.a());
   }

   static <A, O> ayv<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return ayv.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> ayv<O> a(Function<dzp, O> $$0, Function<O, dzp> $$1) {
      return a(dzp.d, $$0, $$1);
   }

   static <O> ayv<O> a(BiFunction<dzp, dzp, O> $$0, Function<O, dzp> $$1, Function<O, dzp> $$2) {
      return ayv.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dzp.d.fieldOf("argument1").forGetter($$1), dzp.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> ayv<O> a(MapCodec<O> $$0) {
      return ayv.a($$0);
   }

   private dzq() {
   }

   public static dzp a(dzp $$0) {
      return new dzq.l(dzq.l.a.a, $$0);
   }

   public static dzp b(dzp $$0) {
      return new dzq.l(dzq.l.a.b, $$0);
   }

   public static dzp c(dzp $$0) {
      return new dzq.l(dzq.l.a.c, $$0);
   }

   public static dzp d(dzp $$0) {
      return new dzq.l(dzq.l.a.d, $$0);
   }

   public static dzp e(dzp $$0) {
      return new dzq.l(dzq.l.a.e, $$0);
   }

   public static dzp a(jn<epe.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dzq.o(new dzp.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dzp a(jn<epe.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dzp a(jn<epe.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dzp a(dzp $$0, dzp $$1, double $$2, jn<epe.a> $$3) {
      return new dzq.v($$0, a(), $$1, $$2, 0.0, new dzp.c($$3));
   }

   public static dzp a(jn<epe.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dzp b(jn<epe.a> $$0, double $$1, double $$2) {
      return new dzq.o(new dzp.c($$0), $$1, $$2);
   }

   public static dzp a(jn<epe.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dzp a(dzp $$0, double $$1, double $$2, dzp $$3, dzp $$4) {
      return new dzq.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dzp b(jn<epe.a> $$0) {
      return new dzq.s(new dzp.c($$0));
   }

   public static dzp c(jn<epe.a> $$0) {
      return new dzq.t(new dzp.c($$0));
   }

   public static dzp d(jn<epe.a> $$0) {
      return new dzq.r(new dzp.c($$0));
   }

   public static dzp f(dzp $$0) {
      return new dzq.e($$0);
   }

   public static dzp a(long $$0) {
      return new dzq.i($$0);
   }

   public static dzp a(dzp $$0, jn<epe.a> $$1, dzq.z.a $$2) {
      return new dzq.z($$0, new dzp.c($$1), $$2);
   }

   public static dzp a(dzp $$0, dzp $$1) {
      return dzq.y.a(dzq.y.a.a, $$0, $$1);
   }

   public static dzp b(dzp $$0, dzp $$1) {
      return dzq.y.a(dzq.y.a.b, $$0, $$1);
   }

   public static dzp c(dzp $$0, dzp $$1) {
      return dzq.y.a(dzq.y.a.c, $$0, $$1);
   }

   public static dzp d(dzp $$0, dzp $$1) {
      return dzq.y.a(dzq.y.a.d, $$0, $$1);
   }

   public static dzp a(aye<dzq.w.b, dzq.w.a> $$0) {
      return new dzq.w($$0);
   }

   public static dzp a() {
      return dzq.h.f;
   }

   public static dzp a(double $$0) {
      return new dzq.h($$0);
   }

   public static dzp a(int $$0, int $$1, double $$2, double $$3) {
      return new dzq.aa($$0, $$1, $$2, $$3);
   }

   public static dzp a(dzp $$0, dzq.k.a $$1) {
      return dzq.k.a($$1, $$0);
   }

   private static dzp a(dzp $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dzp b() {
      return dzq.d.a;
   }

   public static dzp c() {
      return dzq.f.a;
   }

   public static dzp a(dzp $$0, dzp $$1, dzp $$2) {
      if ($$1 instanceof dzq.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dzp $$4 = d($$0);
         dzp $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dzp a(dzp $$0, double $$1, dzp $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dzq.y.a e, dzp f, dzp g, double h, double i) implements dzq.y {
      @Override
      public double a(dzp.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, dzp.a $$1) {
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
      public dzp a(dzp.f $$0) {
         return $$0.apply(dzq.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dzq.y.a j() {
         return this.e;
      }

      @Override
      public dzp k() {
         return this.f;
      }

      @Override
      public dzp l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dzp.d {
      private static final MapCodec<dzq.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dxw.e * 2, dxw.d * 2).fieldOf("from_y").forGetter(dzq.aa::j),
                  Codec.intRange(dxw.e * 2, dxw.d * 2).fieldOf("to_y").forGetter(dzq.aa::k),
                  dzq.d.fieldOf("from_value").forGetter(dzq.aa::l),
                  dzq.d.fieldOf("to_value").forGetter(dzq.aa::m)
               )
               .apply($$0, dzq.aa::new)
      );
      public static final ayv<dzq.aa> a = dzq.a(i);

      @Override
      public double a(dzp.b $$0) {
         return azc.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public ayv<? extends dzp> c() {
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

   protected static enum b implements dzq.c {
      a;

      @Override
      public double a(dzp.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dzp.a $$1) {
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

   public interface c extends dzp.d {
      ayv<dzp> e = ayv.a(MapCodec.unit(dzq.b.a));

      @Override
      default ayv<? extends dzp> c() {
         return e;
      }
   }

   protected static enum d implements dzp.d {
      a;

      public static final ayv<dzp> e = ayv.a(MapCodec.unit(a));

      @Override
      public double a(dzp.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dzp.a $$1) {
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
      public ayv<? extends dzp> c() {
         return e;
      }
   }

   static record e(dzp a) implements dzq.x {
      static final ayv<dzq.e> e = dzq.a(dzq.e::new, dzq.e::j);

      @Override
      public double a(dzp.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dzp a(dzp.f $$0) {
         return $$0.apply(new dzq.e(this.a.a($$0)));
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
      public ayv<? extends dzp> c() {
         return e;
      }

      @Override
      public dzp j() {
         return this.a;
      }
   }

   protected static enum f implements dzp.d {
      a;

      public static final ayv<dzp> e = ayv.a(MapCodec.unit(a));

      @Override
      public double a(dzp.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dzp.a $$1) {
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
      public ayv<? extends dzp> c() {
         return e;
      }
   }

   protected static record g(dzp e, double f, double g) implements dzq.p {
      private static final MapCodec<dzq.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dzp.b.fieldOf("input").forGetter(dzq.g::aG_), dzq.d.fieldOf("min").forGetter(dzq.g::a), dzq.d.fieldOf("max").forGetter(dzq.g::b))
               .apply($$0, dzq.g::new)
      );
      public static final ayv<dzq.g> a = dzq.a(h);

      @Override
      public double a(double $$0) {
         return azc.a($$0, this.f, this.g);
      }

      @Override
      public dzp a(dzp.f $$0) {
         return new dzq.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public ayv<? extends dzp> c() {
         return a;
      }

      @Override
      public dzp aG_() {
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

   static record h(double a) implements dzp.d {
      static final ayv<dzq.h> e = dzq.a(dzq.d, dzq.h::new, dzq.h::j);
      static final dzq.h f = new dzq.h(0.0);

      @Override
      public void a(double[] $$0, dzp.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public ayv<? extends dzp> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dzp.d {
      public static final ayv<dzq.i> a = ayv.a(MapCodec.unit(new dzq.i(0L)));
      private static final float e = -0.9F;
      private final eph f;

      public i(long $$0) {
         azk $$1 = new dzx($$0);
         $$1.b(17292);
         this.f = new eph($$1);
      }

      private static float a(eph $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - azc.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = azc.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (azc.e((float)$$10) * 3439.0F + azc.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - azc.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = azc.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dzp.b $$0) {
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
      public ayv<? extends dzp> c() {
         return a;
      }
   }

   @bai
   public static record j(jn<dzp> a) implements dzp {
      @Override
      public double a(dzp.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dzp.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dzp a(dzp.f $$0) {
         return $$0.apply(new dzq.j(new jn.a<>(this.a.a().a($$0))));
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
      public ayv<? extends dzp> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jn<dzp> j() {
         return this.a;
      }
   }

   protected static record k(dzq.k.a a, dzp e, double f, double g) implements dzq.p {
      public static dzq.k a(dzq.k.a $$0, dzp $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dzq.k.a.a && $$0 != dzq.k.a.b ? new dzq.k($$0, $$1, $$3, $$4) : new dzq.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dzq.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = azc.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dzq.k b(dzp.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public ayv<? extends dzp> c() {
         return this.a.h;
      }

      public dzq.k.a k() {
         return this.a;
      }

      @Override
      public dzp aG_() {
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

      static enum a implements azy {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final ayv<dzq.k> h = dzq.a($$0x -> dzq.k.a(this, $$0x), dzq.k::aG_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dzq.l.a a, dzp e) implements dzq.m {
      @Override
      public double a(dzp.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dzp.a $$1) {
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
      public dzq.l.a j() {
         return this.a;
      }

      @Override
      public dzp k() {
         return this.e;
      }

      static enum a implements azy {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final ayv<dzq.m> g = dzq.a($$0x -> new dzq.l(this, $$0x), dzq.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dzp {
      dzq.l.a j();

      dzp k();

      @Override
      default ayv<? extends dzp> c() {
         return this.j().g;
      }

      @Override
      default dzp a(dzp.f $$0) {
         return $$0.apply(new dzq.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dzq.n.a e, dzp f, double g, double h, double i) implements dzq.p, dzq.y {
      @Override
      public dzq.y.a j() {
         return this.e == dzq.n.a.a ? dzq.y.a.b : dzq.y.a.a;
      }

      @Override
      public dzp k() {
         return dzq.a(this.i);
      }

      @Override
      public dzp l() {
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
      public dzp a(dzp.f $$0) {
         dzp $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dzq.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dzq.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dzq.n.a m() {
         return this.e;
      }

      @Override
      public dzp aG_() {
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

   protected static record o(dzp.c f, @Deprecated double g, double h) implements dzp {
      public static final MapCodec<dzq.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dzp.c.a.fieldOf("noise").forGetter(dzq.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dzq.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dzq.o::l)
               )
               .apply($$0, dzq.o::new)
      );
      public static final ayv<dzq.o> e = dzq.a(a);

      @Override
      public double a(dzp.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dzp.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dzp a(dzp.f $$0) {
         return $$0.apply(new dzq.o($$0.a(this.f), this.g, this.h));
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
      public ayv<? extends dzp> c() {
         return e;
      }

      public dzp.c j() {
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

   interface p extends dzp {
      dzp aG_();

      @Override
      default double a(dzp.b $$0) {
         return this.a(this.aG_().a($$0));
      }

      @Override
      default void a(double[] $$0, dzp.a $$1) {
         this.aG_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dzp f, double g, double h, dzp i, dzp j) implements dzp {
      public static final MapCodec<dzq.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dzp.d.fieldOf("input").forGetter(dzq.q::j),
                  dzq.d.fieldOf("min_inclusive").forGetter(dzq.q::k),
                  dzq.d.fieldOf("max_exclusive").forGetter(dzq.q::l),
                  dzp.d.fieldOf("when_in_range").forGetter(dzq.q::m),
                  dzp.d.fieldOf("when_out_of_range").forGetter(dzq.q::n)
               )
               .apply($$0, dzq.q::new)
      );
      public static final ayv<dzq.q> e = dzq.a(a);

      @Override
      public double a(dzp.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dzp.a $$1) {
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
      public dzp a(dzp.f $$0) {
         return $$0.apply(new dzq.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public ayv<? extends dzp> c() {
         return e;
      }

      public dzp j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dzp m() {
         return this.i;
      }

      public dzp n() {
         return this.j;
      }
   }

   protected static record r(dzp.c a) implements dzq.u {
      static final ayv<dzq.r> e = dzq.a(dzp.c.a, dzq.r::new, dzq.r::j);

      @Override
      public double a(dzp.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dzp a(dzp.f $$0) {
         return $$0.apply(new dzq.r($$0.a(this.a)));
      }

      @Override
      public ayv<? extends dzp> c() {
         return e;
      }

      @Override
      public dzp.c j() {
         return this.a;
      }
   }

   protected static record s(dzp.c a) implements dzq.u {
      static final ayv<dzq.s> e = dzq.a(dzp.c.a, dzq.s::new, dzq.s::j);

      @Override
      public double a(dzp.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dzp a(dzp.f $$0) {
         return $$0.apply(new dzq.s($$0.a(this.a)));
      }

      @Override
      public ayv<? extends dzp> c() {
         return e;
      }

      @Override
      public dzp.c j() {
         return this.a;
      }
   }

   protected static record t(dzp.c a) implements dzq.u {
      static final ayv<dzq.t> e = dzq.a(dzp.c.a, dzq.t::new, dzq.t::j);

      @Override
      public double a(dzp.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dzp a(dzp.f $$0) {
         return $$0.apply(new dzq.t($$0.a(this.a)));
      }

      @Override
      public ayv<? extends dzp> c() {
         return e;
      }

      @Override
      public dzp.c j() {
         return this.a;
      }
   }

   interface u extends dzp {
      dzp.c j();

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
      default void a(double[] $$0, dzp.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dzp e, dzp f, dzp g, double h, double i, dzp.c j) implements dzp {
      private static final MapCodec<dzq.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dzp.d.fieldOf("shift_x").forGetter(dzq.v::j),
                  dzp.d.fieldOf("shift_y").forGetter(dzq.v::k),
                  dzp.d.fieldOf("shift_z").forGetter(dzq.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dzq.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dzq.v::n),
                  dzp.c.a.fieldOf("noise").forGetter(dzq.v::o)
               )
               .apply($$0, dzq.v::new)
      );
      public static final ayv<dzq.v> a = dzq.a(k);

      @Override
      public double a(dzp.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dzp.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dzp a(dzp.f $$0) {
         return $$0.apply(new dzq.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public ayv<? extends dzp> c() {
         return a;
      }

      public dzp j() {
         return this.e;
      }

      public dzp k() {
         return this.f;
      }

      public dzp l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dzp.c o() {
         return this.j;
      }
   }

   public static record w(aye<dzq.w.b, dzq.w.a> e) implements dzp {
      private static final Codec<aye<dzq.w.b, dzq.w.a>> f = aye.a(dzq.w.a.b);
      private static final MapCodec<dzq.w> g = f.fieldOf("spline").xmap(dzq.w::new, dzq.w::j);
      public static final ayv<dzq.w> a = dzq.a(g);

      @Override
      public double a(dzp.b $$0) {
         return (double)this.e.a(new dzq.w.b($$0));
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
      public void a(double[] $$0, dzp.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dzp a(dzp.f $$0) {
         return $$0.apply(new dzq.w(this.e.a((aye.d<dzq.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public ayv<? extends dzp> c() {
         return a;
      }

      public aye<dzq.w.b, dzq.w.a> j() {
         return this.e;
      }

      public static record a(jn<dzp> c) implements bae<dzq.w.b> {
         public static final Codec<dzq.w.a> b = dzp.c.xmap(dzq.w.a::new, dzq.w.a::a);

         @Override
         public String toString() {
            Optional<ala<dzp>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               ala<dzp> $$1 = $$0.get();
               if ($$1 == ead.d) {
                  return "continents";
               }

               if ($$1 == ead.e) {
                  return "erosion";
               }

               if ($$1 == ead.f) {
                  return "weirdness";
               }

               if ($$1 == ead.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dzq.w.b $$0) {
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

         public dzq.w.a a(dzp.f $$0) {
            return new dzq.w.a(new jn.a<>(this.c.a().a($$0)));
         }

         public jn<dzp> a() {
            return this.c;
         }
      }

      public static record b(dzp.b a) {
      }
   }

   interface x extends dzp {
      dzp j();

      @Override
      default double a(dzp.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dzp.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dzp.b var1, double var2);
   }

   interface y extends dzp {
      Logger a = LogUtils.getLogger();

      static dzq.y a(dzq.y.a $$0, dzp $$1, dzp $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dzq.y.a.c || $$0 == dzq.y.a.d) {
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
         if ($$0 == dzq.y.a.b || $$0 == dzq.y.a.a) {
            if ($$1 instanceof dzq.h $$11) {
               return new dzq.n($$0 == dzq.y.a.a ? dzq.n.a.b : dzq.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dzq.h $$12) {
               return new dzq.n($$0 == dzq.y.a.a ? dzq.n.a.b : dzq.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dzq.a($$0, $$1, $$2, $$9, $$10);
      }

      dzq.y.a j();

      dzp k();

      dzp l();

      @Override
      default ayv<? extends dzp> c() {
         return this.j().e;
      }

      public static enum a implements azy {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final ayv<dzq.y> e = dzq.a((BiFunction<dzp, dzp, dzq.y>)(($$0x, $$1) -> dzq.y.a(this, $$0x, $$1)), dzq.y::k, dzq.y::l);
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

   protected static record z(dzp e, dzp.c f, dzq.z.a g) implements dzq.x {
      private static final MapCodec<dzq.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dzp.d.fieldOf("input").forGetter(dzq.z::j),
                  dzp.c.a.fieldOf("noise").forGetter(dzq.z::k),
                  dzq.z.a.c.fieldOf("rarity_value_mapper").forGetter(dzq.z::l)
               )
               .apply($$0, dzq.z::new)
      );
      public static final ayv<dzq.z> a = dzq.a(h);

      @Override
      public double a(dzp.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dzp a(dzp.f $$0) {
         return $$0.apply(new dzq.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public ayv<? extends dzp> c() {
         return a;
      }

      @Override
      public dzp j() {
         return this.e;
      }

      public dzp.c k() {
         return this.f;
      }

      public dzq.z.a l() {
         return this.g;
      }

      public static enum a implements azy {
         a("type_1", ead.a::b, 2.0),
         b("type_2", ead.a::a, 3.0);

         public static final Codec<dzq.z.a> c = azy.a(dzq.z.a::values);
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
