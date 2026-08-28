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

public final class egz {
   private static final Codec<egy> c = mh.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<egy> b = Codec.either(d, c)
      .xmap($$0 -> (egy)$$0.map(egz::a, Function.identity()), $$0 -> $$0 instanceof egz.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends egy> a(jt<MapCodec<? extends egy>> $$0) {
      a($$0, "blend_alpha", egz.d.e);
      a($$0, "blend_offset", egz.f.e);
      a($$0, "beardifier", egz.b.e);
      a($$0, "old_blended_noise", ewq.a);

      for (egz.l.a $$1 : egz.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", egz.o.e);
      a($$0, "end_islands", egz.i.a);
      a($$0, "weird_scaled_sampler", egz.z.a);
      a($$0, "shifted_noise", egz.v.a);
      a($$0, "range_choice", egz.q.e);
      a($$0, "shift_a", egz.s.e);
      a($$0, "shift_b", egz.t.e);
      a($$0, "shift", egz.r.e);
      a($$0, "blend_density", egz.e.e);
      a($$0, "clamp", egz.g.a);

      for (egz.k.a $$2 : egz.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (egz.y.a $$3 : egz.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", egz.w.a);
      a($$0, "constant", egz.h.e);
      return a($$0, "y_clamped_gradient", egz.aa.a);
   }

   private static MapCodec<? extends egy> a(jt<MapCodec<? extends egy>> $$0, String $$1, azj<? extends egy> $$2) {
      return jt.a($$0, $$1, $$2.a());
   }

   static <A, O> azj<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return azj.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> azj<O> a(Function<egy, O> $$0, Function<O, egy> $$1) {
      return a(egy.d, $$0, $$1);
   }

   static <O> azj<O> a(BiFunction<egy, egy, O> $$0, Function<O, egy> $$1, Function<O, egy> $$2) {
      return azj.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(egy.d.fieldOf("argument1").forGetter($$1), egy.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> azj<O> a(MapCodec<O> $$0) {
      return azj.a($$0);
   }

   private egz() {
   }

   public static egy a(egy $$0) {
      return new egz.l(egz.l.a.a, $$0);
   }

   public static egy b(egy $$0) {
      return new egz.l(egz.l.a.b, $$0);
   }

   public static egy c(egy $$0) {
      return new egz.l(egz.l.a.c, $$0);
   }

   public static egy d(egy $$0) {
      return new egz.l(egz.l.a.d, $$0);
   }

   public static egy e(egy $$0) {
      return new egz.l(egz.l.a.e, $$0);
   }

   public static egy a(jg<ewt.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new egz.o(new egy.c($$0), $$1, $$2), $$3, $$4);
   }

   public static egy a(jg<ewt.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static egy a(jg<ewt.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static egy a(egy $$0, egy $$1, double $$2, jg<ewt.a> $$3) {
      return new egz.v($$0, a(), $$1, $$2, 0.0, new egy.c($$3));
   }

   public static egy a(jg<ewt.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static egy b(jg<ewt.a> $$0, double $$1, double $$2) {
      return new egz.o(new egy.c($$0), $$1, $$2);
   }

   public static egy a(jg<ewt.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static egy a(egy $$0, double $$1, double $$2, egy $$3, egy $$4) {
      return new egz.q($$0, $$1, $$2, $$3, $$4);
   }

   public static egy b(jg<ewt.a> $$0) {
      return new egz.s(new egy.c($$0));
   }

   public static egy c(jg<ewt.a> $$0) {
      return new egz.t(new egy.c($$0));
   }

   public static egy d(jg<ewt.a> $$0) {
      return new egz.r(new egy.c($$0));
   }

   public static egy f(egy $$0) {
      return new egz.e($$0);
   }

   public static egy a(long $$0) {
      return new egz.i($$0);
   }

   public static egy a(egy $$0, jg<ewt.a> $$1, egz.z.a $$2) {
      return new egz.z($$0, new egy.c($$1), $$2);
   }

   public static egy a(egy $$0, egy $$1) {
      return egz.y.a(egz.y.a.a, $$0, $$1);
   }

   public static egy b(egy $$0, egy $$1) {
      return egz.y.a(egz.y.a.b, $$0, $$1);
   }

   public static egy c(egy $$0, egy $$1) {
      return egz.y.a(egz.y.a.c, $$0, $$1);
   }

   public static egy d(egy $$0, egy $$1) {
      return egz.y.a(egz.y.a.d, $$0, $$1);
   }

   public static egy a(ayr<egz.w.b, egz.w.a> $$0) {
      return new egz.w($$0);
   }

   public static egy a() {
      return egz.h.f;
   }

   public static egy a(double $$0) {
      return new egz.h($$0);
   }

   public static egy a(int $$0, int $$1, double $$2, double $$3) {
      return new egz.aa($$0, $$1, $$2, $$3);
   }

   public static egy a(egy $$0, egz.k.a $$1) {
      return egz.k.a($$1, $$0);
   }

   private static egy a(egy $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static egy b() {
      return egz.d.a;
   }

   public static egy c() {
      return egz.f.a;
   }

   public static egy a(egy $$0, egy $$1, egy $$2) {
      if ($$1 instanceof egz.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         egy $$4 = d($$0);
         egy $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static egy a(egy $$0, double $$1, egy $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(egz.y.a e, egy f, egy g, double h, double i) implements egz.y {
      @Override
      public double a(egy.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, egy.a $$1) {
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
      public egy a(egy.f $$0) {
         return $$0.apply(egz.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public egz.y.a j() {
         return this.e;
      }

      @Override
      public egy k() {
         return this.f;
      }

      @Override
      public egy l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements egy.d {
      private static final MapCodec<egz.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(efd.e * 2, efd.d * 2).fieldOf("from_y").forGetter(egz.aa::j),
                  Codec.intRange(efd.e * 2, efd.d * 2).fieldOf("to_y").forGetter(egz.aa::k),
                  egz.d.fieldOf("from_value").forGetter(egz.aa::l),
                  egz.d.fieldOf("to_value").forGetter(egz.aa::m)
               )
               .apply($$0, egz.aa::new)
      );
      public static final azj<egz.aa> a = egz.a(i);

      @Override
      public double a(egy.b $$0) {
         return azq.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public azj<? extends egy> c() {
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

   protected static enum b implements egz.c {
      a;

      @Override
      public double a(egy.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, egy.a $$1) {
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

   public interface c extends egy.d {
      azj<egy> e = azj.a(MapCodec.unit(egz.b.a));

      @Override
      default azj<? extends egy> c() {
         return e;
      }
   }

   protected static enum d implements egy.d {
      a;

      public static final azj<egy> e = azj.a(MapCodec.unit(a));

      @Override
      public double a(egy.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, egy.a $$1) {
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
      public azj<? extends egy> c() {
         return e;
      }
   }

   static record e(egy a) implements egz.x {
      static final azj<egz.e> e = egz.a(egz.e::new, egz.e::j);

      @Override
      public double a(egy.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public egy a(egy.f $$0) {
         return $$0.apply(new egz.e(this.a.a($$0)));
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
      public azj<? extends egy> c() {
         return e;
      }

      @Override
      public egy j() {
         return this.a;
      }
   }

   protected static enum f implements egy.d {
      a;

      public static final azj<egy> e = azj.a(MapCodec.unit(a));

      @Override
      public double a(egy.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, egy.a $$1) {
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
      public azj<? extends egy> c() {
         return e;
      }
   }

   protected static record g(egy e, double f, double g) implements egz.p {
      private static final MapCodec<egz.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(egy.b.fieldOf("input").forGetter(egz.g::aE_), egz.d.fieldOf("min").forGetter(egz.g::a), egz.d.fieldOf("max").forGetter(egz.g::b))
               .apply($$0, egz.g::new)
      );
      public static final azj<egz.g> a = egz.a(h);

      @Override
      public double a(double $$0) {
         return azq.a($$0, this.f, this.g);
      }

      @Override
      public egy a(egy.f $$0) {
         return new egz.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public azj<? extends egy> c() {
         return a;
      }

      @Override
      public egy aE_() {
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

   static record h(double a) implements egy.d {
      static final azj<egz.h> e = egz.a(egz.d, egz.h::new, egz.h::j);
      static final egz.h f = new egz.h(0.0);

      @Override
      public void a(double[] $$0, egy.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public azj<? extends egy> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements egy.d {
      public static final azj<egz.i> a = azj.a(MapCodec.unit(new egz.i(0L)));
      private static final float e = -0.9F;
      private final eww f;

      public i(long $$0) {
         azz $$1 = new ehg($$0);
         $$1.b(17292);
         this.f = new eww($$1);
      }

      private static float a(eww $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - azq.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = azq.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (azq.e((float)$$10) * 3439.0F + azq.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - azq.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = azq.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(egy.b $$0) {
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
      public azj<? extends egy> c() {
         return a;
      }
   }

   @baz
   public static record j(jg<egy> a) implements egy {
      @Override
      public double a(egy.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, egy.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public egy a(egy.f $$0) {
         return $$0.apply(new egz.j(new jg.a<>(this.a.a().a($$0))));
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
      public azj<? extends egy> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jg<egy> j() {
         return this.a;
      }
   }

   protected static record k(egz.k.a a, egy e, double f, double g) implements egz.p {
      public static egz.k a(egz.k.a $$0, egy $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != egz.k.a.a && $$0 != egz.k.a.b ? new egz.k($$0, $$1, $$3, $$4) : new egz.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(egz.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = azq.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public egz.k b(egy.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public azj<? extends egy> c() {
         return this.a.h;
      }

      public egz.k.a k() {
         return this.a;
      }

      @Override
      public egy aE_() {
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

      static enum a implements bao {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final azj<egz.k> h = egz.a($$0x -> egz.k.a(this, $$0x), egz.k::aE_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(egz.l.a a, egy e) implements egz.m {
      @Override
      public double a(egy.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, egy.a $$1) {
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
      public egz.l.a j() {
         return this.a;
      }

      @Override
      public egy k() {
         return this.e;
      }

      static enum a implements bao {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final azj<egz.m> g = egz.a($$0x -> new egz.l(this, $$0x), egz.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends egy {
      egz.l.a j();

      egy k();

      @Override
      default azj<? extends egy> c() {
         return this.j().g;
      }

      @Override
      default egy a(egy.f $$0) {
         return $$0.apply(new egz.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(egz.n.a e, egy f, double g, double h, double i) implements egz.p, egz.y {
      @Override
      public egz.y.a j() {
         return this.e == egz.n.a.a ? egz.y.a.b : egz.y.a.a;
      }

      @Override
      public egy k() {
         return egz.a(this.i);
      }

      @Override
      public egy l() {
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
      public egy a(egy.f $$0) {
         egy $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == egz.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new egz.n(this.e, $$1, $$4, $$5, this.i);
      }

      public egz.n.a m() {
         return this.e;
      }

      @Override
      public egy aE_() {
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

   protected static record o(egy.c f, @Deprecated double g, double h) implements egy {
      public static final MapCodec<egz.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  egy.c.a.fieldOf("noise").forGetter(egz.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(egz.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(egz.o::l)
               )
               .apply($$0, egz.o::new)
      );
      public static final azj<egz.o> e = egz.a(a);

      @Override
      public double a(egy.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, egy.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public egy a(egy.f $$0) {
         return $$0.apply(new egz.o($$0.a(this.f), this.g, this.h));
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
      public azj<? extends egy> c() {
         return e;
      }

      public egy.c j() {
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

   interface p extends egy {
      egy aE_();

      @Override
      default double a(egy.b $$0) {
         return this.a(this.aE_().a($$0));
      }

      @Override
      default void a(double[] $$0, egy.a $$1) {
         this.aE_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(egy f, double g, double h, egy i, egy j) implements egy {
      public static final MapCodec<egz.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  egy.d.fieldOf("input").forGetter(egz.q::j),
                  egz.d.fieldOf("min_inclusive").forGetter(egz.q::k),
                  egz.d.fieldOf("max_exclusive").forGetter(egz.q::l),
                  egy.d.fieldOf("when_in_range").forGetter(egz.q::m),
                  egy.d.fieldOf("when_out_of_range").forGetter(egz.q::n)
               )
               .apply($$0, egz.q::new)
      );
      public static final azj<egz.q> e = egz.a(a);

      @Override
      public double a(egy.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, egy.a $$1) {
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
      public egy a(egy.f $$0) {
         return $$0.apply(new egz.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public azj<? extends egy> c() {
         return e;
      }

      public egy j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public egy m() {
         return this.i;
      }

      public egy n() {
         return this.j;
      }
   }

   protected static record r(egy.c a) implements egz.u {
      static final azj<egz.r> e = egz.a(egy.c.a, egz.r::new, egz.r::j);

      @Override
      public double a(egy.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public egy a(egy.f $$0) {
         return $$0.apply(new egz.r($$0.a(this.a)));
      }

      @Override
      public azj<? extends egy> c() {
         return e;
      }

      @Override
      public egy.c j() {
         return this.a;
      }
   }

   protected static record s(egy.c a) implements egz.u {
      static final azj<egz.s> e = egz.a(egy.c.a, egz.s::new, egz.s::j);

      @Override
      public double a(egy.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public egy a(egy.f $$0) {
         return $$0.apply(new egz.s($$0.a(this.a)));
      }

      @Override
      public azj<? extends egy> c() {
         return e;
      }

      @Override
      public egy.c j() {
         return this.a;
      }
   }

   protected static record t(egy.c a) implements egz.u {
      static final azj<egz.t> e = egz.a(egy.c.a, egz.t::new, egz.t::j);

      @Override
      public double a(egy.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public egy a(egy.f $$0) {
         return $$0.apply(new egz.t($$0.a(this.a)));
      }

      @Override
      public azj<? extends egy> c() {
         return e;
      }

      @Override
      public egy.c j() {
         return this.a;
      }
   }

   interface u extends egy {
      egy.c j();

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
      default void a(double[] $$0, egy.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(egy e, egy f, egy g, double h, double i, egy.c j) implements egy {
      private static final MapCodec<egz.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  egy.d.fieldOf("shift_x").forGetter(egz.v::j),
                  egy.d.fieldOf("shift_y").forGetter(egz.v::k),
                  egy.d.fieldOf("shift_z").forGetter(egz.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(egz.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(egz.v::n),
                  egy.c.a.fieldOf("noise").forGetter(egz.v::o)
               )
               .apply($$0, egz.v::new)
      );
      public static final azj<egz.v> a = egz.a(k);

      @Override
      public double a(egy.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, egy.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public egy a(egy.f $$0) {
         return $$0.apply(new egz.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public azj<? extends egy> c() {
         return a;
      }

      public egy j() {
         return this.e;
      }

      public egy k() {
         return this.f;
      }

      public egy l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public egy.c o() {
         return this.j;
      }
   }

   public static record w(ayr<egz.w.b, egz.w.a> e) implements egy {
      private static final Codec<ayr<egz.w.b, egz.w.a>> f = ayr.a(egz.w.a.b);
      private static final MapCodec<egz.w> g = f.fieldOf("spline").xmap(egz.w::new, egz.w::j);
      public static final azj<egz.w> a = egz.a(g);

      @Override
      public double a(egy.b $$0) {
         return (double)this.e.a(new egz.w.b($$0));
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
      public void a(double[] $$0, egy.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public egy a(egy.f $$0) {
         return $$0.apply(new egz.w(this.e.a((ayr.d<egz.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public azj<? extends egy> c() {
         return a;
      }

      public ayr<egz.w.b, egz.w.a> j() {
         return this.e;
      }

      public static record a(jg<egy> c) implements bav<egz.w.b> {
         public static final Codec<egz.w.a> b = egy.c.xmap(egz.w.a::new, egz.w.a::a);

         @Override
         public String toString() {
            Optional<alj<egy>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               alj<egy> $$1 = $$0.get();
               if ($$1 == ehm.d) {
                  return "continents";
               }

               if ($$1 == ehm.e) {
                  return "erosion";
               }

               if ($$1 == ehm.f) {
                  return "weirdness";
               }

               if ($$1 == ehm.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(egz.w.b $$0) {
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

         public egz.w.a a(egy.f $$0) {
            return new egz.w.a(new jg.a<>(this.c.a().a($$0)));
         }

         public jg<egy> a() {
            return this.c;
         }
      }

      public static record b(egy.b a) {
      }
   }

   interface x extends egy {
      egy j();

      @Override
      default double a(egy.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, egy.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(egy.b var1, double var2);
   }

   interface y extends egy {
      Logger a = LogUtils.getLogger();

      static egz.y a(egz.y.a $$0, egy $$1, egy $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == egz.y.a.c || $$0 == egz.y.a.d) {
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
         if ($$0 == egz.y.a.b || $$0 == egz.y.a.a) {
            if ($$1 instanceof egz.h $$11) {
               return new egz.n($$0 == egz.y.a.a ? egz.n.a.b : egz.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof egz.h $$12) {
               return new egz.n($$0 == egz.y.a.a ? egz.n.a.b : egz.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new egz.a($$0, $$1, $$2, $$9, $$10);
      }

      egz.y.a j();

      egy k();

      egy l();

      @Override
      default azj<? extends egy> c() {
         return this.j().e;
      }

      public static enum a implements bao {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final azj<egz.y> e = egz.a((BiFunction<egy, egy, egz.y>)(($$0x, $$1) -> egz.y.a(this, $$0x, $$1)), egz.y::k, egz.y::l);
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

   protected static record z(egy e, egy.c f, egz.z.a g) implements egz.x {
      private static final MapCodec<egz.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  egy.d.fieldOf("input").forGetter(egz.z::j),
                  egy.c.a.fieldOf("noise").forGetter(egz.z::k),
                  egz.z.a.c.fieldOf("rarity_value_mapper").forGetter(egz.z::l)
               )
               .apply($$0, egz.z::new)
      );
      public static final azj<egz.z> a = egz.a(h);

      @Override
      public double a(egy.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public egy a(egy.f $$0) {
         return $$0.apply(new egz.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public azj<? extends egy> c() {
         return a;
      }

      @Override
      public egy j() {
         return this.e;
      }

      public egy.c k() {
         return this.f;
      }

      public egz.z.a l() {
         return this.g;
      }

      public static enum a implements bao {
         a("type_1", ehm.a::b, 2.0),
         b("type_2", ehm.a::a, 3.0);

         public static final Codec<egz.z.a> c = bao.a(egz.z.a::values);
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
