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

public final class dxm {
   private static final Codec<dxl> c = lp.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dxl> b = Codec.either(d, c)
      .xmap($$0 -> (dxl)$$0.map(dxm::a, Function.identity()), $$0 -> $$0 instanceof dxm.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends dxl> a(jv<MapCodec<? extends dxl>> $$0) {
      a($$0, "blend_alpha", dxm.d.e);
      a($$0, "blend_offset", dxm.f.e);
      a($$0, "beardifier", dxm.b.e);
      a($$0, "old_blended_noise", emt.a);

      for (dxm.l.a $$1 : dxm.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dxm.o.e);
      a($$0, "end_islands", dxm.i.a);
      a($$0, "weird_scaled_sampler", dxm.z.a);
      a($$0, "shifted_noise", dxm.v.a);
      a($$0, "range_choice", dxm.q.e);
      a($$0, "shift_a", dxm.s.e);
      a($$0, "shift_b", dxm.t.e);
      a($$0, "shift", dxm.r.e);
      a($$0, "blend_density", dxm.e.e);
      a($$0, "clamp", dxm.g.a);

      for (dxm.k.a $$2 : dxm.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dxm.y.a $$3 : dxm.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dxm.w.a);
      a($$0, "constant", dxm.h.e);
      return a($$0, "y_clamped_gradient", dxm.aa.a);
   }

   private static MapCodec<? extends dxl> a(jv<MapCodec<? extends dxl>> $$0, String $$1, ayq<? extends dxl> $$2) {
      return jv.a($$0, $$1, $$2.a());
   }

   static <A, O> ayq<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return ayq.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> ayq<O> a(Function<dxl, O> $$0, Function<O, dxl> $$1) {
      return a(dxl.d, $$0, $$1);
   }

   static <O> ayq<O> a(BiFunction<dxl, dxl, O> $$0, Function<O, dxl> $$1, Function<O, dxl> $$2) {
      return ayq.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dxl.d.fieldOf("argument1").forGetter($$1), dxl.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> ayq<O> a(MapCodec<O> $$0) {
      return ayq.a($$0);
   }

   private dxm() {
   }

   public static dxl a(dxl $$0) {
      return new dxm.l(dxm.l.a.a, $$0);
   }

   public static dxl b(dxl $$0) {
      return new dxm.l(dxm.l.a.b, $$0);
   }

   public static dxl c(dxl $$0) {
      return new dxm.l(dxm.l.a.c, $$0);
   }

   public static dxl d(dxl $$0) {
      return new dxm.l(dxm.l.a.d, $$0);
   }

   public static dxl e(dxl $$0) {
      return new dxm.l(dxm.l.a.e, $$0);
   }

   public static dxl a(ji<emw.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dxm.o(new dxl.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dxl a(ji<emw.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dxl a(ji<emw.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dxl a(dxl $$0, dxl $$1, double $$2, ji<emw.a> $$3) {
      return new dxm.v($$0, a(), $$1, $$2, 0.0, new dxl.c($$3));
   }

   public static dxl a(ji<emw.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dxl b(ji<emw.a> $$0, double $$1, double $$2) {
      return new dxm.o(new dxl.c($$0), $$1, $$2);
   }

   public static dxl a(ji<emw.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dxl a(dxl $$0, double $$1, double $$2, dxl $$3, dxl $$4) {
      return new dxm.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dxl b(ji<emw.a> $$0) {
      return new dxm.s(new dxl.c($$0));
   }

   public static dxl c(ji<emw.a> $$0) {
      return new dxm.t(new dxl.c($$0));
   }

   public static dxl d(ji<emw.a> $$0) {
      return new dxm.r(new dxl.c($$0));
   }

   public static dxl f(dxl $$0) {
      return new dxm.e($$0);
   }

   public static dxl a(long $$0) {
      return new dxm.i($$0);
   }

   public static dxl a(dxl $$0, ji<emw.a> $$1, dxm.z.a $$2) {
      return new dxm.z($$0, new dxl.c($$1), $$2);
   }

   public static dxl a(dxl $$0, dxl $$1) {
      return dxm.y.a(dxm.y.a.a, $$0, $$1);
   }

   public static dxl b(dxl $$0, dxl $$1) {
      return dxm.y.a(dxm.y.a.b, $$0, $$1);
   }

   public static dxl c(dxl $$0, dxl $$1) {
      return dxm.y.a(dxm.y.a.c, $$0, $$1);
   }

   public static dxl d(dxl $$0, dxl $$1) {
      return dxm.y.a(dxm.y.a.d, $$0, $$1);
   }

   public static dxl a(axz<dxm.w.b, dxm.w.a> $$0) {
      return new dxm.w($$0);
   }

   public static dxl a() {
      return dxm.h.f;
   }

   public static dxl a(double $$0) {
      return new dxm.h($$0);
   }

   public static dxl a(int $$0, int $$1, double $$2, double $$3) {
      return new dxm.aa($$0, $$1, $$2, $$3);
   }

   public static dxl a(dxl $$0, dxm.k.a $$1) {
      return dxm.k.a($$1, $$0);
   }

   private static dxl a(dxl $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dxl b() {
      return dxm.d.a;
   }

   public static dxl c() {
      return dxm.f.a;
   }

   public static dxl a(dxl $$0, dxl $$1, dxl $$2) {
      if ($$1 instanceof dxm.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dxl $$4 = d($$0);
         dxl $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dxl a(dxl $$0, double $$1, dxl $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dxm.y.a e, dxl f, dxl g, double h, double i) implements dxm.y {
      @Override
      public double a(dxl.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, dxl.a $$1) {
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
      public dxl a(dxl.f $$0) {
         return $$0.apply(dxm.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dxm.y.a j() {
         return this.e;
      }

      @Override
      public dxl k() {
         return this.f;
      }

      @Override
      public dxl l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dxl.d {
      private static final MapCodec<dxm.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dvs.e * 2, dvs.d * 2).fieldOf("from_y").forGetter(dxm.aa::j),
                  Codec.intRange(dvs.e * 2, dvs.d * 2).fieldOf("to_y").forGetter(dxm.aa::k),
                  dxm.d.fieldOf("from_value").forGetter(dxm.aa::l),
                  dxm.d.fieldOf("to_value").forGetter(dxm.aa::m)
               )
               .apply($$0, dxm.aa::new)
      );
      public static final ayq<dxm.aa> a = dxm.a(i);

      @Override
      public double a(dxl.b $$0) {
         return ayx.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public ayq<? extends dxl> c() {
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

   protected static enum b implements dxm.c {
      a;

      @Override
      public double a(dxl.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dxl.a $$1) {
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

   public interface c extends dxl.d {
      ayq<dxl> e = ayq.a(MapCodec.unit(dxm.b.a));

      @Override
      default ayq<? extends dxl> c() {
         return e;
      }
   }

   protected static enum d implements dxl.d {
      a;

      public static final ayq<dxl> e = ayq.a(MapCodec.unit(a));

      @Override
      public double a(dxl.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dxl.a $$1) {
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
      public ayq<? extends dxl> c() {
         return e;
      }
   }

   static record e(dxl a) implements dxm.x {
      static final ayq<dxm.e> e = dxm.a(dxm.e::new, dxm.e::j);

      @Override
      public double a(dxl.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dxl a(dxl.f $$0) {
         return $$0.apply(new dxm.e(this.a.a($$0)));
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
      public ayq<? extends dxl> c() {
         return e;
      }

      @Override
      public dxl j() {
         return this.a;
      }
   }

   protected static enum f implements dxl.d {
      a;

      public static final ayq<dxl> e = ayq.a(MapCodec.unit(a));

      @Override
      public double a(dxl.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dxl.a $$1) {
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
      public ayq<? extends dxl> c() {
         return e;
      }
   }

   protected static record g(dxl e, double f, double g) implements dxm.p {
      private static final MapCodec<dxm.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dxl.b.fieldOf("input").forGetter(dxm.g::aA_), dxm.d.fieldOf("min").forGetter(dxm.g::a), dxm.d.fieldOf("max").forGetter(dxm.g::b))
               .apply($$0, dxm.g::new)
      );
      public static final ayq<dxm.g> a = dxm.a(h);

      @Override
      public double a(double $$0) {
         return ayx.a($$0, this.f, this.g);
      }

      @Override
      public dxl a(dxl.f $$0) {
         return new dxm.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public ayq<? extends dxl> c() {
         return a;
      }

      @Override
      public dxl aA_() {
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

   static record h(double a) implements dxl.d {
      static final ayq<dxm.h> e = dxm.a(dxm.d, dxm.h::new, dxm.h::j);
      static final dxm.h f = new dxm.h(0.0);

      @Override
      public void a(double[] $$0, dxl.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public ayq<? extends dxl> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dxl.d {
      public static final ayq<dxm.i> a = ayq.a(MapCodec.unit(new dxm.i(0L)));
      private static final float e = -0.9F;
      private final emz f;

      public i(long $$0) {
         azf $$1 = new dxt($$0);
         $$1.b(17292);
         this.f = new emz($$1);
      }

      private static float a(emz $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - ayx.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = ayx.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (ayx.e((float)$$10) * 3439.0F + ayx.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - ayx.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = ayx.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dxl.b $$0) {
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
      public ayq<? extends dxl> c() {
         return a;
      }
   }

   @bab
   public static record j(ji<dxl> a) implements dxl {
      @Override
      public double a(dxl.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dxl.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dxl a(dxl.f $$0) {
         return $$0.apply(new dxm.j(new ji.a<>(this.a.a().a($$0))));
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
      public ayq<? extends dxl> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public ji<dxl> j() {
         return this.a;
      }
   }

   protected static record k(dxm.k.a a, dxl e, double f, double g) implements dxm.p {
      public static dxm.k a(dxm.k.a $$0, dxl $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dxm.k.a.a && $$0 != dxm.k.a.b ? new dxm.k($$0, $$1, $$3, $$4) : new dxm.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dxm.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = ayx.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dxm.k b(dxl.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public ayq<? extends dxl> c() {
         return this.a.h;
      }

      public dxm.k.a k() {
         return this.a;
      }

      @Override
      public dxl aA_() {
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

      static enum a implements azs {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final ayq<dxm.k> h = dxm.a($$0x -> dxm.k.a(this, $$0x), dxm.k::aA_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dxm.l.a a, dxl e) implements dxm.m {
      @Override
      public double a(dxl.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dxl.a $$1) {
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
      public dxm.l.a j() {
         return this.a;
      }

      @Override
      public dxl k() {
         return this.e;
      }

      static enum a implements azs {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final ayq<dxm.m> g = dxm.a($$0x -> new dxm.l(this, $$0x), dxm.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dxl {
      dxm.l.a j();

      dxl k();

      @Override
      default ayq<? extends dxl> c() {
         return this.j().g;
      }

      @Override
      default dxl a(dxl.f $$0) {
         return $$0.apply(new dxm.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dxm.n.a e, dxl f, double g, double h, double i) implements dxm.p, dxm.y {
      @Override
      public dxm.y.a j() {
         return this.e == dxm.n.a.a ? dxm.y.a.b : dxm.y.a.a;
      }

      @Override
      public dxl k() {
         return dxm.a(this.i);
      }

      @Override
      public dxl l() {
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
      public dxl a(dxl.f $$0) {
         dxl $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dxm.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dxm.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dxm.n.a m() {
         return this.e;
      }

      @Override
      public dxl aA_() {
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

   protected static record o(dxl.c f, @Deprecated double g, double h) implements dxl {
      public static final MapCodec<dxm.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxl.c.a.fieldOf("noise").forGetter(dxm.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dxm.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dxm.o::l)
               )
               .apply($$0, dxm.o::new)
      );
      public static final ayq<dxm.o> e = dxm.a(a);

      @Override
      public double a(dxl.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dxl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxl a(dxl.f $$0) {
         return $$0.apply(new dxm.o($$0.a(this.f), this.g, this.h));
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
      public ayq<? extends dxl> c() {
         return e;
      }

      public dxl.c j() {
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

   interface p extends dxl {
      dxl aA_();

      @Override
      default double a(dxl.b $$0) {
         return this.a(this.aA_().a($$0));
      }

      @Override
      default void a(double[] $$0, dxl.a $$1) {
         this.aA_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dxl f, double g, double h, dxl i, dxl j) implements dxl {
      public static final MapCodec<dxm.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxl.d.fieldOf("input").forGetter(dxm.q::j),
                  dxm.d.fieldOf("min_inclusive").forGetter(dxm.q::k),
                  dxm.d.fieldOf("max_exclusive").forGetter(dxm.q::l),
                  dxl.d.fieldOf("when_in_range").forGetter(dxm.q::m),
                  dxl.d.fieldOf("when_out_of_range").forGetter(dxm.q::n)
               )
               .apply($$0, dxm.q::new)
      );
      public static final ayq<dxm.q> e = dxm.a(a);

      @Override
      public double a(dxl.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dxl.a $$1) {
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
      public dxl a(dxl.f $$0) {
         return $$0.apply(new dxm.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public ayq<? extends dxl> c() {
         return e;
      }

      public dxl j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dxl m() {
         return this.i;
      }

      public dxl n() {
         return this.j;
      }
   }

   protected static record r(dxl.c a) implements dxm.u {
      static final ayq<dxm.r> e = dxm.a(dxl.c.a, dxm.r::new, dxm.r::j);

      @Override
      public double a(dxl.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dxl a(dxl.f $$0) {
         return $$0.apply(new dxm.r($$0.a(this.a)));
      }

      @Override
      public ayq<? extends dxl> c() {
         return e;
      }

      @Override
      public dxl.c j() {
         return this.a;
      }
   }

   protected static record s(dxl.c a) implements dxm.u {
      static final ayq<dxm.s> e = dxm.a(dxl.c.a, dxm.s::new, dxm.s::j);

      @Override
      public double a(dxl.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dxl a(dxl.f $$0) {
         return $$0.apply(new dxm.s($$0.a(this.a)));
      }

      @Override
      public ayq<? extends dxl> c() {
         return e;
      }

      @Override
      public dxl.c j() {
         return this.a;
      }
   }

   protected static record t(dxl.c a) implements dxm.u {
      static final ayq<dxm.t> e = dxm.a(dxl.c.a, dxm.t::new, dxm.t::j);

      @Override
      public double a(dxl.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dxl a(dxl.f $$0) {
         return $$0.apply(new dxm.t($$0.a(this.a)));
      }

      @Override
      public ayq<? extends dxl> c() {
         return e;
      }

      @Override
      public dxl.c j() {
         return this.a;
      }
   }

   interface u extends dxl {
      dxl.c j();

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
      default void a(double[] $$0, dxl.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dxl e, dxl f, dxl g, double h, double i, dxl.c j) implements dxl {
      private static final MapCodec<dxm.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxl.d.fieldOf("shift_x").forGetter(dxm.v::j),
                  dxl.d.fieldOf("shift_y").forGetter(dxm.v::k),
                  dxl.d.fieldOf("shift_z").forGetter(dxm.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dxm.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dxm.v::n),
                  dxl.c.a.fieldOf("noise").forGetter(dxm.v::o)
               )
               .apply($$0, dxm.v::new)
      );
      public static final ayq<dxm.v> a = dxm.a(k);

      @Override
      public double a(dxl.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dxl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxl a(dxl.f $$0) {
         return $$0.apply(new dxm.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public ayq<? extends dxl> c() {
         return a;
      }

      public dxl j() {
         return this.e;
      }

      public dxl k() {
         return this.f;
      }

      public dxl l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dxl.c o() {
         return this.j;
      }
   }

   public static record w(axz<dxm.w.b, dxm.w.a> e) implements dxl {
      private static final Codec<axz<dxm.w.b, dxm.w.a>> f = axz.a(dxm.w.a.b);
      private static final MapCodec<dxm.w> g = f.fieldOf("spline").xmap(dxm.w::new, dxm.w::j);
      public static final ayq<dxm.w> a = dxm.a(g);

      @Override
      public double a(dxl.b $$0) {
         return (double)this.e.a(new dxm.w.b($$0));
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
      public void a(double[] $$0, dxl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxl a(dxl.f $$0) {
         return $$0.apply(new dxm.w(this.e.a((axz.d<dxm.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public ayq<? extends dxl> c() {
         return a;
      }

      public axz<dxm.w.b, dxm.w.a> j() {
         return this.e;
      }

      public static record a(ji<dxl> c) implements azy<dxm.w.b> {
         public static final Codec<dxm.w.a> b = dxl.c.xmap(dxm.w.a::new, dxm.w.a::a);

         @Override
         public String toString() {
            Optional<ald<dxl>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               ald<dxl> $$1 = $$0.get();
               if ($$1 == dxz.d) {
                  return "continents";
               }

               if ($$1 == dxz.e) {
                  return "erosion";
               }

               if ($$1 == dxz.f) {
                  return "weirdness";
               }

               if ($$1 == dxz.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dxm.w.b $$0) {
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

         public dxm.w.a a(dxl.f $$0) {
            return new dxm.w.a(new ji.a<>(this.c.a().a($$0)));
         }

         public ji<dxl> a() {
            return this.c;
         }
      }

      public static record b(dxl.b a) {
      }
   }

   interface x extends dxl {
      dxl j();

      @Override
      default double a(dxl.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dxl.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dxl.b var1, double var2);
   }

   interface y extends dxl {
      Logger a = LogUtils.getLogger();

      static dxm.y a(dxm.y.a $$0, dxl $$1, dxl $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dxm.y.a.c || $$0 == dxm.y.a.d) {
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
         if ($$0 == dxm.y.a.b || $$0 == dxm.y.a.a) {
            if ($$1 instanceof dxm.h $$11) {
               return new dxm.n($$0 == dxm.y.a.a ? dxm.n.a.b : dxm.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dxm.h $$12) {
               return new dxm.n($$0 == dxm.y.a.a ? dxm.n.a.b : dxm.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dxm.a($$0, $$1, $$2, $$9, $$10);
      }

      dxm.y.a j();

      dxl k();

      dxl l();

      @Override
      default ayq<? extends dxl> c() {
         return this.j().e;
      }

      public static enum a implements azs {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final ayq<dxm.y> e = dxm.a((BiFunction<dxl, dxl, dxm.y>)(($$0x, $$1) -> dxm.y.a(this, $$0x, $$1)), dxm.y::k, dxm.y::l);
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

   protected static record z(dxl e, dxl.c f, dxm.z.a g) implements dxm.x {
      private static final MapCodec<dxm.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxl.d.fieldOf("input").forGetter(dxm.z::j),
                  dxl.c.a.fieldOf("noise").forGetter(dxm.z::k),
                  dxm.z.a.c.fieldOf("rarity_value_mapper").forGetter(dxm.z::l)
               )
               .apply($$0, dxm.z::new)
      );
      public static final ayq<dxm.z> a = dxm.a(h);

      @Override
      public double a(dxl.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dxl a(dxl.f $$0) {
         return $$0.apply(new dxm.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public ayq<? extends dxl> c() {
         return a;
      }

      @Override
      public dxl j() {
         return this.e;
      }

      public dxl.c k() {
         return this.f;
      }

      public dxm.z.a l() {
         return this.g;
      }

      public static enum a implements azs {
         a("type_1", dxz.a::b, 2.0),
         b("type_2", dxz.a::a, 3.0);

         public static final Codec<dxm.z.a> c = azs.a(dxm.z.a::values);
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
