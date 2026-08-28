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

public final class dxp {
   private static final Codec<dxo> c = lp.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dxo> b = Codec.either(d, c)
      .xmap($$0 -> (dxo)$$0.map(dxp::a, Function.identity()), $$0 -> $$0 instanceof dxp.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends dxo> a(jv<MapCodec<? extends dxo>> $$0) {
      a($$0, "blend_alpha", dxp.d.e);
      a($$0, "blend_offset", dxp.f.e);
      a($$0, "beardifier", dxp.b.e);
      a($$0, "old_blended_noise", emw.a);

      for (dxp.l.a $$1 : dxp.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dxp.o.e);
      a($$0, "end_islands", dxp.i.a);
      a($$0, "weird_scaled_sampler", dxp.z.a);
      a($$0, "shifted_noise", dxp.v.a);
      a($$0, "range_choice", dxp.q.e);
      a($$0, "shift_a", dxp.s.e);
      a($$0, "shift_b", dxp.t.e);
      a($$0, "shift", dxp.r.e);
      a($$0, "blend_density", dxp.e.e);
      a($$0, "clamp", dxp.g.a);

      for (dxp.k.a $$2 : dxp.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dxp.y.a $$3 : dxp.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dxp.w.a);
      a($$0, "constant", dxp.h.e);
      return a($$0, "y_clamped_gradient", dxp.aa.a);
   }

   private static MapCodec<? extends dxo> a(jv<MapCodec<? extends dxo>> $$0, String $$1, ays<? extends dxo> $$2) {
      return jv.a($$0, $$1, $$2.a());
   }

   static <A, O> ays<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return ays.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> ays<O> a(Function<dxo, O> $$0, Function<O, dxo> $$1) {
      return a(dxo.d, $$0, $$1);
   }

   static <O> ays<O> a(BiFunction<dxo, dxo, O> $$0, Function<O, dxo> $$1, Function<O, dxo> $$2) {
      return ays.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dxo.d.fieldOf("argument1").forGetter($$1), dxo.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> ays<O> a(MapCodec<O> $$0) {
      return ays.a($$0);
   }

   private dxp() {
   }

   public static dxo a(dxo $$0) {
      return new dxp.l(dxp.l.a.a, $$0);
   }

   public static dxo b(dxo $$0) {
      return new dxp.l(dxp.l.a.b, $$0);
   }

   public static dxo c(dxo $$0) {
      return new dxp.l(dxp.l.a.c, $$0);
   }

   public static dxo d(dxo $$0) {
      return new dxp.l(dxp.l.a.d, $$0);
   }

   public static dxo e(dxo $$0) {
      return new dxp.l(dxp.l.a.e, $$0);
   }

   public static dxo a(ji<emz.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dxp.o(new dxo.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dxo a(ji<emz.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dxo a(ji<emz.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dxo a(dxo $$0, dxo $$1, double $$2, ji<emz.a> $$3) {
      return new dxp.v($$0, a(), $$1, $$2, 0.0, new dxo.c($$3));
   }

   public static dxo a(ji<emz.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dxo b(ji<emz.a> $$0, double $$1, double $$2) {
      return new dxp.o(new dxo.c($$0), $$1, $$2);
   }

   public static dxo a(ji<emz.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dxo a(dxo $$0, double $$1, double $$2, dxo $$3, dxo $$4) {
      return new dxp.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dxo b(ji<emz.a> $$0) {
      return new dxp.s(new dxo.c($$0));
   }

   public static dxo c(ji<emz.a> $$0) {
      return new dxp.t(new dxo.c($$0));
   }

   public static dxo d(ji<emz.a> $$0) {
      return new dxp.r(new dxo.c($$0));
   }

   public static dxo f(dxo $$0) {
      return new dxp.e($$0);
   }

   public static dxo a(long $$0) {
      return new dxp.i($$0);
   }

   public static dxo a(dxo $$0, ji<emz.a> $$1, dxp.z.a $$2) {
      return new dxp.z($$0, new dxo.c($$1), $$2);
   }

   public static dxo a(dxo $$0, dxo $$1) {
      return dxp.y.a(dxp.y.a.a, $$0, $$1);
   }

   public static dxo b(dxo $$0, dxo $$1) {
      return dxp.y.a(dxp.y.a.b, $$0, $$1);
   }

   public static dxo c(dxo $$0, dxo $$1) {
      return dxp.y.a(dxp.y.a.c, $$0, $$1);
   }

   public static dxo d(dxo $$0, dxo $$1) {
      return dxp.y.a(dxp.y.a.d, $$0, $$1);
   }

   public static dxo a(aya<dxp.w.b, dxp.w.a> $$0) {
      return new dxp.w($$0);
   }

   public static dxo a() {
      return dxp.h.f;
   }

   public static dxo a(double $$0) {
      return new dxp.h($$0);
   }

   public static dxo a(int $$0, int $$1, double $$2, double $$3) {
      return new dxp.aa($$0, $$1, $$2, $$3);
   }

   public static dxo a(dxo $$0, dxp.k.a $$1) {
      return dxp.k.a($$1, $$0);
   }

   private static dxo a(dxo $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dxo b() {
      return dxp.d.a;
   }

   public static dxo c() {
      return dxp.f.a;
   }

   public static dxo a(dxo $$0, dxo $$1, dxo $$2) {
      if ($$1 instanceof dxp.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dxo $$4 = d($$0);
         dxo $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dxo a(dxo $$0, double $$1, dxo $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dxp.y.a e, dxo f, dxo g, double h, double i) implements dxp.y {
      @Override
      public double a(dxo.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, dxo.a $$1) {
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
      public dxo a(dxo.f $$0) {
         return $$0.apply(dxp.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dxp.y.a j() {
         return this.e;
      }

      @Override
      public dxo k() {
         return this.f;
      }

      @Override
      public dxo l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dxo.d {
      private static final MapCodec<dxp.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dvv.e * 2, dvv.d * 2).fieldOf("from_y").forGetter(dxp.aa::j),
                  Codec.intRange(dvv.e * 2, dvv.d * 2).fieldOf("to_y").forGetter(dxp.aa::k),
                  dxp.d.fieldOf("from_value").forGetter(dxp.aa::l),
                  dxp.d.fieldOf("to_value").forGetter(dxp.aa::m)
               )
               .apply($$0, dxp.aa::new)
      );
      public static final ays<dxp.aa> a = dxp.a(i);

      @Override
      public double a(dxo.b $$0) {
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
      public ays<? extends dxo> c() {
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

   protected static enum b implements dxp.c {
      a;

      @Override
      public double a(dxo.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dxo.a $$1) {
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

   public interface c extends dxo.d {
      ays<dxo> e = ays.a(MapCodec.unit(dxp.b.a));

      @Override
      default ays<? extends dxo> c() {
         return e;
      }
   }

   protected static enum d implements dxo.d {
      a;

      public static final ays<dxo> e = ays.a(MapCodec.unit(a));

      @Override
      public double a(dxo.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dxo.a $$1) {
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
      public ays<? extends dxo> c() {
         return e;
      }
   }

   static record e(dxo a) implements dxp.x {
      static final ays<dxp.e> e = dxp.a(dxp.e::new, dxp.e::j);

      @Override
      public double a(dxo.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dxo a(dxo.f $$0) {
         return $$0.apply(new dxp.e(this.a.a($$0)));
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
      public ays<? extends dxo> c() {
         return e;
      }

      @Override
      public dxo j() {
         return this.a;
      }
   }

   protected static enum f implements dxo.d {
      a;

      public static final ays<dxo> e = ays.a(MapCodec.unit(a));

      @Override
      public double a(dxo.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dxo.a $$1) {
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
      public ays<? extends dxo> c() {
         return e;
      }
   }

   protected static record g(dxo e, double f, double g) implements dxp.p {
      private static final MapCodec<dxp.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dxo.b.fieldOf("input").forGetter(dxp.g::az_), dxp.d.fieldOf("min").forGetter(dxp.g::a), dxp.d.fieldOf("max").forGetter(dxp.g::b))
               .apply($$0, dxp.g::new)
      );
      public static final ays<dxp.g> a = dxp.a(h);

      @Override
      public double a(double $$0) {
         return ayz.a($$0, this.f, this.g);
      }

      @Override
      public dxo a(dxo.f $$0) {
         return new dxp.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public ays<? extends dxo> c() {
         return a;
      }

      @Override
      public dxo az_() {
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

   static record h(double a) implements dxo.d {
      static final ays<dxp.h> e = dxp.a(dxp.d, dxp.h::new, dxp.h::j);
      static final dxp.h f = new dxp.h(0.0);

      @Override
      public void a(double[] $$0, dxo.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public ays<? extends dxo> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dxo.d {
      public static final ays<dxp.i> a = ays.a(MapCodec.unit(new dxp.i(0L)));
      private static final float e = -0.9F;
      private final enc f;

      public i(long $$0) {
         azh $$1 = new dxw($$0);
         $$1.b(17292);
         this.f = new enc($$1);
      }

      private static float a(enc $$0, int $$1, int $$2) {
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
      public double a(dxo.b $$0) {
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
      public ays<? extends dxo> c() {
         return a;
      }
   }

   @bad
   public static record j(ji<dxo> a) implements dxo {
      @Override
      public double a(dxo.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dxo.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dxo a(dxo.f $$0) {
         return $$0.apply(new dxp.j(new ji.a<>(this.a.a().a($$0))));
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
      public ays<? extends dxo> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public ji<dxo> j() {
         return this.a;
      }
   }

   protected static record k(dxp.k.a a, dxo e, double f, double g) implements dxp.p {
      public static dxp.k a(dxp.k.a $$0, dxo $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dxp.k.a.a && $$0 != dxp.k.a.b ? new dxp.k($$0, $$1, $$3, $$4) : new dxp.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dxp.k.a $$0, double $$1) {
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

      public dxp.k b(dxo.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public ays<? extends dxo> c() {
         return this.a.h;
      }

      public dxp.k.a k() {
         return this.a;
      }

      @Override
      public dxo az_() {
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
         final ays<dxp.k> h = dxp.a($$0x -> dxp.k.a(this, $$0x), dxp.k::az_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dxp.l.a a, dxo e) implements dxp.m {
      @Override
      public double a(dxo.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dxo.a $$1) {
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
      public dxp.l.a j() {
         return this.a;
      }

      @Override
      public dxo k() {
         return this.e;
      }

      static enum a implements azu {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final ays<dxp.m> g = dxp.a($$0x -> new dxp.l(this, $$0x), dxp.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dxo {
      dxp.l.a j();

      dxo k();

      @Override
      default ays<? extends dxo> c() {
         return this.j().g;
      }

      @Override
      default dxo a(dxo.f $$0) {
         return $$0.apply(new dxp.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dxp.n.a e, dxo f, double g, double h, double i) implements dxp.p, dxp.y {
      @Override
      public dxp.y.a j() {
         return this.e == dxp.n.a.a ? dxp.y.a.b : dxp.y.a.a;
      }

      @Override
      public dxo k() {
         return dxp.a(this.i);
      }

      @Override
      public dxo l() {
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
      public dxo a(dxo.f $$0) {
         dxo $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dxp.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dxp.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dxp.n.a m() {
         return this.e;
      }

      @Override
      public dxo az_() {
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

   protected static record o(dxo.c f, @Deprecated double g, double h) implements dxo {
      public static final MapCodec<dxp.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxo.c.a.fieldOf("noise").forGetter(dxp.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dxp.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dxp.o::l)
               )
               .apply($$0, dxp.o::new)
      );
      public static final ays<dxp.o> e = dxp.a(a);

      @Override
      public double a(dxo.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dxo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxo a(dxo.f $$0) {
         return $$0.apply(new dxp.o($$0.a(this.f), this.g, this.h));
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
      public ays<? extends dxo> c() {
         return e;
      }

      public dxo.c j() {
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

   interface p extends dxo {
      dxo az_();

      @Override
      default double a(dxo.b $$0) {
         return this.a(this.az_().a($$0));
      }

      @Override
      default void a(double[] $$0, dxo.a $$1) {
         this.az_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dxo f, double g, double h, dxo i, dxo j) implements dxo {
      public static final MapCodec<dxp.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxo.d.fieldOf("input").forGetter(dxp.q::j),
                  dxp.d.fieldOf("min_inclusive").forGetter(dxp.q::k),
                  dxp.d.fieldOf("max_exclusive").forGetter(dxp.q::l),
                  dxo.d.fieldOf("when_in_range").forGetter(dxp.q::m),
                  dxo.d.fieldOf("when_out_of_range").forGetter(dxp.q::n)
               )
               .apply($$0, dxp.q::new)
      );
      public static final ays<dxp.q> e = dxp.a(a);

      @Override
      public double a(dxo.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dxo.a $$1) {
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
      public dxo a(dxo.f $$0) {
         return $$0.apply(new dxp.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public ays<? extends dxo> c() {
         return e;
      }

      public dxo j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dxo m() {
         return this.i;
      }

      public dxo n() {
         return this.j;
      }
   }

   protected static record r(dxo.c a) implements dxp.u {
      static final ays<dxp.r> e = dxp.a(dxo.c.a, dxp.r::new, dxp.r::j);

      @Override
      public double a(dxo.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dxo a(dxo.f $$0) {
         return $$0.apply(new dxp.r($$0.a(this.a)));
      }

      @Override
      public ays<? extends dxo> c() {
         return e;
      }

      @Override
      public dxo.c j() {
         return this.a;
      }
   }

   protected static record s(dxo.c a) implements dxp.u {
      static final ays<dxp.s> e = dxp.a(dxo.c.a, dxp.s::new, dxp.s::j);

      @Override
      public double a(dxo.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dxo a(dxo.f $$0) {
         return $$0.apply(new dxp.s($$0.a(this.a)));
      }

      @Override
      public ays<? extends dxo> c() {
         return e;
      }

      @Override
      public dxo.c j() {
         return this.a;
      }
   }

   protected static record t(dxo.c a) implements dxp.u {
      static final ays<dxp.t> e = dxp.a(dxo.c.a, dxp.t::new, dxp.t::j);

      @Override
      public double a(dxo.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dxo a(dxo.f $$0) {
         return $$0.apply(new dxp.t($$0.a(this.a)));
      }

      @Override
      public ays<? extends dxo> c() {
         return e;
      }

      @Override
      public dxo.c j() {
         return this.a;
      }
   }

   interface u extends dxo {
      dxo.c j();

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
      default void a(double[] $$0, dxo.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dxo e, dxo f, dxo g, double h, double i, dxo.c j) implements dxo {
      private static final MapCodec<dxp.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxo.d.fieldOf("shift_x").forGetter(dxp.v::j),
                  dxo.d.fieldOf("shift_y").forGetter(dxp.v::k),
                  dxo.d.fieldOf("shift_z").forGetter(dxp.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dxp.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dxp.v::n),
                  dxo.c.a.fieldOf("noise").forGetter(dxp.v::o)
               )
               .apply($$0, dxp.v::new)
      );
      public static final ays<dxp.v> a = dxp.a(k);

      @Override
      public double a(dxo.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dxo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxo a(dxo.f $$0) {
         return $$0.apply(new dxp.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public ays<? extends dxo> c() {
         return a;
      }

      public dxo j() {
         return this.e;
      }

      public dxo k() {
         return this.f;
      }

      public dxo l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dxo.c o() {
         return this.j;
      }
   }

   public static record w(aya<dxp.w.b, dxp.w.a> e) implements dxo {
      private static final Codec<aya<dxp.w.b, dxp.w.a>> f = aya.a(dxp.w.a.b);
      private static final MapCodec<dxp.w> g = f.fieldOf("spline").xmap(dxp.w::new, dxp.w::j);
      public static final ays<dxp.w> a = dxp.a(g);

      @Override
      public double a(dxo.b $$0) {
         return (double)this.e.a(new dxp.w.b($$0));
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
      public void a(double[] $$0, dxo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxo a(dxo.f $$0) {
         return $$0.apply(new dxp.w(this.e.a((aya.d<dxp.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public ays<? extends dxo> c() {
         return a;
      }

      public aya<dxp.w.b, dxp.w.a> j() {
         return this.e;
      }

      public static record a(ji<dxo> c) implements baa<dxp.w.b> {
         public static final Codec<dxp.w.a> b = dxo.c.xmap(dxp.w.a::new, dxp.w.a::a);

         @Override
         public String toString() {
            Optional<ale<dxo>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               ale<dxo> $$1 = $$0.get();
               if ($$1 == dyc.d) {
                  return "continents";
               }

               if ($$1 == dyc.e) {
                  return "erosion";
               }

               if ($$1 == dyc.f) {
                  return "weirdness";
               }

               if ($$1 == dyc.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dxp.w.b $$0) {
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

         public dxp.w.a a(dxo.f $$0) {
            return new dxp.w.a(new ji.a<>(this.c.a().a($$0)));
         }

         public ji<dxo> a() {
            return this.c;
         }
      }

      public static record b(dxo.b a) {
      }
   }

   interface x extends dxo {
      dxo j();

      @Override
      default double a(dxo.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dxo.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dxo.b var1, double var2);
   }

   interface y extends dxo {
      Logger a = LogUtils.getLogger();

      static dxp.y a(dxp.y.a $$0, dxo $$1, dxo $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dxp.y.a.c || $$0 == dxp.y.a.d) {
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
         if ($$0 == dxp.y.a.b || $$0 == dxp.y.a.a) {
            if ($$1 instanceof dxp.h $$11) {
               return new dxp.n($$0 == dxp.y.a.a ? dxp.n.a.b : dxp.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dxp.h $$12) {
               return new dxp.n($$0 == dxp.y.a.a ? dxp.n.a.b : dxp.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dxp.a($$0, $$1, $$2, $$9, $$10);
      }

      dxp.y.a j();

      dxo k();

      dxo l();

      @Override
      default ays<? extends dxo> c() {
         return this.j().e;
      }

      public static enum a implements azu {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final ays<dxp.y> e = dxp.a((BiFunction<dxo, dxo, dxp.y>)(($$0x, $$1) -> dxp.y.a(this, $$0x, $$1)), dxp.y::k, dxp.y::l);
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

   protected static record z(dxo e, dxo.c f, dxp.z.a g) implements dxp.x {
      private static final MapCodec<dxp.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxo.d.fieldOf("input").forGetter(dxp.z::j),
                  dxo.c.a.fieldOf("noise").forGetter(dxp.z::k),
                  dxp.z.a.c.fieldOf("rarity_value_mapper").forGetter(dxp.z::l)
               )
               .apply($$0, dxp.z::new)
      );
      public static final ays<dxp.z> a = dxp.a(h);

      @Override
      public double a(dxo.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dxo a(dxo.f $$0) {
         return $$0.apply(new dxp.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public ays<? extends dxo> c() {
         return a;
      }

      @Override
      public dxo j() {
         return this.e;
      }

      public dxo.c k() {
         return this.f;
      }

      public dxp.z.a l() {
         return this.g;
      }

      public static enum a implements azu {
         a("type_1", dyc.a::b, 2.0),
         b("type_2", dyc.a::a, 3.0);

         public static final Codec<dxp.z.a> c = azu.a(dxp.z.a::values);
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
