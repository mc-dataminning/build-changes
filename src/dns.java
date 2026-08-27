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

public final class dns {
   private static final Codec<dnr> c = kb.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<dnr> b = Codec.either(d, c)
      .xmap($$0 -> (dnr)$$0.map(dns::a, Function.identity()), $$0 -> $$0 instanceof dns.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends dnr> a(ir<Codec<? extends dnr>> $$0) {
      a($$0, "blend_alpha", dns.d.e);
      a($$0, "blend_offset", dns.f.e);
      a($$0, "beardifier", dns.b.e);
      a($$0, "old_blended_noise", ecz.a);

      for (dns.l.a $$1 : dns.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dns.o.e);
      a($$0, "end_islands", dns.i.a);
      a($$0, "weird_scaled_sampler", dns.z.a);
      a($$0, "shifted_noise", dns.v.a);
      a($$0, "range_choice", dns.q.e);
      a($$0, "shift_a", dns.s.e);
      a($$0, "shift_b", dns.t.e);
      a($$0, "shift", dns.r.e);
      a($$0, "blend_density", dns.e.e);
      a($$0, "clamp", dns.g.a);

      for (dns.k.a $$2 : dns.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dns.y.a $$3 : dns.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dns.w.a);
      a($$0, "constant", dns.h.e);
      return a($$0, "y_clamped_gradient", dns.aa.a);
   }

   private static Codec<? extends dnr> a(ir<Codec<? extends dnr>> $$0, String $$1, ats<? extends dnr> $$2) {
      return ir.a($$0, $$1, $$2.a());
   }

   static <A, O> ats<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return ats.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> ats<O> a(Function<dnr, O> $$0, Function<O, dnr> $$1) {
      return a(dnr.d, $$0, $$1);
   }

   static <O> ats<O> a(BiFunction<dnr, dnr, O> $$0, Function<O, dnr> $$1, Function<O, dnr> $$2) {
      return ats.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(dnr.d.fieldOf("argument1").forGetter($$1), dnr.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> ats<O> a(MapCodec<O> $$0) {
      return ats.a($$0);
   }

   private dns() {
   }

   public static dnr a(dnr $$0) {
      return new dns.l(dns.l.a.a, $$0);
   }

   public static dnr b(dnr $$0) {
      return new dns.l(dns.l.a.b, $$0);
   }

   public static dnr c(dnr $$0) {
      return new dns.l(dns.l.a.c, $$0);
   }

   public static dnr d(dnr $$0) {
      return new dns.l(dns.l.a.d, $$0);
   }

   public static dnr e(dnr $$0) {
      return new dns.l(dns.l.a.e, $$0);
   }

   public static dnr a(ie<edc.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dns.o(new dnr.c($$0), $$1, $$2), $$3, $$4);
   }

   public static dnr a(ie<edc.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static dnr a(ie<edc.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static dnr a(dnr $$0, dnr $$1, double $$2, ie<edc.a> $$3) {
      return new dns.v($$0, a(), $$1, $$2, 0.0, new dnr.c($$3));
   }

   public static dnr a(ie<edc.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static dnr b(ie<edc.a> $$0, double $$1, double $$2) {
      return new dns.o(new dnr.c($$0), $$1, $$2);
   }

   public static dnr a(ie<edc.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static dnr a(dnr $$0, double $$1, double $$2, dnr $$3, dnr $$4) {
      return new dns.q($$0, $$1, $$2, $$3, $$4);
   }

   public static dnr b(ie<edc.a> $$0) {
      return new dns.s(new dnr.c($$0));
   }

   public static dnr c(ie<edc.a> $$0) {
      return new dns.t(new dnr.c($$0));
   }

   public static dnr d(ie<edc.a> $$0) {
      return new dns.r(new dnr.c($$0));
   }

   public static dnr f(dnr $$0) {
      return new dns.e($$0);
   }

   public static dnr a(long $$0) {
      return new dns.i($$0);
   }

   public static dnr a(dnr $$0, ie<edc.a> $$1, dns.z.a $$2) {
      return new dns.z($$0, new dnr.c($$1), $$2);
   }

   public static dnr a(dnr $$0, dnr $$1) {
      return dns.y.a(dns.y.a.a, $$0, $$1);
   }

   public static dnr b(dnr $$0, dnr $$1) {
      return dns.y.a(dns.y.a.b, $$0, $$1);
   }

   public static dnr c(dnr $$0, dnr $$1) {
      return dns.y.a(dns.y.a.c, $$0, $$1);
   }

   public static dnr d(dnr $$0, dnr $$1) {
      return dns.y.a(dns.y.a.d, $$0, $$1);
   }

   public static dnr a(ata<dns.w.b, dns.w.a> $$0) {
      return new dns.w($$0);
   }

   public static dnr a() {
      return dns.h.f;
   }

   public static dnr a(double $$0) {
      return new dns.h($$0);
   }

   public static dnr a(int $$0, int $$1, double $$2, double $$3) {
      return new dns.aa($$0, $$1, $$2, $$3);
   }

   public static dnr a(dnr $$0, dns.k.a $$1) {
      return dns.k.a($$1, $$0);
   }

   private static dnr a(dnr $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static dnr b() {
      return dns.d.a;
   }

   public static dnr c() {
      return dns.f.a;
   }

   public static dnr a(dnr $$0, dnr $$1, dnr $$2) {
      if ($$1 instanceof dns.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         dnr $$4 = d($$0);
         dnr $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static dnr a(dnr $$0, double $$1, dnr $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dns.y.a e, dnr f, dnr g, double h, double i) implements dns.y {
      @Override
      public double a(dnr.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, dnr.a $$1) {
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
      public dnr a(dnr.f $$0) {
         return $$0.apply(dns.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dns.y.a j() {
         return this.e;
      }

      @Override
      public dnr k() {
         return this.f;
      }

      @Override
      public dnr l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements dnr.d {
      private static final MapCodec<dns.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dly.e * 2, dly.d * 2).fieldOf("from_y").forGetter(dns.aa::j),
                  Codec.intRange(dly.e * 2, dly.d * 2).fieldOf("to_y").forGetter(dns.aa::k),
                  dns.d.fieldOf("from_value").forGetter(dns.aa::l),
                  dns.d.fieldOf("to_value").forGetter(dns.aa::m)
               )
               .apply($$0, dns.aa::new)
      );
      public static final ats<dns.aa> a = dns.a(i);

      @Override
      public double a(dnr.b $$0) {
         return aty.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public ats<? extends dnr> c() {
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

   protected static enum b implements dns.c {
      a;

      @Override
      public double a(dnr.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dnr.a $$1) {
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

   public interface c extends dnr.d {
      ats<dnr> e = ats.a(MapCodec.unit(dns.b.a));

      @Override
      default ats<? extends dnr> c() {
         return e;
      }
   }

   protected static enum d implements dnr.d {
      a;

      public static final ats<dnr> e = ats.a(MapCodec.unit(a));

      @Override
      public double a(dnr.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, dnr.a $$1) {
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
      public ats<? extends dnr> c() {
         return e;
      }
   }

   static record e(dnr a) implements dns.x {
      static final ats<dns.e> e = dns.a(dns.e::new, dns.e::j);

      @Override
      public double a(dnr.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public dnr a(dnr.f $$0) {
         return $$0.apply(new dns.e(this.a.a($$0)));
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
      public ats<? extends dnr> c() {
         return e;
      }

      @Override
      public dnr j() {
         return this.a;
      }
   }

   protected static enum f implements dnr.d {
      a;

      public static final ats<dnr> e = ats.a(MapCodec.unit(a));

      @Override
      public double a(dnr.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, dnr.a $$1) {
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
      public ats<? extends dnr> c() {
         return e;
      }
   }

   protected static record g(dnr e, double f, double g) implements dns.p {
      private static final MapCodec<dns.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dnr.b.fieldOf("input").forGetter(dns.g::aC_), dns.d.fieldOf("min").forGetter(dns.g::a), dns.d.fieldOf("max").forGetter(dns.g::b))
               .apply($$0, dns.g::new)
      );
      public static final ats<dns.g> a = dns.a(h);

      @Override
      public double a(double $$0) {
         return aty.a($$0, this.f, this.g);
      }

      @Override
      public dnr a(dnr.f $$0) {
         return new dns.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public ats<? extends dnr> c() {
         return a;
      }

      @Override
      public dnr aC_() {
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

   static record h(double a) implements dnr.d {
      static final ats<dns.h> e = dns.a(dns.d, dns.h::new, dns.h::j);
      static final dns.h f = new dns.h(0.0);

      @Override
      public void a(double[] $$0, dnr.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public ats<? extends dnr> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements dnr.d {
      public static final ats<dns.i> a = ats.a(MapCodec.unit(new dns.i(0L)));
      private static final float e = -0.9F;
      private final edf f;

      public i(long $$0) {
         auf $$1 = new dnz($$0);
         $$1.b(17292);
         this.f = new edf($$1);
      }

      private static float a(edf $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - aty.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = aty.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (aty.e((float)$$10) * 3439.0F + aty.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - aty.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = aty.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(dnr.b $$0) {
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
      public ats<? extends dnr> c() {
         return a;
      }
   }

   @avd
   public static record j(ie<dnr> a) implements dnr {
      @Override
      public double a(dnr.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, dnr.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public dnr a(dnr.f $$0) {
         return $$0.apply(new dns.j(new ie.a<>(this.a.a().a($$0))));
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
      public ats<? extends dnr> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public ie<dnr> j() {
         return this.a;
      }
   }

   protected static record k(dns.k.a a, dnr e, double f, double g) implements dns.p {
      public static dns.k a(dns.k.a $$0, dnr $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dns.k.a.a && $$0 != dns.k.a.b ? new dns.k($$0, $$1, $$3, $$4) : new dns.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dns.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = aty.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dns.k b(dnr.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public ats<? extends dnr> c() {
         return this.a.h;
      }

      public dns.k.a k() {
         return this.a;
      }

      @Override
      public dnr aC_() {
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

      static enum a implements aut {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final ats<dns.k> h = dns.a($$0x -> dns.k.a(this, $$0x), dns.k::aC_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dns.l.a a, dnr e) implements dns.m {
      @Override
      public double a(dnr.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dnr.a $$1) {
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
      public dns.l.a j() {
         return this.a;
      }

      @Override
      public dnr k() {
         return this.e;
      }

      static enum a implements aut {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final ats<dns.m> g = dns.a($$0x -> new dns.l(this, $$0x), dns.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends dnr {
      dns.l.a j();

      dnr k();

      @Override
      default ats<? extends dnr> c() {
         return this.j().g;
      }

      @Override
      default dnr a(dnr.f $$0) {
         return $$0.apply(new dns.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dns.n.a e, dnr f, double g, double h, double i) implements dns.p, dns.y {
      @Override
      public dns.y.a j() {
         return this.e == dns.n.a.a ? dns.y.a.b : dns.y.a.a;
      }

      @Override
      public dnr k() {
         return dns.a(this.i);
      }

      @Override
      public dnr l() {
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
      public dnr a(dnr.f $$0) {
         dnr $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dns.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dns.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dns.n.a m() {
         return this.e;
      }

      @Override
      public dnr aC_() {
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

   protected static record o(dnr.c f, @Deprecated double g, double h) implements dnr {
      public static final MapCodec<dns.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dnr.c.a.fieldOf("noise").forGetter(dns.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dns.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dns.o::l)
               )
               .apply($$0, dns.o::new)
      );
      public static final ats<dns.o> e = dns.a(a);

      @Override
      public double a(dnr.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, dnr.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dnr a(dnr.f $$0) {
         return $$0.apply(new dns.o($$0.a(this.f), this.g, this.h));
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
      public ats<? extends dnr> c() {
         return e;
      }

      public dnr.c j() {
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

   interface p extends dnr {
      dnr aC_();

      @Override
      default double a(dnr.b $$0) {
         return this.a(this.aC_().a($$0));
      }

      @Override
      default void a(double[] $$0, dnr.a $$1) {
         this.aC_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(dnr f, double g, double h, dnr i, dnr j) implements dnr {
      public static final MapCodec<dns.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dnr.d.fieldOf("input").forGetter(dns.q::j),
                  dns.d.fieldOf("min_inclusive").forGetter(dns.q::k),
                  dns.d.fieldOf("max_exclusive").forGetter(dns.q::l),
                  dnr.d.fieldOf("when_in_range").forGetter(dns.q::m),
                  dnr.d.fieldOf("when_out_of_range").forGetter(dns.q::n)
               )
               .apply($$0, dns.q::new)
      );
      public static final ats<dns.q> e = dns.a(a);

      @Override
      public double a(dnr.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, dnr.a $$1) {
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
      public dnr a(dnr.f $$0) {
         return $$0.apply(new dns.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public ats<? extends dnr> c() {
         return e;
      }

      public dnr j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public dnr m() {
         return this.i;
      }

      public dnr n() {
         return this.j;
      }
   }

   protected static record r(dnr.c a) implements dns.u {
      static final ats<dns.r> e = dns.a(dnr.c.a, dns.r::new, dns.r::j);

      @Override
      public double a(dnr.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public dnr a(dnr.f $$0) {
         return $$0.apply(new dns.r($$0.a(this.a)));
      }

      @Override
      public ats<? extends dnr> c() {
         return e;
      }

      @Override
      public dnr.c j() {
         return this.a;
      }
   }

   protected static record s(dnr.c a) implements dns.u {
      static final ats<dns.s> e = dns.a(dnr.c.a, dns.s::new, dns.s::j);

      @Override
      public double a(dnr.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public dnr a(dnr.f $$0) {
         return $$0.apply(new dns.s($$0.a(this.a)));
      }

      @Override
      public ats<? extends dnr> c() {
         return e;
      }

      @Override
      public dnr.c j() {
         return this.a;
      }
   }

   protected static record t(dnr.c a) implements dns.u {
      static final ats<dns.t> e = dns.a(dnr.c.a, dns.t::new, dns.t::j);

      @Override
      public double a(dnr.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public dnr a(dnr.f $$0) {
         return $$0.apply(new dns.t($$0.a(this.a)));
      }

      @Override
      public ats<? extends dnr> c() {
         return e;
      }

      @Override
      public dnr.c j() {
         return this.a;
      }
   }

   interface u extends dnr {
      dnr.c j();

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
      default void a(double[] $$0, dnr.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(dnr e, dnr f, dnr g, double h, double i, dnr.c j) implements dnr {
      private static final MapCodec<dns.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dnr.d.fieldOf("shift_x").forGetter(dns.v::j),
                  dnr.d.fieldOf("shift_y").forGetter(dns.v::k),
                  dnr.d.fieldOf("shift_z").forGetter(dns.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dns.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dns.v::n),
                  dnr.c.a.fieldOf("noise").forGetter(dns.v::o)
               )
               .apply($$0, dns.v::new)
      );
      public static final ats<dns.v> a = dns.a(k);

      @Override
      public double a(dnr.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, dnr.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dnr a(dnr.f $$0) {
         return $$0.apply(new dns.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public ats<? extends dnr> c() {
         return a;
      }

      public dnr j() {
         return this.e;
      }

      public dnr k() {
         return this.f;
      }

      public dnr l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public dnr.c o() {
         return this.j;
      }
   }

   public static record w(ata<dns.w.b, dns.w.a> e) implements dnr {
      private static final Codec<ata<dns.w.b, dns.w.a>> f = ata.a(dns.w.a.b);
      private static final MapCodec<dns.w> g = f.fieldOf("spline").xmap(dns.w::new, dns.w::j);
      public static final ats<dns.w> a = dns.a(g);

      @Override
      public double a(dnr.b $$0) {
         return (double)this.e.a(new dns.w.b($$0));
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
      public void a(double[] $$0, dnr.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dnr a(dnr.f $$0) {
         return $$0.apply(new dns.w(this.e.a((ata.d<dns.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public ats<? extends dnr> c() {
         return a;
      }

      public ata<dns.w.b, dns.w.a> j() {
         return this.e;
      }

      public static record a(ie<dnr> c) implements ava<dns.w.b> {
         public static final Codec<dns.w.a> b = dnr.c.xmap(dns.w.a::new, dns.w.a::a);

         @Override
         public String toString() {
            Optional<ags<dnr>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               ags<dnr> $$1 = $$0.get();
               if ($$1 == dof.d) {
                  return "continents";
               }

               if ($$1 == dof.e) {
                  return "erosion";
               }

               if ($$1 == dof.f) {
                  return "weirdness";
               }

               if ($$1 == dof.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dns.w.b $$0) {
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

         public dns.w.a a(dnr.f $$0) {
            return new dns.w.a(new ie.a<>(this.c.a().a($$0)));
         }

         public ie<dnr> a() {
            return this.c;
         }
      }

      public static record b(dnr.b a) {
      }
   }

   interface x extends dnr {
      dnr j();

      @Override
      default double a(dnr.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, dnr.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(dnr.b var1, double var2);
   }

   interface y extends dnr {
      Logger a = LogUtils.getLogger();

      static dns.y a(dns.y.a $$0, dnr $$1, dnr $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dns.y.a.c || $$0 == dns.y.a.d) {
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
         if ($$0 == dns.y.a.b || $$0 == dns.y.a.a) {
            if ($$1 instanceof dns.h $$11) {
               return new dns.n($$0 == dns.y.a.a ? dns.n.a.b : dns.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dns.h $$12) {
               return new dns.n($$0 == dns.y.a.a ? dns.n.a.b : dns.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dns.a($$0, $$1, $$2, $$9, $$10);
      }

      dns.y.a j();

      dnr k();

      dnr l();

      @Override
      default ats<? extends dnr> c() {
         return this.j().e;
      }

      public static enum a implements aut {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final ats<dns.y> e = dns.a((BiFunction<dnr, dnr, dns.y>)(($$0x, $$1) -> dns.y.a(this, $$0x, $$1)), dns.y::k, dns.y::l);
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

   protected static record z(dnr e, dnr.c f, dns.z.a g) implements dns.x {
      private static final MapCodec<dns.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dnr.d.fieldOf("input").forGetter(dns.z::j),
                  dnr.c.a.fieldOf("noise").forGetter(dns.z::k),
                  dns.z.a.c.fieldOf("rarity_value_mapper").forGetter(dns.z::l)
               )
               .apply($$0, dns.z::new)
      );
      public static final ats<dns.z> a = dns.a(h);

      @Override
      public double a(dnr.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public dnr a(dnr.f $$0) {
         return $$0.apply(new dns.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public ats<? extends dnr> c() {
         return a;
      }

      @Override
      public dnr j() {
         return this.e;
      }

      public dnr.c k() {
         return this.f;
      }

      public dns.z.a l() {
         return this.g;
      }

      public static enum a implements aut {
         a("type_1", dof.a::b, 2.0),
         b("type_2", dof.a::a, 3.0);

         public static final Codec<dns.z.a> c = aut.a(dns.z.a::values);
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
