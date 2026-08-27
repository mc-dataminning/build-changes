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

public class dpa {
   public static final dpa.f a = a(0, false, dxu.b);
   public static final dpa.f b = a(0, true, dxu.b);
   public static final dpa.f c = a(0, true, 6, dxu.b);
   public static final dpa.f d = a(0, true, 30, dxu.b);
   public static final dpa.f e = a(0, false, dxu.a);
   public static final dpa.f f = a(0, true, dxu.a);

   public static dpa.f a(int $$0, boolean $$1, dxu $$2) {
      return new dpa.t($$0, $$1, 0, $$2);
   }

   public static dpa.f a(int $$0, boolean $$1, int $$2, dxu $$3) {
      return new dpa.t($$0, $$1, $$2, $$3);
   }

   public static dpa.f a(dpa.f $$0) {
      return new dpa.n($$0);
   }

   public static dpa.f a(dpd $$0, int $$1) {
      return new dpa.aa($$0, $$1, false);
   }

   public static dpa.f b(dpd $$0, int $$1) {
      return new dpa.aa($$0, $$1, true);
   }

   public static dpa.f a(int $$0, int $$1) {
      return new dpa.z($$0, $$1, false);
   }

   public static dpa.f b(int $$0, int $$1) {
      return new dpa.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dpa.f a(ahc<cuh>... $$0) {
      return a(List.of($$0));
   }

   private static dpa.c a(List<ahc<cuh>> $$0) {
      return new dpa.c($$0);
   }

   public static dpa.f a(ahc<edn.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dpa.f a(ahc<edn.a> $$0, double $$1, double $$2) {
      return new dpa.l($$0, $$1, $$2);
   }

   public static dpa.f a(String $$0, dpd $$1, dpd $$2) {
      return new dpa.y(new ahd($$0), $$1, $$2);
   }

   public static dpa.f a() {
      return dpa.s.a;
   }

   public static dpa.f b() {
      return dpa.h.a;
   }

   public static dpa.f c() {
      return dpa.a.a;
   }

   public static dpa.f d() {
      return dpa.v.a;
   }

   public static dpa.o a(dpa.f $$0, dpa.o $$1) {
      return new dpa.x($$0, $$1);
   }

   public static dpa.o a(dpa.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dpa.q(Arrays.asList($$0));
      }
   }

   public static dpa.o a(dja $$0) {
      return new dpa.d($$0);
   }

   public static dpa.o e() {
      return dpa.b.a;
   }

   static <A> Codec<? extends A> a(it<Codec<? extends A>> $$0, String $$1, auc<? extends A> $$2) {
      return it.a($$0, $$1, $$2.a());
   }

   static enum a implements dpa.f {
      a;

      static final auc<dpa.a> c = auc.a(MapCodec.unit(a));

      @Override
      public auc<? extends dpa.f> a() {
         return c;
      }

      public dpa.e a(dpa.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dpd a, int c, boolean d) implements dpa.f {
      static final auc<dpa.aa> e = auc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dpd.a.fieldOf("anchor").forGetter(dpa.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dpa.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dpa.aa::d)
                  )
                  .apply($$0, dpa.aa::new)
         )
      );

      @Override
      public auc<? extends dpa.f> a() {
         return e;
      }

      public dpa.e a(final dpa.g $$0) {
         class a extends dpa.k {
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

      public dpd b() {
         return this.a;
      }
   }

   static enum b implements dpa.o {
      a;

      static final auc<dpa.b> c = auc.a(MapCodec.unit(a));

      @Override
      public auc<? extends dpa.o> a() {
         return c;
      }

      public dpa.u a(dpa.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dpa.f {
      static final auc<dpa.c> a = auc.a(ahc.a(ke.at).listOf().fieldOf("biome_is").xmap(dpa::a, $$0 -> $$0.c));
      private final List<ahc<cuh>> c;
      final Predicate<ahc<cuh>> d;

      c(List<ahc<cuh>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public auc<? extends dpa.f> a() {
         return a;
      }

      public dpa.e a(final dpa.g $$0) {
         class a extends dpa.k {
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
            return $$0 instanceof dpa.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dja a, dpa.r c) implements dpa.o {
      static final auc<dpa.d> d = auc.a(dja.b.xmap(dpa.d::new, dpa.d::b).fieldOf("result_state"));

      d(dja $$0) {
         this($$0, new dpa.r($$0));
      }

      @Override
      public auc<? extends dpa.o> a() {
         return d;
      }

      public dpa.u a(dpa.g $$0) {
         return this.c;
      }

      public dja b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dpa.g, dpa.e> {
      Codec<dpa.f> b = kd.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dpa.f> a(it<Codec<? extends dpa.f>> $$0) {
         dpa.a($$0, "biome", dpa.c.a);
         dpa.a($$0, "noise_threshold", dpa.l.e);
         dpa.a($$0, "vertical_gradient", dpa.y.e);
         dpa.a($$0, "y_above", dpa.aa.e);
         dpa.a($$0, "water", dpa.z.e);
         dpa.a($$0, "temperature", dpa.v.c);
         dpa.a($$0, "steep", dpa.s.c);
         dpa.a($$0, "not", dpa.n.c);
         dpa.a($$0, "hole", dpa.h.c);
         dpa.a($$0, "above_preliminary_surface", dpa.a.c);
         return dpa.a($$0, "stone_depth", dpa.t.f);
      }

      auc<? extends dpa.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dpb e;
      final dpa.e f = new dpa.g.d(this);
      final dpa.e g = new dpa.g.c(this);
      final dpa.e h = new dpa.g.b(this);
      final dpa.e i = new dpa.g.a();
      final dox j;
      final dkw k;
      private final don l;
      private final Function<hx, ih<cuh>> m;
      final dpg n;
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
      Supplier<ih<cuh>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dpb $$0, dox $$1, dkw $$2, don $$3, Function<hx, ih<cuh>> $$4, it<cuh> $$5, dpg $$6) {
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
            long $$2 = csp.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = aui.a(
               aui.a(
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

      final class a implements dpa.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dpa.j {
         b(dpa.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dpa.j {
         c(dpa.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dkw $$4 = this.c.k;
            int $$5 = $$4.a(doj.a.a, $$0, $$2);
            int $$6 = $$4.a(doj.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(doj.a.a, $$7, $$1);
               int $$10 = $$4.a(doj.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dpa.k {
         d(dpa.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dpa.f {
      a;

      static final auc<dpa.h> c = auc.a(MapCodec.unit(a));

      @Override
      public auc<? extends dpa.f> a() {
         return c;
      }

      public dpa.e a(dpa.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dpa.e {
      protected final dpa.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dpa.g $$0) {
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

   abstract static class j extends dpa.i {
      protected j(dpa.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dpa.i {
      protected k(dpa.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(ahc<edn.a> a, double c, double d) implements dpa.f {
      static final auc<dpa.l> e = auc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ahc.a(ke.aB).fieldOf("noise").forGetter(dpa.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dpa.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dpa.l::d)
                  )
                  .apply($$0, dpa.l::new)
         )
      );

      @Override
      public auc<? extends dpa.f> a() {
         return e;
      }

      public dpa.e a(final dpa.g $$0) {
         final edn $$1 = $$0.j.a(this.a);

         class a extends dpa.j {
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

      public ahc<edn.a> b() {
         return this.a;
      }
   }

   static record m(dpa.e a) implements dpa.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dpa.f a) implements dpa.f {
      static final auc<dpa.n> c = auc.a(dpa.f.b.xmap(dpa.n::new, dpa.n::b).fieldOf("invert"));

      @Override
      public auc<? extends dpa.f> a() {
         return c;
      }

      public dpa.e a(dpa.g $$0) {
         return new dpa.m(this.a.apply($$0));
      }

      public dpa.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dpa.g, dpa.u> {
      Codec<dpa.o> b = kd.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dpa.o> a(it<Codec<? extends dpa.o>> $$0) {
         dpa.a($$0, "bandlands", dpa.b.c);
         dpa.a($$0, "block", dpa.d.d);
         dpa.a($$0, "sequence", dpa.q.c);
         return dpa.a($$0, "condition", dpa.x.d);
      }

      auc<? extends dpa.o> a();
   }

   static record p(List<dpa.u> a) implements dpa.u {
      @Nullable
      @Override
      public dja tryApply(int $$0, int $$1, int $$2) {
         for (dpa.u $$3 : this.a) {
            dja $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dpa.o> a) implements dpa.o {
      static final auc<dpa.q> c = auc.a(dpa.o.b.listOf().xmap(dpa.q::new, dpa.q::b).fieldOf("sequence"));

      @Override
      public auc<? extends dpa.o> a() {
         return c;
      }

      public dpa.u a(dpa.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dpa.u> $$1 = ImmutableList.builder();

            for (dpa.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dpa.p($$1.build());
         }
      }

      public List<dpa.o> b() {
         return this.a;
      }
   }

   static record r(dja a) implements dpa.u {
      @Override
      public dja tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dpa.f {
      a;

      static final auc<dpa.s> c = auc.a(MapCodec.unit(a));

      @Override
      public auc<? extends dpa.f> a() {
         return c;
      }

      public dpa.e a(dpa.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, dxu e) implements dpa.f {
      static final auc<dpa.t> f = auc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dpa.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dpa.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dpa.t::d),
                     dxu.c.fieldOf("surface_type").forGetter(dpa.t::e)
                  )
                  .apply($$0, dpa.t::new)
         )
      );

      @Override
      public auc<? extends dpa.f> a() {
         return f;
      }

      public dpa.e a(final dpa.g $$0) {
         final boolean $$1 = this.e == dxu.a;

         class a extends dpa.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)aui.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dja tryApply(int var1, int var2, int var3);
   }

   static enum v implements dpa.f {
      a;

      static final auc<dpa.v> c = auc.a(MapCodec.unit(a));

      @Override
      public auc<? extends dpa.f> a() {
         return c;
      }

      public dpa.e a(dpa.g $$0) {
         return $$0.f;
      }
   }

   static record w(dpa.e a, dpa.u b) implements dpa.u {
      @Nullable
      @Override
      public dja tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dpa.f a, dpa.o c) implements dpa.o {
      static final auc<dpa.x> d = auc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dpa.f.b.fieldOf("if_true").forGetter(dpa.x::b), dpa.o.b.fieldOf("then_run").forGetter(dpa.x::c)).apply($$0, dpa.x::new)
         )
      );

      @Override
      public auc<? extends dpa.o> a() {
         return d;
      }

      public dpa.u a(dpa.g $$0) {
         return new dpa.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dpa.f b() {
         return this.a;
      }
   }

   static record y(ahd a, dpd c, dpd d) implements dpa.f {
      static final auc<dpa.y> e = auc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ahd.a.fieldOf("random_name").forGetter(dpa.y::b),
                     dpd.a.fieldOf("true_at_and_below").forGetter(dpa.y::c),
                     dpd.a.fieldOf("false_at_and_above").forGetter(dpa.y::d)
                  )
                  .apply($$0, dpa.y::new)
         )
      );

      @Override
      public auc<? extends dpa.f> a() {
         return e;
      }

      public dpa.e a(final dpa.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dow $$3 = $$0.j.a(this.b());

         class a extends dpa.k {
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
                  double $$1 = aui.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  aup $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public ahd b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dpa.f {
      static final auc<dpa.z> e = auc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dpa.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dpa.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dpa.z::d)
                  )
                  .apply($$0, dpa.z::new)
         )
      );

      @Override
      public auc<? extends dpa.f> a() {
         return e;
      }

      public dpa.e a(final dpa.g $$0) {
         class a extends dpa.k {
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
