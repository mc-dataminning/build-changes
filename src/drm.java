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

public class drm {
   public static final drm.f a = a(0, false, eag.b);
   public static final drm.f b = a(0, true, eag.b);
   public static final drm.f c = a(0, true, 6, eag.b);
   public static final drm.f d = a(0, true, 30, eag.b);
   public static final drm.f e = a(0, false, eag.a);
   public static final drm.f f = a(0, true, eag.a);

   public static drm.f a(int $$0, boolean $$1, eag $$2) {
      return new drm.t($$0, $$1, 0, $$2);
   }

   public static drm.f a(int $$0, boolean $$1, int $$2, eag $$3) {
      return new drm.t($$0, $$1, $$2, $$3);
   }

   public static drm.f a(drm.f $$0) {
      return new drm.n($$0);
   }

   public static drm.f a(drp $$0, int $$1) {
      return new drm.aa($$0, $$1, false);
   }

   public static drm.f b(drp $$0, int $$1) {
      return new drm.aa($$0, $$1, true);
   }

   public static drm.f a(int $$0, int $$1) {
      return new drm.z($$0, $$1, false);
   }

   public static drm.f b(int $$0, int $$1) {
      return new drm.z($$0, $$1, true);
   }

   @SafeVarargs
   public static drm.f a(aix<cwq>... $$0) {
      return a(List.of($$0));
   }

   private static drm.c a(List<aix<cwq>> $$0) {
      return new drm.c($$0);
   }

   public static drm.f a(aix<efz.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static drm.f a(aix<efz.a> $$0, double $$1, double $$2) {
      return new drm.l($$0, $$1, $$2);
   }

   public static drm.f a(String $$0, drp $$1, drp $$2) {
      return new drm.y(new aiy($$0), $$1, $$2);
   }

   public static drm.f a() {
      return drm.s.a;
   }

   public static drm.f b() {
      return drm.h.a;
   }

   public static drm.f c() {
      return drm.a.a;
   }

   public static drm.f d() {
      return drm.v.a;
   }

   public static drm.o a(drm.f $$0, drm.o $$1) {
      return new drm.x($$0, $$1);
   }

   public static drm.o a(drm.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new drm.q(Arrays.asList($$0));
      }
   }

   public static drm.o a(dlj $$0) {
      return new drm.d($$0);
   }

   public static drm.o e() {
      return drm.b.a;
   }

   static <A> Codec<? extends A> a(iv<Codec<? extends A>> $$0, String $$1, awc<? extends A> $$2) {
      return iv.a($$0, $$1, $$2.a());
   }

   static enum a implements drm.f {
      a;

      static final awc<drm.a> c = awc.a(MapCodec.unit(a));

      @Override
      public awc<? extends drm.f> a() {
         return c;
      }

      public drm.e a(drm.g $$0) {
         return $$0.i;
      }
   }

   static record aa(drp a, int c, boolean d) implements drm.f {
      static final awc<drm.aa> e = awc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     drp.a.fieldOf("anchor").forGetter(drm.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(drm.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(drm.aa::d)
                  )
                  .apply($$0, drm.aa::new)
         )
      );

      @Override
      public awc<? extends drm.f> a() {
         return e;
      }

      public drm.e a(final drm.g $$0) {
         class a extends drm.k {
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

      public drp b() {
         return this.a;
      }
   }

   static enum b implements drm.o {
      a;

      static final awc<drm.b> c = awc.a(MapCodec.unit(a));

      @Override
      public awc<? extends drm.o> a() {
         return c;
      }

      public drm.u a(drm.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements drm.f {
      static final awc<drm.c> a = awc.a(aix.a(kg.at).listOf().fieldOf("biome_is").xmap(drm::a, $$0 -> $$0.c));
      private final List<aix<cwq>> c;
      final Predicate<aix<cwq>> d;

      c(List<aix<cwq>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public awc<? extends drm.f> a() {
         return a;
      }

      public drm.e a(final drm.g $$0) {
         class a extends drm.k {
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
            return $$0 instanceof drm.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dlj a, drm.r c) implements drm.o {
      static final awc<drm.d> d = awc.a(dlj.b.xmap(drm.d::new, drm.d::b).fieldOf("result_state"));

      d(dlj $$0) {
         this($$0, new drm.r($$0));
      }

      @Override
      public awc<? extends drm.o> a() {
         return d;
      }

      public drm.u a(drm.g $$0) {
         return this.c;
      }

      public dlj b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<drm.g, drm.e> {
      Codec<drm.f> b = kf.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends drm.f> a(iv<Codec<? extends drm.f>> $$0) {
         drm.a($$0, "biome", drm.c.a);
         drm.a($$0, "noise_threshold", drm.l.e);
         drm.a($$0, "vertical_gradient", drm.y.e);
         drm.a($$0, "y_above", drm.aa.e);
         drm.a($$0, "water", drm.z.e);
         drm.a($$0, "temperature", drm.v.c);
         drm.a($$0, "steep", drm.s.c);
         drm.a($$0, "not", drm.n.c);
         drm.a($$0, "hole", drm.h.c);
         drm.a($$0, "above_preliminary_surface", drm.a.c);
         return drm.a($$0, "stone_depth", drm.t.f);
      }

      awc<? extends drm.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final drn e;
      final drm.e f = new drm.g.d(this);
      final drm.e g = new drm.g.c(this);
      final drm.e h = new drm.g.b(this);
      final drm.e i = new drm.g.a();
      final drj j;
      final dnf k;
      private final dqz l;
      private final Function<hz, ij<cwq>> m;
      final drs n;
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
      final hz.a z = new hz.a();
      Supplier<ij<cwq>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(drn $$0, drj $$1, dnf $$2, dqz $$3, Function<hz, ij<cwq>> $$4, iv<cwq> $$5, drs $$6) {
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
            long $$2 = cuy.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = awi.a(
               awi.a(
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

      final class a implements drm.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends drm.j {
         b(drm.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends drm.j {
         c(drm.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dnf $$4 = this.c.k;
            int $$5 = $$4.a(dqv.a.a, $$0, $$2);
            int $$6 = $$4.a(dqv.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dqv.a.a, $$7, $$1);
               int $$10 = $$4.a(dqv.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends drm.k {
         d(drm.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements drm.f {
      a;

      static final awc<drm.h> c = awc.a(MapCodec.unit(a));

      @Override
      public awc<? extends drm.f> a() {
         return c;
      }

      public drm.e a(drm.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements drm.e {
      protected final drm.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(drm.g $$0) {
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

   abstract static class j extends drm.i {
      protected j(drm.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends drm.i {
      protected k(drm.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(aix<efz.a> a, double c, double d) implements drm.f {
      static final awc<drm.l> e = awc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aix.a(kg.aB).fieldOf("noise").forGetter(drm.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(drm.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(drm.l::d)
                  )
                  .apply($$0, drm.l::new)
         )
      );

      @Override
      public awc<? extends drm.f> a() {
         return e;
      }

      public drm.e a(final drm.g $$0) {
         final efz $$1 = $$0.j.a(this.a);

         class a extends drm.j {
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

      public aix<efz.a> b() {
         return this.a;
      }
   }

   static record m(drm.e a) implements drm.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(drm.f a) implements drm.f {
      static final awc<drm.n> c = awc.a(drm.f.b.xmap(drm.n::new, drm.n::b).fieldOf("invert"));

      @Override
      public awc<? extends drm.f> a() {
         return c;
      }

      public drm.e a(drm.g $$0) {
         return new drm.m(this.a.apply($$0));
      }

      public drm.f b() {
         return this.a;
      }
   }

   public interface o extends Function<drm.g, drm.u> {
      Codec<drm.o> b = kf.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends drm.o> a(iv<Codec<? extends drm.o>> $$0) {
         drm.a($$0, "bandlands", drm.b.c);
         drm.a($$0, "block", drm.d.d);
         drm.a($$0, "sequence", drm.q.c);
         return drm.a($$0, "condition", drm.x.d);
      }

      awc<? extends drm.o> a();
   }

   static record p(List<drm.u> a) implements drm.u {
      @Nullable
      @Override
      public dlj tryApply(int $$0, int $$1, int $$2) {
         for (drm.u $$3 : this.a) {
            dlj $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<drm.o> a) implements drm.o {
      static final awc<drm.q> c = awc.a(drm.o.b.listOf().xmap(drm.q::new, drm.q::b).fieldOf("sequence"));

      @Override
      public awc<? extends drm.o> a() {
         return c;
      }

      public drm.u a(drm.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<drm.u> $$1 = ImmutableList.builder();

            for (drm.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new drm.p($$1.build());
         }
      }

      public List<drm.o> b() {
         return this.a;
      }
   }

   static record r(dlj a) implements drm.u {
      @Override
      public dlj tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements drm.f {
      a;

      static final awc<drm.s> c = awc.a(MapCodec.unit(a));

      @Override
      public awc<? extends drm.f> a() {
         return c;
      }

      public drm.e a(drm.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, eag e) implements drm.f {
      static final awc<drm.t> f = awc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(drm.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(drm.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(drm.t::d),
                     eag.c.fieldOf("surface_type").forGetter(drm.t::e)
                  )
                  .apply($$0, drm.t::new)
         )
      );

      @Override
      public awc<? extends drm.f> a() {
         return f;
      }

      public drm.e a(final drm.g $$0) {
         final boolean $$1 = this.e == eag.a;

         class a extends drm.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)awi.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dlj tryApply(int var1, int var2, int var3);
   }

   static enum v implements drm.f {
      a;

      static final awc<drm.v> c = awc.a(MapCodec.unit(a));

      @Override
      public awc<? extends drm.f> a() {
         return c;
      }

      public drm.e a(drm.g $$0) {
         return $$0.f;
      }
   }

   static record w(drm.e a, drm.u b) implements drm.u {
      @Nullable
      @Override
      public dlj tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(drm.f a, drm.o c) implements drm.o {
      static final awc<drm.x> d = awc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(drm.f.b.fieldOf("if_true").forGetter(drm.x::b), drm.o.b.fieldOf("then_run").forGetter(drm.x::c)).apply($$0, drm.x::new)
         )
      );

      @Override
      public awc<? extends drm.o> a() {
         return d;
      }

      public drm.u a(drm.g $$0) {
         return new drm.w(this.a.apply($$0), this.c.apply($$0));
      }

      public drm.f b() {
         return this.a;
      }
   }

   static record y(aiy a, drp c, drp d) implements drm.f {
      static final awc<drm.y> e = awc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aiy.a.fieldOf("random_name").forGetter(drm.y::b),
                     drp.a.fieldOf("true_at_and_below").forGetter(drm.y::c),
                     drp.a.fieldOf("false_at_and_above").forGetter(drm.y::d)
                  )
                  .apply($$0, drm.y::new)
         )
      );

      @Override
      public awc<? extends drm.f> a() {
         return e;
      }

      public drm.e a(final drm.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dri $$3 = $$0.j.a(this.b());

         class a extends drm.k {
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
                  double $$1 = awi.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  awp $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public aiy b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements drm.f {
      static final awc<drm.z> e = awc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(drm.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(drm.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(drm.z::d)
                  )
                  .apply($$0, drm.z::new)
         )
      );

      @Override
      public awc<? extends drm.f> a() {
         return e;
      }

      public drm.e a(final drm.g $$0) {
         class a extends drm.k {
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
