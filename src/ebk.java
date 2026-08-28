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

public final class ebk {
   private static final Codec<ebj> c = lz.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<ebj> b = Codec.either(d, c)
      .xmap($$0 -> (ebj)$$0.map(ebk::a, Function.identity()), $$0 -> $$0 instanceof ebk.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends ebj> a(kd<MapCodec<? extends ebj>> $$0) {
      a($$0, "blend_alpha", ebk.d.e);
      a($$0, "blend_offset", ebk.f.e);
      a($$0, "beardifier", ebk.b.e);
      a($$0, "old_blended_noise", eqv.a);

      for (ebk.l.a $$1 : ebk.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", ebk.o.e);
      a($$0, "end_islands", ebk.i.a);
      a($$0, "weird_scaled_sampler", ebk.z.a);
      a($$0, "shifted_noise", ebk.v.a);
      a($$0, "range_choice", ebk.q.e);
      a($$0, "shift_a", ebk.s.e);
      a($$0, "shift_b", ebk.t.e);
      a($$0, "shift", ebk.r.e);
      a($$0, "blend_density", ebk.e.e);
      a($$0, "clamp", ebk.g.a);

      for (ebk.k.a $$2 : ebk.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (ebk.y.a $$3 : ebk.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", ebk.w.a);
      a($$0, "constant", ebk.h.e);
      return a($$0, "y_clamped_gradient", ebk.aa.a);
   }

   private static MapCodec<? extends ebj> a(kd<MapCodec<? extends ebj>> $$0, String $$1, azf<? extends ebj> $$2) {
      return kd.a($$0, $$1, $$2.a());
   }

   static <A, O> azf<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return azf.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> azf<O> a(Function<ebj, O> $$0, Function<O, ebj> $$1) {
      return a(ebj.d, $$0, $$1);
   }

   static <O> azf<O> a(BiFunction<ebj, ebj, O> $$0, Function<O, ebj> $$1, Function<O, ebj> $$2) {
      return azf.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(ebj.d.fieldOf("argument1").forGetter($$1), ebj.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> azf<O> a(MapCodec<O> $$0) {
      return azf.a($$0);
   }

   private ebk() {
   }

   public static ebj a(ebj $$0) {
      return new ebk.l(ebk.l.a.a, $$0);
   }

   public static ebj b(ebj $$0) {
      return new ebk.l(ebk.l.a.b, $$0);
   }

   public static ebj c(ebj $$0) {
      return new ebk.l(ebk.l.a.c, $$0);
   }

   public static ebj d(ebj $$0) {
      return new ebk.l(ebk.l.a.d, $$0);
   }

   public static ebj e(ebj $$0) {
      return new ebk.l(ebk.l.a.e, $$0);
   }

   public static ebj a(jq<eqy.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new ebk.o(new ebj.c($$0), $$1, $$2), $$3, $$4);
   }

   public static ebj a(jq<eqy.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static ebj a(jq<eqy.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static ebj a(ebj $$0, ebj $$1, double $$2, jq<eqy.a> $$3) {
      return new ebk.v($$0, a(), $$1, $$2, 0.0, new ebj.c($$3));
   }

   public static ebj a(jq<eqy.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static ebj b(jq<eqy.a> $$0, double $$1, double $$2) {
      return new ebk.o(new ebj.c($$0), $$1, $$2);
   }

   public static ebj a(jq<eqy.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static ebj a(ebj $$0, double $$1, double $$2, ebj $$3, ebj $$4) {
      return new ebk.q($$0, $$1, $$2, $$3, $$4);
   }

   public static ebj b(jq<eqy.a> $$0) {
      return new ebk.s(new ebj.c($$0));
   }

   public static ebj c(jq<eqy.a> $$0) {
      return new ebk.t(new ebj.c($$0));
   }

   public static ebj d(jq<eqy.a> $$0) {
      return new ebk.r(new ebj.c($$0));
   }

   public static ebj f(ebj $$0) {
      return new ebk.e($$0);
   }

   public static ebj a(long $$0) {
      return new ebk.i($$0);
   }

   public static ebj a(ebj $$0, jq<eqy.a> $$1, ebk.z.a $$2) {
      return new ebk.z($$0, new ebj.c($$1), $$2);
   }

   public static ebj a(ebj $$0, ebj $$1) {
      return ebk.y.a(ebk.y.a.a, $$0, $$1);
   }

   public static ebj b(ebj $$0, ebj $$1) {
      return ebk.y.a(ebk.y.a.b, $$0, $$1);
   }

   public static ebj c(ebj $$0, ebj $$1) {
      return ebk.y.a(ebk.y.a.c, $$0, $$1);
   }

   public static ebj d(ebj $$0, ebj $$1) {
      return ebk.y.a(ebk.y.a.d, $$0, $$1);
   }

   public static ebj a(ayo<ebk.w.b, ebk.w.a> $$0) {
      return new ebk.w($$0);
   }

   public static ebj a() {
      return ebk.h.f;
   }

   public static ebj a(double $$0) {
      return new ebk.h($$0);
   }

   public static ebj a(int $$0, int $$1, double $$2, double $$3) {
      return new ebk.aa($$0, $$1, $$2, $$3);
   }

   public static ebj a(ebj $$0, ebk.k.a $$1) {
      return ebk.k.a($$1, $$0);
   }

   private static ebj a(ebj $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static ebj b() {
      return ebk.d.a;
   }

   public static ebj c() {
      return ebk.f.a;
   }

   public static ebj a(ebj $$0, ebj $$1, ebj $$2) {
      if ($$1 instanceof ebk.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         ebj $$4 = d($$0);
         ebj $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static ebj a(ebj $$0, double $$1, ebj $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(ebk.y.a e, ebj f, ebj g, double h, double i) implements ebk.y {
      @Override
      public double a(ebj.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, ebj.a $$1) {
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
      public ebj a(ebj.f $$0) {
         return $$0.apply(ebk.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public ebk.y.a j() {
         return this.e;
      }

      @Override
      public ebj k() {
         return this.f;
      }

      @Override
      public ebj l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements ebj.d {
      private static final MapCodec<ebk.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dzq.e * 2, dzq.d * 2).fieldOf("from_y").forGetter(ebk.aa::j),
                  Codec.intRange(dzq.e * 2, dzq.d * 2).fieldOf("to_y").forGetter(ebk.aa::k),
                  ebk.d.fieldOf("from_value").forGetter(ebk.aa::l),
                  ebk.d.fieldOf("to_value").forGetter(ebk.aa::m)
               )
               .apply($$0, ebk.aa::new)
      );
      public static final azf<ebk.aa> a = ebk.a(i);

      @Override
      public double a(ebj.b $$0) {
         return azm.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public azf<? extends ebj> c() {
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

   protected static enum b implements ebk.c {
      a;

      @Override
      public double a(ebj.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, ebj.a $$1) {
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

   public interface c extends ebj.d {
      azf<ebj> e = azf.a(MapCodec.unit(ebk.b.a));

      @Override
      default azf<? extends ebj> c() {
         return e;
      }
   }

   protected static enum d implements ebj.d {
      a;

      public static final azf<ebj> e = azf.a(MapCodec.unit(a));

      @Override
      public double a(ebj.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, ebj.a $$1) {
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
      public azf<? extends ebj> c() {
         return e;
      }
   }

   static record e(ebj a) implements ebk.x {
      static final azf<ebk.e> e = ebk.a(ebk.e::new, ebk.e::j);

      @Override
      public double a(ebj.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public ebj a(ebj.f $$0) {
         return $$0.apply(new ebk.e(this.a.a($$0)));
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
      public azf<? extends ebj> c() {
         return e;
      }

      @Override
      public ebj j() {
         return this.a;
      }
   }

   protected static enum f implements ebj.d {
      a;

      public static final azf<ebj> e = azf.a(MapCodec.unit(a));

      @Override
      public double a(ebj.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, ebj.a $$1) {
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
      public azf<? extends ebj> c() {
         return e;
      }
   }

   protected static record g(ebj e, double f, double g) implements ebk.p {
      private static final MapCodec<ebk.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ebj.b.fieldOf("input").forGetter(ebk.g::aD_), ebk.d.fieldOf("min").forGetter(ebk.g::a), ebk.d.fieldOf("max").forGetter(ebk.g::b))
               .apply($$0, ebk.g::new)
      );
      public static final azf<ebk.g> a = ebk.a(h);

      @Override
      public double a(double $$0) {
         return azm.a($$0, this.f, this.g);
      }

      @Override
      public ebj a(ebj.f $$0) {
         return new ebk.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public azf<? extends ebj> c() {
         return a;
      }

      @Override
      public ebj aD_() {
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

   static record h(double a) implements ebj.d {
      static final azf<ebk.h> e = ebk.a(ebk.d, ebk.h::new, ebk.h::j);
      static final ebk.h f = new ebk.h(0.0);

      @Override
      public void a(double[] $$0, ebj.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public azf<? extends ebj> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements ebj.d {
      public static final azf<ebk.i> a = azf.a(MapCodec.unit(new ebk.i(0L)));
      private static final float e = -0.9F;
      private final erb f;

      public i(long $$0) {
         azu $$1 = new ebr($$0);
         $$1.b(17292);
         this.f = new erb($$1);
      }

      private static float a(erb $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - azm.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = azm.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (azm.e((float)$$10) * 3439.0F + azm.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - azm.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = azm.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(ebj.b $$0) {
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
      public azf<? extends ebj> c() {
         return a;
      }
   }

   @bat
   public static record j(jq<ebj> a) implements ebj {
      @Override
      public double a(ebj.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, ebj.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public ebj a(ebj.f $$0) {
         return $$0.apply(new ebk.j(new jq.a<>(this.a.a().a($$0))));
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
      public azf<? extends ebj> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jq<ebj> j() {
         return this.a;
      }
   }

   protected static record k(ebk.k.a a, ebj e, double f, double g) implements ebk.p {
      public static ebk.k a(ebk.k.a $$0, ebj $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != ebk.k.a.a && $$0 != ebk.k.a.b ? new ebk.k($$0, $$1, $$3, $$4) : new ebk.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(ebk.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = azm.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public ebk.k b(ebj.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public azf<? extends ebj> c() {
         return this.a.h;
      }

      public ebk.k.a k() {
         return this.a;
      }

      @Override
      public ebj aD_() {
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

      static enum a implements bai {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final azf<ebk.k> h = ebk.a($$0x -> ebk.k.a(this, $$0x), ebk.k::aD_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(ebk.l.a a, ebj e) implements ebk.m {
      @Override
      public double a(ebj.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, ebj.a $$1) {
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
      public ebk.l.a j() {
         return this.a;
      }

      @Override
      public ebj k() {
         return this.e;
      }

      static enum a implements bai {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final azf<ebk.m> g = ebk.a($$0x -> new ebk.l(this, $$0x), ebk.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends ebj {
      ebk.l.a j();

      ebj k();

      @Override
      default azf<? extends ebj> c() {
         return this.j().g;
      }

      @Override
      default ebj a(ebj.f $$0) {
         return $$0.apply(new ebk.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(ebk.n.a e, ebj f, double g, double h, double i) implements ebk.p, ebk.y {
      @Override
      public ebk.y.a j() {
         return this.e == ebk.n.a.a ? ebk.y.a.b : ebk.y.a.a;
      }

      @Override
      public ebj k() {
         return ebk.a(this.i);
      }

      @Override
      public ebj l() {
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
      public ebj a(ebj.f $$0) {
         ebj $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == ebk.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new ebk.n(this.e, $$1, $$4, $$5, this.i);
      }

      public ebk.n.a m() {
         return this.e;
      }

      @Override
      public ebj aD_() {
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

   protected static record o(ebj.c f, @Deprecated double g, double h) implements ebj {
      public static final MapCodec<ebk.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ebj.c.a.fieldOf("noise").forGetter(ebk.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(ebk.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(ebk.o::l)
               )
               .apply($$0, ebk.o::new)
      );
      public static final azf<ebk.o> e = ebk.a(a);

      @Override
      public double a(ebj.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, ebj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ebj a(ebj.f $$0) {
         return $$0.apply(new ebk.o($$0.a(this.f), this.g, this.h));
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
      public azf<? extends ebj> c() {
         return e;
      }

      public ebj.c j() {
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

   interface p extends ebj {
      ebj aD_();

      @Override
      default double a(ebj.b $$0) {
         return this.a(this.aD_().a($$0));
      }

      @Override
      default void a(double[] $$0, ebj.a $$1) {
         this.aD_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(ebj f, double g, double h, ebj i, ebj j) implements ebj {
      public static final MapCodec<ebk.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ebj.d.fieldOf("input").forGetter(ebk.q::j),
                  ebk.d.fieldOf("min_inclusive").forGetter(ebk.q::k),
                  ebk.d.fieldOf("max_exclusive").forGetter(ebk.q::l),
                  ebj.d.fieldOf("when_in_range").forGetter(ebk.q::m),
                  ebj.d.fieldOf("when_out_of_range").forGetter(ebk.q::n)
               )
               .apply($$0, ebk.q::new)
      );
      public static final azf<ebk.q> e = ebk.a(a);

      @Override
      public double a(ebj.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, ebj.a $$1) {
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
      public ebj a(ebj.f $$0) {
         return $$0.apply(new ebk.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public azf<? extends ebj> c() {
         return e;
      }

      public ebj j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public ebj m() {
         return this.i;
      }

      public ebj n() {
         return this.j;
      }
   }

   protected static record r(ebj.c a) implements ebk.u {
      static final azf<ebk.r> e = ebk.a(ebj.c.a, ebk.r::new, ebk.r::j);

      @Override
      public double a(ebj.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public ebj a(ebj.f $$0) {
         return $$0.apply(new ebk.r($$0.a(this.a)));
      }

      @Override
      public azf<? extends ebj> c() {
         return e;
      }

      @Override
      public ebj.c j() {
         return this.a;
      }
   }

   protected static record s(ebj.c a) implements ebk.u {
      static final azf<ebk.s> e = ebk.a(ebj.c.a, ebk.s::new, ebk.s::j);

      @Override
      public double a(ebj.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public ebj a(ebj.f $$0) {
         return $$0.apply(new ebk.s($$0.a(this.a)));
      }

      @Override
      public azf<? extends ebj> c() {
         return e;
      }

      @Override
      public ebj.c j() {
         return this.a;
      }
   }

   protected static record t(ebj.c a) implements ebk.u {
      static final azf<ebk.t> e = ebk.a(ebj.c.a, ebk.t::new, ebk.t::j);

      @Override
      public double a(ebj.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public ebj a(ebj.f $$0) {
         return $$0.apply(new ebk.t($$0.a(this.a)));
      }

      @Override
      public azf<? extends ebj> c() {
         return e;
      }

      @Override
      public ebj.c j() {
         return this.a;
      }
   }

   interface u extends ebj {
      ebj.c j();

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
      default void a(double[] $$0, ebj.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(ebj e, ebj f, ebj g, double h, double i, ebj.c j) implements ebj {
      private static final MapCodec<ebk.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ebj.d.fieldOf("shift_x").forGetter(ebk.v::j),
                  ebj.d.fieldOf("shift_y").forGetter(ebk.v::k),
                  ebj.d.fieldOf("shift_z").forGetter(ebk.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(ebk.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(ebk.v::n),
                  ebj.c.a.fieldOf("noise").forGetter(ebk.v::o)
               )
               .apply($$0, ebk.v::new)
      );
      public static final azf<ebk.v> a = ebk.a(k);

      @Override
      public double a(ebj.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, ebj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ebj a(ebj.f $$0) {
         return $$0.apply(new ebk.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public azf<? extends ebj> c() {
         return a;
      }

      public ebj j() {
         return this.e;
      }

      public ebj k() {
         return this.f;
      }

      public ebj l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public ebj.c o() {
         return this.j;
      }
   }

   public static record w(ayo<ebk.w.b, ebk.w.a> e) implements ebj {
      private static final Codec<ayo<ebk.w.b, ebk.w.a>> f = ayo.a(ebk.w.a.b);
      private static final MapCodec<ebk.w> g = f.fieldOf("spline").xmap(ebk.w::new, ebk.w::j);
      public static final azf<ebk.w> a = ebk.a(g);

      @Override
      public double a(ebj.b $$0) {
         return (double)this.e.a(new ebk.w.b($$0));
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
      public void a(double[] $$0, ebj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ebj a(ebj.f $$0) {
         return $$0.apply(new ebk.w(this.e.a((ayo.d<ebk.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public azf<? extends ebj> c() {
         return a;
      }

      public ayo<ebk.w.b, ebk.w.a> j() {
         return this.e;
      }

      public static record a(jq<ebj> c) implements bap<ebk.w.b> {
         public static final Codec<ebk.w.a> b = ebj.c.xmap(ebk.w.a::new, ebk.w.a::a);

         @Override
         public String toString() {
            Optional<ali<ebj>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               ali<ebj> $$1 = $$0.get();
               if ($$1 == ebx.d) {
                  return "continents";
               }

               if ($$1 == ebx.e) {
                  return "erosion";
               }

               if ($$1 == ebx.f) {
                  return "weirdness";
               }

               if ($$1 == ebx.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(ebk.w.b $$0) {
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

         public ebk.w.a a(ebj.f $$0) {
            return new ebk.w.a(new jq.a<>(this.c.a().a($$0)));
         }

         public jq<ebj> a() {
            return this.c;
         }
      }

      public static record b(ebj.b a) {
      }
   }

   interface x extends ebj {
      ebj j();

      @Override
      default double a(ebj.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, ebj.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(ebj.b var1, double var2);
   }

   interface y extends ebj {
      Logger a = LogUtils.getLogger();

      static ebk.y a(ebk.y.a $$0, ebj $$1, ebj $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == ebk.y.a.c || $$0 == ebk.y.a.d) {
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
         if ($$0 == ebk.y.a.b || $$0 == ebk.y.a.a) {
            if ($$1 instanceof ebk.h $$11) {
               return new ebk.n($$0 == ebk.y.a.a ? ebk.n.a.b : ebk.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof ebk.h $$12) {
               return new ebk.n($$0 == ebk.y.a.a ? ebk.n.a.b : ebk.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new ebk.a($$0, $$1, $$2, $$9, $$10);
      }

      ebk.y.a j();

      ebj k();

      ebj l();

      @Override
      default azf<? extends ebj> c() {
         return this.j().e;
      }

      public static enum a implements bai {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final azf<ebk.y> e = ebk.a((BiFunction<ebj, ebj, ebk.y>)(($$0x, $$1) -> ebk.y.a(this, $$0x, $$1)), ebk.y::k, ebk.y::l);
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

   protected static record z(ebj e, ebj.c f, ebk.z.a g) implements ebk.x {
      private static final MapCodec<ebk.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ebj.d.fieldOf("input").forGetter(ebk.z::j),
                  ebj.c.a.fieldOf("noise").forGetter(ebk.z::k),
                  ebk.z.a.c.fieldOf("rarity_value_mapper").forGetter(ebk.z::l)
               )
               .apply($$0, ebk.z::new)
      );
      public static final azf<ebk.z> a = ebk.a(h);

      @Override
      public double a(ebj.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public ebj a(ebj.f $$0) {
         return $$0.apply(new ebk.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public azf<? extends ebj> c() {
         return a;
      }

      @Override
      public ebj j() {
         return this.e;
      }

      public ebj.c k() {
         return this.f;
      }

      public ebk.z.a l() {
         return this.g;
      }

      public static enum a implements bai {
         a("type_1", ebx.a::b, 2.0),
         b("type_2", ebx.a::a, 3.0);

         public static final Codec<ebk.z.a> c = bai.a(ebk.z.a::values);
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
