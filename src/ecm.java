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

public final class ecm {
   private static final Codec<ecl> c = mb.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<ecl> b = Codec.either(d, c)
      .xmap($$0 -> (ecl)$$0.map(ecm::a, Function.identity()), $$0 -> $$0 instanceof ecm.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends ecl> a(ke<MapCodec<? extends ecl>> $$0) {
      a($$0, "blend_alpha", ecm.d.e);
      a($$0, "blend_offset", ecm.f.e);
      a($$0, "beardifier", ecm.b.e);
      a($$0, "old_blended_noise", erz.a);

      for (ecm.l.a $$1 : ecm.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", ecm.o.e);
      a($$0, "end_islands", ecm.i.a);
      a($$0, "weird_scaled_sampler", ecm.z.a);
      a($$0, "shifted_noise", ecm.v.a);
      a($$0, "range_choice", ecm.q.e);
      a($$0, "shift_a", ecm.s.e);
      a($$0, "shift_b", ecm.t.e);
      a($$0, "shift", ecm.r.e);
      a($$0, "blend_density", ecm.e.e);
      a($$0, "clamp", ecm.g.a);

      for (ecm.k.a $$2 : ecm.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (ecm.y.a $$3 : ecm.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", ecm.w.a);
      a($$0, "constant", ecm.h.e);
      return a($$0, "y_clamped_gradient", ecm.aa.a);
   }

   private static MapCodec<? extends ecl> a(ke<MapCodec<? extends ecl>> $$0, String $$1, ays<? extends ecl> $$2) {
      return ke.a($$0, $$1, $$2.a());
   }

   static <A, O> ays<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return ays.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> ays<O> a(Function<ecl, O> $$0, Function<O, ecl> $$1) {
      return a(ecl.d, $$0, $$1);
   }

   static <O> ays<O> a(BiFunction<ecl, ecl, O> $$0, Function<O, ecl> $$1, Function<O, ecl> $$2) {
      return ays.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(ecl.d.fieldOf("argument1").forGetter($$1), ecl.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> ays<O> a(MapCodec<O> $$0) {
      return ays.a($$0);
   }

   private ecm() {
   }

   public static ecl a(ecl $$0) {
      return new ecm.l(ecm.l.a.a, $$0);
   }

   public static ecl b(ecl $$0) {
      return new ecm.l(ecm.l.a.b, $$0);
   }

   public static ecl c(ecl $$0) {
      return new ecm.l(ecm.l.a.c, $$0);
   }

   public static ecl d(ecl $$0) {
      return new ecm.l(ecm.l.a.d, $$0);
   }

   public static ecl e(ecl $$0) {
      return new ecm.l(ecm.l.a.e, $$0);
   }

   public static ecl a(jr<esc.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new ecm.o(new ecl.c($$0), $$1, $$2), $$3, $$4);
   }

   public static ecl a(jr<esc.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static ecl a(jr<esc.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static ecl a(ecl $$0, ecl $$1, double $$2, jr<esc.a> $$3) {
      return new ecm.v($$0, a(), $$1, $$2, 0.0, new ecl.c($$3));
   }

   public static ecl a(jr<esc.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static ecl b(jr<esc.a> $$0, double $$1, double $$2) {
      return new ecm.o(new ecl.c($$0), $$1, $$2);
   }

   public static ecl a(jr<esc.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static ecl a(ecl $$0, double $$1, double $$2, ecl $$3, ecl $$4) {
      return new ecm.q($$0, $$1, $$2, $$3, $$4);
   }

   public static ecl b(jr<esc.a> $$0) {
      return new ecm.s(new ecl.c($$0));
   }

   public static ecl c(jr<esc.a> $$0) {
      return new ecm.t(new ecl.c($$0));
   }

   public static ecl d(jr<esc.a> $$0) {
      return new ecm.r(new ecl.c($$0));
   }

   public static ecl f(ecl $$0) {
      return new ecm.e($$0);
   }

   public static ecl a(long $$0) {
      return new ecm.i($$0);
   }

   public static ecl a(ecl $$0, jr<esc.a> $$1, ecm.z.a $$2) {
      return new ecm.z($$0, new ecl.c($$1), $$2);
   }

   public static ecl a(ecl $$0, ecl $$1) {
      return ecm.y.a(ecm.y.a.a, $$0, $$1);
   }

   public static ecl b(ecl $$0, ecl $$1) {
      return ecm.y.a(ecm.y.a.b, $$0, $$1);
   }

   public static ecl c(ecl $$0, ecl $$1) {
      return ecm.y.a(ecm.y.a.c, $$0, $$1);
   }

   public static ecl d(ecl $$0, ecl $$1) {
      return ecm.y.a(ecm.y.a.d, $$0, $$1);
   }

   public static ecl a(ayb<ecm.w.b, ecm.w.a> $$0) {
      return new ecm.w($$0);
   }

   public static ecl a() {
      return ecm.h.f;
   }

   public static ecl a(double $$0) {
      return new ecm.h($$0);
   }

   public static ecl a(int $$0, int $$1, double $$2, double $$3) {
      return new ecm.aa($$0, $$1, $$2, $$3);
   }

   public static ecl a(ecl $$0, ecm.k.a $$1) {
      return ecm.k.a($$1, $$0);
   }

   private static ecl a(ecl $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static ecl b() {
      return ecm.d.a;
   }

   public static ecl c() {
      return ecm.f.a;
   }

   public static ecl a(ecl $$0, ecl $$1, ecl $$2) {
      if ($$1 instanceof ecm.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         ecl $$4 = d($$0);
         ecl $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static ecl a(ecl $$0, double $$1, ecl $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(ecm.y.a e, ecl f, ecl g, double h, double i) implements ecm.y {
      @Override
      public double a(ecl.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, ecl.a $$1) {
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
      public ecl a(ecl.f $$0) {
         return $$0.apply(ecm.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public ecm.y.a j() {
         return this.e;
      }

      @Override
      public ecl k() {
         return this.f;
      }

      @Override
      public ecl l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements ecl.d {
      private static final MapCodec<ecm.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(eas.e * 2, eas.d * 2).fieldOf("from_y").forGetter(ecm.aa::j),
                  Codec.intRange(eas.e * 2, eas.d * 2).fieldOf("to_y").forGetter(ecm.aa::k),
                  ecm.d.fieldOf("from_value").forGetter(ecm.aa::l),
                  ecm.d.fieldOf("to_value").forGetter(ecm.aa::m)
               )
               .apply($$0, ecm.aa::new)
      );
      public static final ays<ecm.aa> a = ecm.a(i);

      @Override
      public double a(ecl.b $$0) {
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
      public ays<? extends ecl> c() {
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

   protected static enum b implements ecm.c {
      a;

      @Override
      public double a(ecl.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, ecl.a $$1) {
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

   public interface c extends ecl.d {
      ays<ecl> e = ays.a(MapCodec.unit(ecm.b.a));

      @Override
      default ays<? extends ecl> c() {
         return e;
      }
   }

   protected static enum d implements ecl.d {
      a;

      public static final ays<ecl> e = ays.a(MapCodec.unit(a));

      @Override
      public double a(ecl.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, ecl.a $$1) {
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
      public ays<? extends ecl> c() {
         return e;
      }
   }

   static record e(ecl a) implements ecm.x {
      static final ays<ecm.e> e = ecm.a(ecm.e::new, ecm.e::j);

      @Override
      public double a(ecl.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public ecl a(ecl.f $$0) {
         return $$0.apply(new ecm.e(this.a.a($$0)));
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
      public ays<? extends ecl> c() {
         return e;
      }

      @Override
      public ecl j() {
         return this.a;
      }
   }

   protected static enum f implements ecl.d {
      a;

      public static final ays<ecl> e = ays.a(MapCodec.unit(a));

      @Override
      public double a(ecl.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, ecl.a $$1) {
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
      public ays<? extends ecl> c() {
         return e;
      }
   }

   protected static record g(ecl e, double f, double g) implements ecm.p {
      private static final MapCodec<ecm.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ecl.b.fieldOf("input").forGetter(ecm.g::aD_), ecm.d.fieldOf("min").forGetter(ecm.g::a), ecm.d.fieldOf("max").forGetter(ecm.g::b))
               .apply($$0, ecm.g::new)
      );
      public static final ays<ecm.g> a = ecm.a(h);

      @Override
      public double a(double $$0) {
         return ayz.a($$0, this.f, this.g);
      }

      @Override
      public ecl a(ecl.f $$0) {
         return new ecm.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public ays<? extends ecl> c() {
         return a;
      }

      @Override
      public ecl aD_() {
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

   static record h(double a) implements ecl.d {
      static final ays<ecm.h> e = ecm.a(ecm.d, ecm.h::new, ecm.h::j);
      static final ecm.h f = new ecm.h(0.0);

      @Override
      public void a(double[] $$0, ecl.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public ays<? extends ecl> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements ecl.d {
      public static final ays<ecm.i> a = ays.a(MapCodec.unit(new ecm.i(0L)));
      private static final float e = -0.9F;
      private final esf f;

      public i(long $$0) {
         azh $$1 = new ect($$0);
         $$1.b(17292);
         this.f = new esf($$1);
      }

      private static float a(esf $$0, int $$1, int $$2) {
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
      public double a(ecl.b $$0) {
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
      public ays<? extends ecl> c() {
         return a;
      }
   }

   @bag
   public static record j(jr<ecl> a) implements ecl {
      @Override
      public double a(ecl.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, ecl.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public ecl a(ecl.f $$0) {
         return $$0.apply(new ecm.j(new jr.a<>(this.a.a().a($$0))));
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
      public ays<? extends ecl> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jr<ecl> j() {
         return this.a;
      }
   }

   protected static record k(ecm.k.a a, ecl e, double f, double g) implements ecm.p {
      public static ecm.k a(ecm.k.a $$0, ecl $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != ecm.k.a.a && $$0 != ecm.k.a.b ? new ecm.k($$0, $$1, $$3, $$4) : new ecm.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(ecm.k.a $$0, double $$1) {
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

      public ecm.k b(ecl.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public ays<? extends ecl> c() {
         return this.a.h;
      }

      public ecm.k.a k() {
         return this.a;
      }

      @Override
      public ecl aD_() {
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
         final ays<ecm.k> h = ecm.a($$0x -> ecm.k.a(this, $$0x), ecm.k::aD_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(ecm.l.a a, ecl e) implements ecm.m {
      @Override
      public double a(ecl.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, ecl.a $$1) {
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
      public ecm.l.a j() {
         return this.a;
      }

      @Override
      public ecl k() {
         return this.e;
      }

      static enum a implements azv {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final ays<ecm.m> g = ecm.a($$0x -> new ecm.l(this, $$0x), ecm.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends ecl {
      ecm.l.a j();

      ecl k();

      @Override
      default ays<? extends ecl> c() {
         return this.j().g;
      }

      @Override
      default ecl a(ecl.f $$0) {
         return $$0.apply(new ecm.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(ecm.n.a e, ecl f, double g, double h, double i) implements ecm.p, ecm.y {
      @Override
      public ecm.y.a j() {
         return this.e == ecm.n.a.a ? ecm.y.a.b : ecm.y.a.a;
      }

      @Override
      public ecl k() {
         return ecm.a(this.i);
      }

      @Override
      public ecl l() {
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
      public ecl a(ecl.f $$0) {
         ecl $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == ecm.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new ecm.n(this.e, $$1, $$4, $$5, this.i);
      }

      public ecm.n.a m() {
         return this.e;
      }

      @Override
      public ecl aD_() {
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

   protected static record o(ecl.c f, @Deprecated double g, double h) implements ecl {
      public static final MapCodec<ecm.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ecl.c.a.fieldOf("noise").forGetter(ecm.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(ecm.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(ecm.o::l)
               )
               .apply($$0, ecm.o::new)
      );
      public static final ays<ecm.o> e = ecm.a(a);

      @Override
      public double a(ecl.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, ecl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ecl a(ecl.f $$0) {
         return $$0.apply(new ecm.o($$0.a(this.f), this.g, this.h));
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
      public ays<? extends ecl> c() {
         return e;
      }

      public ecl.c j() {
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

   interface p extends ecl {
      ecl aD_();

      @Override
      default double a(ecl.b $$0) {
         return this.a(this.aD_().a($$0));
      }

      @Override
      default void a(double[] $$0, ecl.a $$1) {
         this.aD_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(ecl f, double g, double h, ecl i, ecl j) implements ecl {
      public static final MapCodec<ecm.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ecl.d.fieldOf("input").forGetter(ecm.q::j),
                  ecm.d.fieldOf("min_inclusive").forGetter(ecm.q::k),
                  ecm.d.fieldOf("max_exclusive").forGetter(ecm.q::l),
                  ecl.d.fieldOf("when_in_range").forGetter(ecm.q::m),
                  ecl.d.fieldOf("when_out_of_range").forGetter(ecm.q::n)
               )
               .apply($$0, ecm.q::new)
      );
      public static final ays<ecm.q> e = ecm.a(a);

      @Override
      public double a(ecl.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, ecl.a $$1) {
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
      public ecl a(ecl.f $$0) {
         return $$0.apply(new ecm.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public ays<? extends ecl> c() {
         return e;
      }

      public ecl j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public ecl m() {
         return this.i;
      }

      public ecl n() {
         return this.j;
      }
   }

   protected static record r(ecl.c a) implements ecm.u {
      static final ays<ecm.r> e = ecm.a(ecl.c.a, ecm.r::new, ecm.r::j);

      @Override
      public double a(ecl.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public ecl a(ecl.f $$0) {
         return $$0.apply(new ecm.r($$0.a(this.a)));
      }

      @Override
      public ays<? extends ecl> c() {
         return e;
      }

      @Override
      public ecl.c j() {
         return this.a;
      }
   }

   protected static record s(ecl.c a) implements ecm.u {
      static final ays<ecm.s> e = ecm.a(ecl.c.a, ecm.s::new, ecm.s::j);

      @Override
      public double a(ecl.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public ecl a(ecl.f $$0) {
         return $$0.apply(new ecm.s($$0.a(this.a)));
      }

      @Override
      public ays<? extends ecl> c() {
         return e;
      }

      @Override
      public ecl.c j() {
         return this.a;
      }
   }

   protected static record t(ecl.c a) implements ecm.u {
      static final ays<ecm.t> e = ecm.a(ecl.c.a, ecm.t::new, ecm.t::j);

      @Override
      public double a(ecl.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public ecl a(ecl.f $$0) {
         return $$0.apply(new ecm.t($$0.a(this.a)));
      }

      @Override
      public ays<? extends ecl> c() {
         return e;
      }

      @Override
      public ecl.c j() {
         return this.a;
      }
   }

   interface u extends ecl {
      ecl.c j();

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
      default void a(double[] $$0, ecl.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(ecl e, ecl f, ecl g, double h, double i, ecl.c j) implements ecl {
      private static final MapCodec<ecm.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ecl.d.fieldOf("shift_x").forGetter(ecm.v::j),
                  ecl.d.fieldOf("shift_y").forGetter(ecm.v::k),
                  ecl.d.fieldOf("shift_z").forGetter(ecm.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(ecm.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(ecm.v::n),
                  ecl.c.a.fieldOf("noise").forGetter(ecm.v::o)
               )
               .apply($$0, ecm.v::new)
      );
      public static final ays<ecm.v> a = ecm.a(k);

      @Override
      public double a(ecl.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, ecl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ecl a(ecl.f $$0) {
         return $$0.apply(new ecm.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public ays<? extends ecl> c() {
         return a;
      }

      public ecl j() {
         return this.e;
      }

      public ecl k() {
         return this.f;
      }

      public ecl l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public ecl.c o() {
         return this.j;
      }
   }

   public static record w(ayb<ecm.w.b, ecm.w.a> e) implements ecl {
      private static final Codec<ayb<ecm.w.b, ecm.w.a>> f = ayb.a(ecm.w.a.b);
      private static final MapCodec<ecm.w> g = f.fieldOf("spline").xmap(ecm.w::new, ecm.w::j);
      public static final ays<ecm.w> a = ecm.a(g);

      @Override
      public double a(ecl.b $$0) {
         return (double)this.e.a(new ecm.w.b($$0));
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
      public void a(double[] $$0, ecl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ecl a(ecl.f $$0) {
         return $$0.apply(new ecm.w(this.e.a((ayb.d<ecm.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public ays<? extends ecl> c() {
         return a;
      }

      public ayb<ecm.w.b, ecm.w.a> j() {
         return this.e;
      }

      public static record a(jr<ecl> c) implements bac<ecm.w.b> {
         public static final Codec<ecm.w.a> b = ecl.c.xmap(ecm.w.a::new, ecm.w.a::a);

         @Override
         public String toString() {
            Optional<aku<ecl>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               aku<ecl> $$1 = $$0.get();
               if ($$1 == ecz.d) {
                  return "continents";
               }

               if ($$1 == ecz.e) {
                  return "erosion";
               }

               if ($$1 == ecz.f) {
                  return "weirdness";
               }

               if ($$1 == ecz.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(ecm.w.b $$0) {
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

         public ecm.w.a a(ecl.f $$0) {
            return new ecm.w.a(new jr.a<>(this.c.a().a($$0)));
         }

         public jr<ecl> a() {
            return this.c;
         }
      }

      public static record b(ecl.b a) {
      }
   }

   interface x extends ecl {
      ecl j();

      @Override
      default double a(ecl.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, ecl.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(ecl.b var1, double var2);
   }

   interface y extends ecl {
      Logger a = LogUtils.getLogger();

      static ecm.y a(ecm.y.a $$0, ecl $$1, ecl $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == ecm.y.a.c || $$0 == ecm.y.a.d) {
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
         if ($$0 == ecm.y.a.b || $$0 == ecm.y.a.a) {
            if ($$1 instanceof ecm.h $$11) {
               return new ecm.n($$0 == ecm.y.a.a ? ecm.n.a.b : ecm.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof ecm.h $$12) {
               return new ecm.n($$0 == ecm.y.a.a ? ecm.n.a.b : ecm.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new ecm.a($$0, $$1, $$2, $$9, $$10);
      }

      ecm.y.a j();

      ecl k();

      ecl l();

      @Override
      default ays<? extends ecl> c() {
         return this.j().e;
      }

      public static enum a implements azv {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final ays<ecm.y> e = ecm.a((BiFunction<ecl, ecl, ecm.y>)(($$0x, $$1) -> ecm.y.a(this, $$0x, $$1)), ecm.y::k, ecm.y::l);
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

   protected static record z(ecl e, ecl.c f, ecm.z.a g) implements ecm.x {
      private static final MapCodec<ecm.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ecl.d.fieldOf("input").forGetter(ecm.z::j),
                  ecl.c.a.fieldOf("noise").forGetter(ecm.z::k),
                  ecm.z.a.c.fieldOf("rarity_value_mapper").forGetter(ecm.z::l)
               )
               .apply($$0, ecm.z::new)
      );
      public static final ays<ecm.z> a = ecm.a(h);

      @Override
      public double a(ecl.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public ecl a(ecl.f $$0) {
         return $$0.apply(new ecm.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public ays<? extends ecl> c() {
         return a;
      }

      @Override
      public ecl j() {
         return this.e;
      }

      public ecl.c k() {
         return this.f;
      }

      public ecm.z.a l() {
         return this.g;
      }

      public static enum a implements azv {
         a("type_1", ecz.a::b, 2.0),
         b("type_2", ecz.a::a, 3.0);

         public static final Codec<ecm.z.a> c = azv.a(ecm.z.a::values);
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
