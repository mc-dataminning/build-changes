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

public final class ebd {
   private static final Codec<ebc> c = lz.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<ebc> b = Codec.either(d, c)
      .xmap($$0 -> (ebc)$$0.map(ebd::a, Function.identity()), $$0 -> $$0 instanceof ebd.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends ebc> a(kd<MapCodec<? extends ebc>> $$0) {
      a($$0, "blend_alpha", ebd.d.e);
      a($$0, "blend_offset", ebd.f.e);
      a($$0, "beardifier", ebd.b.e);
      a($$0, "old_blended_noise", eqo.a);

      for (ebd.l.a $$1 : ebd.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", ebd.o.e);
      a($$0, "end_islands", ebd.i.a);
      a($$0, "weird_scaled_sampler", ebd.z.a);
      a($$0, "shifted_noise", ebd.v.a);
      a($$0, "range_choice", ebd.q.e);
      a($$0, "shift_a", ebd.s.e);
      a($$0, "shift_b", ebd.t.e);
      a($$0, "shift", ebd.r.e);
      a($$0, "blend_density", ebd.e.e);
      a($$0, "clamp", ebd.g.a);

      for (ebd.k.a $$2 : ebd.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (ebd.y.a $$3 : ebd.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", ebd.w.a);
      a($$0, "constant", ebd.h.e);
      return a($$0, "y_clamped_gradient", ebd.aa.a);
   }

   private static MapCodec<? extends ebc> a(kd<MapCodec<? extends ebc>> $$0, String $$1, azg<? extends ebc> $$2) {
      return kd.a($$0, $$1, $$2.a());
   }

   static <A, O> azg<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return azg.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> azg<O> a(Function<ebc, O> $$0, Function<O, ebc> $$1) {
      return a(ebc.d, $$0, $$1);
   }

   static <O> azg<O> a(BiFunction<ebc, ebc, O> $$0, Function<O, ebc> $$1, Function<O, ebc> $$2) {
      return azg.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(ebc.d.fieldOf("argument1").forGetter($$1), ebc.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> azg<O> a(MapCodec<O> $$0) {
      return azg.a($$0);
   }

   private ebd() {
   }

   public static ebc a(ebc $$0) {
      return new ebd.l(ebd.l.a.a, $$0);
   }

   public static ebc b(ebc $$0) {
      return new ebd.l(ebd.l.a.b, $$0);
   }

   public static ebc c(ebc $$0) {
      return new ebd.l(ebd.l.a.c, $$0);
   }

   public static ebc d(ebc $$0) {
      return new ebd.l(ebd.l.a.d, $$0);
   }

   public static ebc e(ebc $$0) {
      return new ebd.l(ebd.l.a.e, $$0);
   }

   public static ebc a(jq<eqr.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new ebd.o(new ebc.c($$0), $$1, $$2), $$3, $$4);
   }

   public static ebc a(jq<eqr.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static ebc a(jq<eqr.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static ebc a(ebc $$0, ebc $$1, double $$2, jq<eqr.a> $$3) {
      return new ebd.v($$0, a(), $$1, $$2, 0.0, new ebc.c($$3));
   }

   public static ebc a(jq<eqr.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static ebc b(jq<eqr.a> $$0, double $$1, double $$2) {
      return new ebd.o(new ebc.c($$0), $$1, $$2);
   }

   public static ebc a(jq<eqr.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static ebc a(ebc $$0, double $$1, double $$2, ebc $$3, ebc $$4) {
      return new ebd.q($$0, $$1, $$2, $$3, $$4);
   }

   public static ebc b(jq<eqr.a> $$0) {
      return new ebd.s(new ebc.c($$0));
   }

   public static ebc c(jq<eqr.a> $$0) {
      return new ebd.t(new ebc.c($$0));
   }

   public static ebc d(jq<eqr.a> $$0) {
      return new ebd.r(new ebc.c($$0));
   }

   public static ebc f(ebc $$0) {
      return new ebd.e($$0);
   }

   public static ebc a(long $$0) {
      return new ebd.i($$0);
   }

   public static ebc a(ebc $$0, jq<eqr.a> $$1, ebd.z.a $$2) {
      return new ebd.z($$0, new ebc.c($$1), $$2);
   }

   public static ebc a(ebc $$0, ebc $$1) {
      return ebd.y.a(ebd.y.a.a, $$0, $$1);
   }

   public static ebc b(ebc $$0, ebc $$1) {
      return ebd.y.a(ebd.y.a.b, $$0, $$1);
   }

   public static ebc c(ebc $$0, ebc $$1) {
      return ebd.y.a(ebd.y.a.c, $$0, $$1);
   }

   public static ebc d(ebc $$0, ebc $$1) {
      return ebd.y.a(ebd.y.a.d, $$0, $$1);
   }

   public static ebc a(ayp<ebd.w.b, ebd.w.a> $$0) {
      return new ebd.w($$0);
   }

   public static ebc a() {
      return ebd.h.f;
   }

   public static ebc a(double $$0) {
      return new ebd.h($$0);
   }

   public static ebc a(int $$0, int $$1, double $$2, double $$3) {
      return new ebd.aa($$0, $$1, $$2, $$3);
   }

   public static ebc a(ebc $$0, ebd.k.a $$1) {
      return ebd.k.a($$1, $$0);
   }

   private static ebc a(ebc $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static ebc b() {
      return ebd.d.a;
   }

   public static ebc c() {
      return ebd.f.a;
   }

   public static ebc a(ebc $$0, ebc $$1, ebc $$2) {
      if ($$1 instanceof ebd.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         ebc $$4 = d($$0);
         ebc $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static ebc a(ebc $$0, double $$1, ebc $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(ebd.y.a e, ebc f, ebc g, double h, double i) implements ebd.y {
      @Override
      public double a(ebc.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, ebc.a $$1) {
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
      public ebc a(ebc.f $$0) {
         return $$0.apply(ebd.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public ebd.y.a j() {
         return this.e;
      }

      @Override
      public ebc k() {
         return this.f;
      }

      @Override
      public ebc l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements ebc.d {
      private static final MapCodec<ebd.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dzj.e * 2, dzj.d * 2).fieldOf("from_y").forGetter(ebd.aa::j),
                  Codec.intRange(dzj.e * 2, dzj.d * 2).fieldOf("to_y").forGetter(ebd.aa::k),
                  ebd.d.fieldOf("from_value").forGetter(ebd.aa::l),
                  ebd.d.fieldOf("to_value").forGetter(ebd.aa::m)
               )
               .apply($$0, ebd.aa::new)
      );
      public static final azg<ebd.aa> a = ebd.a(i);

      @Override
      public double a(ebc.b $$0) {
         return azn.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public azg<? extends ebc> c() {
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

   protected static enum b implements ebd.c {
      a;

      @Override
      public double a(ebc.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, ebc.a $$1) {
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

   public interface c extends ebc.d {
      azg<ebc> e = azg.a(MapCodec.unit(ebd.b.a));

      @Override
      default azg<? extends ebc> c() {
         return e;
      }
   }

   protected static enum d implements ebc.d {
      a;

      public static final azg<ebc> e = azg.a(MapCodec.unit(a));

      @Override
      public double a(ebc.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, ebc.a $$1) {
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
      public azg<? extends ebc> c() {
         return e;
      }
   }

   static record e(ebc a) implements ebd.x {
      static final azg<ebd.e> e = ebd.a(ebd.e::new, ebd.e::j);

      @Override
      public double a(ebc.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public ebc a(ebc.f $$0) {
         return $$0.apply(new ebd.e(this.a.a($$0)));
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
      public azg<? extends ebc> c() {
         return e;
      }

      @Override
      public ebc j() {
         return this.a;
      }
   }

   protected static enum f implements ebc.d {
      a;

      public static final azg<ebc> e = azg.a(MapCodec.unit(a));

      @Override
      public double a(ebc.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, ebc.a $$1) {
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
      public azg<? extends ebc> c() {
         return e;
      }
   }

   protected static record g(ebc e, double f, double g) implements ebd.p {
      private static final MapCodec<ebd.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ebc.b.fieldOf("input").forGetter(ebd.g::aE_), ebd.d.fieldOf("min").forGetter(ebd.g::a), ebd.d.fieldOf("max").forGetter(ebd.g::b))
               .apply($$0, ebd.g::new)
      );
      public static final azg<ebd.g> a = ebd.a(h);

      @Override
      public double a(double $$0) {
         return azn.a($$0, this.f, this.g);
      }

      @Override
      public ebc a(ebc.f $$0) {
         return new ebd.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public azg<? extends ebc> c() {
         return a;
      }

      @Override
      public ebc aE_() {
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

   static record h(double a) implements ebc.d {
      static final azg<ebd.h> e = ebd.a(ebd.d, ebd.h::new, ebd.h::j);
      static final ebd.h f = new ebd.h(0.0);

      @Override
      public void a(double[] $$0, ebc.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public azg<? extends ebc> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements ebc.d {
      public static final azg<ebd.i> a = azg.a(MapCodec.unit(new ebd.i(0L)));
      private static final float e = -0.9F;
      private final equ f;

      public i(long $$0) {
         azv $$1 = new ebk($$0);
         $$1.b(17292);
         this.f = new equ($$1);
      }

      private static float a(equ $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - azn.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = azn.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (azn.e((float)$$10) * 3439.0F + azn.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - azn.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = azn.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(ebc.b $$0) {
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
      public azg<? extends ebc> c() {
         return a;
      }
   }

   @bau
   public static record j(jq<ebc> a) implements ebc {
      @Override
      public double a(ebc.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, ebc.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public ebc a(ebc.f $$0) {
         return $$0.apply(new ebd.j(new jq.a<>(this.a.a().a($$0))));
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
      public azg<? extends ebc> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jq<ebc> j() {
         return this.a;
      }
   }

   protected static record k(ebd.k.a a, ebc e, double f, double g) implements ebd.p {
      public static ebd.k a(ebd.k.a $$0, ebc $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != ebd.k.a.a && $$0 != ebd.k.a.b ? new ebd.k($$0, $$1, $$3, $$4) : new ebd.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(ebd.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = azn.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public ebd.k b(ebc.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public azg<? extends ebc> c() {
         return this.a.h;
      }

      public ebd.k.a k() {
         return this.a;
      }

      @Override
      public ebc aE_() {
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

      static enum a implements baj {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final azg<ebd.k> h = ebd.a($$0x -> ebd.k.a(this, $$0x), ebd.k::aE_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(ebd.l.a a, ebc e) implements ebd.m {
      @Override
      public double a(ebc.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, ebc.a $$1) {
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
      public ebd.l.a j() {
         return this.a;
      }

      @Override
      public ebc k() {
         return this.e;
      }

      static enum a implements baj {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final azg<ebd.m> g = ebd.a($$0x -> new ebd.l(this, $$0x), ebd.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends ebc {
      ebd.l.a j();

      ebc k();

      @Override
      default azg<? extends ebc> c() {
         return this.j().g;
      }

      @Override
      default ebc a(ebc.f $$0) {
         return $$0.apply(new ebd.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(ebd.n.a e, ebc f, double g, double h, double i) implements ebd.p, ebd.y {
      @Override
      public ebd.y.a j() {
         return this.e == ebd.n.a.a ? ebd.y.a.b : ebd.y.a.a;
      }

      @Override
      public ebc k() {
         return ebd.a(this.i);
      }

      @Override
      public ebc l() {
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
      public ebc a(ebc.f $$0) {
         ebc $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == ebd.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new ebd.n(this.e, $$1, $$4, $$5, this.i);
      }

      public ebd.n.a m() {
         return this.e;
      }

      @Override
      public ebc aE_() {
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

   protected static record o(ebc.c f, @Deprecated double g, double h) implements ebc {
      public static final MapCodec<ebd.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ebc.c.a.fieldOf("noise").forGetter(ebd.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(ebd.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(ebd.o::l)
               )
               .apply($$0, ebd.o::new)
      );
      public static final azg<ebd.o> e = ebd.a(a);

      @Override
      public double a(ebc.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, ebc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ebc a(ebc.f $$0) {
         return $$0.apply(new ebd.o($$0.a(this.f), this.g, this.h));
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
      public azg<? extends ebc> c() {
         return e;
      }

      public ebc.c j() {
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

   interface p extends ebc {
      ebc aE_();

      @Override
      default double a(ebc.b $$0) {
         return this.a(this.aE_().a($$0));
      }

      @Override
      default void a(double[] $$0, ebc.a $$1) {
         this.aE_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(ebc f, double g, double h, ebc i, ebc j) implements ebc {
      public static final MapCodec<ebd.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ebc.d.fieldOf("input").forGetter(ebd.q::j),
                  ebd.d.fieldOf("min_inclusive").forGetter(ebd.q::k),
                  ebd.d.fieldOf("max_exclusive").forGetter(ebd.q::l),
                  ebc.d.fieldOf("when_in_range").forGetter(ebd.q::m),
                  ebc.d.fieldOf("when_out_of_range").forGetter(ebd.q::n)
               )
               .apply($$0, ebd.q::new)
      );
      public static final azg<ebd.q> e = ebd.a(a);

      @Override
      public double a(ebc.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, ebc.a $$1) {
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
      public ebc a(ebc.f $$0) {
         return $$0.apply(new ebd.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public azg<? extends ebc> c() {
         return e;
      }

      public ebc j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public ebc m() {
         return this.i;
      }

      public ebc n() {
         return this.j;
      }
   }

   protected static record r(ebc.c a) implements ebd.u {
      static final azg<ebd.r> e = ebd.a(ebc.c.a, ebd.r::new, ebd.r::j);

      @Override
      public double a(ebc.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public ebc a(ebc.f $$0) {
         return $$0.apply(new ebd.r($$0.a(this.a)));
      }

      @Override
      public azg<? extends ebc> c() {
         return e;
      }

      @Override
      public ebc.c j() {
         return this.a;
      }
   }

   protected static record s(ebc.c a) implements ebd.u {
      static final azg<ebd.s> e = ebd.a(ebc.c.a, ebd.s::new, ebd.s::j);

      @Override
      public double a(ebc.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public ebc a(ebc.f $$0) {
         return $$0.apply(new ebd.s($$0.a(this.a)));
      }

      @Override
      public azg<? extends ebc> c() {
         return e;
      }

      @Override
      public ebc.c j() {
         return this.a;
      }
   }

   protected static record t(ebc.c a) implements ebd.u {
      static final azg<ebd.t> e = ebd.a(ebc.c.a, ebd.t::new, ebd.t::j);

      @Override
      public double a(ebc.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public ebc a(ebc.f $$0) {
         return $$0.apply(new ebd.t($$0.a(this.a)));
      }

      @Override
      public azg<? extends ebc> c() {
         return e;
      }

      @Override
      public ebc.c j() {
         return this.a;
      }
   }

   interface u extends ebc {
      ebc.c j();

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
      default void a(double[] $$0, ebc.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(ebc e, ebc f, ebc g, double h, double i, ebc.c j) implements ebc {
      private static final MapCodec<ebd.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ebc.d.fieldOf("shift_x").forGetter(ebd.v::j),
                  ebc.d.fieldOf("shift_y").forGetter(ebd.v::k),
                  ebc.d.fieldOf("shift_z").forGetter(ebd.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(ebd.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(ebd.v::n),
                  ebc.c.a.fieldOf("noise").forGetter(ebd.v::o)
               )
               .apply($$0, ebd.v::new)
      );
      public static final azg<ebd.v> a = ebd.a(k);

      @Override
      public double a(ebc.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, ebc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ebc a(ebc.f $$0) {
         return $$0.apply(new ebd.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public azg<? extends ebc> c() {
         return a;
      }

      public ebc j() {
         return this.e;
      }

      public ebc k() {
         return this.f;
      }

      public ebc l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public ebc.c o() {
         return this.j;
      }
   }

   public static record w(ayp<ebd.w.b, ebd.w.a> e) implements ebc {
      private static final Codec<ayp<ebd.w.b, ebd.w.a>> f = ayp.a(ebd.w.a.b);
      private static final MapCodec<ebd.w> g = f.fieldOf("spline").xmap(ebd.w::new, ebd.w::j);
      public static final azg<ebd.w> a = ebd.a(g);

      @Override
      public double a(ebc.b $$0) {
         return (double)this.e.a(new ebd.w.b($$0));
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
      public void a(double[] $$0, ebc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ebc a(ebc.f $$0) {
         return $$0.apply(new ebd.w(this.e.a((ayp.d<ebd.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public azg<? extends ebc> c() {
         return a;
      }

      public ayp<ebd.w.b, ebd.w.a> j() {
         return this.e;
      }

      public static record a(jq<ebc> c) implements baq<ebd.w.b> {
         public static final Codec<ebd.w.a> b = ebc.c.xmap(ebd.w.a::new, ebd.w.a::a);

         @Override
         public String toString() {
            Optional<alk<ebc>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               alk<ebc> $$1 = $$0.get();
               if ($$1 == ebq.d) {
                  return "continents";
               }

               if ($$1 == ebq.e) {
                  return "erosion";
               }

               if ($$1 == ebq.f) {
                  return "weirdness";
               }

               if ($$1 == ebq.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(ebd.w.b $$0) {
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

         public ebd.w.a a(ebc.f $$0) {
            return new ebd.w.a(new jq.a<>(this.c.a().a($$0)));
         }

         public jq<ebc> a() {
            return this.c;
         }
      }

      public static record b(ebc.b a) {
      }
   }

   interface x extends ebc {
      ebc j();

      @Override
      default double a(ebc.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, ebc.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(ebc.b var1, double var2);
   }

   interface y extends ebc {
      Logger a = LogUtils.getLogger();

      static ebd.y a(ebd.y.a $$0, ebc $$1, ebc $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == ebd.y.a.c || $$0 == ebd.y.a.d) {
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
         if ($$0 == ebd.y.a.b || $$0 == ebd.y.a.a) {
            if ($$1 instanceof ebd.h $$11) {
               return new ebd.n($$0 == ebd.y.a.a ? ebd.n.a.b : ebd.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof ebd.h $$12) {
               return new ebd.n($$0 == ebd.y.a.a ? ebd.n.a.b : ebd.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new ebd.a($$0, $$1, $$2, $$9, $$10);
      }

      ebd.y.a j();

      ebc k();

      ebc l();

      @Override
      default azg<? extends ebc> c() {
         return this.j().e;
      }

      public static enum a implements baj {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final azg<ebd.y> e = ebd.a((BiFunction<ebc, ebc, ebd.y>)(($$0x, $$1) -> ebd.y.a(this, $$0x, $$1)), ebd.y::k, ebd.y::l);
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

   protected static record z(ebc e, ebc.c f, ebd.z.a g) implements ebd.x {
      private static final MapCodec<ebd.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ebc.d.fieldOf("input").forGetter(ebd.z::j),
                  ebc.c.a.fieldOf("noise").forGetter(ebd.z::k),
                  ebd.z.a.c.fieldOf("rarity_value_mapper").forGetter(ebd.z::l)
               )
               .apply($$0, ebd.z::new)
      );
      public static final azg<ebd.z> a = ebd.a(h);

      @Override
      public double a(ebc.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public ebc a(ebc.f $$0) {
         return $$0.apply(new ebd.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public azg<? extends ebc> c() {
         return a;
      }

      @Override
      public ebc j() {
         return this.e;
      }

      public ebc.c k() {
         return this.f;
      }

      public ebd.z.a l() {
         return this.g;
      }

      public static enum a implements baj {
         a("type_1", ebq.a::b, 2.0),
         b("type_2", ebq.a::a, 3.0);

         public static final Codec<ebd.z.a> c = baj.a(ebd.z.a::values);
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
