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

public class dph {
   public static final dph.f a = a(0, false, dyb.b);
   public static final dph.f b = a(0, true, dyb.b);
   public static final dph.f c = a(0, true, 6, dyb.b);
   public static final dph.f d = a(0, true, 30, dyb.b);
   public static final dph.f e = a(0, false, dyb.a);
   public static final dph.f f = a(0, true, dyb.a);

   public static dph.f a(int $$0, boolean $$1, dyb $$2) {
      return new dph.t($$0, $$1, 0, $$2);
   }

   public static dph.f a(int $$0, boolean $$1, int $$2, dyb $$3) {
      return new dph.t($$0, $$1, $$2, $$3);
   }

   public static dph.f a(dph.f $$0) {
      return new dph.n($$0);
   }

   public static dph.f a(dpk $$0, int $$1) {
      return new dph.aa($$0, $$1, false);
   }

   public static dph.f b(dpk $$0, int $$1) {
      return new dph.aa($$0, $$1, true);
   }

   public static dph.f a(int $$0, int $$1) {
      return new dph.z($$0, $$1, false);
   }

   public static dph.f b(int $$0, int $$1) {
      return new dph.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dph.f a(ahf<cuo>... $$0) {
      return a(List.of($$0));
   }

   private static dph.c a(List<ahf<cuo>> $$0) {
      return new dph.c($$0);
   }

   public static dph.f a(ahf<edu.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dph.f a(ahf<edu.a> $$0, double $$1, double $$2) {
      return new dph.l($$0, $$1, $$2);
   }

   public static dph.f a(String $$0, dpk $$1, dpk $$2) {
      return new dph.y(new ahg($$0), $$1, $$2);
   }

   public static dph.f a() {
      return dph.s.a;
   }

   public static dph.f b() {
      return dph.h.a;
   }

   public static dph.f c() {
      return dph.a.a;
   }

   public static dph.f d() {
      return dph.v.a;
   }

   public static dph.o a(dph.f $$0, dph.o $$1) {
      return new dph.x($$0, $$1);
   }

   public static dph.o a(dph.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dph.q(Arrays.asList($$0));
      }
   }

   public static dph.o a(djh $$0) {
      return new dph.d($$0);
   }

   public static dph.o e() {
      return dph.b.a;
   }

   static <A> Codec<? extends A> a(it<Codec<? extends A>> $$0, String $$1, aui<? extends A> $$2) {
      return it.a($$0, $$1, $$2.a());
   }

   static enum a implements dph.f {
      a;

      static final aui<dph.a> c = aui.a(MapCodec.unit(a));

      @Override
      public aui<? extends dph.f> a() {
         return c;
      }

      public dph.e a(dph.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dpk a, int c, boolean d) implements dph.f {
      static final aui<dph.aa> e = aui.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dpk.a.fieldOf("anchor").forGetter(dph.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dph.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dph.aa::d)
                  )
                  .apply($$0, dph.aa::new)
         )
      );

      @Override
      public aui<? extends dph.f> a() {
         return e;
      }

      public dph.e a(final dph.g $$0) {
         class a extends dph.k {
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

      public dpk b() {
         return this.a;
      }
   }

   static enum b implements dph.o {
      a;

      static final aui<dph.b> c = aui.a(MapCodec.unit(a));

      @Override
      public aui<? extends dph.o> a() {
         return c;
      }

      public dph.u a(dph.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dph.f {
      static final aui<dph.c> a = aui.a(ahf.a(ke.at).listOf().fieldOf("biome_is").xmap(dph::a, $$0 -> $$0.c));
      private final List<ahf<cuo>> c;
      final Predicate<ahf<cuo>> d;

      c(List<ahf<cuo>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public aui<? extends dph.f> a() {
         return a;
      }

      public dph.e a(final dph.g $$0) {
         class a extends dph.k {
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
            return $$0 instanceof dph.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(djh a, dph.r c) implements dph.o {
      static final aui<dph.d> d = aui.a(djh.b.xmap(dph.d::new, dph.d::b).fieldOf("result_state"));

      d(djh $$0) {
         this($$0, new dph.r($$0));
      }

      @Override
      public aui<? extends dph.o> a() {
         return d;
      }

      public dph.u a(dph.g $$0) {
         return this.c;
      }

      public djh b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dph.g, dph.e> {
      Codec<dph.f> b = kd.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dph.f> a(it<Codec<? extends dph.f>> $$0) {
         dph.a($$0, "biome", dph.c.a);
         dph.a($$0, "noise_threshold", dph.l.e);
         dph.a($$0, "vertical_gradient", dph.y.e);
         dph.a($$0, "y_above", dph.aa.e);
         dph.a($$0, "water", dph.z.e);
         dph.a($$0, "temperature", dph.v.c);
         dph.a($$0, "steep", dph.s.c);
         dph.a($$0, "not", dph.n.c);
         dph.a($$0, "hole", dph.h.c);
         dph.a($$0, "above_preliminary_surface", dph.a.c);
         return dph.a($$0, "stone_depth", dph.t.f);
      }

      aui<? extends dph.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dpi e;
      final dph.e f = new dph.g.d(this);
      final dph.e g = new dph.g.c(this);
      final dph.e h = new dph.g.b(this);
      final dph.e i = new dph.g.a();
      final dpe j;
      final dld k;
      private final dou l;
      private final Function<hx, ih<cuo>> m;
      final dpn n;
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
      Supplier<ih<cuo>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dpi $$0, dpe $$1, dld $$2, dou $$3, Function<hx, ih<cuo>> $$4, it<cuo> $$5, dpn $$6) {
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
            long $$2 = csw.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = auo.a(
               auo.a(
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

      final class a implements dph.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dph.j {
         b(dph.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dph.j {
         c(dph.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dld $$4 = this.c.k;
            int $$5 = $$4.a(doq.a.a, $$0, $$2);
            int $$6 = $$4.a(doq.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(doq.a.a, $$7, $$1);
               int $$10 = $$4.a(doq.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dph.k {
         d(dph.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dph.f {
      a;

      static final aui<dph.h> c = aui.a(MapCodec.unit(a));

      @Override
      public aui<? extends dph.f> a() {
         return c;
      }

      public dph.e a(dph.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dph.e {
      protected final dph.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dph.g $$0) {
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

   abstract static class j extends dph.i {
      protected j(dph.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dph.i {
      protected k(dph.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(ahf<edu.a> a, double c, double d) implements dph.f {
      static final aui<dph.l> e = aui.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ahf.a(ke.aB).fieldOf("noise").forGetter(dph.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dph.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dph.l::d)
                  )
                  .apply($$0, dph.l::new)
         )
      );

      @Override
      public aui<? extends dph.f> a() {
         return e;
      }

      public dph.e a(final dph.g $$0) {
         final edu $$1 = $$0.j.a(this.a);

         class a extends dph.j {
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

      public ahf<edu.a> b() {
         return this.a;
      }
   }

   static record m(dph.e a) implements dph.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dph.f a) implements dph.f {
      static final aui<dph.n> c = aui.a(dph.f.b.xmap(dph.n::new, dph.n::b).fieldOf("invert"));

      @Override
      public aui<? extends dph.f> a() {
         return c;
      }

      public dph.e a(dph.g $$0) {
         return new dph.m(this.a.apply($$0));
      }

      public dph.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dph.g, dph.u> {
      Codec<dph.o> b = kd.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dph.o> a(it<Codec<? extends dph.o>> $$0) {
         dph.a($$0, "bandlands", dph.b.c);
         dph.a($$0, "block", dph.d.d);
         dph.a($$0, "sequence", dph.q.c);
         return dph.a($$0, "condition", dph.x.d);
      }

      aui<? extends dph.o> a();
   }

   static record p(List<dph.u> a) implements dph.u {
      @Nullable
      @Override
      public djh tryApply(int $$0, int $$1, int $$2) {
         for (dph.u $$3 : this.a) {
            djh $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dph.o> a) implements dph.o {
      static final aui<dph.q> c = aui.a(dph.o.b.listOf().xmap(dph.q::new, dph.q::b).fieldOf("sequence"));

      @Override
      public aui<? extends dph.o> a() {
         return c;
      }

      public dph.u a(dph.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dph.u> $$1 = ImmutableList.builder();

            for (dph.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dph.p($$1.build());
         }
      }

      public List<dph.o> b() {
         return this.a;
      }
   }

   static record r(djh a) implements dph.u {
      @Override
      public djh tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dph.f {
      a;

      static final aui<dph.s> c = aui.a(MapCodec.unit(a));

      @Override
      public aui<? extends dph.f> a() {
         return c;
      }

      public dph.e a(dph.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, dyb e) implements dph.f {
      static final aui<dph.t> f = aui.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dph.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dph.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dph.t::d),
                     dyb.c.fieldOf("surface_type").forGetter(dph.t::e)
                  )
                  .apply($$0, dph.t::new)
         )
      );

      @Override
      public aui<? extends dph.f> a() {
         return f;
      }

      public dph.e a(final dph.g $$0) {
         final boolean $$1 = this.e == dyb.a;

         class a extends dph.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)auo.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      djh tryApply(int var1, int var2, int var3);
   }

   static enum v implements dph.f {
      a;

      static final aui<dph.v> c = aui.a(MapCodec.unit(a));

      @Override
      public aui<? extends dph.f> a() {
         return c;
      }

      public dph.e a(dph.g $$0) {
         return $$0.f;
      }
   }

   static record w(dph.e a, dph.u b) implements dph.u {
      @Nullable
      @Override
      public djh tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dph.f a, dph.o c) implements dph.o {
      static final aui<dph.x> d = aui.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dph.f.b.fieldOf("if_true").forGetter(dph.x::b), dph.o.b.fieldOf("then_run").forGetter(dph.x::c)).apply($$0, dph.x::new)
         )
      );

      @Override
      public aui<? extends dph.o> a() {
         return d;
      }

      public dph.u a(dph.g $$0) {
         return new dph.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dph.f b() {
         return this.a;
      }
   }

   static record y(ahg a, dpk c, dpk d) implements dph.f {
      static final aui<dph.y> e = aui.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ahg.a.fieldOf("random_name").forGetter(dph.y::b),
                     dpk.a.fieldOf("true_at_and_below").forGetter(dph.y::c),
                     dpk.a.fieldOf("false_at_and_above").forGetter(dph.y::d)
                  )
                  .apply($$0, dph.y::new)
         )
      );

      @Override
      public aui<? extends dph.f> a() {
         return e;
      }

      public dph.e a(final dph.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dpd $$3 = $$0.j.a(this.b());

         class a extends dph.k {
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
                  double $$1 = auo.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  auv $$2 = $$3.a(this.c.r, $$0, this.c.s);
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

   static record z(int a, int c, boolean d) implements dph.f {
      static final aui<dph.z> e = aui.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dph.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dph.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dph.z::d)
                  )
                  .apply($$0, dph.z::new)
         )
      );

      @Override
      public aui<? extends dph.f> a() {
         return e;
      }

      public dph.e a(final dph.g $$0) {
         class a extends dph.k {
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
