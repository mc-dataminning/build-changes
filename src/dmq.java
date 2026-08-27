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

public final class dmq {
   private static final Codec<dmp> c = kc.ag.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dmp> b = Codec.either(d, c)
      .xmap($$0 -> (dmp)$$0.map(dmq::a, Function.identity()), $$0 -> $$0 instanceof dmq.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dmp> a(is<Codec<? extends dmp>> $$0) {
      a($$0, "blend_alpha", dmq.d.e);
      a($$0, "blend_offset", dmq.f.e);
      a($$0, "beardifier", dmq.b.e);
      a($$0, "old_blended_noise", ebx.a);

      for (dmq.l.a $$1 : dmq.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dmq.o.e);
      a($$0, "end_islands", dmq.i.a);
      a($$0, "weird_scaled_sampler", dmq.z.a);
      a($$0, "shifted_noise", dmq.v.a);
      a($$0, "range_choice", dmq.q.e);
      a($$0, "shift_a", dmq.s.e);
      a($$0, "shift_b", dmq.t.e);
      a($$0, "shift", dmq.r.e);
      a($$0, "blend_density", dmq.e.e);
      a($$0, "clamp", dmq.g.a);

      for (dmq.k.a $$2 : dmq.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dmq.y.a $$3 : dmq.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dmq.w.a);
      a($$0, "constant", dmq.h.e);
      return a($$0, "y_clamped_gradient", dmq.aa.a);
   }

   private static Codec<? extends dmp> a(is<Codec<? extends dmp>> $$0, String $$1, atk<? extends dmp> $$2) {
      return is.a($$0, $$1, $$2.a());
   }

   static <A, O> atk<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return atk.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> atk<O> a(Function<dmp, O> $$0, Function<O, dmp> $$1) {
      return a(dmp.d, $$0, $$1);
   }

   static <O> atk<O> a(BiFunction<dmp, dmp, O> $$0, Function<O, dmp> $$1, Function<O, dmp> $$2) {
      return atk.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dmp.d.fieldOf("argument1").forGetter($$1), dmp.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> atk<O> a(MapCodec<O> $$0) {
      return atk.a($$0);
   }

   private dmq() {
   }

   public static dmp a(dmp $$0) {
      return new dmq.l(dmq.l.a.a, $$0);
   }

   public static dmp b(dmp $$0) {
      return new dmq.l(dmq.l.a.b, $$0);
   }

   public static dmp c(dmp $$0) {
      return new dmq.l(dmq.l.a.c, $$0);
   }

   public static dmp d(dmp $$0) {
      return new dmq.l(dmq.l.a.d, $$0);
   }

   public static dmp e(dmp $$0) {
      return new dmq.l(dmq.l.a.e, $$0);
   }

   public static dmp a(ig<eca.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dmq.o(new dmp.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dmp a(ig<eca.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dmp a(ig<eca.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dmp a(dmp $$0, dmp $$1, double $$2, ig<eca.a> $$3) {
      return new dmq.v($$0, a(), $$1, $$2, 0.0, new dmp.c($$3));
   }

   public static dmp a(ig<eca.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dmp b(ig<eca.a> $$0, double $$1, double $$2) {
      return new dmq.o(new dmp.c($$0), $$1, $$2);
   }

   public static dmp a(ig<eca.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dmp a(dmp $$0, double $$1, double $$2, dmp $$3, dmp $$4) {
      return new dmq.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dmp b(ig<eca.a> $$0) {
      return new dmq.s(new dmp.c($$0));
   }

   public static dmp c(ig<eca.a> $$0) {
      return new dmq.t(new dmp.c($$0));
   }

   public static dmp d(ig<eca.a> $$0) {
      return new dmq.r(new dmp.c($$0));
   }

   public static dmp f(dmp $$0) {
      return new dmq.e($$0);
   }

   public static dmp a(long $$0) {
      return new dmq.i($$0);
   }

   public static dmp a(dmp $$0, ig<eca.a> $$1, dmq.z.a $$2) {
      return new dmq.z($$0, new dmp.c($$1), $$2);
   }

   public static dmp a(dmp $$0, dmp $$1) {
      return dmq.y.a(dmq.y.a.a, $$0, $$1);
   }

   public static dmp b(dmp $$0, dmp $$1) {
      return dmq.y.a(dmq.y.a.b, $$0, $$1);
   }

   public static dmp c(dmp $$0, dmp $$1) {
      return dmq.y.a(dmq.y.a.c, $$0, $$1);
   }

   public static dmp d(dmp $$0, dmp $$1) {
      return dmq.y.a(dmq.y.a.d, $$0, $$1);
   }

   public static dmp a(ast<dmq.w.b, dmq.w.a> $$0) {
      return new dmq.w($$0);
   }

   public static dmp a() {
      return dmq.h.f;
   }

   public static dmp a(double $$0) {
      return new dmq.h($$0);
   }

   public static dmp a(int $$0, int $$1, double $$2, double $$3) {
      return new dmq.aa($$0, $$1, $$2, $$3);
   }

   public static dmp a(dmp $$0, dmq.k.a $$1) {
      return dmq.k.a($$1, $$0);
   }

   private static dmp a(dmp $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dmp b() {
      return dmq.d.a;
   }

   public static dmp c() {
      return dmq.f.a;
   }

   public static dmp a(dmp $$0, dmp $$1, dmp $$2) {
      if ($$1 instanceof dmq.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dmp $$4 = d($$0);
         dmp $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dmp a(dmp $$0, double $$1, dmp $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dmq.y.a e, dmp f, dmp g, double h, double i) implements dmq.y {
      @Override
      public double a(dmp.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dmp.a $$1) {
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
      public dmp a(dmp.f $$0) {
         return $$0.apply(dmq.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dmq.y.a j() {
         return this.e;
      }

      @Override
      public dmp k() {
         return this.f;
      }

      @Override
      public dmp l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dmp.d {
      private static final MapCodec<dmq.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dkw.e * 2, dkw.d * 2).fieldOf("from_y").forGetter(dmq.aa::j),
                  Codec.intRange(dkw.e * 2, dkw.d * 2).fieldOf("to_y").forGetter(dmq.aa::k),
                  dmq.d.fieldOf("from_value").forGetter(dmq.aa::l),
                  dmq.d.fieldOf("to_value").forGetter(dmq.aa::m)
               )
               .apply($$0, dmq.aa::new)
      );
      public static final atk<dmq.aa> a = dmq.a(i);

      @Override
      public double a(dmp.b $$0) {
         return atq.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public atk<? extends dmp> c() {
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

   protected static enum b implements dmq.c {
      a;

      @Override
      public double a(dmp.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dmp.a $$1) {
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

   public interface c extends dmp.d {
      atk<dmp> e = atk.a(MapCodec.unit(dmq.b.a));

      @Override
      default atk<? extends dmp> c() {
         return e;
      }
   }

   protected static enum d implements dmp.d {
      a;

      public static final atk<dmp> e = atk.a(MapCodec.unit(a));

      @Override
      public double a(dmp.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dmp.a $$1) {
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
      public atk<? extends dmp> c() {
         return e;
      }
   }

   static record e(dmp a) implements dmq.x {
      static final atk<dmq.e> e = dmq.a(dmq.e::new, dmq.e::j);

      @Override
      public double a(dmp.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dmp a(dmp.f $$0) {
         return $$0.apply(new dmq.e(this.a.a($$0)));
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
      public atk<? extends dmp> c() {
         return e;
      }

      @Override
      public dmp j() {
         return this.a;
      }
   }

   protected static enum f implements dmp.d {
      a;

      public static final atk<dmp> e = atk.a(MapCodec.unit(a));

      @Override
      public double a(dmp.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dmp.a $$1) {
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
      public atk<? extends dmp> c() {
         return e;
      }
   }

   protected static record g(dmp e, double f, double g) implements dmq.p {
      private static final MapCodec<dmq.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dmp.b.fieldOf("input").forGetter(dmq.g::aD_), dmq.d.fieldOf("min").forGetter(dmq.g::a), dmq.d.fieldOf("max").forGetter(dmq.g::b))
               .apply($$0, dmq.g::new)
      );
      public static final atk<dmq.g> a = dmq.a(h);

      @Override
      public double a(double $$0) {
         return atq.a($$0, this.f, this.g);
      }

      @Override
      public dmp a(dmp.f $$0) {
         return new dmq.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public atk<? extends dmp> c() {
         return a;
      }

      @Override
      public dmp aD_() {
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

   static record h(double a) implements dmp.d {
      static final atk<dmq.h> e = dmq.a(dmq.d, dmq.h::new, dmq.h::j);
      static final dmq.h f = new dmq.h(0.0);

      @Override
      public void a(double[] $$0, dmp.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public atk<? extends dmp> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dmp.d {
      public static final atk<dmq.i> a = atk.a(MapCodec.unit(new dmq.i(0L)));
      private static final float e = -0.9F;
      private final ecd f;

      public i(long $$0) {
         atw $$1 = new dmx($$0);
         $$1.b(17292);
         this.f = new ecd($$1);
      }

      private static float a(ecd $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - atq.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = atq.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (atq.e((float)$$10) * 3439.0F + atq.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - atq.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = atq.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dmp.b $$0) {
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
      public atk<? extends dmp> c() {
         return a;
      }
   }

   @aut
   public static record j(ig<dmp> a) implements dmp {
      @Override
      public double a(dmp.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dmp.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dmp a(dmp.f $$0) {
         return $$0.apply(new dmq.j(new ig.a<>(this.a.a().a($$0))));
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
      public atk<? extends dmp> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public ig<dmp> j() {
         return this.a;
      }
   }

   protected static record k(dmq.k.a a, dmp e, double f, double g) implements dmq.p {
      public static dmq.k a(dmq.k.a $$0, dmp $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dmq.k.a.a && $$0 != dmq.k.a.b ? new dmq.k($$0, $$1, $$3, $$4) : new dmq.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dmq.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = atq.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dmq.k b(dmp.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public atk<? extends dmp> c() {
         return this.a.h;
      }

      public dmq.k.a k() {
         return this.a;
      }

      @Override
      public dmp aD_() {
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

      static enum a implements auk {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final atk<dmq.k> h = dmq.a($$0x -> dmq.k.a(this, $$0x), dmq.k::aD_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dmq.l.a a, dmp e) implements dmq.m {
      @Override
      public double a(dmp.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dmp.a $$1) {
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
      public dmq.l.a j() {
         return this.a;
      }

      @Override
      public dmp k() {
         return this.e;
      }

      static enum a implements auk {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final atk<dmq.m> g = dmq.a($$0x -> new dmq.l(this, $$0x), dmq.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dmp {
      dmq.l.a j();

      dmp k();

      @Override
      default atk<? extends dmp> c() {
         return this.j().g;
      }

      @Override
      default dmp a(dmp.f $$0) {
         return $$0.apply(new dmq.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dmq.n.a e, dmp f, double g, double h, double i) implements dmq.p, dmq.y {
      @Override
      public dmq.y.a j() {
         return this.e == dmq.n.a.a ? dmq.y.a.b : dmq.y.a.a;
      }

      @Override
      public dmp k() {
         return dmq.a(this.i);
      }

      @Override
      public dmp l() {
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
      public dmp a(dmp.f $$0) {
         dmp $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dmq.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dmq.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dmq.n.a m() {
         return this.e;
      }

      @Override
      public dmp aD_() {
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

   protected static record o(dmp.c f, @Deprecated double g, double h) implements dmp {
      public static final MapCodec<dmq.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dmp.c.a.fieldOf("noise").forGetter(dmq.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dmq.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dmq.o::l)
               )
               .apply($$0, dmq.o::new)
      );
      public static final atk<dmq.o> e = dmq.a(a);

      @Override
      public double a(dmp.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dmp.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dmp a(dmp.f $$0) {
         return $$0.apply(new dmq.o($$0.a(this.f), this.g, this.h));
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
      public atk<? extends dmp> c() {
         return e;
      }

      public dmp.c j() {
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

   interface p extends dmp {
      dmp aD_();

      @Override
      default double a(dmp.b $$0) {
         return this.a(this.aD_().a($$0));
      }

      @Override
      default void a(double[] $$0, dmp.a $$1) {
         this.aD_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dmp f, double g, double h, dmp i, dmp j) implements dmp {
      public static final MapCodec<dmq.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dmp.d.fieldOf("input").forGetter(dmq.q::j),
                  dmq.d.fieldOf("min_inclusive").forGetter(dmq.q::k),
                  dmq.d.fieldOf("max_exclusive").forGetter(dmq.q::l),
                  dmp.d.fieldOf("when_in_range").forGetter(dmq.q::m),
                  dmp.d.fieldOf("when_out_of_range").forGetter(dmq.q::n)
               )
               .apply($$0, dmq.q::new)
      );
      public static final atk<dmq.q> e = dmq.a(a);

      @Override
      public double a(dmp.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dmp.a $$1) {
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
      public dmp a(dmp.f $$0) {
         return $$0.apply(new dmq.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public atk<? extends dmp> c() {
         return e;
      }

      public dmp j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dmp m() {
         return this.i;
      }

      public dmp n() {
         return this.j;
      }
   }

   protected static record r(dmp.c a) implements dmq.u {
      static final atk<dmq.r> e = dmq.a(dmp.c.a, dmq.r::new, dmq.r::j);

      @Override
      public double a(dmp.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dmp a(dmp.f $$0) {
         return $$0.apply(new dmq.r($$0.a(this.a)));
      }

      @Override
      public atk<? extends dmp> c() {
         return e;
      }

      @Override
      public dmp.c j() {
         return this.a;
      }
   }

   protected static record s(dmp.c a) implements dmq.u {
      static final atk<dmq.s> e = dmq.a(dmp.c.a, dmq.s::new, dmq.s::j);

      @Override
      public double a(dmp.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dmp a(dmp.f $$0) {
         return $$0.apply(new dmq.s($$0.a(this.a)));
      }

      @Override
      public atk<? extends dmp> c() {
         return e;
      }

      @Override
      public dmp.c j() {
         return this.a;
      }
   }

   protected static record t(dmp.c a) implements dmq.u {
      static final atk<dmq.t> e = dmq.a(dmp.c.a, dmq.t::new, dmq.t::j);

      @Override
      public double a(dmp.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dmp a(dmp.f $$0) {
         return $$0.apply(new dmq.t($$0.a(this.a)));
      }

      @Override
      public atk<? extends dmp> c() {
         return e;
      }

      @Override
      public dmp.c j() {
         return this.a;
      }
   }

   interface u extends dmp {
      dmp.c j();

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
      default void a(double[] $$0, dmp.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dmp e, dmp f, dmp g, double h, double i, dmp.c j) implements dmp {
      private static final MapCodec<dmq.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dmp.d.fieldOf("shift_x").forGetter(dmq.v::j),
                  dmp.d.fieldOf("shift_y").forGetter(dmq.v::k),
                  dmp.d.fieldOf("shift_z").forGetter(dmq.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dmq.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dmq.v::n),
                  dmp.c.a.fieldOf("noise").forGetter(dmq.v::o)
               )
               .apply($$0, dmq.v::new)
      );
      public static final atk<dmq.v> a = dmq.a(k);

      @Override
      public double a(dmp.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dmp.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dmp a(dmp.f $$0) {
         return $$0.apply(new dmq.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public atk<? extends dmp> c() {
         return a;
      }

      public dmp j() {
         return this.e;
      }

      public dmp k() {
         return this.f;
      }

      public dmp l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dmp.c o() {
         return this.j;
      }
   }

   public static record w(ast<dmq.w.b, dmq.w.a> e) implements dmp {
      private static final Codec<ast<dmq.w.b, dmq.w.a>> f = ast.a(dmq.w.a.b);
      private static final MapCodec<dmq.w> g = f.fieldOf("spline").xmap(dmq.w::new, dmq.w::j);
      public static final atk<dmq.w> a = dmq.a(g);

      @Override
      public double a(dmp.b $$0) {
         return (double)this.e.a(new dmq.w.b($$0));
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
      public void a(double[] $$0, dmp.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dmp a(dmp.f $$0) {
         return $$0.apply(new dmq.w(this.e.a((ast.d<dmq.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public atk<? extends dmp> c() {
         return a;
      }

      public ast<dmq.w.b, dmq.w.a> j() {
         return this.e;
      }

      public static record a(ig<dmp> c) implements auq<dmq.w.b> {
         public static final Codec<dmq.w.a> b = dmp.c.xmap(dmq.w.a::new, dmq.w.a::a);

         @Override
         public String toString() {
            Optional<agl<dmp>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               agl<dmp> $$1 = $$0.get();
               if ($$1 == dnd.d) {
                  return "continents";
               }

               if ($$1 == dnd.e) {
                  return "erosion";
               }

               if ($$1 == dnd.f) {
                  return "weirdness";
               }

               if ($$1 == dnd.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dmq.w.b $$0) {
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

         public dmq.w.a a(dmp.f $$0) {
            return new dmq.w.a(new ig.a<>(this.c.a().a($$0)));
         }

         public ig<dmp> a() {
            return this.c;
         }
      }

      public static record b(dmp.b a) {
      }
   }

   interface x extends dmp {
      dmp j();

      @Override
      default double a(dmp.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dmp.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dmp.b var1, double var2);
   }

   interface y extends dmp {
      Logger a = LogUtils.getLogger();

      static dmq.y a(dmq.y.a $$0, dmp $$1, dmp $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dmq.y.a.c || $$0 == dmq.y.a.d) {
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
         if ($$0 == dmq.y.a.b || $$0 == dmq.y.a.a) {
            if ($$1 instanceof dmq.h $$11) {
               return new dmq.n($$0 == dmq.y.a.a ? dmq.n.a.b : dmq.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dmq.h $$12) {
               return new dmq.n($$0 == dmq.y.a.a ? dmq.n.a.b : dmq.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dmq.a($$0, $$1, $$2, $$9, $$10);
      }

      dmq.y.a j();

      dmp k();

      dmp l();

      @Override
      default atk<? extends dmp> c() {
         return this.j().e;
      }

      public static enum a implements auk {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final atk<dmq.y> e = dmq.a((BiFunction<dmp, dmp, dmq.y>)(($$0x, $$1) -> dmq.y.a(this, $$0x, $$1)), dmq.y::k, dmq.y::l);
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

   protected static record z(dmp e, dmp.c f, dmq.z.a g) implements dmq.x {
      private static final MapCodec<dmq.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dmp.d.fieldOf("input").forGetter(dmq.z::j),
                  dmp.c.a.fieldOf("noise").forGetter(dmq.z::k),
                  dmq.z.a.c.fieldOf("rarity_value_mapper").forGetter(dmq.z::l)
               )
               .apply($$0, dmq.z::new)
      );
      public static final atk<dmq.z> a = dmq.a(h);

      @Override
      public double a(dmp.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dmp a(dmp.f $$0) {
         return $$0.apply(new dmq.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public atk<? extends dmp> c() {
         return a;
      }

      @Override
      public dmp j() {
         return this.e;
      }

      public dmp.c k() {
         return this.f;
      }

      public dmq.z.a l() {
         return this.g;
      }

      public static enum a implements auk {
         a("type_1", dnd.a::b, 2.0),
         b("type_2", dnd.a::a, 3.0);

         public static final Codec<dmq.z.a> c = auk.a(dmq.z.a::values);
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
