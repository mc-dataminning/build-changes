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

public final class dwn {
   private static final Codec<dwm> c = le.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dwm> b = Codec.either(d, c)
      .xmap($$0 -> (dwm)$$0.map(dwn::a, Function.identity()), $$0 -> $$0 instanceof dwn.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends dwm> a(jk<MapCodec<? extends dwm>> $$0) {
      a($$0, "blend_alpha", dwn.d.e);
      a($$0, "blend_offset", dwn.f.e);
      a($$0, "beardifier", dwn.b.e);
      a($$0, "old_blended_noise", elu.a);

      for (dwn.l.a $$1 : dwn.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dwn.o.e);
      a($$0, "end_islands", dwn.i.a);
      a($$0, "weird_scaled_sampler", dwn.z.a);
      a($$0, "shifted_noise", dwn.v.a);
      a($$0, "range_choice", dwn.q.e);
      a($$0, "shift_a", dwn.s.e);
      a($$0, "shift_b", dwn.t.e);
      a($$0, "shift", dwn.r.e);
      a($$0, "blend_density", dwn.e.e);
      a($$0, "clamp", dwn.g.a);

      for (dwn.k.a $$2 : dwn.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dwn.y.a $$3 : dwn.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dwn.w.a);
      a($$0, "constant", dwn.h.e);
      return a($$0, "y_clamped_gradient", dwn.aa.a);
   }

   private static MapCodec<? extends dwm> a(jk<MapCodec<? extends dwm>> $$0, String $$1, axx<? extends dwm> $$2) {
      return jk.a($$0, $$1, $$2.a());
   }

   static <A, O> axx<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return axx.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> axx<O> a(Function<dwm, O> $$0, Function<O, dwm> $$1) {
      return a(dwm.d, $$0, $$1);
   }

   static <O> axx<O> a(BiFunction<dwm, dwm, O> $$0, Function<O, dwm> $$1, Function<O, dwm> $$2) {
      return axx.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dwm.d.fieldOf("argument1").forGetter($$1), dwm.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> axx<O> a(MapCodec<O> $$0) {
      return axx.a($$0);
   }

   private dwn() {
   }

   public static dwm a(dwm $$0) {
      return new dwn.l(dwn.l.a.a, $$0);
   }

   public static dwm b(dwm $$0) {
      return new dwn.l(dwn.l.a.b, $$0);
   }

   public static dwm c(dwm $$0) {
      return new dwn.l(dwn.l.a.c, $$0);
   }

   public static dwm d(dwm $$0) {
      return new dwn.l(dwn.l.a.d, $$0);
   }

   public static dwm e(dwm $$0) {
      return new dwn.l(dwn.l.a.e, $$0);
   }

   public static dwm a(ix<elx.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dwn.o(new dwm.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dwm a(ix<elx.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dwm a(ix<elx.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dwm a(dwm $$0, dwm $$1, double $$2, ix<elx.a> $$3) {
      return new dwn.v($$0, a(), $$1, $$2, 0.0, new dwm.c($$3));
   }

   public static dwm a(ix<elx.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dwm b(ix<elx.a> $$0, double $$1, double $$2) {
      return new dwn.o(new dwm.c($$0), $$1, $$2);
   }

   public static dwm a(ix<elx.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dwm a(dwm $$0, double $$1, double $$2, dwm $$3, dwm $$4) {
      return new dwn.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dwm b(ix<elx.a> $$0) {
      return new dwn.s(new dwm.c($$0));
   }

   public static dwm c(ix<elx.a> $$0) {
      return new dwn.t(new dwm.c($$0));
   }

   public static dwm d(ix<elx.a> $$0) {
      return new dwn.r(new dwm.c($$0));
   }

   public static dwm f(dwm $$0) {
      return new dwn.e($$0);
   }

   public static dwm a(long $$0) {
      return new dwn.i($$0);
   }

   public static dwm a(dwm $$0, ix<elx.a> $$1, dwn.z.a $$2) {
      return new dwn.z($$0, new dwm.c($$1), $$2);
   }

   public static dwm a(dwm $$0, dwm $$1) {
      return dwn.y.a(dwn.y.a.a, $$0, $$1);
   }

   public static dwm b(dwm $$0, dwm $$1) {
      return dwn.y.a(dwn.y.a.b, $$0, $$1);
   }

   public static dwm c(dwm $$0, dwm $$1) {
      return dwn.y.a(dwn.y.a.c, $$0, $$1);
   }

   public static dwm d(dwm $$0, dwm $$1) {
      return dwn.y.a(dwn.y.a.d, $$0, $$1);
   }

   public static dwm a(axg<dwn.w.b, dwn.w.a> $$0) {
      return new dwn.w($$0);
   }

   public static dwm a() {
      return dwn.h.f;
   }

   public static dwm a(double $$0) {
      return new dwn.h($$0);
   }

   public static dwm a(int $$0, int $$1, double $$2, double $$3) {
      return new dwn.aa($$0, $$1, $$2, $$3);
   }

   public static dwm a(dwm $$0, dwn.k.a $$1) {
      return dwn.k.a($$1, $$0);
   }

   private static dwm a(dwm $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dwm b() {
      return dwn.d.a;
   }

   public static dwm c() {
      return dwn.f.a;
   }

   public static dwm a(dwm $$0, dwm $$1, dwm $$2) {
      if ($$1 instanceof dwn.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dwm $$4 = d($$0);
         dwm $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dwm a(dwm $$0, double $$1, dwm $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dwn.y.a e, dwm f, dwm g, double h, double i) implements dwn.y {
      @Override
      public double a(dwm.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dwm.a $$1) {
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
      public dwm a(dwm.f $$0) {
         return $$0.apply(dwn.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dwn.y.a j() {
         return this.e;
      }

      @Override
      public dwm k() {
         return this.f;
      }

      @Override
      public dwm l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dwm.d {
      private static final MapCodec<dwn.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dut.e * 2, dut.d * 2).fieldOf("from_y").forGetter(dwn.aa::j),
                  Codec.intRange(dut.e * 2, dut.d * 2).fieldOf("to_y").forGetter(dwn.aa::k),
                  dwn.d.fieldOf("from_value").forGetter(dwn.aa::l),
                  dwn.d.fieldOf("to_value").forGetter(dwn.aa::m)
               )
               .apply($$0, dwn.aa::new)
      );
      public static final axx<dwn.aa> a = dwn.a(i);

      @Override
      public double a(dwm.b $$0) {
         return ayd.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public axx<? extends dwm> c() {
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

   protected static enum b implements dwn.c {
      a;

      @Override
      public double a(dwm.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dwm.a $$1) {
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

   public interface c extends dwm.d {
      axx<dwm> e = axx.a(MapCodec.unit(dwn.b.a));

      @Override
      default axx<? extends dwm> c() {
         return e;
      }
   }

   protected static enum d implements dwm.d {
      a;

      public static final axx<dwm> e = axx.a(MapCodec.unit(a));

      @Override
      public double a(dwm.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dwm.a $$1) {
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
      public axx<? extends dwm> c() {
         return e;
      }
   }

   static record e(dwm a) implements dwn.x {
      static final axx<dwn.e> e = dwn.a(dwn.e::new, dwn.e::j);

      @Override
      public double a(dwm.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dwm a(dwm.f $$0) {
         return $$0.apply(new dwn.e(this.a.a($$0)));
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
      public axx<? extends dwm> c() {
         return e;
      }

      @Override
      public dwm j() {
         return this.a;
      }
   }

   protected static enum f implements dwm.d {
      a;

      public static final axx<dwm> e = axx.a(MapCodec.unit(a));

      @Override
      public double a(dwm.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dwm.a $$1) {
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
      public axx<? extends dwm> c() {
         return e;
      }
   }

   protected static record g(dwm e, double f, double g) implements dwn.p {
      private static final MapCodec<dwn.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dwm.b.fieldOf("input").forGetter(dwn.g::aA_), dwn.d.fieldOf("min").forGetter(dwn.g::a), dwn.d.fieldOf("max").forGetter(dwn.g::b))
               .apply($$0, dwn.g::new)
      );
      public static final axx<dwn.g> a = dwn.a(h);

      @Override
      public double a(double $$0) {
         return ayd.a($$0, this.f, this.g);
      }

      @Override
      public dwm a(dwm.f $$0) {
         return new dwn.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public axx<? extends dwm> c() {
         return a;
      }

      @Override
      public dwm aA_() {
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

   static record h(double a) implements dwm.d {
      static final axx<dwn.h> e = dwn.a(dwn.d, dwn.h::new, dwn.h::j);
      static final dwn.h f = new dwn.h(0.0);

      @Override
      public void a(double[] $$0, dwm.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public axx<? extends dwm> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dwm.d {
      public static final axx<dwn.i> a = axx.a(MapCodec.unit(new dwn.i(0L)));
      private static final float e = -0.9F;
      private final ema f;

      public i(long $$0) {
         ayk $$1 = new dwu($$0);
         $$1.b(17292);
         this.f = new ema($$1);
      }

      private static float a(ema $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - ayd.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = ayd.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (ayd.e((float)$$10) * 3439.0F + ayd.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - ayd.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = ayd.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dwm.b $$0) {
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
      public axx<? extends dwm> c() {
         return a;
      }
   }

   @azg
   public static record j(ix<dwm> a) implements dwm {
      @Override
      public double a(dwm.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dwm.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dwm a(dwm.f $$0) {
         return $$0.apply(new dwn.j(new ix.a<>(this.a.a().a($$0))));
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
      public axx<? extends dwm> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public ix<dwm> j() {
         return this.a;
      }
   }

   protected static record k(dwn.k.a a, dwm e, double f, double g) implements dwn.p {
      public static dwn.k a(dwn.k.a $$0, dwm $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dwn.k.a.a && $$0 != dwn.k.a.b ? new dwn.k($$0, $$1, $$3, $$4) : new dwn.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dwn.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = ayd.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dwn.k b(dwm.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public axx<? extends dwm> c() {
         return this.a.h;
      }

      public dwn.k.a k() {
         return this.a;
      }

      @Override
      public dwm aA_() {
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

      static enum a implements ayx {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final axx<dwn.k> h = dwn.a($$0x -> dwn.k.a(this, $$0x), dwn.k::aA_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dwn.l.a a, dwm e) implements dwn.m {
      @Override
      public double a(dwm.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dwm.a $$1) {
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
      public dwn.l.a j() {
         return this.a;
      }

      @Override
      public dwm k() {
         return this.e;
      }

      static enum a implements ayx {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final axx<dwn.m> g = dwn.a($$0x -> new dwn.l(this, $$0x), dwn.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dwm {
      dwn.l.a j();

      dwm k();

      @Override
      default axx<? extends dwm> c() {
         return this.j().g;
      }

      @Override
      default dwm a(dwm.f $$0) {
         return $$0.apply(new dwn.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dwn.n.a e, dwm f, double g, double h, double i) implements dwn.p, dwn.y {
      @Override
      public dwn.y.a j() {
         return this.e == dwn.n.a.a ? dwn.y.a.b : dwn.y.a.a;
      }

      @Override
      public dwm k() {
         return dwn.a(this.i);
      }

      @Override
      public dwm l() {
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
      public dwm a(dwm.f $$0) {
         dwm $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dwn.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dwn.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dwn.n.a m() {
         return this.e;
      }

      @Override
      public dwm aA_() {
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

   protected static record o(dwm.c f, @Deprecated double g, double h) implements dwm {
      public static final MapCodec<dwn.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dwm.c.a.fieldOf("noise").forGetter(dwn.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dwn.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dwn.o::l)
               )
               .apply($$0, dwn.o::new)
      );
      public static final axx<dwn.o> e = dwn.a(a);

      @Override
      public double a(dwm.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dwm.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dwm a(dwm.f $$0) {
         return $$0.apply(new dwn.o($$0.a(this.f), this.g, this.h));
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
      public axx<? extends dwm> c() {
         return e;
      }

      public dwm.c j() {
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

   interface p extends dwm {
      dwm aA_();

      @Override
      default double a(dwm.b $$0) {
         return this.a(this.aA_().a($$0));
      }

      @Override
      default void a(double[] $$0, dwm.a $$1) {
         this.aA_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dwm f, double g, double h, dwm i, dwm j) implements dwm {
      public static final MapCodec<dwn.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dwm.d.fieldOf("input").forGetter(dwn.q::j),
                  dwn.d.fieldOf("min_inclusive").forGetter(dwn.q::k),
                  dwn.d.fieldOf("max_exclusive").forGetter(dwn.q::l),
                  dwm.d.fieldOf("when_in_range").forGetter(dwn.q::m),
                  dwm.d.fieldOf("when_out_of_range").forGetter(dwn.q::n)
               )
               .apply($$0, dwn.q::new)
      );
      public static final axx<dwn.q> e = dwn.a(a);

      @Override
      public double a(dwm.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dwm.a $$1) {
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
      public dwm a(dwm.f $$0) {
         return $$0.apply(new dwn.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public axx<? extends dwm> c() {
         return e;
      }

      public dwm j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dwm m() {
         return this.i;
      }

      public dwm n() {
         return this.j;
      }
   }

   protected static record r(dwm.c a) implements dwn.u {
      static final axx<dwn.r> e = dwn.a(dwm.c.a, dwn.r::new, dwn.r::j);

      @Override
      public double a(dwm.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dwm a(dwm.f $$0) {
         return $$0.apply(new dwn.r($$0.a(this.a)));
      }

      @Override
      public axx<? extends dwm> c() {
         return e;
      }

      @Override
      public dwm.c j() {
         return this.a;
      }
   }

   protected static record s(dwm.c a) implements dwn.u {
      static final axx<dwn.s> e = dwn.a(dwm.c.a, dwn.s::new, dwn.s::j);

      @Override
      public double a(dwm.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dwm a(dwm.f $$0) {
         return $$0.apply(new dwn.s($$0.a(this.a)));
      }

      @Override
      public axx<? extends dwm> c() {
         return e;
      }

      @Override
      public dwm.c j() {
         return this.a;
      }
   }

   protected static record t(dwm.c a) implements dwn.u {
      static final axx<dwn.t> e = dwn.a(dwm.c.a, dwn.t::new, dwn.t::j);

      @Override
      public double a(dwm.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dwm a(dwm.f $$0) {
         return $$0.apply(new dwn.t($$0.a(this.a)));
      }

      @Override
      public axx<? extends dwm> c() {
         return e;
      }

      @Override
      public dwm.c j() {
         return this.a;
      }
   }

   interface u extends dwm {
      dwm.c j();

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
      default void a(double[] $$0, dwm.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dwm e, dwm f, dwm g, double h, double i, dwm.c j) implements dwm {
      private static final MapCodec<dwn.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dwm.d.fieldOf("shift_x").forGetter(dwn.v::j),
                  dwm.d.fieldOf("shift_y").forGetter(dwn.v::k),
                  dwm.d.fieldOf("shift_z").forGetter(dwn.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dwn.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dwn.v::n),
                  dwm.c.a.fieldOf("noise").forGetter(dwn.v::o)
               )
               .apply($$0, dwn.v::new)
      );
      public static final axx<dwn.v> a = dwn.a(k);

      @Override
      public double a(dwm.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dwm.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dwm a(dwm.f $$0) {
         return $$0.apply(new dwn.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public axx<? extends dwm> c() {
         return a;
      }

      public dwm j() {
         return this.e;
      }

      public dwm k() {
         return this.f;
      }

      public dwm l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dwm.c o() {
         return this.j;
      }
   }

   public static record w(axg<dwn.w.b, dwn.w.a> e) implements dwm {
      private static final Codec<axg<dwn.w.b, dwn.w.a>> f = axg.a(dwn.w.a.b);
      private static final MapCodec<dwn.w> g = f.fieldOf("spline").xmap(dwn.w::new, dwn.w::j);
      public static final axx<dwn.w> a = dwn.a(g);

      @Override
      public double a(dwm.b $$0) {
         return (double)this.e.a(new dwn.w.b($$0));
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
      public void a(double[] $$0, dwm.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dwm a(dwm.f $$0) {
         return $$0.apply(new dwn.w(this.e.a((axg.d<dwn.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public axx<? extends dwm> c() {
         return a;
      }

      public axg<dwn.w.b, dwn.w.a> j() {
         return this.e;
      }

      public static record a(ix<dwm> c) implements azd<dwn.w.b> {
         public static final Codec<dwn.w.a> b = dwm.c.xmap(dwn.w.a::new, dwn.w.a::a);

         @Override
         public String toString() {
            Optional<akl<dwm>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               akl<dwm> $$1 = $$0.get();
               if ($$1 == dxa.d) {
                  return "continents";
               }

               if ($$1 == dxa.e) {
                  return "erosion";
               }

               if ($$1 == dxa.f) {
                  return "weirdness";
               }

               if ($$1 == dxa.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dwn.w.b $$0) {
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

         public dwn.w.a a(dwm.f $$0) {
            return new dwn.w.a(new ix.a<>(this.c.a().a($$0)));
         }

         public ix<dwm> a() {
            return this.c;
         }
      }

      public static record b(dwm.b a) {
      }
   }

   interface x extends dwm {
      dwm j();

      @Override
      default double a(dwm.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dwm.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dwm.b var1, double var2);
   }

   interface y extends dwm {
      Logger a = LogUtils.getLogger();

      static dwn.y a(dwn.y.a $$0, dwm $$1, dwm $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dwn.y.a.c || $$0 == dwn.y.a.d) {
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
         if ($$0 == dwn.y.a.b || $$0 == dwn.y.a.a) {
            if ($$1 instanceof dwn.h $$11) {
               return new dwn.n($$0 == dwn.y.a.a ? dwn.n.a.b : dwn.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dwn.h $$12) {
               return new dwn.n($$0 == dwn.y.a.a ? dwn.n.a.b : dwn.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dwn.a($$0, $$1, $$2, $$9, $$10);
      }

      dwn.y.a j();

      dwm k();

      dwm l();

      @Override
      default axx<? extends dwm> c() {
         return this.j().e;
      }

      public static enum a implements ayx {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final axx<dwn.y> e = dwn.a((BiFunction<dwm, dwm, dwn.y>)(($$0x, $$1) -> dwn.y.a(this, $$0x, $$1)), dwn.y::k, dwn.y::l);
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

   protected static record z(dwm e, dwm.c f, dwn.z.a g) implements dwn.x {
      private static final MapCodec<dwn.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dwm.d.fieldOf("input").forGetter(dwn.z::j),
                  dwm.c.a.fieldOf("noise").forGetter(dwn.z::k),
                  dwn.z.a.c.fieldOf("rarity_value_mapper").forGetter(dwn.z::l)
               )
               .apply($$0, dwn.z::new)
      );
      public static final axx<dwn.z> a = dwn.a(h);

      @Override
      public double a(dwm.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dwm a(dwm.f $$0) {
         return $$0.apply(new dwn.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public axx<? extends dwm> c() {
         return a;
      }

      @Override
      public dwm j() {
         return this.e;
      }

      public dwm.c k() {
         return this.f;
      }

      public dwn.z.a l() {
         return this.g;
      }

      public static enum a implements ayx {
         a("type_1", dxa.a::b, 2.0),
         b("type_2", dxa.a::a, 3.0);

         public static final Codec<dwn.z.a> c = ayx.a(dwn.z.a::values);
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
