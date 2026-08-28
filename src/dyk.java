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

public class dyk {
   public static final dyk.f a = a(0, false, ehe.b);
   public static final dyk.f b = a(0, true, ehe.b);
   public static final dyk.f c = a(0, true, 6, ehe.b);
   public static final dyk.f d = a(0, true, 30, ehe.b);
   public static final dyk.f e = a(0, false, ehe.a);
   public static final dyk.f f = a(0, true, ehe.a);

   public static dyk.f a(int $$0, boolean $$1, ehe $$2) {
      return new dyk.t($$0, $$1, 0, $$2);
   }

   public static dyk.f a(int $$0, boolean $$1, int $$2, ehe $$3) {
      return new dyk.t($$0, $$1, $$2, $$3);
   }

   public static dyk.f a(dyk.f $$0) {
      return new dyk.n($$0);
   }

   public static dyk.f a(dyn $$0, int $$1) {
      return new dyk.aa($$0, $$1, false);
   }

   public static dyk.f b(dyn $$0, int $$1) {
      return new dyk.aa($$0, $$1, true);
   }

   public static dyk.f a(int $$0, int $$1) {
      return new dyk.z($$0, $$1, false);
   }

   public static dyk.f b(int $$0, int $$1) {
      return new dyk.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dyk.f a(ald<dcw>... $$0) {
      return a(List.of($$0));
   }

   private static dyk.c a(List<ald<dcw>> $$0) {
      return new dyk.c($$0);
   }

   public static dyk.f a(ald<emx.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dyk.f a(ald<emx.a> $$0, double $$1, double $$2) {
      return new dyk.l($$0, $$1, $$2);
   }

   public static dyk.f a(String $$0, dyn $$1, dyn $$2) {
      return new dyk.y(new ale($$0), $$1, $$2);
   }

   public static dyk.f a() {
      return dyk.s.a;
   }

   public static dyk.f b() {
      return dyk.h.a;
   }

   public static dyk.f c() {
      return dyk.a.a;
   }

   public static dyk.f d() {
      return dyk.v.a;
   }

   public static dyk.o a(dyk.f $$0, dyk.o $$1) {
      return new dyk.x($$0, $$1);
   }

   public static dyk.o a(dyk.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dyk.q(Arrays.asList($$0));
      }
   }

   public static dyk.o a(dsb $$0) {
      return new dyk.d($$0);
   }

   public static dyk.o e() {
      return dyk.b.a;
   }

   static <A> MapCodec<? extends A> a(jv<MapCodec<? extends A>> $$0, String $$1, ayr<? extends A> $$2) {
      return jv.a($$0, $$1, $$2.a());
   }

   static enum a implements dyk.f {
      a;

      static final ayr<dyk.a> c = ayr.a(MapCodec.unit(a));

      @Override
      public ayr<? extends dyk.f> a() {
         return c;
      }

      public dyk.e a(dyk.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dyn a, int c, boolean d) implements dyk.f {
      static final ayr<dyk.aa> e = ayr.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dyn.a.fieldOf("anchor").forGetter(dyk.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dyk.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dyk.aa::d)
                  )
                  .apply($$0, dyk.aa::new)
         )
      );

      @Override
      public ayr<? extends dyk.f> a() {
         return e;
      }

      public dyk.e a(final dyk.g $$0) {
         class a extends dyk.k {
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

      public dyn b() {
         return this.a;
      }
   }

   static enum b implements dyk.o {
      a;

      static final ayr<dyk.b> c = ayr.a(MapCodec.unit(a));

      @Override
      public ayr<? extends dyk.o> a() {
         return c;
      }

      public dyk.u a(dyk.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dyk.f {
      static final ayr<dyk.c> a = ayr.a(ald.a(lq.az).listOf().fieldOf("biome_is").xmap(dyk::a, $$0 -> $$0.c));
      private final List<ald<dcw>> c;
      final Predicate<ald<dcw>> d;

      c(List<ald<dcw>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public ayr<? extends dyk.f> a() {
         return a;
      }

      public dyk.e a(final dyk.g $$0) {
         class a extends dyk.k {
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
            return $$0 instanceof dyk.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dsb a, dyk.r c) implements dyk.o {
      static final ayr<dyk.d> d = ayr.a(dsb.b.xmap(dyk.d::new, dyk.d::b).fieldOf("result_state"));

      d(dsb $$0) {
         this($$0, new dyk.r($$0));
      }

      @Override
      public ayr<? extends dyk.o> a() {
         return d;
      }

      public dyk.u a(dyk.g $$0) {
         return this.c;
      }

      public dsb b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dyk.g, dyk.e> {
      Codec<dyk.f> b = lp.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dyk.f> a(jv<MapCodec<? extends dyk.f>> $$0) {
         dyk.a($$0, "biome", dyk.c.a);
         dyk.a($$0, "noise_threshold", dyk.l.e);
         dyk.a($$0, "vertical_gradient", dyk.y.e);
         dyk.a($$0, "y_above", dyk.aa.e);
         dyk.a($$0, "water", dyk.z.e);
         dyk.a($$0, "temperature", dyk.v.c);
         dyk.a($$0, "steep", dyk.s.c);
         dyk.a($$0, "not", dyk.n.c);
         dyk.a($$0, "hole", dyk.h.c);
         dyk.a($$0, "above_preliminary_surface", dyk.a.c);
         return dyk.a($$0, "stone_depth", dyk.t.f);
      }

      ayr<? extends dyk.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dyl e;
      final dyk.e f = new dyk.g.d(this);
      final dyk.e g = new dyk.g.c(this);
      final dyk.e h = new dyk.g.b(this);
      final dyk.e i = new dyk.g.a();
      final dyh j;
      final dtx k;
      private final dxx l;
      private final Function<iz, ji<dcw>> m;
      final dyq n;
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
      final iz.a z = new iz.a();
      Supplier<ji<dcw>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dyl $$0, dyh $$1, dtx $$2, dxx $$3, Function<iz, ji<dcw>> $$4, jv<dcw> $$5, dyq $$6) {
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
            long $$2 = dbe.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = ayy.a(
               ayy.a(
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

      final class a implements dyk.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dyk.j {
         b(dyk.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dyk.j {
         c(dyk.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dtx $$4 = this.c.k;
            int $$5 = $$4.a(dxt.a.a, $$0, $$2);
            int $$6 = $$4.a(dxt.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dxt.a.a, $$7, $$1);
               int $$10 = $$4.a(dxt.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dyk.k {
         d(dyk.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dyk.f {
      a;

      static final ayr<dyk.h> c = ayr.a(MapCodec.unit(a));

      @Override
      public ayr<? extends dyk.f> a() {
         return c;
      }

      public dyk.e a(dyk.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dyk.e {
      protected final dyk.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dyk.g $$0) {
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

   abstract static class j extends dyk.i {
      protected j(dyk.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dyk.i {
      protected k(dyk.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(ald<emx.a> a, double c, double d) implements dyk.f {
      static final ayr<dyk.l> e = ayr.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ald.a(lq.aH).fieldOf("noise").forGetter(dyk.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dyk.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dyk.l::d)
                  )
                  .apply($$0, dyk.l::new)
         )
      );

      @Override
      public ayr<? extends dyk.f> a() {
         return e;
      }

      public dyk.e a(final dyk.g $$0) {
         final emx $$1 = $$0.j.a(this.a);

         class a extends dyk.j {
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

      public ald<emx.a> b() {
         return this.a;
      }
   }

   static record m(dyk.e a) implements dyk.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dyk.f a) implements dyk.f {
      static final ayr<dyk.n> c = ayr.a(dyk.f.b.xmap(dyk.n::new, dyk.n::b).fieldOf("invert"));

      @Override
      public ayr<? extends dyk.f> a() {
         return c;
      }

      public dyk.e a(dyk.g $$0) {
         return new dyk.m(this.a.apply($$0));
      }

      public dyk.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dyk.g, dyk.u> {
      Codec<dyk.o> b = lp.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dyk.o> a(jv<MapCodec<? extends dyk.o>> $$0) {
         dyk.a($$0, "bandlands", dyk.b.c);
         dyk.a($$0, "block", dyk.d.d);
         dyk.a($$0, "sequence", dyk.q.c);
         return dyk.a($$0, "condition", dyk.x.d);
      }

      ayr<? extends dyk.o> a();
   }

   static record p(List<dyk.u> a) implements dyk.u {
      @Nullable
      @Override
      public dsb tryApply(int $$0, int $$1, int $$2) {
         for (dyk.u $$3 : this.a) {
            dsb $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dyk.o> a) implements dyk.o {
      static final ayr<dyk.q> c = ayr.a(dyk.o.b.listOf().xmap(dyk.q::new, dyk.q::b).fieldOf("sequence"));

      @Override
      public ayr<? extends dyk.o> a() {
         return c;
      }

      public dyk.u a(dyk.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dyk.u> $$1 = ImmutableList.builder();

            for (dyk.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dyk.p($$1.build());
         }
      }

      public List<dyk.o> b() {
         return this.a;
      }
   }

   static record r(dsb a) implements dyk.u {
      @Override
      public dsb tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dyk.f {
      a;

      static final ayr<dyk.s> c = ayr.a(MapCodec.unit(a));

      @Override
      public ayr<? extends dyk.f> a() {
         return c;
      }

      public dyk.e a(dyk.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, ehe e) implements dyk.f {
      static final ayr<dyk.t> f = ayr.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dyk.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dyk.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dyk.t::d),
                     ehe.c.fieldOf("surface_type").forGetter(dyk.t::e)
                  )
                  .apply($$0, dyk.t::new)
         )
      );

      @Override
      public ayr<? extends dyk.f> a() {
         return f;
      }

      public dyk.e a(final dyk.g $$0) {
         final boolean $$1 = this.e == ehe.a;

         class a extends dyk.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)ayy.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dsb tryApply(int var1, int var2, int var3);
   }

   static enum v implements dyk.f {
      a;

      static final ayr<dyk.v> c = ayr.a(MapCodec.unit(a));

      @Override
      public ayr<? extends dyk.f> a() {
         return c;
      }

      public dyk.e a(dyk.g $$0) {
         return $$0.f;
      }
   }

   static record w(dyk.e a, dyk.u b) implements dyk.u {
      @Nullable
      @Override
      public dsb tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dyk.f a, dyk.o c) implements dyk.o {
      static final ayr<dyk.x> d = ayr.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dyk.f.b.fieldOf("if_true").forGetter(dyk.x::b), dyk.o.b.fieldOf("then_run").forGetter(dyk.x::c)).apply($$0, dyk.x::new)
         )
      );

      @Override
      public ayr<? extends dyk.o> a() {
         return d;
      }

      public dyk.u a(dyk.g $$0) {
         return new dyk.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dyk.f b() {
         return this.a;
      }
   }

   static record y(ale a, dyn c, dyn d) implements dyk.f {
      static final ayr<dyk.y> e = ayr.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ale.a.fieldOf("random_name").forGetter(dyk.y::b),
                     dyn.a.fieldOf("true_at_and_below").forGetter(dyk.y::c),
                     dyn.a.fieldOf("false_at_and_above").forGetter(dyk.y::d)
                  )
                  .apply($$0, dyk.y::new)
         )
      );

      @Override
      public ayr<? extends dyk.f> a() {
         return e;
      }

      public dyk.e a(final dyk.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dyg $$3 = $$0.j.a(this.b());

         class a extends dyk.k {
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
                  double $$1 = ayy.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  azg $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public ale b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dyk.f {
      static final ayr<dyk.z> e = ayr.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dyk.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dyk.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dyk.z::d)
                  )
                  .apply($$0, dyk.z::new)
         )
      );

      @Override
      public ayr<? extends dyk.f> a() {
         return e;
      }

      public dyk.e a(final dyk.g $$0) {
         class a extends dyk.k {
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
