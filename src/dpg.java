import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dpg {
   public static final dpg.f a = a(0, false, dya.b);
   public static final dpg.f b = a(0, true, dya.b);
   public static final dpg.f c = a(0, true, 6, dya.b);
   public static final dpg.f d = a(0, true, 30, dya.b);
   public static final dpg.f e = a(0, false, dya.a);
   public static final dpg.f f = a(0, true, dya.a);

   public static dpg.f a(int $$0, boolean $$1, dya $$2) {
      return new dpg.t($$0, $$1, 0, $$2);
   }

   public static dpg.f a(int $$0, boolean $$1, int $$2, dya $$3) {
      return new dpg.t($$0, $$1, $$2, $$3);
   }

   public static dpg.f a(dpg.f $$0) {
      return new dpg.n($$0);
   }

   public static dpg.f a(dpj $$0, int $$1) {
      return new dpg.aa($$0, $$1, false);
   }

   public static dpg.f b(dpj $$0, int $$1) {
      return new dpg.aa($$0, $$1, true);
   }

   public static dpg.f a(int $$0, int $$1) {
      return new dpg.z($$0, $$1, false);
   }

   public static dpg.f b(int $$0, int $$1) {
      return new dpg.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dpg.f a(ahf<cun>... $$0) {
      return a(List.of($$0));
   }

   private static dpg.c a(List<ahf<cun>> $$0) {
      return new dpg.c($$0);
   }

   public static dpg.f a(ahf<edt.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dpg.f a(ahf<edt.a> $$0, double $$1, double $$2) {
      return new dpg.l($$0, $$1, $$2);
   }

   public static dpg.f a(String $$0, dpj $$1, dpj $$2) {
      return new dpg.y(new ahg($$0), $$1, $$2);
   }

   public static dpg.f a() {
      return dpg.s.a;
   }

   public static dpg.f b() {
      return dpg.h.a;
   }

   public static dpg.f c() {
      return dpg.a.a;
   }

   public static dpg.f d() {
      return dpg.v.a;
   }

   public static dpg.o a(dpg.f $$0, dpg.o $$1) {
      return new dpg.x($$0, $$1);
   }

   public static dpg.o a(dpg.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dpg.q(Arrays.asList($$0));
      }
   }

   public static dpg.o a(djg $$0) {
      return new dpg.d($$0);
   }

   public static dpg.o e() {
      return dpg.b.a;
   }

   static <A> Codec<? extends A> a(it<Codec<? extends A>> $$0, String $$1, auh<? extends A> $$2) {
      return it.a($$0, $$1, $$2.a());
   }

   static enum a implements dpg.f {
      a;

      static final auh<dpg.a> c = auh.a(MapCodec.unit(a));

      @Override
      public auh<? extends dpg.f> a() {
         return c;
      }

      public dpg.e a(dpg.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dpj a, int c, boolean d) implements dpg.f {
      static final auh<dpg.aa> e = auh.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dpj.a.fieldOf("anchor").forGetter(dpg.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dpg.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dpg.aa::d)
                  )
                  .apply($$0, dpg.aa::new)
         )
      );

      @Override
      public auh<? extends dpg.f> a() {
         return e;
      }

      public dpg.e a(final dpg.g $$0) {
         class a extends dpg.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               return this.c.B + (aa.this.d ? this.c.E : 0) >= aa.this.a.a(this.c.n) + this.c.t * aa.this.c;
            }
         }

         return new a();
      }

      public dpj b() {
         return this.a;
      }
   }

   static enum b implements dpg.o {
      a;

      static final auh<dpg.b> c = auh.a(MapCodec.unit(a));

      @Override
      public auh<? extends dpg.o> a() {
         return c;
      }

      public dpg.u a(dpg.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dpg.f {
      static final auh<dpg.c> a = auh.a(ahf.a(ke.at).listOf().fieldOf("biome_is").xmap(dpg::a, $$0 -> $$0.c));
      private final List<ahf<cun>> c;
      final Predicate<ahf<cun>> d;

      c(List<ahf<cun>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public auh<? extends dpg.f> a() {
         return a;
      }

      public dpg.e a(final dpg.g $$0) {
         class a extends dpg.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               return this.c.A.get().a(c.this.d);
            }
         }

         return new a();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof dpg.c $$1 ? this.c.equals($$1.c) : false;
         }
      }

      @Override
      public int hashCode() {
         return this.c.hashCode();
      }

      @Override
      public String toString() {
         return "BiomeConditionSource[biomes=" + this.c + "]";
      }
   }

   static record d(djg a, dpg.r c) implements dpg.o {
      static final auh<dpg.d> d = auh.a(djg.b.xmap(dpg.d::new, dpg.d::b).fieldOf("result_state"));

      d(djg $$0) {
         this($$0, new dpg.r($$0));
      }

      @Override
      public auh<? extends dpg.o> a() {
         return d;
      }

      public dpg.u a(dpg.g $$0) {
         return this.c;
      }

      public djg b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dpg.g, dpg.e> {
      Codec<dpg.f> b = kd.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dpg.f> a(it<Codec<? extends dpg.f>> $$0) {
         dpg.a($$0, "biome", dpg.c.a);
         dpg.a($$0, "noise_threshold", dpg.l.e);
         dpg.a($$0, "vertical_gradient", dpg.y.e);
         dpg.a($$0, "y_above", dpg.aa.e);
         dpg.a($$0, "water", dpg.z.e);
         dpg.a($$0, "temperature", dpg.v.c);
         dpg.a($$0, "steep", dpg.s.c);
         dpg.a($$0, "not", dpg.n.c);
         dpg.a($$0, "hole", dpg.h.c);
         dpg.a($$0, "above_preliminary_surface", dpg.a.c);
         return dpg.a($$0, "stone_depth", dpg.t.f);
      }

      auh<? extends dpg.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dph e;
      final dpg.e f = new dpg.g.d(this);
      final dpg.e g = new dpg.g.c(this);
      final dpg.e h = new dpg.g.b(this);
      final dpg.e i = new dpg.g.a();
      final dpd j;
      final dlc k;
      private final dot l;
      private final Function<hx, ih<cun>> m;
      final dpm n;
      private long o = Long.MAX_VALUE;
      private final int[] p = new int[4];
      long q = -9223372036854775807L;
      int r;
      int s;
      int t;
      private long u = this.q - 1L;
      private double v;
      private long w = this.q - 1L;
      private int x;
      long y = -9223372036854775807L;
      final hx.a z = new hx.a();
      Supplier<ih<cun>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dph $$0, dpd $$1, dlc $$2, dot $$3, Function<hx, ih<cun>> $$4, it<cun> $$5, dpm $$6) {
         this.e = $$0;
         this.j = $$1;
         this.k = $$2;
         this.l = $$3;
         this.m = $$4;
         this.n = $$6;
      }

      protected void a(int $$0, int $$1) {
         this.q++;
         this.y++;
         this.r = $$0;
         this.s = $$1;
         this.t = this.e.a($$0, $$1);
      }

      protected void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
         this.y++;
         this.A = Suppliers.memoize(() -> this.m.apply(this.z.d($$3, $$4, $$5)));
         this.B = $$4;
         this.C = $$2;
         this.D = $$1;
         this.E = $$0;
      }

      protected double a() {
         if (this.u != this.q) {
            this.u = this.q;
            this.v = this.e.b(this.r, this.s);
         }

         return this.v;
      }

      private static int a(int $$0) {
         return $$0 >> 4;
      }

      private static int b(int $$0) {
         return $$0 << 4;
      }

      protected int b() {
         if (this.w != this.q) {
            this.w = this.q;
            int $$0 = a(this.r);
            int $$1 = a(this.s);
            long $$2 = csv.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = aun.a(
               aun.a(
                  (double)((float)(this.r & 15) / 16.0F),
                  (double)((float)(this.s & 15) / 16.0F),
                  (double)this.p[0],
                  (double)this.p[1],
                  (double)this.p[2],
                  (double)this.p[3]
               )
            );
            this.x = $$3 + this.t - 8;
         }

         return this.x;
      }

      final class a implements dpg.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dpg.j {
         b(dpg.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dpg.j {
         c(dpg.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dlc $$4 = this.c.k;
            int $$5 = $$4.a(dop.a.a, $$0, $$2);
            int $$6 = $$4.a(dop.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dop.a.a, $$7, $$1);
               int $$10 = $$4.a(dop.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dpg.k {
         d(dpg.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dpg.f {
      a;

      static final auh<dpg.h> c = auh.a(MapCodec.unit(a));

      @Override
      public auh<? extends dpg.f> a() {
         return c;
      }

      public dpg.e a(dpg.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dpg.e {
      protected final dpg.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dpg.g $$0) {
         this.c = $$0;
         this.a = this.c() - 1L;
      }

      @Override
      public boolean b() {
         long $$0 = this.c();
         if ($$0 == this.a) {
            if (this.d == null) {
               throw new IllegalStateException("Update triggered but the result is null");
            } else {
               return this.d;
            }
         } else {
            this.a = $$0;
            this.d = this.a();
            return this.d;
         }
      }

      protected abstract long c();

      protected abstract boolean a();
   }

   abstract static class j extends dpg.i {
      protected j(dpg.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dpg.i {
      protected k(dpg.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(ahf<edt.a> a, double c, double d) implements dpg.f {
      static final auh<dpg.l> e = auh.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ahf.a(ke.aB).fieldOf("noise").forGetter(dpg.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dpg.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dpg.l::d)
                  )
                  .apply($$0, dpg.l::new)
         )
      );

      @Override
      public auh<? extends dpg.f> a() {
         return e;
      }

      public dpg.e a(final dpg.g $$0) {
         final edt $$1 = $$0.j.a(this.a);

         class a extends dpg.j {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               double $$0 = $$1.a((double)this.c.r, 0.0, (double)this.c.s);
               return $$0 >= l.this.c && $$0 <= l.this.d;
            }
         }

         return new a();
      }

      public ahf<edt.a> b() {
         return this.a;
      }
   }

   static record m(dpg.e a) implements dpg.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dpg.f a) implements dpg.f {
      static final auh<dpg.n> c = auh.a(dpg.f.b.xmap(dpg.n::new, dpg.n::b).fieldOf("invert"));

      @Override
      public auh<? extends dpg.f> a() {
         return c;
      }

      public dpg.e a(dpg.g $$0) {
         return new dpg.m(this.a.apply($$0));
      }

      public dpg.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dpg.g, dpg.u> {
      Codec<dpg.o> b = kd.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dpg.o> a(it<Codec<? extends dpg.o>> $$0) {
         dpg.a($$0, "bandlands", dpg.b.c);
         dpg.a($$0, "block", dpg.d.d);
         dpg.a($$0, "sequence", dpg.q.c);
         return dpg.a($$0, "condition", dpg.x.d);
      }

      auh<? extends dpg.o> a();
   }

   static record p(List<dpg.u> a) implements dpg.u {
      @Nullable
      @Override
      public djg tryApply(int $$0, int $$1, int $$2) {
         for (dpg.u $$3 : this.a) {
            djg $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dpg.o> a) implements dpg.o {
      static final auh<dpg.q> c = auh.a(dpg.o.b.listOf().xmap(dpg.q::new, dpg.q::b).fieldOf("sequence"));

      @Override
      public auh<? extends dpg.o> a() {
         return c;
      }

      public dpg.u a(dpg.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dpg.u> $$1 = ImmutableList.builder();

            for (dpg.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dpg.p($$1.build());
         }
      }

      public List<dpg.o> b() {
         return this.a;
      }
   }

   static record r(djg a) implements dpg.u {
      @Override
      public djg tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dpg.f {
      a;

      static final auh<dpg.s> c = auh.a(MapCodec.unit(a));

      @Override
      public auh<? extends dpg.f> a() {
         return c;
      }

      public dpg.e a(dpg.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, dya e) implements dpg.f {
      static final auh<dpg.t> f = auh.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dpg.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dpg.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dpg.t::d),
                     dya.c.fieldOf("surface_type").forGetter(dpg.t::e)
                  )
                  .apply($$0, dpg.t::new)
         )
      );

      @Override
      public auh<? extends dpg.f> a() {
         return f;
      }

      public dpg.e a(final dpg.g $$0) {
         final boolean $$1 = this.e == dya.a;

         class a extends dpg.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)aun.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
               return $$0 <= 1 + t.this.a + $$1 + $$2;
            }
         }

         return new a();
      }

      public int b() {
         return this.a;
      }
   }

   protected interface u {
      @Nullable
      djg tryApply(int var1, int var2, int var3);
   }

   static enum v implements dpg.f {
      a;

      static final auh<dpg.v> c = auh.a(MapCodec.unit(a));

      @Override
      public auh<? extends dpg.f> a() {
         return c;
      }

      public dpg.e a(dpg.g $$0) {
         return $$0.f;
      }
   }

   static record w(dpg.e a, dpg.u b) implements dpg.u {
      @Nullable
      @Override
      public djg tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dpg.f a, dpg.o c) implements dpg.o {
      static final auh<dpg.x> d = auh.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dpg.f.b.fieldOf("if_true").forGetter(dpg.x::b), dpg.o.b.fieldOf("then_run").forGetter(dpg.x::c)).apply($$0, dpg.x::new)
         )
      );

      @Override
      public auh<? extends dpg.o> a() {
         return d;
      }

      public dpg.u a(dpg.g $$0) {
         return new dpg.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dpg.f b() {
         return this.a;
      }
   }

   static record y(ahg a, dpj c, dpj d) implements dpg.f {
      static final auh<dpg.y> e = auh.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ahg.a.fieldOf("random_name").forGetter(dpg.y::b),
                     dpj.a.fieldOf("true_at_and_below").forGetter(dpg.y::c),
                     dpj.a.fieldOf("false_at_and_above").forGetter(dpg.y::d)
                  )
                  .apply($$0, dpg.y::new)
         )
      );

      @Override
      public auh<? extends dpg.f> a() {
         return e;
      }

      public dpg.e a(final dpg.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dpc $$3 = $$0.j.a(this.b());

         class a extends dpg.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = this.c.B;
               if ($$0 <= $$1) {
                  return true;
               } else if ($$0 >= $$2) {
                  return false;
               } else {
                  double $$1 = aun.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  auu $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public ahg b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dpg.f {
      static final auh<dpg.z> e = auh.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dpg.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dpg.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dpg.z::d)
                  )
                  .apply($$0, dpg.z::new)
         )
      );

      @Override
      public auh<? extends dpg.f> a() {
         return e;
      }

      public dpg.e a(final dpg.g $$0) {
         class a extends dpg.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               return this.c.C == Integer.MIN_VALUE || this.c.B + (z.this.d ? this.c.E : 0) >= this.c.C + z.this.a + this.c.t * z.this.c;
            }
         }

         return new a();
      }

      public int b() {
         return this.a;
      }
   }
}
