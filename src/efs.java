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

public final class efs {
   private static final Codec<efr> c = mf.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<efr> b = Codec.either(d, c)
      .xmap($$0 -> (efr)$$0.map(efs::a, Function.identity()), $$0 -> $$0 instanceof efs.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends efr> a(jr<MapCodec<? extends efr>> $$0) {
      a($$0, "blend_alpha", efs.d.e);
      a($$0, "blend_offset", efs.f.e);
      a($$0, "beardifier", efs.b.e);
      a($$0, "old_blended_noise", evg.a);

      for (efs.l.a $$1 : efs.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", efs.o.e);
      a($$0, "end_islands", efs.i.a);
      a($$0, "weird_scaled_sampler", efs.z.a);
      a($$0, "shifted_noise", efs.v.a);
      a($$0, "range_choice", efs.q.e);
      a($$0, "shift_a", efs.s.e);
      a($$0, "shift_b", efs.t.e);
      a($$0, "shift", efs.r.e);
      a($$0, "blend_density", efs.e.e);
      a($$0, "clamp", efs.g.a);

      for (efs.k.a $$2 : efs.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (efs.y.a $$3 : efs.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", efs.w.a);
      a($$0, "constant", efs.h.e);
      return a($$0, "y_clamped_gradient", efs.aa.a);
   }

   private static MapCodec<? extends efr> a(jr<MapCodec<? extends efr>> $$0, String $$1, azf<? extends efr> $$2) {
      return jr.a($$0, $$1, $$2.a());
   }

   static <A, O> azf<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return azf.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> azf<O> a(Function<efr, O> $$0, Function<O, efr> $$1) {
      return a(efr.d, $$0, $$1);
   }

   static <O> azf<O> a(BiFunction<efr, efr, O> $$0, Function<O, efr> $$1, Function<O, efr> $$2) {
      return azf.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(efr.d.fieldOf("argument1").forGetter($$1), efr.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> azf<O> a(MapCodec<O> $$0) {
      return azf.a($$0);
   }

   private efs() {
   }

   public static efr a(efr $$0) {
      return new efs.l(efs.l.a.a, $$0);
   }

   public static efr b(efr $$0) {
      return new efs.l(efs.l.a.b, $$0);
   }

   public static efr c(efr $$0) {
      return new efs.l(efs.l.a.c, $$0);
   }

   public static efr d(efr $$0) {
      return new efs.l(efs.l.a.d, $$0);
   }

   public static efr e(efr $$0) {
      return new efs.l(efs.l.a.e, $$0);
   }

   public static efr a(je<evj.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new efs.o(new efr.c($$0), $$1, $$2), $$3, $$4);
   }

   public static efr a(je<evj.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static efr a(je<evj.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static efr a(efr $$0, efr $$1, double $$2, je<evj.a> $$3) {
      return new efs.v($$0, a(), $$1, $$2, 0.0, new efr.c($$3));
   }

   public static efr a(je<evj.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static efr b(je<evj.a> $$0, double $$1, double $$2) {
      return new efs.o(new efr.c($$0), $$1, $$2);
   }

   public static efr a(je<evj.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static efr a(efr $$0, double $$1, double $$2, efr $$3, efr $$4) {
      return new efs.q($$0, $$1, $$2, $$3, $$4);
   }

   public static efr b(je<evj.a> $$0) {
      return new efs.s(new efr.c($$0));
   }

   public static efr c(je<evj.a> $$0) {
      return new efs.t(new efr.c($$0));
   }

   public static efr d(je<evj.a> $$0) {
      return new efs.r(new efr.c($$0));
   }

   public static efr f(efr $$0) {
      return new efs.e($$0);
   }

   public static efr a(long $$0) {
      return new efs.i($$0);
   }

   public static efr a(efr $$0, je<evj.a> $$1, efs.z.a $$2) {
      return new efs.z($$0, new efr.c($$1), $$2);
   }

   public static efr a(efr $$0, efr $$1) {
      return efs.y.a(efs.y.a.a, $$0, $$1);
   }

   public static efr b(efr $$0, efr $$1) {
      return efs.y.a(efs.y.a.b, $$0, $$1);
   }

   public static efr c(efr $$0, efr $$1) {
      return efs.y.a(efs.y.a.c, $$0, $$1);
   }

   public static efr d(efr $$0, efr $$1) {
      return efs.y.a(efs.y.a.d, $$0, $$1);
   }

   public static efr a(ayn<efs.w.b, efs.w.a> $$0) {
      return new efs.w($$0);
   }

   public static efr a() {
      return efs.h.f;
   }

   public static efr a(double $$0) {
      return new efs.h($$0);
   }

   public static efr a(int $$0, int $$1, double $$2, double $$3) {
      return new efs.aa($$0, $$1, $$2, $$3);
   }

   public static efr a(efr $$0, efs.k.a $$1) {
      return efs.k.a($$1, $$0);
   }

   private static efr a(efr $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static efr b() {
      return efs.d.a;
   }

   public static efr c() {
      return efs.f.a;
   }

   public static efr a(efr $$0, efr $$1, efr $$2) {
      if ($$1 instanceof efs.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         efr $$4 = d($$0);
         efr $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static efr a(efr $$0, double $$1, efr $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(efs.y.a e, efr f, efr g, double h, double i) implements efs.y {
      @Override
      public double a(efr.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, efr.a $$1) {
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
      public efr a(efr.f $$0) {
         return $$0.apply(efs.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public efs.y.a j() {
         return this.e;
      }

      @Override
      public efr k() {
         return this.f;
      }

      @Override
      public efr l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements efr.d {
      private static final MapCodec<efs.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(edw.e * 2, edw.d * 2).fieldOf("from_y").forGetter(efs.aa::j),
                  Codec.intRange(edw.e * 2, edw.d * 2).fieldOf("to_y").forGetter(efs.aa::k),
                  efs.d.fieldOf("from_value").forGetter(efs.aa::l),
                  efs.d.fieldOf("to_value").forGetter(efs.aa::m)
               )
               .apply($$0, efs.aa::new)
      );
      public static final azf<efs.aa> a = efs.a(i);

      @Override
      public double a(efr.b $$0) {
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
      public azf<? extends efr> c() {
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

   protected static enum b implements efs.c {
      a;

      @Override
      public double a(efr.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, efr.a $$1) {
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

   public interface c extends efr.d {
      azf<efr> e = azf.a(MapCodec.unit(efs.b.a));

      @Override
      default azf<? extends efr> c() {
         return e;
      }
   }

   protected static enum d implements efr.d {
      a;

      public static final azf<efr> e = azf.a(MapCodec.unit(a));

      @Override
      public double a(efr.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, efr.a $$1) {
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
      public azf<? extends efr> c() {
         return e;
      }
   }

   static record e(efr a) implements efs.x {
      static final azf<efs.e> e = efs.a(efs.e::new, efs.e::j);

      @Override
      public double a(efr.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public efr a(efr.f $$0) {
         return $$0.apply(new efs.e(this.a.a($$0)));
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
      public azf<? extends efr> c() {
         return e;
      }

      @Override
      public efr j() {
         return this.a;
      }
   }

   protected static enum f implements efr.d {
      a;

      public static final azf<efr> e = azf.a(MapCodec.unit(a));

      @Override
      public double a(efr.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, efr.a $$1) {
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
      public azf<? extends efr> c() {
         return e;
      }
   }

   protected static record g(efr e, double f, double g) implements efs.p {
      private static final MapCodec<efs.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(efr.b.fieldOf("input").forGetter(efs.g::az_), efs.d.fieldOf("min").forGetter(efs.g::a), efs.d.fieldOf("max").forGetter(efs.g::b))
               .apply($$0, efs.g::new)
      );
      public static final azf<efs.g> a = efs.a(h);

      @Override
      public double a(double $$0) {
         return azm.a($$0, this.f, this.g);
      }

      @Override
      public efr a(efr.f $$0) {
         return new efs.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public azf<? extends efr> c() {
         return a;
      }

      @Override
      public efr az_() {
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

   static record h(double a) implements efr.d {
      static final azf<efs.h> e = efs.a(efs.d, efs.h::new, efs.h::j);
      static final efs.h f = new efs.h(0.0);

      @Override
      public void a(double[] $$0, efr.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public azf<? extends efr> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements efr.d {
      public static final azf<efs.i> a = azf.a(MapCodec.unit(new efs.i(0L)));
      private static final float e = -0.9F;
      private final evm f;

      public i(long $$0) {
         azv $$1 = new efz($$0);
         $$1.b(17292);
         this.f = new evm($$1);
      }

      private static float a(evm $$0, int $$1, int $$2) {
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
      public double a(efr.b $$0) {
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
      public azf<? extends efr> c() {
         return a;
      }
   }

   @bav
   public static record j(je<efr> a) implements efr {
      @Override
      public double a(efr.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, efr.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public efr a(efr.f $$0) {
         return $$0.apply(new efs.j(new je.a<>(this.a.a().a($$0))));
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
      public azf<? extends efr> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public je<efr> j() {
         return this.a;
      }
   }

   protected static record k(efs.k.a a, efr e, double f, double g) implements efs.p {
      public static efs.k a(efs.k.a $$0, efr $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != efs.k.a.a && $$0 != efs.k.a.b ? new efs.k($$0, $$1, $$3, $$4) : new efs.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(efs.k.a $$0, double $$1) {
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

      public efs.k b(efr.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public azf<? extends efr> c() {
         return this.a.h;
      }

      public efs.k.a k() {
         return this.a;
      }

      @Override
      public efr az_() {
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
         final azf<efs.k> h = efs.a($$0x -> efs.k.a(this, $$0x), efs.k::az_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(efs.l.a a, efr e) implements efs.m {
      @Override
      public double a(efr.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, efr.a $$1) {
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
      public efs.l.a j() {
         return this.a;
      }

      @Override
      public efr k() {
         return this.e;
      }

      static enum a implements bak {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final azf<efs.m> g = efs.a($$0x -> new efs.l(this, $$0x), efs.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends efr {
      efs.l.a j();

      efr k();

      @Override
      default azf<? extends efr> c() {
         return this.j().g;
      }

      @Override
      default efr a(efr.f $$0) {
         return $$0.apply(new efs.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(efs.n.a e, efr f, double g, double h, double i) implements efs.p, efs.y {
      @Override
      public efs.y.a j() {
         return this.e == efs.n.a.a ? efs.y.a.b : efs.y.a.a;
      }

      @Override
      public efr k() {
         return efs.a(this.i);
      }

      @Override
      public efr l() {
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
      public efr a(efr.f $$0) {
         efr $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == efs.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new efs.n(this.e, $$1, $$4, $$5, this.i);
      }

      public efs.n.a m() {
         return this.e;
      }

      @Override
      public efr az_() {
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

   protected static record o(efr.c f, @Deprecated double g, double h) implements efr {
      public static final MapCodec<efs.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  efr.c.a.fieldOf("noise").forGetter(efs.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(efs.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(efs.o::l)
               )
               .apply($$0, efs.o::new)
      );
      public static final azf<efs.o> e = efs.a(a);

      @Override
      public double a(efr.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, efr.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public efr a(efr.f $$0) {
         return $$0.apply(new efs.o($$0.a(this.f), this.g, this.h));
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
      public azf<? extends efr> c() {
         return e;
      }

      public efr.c j() {
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

   interface p extends efr {
      efr az_();

      @Override
      default double a(efr.b $$0) {
         return this.a(this.az_().a($$0));
      }

      @Override
      default void a(double[] $$0, efr.a $$1) {
         this.az_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(efr f, double g, double h, efr i, efr j) implements efr {
      public static final MapCodec<efs.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  efr.d.fieldOf("input").forGetter(efs.q::j),
                  efs.d.fieldOf("min_inclusive").forGetter(efs.q::k),
                  efs.d.fieldOf("max_exclusive").forGetter(efs.q::l),
                  efr.d.fieldOf("when_in_range").forGetter(efs.q::m),
                  efr.d.fieldOf("when_out_of_range").forGetter(efs.q::n)
               )
               .apply($$0, efs.q::new)
      );
      public static final azf<efs.q> e = efs.a(a);

      @Override
      public double a(efr.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, efr.a $$1) {
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
      public efr a(efr.f $$0) {
         return $$0.apply(new efs.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public azf<? extends efr> c() {
         return e;
      }

      public efr j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public efr m() {
         return this.i;
      }

      public efr n() {
         return this.j;
      }
   }

   protected static record r(efr.c a) implements efs.u {
      static final azf<efs.r> e = efs.a(efr.c.a, efs.r::new, efs.r::j);

      @Override
      public double a(efr.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public efr a(efr.f $$0) {
         return $$0.apply(new efs.r($$0.a(this.a)));
      }

      @Override
      public azf<? extends efr> c() {
         return e;
      }

      @Override
      public efr.c j() {
         return this.a;
      }
   }

   protected static record s(efr.c a) implements efs.u {
      static final azf<efs.s> e = efs.a(efr.c.a, efs.s::new, efs.s::j);

      @Override
      public double a(efr.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public efr a(efr.f $$0) {
         return $$0.apply(new efs.s($$0.a(this.a)));
      }

      @Override
      public azf<? extends efr> c() {
         return e;
      }

      @Override
      public efr.c j() {
         return this.a;
      }
   }

   protected static record t(efr.c a) implements efs.u {
      static final azf<efs.t> e = efs.a(efr.c.a, efs.t::new, efs.t::j);

      @Override
      public double a(efr.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public efr a(efr.f $$0) {
         return $$0.apply(new efs.t($$0.a(this.a)));
      }

      @Override
      public azf<? extends efr> c() {
         return e;
      }

      @Override
      public efr.c j() {
         return this.a;
      }
   }

   interface u extends efr {
      efr.c j();

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
      default void a(double[] $$0, efr.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(efr e, efr f, efr g, double h, double i, efr.c j) implements efr {
      private static final MapCodec<efs.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  efr.d.fieldOf("shift_x").forGetter(efs.v::j),
                  efr.d.fieldOf("shift_y").forGetter(efs.v::k),
                  efr.d.fieldOf("shift_z").forGetter(efs.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(efs.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(efs.v::n),
                  efr.c.a.fieldOf("noise").forGetter(efs.v::o)
               )
               .apply($$0, efs.v::new)
      );
      public static final azf<efs.v> a = efs.a(k);

      @Override
      public double a(efr.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, efr.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public efr a(efr.f $$0) {
         return $$0.apply(new efs.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public azf<? extends efr> c() {
         return a;
      }

      public efr j() {
         return this.e;
      }

      public efr k() {
         return this.f;
      }

      public efr l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public efr.c o() {
         return this.j;
      }
   }

   public static record w(ayn<efs.w.b, efs.w.a> e) implements efr {
      private static final Codec<ayn<efs.w.b, efs.w.a>> f = ayn.a(efs.w.a.b);
      private static final MapCodec<efs.w> g = f.fieldOf("spline").xmap(efs.w::new, efs.w::j);
      public static final azf<efs.w> a = efs.a(g);

      @Override
      public double a(efr.b $$0) {
         return (double)this.e.a(new efs.w.b($$0));
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
      public void a(double[] $$0, efr.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public efr a(efr.f $$0) {
         return $$0.apply(new efs.w(this.e.a((ayn.d<efs.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public azf<? extends efr> c() {
         return a;
      }

      public ayn<efs.w.b, efs.w.a> j() {
         return this.e;
      }

      public static record a(je<efr> c) implements bar<efs.w.b> {
         public static final Codec<efs.w.a> b = efr.c.xmap(efs.w.a::new, efs.w.a::a);

         @Override
         public String toString() {
            Optional<alf<efr>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               alf<efr> $$1 = $$0.get();
               if ($$1 == egf.d) {
                  return "continents";
               }

               if ($$1 == egf.e) {
                  return "erosion";
               }

               if ($$1 == egf.f) {
                  return "weirdness";
               }

               if ($$1 == egf.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(efs.w.b $$0) {
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

         public efs.w.a a(efr.f $$0) {
            return new efs.w.a(new je.a<>(this.c.a().a($$0)));
         }

         public je<efr> a() {
            return this.c;
         }
      }

      public static record b(efr.b a) {
      }
   }

   interface x extends efr {
      efr j();

      @Override
      default double a(efr.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, efr.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(efr.b var1, double var2);
   }

   interface y extends efr {
      Logger a = LogUtils.getLogger();

      static efs.y a(efs.y.a $$0, efr $$1, efr $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == efs.y.a.c || $$0 == efs.y.a.d) {
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
         if ($$0 == efs.y.a.b || $$0 == efs.y.a.a) {
            if ($$1 instanceof efs.h $$11) {
               return new efs.n($$0 == efs.y.a.a ? efs.n.a.b : efs.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof efs.h $$12) {
               return new efs.n($$0 == efs.y.a.a ? efs.n.a.b : efs.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new efs.a($$0, $$1, $$2, $$9, $$10);
      }

      efs.y.a j();

      efr k();

      efr l();

      @Override
      default azf<? extends efr> c() {
         return this.j().e;
      }

      public static enum a implements bak {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final azf<efs.y> e = efs.a((BiFunction<efr, efr, efs.y>)(($$0x, $$1) -> efs.y.a(this, $$0x, $$1)), efs.y::k, efs.y::l);
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

   protected static record z(efr e, efr.c f, efs.z.a g) implements efs.x {
      private static final MapCodec<efs.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  efr.d.fieldOf("input").forGetter(efs.z::j),
                  efr.c.a.fieldOf("noise").forGetter(efs.z::k),
                  efs.z.a.c.fieldOf("rarity_value_mapper").forGetter(efs.z::l)
               )
               .apply($$0, efs.z::new)
      );
      public static final azf<efs.z> a = efs.a(h);

      @Override
      public double a(efr.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public efr a(efr.f $$0) {
         return $$0.apply(new efs.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public azf<? extends efr> c() {
         return a;
      }

      @Override
      public efr j() {
         return this.e;
      }

      public efr.c k() {
         return this.f;
      }

      public efs.z.a l() {
         return this.g;
      }

      public static enum a implements bak {
         a("type_1", egf.a::b, 2.0),
         b("type_2", egf.a::a, 3.0);

         public static final Codec<efs.z.a> c = bak.a(efs.z.a::values);
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
