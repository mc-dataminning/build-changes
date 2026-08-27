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

public final class dsi {
   private static final Codec<dsh> c = ki.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dsh> b = Codec.either(d, c)
      .xmap($$0 -> (dsh)$$0.map(dsi::a, Function.identity()), $$0 -> $$0 instanceof dsi.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dsh> a(iy<Codec<? extends dsh>> $$0) {
      a($$0, "blend_alpha", dsi.d.e);
      a($$0, "blend_offset", dsi.f.e);
      a($$0, "beardifier", dsi.b.e);
      a($$0, "old_blended_noise", ehp.a);

      for (dsi.l.a $$1 : dsi.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dsi.o.e);
      a($$0, "end_islands", dsi.i.a);
      a($$0, "weird_scaled_sampler", dsi.z.a);
      a($$0, "shifted_noise", dsi.v.a);
      a($$0, "range_choice", dsi.q.e);
      a($$0, "shift_a", dsi.s.e);
      a($$0, "shift_b", dsi.t.e);
      a($$0, "shift", dsi.r.e);
      a($$0, "blend_density", dsi.e.e);
      a($$0, "clamp", dsi.g.a);

      for (dsi.k.a $$2 : dsi.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dsi.y.a $$3 : dsi.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dsi.w.a);
      a($$0, "constant", dsi.h.e);
      return a($$0, "y_clamped_gradient", dsi.aa.a);
   }

   private static Codec<? extends dsh> a(iy<Codec<? extends dsh>> $$0, String $$1, awq<? extends dsh> $$2) {
      return iy.a($$0, $$1, $$2.a());
   }

   static <A, O> awq<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return awq.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> awq<O> a(Function<dsh, O> $$0, Function<O, dsh> $$1) {
      return a(dsh.d, $$0, $$1);
   }

   static <O> awq<O> a(BiFunction<dsh, dsh, O> $$0, Function<O, dsh> $$1, Function<O, dsh> $$2) {
      return awq.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dsh.d.fieldOf("argument1").forGetter($$1), dsh.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> awq<O> a(MapCodec<O> $$0) {
      return awq.a($$0);
   }

   private dsi() {
   }

   public static dsh a(dsh $$0) {
      return new dsi.l(dsi.l.a.a, $$0);
   }

   public static dsh b(dsh $$0) {
      return new dsi.l(dsi.l.a.b, $$0);
   }

   public static dsh c(dsh $$0) {
      return new dsi.l(dsi.l.a.c, $$0);
   }

   public static dsh d(dsh $$0) {
      return new dsi.l(dsi.l.a.d, $$0);
   }

   public static dsh e(dsh $$0) {
      return new dsi.l(dsi.l.a.e, $$0);
   }

   public static dsh a(il<ehs.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dsi.o(new dsh.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dsh a(il<ehs.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dsh a(il<ehs.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dsh a(dsh $$0, dsh $$1, double $$2, il<ehs.a> $$3) {
      return new dsi.v($$0, a(), $$1, $$2, 0.0, new dsh.c($$3));
   }

   public static dsh a(il<ehs.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dsh b(il<ehs.a> $$0, double $$1, double $$2) {
      return new dsi.o(new dsh.c($$0), $$1, $$2);
   }

   public static dsh a(il<ehs.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dsh a(dsh $$0, double $$1, double $$2, dsh $$3, dsh $$4) {
      return new dsi.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dsh b(il<ehs.a> $$0) {
      return new dsi.s(new dsh.c($$0));
   }

   public static dsh c(il<ehs.a> $$0) {
      return new dsi.t(new dsh.c($$0));
   }

   public static dsh d(il<ehs.a> $$0) {
      return new dsi.r(new dsh.c($$0));
   }

   public static dsh f(dsh $$0) {
      return new dsi.e($$0);
   }

   public static dsh a(long $$0) {
      return new dsi.i($$0);
   }

   public static dsh a(dsh $$0, il<ehs.a> $$1, dsi.z.a $$2) {
      return new dsi.z($$0, new dsh.c($$1), $$2);
   }

   public static dsh a(dsh $$0, dsh $$1) {
      return dsi.y.a(dsi.y.a.a, $$0, $$1);
   }

   public static dsh b(dsh $$0, dsh $$1) {
      return dsi.y.a(dsi.y.a.b, $$0, $$1);
   }

   public static dsh c(dsh $$0, dsh $$1) {
      return dsi.y.a(dsi.y.a.c, $$0, $$1);
   }

   public static dsh d(dsh $$0, dsh $$1) {
      return dsi.y.a(dsi.y.a.d, $$0, $$1);
   }

   public static dsh a(avy<dsi.w.b, dsi.w.a> $$0) {
      return new dsi.w($$0);
   }

   public static dsh a() {
      return dsi.h.f;
   }

   public static dsh a(double $$0) {
      return new dsi.h($$0);
   }

   public static dsh a(int $$0, int $$1, double $$2, double $$3) {
      return new dsi.aa($$0, $$1, $$2, $$3);
   }

   public static dsh a(dsh $$0, dsi.k.a $$1) {
      return dsi.k.a($$1, $$0);
   }

   private static dsh a(dsh $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dsh b() {
      return dsi.d.a;
   }

   public static dsh c() {
      return dsi.f.a;
   }

   public static dsh a(dsh $$0, dsh $$1, dsh $$2) {
      if ($$1 instanceof dsi.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dsh $$4 = d($$0);
         dsh $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dsh a(dsh $$0, double $$1, dsh $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dsi.y.a e, dsh f, dsh g, double h, double i) implements dsi.y {
      @Override
      public double a(dsh.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dsh.a $$1) {
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
      public dsh a(dsh.f $$0) {
         return $$0.apply(dsi.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dsi.y.a j() {
         return this.e;
      }

      @Override
      public dsh k() {
         return this.f;
      }

      @Override
      public dsh l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dsh.d {
      private static final MapCodec<dsi.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dqo.e * 2, dqo.d * 2).fieldOf("from_y").forGetter(dsi.aa::j),
                  Codec.intRange(dqo.e * 2, dqo.d * 2).fieldOf("to_y").forGetter(dsi.aa::k),
                  dsi.d.fieldOf("from_value").forGetter(dsi.aa::l),
                  dsi.d.fieldOf("to_value").forGetter(dsi.aa::m)
               )
               .apply($$0, dsi.aa::new)
      );
      public static final awq<dsi.aa> a = dsi.a(i);

      @Override
      public double a(dsh.b $$0) {
         return aww.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public awq<? extends dsh> c() {
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

   protected static enum b implements dsi.c {
      a;

      @Override
      public double a(dsh.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dsh.a $$1) {
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

   public interface c extends dsh.d {
      awq<dsh> e = awq.a(MapCodec.unit(dsi.b.a));

      @Override
      default awq<? extends dsh> c() {
         return e;
      }
   }

   protected static enum d implements dsh.d {
      a;

      public static final awq<dsh> e = awq.a(MapCodec.unit(a));

      @Override
      public double a(dsh.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dsh.a $$1) {
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
      public awq<? extends dsh> c() {
         return e;
      }
   }

   static record e(dsh a) implements dsi.x {
      static final awq<dsi.e> e = dsi.a(dsi.e::new, dsi.e::j);

      @Override
      public double a(dsh.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dsh a(dsh.f $$0) {
         return $$0.apply(new dsi.e(this.a.a($$0)));
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
      public awq<? extends dsh> c() {
         return e;
      }

      @Override
      public dsh j() {
         return this.a;
      }
   }

   protected static enum f implements dsh.d {
      a;

      public static final awq<dsh> e = awq.a(MapCodec.unit(a));

      @Override
      public double a(dsh.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dsh.a $$1) {
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
      public awq<? extends dsh> c() {
         return e;
      }
   }

   protected static record g(dsh e, double f, double g) implements dsi.p {
      private static final MapCodec<dsi.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dsh.b.fieldOf("input").forGetter(dsi.g::aD_), dsi.d.fieldOf("min").forGetter(dsi.g::a), dsi.d.fieldOf("max").forGetter(dsi.g::b))
               .apply($$0, dsi.g::new)
      );
      public static final awq<dsi.g> a = dsi.a(h);

      @Override
      public double a(double $$0) {
         return aww.a($$0, this.f, this.g);
      }

      @Override
      public dsh a(dsh.f $$0) {
         return new dsi.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public awq<? extends dsh> c() {
         return a;
      }

      @Override
      public dsh aD_() {
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

   static record h(double a) implements dsh.d {
      static final awq<dsi.h> e = dsi.a(dsi.d, dsi.h::new, dsi.h::j);
      static final dsi.h f = new dsi.h(0.0);

      @Override
      public void a(double[] $$0, dsh.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public awq<? extends dsh> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dsh.d {
      public static final awq<dsi.i> a = awq.a(MapCodec.unit(new dsi.i(0L)));
      private static final float e = -0.9F;
      private final ehv f;

      public i(long $$0) {
         axd $$1 = new dsp($$0);
         $$1.b(17292);
         this.f = new ehv($$1);
      }

      private static float a(ehv $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - aww.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = aww.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (aww.e((float)$$10) * 3439.0F + aww.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - aww.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = aww.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dsh.b $$0) {
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
      public awq<? extends dsh> c() {
         return a;
      }
   }

   @axz
   public static record j(il<dsh> a) implements dsh {
      @Override
      public double a(dsh.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dsh.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dsh a(dsh.f $$0) {
         return $$0.apply(new dsi.j(new il.a<>(this.a.a().a($$0))));
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
      public awq<? extends dsh> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public il<dsh> j() {
         return this.a;
      }
   }

   protected static record k(dsi.k.a a, dsh e, double f, double g) implements dsi.p {
      public static dsi.k a(dsi.k.a $$0, dsh $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dsi.k.a.a && $$0 != dsi.k.a.b ? new dsi.k($$0, $$1, $$3, $$4) : new dsi.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dsi.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = aww.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dsi.k b(dsh.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public awq<? extends dsh> c() {
         return this.a.h;
      }

      public dsi.k.a k() {
         return this.a;
      }

      @Override
      public dsh aD_() {
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

      static enum a implements axq {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final awq<dsi.k> h = dsi.a($$0x -> dsi.k.a(this, $$0x), dsi.k::aD_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dsi.l.a a, dsh e) implements dsi.m {
      @Override
      public double a(dsh.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dsh.a $$1) {
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
      public dsi.l.a j() {
         return this.a;
      }

      @Override
      public dsh k() {
         return this.e;
      }

      static enum a implements axq {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final awq<dsi.m> g = dsi.a($$0x -> new dsi.l(this, $$0x), dsi.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dsh {
      dsi.l.a j();

      dsh k();

      @Override
      default awq<? extends dsh> c() {
         return this.j().g;
      }

      @Override
      default dsh a(dsh.f $$0) {
         return $$0.apply(new dsi.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dsi.n.a e, dsh f, double g, double h, double i) implements dsi.p, dsi.y {
      @Override
      public dsi.y.a j() {
         return this.e == dsi.n.a.a ? dsi.y.a.b : dsi.y.a.a;
      }

      @Override
      public dsh k() {
         return dsi.a(this.i);
      }

      @Override
      public dsh l() {
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
      public dsh a(dsh.f $$0) {
         dsh $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dsi.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dsi.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dsi.n.a m() {
         return this.e;
      }

      @Override
      public dsh aD_() {
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

   protected static record o(dsh.c f, @Deprecated double g, double h) implements dsh {
      public static final MapCodec<dsi.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dsh.c.a.fieldOf("noise").forGetter(dsi.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dsi.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dsi.o::l)
               )
               .apply($$0, dsi.o::new)
      );
      public static final awq<dsi.o> e = dsi.a(a);

      @Override
      public double a(dsh.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dsh.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dsh a(dsh.f $$0) {
         return $$0.apply(new dsi.o($$0.a(this.f), this.g, this.h));
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
      public awq<? extends dsh> c() {
         return e;
      }

      public dsh.c j() {
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

   interface p extends dsh {
      dsh aD_();

      @Override
      default double a(dsh.b $$0) {
         return this.a(this.aD_().a($$0));
      }

      @Override
      default void a(double[] $$0, dsh.a $$1) {
         this.aD_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dsh f, double g, double h, dsh i, dsh j) implements dsh {
      public static final MapCodec<dsi.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dsh.d.fieldOf("input").forGetter(dsi.q::j),
                  dsi.d.fieldOf("min_inclusive").forGetter(dsi.q::k),
                  dsi.d.fieldOf("max_exclusive").forGetter(dsi.q::l),
                  dsh.d.fieldOf("when_in_range").forGetter(dsi.q::m),
                  dsh.d.fieldOf("when_out_of_range").forGetter(dsi.q::n)
               )
               .apply($$0, dsi.q::new)
      );
      public static final awq<dsi.q> e = dsi.a(a);

      @Override
      public double a(dsh.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dsh.a $$1) {
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
      public dsh a(dsh.f $$0) {
         return $$0.apply(new dsi.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public awq<? extends dsh> c() {
         return e;
      }

      public dsh j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dsh m() {
         return this.i;
      }

      public dsh n() {
         return this.j;
      }
   }

   protected static record r(dsh.c a) implements dsi.u {
      static final awq<dsi.r> e = dsi.a(dsh.c.a, dsi.r::new, dsi.r::j);

      @Override
      public double a(dsh.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dsh a(dsh.f $$0) {
         return $$0.apply(new dsi.r($$0.a(this.a)));
      }

      @Override
      public awq<? extends dsh> c() {
         return e;
      }

      @Override
      public dsh.c j() {
         return this.a;
      }
   }

   protected static record s(dsh.c a) implements dsi.u {
      static final awq<dsi.s> e = dsi.a(dsh.c.a, dsi.s::new, dsi.s::j);

      @Override
      public double a(dsh.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dsh a(dsh.f $$0) {
         return $$0.apply(new dsi.s($$0.a(this.a)));
      }

      @Override
      public awq<? extends dsh> c() {
         return e;
      }

      @Override
      public dsh.c j() {
         return this.a;
      }
   }

   protected static record t(dsh.c a) implements dsi.u {
      static final awq<dsi.t> e = dsi.a(dsh.c.a, dsi.t::new, dsi.t::j);

      @Override
      public double a(dsh.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dsh a(dsh.f $$0) {
         return $$0.apply(new dsi.t($$0.a(this.a)));
      }

      @Override
      public awq<? extends dsh> c() {
         return e;
      }

      @Override
      public dsh.c j() {
         return this.a;
      }
   }

   interface u extends dsh {
      dsh.c j();

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
      default void a(double[] $$0, dsh.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dsh e, dsh f, dsh g, double h, double i, dsh.c j) implements dsh {
      private static final MapCodec<dsi.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dsh.d.fieldOf("shift_x").forGetter(dsi.v::j),
                  dsh.d.fieldOf("shift_y").forGetter(dsi.v::k),
                  dsh.d.fieldOf("shift_z").forGetter(dsi.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dsi.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dsi.v::n),
                  dsh.c.a.fieldOf("noise").forGetter(dsi.v::o)
               )
               .apply($$0, dsi.v::new)
      );
      public static final awq<dsi.v> a = dsi.a(k);

      @Override
      public double a(dsh.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dsh.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dsh a(dsh.f $$0) {
         return $$0.apply(new dsi.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public awq<? extends dsh> c() {
         return a;
      }

      public dsh j() {
         return this.e;
      }

      public dsh k() {
         return this.f;
      }

      public dsh l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dsh.c o() {
         return this.j;
      }
   }

   public static record w(avy<dsi.w.b, dsi.w.a> e) implements dsh {
      private static final Codec<avy<dsi.w.b, dsi.w.a>> f = avy.a(dsi.w.a.b);
      private static final MapCodec<dsi.w> g = f.fieldOf("spline").xmap(dsi.w::new, dsi.w::j);
      public static final awq<dsi.w> a = dsi.a(g);

      @Override
      public double a(dsh.b $$0) {
         return (double)this.e.a(new dsi.w.b($$0));
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
      public void a(double[] $$0, dsh.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dsh a(dsh.f $$0) {
         return $$0.apply(new dsi.w(this.e.a((avy.d<dsi.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public awq<? extends dsh> c() {
         return a;
      }

      public avy<dsi.w.b, dsi.w.a> j() {
         return this.e;
      }

      public static record a(il<dsh> c) implements axw<dsi.w.b> {
         public static final Codec<dsi.w.a> b = dsh.c.xmap(dsi.w.a::new, dsi.w.a::a);

         @Override
         public String toString() {
            Optional<ajg<dsh>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               ajg<dsh> $$1 = $$0.get();
               if ($$1 == dsv.d) {
                  return "continents";
               }

               if ($$1 == dsv.e) {
                  return "erosion";
               }

               if ($$1 == dsv.f) {
                  return "weirdness";
               }

               if ($$1 == dsv.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dsi.w.b $$0) {
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

         public dsi.w.a a(dsh.f $$0) {
            return new dsi.w.a(new il.a<>(this.c.a().a($$0)));
         }

         public il<dsh> a() {
            return this.c;
         }
      }

      public static record b(dsh.b a) {
      }
   }

   interface x extends dsh {
      dsh j();

      @Override
      default double a(dsh.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dsh.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dsh.b var1, double var2);
   }

   interface y extends dsh {
      Logger a = LogUtils.getLogger();

      static dsi.y a(dsi.y.a $$0, dsh $$1, dsh $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dsi.y.a.c || $$0 == dsi.y.a.d) {
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
         if ($$0 == dsi.y.a.b || $$0 == dsi.y.a.a) {
            if ($$1 instanceof dsi.h $$11) {
               return new dsi.n($$0 == dsi.y.a.a ? dsi.n.a.b : dsi.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dsi.h $$12) {
               return new dsi.n($$0 == dsi.y.a.a ? dsi.n.a.b : dsi.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dsi.a($$0, $$1, $$2, $$9, $$10);
      }

      dsi.y.a j();

      dsh k();

      dsh l();

      @Override
      default awq<? extends dsh> c() {
         return this.j().e;
      }

      public static enum a implements axq {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final awq<dsi.y> e = dsi.a((BiFunction<dsh, dsh, dsi.y>)(($$0x, $$1) -> dsi.y.a(this, $$0x, $$1)), dsi.y::k, dsi.y::l);
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

   protected static record z(dsh e, dsh.c f, dsi.z.a g) implements dsi.x {
      private static final MapCodec<dsi.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dsh.d.fieldOf("input").forGetter(dsi.z::j),
                  dsh.c.a.fieldOf("noise").forGetter(dsi.z::k),
                  dsi.z.a.c.fieldOf("rarity_value_mapper").forGetter(dsi.z::l)
               )
               .apply($$0, dsi.z::new)
      );
      public static final awq<dsi.z> a = dsi.a(h);

      @Override
      public double a(dsh.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dsh a(dsh.f $$0) {
         return $$0.apply(new dsi.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public awq<? extends dsh> c() {
         return a;
      }

      @Override
      public dsh j() {
         return this.e;
      }

      public dsh.c k() {
         return this.f;
      }

      public dsi.z.a l() {
         return this.g;
      }

      public static enum a implements axq {
         a("type_1", dsv.a::b, 2.0),
         b("type_2", dsv.a::a, 3.0);

         public static final Codec<dsi.z.a> c = axq.a(dsi.z.a::values);
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
