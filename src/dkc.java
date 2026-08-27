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

public final class dkc {
   private static final Codec<dkb> c = jb.ag.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dkb> b = Codec.either(d, c)
      .xmap($$0 -> (dkb)$$0.map(dkc::a, Function.identity()), $$0 -> $$0 instanceof dkc.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dkb> a(hr<Codec<? extends dkb>> $$0) {
      a($$0, "blend_alpha", dkc.d.e);
      a($$0, "blend_offset", dkc.f.e);
      a($$0, "beardifier", dkc.b.e);
      a($$0, "old_blended_noise", dzc.a);

      for (dkc.l.a $$1 : dkc.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dkc.o.e);
      a($$0, "end_islands", dkc.i.a);
      a($$0, "weird_scaled_sampler", dkc.z.a);
      a($$0, "shifted_noise", dkc.v.a);
      a($$0, "range_choice", dkc.q.e);
      a($$0, "shift_a", dkc.s.e);
      a($$0, "shift_b", dkc.t.e);
      a($$0, "shift", dkc.r.e);
      a($$0, "blend_density", dkc.e.e);
      a($$0, "clamp", dkc.g.a);

      for (dkc.k.a $$2 : dkc.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dkc.y.a $$3 : dkc.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dkc.w.a);
      a($$0, "constant", dkc.h.e);
      return a($$0, "y_clamped_gradient", dkc.aa.a);
   }

   private static Codec<? extends dkb> a(hr<Codec<? extends dkb>> $$0, String $$1, arj<? extends dkb> $$2) {
      return hr.a($$0, $$1, $$2.a());
   }

   static <A, O> arj<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return arj.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> arj<O> a(Function<dkb, O> $$0, Function<O, dkb> $$1) {
      return a(dkb.d, $$0, $$1);
   }

   static <O> arj<O> a(BiFunction<dkb, dkb, O> $$0, Function<O, dkb> $$1, Function<O, dkb> $$2) {
      return arj.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dkb.d.fieldOf("argument1").forGetter($$1), dkb.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> arj<O> a(MapCodec<O> $$0) {
      return arj.a($$0);
   }

   private dkc() {
   }

   public static dkb a(dkb $$0) {
      return new dkc.l(dkc.l.a.a, $$0);
   }

   public static dkb b(dkb $$0) {
      return new dkc.l(dkc.l.a.b, $$0);
   }

   public static dkb c(dkb $$0) {
      return new dkc.l(dkc.l.a.c, $$0);
   }

   public static dkb d(dkb $$0) {
      return new dkc.l(dkc.l.a.d, $$0);
   }

   public static dkb e(dkb $$0) {
      return new dkc.l(dkc.l.a.e, $$0);
   }

   public static dkb a(he<dzf.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dkc.o(new dkb.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dkb a(he<dzf.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dkb a(he<dzf.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dkb a(dkb $$0, dkb $$1, double $$2, he<dzf.a> $$3) {
      return new dkc.v($$0, a(), $$1, $$2, 0.0, new dkb.c($$3));
   }

   public static dkb a(he<dzf.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dkb b(he<dzf.a> $$0, double $$1, double $$2) {
      return new dkc.o(new dkb.c($$0), $$1, $$2);
   }

   public static dkb a(he<dzf.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dkb a(dkb $$0, double $$1, double $$2, dkb $$3, dkb $$4) {
      return new dkc.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dkb b(he<dzf.a> $$0) {
      return new dkc.s(new dkb.c($$0));
   }

   public static dkb c(he<dzf.a> $$0) {
      return new dkc.t(new dkb.c($$0));
   }

   public static dkb d(he<dzf.a> $$0) {
      return new dkc.r(new dkb.c($$0));
   }

   public static dkb f(dkb $$0) {
      return new dkc.e($$0);
   }

   public static dkb a(long $$0) {
      return new dkc.i($$0);
   }

   public static dkb a(dkb $$0, he<dzf.a> $$1, dkc.z.a $$2) {
      return new dkc.z($$0, new dkb.c($$1), $$2);
   }

   public static dkb a(dkb $$0, dkb $$1) {
      return dkc.y.a(dkc.y.a.a, $$0, $$1);
   }

   public static dkb b(dkb $$0, dkb $$1) {
      return dkc.y.a(dkc.y.a.b, $$0, $$1);
   }

   public static dkb c(dkb $$0, dkb $$1) {
      return dkc.y.a(dkc.y.a.c, $$0, $$1);
   }

   public static dkb d(dkb $$0, dkb $$1) {
      return dkc.y.a(dkc.y.a.d, $$0, $$1);
   }

   public static dkb a(aqt<dkc.w.b, dkc.w.a> $$0) {
      return new dkc.w($$0);
   }

   public static dkb a() {
      return dkc.h.f;
   }

   public static dkb a(double $$0) {
      return new dkc.h($$0);
   }

   public static dkb a(int $$0, int $$1, double $$2, double $$3) {
      return new dkc.aa($$0, $$1, $$2, $$3);
   }

   public static dkb a(dkb $$0, dkc.k.a $$1) {
      return dkc.k.a($$1, $$0);
   }

   private static dkb a(dkb $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dkb b() {
      return dkc.d.a;
   }

   public static dkb c() {
      return dkc.f.a;
   }

   public static dkb a(dkb $$0, dkb $$1, dkb $$2) {
      if ($$1 instanceof dkc.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dkb $$4 = d($$0);
         dkb $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dkb a(dkb $$0, double $$1, dkb $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dkc.y.a e, dkb f, dkb g, double h, double i) implements dkc.y {
      @Override
      public double a(dkb.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dkb.a $$1) {
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
      public dkb a(dkb.f $$0) {
         return $$0.apply(dkc.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dkc.y.a j() {
         return this.e;
      }

      @Override
      public dkb k() {
         return this.f;
      }

      @Override
      public dkb l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dkb.d {
      private static final MapCodec<dkc.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dii.e * 2, dii.d * 2).fieldOf("from_y").forGetter(dkc.aa::j),
                  Codec.intRange(dii.e * 2, dii.d * 2).fieldOf("to_y").forGetter(dkc.aa::k),
                  dkc.d.fieldOf("from_value").forGetter(dkc.aa::l),
                  dkc.d.fieldOf("to_value").forGetter(dkc.aa::m)
               )
               .apply($$0, dkc.aa::new)
      );
      public static final arj<dkc.aa> a = dkc.a(i);

      @Override
      public double a(dkb.b $$0) {
         return arp.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public arj<? extends dkb> c() {
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

   protected static enum b implements dkc.c {
      a;

      @Override
      public double a(dkb.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dkb.a $$1) {
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

   public interface c extends dkb.d {
      arj<dkb> e = arj.a(MapCodec.unit(dkc.b.a));

      @Override
      default arj<? extends dkb> c() {
         return e;
      }
   }

   protected static enum d implements dkb.d {
      a;

      public static final arj<dkb> e = arj.a(MapCodec.unit(a));

      @Override
      public double a(dkb.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dkb.a $$1) {
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
      public arj<? extends dkb> c() {
         return e;
      }
   }

   static record e(dkb a) implements dkc.x {
      static final arj<dkc.e> e = dkc.a(dkc.e::new, dkc.e::j);

      @Override
      public double a(dkb.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dkb a(dkb.f $$0) {
         return $$0.apply(new dkc.e(this.a.a($$0)));
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
      public arj<? extends dkb> c() {
         return e;
      }

      @Override
      public dkb j() {
         return this.a;
      }
   }

   protected static enum f implements dkb.d {
      a;

      public static final arj<dkb> e = arj.a(MapCodec.unit(a));

      @Override
      public double a(dkb.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dkb.a $$1) {
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
      public arj<? extends dkb> c() {
         return e;
      }
   }

   protected static record g(dkb e, double f, double g) implements dkc.p {
      private static final MapCodec<dkc.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dkb.b.fieldOf("input").forGetter(dkc.g::ar_), dkc.d.fieldOf("min").forGetter(dkc.g::a), dkc.d.fieldOf("max").forGetter(dkc.g::b))
               .apply($$0, dkc.g::new)
      );
      public static final arj<dkc.g> a = dkc.a(h);

      @Override
      public double a(double $$0) {
         return arp.a($$0, this.f, this.g);
      }

      @Override
      public dkb a(dkb.f $$0) {
         return new dkc.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public arj<? extends dkb> c() {
         return a;
      }

      @Override
      public dkb ar_() {
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

   static record h(double a) implements dkb.d {
      static final arj<dkc.h> e = dkc.a(dkc.d, dkc.h::new, dkc.h::j);
      static final dkc.h f = new dkc.h(0.0);

      @Override
      public void a(double[] $$0, dkb.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public arj<? extends dkb> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dkb.d {
      public static final arj<dkc.i> a = arj.a(MapCodec.unit(new dkc.i(0L)));
      private static final float e = -0.9F;
      private final dzi f;

      public i(long $$0) {
         aru $$1 = new dkj($$0);
         $$1.b(17292);
         this.f = new dzi($$1);
      }

      private static float a(dzi $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - arp.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = arp.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (arp.e((float)$$10) * 3439.0F + arp.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - arp.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = arp.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dkb.b $$0) {
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
      public arj<? extends dkb> c() {
         return a;
      }
   }

   @asq
   public static record j(he<dkb> a) implements dkb {
      @Override
      public double a(dkb.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dkb.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dkb a(dkb.f $$0) {
         return $$0.apply(new dkc.j(new he.a<>(this.a.a().a($$0))));
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
      public arj<? extends dkb> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public he<dkb> j() {
         return this.a;
      }
   }

   protected static record k(dkc.k.a a, dkb e, double f, double g) implements dkc.p {
      public static dkc.k a(dkc.k.a $$0, dkb $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dkc.k.a.a && $$0 != dkc.k.a.b ? new dkc.k($$0, $$1, $$3, $$4) : new dkc.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dkc.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = arp.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dkc.k b(dkb.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public arj<? extends dkb> c() {
         return this.a.h;
      }

      public dkc.k.a k() {
         return this.a;
      }

      @Override
      public dkb ar_() {
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

      static enum a implements ash {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final arj<dkc.k> h = dkc.a($$0x -> dkc.k.a(this, $$0x), dkc.k::ar_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dkc.l.a a, dkb e) implements dkc.m {
      @Override
      public double a(dkb.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dkb.a $$1) {
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
      public dkc.l.a j() {
         return this.a;
      }

      @Override
      public dkb k() {
         return this.e;
      }

      static enum a implements ash {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final arj<dkc.m> g = dkc.a($$0x -> new dkc.l(this, $$0x), dkc.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dkb {
      dkc.l.a j();

      dkb k();

      @Override
      default arj<? extends dkb> c() {
         return this.j().g;
      }

      @Override
      default dkb a(dkb.f $$0) {
         return $$0.apply(new dkc.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dkc.n.a e, dkb f, double g, double h, double i) implements dkc.p, dkc.y {
      @Override
      public dkc.y.a j() {
         return this.e == dkc.n.a.a ? dkc.y.a.b : dkc.y.a.a;
      }

      @Override
      public dkb k() {
         return dkc.a(this.i);
      }

      @Override
      public dkb l() {
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
      public dkb a(dkb.f $$0) {
         dkb $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dkc.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dkc.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dkc.n.a m() {
         return this.e;
      }

      @Override
      public dkb ar_() {
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

   protected static record o(dkb.c f, @Deprecated double g, double h) implements dkb {
      public static final MapCodec<dkc.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkb.c.a.fieldOf("noise").forGetter(dkc.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dkc.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dkc.o::l)
               )
               .apply($$0, dkc.o::new)
      );
      public static final arj<dkc.o> e = dkc.a(a);

      @Override
      public double a(dkb.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dkb.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkb a(dkb.f $$0) {
         return $$0.apply(new dkc.o($$0.a(this.f), this.g, this.h));
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
      public arj<? extends dkb> c() {
         return e;
      }

      public dkb.c j() {
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

   interface p extends dkb {
      dkb ar_();

      @Override
      default double a(dkb.b $$0) {
         return this.a(this.ar_().a($$0));
      }

      @Override
      default void a(double[] $$0, dkb.a $$1) {
         this.ar_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dkb f, double g, double h, dkb i, dkb j) implements dkb {
      public static final MapCodec<dkc.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkb.d.fieldOf("input").forGetter(dkc.q::j),
                  dkc.d.fieldOf("min_inclusive").forGetter(dkc.q::k),
                  dkc.d.fieldOf("max_exclusive").forGetter(dkc.q::l),
                  dkb.d.fieldOf("when_in_range").forGetter(dkc.q::m),
                  dkb.d.fieldOf("when_out_of_range").forGetter(dkc.q::n)
               )
               .apply($$0, dkc.q::new)
      );
      public static final arj<dkc.q> e = dkc.a(a);

      @Override
      public double a(dkb.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dkb.a $$1) {
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
      public dkb a(dkb.f $$0) {
         return $$0.apply(new dkc.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public arj<? extends dkb> c() {
         return e;
      }

      public dkb j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dkb m() {
         return this.i;
      }

      public dkb n() {
         return this.j;
      }
   }

   protected static record r(dkb.c a) implements dkc.u {
      static final arj<dkc.r> e = dkc.a(dkb.c.a, dkc.r::new, dkc.r::j);

      @Override
      public double a(dkb.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dkb a(dkb.f $$0) {
         return $$0.apply(new dkc.r($$0.a(this.a)));
      }

      @Override
      public arj<? extends dkb> c() {
         return e;
      }

      @Override
      public dkb.c j() {
         return this.a;
      }
   }

   protected static record s(dkb.c a) implements dkc.u {
      static final arj<dkc.s> e = dkc.a(dkb.c.a, dkc.s::new, dkc.s::j);

      @Override
      public double a(dkb.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dkb a(dkb.f $$0) {
         return $$0.apply(new dkc.s($$0.a(this.a)));
      }

      @Override
      public arj<? extends dkb> c() {
         return e;
      }

      @Override
      public dkb.c j() {
         return this.a;
      }
   }

   protected static record t(dkb.c a) implements dkc.u {
      static final arj<dkc.t> e = dkc.a(dkb.c.a, dkc.t::new, dkc.t::j);

      @Override
      public double a(dkb.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dkb a(dkb.f $$0) {
         return $$0.apply(new dkc.t($$0.a(this.a)));
      }

      @Override
      public arj<? extends dkb> c() {
         return e;
      }

      @Override
      public dkb.c j() {
         return this.a;
      }
   }

   interface u extends dkb {
      dkb.c j();

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
      default void a(double[] $$0, dkb.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dkb e, dkb f, dkb g, double h, double i, dkb.c j) implements dkb {
      private static final MapCodec<dkc.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkb.d.fieldOf("shift_x").forGetter(dkc.v::j),
                  dkb.d.fieldOf("shift_y").forGetter(dkc.v::k),
                  dkb.d.fieldOf("shift_z").forGetter(dkc.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dkc.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dkc.v::n),
                  dkb.c.a.fieldOf("noise").forGetter(dkc.v::o)
               )
               .apply($$0, dkc.v::new)
      );
      public static final arj<dkc.v> a = dkc.a(k);

      @Override
      public double a(dkb.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dkb.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkb a(dkb.f $$0) {
         return $$0.apply(new dkc.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public arj<? extends dkb> c() {
         return a;
      }

      public dkb j() {
         return this.e;
      }

      public dkb k() {
         return this.f;
      }

      public dkb l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dkb.c o() {
         return this.j;
      }
   }

   public static record w(aqt<dkc.w.b, dkc.w.a> e) implements dkb {
      private static final Codec<aqt<dkc.w.b, dkc.w.a>> f = aqt.a(dkc.w.a.b);
      private static final MapCodec<dkc.w> g = f.fieldOf("spline").xmap(dkc.w::new, dkc.w::j);
      public static final arj<dkc.w> a = dkc.a(g);

      @Override
      public double a(dkb.b $$0) {
         return (double)this.e.a(new dkc.w.b($$0));
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
      public void a(double[] $$0, dkb.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkb a(dkb.f $$0) {
         return $$0.apply(new dkc.w(this.e.a((aqt.d<dkc.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public arj<? extends dkb> c() {
         return a;
      }

      public aqt<dkc.w.b, dkc.w.a> j() {
         return this.e;
      }

      public static record a(he<dkb> c) implements asn<dkc.w.b> {
         public static final Codec<dkc.w.a> b = dkb.c.xmap(dkc.w.a::new, dkc.w.a::a);

         @Override
         public String toString() {
            Optional<aeq<dkb>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               aeq<dkb> $$1 = $$0.get();
               if ($$1 == dkp.d) {
                  return "continents";
               }

               if ($$1 == dkp.e) {
                  return "erosion";
               }

               if ($$1 == dkp.f) {
                  return "weirdness";
               }

               if ($$1 == dkp.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dkc.w.b $$0) {
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

         public dkc.w.a a(dkb.f $$0) {
            return new dkc.w.a(new he.a<>(this.c.a().a($$0)));
         }

         public he<dkb> a() {
            return this.c;
         }
      }

      public static record b(dkb.b a) {
      }
   }

   interface x extends dkb {
      dkb j();

      @Override
      default double a(dkb.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dkb.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dkb.b var1, double var2);
   }

   interface y extends dkb {
      Logger a = LogUtils.getLogger();

      static dkc.y a(dkc.y.a $$0, dkb $$1, dkb $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dkc.y.a.c || $$0 == dkc.y.a.d) {
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
         if ($$0 == dkc.y.a.b || $$0 == dkc.y.a.a) {
            if ($$1 instanceof dkc.h $$11) {
               return new dkc.n($$0 == dkc.y.a.a ? dkc.n.a.b : dkc.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dkc.h $$12) {
               return new dkc.n($$0 == dkc.y.a.a ? dkc.n.a.b : dkc.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dkc.a($$0, $$1, $$2, $$9, $$10);
      }

      dkc.y.a j();

      dkb k();

      dkb l();

      @Override
      default arj<? extends dkb> c() {
         return this.j().e;
      }

      public static enum a implements ash {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final arj<dkc.y> e = dkc.a((BiFunction<dkb, dkb, dkc.y>)(($$0x, $$1) -> dkc.y.a(this, $$0x, $$1)), dkc.y::k, dkc.y::l);
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

   protected static record z(dkb e, dkb.c f, dkc.z.a g) implements dkc.x {
      private static final MapCodec<dkc.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dkb.d.fieldOf("input").forGetter(dkc.z::j),
                  dkb.c.a.fieldOf("noise").forGetter(dkc.z::k),
                  dkc.z.a.c.fieldOf("rarity_value_mapper").forGetter(dkc.z::l)
               )
               .apply($$0, dkc.z::new)
      );
      public static final arj<dkc.z> a = dkc.a(h);

      @Override
      public double a(dkb.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dkb a(dkb.f $$0) {
         return $$0.apply(new dkc.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public arj<? extends dkb> c() {
         return a;
      }

      @Override
      public dkb j() {
         return this.e;
      }

      public dkb.c k() {
         return this.f;
      }

      public dkc.z.a l() {
         return this.g;
      }

      public static enum a implements ash {
         a("type_1", dkp.a::b, 2.0),
         b("type_2", dkp.a::a, 3.0);

         public static final Codec<dkc.z.a> c = ash.a(dkc.z.a::values);
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
