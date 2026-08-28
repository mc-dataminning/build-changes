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

public class dym {
   public static final dym.f a = a(0, false, ehg.b);
   public static final dym.f b = a(0, true, ehg.b);
   public static final dym.f c = a(0, true, 6, ehg.b);
   public static final dym.f d = a(0, true, 30, ehg.b);
   public static final dym.f e = a(0, false, ehg.a);
   public static final dym.f f = a(0, true, ehg.a);

   public static dym.f a(int $$0, boolean $$1, ehg $$2) {
      return new dym.t($$0, $$1, 0, $$2);
   }

   public static dym.f a(int $$0, boolean $$1, int $$2, ehg $$3) {
      return new dym.t($$0, $$1, $$2, $$3);
   }

   public static dym.f a(dym.f $$0) {
      return new dym.n($$0);
   }

   public static dym.f a(dyp $$0, int $$1) {
      return new dym.aa($$0, $$1, false);
   }

   public static dym.f b(dyp $$0, int $$1) {
      return new dym.aa($$0, $$1, true);
   }

   public static dym.f a(int $$0, int $$1) {
      return new dym.z($$0, $$1, false);
   }

   public static dym.f b(int $$0, int $$1) {
      return new dym.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dym.f a(ale<dcy>... $$0) {
      return a(List.of($$0));
   }

   private static dym.c a(List<ale<dcy>> $$0) {
      return new dym.c($$0);
   }

   public static dym.f a(ale<emz.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dym.f a(ale<emz.a> $$0, double $$1, double $$2) {
      return new dym.l($$0, $$1, $$2);
   }

   public static dym.f a(String $$0, dyp $$1, dyp $$2) {
      return new dym.y(new alf($$0), $$1, $$2);
   }

   public static dym.f a() {
      return dym.s.a;
   }

   public static dym.f b() {
      return dym.h.a;
   }

   public static dym.f c() {
      return dym.a.a;
   }

   public static dym.f d() {
      return dym.v.a;
   }

   public static dym.o a(dym.f $$0, dym.o $$1) {
      return new dym.x($$0, $$1);
   }

   public static dym.o a(dym.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dym.q(Arrays.asList($$0));
      }
   }

   public static dym.o a(dsd $$0) {
      return new dym.d($$0);
   }

   public static dym.o e() {
      return dym.b.a;
   }

   static <A> MapCodec<? extends A> a(jv<MapCodec<? extends A>> $$0, String $$1, ays<? extends A> $$2) {
      return jv.a($$0, $$1, $$2.a());
   }

   static enum a implements dym.f {
      a;

      static final ays<dym.a> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends dym.f> a() {
         return c;
      }

      public dym.e a(dym.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dyp a, int c, boolean d) implements dym.f {
      static final ays<dym.aa> e = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dyp.a.fieldOf("anchor").forGetter(dym.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dym.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dym.aa::d)
                  )
                  .apply($$0, dym.aa::new)
         )
      );

      @Override
      public ays<? extends dym.f> a() {
         return e;
      }

      public dym.e a(final dym.g $$0) {
         class a extends dym.k {
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

      public dyp b() {
         return this.a;
      }
   }

   static enum b implements dym.o {
      a;

      static final ays<dym.b> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends dym.o> a() {
         return c;
      }

      public dym.u a(dym.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dym.f {
      static final ays<dym.c> a = ays.a(ale.a(lq.az).listOf().fieldOf("biome_is").xmap(dym::a, $$0 -> $$0.c));
      private final List<ale<dcy>> c;
      final Predicate<ale<dcy>> d;

      c(List<ale<dcy>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public ays<? extends dym.f> a() {
         return a;
      }

      public dym.e a(final dym.g $$0) {
         class a extends dym.k {
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
            return $$0 instanceof dym.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dsd a, dym.r c) implements dym.o {
      static final ays<dym.d> d = ays.a(dsd.b.xmap(dym.d::new, dym.d::b).fieldOf("result_state"));

      d(dsd $$0) {
         this($$0, new dym.r($$0));
      }

      @Override
      public ays<? extends dym.o> a() {
         return d;
      }

      public dym.u a(dym.g $$0) {
         return this.c;
      }

      public dsd b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dym.g, dym.e> {
      Codec<dym.f> b = lp.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dym.f> a(jv<MapCodec<? extends dym.f>> $$0) {
         dym.a($$0, "biome", dym.c.a);
         dym.a($$0, "noise_threshold", dym.l.e);
         dym.a($$0, "vertical_gradient", dym.y.e);
         dym.a($$0, "y_above", dym.aa.e);
         dym.a($$0, "water", dym.z.e);
         dym.a($$0, "temperature", dym.v.c);
         dym.a($$0, "steep", dym.s.c);
         dym.a($$0, "not", dym.n.c);
         dym.a($$0, "hole", dym.h.c);
         dym.a($$0, "above_preliminary_surface", dym.a.c);
         return dym.a($$0, "stone_depth", dym.t.f);
      }

      ays<? extends dym.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dyn e;
      final dym.e f = new dym.g.d(this);
      final dym.e g = new dym.g.c(this);
      final dym.e h = new dym.g.b(this);
      final dym.e i = new dym.g.a();
      final dyj j;
      final dtz k;
      private final dxz l;
      private final Function<iz, ji<dcy>> m;
      final dys n;
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
      Supplier<ji<dcy>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dyn $$0, dyj $$1, dtz $$2, dxz $$3, Function<iz, ji<dcy>> $$4, jv<dcy> $$5, dys $$6) {
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
            long $$2 = dbg.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = ayz.a(
               ayz.a(
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

      final class a implements dym.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dym.j {
         b(dym.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dym.j {
         c(dym.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dtz $$4 = this.c.k;
            int $$5 = $$4.a(dxv.a.a, $$0, $$2);
            int $$6 = $$4.a(dxv.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dxv.a.a, $$7, $$1);
               int $$10 = $$4.a(dxv.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dym.k {
         d(dym.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dym.f {
      a;

      static final ays<dym.h> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends dym.f> a() {
         return c;
      }

      public dym.e a(dym.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dym.e {
      protected final dym.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dym.g $$0) {
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

   abstract static class j extends dym.i {
      protected j(dym.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dym.i {
      protected k(dym.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(ale<emz.a> a, double c, double d) implements dym.f {
      static final ays<dym.l> e = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ale.a(lq.aH).fieldOf("noise").forGetter(dym.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dym.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dym.l::d)
                  )
                  .apply($$0, dym.l::new)
         )
      );

      @Override
      public ays<? extends dym.f> a() {
         return e;
      }

      public dym.e a(final dym.g $$0) {
         final emz $$1 = $$0.j.a(this.a);

         class a extends dym.j {
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

      public ale<emz.a> b() {
         return this.a;
      }
   }

   static record m(dym.e a) implements dym.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dym.f a) implements dym.f {
      static final ays<dym.n> c = ays.a(dym.f.b.xmap(dym.n::new, dym.n::b).fieldOf("invert"));

      @Override
      public ays<? extends dym.f> a() {
         return c;
      }

      public dym.e a(dym.g $$0) {
         return new dym.m(this.a.apply($$0));
      }

      public dym.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dym.g, dym.u> {
      Codec<dym.o> b = lp.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dym.o> a(jv<MapCodec<? extends dym.o>> $$0) {
         dym.a($$0, "bandlands", dym.b.c);
         dym.a($$0, "block", dym.d.d);
         dym.a($$0, "sequence", dym.q.c);
         return dym.a($$0, "condition", dym.x.d);
      }

      ays<? extends dym.o> a();
   }

   static record p(List<dym.u> a) implements dym.u {
      @Nullable
      @Override
      public dsd tryApply(int $$0, int $$1, int $$2) {
         for (dym.u $$3 : this.a) {
            dsd $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dym.o> a) implements dym.o {
      static final ays<dym.q> c = ays.a(dym.o.b.listOf().xmap(dym.q::new, dym.q::b).fieldOf("sequence"));

      @Override
      public ays<? extends dym.o> a() {
         return c;
      }

      public dym.u a(dym.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dym.u> $$1 = ImmutableList.builder();

            for (dym.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dym.p($$1.build());
         }
      }

      public List<dym.o> b() {
         return this.a;
      }
   }

   static record r(dsd a) implements dym.u {
      @Override
      public dsd tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dym.f {
      a;

      static final ays<dym.s> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends dym.f> a() {
         return c;
      }

      public dym.e a(dym.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, ehg e) implements dym.f {
      static final ays<dym.t> f = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dym.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dym.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dym.t::d),
                     ehg.c.fieldOf("surface_type").forGetter(dym.t::e)
                  )
                  .apply($$0, dym.t::new)
         )
      );

      @Override
      public ays<? extends dym.f> a() {
         return f;
      }

      public dym.e a(final dym.g $$0) {
         final boolean $$1 = this.e == ehg.a;

         class a extends dym.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)ayz.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dsd tryApply(int var1, int var2, int var3);
   }

   static enum v implements dym.f {
      a;

      static final ays<dym.v> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends dym.f> a() {
         return c;
      }

      public dym.e a(dym.g $$0) {
         return $$0.f;
      }
   }

   static record w(dym.e a, dym.u b) implements dym.u {
      @Nullable
      @Override
      public dsd tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dym.f a, dym.o c) implements dym.o {
      static final ays<dym.x> d = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dym.f.b.fieldOf("if_true").forGetter(dym.x::b), dym.o.b.fieldOf("then_run").forGetter(dym.x::c)).apply($$0, dym.x::new)
         )
      );

      @Override
      public ays<? extends dym.o> a() {
         return d;
      }

      public dym.u a(dym.g $$0) {
         return new dym.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dym.f b() {
         return this.a;
      }
   }

   static record y(alf a, dyp c, dyp d) implements dym.f {
      static final ays<dym.y> e = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alf.a.fieldOf("random_name").forGetter(dym.y::b),
                     dyp.a.fieldOf("true_at_and_below").forGetter(dym.y::c),
                     dyp.a.fieldOf("false_at_and_above").forGetter(dym.y::d)
                  )
                  .apply($$0, dym.y::new)
         )
      );

      @Override
      public ays<? extends dym.f> a() {
         return e;
      }

      public dym.e a(final dym.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dyi $$3 = $$0.j.a(this.b());

         class a extends dym.k {
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
                  double $$1 = ayz.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  azh $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public alf b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dym.f {
      static final ays<dym.z> e = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dym.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dym.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dym.z::d)
                  )
                  .apply($$0, dym.z::new)
         )
      );

      @Override
      public ays<? extends dym.f> a() {
         return e;
      }

      public dym.e a(final dym.g $$0) {
         class a extends dym.k {
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
