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

public final class doj {
   private static final Codec<doi> c = kd.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<doi> b = Codec.either(d, c)
      .xmap($$0 -> (doi)$$0.map(doj::a, Function.identity()), $$0 -> $$0 instanceof doj.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends doi> a(it<Codec<? extends doi>> $$0) {
      a($$0, "blend_alpha", doj.d.e);
      a($$0, "blend_offset", doj.f.e);
      a($$0, "beardifier", doj.b.e);
      a($$0, "old_blended_noise", edq.a);

      for (doj.l.a $$1 : doj.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", doj.o.e);
      a($$0, "end_islands", doj.i.a);
      a($$0, "weird_scaled_sampler", doj.z.a);
      a($$0, "shifted_noise", doj.v.a);
      a($$0, "range_choice", doj.q.e);
      a($$0, "shift_a", doj.s.e);
      a($$0, "shift_b", doj.t.e);
      a($$0, "shift", doj.r.e);
      a($$0, "blend_density", doj.e.e);
      a($$0, "clamp", doj.g.a);

      for (doj.k.a $$2 : doj.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (doj.y.a $$3 : doj.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", doj.w.a);
      a($$0, "constant", doj.h.e);
      return a($$0, "y_clamped_gradient", doj.aa.a);
   }

   private static Codec<? extends doi> a(it<Codec<? extends doi>> $$0, String $$1, auh<? extends doi> $$2) {
      return it.a($$0, $$1, $$2.a());
   }

   static <A, O> auh<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return auh.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> auh<O> a(Function<doi, O> $$0, Function<O, doi> $$1) {
      return a(doi.d, $$0, $$1);
   }

   static <O> auh<O> a(BiFunction<doi, doi, O> $$0, Function<O, doi> $$1, Function<O, doi> $$2) {
      return auh.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(doi.d.fieldOf("argument1").forGetter($$1), doi.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> auh<O> a(MapCodec<O> $$0) {
      return auh.a($$0);
   }

   private doj() {
   }

   public static doi a(doi $$0) {
      return new doj.l(doj.l.a.a, $$0);
   }

   public static doi b(doi $$0) {
      return new doj.l(doj.l.a.b, $$0);
   }

   public static doi c(doi $$0) {
      return new doj.l(doj.l.a.c, $$0);
   }

   public static doi d(doi $$0) {
      return new doj.l(doj.l.a.d, $$0);
   }

   public static doi e(doi $$0) {
      return new doj.l(doj.l.a.e, $$0);
   }

   public static doi a(ih<edt.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new doj.o(new doi.c($$0), $$1, $$2), $$3, $$4);
   }

   public static doi a(ih<edt.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static doi a(ih<edt.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static doi a(doi $$0, doi $$1, double $$2, ih<edt.a> $$3) {
      return new doj.v($$0, a(), $$1, $$2, 0.0, new doi.c($$3));
   }

   public static doi a(ih<edt.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static doi b(ih<edt.a> $$0, double $$1, double $$2) {
      return new doj.o(new doi.c($$0), $$1, $$2);
   }

   public static doi a(ih<edt.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static doi a(doi $$0, double $$1, double $$2, doi $$3, doi $$4) {
      return new doj.q($$0, $$1, $$2, $$3, $$4);
   }

   public static doi b(ih<edt.a> $$0) {
      return new doj.s(new doi.c($$0));
   }

   public static doi c(ih<edt.a> $$0) {
      return new doj.t(new doi.c($$0));
   }

   public static doi d(ih<edt.a> $$0) {
      return new doj.r(new doi.c($$0));
   }

   public static doi f(doi $$0) {
      return new doj.e($$0);
   }

   public static doi a(long $$0) {
      return new doj.i($$0);
   }

   public static doi a(doi $$0, ih<edt.a> $$1, doj.z.a $$2) {
      return new doj.z($$0, new doi.c($$1), $$2);
   }

   public static doi a(doi $$0, doi $$1) {
      return doj.y.a(doj.y.a.a, $$0, $$1);
   }

   public static doi b(doi $$0, doi $$1) {
      return doj.y.a(doj.y.a.b, $$0, $$1);
   }

   public static doi c(doi $$0, doi $$1) {
      return doj.y.a(doj.y.a.c, $$0, $$1);
   }

   public static doi d(doi $$0, doi $$1) {
      return doj.y.a(doj.y.a.d, $$0, $$1);
   }

   public static doi a(atp<doj.w.b, doj.w.a> $$0) {
      return new doj.w($$0);
   }

   public static doi a() {
      return doj.h.f;
   }

   public static doi a(double $$0) {
      return new doj.h($$0);
   }

   public static doi a(int $$0, int $$1, double $$2, double $$3) {
      return new doj.aa($$0, $$1, $$2, $$3);
   }

   public static doi a(doi $$0, doj.k.a $$1) {
      return doj.k.a($$1, $$0);
   }

   private static doi a(doi $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static doi b() {
      return doj.d.a;
   }

   public static doi c() {
      return doj.f.a;
   }

   public static doi a(doi $$0, doi $$1, doi $$2) {
      if ($$1 instanceof doj.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         doi $$4 = d($$0);
         doi $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static doi a(doi $$0, double $$1, doi $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(doj.y.a e, doi f, doi g, double h, double i) implements doj.y {
      @Override
      public double a(doi.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, doi.a $$1) {
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
      public doi a(doi.f $$0) {
         return $$0.apply(doj.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public doj.y.a j() {
         return this.e;
      }

      @Override
      public doi k() {
         return this.f;
      }

      @Override
      public doi l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements doi.d {
      private static final MapCodec<doj.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dmp.e * 2, dmp.d * 2).fieldOf("from_y").forGetter(doj.aa::j),
                  Codec.intRange(dmp.e * 2, dmp.d * 2).fieldOf("to_y").forGetter(doj.aa::k),
                  doj.d.fieldOf("from_value").forGetter(doj.aa::l),
                  doj.d.fieldOf("to_value").forGetter(doj.aa::m)
               )
               .apply($$0, doj.aa::new)
      );
      public static final auh<doj.aa> a = doj.a(i);

      @Override
      public double a(doi.b $$0) {
         return aun.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public auh<? extends doi> c() {
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

   protected static enum b implements doj.c {
      a;

      @Override
      public double a(doi.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, doi.a $$1) {
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

   public interface c extends doi.d {
      auh<doi> e = auh.a(MapCodec.unit(doj.b.a));

      @Override
      default auh<? extends doi> c() {
         return e;
      }
   }

   protected static enum d implements doi.d {
      a;

      public static final auh<doi> e = auh.a(MapCodec.unit(a));

      @Override
      public double a(doi.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, doi.a $$1) {
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
      public auh<? extends doi> c() {
         return e;
      }
   }

   static record e(doi a) implements doj.x {
      static final auh<doj.e> e = doj.a(doj.e::new, doj.e::j);

      @Override
      public double a(doi.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public doi a(doi.f $$0) {
         return $$0.apply(new doj.e(this.a.a($$0)));
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
      public auh<? extends doi> c() {
         return e;
      }

      @Override
      public doi j() {
         return this.a;
      }
   }

   protected static enum f implements doi.d {
      a;

      public static final auh<doi> e = auh.a(MapCodec.unit(a));

      @Override
      public double a(doi.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, doi.a $$1) {
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
      public auh<? extends doi> c() {
         return e;
      }
   }

   protected static record g(doi e, double f, double g) implements doj.p {
      private static final MapCodec<doj.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(doi.b.fieldOf("input").forGetter(doj.g::aC_), doj.d.fieldOf("min").forGetter(doj.g::a), doj.d.fieldOf("max").forGetter(doj.g::b))
               .apply($$0, doj.g::new)
      );
      public static final auh<doj.g> a = doj.a(h);

      @Override
      public double a(double $$0) {
         return aun.a($$0, this.f, this.g);
      }

      @Override
      public doi a(doi.f $$0) {
         return new doj.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public auh<? extends doi> c() {
         return a;
      }

      @Override
      public doi aC_() {
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

   static record h(double a) implements doi.d {
      static final auh<doj.h> e = doj.a(doj.d, doj.h::new, doj.h::j);
      static final doj.h f = new doj.h(0.0);

      @Override
      public void a(double[] $$0, doi.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public auh<? extends doi> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements doi.d {
      public static final auh<doj.i> a = auh.a(MapCodec.unit(new doj.i(0L)));
      private static final float e = -0.9F;
      private final edw f;

      public i(long $$0) {
         auu $$1 = new doq($$0);
         $$1.b(17292);
         this.f = new edw($$1);
      }

      private static float a(edw $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - aun.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = aun.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (aun.e((float)$$10) * 3439.0F + aun.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - aun.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = aun.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(doi.b $$0) {
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
      public auh<? extends doi> c() {
         return a;
      }
   }

   @avs
   public static record j(ih<doi> a) implements doi {
      @Override
      public double a(doi.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, doi.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public doi a(doi.f $$0) {
         return $$0.apply(new doj.j(new ih.a<>(this.a.a().a($$0))));
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
      public auh<? extends doi> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public ih<doi> j() {
         return this.a;
      }
   }

   protected static record k(doj.k.a a, doi e, double f, double g) implements doj.p {
      public static doj.k a(doj.k.a $$0, doi $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != doj.k.a.a && $$0 != doj.k.a.b ? new doj.k($$0, $$1, $$3, $$4) : new doj.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(doj.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = aun.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public doj.k b(doi.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public auh<? extends doi> c() {
         return this.a.h;
      }

      public doj.k.a k() {
         return this.a;
      }

      @Override
      public doi aC_() {
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

      static enum a implements avj {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final auh<doj.k> h = doj.a($$0x -> doj.k.a(this, $$0x), doj.k::aC_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(doj.l.a a, doi e) implements doj.m {
      @Override
      public double a(doi.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, doi.a $$1) {
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
      public doj.l.a j() {
         return this.a;
      }

      @Override
      public doi k() {
         return this.e;
      }

      static enum a implements avj {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final auh<doj.m> g = doj.a($$0x -> new doj.l(this, $$0x), doj.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends doi {
      doj.l.a j();

      doi k();

      @Override
      default auh<? extends doi> c() {
         return this.j().g;
      }

      @Override
      default doi a(doi.f $$0) {
         return $$0.apply(new doj.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(doj.n.a e, doi f, double g, double h, double i) implements doj.p, doj.y {
      @Override
      public doj.y.a j() {
         return this.e == doj.n.a.a ? doj.y.a.b : doj.y.a.a;
      }

      @Override
      public doi k() {
         return doj.a(this.i);
      }

      @Override
      public doi l() {
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
      public doi a(doi.f $$0) {
         doi $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == doj.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new doj.n(this.e, $$1, $$4, $$5, this.i);
      }

      public doj.n.a m() {
         return this.e;
      }

      @Override
      public doi aC_() {
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

   protected static record o(doi.c f, @Deprecated double g, double h) implements doi {
      public static final MapCodec<doj.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  doi.c.a.fieldOf("noise").forGetter(doj.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(doj.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(doj.o::l)
               )
               .apply($$0, doj.o::new)
      );
      public static final auh<doj.o> e = doj.a(a);

      @Override
      public double a(doi.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, doi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public doi a(doi.f $$0) {
         return $$0.apply(new doj.o($$0.a(this.f), this.g, this.h));
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
      public auh<? extends doi> c() {
         return e;
      }

      public doi.c j() {
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

   interface p extends doi {
      doi aC_();

      @Override
      default double a(doi.b $$0) {
         return this.a(this.aC_().a($$0));
      }

      @Override
      default void a(double[] $$0, doi.a $$1) {
         this.aC_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(doi f, double g, double h, doi i, doi j) implements doi {
      public static final MapCodec<doj.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  doi.d.fieldOf("input").forGetter(doj.q::j),
                  doj.d.fieldOf("min_inclusive").forGetter(doj.q::k),
                  doj.d.fieldOf("max_exclusive").forGetter(doj.q::l),
                  doi.d.fieldOf("when_in_range").forGetter(doj.q::m),
                  doi.d.fieldOf("when_out_of_range").forGetter(doj.q::n)
               )
               .apply($$0, doj.q::new)
      );
      public static final auh<doj.q> e = doj.a(a);

      @Override
      public double a(doi.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, doi.a $$1) {
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
      public doi a(doi.f $$0) {
         return $$0.apply(new doj.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public auh<? extends doi> c() {
         return e;
      }

      public doi j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public doi m() {
         return this.i;
      }

      public doi n() {
         return this.j;
      }
   }

   protected static record r(doi.c a) implements doj.u {
      static final auh<doj.r> e = doj.a(doi.c.a, doj.r::new, doj.r::j);

      @Override
      public double a(doi.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public doi a(doi.f $$0) {
         return $$0.apply(new doj.r($$0.a(this.a)));
      }

      @Override
      public auh<? extends doi> c() {
         return e;
      }

      @Override
      public doi.c j() {
         return this.a;
      }
   }

   protected static record s(doi.c a) implements doj.u {
      static final auh<doj.s> e = doj.a(doi.c.a, doj.s::new, doj.s::j);

      @Override
      public double a(doi.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public doi a(doi.f $$0) {
         return $$0.apply(new doj.s($$0.a(this.a)));
      }

      @Override
      public auh<? extends doi> c() {
         return e;
      }

      @Override
      public doi.c j() {
         return this.a;
      }
   }

   protected static record t(doi.c a) implements doj.u {
      static final auh<doj.t> e = doj.a(doi.c.a, doj.t::new, doj.t::j);

      @Override
      public double a(doi.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public doi a(doi.f $$0) {
         return $$0.apply(new doj.t($$0.a(this.a)));
      }

      @Override
      public auh<? extends doi> c() {
         return e;
      }

      @Override
      public doi.c j() {
         return this.a;
      }
   }

   interface u extends doi {
      doi.c j();

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
      default void a(double[] $$0, doi.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(doi e, doi f, doi g, double h, double i, doi.c j) implements doi {
      private static final MapCodec<doj.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  doi.d.fieldOf("shift_x").forGetter(doj.v::j),
                  doi.d.fieldOf("shift_y").forGetter(doj.v::k),
                  doi.d.fieldOf("shift_z").forGetter(doj.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(doj.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(doj.v::n),
                  doi.c.a.fieldOf("noise").forGetter(doj.v::o)
               )
               .apply($$0, doj.v::new)
      );
      public static final auh<doj.v> a = doj.a(k);

      @Override
      public double a(doi.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, doi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public doi a(doi.f $$0) {
         return $$0.apply(new doj.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public auh<? extends doi> c() {
         return a;
      }

      public doi j() {
         return this.e;
      }

      public doi k() {
         return this.f;
      }

      public doi l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public doi.c o() {
         return this.j;
      }
   }

   public static record w(atp<doj.w.b, doj.w.a> e) implements doi {
      private static final Codec<atp<doj.w.b, doj.w.a>> f = atp.a(doj.w.a.b);
      private static final MapCodec<doj.w> g = f.fieldOf("spline").xmap(doj.w::new, doj.w::j);
      public static final auh<doj.w> a = doj.a(g);

      @Override
      public double a(doi.b $$0) {
         return (double)this.e.a(new doj.w.b($$0));
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
      public void a(double[] $$0, doi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public doi a(doi.f $$0) {
         return $$0.apply(new doj.w(this.e.a((atp.d<doj.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public auh<? extends doi> c() {
         return a;
      }

      public atp<doj.w.b, doj.w.a> j() {
         return this.e;
      }

      public static record a(ih<doi> c) implements avp<doj.w.b> {
         public static final Codec<doj.w.a> b = doi.c.xmap(doj.w.a::new, doj.w.a::a);

         @Override
         public String toString() {
            Optional<ahf<doi>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               ahf<doi> $$1 = $$0.get();
               if ($$1 == dow.d) {
                  return "continents";
               }

               if ($$1 == dow.e) {
                  return "erosion";
               }

               if ($$1 == dow.f) {
                  return "weirdness";
               }

               if ($$1 == dow.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(doj.w.b $$0) {
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

         public doj.w.a a(doi.f $$0) {
            return new doj.w.a(new ih.a<>(this.c.a().a($$0)));
         }

         public ih<doi> a() {
            return this.c;
         }
      }

      public static record b(doi.b a) {
      }
   }

   interface x extends doi {
      doi j();

      @Override
      default double a(doi.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, doi.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(doi.b var1, double var2);
   }

   interface y extends doi {
      Logger a = LogUtils.getLogger();

      static doj.y a(doj.y.a $$0, doi $$1, doi $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == doj.y.a.c || $$0 == doj.y.a.d) {
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
         if ($$0 == doj.y.a.b || $$0 == doj.y.a.a) {
            if ($$1 instanceof doj.h $$11) {
               return new doj.n($$0 == doj.y.a.a ? doj.n.a.b : doj.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof doj.h $$12) {
               return new doj.n($$0 == doj.y.a.a ? doj.n.a.b : doj.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new doj.a($$0, $$1, $$2, $$9, $$10);
      }

      doj.y.a j();

      doi k();

      doi l();

      @Override
      default auh<? extends doi> c() {
         return this.j().e;
      }

      public static enum a implements avj {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final auh<doj.y> e = doj.a((BiFunction<doi, doi, doj.y>)(($$0x, $$1) -> doj.y.a(this, $$0x, $$1)), doj.y::k, doj.y::l);
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

   protected static record z(doi e, doi.c f, doj.z.a g) implements doj.x {
      private static final MapCodec<doj.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  doi.d.fieldOf("input").forGetter(doj.z::j),
                  doi.c.a.fieldOf("noise").forGetter(doj.z::k),
                  doj.z.a.c.fieldOf("rarity_value_mapper").forGetter(doj.z::l)
               )
               .apply($$0, doj.z::new)
      );
      public static final auh<doj.z> a = doj.a(h);

      @Override
      public double a(doi.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public doi a(doi.f $$0) {
         return $$0.apply(new doj.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public auh<? extends doi> c() {
         return a;
      }

      @Override
      public doi j() {
         return this.e;
      }

      public doi.c k() {
         return this.f;
      }

      public doj.z.a l() {
         return this.g;
      }

      public static enum a implements avj {
         a("type_1", dow.a::b, 2.0),
         b("type_2", dow.a::a, 3.0);

         public static final Codec<doj.z.a> c = avj.a(doj.z.a::values);
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
