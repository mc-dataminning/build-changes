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

public final class eat {
   private static final Codec<eas> c = lx.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<eas> b = Codec.either(d, c)
      .xmap($$0 -> (eas)$$0.map(eat::a, Function.identity()), $$0 -> $$0 instanceof eat.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends eas> a(kc<MapCodec<? extends eas>> $$0) {
      a($$0, "blend_alpha", eat.d.e);
      a($$0, "blend_offset", eat.f.e);
      a($$0, "beardifier", eat.b.e);
      a($$0, "old_blended_noise", eqe.a);

      for (eat.l.a $$1 : eat.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", eat.o.e);
      a($$0, "end_islands", eat.i.a);
      a($$0, "weird_scaled_sampler", eat.z.a);
      a($$0, "shifted_noise", eat.v.a);
      a($$0, "range_choice", eat.q.e);
      a($$0, "shift_a", eat.s.e);
      a($$0, "shift_b", eat.t.e);
      a($$0, "shift", eat.r.e);
      a($$0, "blend_density", eat.e.e);
      a($$0, "clamp", eat.g.a);

      for (eat.k.a $$2 : eat.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (eat.y.a $$3 : eat.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", eat.w.a);
      a($$0, "constant", eat.h.e);
      return a($$0, "y_clamped_gradient", eat.aa.a);
   }

   private static MapCodec<? extends eas> a(kc<MapCodec<? extends eas>> $$0, String $$1, azc<? extends eas> $$2) {
      return kc.a($$0, $$1, $$2.a());
   }

   static <A, O> azc<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return azc.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> azc<O> a(Function<eas, O> $$0, Function<O, eas> $$1) {
      return a(eas.d, $$0, $$1);
   }

   static <O> azc<O> a(BiFunction<eas, eas, O> $$0, Function<O, eas> $$1, Function<O, eas> $$2) {
      return azc.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(eas.d.fieldOf("argument1").forGetter($$1), eas.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> azc<O> a(MapCodec<O> $$0) {
      return azc.a($$0);
   }

   private eat() {
   }

   public static eas a(eas $$0) {
      return new eat.l(eat.l.a.a, $$0);
   }

   public static eas b(eas $$0) {
      return new eat.l(eat.l.a.b, $$0);
   }

   public static eas c(eas $$0) {
      return new eat.l(eat.l.a.c, $$0);
   }

   public static eas d(eas $$0) {
      return new eat.l(eat.l.a.d, $$0);
   }

   public static eas e(eas $$0) {
      return new eat.l(eat.l.a.e, $$0);
   }

   public static eas a(jp<eqh.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new eat.o(new eas.c($$0), $$1, $$2), $$3, $$4);
   }

   public static eas a(jp<eqh.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static eas a(jp<eqh.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static eas a(eas $$0, eas $$1, double $$2, jp<eqh.a> $$3) {
      return new eat.v($$0, a(), $$1, $$2, 0.0, new eas.c($$3));
   }

   public static eas a(jp<eqh.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static eas b(jp<eqh.a> $$0, double $$1, double $$2) {
      return new eat.o(new eas.c($$0), $$1, $$2);
   }

   public static eas a(jp<eqh.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static eas a(eas $$0, double $$1, double $$2, eas $$3, eas $$4) {
      return new eat.q($$0, $$1, $$2, $$3, $$4);
   }

   public static eas b(jp<eqh.a> $$0) {
      return new eat.s(new eas.c($$0));
   }

   public static eas c(jp<eqh.a> $$0) {
      return new eat.t(new eas.c($$0));
   }

   public static eas d(jp<eqh.a> $$0) {
      return new eat.r(new eas.c($$0));
   }

   public static eas f(eas $$0) {
      return new eat.e($$0);
   }

   public static eas a(long $$0) {
      return new eat.i($$0);
   }

   public static eas a(eas $$0, jp<eqh.a> $$1, eat.z.a $$2) {
      return new eat.z($$0, new eas.c($$1), $$2);
   }

   public static eas a(eas $$0, eas $$1) {
      return eat.y.a(eat.y.a.a, $$0, $$1);
   }

   public static eas b(eas $$0, eas $$1) {
      return eat.y.a(eat.y.a.b, $$0, $$1);
   }

   public static eas c(eas $$0, eas $$1) {
      return eat.y.a(eat.y.a.c, $$0, $$1);
   }

   public static eas d(eas $$0, eas $$1) {
      return eat.y.a(eat.y.a.d, $$0, $$1);
   }

   public static eas a(ayl<eat.w.b, eat.w.a> $$0) {
      return new eat.w($$0);
   }

   public static eas a() {
      return eat.h.f;
   }

   public static eas a(double $$0) {
      return new eat.h($$0);
   }

   public static eas a(int $$0, int $$1, double $$2, double $$3) {
      return new eat.aa($$0, $$1, $$2, $$3);
   }

   public static eas a(eas $$0, eat.k.a $$1) {
      return eat.k.a($$1, $$0);
   }

   private static eas a(eas $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static eas b() {
      return eat.d.a;
   }

   public static eas c() {
      return eat.f.a;
   }

   public static eas a(eas $$0, eas $$1, eas $$2) {
      if ($$1 instanceof eat.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         eas $$4 = d($$0);
         eas $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static eas a(eas $$0, double $$1, eas $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(eat.y.a e, eas f, eas g, double h, double i) implements eat.y {
      @Override
      public double a(eas.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, eas.a $$1) {
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
      public eas a(eas.f $$0) {
         return $$0.apply(eat.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public eat.y.a j() {
         return this.e;
      }

      @Override
      public eas k() {
         return this.f;
      }

      @Override
      public eas l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements eas.d {
      private static final MapCodec<eat.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dyz.e * 2, dyz.d * 2).fieldOf("from_y").forGetter(eat.aa::j),
                  Codec.intRange(dyz.e * 2, dyz.d * 2).fieldOf("to_y").forGetter(eat.aa::k),
                  eat.d.fieldOf("from_value").forGetter(eat.aa::l),
                  eat.d.fieldOf("to_value").forGetter(eat.aa::m)
               )
               .apply($$0, eat.aa::new)
      );
      public static final azc<eat.aa> a = eat.a(i);

      @Override
      public double a(eas.b $$0) {
         return azj.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public azc<? extends eas> c() {
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

   protected static enum b implements eat.c {
      a;

      @Override
      public double a(eas.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, eas.a $$1) {
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

   public interface c extends eas.d {
      azc<eas> e = azc.a(MapCodec.unit(eat.b.a));

      @Override
      default azc<? extends eas> c() {
         return e;
      }
   }

   protected static enum d implements eas.d {
      a;

      public static final azc<eas> e = azc.a(MapCodec.unit(a));

      @Override
      public double a(eas.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, eas.a $$1) {
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
      public azc<? extends eas> c() {
         return e;
      }
   }

   static record e(eas a) implements eat.x {
      static final azc<eat.e> e = eat.a(eat.e::new, eat.e::j);

      @Override
      public double a(eas.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public eas a(eas.f $$0) {
         return $$0.apply(new eat.e(this.a.a($$0)));
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
      public azc<? extends eas> c() {
         return e;
      }

      @Override
      public eas j() {
         return this.a;
      }
   }

   protected static enum f implements eas.d {
      a;

      public static final azc<eas> e = azc.a(MapCodec.unit(a));

      @Override
      public double a(eas.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, eas.a $$1) {
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
      public azc<? extends eas> c() {
         return e;
      }
   }

   protected static record g(eas e, double f, double g) implements eat.p {
      private static final MapCodec<eat.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(eas.b.fieldOf("input").forGetter(eat.g::aF_), eat.d.fieldOf("min").forGetter(eat.g::a), eat.d.fieldOf("max").forGetter(eat.g::b))
               .apply($$0, eat.g::new)
      );
      public static final azc<eat.g> a = eat.a(h);

      @Override
      public double a(double $$0) {
         return azj.a($$0, this.f, this.g);
      }

      @Override
      public eas a(eas.f $$0) {
         return new eat.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public azc<? extends eas> c() {
         return a;
      }

      @Override
      public eas aF_() {
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

   static record h(double a) implements eas.d {
      static final azc<eat.h> e = eat.a(eat.d, eat.h::new, eat.h::j);
      static final eat.h f = new eat.h(0.0);

      @Override
      public void a(double[] $$0, eas.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public azc<? extends eas> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements eas.d {
      public static final azc<eat.i> a = azc.a(MapCodec.unit(new eat.i(0L)));
      private static final float e = -0.9F;
      private final eqk f;

      public i(long $$0) {
         azr $$1 = new eba($$0);
         $$1.b(17292);
         this.f = new eqk($$1);
      }

      private static float a(eqk $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - azj.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = azj.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (azj.e((float)$$10) * 3439.0F + azj.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - azj.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = azj.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(eas.b $$0) {
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
      public azc<? extends eas> c() {
         return a;
      }
   }

   @bap
   public static record j(jp<eas> a) implements eas {
      @Override
      public double a(eas.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, eas.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public eas a(eas.f $$0) {
         return $$0.apply(new eat.j(new jp.a<>(this.a.a().a($$0))));
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
      public azc<? extends eas> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jp<eas> j() {
         return this.a;
      }
   }

   protected static record k(eat.k.a a, eas e, double f, double g) implements eat.p {
      public static eat.k a(eat.k.a $$0, eas $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != eat.k.a.a && $$0 != eat.k.a.b ? new eat.k($$0, $$1, $$3, $$4) : new eat.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(eat.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = azj.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public eat.k b(eas.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public azc<? extends eas> c() {
         return this.a.h;
      }

      public eat.k.a k() {
         return this.a;
      }

      @Override
      public eas aF_() {
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

      static enum a implements baf {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final azc<eat.k> h = eat.a($$0x -> eat.k.a(this, $$0x), eat.k::aF_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(eat.l.a a, eas e) implements eat.m {
      @Override
      public double a(eas.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, eas.a $$1) {
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
      public eat.l.a j() {
         return this.a;
      }

      @Override
      public eas k() {
         return this.e;
      }

      static enum a implements baf {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final azc<eat.m> g = eat.a($$0x -> new eat.l(this, $$0x), eat.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends eas {
      eat.l.a j();

      eas k();

      @Override
      default azc<? extends eas> c() {
         return this.j().g;
      }

      @Override
      default eas a(eas.f $$0) {
         return $$0.apply(new eat.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(eat.n.a e, eas f, double g, double h, double i) implements eat.p, eat.y {
      @Override
      public eat.y.a j() {
         return this.e == eat.n.a.a ? eat.y.a.b : eat.y.a.a;
      }

      @Override
      public eas k() {
         return eat.a(this.i);
      }

      @Override
      public eas l() {
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
      public eas a(eas.f $$0) {
         eas $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == eat.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new eat.n(this.e, $$1, $$4, $$5, this.i);
      }

      public eat.n.a m() {
         return this.e;
      }

      @Override
      public eas aF_() {
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

   protected static record o(eas.c f, @Deprecated double g, double h) implements eas {
      public static final MapCodec<eat.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eas.c.a.fieldOf("noise").forGetter(eat.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(eat.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(eat.o::l)
               )
               .apply($$0, eat.o::new)
      );
      public static final azc<eat.o> e = eat.a(a);

      @Override
      public double a(eas.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, eas.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eas a(eas.f $$0) {
         return $$0.apply(new eat.o($$0.a(this.f), this.g, this.h));
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
      public azc<? extends eas> c() {
         return e;
      }

      public eas.c j() {
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

   interface p extends eas {
      eas aF_();

      @Override
      default double a(eas.b $$0) {
         return this.a(this.aF_().a($$0));
      }

      @Override
      default void a(double[] $$0, eas.a $$1) {
         this.aF_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(eas f, double g, double h, eas i, eas j) implements eas {
      public static final MapCodec<eat.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eas.d.fieldOf("input").forGetter(eat.q::j),
                  eat.d.fieldOf("min_inclusive").forGetter(eat.q::k),
                  eat.d.fieldOf("max_exclusive").forGetter(eat.q::l),
                  eas.d.fieldOf("when_in_range").forGetter(eat.q::m),
                  eas.d.fieldOf("when_out_of_range").forGetter(eat.q::n)
               )
               .apply($$0, eat.q::new)
      );
      public static final azc<eat.q> e = eat.a(a);

      @Override
      public double a(eas.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, eas.a $$1) {
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
      public eas a(eas.f $$0) {
         return $$0.apply(new eat.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public azc<? extends eas> c() {
         return e;
      }

      public eas j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public eas m() {
         return this.i;
      }

      public eas n() {
         return this.j;
      }
   }

   protected static record r(eas.c a) implements eat.u {
      static final azc<eat.r> e = eat.a(eas.c.a, eat.r::new, eat.r::j);

      @Override
      public double a(eas.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public eas a(eas.f $$0) {
         return $$0.apply(new eat.r($$0.a(this.a)));
      }

      @Override
      public azc<? extends eas> c() {
         return e;
      }

      @Override
      public eas.c j() {
         return this.a;
      }
   }

   protected static record s(eas.c a) implements eat.u {
      static final azc<eat.s> e = eat.a(eas.c.a, eat.s::new, eat.s::j);

      @Override
      public double a(eas.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public eas a(eas.f $$0) {
         return $$0.apply(new eat.s($$0.a(this.a)));
      }

      @Override
      public azc<? extends eas> c() {
         return e;
      }

      @Override
      public eas.c j() {
         return this.a;
      }
   }

   protected static record t(eas.c a) implements eat.u {
      static final azc<eat.t> e = eat.a(eas.c.a, eat.t::new, eat.t::j);

      @Override
      public double a(eas.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public eas a(eas.f $$0) {
         return $$0.apply(new eat.t($$0.a(this.a)));
      }

      @Override
      public azc<? extends eas> c() {
         return e;
      }

      @Override
      public eas.c j() {
         return this.a;
      }
   }

   interface u extends eas {
      eas.c j();

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
      default void a(double[] $$0, eas.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(eas e, eas f, eas g, double h, double i, eas.c j) implements eas {
      private static final MapCodec<eat.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eas.d.fieldOf("shift_x").forGetter(eat.v::j),
                  eas.d.fieldOf("shift_y").forGetter(eat.v::k),
                  eas.d.fieldOf("shift_z").forGetter(eat.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(eat.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(eat.v::n),
                  eas.c.a.fieldOf("noise").forGetter(eat.v::o)
               )
               .apply($$0, eat.v::new)
      );
      public static final azc<eat.v> a = eat.a(k);

      @Override
      public double a(eas.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, eas.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eas a(eas.f $$0) {
         return $$0.apply(new eat.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public azc<? extends eas> c() {
         return a;
      }

      public eas j() {
         return this.e;
      }

      public eas k() {
         return this.f;
      }

      public eas l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public eas.c o() {
         return this.j;
      }
   }

   public static record w(ayl<eat.w.b, eat.w.a> e) implements eas {
      private static final Codec<ayl<eat.w.b, eat.w.a>> f = ayl.a(eat.w.a.b);
      private static final MapCodec<eat.w> g = f.fieldOf("spline").xmap(eat.w::new, eat.w::j);
      public static final azc<eat.w> a = eat.a(g);

      @Override
      public double a(eas.b $$0) {
         return (double)this.e.a(new eat.w.b($$0));
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
      public void a(double[] $$0, eas.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eas a(eas.f $$0) {
         return $$0.apply(new eat.w(this.e.a((ayl.d<eat.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public azc<? extends eas> c() {
         return a;
      }

      public ayl<eat.w.b, eat.w.a> j() {
         return this.e;
      }

      public static record a(jp<eas> c) implements bal<eat.w.b> {
         public static final Codec<eat.w.a> b = eas.c.xmap(eat.w.a::new, eat.w.a::a);

         @Override
         public String toString() {
            Optional<alg<eas>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               alg<eas> $$1 = $$0.get();
               if ($$1 == ebg.d) {
                  return "continents";
               }

               if ($$1 == ebg.e) {
                  return "erosion";
               }

               if ($$1 == ebg.f) {
                  return "weirdness";
               }

               if ($$1 == ebg.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(eat.w.b $$0) {
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

         public eat.w.a a(eas.f $$0) {
            return new eat.w.a(new jp.a<>(this.c.a().a($$0)));
         }

         public jp<eas> a() {
            return this.c;
         }
      }

      public static record b(eas.b a) {
      }
   }

   interface x extends eas {
      eas j();

      @Override
      default double a(eas.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, eas.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(eas.b var1, double var2);
   }

   interface y extends eas {
      Logger a = LogUtils.getLogger();

      static eat.y a(eat.y.a $$0, eas $$1, eas $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == eat.y.a.c || $$0 == eat.y.a.d) {
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
         if ($$0 == eat.y.a.b || $$0 == eat.y.a.a) {
            if ($$1 instanceof eat.h $$11) {
               return new eat.n($$0 == eat.y.a.a ? eat.n.a.b : eat.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof eat.h $$12) {
               return new eat.n($$0 == eat.y.a.a ? eat.n.a.b : eat.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new eat.a($$0, $$1, $$2, $$9, $$10);
      }

      eat.y.a j();

      eas k();

      eas l();

      @Override
      default azc<? extends eas> c() {
         return this.j().e;
      }

      public static enum a implements baf {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final azc<eat.y> e = eat.a((BiFunction<eas, eas, eat.y>)(($$0x, $$1) -> eat.y.a(this, $$0x, $$1)), eat.y::k, eat.y::l);
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

   protected static record z(eas e, eas.c f, eat.z.a g) implements eat.x {
      private static final MapCodec<eat.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eas.d.fieldOf("input").forGetter(eat.z::j),
                  eas.c.a.fieldOf("noise").forGetter(eat.z::k),
                  eat.z.a.c.fieldOf("rarity_value_mapper").forGetter(eat.z::l)
               )
               .apply($$0, eat.z::new)
      );
      public static final azc<eat.z> a = eat.a(h);

      @Override
      public double a(eas.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public eas a(eas.f $$0) {
         return $$0.apply(new eat.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public azc<? extends eas> c() {
         return a;
      }

      @Override
      public eas j() {
         return this.e;
      }

      public eas.c k() {
         return this.f;
      }

      public eat.z.a l() {
         return this.g;
      }

      public static enum a implements baf {
         a("type_1", ebg.a::b, 2.0),
         b("type_2", ebg.a::a, 3.0);

         public static final Codec<eat.z.a> c = baf.a(eat.z.a::values);
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
