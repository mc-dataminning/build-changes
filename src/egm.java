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

public final class egm {
   private static final Codec<egl> c = mg.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<egl> b = Codec.either(d, c)
      .xmap($$0 -> (egl)$$0.map(egm::a, Function.identity()), $$0 -> $$0 instanceof egm.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends egl> a(js<MapCodec<? extends egl>> $$0) {
      a($$0, "blend_alpha", egm.d.e);
      a($$0, "blend_offset", egm.f.e);
      a($$0, "beardifier", egm.b.e);
      a($$0, "old_blended_noise", ewa.a);

      for (egm.l.a $$1 : egm.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", egm.o.e);
      a($$0, "end_islands", egm.i.a);
      a($$0, "weird_scaled_sampler", egm.z.a);
      a($$0, "shifted_noise", egm.v.a);
      a($$0, "range_choice", egm.q.e);
      a($$0, "shift_a", egm.s.e);
      a($$0, "shift_b", egm.t.e);
      a($$0, "shift", egm.r.e);
      a($$0, "blend_density", egm.e.e);
      a($$0, "clamp", egm.g.a);

      for (egm.k.a $$2 : egm.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (egm.y.a $$3 : egm.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", egm.w.a);
      a($$0, "constant", egm.h.e);
      return a($$0, "y_clamped_gradient", egm.aa.a);
   }

   private static MapCodec<? extends egl> a(js<MapCodec<? extends egl>> $$0, String $$1, azf<? extends egl> $$2) {
      return js.a($$0, $$1, $$2.a());
   }

   static <A, O> azf<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return azf.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> azf<O> a(Function<egl, O> $$0, Function<O, egl> $$1) {
      return a(egl.d, $$0, $$1);
   }

   static <O> azf<O> a(BiFunction<egl, egl, O> $$0, Function<O, egl> $$1, Function<O, egl> $$2) {
      return azf.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(egl.d.fieldOf("argument1").forGetter($$1), egl.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> azf<O> a(MapCodec<O> $$0) {
      return azf.a($$0);
   }

   private egm() {
   }

   public static egl a(egl $$0) {
      return new egm.l(egm.l.a.a, $$0);
   }

   public static egl b(egl $$0) {
      return new egm.l(egm.l.a.b, $$0);
   }

   public static egl c(egl $$0) {
      return new egm.l(egm.l.a.c, $$0);
   }

   public static egl d(egl $$0) {
      return new egm.l(egm.l.a.d, $$0);
   }

   public static egl e(egl $$0) {
      return new egm.l(egm.l.a.e, $$0);
   }

   public static egl a(jf<ewd.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new egm.o(new egl.c($$0), $$1, $$2), $$3, $$4);
   }

   public static egl a(jf<ewd.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static egl a(jf<ewd.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static egl a(egl $$0, egl $$1, double $$2, jf<ewd.a> $$3) {
      return new egm.v($$0, a(), $$1, $$2, 0.0, new egl.c($$3));
   }

   public static egl a(jf<ewd.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static egl b(jf<ewd.a> $$0, double $$1, double $$2) {
      return new egm.o(new egl.c($$0), $$1, $$2);
   }

   public static egl a(jf<ewd.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static egl a(egl $$0, double $$1, double $$2, egl $$3, egl $$4) {
      return new egm.q($$0, $$1, $$2, $$3, $$4);
   }

   public static egl b(jf<ewd.a> $$0) {
      return new egm.s(new egl.c($$0));
   }

   public static egl c(jf<ewd.a> $$0) {
      return new egm.t(new egl.c($$0));
   }

   public static egl d(jf<ewd.a> $$0) {
      return new egm.r(new egl.c($$0));
   }

   public static egl f(egl $$0) {
      return new egm.e($$0);
   }

   public static egl a(long $$0) {
      return new egm.i($$0);
   }

   public static egl a(egl $$0, jf<ewd.a> $$1, egm.z.a $$2) {
      return new egm.z($$0, new egl.c($$1), $$2);
   }

   public static egl a(egl $$0, egl $$1) {
      return egm.y.a(egm.y.a.a, $$0, $$1);
   }

   public static egl b(egl $$0, egl $$1) {
      return egm.y.a(egm.y.a.b, $$0, $$1);
   }

   public static egl c(egl $$0, egl $$1) {
      return egm.y.a(egm.y.a.c, $$0, $$1);
   }

   public static egl d(egl $$0, egl $$1) {
      return egm.y.a(egm.y.a.d, $$0, $$1);
   }

   public static egl a(ayn<egm.w.b, egm.w.a> $$0) {
      return new egm.w($$0);
   }

   public static egl a() {
      return egm.h.f;
   }

   public static egl a(double $$0) {
      return new egm.h($$0);
   }

   public static egl a(int $$0, int $$1, double $$2, double $$3) {
      return new egm.aa($$0, $$1, $$2, $$3);
   }

   public static egl a(egl $$0, egm.k.a $$1) {
      return egm.k.a($$1, $$0);
   }

   private static egl a(egl $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static egl b() {
      return egm.d.a;
   }

   public static egl c() {
      return egm.f.a;
   }

   public static egl a(egl $$0, egl $$1, egl $$2) {
      if ($$1 instanceof egm.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         egl $$4 = d($$0);
         egl $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static egl a(egl $$0, double $$1, egl $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(egm.y.a e, egl f, egl g, double h, double i) implements egm.y {
      @Override
      public double a(egl.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, egl.a $$1) {
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
      public egl a(egl.f $$0) {
         return $$0.apply(egm.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public egm.y.a j() {
         return this.e;
      }

      @Override
      public egl k() {
         return this.f;
      }

      @Override
      public egl l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements egl.d {
      private static final MapCodec<egm.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(eeq.e * 2, eeq.d * 2).fieldOf("from_y").forGetter(egm.aa::j),
                  Codec.intRange(eeq.e * 2, eeq.d * 2).fieldOf("to_y").forGetter(egm.aa::k),
                  egm.d.fieldOf("from_value").forGetter(egm.aa::l),
                  egm.d.fieldOf("to_value").forGetter(egm.aa::m)
               )
               .apply($$0, egm.aa::new)
      );
      public static final azf<egm.aa> a = egm.a(i);

      @Override
      public double a(egl.b $$0) {
         return azm.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public azf<? extends egl> c() {
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

   protected static enum b implements egm.c {
      a;

      @Override
      public double a(egl.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, egl.a $$1) {
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

   public interface c extends egl.d {
      azf<egl> e = azf.a(MapCodec.unit(egm.b.a));

      @Override
      default azf<? extends egl> c() {
         return e;
      }
   }

   protected static enum d implements egl.d {
      a;

      public static final azf<egl> e = azf.a(MapCodec.unit(a));

      @Override
      public double a(egl.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, egl.a $$1) {
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
      public azf<? extends egl> c() {
         return e;
      }
   }

   static record e(egl a) implements egm.x {
      static final azf<egm.e> e = egm.a(egm.e::new, egm.e::j);

      @Override
      public double a(egl.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public egl a(egl.f $$0) {
         return $$0.apply(new egm.e(this.a.a($$0)));
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
      public azf<? extends egl> c() {
         return e;
      }

      @Override
      public egl j() {
         return this.a;
      }
   }

   protected static enum f implements egl.d {
      a;

      public static final azf<egl> e = azf.a(MapCodec.unit(a));

      @Override
      public double a(egl.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, egl.a $$1) {
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
      public azf<? extends egl> c() {
         return e;
      }
   }

   protected static record g(egl e, double f, double g) implements egm.p {
      private static final MapCodec<egm.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(egl.b.fieldOf("input").forGetter(egm.g::aA_), egm.d.fieldOf("min").forGetter(egm.g::a), egm.d.fieldOf("max").forGetter(egm.g::b))
               .apply($$0, egm.g::new)
      );
      public static final azf<egm.g> a = egm.a(h);

      @Override
      public double a(double $$0) {
         return azm.a($$0, this.f, this.g);
      }

      @Override
      public egl a(egl.f $$0) {
         return new egm.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public azf<? extends egl> c() {
         return a;
      }

      @Override
      public egl aA_() {
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

   static record h(double a) implements egl.d {
      static final azf<egm.h> e = egm.a(egm.d, egm.h::new, egm.h::j);
      static final egm.h f = new egm.h(0.0);

      @Override
      public void a(double[] $$0, egl.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public azf<? extends egl> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements egl.d {
      public static final azf<egm.i> a = azf.a(MapCodec.unit(new egm.i(0L)));
      private static final float e = -0.9F;
      private final ewg f;

      public i(long $$0) {
         azv $$1 = new egt($$0);
         $$1.b(17292);
         this.f = new ewg($$1);
      }

      private static float a(ewg $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - azm.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = azm.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (azm.e((float)$$10) * 3439.0F + azm.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - azm.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = azm.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(egl.b $$0) {
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
      public azf<? extends egl> c() {
         return a;
      }
   }

   @bav
   public static record j(jf<egl> a) implements egl {
      @Override
      public double a(egl.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, egl.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public egl a(egl.f $$0) {
         return $$0.apply(new egm.j(new jf.a<>(this.a.a().a($$0))));
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
      public azf<? extends egl> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jf<egl> j() {
         return this.a;
      }
   }

   protected static record k(egm.k.a a, egl e, double f, double g) implements egm.p {
      public static egm.k a(egm.k.a $$0, egl $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != egm.k.a.a && $$0 != egm.k.a.b ? new egm.k($$0, $$1, $$3, $$4) : new egm.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(egm.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = azm.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public egm.k b(egl.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public azf<? extends egl> c() {
         return this.a.h;
      }

      public egm.k.a k() {
         return this.a;
      }

      @Override
      public egl aA_() {
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

      static enum a implements bak {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final azf<egm.k> h = egm.a($$0x -> egm.k.a(this, $$0x), egm.k::aA_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(egm.l.a a, egl e) implements egm.m {
      @Override
      public double a(egl.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, egl.a $$1) {
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
      public egm.l.a j() {
         return this.a;
      }

      @Override
      public egl k() {
         return this.e;
      }

      static enum a implements bak {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final azf<egm.m> g = egm.a($$0x -> new egm.l(this, $$0x), egm.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends egl {
      egm.l.a j();

      egl k();

      @Override
      default azf<? extends egl> c() {
         return this.j().g;
      }

      @Override
      default egl a(egl.f $$0) {
         return $$0.apply(new egm.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(egm.n.a e, egl f, double g, double h, double i) implements egm.p, egm.y {
      @Override
      public egm.y.a j() {
         return this.e == egm.n.a.a ? egm.y.a.b : egm.y.a.a;
      }

      @Override
      public egl k() {
         return egm.a(this.i);
      }

      @Override
      public egl l() {
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
      public egl a(egl.f $$0) {
         egl $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == egm.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new egm.n(this.e, $$1, $$4, $$5, this.i);
      }

      public egm.n.a m() {
         return this.e;
      }

      @Override
      public egl aA_() {
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

   protected static record o(egl.c f, @Deprecated double g, double h) implements egl {
      public static final MapCodec<egm.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  egl.c.a.fieldOf("noise").forGetter(egm.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(egm.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(egm.o::l)
               )
               .apply($$0, egm.o::new)
      );
      public static final azf<egm.o> e = egm.a(a);

      @Override
      public double a(egl.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, egl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public egl a(egl.f $$0) {
         return $$0.apply(new egm.o($$0.a(this.f), this.g, this.h));
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
      public azf<? extends egl> c() {
         return e;
      }

      public egl.c j() {
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

   interface p extends egl {
      egl aA_();

      @Override
      default double a(egl.b $$0) {
         return this.a(this.aA_().a($$0));
      }

      @Override
      default void a(double[] $$0, egl.a $$1) {
         this.aA_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(egl f, double g, double h, egl i, egl j) implements egl {
      public static final MapCodec<egm.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  egl.d.fieldOf("input").forGetter(egm.q::j),
                  egm.d.fieldOf("min_inclusive").forGetter(egm.q::k),
                  egm.d.fieldOf("max_exclusive").forGetter(egm.q::l),
                  egl.d.fieldOf("when_in_range").forGetter(egm.q::m),
                  egl.d.fieldOf("when_out_of_range").forGetter(egm.q::n)
               )
               .apply($$0, egm.q::new)
      );
      public static final azf<egm.q> e = egm.a(a);

      @Override
      public double a(egl.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, egl.a $$1) {
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
      public egl a(egl.f $$0) {
         return $$0.apply(new egm.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public azf<? extends egl> c() {
         return e;
      }

      public egl j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public egl m() {
         return this.i;
      }

      public egl n() {
         return this.j;
      }
   }

   protected static record r(egl.c a) implements egm.u {
      static final azf<egm.r> e = egm.a(egl.c.a, egm.r::new, egm.r::j);

      @Override
      public double a(egl.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public egl a(egl.f $$0) {
         return $$0.apply(new egm.r($$0.a(this.a)));
      }

      @Override
      public azf<? extends egl> c() {
         return e;
      }

      @Override
      public egl.c j() {
         return this.a;
      }
   }

   protected static record s(egl.c a) implements egm.u {
      static final azf<egm.s> e = egm.a(egl.c.a, egm.s::new, egm.s::j);

      @Override
      public double a(egl.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public egl a(egl.f $$0) {
         return $$0.apply(new egm.s($$0.a(this.a)));
      }

      @Override
      public azf<? extends egl> c() {
         return e;
      }

      @Override
      public egl.c j() {
         return this.a;
      }
   }

   protected static record t(egl.c a) implements egm.u {
      static final azf<egm.t> e = egm.a(egl.c.a, egm.t::new, egm.t::j);

      @Override
      public double a(egl.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public egl a(egl.f $$0) {
         return $$0.apply(new egm.t($$0.a(this.a)));
      }

      @Override
      public azf<? extends egl> c() {
         return e;
      }

      @Override
      public egl.c j() {
         return this.a;
      }
   }

   interface u extends egl {
      egl.c j();

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
      default void a(double[] $$0, egl.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(egl e, egl f, egl g, double h, double i, egl.c j) implements egl {
      private static final MapCodec<egm.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  egl.d.fieldOf("shift_x").forGetter(egm.v::j),
                  egl.d.fieldOf("shift_y").forGetter(egm.v::k),
                  egl.d.fieldOf("shift_z").forGetter(egm.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(egm.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(egm.v::n),
                  egl.c.a.fieldOf("noise").forGetter(egm.v::o)
               )
               .apply($$0, egm.v::new)
      );
      public static final azf<egm.v> a = egm.a(k);

      @Override
      public double a(egl.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, egl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public egl a(egl.f $$0) {
         return $$0.apply(new egm.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public azf<? extends egl> c() {
         return a;
      }

      public egl j() {
         return this.e;
      }

      public egl k() {
         return this.f;
      }

      public egl l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public egl.c o() {
         return this.j;
      }
   }

   public static record w(ayn<egm.w.b, egm.w.a> e) implements egl {
      private static final Codec<ayn<egm.w.b, egm.w.a>> f = ayn.a(egm.w.a.b);
      private static final MapCodec<egm.w> g = f.fieldOf("spline").xmap(egm.w::new, egm.w::j);
      public static final azf<egm.w> a = egm.a(g);

      @Override
      public double a(egl.b $$0) {
         return (double)this.e.a(new egm.w.b($$0));
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
      public void a(double[] $$0, egl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public egl a(egl.f $$0) {
         return $$0.apply(new egm.w(this.e.a((ayn.d<egm.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public azf<? extends egl> c() {
         return a;
      }

      public ayn<egm.w.b, egm.w.a> j() {
         return this.e;
      }

      public static record a(jf<egl> c) implements bar<egm.w.b> {
         public static final Codec<egm.w.a> b = egl.c.xmap(egm.w.a::new, egm.w.a::a);

         @Override
         public String toString() {
            Optional<alf<egl>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               alf<egl> $$1 = $$0.get();
               if ($$1 == egz.d) {
                  return "continents";
               }

               if ($$1 == egz.e) {
                  return "erosion";
               }

               if ($$1 == egz.f) {
                  return "weirdness";
               }

               if ($$1 == egz.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(egm.w.b $$0) {
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

         public egm.w.a a(egl.f $$0) {
            return new egm.w.a(new jf.a<>(this.c.a().a($$0)));
         }

         public jf<egl> a() {
            return this.c;
         }
      }

      public static record b(egl.b a) {
      }
   }

   interface x extends egl {
      egl j();

      @Override
      default double a(egl.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, egl.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(egl.b var1, double var2);
   }

   interface y extends egl {
      Logger a = LogUtils.getLogger();

      static egm.y a(egm.y.a $$0, egl $$1, egl $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == egm.y.a.c || $$0 == egm.y.a.d) {
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
         if ($$0 == egm.y.a.b || $$0 == egm.y.a.a) {
            if ($$1 instanceof egm.h $$11) {
               return new egm.n($$0 == egm.y.a.a ? egm.n.a.b : egm.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof egm.h $$12) {
               return new egm.n($$0 == egm.y.a.a ? egm.n.a.b : egm.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new egm.a($$0, $$1, $$2, $$9, $$10);
      }

      egm.y.a j();

      egl k();

      egl l();

      @Override
      default azf<? extends egl> c() {
         return this.j().e;
      }

      public static enum a implements bak {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final azf<egm.y> e = egm.a((BiFunction<egl, egl, egm.y>)(($$0x, $$1) -> egm.y.a(this, $$0x, $$1)), egm.y::k, egm.y::l);
         private final String f;

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   protected static record z(egl e, egl.c f, egm.z.a g) implements egm.x {
      private static final MapCodec<egm.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  egl.d.fieldOf("input").forGetter(egm.z::j),
                  egl.c.a.fieldOf("noise").forGetter(egm.z::k),
                  egm.z.a.c.fieldOf("rarity_value_mapper").forGetter(egm.z::l)
               )
               .apply($$0, egm.z::new)
      );
      public static final azf<egm.z> a = egm.a(h);

      @Override
      public double a(egl.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public egl a(egl.f $$0) {
         return $$0.apply(new egm.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public azf<? extends egl> c() {
         return a;
      }

      @Override
      public egl j() {
         return this.e;
      }

      public egl.c k() {
         return this.f;
      }

      public egm.z.a l() {
         return this.g;
      }

      public static enum a implements bak {
         a("type_1", egz.a::b, 2.0),
         b("type_2", egz.a::a, 3.0);

         public static final Codec<egm.z.a> c = bak.a(egm.z.a::values);
         private final String d;
         final Double2DoubleFunction e;
         final double f;

         private a(final String $$0, final Double2DoubleFunction $$1, final double $$2) {
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
