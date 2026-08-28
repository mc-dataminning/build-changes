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

public final class efh {
   private static final Codec<efg> c = mf.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<efg> b = Codec.either(d, c)
      .xmap($$0 -> (efg)$$0.map(efh::a, Function.identity()), $$0 -> $$0 instanceof efh.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends efg> a(jr<MapCodec<? extends efg>> $$0) {
      a($$0, "blend_alpha", efh.d.e);
      a($$0, "blend_offset", efh.f.e);
      a($$0, "beardifier", efh.b.e);
      a($$0, "old_blended_noise", euv.a);

      for (efh.l.a $$1 : efh.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", efh.o.e);
      a($$0, "end_islands", efh.i.a);
      a($$0, "weird_scaled_sampler", efh.z.a);
      a($$0, "shifted_noise", efh.v.a);
      a($$0, "range_choice", efh.q.e);
      a($$0, "shift_a", efh.s.e);
      a($$0, "shift_b", efh.t.e);
      a($$0, "shift", efh.r.e);
      a($$0, "blend_density", efh.e.e);
      a($$0, "clamp", efh.g.a);

      for (efh.k.a $$2 : efh.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (efh.y.a $$3 : efh.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", efh.w.a);
      a($$0, "constant", efh.h.e);
      return a($$0, "y_clamped_gradient", efh.aa.a);
   }

   private static MapCodec<? extends efg> a(jr<MapCodec<? extends efg>> $$0, String $$1, azd<? extends efg> $$2) {
      return jr.a($$0, $$1, $$2.a());
   }

   static <A, O> azd<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return azd.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> azd<O> a(Function<efg, O> $$0, Function<O, efg> $$1) {
      return a(efg.d, $$0, $$1);
   }

   static <O> azd<O> a(BiFunction<efg, efg, O> $$0, Function<O, efg> $$1, Function<O, efg> $$2) {
      return azd.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(efg.d.fieldOf("argument1").forGetter($$1), efg.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> azd<O> a(MapCodec<O> $$0) {
      return azd.a($$0);
   }

   private efh() {
   }

   public static efg a(efg $$0) {
      return new efh.l(efh.l.a.a, $$0);
   }

   public static efg b(efg $$0) {
      return new efh.l(efh.l.a.b, $$0);
   }

   public static efg c(efg $$0) {
      return new efh.l(efh.l.a.c, $$0);
   }

   public static efg d(efg $$0) {
      return new efh.l(efh.l.a.d, $$0);
   }

   public static efg e(efg $$0) {
      return new efh.l(efh.l.a.e, $$0);
   }

   public static efg a(je<euy.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new efh.o(new efg.c($$0), $$1, $$2), $$3, $$4);
   }

   public static efg a(je<euy.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static efg a(je<euy.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static efg a(efg $$0, efg $$1, double $$2, je<euy.a> $$3) {
      return new efh.v($$0, a(), $$1, $$2, 0.0, new efg.c($$3));
   }

   public static efg a(je<euy.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static efg b(je<euy.a> $$0, double $$1, double $$2) {
      return new efh.o(new efg.c($$0), $$1, $$2);
   }

   public static efg a(je<euy.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static efg a(efg $$0, double $$1, double $$2, efg $$3, efg $$4) {
      return new efh.q($$0, $$1, $$2, $$3, $$4);
   }

   public static efg b(je<euy.a> $$0) {
      return new efh.s(new efg.c($$0));
   }

   public static efg c(je<euy.a> $$0) {
      return new efh.t(new efg.c($$0));
   }

   public static efg d(je<euy.a> $$0) {
      return new efh.r(new efg.c($$0));
   }

   public static efg f(efg $$0) {
      return new efh.e($$0);
   }

   public static efg a(long $$0) {
      return new efh.i($$0);
   }

   public static efg a(efg $$0, je<euy.a> $$1, efh.z.a $$2) {
      return new efh.z($$0, new efg.c($$1), $$2);
   }

   public static efg a(efg $$0, efg $$1) {
      return efh.y.a(efh.y.a.a, $$0, $$1);
   }

   public static efg b(efg $$0, efg $$1) {
      return efh.y.a(efh.y.a.b, $$0, $$1);
   }

   public static efg c(efg $$0, efg $$1) {
      return efh.y.a(efh.y.a.c, $$0, $$1);
   }

   public static efg d(efg $$0, efg $$1) {
      return efh.y.a(efh.y.a.d, $$0, $$1);
   }

   public static efg a(ayl<efh.w.b, efh.w.a> $$0) {
      return new efh.w($$0);
   }

   public static efg a() {
      return efh.h.f;
   }

   public static efg a(double $$0) {
      return new efh.h($$0);
   }

   public static efg a(int $$0, int $$1, double $$2, double $$3) {
      return new efh.aa($$0, $$1, $$2, $$3);
   }

   public static efg a(efg $$0, efh.k.a $$1) {
      return efh.k.a($$1, $$0);
   }

   private static efg a(efg $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static efg b() {
      return efh.d.a;
   }

   public static efg c() {
      return efh.f.a;
   }

   public static efg a(efg $$0, efg $$1, efg $$2) {
      if ($$1 instanceof efh.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         efg $$4 = d($$0);
         efg $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static efg a(efg $$0, double $$1, efg $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(efh.y.a e, efg f, efg g, double h, double i) implements efh.y {
      @Override
      public double a(efg.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, efg.a $$1) {
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
      public efg a(efg.f $$0) {
         return $$0.apply(efh.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public efh.y.a j() {
         return this.e;
      }

      @Override
      public efg k() {
         return this.f;
      }

      @Override
      public efg l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements efg.d {
      private static final MapCodec<efh.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(edl.e * 2, edl.d * 2).fieldOf("from_y").forGetter(efh.aa::j),
                  Codec.intRange(edl.e * 2, edl.d * 2).fieldOf("to_y").forGetter(efh.aa::k),
                  efh.d.fieldOf("from_value").forGetter(efh.aa::l),
                  efh.d.fieldOf("to_value").forGetter(efh.aa::m)
               )
               .apply($$0, efh.aa::new)
      );
      public static final azd<efh.aa> a = efh.a(i);

      @Override
      public double a(efg.b $$0) {
         return azk.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public azd<? extends efg> c() {
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

   protected static enum b implements efh.c {
      a;

      @Override
      public double a(efg.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, efg.a $$1) {
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

   public interface c extends efg.d {
      azd<efg> e = azd.a(MapCodec.unit(efh.b.a));

      @Override
      default azd<? extends efg> c() {
         return e;
      }
   }

   protected static enum d implements efg.d {
      a;

      public static final azd<efg> e = azd.a(MapCodec.unit(a));

      @Override
      public double a(efg.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, efg.a $$1) {
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
      public azd<? extends efg> c() {
         return e;
      }
   }

   static record e(efg a) implements efh.x {
      static final azd<efh.e> e = efh.a(efh.e::new, efh.e::j);

      @Override
      public double a(efg.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public efg a(efg.f $$0) {
         return $$0.apply(new efh.e(this.a.a($$0)));
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
      public azd<? extends efg> c() {
         return e;
      }

      @Override
      public efg j() {
         return this.a;
      }
   }

   protected static enum f implements efg.d {
      a;

      public static final azd<efg> e = azd.a(MapCodec.unit(a));

      @Override
      public double a(efg.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, efg.a $$1) {
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
      public azd<? extends efg> c() {
         return e;
      }
   }

   protected static record g(efg e, double f, double g) implements efh.p {
      private static final MapCodec<efh.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(efg.b.fieldOf("input").forGetter(efh.g::az_), efh.d.fieldOf("min").forGetter(efh.g::a), efh.d.fieldOf("max").forGetter(efh.g::b))
               .apply($$0, efh.g::new)
      );
      public static final azd<efh.g> a = efh.a(h);

      @Override
      public double a(double $$0) {
         return azk.a($$0, this.f, this.g);
      }

      @Override
      public efg a(efg.f $$0) {
         return new efh.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public azd<? extends efg> c() {
         return a;
      }

      @Override
      public efg az_() {
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

   static record h(double a) implements efg.d {
      static final azd<efh.h> e = efh.a(efh.d, efh.h::new, efh.h::j);
      static final efh.h f = new efh.h(0.0);

      @Override
      public void a(double[] $$0, efg.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public azd<? extends efg> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements efg.d {
      public static final azd<efh.i> a = azd.a(MapCodec.unit(new efh.i(0L)));
      private static final float e = -0.9F;
      private final evb f;

      public i(long $$0) {
         azt $$1 = new efo($$0);
         $$1.b(17292);
         this.f = new evb($$1);
      }

      private static float a(evb $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - azk.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = azk.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (azk.e((float)$$10) * 3439.0F + azk.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - azk.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = azk.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(efg.b $$0) {
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
      public azd<? extends efg> c() {
         return a;
      }
   }

   @bat
   public static record j(je<efg> a) implements efg {
      @Override
      public double a(efg.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, efg.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public efg a(efg.f $$0) {
         return $$0.apply(new efh.j(new je.a<>(this.a.a().a($$0))));
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
      public azd<? extends efg> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public je<efg> j() {
         return this.a;
      }
   }

   protected static record k(efh.k.a a, efg e, double f, double g) implements efh.p {
      public static efh.k a(efh.k.a $$0, efg $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != efh.k.a.a && $$0 != efh.k.a.b ? new efh.k($$0, $$1, $$3, $$4) : new efh.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(efh.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = azk.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public efh.k b(efg.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public azd<? extends efg> c() {
         return this.a.h;
      }

      public efh.k.a k() {
         return this.a;
      }

      @Override
      public efg az_() {
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

      static enum a implements bai {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final azd<efh.k> h = efh.a($$0x -> efh.k.a(this, $$0x), efh.k::az_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(efh.l.a a, efg e) implements efh.m {
      @Override
      public double a(efg.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, efg.a $$1) {
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
      public efh.l.a j() {
         return this.a;
      }

      @Override
      public efg k() {
         return this.e;
      }

      static enum a implements bai {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final azd<efh.m> g = efh.a($$0x -> new efh.l(this, $$0x), efh.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends efg {
      efh.l.a j();

      efg k();

      @Override
      default azd<? extends efg> c() {
         return this.j().g;
      }

      @Override
      default efg a(efg.f $$0) {
         return $$0.apply(new efh.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(efh.n.a e, efg f, double g, double h, double i) implements efh.p, efh.y {
      @Override
      public efh.y.a j() {
         return this.e == efh.n.a.a ? efh.y.a.b : efh.y.a.a;
      }

      @Override
      public efg k() {
         return efh.a(this.i);
      }

      @Override
      public efg l() {
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
      public efg a(efg.f $$0) {
         efg $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == efh.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new efh.n(this.e, $$1, $$4, $$5, this.i);
      }

      public efh.n.a m() {
         return this.e;
      }

      @Override
      public efg az_() {
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

   protected static record o(efg.c f, @Deprecated double g, double h) implements efg {
      public static final MapCodec<efh.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  efg.c.a.fieldOf("noise").forGetter(efh.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(efh.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(efh.o::l)
               )
               .apply($$0, efh.o::new)
      );
      public static final azd<efh.o> e = efh.a(a);

      @Override
      public double a(efg.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, efg.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public efg a(efg.f $$0) {
         return $$0.apply(new efh.o($$0.a(this.f), this.g, this.h));
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
      public azd<? extends efg> c() {
         return e;
      }

      public efg.c j() {
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

   interface p extends efg {
      efg az_();

      @Override
      default double a(efg.b $$0) {
         return this.a(this.az_().a($$0));
      }

      @Override
      default void a(double[] $$0, efg.a $$1) {
         this.az_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(efg f, double g, double h, efg i, efg j) implements efg {
      public static final MapCodec<efh.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  efg.d.fieldOf("input").forGetter(efh.q::j),
                  efh.d.fieldOf("min_inclusive").forGetter(efh.q::k),
                  efh.d.fieldOf("max_exclusive").forGetter(efh.q::l),
                  efg.d.fieldOf("when_in_range").forGetter(efh.q::m),
                  efg.d.fieldOf("when_out_of_range").forGetter(efh.q::n)
               )
               .apply($$0, efh.q::new)
      );
      public static final azd<efh.q> e = efh.a(a);

      @Override
      public double a(efg.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, efg.a $$1) {
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
      public efg a(efg.f $$0) {
         return $$0.apply(new efh.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public azd<? extends efg> c() {
         return e;
      }

      public efg j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public efg m() {
         return this.i;
      }

      public efg n() {
         return this.j;
      }
   }

   protected static record r(efg.c a) implements efh.u {
      static final azd<efh.r> e = efh.a(efg.c.a, efh.r::new, efh.r::j);

      @Override
      public double a(efg.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public efg a(efg.f $$0) {
         return $$0.apply(new efh.r($$0.a(this.a)));
      }

      @Override
      public azd<? extends efg> c() {
         return e;
      }

      @Override
      public efg.c j() {
         return this.a;
      }
   }

   protected static record s(efg.c a) implements efh.u {
      static final azd<efh.s> e = efh.a(efg.c.a, efh.s::new, efh.s::j);

      @Override
      public double a(efg.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public efg a(efg.f $$0) {
         return $$0.apply(new efh.s($$0.a(this.a)));
      }

      @Override
      public azd<? extends efg> c() {
         return e;
      }

      @Override
      public efg.c j() {
         return this.a;
      }
   }

   protected static record t(efg.c a) implements efh.u {
      static final azd<efh.t> e = efh.a(efg.c.a, efh.t::new, efh.t::j);

      @Override
      public double a(efg.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public efg a(efg.f $$0) {
         return $$0.apply(new efh.t($$0.a(this.a)));
      }

      @Override
      public azd<? extends efg> c() {
         return e;
      }

      @Override
      public efg.c j() {
         return this.a;
      }
   }

   interface u extends efg {
      efg.c j();

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
      default void a(double[] $$0, efg.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(efg e, efg f, efg g, double h, double i, efg.c j) implements efg {
      private static final MapCodec<efh.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  efg.d.fieldOf("shift_x").forGetter(efh.v::j),
                  efg.d.fieldOf("shift_y").forGetter(efh.v::k),
                  efg.d.fieldOf("shift_z").forGetter(efh.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(efh.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(efh.v::n),
                  efg.c.a.fieldOf("noise").forGetter(efh.v::o)
               )
               .apply($$0, efh.v::new)
      );
      public static final azd<efh.v> a = efh.a(k);

      @Override
      public double a(efg.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, efg.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public efg a(efg.f $$0) {
         return $$0.apply(new efh.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public azd<? extends efg> c() {
         return a;
      }

      public efg j() {
         return this.e;
      }

      public efg k() {
         return this.f;
      }

      public efg l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public efg.c o() {
         return this.j;
      }
   }

   public static record w(ayl<efh.w.b, efh.w.a> e) implements efg {
      private static final Codec<ayl<efh.w.b, efh.w.a>> f = ayl.a(efh.w.a.b);
      private static final MapCodec<efh.w> g = f.fieldOf("spline").xmap(efh.w::new, efh.w::j);
      public static final azd<efh.w> a = efh.a(g);

      @Override
      public double a(efg.b $$0) {
         return (double)this.e.a(new efh.w.b($$0));
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
      public void a(double[] $$0, efg.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public efg a(efg.f $$0) {
         return $$0.apply(new efh.w(this.e.a((ayl.d<efh.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public azd<? extends efg> c() {
         return a;
      }

      public ayl<efh.w.b, efh.w.a> j() {
         return this.e;
      }

      public static record a(je<efg> c) implements bap<efh.w.b> {
         public static final Codec<efh.w.a> b = efg.c.xmap(efh.w.a::new, efh.w.a::a);

         @Override
         public String toString() {
            Optional<ald<efg>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               ald<efg> $$1 = $$0.get();
               if ($$1 == efu.d) {
                  return "continents";
               }

               if ($$1 == efu.e) {
                  return "erosion";
               }

               if ($$1 == efu.f) {
                  return "weirdness";
               }

               if ($$1 == efu.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(efh.w.b $$0) {
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

         public efh.w.a a(efg.f $$0) {
            return new efh.w.a(new je.a<>(this.c.a().a($$0)));
         }

         public je<efg> a() {
            return this.c;
         }
      }

      public static record b(efg.b a) {
      }
   }

   interface x extends efg {
      efg j();

      @Override
      default double a(efg.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, efg.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(efg.b var1, double var2);
   }

   interface y extends efg {
      Logger a = LogUtils.getLogger();

      static efh.y a(efh.y.a $$0, efg $$1, efg $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == efh.y.a.c || $$0 == efh.y.a.d) {
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
         if ($$0 == efh.y.a.b || $$0 == efh.y.a.a) {
            if ($$1 instanceof efh.h $$11) {
               return new efh.n($$0 == efh.y.a.a ? efh.n.a.b : efh.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof efh.h $$12) {
               return new efh.n($$0 == efh.y.a.a ? efh.n.a.b : efh.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new efh.a($$0, $$1, $$2, $$9, $$10);
      }

      efh.y.a j();

      efg k();

      efg l();

      @Override
      default azd<? extends efg> c() {
         return this.j().e;
      }

      public static enum a implements bai {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final azd<efh.y> e = efh.a((BiFunction<efg, efg, efh.y>)(($$0x, $$1) -> efh.y.a(this, $$0x, $$1)), efh.y::k, efh.y::l);
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

   protected static record z(efg e, efg.c f, efh.z.a g) implements efh.x {
      private static final MapCodec<efh.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  efg.d.fieldOf("input").forGetter(efh.z::j),
                  efg.c.a.fieldOf("noise").forGetter(efh.z::k),
                  efh.z.a.c.fieldOf("rarity_value_mapper").forGetter(efh.z::l)
               )
               .apply($$0, efh.z::new)
      );
      public static final azd<efh.z> a = efh.a(h);

      @Override
      public double a(efg.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public efg a(efg.f $$0) {
         return $$0.apply(new efh.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public azd<? extends efg> c() {
         return a;
      }

      @Override
      public efg j() {
         return this.e;
      }

      public efg.c k() {
         return this.f;
      }

      public efh.z.a l() {
         return this.g;
      }

      public static enum a implements bai {
         a("type_1", efu.a::b, 2.0),
         b("type_2", efu.a::a, 3.0);

         public static final Codec<efh.z.a> c = bai.a(efh.z.a::values);
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
