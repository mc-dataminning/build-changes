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

public final class dod {
   private static final Codec<doc> c = kd.af.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<doc> b = Codec.either(d, c)
      .xmap($$0 -> (doc)$$0.map(dod::a, Function.identity()), $$0 -> $$0 instanceof dod.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static Codec<? extends doc> a(it<Codec<? extends doc>> $$0) {
      a($$0, "blend_alpha", dod.d.e);
      a($$0, "blend_offset", dod.f.e);
      a($$0, "beardifier", dod.b.e);
      a($$0, "old_blended_noise", edk.a);

      for (dod.l.a $$1 : dod.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", dod.o.e);
      a($$0, "end_islands", dod.i.a);
      a($$0, "weird_scaled_sampler", dod.z.a);
      a($$0, "shifted_noise", dod.v.a);
      a($$0, "range_choice", dod.q.e);
      a($$0, "shift_a", dod.s.e);
      a($$0, "shift_b", dod.t.e);
      a($$0, "shift", dod.r.e);
      a($$0, "blend_density", dod.e.e);
      a($$0, "clamp", dod.g.a);

      for (dod.k.a $$2 : dod.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (dod.y.a $$3 : dod.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", dod.w.a);
      a($$0, "constant", dod.h.e);
      return a($$0, "y_clamped_gradient", dod.aa.a);
   }

   private static Codec<? extends doc> a(it<Codec<? extends doc>> $$0, String $$1, auc<? extends doc> $$2) {
      return it.a($$0, $$1, $$2.a());
   }

   static <A, O> auc<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return auc.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> auc<O> a(Function<doc, O> $$0, Function<O, doc> $$1) {
      return a(doc.d, $$0, $$1);
   }

   static <O> auc<O> a(BiFunction<doc, doc, O> $$0, Function<O, doc> $$1, Function<O, doc> $$2) {
      return auc.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(doc.d.fieldOf("argument1").forGetter($$1), doc.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> auc<O> a(MapCodec<O> $$0) {
      return auc.a($$0);
   }

   private dod() {
   }

   public static doc a(doc $$0) {
      return new dod.l(dod.l.a.a, $$0);
   }

   public static doc b(doc $$0) {
      return new dod.l(dod.l.a.b, $$0);
   }

   public static doc c(doc $$0) {
      return new dod.l(dod.l.a.c, $$0);
   }

   public static doc d(doc $$0) {
      return new dod.l(dod.l.a.d, $$0);
   }

   public static doc e(doc $$0) {
      return new dod.l(dod.l.a.e, $$0);
   }

   public static doc a(ih<edn.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new dod.o(new doc.c($$0), $$1, $$2), $$3, $$4);
   }

   public static doc a(ih<edn.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static doc a(ih<edn.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static doc a(doc $$0, doc $$1, double $$2, ih<edn.a> $$3) {
      return new dod.v($$0, a(), $$1, $$2, 0.0, new doc.c($$3));
   }

   public static doc a(ih<edn.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static doc b(ih<edn.a> $$0, double $$1, double $$2) {
      return new dod.o(new doc.c($$0), $$1, $$2);
   }

   public static doc a(ih<edn.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static doc a(doc $$0, double $$1, double $$2, doc $$3, doc $$4) {
      return new dod.q($$0, $$1, $$2, $$3, $$4);
   }

   public static doc b(ih<edn.a> $$0) {
      return new dod.s(new doc.c($$0));
   }

   public static doc c(ih<edn.a> $$0) {
      return new dod.t(new doc.c($$0));
   }

   public static doc d(ih<edn.a> $$0) {
      return new dod.r(new doc.c($$0));
   }

   public static doc f(doc $$0) {
      return new dod.e($$0);
   }

   public static doc a(long $$0) {
      return new dod.i($$0);
   }

   public static doc a(doc $$0, ih<edn.a> $$1, dod.z.a $$2) {
      return new dod.z($$0, new doc.c($$1), $$2);
   }

   public static doc a(doc $$0, doc $$1) {
      return dod.y.a(dod.y.a.a, $$0, $$1);
   }

   public static doc b(doc $$0, doc $$1) {
      return dod.y.a(dod.y.a.b, $$0, $$1);
   }

   public static doc c(doc $$0, doc $$1) {
      return dod.y.a(dod.y.a.c, $$0, $$1);
   }

   public static doc d(doc $$0, doc $$1) {
      return dod.y.a(dod.y.a.d, $$0, $$1);
   }

   public static doc a(atk<dod.w.b, dod.w.a> $$0) {
      return new dod.w($$0);
   }

   public static doc a() {
      return dod.h.f;
   }

   public static doc a(double $$0) {
      return new dod.h($$0);
   }

   public static doc a(int $$0, int $$1, double $$2, double $$3) {
      return new dod.aa($$0, $$1, $$2, $$3);
   }

   public static doc a(doc $$0, dod.k.a $$1) {
      return dod.k.a($$1, $$0);
   }

   private static doc a(doc $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static doc b() {
      return dod.d.a;
   }

   public static doc c() {
      return dod.f.a;
   }

   public static doc a(doc $$0, doc $$1, doc $$2) {
      if ($$1 instanceof dod.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         doc $$4 = d($$0);
         doc $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static doc a(doc $$0, double $$1, doc $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   static record a(dod.y.a e, doc f, doc g, double h, double i) implements dod.y {
      @Override
      public double a(doc.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
         };
      }

      @Override
      public void a(double[] $$0, doc.a $$1) {
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
      public doc a(doc.f $$0) {
         return $$0.apply(dod.y.a(this.e, this.f.a($$0), this.g.a($$0)));
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
      public dod.y.a j() {
         return this.e;
      }

      @Override
      public doc k() {
         return this.f;
      }

      @Override
      public doc l() {
         return this.g;
      }
   }

   static record aa(int e, int f, double g, double h) implements doc.d {
      private static final MapCodec<dod.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.intRange(dmj.e * 2, dmj.d * 2).fieldOf("from_y").forGetter(dod.aa::j),
                  Codec.intRange(dmj.e * 2, dmj.d * 2).fieldOf("to_y").forGetter(dod.aa::k),
                  dod.d.fieldOf("from_value").forGetter(dod.aa::l),
                  dod.d.fieldOf("to_value").forGetter(dod.aa::m)
               )
               .apply($$0, dod.aa::new)
      );
      public static final auc<dod.aa> a = dod.a(i);

      @Override
      public double a(doc.b $$0) {
         return aui.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
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
      public auc<? extends doc> c() {
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

   protected static enum b implements dod.c {
      a;

      @Override
      public double a(doc.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, doc.a $$1) {
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

   public interface c extends doc.d {
      auc<doc> e = auc.a(MapCodec.unit(dod.b.a));

      @Override
      default auc<? extends doc> c() {
         return e;
      }
   }

   protected static enum d implements doc.d {
      a;

      public static final auc<doc> e = auc.a(MapCodec.unit(a));

      @Override
      public double a(doc.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, doc.a $$1) {
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
      public auc<? extends doc> c() {
         return e;
      }
   }

   static record e(doc a) implements dod.x {
      static final auc<dod.e> e = dod.a(dod.e::new, dod.e::j);

      @Override
      public double a(doc.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public doc a(doc.f $$0) {
         return $$0.apply(new dod.e(this.a.a($$0)));
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
      public auc<? extends doc> c() {
         return e;
      }

      @Override
      public doc j() {
         return this.a;
      }
   }

   protected static enum f implements doc.d {
      a;

      public static final auc<doc> e = auc.a(MapCodec.unit(a));

      @Override
      public double a(doc.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, doc.a $$1) {
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
      public auc<? extends doc> c() {
         return e;
      }
   }

   protected static record g(doc e, double f, double g) implements dod.p {
      private static final MapCodec<dod.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(doc.b.fieldOf("input").forGetter(dod.g::aC_), dod.d.fieldOf("min").forGetter(dod.g::a), dod.d.fieldOf("max").forGetter(dod.g::b))
               .apply($$0, dod.g::new)
      );
      public static final auc<dod.g> a = dod.a(h);

      @Override
      public double a(double $$0) {
         return aui.a($$0, this.f, this.g);
      }

      @Override
      public doc a(doc.f $$0) {
         return new dod.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public auc<? extends doc> c() {
         return a;
      }

      @Override
      public doc aC_() {
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

   static record h(double a) implements doc.d {
      static final auc<dod.h> e = dod.a(dod.d, dod.h::new, dod.h::j);
      static final dod.h f = new dod.h(0.0);

      @Override
      public void a(double[] $$0, doc.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public auc<? extends doc> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements doc.d {
      public static final auc<dod.i> a = auc.a(MapCodec.unit(new dod.i(0L)));
      private static final float e = -0.9F;
      private final edq f;

      public i(long $$0) {
         aup $$1 = new dok($$0);
         $$1.b(17292);
         this.f = new edq($$1);
      }

      private static float a(edq $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - aui.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = aui.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = (long)($$3 + $$8);
               long $$11 = (long)($$4 + $$9);
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a((double)$$10, (double)$$11) < -0.9F) {
                  float $$12 = (aui.e((float)$$10) * 3439.0F + aui.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = (float)($$5 - $$8 * 2);
                  float $$14 = (float)($$6 - $$9 * 2);
                  float $$15 = 100.0F - aui.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = aui.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(doc.b $$0) {
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
      public auc<? extends doc> c() {
         return a;
      }
   }

   @avn
   public static record j(ih<doc> a) implements doc {
      @Override
      public double a(doc.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, doc.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public doc a(doc.f $$0) {
         return $$0.apply(new dod.j(new ih.a<>(this.a.a().a($$0))));
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
      public auc<? extends doc> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public ih<doc> j() {
         return this.a;
      }
   }

   protected static record k(dod.k.a a, doc e, double f, double g) implements dod.p {
      public static dod.k a(dod.k.a $$0, doc $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != dod.k.a.a && $$0 != dod.k.a.b ? new dod.k($$0, $$1, $$3, $$4) : new dod.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(dod.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = aui.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public dod.k b(doc.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public auc<? extends doc> c() {
         return this.a.h;
      }

      public dod.k.a k() {
         return this.a;
      }

      @Override
      public doc aC_() {
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

      static enum a implements ave {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final auc<dod.k> h = dod.a($$0x -> dod.k.a(this, $$0x), dod.k::aC_);

         private a(String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected static record l(dod.l.a a, doc e) implements dod.m {
      @Override
      public double a(doc.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, doc.a $$1) {
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
      public dod.l.a j() {
         return this.a;
      }

      @Override
      public doc k() {
         return this.e;
      }

      static enum a implements ave {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final auc<dod.m> g = dod.a($$0x -> new dod.l(this, $$0x), dod.m::k);

         private a(String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends doc {
      dod.l.a j();

      doc k();

      @Override
      default auc<? extends doc> c() {
         return this.j().g;
      }

      @Override
      default doc a(doc.f $$0) {
         return $$0.apply(new dod.l(this.j(), this.k().a($$0)));
      }
   }

   static record n(dod.n.a e, doc f, double g, double h, double i) implements dod.p, dod.y {
      @Override
      public dod.y.a j() {
         return this.e == dod.n.a.a ? dod.y.a.b : dod.y.a.a;
      }

      @Override
      public doc k() {
         return dod.a(this.i);
      }

      @Override
      public doc l() {
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
      public doc a(doc.f $$0) {
         doc $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == dod.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new dod.n(this.e, $$1, $$4, $$5, this.i);
      }

      public dod.n.a m() {
         return this.e;
      }

      @Override
      public doc aC_() {
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

   protected static record o(doc.c f, @Deprecated double g, double h) implements doc {
      public static final MapCodec<dod.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  doc.c.a.fieldOf("noise").forGetter(dod.o::j),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dod.o::k),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dod.o::l)
               )
               .apply($$0, dod.o::new)
      );
      public static final auc<dod.o> e = dod.a(a);

      @Override
      public double a(doc.b $$0) {
         return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, doc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public doc a(doc.f $$0) {
         return $$0.apply(new dod.o($$0.a(this.f), this.g, this.h));
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
      public auc<? extends doc> c() {
         return e;
      }

      public doc.c j() {
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

   interface p extends doc {
      doc aC_();

      @Override
      default double a(doc.b $$0) {
         return this.a(this.aC_().a($$0));
      }

      @Override
      default void a(double[] $$0, doc.a $$1) {
         this.aC_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   static record q(doc f, double g, double h, doc i, doc j) implements doc {
      public static final MapCodec<dod.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  doc.d.fieldOf("input").forGetter(dod.q::j),
                  dod.d.fieldOf("min_inclusive").forGetter(dod.q::k),
                  dod.d.fieldOf("max_exclusive").forGetter(dod.q::l),
                  doc.d.fieldOf("when_in_range").forGetter(dod.q::m),
                  doc.d.fieldOf("when_out_of_range").forGetter(dod.q::n)
               )
               .apply($$0, dod.q::new)
      );
      public static final auc<dod.q> e = dod.a(a);

      @Override
      public double a(doc.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, doc.a $$1) {
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
      public doc a(doc.f $$0) {
         return $$0.apply(new dod.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
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
      public auc<? extends doc> c() {
         return e;
      }

      public doc j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public doc m() {
         return this.i;
      }

      public doc n() {
         return this.j;
      }
   }

   protected static record r(doc.c a) implements dod.u {
      static final auc<dod.r> e = dod.a(doc.c.a, dod.r::new, dod.r::j);

      @Override
      public double a(doc.b $$0) {
         return this.a((double)$$0.a(), (double)$$0.b(), (double)$$0.c());
      }

      @Override
      public doc a(doc.f $$0) {
         return $$0.apply(new dod.r($$0.a(this.a)));
      }

      @Override
      public auc<? extends doc> c() {
         return e;
      }

      @Override
      public doc.c j() {
         return this.a;
      }
   }

   protected static record s(doc.c a) implements dod.u {
      static final auc<dod.s> e = dod.a(doc.c.a, dod.s::new, dod.s::j);

      @Override
      public double a(doc.b $$0) {
         return this.a((double)$$0.a(), 0.0, (double)$$0.c());
      }

      @Override
      public doc a(doc.f $$0) {
         return $$0.apply(new dod.s($$0.a(this.a)));
      }

      @Override
      public auc<? extends doc> c() {
         return e;
      }

      @Override
      public doc.c j() {
         return this.a;
      }
   }

   protected static record t(doc.c a) implements dod.u {
      static final auc<dod.t> e = dod.a(doc.c.a, dod.t::new, dod.t::j);

      @Override
      public double a(doc.b $$0) {
         return this.a((double)$$0.c(), (double)$$0.a(), 0.0);
      }

      @Override
      public doc a(doc.f $$0) {
         return $$0.apply(new dod.t($$0.a(this.a)));
      }

      @Override
      public auc<? extends doc> c() {
         return e;
      }

      @Override
      public doc.c j() {
         return this.a;
      }
   }

   interface u extends doc {
      doc.c j();

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
      default void a(double[] $$0, doc.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected static record v(doc e, doc f, doc g, double h, double i, doc.c j) implements doc {
      private static final MapCodec<dod.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  doc.d.fieldOf("shift_x").forGetter(dod.v::j),
                  doc.d.fieldOf("shift_y").forGetter(dod.v::k),
                  doc.d.fieldOf("shift_z").forGetter(dod.v::l),
                  Codec.DOUBLE.fieldOf("xz_scale").forGetter(dod.v::m),
                  Codec.DOUBLE.fieldOf("y_scale").forGetter(dod.v::n),
                  doc.c.a.fieldOf("noise").forGetter(dod.v::o)
               )
               .apply($$0, dod.v::new)
      );
      public static final auc<dod.v> a = dod.a(k);

      @Override
      public double a(doc.b $$0) {
         double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
         double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
         double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, doc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public doc a(doc.f $$0) {
         return $$0.apply(new dod.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
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
      public auc<? extends doc> c() {
         return a;
      }

      public doc j() {
         return this.e;
      }

      public doc k() {
         return this.f;
      }

      public doc l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public doc.c o() {
         return this.j;
      }
   }

   public static record w(atk<dod.w.b, dod.w.a> e) implements doc {
      private static final Codec<atk<dod.w.b, dod.w.a>> f = atk.a(dod.w.a.b);
      private static final MapCodec<dod.w> g = f.fieldOf("spline").xmap(dod.w::new, dod.w::j);
      public static final auc<dod.w> a = dod.a(g);

      @Override
      public double a(doc.b $$0) {
         return (double)this.e.a(new dod.w.b($$0));
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
      public void a(double[] $$0, doc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public doc a(doc.f $$0) {
         return $$0.apply(new dod.w(this.e.a((atk.d<dod.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public auc<? extends doc> c() {
         return a;
      }

      public atk<dod.w.b, dod.w.a> j() {
         return this.e;
      }

      public static record a(ih<doc> c) implements avk<dod.w.b> {
         public static final Codec<dod.w.a> b = doc.c.xmap(dod.w.a::new, dod.w.a::a);

         @Override
         public String toString() {
            Optional<ahc<doc>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               ahc<doc> $$1 = $$0.get();
               if ($$1 == doq.d) {
                  return "continents";
               }

               if ($$1 == doq.e) {
                  return "erosion";
               }

               if ($$1 == doq.f) {
                  return "weirdness";
               }

               if ($$1 == doq.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(dod.w.b $$0) {
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

         public dod.w.a a(doc.f $$0) {
            return new dod.w.a(new ih.a<>(this.c.a().a($$0)));
         }

         public ih<doc> a() {
            return this.c;
         }
      }

      public static record b(doc.b a) {
      }
   }

   interface x extends doc {
      doc j();

      @Override
      default double a(doc.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, doc.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(doc.b var1, double var2);
   }

   interface y extends doc {
      Logger a = LogUtils.getLogger();

      static dod.y a(dod.y.a $$0, doc $$1, doc $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == dod.y.a.c || $$0 == dod.y.a.d) {
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
         if ($$0 == dod.y.a.b || $$0 == dod.y.a.a) {
            if ($$1 instanceof dod.h $$11) {
               return new dod.n($$0 == dod.y.a.a ? dod.n.a.b : dod.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof dod.h $$12) {
               return new dod.n($$0 == dod.y.a.a ? dod.n.a.b : dod.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new dod.a($$0, $$1, $$2, $$9, $$10);
      }

      dod.y.a j();

      doc k();

      doc l();

      @Override
      default auc<? extends doc> c() {
         return this.j().e;
      }

      public static enum a implements ave {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final auc<dod.y> e = dod.a((BiFunction<doc, doc, dod.y>)(($$0x, $$1) -> dod.y.a(this, $$0x, $$1)), dod.y::k, dod.y::l);
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

   protected static record z(doc e, doc.c f, dod.z.a g) implements dod.x {
      private static final MapCodec<dod.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  doc.d.fieldOf("input").forGetter(dod.z::j),
                  doc.c.a.fieldOf("noise").forGetter(dod.z::k),
                  dod.z.a.c.fieldOf("rarity_value_mapper").forGetter(dod.z::l)
               )
               .apply($$0, dod.z::new)
      );
      public static final auc<dod.z> a = dod.a(h);

      @Override
      public double a(doc.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
      }

      @Override
      public doc a(doc.f $$0) {
         return $$0.apply(new dod.z(this.e.a($$0), $$0.a(this.f), this.g));
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
      public auc<? extends doc> c() {
         return a;
      }

      @Override
      public doc j() {
         return this.e;
      }

      public doc.c k() {
         return this.f;
      }

      public dod.z.a l() {
         return this.g;
      }

      public static enum a implements ave {
         a("type_1", doq.a::b, 2.0),
         b("type_2", doq.a::a, 3.0);

         public static final Codec<dod.z.a> c = ave.a(dod.z.a::values);
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
