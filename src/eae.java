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

public final class eae {
   private static final Codec<ead> c = lu.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<ead> b = Codec.either(d, c)
      .xmap($$0 -> (ead)$$0.map(eae::a, Function.identity()), $$0 -> $$0 instanceof eae.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends ead> a(ka<MapCodec<? extends ead>> $$0) {
      a($$0, "blend_alpha", eae.d.e);
      a($$0, "blend_offset", eae.f.e);
      a($$0, "beardifier", eae.b.e);
      a($$0, "old_blended_noise", epp.a);

      for (eae.l.a $$1 : eae.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", eae.o.e);
      a($$0, "end_islands", eae.i.a);
      a($$0, "weird_scaled_sampler", eae.z.a);
      a($$0, "shifted_noise", eae.v.a);
      a($$0, "range_choice", eae.q.e);
      a($$0, "shift_a", eae.s.e);
      a($$0, "shift_b", eae.t.e);
      a($$0, "shift", eae.r.e);
      a($$0, "blend_density", eae.e.e);
      a($$0, "clamp", eae.g.a);

      for (eae.k.a $$2 : eae.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (eae.y.a $$3 : eae.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", eae.w.a);
      a($$0, "constant", eae.h.e);
      return a($$0, "y_clamped_gradient", eae.aa.a);
   }

   private static MapCodec<? extends ead> a(ka<MapCodec<? extends ead>> $$0, String $$1, ayw<? extends ead> $$2) {
      return ka.a($$0, $$1, $$2.a());
   }

   static <A, O> ayw<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return ayw.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> ayw<O> a(Function<ead, O> $$0, Function<O, ead> $$1) {
      return a(ead.d, $$0, $$1);
   }

   static <O> ayw<O> a(BiFunction<ead, ead, O> $$0, Function<O, ead> $$1, Function<O, ead> $$2) {
      return ayw.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(ead.d.fieldOf("argument1").forGetter($$1), ead.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> ayw<O> a(MapCodec<O> $$0) {
      return ayw.a($$0);
   }

   private eae() {
   }

   public static ead a(ead $$0) {
      return new eae.l(eae.l.a.a, $$0);
   }

   public static ead b(ead $$0) {
      return new eae.l(eae.l.a.b, $$0);
   }

   public static ead c(ead $$0) {
      return new eae.l(eae.l.a.c, $$0);
   }

   public static ead d(ead $$0) {
      return new eae.l(eae.l.a.d, $$0);
   }

   public static ead e(ead $$0) {
      return new eae.l(eae.l.a.e, $$0);
   }

   public static ead a(jn<eps.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new eae.o(new ead.c($$0), $$1, $$2), $$3, $$4);
   }

   public static ead a(jn<eps.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static ead a(jn<eps.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static ead a(ead $$0, ead $$1, double $$2, jn<eps.a> $$3) {
      return new eae.v($$0, a(), $$1, $$2, 0.0, new ead.c($$3));
   }

   public static ead a(jn<eps.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static ead b(jn<eps.a> $$0, double $$1, double $$2) {
      return new eae.o(new ead.c($$0), $$1, $$2);
   }

   public static ead a(jn<eps.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static ead a(ead $$0, double $$1, double $$2, ead $$3, ead $$4) {
      return new eae.q($$0, $$1, $$2, $$3, $$4);
   }

   public static ead b(jn<eps.a> $$0) {
      return new eae.s(new ead.c($$0));
   }

   public static ead c(jn<eps.a> $$0) {
      return new eae.t(new ead.c($$0));
   }

   public static ead d(jn<eps.a> $$0) {
      return new eae.r(new ead.c($$0));
   }

   public static ead f(ead $$0) {
      return new eae.e($$0);
   }

   public static ead a(long $$0) {
      return new eae.i($$0);
   }

   public static ead a(ead $$0, jn<eps.a> $$1, eae.z.a $$2) {
      return new eae.z($$0, new ead.c($$1), $$2);
   }

   public static ead a(ead $$0, ead $$1) {
      return eae.y.a(eae.y.a.a, $$0, $$1);
   }

   public static ead b(ead $$0, ead $$1) {
      return eae.y.a(eae.y.a.b, $$0, $$1);
   }

   public static ead c(ead $$0, ead $$1) {
      return eae.y.a(eae.y.a.c, $$0, $$1);
   }

   public static ead d(ead $$0, ead $$1) {
      return eae.y.a(eae.y.a.d, $$0, $$1);
   }

   public static ead a(ayf<eae.w.b, eae.w.a> $$0) {
      return new eae.w($$0);
   }

   public static ead a() {
      return eae.h.f;
   }

   public static ead a(double $$0) {
      return new eae.h($$0);
   }

   public static ead a(int $$0, int $$1, double $$2, double $$3) {
      return new eae.aa($$0, $$1, $$2, $$3);
   }

   public static ead a(ead $$0, eae.k.a $$1) {
      return eae.k.a($$1, $$0);
   }

   private static ead a(ead $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static ead b() {
      return eae.d.a;
   }

   public static ead c() {
      return eae.f.a;
   }

   public static ead a(ead $$0, ead $$1, ead $$2) {
      if ($$1 instanceof eae.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         ead $$4 = d($$0);
         ead $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static ead a(ead $$0, double $$1, ead $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(eae.y.a e, ead f, ead g, double h, double i) implements eae.y {
      @Override
      public double a(ead.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, ead.a $$1) {
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
      public ead a(ead.f $$0) {
         return $$0.apply(eae.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public eae.y.a j() {
         return this.e;
      }

      @Override
      public ead k() {
         return this.f;
      }

      @Override
      public ead l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements ead.d {
      private static final MapCodec<eae.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dyk.e * 2, dyk.d * 2).fieldOf("from_y").forGetter(eae.aa::j),
                  Codec.intRange(dyk.e * 2, dyk.d * 2).fieldOf("to_y").forGetter(eae.aa::k),
                  eae.d.fieldOf("from_value").forGetter(eae.aa::l),
                  eae.d.fieldOf("to_value").forGetter(eae.aa::m)
               )
               .apply($$0, eae.aa::new)
      );
      public static final ayw<eae.aa> a = eae.a(i);

      @Override
      public double a(ead.b $$0) {
         return azd.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public ayw<? extends ead> c() {
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

   protected static enum b implements eae.c {
      a;

      @Override
      public double a(ead.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, ead.a $$1) {
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

   public interface c extends ead.d {
      ayw<ead> e = ayw.a(MapCodec.unit(eae.b.a));

      @Override
      default ayw<? extends ead> c() {
         return e;
      }
   }

   protected static enum d implements ead.d {
      a;

      public static final ayw<ead> e = ayw.a(MapCodec.unit(a));

      @Override
      public double a(ead.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, ead.a $$1) {
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
      public ayw<? extends ead> c() {
         return e;
      }
   }

   static record e(ead a) implements eae.x {
      static final ayw<eae.e> e = eae.a(eae.e::new, eae.e::j);

      @Override
      public double a(ead.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public ead a(ead.f $$0) {
         return $$0.apply(new eae.e(this.a.a($$0)));
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
      public ayw<? extends ead> c() {
         return e;
      }

      @Override
      public ead j() {
         return this.a;
      }
   }

   protected static enum f implements ead.d {
      a;

      public static final ayw<ead> e = ayw.a(MapCodec.unit(a));

      @Override
      public double a(ead.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, ead.a $$1) {
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
      public ayw<? extends ead> c() {
         return e;
      }
   }

   protected static record g(ead e, double f, double g) implements eae.p {
      private static final MapCodec<eae.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ead.b.fieldOf("input").forGetter(eae.g::aE_), eae.d.fieldOf("min").forGetter(eae.g::a), eae.d.fieldOf("max").forGetter(eae.g::b))
               .apply($$0, eae.g::new)
      );
      public static final ayw<eae.g> a = eae.a(h);

      @Override
      public double a(double $$0) {
         return azd.a($$0, this.f, this.g);
      }

      @Override
      public ead a(ead.f $$0) {
         return new eae.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public ayw<? extends ead> c() {
         return a;
      }

      @Override
      public ead aE_() {
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

   static record h(double a) implements ead.d {
      static final ayw<eae.h> e = eae.a(eae.d, eae.h::new, eae.h::j);
      static final eae.h f = new eae.h(0.0);

      @Override
      public void a(double[] $$0, ead.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public ayw<? extends ead> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements ead.d {
      public static final ayw<eae.i> a = ayw.a(MapCodec.unit(new eae.i(0L)));
      private static final float e = -0.9F;
      private final epv f;

      public i(long $$0) {
         azl $$1 = new eal($$0);
         $$1.b(17292);
         this.f = new epv($$1);
      }

      private static float a(epv $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - azd.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = azd.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (azd.e((float)$$10) * 3439.0F + azd.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - azd.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = azd.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(ead.b $$0) {
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
      public ayw<? extends ead> c() {
         return a;
      }
   }

   @baj
   public static record j(jn<ead> a) implements ead {
      @Override
      public double a(ead.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, ead.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public ead a(ead.f $$0) {
         return $$0.apply(new eae.j(new jn.a<>(this.a.a().a($$0))));
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
      public ayw<? extends ead> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jn<ead> j() {
         return this.a;
      }
   }

   protected static record k(eae.k.a a, ead e, double f, double g) implements eae.p {
      public static eae.k a(eae.k.a $$0, ead $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != eae.k.a.a && $$0 != eae.k.a.b ? new eae.k($$0, $$1, $$3, $$4) : new eae.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(eae.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = azd.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public eae.k b(ead.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public ayw<? extends ead> c() {
         return this.a.h;
      }

      public eae.k.a k() {
         return this.a;
      }

      @Override
      public ead aE_() {
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

      static enum a implements azz {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final ayw<eae.k> h = eae.a($$0x -> eae.k.a(this, $$0x), eae.k::aE_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(eae.l.a a, ead e) implements eae.m {
      @Override
      public double a(ead.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, ead.a $$1) {
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
      public eae.l.a j() {
         return this.a;
      }

      @Override
      public ead k() {
         return this.e;
      }

      static enum a implements azz {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final ayw<eae.m> g = eae.a($$0x -> new eae.l(this, $$0x), eae.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends ead {
      eae.l.a j();

      ead k();

      @Override
      default ayw<? extends ead> c() {
         return this.j().g;
      }

      @Override
      default ead a(ead.f $$0) {
         return $$0.apply(new eae.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(eae.n.a e, ead f, double g, double h, double i) implements eae.p, eae.y {
      @Override
      public eae.y.a j() {
         return this.e == eae.n.a.a ? eae.y.a.b : eae.y.a.a;
      }

      @Override
      public ead k() {
         return eae.a(this.i);
      }

      @Override
      public ead l() {
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
      public ead a(ead.f $$0) {
         ead $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == eae.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new eae.n(this.e, $$1, $$4, $$5, this.i);
      }

      public eae.n.a m() {
         return this.e;
      }

      @Override
      public ead aE_() {
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

   protected static record o(ead.c f, @Deprecated double g, double h) implements ead {
      public static final MapCodec<eae.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ead.c.a.fieldOf("noise").forGetter(eae.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(eae.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(eae.o::l)
               )
               .apply($$0, eae.o::new)
      );
      public static final ayw<eae.o> e = eae.a(a);

      @Override
      public double a(ead.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, ead.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ead a(ead.f $$0) {
         return $$0.apply(new eae.o($$0.a(this.f), this.g, this.h));
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
      public ayw<? extends ead> c() {
         return e;
      }

      public ead.c j() {
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

   interface p extends ead {
      ead aE_();

      @Override
      default double a(ead.b $$0) {
         return this.a(this.aE_().a($$0));
      }

      @Override
      default void a(double[] $$0, ead.a $$1) {
         this.aE_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(ead f, double g, double h, ead i, ead j) implements ead {
      public static final MapCodec<eae.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ead.d.fieldOf("input").forGetter(eae.q::j),
                  eae.d.fieldOf("min_inclusive").forGetter(eae.q::k),
                  eae.d.fieldOf("max_exclusive").forGetter(eae.q::l),
                  ead.d.fieldOf("when_in_range").forGetter(eae.q::m),
                  ead.d.fieldOf("when_out_of_range").forGetter(eae.q::n)
               )
               .apply($$0, eae.q::new)
      );
      public static final ayw<eae.q> e = eae.a(a);

      @Override
      public double a(ead.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, ead.a $$1) {
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
      public ead a(ead.f $$0) {
         return $$0.apply(new eae.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public ayw<? extends ead> c() {
         return e;
      }

      public ead j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public ead m() {
         return this.i;
      }

      public ead n() {
         return this.j;
      }
   }

   protected static record r(ead.c a) implements eae.u {
      static final ayw<eae.r> e = eae.a(ead.c.a, eae.r::new, eae.r::j);

      @Override
      public double a(ead.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public ead a(ead.f $$0) {
         return $$0.apply(new eae.r($$0.a(this.a)));
      }

      @Override
      public ayw<? extends ead> c() {
         return e;
      }

      @Override
      public ead.c j() {
         return this.a;
      }
   }

   protected static record s(ead.c a) implements eae.u {
      static final ayw<eae.s> e = eae.a(ead.c.a, eae.s::new, eae.s::j);

      @Override
      public double a(ead.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public ead a(ead.f $$0) {
         return $$0.apply(new eae.s($$0.a(this.a)));
      }

      @Override
      public ayw<? extends ead> c() {
         return e;
      }

      @Override
      public ead.c j() {
         return this.a;
      }
   }

   protected static record t(ead.c a) implements eae.u {
      static final ayw<eae.t> e = eae.a(ead.c.a, eae.t::new, eae.t::j);

      @Override
      public double a(ead.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public ead a(ead.f $$0) {
         return $$0.apply(new eae.t($$0.a(this.a)));
      }

      @Override
      public ayw<? extends ead> c() {
         return e;
      }

      @Override
      public ead.c j() {
         return this.a;
      }
   }

   interface u extends ead {
      ead.c j();

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
      default void a(double[] $$0, ead.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(ead e, ead f, ead g, double h, double i, ead.c j) implements ead {
      private static final MapCodec<eae.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ead.d.fieldOf("shift_x").forGetter(eae.v::j),
                  ead.d.fieldOf("shift_y").forGetter(eae.v::k),
                  ead.d.fieldOf("shift_z").forGetter(eae.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(eae.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(eae.v::n),
                  ead.c.a.fieldOf("noise").forGetter(eae.v::o)
               )
               .apply($$0, eae.v::new)
      );
      public static final ayw<eae.v> a = eae.a(k);

      @Override
      public double a(ead.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, ead.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ead a(ead.f $$0) {
         return $$0.apply(new eae.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public ayw<? extends ead> c() {
         return a;
      }

      public ead j() {
         return this.e;
      }

      public ead k() {
         return this.f;
      }

      public ead l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public ead.c o() {
         return this.j;
      }
   }

   public static record w(ayf<eae.w.b, eae.w.a> e) implements ead {
      private static final Codec<ayf<eae.w.b, eae.w.a>> f = ayf.a(eae.w.a.b);
      private static final MapCodec<eae.w> g = f.fieldOf("spline").xmap(eae.w::new, eae.w::j);
      public static final ayw<eae.w> a = eae.a(g);

      @Override
      public double a(ead.b $$0) {
         return (double)this.e.a(new eae.w.b($$0));
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
      public void a(double[] $$0, ead.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ead a(ead.f $$0) {
         return $$0.apply(new eae.w(this.e.a((ayf.d<eae.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public ayw<? extends ead> c() {
         return a;
      }

      public ayf<eae.w.b, eae.w.a> j() {
         return this.e;
      }

      public static record a(jn<ead> c) implements baf<eae.w.b> {
         public static final Codec<eae.w.a> b = ead.c.xmap(eae.w.a::new, eae.w.a::a);

         @Override
         public String toString() {
            Optional<alb<ead>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               alb<ead> $$1 = $$0.get();
               if ($$1 == ear.d) {
                  return "continents";
               }

               if ($$1 == ear.e) {
                  return "erosion";
               }

               if ($$1 == ear.f) {
                  return "weirdness";
               }

               if ($$1 == ear.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(eae.w.b $$0) {
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

         public eae.w.a a(ead.f $$0) {
            return new eae.w.a(new jn.a<>(this.c.a().a($$0)));
         }

         public jn<ead> a() {
            return this.c;
         }
      }

      public static record b(ead.b a) {
      }
   }

   interface x extends ead {
      ead j();

      @Override
      default double a(ead.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, ead.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(ead.b var1, double var2);
   }

   interface y extends ead {
      Logger a = LogUtils.getLogger();

      static eae.y a(eae.y.a $$0, ead $$1, ead $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == eae.y.a.c || $$0 == eae.y.a.d) {
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
         if ($$0 == eae.y.a.b || $$0 == eae.y.a.a) {
            if ($$1 instanceof eae.h $$11) {
               return new eae.n($$0 == eae.y.a.a ? eae.n.a.b : eae.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof eae.h $$12) {
               return new eae.n($$0 == eae.y.a.a ? eae.n.a.b : eae.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new eae.a($$0, $$1, $$2, $$9, $$10);
      }

      eae.y.a j();

      ead k();

      ead l();

      @Override
      default ayw<? extends ead> c() {
         return this.j().e;
      }

      public static enum a implements azz {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final ayw<eae.y> e = eae.a((BiFunction<ead, ead, eae.y>)(($$0x, $$1) -> eae.y.a(this, $$0x, $$1)), eae.y::k, eae.y::l);
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

   protected static record z(ead e, ead.c f, eae.z.a g) implements eae.x {
      private static final MapCodec<eae.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ead.d.fieldOf("input").forGetter(eae.z::j),
                  ead.c.a.fieldOf("noise").forGetter(eae.z::k),
                  eae.z.a.c.fieldOf("rarity_value_mapper").forGetter(eae.z::l)
               )
               .apply($$0, eae.z::new)
      );
      public static final ayw<eae.z> a = eae.a(h);

      @Override
      public double a(ead.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public ead a(ead.f $$0) {
         return $$0.apply(new eae.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public ayw<? extends ead> c() {
         return a;
      }

      @Override
      public ead j() {
         return this.e;
      }

      public ead.c k() {
         return this.f;
      }

      public eae.z.a l() {
         return this.g;
      }

      public static enum a implements azz {
         a("type_1", ear.a::b, 2.0),
         b("type_2", ear.a::a, 3.0);

         public static final Codec<eae.z.a> c = azz.a(eae.z.a::values);
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
