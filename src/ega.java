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

public final class ega {
   private static final Codec<efz> c = mf.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<efz> b = Codec.either(d, c)
      .xmap($$0 -> (efz)$$0.map(ega::a, Function.identity()), $$0 -> $$0 instanceof ega.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends efz> a(jr<MapCodec<? extends efz>> $$0) {
      a($$0, "blend_alpha", ega.d.e);
      a($$0, "blend_offset", ega.f.e);
      a($$0, "beardifier", ega.b.e);
      a($$0, "old_blended_noise", evo.a);

      for (ega.l.a $$1 : ega.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", ega.o.e);
      a($$0, "end_islands", ega.i.a);
      a($$0, "weird_scaled_sampler", ega.z.a);
      a($$0, "shifted_noise", ega.v.a);
      a($$0, "range_choice", ega.q.e);
      a($$0, "shift_a", ega.s.e);
      a($$0, "shift_b", ega.t.e);
      a($$0, "shift", ega.r.e);
      a($$0, "blend_density", ega.e.e);
      a($$0, "clamp", ega.g.a);

      for (ega.k.a $$2 : ega.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (ega.y.a $$3 : ega.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", ega.w.a);
      a($$0, "constant", ega.h.e);
      return a($$0, "y_clamped_gradient", ega.aa.a);
   }

   private static MapCodec<? extends efz> a(jr<MapCodec<? extends efz>> $$0, String $$1, azf<? extends efz> $$2) {
      return jr.a($$0, $$1, $$2.a());
   }

   static <A, O> azf<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return azf.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> azf<O> a(Function<efz, O> $$0, Function<O, efz> $$1) {
      return a(efz.d, $$0, $$1);
   }

   static <O> azf<O> a(BiFunction<efz, efz, O> $$0, Function<O, efz> $$1, Function<O, efz> $$2) {
      return azf.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(efz.d.fieldOf("argument1").forGetter($$1), efz.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> azf<O> a(MapCodec<O> $$0) {
      return azf.a($$0);
   }

   private ega() {
   }

   public static efz a(efz $$0) {
      return new ega.l(ega.l.a.a, $$0);
   }

   public static efz b(efz $$0) {
      return new ega.l(ega.l.a.b, $$0);
   }

   public static efz c(efz $$0) {
      return new ega.l(ega.l.a.c, $$0);
   }

   public static efz d(efz $$0) {
      return new ega.l(ega.l.a.d, $$0);
   }

   public static efz e(efz $$0) {
      return new ega.l(ega.l.a.e, $$0);
   }

   public static efz a(je<evr.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new ega.o(new efz.c($$0), $$1, $$2), $$3, $$4);
   }

   public static efz a(je<evr.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static efz a(je<evr.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static efz a(efz $$0, efz $$1, double $$2, je<evr.a> $$3) {
      return new ega.v($$0, a(), $$1, $$2, 0.0, new efz.c($$3));
   }

   public static efz a(je<evr.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static efz b(je<evr.a> $$0, double $$1, double $$2) {
      return new ega.o(new efz.c($$0), $$1, $$2);
   }

   public static efz a(je<evr.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static efz a(efz $$0, double $$1, double $$2, efz $$3, efz $$4) {
      return new ega.q($$0, $$1, $$2, $$3, $$4);
   }

   public static efz b(je<evr.a> $$0) {
      return new ega.s(new efz.c($$0));
   }

   public static efz c(je<evr.a> $$0) {
      return new ega.t(new efz.c($$0));
   }

   public static efz d(je<evr.a> $$0) {
      return new ega.r(new efz.c($$0));
   }

   public static efz f(efz $$0) {
      return new ega.e($$0);
   }

   public static efz a(long $$0) {
      return new ega.i($$0);
   }

   public static efz a(efz $$0, je<evr.a> $$1, ega.z.a $$2) {
      return new ega.z($$0, new efz.c($$1), $$2);
   }

   public static efz a(efz $$0, efz $$1) {
      return ega.y.a(ega.y.a.a, $$0, $$1);
   }

   public static efz b(efz $$0, efz $$1) {
      return ega.y.a(ega.y.a.b, $$0, $$1);
   }

   public static efz c(efz $$0, efz $$1) {
      return ega.y.a(ega.y.a.c, $$0, $$1);
   }

   public static efz d(efz $$0, efz $$1) {
      return ega.y.a(ega.y.a.d, $$0, $$1);
   }

   public static efz a(ayn<ega.w.b, ega.w.a> $$0) {
      return new ega.w($$0);
   }

   public static efz a() {
      return ega.h.f;
   }

   public static efz a(double $$0) {
      return new ega.h($$0);
   }

   public static efz a(int $$0, int $$1, double $$2, double $$3) {
      return new ega.aa($$0, $$1, $$2, $$3);
   }

   public static efz a(efz $$0, ega.k.a $$1) {
      return ega.k.a($$1, $$0);
   }

   private static efz a(efz $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static efz b() {
      return ega.d.a;
   }

   public static efz c() {
      return ega.f.a;
   }

   public static efz a(efz $$0, efz $$1, efz $$2) {
      if ($$1 instanceof ega.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         efz $$4 = d($$0);
         efz $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static efz a(efz $$0, double $$1, efz $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(ega.y.a e, efz f, efz g, double h, double i) implements ega.y {
      @Override
      public double a(efz.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, efz.a $$1) {
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
      public efz a(efz.f $$0) {
         return $$0.apply(ega.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public ega.y.a j() {
         return this.e;
      }

      @Override
      public efz k() {
         return this.f;
      }

      @Override
      public efz l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements efz.d {
      private static final MapCodec<ega.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(eee.e * 2, eee.d * 2).fieldOf("from_y").forGetter(ega.aa::j),
                  Codec.intRange(eee.e * 2, eee.d * 2).fieldOf("to_y").forGetter(ega.aa::k),
                  ega.d.fieldOf("from_value").forGetter(ega.aa::l),
                  ega.d.fieldOf("to_value").forGetter(ega.aa::m)
               )
               .apply($$0, ega.aa::new)
      );
      public static final azf<ega.aa> a = ega.a(i);

      @Override
      public double a(efz.b $$0) {
         return azm.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public azf<? extends efz> c() {
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

   protected static enum b implements ega.c {
      a;

      @Override
      public double a(efz.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, efz.a $$1) {
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

   public interface c extends efz.d {
      azf<efz> e = azf.a(MapCodec.unit(ega.b.a));

      @Override
      default azf<? extends efz> c() {
         return e;
      }
   }

   protected static enum d implements efz.d {
      a;

      public static final azf<efz> e = azf.a(MapCodec.unit(a));

      @Override
      public double a(efz.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, efz.a $$1) {
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
      public azf<? extends efz> c() {
         return e;
      }
   }

   static record e(efz a) implements ega.x {
      static final azf<ega.e> e = ega.a(ega.e::new, ega.e::j);

      @Override
      public double a(efz.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public efz a(efz.f $$0) {
         return $$0.apply(new ega.e(this.a.a($$0)));
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
      public azf<? extends efz> c() {
         return e;
      }

      @Override
      public efz j() {
         return this.a;
      }
   }

   protected static enum f implements efz.d {
      a;

      public static final azf<efz> e = azf.a(MapCodec.unit(a));

      @Override
      public double a(efz.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, efz.a $$1) {
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
      public azf<? extends efz> c() {
         return e;
      }
   }

   protected static record g(efz e, double f, double g) implements ega.p {
      private static final MapCodec<ega.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(efz.b.fieldOf("input").forGetter(ega.g::aA_), ega.d.fieldOf("min").forGetter(ega.g::a), ega.d.fieldOf("max").forGetter(ega.g::b))
               .apply($$0, ega.g::new)
      );
      public static final azf<ega.g> a = ega.a(h);

      @Override
      public double a(double $$0) {
         return azm.a($$0, this.f, this.g);
      }

      @Override
      public efz a(efz.f $$0) {
         return new ega.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public azf<? extends efz> c() {
         return a;
      }

      @Override
      public efz aA_() {
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

   static record h(double a) implements efz.d {
      static final azf<ega.h> e = ega.a(ega.d, ega.h::new, ega.h::j);
      static final ega.h f = new ega.h(0.0);

      @Override
      public void a(double[] $$0, efz.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public azf<? extends efz> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements efz.d {
      public static final azf<ega.i> a = azf.a(MapCodec.unit(new ega.i(0L)));
      private static final float e = -0.9F;
      private final evu f;

      public i(long $$0) {
         azv $$1 = new egh($$0);
         $$1.b(17292);
         this.f = new evu($$1);
      }

      private static float a(evu $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - azm.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = azm.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (azm.e((float)$$10) * 3439.0F + azm.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - azm.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = azm.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(efz.b $$0) {
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
      public azf<? extends efz> c() {
         return a;
      }
   }

   @bav
   public static record j(je<efz> a) implements efz {
      @Override
      public double a(efz.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, efz.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public efz a(efz.f $$0) {
         return $$0.apply(new ega.j(new je.a<>(this.a.a().a($$0))));
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
      public azf<? extends efz> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public je<efz> j() {
         return this.a;
      }
   }

   protected static record k(ega.k.a a, efz e, double f, double g) implements ega.p {
      public static ega.k a(ega.k.a $$0, efz $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != ega.k.a.a && $$0 != ega.k.a.b ? new ega.k($$0, $$1, $$3, $$4) : new ega.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(ega.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = azm.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public ega.k b(efz.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public azf<? extends efz> c() {
         return this.a.h;
      }

      public ega.k.a k() {
         return this.a;
      }

      @Override
      public efz aA_() {
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

      static enum a implements bak {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final azf<ega.k> h = ega.a($$0x -> ega.k.a(this, $$0x), ega.k::aA_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(ega.l.a a, efz e) implements ega.m {
      @Override
      public double a(efz.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, efz.a $$1) {
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
      public ega.l.a j() {
         return this.a;
      }

      @Override
      public efz k() {
         return this.e;
      }

      static enum a implements bak {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final azf<ega.m> g = ega.a($$0x -> new ega.l(this, $$0x), ega.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends efz {
      ega.l.a j();

      efz k();

      @Override
      default azf<? extends efz> c() {
         return this.j().g;
      }

      @Override
      default efz a(efz.f $$0) {
         return $$0.apply(new ega.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(ega.n.a e, efz f, double g, double h, double i) implements ega.p, ega.y {
      @Override
      public ega.y.a j() {
         return this.e == ega.n.a.a ? ega.y.a.b : ega.y.a.a;
      }

      @Override
      public efz k() {
         return ega.a(this.i);
      }

      @Override
      public efz l() {
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
      public efz a(efz.f $$0) {
         efz $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == ega.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new ega.n(this.e, $$1, $$4, $$5, this.i);
      }

      public ega.n.a m() {
         return this.e;
      }

      @Override
      public efz aA_() {
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

   protected static record o(efz.c f, @Deprecated double g, double h) implements efz {
      public static final MapCodec<ega.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  efz.c.a.fieldOf("noise").forGetter(ega.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(ega.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(ega.o::l)
               )
               .apply($$0, ega.o::new)
      );
      public static final azf<ega.o> e = ega.a(a);

      @Override
      public double a(efz.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, efz.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public efz a(efz.f $$0) {
         return $$0.apply(new ega.o($$0.a(this.f), this.g, this.h));
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
      public azf<? extends efz> c() {
         return e;
      }

      public efz.c j() {
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

   interface p extends efz {
      efz aA_();

      @Override
      default double a(efz.b $$0) {
         return this.a(this.aA_().a($$0));
      }

      @Override
      default void a(double[] $$0, efz.a $$1) {
         this.aA_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(efz f, double g, double h, efz i, efz j) implements efz {
      public static final MapCodec<ega.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  efz.d.fieldOf("input").forGetter(ega.q::j),
                  ega.d.fieldOf("min_inclusive").forGetter(ega.q::k),
                  ega.d.fieldOf("max_exclusive").forGetter(ega.q::l),
                  efz.d.fieldOf("when_in_range").forGetter(ega.q::m),
                  efz.d.fieldOf("when_out_of_range").forGetter(ega.q::n)
               )
               .apply($$0, ega.q::new)
      );
      public static final azf<ega.q> e = ega.a(a);

      @Override
      public double a(efz.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, efz.a $$1) {
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
      public efz a(efz.f $$0) {
         return $$0.apply(new ega.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public azf<? extends efz> c() {
         return e;
      }

      public efz j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public efz m() {
         return this.i;
      }

      public efz n() {
         return this.j;
      }
   }

   protected static record r(efz.c a) implements ega.u {
      static final azf<ega.r> e = ega.a(efz.c.a, ega.r::new, ega.r::j);

      @Override
      public double a(efz.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public efz a(efz.f $$0) {
         return $$0.apply(new ega.r($$0.a(this.a)));
      }

      @Override
      public azf<? extends efz> c() {
         return e;
      }

      @Override
      public efz.c j() {
         return this.a;
      }
   }

   protected static record s(efz.c a) implements ega.u {
      static final azf<ega.s> e = ega.a(efz.c.a, ega.s::new, ega.s::j);

      @Override
      public double a(efz.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public efz a(efz.f $$0) {
         return $$0.apply(new ega.s($$0.a(this.a)));
      }

      @Override
      public azf<? extends efz> c() {
         return e;
      }

      @Override
      public efz.c j() {
         return this.a;
      }
   }

   protected static record t(efz.c a) implements ega.u {
      static final azf<ega.t> e = ega.a(efz.c.a, ega.t::new, ega.t::j);

      @Override
      public double a(efz.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public efz a(efz.f $$0) {
         return $$0.apply(new ega.t($$0.a(this.a)));
      }

      @Override
      public azf<? extends efz> c() {
         return e;
      }

      @Override
      public efz.c j() {
         return this.a;
      }
   }

   interface u extends efz {
      efz.c j();

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
      default void a(double[] $$0, efz.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(efz e, efz f, efz g, double h, double i, efz.c j) implements efz {
      private static final MapCodec<ega.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  efz.d.fieldOf("shift_x").forGetter(ega.v::j),
                  efz.d.fieldOf("shift_y").forGetter(ega.v::k),
                  efz.d.fieldOf("shift_z").forGetter(ega.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(ega.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(ega.v::n),
                  efz.c.a.fieldOf("noise").forGetter(ega.v::o)
               )
               .apply($$0, ega.v::new)
      );
      public static final azf<ega.v> a = ega.a(k);

      @Override
      public double a(efz.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, efz.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public efz a(efz.f $$0) {
         return $$0.apply(new ega.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public azf<? extends efz> c() {
         return a;
      }

      public efz j() {
         return this.e;
      }

      public efz k() {
         return this.f;
      }

      public efz l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public efz.c o() {
         return this.j;
      }
   }

   public static record w(ayn<ega.w.b, ega.w.a> e) implements efz {
      private static final Codec<ayn<ega.w.b, ega.w.a>> f = ayn.a(ega.w.a.b);
      private static final MapCodec<ega.w> g = f.fieldOf("spline").xmap(ega.w::new, ega.w::j);
      public static final azf<ega.w> a = ega.a(g);

      @Override
      public double a(efz.b $$0) {
         return (double)this.e.a(new ega.w.b($$0));
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
      public void a(double[] $$0, efz.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public efz a(efz.f $$0) {
         return $$0.apply(new ega.w(this.e.a((ayn.d<ega.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public azf<? extends efz> c() {
         return a;
      }

      public ayn<ega.w.b, ega.w.a> j() {
         return this.e;
      }

      public static record a(je<efz> c) implements bar<ega.w.b> {
         public static final Codec<ega.w.a> b = efz.c.xmap(ega.w.a::new, ega.w.a::a);

         @Override
         public String toString() {
            Optional<alf<efz>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               alf<efz> $$1 = $$0.get();
               if ($$1 == egn.d) {
                  return "continents";
               }

               if ($$1 == egn.e) {
                  return "erosion";
               }

               if ($$1 == egn.f) {
                  return "weirdness";
               }

               if ($$1 == egn.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(ega.w.b $$0) {
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

         public ega.w.a a(efz.f $$0) {
            return new ega.w.a(new je.a<>(this.c.a().a($$0)));
         }

         public je<efz> a() {
            return this.c;
         }
      }

      public static record b(efz.b a) {
      }
   }

   interface x extends efz {
      efz j();

      @Override
      default double a(efz.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, efz.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(efz.b var1, double var2);
   }

   interface y extends efz {
      Logger a = LogUtils.getLogger();

      static ega.y a(ega.y.a $$0, efz $$1, efz $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == ega.y.a.c || $$0 == ega.y.a.d) {
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
         if ($$0 == ega.y.a.b || $$0 == ega.y.a.a) {
            if ($$1 instanceof ega.h $$11) {
               return new ega.n($$0 == ega.y.a.a ? ega.n.a.b : ega.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof ega.h $$12) {
               return new ega.n($$0 == ega.y.a.a ? ega.n.a.b : ega.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new ega.a($$0, $$1, $$2, $$9, $$10);
      }

      ega.y.a j();

      efz k();

      efz l();

      @Override
      default azf<? extends efz> c() {
         return this.j().e;
      }

      public static enum a implements bak {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final azf<ega.y> e = ega.a((BiFunction<efz, efz, ega.y>)(($$0x, $$1) -> ega.y.a(this, $$0x, $$1)), ega.y::k, ega.y::l);
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

   protected static record z(efz e, efz.c f, ega.z.a g) implements ega.x {
      private static final MapCodec<ega.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  efz.d.fieldOf("input").forGetter(ega.z::j),
                  efz.c.a.fieldOf("noise").forGetter(ega.z::k),
                  ega.z.a.c.fieldOf("rarity_value_mapper").forGetter(ega.z::l)
               )
               .apply($$0, ega.z::new)
      );
      public static final azf<ega.z> a = ega.a(h);

      @Override
      public double a(efz.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public efz a(efz.f $$0) {
         return $$0.apply(new ega.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public azf<? extends efz> c() {
         return a;
      }

      @Override
      public efz j() {
         return this.e;
      }

      public efz.c k() {
         return this.f;
      }

      public ega.z.a l() {
         return this.g;
      }

      public static enum a implements bak {
         a("type_1", egn.a::b, 2.0),
         b("type_2", egn.a::a, 3.0);

         public static final Codec<ega.z.a> c = bak.a(ega.z.a::values);
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
