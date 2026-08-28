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

public final class egh {
   private static final Codec<egg> c = mg.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<egg> b = Codec.either(d, c)
      .xmap($$0 -> (egg)$$0.map(egh::a, Function.identity()), $$0 -> $$0 instanceof egh.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends egg> a(js<MapCodec<? extends egg>> $$0) {
      a($$0, "blend_alpha", egh.d.e);
      a($$0, "blend_offset", egh.f.e);
      a($$0, "beardifier", egh.b.e);
      a($$0, "old_blended_noise", evv.a);

      for (egh.l.a $$1 : egh.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", egh.o.e);
      a($$0, "end_islands", egh.i.a);
      a($$0, "weird_scaled_sampler", egh.z.a);
      a($$0, "shifted_noise", egh.v.a);
      a($$0, "range_choice", egh.q.e);
      a($$0, "shift_a", egh.s.e);
      a($$0, "shift_b", egh.t.e);
      a($$0, "shift", egh.r.e);
      a($$0, "blend_density", egh.e.e);
      a($$0, "clamp", egh.g.a);

      for (egh.k.a $$2 : egh.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (egh.y.a $$3 : egh.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", egh.w.a);
      a($$0, "constant", egh.h.e);
      return a($$0, "y_clamped_gradient", egh.aa.a);
   }

   private static MapCodec<? extends egg> a(js<MapCodec<? extends egg>> $$0, String $$1, azf<? extends egg> $$2) {
      return js.a($$0, $$1, $$2.a());
   }

   static <A, O> azf<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return azf.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> azf<O> a(Function<egg, O> $$0, Function<O, egg> $$1) {
      return a(egg.d, $$0, $$1);
   }

   static <O> azf<O> a(BiFunction<egg, egg, O> $$0, Function<O, egg> $$1, Function<O, egg> $$2) {
      return azf.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(egg.d.fieldOf("argument1").forGetter($$1), egg.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> azf<O> a(MapCodec<O> $$0) {
      return azf.a($$0);
   }

   private egh() {
   }

   public static egg a(egg $$0) {
      return new egh.l(egh.l.a.a, $$0);
   }

   public static egg b(egg $$0) {
      return new egh.l(egh.l.a.b, $$0);
   }

   public static egg c(egg $$0) {
      return new egh.l(egh.l.a.c, $$0);
   }

   public static egg d(egg $$0) {
      return new egh.l(egh.l.a.d, $$0);
   }

   public static egg e(egg $$0) {
      return new egh.l(egh.l.a.e, $$0);
   }

   public static egg a(jf<evy.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new egh.o(new egg.c($$0), $$1, $$2), $$3, $$4);
   }

   public static egg a(jf<evy.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static egg a(jf<evy.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static egg a(egg $$0, egg $$1, double $$2, jf<evy.a> $$3) {
      return new egh.v($$0, a(), $$1, $$2, 0.0, new egg.c($$3));
   }

   public static egg a(jf<evy.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static egg b(jf<evy.a> $$0, double $$1, double $$2) {
      return new egh.o(new egg.c($$0), $$1, $$2);
   }

   public static egg a(jf<evy.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static egg a(egg $$0, double $$1, double $$2, egg $$3, egg $$4) {
      return new egh.q($$0, $$1, $$2, $$3, $$4);
   }

   public static egg b(jf<evy.a> $$0) {
      return new egh.s(new egg.c($$0));
   }

   public static egg c(jf<evy.a> $$0) {
      return new egh.t(new egg.c($$0));
   }

   public static egg d(jf<evy.a> $$0) {
      return new egh.r(new egg.c($$0));
   }

   public static egg f(egg $$0) {
      return new egh.e($$0);
   }

   public static egg a(long $$0) {
      return new egh.i($$0);
   }

   public static egg a(egg $$0, jf<evy.a> $$1, egh.z.a $$2) {
      return new egh.z($$0, new egg.c($$1), $$2);
   }

   public static egg a(egg $$0, egg $$1) {
      return egh.y.a(egh.y.a.a, $$0, $$1);
   }

   public static egg b(egg $$0, egg $$1) {
      return egh.y.a(egh.y.a.b, $$0, $$1);
   }

   public static egg c(egg $$0, egg $$1) {
      return egh.y.a(egh.y.a.c, $$0, $$1);
   }

   public static egg d(egg $$0, egg $$1) {
      return egh.y.a(egh.y.a.d, $$0, $$1);
   }

   public static egg a(ayn<egh.w.b, egh.w.a> $$0) {
      return new egh.w($$0);
   }

   public static egg a() {
      return egh.h.f;
   }

   public static egg a(double $$0) {
      return new egh.h($$0);
   }

   public static egg a(int $$0, int $$1, double $$2, double $$3) {
      return new egh.aa($$0, $$1, $$2, $$3);
   }

   public static egg a(egg $$0, egh.k.a $$1) {
      return egh.k.a($$1, $$0);
   }

   private static egg a(egg $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static egg b() {
      return egh.d.a;
   }

   public static egg c() {
      return egh.f.a;
   }

   public static egg a(egg $$0, egg $$1, egg $$2) {
      if ($$1 instanceof egh.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         egg $$4 = d($$0);
         egg $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static egg a(egg $$0, double $$1, egg $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(egh.y.a e, egg f, egg g, double h, double i) implements egh.y {
      @Override
      public double a(egg.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, egg.a $$1) {
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
      public egg a(egg.f $$0) {
         return $$0.apply(egh.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public egh.y.a j() {
         return this.e;
      }

      @Override
      public egg k() {
         return this.f;
      }

      @Override
      public egg l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements egg.d {
      private static final MapCodec<egh.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(eel.e * 2, eel.d * 2).fieldOf("from_y").forGetter(egh.aa::j),
                  Codec.intRange(eel.e * 2, eel.d * 2).fieldOf("to_y").forGetter(egh.aa::k),
                  egh.d.fieldOf("from_value").forGetter(egh.aa::l),
                  egh.d.fieldOf("to_value").forGetter(egh.aa::m)
               )
               .apply($$0, egh.aa::new)
      );
      public static final azf<egh.aa> a = egh.a(i);

      @Override
      public double a(egg.b $$0) {
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
      public azf<? extends egg> c() {
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

   protected static enum b implements egh.c {
      a;

      @Override
      public double a(egg.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, egg.a $$1) {
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

   public interface c extends egg.d {
      azf<egg> e = azf.a(MapCodec.unit(egh.b.a));

      @Override
      default azf<? extends egg> c() {
         return e;
      }
   }

   protected static enum d implements egg.d {
      a;

      public static final azf<egg> e = azf.a(MapCodec.unit(a));

      @Override
      public double a(egg.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, egg.a $$1) {
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
      public azf<? extends egg> c() {
         return e;
      }
   }

   static record e(egg a) implements egh.x {
      static final azf<egh.e> e = egh.a(egh.e::new, egh.e::j);

      @Override
      public double a(egg.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public egg a(egg.f $$0) {
         return $$0.apply(new egh.e(this.a.a($$0)));
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
      public azf<? extends egg> c() {
         return e;
      }

      @Override
      public egg j() {
         return this.a;
      }
   }

   protected static enum f implements egg.d {
      a;

      public static final azf<egg> e = azf.a(MapCodec.unit(a));

      @Override
      public double a(egg.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, egg.a $$1) {
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
      public azf<? extends egg> c() {
         return e;
      }
   }

   protected static record g(egg e, double f, double g) implements egh.p {
      private static final MapCodec<egh.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(egg.b.fieldOf("input").forGetter(egh.g::aA_), egh.d.fieldOf("min").forGetter(egh.g::a), egh.d.fieldOf("max").forGetter(egh.g::b))
               .apply($$0, egh.g::new)
      );
      public static final azf<egh.g> a = egh.a(h);

      @Override
      public double a(double $$0) {
         return azm.a($$0, this.f, this.g);
      }

      @Override
      public egg a(egg.f $$0) {
         return new egh.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public azf<? extends egg> c() {
         return a;
      }

      @Override
      public egg aA_() {
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

   static record h(double a) implements egg.d {
      static final azf<egh.h> e = egh.a(egh.d, egh.h::new, egh.h::j);
      static final egh.h f = new egh.h(0.0);

      @Override
      public void a(double[] $$0, egg.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public azf<? extends egg> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements egg.d {
      public static final azf<egh.i> a = azf.a(MapCodec.unit(new egh.i(0L)));
      private static final float e = -0.9F;
      private final ewb f;

      public i(long $$0) {
         azv $$1 = new ego($$0);
         $$1.b(17292);
         this.f = new ewb($$1);
      }

      private static float a(ewb $$0, int $$1, int $$2) {
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
      public double a(egg.b $$0) {
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
      public azf<? extends egg> c() {
         return a;
      }
   }

   @bav
   public static record j(jf<egg> a) implements egg {
      @Override
      public double a(egg.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, egg.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public egg a(egg.f $$0) {
         return $$0.apply(new egh.j(new jf.a<>(this.a.a().a($$0))));
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
      public azf<? extends egg> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jf<egg> j() {
         return this.a;
      }
   }

   protected static record k(egh.k.a a, egg e, double f, double g) implements egh.p {
      public static egh.k a(egh.k.a $$0, egg $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != egh.k.a.a && $$0 != egh.k.a.b ? new egh.k($$0, $$1, $$3, $$4) : new egh.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(egh.k.a $$0, double $$1) {
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

      public egh.k b(egg.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public azf<? extends egg> c() {
         return this.a.h;
      }

      public egh.k.a k() {
         return this.a;
      }

      @Override
      public egg aA_() {
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

      static enum a implements bak {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final azf<egh.k> h = egh.a($$0x -> egh.k.a(this, $$0x), egh.k::aA_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(egh.l.a a, egg e) implements egh.m {
      @Override
      public double a(egg.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, egg.a $$1) {
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
      public egh.l.a j() {
         return this.a;
      }

      @Override
      public egg k() {
         return this.e;
      }

      static enum a implements bak {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final azf<egh.m> g = egh.a($$0x -> new egh.l(this, $$0x), egh.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends egg {
      egh.l.a j();

      egg k();

      @Override
      default azf<? extends egg> c() {
         return this.j().g;
      }

      @Override
      default egg a(egg.f $$0) {
         return $$0.apply(new egh.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(egh.n.a e, egg f, double g, double h, double i) implements egh.p, egh.y {
      @Override
      public egh.y.a j() {
         return this.e == egh.n.a.a ? egh.y.a.b : egh.y.a.a;
      }

      @Override
      public egg k() {
         return egh.a(this.i);
      }

      @Override
      public egg l() {
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
      public egg a(egg.f $$0) {
         egg $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == egh.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new egh.n(this.e, $$1, $$4, $$5, this.i);
      }

      public egh.n.a m() {
         return this.e;
      }

      @Override
      public egg aA_() {
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

   protected static record o(egg.c f, @Deprecated double g, double h) implements egg {
      public static final MapCodec<egh.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  egg.c.a.fieldOf("noise").forGetter(egh.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(egh.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(egh.o::l)
               )
               .apply($$0, egh.o::new)
      );
      public static final azf<egh.o> e = egh.a(a);

      @Override
      public double a(egg.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, egg.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public egg a(egg.f $$0) {
         return $$0.apply(new egh.o($$0.a(this.f), this.g, this.h));
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
      public azf<? extends egg> c() {
         return e;
      }

      public egg.c j() {
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

   interface p extends egg {
      egg aA_();

      @Override
      default double a(egg.b $$0) {
         return this.a(this.aA_().a($$0));
      }

      @Override
      default void a(double[] $$0, egg.a $$1) {
         this.aA_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(egg f, double g, double h, egg i, egg j) implements egg {
      public static final MapCodec<egh.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  egg.d.fieldOf("input").forGetter(egh.q::j),
                  egh.d.fieldOf("min_inclusive").forGetter(egh.q::k),
                  egh.d.fieldOf("max_exclusive").forGetter(egh.q::l),
                  egg.d.fieldOf("when_in_range").forGetter(egh.q::m),
                  egg.d.fieldOf("when_out_of_range").forGetter(egh.q::n)
               )
               .apply($$0, egh.q::new)
      );
      public static final azf<egh.q> e = egh.a(a);

      @Override
      public double a(egg.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, egg.a $$1) {
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
      public egg a(egg.f $$0) {
         return $$0.apply(new egh.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public azf<? extends egg> c() {
         return e;
      }

      public egg j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public egg m() {
         return this.i;
      }

      public egg n() {
         return this.j;
      }
   }

   protected static record r(egg.c a) implements egh.u {
      static final azf<egh.r> e = egh.a(egg.c.a, egh.r::new, egh.r::j);

      @Override
      public double a(egg.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public egg a(egg.f $$0) {
         return $$0.apply(new egh.r($$0.a(this.a)));
      }

      @Override
      public azf<? extends egg> c() {
         return e;
      }

      @Override
      public egg.c j() {
         return this.a;
      }
   }

   protected static record s(egg.c a) implements egh.u {
      static final azf<egh.s> e = egh.a(egg.c.a, egh.s::new, egh.s::j);

      @Override
      public double a(egg.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public egg a(egg.f $$0) {
         return $$0.apply(new egh.s($$0.a(this.a)));
      }

      @Override
      public azf<? extends egg> c() {
         return e;
      }

      @Override
      public egg.c j() {
         return this.a;
      }
   }

   protected static record t(egg.c a) implements egh.u {
      static final azf<egh.t> e = egh.a(egg.c.a, egh.t::new, egh.t::j);

      @Override
      public double a(egg.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public egg a(egg.f $$0) {
         return $$0.apply(new egh.t($$0.a(this.a)));
      }

      @Override
      public azf<? extends egg> c() {
         return e;
      }

      @Override
      public egg.c j() {
         return this.a;
      }
   }

   interface u extends egg {
      egg.c j();

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
      default void a(double[] $$0, egg.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(egg e, egg f, egg g, double h, double i, egg.c j) implements egg {
      private static final MapCodec<egh.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  egg.d.fieldOf("shift_x").forGetter(egh.v::j),
                  egg.d.fieldOf("shift_y").forGetter(egh.v::k),
                  egg.d.fieldOf("shift_z").forGetter(egh.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(egh.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(egh.v::n),
                  egg.c.a.fieldOf("noise").forGetter(egh.v::o)
               )
               .apply($$0, egh.v::new)
      );
      public static final azf<egh.v> a = egh.a(k);

      @Override
      public double a(egg.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, egg.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public egg a(egg.f $$0) {
         return $$0.apply(new egh.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public azf<? extends egg> c() {
         return a;
      }

      public egg j() {
         return this.e;
      }

      public egg k() {
         return this.f;
      }

      public egg l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public egg.c o() {
         return this.j;
      }
   }

   public static record w(ayn<egh.w.b, egh.w.a> e) implements egg {
      private static final Codec<ayn<egh.w.b, egh.w.a>> f = ayn.a(egh.w.a.b);
      private static final MapCodec<egh.w> g = f.fieldOf("spline").xmap(egh.w::new, egh.w::j);
      public static final azf<egh.w> a = egh.a(g);

      @Override
      public double a(egg.b $$0) {
         return (double)this.e.a(new egh.w.b($$0));
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
      public void a(double[] $$0, egg.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public egg a(egg.f $$0) {
         return $$0.apply(new egh.w(this.e.a((ayn.d<egh.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public azf<? extends egg> c() {
         return a;
      }

      public ayn<egh.w.b, egh.w.a> j() {
         return this.e;
      }

      public static record a(jf<egg> c) implements bar<egh.w.b> {
         public static final Codec<egh.w.a> b = egg.c.xmap(egh.w.a::new, egh.w.a::a);

         @Override
         public String toString() {
            Optional<alf<egg>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               alf<egg> $$1 = $$0.get();
               if ($$1 == egu.d) {
                  return "continents";
               }

               if ($$1 == egu.e) {
                  return "erosion";
               }

               if ($$1 == egu.f) {
                  return "weirdness";
               }

               if ($$1 == egu.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(egh.w.b $$0) {
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

         public egh.w.a a(egg.f $$0) {
            return new egh.w.a(new jf.a<>(this.c.a().a($$0)));
         }

         public jf<egg> a() {
            return this.c;
         }
      }

      public static record b(egg.b a) {
      }
   }

   interface x extends egg {
      egg j();

      @Override
      default double a(egg.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, egg.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(egg.b var1, double var2);
   }

   interface y extends egg {
      Logger a = LogUtils.getLogger();

      static egh.y a(egh.y.a $$0, egg $$1, egg $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == egh.y.a.c || $$0 == egh.y.a.d) {
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
         if ($$0 == egh.y.a.b || $$0 == egh.y.a.a) {
            if ($$1 instanceof egh.h $$11) {
               return new egh.n($$0 == egh.y.a.a ? egh.n.a.b : egh.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof egh.h $$12) {
               return new egh.n($$0 == egh.y.a.a ? egh.n.a.b : egh.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new egh.a($$0, $$1, $$2, $$9, $$10);
      }

      egh.y.a j();

      egg k();

      egg l();

      @Override
      default azf<? extends egg> c() {
         return this.j().e;
      }

      public static enum a implements bak {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final azf<egh.y> e = egh.a((BiFunction<egg, egg, egh.y>)(($$0x, $$1) -> egh.y.a(this, $$0x, $$1)), egh.y::k, egh.y::l);
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

   protected static record z(egg e, egg.c f, egh.z.a g) implements egh.x {
      private static final MapCodec<egh.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  egg.d.fieldOf("input").forGetter(egh.z::j),
                  egg.c.a.fieldOf("noise").forGetter(egh.z::k),
                  egh.z.a.c.fieldOf("rarity_value_mapper").forGetter(egh.z::l)
               )
               .apply($$0, egh.z::new)
      );
      public static final azf<egh.z> a = egh.a(h);

      @Override
      public double a(egg.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public egg a(egg.f $$0) {
         return $$0.apply(new egh.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public azf<? extends egg> c() {
         return a;
      }

      @Override
      public egg j() {
         return this.e;
      }

      public egg.c k() {
         return this.f;
      }

      public egh.z.a l() {
         return this.g;
      }

      public static enum a implements bak {
         a("type_1", egu.a::b, 2.0),
         b("type_2", egu.a::a, 3.0);

         public static final Codec<egh.z.a> c = bak.a(egh.z.a::values);
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
