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

public final class eef {
   private static final Codec<eee> c = md.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<eee> b = Codec.either(d, c)
      .xmap($$0 -> (eee)$$0.map(eef::a, Function.identity()), $$0 -> $$0 instanceof eef.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends eee> a(kf<MapCodec<? extends eee>> $$0) {
      a($$0, "blend_alpha", eef.d.e);
      a($$0, "blend_offset", eef.f.e);
      a($$0, "beardifier", eef.b.e);
      a($$0, "old_blended_noise", ett.a);

      for (eef.l.a $$1 : eef.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", eef.o.e);
      a($$0, "end_islands", eef.i.a);
      a($$0, "weird_scaled_sampler", eef.z.a);
      a($$0, "shifted_noise", eef.v.a);
      a($$0, "range_choice", eef.q.e);
      a($$0, "shift_a", eef.s.e);
      a($$0, "shift_b", eef.t.e);
      a($$0, "shift", eef.r.e);
      a($$0, "blend_density", eef.e.e);
      a($$0, "clamp", eef.g.a);

      for (eef.k.a $$2 : eef.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (eef.y.a $$3 : eef.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", eef.w.a);
      a($$0, "constant", eef.h.e);
      return a($$0, "y_clamped_gradient", eef.aa.a);
   }

   private static MapCodec<? extends eee> a(kf<MapCodec<? extends eee>> $$0, String $$1, azd<? extends eee> $$2) {
      return kf.a($$0, $$1, $$2.a());
   }

   static <A, O> azd<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return azd.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> azd<O> a(Function<eee, O> $$0, Function<O, eee> $$1) {
      return a(eee.d, $$0, $$1);
   }

   static <O> azd<O> a(BiFunction<eee, eee, O> $$0, Function<O, eee> $$1, Function<O, eee> $$2) {
      return azd.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(eee.d.fieldOf("argument1").forGetter($$1), eee.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> azd<O> a(MapCodec<O> $$0) {
      return azd.a($$0);
   }

   private eef() {
   }

   public static eee a(eee $$0) {
      return new eef.l(eef.l.a.a, $$0);
   }

   public static eee b(eee $$0) {
      return new eef.l(eef.l.a.b, $$0);
   }

   public static eee c(eee $$0) {
      return new eef.l(eef.l.a.c, $$0);
   }

   public static eee d(eee $$0) {
      return new eef.l(eef.l.a.d, $$0);
   }

   public static eee e(eee $$0) {
      return new eef.l(eef.l.a.e, $$0);
   }

   public static eee a(js<etw.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new eef.o(new eee.c($$0), $$1, $$2), $$3, $$4);
   }

   public static eee a(js<etw.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static eee a(js<etw.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static eee a(eee $$0, eee $$1, double $$2, js<etw.a> $$3) {
      return new eef.v($$0, a(), $$1, $$2, 0.0, new eee.c($$3));
   }

   public static eee a(js<etw.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static eee b(js<etw.a> $$0, double $$1, double $$2) {
      return new eef.o(new eee.c($$0), $$1, $$2);
   }

   public static eee a(js<etw.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static eee a(eee $$0, double $$1, double $$2, eee $$3, eee $$4) {
      return new eef.q($$0, $$1, $$2, $$3, $$4);
   }

   public static eee b(js<etw.a> $$0) {
      return new eef.s(new eee.c($$0));
   }

   public static eee c(js<etw.a> $$0) {
      return new eef.t(new eee.c($$0));
   }

   public static eee d(js<etw.a> $$0) {
      return new eef.r(new eee.c($$0));
   }

   public static eee f(eee $$0) {
      return new eef.e($$0);
   }

   public static eee a(long $$0) {
      return new eef.i($$0);
   }

   public static eee a(eee $$0, js<etw.a> $$1, eef.z.a $$2) {
      return new eef.z($$0, new eee.c($$1), $$2);
   }

   public static eee a(eee $$0, eee $$1) {
      return eef.y.a(eef.y.a.a, $$0, $$1);
   }

   public static eee b(eee $$0, eee $$1) {
      return eef.y.a(eef.y.a.b, $$0, $$1);
   }

   public static eee c(eee $$0, eee $$1) {
      return eef.y.a(eef.y.a.c, $$0, $$1);
   }

   public static eee d(eee $$0, eee $$1) {
      return eef.y.a(eef.y.a.d, $$0, $$1);
   }

   public static eee a(ayl<eef.w.b, eef.w.a> $$0) {
      return new eef.w($$0);
   }

   public static eee a() {
      return eef.h.f;
   }

   public static eee a(double $$0) {
      return new eef.h($$0);
   }

   public static eee a(int $$0, int $$1, double $$2, double $$3) {
      return new eef.aa($$0, $$1, $$2, $$3);
   }

   public static eee a(eee $$0, eef.k.a $$1) {
      return eef.k.a($$1, $$0);
   }

   private static eee a(eee $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static eee b() {
      return eef.d.a;
   }

   public static eee c() {
      return eef.f.a;
   }

   public static eee a(eee $$0, eee $$1, eee $$2) {
      if ($$1 instanceof eef.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         eee $$4 = d($$0);
         eee $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static eee a(eee $$0, double $$1, eee $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(eef.y.a e, eee f, eee g, double h, double i) implements eef.y {
      @Override
      public double a(eee.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, eee.a $$1) {
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
      public eee a(eee.f $$0) {
         return $$0.apply(eef.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public eef.y.a j() {
         return this.e;
      }

      @Override
      public eee k() {
         return this.f;
      }

      @Override
      public eee l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements eee.d {
      private static final MapCodec<eef.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(ecj.e * 2, ecj.d * 2).fieldOf("from_y").forGetter(eef.aa::j),
                  Codec.intRange(ecj.e * 2, ecj.d * 2).fieldOf("to_y").forGetter(eef.aa::k),
                  eef.d.fieldOf("from_value").forGetter(eef.aa::l),
                  eef.d.fieldOf("to_value").forGetter(eef.aa::m)
               )
               .apply($$0, eef.aa::new)
      );
      public static final azd<eef.aa> a = eef.a(i);

      @Override
      public double a(eee.b $$0) {
         return azk.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public azd<? extends eee> c() {
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

   protected static enum b implements eef.c {
      a;

      @Override
      public double a(eee.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, eee.a $$1) {
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

   public interface c extends eee.d {
      azd<eee> e = azd.a(MapCodec.unit(eef.b.a));

      @Override
      default azd<? extends eee> c() {
         return e;
      }
   }

   protected static enum d implements eee.d {
      a;

      public static final azd<eee> e = azd.a(MapCodec.unit(a));

      @Override
      public double a(eee.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, eee.a $$1) {
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
      public azd<? extends eee> c() {
         return e;
      }
   }

   static record e(eee a) implements eef.x {
      static final azd<eef.e> e = eef.a(eef.e::new, eef.e::j);

      @Override
      public double a(eee.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public eee a(eee.f $$0) {
         return $$0.apply(new eef.e(this.a.a($$0)));
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
      public azd<? extends eee> c() {
         return e;
      }

      @Override
      public eee j() {
         return this.a;
      }
   }

   protected static enum f implements eee.d {
      a;

      public static final azd<eee> e = azd.a(MapCodec.unit(a));

      @Override
      public double a(eee.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, eee.a $$1) {
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
      public azd<? extends eee> c() {
         return e;
      }
   }

   protected static record g(eee e, double f, double g) implements eef.p {
      private static final MapCodec<eef.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(eee.b.fieldOf("input").forGetter(eef.g::az_), eef.d.fieldOf("min").forGetter(eef.g::a), eef.d.fieldOf("max").forGetter(eef.g::b))
               .apply($$0, eef.g::new)
      );
      public static final azd<eef.g> a = eef.a(h);

      @Override
      public double a(double $$0) {
         return azk.a($$0, this.f, this.g);
      }

      @Override
      public eee a(eee.f $$0) {
         return new eef.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public azd<? extends eee> c() {
         return a;
      }

      @Override
      public eee az_() {
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

   static record h(double a) implements eee.d {
      static final azd<eef.h> e = eef.a(eef.d, eef.h::new, eef.h::j);
      static final eef.h f = new eef.h(0.0);

      @Override
      public void a(double[] $$0, eee.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public azd<? extends eee> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements eee.d {
      public static final azd<eef.i> a = azd.a(MapCodec.unit(new eef.i(0L)));
      private static final float e = -0.9F;
      private final etz f;

      public i(long $$0) {
         azs $$1 = new eem($$0);
         $$1.b(17292);
         this.f = new etz($$1);
      }

      private static float a(etz $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - azk.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = azk.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (azk.e((float)$$10) * 3439.0F + azk.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - azk.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = azk.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(eee.b $$0) {
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
      public azd<? extends eee> c() {
         return a;
      }
   }

   @bar
   public static record j(js<eee> a) implements eee {
      @Override
      public double a(eee.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, eee.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public eee a(eee.f $$0) {
         return $$0.apply(new eef.j(new js.a<>(this.a.a().a($$0))));
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
      public azd<? extends eee> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public js<eee> j() {
         return this.a;
      }
   }

   protected static record k(eef.k.a a, eee e, double f, double g) implements eef.p {
      public static eef.k a(eef.k.a $$0, eee $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != eef.k.a.a && $$0 != eef.k.a.b ? new eef.k($$0, $$1, $$3, $$4) : new eef.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(eef.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = azk.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public eef.k b(eee.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public azd<? extends eee> c() {
         return this.a.h;
      }

      public eef.k.a k() {
         return this.a;
      }

      @Override
      public eee az_() {
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

      static enum a implements bag {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final azd<eef.k> h = eef.a($$0x -> eef.k.a(this, $$0x), eef.k::az_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(eef.l.a a, eee e) implements eef.m {
      @Override
      public double a(eee.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, eee.a $$1) {
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
      public eef.l.a j() {
         return this.a;
      }

      @Override
      public eee k() {
         return this.e;
      }

      static enum a implements bag {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final azd<eef.m> g = eef.a($$0x -> new eef.l(this, $$0x), eef.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends eee {
      eef.l.a j();

      eee k();

      @Override
      default azd<? extends eee> c() {
         return this.j().g;
      }

      @Override
      default eee a(eee.f $$0) {
         return $$0.apply(new eef.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(eef.n.a e, eee f, double g, double h, double i) implements eef.p, eef.y {
      @Override
      public eef.y.a j() {
         return this.e == eef.n.a.a ? eef.y.a.b : eef.y.a.a;
      }

      @Override
      public eee k() {
         return eef.a(this.i);
      }

      @Override
      public eee l() {
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
      public eee a(eee.f $$0) {
         eee $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == eef.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new eef.n(this.e, $$1, $$4, $$5, this.i);
      }

      public eef.n.a m() {
         return this.e;
      }

      @Override
      public eee az_() {
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

   protected static record o(eee.c f, @Deprecated double g, double h) implements eee {
      public static final MapCodec<eef.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eee.c.a.fieldOf("noise").forGetter(eef.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(eef.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(eef.o::l)
               )
               .apply($$0, eef.o::new)
      );
      public static final azd<eef.o> e = eef.a(a);

      @Override
      public double a(eee.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, eee.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eee a(eee.f $$0) {
         return $$0.apply(new eef.o($$0.a(this.f), this.g, this.h));
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
      public azd<? extends eee> c() {
         return e;
      }

      public eee.c j() {
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

   interface p extends eee {
      eee az_();

      @Override
      default double a(eee.b $$0) {
         return this.a(this.az_().a($$0));
      }

      @Override
      default void a(double[] $$0, eee.a $$1) {
         this.az_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(eee f, double g, double h, eee i, eee j) implements eee {
      public static final MapCodec<eef.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eee.d.fieldOf("input").forGetter(eef.q::j),
                  eef.d.fieldOf("min_inclusive").forGetter(eef.q::k),
                  eef.d.fieldOf("max_exclusive").forGetter(eef.q::l),
                  eee.d.fieldOf("when_in_range").forGetter(eef.q::m),
                  eee.d.fieldOf("when_out_of_range").forGetter(eef.q::n)
               )
               .apply($$0, eef.q::new)
      );
      public static final azd<eef.q> e = eef.a(a);

      @Override
      public double a(eee.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, eee.a $$1) {
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
      public eee a(eee.f $$0) {
         return $$0.apply(new eef.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public azd<? extends eee> c() {
         return e;
      }

      public eee j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public eee m() {
         return this.i;
      }

      public eee n() {
         return this.j;
      }
   }

   protected static record r(eee.c a) implements eef.u {
      static final azd<eef.r> e = eef.a(eee.c.a, eef.r::new, eef.r::j);

      @Override
      public double a(eee.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public eee a(eee.f $$0) {
         return $$0.apply(new eef.r($$0.a(this.a)));
      }

      @Override
      public azd<? extends eee> c() {
         return e;
      }

      @Override
      public eee.c j() {
         return this.a;
      }
   }

   protected static record s(eee.c a) implements eef.u {
      static final azd<eef.s> e = eef.a(eee.c.a, eef.s::new, eef.s::j);

      @Override
      public double a(eee.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public eee a(eee.f $$0) {
         return $$0.apply(new eef.s($$0.a(this.a)));
      }

      @Override
      public azd<? extends eee> c() {
         return e;
      }

      @Override
      public eee.c j() {
         return this.a;
      }
   }

   protected static record t(eee.c a) implements eef.u {
      static final azd<eef.t> e = eef.a(eee.c.a, eef.t::new, eef.t::j);

      @Override
      public double a(eee.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public eee a(eee.f $$0) {
         return $$0.apply(new eef.t($$0.a(this.a)));
      }

      @Override
      public azd<? extends eee> c() {
         return e;
      }

      @Override
      public eee.c j() {
         return this.a;
      }
   }

   interface u extends eee {
      eee.c j();

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
      default void a(double[] $$0, eee.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(eee e, eee f, eee g, double h, double i, eee.c j) implements eee {
      private static final MapCodec<eef.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eee.d.fieldOf("shift_x").forGetter(eef.v::j),
                  eee.d.fieldOf("shift_y").forGetter(eef.v::k),
                  eee.d.fieldOf("shift_z").forGetter(eef.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(eef.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(eef.v::n),
                  eee.c.a.fieldOf("noise").forGetter(eef.v::o)
               )
               .apply($$0, eef.v::new)
      );
      public static final azd<eef.v> a = eef.a(k);

      @Override
      public double a(eee.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, eee.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eee a(eee.f $$0) {
         return $$0.apply(new eef.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public azd<? extends eee> c() {
         return a;
      }

      public eee j() {
         return this.e;
      }

      public eee k() {
         return this.f;
      }

      public eee l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public eee.c o() {
         return this.j;
      }
   }

   public static record w(ayl<eef.w.b, eef.w.a> e) implements eee {
      private static final Codec<ayl<eef.w.b, eef.w.a>> f = ayl.a(eef.w.a.b);
      private static final MapCodec<eef.w> g = f.fieldOf("spline").xmap(eef.w::new, eef.w::j);
      public static final azd<eef.w> a = eef.a(g);

      @Override
      public double a(eee.b $$0) {
         return (double)this.e.a(new eef.w.b($$0));
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
      public void a(double[] $$0, eee.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eee a(eee.f $$0) {
         return $$0.apply(new eef.w(this.e.a((ayl.d<eef.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public azd<? extends eee> c() {
         return a;
      }

      public ayl<eef.w.b, eef.w.a> j() {
         return this.e;
      }

      public static record a(js<eee> c) implements ban<eef.w.b> {
         public static final Codec<eef.w.a> b = eee.c.xmap(eef.w.a::new, eef.w.a::a);

         @Override
         public String toString() {
            Optional<alc<eee>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               alc<eee> $$1 = $$0.get();
               if ($$1 == ees.d) {
                  return "continents";
               }

               if ($$1 == ees.e) {
                  return "erosion";
               }

               if ($$1 == ees.f) {
                  return "weirdness";
               }

               if ($$1 == ees.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(eef.w.b $$0) {
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

         public eef.w.a a(eee.f $$0) {
            return new eef.w.a(new js.a<>(this.c.a().a($$0)));
         }

         public js<eee> a() {
            return this.c;
         }
      }

      public static record b(eee.b a) {
      }
   }

   interface x extends eee {
      eee j();

      @Override
      default double a(eee.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, eee.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(eee.b var1, double var2);
   }

   interface y extends eee {
      Logger a = LogUtils.getLogger();

      static eef.y a(eef.y.a $$0, eee $$1, eee $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == eef.y.a.c || $$0 == eef.y.a.d) {
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
         if ($$0 == eef.y.a.b || $$0 == eef.y.a.a) {
            if ($$1 instanceof eef.h $$11) {
               return new eef.n($$0 == eef.y.a.a ? eef.n.a.b : eef.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof eef.h $$12) {
               return new eef.n($$0 == eef.y.a.a ? eef.n.a.b : eef.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new eef.a($$0, $$1, $$2, $$9, $$10);
      }

      eef.y.a j();

      eee k();

      eee l();

      @Override
      default azd<? extends eee> c() {
         return this.j().e;
      }

      public static enum a implements bag {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final azd<eef.y> e = eef.a((BiFunction<eee, eee, eef.y>)(($$0x, $$1) -> eef.y.a(this, $$0x, $$1)), eef.y::k, eef.y::l);
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

   protected static record z(eee e, eee.c f, eef.z.a g) implements eef.x {
      private static final MapCodec<eef.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eee.d.fieldOf("input").forGetter(eef.z::j),
                  eee.c.a.fieldOf("noise").forGetter(eef.z::k),
                  eef.z.a.c.fieldOf("rarity_value_mapper").forGetter(eef.z::l)
               )
               .apply($$0, eef.z::new)
      );
      public static final azd<eef.z> a = eef.a(h);

      @Override
      public double a(eee.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public eee a(eee.f $$0) {
         return $$0.apply(new eef.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public azd<? extends eee> c() {
         return a;
      }

      @Override
      public eee j() {
         return this.e;
      }

      public eee.c k() {
         return this.f;
      }

      public eef.z.a l() {
         return this.g;
      }

      public static enum a implements bag {
         a("type_1", ees.a::b, 2.0),
         b("type_2", ees.a::a, 3.0);

         public static final Codec<eef.z.a> c = bag.a(eef.z.a::values);
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
