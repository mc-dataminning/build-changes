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

public class dyw {
   public static final dyw.f a = a(0, false, ehr.b);
   public static final dyw.f b = a(0, true, ehr.b);
   public static final dyw.f c = a(0, true, 6, ehr.b);
   public static final dyw.f d = a(0, true, 30, ehr.b);
   public static final dyw.f e = a(0, false, ehr.a);
   public static final dyw.f f = a(0, true, ehr.a);

   public static dyw.f a(int $$0, boolean $$1, ehr $$2) {
      return new dyw.t($$0, $$1, 0, $$2);
   }

   public static dyw.f a(int $$0, boolean $$1, int $$2, ehr $$3) {
      return new dyw.t($$0, $$1, $$2, $$3);
   }

   public static dyw.f a(dyw.f $$0) {
      return new dyw.n($$0);
   }

   public static dyw.f a(dyz $$0, int $$1) {
      return new dyw.aa($$0, $$1, false);
   }

   public static dyw.f b(dyz $$0, int $$1) {
      return new dyw.aa($$0, $$1, true);
   }

   public static dyw.f a(int $$0, int $$1) {
      return new dyw.z($$0, $$1, false);
   }

   public static dyw.f b(int $$0, int $$1) {
      return new dyw.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dyw.f a(akj<ddf>... $$0) {
      return a(List.of($$0));
   }

   private static dyw.c a(List<akj<ddf>> $$0) {
      return new dyw.c($$0);
   }

   public static dyw.f a(akj<enk.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dyw.f a(akj<enk.a> $$0, double $$1, double $$2) {
      return new dyw.l($$0, $$1, $$2);
   }

   public static dyw.f a(String $$0, dyz $$1, dyz $$2) {
      return new dyw.y(new akk($$0), $$1, $$2);
   }

   public static dyw.f a() {
      return dyw.s.a;
   }

   public static dyw.f b() {
      return dyw.h.a;
   }

   public static dyw.f c() {
      return dyw.a.a;
   }

   public static dyw.f d() {
      return dyw.v.a;
   }

   public static dyw.o a(dyw.f $$0, dyw.o $$1) {
      return new dyw.x($$0, $$1);
   }

   public static dyw.o a(dyw.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dyw.q(Arrays.asList($$0));
      }
   }

   public static dyw.o a(dsk $$0) {
      return new dyw.d($$0);
   }

   public static dyw.o e() {
      return dyw.b.a;
   }

   static <A> MapCodec<? extends A> a(jw<MapCodec<? extends A>> $$0, String $$1, axz<? extends A> $$2) {
      return jw.a($$0, $$1, $$2.a());
   }

   static enum a implements dyw.f {
      a;

      static final axz<dyw.a> c = axz.a(MapCodec.unit(a));

      @Override
      public axz<? extends dyw.f> a() {
         return c;
      }

      public dyw.e a(dyw.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dyz a, int c, boolean d) implements dyw.f {
      static final axz<dyw.aa> e = axz.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dyz.a.fieldOf("anchor").forGetter(dyw.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dyw.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dyw.aa::d)
                  )
                  .apply($$0, dyw.aa::new)
         )
      );

      @Override
      public axz<? extends dyw.f> a() {
         return e;
      }

      public dyw.e a(final dyw.g $$0) {
         class a extends dyw.k {
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

      public dyz b() {
         return this.a;
      }
   }

   static enum b implements dyw.o {
      a;

      static final axz<dyw.b> c = axz.a(MapCodec.unit(a));

      @Override
      public axz<? extends dyw.o> a() {
         return c;
      }

      public dyw.u a(dyw.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dyw.f {
      static final axz<dyw.c> a = axz.a(akj.a(lr.aE).listOf().fieldOf("biome_is").xmap(dyw::a, $$0 -> $$0.c));
      private final List<akj<ddf>> c;
      final Predicate<akj<ddf>> d;

      c(List<akj<ddf>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public axz<? extends dyw.f> a() {
         return a;
      }

      public dyw.e a(final dyw.g $$0) {
         class a extends dyw.k {
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
            return $$0 instanceof dyw.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dsk a, dyw.r c) implements dyw.o {
      static final axz<dyw.d> d = axz.a(dsk.b.xmap(dyw.d::new, dyw.d::b).fieldOf("result_state"));

      d(dsk $$0) {
         this($$0, new dyw.r($$0));
      }

      @Override
      public axz<? extends dyw.o> a() {
         return d;
      }

      public dyw.u a(dyw.g $$0) {
         return this.c;
      }

      public dsk b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dyw.g, dyw.e> {
      Codec<dyw.f> b = lq.ab.r().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dyw.f> a(jw<MapCodec<? extends dyw.f>> $$0) {
         dyw.a($$0, "biome", dyw.c.a);
         dyw.a($$0, "noise_threshold", dyw.l.e);
         dyw.a($$0, "vertical_gradient", dyw.y.e);
         dyw.a($$0, "y_above", dyw.aa.e);
         dyw.a($$0, "water", dyw.z.e);
         dyw.a($$0, "temperature", dyw.v.c);
         dyw.a($$0, "steep", dyw.s.c);
         dyw.a($$0, "not", dyw.n.c);
         dyw.a($$0, "hole", dyw.h.c);
         dyw.a($$0, "above_preliminary_surface", dyw.a.c);
         return dyw.a($$0, "stone_depth", dyw.t.f);
      }

      axz<? extends dyw.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dyx e;
      final dyw.e f = new dyw.g.d(this);
      final dyw.e g = new dyw.g.c(this);
      final dyw.e h = new dyw.g.b(this);
      final dyw.e i = new dyw.g.a();
      final dyt j;
      final dug k;
      private final dyj l;
      private final Function<ja, jj<ddf>> m;
      final dzc n;
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
      Supplier<jj<ddf>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dyx $$0, dyt $$1, dug $$2, dyj $$3, Function<ja, jj<ddf>> $$4, jw<ddf> $$5, dzc $$6) {
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
            long $$2 = dbm.c($$0, $$1);
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

      final class a implements dyw.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dyw.j {
         b(dyw.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dyw.j {
         c(dyw.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dug $$4 = this.c.k;
            int $$5 = $$4.a(dyf.a.a, $$0, $$2);
            int $$6 = $$4.a(dyf.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dyf.a.a, $$7, $$1);
               int $$10 = $$4.a(dyf.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dyw.k {
         d(dyw.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dyw.f {
      a;

      static final axz<dyw.h> c = axz.a(MapCodec.unit(a));

      @Override
      public axz<? extends dyw.f> a() {
         return c;
      }

      public dyw.e a(dyw.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dyw.e {
      protected final dyw.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dyw.g $$0) {
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

   abstract static class j extends dyw.i {
      protected j(dyw.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dyw.i {
      protected k(dyw.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(akj<enk.a> a, double c, double d) implements dyw.f {
      static final axz<dyw.l> e = axz.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     akj.a(lr.aO).fieldOf("noise").forGetter(dyw.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dyw.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dyw.l::d)
                  )
                  .apply($$0, dyw.l::new)
         )
      );

      @Override
      public axz<? extends dyw.f> a() {
         return e;
      }

      public dyw.e a(final dyw.g $$0) {
         final enk $$1 = $$0.j.a(this.a);

         class a extends dyw.j {
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

      public akj<enk.a> b() {
         return this.a;
      }
   }

   static record m(dyw.e a) implements dyw.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dyw.f a) implements dyw.f {
      static final axz<dyw.n> c = axz.a(dyw.f.b.xmap(dyw.n::new, dyw.n::b).fieldOf("invert"));

      @Override
      public axz<? extends dyw.f> a() {
         return c;
      }

      public dyw.e a(dyw.g $$0) {
         return new dyw.m(this.a.apply($$0));
      }

      public dyw.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dyw.g, dyw.u> {
      Codec<dyw.o> b = lq.ac.r().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dyw.o> a(jw<MapCodec<? extends dyw.o>> $$0) {
         dyw.a($$0, "bandlands", dyw.b.c);
         dyw.a($$0, "block", dyw.d.d);
         dyw.a($$0, "sequence", dyw.q.c);
         return dyw.a($$0, "condition", dyw.x.d);
      }

      axz<? extends dyw.o> a();
   }

   static record p(List<dyw.u> a) implements dyw.u {
      @Nullable
      @Override
      public dsk tryApply(int $$0, int $$1, int $$2) {
         for (dyw.u $$3 : this.a) {
            dsk $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dyw.o> a) implements dyw.o {
      static final axz<dyw.q> c = axz.a(dyw.o.b.listOf().xmap(dyw.q::new, dyw.q::b).fieldOf("sequence"));

      @Override
      public axz<? extends dyw.o> a() {
         return c;
      }

      public dyw.u a(dyw.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dyw.u> $$1 = ImmutableList.builder();

            for (dyw.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dyw.p($$1.build());
         }
      }

      public List<dyw.o> b() {
         return this.a;
      }
   }

   static record r(dsk a) implements dyw.u {
      @Override
      public dsk tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dyw.f {
      a;

      static final axz<dyw.s> c = axz.a(MapCodec.unit(a));

      @Override
      public axz<? extends dyw.f> a() {
         return c;
      }

      public dyw.e a(dyw.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, ehr e) implements dyw.f {
      static final axz<dyw.t> f = axz.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dyw.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dyw.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dyw.t::d),
                     ehr.c.fieldOf("surface_type").forGetter(dyw.t::e)
                  )
                  .apply($$0, dyw.t::new)
         )
      );

      @Override
      public axz<? extends dyw.f> a() {
         return f;
      }

      public dyw.e a(final dyw.g $$0) {
         final boolean $$1 = this.e == ehr.a;

         class a extends dyw.k {
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
      dsk tryApply(int var1, int var2, int var3);
   }

   static enum v implements dyw.f {
      a;

      static final axz<dyw.v> c = axz.a(MapCodec.unit(a));

      @Override
      public axz<? extends dyw.f> a() {
         return c;
      }

      public dyw.e a(dyw.g $$0) {
         return $$0.f;
      }
   }

   static record w(dyw.e a, dyw.u b) implements dyw.u {
      @Nullable
      @Override
      public dsk tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dyw.f a, dyw.o c) implements dyw.o {
      static final axz<dyw.x> d = axz.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dyw.f.b.fieldOf("if_true").forGetter(dyw.x::b), dyw.o.b.fieldOf("then_run").forGetter(dyw.x::c)).apply($$0, dyw.x::new)
         )
      );

      @Override
      public axz<? extends dyw.o> a() {
         return d;
      }

      public dyw.u a(dyw.g $$0) {
         return new dyw.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dyw.f b() {
         return this.a;
      }
   }

   static record y(akk a, dyz c, dyz d) implements dyw.f {
      static final axz<dyw.y> e = axz.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     akk.a.fieldOf("random_name").forGetter(dyw.y::b),
                     dyz.a.fieldOf("true_at_and_below").forGetter(dyw.y::c),
                     dyz.a.fieldOf("false_at_and_above").forGetter(dyw.y::d)
                  )
                  .apply($$0, dyw.y::new)
         )
      );

      @Override
      public axz<? extends dyw.f> a() {
         return e;
      }

      public dyw.e a(final dyw.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dys $$3 = $$0.j.a(this.b());

         class a extends dyw.k {
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

   static record z(int a, int c, boolean d) implements dyw.f {
      static final axz<dyw.z> e = axz.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dyw.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dyw.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dyw.z::d)
                  )
                  .apply($$0, dyw.z::new)
         )
      );

      @Override
      public axz<? extends dyw.f> a() {
         return e;
      }

      public dyw.e a(final dyw.g $$0) {
         class a extends dyw.k {
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
