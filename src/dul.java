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

public final class dul {
   private static final Codec<duk> c = kr.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<duk> b = Codec.either(d, c)
      .xmap($$0 -> (duk)$$0.map(dul::a, Function.identity()), $$0 -> $$0 instanceof dul.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends duk> a(iy<Codec<? extends duk>> $$0) {
      a($$0, "blend_alpha", dul.d.e);
      a($$0, "blend_offset", dul.f.e);
      a($$0, "beardifier", dul.b.e);
      a($$0, "old_blended_noise", ejs.a);

      for (dul.l.a $$1 : dul.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dul.o.e);
      a($$0, "end_islands", dul.i.a);
      a($$0, "weird_scaled_sampler", dul.z.a);
      a($$0, "shifted_noise", dul.v.a);
      a($$0, "range_choice", dul.q.e);
      a($$0, "shift_a", dul.s.e);
      a($$0, "shift_b", dul.t.e);
      a($$0, "shift", dul.r.e);
      a($$0, "blend_density", dul.e.e);
      a($$0, "clamp", dul.g.a);

      for (dul.k.a $$2 : dul.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dul.y.a $$3 : dul.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dul.w.a);
      a($$0, "constant", dul.h.e);
      return a($$0, "y_clamped_gradient", dul.aa.a);
   }

   private static Codec<? extends duk> a(iy<Codec<? extends duk>> $$0, String $$1, axe<? extends duk> $$2) {
      return iy.a($$0, $$1, $$2.a());
   }

   static <A, O> axe<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return axe.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> axe<O> a(Function<duk, O> $$0, Function<O, duk> $$1) {
      return a(duk.d, $$0, $$1);
   }

   static <O> axe<O> a(BiFunction<duk, duk, O> $$0, Function<O, duk> $$1, Function<O, duk> $$2) {
      return axe.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(duk.d.fieldOf("argument1").forGetter($$1), duk.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> axe<O> a(MapCodec<O> $$0) {
      return axe.a($$0);
   }

   private dul() {
   }

   public static duk a(duk $$0) {
      return new dul.l(dul.l.a.a, $$0);
   }

   public static duk b(duk $$0) {
      return new dul.l(dul.l.a.b, $$0);
   }

   public static duk c(duk $$0) {
      return new dul.l(dul.l.a.c, $$0);
   }

   public static duk d(duk $$0) {
      return new dul.l(dul.l.a.d, $$0);
   }

   public static duk e(duk $$0) {
      return new dul.l(dul.l.a.e, $$0);
   }

   public static duk a(il<ejv.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dul.o(new duk.c($$0), $$1, $$2), $$3, $$4);
   }

   public static duk a(il<ejv.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static duk a(il<ejv.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static duk a(duk $$0, duk $$1, double $$2, il<ejv.a> $$3) {
      return new dul.v($$0, a(), $$1, $$2, 0.0, new duk.c($$3));
   }

   public static duk a(il<ejv.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static duk b(il<ejv.a> $$0, double $$1, double $$2) {
      return new dul.o(new duk.c($$0), $$1, $$2);
   }

   public static duk a(il<ejv.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static duk a(duk $$0, double $$1, double $$2, duk $$3, duk $$4) {
      return new dul.q($$0, $$1, $$2, $$3, $$4);
   }

   public static duk b(il<ejv.a> $$0) {
      return new dul.s(new duk.c($$0));
   }

   public static duk c(il<ejv.a> $$0) {
      return new dul.t(new duk.c($$0));
   }

   public static duk d(il<ejv.a> $$0) {
      return new dul.r(new duk.c($$0));
   }

   public static duk f(duk $$0) {
      return new dul.e($$0);
   }

   public static duk a(long $$0) {
      return new dul.i($$0);
   }

   public static duk a(duk $$0, il<ejv.a> $$1, dul.z.a $$2) {
      return new dul.z($$0, new duk.c($$1), $$2);
   }

   public static duk a(duk $$0, duk $$1) {
      return dul.y.a(dul.y.a.a, $$0, $$1);
   }

   public static duk b(duk $$0, duk $$1) {
      return dul.y.a(dul.y.a.b, $$0, $$1);
   }

   public static duk c(duk $$0, duk $$1) {
      return dul.y.a(dul.y.a.c, $$0, $$1);
   }

   public static duk d(duk $$0, duk $$1) {
      return dul.y.a(dul.y.a.d, $$0, $$1);
   }

   public static duk a(awm<dul.w.b, dul.w.a> $$0) {
      return new dul.w($$0);
   }

   public static duk a() {
      return dul.h.f;
   }

   public static duk a(double $$0) {
      return new dul.h($$0);
   }

   public static duk a(int $$0, int $$1, double $$2, double $$3) {
      return new dul.aa($$0, $$1, $$2, $$3);
   }

   public static duk a(duk $$0, dul.k.a $$1) {
      return dul.k.a($$1, $$0);
   }

   private static duk a(duk $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static duk b() {
      return dul.d.a;
   }

   public static duk c() {
      return dul.f.a;
   }

   public static duk a(duk $$0, duk $$1, duk $$2) {
      if ($$1 instanceof dul.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         duk $$4 = d($$0);
         duk $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static duk a(duk $$0, double $$1, duk $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dul.y.a e, duk f, duk g, double h, double i) implements dul.y {
      @Override
      public double a(duk.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, duk.a $$1) {
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
      public duk a(duk.f $$0) {
         return $$0.apply(dul.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dul.y.a j() {
         return this.e;
      }

      @Override
      public duk k() {
         return this.f;
      }

      @Override
      public duk l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements duk.d {
      private static final MapCodec<dul.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dsr.e * 2, dsr.d * 2).fieldOf("from_y").forGetter(dul.aa::j),
                  Codec.intRange(dsr.e * 2, dsr.d * 2).fieldOf("to_y").forGetter(dul.aa::k),
                  dul.d.fieldOf("from_value").forGetter(dul.aa::l),
                  dul.d.fieldOf("to_value").forGetter(dul.aa::m)
               )
               .apply($$0, dul.aa::new)
      );
      public static final axe<dul.aa> a = dul.a(i);

      @Override
      public double a(duk.b $$0) {
         return axk.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public axe<? extends duk> c() {
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

   protected static enum b implements dul.c {
      a;

      @Override
      public double a(duk.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, duk.a $$1) {
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

   public interface c extends duk.d {
      axe<duk> e = axe.a(MapCodec.unit(dul.b.a));

      @Override
      default axe<? extends duk> c() {
         return e;
      }
   }

   protected static enum d implements duk.d {
      a;

      public static final axe<duk> e = axe.a(MapCodec.unit(a));

      @Override
      public double a(duk.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, duk.a $$1) {
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
      public axe<? extends duk> c() {
         return e;
      }
   }

   static record e(duk a) implements dul.x {
      static final axe<dul.e> e = dul.a(dul.e::new, dul.e::j);

      @Override
      public double a(duk.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public duk a(duk.f $$0) {
         return $$0.apply(new dul.e(this.a.a($$0)));
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
      public axe<? extends duk> c() {
         return e;
      }

      @Override
      public duk j() {
         return this.a;
      }
   }

   protected static enum f implements duk.d {
      a;

      public static final axe<duk> e = axe.a(MapCodec.unit(a));

      @Override
      public double a(duk.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, duk.a $$1) {
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
      public axe<? extends duk> c() {
         return e;
      }
   }

   protected static record g(duk e, double f, double g) implements dul.p {
      private static final MapCodec<dul.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(duk.b.fieldOf("input").forGetter(dul.g::aB_), dul.d.fieldOf("min").forGetter(dul.g::a), dul.d.fieldOf("max").forGetter(dul.g::b))
               .apply($$0, dul.g::new)
      );
      public static final axe<dul.g> a = dul.a(h);

      @Override
      public double a(double $$0) {
         return axk.a($$0, this.f, this.g);
      }

      @Override
      public duk a(duk.f $$0) {
         return new dul.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public axe<? extends duk> c() {
         return a;
      }

      @Override
      public duk aB_() {
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

   static record h(double a) implements duk.d {
      static final axe<dul.h> e = dul.a(dul.d, dul.h::new, dul.h::j);
      static final dul.h f = new dul.h(0.0);

      @Override
      public void a(double[] $$0, duk.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public axe<? extends duk> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements duk.d {
      public static final axe<dul.i> a = axe.a(MapCodec.unit(new dul.i(0L)));
      private static final float e = -0.9F;
      private final ejy f;

      public i(long $$0) {
         axr $$1 = new dus($$0);
         $$1.b(17292);
         this.f = new ejy($$1);
      }

      private static float a(ejy $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - axk.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = axk.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (axk.e((float)$$10) * 3439.0F + axk.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - axk.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = axk.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(duk.b $$0) {
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
      public axe<? extends duk> c() {
         return a;
      }
   }

   @ayn
   public static record j(il<duk> a) implements duk {
      @Override
      public double a(duk.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, duk.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public duk a(duk.f $$0) {
         return $$0.apply(new dul.j(new il.a<>(this.a.a().a($$0))));
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
      public axe<? extends duk> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public il<duk> j() {
         return this.a;
      }
   }

   protected static record k(dul.k.a a, duk e, double f, double g) implements dul.p {
      public static dul.k a(dul.k.a $$0, duk $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dul.k.a.a && $$0 != dul.k.a.b ? new dul.k($$0, $$1, $$3, $$4) : new dul.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dul.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = axk.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dul.k b(duk.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public axe<? extends duk> c() {
         return this.a.h;
      }

      public dul.k.a k() {
         return this.a;
      }

      @Override
      public duk aB_() {
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

      static enum a implements aye {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final axe<dul.k> h = dul.a($$0x -> dul.k.a(this, $$0x), dul.k::aB_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dul.l.a a, duk e) implements dul.m {
      @Override
      public double a(duk.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, duk.a $$1) {
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
      public dul.l.a j() {
         return this.a;
      }

      @Override
      public duk k() {
         return this.e;
      }

      static enum a implements aye {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final axe<dul.m> g = dul.a($$0x -> new dul.l(this, $$0x), dul.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends duk {
      dul.l.a j();

      duk k();

      @Override
      default axe<? extends duk> c() {
         return this.j().g;
      }

      @Override
      default duk a(duk.f $$0) {
         return $$0.apply(new dul.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dul.n.a e, duk f, double g, double h, double i) implements dul.p, dul.y {
      @Override
      public dul.y.a j() {
         return this.e == dul.n.a.a ? dul.y.a.b : dul.y.a.a;
      }

      @Override
      public duk k() {
         return dul.a(this.i);
      }

      @Override
      public duk l() {
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
      public duk a(duk.f $$0) {
         duk $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dul.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dul.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dul.n.a m() {
         return this.e;
      }

      @Override
      public duk aB_() {
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

   protected static record o(duk.c f, @Deprecated double g, double h) implements duk {
      public static final MapCodec<dul.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  duk.c.a.fieldOf("noise").forGetter(dul.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dul.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dul.o::l)
               )
               .apply($$0, dul.o::new)
      );
      public static final axe<dul.o> e = dul.a(a);

      @Override
      public double a(duk.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, duk.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public duk a(duk.f $$0) {
         return $$0.apply(new dul.o($$0.a(this.f), this.g, this.h));
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
      public axe<? extends duk> c() {
         return e;
      }

      public duk.c j() {
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

   interface p extends duk {
      duk aB_();

      @Override
      default double a(duk.b $$0) {
         return this.a(this.aB_().a($$0));
      }

      @Override
      default void a(double[] $$0, duk.a $$1) {
         this.aB_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(duk f, double g, double h, duk i, duk j) implements duk {
      public static final MapCodec<dul.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  duk.d.fieldOf("input").forGetter(dul.q::j),
                  dul.d.fieldOf("min_inclusive").forGetter(dul.q::k),
                  dul.d.fieldOf("max_exclusive").forGetter(dul.q::l),
                  duk.d.fieldOf("when_in_range").forGetter(dul.q::m),
                  duk.d.fieldOf("when_out_of_range").forGetter(dul.q::n)
               )
               .apply($$0, dul.q::new)
      );
      public static final axe<dul.q> e = dul.a(a);

      @Override
      public double a(duk.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, duk.a $$1) {
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
      public duk a(duk.f $$0) {
         return $$0.apply(new dul.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public axe<? extends duk> c() {
         return e;
      }

      public duk j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public duk m() {
         return this.i;
      }

      public duk n() {
         return this.j;
      }
   }

   protected static record r(duk.c a) implements dul.u {
      static final axe<dul.r> e = dul.a(duk.c.a, dul.r::new, dul.r::j);

      @Override
      public double a(duk.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public duk a(duk.f $$0) {
         return $$0.apply(new dul.r($$0.a(this.a)));
      }

      @Override
      public axe<? extends duk> c() {
         return e;
      }

      @Override
      public duk.c j() {
         return this.a;
      }
   }

   protected static record s(duk.c a) implements dul.u {
      static final axe<dul.s> e = dul.a(duk.c.a, dul.s::new, dul.s::j);

      @Override
      public double a(duk.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public duk a(duk.f $$0) {
         return $$0.apply(new dul.s($$0.a(this.a)));
      }

      @Override
      public axe<? extends duk> c() {
         return e;
      }

      @Override
      public duk.c j() {
         return this.a;
      }
   }

   protected static record t(duk.c a) implements dul.u {
      static final axe<dul.t> e = dul.a(duk.c.a, dul.t::new, dul.t::j);

      @Override
      public double a(duk.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public duk a(duk.f $$0) {
         return $$0.apply(new dul.t($$0.a(this.a)));
      }

      @Override
      public axe<? extends duk> c() {
         return e;
      }

      @Override
      public duk.c j() {
         return this.a;
      }
   }

   interface u extends duk {
      duk.c j();

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
      default void a(double[] $$0, duk.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(duk e, duk f, duk g, double h, double i, duk.c j) implements duk {
      private static final MapCodec<dul.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  duk.d.fieldOf("shift_x").forGetter(dul.v::j),
                  duk.d.fieldOf("shift_y").forGetter(dul.v::k),
                  duk.d.fieldOf("shift_z").forGetter(dul.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dul.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dul.v::n),
                  duk.c.a.fieldOf("noise").forGetter(dul.v::o)
               )
               .apply($$0, dul.v::new)
      );
      public static final axe<dul.v> a = dul.a(k);

      @Override
      public double a(duk.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, duk.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public duk a(duk.f $$0) {
         return $$0.apply(new dul.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public axe<? extends duk> c() {
         return a;
      }

      public duk j() {
         return this.e;
      }

      public duk k() {
         return this.f;
      }

      public duk l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public duk.c o() {
         return this.j;
      }
   }

   public static record w(awm<dul.w.b, dul.w.a> e) implements duk {
      private static final Codec<awm<dul.w.b, dul.w.a>> f = awm.a(dul.w.a.b);
      private static final MapCodec<dul.w> g = f.fieldOf("spline").xmap(dul.w::new, dul.w::j);
      public static final axe<dul.w> a = dul.a(g);

      @Override
      public double a(duk.b $$0) {
         return (double)this.e.a(new dul.w.b($$0));
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
      public void a(double[] $$0, duk.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public duk a(duk.f $$0) {
         return $$0.apply(new dul.w(this.e.a((awm.d<dul.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public axe<? extends duk> c() {
         return a;
      }

      public awm<dul.w.b, dul.w.a> j() {
         return this.e;
      }

      public static record a(il<duk> c) implements ayk<dul.w.b> {
         public static final Codec<dul.w.a> b = duk.c.xmap(dul.w.a::new, dul.w.a::a);

         @Override
         public String toString() {
            Optional<ajs<duk>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               ajs<duk> $$1 = $$0.get();
               if ($$1 == duy.d) {
                  return "continents";
               }

               if ($$1 == duy.e) {
                  return "erosion";
               }

               if ($$1 == duy.f) {
                  return "weirdness";
               }

               if ($$1 == duy.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dul.w.b $$0) {
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

         public dul.w.a a(duk.f $$0) {
            return new dul.w.a(new il.a<>(this.c.a().a($$0)));
         }

         public il<duk> a() {
            return this.c;
         }
      }

      public static record b(duk.b a) {
      }
   }

   interface x extends duk {
      duk j();

      @Override
      default double a(duk.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, duk.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(duk.b var1, double var2);
   }

   interface y extends duk {
      Logger a = LogUtils.getLogger();

      static dul.y a(dul.y.a $$0, duk $$1, duk $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dul.y.a.c || $$0 == dul.y.a.d) {
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
         if ($$0 == dul.y.a.b || $$0 == dul.y.a.a) {
            if ($$1 instanceof dul.h $$11) {
               return new dul.n($$0 == dul.y.a.a ? dul.n.a.b : dul.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dul.h $$12) {
               return new dul.n($$0 == dul.y.a.a ? dul.n.a.b : dul.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dul.a($$0, $$1, $$2, $$9, $$10);
      }

      dul.y.a j();

      duk k();

      duk l();

      @Override
      default axe<? extends duk> c() {
         return this.j().e;
      }

      public static enum a implements aye {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final axe<dul.y> e = dul.a((BiFunction<duk, duk, dul.y>)(($$0x, $$1) -> dul.y.a(this, $$0x, $$1)), dul.y::k, dul.y::l);
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

   protected static record z(duk e, duk.c f, dul.z.a g) implements dul.x {
      private static final MapCodec<dul.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  duk.d.fieldOf("input").forGetter(dul.z::j),
                  duk.c.a.fieldOf("noise").forGetter(dul.z::k),
                  dul.z.a.c.fieldOf("rarity_value_mapper").forGetter(dul.z::l)
               )
               .apply($$0, dul.z::new)
      );
      public static final axe<dul.z> a = dul.a(h);

      @Override
      public double a(duk.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public duk a(duk.f $$0) {
         return $$0.apply(new dul.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public axe<? extends duk> c() {
         return a;
      }

      @Override
      public duk j() {
         return this.e;
      }

      public duk.c k() {
         return this.f;
      }

      public dul.z.a l() {
         return this.g;
      }

      public static enum a implements aye {
         a("type_1", duy.a::b, 2.0),
         b("type_2", duy.a::a, 3.0);

         public static final Codec<dul.z.a> c = aye.a(dul.z.a::values);
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
