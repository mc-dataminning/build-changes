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

public class dxk {
   public static final dxk.f a = a(0, false, ege.b);
   public static final dxk.f b = a(0, true, ege.b);
   public static final dxk.f c = a(0, true, 6, ege.b);
   public static final dxk.f d = a(0, true, 30, ege.b);
   public static final dxk.f e = a(0, false, ege.a);
   public static final dxk.f f = a(0, true, ege.a);

   public static dxk.f a(int $$0, boolean $$1, ege $$2) {
      return new dxk.t($$0, $$1, 0, $$2);
   }

   public static dxk.f a(int $$0, boolean $$1, int $$2, ege $$3) {
      return new dxk.t($$0, $$1, $$2, $$3);
   }

   public static dxk.f a(dxk.f $$0) {
      return new dxk.n($$0);
   }

   public static dxk.f a(dxn $$0, int $$1) {
      return new dxk.aa($$0, $$1, false);
   }

   public static dxk.f b(dxn $$0, int $$1) {
      return new dxk.aa($$0, $$1, true);
   }

   public static dxk.f a(int $$0, int $$1) {
      return new dxk.z($$0, $$1, false);
   }

   public static dxk.f b(int $$0, int $$1) {
      return new dxk.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dxk.f a(akl<dbw>... $$0) {
      return a(List.of($$0));
   }

   private static dxk.c a(List<akl<dbw>> $$0) {
      return new dxk.c($$0);
   }

   public static dxk.f a(akl<elx.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dxk.f a(akl<elx.a> $$0, double $$1, double $$2) {
      return new dxk.l($$0, $$1, $$2);
   }

   public static dxk.f a(String $$0, dxn $$1, dxn $$2) {
      return new dxk.y(new akm($$0), $$1, $$2);
   }

   public static dxk.f a() {
      return dxk.s.a;
   }

   public static dxk.f b() {
      return dxk.h.a;
   }

   public static dxk.f c() {
      return dxk.a.a;
   }

   public static dxk.f d() {
      return dxk.v.a;
   }

   public static dxk.o a(dxk.f $$0, dxk.o $$1) {
      return new dxk.x($$0, $$1);
   }

   public static dxk.o a(dxk.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dxk.q(Arrays.asList($$0));
      }
   }

   public static dxk.o a(drb $$0) {
      return new dxk.d($$0);
   }

   public static dxk.o e() {
      return dxk.b.a;
   }

   static <A> MapCodec<? extends A> a(jk<MapCodec<? extends A>> $$0, String $$1, axx<? extends A> $$2) {
      return jk.a($$0, $$1, $$2.a());
   }

   static enum a implements dxk.f {
      a;

      static final axx<dxk.a> c = axx.a(MapCodec.unit(a));

      @Override
      public axx<? extends dxk.f> a() {
         return c;
      }

      public dxk.e a(dxk.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dxn a, int c, boolean d) implements dxk.f {
      static final axx<dxk.aa> e = axx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dxn.a.fieldOf("anchor").forGetter(dxk.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dxk.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dxk.aa::d)
                  )
                  .apply($$0, dxk.aa::new)
         )
      );

      @Override
      public axx<? extends dxk.f> a() {
         return e;
      }

      public dxk.e a(final dxk.g $$0) {
         class a extends dxk.k {
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

      public dxn b() {
         return this.a;
      }
   }

   static enum b implements dxk.o {
      a;

      static final axx<dxk.b> c = axx.a(MapCodec.unit(a));

      @Override
      public axx<? extends dxk.o> a() {
         return c;
      }

      public dxk.u a(dxk.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dxk.f {
      static final axx<dxk.c> a = axx.a(akl.a(lf.az).listOf().fieldOf("biome_is").xmap(dxk::a, $$0 -> $$0.c));
      private final List<akl<dbw>> c;
      final Predicate<akl<dbw>> d;

      c(List<akl<dbw>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public axx<? extends dxk.f> a() {
         return a;
      }

      public dxk.e a(final dxk.g $$0) {
         class a extends dxk.k {
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
            return $$0 instanceof dxk.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(drb a, dxk.r c) implements dxk.o {
      static final axx<dxk.d> d = axx.a(drb.b.xmap(dxk.d::new, dxk.d::b).fieldOf("result_state"));

      d(drb $$0) {
         this($$0, new dxk.r($$0));
      }

      @Override
      public axx<? extends dxk.o> a() {
         return d;
      }

      public dxk.u a(dxk.g $$0) {
         return this.c;
      }

      public drb b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dxk.g, dxk.e> {
      Codec<dxk.f> b = le.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dxk.f> a(jk<MapCodec<? extends dxk.f>> $$0) {
         dxk.a($$0, "biome", dxk.c.a);
         dxk.a($$0, "noise_threshold", dxk.l.e);
         dxk.a($$0, "vertical_gradient", dxk.y.e);
         dxk.a($$0, "y_above", dxk.aa.e);
         dxk.a($$0, "water", dxk.z.e);
         dxk.a($$0, "temperature", dxk.v.c);
         dxk.a($$0, "steep", dxk.s.c);
         dxk.a($$0, "not", dxk.n.c);
         dxk.a($$0, "hole", dxk.h.c);
         dxk.a($$0, "above_preliminary_surface", dxk.a.c);
         return dxk.a($$0, "stone_depth", dxk.t.f);
      }

      axx<? extends dxk.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dxl e;
      final dxk.e f = new dxk.g.d(this);
      final dxk.e g = new dxk.g.c(this);
      final dxk.e h = new dxk.g.b(this);
      final dxk.e i = new dxk.g.a();
      final dxh j;
      final dsx k;
      private final dwx l;
      private final Function<io, ix<dbw>> m;
      final dxq n;
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
      final io.a z = new io.a();
      Supplier<ix<dbw>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dxl $$0, dxh $$1, dsx $$2, dwx $$3, Function<io, ix<dbw>> $$4, jk<dbw> $$5, dxq $$6) {
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
            long $$2 = dae.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = ayd.a(
               ayd.a(
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

      final class a implements dxk.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dxk.j {
         b(dxk.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dxk.j {
         c(dxk.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dsx $$4 = this.c.k;
            int $$5 = $$4.a(dwt.a.a, $$0, $$2);
            int $$6 = $$4.a(dwt.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dwt.a.a, $$7, $$1);
               int $$10 = $$4.a(dwt.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dxk.k {
         d(dxk.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dxk.f {
      a;

      static final axx<dxk.h> c = axx.a(MapCodec.unit(a));

      @Override
      public axx<? extends dxk.f> a() {
         return c;
      }

      public dxk.e a(dxk.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dxk.e {
      protected final dxk.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dxk.g $$0) {
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

   abstract static class j extends dxk.i {
      protected j(dxk.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dxk.i {
      protected k(dxk.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(akl<elx.a> a, double c, double d) implements dxk.f {
      static final axx<dxk.l> e = axx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     akl.a(lf.aH).fieldOf("noise").forGetter(dxk.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dxk.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dxk.l::d)
                  )
                  .apply($$0, dxk.l::new)
         )
      );

      @Override
      public axx<? extends dxk.f> a() {
         return e;
      }

      public dxk.e a(final dxk.g $$0) {
         final elx $$1 = $$0.j.a(this.a);

         class a extends dxk.j {
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

      public akl<elx.a> b() {
         return this.a;
      }
   }

   static record m(dxk.e a) implements dxk.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dxk.f a) implements dxk.f {
      static final axx<dxk.n> c = axx.a(dxk.f.b.xmap(dxk.n::new, dxk.n::b).fieldOf("invert"));

      @Override
      public axx<? extends dxk.f> a() {
         return c;
      }

      public dxk.e a(dxk.g $$0) {
         return new dxk.m(this.a.apply($$0));
      }

      public dxk.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dxk.g, dxk.u> {
      Codec<dxk.o> b = le.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dxk.o> a(jk<MapCodec<? extends dxk.o>> $$0) {
         dxk.a($$0, "bandlands", dxk.b.c);
         dxk.a($$0, "block", dxk.d.d);
         dxk.a($$0, "sequence", dxk.q.c);
         return dxk.a($$0, "condition", dxk.x.d);
      }

      axx<? extends dxk.o> a();
   }

   static record p(List<dxk.u> a) implements dxk.u {
      @Nullable
      @Override
      public drb tryApply(int $$0, int $$1, int $$2) {
         for (dxk.u $$3 : this.a) {
            drb $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dxk.o> a) implements dxk.o {
      static final axx<dxk.q> c = axx.a(dxk.o.b.listOf().xmap(dxk.q::new, dxk.q::b).fieldOf("sequence"));

      @Override
      public axx<? extends dxk.o> a() {
         return c;
      }

      public dxk.u a(dxk.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dxk.u> $$1 = ImmutableList.builder();

            for (dxk.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dxk.p($$1.build());
         }
      }

      public List<dxk.o> b() {
         return this.a;
      }
   }

   static record r(drb a) implements dxk.u {
      @Override
      public drb tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dxk.f {
      a;

      static final axx<dxk.s> c = axx.a(MapCodec.unit(a));

      @Override
      public axx<? extends dxk.f> a() {
         return c;
      }

      public dxk.e a(dxk.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, ege e) implements dxk.f {
      static final axx<dxk.t> f = axx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dxk.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dxk.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dxk.t::d),
                     ege.c.fieldOf("surface_type").forGetter(dxk.t::e)
                  )
                  .apply($$0, dxk.t::new)
         )
      );

      @Override
      public axx<? extends dxk.f> a() {
         return f;
      }

      public dxk.e a(final dxk.g $$0) {
         final boolean $$1 = this.e == ege.a;

         class a extends dxk.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)ayd.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      drb tryApply(int var1, int var2, int var3);
   }

   static enum v implements dxk.f {
      a;

      static final axx<dxk.v> c = axx.a(MapCodec.unit(a));

      @Override
      public axx<? extends dxk.f> a() {
         return c;
      }

      public dxk.e a(dxk.g $$0) {
         return $$0.f;
      }
   }

   static record w(dxk.e a, dxk.u b) implements dxk.u {
      @Nullable
      @Override
      public drb tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dxk.f a, dxk.o c) implements dxk.o {
      static final axx<dxk.x> d = axx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dxk.f.b.fieldOf("if_true").forGetter(dxk.x::b), dxk.o.b.fieldOf("then_run").forGetter(dxk.x::c)).apply($$0, dxk.x::new)
         )
      );

      @Override
      public axx<? extends dxk.o> a() {
         return d;
      }

      public dxk.u a(dxk.g $$0) {
         return new dxk.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dxk.f b() {
         return this.a;
      }
   }

   static record y(akm a, dxn c, dxn d) implements dxk.f {
      static final axx<dxk.y> e = axx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     akm.a.fieldOf("random_name").forGetter(dxk.y::b),
                     dxn.a.fieldOf("true_at_and_below").forGetter(dxk.y::c),
                     dxn.a.fieldOf("false_at_and_above").forGetter(dxk.y::d)
                  )
                  .apply($$0, dxk.y::new)
         )
      );

      @Override
      public axx<? extends dxk.f> a() {
         return e;
      }

      public dxk.e a(final dxk.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dxg $$3 = $$0.j.a(this.b());

         class a extends dxk.k {
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
                  double $$1 = ayd.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  ayk $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public akm b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dxk.f {
      static final axx<dxk.z> e = axx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dxk.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dxk.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dxk.z::d)
                  )
                  .apply($$0, dxk.z::new)
         )
      );

      @Override
      public axx<? extends dxk.f> a() {
         return e;
      }

      public dxk.e a(final dxk.g $$0) {
         class a extends dxk.k {
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
