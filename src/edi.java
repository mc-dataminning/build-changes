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

public final class edi {
   private static final Codec<edh> c = mb.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<edh> b = Codec.either(d, c)
      .xmap($$0 -> (edh)$$0.map(edi::a, Function.identity()), $$0 -> $$0 instanceof edi.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends edh> a(ke<MapCodec<? extends edh>> $$0) {
      a($$0, "blend_alpha", edi.d.e);
      a($$0, "blend_offset", edi.f.e);
      a($$0, "beardifier", edi.b.e);
      a($$0, "old_blended_noise", esw.a);

      for (edi.l.a $$1 : edi.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", edi.o.e);
      a($$0, "end_islands", edi.i.a);
      a($$0, "weird_scaled_sampler", edi.z.a);
      a($$0, "shifted_noise", edi.v.a);
      a($$0, "range_choice", edi.q.e);
      a($$0, "shift_a", edi.s.e);
      a($$0, "shift_b", edi.t.e);
      a($$0, "shift", edi.r.e);
      a($$0, "blend_density", edi.e.e);
      a($$0, "clamp", edi.g.a);

      for (edi.k.a $$2 : edi.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (edi.y.a $$3 : edi.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", edi.w.a);
      a($$0, "constant", edi.h.e);
      return a($$0, "y_clamped_gradient", edi.aa.a);
   }

   private static MapCodec<? extends edh> a(ke<MapCodec<? extends edh>> $$0, String $$1, ays<? extends edh> $$2) {
      return ke.a($$0, $$1, $$2.a());
   }

   static <A, O> ays<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return ays.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> ays<O> a(Function<edh, O> $$0, Function<O, edh> $$1) {
      return a(edh.d, $$0, $$1);
   }

   static <O> ays<O> a(BiFunction<edh, edh, O> $$0, Function<O, edh> $$1, Function<O, edh> $$2) {
      return ays.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(edh.d.fieldOf("argument1").forGetter($$1), edh.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> ays<O> a(MapCodec<O> $$0) {
      return ays.a($$0);
   }

   private edi() {
   }

   public static edh a(edh $$0) {
      return new edi.l(edi.l.a.a, $$0);
   }

   public static edh b(edh $$0) {
      return new edi.l(edi.l.a.b, $$0);
   }

   public static edh c(edh $$0) {
      return new edi.l(edi.l.a.c, $$0);
   }

   public static edh d(edh $$0) {
      return new edi.l(edi.l.a.d, $$0);
   }

   public static edh e(edh $$0) {
      return new edi.l(edi.l.a.e, $$0);
   }

   public static edh a(jr<esz.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new edi.o(new edh.c($$0), $$1, $$2), $$3, $$4);
   }

   public static edh a(jr<esz.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static edh a(jr<esz.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static edh a(edh $$0, edh $$1, double $$2, jr<esz.a> $$3) {
      return new edi.v($$0, a(), $$1, $$2, 0.0, new edh.c($$3));
   }

   public static edh a(jr<esz.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static edh b(jr<esz.a> $$0, double $$1, double $$2) {
      return new edi.o(new edh.c($$0), $$1, $$2);
   }

   public static edh a(jr<esz.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static edh a(edh $$0, double $$1, double $$2, edh $$3, edh $$4) {
      return new edi.q($$0, $$1, $$2, $$3, $$4);
   }

   public static edh b(jr<esz.a> $$0) {
      return new edi.s(new edh.c($$0));
   }

   public static edh c(jr<esz.a> $$0) {
      return new edi.t(new edh.c($$0));
   }

   public static edh d(jr<esz.a> $$0) {
      return new edi.r(new edh.c($$0));
   }

   public static edh f(edh $$0) {
      return new edi.e($$0);
   }

   public static edh a(long $$0) {
      return new edi.i($$0);
   }

   public static edh a(edh $$0, jr<esz.a> $$1, edi.z.a $$2) {
      return new edi.z($$0, new edh.c($$1), $$2);
   }

   public static edh a(edh $$0, edh $$1) {
      return edi.y.a(edi.y.a.a, $$0, $$1);
   }

   public static edh b(edh $$0, edh $$1) {
      return edi.y.a(edi.y.a.b, $$0, $$1);
   }

   public static edh c(edh $$0, edh $$1) {
      return edi.y.a(edi.y.a.c, $$0, $$1);
   }

   public static edh d(edh $$0, edh $$1) {
      return edi.y.a(edi.y.a.d, $$0, $$1);
   }

   public static edh a(ayb<edi.w.b, edi.w.a> $$0) {
      return new edi.w($$0);
   }

   public static edh a() {
      return edi.h.f;
   }

   public static edh a(double $$0) {
      return new edi.h($$0);
   }

   public static edh a(int $$0, int $$1, double $$2, double $$3) {
      return new edi.aa($$0, $$1, $$2, $$3);
   }

   public static edh a(edh $$0, edi.k.a $$1) {
      return edi.k.a($$1, $$0);
   }

   private static edh a(edh $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static edh b() {
      return edi.d.a;
   }

   public static edh c() {
      return edi.f.a;
   }

   public static edh a(edh $$0, edh $$1, edh $$2) {
      if ($$1 instanceof edi.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         edh $$4 = d($$0);
         edh $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static edh a(edh $$0, double $$1, edh $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(edi.y.a e, edh f, edh g, double h, double i) implements edi.y {
      @Override
      public double a(edh.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, edh.a $$1) {
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
      public edh a(edh.f $$0) {
         return $$0.apply(edi.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public edi.y.a j() {
         return this.e;
      }

      @Override
      public edh k() {
         return this.f;
      }

      @Override
      public edh l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements edh.d {
      private static final MapCodec<edi.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(ebm.e * 2, ebm.d * 2).fieldOf("from_y").forGetter(edi.aa::j),
                  Codec.intRange(ebm.e * 2, ebm.d * 2).fieldOf("to_y").forGetter(edi.aa::k),
                  edi.d.fieldOf("from_value").forGetter(edi.aa::l),
                  edi.d.fieldOf("to_value").forGetter(edi.aa::m)
               )
               .apply($$0, edi.aa::new)
      );
      public static final ays<edi.aa> a = edi.a(i);

      @Override
      public double a(edh.b $$0) {
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
      public ays<? extends edh> c() {
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

   protected static enum b implements edi.c {
      a;

      @Override
      public double a(edh.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, edh.a $$1) {
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

   public interface c extends edh.d {
      ays<edh> e = ays.a(MapCodec.unit(edi.b.a));

      @Override
      default ays<? extends edh> c() {
         return e;
      }
   }

   protected static enum d implements edh.d {
      a;

      public static final ays<edh> e = ays.a(MapCodec.unit(a));

      @Override
      public double a(edh.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, edh.a $$1) {
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
      public ays<? extends edh> c() {
         return e;
      }
   }

   static record e(edh a) implements edi.x {
      static final ays<edi.e> e = edi.a(edi.e::new, edi.e::j);

      @Override
      public double a(edh.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public edh a(edh.f $$0) {
         return $$0.apply(new edi.e(this.a.a($$0)));
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
      public ays<? extends edh> c() {
         return e;
      }

      @Override
      public edh j() {
         return this.a;
      }
   }

   protected static enum f implements edh.d {
      a;

      public static final ays<edh> e = ays.a(MapCodec.unit(a));

      @Override
      public double a(edh.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, edh.a $$1) {
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
      public ays<? extends edh> c() {
         return e;
      }
   }

   protected static record g(edh e, double f, double g) implements edi.p {
      private static final MapCodec<edi.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(edh.b.fieldOf("input").forGetter(edi.g::aD_), edi.d.fieldOf("min").forGetter(edi.g::a), edi.d.fieldOf("max").forGetter(edi.g::b))
               .apply($$0, edi.g::new)
      );
      public static final ays<edi.g> a = edi.a(h);

      @Override
      public double a(double $$0) {
         return ayz.a($$0, this.f, this.g);
      }

      @Override
      public edh a(edh.f $$0) {
         return new edi.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public ays<? extends edh> c() {
         return a;
      }

      @Override
      public edh aD_() {
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

   static record h(double a) implements edh.d {
      static final ays<edi.h> e = edi.a(edi.d, edi.h::new, edi.h::j);
      static final edi.h f = new edi.h(0.0);

      @Override
      public void a(double[] $$0, edh.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public ays<? extends edh> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements edh.d {
      public static final ays<edi.i> a = ays.a(MapCodec.unit(new edi.i(0L)));
      private static final float e = -0.9F;
      private final etc f;

      public i(long $$0) {
         azh $$1 = new edp($$0);
         $$1.b(17292);
         this.f = new etc($$1);
      }

      private static float a(etc $$0, int $$1, int $$2) {
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
      public double a(edh.b $$0) {
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
      public ays<? extends edh> c() {
         return a;
      }
   }

   @bag
   public static record j(jr<edh> a) implements edh {
      @Override
      public double a(edh.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, edh.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public edh a(edh.f $$0) {
         return $$0.apply(new edi.j(new jr.a<>(this.a.a().a($$0))));
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
      public ays<? extends edh> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jr<edh> j() {
         return this.a;
      }
   }

   protected static record k(edi.k.a a, edh e, double f, double g) implements edi.p {
      public static edi.k a(edi.k.a $$0, edh $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != edi.k.a.a && $$0 != edi.k.a.b ? new edi.k($$0, $$1, $$3, $$4) : new edi.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(edi.k.a $$0, double $$1) {
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

      public edi.k b(edh.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public ays<? extends edh> c() {
         return this.a.h;
      }

      public edi.k.a k() {
         return this.a;
      }

      @Override
      public edh aD_() {
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
         final ays<edi.k> h = edi.a($$0x -> edi.k.a(this, $$0x), edi.k::aD_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(edi.l.a a, edh e) implements edi.m {
      @Override
      public double a(edh.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, edh.a $$1) {
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
      public edi.l.a j() {
         return this.a;
      }

      @Override
      public edh k() {
         return this.e;
      }

      static enum a implements azv {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final ays<edi.m> g = edi.a($$0x -> new edi.l(this, $$0x), edi.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends edh {
      edi.l.a j();

      edh k();

      @Override
      default ays<? extends edh> c() {
         return this.j().g;
      }

      @Override
      default edh a(edh.f $$0) {
         return $$0.apply(new edi.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(edi.n.a e, edh f, double g, double h, double i) implements edi.p, edi.y {
      @Override
      public edi.y.a j() {
         return this.e == edi.n.a.a ? edi.y.a.b : edi.y.a.a;
      }

      @Override
      public edh k() {
         return edi.a(this.i);
      }

      @Override
      public edh l() {
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
      public edh a(edh.f $$0) {
         edh $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == edi.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new edi.n(this.e, $$1, $$4, $$5, this.i);
      }

      public edi.n.a m() {
         return this.e;
      }

      @Override
      public edh aD_() {
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

   protected static record o(edh.c f, @Deprecated double g, double h) implements edh {
      public static final MapCodec<edi.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  edh.c.a.fieldOf("noise").forGetter(edi.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(edi.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(edi.o::l)
               )
               .apply($$0, edi.o::new)
      );
      public static final ays<edi.o> e = edi.a(a);

      @Override
      public double a(edh.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, edh.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edh a(edh.f $$0) {
         return $$0.apply(new edi.o($$0.a(this.f), this.g, this.h));
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
      public ays<? extends edh> c() {
         return e;
      }

      public edh.c j() {
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

   interface p extends edh {
      edh aD_();

      @Override
      default double a(edh.b $$0) {
         return this.a(this.aD_().a($$0));
      }

      @Override
      default void a(double[] $$0, edh.a $$1) {
         this.aD_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(edh f, double g, double h, edh i, edh j) implements edh {
      public static final MapCodec<edi.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  edh.d.fieldOf("input").forGetter(edi.q::j),
                  edi.d.fieldOf("min_inclusive").forGetter(edi.q::k),
                  edi.d.fieldOf("max_exclusive").forGetter(edi.q::l),
                  edh.d.fieldOf("when_in_range").forGetter(edi.q::m),
                  edh.d.fieldOf("when_out_of_range").forGetter(edi.q::n)
               )
               .apply($$0, edi.q::new)
      );
      public static final ays<edi.q> e = edi.a(a);

      @Override
      public double a(edh.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, edh.a $$1) {
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
      public edh a(edh.f $$0) {
         return $$0.apply(new edi.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public ays<? extends edh> c() {
         return e;
      }

      public edh j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public edh m() {
         return this.i;
      }

      public edh n() {
         return this.j;
      }
   }

   protected static record r(edh.c a) implements edi.u {
      static final ays<edi.r> e = edi.a(edh.c.a, edi.r::new, edi.r::j);

      @Override
      public double a(edh.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public edh a(edh.f $$0) {
         return $$0.apply(new edi.r($$0.a(this.a)));
      }

      @Override
      public ays<? extends edh> c() {
         return e;
      }

      @Override
      public edh.c j() {
         return this.a;
      }
   }

   protected static record s(edh.c a) implements edi.u {
      static final ays<edi.s> e = edi.a(edh.c.a, edi.s::new, edi.s::j);

      @Override
      public double a(edh.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public edh a(edh.f $$0) {
         return $$0.apply(new edi.s($$0.a(this.a)));
      }

      @Override
      public ays<? extends edh> c() {
         return e;
      }

      @Override
      public edh.c j() {
         return this.a;
      }
   }

   protected static record t(edh.c a) implements edi.u {
      static final ays<edi.t> e = edi.a(edh.c.a, edi.t::new, edi.t::j);

      @Override
      public double a(edh.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public edh a(edh.f $$0) {
         return $$0.apply(new edi.t($$0.a(this.a)));
      }

      @Override
      public ays<? extends edh> c() {
         return e;
      }

      @Override
      public edh.c j() {
         return this.a;
      }
   }

   interface u extends edh {
      edh.c j();

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
      default void a(double[] $$0, edh.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(edh e, edh f, edh g, double h, double i, edh.c j) implements edh {
      private static final MapCodec<edi.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  edh.d.fieldOf("shift_x").forGetter(edi.v::j),
                  edh.d.fieldOf("shift_y").forGetter(edi.v::k),
                  edh.d.fieldOf("shift_z").forGetter(edi.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(edi.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(edi.v::n),
                  edh.c.a.fieldOf("noise").forGetter(edi.v::o)
               )
               .apply($$0, edi.v::new)
      );
      public static final ays<edi.v> a = edi.a(k);

      @Override
      public double a(edh.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, edh.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edh a(edh.f $$0) {
         return $$0.apply(new edi.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public ays<? extends edh> c() {
         return a;
      }

      public edh j() {
         return this.e;
      }

      public edh k() {
         return this.f;
      }

      public edh l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public edh.c o() {
         return this.j;
      }
   }

   public static record w(ayb<edi.w.b, edi.w.a> e) implements edh {
      private static final Codec<ayb<edi.w.b, edi.w.a>> f = ayb.a(edi.w.a.b);
      private static final MapCodec<edi.w> g = f.fieldOf("spline").xmap(edi.w::new, edi.w::j);
      public static final ays<edi.w> a = edi.a(g);

      @Override
      public double a(edh.b $$0) {
         return (double)this.e.a(new edi.w.b($$0));
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
      public void a(double[] $$0, edh.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edh a(edh.f $$0) {
         return $$0.apply(new edi.w(this.e.a((ayb.d<edi.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public ays<? extends edh> c() {
         return a;
      }

      public ayb<edi.w.b, edi.w.a> j() {
         return this.e;
      }

      public static record a(jr<edh> c) implements bac<edi.w.b> {
         public static final Codec<edi.w.a> b = edh.c.xmap(edi.w.a::new, edi.w.a::a);

         @Override
         public String toString() {
            Optional<akt<edh>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               akt<edh> $$1 = $$0.get();
               if ($$1 == edv.d) {
                  return "continents";
               }

               if ($$1 == edv.e) {
                  return "erosion";
               }

               if ($$1 == edv.f) {
                  return "weirdness";
               }

               if ($$1 == edv.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(edi.w.b $$0) {
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

         public edi.w.a a(edh.f $$0) {
            return new edi.w.a(new jr.a<>(this.c.a().a($$0)));
         }

         public jr<edh> a() {
            return this.c;
         }
      }

      public static record b(edh.b a) {
      }
   }

   interface x extends edh {
      edh j();

      @Override
      default double a(edh.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, edh.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(edh.b var1, double var2);
   }

   interface y extends edh {
      Logger a = LogUtils.getLogger();

      static edi.y a(edi.y.a $$0, edh $$1, edh $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == edi.y.a.c || $$0 == edi.y.a.d) {
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
         if ($$0 == edi.y.a.b || $$0 == edi.y.a.a) {
            if ($$1 instanceof edi.h $$11) {
               return new edi.n($$0 == edi.y.a.a ? edi.n.a.b : edi.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof edi.h $$12) {
               return new edi.n($$0 == edi.y.a.a ? edi.n.a.b : edi.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new edi.a($$0, $$1, $$2, $$9, $$10);
      }

      edi.y.a j();

      edh k();

      edh l();

      @Override
      default ays<? extends edh> c() {
         return this.j().e;
      }

      public static enum a implements azv {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final ays<edi.y> e = edi.a((BiFunction<edh, edh, edi.y>)(($$0x, $$1) -> edi.y.a(this, $$0x, $$1)), edi.y::k, edi.y::l);
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

   protected static record z(edh e, edh.c f, edi.z.a g) implements edi.x {
      private static final MapCodec<edi.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  edh.d.fieldOf("input").forGetter(edi.z::j),
                  edh.c.a.fieldOf("noise").forGetter(edi.z::k),
                  edi.z.a.c.fieldOf("rarity_value_mapper").forGetter(edi.z::l)
               )
               .apply($$0, edi.z::new)
      );
      public static final ays<edi.z> a = edi.a(h);

      @Override
      public double a(edh.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public edh a(edh.f $$0) {
         return $$0.apply(new edi.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public ays<? extends edh> c() {
         return a;
      }

      @Override
      public edh j() {
         return this.e;
      }

      public edh.c k() {
         return this.f;
      }

      public edi.z.a l() {
         return this.g;
      }

      public static enum a implements azv {
         a("type_1", edv.a::b, 2.0),
         b("type_2", edv.a::a, 3.0);

         public static final Codec<edi.z.a> c = azv.a(edi.z.a::values);
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
