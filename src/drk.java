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

public final class drk {
   private static final Codec<drj> c = kh.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<drj> b = Codec.either(d, c)
      .xmap($$0 -> (drj)$$0.map(drk::a, Function.identity()), $$0 -> $$0 instanceof drk.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends drj> a(ix<Codec<? extends drj>> $$0) {
      a($$0, "blend_alpha", drk.d.e);
      a($$0, "blend_offset", drk.f.e);
      a($$0, "beardifier", drk.b.e);
      a($$0, "old_blended_noise", egr.a);

      for (drk.l.a $$1 : drk.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", drk.o.e);
      a($$0, "end_islands", drk.i.a);
      a($$0, "weird_scaled_sampler", drk.z.a);
      a($$0, "shifted_noise", drk.v.a);
      a($$0, "range_choice", drk.q.e);
      a($$0, "shift_a", drk.s.e);
      a($$0, "shift_b", drk.t.e);
      a($$0, "shift", drk.r.e);
      a($$0, "blend_density", drk.e.e);
      a($$0, "clamp", drk.g.a);

      for (drk.k.a $$2 : drk.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (drk.y.a $$3 : drk.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", drk.w.a);
      a($$0, "constant", drk.h.e);
      return a($$0, "y_clamped_gradient", drk.aa.a);
   }

   private static Codec<? extends drj> a(ix<Codec<? extends drj>> $$0, String $$1, awg<? extends drj> $$2) {
      return ix.a($$0, $$1, $$2.a());
   }

   static <A, O> awg<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return awg.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> awg<O> a(Function<drj, O> $$0, Function<O, drj> $$1) {
      return a(drj.d, $$0, $$1);
   }

   static <O> awg<O> a(BiFunction<drj, drj, O> $$0, Function<O, drj> $$1, Function<O, drj> $$2) {
      return awg.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(drj.d.fieldOf("argument1").forGetter($$1), drj.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> awg<O> a(MapCodec<O> $$0) {
      return awg.a($$0);
   }

   private drk() {
   }

   public static drj a(drj $$0) {
      return new drk.l(drk.l.a.a, $$0);
   }

   public static drj b(drj $$0) {
      return new drk.l(drk.l.a.b, $$0);
   }

   public static drj c(drj $$0) {
      return new drk.l(drk.l.a.c, $$0);
   }

   public static drj d(drj $$0) {
      return new drk.l(drk.l.a.d, $$0);
   }

   public static drj e(drj $$0) {
      return new drk.l(drk.l.a.e, $$0);
   }

   public static drj a(il<egu.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new drk.o(new drj.c($$0), $$1, $$2), $$3, $$4);
   }

   public static drj a(il<egu.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static drj a(il<egu.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static drj a(drj $$0, drj $$1, double $$2, il<egu.a> $$3) {
      return new drk.v($$0, a(), $$1, $$2, 0.0, new drj.c($$3));
   }

   public static drj a(il<egu.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static drj b(il<egu.a> $$0, double $$1, double $$2) {
      return new drk.o(new drj.c($$0), $$1, $$2);
   }

   public static drj a(il<egu.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static drj a(drj $$0, double $$1, double $$2, drj $$3, drj $$4) {
      return new drk.q($$0, $$1, $$2, $$3, $$4);
   }

   public static drj b(il<egu.a> $$0) {
      return new drk.s(new drj.c($$0));
   }

   public static drj c(il<egu.a> $$0) {
      return new drk.t(new drj.c($$0));
   }

   public static drj d(il<egu.a> $$0) {
      return new drk.r(new drj.c($$0));
   }

   public static drj f(drj $$0) {
      return new drk.e($$0);
   }

   public static drj a(long $$0) {
      return new drk.i($$0);
   }

   public static drj a(drj $$0, il<egu.a> $$1, drk.z.a $$2) {
      return new drk.z($$0, new drj.c($$1), $$2);
   }

   public static drj a(drj $$0, drj $$1) {
      return drk.y.a(drk.y.a.a, $$0, $$1);
   }

   public static drj b(drj $$0, drj $$1) {
      return drk.y.a(drk.y.a.b, $$0, $$1);
   }

   public static drj c(drj $$0, drj $$1) {
      return drk.y.a(drk.y.a.c, $$0, $$1);
   }

   public static drj d(drj $$0, drj $$1) {
      return drk.y.a(drk.y.a.d, $$0, $$1);
   }

   public static drj a(avo<drk.w.b, drk.w.a> $$0) {
      return new drk.w($$0);
   }

   public static drj a() {
      return drk.h.f;
   }

   public static drj a(double $$0) {
      return new drk.h($$0);
   }

   public static drj a(int $$0, int $$1, double $$2, double $$3) {
      return new drk.aa($$0, $$1, $$2, $$3);
   }

   public static drj a(drj $$0, drk.k.a $$1) {
      return drk.k.a($$1, $$0);
   }

   private static drj a(drj $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static drj b() {
      return drk.d.a;
   }

   public static drj c() {
      return drk.f.a;
   }

   public static drj a(drj $$0, drj $$1, drj $$2) {
      if ($$1 instanceof drk.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         drj $$4 = d($$0);
         drj $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static drj a(drj $$0, double $$1, drj $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(drk.y.a e, drj f, drj g, double h, double i) implements drk.y {
      @Override
      public double a(drj.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, drj.a $$1) {
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
      public drj a(drj.f $$0) {
         return $$0.apply(drk.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public drk.y.a j() {
         return this.e;
      }

      @Override
      public drj k() {
         return this.f;
      }

      @Override
      public drj l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements drj.d {
      private static final MapCodec<drk.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dpq.e * 2, dpq.d * 2).fieldOf("from_y").forGetter(drk.aa::j),
                  Codec.intRange(dpq.e * 2, dpq.d * 2).fieldOf("to_y").forGetter(drk.aa::k),
                  drk.d.fieldOf("from_value").forGetter(drk.aa::l),
                  drk.d.fieldOf("to_value").forGetter(drk.aa::m)
               )
               .apply($$0, drk.aa::new)
      );
      public static final awg<drk.aa> a = drk.a(i);

      @Override
      public double a(drj.b $$0) {
         return awm.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public awg<? extends drj> c() {
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

   protected static enum b implements drk.c {
      a;

      @Override
      public double a(drj.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, drj.a $$1) {
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

   public interface c extends drj.d {
      awg<drj> e = awg.a(MapCodec.unit(drk.b.a));

      @Override
      default awg<? extends drj> c() {
         return e;
      }
   }

   protected static enum d implements drj.d {
      a;

      public static final awg<drj> e = awg.a(MapCodec.unit(a));

      @Override
      public double a(drj.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, drj.a $$1) {
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
      public awg<? extends drj> c() {
         return e;
      }
   }

   static record e(drj a) implements drk.x {
      static final awg<drk.e> e = drk.a(drk.e::new, drk.e::j);

      @Override
      public double a(drj.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public drj a(drj.f $$0) {
         return $$0.apply(new drk.e(this.a.a($$0)));
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
      public awg<? extends drj> c() {
         return e;
      }

      @Override
      public drj j() {
         return this.a;
      }
   }

   protected static enum f implements drj.d {
      a;

      public static final awg<drj> e = awg.a(MapCodec.unit(a));

      @Override
      public double a(drj.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, drj.a $$1) {
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
      public awg<? extends drj> c() {
         return e;
      }
   }

   protected static record g(drj e, double f, double g) implements drk.p {
      private static final MapCodec<drk.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(drj.b.fieldOf("input").forGetter(drk.g::aE_), drk.d.fieldOf("min").forGetter(drk.g::a), drk.d.fieldOf("max").forGetter(drk.g::b))
               .apply($$0, drk.g::new)
      );
      public static final awg<drk.g> a = drk.a(h);

      @Override
      public double a(double $$0) {
         return awm.a($$0, this.f, this.g);
      }

      @Override
      public drj a(drj.f $$0) {
         return new drk.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public awg<? extends drj> c() {
         return a;
      }

      @Override
      public drj aE_() {
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

   static record h(double a) implements drj.d {
      static final awg<drk.h> e = drk.a(drk.d, drk.h::new, drk.h::j);
      static final drk.h f = new drk.h(0.0);

      @Override
      public void a(double[] $$0, drj.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public awg<? extends drj> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements drj.d {
      public static final awg<drk.i> a = awg.a(MapCodec.unit(new drk.i(0L)));
      private static final float e = -0.9F;
      private final egx f;

      public i(long $$0) {
         awt $$1 = new drr($$0);
         $$1.b(17292);
         this.f = new egx($$1);
      }

      private static float a(egx $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - awm.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = awm.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (awm.e((float)$$10) * 3439.0F + awm.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - awm.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = awm.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(drj.b $$0) {
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
      public awg<? extends drj> c() {
         return a;
      }
   }

   @axp
   public static record j(il<drj> a) implements drj {
      @Override
      public double a(drj.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, drj.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public drj a(drj.f $$0) {
         return $$0.apply(new drk.j(new il.a<>(this.a.a().a($$0))));
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
      public awg<? extends drj> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public il<drj> j() {
         return this.a;
      }
   }

   protected static record k(drk.k.a a, drj e, double f, double g) implements drk.p {
      public static drk.k a(drk.k.a $$0, drj $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != drk.k.a.a && $$0 != drk.k.a.b ? new drk.k($$0, $$1, $$3, $$4) : new drk.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(drk.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = awm.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public drk.k b(drj.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public awg<? extends drj> c() {
         return this.a.h;
      }

      public drk.k.a k() {
         return this.a;
      }

      @Override
      public drj aE_() {
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

      static enum a implements axg {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final awg<drk.k> h = drk.a($$0x -> drk.k.a(this, $$0x), drk.k::aE_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(drk.l.a a, drj e) implements drk.m {
      @Override
      public double a(drj.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, drj.a $$1) {
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
      public drk.l.a j() {
         return this.a;
      }

      @Override
      public drj k() {
         return this.e;
      }

      static enum a implements axg {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final awg<drk.m> g = drk.a($$0x -> new drk.l(this, $$0x), drk.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends drj {
      drk.l.a j();

      drj k();

      @Override
      default awg<? extends drj> c() {
         return this.j().g;
      }

      @Override
      default drj a(drj.f $$0) {
         return $$0.apply(new drk.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(drk.n.a e, drj f, double g, double h, double i) implements drk.p, drk.y {
      @Override
      public drk.y.a j() {
         return this.e == drk.n.a.a ? drk.y.a.b : drk.y.a.a;
      }

      @Override
      public drj k() {
         return drk.a(this.i);
      }

      @Override
      public drj l() {
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
      public drj a(drj.f $$0) {
         drj $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == drk.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new drk.n(this.e, $$1, $$4, $$5, this.i);
      }

      public drk.n.a m() {
         return this.e;
      }

      @Override
      public drj aE_() {
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

   protected static record o(drj.c f, @Deprecated double g, double h) implements drj {
      public static final MapCodec<drk.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  drj.c.a.fieldOf("noise").forGetter(drk.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(drk.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(drk.o::l)
               )
               .apply($$0, drk.o::new)
      );
      public static final awg<drk.o> e = drk.a(a);

      @Override
      public double a(drj.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, drj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public drj a(drj.f $$0) {
         return $$0.apply(new drk.o($$0.a(this.f), this.g, this.h));
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
      public awg<? extends drj> c() {
         return e;
      }

      public drj.c j() {
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

   interface p extends drj {
      drj aE_();

      @Override
      default double a(drj.b $$0) {
         return this.a(this.aE_().a($$0));
      }

      @Override
      default void a(double[] $$0, drj.a $$1) {
         this.aE_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(drj f, double g, double h, drj i, drj j) implements drj {
      public static final MapCodec<drk.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  drj.d.fieldOf("input").forGetter(drk.q::j),
                  drk.d.fieldOf("min_inclusive").forGetter(drk.q::k),
                  drk.d.fieldOf("max_exclusive").forGetter(drk.q::l),
                  drj.d.fieldOf("when_in_range").forGetter(drk.q::m),
                  drj.d.fieldOf("when_out_of_range").forGetter(drk.q::n)
               )
               .apply($$0, drk.q::new)
      );
      public static final awg<drk.q> e = drk.a(a);

      @Override
      public double a(drj.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, drj.a $$1) {
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
      public drj a(drj.f $$0) {
         return $$0.apply(new drk.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public awg<? extends drj> c() {
         return e;
      }

      public drj j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public drj m() {
         return this.i;
      }

      public drj n() {
         return this.j;
      }
   }

   protected static record r(drj.c a) implements drk.u {
      static final awg<drk.r> e = drk.a(drj.c.a, drk.r::new, drk.r::j);

      @Override
      public double a(drj.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public drj a(drj.f $$0) {
         return $$0.apply(new drk.r($$0.a(this.a)));
      }

      @Override
      public awg<? extends drj> c() {
         return e;
      }

      @Override
      public drj.c j() {
         return this.a;
      }
   }

   protected static record s(drj.c a) implements drk.u {
      static final awg<drk.s> e = drk.a(drj.c.a, drk.s::new, drk.s::j);

      @Override
      public double a(drj.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public drj a(drj.f $$0) {
         return $$0.apply(new drk.s($$0.a(this.a)));
      }

      @Override
      public awg<? extends drj> c() {
         return e;
      }

      @Override
      public drj.c j() {
         return this.a;
      }
   }

   protected static record t(drj.c a) implements drk.u {
      static final awg<drk.t> e = drk.a(drj.c.a, drk.t::new, drk.t::j);

      @Override
      public double a(drj.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public drj a(drj.f $$0) {
         return $$0.apply(new drk.t($$0.a(this.a)));
      }

      @Override
      public awg<? extends drj> c() {
         return e;
      }

      @Override
      public drj.c j() {
         return this.a;
      }
   }

   interface u extends drj {
      drj.c j();

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
      default void a(double[] $$0, drj.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(drj e, drj f, drj g, double h, double i, drj.c j) implements drj {
      private static final MapCodec<drk.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  drj.d.fieldOf("shift_x").forGetter(drk.v::j),
                  drj.d.fieldOf("shift_y").forGetter(drk.v::k),
                  drj.d.fieldOf("shift_z").forGetter(drk.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(drk.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(drk.v::n),
                  drj.c.a.fieldOf("noise").forGetter(drk.v::o)
               )
               .apply($$0, drk.v::new)
      );
      public static final awg<drk.v> a = drk.a(k);

      @Override
      public double a(drj.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, drj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public drj a(drj.f $$0) {
         return $$0.apply(new drk.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public awg<? extends drj> c() {
         return a;
      }

      public drj j() {
         return this.e;
      }

      public drj k() {
         return this.f;
      }

      public drj l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public drj.c o() {
         return this.j;
      }
   }

   public static record w(avo<drk.w.b, drk.w.a> e) implements drj {
      private static final Codec<avo<drk.w.b, drk.w.a>> f = avo.a(drk.w.a.b);
      private static final MapCodec<drk.w> g = f.fieldOf("spline").xmap(drk.w::new, drk.w::j);
      public static final awg<drk.w> a = drk.a(g);

      @Override
      public double a(drj.b $$0) {
         return (double)this.e.a(new drk.w.b($$0));
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
      public void a(double[] $$0, drj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public drj a(drj.f $$0) {
         return $$0.apply(new drk.w(this.e.a((avo.d<drk.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public awg<? extends drj> c() {
         return a;
      }

      public avo<drk.w.b, drk.w.a> j() {
         return this.e;
      }

      public static record a(il<drj> c) implements axm<drk.w.b> {
         public static final Codec<drk.w.a> b = drj.c.xmap(drk.w.a::new, drk.w.a::a);

         @Override
         public String toString() {
            Optional<ajb<drj>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               ajb<drj> $$1 = $$0.get();
               if ($$1 == drx.d) {
                  return "continents";
               }

               if ($$1 == drx.e) {
                  return "erosion";
               }

               if ($$1 == drx.f) {
                  return "weirdness";
               }

               if ($$1 == drx.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(drk.w.b $$0) {
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

         public drk.w.a a(drj.f $$0) {
            return new drk.w.a(new il.a<>(this.c.a().a($$0)));
         }

         public il<drj> a() {
            return this.c;
         }
      }

      public static record b(drj.b a) {
      }
   }

   interface x extends drj {
      drj j();

      @Override
      default double a(drj.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, drj.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(drj.b var1, double var2);
   }

   interface y extends drj {
      Logger a = LogUtils.getLogger();

      static drk.y a(drk.y.a $$0, drj $$1, drj $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == drk.y.a.c || $$0 == drk.y.a.d) {
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
         if ($$0 == drk.y.a.b || $$0 == drk.y.a.a) {
            if ($$1 instanceof drk.h $$11) {
               return new drk.n($$0 == drk.y.a.a ? drk.n.a.b : drk.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof drk.h $$12) {
               return new drk.n($$0 == drk.y.a.a ? drk.n.a.b : drk.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new drk.a($$0, $$1, $$2, $$9, $$10);
      }

      drk.y.a j();

      drj k();

      drj l();

      @Override
      default awg<? extends drj> c() {
         return this.j().e;
      }

      public static enum a implements axg {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final awg<drk.y> e = drk.a((BiFunction<drj, drj, drk.y>)(($$0x, $$1) -> drk.y.a(this, $$0x, $$1)), drk.y::k, drk.y::l);
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

   protected static record z(drj e, drj.c f, drk.z.a g) implements drk.x {
      private static final MapCodec<drk.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  drj.d.fieldOf("input").forGetter(drk.z::j),
                  drj.c.a.fieldOf("noise").forGetter(drk.z::k),
                  drk.z.a.c.fieldOf("rarity_value_mapper").forGetter(drk.z::l)
               )
               .apply($$0, drk.z::new)
      );
      public static final awg<drk.z> a = drk.a(h);

      @Override
      public double a(drj.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public drj a(drj.f $$0) {
         return $$0.apply(new drk.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public awg<? extends drj> c() {
         return a;
      }

      @Override
      public drj j() {
         return this.e;
      }

      public drj.c k() {
         return this.f;
      }

      public drk.z.a l() {
         return this.g;
      }

      public static enum a implements axg {
         a("type_1", drx.a::b, 2.0),
         b("type_2", drx.a::a, 3.0);

         public static final Codec<drk.z.a> c = axg.a(drk.z.a::values);
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
