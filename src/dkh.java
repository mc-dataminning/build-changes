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

public final class dkh {
   private static final Codec<dkg> c = jd.ag.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dkg> b = Codec.either(d, c)
      .xmap($$0 -> (dkg)$$0.map(dkh::a, Function.identity()), $$0 -> $$0 instanceof dkh.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dkg> a(ht<Codec<? extends dkg>> $$0) {
      a($$0, "blend_alpha", dkh.d.e);
      a($$0, "blend_offset", dkh.f.e);
      a($$0, "beardifier", dkh.b.e);
      a($$0, "old_blended_noise", dzh.a);

      for (dkh.l.a $$1 : dkh.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dkh.o.e);
      a($$0, "end_islands", dkh.i.a);
      a($$0, "weird_scaled_sampler", dkh.z.a);
      a($$0, "shifted_noise", dkh.v.a);
      a($$0, "range_choice", dkh.q.e);
      a($$0, "shift_a", dkh.s.e);
      a($$0, "shift_b", dkh.t.e);
      a($$0, "shift", dkh.r.e);
      a($$0, "blend_density", dkh.e.e);
      a($$0, "clamp", dkh.g.a);

      for (dkh.k.a $$2 : dkh.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dkh.y.a $$3 : dkh.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dkh.w.a);
      a($$0, "constant", dkh.h.e);
      return a($$0, "y_clamped_gradient", dkh.aa.a);
   }

   private static Codec<? extends dkg> a(ht<Codec<? extends dkg>> $$0, String $$1, arm<? extends dkg> $$2) {
      return ht.a($$0, $$1, $$2.a());
   }

   static <A, O> arm<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return arm.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> arm<O> a(Function<dkg, O> $$0, Function<O, dkg> $$1) {
      return a(dkg.d, $$0, $$1);
   }

   static <O> arm<O> a(BiFunction<dkg, dkg, O> $$0, Function<O, dkg> $$1, Function<O, dkg> $$2) {
      return arm.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dkg.d.fieldOf("argument1").forGetter($$1), dkg.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> arm<O> a(MapCodec<O> $$0) {
      return arm.a($$0);
   }

   private dkh() {
   }

   public static dkg a(dkg $$0) {
      return new dkh.l(dkh.l.a.a, $$0);
   }

   public static dkg b(dkg $$0) {
      return new dkh.l(dkh.l.a.b, $$0);
   }

   public static dkg c(dkg $$0) {
      return new dkh.l(dkh.l.a.c, $$0);
   }

   public static dkg d(dkg $$0) {
      return new dkh.l(dkh.l.a.d, $$0);
   }

   public static dkg e(dkg $$0) {
      return new dkh.l(dkh.l.a.e, $$0);
   }

   public static dkg a(hg<dzk.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dkh.o(new dkg.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dkg a(hg<dzk.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dkg a(hg<dzk.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dkg a(dkg $$0, dkg $$1, double $$2, hg<dzk.a> $$3) {
      return new dkh.v($$0, a(), $$1, $$2, 0.0, new dkg.c($$3));
   }

   public static dkg a(hg<dzk.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dkg b(hg<dzk.a> $$0, double $$1, double $$2) {
      return new dkh.o(new dkg.c($$0), $$1, $$2);
   }

   public static dkg a(hg<dzk.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dkg a(dkg $$0, double $$1, double $$2, dkg $$3, dkg $$4) {
      return new dkh.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dkg b(hg<dzk.a> $$0) {
      return new dkh.s(new dkg.c($$0));
   }

   public static dkg c(hg<dzk.a> $$0) {
      return new dkh.t(new dkg.c($$0));
   }

   public static dkg d(hg<dzk.a> $$0) {
      return new dkh.r(new dkg.c($$0));
   }

   public static dkg f(dkg $$0) {
      return new dkh.e($$0);
   }

   public static dkg a(long $$0) {
      return new dkh.i($$0);
   }

   public static dkg a(dkg $$0, hg<dzk.a> $$1, dkh.z.a $$2) {
      return new dkh.z($$0, new dkg.c($$1), $$2);
   }

   public static dkg a(dkg $$0, dkg $$1) {
      return dkh.y.a(dkh.y.a.a, $$0, $$1);
   }

   public static dkg b(dkg $$0, dkg $$1) {
      return dkh.y.a(dkh.y.a.b, $$0, $$1);
   }

   public static dkg c(dkg $$0, dkg $$1) {
      return dkh.y.a(dkh.y.a.c, $$0, $$1);
   }

   public static dkg d(dkg $$0, dkg $$1) {
      return dkh.y.a(dkh.y.a.d, $$0, $$1);
   }

   public static dkg a(aqw<dkh.w.b, dkh.w.a> $$0) {
      return new dkh.w($$0);
   }

   public static dkg a() {
      return dkh.h.f;
   }

   public static dkg a(double $$0) {
      return new dkh.h($$0);
   }

   public static dkg a(int $$0, int $$1, double $$2, double $$3) {
      return new dkh.aa($$0, $$1, $$2, $$3);
   }

   public static dkg a(dkg $$0, dkh.k.a $$1) {
      return dkh.k.a($$1, $$0);
   }

   private static dkg a(dkg $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dkg b() {
      return dkh.d.a;
   }

   public static dkg c() {
      return dkh.f.a;
   }

   public static dkg a(dkg $$0, dkg $$1, dkg $$2) {
      if ($$1 instanceof dkh.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dkg $$4 = d($$0);
         dkg $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dkg a(dkg $$0, double $$1, dkg $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dkh.y.a e, dkg f, dkg g, double h, double i) implements dkh.y {
      @Override
      public double a(dkg.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dkg.a $$1) {
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
      public dkg a(dkg.f $$0) {
         return $$0.apply(dkh.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dkh.y.a j() {
         return this.e;
      }

      @Override
      public dkg k() {
         return this.f;
      }

      @Override
      public dkg l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dkg.d {
      private static final MapCodec<dkh.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(din.e * 2, din.d * 2).fieldOf("from_y").forGetter(dkh.aa::j),
                  Codec.intRange(din.e * 2, din.d * 2).fieldOf("to_y").forGetter(dkh.aa::k),
                  dkh.d.fieldOf("from_value").forGetter(dkh.aa::l),
                  dkh.d.fieldOf("to_value").forGetter(dkh.aa::m)
               )
               .apply($$0, dkh.aa::new)
      );
      public static final arm<dkh.aa> a = dkh.a(i);

      @Override
      public double a(dkg.b $$0) {
         return ars.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public arm<? extends dkg> c() {
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

   protected static enum b implements dkh.c {
      a;

      @Override
      public double a(dkg.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dkg.a $$1) {
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

   public interface c extends dkg.d {
      arm<dkg> e = arm.a(MapCodec.unit(dkh.b.a));

      @Override
      default arm<? extends dkg> c() {
         return e;
      }
   }

   protected static enum d implements dkg.d {
      a;

      public static final arm<dkg> e = arm.a(MapCodec.unit(a));

      @Override
      public double a(dkg.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dkg.a $$1) {
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
      public arm<? extends dkg> c() {
         return e;
      }
   }

   static record e(dkg a) implements dkh.x {
      static final arm<dkh.e> e = dkh.a(dkh.e::new, dkh.e::j);

      @Override
      public double a(dkg.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dkg a(dkg.f $$0) {
         return $$0.apply(new dkh.e(this.a.a($$0)));
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
      public arm<? extends dkg> c() {
         return e;
      }

      @Override
      public dkg j() {
         return this.a;
      }
   }

   protected static enum f implements dkg.d {
      a;

      public static final arm<dkg> e = arm.a(MapCodec.unit(a));

      @Override
      public double a(dkg.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dkg.a $$1) {
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
      public arm<? extends dkg> c() {
         return e;
      }
   }

   protected static record g(dkg e, double f, double g) implements dkh.p {
      private static final MapCodec<dkh.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dkg.b.fieldOf("input").forGetter(dkh.g::ar_), dkh.d.fieldOf("min").forGetter(dkh.g::a), dkh.d.fieldOf("max").forGetter(dkh.g::b))
               .apply($$0, dkh.g::new)
      );
      public static final arm<dkh.g> a = dkh.a(h);

      @Override
      public double a(double $$0) {
         return ars.a($$0, this.f, this.g);
      }

      @Override
      public dkg a(dkg.f $$0) {
         return new dkh.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public arm<? extends dkg> c() {
         return a;
      }

      @Override
      public dkg ar_() {
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

   static record h(double a) implements dkg.d {
      static final arm<dkh.h> e = dkh.a(dkh.d, dkh.h::new, dkh.h::j);
      static final dkh.h f = new dkh.h(0.0);

      @Override
      public void a(double[] $$0, dkg.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public arm<? extends dkg> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dkg.d {
      public static final arm<dkh.i> a = arm.a(MapCodec.unit(new dkh.i(0L)));
      private static final float e = -0.9F;
      private final dzn f;

      public i(long $$0) {
         arx $$1 = new dko($$0);
         $$1.b(17292);
         this.f = new dzn($$1);
      }

      private static float a(dzn $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - ars.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = ars.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (ars.e((float)$$10) * 3439.0F + ars.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - ars.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = ars.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dkg.b $$0) {
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
      public arm<? extends dkg> c() {
         return a;
      }
   }

   @ast
   public static record j(hg<dkg> a) implements dkg {
      @Override
      public double a(dkg.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dkg.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dkg a(dkg.f $$0) {
         return $$0.apply(new dkh.j(new hg.a<>(this.a.a().a($$0))));
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
      public arm<? extends dkg> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public hg<dkg> j() {
         return this.a;
      }
   }

   protected static record k(dkh.k.a a, dkg e, double f, double g) implements dkh.p {
      public static dkh.k a(dkh.k.a $$0, dkg $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dkh.k.a.a && $$0 != dkh.k.a.b ? new dkh.k($$0, $$1, $$3, $$4) : new dkh.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dkh.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = ars.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dkh.k b(dkg.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public arm<? extends dkg> c() {
         return this.a.h;
      }

      public dkh.k.a k() {
         return this.a;
      }

      @Override
      public dkg ar_() {
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

      static enum a implements ask {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final arm<dkh.k> h = dkh.a($$0x -> dkh.k.a(this, $$0x), dkh.k::ar_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dkh.l.a a, dkg e) implements dkh.m {
      @Override
      public double a(dkg.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dkg.a $$1) {
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
      public dkh.l.a j() {
         return this.a;
      }

      @Override
      public dkg k() {
         return this.e;
      }

      static enum a implements ask {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final arm<dkh.m> g = dkh.a($$0x -> new dkh.l(this, $$0x), dkh.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dkg {
      dkh.l.a j();

      dkg k();

      @Override
      default arm<? extends dkg> c() {
         return this.j().g;
      }

      @Override
      default dkg a(dkg.f $$0) {
         return $$0.apply(new dkh.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dkh.n.a e, dkg f, double g, double h, double i) implements dkh.p, dkh.y {
      @Override
      public dkh.y.a j() {
         return this.e == dkh.n.a.a ? dkh.y.a.b : dkh.y.a.a;
      }

      @Override
      public dkg k() {
         return dkh.a(this.i);
      }

      @Override
      public dkg l() {
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
      public dkg a(dkg.f $$0) {
         dkg $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dkh.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dkh.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dkh.n.a m() {
         return this.e;
      }

      @Override
      public dkg ar_() {
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

   protected static record o(dkg.c f, @Deprecated double g, double h) implements dkg {
      public static final MapCodec<dkh.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkg.c.a.fieldOf("noise").forGetter(dkh.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dkh.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dkh.o::l)
               )
               .apply($$0, dkh.o::new)
      );
      public static final arm<dkh.o> e = dkh.a(a);

      @Override
      public double a(dkg.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dkg.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkg a(dkg.f $$0) {
         return $$0.apply(new dkh.o($$0.a(this.f), this.g, this.h));
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
      public arm<? extends dkg> c() {
         return e;
      }

      public dkg.c j() {
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

   interface p extends dkg {
      dkg ar_();

      @Override
      default double a(dkg.b $$0) {
         return this.a(this.ar_().a($$0));
      }

      @Override
      default void a(double[] $$0, dkg.a $$1) {
         this.ar_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dkg f, double g, double h, dkg i, dkg j) implements dkg {
      public static final MapCodec<dkh.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkg.d.fieldOf("input").forGetter(dkh.q::j),
                  dkh.d.fieldOf("min_inclusive").forGetter(dkh.q::k),
                  dkh.d.fieldOf("max_exclusive").forGetter(dkh.q::l),
                  dkg.d.fieldOf("when_in_range").forGetter(dkh.q::m),
                  dkg.d.fieldOf("when_out_of_range").forGetter(dkh.q::n)
               )
               .apply($$0, dkh.q::new)
      );
      public static final arm<dkh.q> e = dkh.a(a);

      @Override
      public double a(dkg.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dkg.a $$1) {
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
      public dkg a(dkg.f $$0) {
         return $$0.apply(new dkh.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public arm<? extends dkg> c() {
         return e;
      }

      public dkg j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dkg m() {
         return this.i;
      }

      public dkg n() {
         return this.j;
      }
   }

   protected static record r(dkg.c a) implements dkh.u {
      static final arm<dkh.r> e = dkh.a(dkg.c.a, dkh.r::new, dkh.r::j);

      @Override
      public double a(dkg.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dkg a(dkg.f $$0) {
         return $$0.apply(new dkh.r($$0.a(this.a)));
      }

      @Override
      public arm<? extends dkg> c() {
         return e;
      }

      @Override
      public dkg.c j() {
         return this.a;
      }
   }

   protected static record s(dkg.c a) implements dkh.u {
      static final arm<dkh.s> e = dkh.a(dkg.c.a, dkh.s::new, dkh.s::j);

      @Override
      public double a(dkg.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dkg a(dkg.f $$0) {
         return $$0.apply(new dkh.s($$0.a(this.a)));
      }

      @Override
      public arm<? extends dkg> c() {
         return e;
      }

      @Override
      public dkg.c j() {
         return this.a;
      }
   }

   protected static record t(dkg.c a) implements dkh.u {
      static final arm<dkh.t> e = dkh.a(dkg.c.a, dkh.t::new, dkh.t::j);

      @Override
      public double a(dkg.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dkg a(dkg.f $$0) {
         return $$0.apply(new dkh.t($$0.a(this.a)));
      }

      @Override
      public arm<? extends dkg> c() {
         return e;
      }

      @Override
      public dkg.c j() {
         return this.a;
      }
   }

   interface u extends dkg {
      dkg.c j();

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
      default void a(double[] $$0, dkg.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dkg e, dkg f, dkg g, double h, double i, dkg.c j) implements dkg {
      private static final MapCodec<dkh.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkg.d.fieldOf("shift_x").forGetter(dkh.v::j),
                  dkg.d.fieldOf("shift_y").forGetter(dkh.v::k),
                  dkg.d.fieldOf("shift_z").forGetter(dkh.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dkh.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dkh.v::n),
                  dkg.c.a.fieldOf("noise").forGetter(dkh.v::o)
               )
               .apply($$0, dkh.v::new)
      );
      public static final arm<dkh.v> a = dkh.a(k);

      @Override
      public double a(dkg.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dkg.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkg a(dkg.f $$0) {
         return $$0.apply(new dkh.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public arm<? extends dkg> c() {
         return a;
      }

      public dkg j() {
         return this.e;
      }

      public dkg k() {
         return this.f;
      }

      public dkg l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dkg.c o() {
         return this.j;
      }
   }

   public static record w(aqw<dkh.w.b, dkh.w.a> e) implements dkg {
      private static final Codec<aqw<dkh.w.b, dkh.w.a>> f = aqw.a(dkh.w.a.b);
      private static final MapCodec<dkh.w> g = f.fieldOf("spline").xmap(dkh.w::new, dkh.w::j);
      public static final arm<dkh.w> a = dkh.a(g);

      @Override
      public double a(dkg.b $$0) {
         return (double)this.e.a(new dkh.w.b($$0));
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
      public void a(double[] $$0, dkg.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkg a(dkg.f $$0) {
         return $$0.apply(new dkh.w(this.e.a((aqw.d<dkh.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public arm<? extends dkg> c() {
         return a;
      }

      public aqw<dkh.w.b, dkh.w.a> j() {
         return this.e;
      }

      public static record a(hg<dkg> c) implements asq<dkh.w.b> {
         public static final Codec<dkh.w.a> b = dkg.c.xmap(dkh.w.a::new, dkh.w.a::a);

         @Override
         public String toString() {
            Optional<aet<dkg>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               aet<dkg> $$1 = $$0.get();
               if ($$1 == dku.d) {
                  return "continents";
               }

               if ($$1 == dku.e) {
                  return "erosion";
               }

               if ($$1 == dku.f) {
                  return "weirdness";
               }

               if ($$1 == dku.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dkh.w.b $$0) {
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

         public dkh.w.a a(dkg.f $$0) {
            return new dkh.w.a(new hg.a<>(this.c.a().a($$0)));
         }

         public hg<dkg> a() {
            return this.c;
         }
      }

      public static record b(dkg.b a) {
      }
   }

   interface x extends dkg {
      dkg j();

      @Override
      default double a(dkg.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dkg.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dkg.b var1, double var2);
   }

   interface y extends dkg {
      Logger a = LogUtils.getLogger();

      static dkh.y a(dkh.y.a $$0, dkg $$1, dkg $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dkh.y.a.c || $$0 == dkh.y.a.d) {
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
         if ($$0 == dkh.y.a.b || $$0 == dkh.y.a.a) {
            if ($$1 instanceof dkh.h $$11) {
               return new dkh.n($$0 == dkh.y.a.a ? dkh.n.a.b : dkh.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dkh.h $$12) {
               return new dkh.n($$0 == dkh.y.a.a ? dkh.n.a.b : dkh.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dkh.a($$0, $$1, $$2, $$9, $$10);
      }

      dkh.y.a j();

      dkg k();

      dkg l();

      @Override
      default arm<? extends dkg> c() {
         return this.j().e;
      }

      public static enum a implements ask {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final arm<dkh.y> e = dkh.a((BiFunction<dkg, dkg, dkh.y>)(($$0x, $$1) -> dkh.y.a(this, $$0x, $$1)), dkh.y::k, dkh.y::l);
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

   protected static record z(dkg e, dkg.c f, dkh.z.a g) implements dkh.x {
      private static final MapCodec<dkh.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkg.d.fieldOf("input").forGetter(dkh.z::j),
                  dkg.c.a.fieldOf("noise").forGetter(dkh.z::k),
                  dkh.z.a.c.fieldOf("rarity_value_mapper").forGetter(dkh.z::l)
               )
               .apply($$0, dkh.z::new)
      );
      public static final arm<dkh.z> a = dkh.a(h);

      @Override
      public double a(dkg.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dkg a(dkg.f $$0) {
         return $$0.apply(new dkh.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public arm<? extends dkg> c() {
         return a;
      }

      @Override
      public dkg j() {
         return this.e;
      }

      public dkg.c k() {
         return this.f;
      }

      public dkh.z.a l() {
         return this.g;
      }

      public static enum a implements ask {
         a("type_1", dku.a::b, 2.0),
         b("type_2", dku.a::a, 3.0);

         public static final Codec<dkh.z.a> c = ask.a(dkh.z.a::values);
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
