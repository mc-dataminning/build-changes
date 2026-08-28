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

public class dzp {
   public static final dzp.f a = a(0, false, eil.b);
   public static final dzp.f b = a(0, true, eil.b);
   public static final dzp.f c = a(0, true, 6, eil.b);
   public static final dzp.f d = a(0, true, 30, eil.b);
   public static final dzp.f e = a(0, false, eil.a);
   public static final dzp.f f = a(0, true, eil.a);

   public static dzp.f a(int $$0, boolean $$1, eil $$2) {
      return new dzp.t($$0, $$1, 0, $$2);
   }

   public static dzp.f a(int $$0, boolean $$1, int $$2, eil $$3) {
      return new dzp.t($$0, $$1, $$2, $$3);
   }

   public static dzp.f a(dzp.f $$0) {
      return new dzp.n($$0);
   }

   public static dzp.f a(dzs $$0, int $$1) {
      return new dzp.aa($$0, $$1, false);
   }

   public static dzp.f b(dzs $$0, int $$1) {
      return new dzp.aa($$0, $$1, true);
   }

   public static dzp.f a(int $$0, int $$1) {
      return new dzp.z($$0, $$1, false);
   }

   public static dzp.f b(int $$0, int $$1) {
      return new dzp.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dzp.f a(akq<ddw>... $$0) {
      return a(List.of($$0));
   }

   private static dzp.c a(List<akq<ddw>> $$0) {
      return new dzp.c($$0);
   }

   public static dzp.f a(akq<eoh.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dzp.f a(akq<eoh.a> $$0, double $$1, double $$2) {
      return new dzp.l($$0, $$1, $$2);
   }

   public static dzp.f a(String $$0, dzs $$1, dzs $$2) {
      return new dzp.y(akr.a($$0), $$1, $$2);
   }

   public static dzp.f a() {
      return dzp.s.a;
   }

   public static dzp.f b() {
      return dzp.h.a;
   }

   public static dzp.f c() {
      return dzp.a.a;
   }

   public static dzp.f d() {
      return dzp.v.a;
   }

   public static dzp.o a(dzp.f $$0, dzp.o $$1) {
      return new dzp.x($$0, $$1);
   }

   public static dzp.o a(dzp.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dzp.q(Arrays.asList($$0));
      }
   }

   public static dzp.o a(dtc $$0) {
      return new dzp.d($$0);
   }

   public static dzp.o e() {
      return dzp.b.a;
   }

   static <A> MapCodec<? extends A> a(jz<MapCodec<? extends A>> $$0, String $$1, ayh<? extends A> $$2) {
      return jz.a($$0, $$1, $$2.a());
   }

   static enum a implements dzp.f {
      a;

      static final ayh<dzp.a> c = ayh.a(MapCodec.unit(a));

      @Override
      public ayh<? extends dzp.f> a() {
         return c;
      }

      public dzp.e a(dzp.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dzs a, int c, boolean d) implements dzp.f {
      static final ayh<dzp.aa> e = ayh.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dzs.a.fieldOf("anchor").forGetter(dzp.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dzp.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dzp.aa::d)
                  )
                  .apply($$0, dzp.aa::new)
         )
      );

      @Override
      public ayh<? extends dzp.f> a() {
         return e;
      }

      public dzp.e a(final dzp.g $$0) {
         class a extends dzp.k {
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

      public dzs b() {
         return this.a;
      }
   }

   static enum b implements dzp.o {
      a;

      static final ayh<dzp.b> c = ayh.a(MapCodec.unit(a));

      @Override
      public ayh<? extends dzp.o> a() {
         return c;
      }

      public dzp.u a(dzp.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dzp.f {
      static final ayh<dzp.c> a = ayh.a(akq.a(lu.aF).listOf().fieldOf("biome_is").xmap(dzp::a, $$0 -> $$0.c));
      private final List<akq<ddw>> c;
      final Predicate<akq<ddw>> d;

      c(List<akq<ddw>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public ayh<? extends dzp.f> a() {
         return a;
      }

      public dzp.e a(final dzp.g $$0) {
         class a extends dzp.k {
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
            return $$0 instanceof dzp.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dtc a, dzp.r c) implements dzp.o {
      static final ayh<dzp.d> d = ayh.a(dtc.b.xmap(dzp.d::new, dzp.d::b).fieldOf("result_state"));

      d(dtc $$0) {
         this($$0, new dzp.r($$0));
      }

      @Override
      public ayh<? extends dzp.o> a() {
         return d;
      }

      public dzp.u a(dzp.g $$0) {
         return this.c;
      }

      public dtc b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dzp.g, dzp.e> {
      Codec<dzp.f> b = lt.ab.r().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dzp.f> a(jz<MapCodec<? extends dzp.f>> $$0) {
         dzp.a($$0, "biome", dzp.c.a);
         dzp.a($$0, "noise_threshold", dzp.l.e);
         dzp.a($$0, "vertical_gradient", dzp.y.e);
         dzp.a($$0, "y_above", dzp.aa.e);
         dzp.a($$0, "water", dzp.z.e);
         dzp.a($$0, "temperature", dzp.v.c);
         dzp.a($$0, "steep", dzp.s.c);
         dzp.a($$0, "not", dzp.n.c);
         dzp.a($$0, "hole", dzp.h.c);
         dzp.a($$0, "above_preliminary_surface", dzp.a.c);
         return dzp.a($$0, "stone_depth", dzp.t.f);
      }

      ayh<? extends dzp.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dzq e;
      final dzp.e f = new dzp.g.d(this);
      final dzp.e g = new dzp.g.c(this);
      final dzp.e h = new dzp.g.b(this);
      final dzp.e i = new dzp.g.a();
      final dzm j;
      final duy k;
      private final dzc l;
      private final Function<jd, jm<ddw>> m;
      final dzv n;
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
      final jd.a z = new jd.a();
      Supplier<jm<ddw>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dzq $$0, dzm $$1, duy $$2, dzc $$3, Function<jd, jm<ddw>> $$4, jz<ddw> $$5, dzv $$6) {
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
            long $$2 = dcd.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = ayo.a(
               ayo.a(
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

      final class a implements dzp.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dzp.j {
         b(dzp.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dzp.j {
         c(dzp.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            duy $$4 = this.c.k;
            int $$5 = $$4.a(dyy.a.a, $$0, $$2);
            int $$6 = $$4.a(dyy.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dyy.a.a, $$7, $$1);
               int $$10 = $$4.a(dyy.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dzp.k {
         d(dzp.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dzp.f {
      a;

      static final ayh<dzp.h> c = ayh.a(MapCodec.unit(a));

      @Override
      public ayh<? extends dzp.f> a() {
         return c;
      }

      public dzp.e a(dzp.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dzp.e {
      protected final dzp.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dzp.g $$0) {
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

   abstract static class j extends dzp.i {
      protected j(dzp.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dzp.i {
      protected k(dzp.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(akq<eoh.a> a, double c, double d) implements dzp.f {
      static final ayh<dzp.l> e = ayh.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     akq.a(lu.aP).fieldOf("noise").forGetter(dzp.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dzp.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dzp.l::d)
                  )
                  .apply($$0, dzp.l::new)
         )
      );

      @Override
      public ayh<? extends dzp.f> a() {
         return e;
      }

      public dzp.e a(final dzp.g $$0) {
         final eoh $$1 = $$0.j.a(this.a);

         class a extends dzp.j {
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

      public akq<eoh.a> b() {
         return this.a;
      }
   }

   static record m(dzp.e a) implements dzp.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dzp.f a) implements dzp.f {
      static final ayh<dzp.n> c = ayh.a(dzp.f.b.xmap(dzp.n::new, dzp.n::b).fieldOf("invert"));

      @Override
      public ayh<? extends dzp.f> a() {
         return c;
      }

      public dzp.e a(dzp.g $$0) {
         return new dzp.m(this.a.apply($$0));
      }

      public dzp.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dzp.g, dzp.u> {
      Codec<dzp.o> b = lt.ac.r().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dzp.o> a(jz<MapCodec<? extends dzp.o>> $$0) {
         dzp.a($$0, "bandlands", dzp.b.c);
         dzp.a($$0, "block", dzp.d.d);
         dzp.a($$0, "sequence", dzp.q.c);
         return dzp.a($$0, "condition", dzp.x.d);
      }

      ayh<? extends dzp.o> a();
   }

   static record p(List<dzp.u> a) implements dzp.u {
      @Nullable
      @Override
      public dtc tryApply(int $$0, int $$1, int $$2) {
         for (dzp.u $$3 : this.a) {
            dtc $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dzp.o> a) implements dzp.o {
      static final ayh<dzp.q> c = ayh.a(dzp.o.b.listOf().xmap(dzp.q::new, dzp.q::b).fieldOf("sequence"));

      @Override
      public ayh<? extends dzp.o> a() {
         return c;
      }

      public dzp.u a(dzp.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dzp.u> $$1 = ImmutableList.builder();

            for (dzp.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dzp.p($$1.build());
         }
      }

      public List<dzp.o> b() {
         return this.a;
      }
   }

   static record r(dtc a) implements dzp.u {
      @Override
      public dtc tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dzp.f {
      a;

      static final ayh<dzp.s> c = ayh.a(MapCodec.unit(a));

      @Override
      public ayh<? extends dzp.f> a() {
         return c;
      }

      public dzp.e a(dzp.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, eil e) implements dzp.f {
      static final ayh<dzp.t> f = ayh.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dzp.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dzp.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dzp.t::d),
                     eil.c.fieldOf("surface_type").forGetter(dzp.t::e)
                  )
                  .apply($$0, dzp.t::new)
         )
      );

      @Override
      public ayh<? extends dzp.f> a() {
         return f;
      }

      public dzp.e a(final dzp.g $$0) {
         final boolean $$1 = this.e == eil.a;

         class a extends dzp.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)ayo.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dtc tryApply(int var1, int var2, int var3);
   }

   static enum v implements dzp.f {
      a;

      static final ayh<dzp.v> c = ayh.a(MapCodec.unit(a));

      @Override
      public ayh<? extends dzp.f> a() {
         return c;
      }

      public dzp.e a(dzp.g $$0) {
         return $$0.f;
      }
   }

   static record w(dzp.e a, dzp.u b) implements dzp.u {
      @Nullable
      @Override
      public dtc tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dzp.f a, dzp.o c) implements dzp.o {
      static final ayh<dzp.x> d = ayh.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dzp.f.b.fieldOf("if_true").forGetter(dzp.x::b), dzp.o.b.fieldOf("then_run").forGetter(dzp.x::c)).apply($$0, dzp.x::new)
         )
      );

      @Override
      public ayh<? extends dzp.o> a() {
         return d;
      }

      public dzp.u a(dzp.g $$0) {
         return new dzp.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dzp.f b() {
         return this.a;
      }
   }

   static record y(akr a, dzs c, dzs d) implements dzp.f {
      static final ayh<dzp.y> e = ayh.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     akr.a.fieldOf("random_name").forGetter(dzp.y::b),
                     dzs.a.fieldOf("true_at_and_below").forGetter(dzp.y::c),
                     dzs.a.fieldOf("false_at_and_above").forGetter(dzp.y::d)
                  )
                  .apply($$0, dzp.y::new)
         )
      );

      @Override
      public ayh<? extends dzp.f> a() {
         return e;
      }

      public dzp.e a(final dzp.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dzl $$3 = $$0.j.a(this.b());

         class a extends dzp.k {
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
                  double $$1 = ayo.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  ayw $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public akr b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dzp.f {
      static final ayh<dzp.z> e = ayh.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dzp.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dzp.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dzp.z::d)
                  )
                  .apply($$0, dzp.z::new)
         )
      );

      @Override
      public ayh<? extends dzp.f> a() {
         return e;
      }

      public dzp.e a(final dzp.g $$0) {
         class a extends dzp.k {
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
