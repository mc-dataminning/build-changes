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

public final class dos {
   private static final Codec<dor> c = kd.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dor> b = Codec.either(d, c)
      .xmap($$0 -> (dor)$$0.map(dos::a, Function.identity()), $$0 -> $$0 instanceof dos.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dor> a(it<Codec<? extends dor>> $$0) {
      a($$0, "blend_alpha", dos.d.e);
      a($$0, "blend_offset", dos.f.e);
      a($$0, "beardifier", dos.b.e);
      a($$0, "old_blended_noise", edz.a);

      for (dos.l.a $$1 : dos.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dos.o.e);
      a($$0, "end_islands", dos.i.a);
      a($$0, "weird_scaled_sampler", dos.z.a);
      a($$0, "shifted_noise", dos.v.a);
      a($$0, "range_choice", dos.q.e);
      a($$0, "shift_a", dos.s.e);
      a($$0, "shift_b", dos.t.e);
      a($$0, "shift", dos.r.e);
      a($$0, "blend_density", dos.e.e);
      a($$0, "clamp", dos.g.a);

      for (dos.k.a $$2 : dos.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dos.y.a $$3 : dos.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dos.w.a);
      a($$0, "constant", dos.h.e);
      return a($$0, "y_clamped_gradient", dos.aa.a);
   }

   private static Codec<? extends dor> a(it<Codec<? extends dor>> $$0, String $$1, auj<? extends dor> $$2) {
      return it.a($$0, $$1, $$2.a());
   }

   static <A, O> auj<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return auj.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> auj<O> a(Function<dor, O> $$0, Function<O, dor> $$1) {
      return a(dor.d, $$0, $$1);
   }

   static <O> auj<O> a(BiFunction<dor, dor, O> $$0, Function<O, dor> $$1, Function<O, dor> $$2) {
      return auj.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dor.d.fieldOf("argument1").forGetter($$1), dor.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> auj<O> a(MapCodec<O> $$0) {
      return auj.a($$0);
   }

   private dos() {
   }

   public static dor a(dor $$0) {
      return new dos.l(dos.l.a.a, $$0);
   }

   public static dor b(dor $$0) {
      return new dos.l(dos.l.a.b, $$0);
   }

   public static dor c(dor $$0) {
      return new dos.l(dos.l.a.c, $$0);
   }

   public static dor d(dor $$0) {
      return new dos.l(dos.l.a.d, $$0);
   }

   public static dor e(dor $$0) {
      return new dos.l(dos.l.a.e, $$0);
   }

   public static dor a(ih<eec.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dos.o(new dor.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dor a(ih<eec.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dor a(ih<eec.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dor a(dor $$0, dor $$1, double $$2, ih<eec.a> $$3) {
      return new dos.v($$0, a(), $$1, $$2, 0.0, new dor.c($$3));
   }

   public static dor a(ih<eec.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dor b(ih<eec.a> $$0, double $$1, double $$2) {
      return new dos.o(new dor.c($$0), $$1, $$2);
   }

   public static dor a(ih<eec.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dor a(dor $$0, double $$1, double $$2, dor $$3, dor $$4) {
      return new dos.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dor b(ih<eec.a> $$0) {
      return new dos.s(new dor.c($$0));
   }

   public static dor c(ih<eec.a> $$0) {
      return new dos.t(new dor.c($$0));
   }

   public static dor d(ih<eec.a> $$0) {
      return new dos.r(new dor.c($$0));
   }

   public static dor f(dor $$0) {
      return new dos.e($$0);
   }

   public static dor a(long $$0) {
      return new dos.i($$0);
   }

   public static dor a(dor $$0, ih<eec.a> $$1, dos.z.a $$2) {
      return new dos.z($$0, new dor.c($$1), $$2);
   }

   public static dor a(dor $$0, dor $$1) {
      return dos.y.a(dos.y.a.a, $$0, $$1);
   }

   public static dor b(dor $$0, dor $$1) {
      return dos.y.a(dos.y.a.b, $$0, $$1);
   }

   public static dor c(dor $$0, dor $$1) {
      return dos.y.a(dos.y.a.c, $$0, $$1);
   }

   public static dor d(dor $$0, dor $$1) {
      return dos.y.a(dos.y.a.d, $$0, $$1);
   }

   public static dor a(atr<dos.w.b, dos.w.a> $$0) {
      return new dos.w($$0);
   }

   public static dor a() {
      return dos.h.f;
   }

   public static dor a(double $$0) {
      return new dos.h($$0);
   }

   public static dor a(int $$0, int $$1, double $$2, double $$3) {
      return new dos.aa($$0, $$1, $$2, $$3);
   }

   public static dor a(dor $$0, dos.k.a $$1) {
      return dos.k.a($$1, $$0);
   }

   private static dor a(dor $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dor b() {
      return dos.d.a;
   }

   public static dor c() {
      return dos.f.a;
   }

   public static dor a(dor $$0, dor $$1, dor $$2) {
      if ($$1 instanceof dos.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dor $$4 = d($$0);
         dor $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dor a(dor $$0, double $$1, dor $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dos.y.a e, dor f, dor g, double h, double i) implements dos.y {
      @Override
      public double a(dor.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dor.a $$1) {
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
      public dor a(dor.f $$0) {
         return $$0.apply(dos.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dos.y.a j() {
         return this.e;
      }

      @Override
      public dor k() {
         return this.f;
      }

      @Override
      public dor l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dor.d {
      private static final MapCodec<dos.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dmy.e * 2, dmy.d * 2).fieldOf("from_y").forGetter(dos.aa::j),
                  Codec.intRange(dmy.e * 2, dmy.d * 2).fieldOf("to_y").forGetter(dos.aa::k),
                  dos.d.fieldOf("from_value").forGetter(dos.aa::l),
                  dos.d.fieldOf("to_value").forGetter(dos.aa::m)
               )
               .apply($$0, dos.aa::new)
      );
      public static final auj<dos.aa> a = dos.a(i);

      @Override
      public double a(dor.b $$0) {
         return aup.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public auj<? extends dor> c() {
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

   protected static enum b implements dos.c {
      a;

      @Override
      public double a(dor.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dor.a $$1) {
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

   public interface c extends dor.d {
      auj<dor> e = auj.a(MapCodec.unit(dos.b.a));

      @Override
      default auj<? extends dor> c() {
         return e;
      }
   }

   protected static enum d implements dor.d {
      a;

      public static final auj<dor> e = auj.a(MapCodec.unit(a));

      @Override
      public double a(dor.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dor.a $$1) {
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
      public auj<? extends dor> c() {
         return e;
      }
   }

   static record e(dor a) implements dos.x {
      static final auj<dos.e> e = dos.a(dos.e::new, dos.e::j);

      @Override
      public double a(dor.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dor a(dor.f $$0) {
         return $$0.apply(new dos.e(this.a.a($$0)));
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
      public auj<? extends dor> c() {
         return e;
      }

      @Override
      public dor j() {
         return this.a;
      }
   }

   protected static enum f implements dor.d {
      a;

      public static final auj<dor> e = auj.a(MapCodec.unit(a));

      @Override
      public double a(dor.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dor.a $$1) {
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
      public auj<? extends dor> c() {
         return e;
      }
   }

   protected static record g(dor e, double f, double g) implements dos.p {
      private static final MapCodec<dos.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dor.b.fieldOf("input").forGetter(dos.g::aF_), dos.d.fieldOf("min").forGetter(dos.g::a), dos.d.fieldOf("max").forGetter(dos.g::b))
               .apply($$0, dos.g::new)
      );
      public static final auj<dos.g> a = dos.a(h);

      @Override
      public double a(double $$0) {
         return aup.a($$0, this.f, this.g);
      }

      @Override
      public dor a(dor.f $$0) {
         return new dos.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public auj<? extends dor> c() {
         return a;
      }

      @Override
      public dor aF_() {
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

   static record h(double a) implements dor.d {
      static final auj<dos.h> e = dos.a(dos.d, dos.h::new, dos.h::j);
      static final dos.h f = new dos.h(0.0);

      @Override
      public void a(double[] $$0, dor.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public auj<? extends dor> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dor.d {
      public static final auj<dos.i> a = auj.a(MapCodec.unit(new dos.i(0L)));
      private static final float e = -0.9F;
      private final eef f;

      public i(long $$0) {
         auw $$1 = new doz($$0);
         $$1.b(17292);
         this.f = new eef($$1);
      }

      private static float a(eef $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - aup.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = aup.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (aup.e((float)$$10) * 3439.0F + aup.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - aup.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = aup.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dor.b $$0) {
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
      public auj<? extends dor> c() {
         return a;
      }
   }

   @avu
   public static record j(ih<dor> a) implements dor {
      @Override
      public double a(dor.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dor.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dor a(dor.f $$0) {
         return $$0.apply(new dos.j(new ih.a<>(this.a.a().a($$0))));
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
      public auj<? extends dor> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public ih<dor> j() {
         return this.a;
      }
   }

   protected static record k(dos.k.a a, dor e, double f, double g) implements dos.p {
      public static dos.k a(dos.k.a $$0, dor $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dos.k.a.a && $$0 != dos.k.a.b ? new dos.k($$0, $$1, $$3, $$4) : new dos.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dos.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = aup.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dos.k b(dor.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public auj<? extends dor> c() {
         return this.a.h;
      }

      public dos.k.a k() {
         return this.a;
      }

      @Override
      public dor aF_() {
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

      static enum a implements avl {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final auj<dos.k> h = dos.a($$0x -> dos.k.a(this, $$0x), dos.k::aF_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dos.l.a a, dor e) implements dos.m {
      @Override
      public double a(dor.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dor.a $$1) {
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
      public dos.l.a j() {
         return this.a;
      }

      @Override
      public dor k() {
         return this.e;
      }

      static enum a implements avl {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final auj<dos.m> g = dos.a($$0x -> new dos.l(this, $$0x), dos.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dor {
      dos.l.a j();

      dor k();

      @Override
      default auj<? extends dor> c() {
         return this.j().g;
      }

      @Override
      default dor a(dor.f $$0) {
         return $$0.apply(new dos.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dos.n.a e, dor f, double g, double h, double i) implements dos.p, dos.y {
      @Override
      public dos.y.a j() {
         return this.e == dos.n.a.a ? dos.y.a.b : dos.y.a.a;
      }

      @Override
      public dor k() {
         return dos.a(this.i);
      }

      @Override
      public dor l() {
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
      public dor a(dor.f $$0) {
         dor $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dos.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dos.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dos.n.a m() {
         return this.e;
      }

      @Override
      public dor aF_() {
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

   protected static record o(dor.c f, @Deprecated double g, double h) implements dor {
      public static final MapCodec<dos.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dor.c.a.fieldOf("noise").forGetter(dos.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dos.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dos.o::l)
               )
               .apply($$0, dos.o::new)
      );
      public static final auj<dos.o> e = dos.a(a);

      @Override
      public double a(dor.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dor.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dor a(dor.f $$0) {
         return $$0.apply(new dos.o($$0.a(this.f), this.g, this.h));
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
      public auj<? extends dor> c() {
         return e;
      }

      public dor.c j() {
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

   interface p extends dor {
      dor aF_();

      @Override
      default double a(dor.b $$0) {
         return this.a(this.aF_().a($$0));
      }

      @Override
      default void a(double[] $$0, dor.a $$1) {
         this.aF_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dor f, double g, double h, dor i, dor j) implements dor {
      public static final MapCodec<dos.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dor.d.fieldOf("input").forGetter(dos.q::j),
                  dos.d.fieldOf("min_inclusive").forGetter(dos.q::k),
                  dos.d.fieldOf("max_exclusive").forGetter(dos.q::l),
                  dor.d.fieldOf("when_in_range").forGetter(dos.q::m),
                  dor.d.fieldOf("when_out_of_range").forGetter(dos.q::n)
               )
               .apply($$0, dos.q::new)
      );
      public static final auj<dos.q> e = dos.a(a);

      @Override
      public double a(dor.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dor.a $$1) {
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
      public dor a(dor.f $$0) {
         return $$0.apply(new dos.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public auj<? extends dor> c() {
         return e;
      }

      public dor j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dor m() {
         return this.i;
      }

      public dor n() {
         return this.j;
      }
   }

   protected static record r(dor.c a) implements dos.u {
      static final auj<dos.r> e = dos.a(dor.c.a, dos.r::new, dos.r::j);

      @Override
      public double a(dor.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dor a(dor.f $$0) {
         return $$0.apply(new dos.r($$0.a(this.a)));
      }

      @Override
      public auj<? extends dor> c() {
         return e;
      }

      @Override
      public dor.c j() {
         return this.a;
      }
   }

   protected static record s(dor.c a) implements dos.u {
      static final auj<dos.s> e = dos.a(dor.c.a, dos.s::new, dos.s::j);

      @Override
      public double a(dor.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dor a(dor.f $$0) {
         return $$0.apply(new dos.s($$0.a(this.a)));
      }

      @Override
      public auj<? extends dor> c() {
         return e;
      }

      @Override
      public dor.c j() {
         return this.a;
      }
   }

   protected static record t(dor.c a) implements dos.u {
      static final auj<dos.t> e = dos.a(dor.c.a, dos.t::new, dos.t::j);

      @Override
      public double a(dor.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dor a(dor.f $$0) {
         return $$0.apply(new dos.t($$0.a(this.a)));
      }

      @Override
      public auj<? extends dor> c() {
         return e;
      }

      @Override
      public dor.c j() {
         return this.a;
      }
   }

   interface u extends dor {
      dor.c j();

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
      default void a(double[] $$0, dor.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dor e, dor f, dor g, double h, double i, dor.c j) implements dor {
      private static final MapCodec<dos.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dor.d.fieldOf("shift_x").forGetter(dos.v::j),
                  dor.d.fieldOf("shift_y").forGetter(dos.v::k),
                  dor.d.fieldOf("shift_z").forGetter(dos.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dos.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dos.v::n),
                  dor.c.a.fieldOf("noise").forGetter(dos.v::o)
               )
               .apply($$0, dos.v::new)
      );
      public static final auj<dos.v> a = dos.a(k);

      @Override
      public double a(dor.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dor.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dor a(dor.f $$0) {
         return $$0.apply(new dos.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public auj<? extends dor> c() {
         return a;
      }

      public dor j() {
         return this.e;
      }

      public dor k() {
         return this.f;
      }

      public dor l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dor.c o() {
         return this.j;
      }
   }

   public static record w(atr<dos.w.b, dos.w.a> e) implements dor {
      private static final Codec<atr<dos.w.b, dos.w.a>> f = atr.a(dos.w.a.b);
      private static final MapCodec<dos.w> g = f.fieldOf("spline").xmap(dos.w::new, dos.w::j);
      public static final auj<dos.w> a = dos.a(g);

      @Override
      public double a(dor.b $$0) {
         return (double)this.e.a(new dos.w.b($$0));
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
      public void a(double[] $$0, dor.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dor a(dor.f $$0) {
         return $$0.apply(new dos.w(this.e.a((atr.d<dos.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public auj<? extends dor> c() {
         return a;
      }

      public atr<dos.w.b, dos.w.a> j() {
         return this.e;
      }

      public static record a(ih<dor> c) implements avr<dos.w.b> {
         public static final Codec<dos.w.a> b = dor.c.xmap(dos.w.a::new, dos.w.a::a);

         @Override
         public String toString() {
            Optional<ahg<dor>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               ahg<dor> $$1 = $$0.get();
               if ($$1 == dpf.d) {
                  return "continents";
               }

               if ($$1 == dpf.e) {
                  return "erosion";
               }

               if ($$1 == dpf.f) {
                  return "weirdness";
               }

               if ($$1 == dpf.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dos.w.b $$0) {
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

         public dos.w.a a(dor.f $$0) {
            return new dos.w.a(new ih.a<>(this.c.a().a($$0)));
         }

         public ih<dor> a() {
            return this.c;
         }
      }

      public static record b(dor.b a) {
      }
   }

   interface x extends dor {
      dor j();

      @Override
      default double a(dor.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dor.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dor.b var1, double var2);
   }

   interface y extends dor {
      Logger a = LogUtils.getLogger();

      static dos.y a(dos.y.a $$0, dor $$1, dor $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dos.y.a.c || $$0 == dos.y.a.d) {
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
         if ($$0 == dos.y.a.b || $$0 == dos.y.a.a) {
            if ($$1 instanceof dos.h $$11) {
               return new dos.n($$0 == dos.y.a.a ? dos.n.a.b : dos.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dos.h $$12) {
               return new dos.n($$0 == dos.y.a.a ? dos.n.a.b : dos.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dos.a($$0, $$1, $$2, $$9, $$10);
      }

      dos.y.a j();

      dor k();

      dor l();

      @Override
      default auj<? extends dor> c() {
         return this.j().e;
      }

      public static enum a implements avl {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final auj<dos.y> e = dos.a((BiFunction<dor, dor, dos.y>)(($$0x, $$1) -> dos.y.a(this, $$0x, $$1)), dos.y::k, dos.y::l);
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

   protected static record z(dor e, dor.c f, dos.z.a g) implements dos.x {
      private static final MapCodec<dos.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dor.d.fieldOf("input").forGetter(dos.z::j),
                  dor.c.a.fieldOf("noise").forGetter(dos.z::k),
                  dos.z.a.c.fieldOf("rarity_value_mapper").forGetter(dos.z::l)
               )
               .apply($$0, dos.z::new)
      );
      public static final auj<dos.z> a = dos.a(h);

      @Override
      public double a(dor.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dor a(dor.f $$0) {
         return $$0.apply(new dos.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public auj<? extends dor> c() {
         return a;
      }

      @Override
      public dor j() {
         return this.e;
      }

      public dor.c k() {
         return this.f;
      }

      public dos.z.a l() {
         return this.g;
      }

      public static enum a implements avl {
         a("type_1", dpf.a::b, 2.0),
         b("type_2", dpf.a::a, 3.0);

         public static final Codec<dos.z.a> c = avl.a(dos.z.a::values);
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
