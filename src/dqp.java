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

public final class dqp {
   private static final Codec<dqo> c = kf.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dqo> b = Codec.either(d, c)
      .xmap($$0 -> (dqo)$$0.map(dqp::a, Function.identity()), $$0 -> $$0 instanceof dqp.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dqo> a(iv<Codec<? extends dqo>> $$0) {
      a($$0, "blend_alpha", dqp.d.e);
      a($$0, "blend_offset", dqp.f.e);
      a($$0, "beardifier", dqp.b.e);
      a($$0, "old_blended_noise", efw.a);

      for (dqp.l.a $$1 : dqp.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dqp.o.e);
      a($$0, "end_islands", dqp.i.a);
      a($$0, "weird_scaled_sampler", dqp.z.a);
      a($$0, "shifted_noise", dqp.v.a);
      a($$0, "range_choice", dqp.q.e);
      a($$0, "shift_a", dqp.s.e);
      a($$0, "shift_b", dqp.t.e);
      a($$0, "shift", dqp.r.e);
      a($$0, "blend_density", dqp.e.e);
      a($$0, "clamp", dqp.g.a);

      for (dqp.k.a $$2 : dqp.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dqp.y.a $$3 : dqp.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dqp.w.a);
      a($$0, "constant", dqp.h.e);
      return a($$0, "y_clamped_gradient", dqp.aa.a);
   }

   private static Codec<? extends dqo> a(iv<Codec<? extends dqo>> $$0, String $$1, awc<? extends dqo> $$2) {
      return iv.a($$0, $$1, $$2.a());
   }

   static <A, O> awc<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return awc.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> awc<O> a(Function<dqo, O> $$0, Function<O, dqo> $$1) {
      return a(dqo.d, $$0, $$1);
   }

   static <O> awc<O> a(BiFunction<dqo, dqo, O> $$0, Function<O, dqo> $$1, Function<O, dqo> $$2) {
      return awc.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dqo.d.fieldOf("argument1").forGetter($$1), dqo.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> awc<O> a(MapCodec<O> $$0) {
      return awc.a($$0);
   }

   private dqp() {
   }

   public static dqo a(dqo $$0) {
      return new dqp.l(dqp.l.a.a, $$0);
   }

   public static dqo b(dqo $$0) {
      return new dqp.l(dqp.l.a.b, $$0);
   }

   public static dqo c(dqo $$0) {
      return new dqp.l(dqp.l.a.c, $$0);
   }

   public static dqo d(dqo $$0) {
      return new dqp.l(dqp.l.a.d, $$0);
   }

   public static dqo e(dqo $$0) {
      return new dqp.l(dqp.l.a.e, $$0);
   }

   public static dqo a(ij<efz.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dqp.o(new dqo.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dqo a(ij<efz.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dqo a(ij<efz.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dqo a(dqo $$0, dqo $$1, double $$2, ij<efz.a> $$3) {
      return new dqp.v($$0, a(), $$1, $$2, 0.0, new dqo.c($$3));
   }

   public static dqo a(ij<efz.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dqo b(ij<efz.a> $$0, double $$1, double $$2) {
      return new dqp.o(new dqo.c($$0), $$1, $$2);
   }

   public static dqo a(ij<efz.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dqo a(dqo $$0, double $$1, double $$2, dqo $$3, dqo $$4) {
      return new dqp.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dqo b(ij<efz.a> $$0) {
      return new dqp.s(new dqo.c($$0));
   }

   public static dqo c(ij<efz.a> $$0) {
      return new dqp.t(new dqo.c($$0));
   }

   public static dqo d(ij<efz.a> $$0) {
      return new dqp.r(new dqo.c($$0));
   }

   public static dqo f(dqo $$0) {
      return new dqp.e($$0);
   }

   public static dqo a(long $$0) {
      return new dqp.i($$0);
   }

   public static dqo a(dqo $$0, ij<efz.a> $$1, dqp.z.a $$2) {
      return new dqp.z($$0, new dqo.c($$1), $$2);
   }

   public static dqo a(dqo $$0, dqo $$1) {
      return dqp.y.a(dqp.y.a.a, $$0, $$1);
   }

   public static dqo b(dqo $$0, dqo $$1) {
      return dqp.y.a(dqp.y.a.b, $$0, $$1);
   }

   public static dqo c(dqo $$0, dqo $$1) {
      return dqp.y.a(dqp.y.a.c, $$0, $$1);
   }

   public static dqo d(dqo $$0, dqo $$1) {
      return dqp.y.a(dqp.y.a.d, $$0, $$1);
   }

   public static dqo a(avk<dqp.w.b, dqp.w.a> $$0) {
      return new dqp.w($$0);
   }

   public static dqo a() {
      return dqp.h.f;
   }

   public static dqo a(double $$0) {
      return new dqp.h($$0);
   }

   public static dqo a(int $$0, int $$1, double $$2, double $$3) {
      return new dqp.aa($$0, $$1, $$2, $$3);
   }

   public static dqo a(dqo $$0, dqp.k.a $$1) {
      return dqp.k.a($$1, $$0);
   }

   private static dqo a(dqo $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dqo b() {
      return dqp.d.a;
   }

   public static dqo c() {
      return dqp.f.a;
   }

   public static dqo a(dqo $$0, dqo $$1, dqo $$2) {
      if ($$1 instanceof dqp.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dqo $$4 = d($$0);
         dqo $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dqo a(dqo $$0, double $$1, dqo $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dqp.y.a e, dqo f, dqo g, double h, double i) implements dqp.y {
      @Override
      public double a(dqo.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dqo.a $$1) {
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
      public dqo a(dqo.f $$0) {
         return $$0.apply(dqp.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dqp.y.a j() {
         return this.e;
      }

      @Override
      public dqo k() {
         return this.f;
      }

      @Override
      public dqo l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dqo.d {
      private static final MapCodec<dqp.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dov.e * 2, dov.d * 2).fieldOf("from_y").forGetter(dqp.aa::j),
                  Codec.intRange(dov.e * 2, dov.d * 2).fieldOf("to_y").forGetter(dqp.aa::k),
                  dqp.d.fieldOf("from_value").forGetter(dqp.aa::l),
                  dqp.d.fieldOf("to_value").forGetter(dqp.aa::m)
               )
               .apply($$0, dqp.aa::new)
      );
      public static final awc<dqp.aa> a = dqp.a(i);

      @Override
      public double a(dqo.b $$0) {
         return awi.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public awc<? extends dqo> c() {
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

   protected static enum b implements dqp.c {
      a;

      @Override
      public double a(dqo.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dqo.a $$1) {
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

   public interface c extends dqo.d {
      awc<dqo> e = awc.a(MapCodec.unit(dqp.b.a));

      @Override
      default awc<? extends dqo> c() {
         return e;
      }
   }

   protected static enum d implements dqo.d {
      a;

      public static final awc<dqo> e = awc.a(MapCodec.unit(a));

      @Override
      public double a(dqo.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dqo.a $$1) {
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
      public awc<? extends dqo> c() {
         return e;
      }
   }

   static record e(dqo a) implements dqp.x {
      static final awc<dqp.e> e = dqp.a(dqp.e::new, dqp.e::j);

      @Override
      public double a(dqo.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dqo a(dqo.f $$0) {
         return $$0.apply(new dqp.e(this.a.a($$0)));
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
      public awc<? extends dqo> c() {
         return e;
      }

      @Override
      public dqo j() {
         return this.a;
      }
   }

   protected static enum f implements dqo.d {
      a;

      public static final awc<dqo> e = awc.a(MapCodec.unit(a));

      @Override
      public double a(dqo.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dqo.a $$1) {
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
      public awc<? extends dqo> c() {
         return e;
      }
   }

   protected static record g(dqo e, double f, double g) implements dqp.p {
      private static final MapCodec<dqp.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dqo.b.fieldOf("input").forGetter(dqp.g::aF_), dqp.d.fieldOf("min").forGetter(dqp.g::a), dqp.d.fieldOf("max").forGetter(dqp.g::b))
               .apply($$0, dqp.g::new)
      );
      public static final awc<dqp.g> a = dqp.a(h);

      @Override
      public double a(double $$0) {
         return awi.a($$0, this.f, this.g);
      }

      @Override
      public dqo a(dqo.f $$0) {
         return new dqp.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public awc<? extends dqo> c() {
         return a;
      }

      @Override
      public dqo aF_() {
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

   static record h(double a) implements dqo.d {
      static final awc<dqp.h> e = dqp.a(dqp.d, dqp.h::new, dqp.h::j);
      static final dqp.h f = new dqp.h(0.0);

      @Override
      public void a(double[] $$0, dqo.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public awc<? extends dqo> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dqo.d {
      public static final awc<dqp.i> a = awc.a(MapCodec.unit(new dqp.i(0L)));
      private static final float e = -0.9F;
      private final egc f;

      public i(long $$0) {
         awp $$1 = new dqw($$0);
         $$1.b(17292);
         this.f = new egc($$1);
      }

      private static float a(egc $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - awi.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = awi.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (awi.e((float)$$10) * 3439.0F + awi.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - awi.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = awi.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dqo.b $$0) {
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
      public awc<? extends dqo> c() {
         return a;
      }
   }

   @axl
   public static record j(ij<dqo> a) implements dqo {
      @Override
      public double a(dqo.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dqo.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dqo a(dqo.f $$0) {
         return $$0.apply(new dqp.j(new ij.a<>(this.a.a().a($$0))));
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
      public awc<? extends dqo> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public ij<dqo> j() {
         return this.a;
      }
   }

   protected static record k(dqp.k.a a, dqo e, double f, double g) implements dqp.p {
      public static dqp.k a(dqp.k.a $$0, dqo $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dqp.k.a.a && $$0 != dqp.k.a.b ? new dqp.k($$0, $$1, $$3, $$4) : new dqp.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dqp.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = awi.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dqp.k b(dqo.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public awc<? extends dqo> c() {
         return this.a.h;
      }

      public dqp.k.a k() {
         return this.a;
      }

      @Override
      public dqo aF_() {
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

      static enum a implements axc {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final awc<dqp.k> h = dqp.a($$0x -> dqp.k.a(this, $$0x), dqp.k::aF_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dqp.l.a a, dqo e) implements dqp.m {
      @Override
      public double a(dqo.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dqo.a $$1) {
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
      public dqp.l.a j() {
         return this.a;
      }

      @Override
      public dqo k() {
         return this.e;
      }

      static enum a implements axc {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final awc<dqp.m> g = dqp.a($$0x -> new dqp.l(this, $$0x), dqp.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dqo {
      dqp.l.a j();

      dqo k();

      @Override
      default awc<? extends dqo> c() {
         return this.j().g;
      }

      @Override
      default dqo a(dqo.f $$0) {
         return $$0.apply(new dqp.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dqp.n.a e, dqo f, double g, double h, double i) implements dqp.p, dqp.y {
      @Override
      public dqp.y.a j() {
         return this.e == dqp.n.a.a ? dqp.y.a.b : dqp.y.a.a;
      }

      @Override
      public dqo k() {
         return dqp.a(this.i);
      }

      @Override
      public dqo l() {
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
      public dqo a(dqo.f $$0) {
         dqo $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dqp.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dqp.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dqp.n.a m() {
         return this.e;
      }

      @Override
      public dqo aF_() {
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

   protected static record o(dqo.c f, @Deprecated double g, double h) implements dqo {
      public static final MapCodec<dqp.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dqo.c.a.fieldOf("noise").forGetter(dqp.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dqp.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dqp.o::l)
               )
               .apply($$0, dqp.o::new)
      );
      public static final awc<dqp.o> e = dqp.a(a);

      @Override
      public double a(dqo.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dqo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dqo a(dqo.f $$0) {
         return $$0.apply(new dqp.o($$0.a(this.f), this.g, this.h));
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
      public awc<? extends dqo> c() {
         return e;
      }

      public dqo.c j() {
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

   interface p extends dqo {
      dqo aF_();

      @Override
      default double a(dqo.b $$0) {
         return this.a(this.aF_().a($$0));
      }

      @Override
      default void a(double[] $$0, dqo.a $$1) {
         this.aF_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dqo f, double g, double h, dqo i, dqo j) implements dqo {
      public static final MapCodec<dqp.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dqo.d.fieldOf("input").forGetter(dqp.q::j),
                  dqp.d.fieldOf("min_inclusive").forGetter(dqp.q::k),
                  dqp.d.fieldOf("max_exclusive").forGetter(dqp.q::l),
                  dqo.d.fieldOf("when_in_range").forGetter(dqp.q::m),
                  dqo.d.fieldOf("when_out_of_range").forGetter(dqp.q::n)
               )
               .apply($$0, dqp.q::new)
      );
      public static final awc<dqp.q> e = dqp.a(a);

      @Override
      public double a(dqo.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dqo.a $$1) {
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
      public dqo a(dqo.f $$0) {
         return $$0.apply(new dqp.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public awc<? extends dqo> c() {
         return e;
      }

      public dqo j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dqo m() {
         return this.i;
      }

      public dqo n() {
         return this.j;
      }
   }

   protected static record r(dqo.c a) implements dqp.u {
      static final awc<dqp.r> e = dqp.a(dqo.c.a, dqp.r::new, dqp.r::j);

      @Override
      public double a(dqo.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dqo a(dqo.f $$0) {
         return $$0.apply(new dqp.r($$0.a(this.a)));
      }

      @Override
      public awc<? extends dqo> c() {
         return e;
      }

      @Override
      public dqo.c j() {
         return this.a;
      }
   }

   protected static record s(dqo.c a) implements dqp.u {
      static final awc<dqp.s> e = dqp.a(dqo.c.a, dqp.s::new, dqp.s::j);

      @Override
      public double a(dqo.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dqo a(dqo.f $$0) {
         return $$0.apply(new dqp.s($$0.a(this.a)));
      }

      @Override
      public awc<? extends dqo> c() {
         return e;
      }

      @Override
      public dqo.c j() {
         return this.a;
      }
   }

   protected static record t(dqo.c a) implements dqp.u {
      static final awc<dqp.t> e = dqp.a(dqo.c.a, dqp.t::new, dqp.t::j);

      @Override
      public double a(dqo.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dqo a(dqo.f $$0) {
         return $$0.apply(new dqp.t($$0.a(this.a)));
      }

      @Override
      public awc<? extends dqo> c() {
         return e;
      }

      @Override
      public dqo.c j() {
         return this.a;
      }
   }

   interface u extends dqo {
      dqo.c j();

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
      default void a(double[] $$0, dqo.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dqo e, dqo f, dqo g, double h, double i, dqo.c j) implements dqo {
      private static final MapCodec<dqp.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dqo.d.fieldOf("shift_x").forGetter(dqp.v::j),
                  dqo.d.fieldOf("shift_y").forGetter(dqp.v::k),
                  dqo.d.fieldOf("shift_z").forGetter(dqp.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dqp.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dqp.v::n),
                  dqo.c.a.fieldOf("noise").forGetter(dqp.v::o)
               )
               .apply($$0, dqp.v::new)
      );
      public static final awc<dqp.v> a = dqp.a(k);

      @Override
      public double a(dqo.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dqo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dqo a(dqo.f $$0) {
         return $$0.apply(new dqp.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public awc<? extends dqo> c() {
         return a;
      }

      public dqo j() {
         return this.e;
      }

      public dqo k() {
         return this.f;
      }

      public dqo l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dqo.c o() {
         return this.j;
      }
   }

   public static record w(avk<dqp.w.b, dqp.w.a> e) implements dqo {
      private static final Codec<avk<dqp.w.b, dqp.w.a>> f = avk.a(dqp.w.a.b);
      private static final MapCodec<dqp.w> g = f.fieldOf("spline").xmap(dqp.w::new, dqp.w::j);
      public static final awc<dqp.w> a = dqp.a(g);

      @Override
      public double a(dqo.b $$0) {
         return (double)this.e.a(new dqp.w.b($$0));
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
      public void a(double[] $$0, dqo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dqo a(dqo.f $$0) {
         return $$0.apply(new dqp.w(this.e.a((avk.d<dqp.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public awc<? extends dqo> c() {
         return a;
      }

      public avk<dqp.w.b, dqp.w.a> j() {
         return this.e;
      }

      public static record a(ij<dqo> c) implements axi<dqp.w.b> {
         public static final Codec<dqp.w.a> b = dqo.c.xmap(dqp.w.a::new, dqp.w.a::a);

         @Override
         public String toString() {
            Optional<aix<dqo>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               aix<dqo> $$1 = $$0.get();
               if ($$1 == drc.d) {
                  return "continents";
               }

               if ($$1 == drc.e) {
                  return "erosion";
               }

               if ($$1 == drc.f) {
                  return "weirdness";
               }

               if ($$1 == drc.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dqp.w.b $$0) {
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

         public dqp.w.a a(dqo.f $$0) {
            return new dqp.w.a(new ij.a<>(this.c.a().a($$0)));
         }

         public ij<dqo> a() {
            return this.c;
         }
      }

      public static record b(dqo.b a) {
      }
   }

   interface x extends dqo {
      dqo j();

      @Override
      default double a(dqo.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dqo.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dqo.b var1, double var2);
   }

   interface y extends dqo {
      Logger a = LogUtils.getLogger();

      static dqp.y a(dqp.y.a $$0, dqo $$1, dqo $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dqp.y.a.c || $$0 == dqp.y.a.d) {
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
         if ($$0 == dqp.y.a.b || $$0 == dqp.y.a.a) {
            if ($$1 instanceof dqp.h $$11) {
               return new dqp.n($$0 == dqp.y.a.a ? dqp.n.a.b : dqp.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dqp.h $$12) {
               return new dqp.n($$0 == dqp.y.a.a ? dqp.n.a.b : dqp.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dqp.a($$0, $$1, $$2, $$9, $$10);
      }

      dqp.y.a j();

      dqo k();

      dqo l();

      @Override
      default awc<? extends dqo> c() {
         return this.j().e;
      }

      public static enum a implements axc {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final awc<dqp.y> e = dqp.a((BiFunction<dqo, dqo, dqp.y>)(($$0x, $$1) -> dqp.y.a(this, $$0x, $$1)), dqp.y::k, dqp.y::l);
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

   protected static record z(dqo e, dqo.c f, dqp.z.a g) implements dqp.x {
      private static final MapCodec<dqp.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dqo.d.fieldOf("input").forGetter(dqp.z::j),
                  dqo.c.a.fieldOf("noise").forGetter(dqp.z::k),
                  dqp.z.a.c.fieldOf("rarity_value_mapper").forGetter(dqp.z::l)
               )
               .apply($$0, dqp.z::new)
      );
      public static final awc<dqp.z> a = dqp.a(h);

      @Override
      public double a(dqo.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dqo a(dqo.f $$0) {
         return $$0.apply(new dqp.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public awc<? extends dqo> c() {
         return a;
      }

      @Override
      public dqo j() {
         return this.e;
      }

      public dqo.c k() {
         return this.f;
      }

      public dqp.z.a l() {
         return this.g;
      }

      public static enum a implements axc {
         a("type_1", drc.a::b, 2.0),
         b("type_2", drc.a::a, 3.0);

         public static final Codec<dqp.z.a> c = axc.a(dqp.z.a::values);
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
