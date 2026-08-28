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

public final class edc {
   private static final Codec<edb> c = ma.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<edb> b = Codec.either(d, c)
      .xmap($$0 -> (edb)$$0.map(edc::a, Function.identity()), $$0 -> $$0 instanceof edc.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends edb> a(kd<MapCodec<? extends edb>> $$0) {
      a($$0, "blend_alpha", edc.d.e);
      a($$0, "blend_offset", edc.f.e);
      a($$0, "beardifier", edc.b.e);
      a($$0, "old_blended_noise", esp.a);

      for (edc.l.a $$1 : edc.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", edc.o.e);
      a($$0, "end_islands", edc.i.a);
      a($$0, "weird_scaled_sampler", edc.z.a);
      a($$0, "shifted_noise", edc.v.a);
      a($$0, "range_choice", edc.q.e);
      a($$0, "shift_a", edc.s.e);
      a($$0, "shift_b", edc.t.e);
      a($$0, "shift", edc.r.e);
      a($$0, "blend_density", edc.e.e);
      a($$0, "clamp", edc.g.a);

      for (edc.k.a $$2 : edc.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (edc.y.a $$3 : edc.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", edc.w.a);
      a($$0, "constant", edc.h.e);
      return a($$0, "y_clamped_gradient", edc.aa.a);
   }

   private static MapCodec<? extends edb> a(kd<MapCodec<? extends edb>> $$0, String $$1, azx<? extends edb> $$2) {
      return kd.a($$0, $$1, $$2.a());
   }

   static <A, O> azx<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return azx.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> azx<O> a(Function<edb, O> $$0, Function<O, edb> $$1) {
      return a(edb.d, $$0, $$1);
   }

   static <O> azx<O> a(BiFunction<edb, edb, O> $$0, Function<O, edb> $$1, Function<O, edb> $$2) {
      return azx.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(edb.d.fieldOf("argument1").forGetter($$1), edb.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> azx<O> a(MapCodec<O> $$0) {
      return azx.a($$0);
   }

   private edc() {
   }

   public static edb a(edb $$0) {
      return new edc.l(edc.l.a.a, $$0);
   }

   public static edb b(edb $$0) {
      return new edc.l(edc.l.a.b, $$0);
   }

   public static edb c(edb $$0) {
      return new edc.l(edc.l.a.c, $$0);
   }

   public static edb d(edb $$0) {
      return new edc.l(edc.l.a.d, $$0);
   }

   public static edb e(edb $$0) {
      return new edc.l(edc.l.a.e, $$0);
   }

   public static edb a(jq<ess.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new edc.o(new edb.c($$0), $$1, $$2), $$3, $$4);
   }

   public static edb a(jq<ess.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static edb a(jq<ess.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static edb a(edb $$0, edb $$1, double $$2, jq<ess.a> $$3) {
      return new edc.v($$0, a(), $$1, $$2, 0.0, new edb.c($$3));
   }

   public static edb a(jq<ess.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static edb b(jq<ess.a> $$0, double $$1, double $$2) {
      return new edc.o(new edb.c($$0), $$1, $$2);
   }

   public static edb a(jq<ess.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static edb a(edb $$0, double $$1, double $$2, edb $$3, edb $$4) {
      return new edc.q($$0, $$1, $$2, $$3, $$4);
   }

   public static edb b(jq<ess.a> $$0) {
      return new edc.s(new edb.c($$0));
   }

   public static edb c(jq<ess.a> $$0) {
      return new edc.t(new edb.c($$0));
   }

   public static edb d(jq<ess.a> $$0) {
      return new edc.r(new edb.c($$0));
   }

   public static edb f(edb $$0) {
      return new edc.e($$0);
   }

   public static edb a(long $$0) {
      return new edc.i($$0);
   }

   public static edb a(edb $$0, jq<ess.a> $$1, edc.z.a $$2) {
      return new edc.z($$0, new edb.c($$1), $$2);
   }

   public static edb a(edb $$0, edb $$1) {
      return edc.y.a(edc.y.a.a, $$0, $$1);
   }

   public static edb b(edb $$0, edb $$1) {
      return edc.y.a(edc.y.a.b, $$0, $$1);
   }

   public static edb c(edb $$0, edb $$1) {
      return edc.y.a(edc.y.a.c, $$0, $$1);
   }

   public static edb d(edb $$0, edb $$1) {
      return edc.y.a(edc.y.a.d, $$0, $$1);
   }

   public static edb a(azg<edc.w.b, edc.w.a> $$0) {
      return new edc.w($$0);
   }

   public static edb a() {
      return edc.h.f;
   }

   public static edb a(double $$0) {
      return new edc.h($$0);
   }

   public static edb a(int $$0, int $$1, double $$2, double $$3) {
      return new edc.aa($$0, $$1, $$2, $$3);
   }

   public static edb a(edb $$0, edc.k.a $$1) {
      return edc.k.a($$1, $$0);
   }

   private static edb a(edb $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static edb b() {
      return edc.d.a;
   }

   public static edb c() {
      return edc.f.a;
   }

   public static edb a(edb $$0, edb $$1, edb $$2) {
      if ($$1 instanceof edc.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         edb $$4 = d($$0);
         edb $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static edb a(edb $$0, double $$1, edb $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(edc.y.a e, edb f, edb g, double h, double i) implements edc.y {
      @Override
      public double a(edb.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, edb.a $$1) {
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
      public edb a(edb.f $$0) {
         return $$0.apply(edc.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public edc.y.a j() {
         return this.e;
      }

      @Override
      public edb k() {
         return this.f;
      }

      @Override
      public edb l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements edb.d {
      private static final MapCodec<edc.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(ebi.e * 2, ebi.d * 2).fieldOf("from_y").forGetter(edc.aa::j),
                  Codec.intRange(ebi.e * 2, ebi.d * 2).fieldOf("to_y").forGetter(edc.aa::k),
                  edc.d.fieldOf("from_value").forGetter(edc.aa::l),
                  edc.d.fieldOf("to_value").forGetter(edc.aa::m)
               )
               .apply($$0, edc.aa::new)
      );
      public static final azx<edc.aa> a = edc.a(i);

      @Override
      public double a(edb.b $$0) {
         return bae.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public azx<? extends edb> c() {
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

   protected static enum b implements edc.c {
      a;

      @Override
      public double a(edb.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, edb.a $$1) {
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

   public interface c extends edb.d {
      azx<edb> e = azx.a(MapCodec.unit(edc.b.a));

      @Override
      default azx<? extends edb> c() {
         return e;
      }
   }

   protected static enum d implements edb.d {
      a;

      public static final azx<edb> e = azx.a(MapCodec.unit(a));

      @Override
      public double a(edb.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, edb.a $$1) {
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
      public azx<? extends edb> c() {
         return e;
      }
   }

   static record e(edb a) implements edc.x {
      static final azx<edc.e> e = edc.a(edc.e::new, edc.e::j);

      @Override
      public double a(edb.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public edb a(edb.f $$0) {
         return $$0.apply(new edc.e(this.a.a($$0)));
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
      public azx<? extends edb> c() {
         return e;
      }

      @Override
      public edb j() {
         return this.a;
      }
   }

   protected static enum f implements edb.d {
      a;

      public static final azx<edb> e = azx.a(MapCodec.unit(a));

      @Override
      public double a(edb.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, edb.a $$1) {
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
      public azx<? extends edb> c() {
         return e;
      }
   }

   protected static record g(edb e, double f, double g) implements edc.p {
      private static final MapCodec<edc.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(edb.b.fieldOf("input").forGetter(edc.g::aE_), edc.d.fieldOf("min").forGetter(edc.g::a), edc.d.fieldOf("max").forGetter(edc.g::b))
               .apply($$0, edc.g::new)
      );
      public static final azx<edc.g> a = edc.a(h);

      @Override
      public double a(double $$0) {
         return bae.a($$0, this.f, this.g);
      }

      @Override
      public edb a(edb.f $$0) {
         return new edc.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public azx<? extends edb> c() {
         return a;
      }

      @Override
      public edb aE_() {
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

   static record h(double a) implements edb.d {
      static final azx<edc.h> e = edc.a(edc.d, edc.h::new, edc.h::j);
      static final edc.h f = new edc.h(0.0);

      @Override
      public void a(double[] $$0, edb.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public azx<? extends edb> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements edb.d {
      public static final azx<edc.i> a = azx.a(MapCodec.unit(new edc.i(0L)));
      private static final float e = -0.9F;
      private final esv f;

      public i(long $$0) {
         bam $$1 = new edj($$0);
         $$1.b(17292);
         this.f = new esv($$1);
      }

      private static float a(esv $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - bae.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = bae.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (bae.e((float)$$10) * 3439.0F + bae.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - bae.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = bae.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(edb.b $$0) {
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
      public azx<? extends edb> c() {
         return a;
      }
   }

   @bbl
   public static record j(jq<edb> a) implements edb {
      @Override
      public double a(edb.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, edb.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public edb a(edb.f $$0) {
         return $$0.apply(new edc.j(new jq.a<>(this.a.a().a($$0))));
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
      public azx<? extends edb> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jq<edb> j() {
         return this.a;
      }
   }

   protected static record k(edc.k.a a, edb e, double f, double g) implements edc.p {
      public static edc.k a(edc.k.a $$0, edb $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != edc.k.a.a && $$0 != edc.k.a.b ? new edc.k($$0, $$1, $$3, $$4) : new edc.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(edc.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = bae.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public edc.k b(edb.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public azx<? extends edb> c() {
         return this.a.h;
      }

      public edc.k.a k() {
         return this.a;
      }

      @Override
      public edb aE_() {
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

      static enum a implements bba {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final azx<edc.k> h = edc.a($$0x -> edc.k.a(this, $$0x), edc.k::aE_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(edc.l.a a, edb e) implements edc.m {
      @Override
      public double a(edb.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, edb.a $$1) {
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
      public edc.l.a j() {
         return this.a;
      }

      @Override
      public edb k() {
         return this.e;
      }

      static enum a implements bba {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final azx<edc.m> g = edc.a($$0x -> new edc.l(this, $$0x), edc.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends edb {
      edc.l.a j();

      edb k();

      @Override
      default azx<? extends edb> c() {
         return this.j().g;
      }

      @Override
      default edb a(edb.f $$0) {
         return $$0.apply(new edc.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(edc.n.a e, edb f, double g, double h, double i) implements edc.p, edc.y {
      @Override
      public edc.y.a j() {
         return this.e == edc.n.a.a ? edc.y.a.b : edc.y.a.a;
      }

      @Override
      public edb k() {
         return edc.a(this.i);
      }

      @Override
      public edb l() {
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
      public edb a(edb.f $$0) {
         edb $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == edc.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new edc.n(this.e, $$1, $$4, $$5, this.i);
      }

      public edc.n.a m() {
         return this.e;
      }

      @Override
      public edb aE_() {
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

   protected static record o(edb.c f, @Deprecated double g, double h) implements edb {
      public static final MapCodec<edc.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  edb.c.a.fieldOf("noise").forGetter(edc.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(edc.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(edc.o::l)
               )
               .apply($$0, edc.o::new)
      );
      public static final azx<edc.o> e = edc.a(a);

      @Override
      public double a(edb.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, edb.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edb a(edb.f $$0) {
         return $$0.apply(new edc.o($$0.a(this.f), this.g, this.h));
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
      public azx<? extends edb> c() {
         return e;
      }

      public edb.c j() {
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

   interface p extends edb {
      edb aE_();

      @Override
      default double a(edb.b $$0) {
         return this.a(this.aE_().a($$0));
      }

      @Override
      default void a(double[] $$0, edb.a $$1) {
         this.aE_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(edb f, double g, double h, edb i, edb j) implements edb {
      public static final MapCodec<edc.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  edb.d.fieldOf("input").forGetter(edc.q::j),
                  edc.d.fieldOf("min_inclusive").forGetter(edc.q::k),
                  edc.d.fieldOf("max_exclusive").forGetter(edc.q::l),
                  edb.d.fieldOf("when_in_range").forGetter(edc.q::m),
                  edb.d.fieldOf("when_out_of_range").forGetter(edc.q::n)
               )
               .apply($$0, edc.q::new)
      );
      public static final azx<edc.q> e = edc.a(a);

      @Override
      public double a(edb.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, edb.a $$1) {
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
      public edb a(edb.f $$0) {
         return $$0.apply(new edc.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public azx<? extends edb> c() {
         return e;
      }

      public edb j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public edb m() {
         return this.i;
      }

      public edb n() {
         return this.j;
      }
   }

   protected static record r(edb.c a) implements edc.u {
      static final azx<edc.r> e = edc.a(edb.c.a, edc.r::new, edc.r::j);

      @Override
      public double a(edb.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public edb a(edb.f $$0) {
         return $$0.apply(new edc.r($$0.a(this.a)));
      }

      @Override
      public azx<? extends edb> c() {
         return e;
      }

      @Override
      public edb.c j() {
         return this.a;
      }
   }

   protected static record s(edb.c a) implements edc.u {
      static final azx<edc.s> e = edc.a(edb.c.a, edc.s::new, edc.s::j);

      @Override
      public double a(edb.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public edb a(edb.f $$0) {
         return $$0.apply(new edc.s($$0.a(this.a)));
      }

      @Override
      public azx<? extends edb> c() {
         return e;
      }

      @Override
      public edb.c j() {
         return this.a;
      }
   }

   protected static record t(edb.c a) implements edc.u {
      static final azx<edc.t> e = edc.a(edb.c.a, edc.t::new, edc.t::j);

      @Override
      public double a(edb.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public edb a(edb.f $$0) {
         return $$0.apply(new edc.t($$0.a(this.a)));
      }

      @Override
      public azx<? extends edb> c() {
         return e;
      }

      @Override
      public edb.c j() {
         return this.a;
      }
   }

   interface u extends edb {
      edb.c j();

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
      default void a(double[] $$0, edb.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(edb e, edb f, edb g, double h, double i, edb.c j) implements edb {
      private static final MapCodec<edc.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  edb.d.fieldOf("shift_x").forGetter(edc.v::j),
                  edb.d.fieldOf("shift_y").forGetter(edc.v::k),
                  edb.d.fieldOf("shift_z").forGetter(edc.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(edc.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(edc.v::n),
                  edb.c.a.fieldOf("noise").forGetter(edc.v::o)
               )
               .apply($$0, edc.v::new)
      );
      public static final azx<edc.v> a = edc.a(k);

      @Override
      public double a(edb.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, edb.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edb a(edb.f $$0) {
         return $$0.apply(new edc.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public azx<? extends edb> c() {
         return a;
      }

      public edb j() {
         return this.e;
      }

      public edb k() {
         return this.f;
      }

      public edb l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public edb.c o() {
         return this.j;
      }
   }

   public static record w(azg<edc.w.b, edc.w.a> e) implements edb {
      private static final Codec<azg<edc.w.b, edc.w.a>> f = azg.a(edc.w.a.b);
      private static final MapCodec<edc.w> g = f.fieldOf("spline").xmap(edc.w::new, edc.w::j);
      public static final azx<edc.w> a = edc.a(g);

      @Override
      public double a(edb.b $$0) {
         return (double)this.e.a(new edc.w.b($$0));
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
      public void a(double[] $$0, edb.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edb a(edb.f $$0) {
         return $$0.apply(new edc.w(this.e.a((azg.d<edc.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public azx<? extends edb> c() {
         return a;
      }

      public azg<edc.w.b, edc.w.a> j() {
         return this.e;
      }

      public static record a(jq<edb> c) implements bbh<edc.w.b> {
         public static final Codec<edc.w.a> b = edb.c.xmap(edc.w.a::new, edc.w.a::a);

         @Override
         public String toString() {
            Optional<aly<edb>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               aly<edb> $$1 = $$0.get();
               if ($$1 == edp.d) {
                  return "continents";
               }

               if ($$1 == edp.e) {
                  return "erosion";
               }

               if ($$1 == edp.f) {
                  return "weirdness";
               }

               if ($$1 == edp.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(edc.w.b $$0) {
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

         public edc.w.a a(edb.f $$0) {
            return new edc.w.a(new jq.a<>(this.c.a().a($$0)));
         }

         public jq<edb> a() {
            return this.c;
         }
      }

      public static record b(edb.b a) {
      }
   }

   interface x extends edb {
      edb j();

      @Override
      default double a(edb.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, edb.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(edb.b var1, double var2);
   }

   interface y extends edb {
      Logger a = LogUtils.getLogger();

      static edc.y a(edc.y.a $$0, edb $$1, edb $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == edc.y.a.c || $$0 == edc.y.a.d) {
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
         if ($$0 == edc.y.a.b || $$0 == edc.y.a.a) {
            if ($$1 instanceof edc.h $$11) {
               return new edc.n($$0 == edc.y.a.a ? edc.n.a.b : edc.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof edc.h $$12) {
               return new edc.n($$0 == edc.y.a.a ? edc.n.a.b : edc.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new edc.a($$0, $$1, $$2, $$9, $$10);
      }

      edc.y.a j();

      edb k();

      edb l();

      @Override
      default azx<? extends edb> c() {
         return this.j().e;
      }

      public static enum a implements bba {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final azx<edc.y> e = edc.a((BiFunction<edb, edb, edc.y>)(($$0x, $$1) -> edc.y.a(this, $$0x, $$1)), edc.y::k, edc.y::l);
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

   protected static record z(edb e, edb.c f, edc.z.a g) implements edc.x {
      private static final MapCodec<edc.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  edb.d.fieldOf("input").forGetter(edc.z::j),
                  edb.c.a.fieldOf("noise").forGetter(edc.z::k),
                  edc.z.a.c.fieldOf("rarity_value_mapper").forGetter(edc.z::l)
               )
               .apply($$0, edc.z::new)
      );
      public static final azx<edc.z> a = edc.a(h);

      @Override
      public double a(edb.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public edb a(edb.f $$0) {
         return $$0.apply(new edc.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public azx<? extends edb> c() {
         return a;
      }

      @Override
      public edb j() {
         return this.e;
      }

      public edb.c k() {
         return this.f;
      }

      public edc.z.a l() {
         return this.g;
      }

      public static enum a implements bba {
         a("type_1", edp.a::b, 2.0),
         b("type_2", edp.a::a, 3.0);

         public static final Codec<edc.z.a> c = bba.a(edc.z.a::values);
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
