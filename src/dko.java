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

public final class dko {
   private static final Codec<dkn> c = jd.ag.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dkn> b = Codec.either(d, c)
      .xmap($$0 -> (dkn)$$0.map(dko::a, Function.identity()), $$0 -> $$0 instanceof dko.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dkn> a(ht<Codec<? extends dkn>> $$0) {
      a($$0, "blend_alpha", dko.d.e);
      a($$0, "blend_offset", dko.f.e);
      a($$0, "beardifier", dko.b.e);
      a($$0, "old_blended_noise", dzo.a);

      for (dko.l.a $$1 : dko.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dko.o.e);
      a($$0, "end_islands", dko.i.a);
      a($$0, "weird_scaled_sampler", dko.z.a);
      a($$0, "shifted_noise", dko.v.a);
      a($$0, "range_choice", dko.q.e);
      a($$0, "shift_a", dko.s.e);
      a($$0, "shift_b", dko.t.e);
      a($$0, "shift", dko.r.e);
      a($$0, "blend_density", dko.e.e);
      a($$0, "clamp", dko.g.a);

      for (dko.k.a $$2 : dko.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dko.y.a $$3 : dko.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dko.w.a);
      a($$0, "constant", dko.h.e);
      return a($$0, "y_clamped_gradient", dko.aa.a);
   }

   private static Codec<? extends dkn> a(ht<Codec<? extends dkn>> $$0, String $$1, ars<? extends dkn> $$2) {
      return ht.a($$0, $$1, $$2.a());
   }

   static <A, O> ars<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return ars.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> ars<O> a(Function<dkn, O> $$0, Function<O, dkn> $$1) {
      return a(dkn.d, $$0, $$1);
   }

   static <O> ars<O> a(BiFunction<dkn, dkn, O> $$0, Function<O, dkn> $$1, Function<O, dkn> $$2) {
      return ars.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dkn.d.fieldOf("argument1").forGetter($$1), dkn.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> ars<O> a(MapCodec<O> $$0) {
      return ars.a($$0);
   }

   private dko() {
   }

   public static dkn a(dkn $$0) {
      return new dko.l(dko.l.a.a, $$0);
   }

   public static dkn b(dkn $$0) {
      return new dko.l(dko.l.a.b, $$0);
   }

   public static dkn c(dkn $$0) {
      return new dko.l(dko.l.a.c, $$0);
   }

   public static dkn d(dkn $$0) {
      return new dko.l(dko.l.a.d, $$0);
   }

   public static dkn e(dkn $$0) {
      return new dko.l(dko.l.a.e, $$0);
   }

   public static dkn a(hg<dzr.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dko.o(new dkn.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dkn a(hg<dzr.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dkn a(hg<dzr.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dkn a(dkn $$0, dkn $$1, double $$2, hg<dzr.a> $$3) {
      return new dko.v($$0, a(), $$1, $$2, 0.0, new dkn.c($$3));
   }

   public static dkn a(hg<dzr.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dkn b(hg<dzr.a> $$0, double $$1, double $$2) {
      return new dko.o(new dkn.c($$0), $$1, $$2);
   }

   public static dkn a(hg<dzr.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dkn a(dkn $$0, double $$1, double $$2, dkn $$3, dkn $$4) {
      return new dko.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dkn b(hg<dzr.a> $$0) {
      return new dko.s(new dkn.c($$0));
   }

   public static dkn c(hg<dzr.a> $$0) {
      return new dko.t(new dkn.c($$0));
   }

   public static dkn d(hg<dzr.a> $$0) {
      return new dko.r(new dkn.c($$0));
   }

   public static dkn f(dkn $$0) {
      return new dko.e($$0);
   }

   public static dkn a(long $$0) {
      return new dko.i($$0);
   }

   public static dkn a(dkn $$0, hg<dzr.a> $$1, dko.z.a $$2) {
      return new dko.z($$0, new dkn.c($$1), $$2);
   }

   public static dkn a(dkn $$0, dkn $$1) {
      return dko.y.a(dko.y.a.a, $$0, $$1);
   }

   public static dkn b(dkn $$0, dkn $$1) {
      return dko.y.a(dko.y.a.b, $$0, $$1);
   }

   public static dkn c(dkn $$0, dkn $$1) {
      return dko.y.a(dko.y.a.c, $$0, $$1);
   }

   public static dkn d(dkn $$0, dkn $$1) {
      return dko.y.a(dko.y.a.d, $$0, $$1);
   }

   public static dkn a(arc<dko.w.b, dko.w.a> $$0) {
      return new dko.w($$0);
   }

   public static dkn a() {
      return dko.h.f;
   }

   public static dkn a(double $$0) {
      return new dko.h($$0);
   }

   public static dkn a(int $$0, int $$1, double $$2, double $$3) {
      return new dko.aa($$0, $$1, $$2, $$3);
   }

   public static dkn a(dkn $$0, dko.k.a $$1) {
      return dko.k.a($$1, $$0);
   }

   private static dkn a(dkn $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dkn b() {
      return dko.d.a;
   }

   public static dkn c() {
      return dko.f.a;
   }

   public static dkn a(dkn $$0, dkn $$1, dkn $$2) {
      if ($$1 instanceof dko.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dkn $$4 = d($$0);
         dkn $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dkn a(dkn $$0, double $$1, dkn $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dko.y.a e, dkn f, dkn g, double h, double i) implements dko.y {
      @Override
      public double a(dkn.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dkn.a $$1) {
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
      public dkn a(dkn.f $$0) {
         return $$0.apply(dko.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dko.y.a j() {
         return this.e;
      }

      @Override
      public dkn k() {
         return this.f;
      }

      @Override
      public dkn l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dkn.d {
      private static final MapCodec<dko.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(diu.e * 2, diu.d * 2).fieldOf("from_y").forGetter(dko.aa::j),
                  Codec.intRange(diu.e * 2, diu.d * 2).fieldOf("to_y").forGetter(dko.aa::k),
                  dko.d.fieldOf("from_value").forGetter(dko.aa::l),
                  dko.d.fieldOf("to_value").forGetter(dko.aa::m)
               )
               .apply($$0, dko.aa::new)
      );
      public static final ars<dko.aa> a = dko.a(i);

      @Override
      public double a(dkn.b $$0) {
         return ary.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public ars<? extends dkn> c() {
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

   protected static enum b implements dko.c {
      a;

      @Override
      public double a(dkn.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dkn.a $$1) {
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

   public interface c extends dkn.d {
      ars<dkn> e = ars.a(MapCodec.unit(dko.b.a));

      @Override
      default ars<? extends dkn> c() {
         return e;
      }
   }

   protected static enum d implements dkn.d {
      a;

      public static final ars<dkn> e = ars.a(MapCodec.unit(a));

      @Override
      public double a(dkn.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dkn.a $$1) {
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
      public ars<? extends dkn> c() {
         return e;
      }
   }

   static record e(dkn a) implements dko.x {
      static final ars<dko.e> e = dko.a(dko.e::new, dko.e::j);

      @Override
      public double a(dkn.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dkn a(dkn.f $$0) {
         return $$0.apply(new dko.e(this.a.a($$0)));
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
      public ars<? extends dkn> c() {
         return e;
      }

      @Override
      public dkn j() {
         return this.a;
      }
   }

   protected static enum f implements dkn.d {
      a;

      public static final ars<dkn> e = ars.a(MapCodec.unit(a));

      @Override
      public double a(dkn.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dkn.a $$1) {
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
      public ars<? extends dkn> c() {
         return e;
      }
   }

   protected static record g(dkn e, double f, double g) implements dko.p {
      private static final MapCodec<dko.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dkn.b.fieldOf("input").forGetter(dko.g::aw_), dko.d.fieldOf("min").forGetter(dko.g::a), dko.d.fieldOf("max").forGetter(dko.g::b))
               .apply($$0, dko.g::new)
      );
      public static final ars<dko.g> a = dko.a(h);

      @Override
      public double a(double $$0) {
         return ary.a($$0, this.f, this.g);
      }

      @Override
      public dkn a(dkn.f $$0) {
         return new dko.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public ars<? extends dkn> c() {
         return a;
      }

      @Override
      public dkn aw_() {
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

   static record h(double a) implements dkn.d {
      static final ars<dko.h> e = dko.a(dko.d, dko.h::new, dko.h::j);
      static final dko.h f = new dko.h(0.0);

      @Override
      public void a(double[] $$0, dkn.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public ars<? extends dkn> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dkn.d {
      public static final ars<dko.i> a = ars.a(MapCodec.unit(new dko.i(0L)));
      private static final float e = -0.9F;
      private final dzu f;

      public i(long $$0) {
         ase $$1 = new dkv($$0);
         $$1.b(17292);
         this.f = new dzu($$1);
      }

      private static float a(dzu $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - ary.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = ary.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (ary.e((float)$$10) * 3439.0F + ary.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - ary.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = ary.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dkn.b $$0) {
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
      public ars<? extends dkn> c() {
         return a;
      }
   }

   @ata
   public static record j(hg<dkn> a) implements dkn {
      @Override
      public double a(dkn.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dkn.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dkn a(dkn.f $$0) {
         return $$0.apply(new dko.j(new hg.a<>(this.a.a().a($$0))));
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
      public ars<? extends dkn> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public hg<dkn> j() {
         return this.a;
      }
   }

   protected static record k(dko.k.a a, dkn e, double f, double g) implements dko.p {
      public static dko.k a(dko.k.a $$0, dkn $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dko.k.a.a && $$0 != dko.k.a.b ? new dko.k($$0, $$1, $$3, $$4) : new dko.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dko.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = ary.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dko.k b(dkn.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public ars<? extends dkn> c() {
         return this.a.h;
      }

      public dko.k.a k() {
         return this.a;
      }

      @Override
      public dkn aw_() {
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

      static enum a implements asr {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final ars<dko.k> h = dko.a($$0x -> dko.k.a(this, $$0x), dko.k::aw_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dko.l.a a, dkn e) implements dko.m {
      @Override
      public double a(dkn.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dkn.a $$1) {
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
      public dko.l.a j() {
         return this.a;
      }

      @Override
      public dkn k() {
         return this.e;
      }

      static enum a implements asr {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final ars<dko.m> g = dko.a($$0x -> new dko.l(this, $$0x), dko.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dkn {
      dko.l.a j();

      dkn k();

      @Override
      default ars<? extends dkn> c() {
         return this.j().g;
      }

      @Override
      default dkn a(dkn.f $$0) {
         return $$0.apply(new dko.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dko.n.a e, dkn f, double g, double h, double i) implements dko.p, dko.y {
      @Override
      public dko.y.a j() {
         return this.e == dko.n.a.a ? dko.y.a.b : dko.y.a.a;
      }

      @Override
      public dkn k() {
         return dko.a(this.i);
      }

      @Override
      public dkn l() {
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
      public dkn a(dkn.f $$0) {
         dkn $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dko.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dko.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dko.n.a m() {
         return this.e;
      }

      @Override
      public dkn aw_() {
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

   protected static record o(dkn.c f, @Deprecated double g, double h) implements dkn {
      public static final MapCodec<dko.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkn.c.a.fieldOf("noise").forGetter(dko.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dko.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dko.o::l)
               )
               .apply($$0, dko.o::new)
      );
      public static final ars<dko.o> e = dko.a(a);

      @Override
      public double a(dkn.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dkn.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkn a(dkn.f $$0) {
         return $$0.apply(new dko.o($$0.a(this.f), this.g, this.h));
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
      public ars<? extends dkn> c() {
         return e;
      }

      public dkn.c j() {
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

   interface p extends dkn {
      dkn aw_();

      @Override
      default double a(dkn.b $$0) {
         return this.a(this.aw_().a($$0));
      }

      @Override
      default void a(double[] $$0, dkn.a $$1) {
         this.aw_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dkn f, double g, double h, dkn i, dkn j) implements dkn {
      public static final MapCodec<dko.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkn.d.fieldOf("input").forGetter(dko.q::j),
                  dko.d.fieldOf("min_inclusive").forGetter(dko.q::k),
                  dko.d.fieldOf("max_exclusive").forGetter(dko.q::l),
                  dkn.d.fieldOf("when_in_range").forGetter(dko.q::m),
                  dkn.d.fieldOf("when_out_of_range").forGetter(dko.q::n)
               )
               .apply($$0, dko.q::new)
      );
      public static final ars<dko.q> e = dko.a(a);

      @Override
      public double a(dkn.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dkn.a $$1) {
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
      public dkn a(dkn.f $$0) {
         return $$0.apply(new dko.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public ars<? extends dkn> c() {
         return e;
      }

      public dkn j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dkn m() {
         return this.i;
      }

      public dkn n() {
         return this.j;
      }
   }

   protected static record r(dkn.c a) implements dko.u {
      static final ars<dko.r> e = dko.a(dkn.c.a, dko.r::new, dko.r::j);

      @Override
      public double a(dkn.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dkn a(dkn.f $$0) {
         return $$0.apply(new dko.r($$0.a(this.a)));
      }

      @Override
      public ars<? extends dkn> c() {
         return e;
      }

      @Override
      public dkn.c j() {
         return this.a;
      }
   }

   protected static record s(dkn.c a) implements dko.u {
      static final ars<dko.s> e = dko.a(dkn.c.a, dko.s::new, dko.s::j);

      @Override
      public double a(dkn.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dkn a(dkn.f $$0) {
         return $$0.apply(new dko.s($$0.a(this.a)));
      }

      @Override
      public ars<? extends dkn> c() {
         return e;
      }

      @Override
      public dkn.c j() {
         return this.a;
      }
   }

   protected static record t(dkn.c a) implements dko.u {
      static final ars<dko.t> e = dko.a(dkn.c.a, dko.t::new, dko.t::j);

      @Override
      public double a(dkn.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dkn a(dkn.f $$0) {
         return $$0.apply(new dko.t($$0.a(this.a)));
      }

      @Override
      public ars<? extends dkn> c() {
         return e;
      }

      @Override
      public dkn.c j() {
         return this.a;
      }
   }

   interface u extends dkn {
      dkn.c j();

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
      default void a(double[] $$0, dkn.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dkn e, dkn f, dkn g, double h, double i, dkn.c j) implements dkn {
      private static final MapCodec<dko.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkn.d.fieldOf("shift_x").forGetter(dko.v::j),
                  dkn.d.fieldOf("shift_y").forGetter(dko.v::k),
                  dkn.d.fieldOf("shift_z").forGetter(dko.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dko.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dko.v::n),
                  dkn.c.a.fieldOf("noise").forGetter(dko.v::o)
               )
               .apply($$0, dko.v::new)
      );
      public static final ars<dko.v> a = dko.a(k);

      @Override
      public double a(dkn.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dkn.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkn a(dkn.f $$0) {
         return $$0.apply(new dko.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public ars<? extends dkn> c() {
         return a;
      }

      public dkn j() {
         return this.e;
      }

      public dkn k() {
         return this.f;
      }

      public dkn l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dkn.c o() {
         return this.j;
      }
   }

   public static record w(arc<dko.w.b, dko.w.a> e) implements dkn {
      private static final Codec<arc<dko.w.b, dko.w.a>> f = arc.a(dko.w.a.b);
      private static final MapCodec<dko.w> g = f.fieldOf("spline").xmap(dko.w::new, dko.w::j);
      public static final ars<dko.w> a = dko.a(g);

      @Override
      public double a(dkn.b $$0) {
         return (double)this.e.a(new dko.w.b($$0));
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
      public void a(double[] $$0, dkn.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkn a(dkn.f $$0) {
         return $$0.apply(new dko.w(this.e.a((arc.d<dko.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public ars<? extends dkn> c() {
         return a;
      }

      public arc<dko.w.b, dko.w.a> j() {
         return this.e;
      }

      public static record a(hg<dkn> c) implements asx<dko.w.b> {
         public static final Codec<dko.w.a> b = dkn.c.xmap(dko.w.a::new, dko.w.a::a);

         @Override
         public String toString() {
            Optional<aex<dkn>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               aex<dkn> $$1 = $$0.get();
               if ($$1 == dlb.d) {
                  return "continents";
               }

               if ($$1 == dlb.e) {
                  return "erosion";
               }

               if ($$1 == dlb.f) {
                  return "weirdness";
               }

               if ($$1 == dlb.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dko.w.b $$0) {
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

         public dko.w.a a(dkn.f $$0) {
            return new dko.w.a(new hg.a<>(this.c.a().a($$0)));
         }

         public hg<dkn> a() {
            return this.c;
         }
      }

      public static record b(dkn.b a) {
      }
   }

   interface x extends dkn {
      dkn j();

      @Override
      default double a(dkn.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dkn.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dkn.b var1, double var2);
   }

   interface y extends dkn {
      Logger a = LogUtils.getLogger();

      static dko.y a(dko.y.a $$0, dkn $$1, dkn $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dko.y.a.c || $$0 == dko.y.a.d) {
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
         if ($$0 == dko.y.a.b || $$0 == dko.y.a.a) {
            if ($$1 instanceof dko.h $$11) {
               return new dko.n($$0 == dko.y.a.a ? dko.n.a.b : dko.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dko.h $$12) {
               return new dko.n($$0 == dko.y.a.a ? dko.n.a.b : dko.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dko.a($$0, $$1, $$2, $$9, $$10);
      }

      dko.y.a j();

      dkn k();

      dkn l();

      @Override
      default ars<? extends dkn> c() {
         return this.j().e;
      }

      public static enum a implements asr {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final ars<dko.y> e = dko.a((BiFunction<dkn, dkn, dko.y>)(($$0x, $$1) -> dko.y.a(this, $$0x, $$1)), dko.y::k, dko.y::l);
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

   protected static record z(dkn e, dkn.c f, dko.z.a g) implements dko.x {
      private static final MapCodec<dko.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkn.d.fieldOf("input").forGetter(dko.z::j),
                  dkn.c.a.fieldOf("noise").forGetter(dko.z::k),
                  dko.z.a.c.fieldOf("rarity_value_mapper").forGetter(dko.z::l)
               )
               .apply($$0, dko.z::new)
      );
      public static final ars<dko.z> a = dko.a(h);

      @Override
      public double a(dkn.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dkn a(dkn.f $$0) {
         return $$0.apply(new dko.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public ars<? extends dkn> c() {
         return a;
      }

      @Override
      public dkn j() {
         return this.e;
      }

      public dkn.c k() {
         return this.f;
      }

      public dko.z.a l() {
         return this.g;
      }

      public static enum a implements asr {
         a("type_1", dlb.a::b, 2.0),
         b("type_2", dlb.a::a, 3.0);

         public static final Codec<dko.z.a> c = asr.a(dko.z.a::values);
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
