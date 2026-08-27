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

public class dll {
   public static final dll.f a = a(0, false, duf.b);
   public static final dll.f b = a(0, true, duf.b);
   public static final dll.f c = a(0, true, 6, duf.b);
   public static final dll.f d = a(0, true, 30, duf.b);
   public static final dll.f e = a(0, false, duf.a);
   public static final dll.f f = a(0, true, duf.a);

   public static dll.f a(int $$0, boolean $$1, duf $$2) {
      return new dll.t($$0, $$1, 0, $$2);
   }

   public static dll.f a(int $$0, boolean $$1, int $$2, duf $$3) {
      return new dll.t($$0, $$1, $$2, $$3);
   }

   public static dll.f a(dll.f $$0) {
      return new dll.n($$0);
   }

   public static dll.f a(dlo $$0, int $$1) {
      return new dll.aa($$0, $$1, false);
   }

   public static dll.f b(dlo $$0, int $$1) {
      return new dll.aa($$0, $$1, true);
   }

   public static dll.f a(int $$0, int $$1) {
      return new dll.z($$0, $$1, false);
   }

   public static dll.f b(int $$0, int $$1) {
      return new dll.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dll.f a(aex<cqv>... $$0) {
      return a(List.of($$0));
   }

   private static dll.c a(List<aex<cqv>> $$0) {
      return new dll.c($$0);
   }

   public static dll.f a(aex<dzr.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dll.f a(aex<dzr.a> $$0, double $$1, double $$2) {
      return new dll.l($$0, $$1, $$2);
   }

   public static dll.f a(String $$0, dlo $$1, dlo $$2) {
      return new dll.y(new aey($$0), $$1, $$2);
   }

   public static dll.f a() {
      return dll.s.a;
   }

   public static dll.f b() {
      return dll.h.a;
   }

   public static dll.f c() {
      return dll.a.a;
   }

   public static dll.f d() {
      return dll.v.a;
   }

   public static dll.o a(dll.f $$0, dll.o $$1) {
      return new dll.x($$0, $$1);
   }

   public static dll.o a(dll.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dll.q(Arrays.asList($$0));
      }
   }

   public static dll.o a(dfl $$0) {
      return new dll.d($$0);
   }

   public static dll.o e() {
      return dll.b.a;
   }

   static <A> Codec<? extends A> a(ht<Codec<? extends A>> $$0, String $$1, ars<? extends A> $$2) {
      return ht.a($$0, $$1, $$2.a());
   }

   static enum a implements dll.f {
      a;

      static final ars<dll.a> c = ars.a(MapCodec.unit(a));

      @Override
      public ars<? extends dll.f> a() {
         return c;
      }

      public dll.e a(dll.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dlo a, int c, boolean d) implements dll.f {
      static final ars<dll.aa> e = ars.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dlo.a.fieldOf("anchor").forGetter(dll.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dll.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dll.aa::d)
                  )
                  .apply($$0, dll.aa::new)
         )
      );

      @Override
      public ars<? extends dll.f> a() {
         return e;
      }

      public dll.e a(final dll.g $$0) {
         class a extends dll.k {
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

      public dlo b() {
         return this.a;
      }
   }

   static enum b implements dll.o {
      a;

      static final ars<dll.b> c = ars.a(MapCodec.unit(a));

      @Override
      public ars<? extends dll.o> a() {
         return c;
      }

      public dll.u a(dll.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dll.f {
      static final ars<dll.c> a = ars.a(aex.a(je.ap).listOf().fieldOf("biome_is").xmap(dll::a, $$0 -> $$0.c));
      private final List<aex<cqv>> c;
      final Predicate<aex<cqv>> d;

      c(List<aex<cqv>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public ars<? extends dll.f> a() {
         return a;
      }

      public dll.e a(final dll.g $$0) {
         class a extends dll.k {
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
            return $$0 instanceof dll.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dfl a, dll.r c) implements dll.o {
      static final ars<dll.d> d = ars.a(dfl.b.xmap(dll.d::new, dll.d::b).fieldOf("result_state"));

      d(dfl $$0) {
         this($$0, new dll.r($$0));
      }

      @Override
      public ars<? extends dll.o> a() {
         return d;
      }

      public dll.u a(dll.g $$0) {
         return this.c;
      }

      public dfl b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dll.g, dll.e> {
      Codec<dll.f> b = jd.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dll.f> a(ht<Codec<? extends dll.f>> $$0) {
         dll.a($$0, "biome", dll.c.a);
         dll.a($$0, "noise_threshold", dll.l.e);
         dll.a($$0, "vertical_gradient", dll.y.e);
         dll.a($$0, "y_above", dll.aa.e);
         dll.a($$0, "water", dll.z.e);
         dll.a($$0, "temperature", dll.v.c);
         dll.a($$0, "steep", dll.s.c);
         dll.a($$0, "not", dll.n.c);
         dll.a($$0, "hole", dll.h.c);
         dll.a($$0, "above_preliminary_surface", dll.a.c);
         return dll.a($$0, "stone_depth", dll.t.f);
      }

      ars<? extends dll.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dlm e;
      final dll.e f = new dll.g.d(this);
      final dll.e g = new dll.g.c(this);
      final dll.e h = new dll.g.b(this);
      final dll.e i = new dll.g.a();
      final dli j;
      final dhh k;
      private final dky l;
      private final Function<gw, hg<cqv>> m;
      final dlr n;
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
      final gw.a z = new gw.a();
      Supplier<hg<cqv>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dlm $$0, dli $$1, dhh $$2, dky $$3, Function<gw, hg<cqv>> $$4, ht<cqv> $$5, dlr $$6) {
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
            long $$2 = cpe.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = ary.a(
               ary.a(
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

      final class a implements dll.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dll.j {
         b(dll.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dll.j {
         c(dll.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dhh $$4 = this.c.k;
            int $$5 = $$4.a(dku.a.a, $$0, $$2);
            int $$6 = $$4.a(dku.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dku.a.a, $$7, $$1);
               int $$10 = $$4.a(dku.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dll.k {
         d(dll.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dll.f {
      a;

      static final ars<dll.h> c = ars.a(MapCodec.unit(a));

      @Override
      public ars<? extends dll.f> a() {
         return c;
      }

      public dll.e a(dll.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dll.e {
      protected final dll.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dll.g $$0) {
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

   abstract static class j extends dll.i {
      protected j(dll.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dll.i {
      protected k(dll.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(aex<dzr.a> a, double c, double d) implements dll.f {
      static final ars<dll.l> e = ars.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aex.a(je.ax).fieldOf("noise").forGetter(dll.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dll.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dll.l::d)
                  )
                  .apply($$0, dll.l::new)
         )
      );

      @Override
      public ars<? extends dll.f> a() {
         return e;
      }

      public dll.e a(final dll.g $$0) {
         final dzr $$1 = $$0.j.a(this.a);

         class a extends dll.j {
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

      public aex<dzr.a> b() {
         return this.a;
      }
   }

   static record m(dll.e a) implements dll.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dll.f a) implements dll.f {
      static final ars<dll.n> c = ars.a(dll.f.b.xmap(dll.n::new, dll.n::b).fieldOf("invert"));

      @Override
      public ars<? extends dll.f> a() {
         return c;
      }

      public dll.e a(dll.g $$0) {
         return new dll.m(this.a.apply($$0));
      }

      public dll.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dll.g, dll.u> {
      Codec<dll.o> b = jd.af.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dll.o> a(ht<Codec<? extends dll.o>> $$0) {
         dll.a($$0, "bandlands", dll.b.c);
         dll.a($$0, "block", dll.d.d);
         dll.a($$0, "sequence", dll.q.c);
         return dll.a($$0, "condition", dll.x.d);
      }

      ars<? extends dll.o> a();
   }

   static record p(List<dll.u> a) implements dll.u {
      @Nullable
      @Override
      public dfl tryApply(int $$0, int $$1, int $$2) {
         for (dll.u $$3 : this.a) {
            dfl $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dll.o> a) implements dll.o {
      static final ars<dll.q> c = ars.a(dll.o.b.listOf().xmap(dll.q::new, dll.q::b).fieldOf("sequence"));

      @Override
      public ars<? extends dll.o> a() {
         return c;
      }

      public dll.u a(dll.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dll.u> $$1 = ImmutableList.builder();

            for (dll.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dll.p($$1.build());
         }
      }

      public List<dll.o> b() {
         return this.a;
      }
   }

   static record r(dfl a) implements dll.u {
      @Override
      public dfl tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dll.f {
      a;

      static final ars<dll.s> c = ars.a(MapCodec.unit(a));

      @Override
      public ars<? extends dll.f> a() {
         return c;
      }

      public dll.e a(dll.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, duf e) implements dll.f {
      static final ars<dll.t> f = ars.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dll.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dll.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dll.t::d),
                     duf.c.fieldOf("surface_type").forGetter(dll.t::e)
                  )
                  .apply($$0, dll.t::new)
         )
      );

      @Override
      public ars<? extends dll.f> a() {
         return f;
      }

      public dll.e a(final dll.g $$0) {
         final boolean $$1 = this.e == duf.a;

         class a extends dll.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)ary.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dfl tryApply(int var1, int var2, int var3);
   }

   static enum v implements dll.f {
      a;

      static final ars<dll.v> c = ars.a(MapCodec.unit(a));

      @Override
      public ars<? extends dll.f> a() {
         return c;
      }

      public dll.e a(dll.g $$0) {
         return $$0.f;
      }
   }

   static record w(dll.e a, dll.u b) implements dll.u {
      @Nullable
      @Override
      public dfl tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dll.f a, dll.o c) implements dll.o {
      static final ars<dll.x> d = ars.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dll.f.b.fieldOf("if_true").forGetter(dll.x::b), dll.o.b.fieldOf("then_run").forGetter(dll.x::c)).apply($$0, dll.x::new)
         )
      );

      @Override
      public ars<? extends dll.o> a() {
         return d;
      }

      public dll.u a(dll.g $$0) {
         return new dll.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dll.f b() {
         return this.a;
      }
   }

   static record y(aey a, dlo c, dlo d) implements dll.f {
      static final ars<dll.y> e = ars.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aey.a.fieldOf("random_name").forGetter(dll.y::b),
                     dlo.a.fieldOf("true_at_and_below").forGetter(dll.y::c),
                     dlo.a.fieldOf("false_at_and_above").forGetter(dll.y::d)
                  )
                  .apply($$0, dll.y::new)
         )
      );

      @Override
      public ars<? extends dll.f> a() {
         return e;
      }

      public dll.e a(final dll.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dlh $$3 = $$0.j.a(this.b());

         class a extends dll.k {
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
                  double $$1 = ary.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  ase $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public aey b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dll.f {
      static final ars<dll.z> e = ars.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dll.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dll.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dll.z::d)
                  )
                  .apply($$0, dll.z::new)
         )
      );

      @Override
      public ars<? extends dll.f> a() {
         return e;
      }

      public dll.e a(final dll.g $$0) {
         class a extends dll.k {
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
