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

public final class edd {
   private static final Codec<edc> c = ma.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<edc> b = Codec.either(d, c)
      .xmap($$0 -> (edc)$$0.map(edd::a, Function.identity()), $$0 -> $$0 instanceof edd.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends edc> a(kd<MapCodec<? extends edc>> $$0) {
      a($$0, "blend_alpha", edd.d.e);
      a($$0, "blend_offset", edd.f.e);
      a($$0, "beardifier", edd.b.e);
      a($$0, "old_blended_noise", esq.a);

      for (edd.l.a $$1 : edd.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", edd.o.e);
      a($$0, "end_islands", edd.i.a);
      a($$0, "weird_scaled_sampler", edd.z.a);
      a($$0, "shifted_noise", edd.v.a);
      a($$0, "range_choice", edd.q.e);
      a($$0, "shift_a", edd.s.e);
      a($$0, "shift_b", edd.t.e);
      a($$0, "shift", edd.r.e);
      a($$0, "blend_density", edd.e.e);
      a($$0, "clamp", edd.g.a);

      for (edd.k.a $$2 : edd.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (edd.y.a $$3 : edd.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", edd.w.a);
      a($$0, "constant", edd.h.e);
      return a($$0, "y_clamped_gradient", edd.aa.a);
   }

   private static MapCodec<? extends edc> a(kd<MapCodec<? extends edc>> $$0, String $$1, azn<? extends edc> $$2) {
      return kd.a($$0, $$1, $$2.a());
   }

   static <A, O> azn<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return azn.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> azn<O> a(Function<edc, O> $$0, Function<O, edc> $$1) {
      return a(edc.d, $$0, $$1);
   }

   static <O> azn<O> a(BiFunction<edc, edc, O> $$0, Function<O, edc> $$1, Function<O, edc> $$2) {
      return azn.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(edc.d.fieldOf("argument1").forGetter($$1), edc.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> azn<O> a(MapCodec<O> $$0) {
      return azn.a($$0);
   }

   private edd() {
   }

   public static edc a(edc $$0) {
      return new edd.l(edd.l.a.a, $$0);
   }

   public static edc b(edc $$0) {
      return new edd.l(edd.l.a.b, $$0);
   }

   public static edc c(edc $$0) {
      return new edd.l(edd.l.a.c, $$0);
   }

   public static edc d(edc $$0) {
      return new edd.l(edd.l.a.d, $$0);
   }

   public static edc e(edc $$0) {
      return new edd.l(edd.l.a.e, $$0);
   }

   public static edc a(jq<est.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new edd.o(new edc.c($$0), $$1, $$2), $$3, $$4);
   }

   public static edc a(jq<est.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static edc a(jq<est.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static edc a(edc $$0, edc $$1, double $$2, jq<est.a> $$3) {
      return new edd.v($$0, a(), $$1, $$2, 0.0, new edc.c($$3));
   }

   public static edc a(jq<est.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static edc b(jq<est.a> $$0, double $$1, double $$2) {
      return new edd.o(new edc.c($$0), $$1, $$2);
   }

   public static edc a(jq<est.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static edc a(edc $$0, double $$1, double $$2, edc $$3, edc $$4) {
      return new edd.q($$0, $$1, $$2, $$3, $$4);
   }

   public static edc b(jq<est.a> $$0) {
      return new edd.s(new edc.c($$0));
   }

   public static edc c(jq<est.a> $$0) {
      return new edd.t(new edc.c($$0));
   }

   public static edc d(jq<est.a> $$0) {
      return new edd.r(new edc.c($$0));
   }

   public static edc f(edc $$0) {
      return new edd.e($$0);
   }

   public static edc a(long $$0) {
      return new edd.i($$0);
   }

   public static edc a(edc $$0, jq<est.a> $$1, edd.z.a $$2) {
      return new edd.z($$0, new edc.c($$1), $$2);
   }

   public static edc a(edc $$0, edc $$1) {
      return edd.y.a(edd.y.a.a, $$0, $$1);
   }

   public static edc b(edc $$0, edc $$1) {
      return edd.y.a(edd.y.a.b, $$0, $$1);
   }

   public static edc c(edc $$0, edc $$1) {
      return edd.y.a(edd.y.a.c, $$0, $$1);
   }

   public static edc d(edc $$0, edc $$1) {
      return edd.y.a(edd.y.a.d, $$0, $$1);
   }

   public static edc a(ayw<edd.w.b, edd.w.a> $$0) {
      return new edd.w($$0);
   }

   public static edc a() {
      return edd.h.f;
   }

   public static edc a(double $$0) {
      return new edd.h($$0);
   }

   public static edc a(int $$0, int $$1, double $$2, double $$3) {
      return new edd.aa($$0, $$1, $$2, $$3);
   }

   public static edc a(edc $$0, edd.k.a $$1) {
      return edd.k.a($$1, $$0);
   }

   private static edc a(edc $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static edc b() {
      return edd.d.a;
   }

   public static edc c() {
      return edd.f.a;
   }

   public static edc a(edc $$0, edc $$1, edc $$2) {
      if ($$1 instanceof edd.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         edc $$4 = d($$0);
         edc $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static edc a(edc $$0, double $$1, edc $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(edd.y.a e, edc f, edc g, double h, double i) implements edd.y {
      @Override
      public double a(edc.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, edc.a $$1) {
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
      public edc a(edc.f $$0) {
         return $$0.apply(edd.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public edd.y.a j() {
         return this.e;
      }

      @Override
      public edc k() {
         return this.f;
      }

      @Override
      public edc l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements edc.d {
      private static final MapCodec<edd.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(ebj.e * 2, ebj.d * 2).fieldOf("from_y").forGetter(edd.aa::j),
                  Codec.intRange(ebj.e * 2, ebj.d * 2).fieldOf("to_y").forGetter(edd.aa::k),
                  edd.d.fieldOf("from_value").forGetter(edd.aa::l),
                  edd.d.fieldOf("to_value").forGetter(edd.aa::m)
               )
               .apply($$0, edd.aa::new)
      );
      public static final azn<edd.aa> a = edd.a(i);

      @Override
      public double a(edc.b $$0) {
         return azu.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public azn<? extends edc> c() {
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

   protected static enum b implements edd.c {
      a;

      @Override
      public double a(edc.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, edc.a $$1) {
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

   public interface c extends edc.d {
      azn<edc> e = azn.a(MapCodec.unit(edd.b.a));

      @Override
      default azn<? extends edc> c() {
         return e;
      }
   }

   protected static enum d implements edc.d {
      a;

      public static final azn<edc> e = azn.a(MapCodec.unit(a));

      @Override
      public double a(edc.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, edc.a $$1) {
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
      public azn<? extends edc> c() {
         return e;
      }
   }

   static record e(edc a) implements edd.x {
      static final azn<edd.e> e = edd.a(edd.e::new, edd.e::j);

      @Override
      public double a(edc.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public edc a(edc.f $$0) {
         return $$0.apply(new edd.e(this.a.a($$0)));
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
      public azn<? extends edc> c() {
         return e;
      }

      @Override
      public edc j() {
         return this.a;
      }
   }

   protected static enum f implements edc.d {
      a;

      public static final azn<edc> e = azn.a(MapCodec.unit(a));

      @Override
      public double a(edc.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, edc.a $$1) {
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
      public azn<? extends edc> c() {
         return e;
      }
   }

   protected static record g(edc e, double f, double g) implements edd.p {
      private static final MapCodec<edd.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(edc.b.fieldOf("input").forGetter(edd.g::aE_), edd.d.fieldOf("min").forGetter(edd.g::a), edd.d.fieldOf("max").forGetter(edd.g::b))
               .apply($$0, edd.g::new)
      );
      public static final azn<edd.g> a = edd.a(h);

      @Override
      public double a(double $$0) {
         return azu.a($$0, this.f, this.g);
      }

      @Override
      public edc a(edc.f $$0) {
         return new edd.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public azn<? extends edc> c() {
         return a;
      }

      @Override
      public edc aE_() {
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

   static record h(double a) implements edc.d {
      static final azn<edd.h> e = edd.a(edd.d, edd.h::new, edd.h::j);
      static final edd.h f = new edd.h(0.0);

      @Override
      public void a(double[] $$0, edc.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public azn<? extends edc> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements edc.d {
      public static final azn<edd.i> a = azn.a(MapCodec.unit(new edd.i(0L)));
      private static final float e = -0.9F;
      private final esw f;

      public i(long $$0) {
         bac $$1 = new edk($$0);
         $$1.b(17292);
         this.f = new esw($$1);
      }

      private static float a(esw $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - azu.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = azu.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (azu.e((float)$$10) * 3439.0F + azu.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - azu.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = azu.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(edc.b $$0) {
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
      public azn<? extends edc> c() {
         return a;
      }
   }

   @bbb
   public static record j(jq<edc> a) implements edc {
      @Override
      public double a(edc.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, edc.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public edc a(edc.f $$0) {
         return $$0.apply(new edd.j(new jq.a<>(this.a.a().a($$0))));
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
      public azn<? extends edc> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jq<edc> j() {
         return this.a;
      }
   }

   protected static record k(edd.k.a a, edc e, double f, double g) implements edd.p {
      public static edd.k a(edd.k.a $$0, edc $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != edd.k.a.a && $$0 != edd.k.a.b ? new edd.k($$0, $$1, $$3, $$4) : new edd.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(edd.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = azu.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public edd.k b(edc.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public azn<? extends edc> c() {
         return this.a.h;
      }

      public edd.k.a k() {
         return this.a;
      }

      @Override
      public edc aE_() {
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

      static enum a implements baq {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final azn<edd.k> h = edd.a($$0x -> edd.k.a(this, $$0x), edd.k::aE_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(edd.l.a a, edc e) implements edd.m {
      @Override
      public double a(edc.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, edc.a $$1) {
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
      public edd.l.a j() {
         return this.a;
      }

      @Override
      public edc k() {
         return this.e;
      }

      static enum a implements baq {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final azn<edd.m> g = edd.a($$0x -> new edd.l(this, $$0x), edd.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends edc {
      edd.l.a j();

      edc k();

      @Override
      default azn<? extends edc> c() {
         return this.j().g;
      }

      @Override
      default edc a(edc.f $$0) {
         return $$0.apply(new edd.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(edd.n.a e, edc f, double g, double h, double i) implements edd.p, edd.y {
      @Override
      public edd.y.a j() {
         return this.e == edd.n.a.a ? edd.y.a.b : edd.y.a.a;
      }

      @Override
      public edc k() {
         return edd.a(this.i);
      }

      @Override
      public edc l() {
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
      public edc a(edc.f $$0) {
         edc $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == edd.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new edd.n(this.e, $$1, $$4, $$5, this.i);
      }

      public edd.n.a m() {
         return this.e;
      }

      @Override
      public edc aE_() {
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

   protected static record o(edc.c f, @Deprecated double g, double h) implements edc {
      public static final MapCodec<edd.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  edc.c.a.fieldOf("noise").forGetter(edd.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(edd.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(edd.o::l)
               )
               .apply($$0, edd.o::new)
      );
      public static final azn<edd.o> e = edd.a(a);

      @Override
      public double a(edc.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, edc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edc a(edc.f $$0) {
         return $$0.apply(new edd.o($$0.a(this.f), this.g, this.h));
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
      public azn<? extends edc> c() {
         return e;
      }

      public edc.c j() {
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

   interface p extends edc {
      edc aE_();

      @Override
      default double a(edc.b $$0) {
         return this.a(this.aE_().a($$0));
      }

      @Override
      default void a(double[] $$0, edc.a $$1) {
         this.aE_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(edc f, double g, double h, edc i, edc j) implements edc {
      public static final MapCodec<edd.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  edc.d.fieldOf("input").forGetter(edd.q::j),
                  edd.d.fieldOf("min_inclusive").forGetter(edd.q::k),
                  edd.d.fieldOf("max_exclusive").forGetter(edd.q::l),
                  edc.d.fieldOf("when_in_range").forGetter(edd.q::m),
                  edc.d.fieldOf("when_out_of_range").forGetter(edd.q::n)
               )
               .apply($$0, edd.q::new)
      );
      public static final azn<edd.q> e = edd.a(a);

      @Override
      public double a(edc.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, edc.a $$1) {
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
      public edc a(edc.f $$0) {
         return $$0.apply(new edd.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public azn<? extends edc> c() {
         return e;
      }

      public edc j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public edc m() {
         return this.i;
      }

      public edc n() {
         return this.j;
      }
   }

   protected static record r(edc.c a) implements edd.u {
      static final azn<edd.r> e = edd.a(edc.c.a, edd.r::new, edd.r::j);

      @Override
      public double a(edc.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public edc a(edc.f $$0) {
         return $$0.apply(new edd.r($$0.a(this.a)));
      }

      @Override
      public azn<? extends edc> c() {
         return e;
      }

      @Override
      public edc.c j() {
         return this.a;
      }
   }

   protected static record s(edc.c a) implements edd.u {
      static final azn<edd.s> e = edd.a(edc.c.a, edd.s::new, edd.s::j);

      @Override
      public double a(edc.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public edc a(edc.f $$0) {
         return $$0.apply(new edd.s($$0.a(this.a)));
      }

      @Override
      public azn<? extends edc> c() {
         return e;
      }

      @Override
      public edc.c j() {
         return this.a;
      }
   }

   protected static record t(edc.c a) implements edd.u {
      static final azn<edd.t> e = edd.a(edc.c.a, edd.t::new, edd.t::j);

      @Override
      public double a(edc.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public edc a(edc.f $$0) {
         return $$0.apply(new edd.t($$0.a(this.a)));
      }

      @Override
      public azn<? extends edc> c() {
         return e;
      }

      @Override
      public edc.c j() {
         return this.a;
      }
   }

   interface u extends edc {
      edc.c j();

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
      default void a(double[] $$0, edc.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(edc e, edc f, edc g, double h, double i, edc.c j) implements edc {
      private static final MapCodec<edd.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  edc.d.fieldOf("shift_x").forGetter(edd.v::j),
                  edc.d.fieldOf("shift_y").forGetter(edd.v::k),
                  edc.d.fieldOf("shift_z").forGetter(edd.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(edd.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(edd.v::n),
                  edc.c.a.fieldOf("noise").forGetter(edd.v::o)
               )
               .apply($$0, edd.v::new)
      );
      public static final azn<edd.v> a = edd.a(k);

      @Override
      public double a(edc.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, edc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edc a(edc.f $$0) {
         return $$0.apply(new edd.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public azn<? extends edc> c() {
         return a;
      }

      public edc j() {
         return this.e;
      }

      public edc k() {
         return this.f;
      }

      public edc l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public edc.c o() {
         return this.j;
      }
   }

   public static record w(ayw<edd.w.b, edd.w.a> e) implements edc {
      private static final Codec<ayw<edd.w.b, edd.w.a>> f = ayw.a(edd.w.a.b);
      private static final MapCodec<edd.w> g = f.fieldOf("spline").xmap(edd.w::new, edd.w::j);
      public static final azn<edd.w> a = edd.a(g);

      @Override
      public double a(edc.b $$0) {
         return (double)this.e.a(new edd.w.b($$0));
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
      public void a(double[] $$0, edc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edc a(edc.f $$0) {
         return $$0.apply(new edd.w(this.e.a((ayw.d<edd.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public azn<? extends edc> c() {
         return a;
      }

      public ayw<edd.w.b, edd.w.a> j() {
         return this.e;
      }

      public static record a(jq<edc> c) implements bax<edd.w.b> {
         public static final Codec<edd.w.a> b = edc.c.xmap(edd.w.a::new, edd.w.a::a);

         @Override
         public String toString() {
            Optional<alo<edc>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               alo<edc> $$1 = $$0.get();
               if ($$1 == edq.d) {
                  return "continents";
               }

               if ($$1 == edq.e) {
                  return "erosion";
               }

               if ($$1 == edq.f) {
                  return "weirdness";
               }

               if ($$1 == edq.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(edd.w.b $$0) {
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

         public edd.w.a a(edc.f $$0) {
            return new edd.w.a(new jq.a<>(this.c.a().a($$0)));
         }

         public jq<edc> a() {
            return this.c;
         }
      }

      public static record b(edc.b a) {
      }
   }

   interface x extends edc {
      edc j();

      @Override
      default double a(edc.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, edc.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(edc.b var1, double var2);
   }

   interface y extends edc {
      Logger a = LogUtils.getLogger();

      static edd.y a(edd.y.a $$0, edc $$1, edc $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == edd.y.a.c || $$0 == edd.y.a.d) {
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
         if ($$0 == edd.y.a.b || $$0 == edd.y.a.a) {
            if ($$1 instanceof edd.h $$11) {
               return new edd.n($$0 == edd.y.a.a ? edd.n.a.b : edd.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof edd.h $$12) {
               return new edd.n($$0 == edd.y.a.a ? edd.n.a.b : edd.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new edd.a($$0, $$1, $$2, $$9, $$10);
      }

      edd.y.a j();

      edc k();

      edc l();

      @Override
      default azn<? extends edc> c() {
         return this.j().e;
      }

      public static enum a implements baq {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final azn<edd.y> e = edd.a((BiFunction<edc, edc, edd.y>)(($$0x, $$1) -> edd.y.a(this, $$0x, $$1)), edd.y::k, edd.y::l);
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

   protected static record z(edc e, edc.c f, edd.z.a g) implements edd.x {
      private static final MapCodec<edd.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  edc.d.fieldOf("input").forGetter(edd.z::j),
                  edc.c.a.fieldOf("noise").forGetter(edd.z::k),
                  edd.z.a.c.fieldOf("rarity_value_mapper").forGetter(edd.z::l)
               )
               .apply($$0, edd.z::new)
      );
      public static final azn<edd.z> a = edd.a(h);

      @Override
      public double a(edc.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public edc a(edc.f $$0) {
         return $$0.apply(new edd.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public azn<? extends edc> c() {
         return a;
      }

      @Override
      public edc j() {
         return this.e;
      }

      public edc.c k() {
         return this.f;
      }

      public edd.z.a l() {
         return this.g;
      }

      public static enum a implements baq {
         a("type_1", edq.a::b, 2.0),
         b("type_2", edq.a::a, 3.0);

         public static final Codec<edd.z.a> c = baq.a(edd.z.a::values);
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
