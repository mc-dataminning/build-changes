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

public class dyx {
   public static final dyx.f a = a(0, false, ehs.b);
   public static final dyx.f b = a(0, true, ehs.b);
   public static final dyx.f c = a(0, true, 6, ehs.b);
   public static final dyx.f d = a(0, true, 30, ehs.b);
   public static final dyx.f e = a(0, false, ehs.a);
   public static final dyx.f f = a(0, true, ehs.a);

   public static dyx.f a(int $$0, boolean $$1, ehs $$2) {
      return new dyx.t($$0, $$1, 0, $$2);
   }

   public static dyx.f a(int $$0, boolean $$1, int $$2, ehs $$3) {
      return new dyx.t($$0, $$1, $$2, $$3);
   }

   public static dyx.f a(dyx.f $$0) {
      return new dyx.n($$0);
   }

   public static dyx.f a(dza $$0, int $$1) {
      return new dyx.aa($$0, $$1, false);
   }

   public static dyx.f b(dza $$0, int $$1) {
      return new dyx.aa($$0, $$1, true);
   }

   public static dyx.f a(int $$0, int $$1) {
      return new dyx.z($$0, $$1, false);
   }

   public static dyx.f b(int $$0, int $$1) {
      return new dyx.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dyx.f a(akj<ddg>... $$0) {
      return a(List.of($$0));
   }

   private static dyx.c a(List<akj<ddg>> $$0) {
      return new dyx.c($$0);
   }

   public static dyx.f a(akj<enm.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dyx.f a(akj<enm.a> $$0, double $$1, double $$2) {
      return new dyx.l($$0, $$1, $$2);
   }

   public static dyx.f a(String $$0, dza $$1, dza $$2) {
      return new dyx.y(new akk($$0), $$1, $$2);
   }

   public static dyx.f a() {
      return dyx.s.a;
   }

   public static dyx.f b() {
      return dyx.h.a;
   }

   public static dyx.f c() {
      return dyx.a.a;
   }

   public static dyx.f d() {
      return dyx.v.a;
   }

   public static dyx.o a(dyx.f $$0, dyx.o $$1) {
      return new dyx.x($$0, $$1);
   }

   public static dyx.o a(dyx.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dyx.q(Arrays.asList($$0));
      }
   }

   public static dyx.o a(dsl $$0) {
      return new dyx.d($$0);
   }

   public static dyx.o e() {
      return dyx.b.a;
   }

   static <A> MapCodec<? extends A> a(jw<MapCodec<? extends A>> $$0, String $$1, axz<? extends A> $$2) {
      return jw.a($$0, $$1, $$2.a());
   }

   static enum a implements dyx.f {
      a;

      static final axz<dyx.a> c = axz.a(MapCodec.unit(a));

      @Override
      public axz<? extends dyx.f> a() {
         return c;
      }

      public dyx.e a(dyx.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dza a, int c, boolean d) implements dyx.f {
      static final axz<dyx.aa> e = axz.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dza.a.fieldOf("anchor").forGetter(dyx.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dyx.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dyx.aa::d)
                  )
                  .apply($$0, dyx.aa::new)
         )
      );

      @Override
      public axz<? extends dyx.f> a() {
         return e;
      }

      public dyx.e a(final dyx.g $$0) {
         class a extends dyx.k {
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

      public dza b() {
         return this.a;
      }
   }

   static enum b implements dyx.o {
      a;

      static final axz<dyx.b> c = axz.a(MapCodec.unit(a));

      @Override
      public axz<? extends dyx.o> a() {
         return c;
      }

      public dyx.u a(dyx.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dyx.f {
      static final axz<dyx.c> a = axz.a(akj.a(lr.aE).listOf().fieldOf("biome_is").xmap(dyx::a, $$0 -> $$0.c));
      private final List<akj<ddg>> c;
      final Predicate<akj<ddg>> d;

      c(List<akj<ddg>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public axz<? extends dyx.f> a() {
         return a;
      }

      public dyx.e a(final dyx.g $$0) {
         class a extends dyx.k {
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
            return $$0 instanceof dyx.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dsl a, dyx.r c) implements dyx.o {
      static final axz<dyx.d> d = axz.a(dsl.b.xmap(dyx.d::new, dyx.d::b).fieldOf("result_state"));

      d(dsl $$0) {
         this($$0, new dyx.r($$0));
      }

      @Override
      public axz<? extends dyx.o> a() {
         return d;
      }

      public dyx.u a(dyx.g $$0) {
         return this.c;
      }

      public dsl b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dyx.g, dyx.e> {
      Codec<dyx.f> b = lq.ab.r().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dyx.f> a(jw<MapCodec<? extends dyx.f>> $$0) {
         dyx.a($$0, "biome", dyx.c.a);
         dyx.a($$0, "noise_threshold", dyx.l.e);
         dyx.a($$0, "vertical_gradient", dyx.y.e);
         dyx.a($$0, "y_above", dyx.aa.e);
         dyx.a($$0, "water", dyx.z.e);
         dyx.a($$0, "temperature", dyx.v.c);
         dyx.a($$0, "steep", dyx.s.c);
         dyx.a($$0, "not", dyx.n.c);
         dyx.a($$0, "hole", dyx.h.c);
         dyx.a($$0, "above_preliminary_surface", dyx.a.c);
         return dyx.a($$0, "stone_depth", dyx.t.f);
      }

      axz<? extends dyx.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dyy e;
      final dyx.e f = new dyx.g.d(this);
      final dyx.e g = new dyx.g.c(this);
      final dyx.e h = new dyx.g.b(this);
      final dyx.e i = new dyx.g.a();
      final dyu j;
      final duh k;
      private final dyk l;
      private final Function<ja, jj<ddg>> m;
      final dzd n;
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
      final ja.a z = new ja.a();
      Supplier<jj<ddg>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dyy $$0, dyu $$1, duh $$2, dyk $$3, Function<ja, jj<ddg>> $$4, jw<ddg> $$5, dzd $$6) {
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
            long $$2 = dbn.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = ayg.a(
               ayg.a(
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

      final class a implements dyx.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dyx.j {
         b(dyx.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dyx.j {
         c(dyx.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            duh $$4 = this.c.k;
            int $$5 = $$4.a(dyg.a.a, $$0, $$2);
            int $$6 = $$4.a(dyg.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dyg.a.a, $$7, $$1);
               int $$10 = $$4.a(dyg.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dyx.k {
         d(dyx.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dyx.f {
      a;

      static final axz<dyx.h> c = axz.a(MapCodec.unit(a));

      @Override
      public axz<? extends dyx.f> a() {
         return c;
      }

      public dyx.e a(dyx.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dyx.e {
      protected final dyx.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dyx.g $$0) {
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

   abstract static class j extends dyx.i {
      protected j(dyx.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dyx.i {
      protected k(dyx.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(akj<enm.a> a, double c, double d) implements dyx.f {
      static final axz<dyx.l> e = axz.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     akj.a(lr.aO).fieldOf("noise").forGetter(dyx.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dyx.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dyx.l::d)
                  )
                  .apply($$0, dyx.l::new)
         )
      );

      @Override
      public axz<? extends dyx.f> a() {
         return e;
      }

      public dyx.e a(final dyx.g $$0) {
         final enm $$1 = $$0.j.a(this.a);

         class a extends dyx.j {
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

      public akj<enm.a> b() {
         return this.a;
      }
   }

   static record m(dyx.e a) implements dyx.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dyx.f a) implements dyx.f {
      static final axz<dyx.n> c = axz.a(dyx.f.b.xmap(dyx.n::new, dyx.n::b).fieldOf("invert"));

      @Override
      public axz<? extends dyx.f> a() {
         return c;
      }

      public dyx.e a(dyx.g $$0) {
         return new dyx.m(this.a.apply($$0));
      }

      public dyx.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dyx.g, dyx.u> {
      Codec<dyx.o> b = lq.ac.r().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dyx.o> a(jw<MapCodec<? extends dyx.o>> $$0) {
         dyx.a($$0, "bandlands", dyx.b.c);
         dyx.a($$0, "block", dyx.d.d);
         dyx.a($$0, "sequence", dyx.q.c);
         return dyx.a($$0, "condition", dyx.x.d);
      }

      axz<? extends dyx.o> a();
   }

   static record p(List<dyx.u> a) implements dyx.u {
      @Nullable
      @Override
      public dsl tryApply(int $$0, int $$1, int $$2) {
         for (dyx.u $$3 : this.a) {
            dsl $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dyx.o> a) implements dyx.o {
      static final axz<dyx.q> c = axz.a(dyx.o.b.listOf().xmap(dyx.q::new, dyx.q::b).fieldOf("sequence"));

      @Override
      public axz<? extends dyx.o> a() {
         return c;
      }

      public dyx.u a(dyx.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dyx.u> $$1 = ImmutableList.builder();

            for (dyx.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dyx.p($$1.build());
         }
      }

      public List<dyx.o> b() {
         return this.a;
      }
   }

   static record r(dsl a) implements dyx.u {
      @Override
      public dsl tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dyx.f {
      a;

      static final axz<dyx.s> c = axz.a(MapCodec.unit(a));

      @Override
      public axz<? extends dyx.f> a() {
         return c;
      }

      public dyx.e a(dyx.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, ehs e) implements dyx.f {
      static final axz<dyx.t> f = axz.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dyx.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dyx.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dyx.t::d),
                     ehs.c.fieldOf("surface_type").forGetter(dyx.t::e)
                  )
                  .apply($$0, dyx.t::new)
         )
      );

      @Override
      public axz<? extends dyx.f> a() {
         return f;
      }

      public dyx.e a(final dyx.g $$0) {
         final boolean $$1 = this.e == ehs.a;

         class a extends dyx.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)ayg.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dsl tryApply(int var1, int var2, int var3);
   }

   static enum v implements dyx.f {
      a;

      static final axz<dyx.v> c = axz.a(MapCodec.unit(a));

      @Override
      public axz<? extends dyx.f> a() {
         return c;
      }

      public dyx.e a(dyx.g $$0) {
         return $$0.f;
      }
   }

   static record w(dyx.e a, dyx.u b) implements dyx.u {
      @Nullable
      @Override
      public dsl tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dyx.f a, dyx.o c) implements dyx.o {
      static final axz<dyx.x> d = axz.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dyx.f.b.fieldOf("if_true").forGetter(dyx.x::b), dyx.o.b.fieldOf("then_run").forGetter(dyx.x::c)).apply($$0, dyx.x::new)
         )
      );

      @Override
      public axz<? extends dyx.o> a() {
         return d;
      }

      public dyx.u a(dyx.g $$0) {
         return new dyx.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dyx.f b() {
         return this.a;
      }
   }

   static record y(akk a, dza c, dza d) implements dyx.f {
      static final axz<dyx.y> e = axz.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     akk.a.fieldOf("random_name").forGetter(dyx.y::b),
                     dza.a.fieldOf("true_at_and_below").forGetter(dyx.y::c),
                     dza.a.fieldOf("false_at_and_above").forGetter(dyx.y::d)
                  )
                  .apply($$0, dyx.y::new)
         )
      );

      @Override
      public axz<? extends dyx.f> a() {
         return e;
      }

      public dyx.e a(final dyx.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dyt $$3 = $$0.j.a(this.b());

         class a extends dyx.k {
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
                  double $$1 = ayg.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  ayo $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public akk b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dyx.f {
      static final axz<dyx.z> e = axz.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dyx.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dyx.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dyx.z::d)
                  )
                  .apply($$0, dyx.z::new)
         )
      );

      @Override
      public axz<? extends dyx.f> a() {
         return e;
      }

      public dyx.e a(final dyx.g $$0) {
         class a extends dyx.k {
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
