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

public final class eai {
   private static final Codec<eah> c = lv.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<eah> b = Codec.either(d, c)
      .xmap($$0 -> (eah)$$0.map(eai::a, Function.identity()), $$0 -> $$0 instanceof eai.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends eah> a(kb<MapCodec<? extends eah>> $$0) {
      a($$0, "blend_alpha", eai.d.e);
      a($$0, "blend_offset", eai.f.e);
      a($$0, "beardifier", eai.b.e);
      a($$0, "old_blended_noise", ept.a);

      for (eai.l.a $$1 : eai.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", eai.o.e);
      a($$0, "end_islands", eai.i.a);
      a($$0, "weird_scaled_sampler", eai.z.a);
      a($$0, "shifted_noise", eai.v.a);
      a($$0, "range_choice", eai.q.e);
      a($$0, "shift_a", eai.s.e);
      a($$0, "shift_b", eai.t.e);
      a($$0, "shift", eai.r.e);
      a($$0, "blend_density", eai.e.e);
      a($$0, "clamp", eai.g.a);

      for (eai.k.a $$2 : eai.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (eai.y.a $$3 : eai.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", eai.w.a);
      a($$0, "constant", eai.h.e);
      return a($$0, "y_clamped_gradient", eai.aa.a);
   }

   private static MapCodec<? extends eah> a(kb<MapCodec<? extends eah>> $$0, String $$1, ayy<? extends eah> $$2) {
      return kb.a($$0, $$1, $$2.a());
   }

   static <A, O> ayy<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return ayy.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> ayy<O> a(Function<eah, O> $$0, Function<O, eah> $$1) {
      return a(eah.d, $$0, $$1);
   }

   static <O> ayy<O> a(BiFunction<eah, eah, O> $$0, Function<O, eah> $$1, Function<O, eah> $$2) {
      return ayy.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(eah.d.fieldOf("argument1").forGetter($$1), eah.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> ayy<O> a(MapCodec<O> $$0) {
      return ayy.a($$0);
   }

   private eai() {
   }

   public static eah a(eah $$0) {
      return new eai.l(eai.l.a.a, $$0);
   }

   public static eah b(eah $$0) {
      return new eai.l(eai.l.a.b, $$0);
   }

   public static eah c(eah $$0) {
      return new eai.l(eai.l.a.c, $$0);
   }

   public static eah d(eah $$0) {
      return new eai.l(eai.l.a.d, $$0);
   }

   public static eah e(eah $$0) {
      return new eai.l(eai.l.a.e, $$0);
   }

   public static eah a(jo<epw.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new eai.o(new eah.c($$0), $$1, $$2), $$3, $$4);
   }

   public static eah a(jo<epw.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static eah a(jo<epw.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static eah a(eah $$0, eah $$1, double $$2, jo<epw.a> $$3) {
      return new eai.v($$0, a(), $$1, $$2, 0.0, new eah.c($$3));
   }

   public static eah a(jo<epw.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static eah b(jo<epw.a> $$0, double $$1, double $$2) {
      return new eai.o(new eah.c($$0), $$1, $$2);
   }

   public static eah a(jo<epw.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static eah a(eah $$0, double $$1, double $$2, eah $$3, eah $$4) {
      return new eai.q($$0, $$1, $$2, $$3, $$4);
   }

   public static eah b(jo<epw.a> $$0) {
      return new eai.s(new eah.c($$0));
   }

   public static eah c(jo<epw.a> $$0) {
      return new eai.t(new eah.c($$0));
   }

   public static eah d(jo<epw.a> $$0) {
      return new eai.r(new eah.c($$0));
   }

   public static eah f(eah $$0) {
      return new eai.e($$0);
   }

   public static eah a(long $$0) {
      return new eai.i($$0);
   }

   public static eah a(eah $$0, jo<epw.a> $$1, eai.z.a $$2) {
      return new eai.z($$0, new eah.c($$1), $$2);
   }

   public static eah a(eah $$0, eah $$1) {
      return eai.y.a(eai.y.a.a, $$0, $$1);
   }

   public static eah b(eah $$0, eah $$1) {
      return eai.y.a(eai.y.a.b, $$0, $$1);
   }

   public static eah c(eah $$0, eah $$1) {
      return eai.y.a(eai.y.a.c, $$0, $$1);
   }

   public static eah d(eah $$0, eah $$1) {
      return eai.y.a(eai.y.a.d, $$0, $$1);
   }

   public static eah a(ayh<eai.w.b, eai.w.a> $$0) {
      return new eai.w($$0);
   }

   public static eah a() {
      return eai.h.f;
   }

   public static eah a(double $$0) {
      return new eai.h($$0);
   }

   public static eah a(int $$0, int $$1, double $$2, double $$3) {
      return new eai.aa($$0, $$1, $$2, $$3);
   }

   public static eah a(eah $$0, eai.k.a $$1) {
      return eai.k.a($$1, $$0);
   }

   private static eah a(eah $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static eah b() {
      return eai.d.a;
   }

   public static eah c() {
      return eai.f.a;
   }

   public static eah a(eah $$0, eah $$1, eah $$2) {
      if ($$1 instanceof eai.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         eah $$4 = d($$0);
         eah $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static eah a(eah $$0, double $$1, eah $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(eai.y.a e, eah f, eah g, double h, double i) implements eai.y {
      @Override
      public double a(eah.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, eah.a $$1) {
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
      public eah a(eah.f $$0) {
         return $$0.apply(eai.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public eai.y.a j() {
         return this.e;
      }

      @Override
      public eah k() {
         return this.f;
      }

      @Override
      public eah l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements eah.d {
      private static final MapCodec<eai.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dyo.e * 2, dyo.d * 2).fieldOf("from_y").forGetter(eai.aa::j),
                  Codec.intRange(dyo.e * 2, dyo.d * 2).fieldOf("to_y").forGetter(eai.aa::k),
                  eai.d.fieldOf("from_value").forGetter(eai.aa::l),
                  eai.d.fieldOf("to_value").forGetter(eai.aa::m)
               )
               .apply($$0, eai.aa::new)
      );
      public static final ayy<eai.aa> a = eai.a(i);

      @Override
      public double a(eah.b $$0) {
         return azf.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public ayy<? extends eah> c() {
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

   protected static enum b implements eai.c {
      a;

      @Override
      public double a(eah.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, eah.a $$1) {
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

   public interface c extends eah.d {
      ayy<eah> e = ayy.a(MapCodec.unit(eai.b.a));

      @Override
      default ayy<? extends eah> c() {
         return e;
      }
   }

   protected static enum d implements eah.d {
      a;

      public static final ayy<eah> e = ayy.a(MapCodec.unit(a));

      @Override
      public double a(eah.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, eah.a $$1) {
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
      public ayy<? extends eah> c() {
         return e;
      }
   }

   static record e(eah a) implements eai.x {
      static final ayy<eai.e> e = eai.a(eai.e::new, eai.e::j);

      @Override
      public double a(eah.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public eah a(eah.f $$0) {
         return $$0.apply(new eai.e(this.a.a($$0)));
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
      public ayy<? extends eah> c() {
         return e;
      }

      @Override
      public eah j() {
         return this.a;
      }
   }

   protected static enum f implements eah.d {
      a;

      public static final ayy<eah> e = ayy.a(MapCodec.unit(a));

      @Override
      public double a(eah.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, eah.a $$1) {
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
      public ayy<? extends eah> c() {
         return e;
      }
   }

   protected static record g(eah e, double f, double g) implements eai.p {
      private static final MapCodec<eai.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(eah.b.fieldOf("input").forGetter(eai.g::aF_), eai.d.fieldOf("min").forGetter(eai.g::a), eai.d.fieldOf("max").forGetter(eai.g::b))
               .apply($$0, eai.g::new)
      );
      public static final ayy<eai.g> a = eai.a(h);

      @Override
      public double a(double $$0) {
         return azf.a($$0, this.f, this.g);
      }

      @Override
      public eah a(eah.f $$0) {
         return new eai.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public ayy<? extends eah> c() {
         return a;
      }

      @Override
      public eah aF_() {
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

   static record h(double a) implements eah.d {
      static final ayy<eai.h> e = eai.a(eai.d, eai.h::new, eai.h::j);
      static final eai.h f = new eai.h(0.0);

      @Override
      public void a(double[] $$0, eah.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public ayy<? extends eah> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements eah.d {
      public static final ayy<eai.i> a = ayy.a(MapCodec.unit(new eai.i(0L)));
      private static final float e = -0.9F;
      private final epz f;

      public i(long $$0) {
         azn $$1 = new eap($$0);
         $$1.b(17292);
         this.f = new epz($$1);
      }

      private static float a(epz $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - azf.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = azf.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (azf.e((float)$$10) * 3439.0F + azf.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - azf.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = azf.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(eah.b $$0) {
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
      public ayy<? extends eah> c() {
         return a;
      }
   }

   @bal
   public static record j(jo<eah> a) implements eah {
      @Override
      public double a(eah.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, eah.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public eah a(eah.f $$0) {
         return $$0.apply(new eai.j(new jo.a<>(this.a.a().a($$0))));
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
      public ayy<? extends eah> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jo<eah> j() {
         return this.a;
      }
   }

   protected static record k(eai.k.a a, eah e, double f, double g) implements eai.p {
      public static eai.k a(eai.k.a $$0, eah $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != eai.k.a.a && $$0 != eai.k.a.b ? new eai.k($$0, $$1, $$3, $$4) : new eai.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(eai.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = azf.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public eai.k b(eah.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public ayy<? extends eah> c() {
         return this.a.h;
      }

      public eai.k.a k() {
         return this.a;
      }

      @Override
      public eah aF_() {
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

      static enum a implements bab {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final ayy<eai.k> h = eai.a($$0x -> eai.k.a(this, $$0x), eai.k::aF_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(eai.l.a a, eah e) implements eai.m {
      @Override
      public double a(eah.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, eah.a $$1) {
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
      public eai.l.a j() {
         return this.a;
      }

      @Override
      public eah k() {
         return this.e;
      }

      static enum a implements bab {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final ayy<eai.m> g = eai.a($$0x -> new eai.l(this, $$0x), eai.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends eah {
      eai.l.a j();

      eah k();

      @Override
      default ayy<? extends eah> c() {
         return this.j().g;
      }

      @Override
      default eah a(eah.f $$0) {
         return $$0.apply(new eai.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(eai.n.a e, eah f, double g, double h, double i) implements eai.p, eai.y {
      @Override
      public eai.y.a j() {
         return this.e == eai.n.a.a ? eai.y.a.b : eai.y.a.a;
      }

      @Override
      public eah k() {
         return eai.a(this.i);
      }

      @Override
      public eah l() {
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
      public eah a(eah.f $$0) {
         eah $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == eai.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new eai.n(this.e, $$1, $$4, $$5, this.i);
      }

      public eai.n.a m() {
         return this.e;
      }

      @Override
      public eah aF_() {
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

   protected static record o(eah.c f, @Deprecated double g, double h) implements eah {
      public static final MapCodec<eai.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eah.c.a.fieldOf("noise").forGetter(eai.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(eai.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(eai.o::l)
               )
               .apply($$0, eai.o::new)
      );
      public static final ayy<eai.o> e = eai.a(a);

      @Override
      public double a(eah.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, eah.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eah a(eah.f $$0) {
         return $$0.apply(new eai.o($$0.a(this.f), this.g, this.h));
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
      public ayy<? extends eah> c() {
         return e;
      }

      public eah.c j() {
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

   interface p extends eah {
      eah aF_();

      @Override
      default double a(eah.b $$0) {
         return this.a(this.aF_().a($$0));
      }

      @Override
      default void a(double[] $$0, eah.a $$1) {
         this.aF_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(eah f, double g, double h, eah i, eah j) implements eah {
      public static final MapCodec<eai.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eah.d.fieldOf("input").forGetter(eai.q::j),
                  eai.d.fieldOf("min_inclusive").forGetter(eai.q::k),
                  eai.d.fieldOf("max_exclusive").forGetter(eai.q::l),
                  eah.d.fieldOf("when_in_range").forGetter(eai.q::m),
                  eah.d.fieldOf("when_out_of_range").forGetter(eai.q::n)
               )
               .apply($$0, eai.q::new)
      );
      public static final ayy<eai.q> e = eai.a(a);

      @Override
      public double a(eah.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, eah.a $$1) {
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
      public eah a(eah.f $$0) {
         return $$0.apply(new eai.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public ayy<? extends eah> c() {
         return e;
      }

      public eah j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public eah m() {
         return this.i;
      }

      public eah n() {
         return this.j;
      }
   }

   protected static record r(eah.c a) implements eai.u {
      static final ayy<eai.r> e = eai.a(eah.c.a, eai.r::new, eai.r::j);

      @Override
      public double a(eah.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public eah a(eah.f $$0) {
         return $$0.apply(new eai.r($$0.a(this.a)));
      }

      @Override
      public ayy<? extends eah> c() {
         return e;
      }

      @Override
      public eah.c j() {
         return this.a;
      }
   }

   protected static record s(eah.c a) implements eai.u {
      static final ayy<eai.s> e = eai.a(eah.c.a, eai.s::new, eai.s::j);

      @Override
      public double a(eah.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public eah a(eah.f $$0) {
         return $$0.apply(new eai.s($$0.a(this.a)));
      }

      @Override
      public ayy<? extends eah> c() {
         return e;
      }

      @Override
      public eah.c j() {
         return this.a;
      }
   }

   protected static record t(eah.c a) implements eai.u {
      static final ayy<eai.t> e = eai.a(eah.c.a, eai.t::new, eai.t::j);

      @Override
      public double a(eah.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public eah a(eah.f $$0) {
         return $$0.apply(new eai.t($$0.a(this.a)));
      }

      @Override
      public ayy<? extends eah> c() {
         return e;
      }

      @Override
      public eah.c j() {
         return this.a;
      }
   }

   interface u extends eah {
      eah.c j();

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
      default void a(double[] $$0, eah.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(eah e, eah f, eah g, double h, double i, eah.c j) implements eah {
      private static final MapCodec<eai.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eah.d.fieldOf("shift_x").forGetter(eai.v::j),
                  eah.d.fieldOf("shift_y").forGetter(eai.v::k),
                  eah.d.fieldOf("shift_z").forGetter(eai.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(eai.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(eai.v::n),
                  eah.c.a.fieldOf("noise").forGetter(eai.v::o)
               )
               .apply($$0, eai.v::new)
      );
      public static final ayy<eai.v> a = eai.a(k);

      @Override
      public double a(eah.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, eah.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eah a(eah.f $$0) {
         return $$0.apply(new eai.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public ayy<? extends eah> c() {
         return a;
      }

      public eah j() {
         return this.e;
      }

      public eah k() {
         return this.f;
      }

      public eah l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public eah.c o() {
         return this.j;
      }
   }

   public static record w(ayh<eai.w.b, eai.w.a> e) implements eah {
      private static final Codec<ayh<eai.w.b, eai.w.a>> f = ayh.a(eai.w.a.b);
      private static final MapCodec<eai.w> g = f.fieldOf("spline").xmap(eai.w::new, eai.w::j);
      public static final ayy<eai.w> a = eai.a(g);

      @Override
      public double a(eah.b $$0) {
         return (double)this.e.a(new eai.w.b($$0));
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
      public void a(double[] $$0, eah.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eah a(eah.f $$0) {
         return $$0.apply(new eai.w(this.e.a((ayh.d<eai.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public ayy<? extends eah> c() {
         return a;
      }

      public ayh<eai.w.b, eai.w.a> j() {
         return this.e;
      }

      public static record a(jo<eah> c) implements bah<eai.w.b> {
         public static final Codec<eai.w.a> b = eah.c.xmap(eai.w.a::new, eai.w.a::a);

         @Override
         public String toString() {
            Optional<ald<eah>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               ald<eah> $$1 = $$0.get();
               if ($$1 == eav.d) {
                  return "continents";
               }

               if ($$1 == eav.e) {
                  return "erosion";
               }

               if ($$1 == eav.f) {
                  return "weirdness";
               }

               if ($$1 == eav.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(eai.w.b $$0) {
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

         public eai.w.a a(eah.f $$0) {
            return new eai.w.a(new jo.a<>(this.c.a().a($$0)));
         }

         public jo<eah> a() {
            return this.c;
         }
      }

      public static record b(eah.b a) {
      }
   }

   interface x extends eah {
      eah j();

      @Override
      default double a(eah.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, eah.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(eah.b var1, double var2);
   }

   interface y extends eah {
      Logger a = LogUtils.getLogger();

      static eai.y a(eai.y.a $$0, eah $$1, eah $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == eai.y.a.c || $$0 == eai.y.a.d) {
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
         if ($$0 == eai.y.a.b || $$0 == eai.y.a.a) {
            if ($$1 instanceof eai.h $$11) {
               return new eai.n($$0 == eai.y.a.a ? eai.n.a.b : eai.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof eai.h $$12) {
               return new eai.n($$0 == eai.y.a.a ? eai.n.a.b : eai.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new eai.a($$0, $$1, $$2, $$9, $$10);
      }

      eai.y.a j();

      eah k();

      eah l();

      @Override
      default ayy<? extends eah> c() {
         return this.j().e;
      }

      public static enum a implements bab {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final ayy<eai.y> e = eai.a((BiFunction<eah, eah, eai.y>)(($$0x, $$1) -> eai.y.a(this, $$0x, $$1)), eai.y::k, eai.y::l);
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

   protected static record z(eah e, eah.c f, eai.z.a g) implements eai.x {
      private static final MapCodec<eai.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  eah.d.fieldOf("input").forGetter(eai.z::j),
                  eah.c.a.fieldOf("noise").forGetter(eai.z::k),
                  eai.z.a.c.fieldOf("rarity_value_mapper").forGetter(eai.z::l)
               )
               .apply($$0, eai.z::new)
      );
      public static final ayy<eai.z> a = eai.a(h);

      @Override
      public double a(eah.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public eah a(eah.f $$0) {
         return $$0.apply(new eai.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public ayy<? extends eah> c() {
         return a;
      }

      @Override
      public eah j() {
         return this.e;
      }

      public eah.c k() {
         return this.f;
      }

      public eai.z.a l() {
         return this.g;
      }

      public static enum a implements bab {
         a("type_1", eav.a::b, 2.0),
         b("type_2", eav.a::a, 3.0);

         public static final Codec<eai.z.a> c = bab.a(eai.z.a::values);
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
