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

public final class dwp {
   private static final Codec<dwo> c = le.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dwo> b = Codec.either(d, c)
      .xmap($$0 -> (dwo)$$0.map(dwp::a, Function.identity()), $$0 -> $$0 instanceof dwp.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends dwo> a(jk<MapCodec<? extends dwo>> $$0) {
      a($$0, "blend_alpha", dwp.d.e);
      a($$0, "blend_offset", dwp.f.e);
      a($$0, "beardifier", dwp.b.e);
      a($$0, "old_blended_noise", elw.a);

      for (dwp.l.a $$1 : dwp.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dwp.o.e);
      a($$0, "end_islands", dwp.i.a);
      a($$0, "weird_scaled_sampler", dwp.z.a);
      a($$0, "shifted_noise", dwp.v.a);
      a($$0, "range_choice", dwp.q.e);
      a($$0, "shift_a", dwp.s.e);
      a($$0, "shift_b", dwp.t.e);
      a($$0, "shift", dwp.r.e);
      a($$0, "blend_density", dwp.e.e);
      a($$0, "clamp", dwp.g.a);

      for (dwp.k.a $$2 : dwp.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dwp.y.a $$3 : dwp.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dwp.w.a);
      a($$0, "constant", dwp.h.e);
      return a($$0, "y_clamped_gradient", dwp.aa.a);
   }

   private static MapCodec<? extends dwo> a(jk<MapCodec<? extends dwo>> $$0, String $$1, axy<? extends dwo> $$2) {
      return jk.a($$0, $$1, $$2.a());
   }

   static <A, O> axy<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return axy.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> axy<O> a(Function<dwo, O> $$0, Function<O, dwo> $$1) {
      return a(dwo.d, $$0, $$1);
   }

   static <O> axy<O> a(BiFunction<dwo, dwo, O> $$0, Function<O, dwo> $$1, Function<O, dwo> $$2) {
      return axy.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dwo.d.fieldOf("argument1").forGetter($$1), dwo.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> axy<O> a(MapCodec<O> $$0) {
      return axy.a($$0);
   }

   private dwp() {
   }

   public static dwo a(dwo $$0) {
      return new dwp.l(dwp.l.a.a, $$0);
   }

   public static dwo b(dwo $$0) {
      return new dwp.l(dwp.l.a.b, $$0);
   }

   public static dwo c(dwo $$0) {
      return new dwp.l(dwp.l.a.c, $$0);
   }

   public static dwo d(dwo $$0) {
      return new dwp.l(dwp.l.a.d, $$0);
   }

   public static dwo e(dwo $$0) {
      return new dwp.l(dwp.l.a.e, $$0);
   }

   public static dwo a(ix<elz.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dwp.o(new dwo.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dwo a(ix<elz.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dwo a(ix<elz.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dwo a(dwo $$0, dwo $$1, double $$2, ix<elz.a> $$3) {
      return new dwp.v($$0, a(), $$1, $$2, 0.0, new dwo.c($$3));
   }

   public static dwo a(ix<elz.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dwo b(ix<elz.a> $$0, double $$1, double $$2) {
      return new dwp.o(new dwo.c($$0), $$1, $$2);
   }

   public static dwo a(ix<elz.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dwo a(dwo $$0, double $$1, double $$2, dwo $$3, dwo $$4) {
      return new dwp.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dwo b(ix<elz.a> $$0) {
      return new dwp.s(new dwo.c($$0));
   }

   public static dwo c(ix<elz.a> $$0) {
      return new dwp.t(new dwo.c($$0));
   }

   public static dwo d(ix<elz.a> $$0) {
      return new dwp.r(new dwo.c($$0));
   }

   public static dwo f(dwo $$0) {
      return new dwp.e($$0);
   }

   public static dwo a(long $$0) {
      return new dwp.i($$0);
   }

   public static dwo a(dwo $$0, ix<elz.a> $$1, dwp.z.a $$2) {
      return new dwp.z($$0, new dwo.c($$1), $$2);
   }

   public static dwo a(dwo $$0, dwo $$1) {
      return dwp.y.a(dwp.y.a.a, $$0, $$1);
   }

   public static dwo b(dwo $$0, dwo $$1) {
      return dwp.y.a(dwp.y.a.b, $$0, $$1);
   }

   public static dwo c(dwo $$0, dwo $$1) {
      return dwp.y.a(dwp.y.a.c, $$0, $$1);
   }

   public static dwo d(dwo $$0, dwo $$1) {
      return dwp.y.a(dwp.y.a.d, $$0, $$1);
   }

   public static dwo a(axh<dwp.w.b, dwp.w.a> $$0) {
      return new dwp.w($$0);
   }

   public static dwo a() {
      return dwp.h.f;
   }

   public static dwo a(double $$0) {
      return new dwp.h($$0);
   }

   public static dwo a(int $$0, int $$1, double $$2, double $$3) {
      return new dwp.aa($$0, $$1, $$2, $$3);
   }

   public static dwo a(dwo $$0, dwp.k.a $$1) {
      return dwp.k.a($$1, $$0);
   }

   private static dwo a(dwo $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dwo b() {
      return dwp.d.a;
   }

   public static dwo c() {
      return dwp.f.a;
   }

   public static dwo a(dwo $$0, dwo $$1, dwo $$2) {
      if ($$1 instanceof dwp.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dwo $$4 = d($$0);
         dwo $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dwo a(dwo $$0, double $$1, dwo $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dwp.y.a e, dwo f, dwo g, double h, double i) implements dwp.y {
      @Override
      public double a(dwo.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, dwo.a $$1) {
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
      public dwo a(dwo.f $$0) {
         return $$0.apply(dwp.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dwp.y.a j() {
         return this.e;
      }

      @Override
      public dwo k() {
         return this.f;
      }

      @Override
      public dwo l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dwo.d {
      private static final MapCodec<dwp.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(duv.e * 2, duv.d * 2).fieldOf("from_y").forGetter(dwp.aa::j),
                  Codec.intRange(duv.e * 2, duv.d * 2).fieldOf("to_y").forGetter(dwp.aa::k),
                  dwp.d.fieldOf("from_value").forGetter(dwp.aa::l),
                  dwp.d.fieldOf("to_value").forGetter(dwp.aa::m)
               )
               .apply($$0, dwp.aa::new)
      );
      public static final axy<dwp.aa> a = dwp.a(i);

      @Override
      public double a(dwo.b $$0) {
         return ayf.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public axy<? extends dwo> c() {
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

   protected static enum b implements dwp.c {
      a;

      @Override
      public double a(dwo.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dwo.a $$1) {
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

   public interface c extends dwo.d {
      axy<dwo> e = axy.a(MapCodec.unit(dwp.b.a));

      @Override
      default axy<? extends dwo> c() {
         return e;
      }
   }

   protected static enum d implements dwo.d {
      a;

      public static final axy<dwo> e = axy.a(MapCodec.unit(a));

      @Override
      public double a(dwo.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dwo.a $$1) {
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
      public axy<? extends dwo> c() {
         return e;
      }
   }

   static record e(dwo a) implements dwp.x {
      static final axy<dwp.e> e = dwp.a(dwp.e::new, dwp.e::j);

      @Override
      public double a(dwo.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dwo a(dwo.f $$0) {
         return $$0.apply(new dwp.e(this.a.a($$0)));
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
      public axy<? extends dwo> c() {
         return e;
      }

      @Override
      public dwo j() {
         return this.a;
      }
   }

   protected static enum f implements dwo.d {
      a;

      public static final axy<dwo> e = axy.a(MapCodec.unit(a));

      @Override
      public double a(dwo.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dwo.a $$1) {
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
      public axy<? extends dwo> c() {
         return e;
      }
   }

   protected static record g(dwo e, double f, double g) implements dwp.p {
      private static final MapCodec<dwp.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dwo.b.fieldOf("input").forGetter(dwp.g::aB_), dwp.d.fieldOf("min").forGetter(dwp.g::a), dwp.d.fieldOf("max").forGetter(dwp.g::b))
               .apply($$0, dwp.g::new)
      );
      public static final axy<dwp.g> a = dwp.a(h);

      @Override
      public double a(double $$0) {
         return ayf.a($$0, this.f, this.g);
      }

      @Override
      public dwo a(dwo.f $$0) {
         return new dwp.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public axy<? extends dwo> c() {
         return a;
      }

      @Override
      public dwo aB_() {
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

   static record h(double a) implements dwo.d {
      static final axy<dwp.h> e = dwp.a(dwp.d, dwp.h::new, dwp.h::j);
      static final dwp.h f = new dwp.h(0.0);

      @Override
      public void a(double[] $$0, dwo.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public axy<? extends dwo> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dwo.d {
      public static final axy<dwp.i> a = axy.a(MapCodec.unit(new dwp.i(0L)));
      private static final float e = -0.9F;
      private final emc f;

      public i(long $$0) {
         aym $$1 = new dww($$0);
         $$1.b(17292);
         this.f = new emc($$1);
      }

      private static float a(emc $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - ayf.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = ayf.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (ayf.e((float)$$10) * 3439.0F + ayf.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - ayf.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = ayf.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dwo.b $$0) {
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
      public axy<? extends dwo> c() {
         return a;
      }
   }

   @azi
   public static record j(ix<dwo> a) implements dwo {
      @Override
      public double a(dwo.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dwo.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dwo a(dwo.f $$0) {
         return $$0.apply(new dwp.j(new ix.a<>(this.a.a().a($$0))));
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
      public axy<? extends dwo> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public ix<dwo> j() {
         return this.a;
      }
   }

   protected static record k(dwp.k.a a, dwo e, double f, double g) implements dwp.p {
      public static dwp.k a(dwp.k.a $$0, dwo $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dwp.k.a.a && $$0 != dwp.k.a.b ? new dwp.k($$0, $$1, $$3, $$4) : new dwp.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dwp.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = ayf.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dwp.k b(dwo.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public axy<? extends dwo> c() {
         return this.a.h;
      }

      public dwp.k.a k() {
         return this.a;
      }

      @Override
      public dwo aB_() {
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

      static enum a implements ayz {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final axy<dwp.k> h = dwp.a($$0x -> dwp.k.a(this, $$0x), dwp.k::aB_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dwp.l.a a, dwo e) implements dwp.m {
      @Override
      public double a(dwo.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dwo.a $$1) {
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
      public dwp.l.a j() {
         return this.a;
      }

      @Override
      public dwo k() {
         return this.e;
      }

      static enum a implements ayz {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final axy<dwp.m> g = dwp.a($$0x -> new dwp.l(this, $$0x), dwp.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dwo {
      dwp.l.a j();

      dwo k();

      @Override
      default axy<? extends dwo> c() {
         return this.j().g;
      }

      @Override
      default dwo a(dwo.f $$0) {
         return $$0.apply(new dwp.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dwp.n.a e, dwo f, double g, double h, double i) implements dwp.p, dwp.y {
      @Override
      public dwp.y.a j() {
         return this.e == dwp.n.a.a ? dwp.y.a.b : dwp.y.a.a;
      }

      @Override
      public dwo k() {
         return dwp.a(this.i);
      }

      @Override
      public dwo l() {
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
      public dwo a(dwo.f $$0) {
         dwo $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dwp.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dwp.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dwp.n.a m() {
         return this.e;
      }

      @Override
      public dwo aB_() {
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

   protected static record o(dwo.c f, @Deprecated double g, double h) implements dwo {
      public static final MapCodec<dwp.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dwo.c.a.fieldOf("noise").forGetter(dwp.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dwp.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dwp.o::l)
               )
               .apply($$0, dwp.o::new)
      );
      public static final axy<dwp.o> e = dwp.a(a);

      @Override
      public double a(dwo.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dwo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dwo a(dwo.f $$0) {
         return $$0.apply(new dwp.o($$0.a(this.f), this.g, this.h));
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
      public axy<? extends dwo> c() {
         return e;
      }

      public dwo.c j() {
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

   interface p extends dwo {
      dwo aB_();

      @Override
      default double a(dwo.b $$0) {
         return this.a(this.aB_().a($$0));
      }

      @Override
      default void a(double[] $$0, dwo.a $$1) {
         this.aB_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dwo f, double g, double h, dwo i, dwo j) implements dwo {
      public static final MapCodec<dwp.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dwo.d.fieldOf("input").forGetter(dwp.q::j),
                  dwp.d.fieldOf("min_inclusive").forGetter(dwp.q::k),
                  dwp.d.fieldOf("max_exclusive").forGetter(dwp.q::l),
                  dwo.d.fieldOf("when_in_range").forGetter(dwp.q::m),
                  dwo.d.fieldOf("when_out_of_range").forGetter(dwp.q::n)
               )
               .apply($$0, dwp.q::new)
      );
      public static final axy<dwp.q> e = dwp.a(a);

      @Override
      public double a(dwo.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dwo.a $$1) {
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
      public dwo a(dwo.f $$0) {
         return $$0.apply(new dwp.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public axy<? extends dwo> c() {
         return e;
      }

      public dwo j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dwo m() {
         return this.i;
      }

      public dwo n() {
         return this.j;
      }
   }

   protected static record r(dwo.c a) implements dwp.u {
      static final axy<dwp.r> e = dwp.a(dwo.c.a, dwp.r::new, dwp.r::j);

      @Override
      public double a(dwo.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dwo a(dwo.f $$0) {
         return $$0.apply(new dwp.r($$0.a(this.a)));
      }

      @Override
      public axy<? extends dwo> c() {
         return e;
      }

      @Override
      public dwo.c j() {
         return this.a;
      }
   }

   protected static record s(dwo.c a) implements dwp.u {
      static final axy<dwp.s> e = dwp.a(dwo.c.a, dwp.s::new, dwp.s::j);

      @Override
      public double a(dwo.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dwo a(dwo.f $$0) {
         return $$0.apply(new dwp.s($$0.a(this.a)));
      }

      @Override
      public axy<? extends dwo> c() {
         return e;
      }

      @Override
      public dwo.c j() {
         return this.a;
      }
   }

   protected static record t(dwo.c a) implements dwp.u {
      static final axy<dwp.t> e = dwp.a(dwo.c.a, dwp.t::new, dwp.t::j);

      @Override
      public double a(dwo.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dwo a(dwo.f $$0) {
         return $$0.apply(new dwp.t($$0.a(this.a)));
      }

      @Override
      public axy<? extends dwo> c() {
         return e;
      }

      @Override
      public dwo.c j() {
         return this.a;
      }
   }

   interface u extends dwo {
      dwo.c j();

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
      default void a(double[] $$0, dwo.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dwo e, dwo f, dwo g, double h, double i, dwo.c j) implements dwo {
      private static final MapCodec<dwp.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dwo.d.fieldOf("shift_x").forGetter(dwp.v::j),
                  dwo.d.fieldOf("shift_y").forGetter(dwp.v::k),
                  dwo.d.fieldOf("shift_z").forGetter(dwp.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dwp.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dwp.v::n),
                  dwo.c.a.fieldOf("noise").forGetter(dwp.v::o)
               )
               .apply($$0, dwp.v::new)
      );
      public static final axy<dwp.v> a = dwp.a(k);

      @Override
      public double a(dwo.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dwo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dwo a(dwo.f $$0) {
         return $$0.apply(new dwp.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public axy<? extends dwo> c() {
         return a;
      }

      public dwo j() {
         return this.e;
      }

      public dwo k() {
         return this.f;
      }

      public dwo l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dwo.c o() {
         return this.j;
      }
   }

   public static record w(axh<dwp.w.b, dwp.w.a> e) implements dwo {
      private static final Codec<axh<dwp.w.b, dwp.w.a>> f = axh.a(dwp.w.a.b);
      private static final MapCodec<dwp.w> g = f.fieldOf("spline").xmap(dwp.w::new, dwp.w::j);
      public static final axy<dwp.w> a = dwp.a(g);

      @Override
      public double a(dwo.b $$0) {
         return (double)this.e.a(new dwp.w.b($$0));
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
      public void a(double[] $$0, dwo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dwo a(dwo.f $$0) {
         return $$0.apply(new dwp.w(this.e.a((axh.d<dwp.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public axy<? extends dwo> c() {
         return a;
      }

      public axh<dwp.w.b, dwp.w.a> j() {
         return this.e;
      }

      public static record a(ix<dwo> c) implements azf<dwp.w.b> {
         public static final Codec<dwp.w.a> b = dwo.c.xmap(dwp.w.a::new, dwp.w.a::a);

         @Override
         public String toString() {
            Optional<akm<dwo>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               akm<dwo> $$1 = $$0.get();
               if ($$1 == dxc.d) {
                  return "continents";
               }

               if ($$1 == dxc.e) {
                  return "erosion";
               }

               if ($$1 == dxc.f) {
                  return "weirdness";
               }

               if ($$1 == dxc.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dwp.w.b $$0) {
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

         public dwp.w.a a(dwo.f $$0) {
            return new dwp.w.a(new ix.a<>(this.c.a().a($$0)));
         }

         public ix<dwo> a() {
            return this.c;
         }
      }

      public static record b(dwo.b a) {
      }
   }

   interface x extends dwo {
      dwo j();

      @Override
      default double a(dwo.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dwo.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dwo.b var1, double var2);
   }

   interface y extends dwo {
      Logger a = LogUtils.getLogger();

      static dwp.y a(dwp.y.a $$0, dwo $$1, dwo $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dwp.y.a.c || $$0 == dwp.y.a.d) {
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
         if ($$0 == dwp.y.a.b || $$0 == dwp.y.a.a) {
            if ($$1 instanceof dwp.h $$11) {
               return new dwp.n($$0 == dwp.y.a.a ? dwp.n.a.b : dwp.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dwp.h $$12) {
               return new dwp.n($$0 == dwp.y.a.a ? dwp.n.a.b : dwp.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dwp.a($$0, $$1, $$2, $$9, $$10);
      }

      dwp.y.a j();

      dwo k();

      dwo l();

      @Override
      default axy<? extends dwo> c() {
         return this.j().e;
      }

      public static enum a implements ayz {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final axy<dwp.y> e = dwp.a((BiFunction<dwo, dwo, dwp.y>)(($$0x, $$1) -> dwp.y.a(this, $$0x, $$1)), dwp.y::k, dwp.y::l);
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

   protected static record z(dwo e, dwo.c f, dwp.z.a g) implements dwp.x {
      private static final MapCodec<dwp.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dwo.d.fieldOf("input").forGetter(dwp.z::j),
                  dwo.c.a.fieldOf("noise").forGetter(dwp.z::k),
                  dwp.z.a.c.fieldOf("rarity_value_mapper").forGetter(dwp.z::l)
               )
               .apply($$0, dwp.z::new)
      );
      public static final axy<dwp.z> a = dwp.a(h);

      @Override
      public double a(dwo.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dwo a(dwo.f $$0) {
         return $$0.apply(new dwp.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public axy<? extends dwo> c() {
         return a;
      }

      @Override
      public dwo j() {
         return this.e;
      }

      public dwo.c k() {
         return this.f;
      }

      public dwp.z.a l() {
         return this.g;
      }

      public static enum a implements ayz {
         a("type_1", dxc.a::b, 2.0),
         b("type_2", dxc.a::a, 3.0);

         public static final Codec<dwp.z.a> c = ayz.a(dwp.z.a::values);
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
