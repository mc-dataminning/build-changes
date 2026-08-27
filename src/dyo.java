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

public final class dyo {
   private static final Codec<dyn> c = lh.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dyn> b = Codec.either(d, c)
      .xmap($$0 -> (dyn)$$0.map(dyo::a, Function.identity()), $$0 -> $$0 instanceof dyo.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dyn> a(jn<Codec<? extends dyn>> $$0) {
      a($$0, "blend_alpha", dyo.d.e);
      a($$0, "blend_offset", dyo.f.e);
      a($$0, "beardifier", dyo.b.e);
      a($$0, "old_blended_noise", eoe.a);

      for (dyo.l.a $$1 : dyo.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dyo.o.e);
      a($$0, "end_islands", dyo.i.a);
      a($$0, "weird_scaled_sampler", dyo.z.a);
      a($$0, "shifted_noise", dyo.v.a);
      a($$0, "range_choice", dyo.q.e);
      a($$0, "shift_a", dyo.s.e);
      a($$0, "shift_b", dyo.t.e);
      a($$0, "shift", dyo.r.e);
      a($$0, "blend_density", dyo.e.e);
      a($$0, "clamp", dyo.g.a);

      for (dyo.k.a $$2 : dyo.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dyo.y.a $$3 : dyo.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dyo.w.a);
      a($$0, "constant", dyo.h.e);
      return a($$0, "y_clamped_gradient", dyo.aa.a);
   }

   private static Codec<? extends dyn> a(jn<Codec<? extends dyn>> $$0, String $$1, ayg<? extends dyn> $$2) {
      return jn.a($$0, $$1, $$2.a());
   }

   static <A, O> ayg<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return ayg.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> ayg<O> a(Function<dyn, O> $$0, Function<O, dyn> $$1) {
      return a(dyn.d, $$0, $$1);
   }

   static <O> ayg<O> a(BiFunction<dyn, dyn, O> $$0, Function<O, dyn> $$1, Function<O, dyn> $$2) {
      return ayg.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dyn.d.fieldOf("argument1").forGetter($$1), dyn.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> ayg<O> a(MapCodec<O> $$0) {
      return ayg.a($$0);
   }

   private dyo() {
   }

   public static dyn a(dyn $$0) {
      return new dyo.l(dyo.l.a.a, $$0);
   }

   public static dyn b(dyn $$0) {
      return new dyo.l(dyo.l.a.b, $$0);
   }

   public static dyn c(dyn $$0) {
      return new dyo.l(dyo.l.a.c, $$0);
   }

   public static dyn d(dyn $$0) {
      return new dyo.l(dyo.l.a.d, $$0);
   }

   public static dyn e(dyn $$0) {
      return new dyo.l(dyo.l.a.e, $$0);
   }

   public static dyn a(ja<eoh.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dyo.o(new dyn.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dyn a(ja<eoh.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dyn a(ja<eoh.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dyn a(dyn $$0, dyn $$1, double $$2, ja<eoh.a> $$3) {
      return new dyo.v($$0, a(), $$1, $$2, 0.0, new dyn.c($$3));
   }

   public static dyn a(ja<eoh.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dyn b(ja<eoh.a> $$0, double $$1, double $$2) {
      return new dyo.o(new dyn.c($$0), $$1, $$2);
   }

   public static dyn a(ja<eoh.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dyn a(dyn $$0, double $$1, double $$2, dyn $$3, dyn $$4) {
      return new dyo.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dyn b(ja<eoh.a> $$0) {
      return new dyo.s(new dyn.c($$0));
   }

   public static dyn c(ja<eoh.a> $$0) {
      return new dyo.t(new dyn.c($$0));
   }

   public static dyn d(ja<eoh.a> $$0) {
      return new dyo.r(new dyn.c($$0));
   }

   public static dyn f(dyn $$0) {
      return new dyo.e($$0);
   }

   public static dyn a(long $$0) {
      return new dyo.i($$0);
   }

   public static dyn a(dyn $$0, ja<eoh.a> $$1, dyo.z.a $$2) {
      return new dyo.z($$0, new dyn.c($$1), $$2);
   }

   public static dyn a(dyn $$0, dyn $$1) {
      return dyo.y.a(dyo.y.a.a, $$0, $$1);
   }

   public static dyn b(dyn $$0, dyn $$1) {
      return dyo.y.a(dyo.y.a.b, $$0, $$1);
   }

   public static dyn c(dyn $$0, dyn $$1) {
      return dyo.y.a(dyo.y.a.c, $$0, $$1);
   }

   public static dyn d(dyn $$0, dyn $$1) {
      return dyo.y.a(dyo.y.a.d, $$0, $$1);
   }

   public static dyn a(axo<dyo.w.b, dyo.w.a> $$0) {
      return new dyo.w($$0);
   }

   public static dyn a() {
      return dyo.h.f;
   }

   public static dyn a(double $$0) {
      return new dyo.h($$0);
   }

   public static dyn a(int $$0, int $$1, double $$2, double $$3) {
      return new dyo.aa($$0, $$1, $$2, $$3);
   }

   public static dyn a(dyn $$0, dyo.k.a $$1) {
      return dyo.k.a($$1, $$0);
   }

   private static dyn a(dyn $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dyn b() {
      return dyo.d.a;
   }

   public static dyn c() {
      return dyo.f.a;
   }

   public static dyn a(dyn $$0, dyn $$1, dyn $$2) {
      if ($$1 instanceof dyo.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dyn $$4 = d($$0);
         dyn $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dyn a(dyn $$0, double $$1, dyn $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dyo.y.a e, dyn f, dyn g, double h, double i) implements dyo.y {
      @Override
      public double a(dyn.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dyn.a $$1) {
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
      public dyn a(dyn.f $$0) {
         return $$0.apply(dyo.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dyo.y.a j() {
         return this.e;
      }

      @Override
      public dyn k() {
         return this.f;
      }

      @Override
      public dyn l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dyn.d {
      private static final MapCodec<dyo.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dwu.e * 2, dwu.d * 2).fieldOf("from_y").forGetter(dyo.aa::j),
                  Codec.intRange(dwu.e * 2, dwu.d * 2).fieldOf("to_y").forGetter(dyo.aa::k),
                  dyo.d.fieldOf("from_value").forGetter(dyo.aa::l),
                  dyo.d.fieldOf("to_value").forGetter(dyo.aa::m)
               )
               .apply($$0, dyo.aa::new)
      );
      public static final ayg<dyo.aa> a = dyo.a(i);

      @Override
      public double a(dyn.b $$0) {
         return aym.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public ayg<? extends dyn> c() {
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

   protected static enum b implements dyo.c {
      a;

      @Override
      public double a(dyn.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dyn.a $$1) {
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

   public interface c extends dyn.d {
      ayg<dyn> e = ayg.a(MapCodec.unit(dyo.b.a));

      @Override
      default ayg<? extends dyn> c() {
         return e;
      }
   }

   protected static enum d implements dyn.d {
      a;

      public static final ayg<dyn> e = ayg.a(MapCodec.unit(a));

      @Override
      public double a(dyn.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dyn.a $$1) {
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
      public ayg<? extends dyn> c() {
         return e;
      }
   }

   static record e(dyn a) implements dyo.x {
      static final ayg<dyo.e> e = dyo.a(dyo.e::new, dyo.e::j);

      @Override
      public double a(dyn.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dyn a(dyn.f $$0) {
         return $$0.apply(new dyo.e(this.a.a($$0)));
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
      public ayg<? extends dyn> c() {
         return e;
      }

      @Override
      public dyn j() {
         return this.a;
      }
   }

   protected static enum f implements dyn.d {
      a;

      public static final ayg<dyn> e = ayg.a(MapCodec.unit(a));

      @Override
      public double a(dyn.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dyn.a $$1) {
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
      public ayg<? extends dyn> c() {
         return e;
      }
   }

   protected static record g(dyn e, double f, double g) implements dyo.p {
      private static final MapCodec<dyo.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dyn.b.fieldOf("input").forGetter(dyo.g::aA_), dyo.d.fieldOf("min").forGetter(dyo.g::a), dyo.d.fieldOf("max").forGetter(dyo.g::b))
               .apply($$0, dyo.g::new)
      );
      public static final ayg<dyo.g> a = dyo.a(h);

      @Override
      public double a(double $$0) {
         return aym.a($$0, this.f, this.g);
      }

      @Override
      public dyn a(dyn.f $$0) {
         return new dyo.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public ayg<? extends dyn> c() {
         return a;
      }

      @Override
      public dyn aA_() {
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

   static record h(double a) implements dyn.d {
      static final ayg<dyo.h> e = dyo.a(dyo.d, dyo.h::new, dyo.h::j);
      static final dyo.h f = new dyo.h(0.0);

      @Override
      public void a(double[] $$0, dyn.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public ayg<? extends dyn> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dyn.d {
      public static final ayg<dyo.i> a = ayg.a(MapCodec.unit(new dyo.i(0L)));
      private static final float e = -0.9F;
      private final eok f;

      public i(long $$0) {
         ayt $$1 = new dyv($$0);
         $$1.b(17292);
         this.f = new eok($$1);
      }

      private static float a(eok $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - aym.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = aym.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (aym.e((float)$$10) * 3439.0F + aym.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - aym.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = aym.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dyn.b $$0) {
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
      public ayg<? extends dyn> c() {
         return a;
      }
   }

   @azp
   public static record j(ja<dyn> a) implements dyn {
      @Override
      public double a(dyn.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dyn.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dyn a(dyn.f $$0) {
         return $$0.apply(new dyo.j(new ja.a<>(this.a.a().a($$0))));
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
      public ayg<? extends dyn> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public ja<dyn> j() {
         return this.a;
      }
   }

   protected static record k(dyo.k.a a, dyn e, double f, double g) implements dyo.p {
      public static dyo.k a(dyo.k.a $$0, dyn $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dyo.k.a.a && $$0 != dyo.k.a.b ? new dyo.k($$0, $$1, $$3, $$4) : new dyo.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dyo.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = aym.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dyo.k b(dyn.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public ayg<? extends dyn> c() {
         return this.a.h;
      }

      public dyo.k.a k() {
         return this.a;
      }

      @Override
      public dyn aA_() {
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

      static enum a implements azg {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final ayg<dyo.k> h = dyo.a($$0x -> dyo.k.a(this, $$0x), dyo.k::aA_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dyo.l.a a, dyn e) implements dyo.m {
      @Override
      public double a(dyn.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dyn.a $$1) {
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
      public dyo.l.a j() {
         return this.a;
      }

      @Override
      public dyn k() {
         return this.e;
      }

      static enum a implements azg {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final ayg<dyo.m> g = dyo.a($$0x -> new dyo.l(this, $$0x), dyo.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dyn {
      dyo.l.a j();

      dyn k();

      @Override
      default ayg<? extends dyn> c() {
         return this.j().g;
      }

      @Override
      default dyn a(dyn.f $$0) {
         return $$0.apply(new dyo.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dyo.n.a e, dyn f, double g, double h, double i) implements dyo.p, dyo.y {
      @Override
      public dyo.y.a j() {
         return this.e == dyo.n.a.a ? dyo.y.a.b : dyo.y.a.a;
      }

      @Override
      public dyn k() {
         return dyo.a(this.i);
      }

      @Override
      public dyn l() {
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
      public dyn a(dyn.f $$0) {
         dyn $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dyo.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dyo.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dyo.n.a m() {
         return this.e;
      }

      @Override
      public dyn aA_() {
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

   protected static record o(dyn.c f, @Deprecated double g, double h) implements dyn {
      public static final MapCodec<dyo.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dyn.c.a.fieldOf("noise").forGetter(dyo.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dyo.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dyo.o::l)
               )
               .apply($$0, dyo.o::new)
      );
      public static final ayg<dyo.o> e = dyo.a(a);

      @Override
      public double a(dyn.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dyn.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dyn a(dyn.f $$0) {
         return $$0.apply(new dyo.o($$0.a(this.f), this.g, this.h));
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
      public ayg<? extends dyn> c() {
         return e;
      }

      public dyn.c j() {
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

   interface p extends dyn {
      dyn aA_();

      @Override
      default double a(dyn.b $$0) {
         return this.a(this.aA_().a($$0));
      }

      @Override
      default void a(double[] $$0, dyn.a $$1) {
         this.aA_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dyn f, double g, double h, dyn i, dyn j) implements dyn {
      public static final MapCodec<dyo.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dyn.d.fieldOf("input").forGetter(dyo.q::j),
                  dyo.d.fieldOf("min_inclusive").forGetter(dyo.q::k),
                  dyo.d.fieldOf("max_exclusive").forGetter(dyo.q::l),
                  dyn.d.fieldOf("when_in_range").forGetter(dyo.q::m),
                  dyn.d.fieldOf("when_out_of_range").forGetter(dyo.q::n)
               )
               .apply($$0, dyo.q::new)
      );
      public static final ayg<dyo.q> e = dyo.a(a);

      @Override
      public double a(dyn.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dyn.a $$1) {
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
      public dyn a(dyn.f $$0) {
         return $$0.apply(new dyo.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public ayg<? extends dyn> c() {
         return e;
      }

      public dyn j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dyn m() {
         return this.i;
      }

      public dyn n() {
         return this.j;
      }
   }

   protected static record r(dyn.c a) implements dyo.u {
      static final ayg<dyo.r> e = dyo.a(dyn.c.a, dyo.r::new, dyo.r::j);

      @Override
      public double a(dyn.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dyn a(dyn.f $$0) {
         return $$0.apply(new dyo.r($$0.a(this.a)));
      }

      @Override
      public ayg<? extends dyn> c() {
         return e;
      }

      @Override
      public dyn.c j() {
         return this.a;
      }
   }

   protected static record s(dyn.c a) implements dyo.u {
      static final ayg<dyo.s> e = dyo.a(dyn.c.a, dyo.s::new, dyo.s::j);

      @Override
      public double a(dyn.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dyn a(dyn.f $$0) {
         return $$0.apply(new dyo.s($$0.a(this.a)));
      }

      @Override
      public ayg<? extends dyn> c() {
         return e;
      }

      @Override
      public dyn.c j() {
         return this.a;
      }
   }

   protected static record t(dyn.c a) implements dyo.u {
      static final ayg<dyo.t> e = dyo.a(dyn.c.a, dyo.t::new, dyo.t::j);

      @Override
      public double a(dyn.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dyn a(dyn.f $$0) {
         return $$0.apply(new dyo.t($$0.a(this.a)));
      }

      @Override
      public ayg<? extends dyn> c() {
         return e;
      }

      @Override
      public dyn.c j() {
         return this.a;
      }
   }

   interface u extends dyn {
      dyn.c j();

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
      default void a(double[] $$0, dyn.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dyn e, dyn f, dyn g, double h, double i, dyn.c j) implements dyn {
      private static final MapCodec<dyo.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dyn.d.fieldOf("shift_x").forGetter(dyo.v::j),
                  dyn.d.fieldOf("shift_y").forGetter(dyo.v::k),
                  dyn.d.fieldOf("shift_z").forGetter(dyo.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dyo.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dyo.v::n),
                  dyn.c.a.fieldOf("noise").forGetter(dyo.v::o)
               )
               .apply($$0, dyo.v::new)
      );
      public static final ayg<dyo.v> a = dyo.a(k);

      @Override
      public double a(dyn.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dyn.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dyn a(dyn.f $$0) {
         return $$0.apply(new dyo.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public ayg<? extends dyn> c() {
         return a;
      }

      public dyn j() {
         return this.e;
      }

      public dyn k() {
         return this.f;
      }

      public dyn l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dyn.c o() {
         return this.j;
      }
   }

   public static record w(axo<dyo.w.b, dyo.w.a> e) implements dyn {
      private static final Codec<axo<dyo.w.b, dyo.w.a>> f = axo.a(dyo.w.a.b);
      private static final MapCodec<dyo.w> g = f.fieldOf("spline").xmap(dyo.w::new, dyo.w::j);
      public static final ayg<dyo.w> a = dyo.a(g);

      @Override
      public double a(dyn.b $$0) {
         return (double)this.e.a(new dyo.w.b($$0));
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
      public void a(double[] $$0, dyn.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dyn a(dyn.f $$0) {
         return $$0.apply(new dyo.w(this.e.a((axo.d<dyo.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public ayg<? extends dyn> c() {
         return a;
      }

      public axo<dyo.w.b, dyo.w.a> j() {
         return this.e;
      }

      public static record a(ja<dyn> c) implements azm<dyo.w.b> {
         public static final Codec<dyo.w.a> b = dyn.c.xmap(dyo.w.a::new, dyo.w.a::a);

         @Override
         public String toString() {
            Optional<aks<dyn>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               aks<dyn> $$1 = $$0.get();
               if ($$1 == dzb.d) {
                  return "continents";
               }

               if ($$1 == dzb.e) {
                  return "erosion";
               }

               if ($$1 == dzb.f) {
                  return "weirdness";
               }

               if ($$1 == dzb.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dyo.w.b $$0) {
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

         public dyo.w.a a(dyn.f $$0) {
            return new dyo.w.a(new ja.a<>(this.c.a().a($$0)));
         }

         public ja<dyn> a() {
            return this.c;
         }
      }

      public static record b(dyn.b a) {
      }
   }

   interface x extends dyn {
      dyn j();

      @Override
      default double a(dyn.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dyn.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dyn.b var1, double var2);
   }

   interface y extends dyn {
      Logger a = LogUtils.getLogger();

      static dyo.y a(dyo.y.a $$0, dyn $$1, dyn $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dyo.y.a.c || $$0 == dyo.y.a.d) {
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
         if ($$0 == dyo.y.a.b || $$0 == dyo.y.a.a) {
            if ($$1 instanceof dyo.h $$11) {
               return new dyo.n($$0 == dyo.y.a.a ? dyo.n.a.b : dyo.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dyo.h $$12) {
               return new dyo.n($$0 == dyo.y.a.a ? dyo.n.a.b : dyo.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dyo.a($$0, $$1, $$2, $$9, $$10);
      }

      dyo.y.a j();

      dyn k();

      dyn l();

      @Override
      default ayg<? extends dyn> c() {
         return this.j().e;
      }

      public static enum a implements azg {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final ayg<dyo.y> e = dyo.a((BiFunction<dyn, dyn, dyo.y>)(($$0x, $$1) -> dyo.y.a(this, $$0x, $$1)), dyo.y::k, dyo.y::l);
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

   protected static record z(dyn e, dyn.c f, dyo.z.a g) implements dyo.x {
      private static final MapCodec<dyo.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dyn.d.fieldOf("input").forGetter(dyo.z::j),
                  dyn.c.a.fieldOf("noise").forGetter(dyo.z::k),
                  dyo.z.a.c.fieldOf("rarity_value_mapper").forGetter(dyo.z::l)
               )
               .apply($$0, dyo.z::new)
      );
      public static final ayg<dyo.z> a = dyo.a(h);

      @Override
      public double a(dyn.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dyn a(dyn.f $$0) {
         return $$0.apply(new dyo.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public ayg<? extends dyn> c() {
         return a;
      }

      @Override
      public dyn j() {
         return this.e;
      }

      public dyn.c k() {
         return this.f;
      }

      public dyo.z.a l() {
         return this.g;
      }

      public static enum a implements azg {
         a("type_1", dzb.a::b, 2.0),
         b("type_2", dzb.a::a, 3.0);

         public static final Codec<dyo.z.a> c = azg.a(dyo.z.a::values);
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
