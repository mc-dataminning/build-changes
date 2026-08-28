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

public final class ehj {
   private static final Codec<ehi> c = mh.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<ehi> b = Codec.either(d, c)
      .xmap($$0 -> (ehi)$$0.map(ehj::a, Function.identity()), $$0 -> $$0 instanceof ehj.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends ehi> a(jt<MapCodec<? extends ehi>> $$0) {
      a($$0, "blend_alpha", ehj.d.e);
      a($$0, "blend_offset", ehj.f.e);
      a($$0, "beardifier", ehj.b.e);
      a($$0, "old_blended_noise", exa.a);

      for (ehj.l.a $$1 : ehj.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", ehj.o.e);
      a($$0, "end_islands", ehj.i.a);
      a($$0, "weird_scaled_sampler", ehj.z.a);
      a($$0, "shifted_noise", ehj.v.a);
      a($$0, "range_choice", ehj.q.e);
      a($$0, "shift_a", ehj.s.e);
      a($$0, "shift_b", ehj.t.e);
      a($$0, "shift", ehj.r.e);
      a($$0, "blend_density", ehj.e.e);
      a($$0, "clamp", ehj.g.a);

      for (ehj.k.a $$2 : ehj.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (ehj.y.a $$3 : ehj.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", ehj.w.a);
      a($$0, "constant", ehj.h.e);
      return a($$0, "y_clamped_gradient", ehj.aa.a);
   }

   private static MapCodec<? extends ehi> a(jt<MapCodec<? extends ehi>> $$0, String $$1, azs<? extends ehi> $$2) {
      return jt.a($$0, $$1, $$2.a());
   }

   static <A, O> azs<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return azs.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> azs<O> a(Function<ehi, O> $$0, Function<O, ehi> $$1) {
      return a(ehi.d, $$0, $$1);
   }

   static <O> azs<O> a(BiFunction<ehi, ehi, O> $$0, Function<O, ehi> $$1, Function<O, ehi> $$2) {
      return azs.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(ehi.d.fieldOf("argument1").forGetter($$1), ehi.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> azs<O> a(MapCodec<O> $$0) {
      return azs.a($$0);
   }

   private ehj() {
   }

   public static ehi a(ehi $$0) {
      return new ehj.l(ehj.l.a.a, $$0);
   }

   public static ehi b(ehi $$0) {
      return new ehj.l(ehj.l.a.b, $$0);
   }

   public static ehi c(ehi $$0) {
      return new ehj.l(ehj.l.a.c, $$0);
   }

   public static ehi d(ehi $$0) {
      return new ehj.l(ehj.l.a.d, $$0);
   }

   public static ehi e(ehi $$0) {
      return new ehj.l(ehj.l.a.e, $$0);
   }

   public static ehi a(jg<exd.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new ehj.o(new ehi.c($$0), $$1, $$2), $$3, $$4);
   }

   public static ehi a(jg<exd.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static ehi a(jg<exd.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static ehi a(ehi $$0, ehi $$1, double $$2, jg<exd.a> $$3) {
      return new ehj.v($$0, a(), $$1, $$2, 0.0, new ehi.c($$3));
   }

   public static ehi a(jg<exd.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static ehi b(jg<exd.a> $$0, double $$1, double $$2) {
      return new ehj.o(new ehi.c($$0), $$1, $$2);
   }

   public static ehi a(jg<exd.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static ehi a(ehi $$0, double $$1, double $$2, ehi $$3, ehi $$4) {
      return new ehj.q($$0, $$1, $$2, $$3, $$4);
   }

   public static ehi b(jg<exd.a> $$0) {
      return new ehj.s(new ehi.c($$0));
   }

   public static ehi c(jg<exd.a> $$0) {
      return new ehj.t(new ehi.c($$0));
   }

   public static ehi d(jg<exd.a> $$0) {
      return new ehj.r(new ehi.c($$0));
   }

   public static ehi f(ehi $$0) {
      return new ehj.e($$0);
   }

   public static ehi a(long $$0) {
      return new ehj.i($$0);
   }

   public static ehi a(ehi $$0, jg<exd.a> $$1, ehj.z.a $$2) {
      return new ehj.z($$0, new ehi.c($$1), $$2);
   }

   public static ehi a(ehi $$0, ehi $$1) {
      return ehj.y.a(ehj.y.a.a, $$0, $$1);
   }

   public static ehi b(ehi $$0, ehi $$1) {
      return ehj.y.a(ehj.y.a.b, $$0, $$1);
   }

   public static ehi c(ehi $$0, ehi $$1) {
      return ehj.y.a(ehj.y.a.c, $$0, $$1);
   }

   public static ehi d(ehi $$0, ehi $$1) {
      return ehj.y.a(ehj.y.a.d, $$0, $$1);
   }

   public static ehi a(ayz<ehj.w.b, ehj.w.a> $$0) {
      return new ehj.w($$0);
   }

   public static ehi a() {
      return ehj.h.f;
   }

   public static ehi a(double $$0) {
      return new ehj.h($$0);
   }

   public static ehi a(int $$0, int $$1, double $$2, double $$3) {
      return new ehj.aa($$0, $$1, $$2, $$3);
   }

   public static ehi a(ehi $$0, ehj.k.a $$1) {
      return ehj.k.a($$1, $$0);
   }

   private static ehi a(ehi $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static ehi b() {
      return ehj.d.a;
   }

   public static ehi c() {
      return ehj.f.a;
   }

   public static ehi a(ehi $$0, ehi $$1, ehi $$2) {
      if ($$1 instanceof ehj.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         ehi $$4 = d($$0);
         ehi $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static ehi a(ehi $$0, double $$1, ehi $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(ehj.y.a e, ehi f, ehi g, double h, double i) implements ehj.y {
      @Override
      public double a(ehi.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, ehi.a $$1) {
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
      public ehi a(ehi.f $$0) {
         return $$0.apply(ehj.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public ehj.y.a j() {
         return this.e;
      }

      @Override
      public ehi k() {
         return this.f;
      }

      @Override
      public ehi l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements ehi.d {
      private static final MapCodec<ehj.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(efn.e * 2, efn.d * 2).fieldOf("from_y").forGetter(ehj.aa::j),
                  Codec.intRange(efn.e * 2, efn.d * 2).fieldOf("to_y").forGetter(ehj.aa::k),
                  ehj.d.fieldOf("from_value").forGetter(ehj.aa::l),
                  ehj.d.fieldOf("to_value").forGetter(ehj.aa::m)
               )
               .apply($$0, ehj.aa::new)
      );
      public static final azs<ehj.aa> a = ehj.a(i);

      @Override
      public double a(ehi.b $$0) {
         return azz.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public azs<? extends ehi> c() {
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

   protected static enum b implements ehj.c {
      a;

      @Override
      public double a(ehi.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, ehi.a $$1) {
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

   public interface c extends ehi.d {
      azs<ehi> e = azs.a(MapCodec.unit(ehj.b.a));

      @Override
      default azs<? extends ehi> c() {
         return e;
      }
   }

   protected static enum d implements ehi.d {
      a;

      public static final azs<ehi> e = azs.a(MapCodec.unit(a));

      @Override
      public double a(ehi.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, ehi.a $$1) {
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
      public azs<? extends ehi> c() {
         return e;
      }
   }

   static record e(ehi a) implements ehj.x {
      static final azs<ehj.e> e = ehj.a(ehj.e::new, ehj.e::j);

      @Override
      public double a(ehi.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public ehi a(ehi.f $$0) {
         return $$0.apply(new ehj.e(this.a.a($$0)));
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
      public azs<? extends ehi> c() {
         return e;
      }

      @Override
      public ehi j() {
         return this.a;
      }
   }

   protected static enum f implements ehi.d {
      a;

      public static final azs<ehi> e = azs.a(MapCodec.unit(a));

      @Override
      public double a(ehi.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, ehi.a $$1) {
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
      public azs<? extends ehi> c() {
         return e;
      }
   }

   protected static record g(ehi e, double f, double g) implements ehj.p {
      private static final MapCodec<ehj.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ehi.b.fieldOf("input").forGetter(ehj.g::aA_), ehj.d.fieldOf("min").forGetter(ehj.g::a), ehj.d.fieldOf("max").forGetter(ehj.g::b))
               .apply($$0, ehj.g::new)
      );
      public static final azs<ehj.g> a = ehj.a(h);

      @Override
      public double a(double $$0) {
         return azz.a($$0, this.f, this.g);
      }

      @Override
      public ehi a(ehi.f $$0) {
         return new ehj.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public azs<? extends ehi> c() {
         return a;
      }

      @Override
      public ehi aA_() {
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

   static record h(double a) implements ehi.d {
      static final azs<ehj.h> e = ehj.a(ehj.d, ehj.h::new, ehj.h::j);
      static final ehj.h f = new ehj.h(0.0);

      @Override
      public void a(double[] $$0, ehi.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public azs<? extends ehi> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements ehi.d {
      public static final azs<ehj.i> a = azs.a(MapCodec.unit(new ehj.i(0L)));
      private static final float e = -0.9F;
      private final exg f;

      public i(long $$0) {
         bai $$1 = new ehq($$0);
         $$1.b(17292);
         this.f = new exg($$1);
      }

      private static float a(exg $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - azz.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = azz.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (azz.e((float)$$10) * 3439.0F + azz.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - azz.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = azz.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(ehi.b $$0) {
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
      public azs<? extends ehi> c() {
         return a;
      }
   }

   @bbi
   public static record j(jg<ehi> a) implements ehi {
      @Override
      public double a(ehi.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, ehi.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public ehi a(ehi.f $$0) {
         return $$0.apply(new ehj.j(new jg.a<>(this.a.a().a($$0))));
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
      public azs<? extends ehi> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jg<ehi> j() {
         return this.a;
      }
   }

   protected static record k(ehj.k.a a, ehi e, double f, double g) implements ehj.p {
      public static ehj.k a(ehj.k.a $$0, ehi $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != ehj.k.a.a && $$0 != ehj.k.a.b ? new ehj.k($$0, $$1, $$3, $$4) : new ehj.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(ehj.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = azz.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public ehj.k b(ehi.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public azs<? extends ehi> c() {
         return this.a.h;
      }

      public ehj.k.a k() {
         return this.a;
      }

      @Override
      public ehi aA_() {
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

      static enum a implements bax {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final azs<ehj.k> h = ehj.a($$0x -> ehj.k.a(this, $$0x), ehj.k::aA_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(ehj.l.a a, ehi e) implements ehj.m {
      @Override
      public double a(ehi.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, ehi.a $$1) {
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
      public ehj.l.a j() {
         return this.a;
      }

      @Override
      public ehi k() {
         return this.e;
      }

      static enum a implements bax {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final azs<ehj.m> g = ehj.a($$0x -> new ehj.l(this, $$0x), ehj.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends ehi {
      ehj.l.a j();

      ehi k();

      @Override
      default azs<? extends ehi> c() {
         return this.j().g;
      }

      @Override
      default ehi a(ehi.f $$0) {
         return $$0.apply(new ehj.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(ehj.n.a e, ehi f, double g, double h, double i) implements ehj.p, ehj.y {
      @Override
      public ehj.y.a j() {
         return this.e == ehj.n.a.a ? ehj.y.a.b : ehj.y.a.a;
      }

      @Override
      public ehi k() {
         return ehj.a(this.i);
      }

      @Override
      public ehi l() {
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
      public ehi a(ehi.f $$0) {
         ehi $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == ehj.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new ehj.n(this.e, $$1, $$4, $$5, this.i);
      }

      public ehj.n.a m() {
         return this.e;
      }

      @Override
      public ehi aA_() {
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

   protected static record o(ehi.c f, @Deprecated double g, double h) implements ehi {
      public static final MapCodec<ehj.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ehi.c.a.fieldOf("noise").forGetter(ehj.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(ehj.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(ehj.o::l)
               )
               .apply($$0, ehj.o::new)
      );
      public static final azs<ehj.o> e = ehj.a(a);

      @Override
      public double a(ehi.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, ehi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ehi a(ehi.f $$0) {
         return $$0.apply(new ehj.o($$0.a(this.f), this.g, this.h));
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
      public azs<? extends ehi> c() {
         return e;
      }

      public ehi.c j() {
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

   interface p extends ehi {
      ehi aA_();

      @Override
      default double a(ehi.b $$0) {
         return this.a(this.aA_().a($$0));
      }

      @Override
      default void a(double[] $$0, ehi.a $$1) {
         this.aA_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(ehi f, double g, double h, ehi i, ehi j) implements ehi {
      public static final MapCodec<ehj.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ehi.d.fieldOf("input").forGetter(ehj.q::j),
                  ehj.d.fieldOf("min_inclusive").forGetter(ehj.q::k),
                  ehj.d.fieldOf("max_exclusive").forGetter(ehj.q::l),
                  ehi.d.fieldOf("when_in_range").forGetter(ehj.q::m),
                  ehi.d.fieldOf("when_out_of_range").forGetter(ehj.q::n)
               )
               .apply($$0, ehj.q::new)
      );
      public static final azs<ehj.q> e = ehj.a(a);

      @Override
      public double a(ehi.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, ehi.a $$1) {
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
      public ehi a(ehi.f $$0) {
         return $$0.apply(new ehj.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public azs<? extends ehi> c() {
         return e;
      }

      public ehi j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public ehi m() {
         return this.i;
      }

      public ehi n() {
         return this.j;
      }
   }

   protected static record r(ehi.c a) implements ehj.u {
      static final azs<ehj.r> e = ehj.a(ehi.c.a, ehj.r::new, ehj.r::j);

      @Override
      public double a(ehi.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public ehi a(ehi.f $$0) {
         return $$0.apply(new ehj.r($$0.a(this.a)));
      }

      @Override
      public azs<? extends ehi> c() {
         return e;
      }

      @Override
      public ehi.c j() {
         return this.a;
      }
   }

   protected static record s(ehi.c a) implements ehj.u {
      static final azs<ehj.s> e = ehj.a(ehi.c.a, ehj.s::new, ehj.s::j);

      @Override
      public double a(ehi.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public ehi a(ehi.f $$0) {
         return $$0.apply(new ehj.s($$0.a(this.a)));
      }

      @Override
      public azs<? extends ehi> c() {
         return e;
      }

      @Override
      public ehi.c j() {
         return this.a;
      }
   }

   protected static record t(ehi.c a) implements ehj.u {
      static final azs<ehj.t> e = ehj.a(ehi.c.a, ehj.t::new, ehj.t::j);

      @Override
      public double a(ehi.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public ehi a(ehi.f $$0) {
         return $$0.apply(new ehj.t($$0.a(this.a)));
      }

      @Override
      public azs<? extends ehi> c() {
         return e;
      }

      @Override
      public ehi.c j() {
         return this.a;
      }
   }

   interface u extends ehi {
      ehi.c j();

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
      default void a(double[] $$0, ehi.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(ehi e, ehi f, ehi g, double h, double i, ehi.c j) implements ehi {
      private static final MapCodec<ehj.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ehi.d.fieldOf("shift_x").forGetter(ehj.v::j),
                  ehi.d.fieldOf("shift_y").forGetter(ehj.v::k),
                  ehi.d.fieldOf("shift_z").forGetter(ehj.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(ehj.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(ehj.v::n),
                  ehi.c.a.fieldOf("noise").forGetter(ehj.v::o)
               )
               .apply($$0, ehj.v::new)
      );
      public static final azs<ehj.v> a = ehj.a(k);

      @Override
      public double a(ehi.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, ehi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ehi a(ehi.f $$0) {
         return $$0.apply(new ehj.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public azs<? extends ehi> c() {
         return a;
      }

      public ehi j() {
         return this.e;
      }

      public ehi k() {
         return this.f;
      }

      public ehi l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public ehi.c o() {
         return this.j;
      }
   }

   public static record w(ayz<ehj.w.b, ehj.w.a> e) implements ehi {
      private static final Codec<ayz<ehj.w.b, ehj.w.a>> f = ayz.a(ehj.w.a.b);
      private static final MapCodec<ehj.w> g = f.fieldOf("spline").xmap(ehj.w::new, ehj.w::j);
      public static final azs<ehj.w> a = ehj.a(g);

      @Override
      public double a(ehi.b $$0) {
         return (double)this.e.a(new ehj.w.b($$0));
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
      public void a(double[] $$0, ehi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ehi a(ehi.f $$0) {
         return $$0.apply(new ehj.w(this.e.a((ayz.d<ehj.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public azs<? extends ehi> c() {
         return a;
      }

      public ayz<ehj.w.b, ehj.w.a> j() {
         return this.e;
      }

      public static record a(jg<ehi> c) implements bbe<ehj.w.b> {
         public static final Codec<ehj.w.a> b = ehi.c.xmap(ehj.w.a::new, ehj.w.a::a);

         @Override
         public String toString() {
            Optional<alq<ehi>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               alq<ehi> $$1 = $$0.get();
               if ($$1 == ehw.d) {
                  return "continents";
               }

               if ($$1 == ehw.e) {
                  return "erosion";
               }

               if ($$1 == ehw.f) {
                  return "weirdness";
               }

               if ($$1 == ehw.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(ehj.w.b $$0) {
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

         public ehj.w.a a(ehi.f $$0) {
            return new ehj.w.a(new jg.a<>(this.c.a().a($$0)));
         }

         public jg<ehi> a() {
            return this.c;
         }
      }

      public static record b(ehi.b a) {
      }
   }

   interface x extends ehi {
      ehi j();

      @Override
      default double a(ehi.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, ehi.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(ehi.b var1, double var2);
   }

   interface y extends ehi {
      Logger a = LogUtils.getLogger();

      static ehj.y a(ehj.y.a $$0, ehi $$1, ehi $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == ehj.y.a.c || $$0 == ehj.y.a.d) {
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
         if ($$0 == ehj.y.a.b || $$0 == ehj.y.a.a) {
            if ($$1 instanceof ehj.h $$11) {
               return new ehj.n($$0 == ehj.y.a.a ? ehj.n.a.b : ehj.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof ehj.h $$12) {
               return new ehj.n($$0 == ehj.y.a.a ? ehj.n.a.b : ehj.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new ehj.a($$0, $$1, $$2, $$9, $$10);
      }

      ehj.y.a j();

      ehi k();

      ehi l();

      @Override
      default azs<? extends ehi> c() {
         return this.j().e;
      }

      public static enum a implements bax {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final azs<ehj.y> e = ehj.a((BiFunction<ehi, ehi, ehj.y>)(($$0x, $$1) -> ehj.y.a(this, $$0x, $$1)), ehj.y::k, ehj.y::l);
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

   protected static record z(ehi e, ehi.c f, ehj.z.a g) implements ehj.x {
      private static final MapCodec<ehj.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ehi.d.fieldOf("input").forGetter(ehj.z::j),
                  ehi.c.a.fieldOf("noise").forGetter(ehj.z::k),
                  ehj.z.a.c.fieldOf("rarity_value_mapper").forGetter(ehj.z::l)
               )
               .apply($$0, ehj.z::new)
      );
      public static final azs<ehj.z> a = ehj.a(h);

      @Override
      public double a(ehi.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public ehi a(ehi.f $$0) {
         return $$0.apply(new ehj.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public azs<? extends ehi> c() {
         return a;
      }

      @Override
      public ehi j() {
         return this.e;
      }

      public ehi.c k() {
         return this.f;
      }

      public ehj.z.a l() {
         return this.g;
      }

      public static enum a implements bax {
         a("type_1", ehw.a::b, 2.0),
         b("type_2", ehw.a::a, 3.0);

         public static final Codec<ehj.z.a> c = bax.a(ehj.z.a::values);
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
