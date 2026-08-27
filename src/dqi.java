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

public final class dqi {
   private static final Codec<dqh> c = kf.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dqh> b = Codec.either(d, c)
      .xmap($$0 -> (dqh)$$0.map(dqi::a, Function.identity()), $$0 -> $$0 instanceof dqi.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dqh> a(iv<Codec<? extends dqh>> $$0) {
      a($$0, "blend_alpha", dqi.d.e);
      a($$0, "blend_offset", dqi.f.e);
      a($$0, "beardifier", dqi.b.e);
      a($$0, "old_blended_noise", efp.a);

      for (dqi.l.a $$1 : dqi.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dqi.o.e);
      a($$0, "end_islands", dqi.i.a);
      a($$0, "weird_scaled_sampler", dqi.z.a);
      a($$0, "shifted_noise", dqi.v.a);
      a($$0, "range_choice", dqi.q.e);
      a($$0, "shift_a", dqi.s.e);
      a($$0, "shift_b", dqi.t.e);
      a($$0, "shift", dqi.r.e);
      a($$0, "blend_density", dqi.e.e);
      a($$0, "clamp", dqi.g.a);

      for (dqi.k.a $$2 : dqi.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dqi.y.a $$3 : dqi.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dqi.w.a);
      a($$0, "constant", dqi.h.e);
      return a($$0, "y_clamped_gradient", dqi.aa.a);
   }

   private static Codec<? extends dqh> a(iv<Codec<? extends dqh>> $$0, String $$1, awb<? extends dqh> $$2) {
      return iv.a($$0, $$1, $$2.a());
   }

   static <A, O> awb<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return awb.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> awb<O> a(Function<dqh, O> $$0, Function<O, dqh> $$1) {
      return a(dqh.d, $$0, $$1);
   }

   static <O> awb<O> a(BiFunction<dqh, dqh, O> $$0, Function<O, dqh> $$1, Function<O, dqh> $$2) {
      return awb.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dqh.d.fieldOf("argument1").forGetter($$1), dqh.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> awb<O> a(MapCodec<O> $$0) {
      return awb.a($$0);
   }

   private dqi() {
   }

   public static dqh a(dqh $$0) {
      return new dqi.l(dqi.l.a.a, $$0);
   }

   public static dqh b(dqh $$0) {
      return new dqi.l(dqi.l.a.b, $$0);
   }

   public static dqh c(dqh $$0) {
      return new dqi.l(dqi.l.a.c, $$0);
   }

   public static dqh d(dqh $$0) {
      return new dqi.l(dqi.l.a.d, $$0);
   }

   public static dqh e(dqh $$0) {
      return new dqi.l(dqi.l.a.e, $$0);
   }

   public static dqh a(ij<efs.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dqi.o(new dqh.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dqh a(ij<efs.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dqh a(ij<efs.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dqh a(dqh $$0, dqh $$1, double $$2, ij<efs.a> $$3) {
      return new dqi.v($$0, a(), $$1, $$2, 0.0, new dqh.c($$3));
   }

   public static dqh a(ij<efs.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dqh b(ij<efs.a> $$0, double $$1, double $$2) {
      return new dqi.o(new dqh.c($$0), $$1, $$2);
   }

   public static dqh a(ij<efs.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dqh a(dqh $$0, double $$1, double $$2, dqh $$3, dqh $$4) {
      return new dqi.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dqh b(ij<efs.a> $$0) {
      return new dqi.s(new dqh.c($$0));
   }

   public static dqh c(ij<efs.a> $$0) {
      return new dqi.t(new dqh.c($$0));
   }

   public static dqh d(ij<efs.a> $$0) {
      return new dqi.r(new dqh.c($$0));
   }

   public static dqh f(dqh $$0) {
      return new dqi.e($$0);
   }

   public static dqh a(long $$0) {
      return new dqi.i($$0);
   }

   public static dqh a(dqh $$0, ij<efs.a> $$1, dqi.z.a $$2) {
      return new dqi.z($$0, new dqh.c($$1), $$2);
   }

   public static dqh a(dqh $$0, dqh $$1) {
      return dqi.y.a(dqi.y.a.a, $$0, $$1);
   }

   public static dqh b(dqh $$0, dqh $$1) {
      return dqi.y.a(dqi.y.a.b, $$0, $$1);
   }

   public static dqh c(dqh $$0, dqh $$1) {
      return dqi.y.a(dqi.y.a.c, $$0, $$1);
   }

   public static dqh d(dqh $$0, dqh $$1) {
      return dqi.y.a(dqi.y.a.d, $$0, $$1);
   }

   public static dqh a(avj<dqi.w.b, dqi.w.a> $$0) {
      return new dqi.w($$0);
   }

   public static dqh a() {
      return dqi.h.f;
   }

   public static dqh a(double $$0) {
      return new dqi.h($$0);
   }

   public static dqh a(int $$0, int $$1, double $$2, double $$3) {
      return new dqi.aa($$0, $$1, $$2, $$3);
   }

   public static dqh a(dqh $$0, dqi.k.a $$1) {
      return dqi.k.a($$1, $$0);
   }

   private static dqh a(dqh $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dqh b() {
      return dqi.d.a;
   }

   public static dqh c() {
      return dqi.f.a;
   }

   public static dqh a(dqh $$0, dqh $$1, dqh $$2) {
      if ($$1 instanceof dqi.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dqh $$4 = d($$0);
         dqh $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dqh a(dqh $$0, double $$1, dqh $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dqi.y.a e, dqh f, dqh g, double h, double i) implements dqi.y {
      @Override
      public double a(dqh.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dqh.a $$1) {
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
      public dqh a(dqh.f $$0) {
         return $$0.apply(dqi.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dqi.y.a j() {
         return this.e;
      }

      @Override
      public dqh k() {
         return this.f;
      }

      @Override
      public dqh l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dqh.d {
      private static final MapCodec<dqi.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(doo.e * 2, doo.d * 2).fieldOf("from_y").forGetter(dqi.aa::j),
                  Codec.intRange(doo.e * 2, doo.d * 2).fieldOf("to_y").forGetter(dqi.aa::k),
                  dqi.d.fieldOf("from_value").forGetter(dqi.aa::l),
                  dqi.d.fieldOf("to_value").forGetter(dqi.aa::m)
               )
               .apply($$0, dqi.aa::new)
      );
      public static final awb<dqi.aa> a = dqi.a(i);

      @Override
      public double a(dqh.b $$0) {
         return awh.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public awb<? extends dqh> c() {
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

   protected static enum b implements dqi.c {
      a;

      @Override
      public double a(dqh.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dqh.a $$1) {
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

   public interface c extends dqh.d {
      awb<dqh> e = awb.a(MapCodec.unit(dqi.b.a));

      @Override
      default awb<? extends dqh> c() {
         return e;
      }
   }

   protected static enum d implements dqh.d {
      a;

      public static final awb<dqh> e = awb.a(MapCodec.unit(a));

      @Override
      public double a(dqh.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dqh.a $$1) {
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
      public awb<? extends dqh> c() {
         return e;
      }
   }

   static record e(dqh a) implements dqi.x {
      static final awb<dqi.e> e = dqi.a(dqi.e::new, dqi.e::j);

      @Override
      public double a(dqh.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dqh a(dqh.f $$0) {
         return $$0.apply(new dqi.e(this.a.a($$0)));
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
      public awb<? extends dqh> c() {
         return e;
      }

      @Override
      public dqh j() {
         return this.a;
      }
   }

   protected static enum f implements dqh.d {
      a;

      public static final awb<dqh> e = awb.a(MapCodec.unit(a));

      @Override
      public double a(dqh.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dqh.a $$1) {
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
      public awb<? extends dqh> c() {
         return e;
      }
   }

   protected static record g(dqh e, double f, double g) implements dqi.p {
      private static final MapCodec<dqi.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dqh.b.fieldOf("input").forGetter(dqi.g::aF_), dqi.d.fieldOf("min").forGetter(dqi.g::a), dqi.d.fieldOf("max").forGetter(dqi.g::b))
               .apply($$0, dqi.g::new)
      );
      public static final awb<dqi.g> a = dqi.a(h);

      @Override
      public double a(double $$0) {
         return awh.a($$0, this.f, this.g);
      }

      @Override
      public dqh a(dqh.f $$0) {
         return new dqi.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public awb<? extends dqh> c() {
         return a;
      }

      @Override
      public dqh aF_() {
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

   static record h(double a) implements dqh.d {
      static final awb<dqi.h> e = dqi.a(dqi.d, dqi.h::new, dqi.h::j);
      static final dqi.h f = new dqi.h(0.0);

      @Override
      public void a(double[] $$0, dqh.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public awb<? extends dqh> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dqh.d {
      public static final awb<dqi.i> a = awb.a(MapCodec.unit(new dqi.i(0L)));
      private static final float e = -0.9F;
      private final efv f;

      public i(long $$0) {
         awo $$1 = new dqp($$0);
         $$1.b(17292);
         this.f = new efv($$1);
      }

      private static float a(efv $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - awh.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = awh.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (awh.e((float)$$10) * 3439.0F + awh.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - awh.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = awh.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dqh.b $$0) {
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
      public awb<? extends dqh> c() {
         return a;
      }
   }

   @axl
   public static record j(ij<dqh> a) implements dqh {
      @Override
      public double a(dqh.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dqh.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dqh a(dqh.f $$0) {
         return $$0.apply(new dqi.j(new ij.a<>(this.a.a().a($$0))));
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
      public awb<? extends dqh> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public ij<dqh> j() {
         return this.a;
      }
   }

   protected static record k(dqi.k.a a, dqh e, double f, double g) implements dqi.p {
      public static dqi.k a(dqi.k.a $$0, dqh $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dqi.k.a.a && $$0 != dqi.k.a.b ? new dqi.k($$0, $$1, $$3, $$4) : new dqi.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dqi.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = awh.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dqi.k b(dqh.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public awb<? extends dqh> c() {
         return this.a.h;
      }

      public dqi.k.a k() {
         return this.a;
      }

      @Override
      public dqh aF_() {
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
         final awb<dqi.k> h = dqi.a($$0x -> dqi.k.a(this, $$0x), dqi.k::aF_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dqi.l.a a, dqh e) implements dqi.m {
      @Override
      public double a(dqh.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dqh.a $$1) {
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
      public dqi.l.a j() {
         return this.a;
      }

      @Override
      public dqh k() {
         return this.e;
      }

      static enum a implements axc {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final awb<dqi.m> g = dqi.a($$0x -> new dqi.l(this, $$0x), dqi.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dqh {
      dqi.l.a j();

      dqh k();

      @Override
      default awb<? extends dqh> c() {
         return this.j().g;
      }

      @Override
      default dqh a(dqh.f $$0) {
         return $$0.apply(new dqi.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dqi.n.a e, dqh f, double g, double h, double i) implements dqi.p, dqi.y {
      @Override
      public dqi.y.a j() {
         return this.e == dqi.n.a.a ? dqi.y.a.b : dqi.y.a.a;
      }

      @Override
      public dqh k() {
         return dqi.a(this.i);
      }

      @Override
      public dqh l() {
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
      public dqh a(dqh.f $$0) {
         dqh $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dqi.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dqi.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dqi.n.a m() {
         return this.e;
      }

      @Override
      public dqh aF_() {
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

   protected static record o(dqh.c f, @Deprecated double g, double h) implements dqh {
      public static final MapCodec<dqi.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dqh.c.a.fieldOf("noise").forGetter(dqi.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dqi.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dqi.o::l)
               )
               .apply($$0, dqi.o::new)
      );
      public static final awb<dqi.o> e = dqi.a(a);

      @Override
      public double a(dqh.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dqh.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dqh a(dqh.f $$0) {
         return $$0.apply(new dqi.o($$0.a(this.f), this.g, this.h));
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
      public awb<? extends dqh> c() {
         return e;
      }

      public dqh.c j() {
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

   interface p extends dqh {
      dqh aF_();

      @Override
      default double a(dqh.b $$0) {
         return this.a(this.aF_().a($$0));
      }

      @Override
      default void a(double[] $$0, dqh.a $$1) {
         this.aF_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dqh f, double g, double h, dqh i, dqh j) implements dqh {
      public static final MapCodec<dqi.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dqh.d.fieldOf("input").forGetter(dqi.q::j),
                  dqi.d.fieldOf("min_inclusive").forGetter(dqi.q::k),
                  dqi.d.fieldOf("max_exclusive").forGetter(dqi.q::l),
                  dqh.d.fieldOf("when_in_range").forGetter(dqi.q::m),
                  dqh.d.fieldOf("when_out_of_range").forGetter(dqi.q::n)
               )
               .apply($$0, dqi.q::new)
      );
      public static final awb<dqi.q> e = dqi.a(a);

      @Override
      public double a(dqh.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dqh.a $$1) {
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
      public dqh a(dqh.f $$0) {
         return $$0.apply(new dqi.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public awb<? extends dqh> c() {
         return e;
      }

      public dqh j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dqh m() {
         return this.i;
      }

      public dqh n() {
         return this.j;
      }
   }

   protected static record r(dqh.c a) implements dqi.u {
      static final awb<dqi.r> e = dqi.a(dqh.c.a, dqi.r::new, dqi.r::j);

      @Override
      public double a(dqh.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dqh a(dqh.f $$0) {
         return $$0.apply(new dqi.r($$0.a(this.a)));
      }

      @Override
      public awb<? extends dqh> c() {
         return e;
      }

      @Override
      public dqh.c j() {
         return this.a;
      }
   }

   protected static record s(dqh.c a) implements dqi.u {
      static final awb<dqi.s> e = dqi.a(dqh.c.a, dqi.s::new, dqi.s::j);

      @Override
      public double a(dqh.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dqh a(dqh.f $$0) {
         return $$0.apply(new dqi.s($$0.a(this.a)));
      }

      @Override
      public awb<? extends dqh> c() {
         return e;
      }

      @Override
      public dqh.c j() {
         return this.a;
      }
   }

   protected static record t(dqh.c a) implements dqi.u {
      static final awb<dqi.t> e = dqi.a(dqh.c.a, dqi.t::new, dqi.t::j);

      @Override
      public double a(dqh.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dqh a(dqh.f $$0) {
         return $$0.apply(new dqi.t($$0.a(this.a)));
      }

      @Override
      public awb<? extends dqh> c() {
         return e;
      }

      @Override
      public dqh.c j() {
         return this.a;
      }
   }

   interface u extends dqh {
      dqh.c j();

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
      default void a(double[] $$0, dqh.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dqh e, dqh f, dqh g, double h, double i, dqh.c j) implements dqh {
      private static final MapCodec<dqi.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dqh.d.fieldOf("shift_x").forGetter(dqi.v::j),
                  dqh.d.fieldOf("shift_y").forGetter(dqi.v::k),
                  dqh.d.fieldOf("shift_z").forGetter(dqi.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dqi.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dqi.v::n),
                  dqh.c.a.fieldOf("noise").forGetter(dqi.v::o)
               )
               .apply($$0, dqi.v::new)
      );
      public static final awb<dqi.v> a = dqi.a(k);

      @Override
      public double a(dqh.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dqh.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dqh a(dqh.f $$0) {
         return $$0.apply(new dqi.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public awb<? extends dqh> c() {
         return a;
      }

      public dqh j() {
         return this.e;
      }

      public dqh k() {
         return this.f;
      }

      public dqh l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dqh.c o() {
         return this.j;
      }
   }

   public static record w(avj<dqi.w.b, dqi.w.a> e) implements dqh {
      private static final Codec<avj<dqi.w.b, dqi.w.a>> f = avj.a(dqi.w.a.b);
      private static final MapCodec<dqi.w> g = f.fieldOf("spline").xmap(dqi.w::new, dqi.w::j);
      public static final awb<dqi.w> a = dqi.a(g);

      @Override
      public double a(dqh.b $$0) {
         return (double)this.e.a(new dqi.w.b($$0));
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
      public void a(double[] $$0, dqh.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dqh a(dqh.f $$0) {
         return $$0.apply(new dqi.w(this.e.a((avj.d<dqi.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public awb<? extends dqh> c() {
         return a;
      }

      public avj<dqi.w.b, dqi.w.a> j() {
         return this.e;
      }

      public static record a(ij<dqh> c) implements axi<dqi.w.b> {
         public static final Codec<dqi.w.a> b = dqh.c.xmap(dqi.w.a::new, dqi.w.a::a);

         @Override
         public String toString() {
            Optional<aix<dqh>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               aix<dqh> $$1 = $$0.get();
               if ($$1 == dqv.d) {
                  return "continents";
               }

               if ($$1 == dqv.e) {
                  return "erosion";
               }

               if ($$1 == dqv.f) {
                  return "weirdness";
               }

               if ($$1 == dqv.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dqi.w.b $$0) {
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

         public dqi.w.a a(dqh.f $$0) {
            return new dqi.w.a(new ij.a<>(this.c.a().a($$0)));
         }

         public ij<dqh> a() {
            return this.c;
         }
      }

      public static record b(dqh.b a) {
      }
   }

   interface x extends dqh {
      dqh j();

      @Override
      default double a(dqh.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dqh.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dqh.b var1, double var2);
   }

   interface y extends dqh {
      Logger a = LogUtils.getLogger();

      static dqi.y a(dqi.y.a $$0, dqh $$1, dqh $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dqi.y.a.c || $$0 == dqi.y.a.d) {
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
         if ($$0 == dqi.y.a.b || $$0 == dqi.y.a.a) {
            if ($$1 instanceof dqi.h $$11) {
               return new dqi.n($$0 == dqi.y.a.a ? dqi.n.a.b : dqi.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dqi.h $$12) {
               return new dqi.n($$0 == dqi.y.a.a ? dqi.n.a.b : dqi.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dqi.a($$0, $$1, $$2, $$9, $$10);
      }

      dqi.y.a j();

      dqh k();

      dqh l();

      @Override
      default awb<? extends dqh> c() {
         return this.j().e;
      }

      public static enum a implements axc {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final awb<dqi.y> e = dqi.a((BiFunction<dqh, dqh, dqi.y>)(($$0x, $$1) -> dqi.y.a(this, $$0x, $$1)), dqi.y::k, dqi.y::l);
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

   protected static record z(dqh e, dqh.c f, dqi.z.a g) implements dqi.x {
      private static final MapCodec<dqi.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dqh.d.fieldOf("input").forGetter(dqi.z::j),
                  dqh.c.a.fieldOf("noise").forGetter(dqi.z::k),
                  dqi.z.a.c.fieldOf("rarity_value_mapper").forGetter(dqi.z::l)
               )
               .apply($$0, dqi.z::new)
      );
      public static final awb<dqi.z> a = dqi.a(h);

      @Override
      public double a(dqh.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dqh a(dqh.f $$0) {
         return $$0.apply(new dqi.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public awb<? extends dqh> c() {
         return a;
      }

      @Override
      public dqh j() {
         return this.e;
      }

      public dqh.c k() {
         return this.f;
      }

      public dqi.z.a l() {
         return this.g;
      }

      public static enum a implements axc {
         a("type_1", dqv.a::b, 2.0),
         b("type_2", dqv.a::a, 3.0);

         public static final Codec<dqi.z.a> c = axc.a(dqi.z.a::values);
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
