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

public final class dkm {
   private static final Codec<dkl> c = jd.ag.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dkl> b = Codec.either(d, c)
      .xmap($$0 -> (dkl)$$0.map(dkm::a, Function.identity()), $$0 -> $$0 instanceof dkm.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dkl> a(ht<Codec<? extends dkl>> $$0) {
      a($$0, "blend_alpha", dkm.d.e);
      a($$0, "blend_offset", dkm.f.e);
      a($$0, "beardifier", dkm.b.e);
      a($$0, "old_blended_noise", dzm.a);

      for (dkm.l.a $$1 : dkm.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dkm.o.e);
      a($$0, "end_islands", dkm.i.a);
      a($$0, "weird_scaled_sampler", dkm.z.a);
      a($$0, "shifted_noise", dkm.v.a);
      a($$0, "range_choice", dkm.q.e);
      a($$0, "shift_a", dkm.s.e);
      a($$0, "shift_b", dkm.t.e);
      a($$0, "shift", dkm.r.e);
      a($$0, "blend_density", dkm.e.e);
      a($$0, "clamp", dkm.g.a);

      for (dkm.k.a $$2 : dkm.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dkm.y.a $$3 : dkm.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dkm.w.a);
      a($$0, "constant", dkm.h.e);
      return a($$0, "y_clamped_gradient", dkm.aa.a);
   }

   private static Codec<? extends dkl> a(ht<Codec<? extends dkl>> $$0, String $$1, arr<? extends dkl> $$2) {
      return ht.a($$0, $$1, $$2.a());
   }

   static <A, O> arr<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return arr.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> arr<O> a(Function<dkl, O> $$0, Function<O, dkl> $$1) {
      return a(dkl.d, $$0, $$1);
   }

   static <O> arr<O> a(BiFunction<dkl, dkl, O> $$0, Function<O, dkl> $$1, Function<O, dkl> $$2) {
      return arr.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dkl.d.fieldOf("argument1").forGetter($$1), dkl.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> arr<O> a(MapCodec<O> $$0) {
      return arr.a($$0);
   }

   private dkm() {
   }

   public static dkl a(dkl $$0) {
      return new dkm.l(dkm.l.a.a, $$0);
   }

   public static dkl b(dkl $$0) {
      return new dkm.l(dkm.l.a.b, $$0);
   }

   public static dkl c(dkl $$0) {
      return new dkm.l(dkm.l.a.c, $$0);
   }

   public static dkl d(dkl $$0) {
      return new dkm.l(dkm.l.a.d, $$0);
   }

   public static dkl e(dkl $$0) {
      return new dkm.l(dkm.l.a.e, $$0);
   }

   public static dkl a(hg<dzp.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dkm.o(new dkl.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dkl a(hg<dzp.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dkl a(hg<dzp.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dkl a(dkl $$0, dkl $$1, double $$2, hg<dzp.a> $$3) {
      return new dkm.v($$0, a(), $$1, $$2, 0.0, new dkl.c($$3));
   }

   public static dkl a(hg<dzp.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dkl b(hg<dzp.a> $$0, double $$1, double $$2) {
      return new dkm.o(new dkl.c($$0), $$1, $$2);
   }

   public static dkl a(hg<dzp.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dkl a(dkl $$0, double $$1, double $$2, dkl $$3, dkl $$4) {
      return new dkm.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dkl b(hg<dzp.a> $$0) {
      return new dkm.s(new dkl.c($$0));
   }

   public static dkl c(hg<dzp.a> $$0) {
      return new dkm.t(new dkl.c($$0));
   }

   public static dkl d(hg<dzp.a> $$0) {
      return new dkm.r(new dkl.c($$0));
   }

   public static dkl f(dkl $$0) {
      return new dkm.e($$0);
   }

   public static dkl a(long $$0) {
      return new dkm.i($$0);
   }

   public static dkl a(dkl $$0, hg<dzp.a> $$1, dkm.z.a $$2) {
      return new dkm.z($$0, new dkl.c($$1), $$2);
   }

   public static dkl a(dkl $$0, dkl $$1) {
      return dkm.y.a(dkm.y.a.a, $$0, $$1);
   }

   public static dkl b(dkl $$0, dkl $$1) {
      return dkm.y.a(dkm.y.a.b, $$0, $$1);
   }

   public static dkl c(dkl $$0, dkl $$1) {
      return dkm.y.a(dkm.y.a.c, $$0, $$1);
   }

   public static dkl d(dkl $$0, dkl $$1) {
      return dkm.y.a(dkm.y.a.d, $$0, $$1);
   }

   public static dkl a(arb<dkm.w.b, dkm.w.a> $$0) {
      return new dkm.w($$0);
   }

   public static dkl a() {
      return dkm.h.f;
   }

   public static dkl a(double $$0) {
      return new dkm.h($$0);
   }

   public static dkl a(int $$0, int $$1, double $$2, double $$3) {
      return new dkm.aa($$0, $$1, $$2, $$3);
   }

   public static dkl a(dkl $$0, dkm.k.a $$1) {
      return dkm.k.a($$1, $$0);
   }

   private static dkl a(dkl $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dkl b() {
      return dkm.d.a;
   }

   public static dkl c() {
      return dkm.f.a;
   }

   public static dkl a(dkl $$0, dkl $$1, dkl $$2) {
      if ($$1 instanceof dkm.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dkl $$4 = d($$0);
         dkl $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dkl a(dkl $$0, double $$1, dkl $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dkm.y.a e, dkl f, dkl g, double h, double i) implements dkm.y {
      @Override
      public double a(dkl.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dkl.a $$1) {
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
      public dkl a(dkl.f $$0) {
         return $$0.apply(dkm.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dkm.y.a j() {
         return this.e;
      }

      @Override
      public dkl k() {
         return this.f;
      }

      @Override
      public dkl l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dkl.d {
      private static final MapCodec<dkm.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dis.e * 2, dis.d * 2).fieldOf("from_y").forGetter(dkm.aa::j),
                  Codec.intRange(dis.e * 2, dis.d * 2).fieldOf("to_y").forGetter(dkm.aa::k),
                  dkm.d.fieldOf("from_value").forGetter(dkm.aa::l),
                  dkm.d.fieldOf("to_value").forGetter(dkm.aa::m)
               )
               .apply($$0, dkm.aa::new)
      );
      public static final arr<dkm.aa> a = dkm.a(i);

      @Override
      public double a(dkl.b $$0) {
         return arx.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public arr<? extends dkl> c() {
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

   protected static enum b implements dkm.c {
      a;

      @Override
      public double a(dkl.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dkl.a $$1) {
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

   public interface c extends dkl.d {
      arr<dkl> e = arr.a(MapCodec.unit(dkm.b.a));

      @Override
      default arr<? extends dkl> c() {
         return e;
      }
   }

   protected static enum d implements dkl.d {
      a;

      public static final arr<dkl> e = arr.a(MapCodec.unit(a));

      @Override
      public double a(dkl.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dkl.a $$1) {
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
      public arr<? extends dkl> c() {
         return e;
      }
   }

   static record e(dkl a) implements dkm.x {
      static final arr<dkm.e> e = dkm.a(dkm.e::new, dkm.e::j);

      @Override
      public double a(dkl.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dkl a(dkl.f $$0) {
         return $$0.apply(new dkm.e(this.a.a($$0)));
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
      public arr<? extends dkl> c() {
         return e;
      }

      @Override
      public dkl j() {
         return this.a;
      }
   }

   protected static enum f implements dkl.d {
      a;

      public static final arr<dkl> e = arr.a(MapCodec.unit(a));

      @Override
      public double a(dkl.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dkl.a $$1) {
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
      public arr<? extends dkl> c() {
         return e;
      }
   }

   protected static record g(dkl e, double f, double g) implements dkm.p {
      private static final MapCodec<dkm.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dkl.b.fieldOf("input").forGetter(dkm.g::aw_), dkm.d.fieldOf("min").forGetter(dkm.g::a), dkm.d.fieldOf("max").forGetter(dkm.g::b))
               .apply($$0, dkm.g::new)
      );
      public static final arr<dkm.g> a = dkm.a(h);

      @Override
      public double a(double $$0) {
         return arx.a($$0, this.f, this.g);
      }

      @Override
      public dkl a(dkl.f $$0) {
         return new dkm.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public arr<? extends dkl> c() {
         return a;
      }

      @Override
      public dkl aw_() {
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

   static record h(double a) implements dkl.d {
      static final arr<dkm.h> e = dkm.a(dkm.d, dkm.h::new, dkm.h::j);
      static final dkm.h f = new dkm.h(0.0);

      @Override
      public void a(double[] $$0, dkl.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public arr<? extends dkl> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dkl.d {
      public static final arr<dkm.i> a = arr.a(MapCodec.unit(new dkm.i(0L)));
      private static final float e = -0.9F;
      private final dzs f;

      public i(long $$0) {
         asc $$1 = new dkt($$0);
         $$1.b(17292);
         this.f = new dzs($$1);
      }

      private static float a(dzs $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - arx.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = arx.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (arx.e((float)$$10) * 3439.0F + arx.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - arx.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = arx.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dkl.b $$0) {
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
      public arr<? extends dkl> c() {
         return a;
      }
   }

   @asy
   public static record j(hg<dkl> a) implements dkl {
      @Override
      public double a(dkl.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dkl.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dkl a(dkl.f $$0) {
         return $$0.apply(new dkm.j(new hg.a<>(this.a.a().a($$0))));
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
      public arr<? extends dkl> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public hg<dkl> j() {
         return this.a;
      }
   }

   protected static record k(dkm.k.a a, dkl e, double f, double g) implements dkm.p {
      public static dkm.k a(dkm.k.a $$0, dkl $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dkm.k.a.a && $$0 != dkm.k.a.b ? new dkm.k($$0, $$1, $$3, $$4) : new dkm.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dkm.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = arx.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dkm.k b(dkl.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public arr<? extends dkl> c() {
         return this.a.h;
      }

      public dkm.k.a k() {
         return this.a;
      }

      @Override
      public dkl aw_() {
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

      static enum a implements asp {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final arr<dkm.k> h = dkm.a($$0x -> dkm.k.a(this, $$0x), dkm.k::aw_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dkm.l.a a, dkl e) implements dkm.m {
      @Override
      public double a(dkl.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dkl.a $$1) {
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
      public dkm.l.a j() {
         return this.a;
      }

      @Override
      public dkl k() {
         return this.e;
      }

      static enum a implements asp {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final arr<dkm.m> g = dkm.a($$0x -> new dkm.l(this, $$0x), dkm.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dkl {
      dkm.l.a j();

      dkl k();

      @Override
      default arr<? extends dkl> c() {
         return this.j().g;
      }

      @Override
      default dkl a(dkl.f $$0) {
         return $$0.apply(new dkm.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dkm.n.a e, dkl f, double g, double h, double i) implements dkm.p, dkm.y {
      @Override
      public dkm.y.a j() {
         return this.e == dkm.n.a.a ? dkm.y.a.b : dkm.y.a.a;
      }

      @Override
      public dkl k() {
         return dkm.a(this.i);
      }

      @Override
      public dkl l() {
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
      public dkl a(dkl.f $$0) {
         dkl $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dkm.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dkm.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dkm.n.a m() {
         return this.e;
      }

      @Override
      public dkl aw_() {
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

   protected static record o(dkl.c f, @Deprecated double g, double h) implements dkl {
      public static final MapCodec<dkm.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkl.c.a.fieldOf("noise").forGetter(dkm.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dkm.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dkm.o::l)
               )
               .apply($$0, dkm.o::new)
      );
      public static final arr<dkm.o> e = dkm.a(a);

      @Override
      public double a(dkl.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dkl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkl a(dkl.f $$0) {
         return $$0.apply(new dkm.o($$0.a(this.f), this.g, this.h));
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
      public arr<? extends dkl> c() {
         return e;
      }

      public dkl.c j() {
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

   interface p extends dkl {
      dkl aw_();

      @Override
      default double a(dkl.b $$0) {
         return this.a(this.aw_().a($$0));
      }

      @Override
      default void a(double[] $$0, dkl.a $$1) {
         this.aw_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dkl f, double g, double h, dkl i, dkl j) implements dkl {
      public static final MapCodec<dkm.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkl.d.fieldOf("input").forGetter(dkm.q::j),
                  dkm.d.fieldOf("min_inclusive").forGetter(dkm.q::k),
                  dkm.d.fieldOf("max_exclusive").forGetter(dkm.q::l),
                  dkl.d.fieldOf("when_in_range").forGetter(dkm.q::m),
                  dkl.d.fieldOf("when_out_of_range").forGetter(dkm.q::n)
               )
               .apply($$0, dkm.q::new)
      );
      public static final arr<dkm.q> e = dkm.a(a);

      @Override
      public double a(dkl.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dkl.a $$1) {
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
      public dkl a(dkl.f $$0) {
         return $$0.apply(new dkm.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public arr<? extends dkl> c() {
         return e;
      }

      public dkl j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dkl m() {
         return this.i;
      }

      public dkl n() {
         return this.j;
      }
   }

   protected static record r(dkl.c a) implements dkm.u {
      static final arr<dkm.r> e = dkm.a(dkl.c.a, dkm.r::new, dkm.r::j);

      @Override
      public double a(dkl.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dkl a(dkl.f $$0) {
         return $$0.apply(new dkm.r($$0.a(this.a)));
      }

      @Override
      public arr<? extends dkl> c() {
         return e;
      }

      @Override
      public dkl.c j() {
         return this.a;
      }
   }

   protected static record s(dkl.c a) implements dkm.u {
      static final arr<dkm.s> e = dkm.a(dkl.c.a, dkm.s::new, dkm.s::j);

      @Override
      public double a(dkl.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dkl a(dkl.f $$0) {
         return $$0.apply(new dkm.s($$0.a(this.a)));
      }

      @Override
      public arr<? extends dkl> c() {
         return e;
      }

      @Override
      public dkl.c j() {
         return this.a;
      }
   }

   protected static record t(dkl.c a) implements dkm.u {
      static final arr<dkm.t> e = dkm.a(dkl.c.a, dkm.t::new, dkm.t::j);

      @Override
      public double a(dkl.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dkl a(dkl.f $$0) {
         return $$0.apply(new dkm.t($$0.a(this.a)));
      }

      @Override
      public arr<? extends dkl> c() {
         return e;
      }

      @Override
      public dkl.c j() {
         return this.a;
      }
   }

   interface u extends dkl {
      dkl.c j();

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
      default void a(double[] $$0, dkl.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dkl e, dkl f, dkl g, double h, double i, dkl.c j) implements dkl {
      private static final MapCodec<dkm.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkl.d.fieldOf("shift_x").forGetter(dkm.v::j),
                  dkl.d.fieldOf("shift_y").forGetter(dkm.v::k),
                  dkl.d.fieldOf("shift_z").forGetter(dkm.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dkm.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dkm.v::n),
                  dkl.c.a.fieldOf("noise").forGetter(dkm.v::o)
               )
               .apply($$0, dkm.v::new)
      );
      public static final arr<dkm.v> a = dkm.a(k);

      @Override
      public double a(dkl.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dkl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkl a(dkl.f $$0) {
         return $$0.apply(new dkm.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public arr<? extends dkl> c() {
         return a;
      }

      public dkl j() {
         return this.e;
      }

      public dkl k() {
         return this.f;
      }

      public dkl l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dkl.c o() {
         return this.j;
      }
   }

   public static record w(arb<dkm.w.b, dkm.w.a> e) implements dkl {
      private static final Codec<arb<dkm.w.b, dkm.w.a>> f = arb.a(dkm.w.a.b);
      private static final MapCodec<dkm.w> g = f.fieldOf("spline").xmap(dkm.w::new, dkm.w::j);
      public static final arr<dkm.w> a = dkm.a(g);

      @Override
      public double a(dkl.b $$0) {
         return (double)this.e.a(new dkm.w.b($$0));
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
      public void a(double[] $$0, dkl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkl a(dkl.f $$0) {
         return $$0.apply(new dkm.w(this.e.a((arb.d<dkm.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public arr<? extends dkl> c() {
         return a;
      }

      public arb<dkm.w.b, dkm.w.a> j() {
         return this.e;
      }

      public static record a(hg<dkl> c) implements asv<dkm.w.b> {
         public static final Codec<dkm.w.a> b = dkl.c.xmap(dkm.w.a::new, dkm.w.a::a);

         @Override
         public String toString() {
            Optional<aew<dkl>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               aew<dkl> $$1 = $$0.get();
               if ($$1 == dkz.d) {
                  return "continents";
               }

               if ($$1 == dkz.e) {
                  return "erosion";
               }

               if ($$1 == dkz.f) {
                  return "weirdness";
               }

               if ($$1 == dkz.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dkm.w.b $$0) {
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

         public dkm.w.a a(dkl.f $$0) {
            return new dkm.w.a(new hg.a<>(this.c.a().a($$0)));
         }

         public hg<dkl> a() {
            return this.c;
         }
      }

      public static record b(dkl.b a) {
      }
   }

   interface x extends dkl {
      dkl j();

      @Override
      default double a(dkl.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dkl.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dkl.b var1, double var2);
   }

   interface y extends dkl {
      Logger a = LogUtils.getLogger();

      static dkm.y a(dkm.y.a $$0, dkl $$1, dkl $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dkm.y.a.c || $$0 == dkm.y.a.d) {
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
         if ($$0 == dkm.y.a.b || $$0 == dkm.y.a.a) {
            if ($$1 instanceof dkm.h $$11) {
               return new dkm.n($$0 == dkm.y.a.a ? dkm.n.a.b : dkm.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dkm.h $$12) {
               return new dkm.n($$0 == dkm.y.a.a ? dkm.n.a.b : dkm.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dkm.a($$0, $$1, $$2, $$9, $$10);
      }

      dkm.y.a j();

      dkl k();

      dkl l();

      @Override
      default arr<? extends dkl> c() {
         return this.j().e;
      }

      public static enum a implements asp {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final arr<dkm.y> e = dkm.a((BiFunction<dkl, dkl, dkm.y>)(($$0x, $$1) -> dkm.y.a(this, $$0x, $$1)), dkm.y::k, dkm.y::l);
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

   protected static record z(dkl e, dkl.c f, dkm.z.a g) implements dkm.x {
      private static final MapCodec<dkm.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkl.d.fieldOf("input").forGetter(dkm.z::j),
                  dkl.c.a.fieldOf("noise").forGetter(dkm.z::k),
                  dkm.z.a.c.fieldOf("rarity_value_mapper").forGetter(dkm.z::l)
               )
               .apply($$0, dkm.z::new)
      );
      public static final arr<dkm.z> a = dkm.a(h);

      @Override
      public double a(dkl.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dkl a(dkl.f $$0) {
         return $$0.apply(new dkm.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public arr<? extends dkl> c() {
         return a;
      }

      @Override
      public dkl j() {
         return this.e;
      }

      public dkl.c k() {
         return this.f;
      }

      public dkm.z.a l() {
         return this.g;
      }

      public static enum a implements asp {
         a("type_1", dkz.a::b, 2.0),
         b("type_2", dkz.a::a, 3.0);

         public static final Codec<dkm.z.a> c = asp.a(dkm.z.a::values);
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
