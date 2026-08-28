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

public final class dxt {
   private static final Codec<dxs> c = lq.ad.r().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dxs> b = Codec.either(d, c)
      .xmap($$0 -> (dxs)$$0.map(dxt::a, Function.identity()), $$0 -> $$0 instanceof dxt.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends dxs> a(jw<MapCodec<? extends dxs>> $$0) {
      a($$0, "blend_alpha", dxt.d.e);
      a($$0, "blend_offset", dxt.f.e);
      a($$0, "beardifier", dxt.b.e);
      a($$0, "old_blended_noise", enb.a);

      for (dxt.l.a $$1 : dxt.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dxt.o.e);
      a($$0, "end_islands", dxt.i.a);
      a($$0, "weird_scaled_sampler", dxt.z.a);
      a($$0, "shifted_noise", dxt.v.a);
      a($$0, "range_choice", dxt.q.e);
      a($$0, "shift_a", dxt.s.e);
      a($$0, "shift_b", dxt.t.e);
      a($$0, "shift", dxt.r.e);
      a($$0, "blend_density", dxt.e.e);
      a($$0, "clamp", dxt.g.a);

      for (dxt.k.a $$2 : dxt.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dxt.y.a $$3 : dxt.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dxt.w.a);
      a($$0, "constant", dxt.h.e);
      return a($$0, "y_clamped_gradient", dxt.aa.a);
   }

   private static MapCodec<? extends dxs> a(jw<MapCodec<? extends dxs>> $$0, String $$1, axx<? extends dxs> $$2) {
      return jw.a($$0, $$1, $$2.a());
   }

   static <A, O> axx<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return axx.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> axx<O> a(Function<dxs, O> $$0, Function<O, dxs> $$1) {
      return a(dxs.d, $$0, $$1);
   }

   static <O> axx<O> a(BiFunction<dxs, dxs, O> $$0, Function<O, dxs> $$1, Function<O, dxs> $$2) {
      return axx.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dxs.d.fieldOf("argument1").forGetter($$1), dxs.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> axx<O> a(MapCodec<O> $$0) {
      return axx.a($$0);
   }

   private dxt() {
   }

   public static dxs a(dxs $$0) {
      return new dxt.l(dxt.l.a.a, $$0);
   }

   public static dxs b(dxs $$0) {
      return new dxt.l(dxt.l.a.b, $$0);
   }

   public static dxs c(dxs $$0) {
      return new dxt.l(dxt.l.a.c, $$0);
   }

   public static dxs d(dxs $$0) {
      return new dxt.l(dxt.l.a.d, $$0);
   }

   public static dxs e(dxs $$0) {
      return new dxt.l(dxt.l.a.e, $$0);
   }

   public static dxs a(jj<ene.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dxt.o(new dxs.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dxs a(jj<ene.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dxs a(jj<ene.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dxs a(dxs $$0, dxs $$1, double $$2, jj<ene.a> $$3) {
      return new dxt.v($$0, a(), $$1, $$2, 0.0, new dxs.c($$3));
   }

   public static dxs a(jj<ene.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dxs b(jj<ene.a> $$0, double $$1, double $$2) {
      return new dxt.o(new dxs.c($$0), $$1, $$2);
   }

   public static dxs a(jj<ene.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dxs a(dxs $$0, double $$1, double $$2, dxs $$3, dxs $$4) {
      return new dxt.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dxs b(jj<ene.a> $$0) {
      return new dxt.s(new dxs.c($$0));
   }

   public static dxs c(jj<ene.a> $$0) {
      return new dxt.t(new dxs.c($$0));
   }

   public static dxs d(jj<ene.a> $$0) {
      return new dxt.r(new dxs.c($$0));
   }

   public static dxs f(dxs $$0) {
      return new dxt.e($$0);
   }

   public static dxs a(long $$0) {
      return new dxt.i($$0);
   }

   public static dxs a(dxs $$0, jj<ene.a> $$1, dxt.z.a $$2) {
      return new dxt.z($$0, new dxs.c($$1), $$2);
   }

   public static dxs a(dxs $$0, dxs $$1) {
      return dxt.y.a(dxt.y.a.a, $$0, $$1);
   }

   public static dxs b(dxs $$0, dxs $$1) {
      return dxt.y.a(dxt.y.a.b, $$0, $$1);
   }

   public static dxs c(dxs $$0, dxs $$1) {
      return dxt.y.a(dxt.y.a.c, $$0, $$1);
   }

   public static dxs d(dxs $$0, dxs $$1) {
      return dxt.y.a(dxt.y.a.d, $$0, $$1);
   }

   public static dxs a(axf<dxt.w.b, dxt.w.a> $$0) {
      return new dxt.w($$0);
   }

   public static dxs a() {
      return dxt.h.f;
   }

   public static dxs a(double $$0) {
      return new dxt.h($$0);
   }

   public static dxs a(int $$0, int $$1, double $$2, double $$3) {
      return new dxt.aa($$0, $$1, $$2, $$3);
   }

   public static dxs a(dxs $$0, dxt.k.a $$1) {
      return dxt.k.a($$1, $$0);
   }

   private static dxs a(dxs $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dxs b() {
      return dxt.d.a;
   }

   public static dxs c() {
      return dxt.f.a;
   }

   public static dxs a(dxs $$0, dxs $$1, dxs $$2) {
      if ($$1 instanceof dxt.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dxs $$4 = d($$0);
         dxs $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dxs a(dxs $$0, double $$1, dxs $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dxt.y.a e, dxs f, dxs g, double h, double i) implements dxt.y {
      @Override
      public double a(dxs.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, dxs.a $$1) {
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
      public dxs a(dxs.f $$0) {
         return $$0.apply(dxt.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dxt.y.a j() {
         return this.e;
      }

      @Override
      public dxs k() {
         return this.f;
      }

      @Override
      public dxs l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dxs.d {
      private static final MapCodec<dxt.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dvz.e * 2, dvz.d * 2).fieldOf("from_y").forGetter(dxt.aa::j),
                  Codec.intRange(dvz.e * 2, dvz.d * 2).fieldOf("to_y").forGetter(dxt.aa::k),
                  dxt.d.fieldOf("from_value").forGetter(dxt.aa::l),
                  dxt.d.fieldOf("to_value").forGetter(dxt.aa::m)
               )
               .apply($$0, dxt.aa::new)
      );
      public static final axx<dxt.aa> a = dxt.a(i);

      @Override
      public double a(dxs.b $$0) {
         return aye.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public axx<? extends dxs> c() {
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

   protected static enum b implements dxt.c {
      a;

      @Override
      public double a(dxs.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dxs.a $$1) {
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

   public interface c extends dxs.d {
      axx<dxs> e = axx.a(MapCodec.unit(dxt.b.a));

      @Override
      default axx<? extends dxs> c() {
         return e;
      }
   }

   protected static enum d implements dxs.d {
      a;

      public static final axx<dxs> e = axx.a(MapCodec.unit(a));

      @Override
      public double a(dxs.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dxs.a $$1) {
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
      public axx<? extends dxs> c() {
         return e;
      }
   }

   static record e(dxs a) implements dxt.x {
      static final axx<dxt.e> e = dxt.a(dxt.e::new, dxt.e::j);

      @Override
      public double a(dxs.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dxs a(dxs.f $$0) {
         return $$0.apply(new dxt.e(this.a.a($$0)));
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
      public axx<? extends dxs> c() {
         return e;
      }

      @Override
      public dxs j() {
         return this.a;
      }
   }

   protected static enum f implements dxs.d {
      a;

      public static final axx<dxs> e = axx.a(MapCodec.unit(a));

      @Override
      public double a(dxs.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dxs.a $$1) {
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
      public axx<? extends dxs> c() {
         return e;
      }
   }

   protected static record g(dxs e, double f, double g) implements dxt.p {
      private static final MapCodec<dxt.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dxs.b.fieldOf("input").forGetter(dxt.g::aB_), dxt.d.fieldOf("min").forGetter(dxt.g::a), dxt.d.fieldOf("max").forGetter(dxt.g::b))
               .apply($$0, dxt.g::new)
      );
      public static final axx<dxt.g> a = dxt.a(h);

      @Override
      public double a(double $$0) {
         return aye.a($$0, this.f, this.g);
      }

      @Override
      public dxs a(dxs.f $$0) {
         return new dxt.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public axx<? extends dxs> c() {
         return a;
      }

      @Override
      public dxs aB_() {
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

   static record h(double a) implements dxs.d {
      static final axx<dxt.h> e = dxt.a(dxt.d, dxt.h::new, dxt.h::j);
      static final dxt.h f = new dxt.h(0.0);

      @Override
      public void a(double[] $$0, dxs.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public axx<? extends dxs> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dxs.d {
      public static final axx<dxt.i> a = axx.a(MapCodec.unit(new dxt.i(0L)));
      private static final float e = -0.9F;
      private final enh f;

      public i(long $$0) {
         aym $$1 = new dya($$0);
         $$1.b(17292);
         this.f = new enh($$1);
      }

      private static float a(enh $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - aye.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = aye.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (aye.e((float)$$10) * 3439.0F + aye.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - aye.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = aye.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dxs.b $$0) {
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
      public axx<? extends dxs> c() {
         return a;
      }
   }

   @azi
   public static record j(jj<dxs> a) implements dxs {
      @Override
      public double a(dxs.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dxs.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dxs a(dxs.f $$0) {
         return $$0.apply(new dxt.j(new jj.a<>(this.a.a().a($$0))));
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
      public axx<? extends dxs> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jj<dxs> j() {
         return this.a;
      }
   }

   protected static record k(dxt.k.a a, dxs e, double f, double g) implements dxt.p {
      public static dxt.k a(dxt.k.a $$0, dxs $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dxt.k.a.a && $$0 != dxt.k.a.b ? new dxt.k($$0, $$1, $$3, $$4) : new dxt.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dxt.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = aye.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dxt.k b(dxs.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public axx<? extends dxs> c() {
         return this.a.h;
      }

      public dxt.k.a k() {
         return this.a;
      }

      @Override
      public dxs aB_() {
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

      static enum a implements ayz {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final axx<dxt.k> h = dxt.a($$0x -> dxt.k.a(this, $$0x), dxt.k::aB_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dxt.l.a a, dxs e) implements dxt.m {
      @Override
      public double a(dxs.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dxs.a $$1) {
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
      public dxt.l.a j() {
         return this.a;
      }

      @Override
      public dxs k() {
         return this.e;
      }

      static enum a implements ayz {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final axx<dxt.m> g = dxt.a($$0x -> new dxt.l(this, $$0x), dxt.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dxs {
      dxt.l.a j();

      dxs k();

      @Override
      default axx<? extends dxs> c() {
         return this.j().g;
      }

      @Override
      default dxs a(dxs.f $$0) {
         return $$0.apply(new dxt.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dxt.n.a e, dxs f, double g, double h, double i) implements dxt.p, dxt.y {
      @Override
      public dxt.y.a j() {
         return this.e == dxt.n.a.a ? dxt.y.a.b : dxt.y.a.a;
      }

      @Override
      public dxs k() {
         return dxt.a(this.i);
      }

      @Override
      public dxs l() {
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
      public dxs a(dxs.f $$0) {
         dxs $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dxt.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dxt.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dxt.n.a m() {
         return this.e;
      }

      @Override
      public dxs aB_() {
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

   protected static record o(dxs.c f, @Deprecated double g, double h) implements dxs {
      public static final MapCodec<dxt.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxs.c.a.fieldOf("noise").forGetter(dxt.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dxt.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dxt.o::l)
               )
               .apply($$0, dxt.o::new)
      );
      public static final axx<dxt.o> e = dxt.a(a);

      @Override
      public double a(dxs.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dxs.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxs a(dxs.f $$0) {
         return $$0.apply(new dxt.o($$0.a(this.f), this.g, this.h));
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
      public axx<? extends dxs> c() {
         return e;
      }

      public dxs.c j() {
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

   interface p extends dxs {
      dxs aB_();

      @Override
      default double a(dxs.b $$0) {
         return this.a(this.aB_().a($$0));
      }

      @Override
      default void a(double[] $$0, dxs.a $$1) {
         this.aB_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dxs f, double g, double h, dxs i, dxs j) implements dxs {
      public static final MapCodec<dxt.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxs.d.fieldOf("input").forGetter(dxt.q::j),
                  dxt.d.fieldOf("min_inclusive").forGetter(dxt.q::k),
                  dxt.d.fieldOf("max_exclusive").forGetter(dxt.q::l),
                  dxs.d.fieldOf("when_in_range").forGetter(dxt.q::m),
                  dxs.d.fieldOf("when_out_of_range").forGetter(dxt.q::n)
               )
               .apply($$0, dxt.q::new)
      );
      public static final axx<dxt.q> e = dxt.a(a);

      @Override
      public double a(dxs.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dxs.a $$1) {
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
      public dxs a(dxs.f $$0) {
         return $$0.apply(new dxt.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public axx<? extends dxs> c() {
         return e;
      }

      public dxs j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dxs m() {
         return this.i;
      }

      public dxs n() {
         return this.j;
      }
   }

   protected static record r(dxs.c a) implements dxt.u {
      static final axx<dxt.r> e = dxt.a(dxs.c.a, dxt.r::new, dxt.r::j);

      @Override
      public double a(dxs.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dxs a(dxs.f $$0) {
         return $$0.apply(new dxt.r($$0.a(this.a)));
      }

      @Override
      public axx<? extends dxs> c() {
         return e;
      }

      @Override
      public dxs.c j() {
         return this.a;
      }
   }

   protected static record s(dxs.c a) implements dxt.u {
      static final axx<dxt.s> e = dxt.a(dxs.c.a, dxt.s::new, dxt.s::j);

      @Override
      public double a(dxs.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dxs a(dxs.f $$0) {
         return $$0.apply(new dxt.s($$0.a(this.a)));
      }

      @Override
      public axx<? extends dxs> c() {
         return e;
      }

      @Override
      public dxs.c j() {
         return this.a;
      }
   }

   protected static record t(dxs.c a) implements dxt.u {
      static final axx<dxt.t> e = dxt.a(dxs.c.a, dxt.t::new, dxt.t::j);

      @Override
      public double a(dxs.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dxs a(dxs.f $$0) {
         return $$0.apply(new dxt.t($$0.a(this.a)));
      }

      @Override
      public axx<? extends dxs> c() {
         return e;
      }

      @Override
      public dxs.c j() {
         return this.a;
      }
   }

   interface u extends dxs {
      dxs.c j();

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
      default void a(double[] $$0, dxs.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dxs e, dxs f, dxs g, double h, double i, dxs.c j) implements dxs {
      private static final MapCodec<dxt.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxs.d.fieldOf("shift_x").forGetter(dxt.v::j),
                  dxs.d.fieldOf("shift_y").forGetter(dxt.v::k),
                  dxs.d.fieldOf("shift_z").forGetter(dxt.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dxt.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dxt.v::n),
                  dxs.c.a.fieldOf("noise").forGetter(dxt.v::o)
               )
               .apply($$0, dxt.v::new)
      );
      public static final axx<dxt.v> a = dxt.a(k);

      @Override
      public double a(dxs.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dxs.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxs a(dxs.f $$0) {
         return $$0.apply(new dxt.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public axx<? extends dxs> c() {
         return a;
      }

      public dxs j() {
         return this.e;
      }

      public dxs k() {
         return this.f;
      }

      public dxs l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dxs.c o() {
         return this.j;
      }
   }

   public static record w(axf<dxt.w.b, dxt.w.a> e) implements dxs {
      private static final Codec<axf<dxt.w.b, dxt.w.a>> f = axf.a(dxt.w.a.b);
      private static final MapCodec<dxt.w> g = f.fieldOf("spline").xmap(dxt.w::new, dxt.w::j);
      public static final axx<dxt.w> a = dxt.a(g);

      @Override
      public double a(dxs.b $$0) {
         return (double)this.e.a(new dxt.w.b($$0));
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
      public void a(double[] $$0, dxs.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxs a(dxs.f $$0) {
         return $$0.apply(new dxt.w(this.e.a((axf.d<dxt.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public axx<? extends dxs> c() {
         return a;
      }

      public axf<dxt.w.b, dxt.w.a> j() {
         return this.e;
      }

      public static record a(jj<dxs> c) implements azf<dxt.w.b> {
         public static final Codec<dxt.w.a> b = dxs.c.xmap(dxt.w.a::new, dxt.w.a::a);

         @Override
         public String toString() {
            Optional<akj<dxs>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               akj<dxs> $$1 = $$0.get();
               if ($$1 == dyg.d) {
                  return "continents";
               }

               if ($$1 == dyg.e) {
                  return "erosion";
               }

               if ($$1 == dyg.f) {
                  return "weirdness";
               }

               if ($$1 == dyg.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dxt.w.b $$0) {
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

         public dxt.w.a a(dxs.f $$0) {
            return new dxt.w.a(new jj.a<>(this.c.a().a($$0)));
         }

         public jj<dxs> a() {
            return this.c;
         }
      }

      public static record b(dxs.b a) {
      }
   }

   interface x extends dxs {
      dxs j();

      @Override
      default double a(dxs.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dxs.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dxs.b var1, double var2);
   }

   interface y extends dxs {
      Logger a = LogUtils.getLogger();

      static dxt.y a(dxt.y.a $$0, dxs $$1, dxs $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dxt.y.a.c || $$0 == dxt.y.a.d) {
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
         if ($$0 == dxt.y.a.b || $$0 == dxt.y.a.a) {
            if ($$1 instanceof dxt.h $$11) {
               return new dxt.n($$0 == dxt.y.a.a ? dxt.n.a.b : dxt.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dxt.h $$12) {
               return new dxt.n($$0 == dxt.y.a.a ? dxt.n.a.b : dxt.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dxt.a($$0, $$1, $$2, $$9, $$10);
      }

      dxt.y.a j();

      dxs k();

      dxs l();

      @Override
      default axx<? extends dxs> c() {
         return this.j().e;
      }

      public static enum a implements ayz {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final axx<dxt.y> e = dxt.a((BiFunction<dxs, dxs, dxt.y>)(($$0x, $$1) -> dxt.y.a(this, $$0x, $$1)), dxt.y::k, dxt.y::l);
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

   protected static record z(dxs e, dxs.c f, dxt.z.a g) implements dxt.x {
      private static final MapCodec<dxt.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxs.d.fieldOf("input").forGetter(dxt.z::j),
                  dxs.c.a.fieldOf("noise").forGetter(dxt.z::k),
                  dxt.z.a.c.fieldOf("rarity_value_mapper").forGetter(dxt.z::l)
               )
               .apply($$0, dxt.z::new)
      );
      public static final axx<dxt.z> a = dxt.a(h);

      @Override
      public double a(dxs.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dxs a(dxs.f $$0) {
         return $$0.apply(new dxt.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public axx<? extends dxs> c() {
         return a;
      }

      @Override
      public dxs j() {
         return this.e;
      }

      public dxs.c k() {
         return this.f;
      }

      public dxt.z.a l() {
         return this.g;
      }

      public static enum a implements ayz {
         a("type_1", dyg.a::b, 2.0),
         b("type_2", dyg.a::a, 3.0);

         public static final Codec<dxt.z.a> c = ayz.a(dxt.z.a::values);
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
