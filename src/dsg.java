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

public final class dsg {
   private static final Codec<dsf> c = ki.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dsf> b = Codec.either(d, c)
      .xmap($$0 -> (dsf)$$0.map(dsg::a, Function.identity()), $$0 -> $$0 instanceof dsg.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dsf> a(iy<Codec<? extends dsf>> $$0) {
      a($$0, "blend_alpha", dsg.d.e);
      a($$0, "blend_offset", dsg.f.e);
      a($$0, "beardifier", dsg.b.e);
      a($$0, "old_blended_noise", ehn.a);

      for (dsg.l.a $$1 : dsg.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dsg.o.e);
      a($$0, "end_islands", dsg.i.a);
      a($$0, "weird_scaled_sampler", dsg.z.a);
      a($$0, "shifted_noise", dsg.v.a);
      a($$0, "range_choice", dsg.q.e);
      a($$0, "shift_a", dsg.s.e);
      a($$0, "shift_b", dsg.t.e);
      a($$0, "shift", dsg.r.e);
      a($$0, "blend_density", dsg.e.e);
      a($$0, "clamp", dsg.g.a);

      for (dsg.k.a $$2 : dsg.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dsg.y.a $$3 : dsg.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dsg.w.a);
      a($$0, "constant", dsg.h.e);
      return a($$0, "y_clamped_gradient", dsg.aa.a);
   }

   private static Codec<? extends dsf> a(iy<Codec<? extends dsf>> $$0, String $$1, awq<? extends dsf> $$2) {
      return iy.a($$0, $$1, $$2.a());
   }

   static <A, O> awq<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return awq.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> awq<O> a(Function<dsf, O> $$0, Function<O, dsf> $$1) {
      return a(dsf.d, $$0, $$1);
   }

   static <O> awq<O> a(BiFunction<dsf, dsf, O> $$0, Function<O, dsf> $$1, Function<O, dsf> $$2) {
      return awq.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dsf.d.fieldOf("argument1").forGetter($$1), dsf.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> awq<O> a(MapCodec<O> $$0) {
      return awq.a($$0);
   }

   private dsg() {
   }

   public static dsf a(dsf $$0) {
      return new dsg.l(dsg.l.a.a, $$0);
   }

   public static dsf b(dsf $$0) {
      return new dsg.l(dsg.l.a.b, $$0);
   }

   public static dsf c(dsf $$0) {
      return new dsg.l(dsg.l.a.c, $$0);
   }

   public static dsf d(dsf $$0) {
      return new dsg.l(dsg.l.a.d, $$0);
   }

   public static dsf e(dsf $$0) {
      return new dsg.l(dsg.l.a.e, $$0);
   }

   public static dsf a(il<ehq.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dsg.o(new dsf.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dsf a(il<ehq.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dsf a(il<ehq.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dsf a(dsf $$0, dsf $$1, double $$2, il<ehq.a> $$3) {
      return new dsg.v($$0, a(), $$1, $$2, 0.0, new dsf.c($$3));
   }

   public static dsf a(il<ehq.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dsf b(il<ehq.a> $$0, double $$1, double $$2) {
      return new dsg.o(new dsf.c($$0), $$1, $$2);
   }

   public static dsf a(il<ehq.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dsf a(dsf $$0, double $$1, double $$2, dsf $$3, dsf $$4) {
      return new dsg.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dsf b(il<ehq.a> $$0) {
      return new dsg.s(new dsf.c($$0));
   }

   public static dsf c(il<ehq.a> $$0) {
      return new dsg.t(new dsf.c($$0));
   }

   public static dsf d(il<ehq.a> $$0) {
      return new dsg.r(new dsf.c($$0));
   }

   public static dsf f(dsf $$0) {
      return new dsg.e($$0);
   }

   public static dsf a(long $$0) {
      return new dsg.i($$0);
   }

   public static dsf a(dsf $$0, il<ehq.a> $$1, dsg.z.a $$2) {
      return new dsg.z($$0, new dsf.c($$1), $$2);
   }

   public static dsf a(dsf $$0, dsf $$1) {
      return dsg.y.a(dsg.y.a.a, $$0, $$1);
   }

   public static dsf b(dsf $$0, dsf $$1) {
      return dsg.y.a(dsg.y.a.b, $$0, $$1);
   }

   public static dsf c(dsf $$0, dsf $$1) {
      return dsg.y.a(dsg.y.a.c, $$0, $$1);
   }

   public static dsf d(dsf $$0, dsf $$1) {
      return dsg.y.a(dsg.y.a.d, $$0, $$1);
   }

   public static dsf a(avy<dsg.w.b, dsg.w.a> $$0) {
      return new dsg.w($$0);
   }

   public static dsf a() {
      return dsg.h.f;
   }

   public static dsf a(double $$0) {
      return new dsg.h($$0);
   }

   public static dsf a(int $$0, int $$1, double $$2, double $$3) {
      return new dsg.aa($$0, $$1, $$2, $$3);
   }

   public static dsf a(dsf $$0, dsg.k.a $$1) {
      return dsg.k.a($$1, $$0);
   }

   private static dsf a(dsf $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dsf b() {
      return dsg.d.a;
   }

   public static dsf c() {
      return dsg.f.a;
   }

   public static dsf a(dsf $$0, dsf $$1, dsf $$2) {
      if ($$1 instanceof dsg.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dsf $$4 = d($$0);
         dsf $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dsf a(dsf $$0, double $$1, dsf $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dsg.y.a e, dsf f, dsf g, double h, double i) implements dsg.y {
      @Override
      public double a(dsf.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dsf.a $$1) {
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
      public dsf a(dsf.f $$0) {
         return $$0.apply(dsg.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dsg.y.a j() {
         return this.e;
      }

      @Override
      public dsf k() {
         return this.f;
      }

      @Override
      public dsf l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dsf.d {
      private static final MapCodec<dsg.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dqm.e * 2, dqm.d * 2).fieldOf("from_y").forGetter(dsg.aa::j),
                  Codec.intRange(dqm.e * 2, dqm.d * 2).fieldOf("to_y").forGetter(dsg.aa::k),
                  dsg.d.fieldOf("from_value").forGetter(dsg.aa::l),
                  dsg.d.fieldOf("to_value").forGetter(dsg.aa::m)
               )
               .apply($$0, dsg.aa::new)
      );
      public static final awq<dsg.aa> a = dsg.a(i);

      @Override
      public double a(dsf.b $$0) {
         return aww.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public awq<? extends dsf> c() {
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

   protected static enum b implements dsg.c {
      a;

      @Override
      public double a(dsf.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dsf.a $$1) {
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

   public interface c extends dsf.d {
      awq<dsf> e = awq.a(MapCodec.unit(dsg.b.a));

      @Override
      default awq<? extends dsf> c() {
         return e;
      }
   }

   protected static enum d implements dsf.d {
      a;

      public static final awq<dsf> e = awq.a(MapCodec.unit(a));

      @Override
      public double a(dsf.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dsf.a $$1) {
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
      public awq<? extends dsf> c() {
         return e;
      }
   }

   static record e(dsf a) implements dsg.x {
      static final awq<dsg.e> e = dsg.a(dsg.e::new, dsg.e::j);

      @Override
      public double a(dsf.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dsf a(dsf.f $$0) {
         return $$0.apply(new dsg.e(this.a.a($$0)));
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
      public awq<? extends dsf> c() {
         return e;
      }

      @Override
      public dsf j() {
         return this.a;
      }
   }

   protected static enum f implements dsf.d {
      a;

      public static final awq<dsf> e = awq.a(MapCodec.unit(a));

      @Override
      public double a(dsf.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dsf.a $$1) {
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
      public awq<? extends dsf> c() {
         return e;
      }
   }

   protected static record g(dsf e, double f, double g) implements dsg.p {
      private static final MapCodec<dsg.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dsf.b.fieldOf("input").forGetter(dsg.g::aD_), dsg.d.fieldOf("min").forGetter(dsg.g::a), dsg.d.fieldOf("max").forGetter(dsg.g::b))
               .apply($$0, dsg.g::new)
      );
      public static final awq<dsg.g> a = dsg.a(h);

      @Override
      public double a(double $$0) {
         return aww.a($$0, this.f, this.g);
      }

      @Override
      public dsf a(dsf.f $$0) {
         return new dsg.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public awq<? extends dsf> c() {
         return a;
      }

      @Override
      public dsf aD_() {
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

   static record h(double a) implements dsf.d {
      static final awq<dsg.h> e = dsg.a(dsg.d, dsg.h::new, dsg.h::j);
      static final dsg.h f = new dsg.h(0.0);

      @Override
      public void a(double[] $$0, dsf.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public awq<? extends dsf> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dsf.d {
      public static final awq<dsg.i> a = awq.a(MapCodec.unit(new dsg.i(0L)));
      private static final float e = -0.9F;
      private final eht f;

      public i(long $$0) {
         axd $$1 = new dsn($$0);
         $$1.b(17292);
         this.f = new eht($$1);
      }

      private static float a(eht $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - aww.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = aww.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (aww.e((float)$$10) * 3439.0F + aww.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - aww.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = aww.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dsf.b $$0) {
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
      public awq<? extends dsf> c() {
         return a;
      }
   }

   @axz
   public static record j(il<dsf> a) implements dsf {
      @Override
      public double a(dsf.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dsf.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dsf a(dsf.f $$0) {
         return $$0.apply(new dsg.j(new il.a<>(this.a.a().a($$0))));
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
      public awq<? extends dsf> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public il<dsf> j() {
         return this.a;
      }
   }

   protected static record k(dsg.k.a a, dsf e, double f, double g) implements dsg.p {
      public static dsg.k a(dsg.k.a $$0, dsf $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dsg.k.a.a && $$0 != dsg.k.a.b ? new dsg.k($$0, $$1, $$3, $$4) : new dsg.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dsg.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = aww.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dsg.k b(dsf.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public awq<? extends dsf> c() {
         return this.a.h;
      }

      public dsg.k.a k() {
         return this.a;
      }

      @Override
      public dsf aD_() {
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

      static enum a implements axq {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final awq<dsg.k> h = dsg.a($$0x -> dsg.k.a(this, $$0x), dsg.k::aD_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dsg.l.a a, dsf e) implements dsg.m {
      @Override
      public double a(dsf.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dsf.a $$1) {
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
      public dsg.l.a j() {
         return this.a;
      }

      @Override
      public dsf k() {
         return this.e;
      }

      static enum a implements axq {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final awq<dsg.m> g = dsg.a($$0x -> new dsg.l(this, $$0x), dsg.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dsf {
      dsg.l.a j();

      dsf k();

      @Override
      default awq<? extends dsf> c() {
         return this.j().g;
      }

      @Override
      default dsf a(dsf.f $$0) {
         return $$0.apply(new dsg.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dsg.n.a e, dsf f, double g, double h, double i) implements dsg.p, dsg.y {
      @Override
      public dsg.y.a j() {
         return this.e == dsg.n.a.a ? dsg.y.a.b : dsg.y.a.a;
      }

      @Override
      public dsf k() {
         return dsg.a(this.i);
      }

      @Override
      public dsf l() {
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
      public dsf a(dsf.f $$0) {
         dsf $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dsg.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dsg.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dsg.n.a m() {
         return this.e;
      }

      @Override
      public dsf aD_() {
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

   protected static record o(dsf.c f, @Deprecated double g, double h) implements dsf {
      public static final MapCodec<dsg.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dsf.c.a.fieldOf("noise").forGetter(dsg.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dsg.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dsg.o::l)
               )
               .apply($$0, dsg.o::new)
      );
      public static final awq<dsg.o> e = dsg.a(a);

      @Override
      public double a(dsf.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dsf.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dsf a(dsf.f $$0) {
         return $$0.apply(new dsg.o($$0.a(this.f), this.g, this.h));
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
      public awq<? extends dsf> c() {
         return e;
      }

      public dsf.c j() {
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

   interface p extends dsf {
      dsf aD_();

      @Override
      default double a(dsf.b $$0) {
         return this.a(this.aD_().a($$0));
      }

      @Override
      default void a(double[] $$0, dsf.a $$1) {
         this.aD_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dsf f, double g, double h, dsf i, dsf j) implements dsf {
      public static final MapCodec<dsg.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dsf.d.fieldOf("input").forGetter(dsg.q::j),
                  dsg.d.fieldOf("min_inclusive").forGetter(dsg.q::k),
                  dsg.d.fieldOf("max_exclusive").forGetter(dsg.q::l),
                  dsf.d.fieldOf("when_in_range").forGetter(dsg.q::m),
                  dsf.d.fieldOf("when_out_of_range").forGetter(dsg.q::n)
               )
               .apply($$0, dsg.q::new)
      );
      public static final awq<dsg.q> e = dsg.a(a);

      @Override
      public double a(dsf.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dsf.a $$1) {
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
      public dsf a(dsf.f $$0) {
         return $$0.apply(new dsg.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public awq<? extends dsf> c() {
         return e;
      }

      public dsf j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dsf m() {
         return this.i;
      }

      public dsf n() {
         return this.j;
      }
   }

   protected static record r(dsf.c a) implements dsg.u {
      static final awq<dsg.r> e = dsg.a(dsf.c.a, dsg.r::new, dsg.r::j);

      @Override
      public double a(dsf.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dsf a(dsf.f $$0) {
         return $$0.apply(new dsg.r($$0.a(this.a)));
      }

      @Override
      public awq<? extends dsf> c() {
         return e;
      }

      @Override
      public dsf.c j() {
         return this.a;
      }
   }

   protected static record s(dsf.c a) implements dsg.u {
      static final awq<dsg.s> e = dsg.a(dsf.c.a, dsg.s::new, dsg.s::j);

      @Override
      public double a(dsf.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dsf a(dsf.f $$0) {
         return $$0.apply(new dsg.s($$0.a(this.a)));
      }

      @Override
      public awq<? extends dsf> c() {
         return e;
      }

      @Override
      public dsf.c j() {
         return this.a;
      }
   }

   protected static record t(dsf.c a) implements dsg.u {
      static final awq<dsg.t> e = dsg.a(dsf.c.a, dsg.t::new, dsg.t::j);

      @Override
      public double a(dsf.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dsf a(dsf.f $$0) {
         return $$0.apply(new dsg.t($$0.a(this.a)));
      }

      @Override
      public awq<? extends dsf> c() {
         return e;
      }

      @Override
      public dsf.c j() {
         return this.a;
      }
   }

   interface u extends dsf {
      dsf.c j();

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
      default void a(double[] $$0, dsf.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dsf e, dsf f, dsf g, double h, double i, dsf.c j) implements dsf {
      private static final MapCodec<dsg.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dsf.d.fieldOf("shift_x").forGetter(dsg.v::j),
                  dsf.d.fieldOf("shift_y").forGetter(dsg.v::k),
                  dsf.d.fieldOf("shift_z").forGetter(dsg.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dsg.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dsg.v::n),
                  dsf.c.a.fieldOf("noise").forGetter(dsg.v::o)
               )
               .apply($$0, dsg.v::new)
      );
      public static final awq<dsg.v> a = dsg.a(k);

      @Override
      public double a(dsf.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dsf.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dsf a(dsf.f $$0) {
         return $$0.apply(new dsg.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public awq<? extends dsf> c() {
         return a;
      }

      public dsf j() {
         return this.e;
      }

      public dsf k() {
         return this.f;
      }

      public dsf l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dsf.c o() {
         return this.j;
      }
   }

   public static record w(avy<dsg.w.b, dsg.w.a> e) implements dsf {
      private static final Codec<avy<dsg.w.b, dsg.w.a>> f = avy.a(dsg.w.a.b);
      private static final MapCodec<dsg.w> g = f.fieldOf("spline").xmap(dsg.w::new, dsg.w::j);
      public static final awq<dsg.w> a = dsg.a(g);

      @Override
      public double a(dsf.b $$0) {
         return (double)this.e.a(new dsg.w.b($$0));
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
      public void a(double[] $$0, dsf.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dsf a(dsf.f $$0) {
         return $$0.apply(new dsg.w(this.e.a((avy.d<dsg.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public awq<? extends dsf> c() {
         return a;
      }

      public avy<dsg.w.b, dsg.w.a> j() {
         return this.e;
      }

      public static record a(il<dsf> c) implements axw<dsg.w.b> {
         public static final Codec<dsg.w.a> b = dsf.c.xmap(dsg.w.a::new, dsg.w.a::a);

         @Override
         public String toString() {
            Optional<ajg<dsf>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               ajg<dsf> $$1 = $$0.get();
               if ($$1 == dst.d) {
                  return "continents";
               }

               if ($$1 == dst.e) {
                  return "erosion";
               }

               if ($$1 == dst.f) {
                  return "weirdness";
               }

               if ($$1 == dst.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dsg.w.b $$0) {
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

         public dsg.w.a a(dsf.f $$0) {
            return new dsg.w.a(new il.a<>(this.c.a().a($$0)));
         }

         public il<dsf> a() {
            return this.c;
         }
      }

      public static record b(dsf.b a) {
      }
   }

   interface x extends dsf {
      dsf j();

      @Override
      default double a(dsf.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dsf.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dsf.b var1, double var2);
   }

   interface y extends dsf {
      Logger a = LogUtils.getLogger();

      static dsg.y a(dsg.y.a $$0, dsf $$1, dsf $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dsg.y.a.c || $$0 == dsg.y.a.d) {
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
         if ($$0 == dsg.y.a.b || $$0 == dsg.y.a.a) {
            if ($$1 instanceof dsg.h $$11) {
               return new dsg.n($$0 == dsg.y.a.a ? dsg.n.a.b : dsg.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dsg.h $$12) {
               return new dsg.n($$0 == dsg.y.a.a ? dsg.n.a.b : dsg.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dsg.a($$0, $$1, $$2, $$9, $$10);
      }

      dsg.y.a j();

      dsf k();

      dsf l();

      @Override
      default awq<? extends dsf> c() {
         return this.j().e;
      }

      public static enum a implements axq {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final awq<dsg.y> e = dsg.a((BiFunction<dsf, dsf, dsg.y>)(($$0x, $$1) -> dsg.y.a(this, $$0x, $$1)), dsg.y::k, dsg.y::l);
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

   protected static record z(dsf e, dsf.c f, dsg.z.a g) implements dsg.x {
      private static final MapCodec<dsg.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dsf.d.fieldOf("input").forGetter(dsg.z::j),
                  dsf.c.a.fieldOf("noise").forGetter(dsg.z::k),
                  dsg.z.a.c.fieldOf("rarity_value_mapper").forGetter(dsg.z::l)
               )
               .apply($$0, dsg.z::new)
      );
      public static final awq<dsg.z> a = dsg.a(h);

      @Override
      public double a(dsf.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dsf a(dsf.f $$0) {
         return $$0.apply(new dsg.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public awq<? extends dsf> c() {
         return a;
      }

      @Override
      public dsf j() {
         return this.e;
      }

      public dsf.c k() {
         return this.f;
      }

      public dsg.z.a l() {
         return this.g;
      }

      public static enum a implements axq {
         a("type_1", dst.a::b, 2.0),
         b("type_2", dst.a::a, 3.0);

         public static final Codec<dsg.z.a> c = axq.a(dsg.z.a::values);
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
