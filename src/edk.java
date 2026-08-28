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

public final class edk {
   private static final Codec<edj> c = ma.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<edj> b = Codec.either(d, c)
      .xmap($$0 -> (edj)$$0.map(edk::a, Function.identity()), $$0 -> $$0 instanceof edk.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends edj> a(kd<MapCodec<? extends edj>> $$0) {
      a($$0, "blend_alpha", edk.d.e);
      a($$0, "blend_offset", edk.f.e);
      a($$0, "beardifier", edk.b.e);
      a($$0, "old_blended_noise", esx.a);

      for (edk.l.a $$1 : edk.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", edk.o.e);
      a($$0, "end_islands", edk.i.a);
      a($$0, "weird_scaled_sampler", edk.z.a);
      a($$0, "shifted_noise", edk.v.a);
      a($$0, "range_choice", edk.q.e);
      a($$0, "shift_a", edk.s.e);
      a($$0, "shift_b", edk.t.e);
      a($$0, "shift", edk.r.e);
      a($$0, "blend_density", edk.e.e);
      a($$0, "clamp", edk.g.a);

      for (edk.k.a $$2 : edk.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (edk.y.a $$3 : edk.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", edk.w.a);
      a($$0, "constant", edk.h.e);
      return a($$0, "y_clamped_gradient", edk.aa.a);
   }

   private static MapCodec<? extends edj> a(kd<MapCodec<? extends edj>> $$0, String $$1, azx<? extends edj> $$2) {
      return kd.a($$0, $$1, $$2.a());
   }

   static <A, O> azx<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return azx.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> azx<O> a(Function<edj, O> $$0, Function<O, edj> $$1) {
      return a(edj.d, $$0, $$1);
   }

   static <O> azx<O> a(BiFunction<edj, edj, O> $$0, Function<O, edj> $$1, Function<O, edj> $$2) {
      return azx.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(edj.d.fieldOf("argument1").forGetter($$1), edj.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> azx<O> a(MapCodec<O> $$0) {
      return azx.a($$0);
   }

   private edk() {
   }

   public static edj a(edj $$0) {
      return new edk.l(edk.l.a.a, $$0);
   }

   public static edj b(edj $$0) {
      return new edk.l(edk.l.a.b, $$0);
   }

   public static edj c(edj $$0) {
      return new edk.l(edk.l.a.c, $$0);
   }

   public static edj d(edj $$0) {
      return new edk.l(edk.l.a.d, $$0);
   }

   public static edj e(edj $$0) {
      return new edk.l(edk.l.a.e, $$0);
   }

   public static edj a(jq<eta.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new edk.o(new edj.c($$0), $$1, $$2), $$3, $$4);
   }

   public static edj a(jq<eta.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static edj a(jq<eta.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static edj a(edj $$0, edj $$1, double $$2, jq<eta.a> $$3) {
      return new edk.v($$0, a(), $$1, $$2, 0.0, new edj.c($$3));
   }

   public static edj a(jq<eta.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static edj b(jq<eta.a> $$0, double $$1, double $$2) {
      return new edk.o(new edj.c($$0), $$1, $$2);
   }

   public static edj a(jq<eta.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static edj a(edj $$0, double $$1, double $$2, edj $$3, edj $$4) {
      return new edk.q($$0, $$1, $$2, $$3, $$4);
   }

   public static edj b(jq<eta.a> $$0) {
      return new edk.s(new edj.c($$0));
   }

   public static edj c(jq<eta.a> $$0) {
      return new edk.t(new edj.c($$0));
   }

   public static edj d(jq<eta.a> $$0) {
      return new edk.r(new edj.c($$0));
   }

   public static edj f(edj $$0) {
      return new edk.e($$0);
   }

   public static edj a(long $$0) {
      return new edk.i($$0);
   }

   public static edj a(edj $$0, jq<eta.a> $$1, edk.z.a $$2) {
      return new edk.z($$0, new edj.c($$1), $$2);
   }

   public static edj a(edj $$0, edj $$1) {
      return edk.y.a(edk.y.a.a, $$0, $$1);
   }

   public static edj b(edj $$0, edj $$1) {
      return edk.y.a(edk.y.a.b, $$0, $$1);
   }

   public static edj c(edj $$0, edj $$1) {
      return edk.y.a(edk.y.a.c, $$0, $$1);
   }

   public static edj d(edj $$0, edj $$1) {
      return edk.y.a(edk.y.a.d, $$0, $$1);
   }

   public static edj a(azg<edk.w.b, edk.w.a> $$0) {
      return new edk.w($$0);
   }

   public static edj a() {
      return edk.h.f;
   }

   public static edj a(double $$0) {
      return new edk.h($$0);
   }

   public static edj a(int $$0, int $$1, double $$2, double $$3) {
      return new edk.aa($$0, $$1, $$2, $$3);
   }

   public static edj a(edj $$0, edk.k.a $$1) {
      return edk.k.a($$1, $$0);
   }

   private static edj a(edj $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static edj b() {
      return edk.d.a;
   }

   public static edj c() {
      return edk.f.a;
   }

   public static edj a(edj $$0, edj $$1, edj $$2) {
      if ($$1 instanceof edk.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         edj $$4 = d($$0);
         edj $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static edj a(edj $$0, double $$1, edj $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(edk.y.a e, edj f, edj g, double h, double i) implements edk.y {
      @Override
      public double a(edj.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, edj.a $$1) {
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
      public edj a(edj.f $$0) {
         return $$0.apply(edk.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public edk.y.a j() {
         return this.e;
      }

      @Override
      public edj k() {
         return this.f;
      }

      @Override
      public edj l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements edj.d {
      private static final MapCodec<edk.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(ebq.e * 2, ebq.d * 2).fieldOf("from_y").forGetter(edk.aa::j),
                  Codec.intRange(ebq.e * 2, ebq.d * 2).fieldOf("to_y").forGetter(edk.aa::k),
                  edk.d.fieldOf("from_value").forGetter(edk.aa::l),
                  edk.d.fieldOf("to_value").forGetter(edk.aa::m)
               )
               .apply($$0, edk.aa::new)
      );
      public static final azx<edk.aa> a = edk.a(i);

      @Override
      public double a(edj.b $$0) {
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
      public azx<? extends edj> c() {
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

   protected static enum b implements edk.c {
      a;

      @Override
      public double a(edj.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, edj.a $$1) {
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

   public interface c extends edj.d {
      azx<edj> e = azx.a(MapCodec.unit(edk.b.a));

      @Override
      default azx<? extends edj> c() {
         return e;
      }
   }

   protected static enum d implements edj.d {
      a;

      public static final azx<edj> e = azx.a(MapCodec.unit(a));

      @Override
      public double a(edj.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, edj.a $$1) {
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
      public azx<? extends edj> c() {
         return e;
      }
   }

   static record e(edj a) implements edk.x {
      static final azx<edk.e> e = edk.a(edk.e::new, edk.e::j);

      @Override
      public double a(edj.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public edj a(edj.f $$0) {
         return $$0.apply(new edk.e(this.a.a($$0)));
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
      public azx<? extends edj> c() {
         return e;
      }

      @Override
      public edj j() {
         return this.a;
      }
   }

   protected static enum f implements edj.d {
      a;

      public static final azx<edj> e = azx.a(MapCodec.unit(a));

      @Override
      public double a(edj.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, edj.a $$1) {
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
      public azx<? extends edj> c() {
         return e;
      }
   }

   protected static record g(edj e, double f, double g) implements edk.p {
      private static final MapCodec<edk.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(edj.b.fieldOf("input").forGetter(edk.g::aE_), edk.d.fieldOf("min").forGetter(edk.g::a), edk.d.fieldOf("max").forGetter(edk.g::b))
               .apply($$0, edk.g::new)
      );
      public static final azx<edk.g> a = edk.a(h);

      @Override
      public double a(double $$0) {
         return bae.a($$0, this.f, this.g);
      }

      @Override
      public edj a(edj.f $$0) {
         return new edk.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public azx<? extends edj> c() {
         return a;
      }

      @Override
      public edj aE_() {
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

   static record h(double a) implements edj.d {
      static final azx<edk.h> e = edk.a(edk.d, edk.h::new, edk.h::j);
      static final edk.h f = new edk.h(0.0);

      @Override
      public void a(double[] $$0, edj.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public azx<? extends edj> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements edj.d {
      public static final azx<edk.i> a = azx.a(MapCodec.unit(new edk.i(0L)));
      private static final float e = -0.9F;
      private final etd f;

      public i(long $$0) {
         bam $$1 = new edr($$0);
         $$1.b(17292);
         this.f = new etd($$1);
      }

      private static float a(etd $$0, int $$1, int $$2) {
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
      public double a(edj.b $$0) {
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
      public azx<? extends edj> c() {
         return a;
      }
   }

   @bbl
   public static record j(jq<edj> a) implements edj {
      @Override
      public double a(edj.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, edj.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public edj a(edj.f $$0) {
         return $$0.apply(new edk.j(new jq.a<>(this.a.a().a($$0))));
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
      public azx<? extends edj> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jq<edj> j() {
         return this.a;
      }
   }

   protected static record k(edk.k.a a, edj e, double f, double g) implements edk.p {
      public static edk.k a(edk.k.a $$0, edj $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != edk.k.a.a && $$0 != edk.k.a.b ? new edk.k($$0, $$1, $$3, $$4) : new edk.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(edk.k.a $$0, double $$1) {
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

      public edk.k b(edj.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public azx<? extends edj> c() {
         return this.a.h;
      }

      public edk.k.a k() {
         return this.a;
      }

      @Override
      public edj aE_() {
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
         final azx<edk.k> h = edk.a($$0x -> edk.k.a(this, $$0x), edk.k::aE_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(edk.l.a a, edj e) implements edk.m {
      @Override
      public double a(edj.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, edj.a $$1) {
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
      public edk.l.a j() {
         return this.a;
      }

      @Override
      public edj k() {
         return this.e;
      }

      static enum a implements bba {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final azx<edk.m> g = edk.a($$0x -> new edk.l(this, $$0x), edk.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends edj {
      edk.l.a j();

      edj k();

      @Override
      default azx<? extends edj> c() {
         return this.j().g;
      }

      @Override
      default edj a(edj.f $$0) {
         return $$0.apply(new edk.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(edk.n.a e, edj f, double g, double h, double i) implements edk.p, edk.y {
      @Override
      public edk.y.a j() {
         return this.e == edk.n.a.a ? edk.y.a.b : edk.y.a.a;
      }

      @Override
      public edj k() {
         return edk.a(this.i);
      }

      @Override
      public edj l() {
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
      public edj a(edj.f $$0) {
         edj $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == edk.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new edk.n(this.e, $$1, $$4, $$5, this.i);
      }

      public edk.n.a m() {
         return this.e;
      }

      @Override
      public edj aE_() {
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

   protected static record o(edj.c f, @Deprecated double g, double h) implements edj {
      public static final MapCodec<edk.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  edj.c.a.fieldOf("noise").forGetter(edk.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(edk.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(edk.o::l)
               )
               .apply($$0, edk.o::new)
      );
      public static final azx<edk.o> e = edk.a(a);

      @Override
      public double a(edj.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, edj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edj a(edj.f $$0) {
         return $$0.apply(new edk.o($$0.a(this.f), this.g, this.h));
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
      public azx<? extends edj> c() {
         return e;
      }

      public edj.c j() {
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

   interface p extends edj {
      edj aE_();

      @Override
      default double a(edj.b $$0) {
         return this.a(this.aE_().a($$0));
      }

      @Override
      default void a(double[] $$0, edj.a $$1) {
         this.aE_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(edj f, double g, double h, edj i, edj j) implements edj {
      public static final MapCodec<edk.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  edj.d.fieldOf("input").forGetter(edk.q::j),
                  edk.d.fieldOf("min_inclusive").forGetter(edk.q::k),
                  edk.d.fieldOf("max_exclusive").forGetter(edk.q::l),
                  edj.d.fieldOf("when_in_range").forGetter(edk.q::m),
                  edj.d.fieldOf("when_out_of_range").forGetter(edk.q::n)
               )
               .apply($$0, edk.q::new)
      );
      public static final azx<edk.q> e = edk.a(a);

      @Override
      public double a(edj.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, edj.a $$1) {
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
      public edj a(edj.f $$0) {
         return $$0.apply(new edk.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public azx<? extends edj> c() {
         return e;
      }

      public edj j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public edj m() {
         return this.i;
      }

      public edj n() {
         return this.j;
      }
   }

   protected static record r(edj.c a) implements edk.u {
      static final azx<edk.r> e = edk.a(edj.c.a, edk.r::new, edk.r::j);

      @Override
      public double a(edj.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public edj a(edj.f $$0) {
         return $$0.apply(new edk.r($$0.a(this.a)));
      }

      @Override
      public azx<? extends edj> c() {
         return e;
      }

      @Override
      public edj.c j() {
         return this.a;
      }
   }

   protected static record s(edj.c a) implements edk.u {
      static final azx<edk.s> e = edk.a(edj.c.a, edk.s::new, edk.s::j);

      @Override
      public double a(edj.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public edj a(edj.f $$0) {
         return $$0.apply(new edk.s($$0.a(this.a)));
      }

      @Override
      public azx<? extends edj> c() {
         return e;
      }

      @Override
      public edj.c j() {
         return this.a;
      }
   }

   protected static record t(edj.c a) implements edk.u {
      static final azx<edk.t> e = edk.a(edj.c.a, edk.t::new, edk.t::j);

      @Override
      public double a(edj.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public edj a(edj.f $$0) {
         return $$0.apply(new edk.t($$0.a(this.a)));
      }

      @Override
      public azx<? extends edj> c() {
         return e;
      }

      @Override
      public edj.c j() {
         return this.a;
      }
   }

   interface u extends edj {
      edj.c j();

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
      default void a(double[] $$0, edj.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(edj e, edj f, edj g, double h, double i, edj.c j) implements edj {
      private static final MapCodec<edk.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  edj.d.fieldOf("shift_x").forGetter(edk.v::j),
                  edj.d.fieldOf("shift_y").forGetter(edk.v::k),
                  edj.d.fieldOf("shift_z").forGetter(edk.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(edk.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(edk.v::n),
                  edj.c.a.fieldOf("noise").forGetter(edk.v::o)
               )
               .apply($$0, edk.v::new)
      );
      public static final azx<edk.v> a = edk.a(k);

      @Override
      public double a(edj.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, edj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edj a(edj.f $$0) {
         return $$0.apply(new edk.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public azx<? extends edj> c() {
         return a;
      }

      public edj j() {
         return this.e;
      }

      public edj k() {
         return this.f;
      }

      public edj l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public edj.c o() {
         return this.j;
      }
   }

   public static record w(azg<edk.w.b, edk.w.a> e) implements edj {
      private static final Codec<azg<edk.w.b, edk.w.a>> f = azg.a(edk.w.a.b);
      private static final MapCodec<edk.w> g = f.fieldOf("spline").xmap(edk.w::new, edk.w::j);
      public static final azx<edk.w> a = edk.a(g);

      @Override
      public double a(edj.b $$0) {
         return (double)this.e.a(new edk.w.b($$0));
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
      public void a(double[] $$0, edj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edj a(edj.f $$0) {
         return $$0.apply(new edk.w(this.e.a((azg.d<edk.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public azx<? extends edj> c() {
         return a;
      }

      public azg<edk.w.b, edk.w.a> j() {
         return this.e;
      }

      public static record a(jq<edj> c) implements bbh<edk.w.b> {
         public static final Codec<edk.w.a> b = edj.c.xmap(edk.w.a::new, edk.w.a::a);

         @Override
         public String toString() {
            Optional<aly<edj>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               aly<edj> $$1 = $$0.get();
               if ($$1 == edx.d) {
                  return "continents";
               }

               if ($$1 == edx.e) {
                  return "erosion";
               }

               if ($$1 == edx.f) {
                  return "weirdness";
               }

               if ($$1 == edx.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(edk.w.b $$0) {
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

         public edk.w.a a(edj.f $$0) {
            return new edk.w.a(new jq.a<>(this.c.a().a($$0)));
         }

         public jq<edj> a() {
            return this.c;
         }
      }

      public static record b(edj.b a) {
      }
   }

   interface x extends edj {
      edj j();

      @Override
      default double a(edj.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, edj.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(edj.b var1, double var2);
   }

   interface y extends edj {
      Logger a = LogUtils.getLogger();

      static edk.y a(edk.y.a $$0, edj $$1, edj $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == edk.y.a.c || $$0 == edk.y.a.d) {
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
         if ($$0 == edk.y.a.b || $$0 == edk.y.a.a) {
            if ($$1 instanceof edk.h $$11) {
               return new edk.n($$0 == edk.y.a.a ? edk.n.a.b : edk.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof edk.h $$12) {
               return new edk.n($$0 == edk.y.a.a ? edk.n.a.b : edk.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new edk.a($$0, $$1, $$2, $$9, $$10);
      }

      edk.y.a j();

      edj k();

      edj l();

      @Override
      default azx<? extends edj> c() {
         return this.j().e;
      }

      public static enum a implements bba {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final azx<edk.y> e = edk.a((BiFunction<edj, edj, edk.y>)(($$0x, $$1) -> edk.y.a(this, $$0x, $$1)), edk.y::k, edk.y::l);
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

   protected static record z(edj e, edj.c f, edk.z.a g) implements edk.x {
      private static final MapCodec<edk.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  edj.d.fieldOf("input").forGetter(edk.z::j),
                  edj.c.a.fieldOf("noise").forGetter(edk.z::k),
                  edk.z.a.c.fieldOf("rarity_value_mapper").forGetter(edk.z::l)
               )
               .apply($$0, edk.z::new)
      );
      public static final azx<edk.z> a = edk.a(h);

      @Override
      public double a(edj.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public edj a(edj.f $$0) {
         return $$0.apply(new edk.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public azx<? extends edj> c() {
         return a;
      }

      @Override
      public edj j() {
         return this.e;
      }

      public edj.c k() {
         return this.f;
      }

      public edk.z.a l() {
         return this.g;
      }

      public static enum a implements bba {
         a("type_1", edx.a::b, 2.0),
         b("type_2", edx.a::a, 3.0);

         public static final Codec<edk.z.a> c = bba.a(edk.z.a::values);
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
