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

public final class dkd {
   private static final Codec<dkc> c = jb.ag.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dkc> b = Codec.either(d, c)
      .xmap($$0 -> (dkc)$$0.map(dkd::a, Function.identity()), $$0 -> $$0 instanceof dkd.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dkc> a(hr<Codec<? extends dkc>> $$0) {
      a($$0, "blend_alpha", dkd.d.e);
      a($$0, "blend_offset", dkd.f.e);
      a($$0, "beardifier", dkd.b.e);
      a($$0, "old_blended_noise", dzd.a);

      for (dkd.l.a $$1 : dkd.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dkd.o.e);
      a($$0, "end_islands", dkd.i.a);
      a($$0, "weird_scaled_sampler", dkd.z.a);
      a($$0, "shifted_noise", dkd.v.a);
      a($$0, "range_choice", dkd.q.e);
      a($$0, "shift_a", dkd.s.e);
      a($$0, "shift_b", dkd.t.e);
      a($$0, "shift", dkd.r.e);
      a($$0, "blend_density", dkd.e.e);
      a($$0, "clamp", dkd.g.a);

      for (dkd.k.a $$2 : dkd.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dkd.y.a $$3 : dkd.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dkd.w.a);
      a($$0, "constant", dkd.h.e);
      return a($$0, "y_clamped_gradient", dkd.aa.a);
   }

   private static Codec<? extends dkc> a(hr<Codec<? extends dkc>> $$0, String $$1, arj<? extends dkc> $$2) {
      return hr.a($$0, $$1, $$2.a());
   }

   static <A, O> arj<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return arj.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> arj<O> a(Function<dkc, O> $$0, Function<O, dkc> $$1) {
      return a(dkc.d, $$0, $$1);
   }

   static <O> arj<O> a(BiFunction<dkc, dkc, O> $$0, Function<O, dkc> $$1, Function<O, dkc> $$2) {
      return arj.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dkc.d.fieldOf("argument1").forGetter($$1), dkc.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> arj<O> a(MapCodec<O> $$0) {
      return arj.a($$0);
   }

   private dkd() {
   }

   public static dkc a(dkc $$0) {
      return new dkd.l(dkd.l.a.a, $$0);
   }

   public static dkc b(dkc $$0) {
      return new dkd.l(dkd.l.a.b, $$0);
   }

   public static dkc c(dkc $$0) {
      return new dkd.l(dkd.l.a.c, $$0);
   }

   public static dkc d(dkc $$0) {
      return new dkd.l(dkd.l.a.d, $$0);
   }

   public static dkc e(dkc $$0) {
      return new dkd.l(dkd.l.a.e, $$0);
   }

   public static dkc a(he<dzg.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dkd.o(new dkc.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dkc a(he<dzg.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dkc a(he<dzg.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dkc a(dkc $$0, dkc $$1, double $$2, he<dzg.a> $$3) {
      return new dkd.v($$0, a(), $$1, $$2, 0.0, new dkc.c($$3));
   }

   public static dkc a(he<dzg.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dkc b(he<dzg.a> $$0, double $$1, double $$2) {
      return new dkd.o(new dkc.c($$0), $$1, $$2);
   }

   public static dkc a(he<dzg.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dkc a(dkc $$0, double $$1, double $$2, dkc $$3, dkc $$4) {
      return new dkd.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dkc b(he<dzg.a> $$0) {
      return new dkd.s(new dkc.c($$0));
   }

   public static dkc c(he<dzg.a> $$0) {
      return new dkd.t(new dkc.c($$0));
   }

   public static dkc d(he<dzg.a> $$0) {
      return new dkd.r(new dkc.c($$0));
   }

   public static dkc f(dkc $$0) {
      return new dkd.e($$0);
   }

   public static dkc a(long $$0) {
      return new dkd.i($$0);
   }

   public static dkc a(dkc $$0, he<dzg.a> $$1, dkd.z.a $$2) {
      return new dkd.z($$0, new dkc.c($$1), $$2);
   }

   public static dkc a(dkc $$0, dkc $$1) {
      return dkd.y.a(dkd.y.a.a, $$0, $$1);
   }

   public static dkc b(dkc $$0, dkc $$1) {
      return dkd.y.a(dkd.y.a.b, $$0, $$1);
   }

   public static dkc c(dkc $$0, dkc $$1) {
      return dkd.y.a(dkd.y.a.c, $$0, $$1);
   }

   public static dkc d(dkc $$0, dkc $$1) {
      return dkd.y.a(dkd.y.a.d, $$0, $$1);
   }

   public static dkc a(aqt<dkd.w.b, dkd.w.a> $$0) {
      return new dkd.w($$0);
   }

   public static dkc a() {
      return dkd.h.f;
   }

   public static dkc a(double $$0) {
      return new dkd.h($$0);
   }

   public static dkc a(int $$0, int $$1, double $$2, double $$3) {
      return new dkd.aa($$0, $$1, $$2, $$3);
   }

   public static dkc a(dkc $$0, dkd.k.a $$1) {
      return dkd.k.a($$1, $$0);
   }

   private static dkc a(dkc $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dkc b() {
      return dkd.d.a;
   }

   public static dkc c() {
      return dkd.f.a;
   }

   public static dkc a(dkc $$0, dkc $$1, dkc $$2) {
      if ($$1 instanceof dkd.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dkc $$4 = d($$0);
         dkc $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dkc a(dkc $$0, double $$1, dkc $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dkd.y.a e, dkc f, dkc g, double h, double i) implements dkd.y {
      @Override
      public double a(dkc.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dkc.a $$1) {
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
      public dkc a(dkc.f $$0) {
         return $$0.apply(dkd.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dkd.y.a j() {
         return this.e;
      }

      @Override
      public dkc k() {
         return this.f;
      }

      @Override
      public dkc l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dkc.d {
      private static final MapCodec<dkd.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dij.e * 2, dij.d * 2).fieldOf("from_y").forGetter(dkd.aa::j),
                  Codec.intRange(dij.e * 2, dij.d * 2).fieldOf("to_y").forGetter(dkd.aa::k),
                  dkd.d.fieldOf("from_value").forGetter(dkd.aa::l),
                  dkd.d.fieldOf("to_value").forGetter(dkd.aa::m)
               )
               .apply($$0, dkd.aa::new)
      );
      public static final arj<dkd.aa> a = dkd.a(i);

      @Override
      public double a(dkc.b $$0) {
         return arp.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public arj<? extends dkc> c() {
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

   protected static enum b implements dkd.c {
      a;

      @Override
      public double a(dkc.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dkc.a $$1) {
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

   public interface c extends dkc.d {
      arj<dkc> e = arj.a(MapCodec.unit(dkd.b.a));

      @Override
      default arj<? extends dkc> c() {
         return e;
      }
   }

   protected static enum d implements dkc.d {
      a;

      public static final arj<dkc> e = arj.a(MapCodec.unit(a));

      @Override
      public double a(dkc.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dkc.a $$1) {
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
      public arj<? extends dkc> c() {
         return e;
      }
   }

   static record e(dkc a) implements dkd.x {
      static final arj<dkd.e> e = dkd.a(dkd.e::new, dkd.e::j);

      @Override
      public double a(dkc.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dkc a(dkc.f $$0) {
         return $$0.apply(new dkd.e(this.a.a($$0)));
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
      public arj<? extends dkc> c() {
         return e;
      }

      @Override
      public dkc j() {
         return this.a;
      }
   }

   protected static enum f implements dkc.d {
      a;

      public static final arj<dkc> e = arj.a(MapCodec.unit(a));

      @Override
      public double a(dkc.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dkc.a $$1) {
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
      public arj<? extends dkc> c() {
         return e;
      }
   }

   protected static record g(dkc e, double f, double g) implements dkd.p {
      private static final MapCodec<dkd.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dkc.b.fieldOf("input").forGetter(dkd.g::as_), dkd.d.fieldOf("min").forGetter(dkd.g::a), dkd.d.fieldOf("max").forGetter(dkd.g::b))
               .apply($$0, dkd.g::new)
      );
      public static final arj<dkd.g> a = dkd.a(h);

      @Override
      public double a(double $$0) {
         return arp.a($$0, this.f, this.g);
      }

      @Override
      public dkc a(dkc.f $$0) {
         return new dkd.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public arj<? extends dkc> c() {
         return a;
      }

      @Override
      public dkc as_() {
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

   static record h(double a) implements dkc.d {
      static final arj<dkd.h> e = dkd.a(dkd.d, dkd.h::new, dkd.h::j);
      static final dkd.h f = new dkd.h(0.0);

      @Override
      public void a(double[] $$0, dkc.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public arj<? extends dkc> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dkc.d {
      public static final arj<dkd.i> a = arj.a(MapCodec.unit(new dkd.i(0L)));
      private static final float e = -0.9F;
      private final dzj f;

      public i(long $$0) {
         aru $$1 = new dkk($$0);
         $$1.b(17292);
         this.f = new dzj($$1);
      }

      private static float a(dzj $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - arp.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = arp.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (arp.e((float)$$10) * 3439.0F + arp.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - arp.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = arp.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dkc.b $$0) {
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
      public arj<? extends dkc> c() {
         return a;
      }
   }

   @asq
   public static record j(he<dkc> a) implements dkc {
      @Override
      public double a(dkc.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dkc.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dkc a(dkc.f $$0) {
         return $$0.apply(new dkd.j(new he.a<>(this.a.a().a($$0))));
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
      public arj<? extends dkc> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public he<dkc> j() {
         return this.a;
      }
   }

   protected static record k(dkd.k.a a, dkc e, double f, double g) implements dkd.p {
      public static dkd.k a(dkd.k.a $$0, dkc $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dkd.k.a.a && $$0 != dkd.k.a.b ? new dkd.k($$0, $$1, $$3, $$4) : new dkd.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dkd.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = arp.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dkd.k b(dkc.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public arj<? extends dkc> c() {
         return this.a.h;
      }

      public dkd.k.a k() {
         return this.a;
      }

      @Override
      public dkc as_() {
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

      static enum a implements ash {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final arj<dkd.k> h = dkd.a($$0x -> dkd.k.a(this, $$0x), dkd.k::as_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dkd.l.a a, dkc e) implements dkd.m {
      @Override
      public double a(dkc.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dkc.a $$1) {
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
      public dkd.l.a j() {
         return this.a;
      }

      @Override
      public dkc k() {
         return this.e;
      }

      static enum a implements ash {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final arj<dkd.m> g = dkd.a($$0x -> new dkd.l(this, $$0x), dkd.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dkc {
      dkd.l.a j();

      dkc k();

      @Override
      default arj<? extends dkc> c() {
         return this.j().g;
      }

      @Override
      default dkc a(dkc.f $$0) {
         return $$0.apply(new dkd.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dkd.n.a e, dkc f, double g, double h, double i) implements dkd.p, dkd.y {
      @Override
      public dkd.y.a j() {
         return this.e == dkd.n.a.a ? dkd.y.a.b : dkd.y.a.a;
      }

      @Override
      public dkc k() {
         return dkd.a(this.i);
      }

      @Override
      public dkc l() {
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
      public dkc a(dkc.f $$0) {
         dkc $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dkd.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dkd.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dkd.n.a m() {
         return this.e;
      }

      @Override
      public dkc as_() {
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

   protected static record o(dkc.c f, @Deprecated double g, double h) implements dkc {
      public static final MapCodec<dkd.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkc.c.a.fieldOf("noise").forGetter(dkd.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dkd.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dkd.o::l)
               )
               .apply($$0, dkd.o::new)
      );
      public static final arj<dkd.o> e = dkd.a(a);

      @Override
      public double a(dkc.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dkc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkc a(dkc.f $$0) {
         return $$0.apply(new dkd.o($$0.a(this.f), this.g, this.h));
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
      public arj<? extends dkc> c() {
         return e;
      }

      public dkc.c j() {
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

   interface p extends dkc {
      dkc as_();

      @Override
      default double a(dkc.b $$0) {
         return this.a(this.as_().a($$0));
      }

      @Override
      default void a(double[] $$0, dkc.a $$1) {
         this.as_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dkc f, double g, double h, dkc i, dkc j) implements dkc {
      public static final MapCodec<dkd.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkc.d.fieldOf("input").forGetter(dkd.q::j),
                  dkd.d.fieldOf("min_inclusive").forGetter(dkd.q::k),
                  dkd.d.fieldOf("max_exclusive").forGetter(dkd.q::l),
                  dkc.d.fieldOf("when_in_range").forGetter(dkd.q::m),
                  dkc.d.fieldOf("when_out_of_range").forGetter(dkd.q::n)
               )
               .apply($$0, dkd.q::new)
      );
      public static final arj<dkd.q> e = dkd.a(a);

      @Override
      public double a(dkc.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dkc.a $$1) {
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
      public dkc a(dkc.f $$0) {
         return $$0.apply(new dkd.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public arj<? extends dkc> c() {
         return e;
      }

      public dkc j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dkc m() {
         return this.i;
      }

      public dkc n() {
         return this.j;
      }
   }

   protected static record r(dkc.c a) implements dkd.u {
      static final arj<dkd.r> e = dkd.a(dkc.c.a, dkd.r::new, dkd.r::j);

      @Override
      public double a(dkc.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dkc a(dkc.f $$0) {
         return $$0.apply(new dkd.r($$0.a(this.a)));
      }

      @Override
      public arj<? extends dkc> c() {
         return e;
      }

      @Override
      public dkc.c j() {
         return this.a;
      }
   }

   protected static record s(dkc.c a) implements dkd.u {
      static final arj<dkd.s> e = dkd.a(dkc.c.a, dkd.s::new, dkd.s::j);

      @Override
      public double a(dkc.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dkc a(dkc.f $$0) {
         return $$0.apply(new dkd.s($$0.a(this.a)));
      }

      @Override
      public arj<? extends dkc> c() {
         return e;
      }

      @Override
      public dkc.c j() {
         return this.a;
      }
   }

   protected static record t(dkc.c a) implements dkd.u {
      static final arj<dkd.t> e = dkd.a(dkc.c.a, dkd.t::new, dkd.t::j);

      @Override
      public double a(dkc.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dkc a(dkc.f $$0) {
         return $$0.apply(new dkd.t($$0.a(this.a)));
      }

      @Override
      public arj<? extends dkc> c() {
         return e;
      }

      @Override
      public dkc.c j() {
         return this.a;
      }
   }

   interface u extends dkc {
      dkc.c j();

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
      default void a(double[] $$0, dkc.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dkc e, dkc f, dkc g, double h, double i, dkc.c j) implements dkc {
      private static final MapCodec<dkd.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkc.d.fieldOf("shift_x").forGetter(dkd.v::j),
                  dkc.d.fieldOf("shift_y").forGetter(dkd.v::k),
                  dkc.d.fieldOf("shift_z").forGetter(dkd.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dkd.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dkd.v::n),
                  dkc.c.a.fieldOf("noise").forGetter(dkd.v::o)
               )
               .apply($$0, dkd.v::new)
      );
      public static final arj<dkd.v> a = dkd.a(k);

      @Override
      public double a(dkc.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dkc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkc a(dkc.f $$0) {
         return $$0.apply(new dkd.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public arj<? extends dkc> c() {
         return a;
      }

      public dkc j() {
         return this.e;
      }

      public dkc k() {
         return this.f;
      }

      public dkc l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dkc.c o() {
         return this.j;
      }
   }

   public static record w(aqt<dkd.w.b, dkd.w.a> e) implements dkc {
      private static final Codec<aqt<dkd.w.b, dkd.w.a>> f = aqt.a(dkd.w.a.b);
      private static final MapCodec<dkd.w> g = f.fieldOf("spline").xmap(dkd.w::new, dkd.w::j);
      public static final arj<dkd.w> a = dkd.a(g);

      @Override
      public double a(dkc.b $$0) {
         return (double)this.e.a(new dkd.w.b($$0));
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
      public void a(double[] $$0, dkc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkc a(dkc.f $$0) {
         return $$0.apply(new dkd.w(this.e.a((aqt.d<dkd.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public arj<? extends dkc> c() {
         return a;
      }

      public aqt<dkd.w.b, dkd.w.a> j() {
         return this.e;
      }

      public static record a(he<dkc> c) implements asn<dkd.w.b> {
         public static final Codec<dkd.w.a> b = dkc.c.xmap(dkd.w.a::new, dkd.w.a::a);

         @Override
         public String toString() {
            Optional<aeq<dkc>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               aeq<dkc> $$1 = $$0.get();
               if ($$1 == dkq.d) {
                  return "continents";
               }

               if ($$1 == dkq.e) {
                  return "erosion";
               }

               if ($$1 == dkq.f) {
                  return "weirdness";
               }

               if ($$1 == dkq.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dkd.w.b $$0) {
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

         public dkd.w.a a(dkc.f $$0) {
            return new dkd.w.a(new he.a<>(this.c.a().a($$0)));
         }

         public he<dkc> a() {
            return this.c;
         }
      }

      public static record b(dkc.b a) {
      }
   }

   interface x extends dkc {
      dkc j();

      @Override
      default double a(dkc.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dkc.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dkc.b var1, double var2);
   }

   interface y extends dkc {
      Logger a = LogUtils.getLogger();

      static dkd.y a(dkd.y.a $$0, dkc $$1, dkc $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dkd.y.a.c || $$0 == dkd.y.a.d) {
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
         if ($$0 == dkd.y.a.b || $$0 == dkd.y.a.a) {
            if ($$1 instanceof dkd.h $$11) {
               return new dkd.n($$0 == dkd.y.a.a ? dkd.n.a.b : dkd.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dkd.h $$12) {
               return new dkd.n($$0 == dkd.y.a.a ? dkd.n.a.b : dkd.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dkd.a($$0, $$1, $$2, $$9, $$10);
      }

      dkd.y.a j();

      dkc k();

      dkc l();

      @Override
      default arj<? extends dkc> c() {
         return this.j().e;
      }

      public static enum a implements ash {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final arj<dkd.y> e = dkd.a((BiFunction<dkc, dkc, dkd.y>)(($$0x, $$1) -> dkd.y.a(this, $$0x, $$1)), dkd.y::k, dkd.y::l);
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

   protected static record z(dkc e, dkc.c f, dkd.z.a g) implements dkd.x {
      private static final MapCodec<dkd.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkc.d.fieldOf("input").forGetter(dkd.z::j),
                  dkc.c.a.fieldOf("noise").forGetter(dkd.z::k),
                  dkd.z.a.c.fieldOf("rarity_value_mapper").forGetter(dkd.z::l)
               )
               .apply($$0, dkd.z::new)
      );
      public static final arj<dkd.z> a = dkd.a(h);

      @Override
      public double a(dkc.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dkc a(dkc.f $$0) {
         return $$0.apply(new dkd.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public arj<? extends dkc> c() {
         return a;
      }

      @Override
      public dkc j() {
         return this.e;
      }

      public dkc.c k() {
         return this.f;
      }

      public dkd.z.a l() {
         return this.g;
      }

      public static enum a implements ash {
         a("type_1", dkq.a::b, 2.0),
         b("type_2", dkq.a::a, 3.0);

         public static final Codec<dkd.z.a> c = ash.a(dkd.z.a::values);
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
