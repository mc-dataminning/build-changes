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

public class dzl {
   public static final dzl.f a = a(0, false, ein.b);
   public static final dzl.f b = a(0, true, ein.b);
   public static final dzl.f c = a(0, true, 6, ein.b);
   public static final dzl.f d = a(0, true, 30, ein.b);
   public static final dzl.f e = a(0, false, ein.a);
   public static final dzl.f f = a(0, true, ein.a);

   public static dzl.f a(int $$0, boolean $$1, ein $$2) {
      return new dzl.t($$0, $$1, 0, $$2);
   }

   public static dzl.f a(int $$0, boolean $$1, int $$2, ein $$3) {
      return new dzl.t($$0, $$1, $$2, $$3);
   }

   public static dzl.f a(dzl.f $$0) {
      return new dzl.n($$0);
   }

   public static dzl.f a(dzo $$0, int $$1) {
      return new dzl.aa($$0, $$1, false);
   }

   public static dzl.f b(dzo $$0, int $$1) {
      return new dzl.aa($$0, $$1, true);
   }

   public static dzl.f a(int $$0, int $$1) {
      return new dzl.z($$0, $$1, false);
   }

   public static dzl.f b(int $$0, int $$1) {
      return new dzl.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dzl.f a(aks<dcz>... $$0) {
      return a(List.of($$0));
   }

   private static dzl.c a(List<aks<dcz>> $$0) {
      return new dzl.c($$0);
   }

   public static dzl.f a(aks<eoh.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dzl.f a(aks<eoh.a> $$0, double $$1, double $$2) {
      return new dzl.l($$0, $$1, $$2);
   }

   public static dzl.f a(String $$0, dzo $$1, dzo $$2) {
      return new dzl.y(new akt($$0), $$1, $$2);
   }

   public static dzl.f a() {
      return dzl.s.a;
   }

   public static dzl.f b() {
      return dzl.h.a;
   }

   public static dzl.f c() {
      return dzl.a.a;
   }

   public static dzl.f d() {
      return dzl.v.a;
   }

   public static dzl.o a(dzl.f $$0, dzl.o $$1) {
      return new dzl.x($$0, $$1);
   }

   public static dzl.o a(dzl.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dzl.q(Arrays.asList($$0));
      }
   }

   public static dzl.o a(dtc $$0) {
      return new dzl.d($$0);
   }

   public static dzl.o e() {
      return dzl.b.a;
   }

   static <A> Codec<? extends A> a(jn<Codec<? extends A>> $$0, String $$1, ayg<? extends A> $$2) {
      return jn.a($$0, $$1, $$2.a());
   }

   static enum a implements dzl.f {
      a;

      static final ayg<dzl.a> c = ayg.a(MapCodec.unit(a));

      @Override
      public ayg<? extends dzl.f> a() {
         return c;
      }

      public dzl.e a(dzl.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dzo a, int c, boolean d) implements dzl.f {
      static final ayg<dzl.aa> e = ayg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dzo.a.fieldOf("anchor").forGetter(dzl.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dzl.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dzl.aa::d)
                  )
                  .apply($$0, dzl.aa::new)
         )
      );

      @Override
      public ayg<? extends dzl.f> a() {
         return e;
      }

      public dzl.e a(final dzl.g $$0) {
         class a extends dzl.k {
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

      public dzo b() {
         return this.a;
      }
   }

   static enum b implements dzl.o {
      a;

      static final ayg<dzl.b> c = ayg.a(MapCodec.unit(a));

      @Override
      public ayg<? extends dzl.o> a() {
         return c;
      }

      public dzl.u a(dzl.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dzl.f {
      static final ayg<dzl.c> a = ayg.a(aks.a(li.az).listOf().fieldOf("biome_is").xmap(dzl::a, $$0 -> $$0.c));
      private final List<aks<dcz>> c;
      final Predicate<aks<dcz>> d;

      c(List<aks<dcz>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public ayg<? extends dzl.f> a() {
         return a;
      }

      public dzl.e a(final dzl.g $$0) {
         class a extends dzl.k {
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
            return $$0 instanceof dzl.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dtc a, dzl.r c) implements dzl.o {
      static final ayg<dzl.d> d = ayg.a(dtc.b.xmap(dzl.d::new, dzl.d::b).fieldOf("result_state"));

      d(dtc $$0) {
         this($$0, new dzl.r($$0));
      }

      @Override
      public ayg<? extends dzl.o> a() {
         return d;
      }

      public dzl.u a(dzl.g $$0) {
         return this.c;
      }

      public dtc b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dzl.g, dzl.e> {
      Codec<dzl.f> b = lh.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dzl.f> a(jn<Codec<? extends dzl.f>> $$0) {
         dzl.a($$0, "biome", dzl.c.a);
         dzl.a($$0, "noise_threshold", dzl.l.e);
         dzl.a($$0, "vertical_gradient", dzl.y.e);
         dzl.a($$0, "y_above", dzl.aa.e);
         dzl.a($$0, "water", dzl.z.e);
         dzl.a($$0, "temperature", dzl.v.c);
         dzl.a($$0, "steep", dzl.s.c);
         dzl.a($$0, "not", dzl.n.c);
         dzl.a($$0, "hole", dzl.h.c);
         dzl.a($$0, "above_preliminary_surface", dzl.a.c);
         return dzl.a($$0, "stone_depth", dzl.t.f);
      }

      ayg<? extends dzl.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dzm e;
      final dzl.e f = new dzl.g.d(this);
      final dzl.e g = new dzl.g.c(this);
      final dzl.e h = new dzl.g.b(this);
      final dzl.e i = new dzl.g.a();
      final dzi j;
      final duy k;
      private final dyy l;
      private final Function<ir, ja<dcz>> m;
      final dzr n;
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
      final ir.a z = new ir.a();
      Supplier<ja<dcz>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dzm $$0, dzi $$1, duy $$2, dyy $$3, Function<ir, ja<dcz>> $$4, jn<dcz> $$5, dzr $$6) {
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
            long $$2 = dbh.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = aym.a(
               aym.a(
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

      final class a implements dzl.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dzl.j {
         b(dzl.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dzl.j {
         c(dzl.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            duy $$4 = this.c.k;
            int $$5 = $$4.a(dyu.a.a, $$0, $$2);
            int $$6 = $$4.a(dyu.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dyu.a.a, $$7, $$1);
               int $$10 = $$4.a(dyu.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dzl.k {
         d(dzl.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dzl.f {
      a;

      static final ayg<dzl.h> c = ayg.a(MapCodec.unit(a));

      @Override
      public ayg<? extends dzl.f> a() {
         return c;
      }

      public dzl.e a(dzl.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dzl.e {
      protected final dzl.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dzl.g $$0) {
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

   abstract static class j extends dzl.i {
      protected j(dzl.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dzl.i {
      protected k(dzl.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(aks<eoh.a> a, double c, double d) implements dzl.f {
      static final ayg<dzl.l> e = ayg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aks.a(li.aH).fieldOf("noise").forGetter(dzl.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dzl.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dzl.l::d)
                  )
                  .apply($$0, dzl.l::new)
         )
      );

      @Override
      public ayg<? extends dzl.f> a() {
         return e;
      }

      public dzl.e a(final dzl.g $$0) {
         final eoh $$1 = $$0.j.a(this.a);

         class a extends dzl.j {
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

      public aks<eoh.a> b() {
         return this.a;
      }
   }

   static record m(dzl.e a) implements dzl.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dzl.f a) implements dzl.f {
      static final ayg<dzl.n> c = ayg.a(dzl.f.b.xmap(dzl.n::new, dzl.n::b).fieldOf("invert"));

      @Override
      public ayg<? extends dzl.f> a() {
         return c;
      }

      public dzl.e a(dzl.g $$0) {
         return new dzl.m(this.a.apply($$0));
      }

      public dzl.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dzl.g, dzl.u> {
      Codec<dzl.o> b = lh.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dzl.o> a(jn<Codec<? extends dzl.o>> $$0) {
         dzl.a($$0, "bandlands", dzl.b.c);
         dzl.a($$0, "block", dzl.d.d);
         dzl.a($$0, "sequence", dzl.q.c);
         return dzl.a($$0, "condition", dzl.x.d);
      }

      ayg<? extends dzl.o> a();
   }

   static record p(List<dzl.u> a) implements dzl.u {
      @Nullable
      @Override
      public dtc tryApply(int $$0, int $$1, int $$2) {
         for (dzl.u $$3 : this.a) {
            dtc $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dzl.o> a) implements dzl.o {
      static final ayg<dzl.q> c = ayg.a(dzl.o.b.listOf().xmap(dzl.q::new, dzl.q::b).fieldOf("sequence"));

      @Override
      public ayg<? extends dzl.o> a() {
         return c;
      }

      public dzl.u a(dzl.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dzl.u> $$1 = ImmutableList.builder();

            for (dzl.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dzl.p($$1.build());
         }
      }

      public List<dzl.o> b() {
         return this.a;
      }
   }

   static record r(dtc a) implements dzl.u {
      @Override
      public dtc tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dzl.f {
      a;

      static final ayg<dzl.s> c = ayg.a(MapCodec.unit(a));

      @Override
      public ayg<? extends dzl.f> a() {
         return c;
      }

      public dzl.e a(dzl.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, ein e) implements dzl.f {
      static final ayg<dzl.t> f = ayg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dzl.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dzl.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dzl.t::d),
                     ein.c.fieldOf("surface_type").forGetter(dzl.t::e)
                  )
                  .apply($$0, dzl.t::new)
         )
      );

      @Override
      public ayg<? extends dzl.f> a() {
         return f;
      }

      public dzl.e a(final dzl.g $$0) {
         final boolean $$1 = this.e == ein.a;

         class a extends dzl.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)aym.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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

   static enum v implements dzl.f {
      a;

      static final ayg<dzl.v> c = ayg.a(MapCodec.unit(a));

      @Override
      public ayg<? extends dzl.f> a() {
         return c;
      }

      public dzl.e a(dzl.g $$0) {
         return $$0.f;
      }
   }

   static record w(dzl.e a, dzl.u b) implements dzl.u {
      @Nullable
      @Override
      public dtc tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dzl.f a, dzl.o c) implements dzl.o {
      static final ayg<dzl.x> d = ayg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dzl.f.b.fieldOf("if_true").forGetter(dzl.x::b), dzl.o.b.fieldOf("then_run").forGetter(dzl.x::c)).apply($$0, dzl.x::new)
         )
      );

      @Override
      public ayg<? extends dzl.o> a() {
         return d;
      }

      public dzl.u a(dzl.g $$0) {
         return new dzl.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dzl.f b() {
         return this.a;
      }
   }

   static record y(akt a, dzo c, dzo d) implements dzl.f {
      static final ayg<dzl.y> e = ayg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     akt.a.fieldOf("random_name").forGetter(dzl.y::b),
                     dzo.a.fieldOf("true_at_and_below").forGetter(dzl.y::c),
                     dzo.a.fieldOf("false_at_and_above").forGetter(dzl.y::d)
                  )
                  .apply($$0, dzl.y::new)
         )
      );

      @Override
      public ayg<? extends dzl.f> a() {
         return e;
      }

      public dzl.e a(final dzl.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dzh $$3 = $$0.j.a(this.b());

         class a extends dzl.k {
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
                  double $$1 = aym.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  ayt $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public akt b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dzl.f {
      static final ayg<dzl.z> e = ayg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dzl.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dzl.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dzl.z::d)
                  )
                  .apply($$0, dzl.z::new)
         )
      );

      @Override
      public ayg<? extends dzl.f> a() {
         return e;
      }

      public dzl.e a(final dzl.g $$0) {
         class a extends dzl.k {
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
