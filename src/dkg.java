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

public final class dkg {
   private static final Codec<dkf> c = jb.ag.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dkf> b = Codec.either(d, c)
      .xmap($$0 -> (dkf)$$0.map(dkg::a, Function.identity()), $$0 -> $$0 instanceof dkg.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dkf> a(hq<Codec<? extends dkf>> $$0) {
      a($$0, "blend_alpha", dkg.d.e);
      a($$0, "blend_offset", dkg.f.e);
      a($$0, "beardifier", dkg.b.e);
      a($$0, "old_blended_noise", dzg.a);

      for (dkg.l.a $$1 : dkg.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dkg.o.e);
      a($$0, "end_islands", dkg.i.a);
      a($$0, "weird_scaled_sampler", dkg.z.a);
      a($$0, "shifted_noise", dkg.v.a);
      a($$0, "range_choice", dkg.q.e);
      a($$0, "shift_a", dkg.s.e);
      a($$0, "shift_b", dkg.t.e);
      a($$0, "shift", dkg.r.e);
      a($$0, "blend_density", dkg.e.e);
      a($$0, "clamp", dkg.g.a);

      for (dkg.k.a $$2 : dkg.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dkg.y.a $$3 : dkg.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dkg.w.a);
      a($$0, "constant", dkg.h.e);
      return a($$0, "y_clamped_gradient", dkg.aa.a);
   }

   private static Codec<? extends dkf> a(hq<Codec<? extends dkf>> $$0, String $$1, arv<? extends dkf> $$2) {
      return hq.a($$0, $$1, $$2.a());
   }

   static <A, O> arv<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return arv.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> arv<O> a(Function<dkf, O> $$0, Function<O, dkf> $$1) {
      return a(dkf.d, $$0, $$1);
   }

   static <O> arv<O> a(BiFunction<dkf, dkf, O> $$0, Function<O, dkf> $$1, Function<O, dkf> $$2) {
      return arv.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dkf.d.fieldOf("argument1").forGetter($$1), dkf.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> arv<O> a(MapCodec<O> $$0) {
      return arv.a($$0);
   }

   private dkg() {
   }

   public static dkf a(dkf $$0) {
      return new dkg.l(dkg.l.a.a, $$0);
   }

   public static dkf b(dkf $$0) {
      return new dkg.l(dkg.l.a.b, $$0);
   }

   public static dkf c(dkf $$0) {
      return new dkg.l(dkg.l.a.c, $$0);
   }

   public static dkf d(dkf $$0) {
      return new dkg.l(dkg.l.a.d, $$0);
   }

   public static dkf e(dkf $$0) {
      return new dkg.l(dkg.l.a.e, $$0);
   }

   public static dkf a(he<dzj.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dkg.o(new dkf.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dkf a(he<dzj.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dkf a(he<dzj.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dkf a(dkf $$0, dkf $$1, double $$2, he<dzj.a> $$3) {
      return new dkg.v($$0, a(), $$1, $$2, 0.0, new dkf.c($$3));
   }

   public static dkf a(he<dzj.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dkf b(he<dzj.a> $$0, double $$1, double $$2) {
      return new dkg.o(new dkf.c($$0), $$1, $$2);
   }

   public static dkf a(he<dzj.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dkf a(dkf $$0, double $$1, double $$2, dkf $$3, dkf $$4) {
      return new dkg.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dkf b(he<dzj.a> $$0) {
      return new dkg.s(new dkf.c($$0));
   }

   public static dkf c(he<dzj.a> $$0) {
      return new dkg.t(new dkf.c($$0));
   }

   public static dkf d(he<dzj.a> $$0) {
      return new dkg.r(new dkf.c($$0));
   }

   public static dkf f(dkf $$0) {
      return new dkg.e($$0);
   }

   public static dkf a(long $$0) {
      return new dkg.i($$0);
   }

   public static dkf a(dkf $$0, he<dzj.a> $$1, dkg.z.a $$2) {
      return new dkg.z($$0, new dkf.c($$1), $$2);
   }

   public static dkf a(dkf $$0, dkf $$1) {
      return dkg.y.a(dkg.y.a.a, $$0, $$1);
   }

   public static dkf b(dkf $$0, dkf $$1) {
      return dkg.y.a(dkg.y.a.b, $$0, $$1);
   }

   public static dkf c(dkf $$0, dkf $$1) {
      return dkg.y.a(dkg.y.a.c, $$0, $$1);
   }

   public static dkf d(dkf $$0, dkf $$1) {
      return dkg.y.a(dkg.y.a.d, $$0, $$1);
   }

   public static dkf a(are<dkg.w.b, dkg.w.a> $$0) {
      return new dkg.w($$0);
   }

   public static dkf a() {
      return dkg.h.f;
   }

   public static dkf a(double $$0) {
      return new dkg.h($$0);
   }

   public static dkf a(int $$0, int $$1, double $$2, double $$3) {
      return new dkg.aa($$0, $$1, $$2, $$3);
   }

   public static dkf a(dkf $$0, dkg.k.a $$1) {
      return dkg.k.a($$1, $$0);
   }

   private static dkf a(dkf $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dkf b() {
      return dkg.d.a;
   }

   public static dkf c() {
      return dkg.f.a;
   }

   public static dkf a(dkf $$0, dkf $$1, dkf $$2) {
      if ($$1 instanceof dkg.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dkf $$4 = d($$0);
         dkf $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dkf a(dkf $$0, double $$1, dkf $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dkg.y.a e, dkf f, dkf g, double h, double i) implements dkg.y {
      @Override
      public double a(dkf.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dkf.a $$1) {
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
      public dkf a(dkf.f $$0) {
         return $$0.apply(dkg.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dkg.y.a j() {
         return this.e;
      }

      @Override
      public dkf k() {
         return this.f;
      }

      @Override
      public dkf l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dkf.d {
      private static final MapCodec<dkg.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dim.e * 2, dim.d * 2).fieldOf("from_y").forGetter(dkg.aa::j),
                  Codec.intRange(dim.e * 2, dim.d * 2).fieldOf("to_y").forGetter(dkg.aa::k),
                  dkg.d.fieldOf("from_value").forGetter(dkg.aa::l),
                  dkg.d.fieldOf("to_value").forGetter(dkg.aa::m)
               )
               .apply($$0, dkg.aa::new)
      );
      public static final arv<dkg.aa> a = dkg.a(i);

      @Override
      public double a(dkf.b $$0) {
         return asb.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public arv<? extends dkf> c() {
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

   protected static enum b implements dkg.c {
      a;

      @Override
      public double a(dkf.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dkf.a $$1) {
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

   public interface c extends dkf.d {
      arv<dkf> e = arv.a(MapCodec.unit(dkg.b.a));

      @Override
      default arv<? extends dkf> c() {
         return e;
      }
   }

   protected static enum d implements dkf.d {
      a;

      public static final arv<dkf> e = arv.a(MapCodec.unit(a));

      @Override
      public double a(dkf.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dkf.a $$1) {
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
      public arv<? extends dkf> c() {
         return e;
      }
   }

   static record e(dkf a) implements dkg.x {
      static final arv<dkg.e> e = dkg.a(dkg.e::new, dkg.e::j);

      @Override
      public double a(dkf.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dkf a(dkf.f $$0) {
         return $$0.apply(new dkg.e(this.a.a($$0)));
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
      public arv<? extends dkf> c() {
         return e;
      }

      @Override
      public dkf j() {
         return this.a;
      }
   }

   protected static enum f implements dkf.d {
      a;

      public static final arv<dkf> e = arv.a(MapCodec.unit(a));

      @Override
      public double a(dkf.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dkf.a $$1) {
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
      public arv<? extends dkf> c() {
         return e;
      }
   }

   protected static record g(dkf e, double f, double g) implements dkg.p {
      private static final MapCodec<dkg.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dkf.b.fieldOf("input").forGetter(dkg.g::aw_), dkg.d.fieldOf("min").forGetter(dkg.g::a), dkg.d.fieldOf("max").forGetter(dkg.g::b))
               .apply($$0, dkg.g::new)
      );
      public static final arv<dkg.g> a = dkg.a(h);

      @Override
      public double a(double $$0) {
         return asb.a($$0, this.f, this.g);
      }

      @Override
      public dkf a(dkf.f $$0) {
         return new dkg.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public arv<? extends dkf> c() {
         return a;
      }

      @Override
      public dkf aw_() {
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

   static record h(double a) implements dkf.d {
      static final arv<dkg.h> e = dkg.a(dkg.d, dkg.h::new, dkg.h::j);
      static final dkg.h f = new dkg.h(0.0);

      @Override
      public void a(double[] $$0, dkf.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public arv<? extends dkf> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dkf.d {
      public static final arv<dkg.i> a = arv.a(MapCodec.unit(new dkg.i(0L)));
      private static final float e = -0.9F;
      private final dzm f;

      public i(long $$0) {
         ash $$1 = new dkn($$0);
         $$1.b(17292);
         this.f = new dzm($$1);
      }

      private static float a(dzm $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - asb.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = asb.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (asb.e((float)$$10) * 3439.0F + asb.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - asb.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = asb.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dkf.b $$0) {
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
      public arv<? extends dkf> c() {
         return a;
      }
   }

   @atd
   public static record j(he<dkf> a) implements dkf {
      @Override
      public double a(dkf.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dkf.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dkf a(dkf.f $$0) {
         return $$0.apply(new dkg.j(new he.a<>(this.a.a().a($$0))));
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
      public arv<? extends dkf> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public he<dkf> j() {
         return this.a;
      }
   }

   protected static record k(dkg.k.a a, dkf e, double f, double g) implements dkg.p {
      public static dkg.k a(dkg.k.a $$0, dkf $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dkg.k.a.a && $$0 != dkg.k.a.b ? new dkg.k($$0, $$1, $$3, $$4) : new dkg.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dkg.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = asb.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dkg.k b(dkf.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public arv<? extends dkf> c() {
         return this.a.h;
      }

      public dkg.k.a k() {
         return this.a;
      }

      @Override
      public dkf aw_() {
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

      static enum a implements asu {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final arv<dkg.k> h = dkg.a($$0x -> dkg.k.a(this, $$0x), dkg.k::aw_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dkg.l.a a, dkf e) implements dkg.m {
      @Override
      public double a(dkf.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dkf.a $$1) {
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
      public dkg.l.a j() {
         return this.a;
      }

      @Override
      public dkf k() {
         return this.e;
      }

      static enum a implements asu {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final arv<dkg.m> g = dkg.a($$0x -> new dkg.l(this, $$0x), dkg.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dkf {
      dkg.l.a j();

      dkf k();

      @Override
      default arv<? extends dkf> c() {
         return this.j().g;
      }

      @Override
      default dkf a(dkf.f $$0) {
         return $$0.apply(new dkg.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dkg.n.a e, dkf f, double g, double h, double i) implements dkg.p, dkg.y {
      @Override
      public dkg.y.a j() {
         return this.e == dkg.n.a.a ? dkg.y.a.b : dkg.y.a.a;
      }

      @Override
      public dkf k() {
         return dkg.a(this.i);
      }

      @Override
      public dkf l() {
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
      public dkf a(dkf.f $$0) {
         dkf $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dkg.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dkg.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dkg.n.a m() {
         return this.e;
      }

      @Override
      public dkf aw_() {
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

   protected static record o(dkf.c f, @Deprecated double g, double h) implements dkf {
      public static final MapCodec<dkg.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkf.c.a.fieldOf("noise").forGetter(dkg.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dkg.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dkg.o::l)
               )
               .apply($$0, dkg.o::new)
      );
      public static final arv<dkg.o> e = dkg.a(a);

      @Override
      public double a(dkf.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dkf.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkf a(dkf.f $$0) {
         return $$0.apply(new dkg.o($$0.a(this.f), this.g, this.h));
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
      public arv<? extends dkf> c() {
         return e;
      }

      public dkf.c j() {
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

   interface p extends dkf {
      dkf aw_();

      @Override
      default double a(dkf.b $$0) {
         return this.a(this.aw_().a($$0));
      }

      @Override
      default void a(double[] $$0, dkf.a $$1) {
         this.aw_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dkf f, double g, double h, dkf i, dkf j) implements dkf {
      public static final MapCodec<dkg.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkf.d.fieldOf("input").forGetter(dkg.q::j),
                  dkg.d.fieldOf("min_inclusive").forGetter(dkg.q::k),
                  dkg.d.fieldOf("max_exclusive").forGetter(dkg.q::l),
                  dkf.d.fieldOf("when_in_range").forGetter(dkg.q::m),
                  dkf.d.fieldOf("when_out_of_range").forGetter(dkg.q::n)
               )
               .apply($$0, dkg.q::new)
      );
      public static final arv<dkg.q> e = dkg.a(a);

      @Override
      public double a(dkf.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dkf.a $$1) {
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
      public dkf a(dkf.f $$0) {
         return $$0.apply(new dkg.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public arv<? extends dkf> c() {
         return e;
      }

      public dkf j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dkf m() {
         return this.i;
      }

      public dkf n() {
         return this.j;
      }
   }

   protected static record r(dkf.c a) implements dkg.u {
      static final arv<dkg.r> e = dkg.a(dkf.c.a, dkg.r::new, dkg.r::j);

      @Override
      public double a(dkf.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dkf a(dkf.f $$0) {
         return $$0.apply(new dkg.r($$0.a(this.a)));
      }

      @Override
      public arv<? extends dkf> c() {
         return e;
      }

      @Override
      public dkf.c j() {
         return this.a;
      }
   }

   protected static record s(dkf.c a) implements dkg.u {
      static final arv<dkg.s> e = dkg.a(dkf.c.a, dkg.s::new, dkg.s::j);

      @Override
      public double a(dkf.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dkf a(dkf.f $$0) {
         return $$0.apply(new dkg.s($$0.a(this.a)));
      }

      @Override
      public arv<? extends dkf> c() {
         return e;
      }

      @Override
      public dkf.c j() {
         return this.a;
      }
   }

   protected static record t(dkf.c a) implements dkg.u {
      static final arv<dkg.t> e = dkg.a(dkf.c.a, dkg.t::new, dkg.t::j);

      @Override
      public double a(dkf.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dkf a(dkf.f $$0) {
         return $$0.apply(new dkg.t($$0.a(this.a)));
      }

      @Override
      public arv<? extends dkf> c() {
         return e;
      }

      @Override
      public dkf.c j() {
         return this.a;
      }
   }

   interface u extends dkf {
      dkf.c j();

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
      default void a(double[] $$0, dkf.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dkf e, dkf f, dkf g, double h, double i, dkf.c j) implements dkf {
      private static final MapCodec<dkg.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkf.d.fieldOf("shift_x").forGetter(dkg.v::j),
                  dkf.d.fieldOf("shift_y").forGetter(dkg.v::k),
                  dkf.d.fieldOf("shift_z").forGetter(dkg.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dkg.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dkg.v::n),
                  dkf.c.a.fieldOf("noise").forGetter(dkg.v::o)
               )
               .apply($$0, dkg.v::new)
      );
      public static final arv<dkg.v> a = dkg.a(k);

      @Override
      public double a(dkf.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dkf.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkf a(dkf.f $$0) {
         return $$0.apply(new dkg.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public arv<? extends dkf> c() {
         return a;
      }

      public dkf j() {
         return this.e;
      }

      public dkf k() {
         return this.f;
      }

      public dkf l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dkf.c o() {
         return this.j;
      }
   }

   public static record w(are<dkg.w.b, dkg.w.a> e) implements dkf {
      private static final Codec<are<dkg.w.b, dkg.w.a>> f = are.a(dkg.w.a.b);
      private static final MapCodec<dkg.w> g = f.fieldOf("spline").xmap(dkg.w::new, dkg.w::j);
      public static final arv<dkg.w> a = dkg.a(g);

      @Override
      public double a(dkf.b $$0) {
         return (double)this.e.a(new dkg.w.b($$0));
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
      public void a(double[] $$0, dkf.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkf a(dkf.f $$0) {
         return $$0.apply(new dkg.w(this.e.a((are.d<dkg.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public arv<? extends dkf> c() {
         return a;
      }

      public are<dkg.w.b, dkg.w.a> j() {
         return this.e;
      }

      public static record a(he<dkf> c) implements ata<dkg.w.b> {
         public static final Codec<dkg.w.a> b = dkf.c.xmap(dkg.w.a::new, dkg.w.a::a);

         @Override
         public String toString() {
            Optional<aey<dkf>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               aey<dkf> $$1 = $$0.get();
               if ($$1 == dkt.d) {
                  return "continents";
               }

               if ($$1 == dkt.e) {
                  return "erosion";
               }

               if ($$1 == dkt.f) {
                  return "weirdness";
               }

               if ($$1 == dkt.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dkg.w.b $$0) {
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

         public dkg.w.a a(dkf.f $$0) {
            return new dkg.w.a(new he.a<>(this.c.a().a($$0)));
         }

         public he<dkf> a() {
            return this.c;
         }
      }

      public static record b(dkf.b a) {
      }
   }

   interface x extends dkf {
      dkf j();

      @Override
      default double a(dkf.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dkf.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dkf.b var1, double var2);
   }

   interface y extends dkf {
      Logger a = LogUtils.getLogger();

      static dkg.y a(dkg.y.a $$0, dkf $$1, dkf $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dkg.y.a.c || $$0 == dkg.y.a.d) {
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
         if ($$0 == dkg.y.a.b || $$0 == dkg.y.a.a) {
            if ($$1 instanceof dkg.h $$11) {
               return new dkg.n($$0 == dkg.y.a.a ? dkg.n.a.b : dkg.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dkg.h $$12) {
               return new dkg.n($$0 == dkg.y.a.a ? dkg.n.a.b : dkg.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dkg.a($$0, $$1, $$2, $$9, $$10);
      }

      dkg.y.a j();

      dkf k();

      dkf l();

      @Override
      default arv<? extends dkf> c() {
         return this.j().e;
      }

      public static enum a implements asu {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final arv<dkg.y> e = dkg.a((BiFunction<dkf, dkf, dkg.y>)(($$0x, $$1) -> dkg.y.a(this, $$0x, $$1)), dkg.y::k, dkg.y::l);
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

   protected static record z(dkf e, dkf.c f, dkg.z.a g) implements dkg.x {
      private static final MapCodec<dkg.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkf.d.fieldOf("input").forGetter(dkg.z::j),
                  dkf.c.a.fieldOf("noise").forGetter(dkg.z::k),
                  dkg.z.a.c.fieldOf("rarity_value_mapper").forGetter(dkg.z::l)
               )
               .apply($$0, dkg.z::new)
      );
      public static final arv<dkg.z> a = dkg.a(h);

      @Override
      public double a(dkf.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dkf a(dkf.f $$0) {
         return $$0.apply(new dkg.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public arv<? extends dkf> c() {
         return a;
      }

      @Override
      public dkf j() {
         return this.e;
      }

      public dkf.c k() {
         return this.f;
      }

      public dkg.z.a l() {
         return this.g;
      }

      public static enum a implements asu {
         a("type_1", dkt.a::b, 2.0),
         b("type_2", dkt.a::a, 3.0);

         public static final Codec<dkg.z.a> c = asu.a(dkg.z.a::values);
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
