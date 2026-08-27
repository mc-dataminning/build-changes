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

public final class dok {
   private static final Codec<doj> c = kd.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<doj> b = Codec.either(d, c)
      .xmap($$0 -> (doj)$$0.map(dok::a, Function.identity()), $$0 -> $$0 instanceof dok.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends doj> a(it<Codec<? extends doj>> $$0) {
      a($$0, "blend_alpha", dok.d.e);
      a($$0, "blend_offset", dok.f.e);
      a($$0, "beardifier", dok.b.e);
      a($$0, "old_blended_noise", edr.a);

      for (dok.l.a $$1 : dok.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dok.o.e);
      a($$0, "end_islands", dok.i.a);
      a($$0, "weird_scaled_sampler", dok.z.a);
      a($$0, "shifted_noise", dok.v.a);
      a($$0, "range_choice", dok.q.e);
      a($$0, "shift_a", dok.s.e);
      a($$0, "shift_b", dok.t.e);
      a($$0, "shift", dok.r.e);
      a($$0, "blend_density", dok.e.e);
      a($$0, "clamp", dok.g.a);

      for (dok.k.a $$2 : dok.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dok.y.a $$3 : dok.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dok.w.a);
      a($$0, "constant", dok.h.e);
      return a($$0, "y_clamped_gradient", dok.aa.a);
   }

   private static Codec<? extends doj> a(it<Codec<? extends doj>> $$0, String $$1, aui<? extends doj> $$2) {
      return it.a($$0, $$1, $$2.a());
   }

   static <A, O> aui<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return aui.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> aui<O> a(Function<doj, O> $$0, Function<O, doj> $$1) {
      return a(doj.d, $$0, $$1);
   }

   static <O> aui<O> a(BiFunction<doj, doj, O> $$0, Function<O, doj> $$1, Function<O, doj> $$2) {
      return aui.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(doj.d.fieldOf("argument1").forGetter($$1), doj.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> aui<O> a(MapCodec<O> $$0) {
      return aui.a($$0);
   }

   private dok() {
   }

   public static doj a(doj $$0) {
      return new dok.l(dok.l.a.a, $$0);
   }

   public static doj b(doj $$0) {
      return new dok.l(dok.l.a.b, $$0);
   }

   public static doj c(doj $$0) {
      return new dok.l(dok.l.a.c, $$0);
   }

   public static doj d(doj $$0) {
      return new dok.l(dok.l.a.d, $$0);
   }

   public static doj e(doj $$0) {
      return new dok.l(dok.l.a.e, $$0);
   }

   public static doj a(ih<edu.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dok.o(new doj.c($$0), $$1, $$2), $$3, $$4);
   }

   public static doj a(ih<edu.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static doj a(ih<edu.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static doj a(doj $$0, doj $$1, double $$2, ih<edu.a> $$3) {
      return new dok.v($$0, a(), $$1, $$2, 0.0, new doj.c($$3));
   }

   public static doj a(ih<edu.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static doj b(ih<edu.a> $$0, double $$1, double $$2) {
      return new dok.o(new doj.c($$0), $$1, $$2);
   }

   public static doj a(ih<edu.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static doj a(doj $$0, double $$1, double $$2, doj $$3, doj $$4) {
      return new dok.q($$0, $$1, $$2, $$3, $$4);
   }

   public static doj b(ih<edu.a> $$0) {
      return new dok.s(new doj.c($$0));
   }

   public static doj c(ih<edu.a> $$0) {
      return new dok.t(new doj.c($$0));
   }

   public static doj d(ih<edu.a> $$0) {
      return new dok.r(new doj.c($$0));
   }

   public static doj f(doj $$0) {
      return new dok.e($$0);
   }

   public static doj a(long $$0) {
      return new dok.i($$0);
   }

   public static doj a(doj $$0, ih<edu.a> $$1, dok.z.a $$2) {
      return new dok.z($$0, new doj.c($$1), $$2);
   }

   public static doj a(doj $$0, doj $$1) {
      return dok.y.a(dok.y.a.a, $$0, $$1);
   }

   public static doj b(doj $$0, doj $$1) {
      return dok.y.a(dok.y.a.b, $$0, $$1);
   }

   public static doj c(doj $$0, doj $$1) {
      return dok.y.a(dok.y.a.c, $$0, $$1);
   }

   public static doj d(doj $$0, doj $$1) {
      return dok.y.a(dok.y.a.d, $$0, $$1);
   }

   public static doj a(atq<dok.w.b, dok.w.a> $$0) {
      return new dok.w($$0);
   }

   public static doj a() {
      return dok.h.f;
   }

   public static doj a(double $$0) {
      return new dok.h($$0);
   }

   public static doj a(int $$0, int $$1, double $$2, double $$3) {
      return new dok.aa($$0, $$1, $$2, $$3);
   }

   public static doj a(doj $$0, dok.k.a $$1) {
      return dok.k.a($$1, $$0);
   }

   private static doj a(doj $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static doj b() {
      return dok.d.a;
   }

   public static doj c() {
      return dok.f.a;
   }

   public static doj a(doj $$0, doj $$1, doj $$2) {
      if ($$1 instanceof dok.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         doj $$4 = d($$0);
         doj $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static doj a(doj $$0, double $$1, doj $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dok.y.a e, doj f, doj g, double h, double i) implements dok.y {
      @Override
      public double a(doj.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, doj.a $$1) {
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
      public doj a(doj.f $$0) {
         return $$0.apply(dok.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dok.y.a j() {
         return this.e;
      }

      @Override
      public doj k() {
         return this.f;
      }

      @Override
      public doj l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements doj.d {
      private static final MapCodec<dok.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dmq.e * 2, dmq.d * 2).fieldOf("from_y").forGetter(dok.aa::j),
                  Codec.intRange(dmq.e * 2, dmq.d * 2).fieldOf("to_y").forGetter(dok.aa::k),
                  dok.d.fieldOf("from_value").forGetter(dok.aa::l),
                  dok.d.fieldOf("to_value").forGetter(dok.aa::m)
               )
               .apply($$0, dok.aa::new)
      );
      public static final aui<dok.aa> a = dok.a(i);

      @Override
      public double a(doj.b $$0) {
         return auo.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public aui<? extends doj> c() {
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

   protected static enum b implements dok.c {
      a;

      @Override
      public double a(doj.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, doj.a $$1) {
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

   public interface c extends doj.d {
      aui<doj> e = aui.a(MapCodec.unit(dok.b.a));

      @Override
      default aui<? extends doj> c() {
         return e;
      }
   }

   protected static enum d implements doj.d {
      a;

      public static final aui<doj> e = aui.a(MapCodec.unit(a));

      @Override
      public double a(doj.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, doj.a $$1) {
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
      public aui<? extends doj> c() {
         return e;
      }
   }

   static record e(doj a) implements dok.x {
      static final aui<dok.e> e = dok.a(dok.e::new, dok.e::j);

      @Override
      public double a(doj.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public doj a(doj.f $$0) {
         return $$0.apply(new dok.e(this.a.a($$0)));
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
      public aui<? extends doj> c() {
         return e;
      }

      @Override
      public doj j() {
         return this.a;
      }
   }

   protected static enum f implements doj.d {
      a;

      public static final aui<doj> e = aui.a(MapCodec.unit(a));

      @Override
      public double a(doj.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, doj.a $$1) {
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
      public aui<? extends doj> c() {
         return e;
      }
   }

   protected static record g(doj e, double f, double g) implements dok.p {
      private static final MapCodec<dok.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(doj.b.fieldOf("input").forGetter(dok.g::aC_), dok.d.fieldOf("min").forGetter(dok.g::a), dok.d.fieldOf("max").forGetter(dok.g::b))
               .apply($$0, dok.g::new)
      );
      public static final aui<dok.g> a = dok.a(h);

      @Override
      public double a(double $$0) {
         return auo.a($$0, this.f, this.g);
      }

      @Override
      public doj a(doj.f $$0) {
         return new dok.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public aui<? extends doj> c() {
         return a;
      }

      @Override
      public doj aC_() {
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

   static record h(double a) implements doj.d {
      static final aui<dok.h> e = dok.a(dok.d, dok.h::new, dok.h::j);
      static final dok.h f = new dok.h(0.0);

      @Override
      public void a(double[] $$0, doj.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public aui<? extends doj> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements doj.d {
      public static final aui<dok.i> a = aui.a(MapCodec.unit(new dok.i(0L)));
      private static final float e = -0.9F;
      private final edx f;

      public i(long $$0) {
         auv $$1 = new dor($$0);
         $$1.b(17292);
         this.f = new edx($$1);
      }

      private static float a(edx $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - auo.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = auo.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (auo.e((float)$$10) * 3439.0F + auo.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - auo.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = auo.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(doj.b $$0) {
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
      public aui<? extends doj> c() {
         return a;
      }
   }

   @avt
   public static record j(ih<doj> a) implements doj {
      @Override
      public double a(doj.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, doj.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public doj a(doj.f $$0) {
         return $$0.apply(new dok.j(new ih.a<>(this.a.a().a($$0))));
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
      public aui<? extends doj> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public ih<doj> j() {
         return this.a;
      }
   }

   protected static record k(dok.k.a a, doj e, double f, double g) implements dok.p {
      public static dok.k a(dok.k.a $$0, doj $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dok.k.a.a && $$0 != dok.k.a.b ? new dok.k($$0, $$1, $$3, $$4) : new dok.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dok.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = auo.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dok.k b(doj.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public aui<? extends doj> c() {
         return this.a.h;
      }

      public dok.k.a k() {
         return this.a;
      }

      @Override
      public doj aC_() {
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

      static enum a implements avk {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final aui<dok.k> h = dok.a($$0x -> dok.k.a(this, $$0x), dok.k::aC_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dok.l.a a, doj e) implements dok.m {
      @Override
      public double a(doj.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, doj.a $$1) {
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
      public dok.l.a j() {
         return this.a;
      }

      @Override
      public doj k() {
         return this.e;
      }

      static enum a implements avk {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final aui<dok.m> g = dok.a($$0x -> new dok.l(this, $$0x), dok.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends doj {
      dok.l.a j();

      doj k();

      @Override
      default aui<? extends doj> c() {
         return this.j().g;
      }

      @Override
      default doj a(doj.f $$0) {
         return $$0.apply(new dok.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dok.n.a e, doj f, double g, double h, double i) implements dok.p, dok.y {
      @Override
      public dok.y.a j() {
         return this.e == dok.n.a.a ? dok.y.a.b : dok.y.a.a;
      }

      @Override
      public doj k() {
         return dok.a(this.i);
      }

      @Override
      public doj l() {
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
      public doj a(doj.f $$0) {
         doj $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dok.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dok.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dok.n.a m() {
         return this.e;
      }

      @Override
      public doj aC_() {
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

   protected static record o(doj.c f, @Deprecated double g, double h) implements doj {
      public static final MapCodec<dok.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  doj.c.a.fieldOf("noise").forGetter(dok.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dok.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dok.o::l)
               )
               .apply($$0, dok.o::new)
      );
      public static final aui<dok.o> e = dok.a(a);

      @Override
      public double a(doj.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, doj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public doj a(doj.f $$0) {
         return $$0.apply(new dok.o($$0.a(this.f), this.g, this.h));
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
      public aui<? extends doj> c() {
         return e;
      }

      public doj.c j() {
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

   interface p extends doj {
      doj aC_();

      @Override
      default double a(doj.b $$0) {
         return this.a(this.aC_().a($$0));
      }

      @Override
      default void a(double[] $$0, doj.a $$1) {
         this.aC_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(doj f, double g, double h, doj i, doj j) implements doj {
      public static final MapCodec<dok.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  doj.d.fieldOf("input").forGetter(dok.q::j),
                  dok.d.fieldOf("min_inclusive").forGetter(dok.q::k),
                  dok.d.fieldOf("max_exclusive").forGetter(dok.q::l),
                  doj.d.fieldOf("when_in_range").forGetter(dok.q::m),
                  doj.d.fieldOf("when_out_of_range").forGetter(dok.q::n)
               )
               .apply($$0, dok.q::new)
      );
      public static final aui<dok.q> e = dok.a(a);

      @Override
      public double a(doj.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, doj.a $$1) {
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
      public doj a(doj.f $$0) {
         return $$0.apply(new dok.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public aui<? extends doj> c() {
         return e;
      }

      public doj j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public doj m() {
         return this.i;
      }

      public doj n() {
         return this.j;
      }
   }

   protected static record r(doj.c a) implements dok.u {
      static final aui<dok.r> e = dok.a(doj.c.a, dok.r::new, dok.r::j);

      @Override
      public double a(doj.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public doj a(doj.f $$0) {
         return $$0.apply(new dok.r($$0.a(this.a)));
      }

      @Override
      public aui<? extends doj> c() {
         return e;
      }

      @Override
      public doj.c j() {
         return this.a;
      }
   }

   protected static record s(doj.c a) implements dok.u {
      static final aui<dok.s> e = dok.a(doj.c.a, dok.s::new, dok.s::j);

      @Override
      public double a(doj.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public doj a(doj.f $$0) {
         return $$0.apply(new dok.s($$0.a(this.a)));
      }

      @Override
      public aui<? extends doj> c() {
         return e;
      }

      @Override
      public doj.c j() {
         return this.a;
      }
   }

   protected static record t(doj.c a) implements dok.u {
      static final aui<dok.t> e = dok.a(doj.c.a, dok.t::new, dok.t::j);

      @Override
      public double a(doj.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public doj a(doj.f $$0) {
         return $$0.apply(new dok.t($$0.a(this.a)));
      }

      @Override
      public aui<? extends doj> c() {
         return e;
      }

      @Override
      public doj.c j() {
         return this.a;
      }
   }

   interface u extends doj {
      doj.c j();

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
      default void a(double[] $$0, doj.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(doj e, doj f, doj g, double h, double i, doj.c j) implements doj {
      private static final MapCodec<dok.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  doj.d.fieldOf("shift_x").forGetter(dok.v::j),
                  doj.d.fieldOf("shift_y").forGetter(dok.v::k),
                  doj.d.fieldOf("shift_z").forGetter(dok.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dok.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dok.v::n),
                  doj.c.a.fieldOf("noise").forGetter(dok.v::o)
               )
               .apply($$0, dok.v::new)
      );
      public static final aui<dok.v> a = dok.a(k);

      @Override
      public double a(doj.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, doj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public doj a(doj.f $$0) {
         return $$0.apply(new dok.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public aui<? extends doj> c() {
         return a;
      }

      public doj j() {
         return this.e;
      }

      public doj k() {
         return this.f;
      }

      public doj l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public doj.c o() {
         return this.j;
      }
   }

   public static record w(atq<dok.w.b, dok.w.a> e) implements doj {
      private static final Codec<atq<dok.w.b, dok.w.a>> f = atq.a(dok.w.a.b);
      private static final MapCodec<dok.w> g = f.fieldOf("spline").xmap(dok.w::new, dok.w::j);
      public static final aui<dok.w> a = dok.a(g);

      @Override
      public double a(doj.b $$0) {
         return (double)this.e.a(new dok.w.b($$0));
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
      public void a(double[] $$0, doj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public doj a(doj.f $$0) {
         return $$0.apply(new dok.w(this.e.a((atq.d<dok.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public aui<? extends doj> c() {
         return a;
      }

      public atq<dok.w.b, dok.w.a> j() {
         return this.e;
      }

      public static record a(ih<doj> c) implements avq<dok.w.b> {
         public static final Codec<dok.w.a> b = doj.c.xmap(dok.w.a::new, dok.w.a::a);

         @Override
         public String toString() {
            Optional<ahf<doj>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               ahf<doj> $$1 = $$0.get();
               if ($$1 == dox.d) {
                  return "continents";
               }

               if ($$1 == dox.e) {
                  return "erosion";
               }

               if ($$1 == dox.f) {
                  return "weirdness";
               }

               if ($$1 == dox.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dok.w.b $$0) {
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

         public dok.w.a a(doj.f $$0) {
            return new dok.w.a(new ih.a<>(this.c.a().a($$0)));
         }

         public ih<doj> a() {
            return this.c;
         }
      }

      public static record b(doj.b a) {
      }
   }

   interface x extends doj {
      doj j();

      @Override
      default double a(doj.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, doj.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(doj.b var1, double var2);
   }

   interface y extends doj {
      Logger a = LogUtils.getLogger();

      static dok.y a(dok.y.a $$0, doj $$1, doj $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dok.y.a.c || $$0 == dok.y.a.d) {
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
         if ($$0 == dok.y.a.b || $$0 == dok.y.a.a) {
            if ($$1 instanceof dok.h $$11) {
               return new dok.n($$0 == dok.y.a.a ? dok.n.a.b : dok.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dok.h $$12) {
               return new dok.n($$0 == dok.y.a.a ? dok.n.a.b : dok.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dok.a($$0, $$1, $$2, $$9, $$10);
      }

      dok.y.a j();

      doj k();

      doj l();

      @Override
      default aui<? extends doj> c() {
         return this.j().e;
      }

      public static enum a implements avk {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final aui<dok.y> e = dok.a((BiFunction<doj, doj, dok.y>)(($$0x, $$1) -> dok.y.a(this, $$0x, $$1)), dok.y::k, dok.y::l);
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

   protected static record z(doj e, doj.c f, dok.z.a g) implements dok.x {
      private static final MapCodec<dok.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  doj.d.fieldOf("input").forGetter(dok.z::j),
                  doj.c.a.fieldOf("noise").forGetter(dok.z::k),
                  dok.z.a.c.fieldOf("rarity_value_mapper").forGetter(dok.z::l)
               )
               .apply($$0, dok.z::new)
      );
      public static final aui<dok.z> a = dok.a(h);

      @Override
      public double a(doj.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public doj a(doj.f $$0) {
         return $$0.apply(new dok.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public aui<? extends doj> c() {
         return a;
      }

      @Override
      public doj j() {
         return this.e;
      }

      public doj.c k() {
         return this.f;
      }

      public dok.z.a l() {
         return this.g;
      }

      public static enum a implements avk {
         a("type_1", dox.a::b, 2.0),
         b("type_2", dox.a::a, 3.0);

         public static final Codec<dok.z.a> c = avk.a(dok.z.a::values);
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
