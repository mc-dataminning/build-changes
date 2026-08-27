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

public final class dml {
   private static final Codec<dmk> c = jy.ag.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dmk> b = Codec.either(d, c)
      .xmap($$0 -> (dmk)$$0.map(dml::a, Function.identity()), $$0 -> $$0 instanceof dml.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dmk> a(io<Codec<? extends dmk>> $$0) {
      a($$0, "blend_alpha", dml.d.e);
      a($$0, "blend_offset", dml.f.e);
      a($$0, "beardifier", dml.b.e);
      a($$0, "old_blended_noise", ebs.a);

      for (dml.l.a $$1 : dml.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dml.o.e);
      a($$0, "end_islands", dml.i.a);
      a($$0, "weird_scaled_sampler", dml.z.a);
      a($$0, "shifted_noise", dml.v.a);
      a($$0, "range_choice", dml.q.e);
      a($$0, "shift_a", dml.s.e);
      a($$0, "shift_b", dml.t.e);
      a($$0, "shift", dml.r.e);
      a($$0, "blend_density", dml.e.e);
      a($$0, "clamp", dml.g.a);

      for (dml.k.a $$2 : dml.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dml.y.a $$3 : dml.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dml.w.a);
      a($$0, "constant", dml.h.e);
      return a($$0, "y_clamped_gradient", dml.aa.a);
   }

   private static Codec<? extends dmk> a(io<Codec<? extends dmk>> $$0, String $$1, atg<? extends dmk> $$2) {
      return io.a($$0, $$1, $$2.a());
   }

   static <A, O> atg<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return atg.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> atg<O> a(Function<dmk, O> $$0, Function<O, dmk> $$1) {
      return a(dmk.d, $$0, $$1);
   }

   static <O> atg<O> a(BiFunction<dmk, dmk, O> $$0, Function<O, dmk> $$1, Function<O, dmk> $$2) {
      return atg.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dmk.d.fieldOf("argument1").forGetter($$1), dmk.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> atg<O> a(MapCodec<O> $$0) {
      return atg.a($$0);
   }

   private dml() {
   }

   public static dmk a(dmk $$0) {
      return new dml.l(dml.l.a.a, $$0);
   }

   public static dmk b(dmk $$0) {
      return new dml.l(dml.l.a.b, $$0);
   }

   public static dmk c(dmk $$0) {
      return new dml.l(dml.l.a.c, $$0);
   }

   public static dmk d(dmk $$0) {
      return new dml.l(dml.l.a.d, $$0);
   }

   public static dmk e(dmk $$0) {
      return new dml.l(dml.l.a.e, $$0);
   }

   public static dmk a(ib<ebv.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dml.o(new dmk.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dmk a(ib<ebv.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dmk a(ib<ebv.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dmk a(dmk $$0, dmk $$1, double $$2, ib<ebv.a> $$3) {
      return new dml.v($$0, a(), $$1, $$2, 0.0, new dmk.c($$3));
   }

   public static dmk a(ib<ebv.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dmk b(ib<ebv.a> $$0, double $$1, double $$2) {
      return new dml.o(new dmk.c($$0), $$1, $$2);
   }

   public static dmk a(ib<ebv.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dmk a(dmk $$0, double $$1, double $$2, dmk $$3, dmk $$4) {
      return new dml.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dmk b(ib<ebv.a> $$0) {
      return new dml.s(new dmk.c($$0));
   }

   public static dmk c(ib<ebv.a> $$0) {
      return new dml.t(new dmk.c($$0));
   }

   public static dmk d(ib<ebv.a> $$0) {
      return new dml.r(new dmk.c($$0));
   }

   public static dmk f(dmk $$0) {
      return new dml.e($$0);
   }

   public static dmk a(long $$0) {
      return new dml.i($$0);
   }

   public static dmk a(dmk $$0, ib<ebv.a> $$1, dml.z.a $$2) {
      return new dml.z($$0, new dmk.c($$1), $$2);
   }

   public static dmk a(dmk $$0, dmk $$1) {
      return dml.y.a(dml.y.a.a, $$0, $$1);
   }

   public static dmk b(dmk $$0, dmk $$1) {
      return dml.y.a(dml.y.a.b, $$0, $$1);
   }

   public static dmk c(dmk $$0, dmk $$1) {
      return dml.y.a(dml.y.a.c, $$0, $$1);
   }

   public static dmk d(dmk $$0, dmk $$1) {
      return dml.y.a(dml.y.a.d, $$0, $$1);
   }

   public static dmk a(asp<dml.w.b, dml.w.a> $$0) {
      return new dml.w($$0);
   }

   public static dmk a() {
      return dml.h.f;
   }

   public static dmk a(double $$0) {
      return new dml.h($$0);
   }

   public static dmk a(int $$0, int $$1, double $$2, double $$3) {
      return new dml.aa($$0, $$1, $$2, $$3);
   }

   public static dmk a(dmk $$0, dml.k.a $$1) {
      return dml.k.a($$1, $$0);
   }

   private static dmk a(dmk $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dmk b() {
      return dml.d.a;
   }

   public static dmk c() {
      return dml.f.a;
   }

   public static dmk a(dmk $$0, dmk $$1, dmk $$2) {
      if ($$1 instanceof dml.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dmk $$4 = d($$0);
         dmk $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dmk a(dmk $$0, double $$1, dmk $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dml.y.a e, dmk f, dmk g, double h, double i) implements dml.y {
      @Override
      public double a(dmk.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dmk.a $$1) {
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
      public dmk a(dmk.f $$0) {
         return $$0.apply(dml.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dml.y.a j() {
         return this.e;
      }

      @Override
      public dmk k() {
         return this.f;
      }

      @Override
      public dmk l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dmk.d {
      private static final MapCodec<dml.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dkr.e * 2, dkr.d * 2).fieldOf("from_y").forGetter(dml.aa::j),
                  Codec.intRange(dkr.e * 2, dkr.d * 2).fieldOf("to_y").forGetter(dml.aa::k),
                  dml.d.fieldOf("from_value").forGetter(dml.aa::l),
                  dml.d.fieldOf("to_value").forGetter(dml.aa::m)
               )
               .apply($$0, dml.aa::new)
      );
      public static final atg<dml.aa> a = dml.a(i);

      @Override
      public double a(dmk.b $$0) {
         return atm.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public atg<? extends dmk> c() {
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

   protected static enum b implements dml.c {
      a;

      @Override
      public double a(dmk.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dmk.a $$1) {
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

   public interface c extends dmk.d {
      atg<dmk> e = atg.a(MapCodec.unit(dml.b.a));

      @Override
      default atg<? extends dmk> c() {
         return e;
      }
   }

   protected static enum d implements dmk.d {
      a;

      public static final atg<dmk> e = atg.a(MapCodec.unit(a));

      @Override
      public double a(dmk.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dmk.a $$1) {
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
      public atg<? extends dmk> c() {
         return e;
      }
   }

   static record e(dmk a) implements dml.x {
      static final atg<dml.e> e = dml.a(dml.e::new, dml.e::j);

      @Override
      public double a(dmk.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dmk a(dmk.f $$0) {
         return $$0.apply(new dml.e(this.a.a($$0)));
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
      public atg<? extends dmk> c() {
         return e;
      }

      @Override
      public dmk j() {
         return this.a;
      }
   }

   protected static enum f implements dmk.d {
      a;

      public static final atg<dmk> e = atg.a(MapCodec.unit(a));

      @Override
      public double a(dmk.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dmk.a $$1) {
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
      public atg<? extends dmk> c() {
         return e;
      }
   }

   protected static record g(dmk e, double f, double g) implements dml.p {
      private static final MapCodec<dml.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dmk.b.fieldOf("input").forGetter(dml.g::aC_), dml.d.fieldOf("min").forGetter(dml.g::a), dml.d.fieldOf("max").forGetter(dml.g::b))
               .apply($$0, dml.g::new)
      );
      public static final atg<dml.g> a = dml.a(h);

      @Override
      public double a(double $$0) {
         return atm.a($$0, this.f, this.g);
      }

      @Override
      public dmk a(dmk.f $$0) {
         return new dml.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public atg<? extends dmk> c() {
         return a;
      }

      @Override
      public dmk aC_() {
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

   static record h(double a) implements dmk.d {
      static final atg<dml.h> e = dml.a(dml.d, dml.h::new, dml.h::j);
      static final dml.h f = new dml.h(0.0);

      @Override
      public void a(double[] $$0, dmk.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public atg<? extends dmk> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dmk.d {
      public static final atg<dml.i> a = atg.a(MapCodec.unit(new dml.i(0L)));
      private static final float e = -0.9F;
      private final eby f;

      public i(long $$0) {
         ats $$1 = new dms($$0);
         $$1.b(17292);
         this.f = new eby($$1);
      }

      private static float a(eby $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - atm.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = atm.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (atm.e((float)$$10) * 3439.0F + atm.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - atm.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = atm.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dmk.b $$0) {
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
      public atg<? extends dmk> c() {
         return a;
      }
   }

   @aup
   public static record j(ib<dmk> a) implements dmk {
      @Override
      public double a(dmk.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dmk.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dmk a(dmk.f $$0) {
         return $$0.apply(new dml.j(new ib.a<>(this.a.a().a($$0))));
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
      public atg<? extends dmk> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public ib<dmk> j() {
         return this.a;
      }
   }

   protected static record k(dml.k.a a, dmk e, double f, double g) implements dml.p {
      public static dml.k a(dml.k.a $$0, dmk $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dml.k.a.a && $$0 != dml.k.a.b ? new dml.k($$0, $$1, $$3, $$4) : new dml.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dml.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = atm.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dml.k b(dmk.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public atg<? extends dmk> c() {
         return this.a.h;
      }

      public dml.k.a k() {
         return this.a;
      }

      @Override
      public dmk aC_() {
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

      static enum a implements aug {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final atg<dml.k> h = dml.a($$0x -> dml.k.a(this, $$0x), dml.k::aC_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dml.l.a a, dmk e) implements dml.m {
      @Override
      public double a(dmk.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dmk.a $$1) {
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
      public dml.l.a j() {
         return this.a;
      }

      @Override
      public dmk k() {
         return this.e;
      }

      static enum a implements aug {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final atg<dml.m> g = dml.a($$0x -> new dml.l(this, $$0x), dml.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dmk {
      dml.l.a j();

      dmk k();

      @Override
      default atg<? extends dmk> c() {
         return this.j().g;
      }

      @Override
      default dmk a(dmk.f $$0) {
         return $$0.apply(new dml.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dml.n.a e, dmk f, double g, double h, double i) implements dml.p, dml.y {
      @Override
      public dml.y.a j() {
         return this.e == dml.n.a.a ? dml.y.a.b : dml.y.a.a;
      }

      @Override
      public dmk k() {
         return dml.a(this.i);
      }

      @Override
      public dmk l() {
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
      public dmk a(dmk.f $$0) {
         dmk $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dml.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dml.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dml.n.a m() {
         return this.e;
      }

      @Override
      public dmk aC_() {
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

   protected static record o(dmk.c f, @Deprecated double g, double h) implements dmk {
      public static final MapCodec<dml.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dmk.c.a.fieldOf("noise").forGetter(dml.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dml.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dml.o::l)
               )
               .apply($$0, dml.o::new)
      );
      public static final atg<dml.o> e = dml.a(a);

      @Override
      public double a(dmk.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dmk.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dmk a(dmk.f $$0) {
         return $$0.apply(new dml.o($$0.a(this.f), this.g, this.h));
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
      public atg<? extends dmk> c() {
         return e;
      }

      public dmk.c j() {
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

   interface p extends dmk {
      dmk aC_();

      @Override
      default double a(dmk.b $$0) {
         return this.a(this.aC_().a($$0));
      }

      @Override
      default void a(double[] $$0, dmk.a $$1) {
         this.aC_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dmk f, double g, double h, dmk i, dmk j) implements dmk {
      public static final MapCodec<dml.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dmk.d.fieldOf("input").forGetter(dml.q::j),
                  dml.d.fieldOf("min_inclusive").forGetter(dml.q::k),
                  dml.d.fieldOf("max_exclusive").forGetter(dml.q::l),
                  dmk.d.fieldOf("when_in_range").forGetter(dml.q::m),
                  dmk.d.fieldOf("when_out_of_range").forGetter(dml.q::n)
               )
               .apply($$0, dml.q::new)
      );
      public static final atg<dml.q> e = dml.a(a);

      @Override
      public double a(dmk.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dmk.a $$1) {
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
      public dmk a(dmk.f $$0) {
         return $$0.apply(new dml.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public atg<? extends dmk> c() {
         return e;
      }

      public dmk j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dmk m() {
         return this.i;
      }

      public dmk n() {
         return this.j;
      }
   }

   protected static record r(dmk.c a) implements dml.u {
      static final atg<dml.r> e = dml.a(dmk.c.a, dml.r::new, dml.r::j);

      @Override
      public double a(dmk.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dmk a(dmk.f $$0) {
         return $$0.apply(new dml.r($$0.a(this.a)));
      }

      @Override
      public atg<? extends dmk> c() {
         return e;
      }

      @Override
      public dmk.c j() {
         return this.a;
      }
   }

   protected static record s(dmk.c a) implements dml.u {
      static final atg<dml.s> e = dml.a(dmk.c.a, dml.s::new, dml.s::j);

      @Override
      public double a(dmk.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dmk a(dmk.f $$0) {
         return $$0.apply(new dml.s($$0.a(this.a)));
      }

      @Override
      public atg<? extends dmk> c() {
         return e;
      }

      @Override
      public dmk.c j() {
         return this.a;
      }
   }

   protected static record t(dmk.c a) implements dml.u {
      static final atg<dml.t> e = dml.a(dmk.c.a, dml.t::new, dml.t::j);

      @Override
      public double a(dmk.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dmk a(dmk.f $$0) {
         return $$0.apply(new dml.t($$0.a(this.a)));
      }

      @Override
      public atg<? extends dmk> c() {
         return e;
      }

      @Override
      public dmk.c j() {
         return this.a;
      }
   }

   interface u extends dmk {
      dmk.c j();

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
      default void a(double[] $$0, dmk.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dmk e, dmk f, dmk g, double h, double i, dmk.c j) implements dmk {
      private static final MapCodec<dml.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dmk.d.fieldOf("shift_x").forGetter(dml.v::j),
                  dmk.d.fieldOf("shift_y").forGetter(dml.v::k),
                  dmk.d.fieldOf("shift_z").forGetter(dml.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dml.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dml.v::n),
                  dmk.c.a.fieldOf("noise").forGetter(dml.v::o)
               )
               .apply($$0, dml.v::new)
      );
      public static final atg<dml.v> a = dml.a(k);

      @Override
      public double a(dmk.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dmk.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dmk a(dmk.f $$0) {
         return $$0.apply(new dml.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public atg<? extends dmk> c() {
         return a;
      }

      public dmk j() {
         return this.e;
      }

      public dmk k() {
         return this.f;
      }

      public dmk l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dmk.c o() {
         return this.j;
      }
   }

   public static record w(asp<dml.w.b, dml.w.a> e) implements dmk {
      private static final Codec<asp<dml.w.b, dml.w.a>> f = asp.a(dml.w.a.b);
      private static final MapCodec<dml.w> g = f.fieldOf("spline").xmap(dml.w::new, dml.w::j);
      public static final atg<dml.w> a = dml.a(g);

      @Override
      public double a(dmk.b $$0) {
         return (double)this.e.a(new dml.w.b($$0));
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
      public void a(double[] $$0, dmk.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dmk a(dmk.f $$0) {
         return $$0.apply(new dml.w(this.e.a((asp.d<dml.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public atg<? extends dmk> c() {
         return a;
      }

      public asp<dml.w.b, dml.w.a> j() {
         return this.e;
      }

      public static record a(ib<dmk> c) implements aum<dml.w.b> {
         public static final Codec<dml.w.a> b = dmk.c.xmap(dml.w.a::new, dml.w.a::a);

         @Override
         public String toString() {
            Optional<agh<dmk>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               agh<dmk> $$1 = $$0.get();
               if ($$1 == dmy.d) {
                  return "continents";
               }

               if ($$1 == dmy.e) {
                  return "erosion";
               }

               if ($$1 == dmy.f) {
                  return "weirdness";
               }

               if ($$1 == dmy.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dml.w.b $$0) {
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

         public dml.w.a a(dmk.f $$0) {
            return new dml.w.a(new ib.a<>(this.c.a().a($$0)));
         }

         public ib<dmk> a() {
            return this.c;
         }
      }

      public static record b(dmk.b a) {
      }
   }

   interface x extends dmk {
      dmk j();

      @Override
      default double a(dmk.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dmk.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dmk.b var1, double var2);
   }

   interface y extends dmk {
      Logger a = LogUtils.getLogger();

      static dml.y a(dml.y.a $$0, dmk $$1, dmk $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dml.y.a.c || $$0 == dml.y.a.d) {
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
         if ($$0 == dml.y.a.b || $$0 == dml.y.a.a) {
            if ($$1 instanceof dml.h $$11) {
               return new dml.n($$0 == dml.y.a.a ? dml.n.a.b : dml.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dml.h $$12) {
               return new dml.n($$0 == dml.y.a.a ? dml.n.a.b : dml.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dml.a($$0, $$1, $$2, $$9, $$10);
      }

      dml.y.a j();

      dmk k();

      dmk l();

      @Override
      default atg<? extends dmk> c() {
         return this.j().e;
      }

      public static enum a implements aug {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final atg<dml.y> e = dml.a((BiFunction<dmk, dmk, dml.y>)(($$0x, $$1) -> dml.y.a(this, $$0x, $$1)), dml.y::k, dml.y::l);
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

   protected static record z(dmk e, dmk.c f, dml.z.a g) implements dml.x {
      private static final MapCodec<dml.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dmk.d.fieldOf("input").forGetter(dml.z::j),
                  dmk.c.a.fieldOf("noise").forGetter(dml.z::k),
                  dml.z.a.c.fieldOf("rarity_value_mapper").forGetter(dml.z::l)
               )
               .apply($$0, dml.z::new)
      );
      public static final atg<dml.z> a = dml.a(h);

      @Override
      public double a(dmk.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dmk a(dmk.f $$0) {
         return $$0.apply(new dml.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public atg<? extends dmk> c() {
         return a;
      }

      @Override
      public dmk j() {
         return this.e;
      }

      public dmk.c k() {
         return this.f;
      }

      public dml.z.a l() {
         return this.g;
      }

      public static enum a implements aug {
         a("type_1", dmy.a::b, 2.0),
         b("type_2", dmy.a::a, 3.0);

         public static final Codec<dml.z.a> c = aug.a(dml.z.a::values);
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
