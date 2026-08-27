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

public final class duu {
   private static final Codec<dut> c = kt.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dut> b = Codec.either(d, c)
      .xmap($$0 -> (dut)$$0.map(duu::a, Function.identity()), $$0 -> $$0 instanceof duu.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dut> a(ja<Codec<? extends dut>> $$0) {
      a($$0, "blend_alpha", duu.d.e);
      a($$0, "blend_offset", duu.f.e);
      a($$0, "beardifier", duu.b.e);
      a($$0, "old_blended_noise", ekb.a);

      for (duu.l.a $$1 : duu.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", duu.o.e);
      a($$0, "end_islands", duu.i.a);
      a($$0, "weird_scaled_sampler", duu.z.a);
      a($$0, "shifted_noise", duu.v.a);
      a($$0, "range_choice", duu.q.e);
      a($$0, "shift_a", duu.s.e);
      a($$0, "shift_b", duu.t.e);
      a($$0, "shift", duu.r.e);
      a($$0, "blend_density", duu.e.e);
      a($$0, "clamp", duu.g.a);

      for (duu.k.a $$2 : duu.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (duu.y.a $$3 : duu.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", duu.w.a);
      a($$0, "constant", duu.h.e);
      return a($$0, "y_clamped_gradient", duu.aa.a);
   }

   private static Codec<? extends dut> a(ja<Codec<? extends dut>> $$0, String $$1, axg<? extends dut> $$2) {
      return ja.a($$0, $$1, $$2.a());
   }

   static <A, O> axg<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return axg.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> axg<O> a(Function<dut, O> $$0, Function<O, dut> $$1) {
      return a(dut.d, $$0, $$1);
   }

   static <O> axg<O> a(BiFunction<dut, dut, O> $$0, Function<O, dut> $$1, Function<O, dut> $$2) {
      return axg.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dut.d.fieldOf("argument1").forGetter($$1), dut.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> axg<O> a(MapCodec<O> $$0) {
      return axg.a($$0);
   }

   private duu() {
   }

   public static dut a(dut $$0) {
      return new duu.l(duu.l.a.a, $$0);
   }

   public static dut b(dut $$0) {
      return new duu.l(duu.l.a.b, $$0);
   }

   public static dut c(dut $$0) {
      return new duu.l(duu.l.a.c, $$0);
   }

   public static dut d(dut $$0) {
      return new duu.l(duu.l.a.d, $$0);
   }

   public static dut e(dut $$0) {
      return new duu.l(duu.l.a.e, $$0);
   }

   public static dut a(in<eke.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new duu.o(new dut.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dut a(in<eke.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dut a(in<eke.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dut a(dut $$0, dut $$1, double $$2, in<eke.a> $$3) {
      return new duu.v($$0, a(), $$1, $$2, 0.0, new dut.c($$3));
   }

   public static dut a(in<eke.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dut b(in<eke.a> $$0, double $$1, double $$2) {
      return new duu.o(new dut.c($$0), $$1, $$2);
   }

   public static dut a(in<eke.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dut a(dut $$0, double $$1, double $$2, dut $$3, dut $$4) {
      return new duu.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dut b(in<eke.a> $$0) {
      return new duu.s(new dut.c($$0));
   }

   public static dut c(in<eke.a> $$0) {
      return new duu.t(new dut.c($$0));
   }

   public static dut d(in<eke.a> $$0) {
      return new duu.r(new dut.c($$0));
   }

   public static dut f(dut $$0) {
      return new duu.e($$0);
   }

   public static dut a(long $$0) {
      return new duu.i($$0);
   }

   public static dut a(dut $$0, in<eke.a> $$1, duu.z.a $$2) {
      return new duu.z($$0, new dut.c($$1), $$2);
   }

   public static dut a(dut $$0, dut $$1) {
      return duu.y.a(duu.y.a.a, $$0, $$1);
   }

   public static dut b(dut $$0, dut $$1) {
      return duu.y.a(duu.y.a.b, $$0, $$1);
   }

   public static dut c(dut $$0, dut $$1) {
      return duu.y.a(duu.y.a.c, $$0, $$1);
   }

   public static dut d(dut $$0, dut $$1) {
      return duu.y.a(duu.y.a.d, $$0, $$1);
   }

   public static dut a(awo<duu.w.b, duu.w.a> $$0) {
      return new duu.w($$0);
   }

   public static dut a() {
      return duu.h.f;
   }

   public static dut a(double $$0) {
      return new duu.h($$0);
   }

   public static dut a(int $$0, int $$1, double $$2, double $$3) {
      return new duu.aa($$0, $$1, $$2, $$3);
   }

   public static dut a(dut $$0, duu.k.a $$1) {
      return duu.k.a($$1, $$0);
   }

   private static dut a(dut $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dut b() {
      return duu.d.a;
   }

   public static dut c() {
      return duu.f.a;
   }

   public static dut a(dut $$0, dut $$1, dut $$2) {
      if ($$1 instanceof duu.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dut $$4 = d($$0);
         dut $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dut a(dut $$0, double $$1, dut $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(duu.y.a e, dut f, dut g, double h, double i) implements duu.y {
      @Override
      public double a(dut.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dut.a $$1) {
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
      public dut a(dut.f $$0) {
         return $$0.apply(duu.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public duu.y.a j() {
         return this.e;
      }

      @Override
      public dut k() {
         return this.f;
      }

      @Override
      public dut l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dut.d {
      private static final MapCodec<duu.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dta.e * 2, dta.d * 2).fieldOf("from_y").forGetter(duu.aa::j),
                  Codec.intRange(dta.e * 2, dta.d * 2).fieldOf("to_y").forGetter(duu.aa::k),
                  duu.d.fieldOf("from_value").forGetter(duu.aa::l),
                  duu.d.fieldOf("to_value").forGetter(duu.aa::m)
               )
               .apply($$0, duu.aa::new)
      );
      public static final axg<duu.aa> a = duu.a(i);

      @Override
      public double a(dut.b $$0) {
         return axm.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public axg<? extends dut> c() {
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

   protected static enum b implements duu.c {
      a;

      @Override
      public double a(dut.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dut.a $$1) {
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

   public interface c extends dut.d {
      axg<dut> e = axg.a(MapCodec.unit(duu.b.a));

      @Override
      default axg<? extends dut> c() {
         return e;
      }
   }

   protected static enum d implements dut.d {
      a;

      public static final axg<dut> e = axg.a(MapCodec.unit(a));

      @Override
      public double a(dut.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dut.a $$1) {
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
      public axg<? extends dut> c() {
         return e;
      }
   }

   static record e(dut a) implements duu.x {
      static final axg<duu.e> e = duu.a(duu.e::new, duu.e::j);

      @Override
      public double a(dut.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dut a(dut.f $$0) {
         return $$0.apply(new duu.e(this.a.a($$0)));
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
      public axg<? extends dut> c() {
         return e;
      }

      @Override
      public dut j() {
         return this.a;
      }
   }

   protected static enum f implements dut.d {
      a;

      public static final axg<dut> e = axg.a(MapCodec.unit(a));

      @Override
      public double a(dut.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dut.a $$1) {
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
      public axg<? extends dut> c() {
         return e;
      }
   }

   protected static record g(dut e, double f, double g) implements duu.p {
      private static final MapCodec<duu.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dut.b.fieldOf("input").forGetter(duu.g::aA_), duu.d.fieldOf("min").forGetter(duu.g::a), duu.d.fieldOf("max").forGetter(duu.g::b))
               .apply($$0, duu.g::new)
      );
      public static final axg<duu.g> a = duu.a(h);

      @Override
      public double a(double $$0) {
         return axm.a($$0, this.f, this.g);
      }

      @Override
      public dut a(dut.f $$0) {
         return new duu.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public axg<? extends dut> c() {
         return a;
      }

      @Override
      public dut aA_() {
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

   static record h(double a) implements dut.d {
      static final axg<duu.h> e = duu.a(duu.d, duu.h::new, duu.h::j);
      static final duu.h f = new duu.h(0.0);

      @Override
      public void a(double[] $$0, dut.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public axg<? extends dut> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dut.d {
      public static final axg<duu.i> a = axg.a(MapCodec.unit(new duu.i(0L)));
      private static final float e = -0.9F;
      private final ekh f;

      public i(long $$0) {
         axt $$1 = new dvb($$0);
         $$1.b(17292);
         this.f = new ekh($$1);
      }

      private static float a(ekh $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - axm.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = axm.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (axm.e((float)$$10) * 3439.0F + axm.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - axm.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = axm.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dut.b $$0) {
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
      public axg<? extends dut> c() {
         return a;
      }
   }

   @ayp
   public static record j(in<dut> a) implements dut {
      @Override
      public double a(dut.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dut.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dut a(dut.f $$0) {
         return $$0.apply(new duu.j(new in.a<>(this.a.a().a($$0))));
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
      public axg<? extends dut> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public in<dut> j() {
         return this.a;
      }
   }

   protected static record k(duu.k.a a, dut e, double f, double g) implements duu.p {
      public static duu.k a(duu.k.a $$0, dut $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != duu.k.a.a && $$0 != duu.k.a.b ? new duu.k($$0, $$1, $$3, $$4) : new duu.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(duu.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = axm.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public duu.k b(dut.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public axg<? extends dut> c() {
         return this.a.h;
      }

      public duu.k.a k() {
         return this.a;
      }

      @Override
      public dut aA_() {
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

      static enum a implements ayg {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final axg<duu.k> h = duu.a($$0x -> duu.k.a(this, $$0x), duu.k::aA_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(duu.l.a a, dut e) implements duu.m {
      @Override
      public double a(dut.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dut.a $$1) {
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
      public duu.l.a j() {
         return this.a;
      }

      @Override
      public dut k() {
         return this.e;
      }

      static enum a implements ayg {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final axg<duu.m> g = duu.a($$0x -> new duu.l(this, $$0x), duu.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dut {
      duu.l.a j();

      dut k();

      @Override
      default axg<? extends dut> c() {
         return this.j().g;
      }

      @Override
      default dut a(dut.f $$0) {
         return $$0.apply(new duu.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(duu.n.a e, dut f, double g, double h, double i) implements duu.p, duu.y {
      @Override
      public duu.y.a j() {
         return this.e == duu.n.a.a ? duu.y.a.b : duu.y.a.a;
      }

      @Override
      public dut k() {
         return duu.a(this.i);
      }

      @Override
      public dut l() {
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
      public dut a(dut.f $$0) {
         dut $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == duu.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new duu.n(this.e, $$1, $$4, $$5, this.i);
      }

      public duu.n.a m() {
         return this.e;
      }

      @Override
      public dut aA_() {
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

   protected static record o(dut.c f, @Deprecated double g, double h) implements dut {
      public static final MapCodec<duu.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dut.c.a.fieldOf("noise").forGetter(duu.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(duu.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(duu.o::l)
               )
               .apply($$0, duu.o::new)
      );
      public static final axg<duu.o> e = duu.a(a);

      @Override
      public double a(dut.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dut.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dut a(dut.f $$0) {
         return $$0.apply(new duu.o($$0.a(this.f), this.g, this.h));
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
      public axg<? extends dut> c() {
         return e;
      }

      public dut.c j() {
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

   interface p extends dut {
      dut aA_();

      @Override
      default double a(dut.b $$0) {
         return this.a(this.aA_().a($$0));
      }

      @Override
      default void a(double[] $$0, dut.a $$1) {
         this.aA_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dut f, double g, double h, dut i, dut j) implements dut {
      public static final MapCodec<duu.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dut.d.fieldOf("input").forGetter(duu.q::j),
                  duu.d.fieldOf("min_inclusive").forGetter(duu.q::k),
                  duu.d.fieldOf("max_exclusive").forGetter(duu.q::l),
                  dut.d.fieldOf("when_in_range").forGetter(duu.q::m),
                  dut.d.fieldOf("when_out_of_range").forGetter(duu.q::n)
               )
               .apply($$0, duu.q::new)
      );
      public static final axg<duu.q> e = duu.a(a);

      @Override
      public double a(dut.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dut.a $$1) {
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
      public dut a(dut.f $$0) {
         return $$0.apply(new duu.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public axg<? extends dut> c() {
         return e;
      }

      public dut j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dut m() {
         return this.i;
      }

      public dut n() {
         return this.j;
      }
   }

   protected static record r(dut.c a) implements duu.u {
      static final axg<duu.r> e = duu.a(dut.c.a, duu.r::new, duu.r::j);

      @Override
      public double a(dut.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dut a(dut.f $$0) {
         return $$0.apply(new duu.r($$0.a(this.a)));
      }

      @Override
      public axg<? extends dut> c() {
         return e;
      }

      @Override
      public dut.c j() {
         return this.a;
      }
   }

   protected static record s(dut.c a) implements duu.u {
      static final axg<duu.s> e = duu.a(dut.c.a, duu.s::new, duu.s::j);

      @Override
      public double a(dut.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dut a(dut.f $$0) {
         return $$0.apply(new duu.s($$0.a(this.a)));
      }

      @Override
      public axg<? extends dut> c() {
         return e;
      }

      @Override
      public dut.c j() {
         return this.a;
      }
   }

   protected static record t(dut.c a) implements duu.u {
      static final axg<duu.t> e = duu.a(dut.c.a, duu.t::new, duu.t::j);

      @Override
      public double a(dut.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dut a(dut.f $$0) {
         return $$0.apply(new duu.t($$0.a(this.a)));
      }

      @Override
      public axg<? extends dut> c() {
         return e;
      }

      @Override
      public dut.c j() {
         return this.a;
      }
   }

   interface u extends dut {
      dut.c j();

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
      default void a(double[] $$0, dut.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dut e, dut f, dut g, double h, double i, dut.c j) implements dut {
      private static final MapCodec<duu.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dut.d.fieldOf("shift_x").forGetter(duu.v::j),
                  dut.d.fieldOf("shift_y").forGetter(duu.v::k),
                  dut.d.fieldOf("shift_z").forGetter(duu.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(duu.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(duu.v::n),
                  dut.c.a.fieldOf("noise").forGetter(duu.v::o)
               )
               .apply($$0, duu.v::new)
      );
      public static final axg<duu.v> a = duu.a(k);

      @Override
      public double a(dut.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dut.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dut a(dut.f $$0) {
         return $$0.apply(new duu.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public axg<? extends dut> c() {
         return a;
      }

      public dut j() {
         return this.e;
      }

      public dut k() {
         return this.f;
      }

      public dut l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dut.c o() {
         return this.j;
      }
   }

   public static record w(awo<duu.w.b, duu.w.a> e) implements dut {
      private static final Codec<awo<duu.w.b, duu.w.a>> f = awo.a(duu.w.a.b);
      private static final MapCodec<duu.w> g = f.fieldOf("spline").xmap(duu.w::new, duu.w::j);
      public static final axg<duu.w> a = duu.a(g);

      @Override
      public double a(dut.b $$0) {
         return (double)this.e.a(new duu.w.b($$0));
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
      public void a(double[] $$0, dut.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dut a(dut.f $$0) {
         return $$0.apply(new duu.w(this.e.a((awo.d<duu.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public axg<? extends dut> c() {
         return a;
      }

      public awo<duu.w.b, duu.w.a> j() {
         return this.e;
      }

      public static record a(in<dut> c) implements aym<duu.w.b> {
         public static final Codec<duu.w.a> b = dut.c.xmap(duu.w.a::new, duu.w.a::a);

         @Override
         public String toString() {
            Optional<aju<dut>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               aju<dut> $$1 = $$0.get();
               if ($$1 == dvh.d) {
                  return "continents";
               }

               if ($$1 == dvh.e) {
                  return "erosion";
               }

               if ($$1 == dvh.f) {
                  return "weirdness";
               }

               if ($$1 == dvh.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(duu.w.b $$0) {
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

         public duu.w.a a(dut.f $$0) {
            return new duu.w.a(new in.a<>(this.c.a().a($$0)));
         }

         public in<dut> a() {
            return this.c;
         }
      }

      public static record b(dut.b a) {
      }
   }

   interface x extends dut {
      dut j();

      @Override
      default double a(dut.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dut.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dut.b var1, double var2);
   }

   interface y extends dut {
      Logger a = LogUtils.getLogger();

      static duu.y a(duu.y.a $$0, dut $$1, dut $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == duu.y.a.c || $$0 == duu.y.a.d) {
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
         if ($$0 == duu.y.a.b || $$0 == duu.y.a.a) {
            if ($$1 instanceof duu.h $$11) {
               return new duu.n($$0 == duu.y.a.a ? duu.n.a.b : duu.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof duu.h $$12) {
               return new duu.n($$0 == duu.y.a.a ? duu.n.a.b : duu.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new duu.a($$0, $$1, $$2, $$9, $$10);
      }

      duu.y.a j();

      dut k();

      dut l();

      @Override
      default axg<? extends dut> c() {
         return this.j().e;
      }

      public static enum a implements ayg {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final axg<duu.y> e = duu.a((BiFunction<dut, dut, duu.y>)(($$0x, $$1) -> duu.y.a(this, $$0x, $$1)), duu.y::k, duu.y::l);
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

   protected static record z(dut e, dut.c f, duu.z.a g) implements duu.x {
      private static final MapCodec<duu.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dut.d.fieldOf("input").forGetter(duu.z::j),
                  dut.c.a.fieldOf("noise").forGetter(duu.z::k),
                  duu.z.a.c.fieldOf("rarity_value_mapper").forGetter(duu.z::l)
               )
               .apply($$0, duu.z::new)
      );
      public static final axg<duu.z> a = duu.a(h);

      @Override
      public double a(dut.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dut a(dut.f $$0) {
         return $$0.apply(new duu.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public axg<? extends dut> c() {
         return a;
      }

      @Override
      public dut j() {
         return this.e;
      }

      public dut.c k() {
         return this.f;
      }

      public duu.z.a l() {
         return this.g;
      }

      public static enum a implements ayg {
         a("type_1", dvh.a::b, 2.0),
         b("type_2", dvh.a::a, 3.0);

         public static final Codec<duu.z.a> c = ayg.a(duu.z.a::values);
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
