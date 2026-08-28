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

public final class dxo {
   private static final Codec<dxn> c = lp.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dxn> b = Codec.either(d, c)
      .xmap($$0 -> (dxn)$$0.map(dxo::a, Function.identity()), $$0 -> $$0 instanceof dxo.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends dxn> a(jv<MapCodec<? extends dxn>> $$0) {
      a($$0, "blend_alpha", dxo.d.e);
      a($$0, "blend_offset", dxo.f.e);
      a($$0, "beardifier", dxo.b.e);
      a($$0, "old_blended_noise", emv.a);

      for (dxo.l.a $$1 : dxo.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dxo.o.e);
      a($$0, "end_islands", dxo.i.a);
      a($$0, "weird_scaled_sampler", dxo.z.a);
      a($$0, "shifted_noise", dxo.v.a);
      a($$0, "range_choice", dxo.q.e);
      a($$0, "shift_a", dxo.s.e);
      a($$0, "shift_b", dxo.t.e);
      a($$0, "shift", dxo.r.e);
      a($$0, "blend_density", dxo.e.e);
      a($$0, "clamp", dxo.g.a);

      for (dxo.k.a $$2 : dxo.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dxo.y.a $$3 : dxo.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dxo.w.a);
      a($$0, "constant", dxo.h.e);
      return a($$0, "y_clamped_gradient", dxo.aa.a);
   }

   private static MapCodec<? extends dxn> a(jv<MapCodec<? extends dxn>> $$0, String $$1, ays<? extends dxn> $$2) {
      return jv.a($$0, $$1, $$2.a());
   }

   static <A, O> ays<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return ays.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> ays<O> a(Function<dxn, O> $$0, Function<O, dxn> $$1) {
      return a(dxn.d, $$0, $$1);
   }

   static <O> ays<O> a(BiFunction<dxn, dxn, O> $$0, Function<O, dxn> $$1, Function<O, dxn> $$2) {
      return ays.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dxn.d.fieldOf("argument1").forGetter($$1), dxn.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> ays<O> a(MapCodec<O> $$0) {
      return ays.a($$0);
   }

   private dxo() {
   }

   public static dxn a(dxn $$0) {
      return new dxo.l(dxo.l.a.a, $$0);
   }

   public static dxn b(dxn $$0) {
      return new dxo.l(dxo.l.a.b, $$0);
   }

   public static dxn c(dxn $$0) {
      return new dxo.l(dxo.l.a.c, $$0);
   }

   public static dxn d(dxn $$0) {
      return new dxo.l(dxo.l.a.d, $$0);
   }

   public static dxn e(dxn $$0) {
      return new dxo.l(dxo.l.a.e, $$0);
   }

   public static dxn a(ji<emy.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dxo.o(new dxn.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dxn a(ji<emy.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dxn a(ji<emy.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dxn a(dxn $$0, dxn $$1, double $$2, ji<emy.a> $$3) {
      return new dxo.v($$0, a(), $$1, $$2, 0.0, new dxn.c($$3));
   }

   public static dxn a(ji<emy.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dxn b(ji<emy.a> $$0, double $$1, double $$2) {
      return new dxo.o(new dxn.c($$0), $$1, $$2);
   }

   public static dxn a(ji<emy.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dxn a(dxn $$0, double $$1, double $$2, dxn $$3, dxn $$4) {
      return new dxo.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dxn b(ji<emy.a> $$0) {
      return new dxo.s(new dxn.c($$0));
   }

   public static dxn c(ji<emy.a> $$0) {
      return new dxo.t(new dxn.c($$0));
   }

   public static dxn d(ji<emy.a> $$0) {
      return new dxo.r(new dxn.c($$0));
   }

   public static dxn f(dxn $$0) {
      return new dxo.e($$0);
   }

   public static dxn a(long $$0) {
      return new dxo.i($$0);
   }

   public static dxn a(dxn $$0, ji<emy.a> $$1, dxo.z.a $$2) {
      return new dxo.z($$0, new dxn.c($$1), $$2);
   }

   public static dxn a(dxn $$0, dxn $$1) {
      return dxo.y.a(dxo.y.a.a, $$0, $$1);
   }

   public static dxn b(dxn $$0, dxn $$1) {
      return dxo.y.a(dxo.y.a.b, $$0, $$1);
   }

   public static dxn c(dxn $$0, dxn $$1) {
      return dxo.y.a(dxo.y.a.c, $$0, $$1);
   }

   public static dxn d(dxn $$0, dxn $$1) {
      return dxo.y.a(dxo.y.a.d, $$0, $$1);
   }

   public static dxn a(aya<dxo.w.b, dxo.w.a> $$0) {
      return new dxo.w($$0);
   }

   public static dxn a() {
      return dxo.h.f;
   }

   public static dxn a(double $$0) {
      return new dxo.h($$0);
   }

   public static dxn a(int $$0, int $$1, double $$2, double $$3) {
      return new dxo.aa($$0, $$1, $$2, $$3);
   }

   public static dxn a(dxn $$0, dxo.k.a $$1) {
      return dxo.k.a($$1, $$0);
   }

   private static dxn a(dxn $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dxn b() {
      return dxo.d.a;
   }

   public static dxn c() {
      return dxo.f.a;
   }

   public static dxn a(dxn $$0, dxn $$1, dxn $$2) {
      if ($$1 instanceof dxo.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dxn $$4 = d($$0);
         dxn $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dxn a(dxn $$0, double $$1, dxn $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dxo.y.a e, dxn f, dxn g, double h, double i) implements dxo.y {
      @Override
      public double a(dxn.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, dxn.a $$1) {
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
      public dxn a(dxn.f $$0) {
         return $$0.apply(dxo.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dxo.y.a j() {
         return this.e;
      }

      @Override
      public dxn k() {
         return this.f;
      }

      @Override
      public dxn l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dxn.d {
      private static final MapCodec<dxo.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dvu.e * 2, dvu.d * 2).fieldOf("from_y").forGetter(dxo.aa::j),
                  Codec.intRange(dvu.e * 2, dvu.d * 2).fieldOf("to_y").forGetter(dxo.aa::k),
                  dxo.d.fieldOf("from_value").forGetter(dxo.aa::l),
                  dxo.d.fieldOf("to_value").forGetter(dxo.aa::m)
               )
               .apply($$0, dxo.aa::new)
      );
      public static final ays<dxo.aa> a = dxo.a(i);

      @Override
      public double a(dxn.b $$0) {
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
      public ays<? extends dxn> c() {
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

   protected static enum b implements dxo.c {
      a;

      @Override
      public double a(dxn.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dxn.a $$1) {
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

   public interface c extends dxn.d {
      ays<dxn> e = ays.a(MapCodec.unit(dxo.b.a));

      @Override
      default ays<? extends dxn> c() {
         return e;
      }
   }

   protected static enum d implements dxn.d {
      a;

      public static final ays<dxn> e = ays.a(MapCodec.unit(a));

      @Override
      public double a(dxn.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dxn.a $$1) {
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
      public ays<? extends dxn> c() {
         return e;
      }
   }

   static record e(dxn a) implements dxo.x {
      static final ays<dxo.e> e = dxo.a(dxo.e::new, dxo.e::j);

      @Override
      public double a(dxn.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dxn a(dxn.f $$0) {
         return $$0.apply(new dxo.e(this.a.a($$0)));
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
      public ays<? extends dxn> c() {
         return e;
      }

      @Override
      public dxn j() {
         return this.a;
      }
   }

   protected static enum f implements dxn.d {
      a;

      public static final ays<dxn> e = ays.a(MapCodec.unit(a));

      @Override
      public double a(dxn.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dxn.a $$1) {
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
      public ays<? extends dxn> c() {
         return e;
      }
   }

   protected static record g(dxn e, double f, double g) implements dxo.p {
      private static final MapCodec<dxo.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dxn.b.fieldOf("input").forGetter(dxo.g::az_), dxo.d.fieldOf("min").forGetter(dxo.g::a), dxo.d.fieldOf("max").forGetter(dxo.g::b))
               .apply($$0, dxo.g::new)
      );
      public static final ays<dxo.g> a = dxo.a(h);

      @Override
      public double a(double $$0) {
         return ayz.a($$0, this.f, this.g);
      }

      @Override
      public dxn a(dxn.f $$0) {
         return new dxo.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public ays<? extends dxn> c() {
         return a;
      }

      @Override
      public dxn az_() {
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

   static record h(double a) implements dxn.d {
      static final ays<dxo.h> e = dxo.a(dxo.d, dxo.h::new, dxo.h::j);
      static final dxo.h f = new dxo.h(0.0);

      @Override
      public void a(double[] $$0, dxn.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public ays<? extends dxn> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dxn.d {
      public static final ays<dxo.i> a = ays.a(MapCodec.unit(new dxo.i(0L)));
      private static final float e = -0.9F;
      private final enb f;

      public i(long $$0) {
         azh $$1 = new dxv($$0);
         $$1.b(17292);
         this.f = new enb($$1);
      }

      private static float a(enb $$0, int $$1, int $$2) {
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
      public double a(dxn.b $$0) {
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
      public ays<? extends dxn> c() {
         return a;
      }
   }

   @bad
   public static record j(ji<dxn> a) implements dxn {
      @Override
      public double a(dxn.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dxn.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dxn a(dxn.f $$0) {
         return $$0.apply(new dxo.j(new ji.a<>(this.a.a().a($$0))));
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
      public ays<? extends dxn> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public ji<dxn> j() {
         return this.a;
      }
   }

   protected static record k(dxo.k.a a, dxn e, double f, double g) implements dxo.p {
      public static dxo.k a(dxo.k.a $$0, dxn $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dxo.k.a.a && $$0 != dxo.k.a.b ? new dxo.k($$0, $$1, $$3, $$4) : new dxo.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dxo.k.a $$0, double $$1) {
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

      public dxo.k b(dxn.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public ays<? extends dxn> c() {
         return this.a.h;
      }

      public dxo.k.a k() {
         return this.a;
      }

      @Override
      public dxn az_() {
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
         final ays<dxo.k> h = dxo.a($$0x -> dxo.k.a(this, $$0x), dxo.k::az_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dxo.l.a a, dxn e) implements dxo.m {
      @Override
      public double a(dxn.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dxn.a $$1) {
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
      public dxo.l.a j() {
         return this.a;
      }

      @Override
      public dxn k() {
         return this.e;
      }

      static enum a implements azu {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final ays<dxo.m> g = dxo.a($$0x -> new dxo.l(this, $$0x), dxo.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dxn {
      dxo.l.a j();

      dxn k();

      @Override
      default ays<? extends dxn> c() {
         return this.j().g;
      }

      @Override
      default dxn a(dxn.f $$0) {
         return $$0.apply(new dxo.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dxo.n.a e, dxn f, double g, double h, double i) implements dxo.p, dxo.y {
      @Override
      public dxo.y.a j() {
         return this.e == dxo.n.a.a ? dxo.y.a.b : dxo.y.a.a;
      }

      @Override
      public dxn k() {
         return dxo.a(this.i);
      }

      @Override
      public dxn l() {
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
      public dxn a(dxn.f $$0) {
         dxn $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dxo.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dxo.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dxo.n.a m() {
         return this.e;
      }

      @Override
      public dxn az_() {
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

   protected static record o(dxn.c f, @Deprecated double g, double h) implements dxn {
      public static final MapCodec<dxo.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxn.c.a.fieldOf("noise").forGetter(dxo.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dxo.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dxo.o::l)
               )
               .apply($$0, dxo.o::new)
      );
      public static final ays<dxo.o> e = dxo.a(a);

      @Override
      public double a(dxn.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dxn.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxn a(dxn.f $$0) {
         return $$0.apply(new dxo.o($$0.a(this.f), this.g, this.h));
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
      public ays<? extends dxn> c() {
         return e;
      }

      public dxn.c j() {
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

   interface p extends dxn {
      dxn az_();

      @Override
      default double a(dxn.b $$0) {
         return this.a(this.az_().a($$0));
      }

      @Override
      default void a(double[] $$0, dxn.a $$1) {
         this.az_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dxn f, double g, double h, dxn i, dxn j) implements dxn {
      public static final MapCodec<dxo.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxn.d.fieldOf("input").forGetter(dxo.q::j),
                  dxo.d.fieldOf("min_inclusive").forGetter(dxo.q::k),
                  dxo.d.fieldOf("max_exclusive").forGetter(dxo.q::l),
                  dxn.d.fieldOf("when_in_range").forGetter(dxo.q::m),
                  dxn.d.fieldOf("when_out_of_range").forGetter(dxo.q::n)
               )
               .apply($$0, dxo.q::new)
      );
      public static final ays<dxo.q> e = dxo.a(a);

      @Override
      public double a(dxn.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dxn.a $$1) {
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
      public dxn a(dxn.f $$0) {
         return $$0.apply(new dxo.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public ays<? extends dxn> c() {
         return e;
      }

      public dxn j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dxn m() {
         return this.i;
      }

      public dxn n() {
         return this.j;
      }
   }

   protected static record r(dxn.c a) implements dxo.u {
      static final ays<dxo.r> e = dxo.a(dxn.c.a, dxo.r::new, dxo.r::j);

      @Override
      public double a(dxn.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dxn a(dxn.f $$0) {
         return $$0.apply(new dxo.r($$0.a(this.a)));
      }

      @Override
      public ays<? extends dxn> c() {
         return e;
      }

      @Override
      public dxn.c j() {
         return this.a;
      }
   }

   protected static record s(dxn.c a) implements dxo.u {
      static final ays<dxo.s> e = dxo.a(dxn.c.a, dxo.s::new, dxo.s::j);

      @Override
      public double a(dxn.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dxn a(dxn.f $$0) {
         return $$0.apply(new dxo.s($$0.a(this.a)));
      }

      @Override
      public ays<? extends dxn> c() {
         return e;
      }

      @Override
      public dxn.c j() {
         return this.a;
      }
   }

   protected static record t(dxn.c a) implements dxo.u {
      static final ays<dxo.t> e = dxo.a(dxn.c.a, dxo.t::new, dxo.t::j);

      @Override
      public double a(dxn.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dxn a(dxn.f $$0) {
         return $$0.apply(new dxo.t($$0.a(this.a)));
      }

      @Override
      public ays<? extends dxn> c() {
         return e;
      }

      @Override
      public dxn.c j() {
         return this.a;
      }
   }

   interface u extends dxn {
      dxn.c j();

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
      default void a(double[] $$0, dxn.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dxn e, dxn f, dxn g, double h, double i, dxn.c j) implements dxn {
      private static final MapCodec<dxo.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxn.d.fieldOf("shift_x").forGetter(dxo.v::j),
                  dxn.d.fieldOf("shift_y").forGetter(dxo.v::k),
                  dxn.d.fieldOf("shift_z").forGetter(dxo.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dxo.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dxo.v::n),
                  dxn.c.a.fieldOf("noise").forGetter(dxo.v::o)
               )
               .apply($$0, dxo.v::new)
      );
      public static final ays<dxo.v> a = dxo.a(k);

      @Override
      public double a(dxn.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dxn.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxn a(dxn.f $$0) {
         return $$0.apply(new dxo.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public ays<? extends dxn> c() {
         return a;
      }

      public dxn j() {
         return this.e;
      }

      public dxn k() {
         return this.f;
      }

      public dxn l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dxn.c o() {
         return this.j;
      }
   }

   public static record w(aya<dxo.w.b, dxo.w.a> e) implements dxn {
      private static final Codec<aya<dxo.w.b, dxo.w.a>> f = aya.a(dxo.w.a.b);
      private static final MapCodec<dxo.w> g = f.fieldOf("spline").xmap(dxo.w::new, dxo.w::j);
      public static final ays<dxo.w> a = dxo.a(g);

      @Override
      public double a(dxn.b $$0) {
         return (double)this.e.a(new dxo.w.b($$0));
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
      public void a(double[] $$0, dxn.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxn a(dxn.f $$0) {
         return $$0.apply(new dxo.w(this.e.a((aya.d<dxo.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public ays<? extends dxn> c() {
         return a;
      }

      public aya<dxo.w.b, dxo.w.a> j() {
         return this.e;
      }

      public static record a(ji<dxn> c) implements baa<dxo.w.b> {
         public static final Codec<dxo.w.a> b = dxn.c.xmap(dxo.w.a::new, dxo.w.a::a);

         @Override
         public String toString() {
            Optional<ale<dxn>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               ale<dxn> $$1 = $$0.get();
               if ($$1 == dyb.d) {
                  return "continents";
               }

               if ($$1 == dyb.e) {
                  return "erosion";
               }

               if ($$1 == dyb.f) {
                  return "weirdness";
               }

               if ($$1 == dyb.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dxo.w.b $$0) {
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

         public dxo.w.a a(dxn.f $$0) {
            return new dxo.w.a(new ji.a<>(this.c.a().a($$0)));
         }

         public ji<dxn> a() {
            return this.c;
         }
      }

      public static record b(dxn.b a) {
      }
   }

   interface x extends dxn {
      dxn j();

      @Override
      default double a(dxn.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dxn.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dxn.b var1, double var2);
   }

   interface y extends dxn {
      Logger a = LogUtils.getLogger();

      static dxo.y a(dxo.y.a $$0, dxn $$1, dxn $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dxo.y.a.c || $$0 == dxo.y.a.d) {
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
         if ($$0 == dxo.y.a.b || $$0 == dxo.y.a.a) {
            if ($$1 instanceof dxo.h $$11) {
               return new dxo.n($$0 == dxo.y.a.a ? dxo.n.a.b : dxo.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dxo.h $$12) {
               return new dxo.n($$0 == dxo.y.a.a ? dxo.n.a.b : dxo.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dxo.a($$0, $$1, $$2, $$9, $$10);
      }

      dxo.y.a j();

      dxn k();

      dxn l();

      @Override
      default ays<? extends dxn> c() {
         return this.j().e;
      }

      public static enum a implements azu {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final ays<dxo.y> e = dxo.a((BiFunction<dxn, dxn, dxo.y>)(($$0x, $$1) -> dxo.y.a(this, $$0x, $$1)), dxo.y::k, dxo.y::l);
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

   protected static record z(dxn e, dxn.c f, dxo.z.a g) implements dxo.x {
      private static final MapCodec<dxo.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dxn.d.fieldOf("input").forGetter(dxo.z::j),
                  dxn.c.a.fieldOf("noise").forGetter(dxo.z::k),
                  dxo.z.a.c.fieldOf("rarity_value_mapper").forGetter(dxo.z::l)
               )
               .apply($$0, dxo.z::new)
      );
      public static final ays<dxo.z> a = dxo.a(h);

      @Override
      public double a(dxn.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dxn a(dxn.f $$0) {
         return $$0.apply(new dxo.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public ays<? extends dxn> c() {
         return a;
      }

      @Override
      public dxn j() {
         return this.e;
      }

      public dxn.c k() {
         return this.f;
      }

      public dxo.z.a l() {
         return this.g;
      }

      public static enum a implements azu {
         a("type_1", dyb.a::b, 2.0),
         b("type_2", dyb.a::a, 3.0);

         public static final Codec<dxo.z.a> c = azu.a(dxo.z.a::values);
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
