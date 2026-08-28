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

public final class eaz {
   private static final Codec<eay> c = ly.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<eay> b = Codec.either(d, c)
      .xmap($$0 -> (eay)$$0.map(eaz::a, Function.identity()), $$0 -> $$0 instanceof eaz.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends eay> a(kd<MapCodec<? extends eay>> $$0) {
      a($$0, "blend_alpha", eaz.d.e);
      a($$0, "blend_offset", eaz.f.e);
      a($$0, "beardifier", eaz.b.e);
      a($$0, "old_blended_noise", eqk.a);

      for (eaz.l.a $$1 : eaz.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", eaz.o.e);
      a($$0, "end_islands", eaz.i.a);
      a($$0, "weird_scaled_sampler", eaz.z.a);
      a($$0, "shifted_noise", eaz.v.a);
      a($$0, "range_choice", eaz.q.e);
      a($$0, "shift_a", eaz.s.e);
      a($$0, "shift_b", eaz.t.e);
      a($$0, "shift", eaz.r.e);
      a($$0, "blend_density", eaz.e.e);
      a($$0, "clamp", eaz.g.a);

      for (eaz.k.a $$2 : eaz.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (eaz.y.a $$3 : eaz.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", eaz.w.a);
      a($$0, "constant", eaz.h.e);
      return a($$0, "y_clamped_gradient", eaz.aa.a);
   }

   private static MapCodec<? extends eay> a(kd<MapCodec<? extends eay>> $$0, String $$1, azd<? extends eay> $$2) {
      return kd.a($$0, $$1, $$2.a());
   }

   static <A, O> azd<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return azd.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> azd<O> a(Function<eay, O> $$0, Function<O, eay> $$1) {
      return a(eay.d, $$0, $$1);
   }

   static <O> azd<O> a(BiFunction<eay, eay, O> $$0, Function<O, eay> $$1, Function<O, eay> $$2) {
      return azd.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(eay.d.fieldOf("argument1").forGetter($$1), eay.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> azd<O> a(MapCodec<O> $$0) {
      return azd.a($$0);
   }

   private eaz() {
   }

   public static eay a(eay $$0) {
      return new eaz.l(eaz.l.a.a, $$0);
   }

   public static eay b(eay $$0) {
      return new eaz.l(eaz.l.a.b, $$0);
   }

   public static eay c(eay $$0) {
      return new eaz.l(eaz.l.a.c, $$0);
   }

   public static eay d(eay $$0) {
      return new eaz.l(eaz.l.a.d, $$0);
   }

   public static eay e(eay $$0) {
      return new eaz.l(eaz.l.a.e, $$0);
   }

   public static eay a(jq<eqn.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new eaz.o(new eay.c($$0), $$1, $$2), $$3, $$4);
   }

   public static eay a(jq<eqn.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static eay a(jq<eqn.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static eay a(eay $$0, eay $$1, double $$2, jq<eqn.a> $$3) {
      return new eaz.v($$0, a(), $$1, $$2, 0.0, new eay.c($$3));
   }

   public static eay a(jq<eqn.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static eay b(jq<eqn.a> $$0, double $$1, double $$2) {
      return new eaz.o(new eay.c($$0), $$1, $$2);
   }

   public static eay a(jq<eqn.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static eay a(eay $$0, double $$1, double $$2, eay $$3, eay $$4) {
      return new eaz.q($$0, $$1, $$2, $$3, $$4);
   }

   public static eay b(jq<eqn.a> $$0) {
      return new eaz.s(new eay.c($$0));
   }

   public static eay c(jq<eqn.a> $$0) {
      return new eaz.t(new eay.c($$0));
   }

   public static eay d(jq<eqn.a> $$0) {
      return new eaz.r(new eay.c($$0));
   }

   public static eay f(eay $$0) {
      return new eaz.e($$0);
   }

   public static eay a(long $$0) {
      return new eaz.i($$0);
   }

   public static eay a(eay $$0, jq<eqn.a> $$1, eaz.z.a $$2) {
      return new eaz.z($$0, new eay.c($$1), $$2);
   }

   public static eay a(eay $$0, eay $$1) {
      return eaz.y.a(eaz.y.a.a, $$0, $$1);
   }

   public static eay b(eay $$0, eay $$1) {
      return eaz.y.a(eaz.y.a.b, $$0, $$1);
   }

   public static eay c(eay $$0, eay $$1) {
      return eaz.y.a(eaz.y.a.c, $$0, $$1);
   }

   public static eay d(eay $$0, eay $$1) {
      return eaz.y.a(eaz.y.a.d, $$0, $$1);
   }

   public static eay a(aym<eaz.w.b, eaz.w.a> $$0) {
      return new eaz.w($$0);
   }

   public static eay a() {
      return eaz.h.f;
   }

   public static eay a(double $$0) {
      return new eaz.h($$0);
   }

   public static eay a(int $$0, int $$1, double $$2, double $$3) {
      return new eaz.aa($$0, $$1, $$2, $$3);
   }

   public static eay a(eay $$0, eaz.k.a $$1) {
      return eaz.k.a($$1, $$0);
   }

   private static eay a(eay $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static eay b() {
      return eaz.d.a;
   }

   public static eay c() {
      return eaz.f.a;
   }

   public static eay a(eay $$0, eay $$1, eay $$2) {
      if ($$1 instanceof eaz.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         eay $$4 = d($$0);
         eay $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static eay a(eay $$0, double $$1, eay $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(eaz.y.a e, eay f, eay g, double h, double i) implements eaz.y {
      @Override
      public double a(eay.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, eay.a $$1) {
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
      public eay a(eay.f $$0) {
         return $$0.apply(eaz.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public eaz.y.a j() {
         return this.e;
      }

      @Override
      public eay k() {
         return this.f;
      }

      @Override
      public eay l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements eay.d {
      private static final MapCodec<eaz.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dzf.e * 2, dzf.d * 2).fieldOf("from_y").forGetter(eaz.aa::j),
                  Codec.intRange(dzf.e * 2, dzf.d * 2).fieldOf("to_y").forGetter(eaz.aa::k),
                  eaz.d.fieldOf("from_value").forGetter(eaz.aa::l),
                  eaz.d.fieldOf("to_value").forGetter(eaz.aa::m)
               )
               .apply($$0, eaz.aa::new)
      );
      public static final azd<eaz.aa> a = eaz.a(i);

      @Override
      public double a(eay.b $$0) {
         return azk.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public azd<? extends eay> c() {
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

   protected static enum b implements eaz.c {
      a;

      @Override
      public double a(eay.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, eay.a $$1) {
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

   public interface c extends eay.d {
      azd<eay> e = azd.a(MapCodec.unit(eaz.b.a));

      @Override
      default azd<? extends eay> c() {
         return e;
      }
   }

   protected static enum d implements eay.d {
      a;

      public static final azd<eay> e = azd.a(MapCodec.unit(a));

      @Override
      public double a(eay.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, eay.a $$1) {
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
      public azd<? extends eay> c() {
         return e;
      }
   }

   static record e(eay a) implements eaz.x {
      static final azd<eaz.e> e = eaz.a(eaz.e::new, eaz.e::j);

      @Override
      public double a(eay.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public eay a(eay.f $$0) {
         return $$0.apply(new eaz.e(this.a.a($$0)));
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
      public azd<? extends eay> c() {
         return e;
      }

      @Override
      public eay j() {
         return this.a;
      }
   }

   protected static enum f implements eay.d {
      a;

      public static final azd<eay> e = azd.a(MapCodec.unit(a));

      @Override
      public double a(eay.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, eay.a $$1) {
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
      public azd<? extends eay> c() {
         return e;
      }
   }

   protected static record g(eay e, double f, double g) implements eaz.p {
      private static final MapCodec<eaz.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(eay.b.fieldOf("input").forGetter(eaz.g::aE_), eaz.d.fieldOf("min").forGetter(eaz.g::a), eaz.d.fieldOf("max").forGetter(eaz.g::b))
               .apply($$0, eaz.g::new)
      );
      public static final azd<eaz.g> a = eaz.a(h);

      @Override
      public double a(double $$0) {
         return azk.a($$0, this.f, this.g);
      }

      @Override
      public eay a(eay.f $$0) {
         return new eaz.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public azd<? extends eay> c() {
         return a;
      }

      @Override
      public eay aE_() {
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

   static record h(double a) implements eay.d {
      static final azd<eaz.h> e = eaz.a(eaz.d, eaz.h::new, eaz.h::j);
      static final eaz.h f = new eaz.h(0.0);

      @Override
      public void a(double[] $$0, eay.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public azd<? extends eay> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements eay.d {
      public static final azd<eaz.i> a = azd.a(MapCodec.unit(new eaz.i(0L)));
      private static final float e = -0.9F;
      private final eqq f;

      public i(long $$0) {
         azs $$1 = new ebg($$0);
         $$1.b(17292);
         this.f = new eqq($$1);
      }

      private static float a(eqq $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - azk.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = azk.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (azk.e((float)$$10) * 3439.0F + azk.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - azk.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = azk.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(eay.b $$0) {
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
      public azd<? extends eay> c() {
         return a;
      }
   }

   @baq
   public static record j(jq<eay> a) implements eay {
      @Override
      public double a(eay.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, eay.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public eay a(eay.f $$0) {
         return $$0.apply(new eaz.j(new jq.a<>(this.a.a().a($$0))));
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
      public azd<? extends eay> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jq<eay> j() {
         return this.a;
      }
   }

   protected static record k(eaz.k.a a, eay e, double f, double g) implements eaz.p {
      public static eaz.k a(eaz.k.a $$0, eay $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != eaz.k.a.a && $$0 != eaz.k.a.b ? new eaz.k($$0, $$1, $$3, $$4) : new eaz.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(eaz.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = azk.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public eaz.k b(eay.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public azd<? extends eay> c() {
         return this.a.h;
      }

      public eaz.k.a k() {
         return this.a;
      }

      @Override
      public eay aE_() {
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

      static enum a implements bag {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final azd<eaz.k> h = eaz.a($$0x -> eaz.k.a(this, $$0x), eaz.k::aE_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(eaz.l.a a, eay e) implements eaz.m {
      @Override
      public double a(eay.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, eay.a $$1) {
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
      public eaz.l.a j() {
         return this.a;
      }

      @Override
      public eay k() {
         return this.e;
      }

      static enum a implements bag {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final azd<eaz.m> g = eaz.a($$0x -> new eaz.l(this, $$0x), eaz.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends eay {
      eaz.l.a j();

      eay k();

      @Override
      default azd<? extends eay> c() {
         return this.j().g;
      }

      @Override
      default eay a(eay.f $$0) {
         return $$0.apply(new eaz.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(eaz.n.a e, eay f, double g, double h, double i) implements eaz.p, eaz.y {
      @Override
      public eaz.y.a j() {
         return this.e == eaz.n.a.a ? eaz.y.a.b : eaz.y.a.a;
      }

      @Override
      public eay k() {
         return eaz.a(this.i);
      }

      @Override
      public eay l() {
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
      public eay a(eay.f $$0) {
         eay $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == eaz.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new eaz.n(this.e, $$1, $$4, $$5, this.i);
      }

      public eaz.n.a m() {
         return this.e;
      }

      @Override
      public eay aE_() {
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

   protected static record o(eay.c f, @Deprecated double g, double h) implements eay {
      public static final MapCodec<eaz.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eay.c.a.fieldOf("noise").forGetter(eaz.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(eaz.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(eaz.o::l)
               )
               .apply($$0, eaz.o::new)
      );
      public static final azd<eaz.o> e = eaz.a(a);

      @Override
      public double a(eay.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, eay.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eay a(eay.f $$0) {
         return $$0.apply(new eaz.o($$0.a(this.f), this.g, this.h));
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
      public azd<? extends eay> c() {
         return e;
      }

      public eay.c j() {
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

   interface p extends eay {
      eay aE_();

      @Override
      default double a(eay.b $$0) {
         return this.a(this.aE_().a($$0));
      }

      @Override
      default void a(double[] $$0, eay.a $$1) {
         this.aE_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(eay f, double g, double h, eay i, eay j) implements eay {
      public static final MapCodec<eaz.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eay.d.fieldOf("input").forGetter(eaz.q::j),
                  eaz.d.fieldOf("min_inclusive").forGetter(eaz.q::k),
                  eaz.d.fieldOf("max_exclusive").forGetter(eaz.q::l),
                  eay.d.fieldOf("when_in_range").forGetter(eaz.q::m),
                  eay.d.fieldOf("when_out_of_range").forGetter(eaz.q::n)
               )
               .apply($$0, eaz.q::new)
      );
      public static final azd<eaz.q> e = eaz.a(a);

      @Override
      public double a(eay.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, eay.a $$1) {
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
      public eay a(eay.f $$0) {
         return $$0.apply(new eaz.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public azd<? extends eay> c() {
         return e;
      }

      public eay j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public eay m() {
         return this.i;
      }

      public eay n() {
         return this.j;
      }
   }

   protected static record r(eay.c a) implements eaz.u {
      static final azd<eaz.r> e = eaz.a(eay.c.a, eaz.r::new, eaz.r::j);

      @Override
      public double a(eay.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public eay a(eay.f $$0) {
         return $$0.apply(new eaz.r($$0.a(this.a)));
      }

      @Override
      public azd<? extends eay> c() {
         return e;
      }

      @Override
      public eay.c j() {
         return this.a;
      }
   }

   protected static record s(eay.c a) implements eaz.u {
      static final azd<eaz.s> e = eaz.a(eay.c.a, eaz.s::new, eaz.s::j);

      @Override
      public double a(eay.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public eay a(eay.f $$0) {
         return $$0.apply(new eaz.s($$0.a(this.a)));
      }

      @Override
      public azd<? extends eay> c() {
         return e;
      }

      @Override
      public eay.c j() {
         return this.a;
      }
   }

   protected static record t(eay.c a) implements eaz.u {
      static final azd<eaz.t> e = eaz.a(eay.c.a, eaz.t::new, eaz.t::j);

      @Override
      public double a(eay.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public eay a(eay.f $$0) {
         return $$0.apply(new eaz.t($$0.a(this.a)));
      }

      @Override
      public azd<? extends eay> c() {
         return e;
      }

      @Override
      public eay.c j() {
         return this.a;
      }
   }

   interface u extends eay {
      eay.c j();

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
      default void a(double[] $$0, eay.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(eay e, eay f, eay g, double h, double i, eay.c j) implements eay {
      private static final MapCodec<eaz.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eay.d.fieldOf("shift_x").forGetter(eaz.v::j),
                  eay.d.fieldOf("shift_y").forGetter(eaz.v::k),
                  eay.d.fieldOf("shift_z").forGetter(eaz.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(eaz.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(eaz.v::n),
                  eay.c.a.fieldOf("noise").forGetter(eaz.v::o)
               )
               .apply($$0, eaz.v::new)
      );
      public static final azd<eaz.v> a = eaz.a(k);

      @Override
      public double a(eay.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, eay.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eay a(eay.f $$0) {
         return $$0.apply(new eaz.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public azd<? extends eay> c() {
         return a;
      }

      public eay j() {
         return this.e;
      }

      public eay k() {
         return this.f;
      }

      public eay l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public eay.c o() {
         return this.j;
      }
   }

   public static record w(aym<eaz.w.b, eaz.w.a> e) implements eay {
      private static final Codec<aym<eaz.w.b, eaz.w.a>> f = aym.a(eaz.w.a.b);
      private static final MapCodec<eaz.w> g = f.fieldOf("spline").xmap(eaz.w::new, eaz.w::j);
      public static final azd<eaz.w> a = eaz.a(g);

      @Override
      public double a(eay.b $$0) {
         return (double)this.e.a(new eaz.w.b($$0));
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
      public void a(double[] $$0, eay.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eay a(eay.f $$0) {
         return $$0.apply(new eaz.w(this.e.a((aym.d<eaz.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public azd<? extends eay> c() {
         return a;
      }

      public aym<eaz.w.b, eaz.w.a> j() {
         return this.e;
      }

      public static record a(jq<eay> c) implements bam<eaz.w.b> {
         public static final Codec<eaz.w.a> b = eay.c.xmap(eaz.w.a::new, eaz.w.a::a);

         @Override
         public String toString() {
            Optional<alh<eay>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               alh<eay> $$1 = $$0.get();
               if ($$1 == ebm.d) {
                  return "continents";
               }

               if ($$1 == ebm.e) {
                  return "erosion";
               }

               if ($$1 == ebm.f) {
                  return "weirdness";
               }

               if ($$1 == ebm.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(eaz.w.b $$0) {
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

         public eaz.w.a a(eay.f $$0) {
            return new eaz.w.a(new jq.a<>(this.c.a().a($$0)));
         }

         public jq<eay> a() {
            return this.c;
         }
      }

      public static record b(eay.b a) {
      }
   }

   interface x extends eay {
      eay j();

      @Override
      default double a(eay.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, eay.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(eay.b var1, double var2);
   }

   interface y extends eay {
      Logger a = LogUtils.getLogger();

      static eaz.y a(eaz.y.a $$0, eay $$1, eay $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == eaz.y.a.c || $$0 == eaz.y.a.d) {
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
         if ($$0 == eaz.y.a.b || $$0 == eaz.y.a.a) {
            if ($$1 instanceof eaz.h $$11) {
               return new eaz.n($$0 == eaz.y.a.a ? eaz.n.a.b : eaz.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof eaz.h $$12) {
               return new eaz.n($$0 == eaz.y.a.a ? eaz.n.a.b : eaz.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new eaz.a($$0, $$1, $$2, $$9, $$10);
      }

      eaz.y.a j();

      eay k();

      eay l();

      @Override
      default azd<? extends eay> c() {
         return this.j().e;
      }

      public static enum a implements bag {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final azd<eaz.y> e = eaz.a((BiFunction<eay, eay, eaz.y>)(($$0x, $$1) -> eaz.y.a(this, $$0x, $$1)), eaz.y::k, eaz.y::l);
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

   protected static record z(eay e, eay.c f, eaz.z.a g) implements eaz.x {
      private static final MapCodec<eaz.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eay.d.fieldOf("input").forGetter(eaz.z::j),
                  eay.c.a.fieldOf("noise").forGetter(eaz.z::k),
                  eaz.z.a.c.fieldOf("rarity_value_mapper").forGetter(eaz.z::l)
               )
               .apply($$0, eaz.z::new)
      );
      public static final azd<eaz.z> a = eaz.a(h);

      @Override
      public double a(eay.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public eay a(eay.f $$0) {
         return $$0.apply(new eaz.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public azd<? extends eay> c() {
         return a;
      }

      @Override
      public eay j() {
         return this.e;
      }

      public eay.c k() {
         return this.f;
      }

      public eaz.z.a l() {
         return this.g;
      }

      public static enum a implements bag {
         a("type_1", ebm.a::b, 2.0),
         b("type_2", ebm.a::a, 3.0);

         public static final Codec<eaz.z.a> c = bag.a(eaz.z.a::values);
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
