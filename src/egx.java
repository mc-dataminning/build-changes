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

public final class egx {
   private static final Codec<egw> c = mg.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<egw> b = Codec.either(d, c)
      .xmap($$0 -> (egw)$$0.map(egx::a, Function.identity()), $$0 -> $$0 instanceof egx.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends egw> a(js<MapCodec<? extends egw>> $$0) {
      a($$0, "blend_alpha", egx.d.e);
      a($$0, "blend_offset", egx.f.e);
      a($$0, "beardifier", egx.b.e);
      a($$0, "old_blended_noise", ewo.a);

      for (egx.l.a $$1 : egx.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", egx.o.e);
      a($$0, "end_islands", egx.i.a);
      a($$0, "weird_scaled_sampler", egx.z.a);
      a($$0, "shifted_noise", egx.v.a);
      a($$0, "range_choice", egx.q.e);
      a($$0, "shift_a", egx.s.e);
      a($$0, "shift_b", egx.t.e);
      a($$0, "shift", egx.r.e);
      a($$0, "blend_density", egx.e.e);
      a($$0, "clamp", egx.g.a);

      for (egx.k.a $$2 : egx.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (egx.y.a $$3 : egx.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", egx.w.a);
      a($$0, "constant", egx.h.e);
      return a($$0, "y_clamped_gradient", egx.aa.a);
   }

   private static MapCodec<? extends egw> a(js<MapCodec<? extends egw>> $$0, String $$1, azh<? extends egw> $$2) {
      return js.a($$0, $$1, $$2.a());
   }

   static <A, O> azh<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return azh.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> azh<O> a(Function<egw, O> $$0, Function<O, egw> $$1) {
      return a(egw.d, $$0, $$1);
   }

   static <O> azh<O> a(BiFunction<egw, egw, O> $$0, Function<O, egw> $$1, Function<O, egw> $$2) {
      return azh.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(egw.d.fieldOf("argument1").forGetter($$1), egw.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> azh<O> a(MapCodec<O> $$0) {
      return azh.a($$0);
   }

   private egx() {
   }

   public static egw a(egw $$0) {
      return new egx.l(egx.l.a.a, $$0);
   }

   public static egw b(egw $$0) {
      return new egx.l(egx.l.a.b, $$0);
   }

   public static egw c(egw $$0) {
      return new egx.l(egx.l.a.c, $$0);
   }

   public static egw d(egw $$0) {
      return new egx.l(egx.l.a.d, $$0);
   }

   public static egw e(egw $$0) {
      return new egx.l(egx.l.a.e, $$0);
   }

   public static egw a(jf<ewr.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new egx.o(new egw.c($$0), $$1, $$2), $$3, $$4);
   }

   public static egw a(jf<ewr.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static egw a(jf<ewr.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static egw a(egw $$0, egw $$1, double $$2, jf<ewr.a> $$3) {
      return new egx.v($$0, a(), $$1, $$2, 0.0, new egw.c($$3));
   }

   public static egw a(jf<ewr.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static egw b(jf<ewr.a> $$0, double $$1, double $$2) {
      return new egx.o(new egw.c($$0), $$1, $$2);
   }

   public static egw a(jf<ewr.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static egw a(egw $$0, double $$1, double $$2, egw $$3, egw $$4) {
      return new egx.q($$0, $$1, $$2, $$3, $$4);
   }

   public static egw b(jf<ewr.a> $$0) {
      return new egx.s(new egw.c($$0));
   }

   public static egw c(jf<ewr.a> $$0) {
      return new egx.t(new egw.c($$0));
   }

   public static egw d(jf<ewr.a> $$0) {
      return new egx.r(new egw.c($$0));
   }

   public static egw f(egw $$0) {
      return new egx.e($$0);
   }

   public static egw a(long $$0) {
      return new egx.i($$0);
   }

   public static egw a(egw $$0, jf<ewr.a> $$1, egx.z.a $$2) {
      return new egx.z($$0, new egw.c($$1), $$2);
   }

   public static egw a(egw $$0, egw $$1) {
      return egx.y.a(egx.y.a.a, $$0, $$1);
   }

   public static egw b(egw $$0, egw $$1) {
      return egx.y.a(egx.y.a.b, $$0, $$1);
   }

   public static egw c(egw $$0, egw $$1) {
      return egx.y.a(egx.y.a.c, $$0, $$1);
   }

   public static egw d(egw $$0, egw $$1) {
      return egx.y.a(egx.y.a.d, $$0, $$1);
   }

   public static egw a(ayp<egx.w.b, egx.w.a> $$0) {
      return new egx.w($$0);
   }

   public static egw a() {
      return egx.h.f;
   }

   public static egw a(double $$0) {
      return new egx.h($$0);
   }

   public static egw a(int $$0, int $$1, double $$2, double $$3) {
      return new egx.aa($$0, $$1, $$2, $$3);
   }

   public static egw a(egw $$0, egx.k.a $$1) {
      return egx.k.a($$1, $$0);
   }

   private static egw a(egw $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static egw b() {
      return egx.d.a;
   }

   public static egw c() {
      return egx.f.a;
   }

   public static egw a(egw $$0, egw $$1, egw $$2) {
      if ($$1 instanceof egx.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         egw $$4 = d($$0);
         egw $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static egw a(egw $$0, double $$1, egw $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(egx.y.a e, egw f, egw g, double h, double i) implements egx.y {
      @Override
      public double a(egw.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, egw.a $$1) {
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
      public egw a(egw.f $$0) {
         return $$0.apply(egx.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public egx.y.a j() {
         return this.e;
      }

      @Override
      public egw k() {
         return this.f;
      }

      @Override
      public egw l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements egw.d {
      private static final MapCodec<egx.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(efb.e * 2, efb.d * 2).fieldOf("from_y").forGetter(egx.aa::j),
                  Codec.intRange(efb.e * 2, efb.d * 2).fieldOf("to_y").forGetter(egx.aa::k),
                  egx.d.fieldOf("from_value").forGetter(egx.aa::l),
                  egx.d.fieldOf("to_value").forGetter(egx.aa::m)
               )
               .apply($$0, egx.aa::new)
      );
      public static final azh<egx.aa> a = egx.a(i);

      @Override
      public double a(egw.b $$0) {
         return azo.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public azh<? extends egw> c() {
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

   protected static enum b implements egx.c {
      a;

      @Override
      public double a(egw.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, egw.a $$1) {
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

   public interface c extends egw.d {
      azh<egw> e = azh.a(MapCodec.unit(egx.b.a));

      @Override
      default azh<? extends egw> c() {
         return e;
      }
   }

   protected static enum d implements egw.d {
      a;

      public static final azh<egw> e = azh.a(MapCodec.unit(a));

      @Override
      public double a(egw.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, egw.a $$1) {
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
      public azh<? extends egw> c() {
         return e;
      }
   }

   static record e(egw a) implements egx.x {
      static final azh<egx.e> e = egx.a(egx.e::new, egx.e::j);

      @Override
      public double a(egw.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public egw a(egw.f $$0) {
         return $$0.apply(new egx.e(this.a.a($$0)));
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
      public azh<? extends egw> c() {
         return e;
      }

      @Override
      public egw j() {
         return this.a;
      }
   }

   protected static enum f implements egw.d {
      a;

      public static final azh<egw> e = azh.a(MapCodec.unit(a));

      @Override
      public double a(egw.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, egw.a $$1) {
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
      public azh<? extends egw> c() {
         return e;
      }
   }

   protected static record g(egw e, double f, double g) implements egx.p {
      private static final MapCodec<egx.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(egw.b.fieldOf("input").forGetter(egx.g::aE_), egx.d.fieldOf("min").forGetter(egx.g::a), egx.d.fieldOf("max").forGetter(egx.g::b))
               .apply($$0, egx.g::new)
      );
      public static final azh<egx.g> a = egx.a(h);

      @Override
      public double a(double $$0) {
         return azo.a($$0, this.f, this.g);
      }

      @Override
      public egw a(egw.f $$0) {
         return new egx.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public azh<? extends egw> c() {
         return a;
      }

      @Override
      public egw aE_() {
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

   static record h(double a) implements egw.d {
      static final azh<egx.h> e = egx.a(egx.d, egx.h::new, egx.h::j);
      static final egx.h f = new egx.h(0.0);

      @Override
      public void a(double[] $$0, egw.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public azh<? extends egw> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements egw.d {
      public static final azh<egx.i> a = azh.a(MapCodec.unit(new egx.i(0L)));
      private static final float e = -0.9F;
      private final ewu f;

      public i(long $$0) {
         azx $$1 = new ehe($$0);
         $$1.b(17292);
         this.f = new ewu($$1);
      }

      private static float a(ewu $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - azo.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = azo.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (azo.e((float)$$10) * 3439.0F + azo.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - azo.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = azo.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(egw.b $$0) {
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
      public azh<? extends egw> c() {
         return a;
      }
   }

   @bax
   public static record j(jf<egw> a) implements egw {
      @Override
      public double a(egw.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, egw.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public egw a(egw.f $$0) {
         return $$0.apply(new egx.j(new jf.a<>(this.a.a().a($$0))));
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
      public azh<? extends egw> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jf<egw> j() {
         return this.a;
      }
   }

   protected static record k(egx.k.a a, egw e, double f, double g) implements egx.p {
      public static egx.k a(egx.k.a $$0, egw $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != egx.k.a.a && $$0 != egx.k.a.b ? new egx.k($$0, $$1, $$3, $$4) : new egx.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(egx.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = azo.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public egx.k b(egw.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public azh<? extends egw> c() {
         return this.a.h;
      }

      public egx.k.a k() {
         return this.a;
      }

      @Override
      public egw aE_() {
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

      static enum a implements bam {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final azh<egx.k> h = egx.a($$0x -> egx.k.a(this, $$0x), egx.k::aE_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(egx.l.a a, egw e) implements egx.m {
      @Override
      public double a(egw.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, egw.a $$1) {
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
      public egx.l.a j() {
         return this.a;
      }

      @Override
      public egw k() {
         return this.e;
      }

      static enum a implements bam {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final azh<egx.m> g = egx.a($$0x -> new egx.l(this, $$0x), egx.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends egw {
      egx.l.a j();

      egw k();

      @Override
      default azh<? extends egw> c() {
         return this.j().g;
      }

      @Override
      default egw a(egw.f $$0) {
         return $$0.apply(new egx.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(egx.n.a e, egw f, double g, double h, double i) implements egx.p, egx.y {
      @Override
      public egx.y.a j() {
         return this.e == egx.n.a.a ? egx.y.a.b : egx.y.a.a;
      }

      @Override
      public egw k() {
         return egx.a(this.i);
      }

      @Override
      public egw l() {
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
      public egw a(egw.f $$0) {
         egw $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == egx.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new egx.n(this.e, $$1, $$4, $$5, this.i);
      }

      public egx.n.a m() {
         return this.e;
      }

      @Override
      public egw aE_() {
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

   protected static record o(egw.c f, @Deprecated double g, double h) implements egw {
      public static final MapCodec<egx.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  egw.c.a.fieldOf("noise").forGetter(egx.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(egx.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(egx.o::l)
               )
               .apply($$0, egx.o::new)
      );
      public static final azh<egx.o> e = egx.a(a);

      @Override
      public double a(egw.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, egw.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public egw a(egw.f $$0) {
         return $$0.apply(new egx.o($$0.a(this.f), this.g, this.h));
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
      public azh<? extends egw> c() {
         return e;
      }

      public egw.c j() {
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

   interface p extends egw {
      egw aE_();

      @Override
      default double a(egw.b $$0) {
         return this.a(this.aE_().a($$0));
      }

      @Override
      default void a(double[] $$0, egw.a $$1) {
         this.aE_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(egw f, double g, double h, egw i, egw j) implements egw {
      public static final MapCodec<egx.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  egw.d.fieldOf("input").forGetter(egx.q::j),
                  egx.d.fieldOf("min_inclusive").forGetter(egx.q::k),
                  egx.d.fieldOf("max_exclusive").forGetter(egx.q::l),
                  egw.d.fieldOf("when_in_range").forGetter(egx.q::m),
                  egw.d.fieldOf("when_out_of_range").forGetter(egx.q::n)
               )
               .apply($$0, egx.q::new)
      );
      public static final azh<egx.q> e = egx.a(a);

      @Override
      public double a(egw.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, egw.a $$1) {
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
      public egw a(egw.f $$0) {
         return $$0.apply(new egx.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public azh<? extends egw> c() {
         return e;
      }

      public egw j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public egw m() {
         return this.i;
      }

      public egw n() {
         return this.j;
      }
   }

   protected static record r(egw.c a) implements egx.u {
      static final azh<egx.r> e = egx.a(egw.c.a, egx.r::new, egx.r::j);

      @Override
      public double a(egw.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public egw a(egw.f $$0) {
         return $$0.apply(new egx.r($$0.a(this.a)));
      }

      @Override
      public azh<? extends egw> c() {
         return e;
      }

      @Override
      public egw.c j() {
         return this.a;
      }
   }

   protected static record s(egw.c a) implements egx.u {
      static final azh<egx.s> e = egx.a(egw.c.a, egx.s::new, egx.s::j);

      @Override
      public double a(egw.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public egw a(egw.f $$0) {
         return $$0.apply(new egx.s($$0.a(this.a)));
      }

      @Override
      public azh<? extends egw> c() {
         return e;
      }

      @Override
      public egw.c j() {
         return this.a;
      }
   }

   protected static record t(egw.c a) implements egx.u {
      static final azh<egx.t> e = egx.a(egw.c.a, egx.t::new, egx.t::j);

      @Override
      public double a(egw.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public egw a(egw.f $$0) {
         return $$0.apply(new egx.t($$0.a(this.a)));
      }

      @Override
      public azh<? extends egw> c() {
         return e;
      }

      @Override
      public egw.c j() {
         return this.a;
      }
   }

   interface u extends egw {
      egw.c j();

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
      default void a(double[] $$0, egw.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(egw e, egw f, egw g, double h, double i, egw.c j) implements egw {
      private static final MapCodec<egx.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  egw.d.fieldOf("shift_x").forGetter(egx.v::j),
                  egw.d.fieldOf("shift_y").forGetter(egx.v::k),
                  egw.d.fieldOf("shift_z").forGetter(egx.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(egx.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(egx.v::n),
                  egw.c.a.fieldOf("noise").forGetter(egx.v::o)
               )
               .apply($$0, egx.v::new)
      );
      public static final azh<egx.v> a = egx.a(k);

      @Override
      public double a(egw.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, egw.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public egw a(egw.f $$0) {
         return $$0.apply(new egx.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public azh<? extends egw> c() {
         return a;
      }

      public egw j() {
         return this.e;
      }

      public egw k() {
         return this.f;
      }

      public egw l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public egw.c o() {
         return this.j;
      }
   }

   public static record w(ayp<egx.w.b, egx.w.a> e) implements egw {
      private static final Codec<ayp<egx.w.b, egx.w.a>> f = ayp.a(egx.w.a.b);
      private static final MapCodec<egx.w> g = f.fieldOf("spline").xmap(egx.w::new, egx.w::j);
      public static final azh<egx.w> a = egx.a(g);

      @Override
      public double a(egw.b $$0) {
         return (double)this.e.a(new egx.w.b($$0));
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
      public void a(double[] $$0, egw.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public egw a(egw.f $$0) {
         return $$0.apply(new egx.w(this.e.a((ayp.d<egx.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public azh<? extends egw> c() {
         return a;
      }

      public ayp<egx.w.b, egx.w.a> j() {
         return this.e;
      }

      public static record a(jf<egw> c) implements bat<egx.w.b> {
         public static final Codec<egx.w.a> b = egw.c.xmap(egx.w.a::new, egx.w.a::a);

         @Override
         public String toString() {
            Optional<alh<egw>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               alh<egw> $$1 = $$0.get();
               if ($$1 == ehk.d) {
                  return "continents";
               }

               if ($$1 == ehk.e) {
                  return "erosion";
               }

               if ($$1 == ehk.f) {
                  return "weirdness";
               }

               if ($$1 == ehk.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(egx.w.b $$0) {
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

         public egx.w.a a(egw.f $$0) {
            return new egx.w.a(new jf.a<>(this.c.a().a($$0)));
         }

         public jf<egw> a() {
            return this.c;
         }
      }

      public static record b(egw.b a) {
      }
   }

   interface x extends egw {
      egw j();

      @Override
      default double a(egw.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, egw.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(egw.b var1, double var2);
   }

   interface y extends egw {
      Logger a = LogUtils.getLogger();

      static egx.y a(egx.y.a $$0, egw $$1, egw $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == egx.y.a.c || $$0 == egx.y.a.d) {
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
         if ($$0 == egx.y.a.b || $$0 == egx.y.a.a) {
            if ($$1 instanceof egx.h $$11) {
               return new egx.n($$0 == egx.y.a.a ? egx.n.a.b : egx.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof egx.h $$12) {
               return new egx.n($$0 == egx.y.a.a ? egx.n.a.b : egx.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new egx.a($$0, $$1, $$2, $$9, $$10);
      }

      egx.y.a j();

      egw k();

      egw l();

      @Override
      default azh<? extends egw> c() {
         return this.j().e;
      }

      public static enum a implements bam {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final azh<egx.y> e = egx.a((BiFunction<egw, egw, egx.y>)(($$0x, $$1) -> egx.y.a(this, $$0x, $$1)), egx.y::k, egx.y::l);
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

   protected static record z(egw e, egw.c f, egx.z.a g) implements egx.x {
      private static final MapCodec<egx.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  egw.d.fieldOf("input").forGetter(egx.z::j),
                  egw.c.a.fieldOf("noise").forGetter(egx.z::k),
                  egx.z.a.c.fieldOf("rarity_value_mapper").forGetter(egx.z::l)
               )
               .apply($$0, egx.z::new)
      );
      public static final azh<egx.z> a = egx.a(h);

      @Override
      public double a(egw.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public egw a(egw.f $$0) {
         return $$0.apply(new egx.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public azh<? extends egw> c() {
         return a;
      }

      @Override
      public egw j() {
         return this.e;
      }

      public egw.c k() {
         return this.f;
      }

      public egx.z.a l() {
         return this.g;
      }

      public static enum a implements bam {
         a("type_1", ehk.a::b, 2.0),
         b("type_2", ehk.a::a, 3.0);

         public static final Codec<egx.z.a> c = bam.a(egx.z.a::values);
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
