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

public final class dvt {
   private static final Codec<dvs> c = ld.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dvs> b = Codec.either(d, c)
      .xmap($$0 -> (dvs)$$0.map(dvt::a, Function.identity()), $$0 -> $$0 instanceof dvt.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dvs> a(jj<Codec<? extends dvs>> $$0) {
      a($$0, "blend_alpha", dvt.d.e);
      a($$0, "blend_offset", dvt.f.e);
      a($$0, "beardifier", dvt.b.e);
      a($$0, "old_blended_noise", ela.a);

      for (dvt.l.a $$1 : dvt.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dvt.o.e);
      a($$0, "end_islands", dvt.i.a);
      a($$0, "weird_scaled_sampler", dvt.z.a);
      a($$0, "shifted_noise", dvt.v.a);
      a($$0, "range_choice", dvt.q.e);
      a($$0, "shift_a", dvt.s.e);
      a($$0, "shift_b", dvt.t.e);
      a($$0, "shift", dvt.r.e);
      a($$0, "blend_density", dvt.e.e);
      a($$0, "clamp", dvt.g.a);

      for (dvt.k.a $$2 : dvt.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dvt.y.a $$3 : dvt.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dvt.w.a);
      a($$0, "constant", dvt.h.e);
      return a($$0, "y_clamped_gradient", dvt.aa.a);
   }

   private static Codec<? extends dvs> a(jj<Codec<? extends dvs>> $$0, String $$1, axt<? extends dvs> $$2) {
      return jj.a($$0, $$1, $$2.a());
   }

   static <A, O> axt<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return axt.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> axt<O> a(Function<dvs, O> $$0, Function<O, dvs> $$1) {
      return a(dvs.d, $$0, $$1);
   }

   static <O> axt<O> a(BiFunction<dvs, dvs, O> $$0, Function<O, dvs> $$1, Function<O, dvs> $$2) {
      return axt.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dvs.d.fieldOf("argument1").forGetter($$1), dvs.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> axt<O> a(MapCodec<O> $$0) {
      return axt.a($$0);
   }

   private dvt() {
   }

   public static dvs a(dvs $$0) {
      return new dvt.l(dvt.l.a.a, $$0);
   }

   public static dvs b(dvs $$0) {
      return new dvt.l(dvt.l.a.b, $$0);
   }

   public static dvs c(dvs $$0) {
      return new dvt.l(dvt.l.a.c, $$0);
   }

   public static dvs d(dvs $$0) {
      return new dvt.l(dvt.l.a.d, $$0);
   }

   public static dvs e(dvs $$0) {
      return new dvt.l(dvt.l.a.e, $$0);
   }

   public static dvs a(iw<eld.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dvt.o(new dvs.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dvs a(iw<eld.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dvs a(iw<eld.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dvs a(dvs $$0, dvs $$1, double $$2, iw<eld.a> $$3) {
      return new dvt.v($$0, a(), $$1, $$2, 0.0, new dvs.c($$3));
   }

   public static dvs a(iw<eld.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dvs b(iw<eld.a> $$0, double $$1, double $$2) {
      return new dvt.o(new dvs.c($$0), $$1, $$2);
   }

   public static dvs a(iw<eld.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dvs a(dvs $$0, double $$1, double $$2, dvs $$3, dvs $$4) {
      return new dvt.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dvs b(iw<eld.a> $$0) {
      return new dvt.s(new dvs.c($$0));
   }

   public static dvs c(iw<eld.a> $$0) {
      return new dvt.t(new dvs.c($$0));
   }

   public static dvs d(iw<eld.a> $$0) {
      return new dvt.r(new dvs.c($$0));
   }

   public static dvs f(dvs $$0) {
      return new dvt.e($$0);
   }

   public static dvs a(long $$0) {
      return new dvt.i($$0);
   }

   public static dvs a(dvs $$0, iw<eld.a> $$1, dvt.z.a $$2) {
      return new dvt.z($$0, new dvs.c($$1), $$2);
   }

   public static dvs a(dvs $$0, dvs $$1) {
      return dvt.y.a(dvt.y.a.a, $$0, $$1);
   }

   public static dvs b(dvs $$0, dvs $$1) {
      return dvt.y.a(dvt.y.a.b, $$0, $$1);
   }

   public static dvs c(dvs $$0, dvs $$1) {
      return dvt.y.a(dvt.y.a.c, $$0, $$1);
   }

   public static dvs d(dvs $$0, dvs $$1) {
      return dvt.y.a(dvt.y.a.d, $$0, $$1);
   }

   public static dvs a(axb<dvt.w.b, dvt.w.a> $$0) {
      return new dvt.w($$0);
   }

   public static dvs a() {
      return dvt.h.f;
   }

   public static dvs a(double $$0) {
      return new dvt.h($$0);
   }

   public static dvs a(int $$0, int $$1, double $$2, double $$3) {
      return new dvt.aa($$0, $$1, $$2, $$3);
   }

   public static dvs a(dvs $$0, dvt.k.a $$1) {
      return dvt.k.a($$1, $$0);
   }

   private static dvs a(dvs $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dvs b() {
      return dvt.d.a;
   }

   public static dvs c() {
      return dvt.f.a;
   }

   public static dvs a(dvs $$0, dvs $$1, dvs $$2) {
      if ($$1 instanceof dvt.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dvs $$4 = d($$0);
         dvs $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dvs a(dvs $$0, double $$1, dvs $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dvt.y.a e, dvs f, dvs g, double h, double i) implements dvt.y {
      @Override
      public double a(dvs.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dvs.a $$1) {
         this.f.a($$0, $$1);
         switch (this.e) {
            case a:
               double[] $$2 = new double[$$0.length];
               this.g.a($$2, $$1);

               for (int $$3 = 0; $$3 < $$0.length; $$3++) {
                  $$0[$$3] += $$2[$$3];
               }
               break;
            case d:
               double $$9 = this.g.b();

               for (int $$10 = 0; $$10 < $$0.length; $$10++) {
                  double $$11 = $$0[$$10];
                  $$0[$$10] = $$11 > $$9 ? $$11 : Math.max($$11, this.g.a($$1.a($$10)));
               }
               break;
            case c:
               double $$6 = this.g.a();

               for (int $$7 = 0; $$7 < $$0.length; $$7++) {
                  double $$8 = $$0[$$7];
                  $$0[$$7] = $$8 < $$6 ? $$8 : Math.min($$8, this.g.a($$1.a($$7)));
               }
               break;
            case b:
               for (int $$4 = 0; $$4 < $$0.length; $$4++) {
                  double $$5 = $$0[$$4];
                  $$0[$$4] = $$5 == 0.0 ? 0.0 : $$5 * this.g.a($$1.a($$4));
               }
         }
      }

      @Override
      public dvs a(dvs.f $$0) {
         return $$0.apply(dvt.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dvt.y.a j() {
         return this.e;
      }

      @Override
      public dvs k() {
         return this.f;
      }

      @Override
      public dvs l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dvs.d {
      private static final MapCodec<dvt.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dtz.e * 2, dtz.d * 2).fieldOf("from_y").forGetter(dvt.aa::j),
                  Codec.intRange(dtz.e * 2, dtz.d * 2).fieldOf("to_y").forGetter(dvt.aa::k),
                  dvt.d.fieldOf("from_value").forGetter(dvt.aa::l),
                  dvt.d.fieldOf("to_value").forGetter(dvt.aa::m)
               )
               .apply($$0, dvt.aa::new)
      );
      public static final axt<dvt.aa> a = dvt.a(i);

      @Override
      public double a(dvs.b $$0) {
         return axz.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public axt<? extends dvs> c() {
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

   protected static enum b implements dvt.c {
      a;

      @Override
      public double a(dvs.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dvs.a $$1) {
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

   public interface c extends dvs.d {
      axt<dvs> e = axt.a(MapCodec.unit(dvt.b.a));

      @Override
      default axt<? extends dvs> c() {
         return e;
      }
   }

   protected static enum d implements dvs.d {
      a;

      public static final axt<dvs> e = axt.a(MapCodec.unit(a));

      @Override
      public double a(dvs.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dvs.a $$1) {
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
      public axt<? extends dvs> c() {
         return e;
      }
   }

   static record e(dvs a) implements dvt.x {
      static final axt<dvt.e> e = dvt.a(dvt.e::new, dvt.e::j);

      @Override
      public double a(dvs.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dvs a(dvs.f $$0) {
         return $$0.apply(new dvt.e(this.a.a($$0)));
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
      public axt<? extends dvs> c() {
         return e;
      }

      @Override
      public dvs j() {
         return this.a;
      }
   }

   protected static enum f implements dvs.d {
      a;

      public static final axt<dvs> e = axt.a(MapCodec.unit(a));

      @Override
      public double a(dvs.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dvs.a $$1) {
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
      public axt<? extends dvs> c() {
         return e;
      }
   }

   protected static record g(dvs e, double f, double g) implements dvt.p {
      private static final MapCodec<dvt.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dvs.b.fieldOf("input").forGetter(dvt.g::aA_), dvt.d.fieldOf("min").forGetter(dvt.g::a), dvt.d.fieldOf("max").forGetter(dvt.g::b))
               .apply($$0, dvt.g::new)
      );
      public static final axt<dvt.g> a = dvt.a(h);

      @Override
      public double a(double $$0) {
         return axz.a($$0, this.f, this.g);
      }

      @Override
      public dvs a(dvs.f $$0) {
         return new dvt.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public axt<? extends dvs> c() {
         return a;
      }

      @Override
      public dvs aA_() {
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

   static record h(double a) implements dvs.d {
      static final axt<dvt.h> e = dvt.a(dvt.d, dvt.h::new, dvt.h::j);
      static final dvt.h f = new dvt.h(0.0);

      @Override
      public void a(double[] $$0, dvs.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public axt<? extends dvs> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dvs.d {
      public static final axt<dvt.i> a = axt.a(MapCodec.unit(new dvt.i(0L)));
      private static final float e = -0.9F;
      private final elg f;

      public i(long $$0) {
         ayg $$1 = new dwa($$0);
         $$1.b(17292);
         this.f = new elg($$1);
      }

      private static float a(elg $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - axz.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = axz.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (axz.e((float)$$10) * 3439.0F + axz.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - axz.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = axz.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dvs.b $$0) {
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
      public axt<? extends dvs> c() {
         return a;
      }
   }

   @azc
   public static record j(iw<dvs> a) implements dvs {
      @Override
      public double a(dvs.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dvs.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dvs a(dvs.f $$0) {
         return $$0.apply(new dvt.j(new iw.a<>(this.a.a().a($$0))));
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
      public axt<? extends dvs> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public iw<dvs> j() {
         return this.a;
      }
   }

   protected static record k(dvt.k.a a, dvs e, double f, double g) implements dvt.p {
      public static dvt.k a(dvt.k.a $$0, dvs $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dvt.k.a.a && $$0 != dvt.k.a.b ? new dvt.k($$0, $$1, $$3, $$4) : new dvt.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dvt.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = axz.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dvt.k b(dvs.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public axt<? extends dvs> c() {
         return this.a.h;
      }

      public dvt.k.a k() {
         return this.a;
      }

      @Override
      public dvs aA_() {
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

      static enum a implements ayt {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final axt<dvt.k> h = dvt.a($$0x -> dvt.k.a(this, $$0x), dvt.k::aA_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dvt.l.a a, dvs e) implements dvt.m {
      @Override
      public double a(dvs.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dvs.a $$1) {
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
      public dvt.l.a j() {
         return this.a;
      }

      @Override
      public dvs k() {
         return this.e;
      }

      static enum a implements ayt {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final axt<dvt.m> g = dvt.a($$0x -> new dvt.l(this, $$0x), dvt.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dvs {
      dvt.l.a j();

      dvs k();

      @Override
      default axt<? extends dvs> c() {
         return this.j().g;
      }

      @Override
      default dvs a(dvs.f $$0) {
         return $$0.apply(new dvt.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dvt.n.a e, dvs f, double g, double h, double i) implements dvt.p, dvt.y {
      @Override
      public dvt.y.a j() {
         return this.e == dvt.n.a.a ? dvt.y.a.b : dvt.y.a.a;
      }

      @Override
      public dvs k() {
         return dvt.a(this.i);
      }

      @Override
      public dvs l() {
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
      public dvs a(dvs.f $$0) {
         dvs $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dvt.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dvt.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dvt.n.a m() {
         return this.e;
      }

      @Override
      public dvs aA_() {
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

   protected static record o(dvs.c f, @Deprecated double g, double h) implements dvs {
      public static final MapCodec<dvt.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dvs.c.a.fieldOf("noise").forGetter(dvt.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dvt.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dvt.o::l)
               )
               .apply($$0, dvt.o::new)
      );
      public static final axt<dvt.o> e = dvt.a(a);

      @Override
      public double a(dvs.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dvs.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dvs a(dvs.f $$0) {
         return $$0.apply(new dvt.o($$0.a(this.f), this.g, this.h));
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
      public axt<? extends dvs> c() {
         return e;
      }

      public dvs.c j() {
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

   interface p extends dvs {
      dvs aA_();

      @Override
      default double a(dvs.b $$0) {
         return this.a(this.aA_().a($$0));
      }

      @Override
      default void a(double[] $$0, dvs.a $$1) {
         this.aA_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dvs f, double g, double h, dvs i, dvs j) implements dvs {
      public static final MapCodec<dvt.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dvs.d.fieldOf("input").forGetter(dvt.q::j),
                  dvt.d.fieldOf("min_inclusive").forGetter(dvt.q::k),
                  dvt.d.fieldOf("max_exclusive").forGetter(dvt.q::l),
                  dvs.d.fieldOf("when_in_range").forGetter(dvt.q::m),
                  dvs.d.fieldOf("when_out_of_range").forGetter(dvt.q::n)
               )
               .apply($$0, dvt.q::new)
      );
      public static final axt<dvt.q> e = dvt.a(a);

      @Override
      public double a(dvs.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dvs.a $$1) {
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
      public dvs a(dvs.f $$0) {
         return $$0.apply(new dvt.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public axt<? extends dvs> c() {
         return e;
      }

      public dvs j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dvs m() {
         return this.i;
      }

      public dvs n() {
         return this.j;
      }
   }

   protected static record r(dvs.c a) implements dvt.u {
      static final axt<dvt.r> e = dvt.a(dvs.c.a, dvt.r::new, dvt.r::j);

      @Override
      public double a(dvs.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dvs a(dvs.f $$0) {
         return $$0.apply(new dvt.r($$0.a(this.a)));
      }

      @Override
      public axt<? extends dvs> c() {
         return e;
      }

      @Override
      public dvs.c j() {
         return this.a;
      }
   }

   protected static record s(dvs.c a) implements dvt.u {
      static final axt<dvt.s> e = dvt.a(dvs.c.a, dvt.s::new, dvt.s::j);

      @Override
      public double a(dvs.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dvs a(dvs.f $$0) {
         return $$0.apply(new dvt.s($$0.a(this.a)));
      }

      @Override
      public axt<? extends dvs> c() {
         return e;
      }

      @Override
      public dvs.c j() {
         return this.a;
      }
   }

   protected static record t(dvs.c a) implements dvt.u {
      static final axt<dvt.t> e = dvt.a(dvs.c.a, dvt.t::new, dvt.t::j);

      @Override
      public double a(dvs.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dvs a(dvs.f $$0) {
         return $$0.apply(new dvt.t($$0.a(this.a)));
      }

      @Override
      public axt<? extends dvs> c() {
         return e;
      }

      @Override
      public dvs.c j() {
         return this.a;
      }
   }

   interface u extends dvs {
      dvs.c j();

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
      default void a(double[] $$0, dvs.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dvs e, dvs f, dvs g, double h, double i, dvs.c j) implements dvs {
      private static final MapCodec<dvt.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dvs.d.fieldOf("shift_x").forGetter(dvt.v::j),
                  dvs.d.fieldOf("shift_y").forGetter(dvt.v::k),
                  dvs.d.fieldOf("shift_z").forGetter(dvt.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dvt.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dvt.v::n),
                  dvs.c.a.fieldOf("noise").forGetter(dvt.v::o)
               )
               .apply($$0, dvt.v::new)
      );
      public static final axt<dvt.v> a = dvt.a(k);

      @Override
      public double a(dvs.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dvs.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dvs a(dvs.f $$0) {
         return $$0.apply(new dvt.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public axt<? extends dvs> c() {
         return a;
      }

      public dvs j() {
         return this.e;
      }

      public dvs k() {
         return this.f;
      }

      public dvs l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dvs.c o() {
         return this.j;
      }
   }

   public static record w(axb<dvt.w.b, dvt.w.a> e) implements dvs {
      private static final Codec<axb<dvt.w.b, dvt.w.a>> f = axb.a(dvt.w.a.b);
      private static final MapCodec<dvt.w> g = f.fieldOf("spline").xmap(dvt.w::new, dvt.w::j);
      public static final axt<dvt.w> a = dvt.a(g);

      @Override
      public double a(dvs.b $$0) {
         return (double)this.e.a(new dvt.w.b($$0));
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
      public void a(double[] $$0, dvs.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dvs a(dvs.f $$0) {
         return $$0.apply(new dvt.w(this.e.a((axb.d<dvt.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public axt<? extends dvs> c() {
         return a;
      }

      public axb<dvt.w.b, dvt.w.a> j() {
         return this.e;
      }

      public static record a(iw<dvs> c) implements ayz<dvt.w.b> {
         public static final Codec<dvt.w.a> b = dvs.c.xmap(dvt.w.a::new, dvt.w.a::a);

         @Override
         public String toString() {
            Optional<akg<dvs>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               akg<dvs> $$1 = $$0.get();
               if ($$1 == dwg.d) {
                  return "continents";
               }

               if ($$1 == dwg.e) {
                  return "erosion";
               }

               if ($$1 == dwg.f) {
                  return "weirdness";
               }

               if ($$1 == dwg.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dvt.w.b $$0) {
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

         public dvt.w.a a(dvs.f $$0) {
            return new dvt.w.a(new iw.a<>(this.c.a().a($$0)));
         }

         public iw<dvs> a() {
            return this.c;
         }
      }

      public static record b(dvs.b a) {
      }
   }

   interface x extends dvs {
      dvs j();

      @Override
      default double a(dvs.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dvs.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dvs.b var1, double var2);
   }

   interface y extends dvs {
      Logger a = LogUtils.getLogger();

      static dvt.y a(dvt.y.a $$0, dvs $$1, dvs $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dvt.y.a.c || $$0 == dvt.y.a.d) {
            boolean $$7 = $$3 >= $$6;
            boolean $$8 = $$4 >= $$5;
            if ($$7 || $$8) {
               a.warn("Creating a " + $$0 + " function between two non-overlapping inputs: " + $$1 + " and " + $$2);
            }
         }
         double $$9 = switch ($$0) {
            case a -> $$3 + $$4;
            case d -> Math.max($$3, $$4);
            case c -> Math.min($$3, $$4);
            case b -> $$3 > 0.0 && $$4 > 0.0 ? $$3 * $$4 : ($$5 < 0.0 && $$6 < 0.0 ? $$5 * $$6 : Math.min($$3 * $$6, $$5 * $$4));
         };

         double $$10 = switch ($$0) {
            case a -> $$5 + $$6;
            case d -> Math.max($$5, $$6);
            case c -> Math.min($$5, $$6);
            case b -> $$3 > 0.0 && $$4 > 0.0 ? $$5 * $$6 : ($$5 < 0.0 && $$6 < 0.0 ? $$3 * $$4 : Math.max($$3 * $$4, $$5 * $$6));
         };
         if ($$0 == dvt.y.a.b || $$0 == dvt.y.a.a) {
            if ($$1 instanceof dvt.h $$11) {
               return new dvt.n($$0 == dvt.y.a.a ? dvt.n.a.b : dvt.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dvt.h $$12) {
               return new dvt.n($$0 == dvt.y.a.a ? dvt.n.a.b : dvt.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dvt.a($$0, $$1, $$2, $$9, $$10);
      }

      dvt.y.a j();

      dvs k();

      dvs l();

      @Override
      default axt<? extends dvs> c() {
         return this.j().e;
      }

      public static enum a implements ayt {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final axt<dvt.y> e = dvt.a((BiFunction<dvs, dvs, dvt.y>)(($$0x, $$1) -> dvt.y.a(this, $$0x, $$1)), dvt.y::k, dvt.y::l);
         private final String f;

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   protected static record z(dvs e, dvs.c f, dvt.z.a g) implements dvt.x {
      private static final MapCodec<dvt.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dvs.d.fieldOf("input").forGetter(dvt.z::j),
                  dvs.c.a.fieldOf("noise").forGetter(dvt.z::k),
                  dvt.z.a.c.fieldOf("rarity_value_mapper").forGetter(dvt.z::l)
               )
               .apply($$0, dvt.z::new)
      );
      public static final axt<dvt.z> a = dvt.a(h);

      @Override
      public double a(dvs.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dvs a(dvs.f $$0) {
         return $$0.apply(new dvt.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public axt<? extends dvs> c() {
         return a;
      }

      @Override
      public dvs j() {
         return this.e;
      }

      public dvs.c k() {
         return this.f;
      }

      public dvt.z.a l() {
         return this.g;
      }

      public static enum a implements ayt {
         a("type_1", dwg.a::b, 2.0),
         b("type_2", dwg.a::a, 3.0);

         public static final Codec<dvt.z.a> c = ayt.a(dvt.z.a::values);
         private final String d;
         final Double2DoubleFunction e;
         final double f;

         private a(String $$0, Double2DoubleFunction $$1, double $$2) {
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
