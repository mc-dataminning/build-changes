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

public class dmw {
   public static final dmw.f a = a(0, false, dvq.b);
   public static final dmw.f b = a(0, true, dvq.b);
   public static final dmw.f c = a(0, true, 6, dvq.b);
   public static final dmw.f d = a(0, true, 30, dvq.b);
   public static final dmw.f e = a(0, false, dvq.a);
   public static final dmw.f f = a(0, true, dvq.a);

   public static dmw.f a(int $$0, boolean $$1, dvq $$2) {
      return new dmw.t($$0, $$1, 0, $$2);
   }

   public static dmw.f a(int $$0, boolean $$1, int $$2, dvq $$3) {
      return new dmw.t($$0, $$1, $$2, $$3);
   }

   public static dmw.f a(dmw.f $$0) {
      return new dmw.n($$0);
   }

   public static dmw.f a(dmz $$0, int $$1) {
      return new dmw.aa($$0, $$1, false);
   }

   public static dmw.f b(dmz $$0, int $$1) {
      return new dmw.aa($$0, $$1, true);
   }

   public static dmw.f a(int $$0, int $$1) {
      return new dmw.z($$0, $$1, false);
   }

   public static dmw.f b(int $$0, int $$1) {
      return new dmw.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dmw.f a(agf<csq>... $$0) {
      return a(List.of($$0));
   }

   private static dmw.c a(List<agf<csq>> $$0) {
      return new dmw.c($$0);
   }

   public static dmw.f a(agf<ebj.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dmw.f a(agf<ebj.a> $$0, double $$1, double $$2) {
      return new dmw.l($$0, $$1, $$2);
   }

   public static dmw.f a(String $$0, dmz $$1, dmz $$2) {
      return new dmw.y(new agg($$0), $$1, $$2);
   }

   public static dmw.f a() {
      return dmw.s.a;
   }

   public static dmw.f b() {
      return dmw.h.a;
   }

   public static dmw.f c() {
      return dmw.a.a;
   }

   public static dmw.f d() {
      return dmw.v.a;
   }

   public static dmw.o a(dmw.f $$0, dmw.o $$1) {
      return new dmw.x($$0, $$1);
   }

   public static dmw.o a(dmw.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dmw.q(Arrays.asList($$0));
      }
   }

   public static dmw.o a(dgw $$0) {
      return new dmw.d($$0);
   }

   public static dmw.o e() {
      return dmw.b.a;
   }

   static <A> Codec<? extends A> a(io<Codec<? extends A>> $$0, String $$1, atc<? extends A> $$2) {
      return io.a($$0, $$1, $$2.a());
   }

   static enum a implements dmw.f {
      a;

      static final atc<dmw.a> c = atc.a(MapCodec.unit(a));

      @Override
      public atc<? extends dmw.f> a() {
         return c;
      }

      public dmw.e a(dmw.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dmz a, int c, boolean d) implements dmw.f {
      static final atc<dmw.aa> e = atc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dmz.a.fieldOf("anchor").forGetter(dmw.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dmw.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dmw.aa::d)
                  )
                  .apply($$0, dmw.aa::new)
         )
      );

      @Override
      public atc<? extends dmw.f> a() {
         return e;
      }

      public dmw.e a(final dmw.g $$0) {
         class a extends dmw.k {
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

      public dmz b() {
         return this.a;
      }
   }

   static enum b implements dmw.o {
      a;

      static final atc<dmw.b> c = atc.a(MapCodec.unit(a));

      @Override
      public atc<? extends dmw.o> a() {
         return c;
      }

      public dmw.u a(dmw.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dmw.f {
      static final atc<dmw.c> a = atc.a(agf.a(jz.ar).listOf().fieldOf("biome_is").xmap(dmw::a, $$0 -> $$0.c));
      private final List<agf<csq>> c;
      final Predicate<agf<csq>> d;

      c(List<agf<csq>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public atc<? extends dmw.f> a() {
         return a;
      }

      public dmw.e a(final dmw.g $$0) {
         class a extends dmw.k {
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
            return $$0 instanceof dmw.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dgw a, dmw.r c) implements dmw.o {
      static final atc<dmw.d> d = atc.a(dgw.b.xmap(dmw.d::new, dmw.d::b).fieldOf("result_state"));

      d(dgw $$0) {
         this($$0, new dmw.r($$0));
      }

      @Override
      public atc<? extends dmw.o> a() {
         return d;
      }

      public dmw.u a(dmw.g $$0) {
         return this.c;
      }

      public dgw b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dmw.g, dmw.e> {
      Codec<dmw.f> b = jy.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dmw.f> a(io<Codec<? extends dmw.f>> $$0) {
         dmw.a($$0, "biome", dmw.c.a);
         dmw.a($$0, "noise_threshold", dmw.l.e);
         dmw.a($$0, "vertical_gradient", dmw.y.e);
         dmw.a($$0, "y_above", dmw.aa.e);
         dmw.a($$0, "water", dmw.z.e);
         dmw.a($$0, "temperature", dmw.v.c);
         dmw.a($$0, "steep", dmw.s.c);
         dmw.a($$0, "not", dmw.n.c);
         dmw.a($$0, "hole", dmw.h.c);
         dmw.a($$0, "above_preliminary_surface", dmw.a.c);
         return dmw.a($$0, "stone_depth", dmw.t.f);
      }

      atc<? extends dmw.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dmx e;
      final dmw.e f = new dmw.g.d(this);
      final dmw.e g = new dmw.g.c(this);
      final dmw.e h = new dmw.g.b(this);
      final dmw.e i = new dmw.g.a();
      final dmt j;
      final dis k;
      private final dmj l;
      private final Function<ht, ib<csq>> m;
      final dnc n;
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
      final ht.a z = new ht.a();
      Supplier<ib<csq>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dmx $$0, dmt $$1, dis $$2, dmj $$3, Function<ht, ib<csq>> $$4, io<csq> $$5, dnc $$6) {
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
            long $$2 = cqz.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = ati.a(
               ati.a(
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

      final class a implements dmw.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dmw.j {
         b(dmw.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dmw.j {
         c(dmw.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dis $$4 = this.c.k;
            int $$5 = $$4.a(dmf.a.a, $$0, $$2);
            int $$6 = $$4.a(dmf.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dmf.a.a, $$7, $$1);
               int $$10 = $$4.a(dmf.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dmw.k {
         d(dmw.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dmw.f {
      a;

      static final atc<dmw.h> c = atc.a(MapCodec.unit(a));

      @Override
      public atc<? extends dmw.f> a() {
         return c;
      }

      public dmw.e a(dmw.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dmw.e {
      protected final dmw.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dmw.g $$0) {
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

   abstract static class j extends dmw.i {
      protected j(dmw.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dmw.i {
      protected k(dmw.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(agf<ebj.a> a, double c, double d) implements dmw.f {
      static final atc<dmw.l> e = atc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     agf.a(jz.az).fieldOf("noise").forGetter(dmw.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dmw.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dmw.l::d)
                  )
                  .apply($$0, dmw.l::new)
         )
      );

      @Override
      public atc<? extends dmw.f> a() {
         return e;
      }

      public dmw.e a(final dmw.g $$0) {
         final ebj $$1 = $$0.j.a(this.a);

         class a extends dmw.j {
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

      public agf<ebj.a> b() {
         return this.a;
      }
   }

   static record m(dmw.e a) implements dmw.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dmw.f a) implements dmw.f {
      static final atc<dmw.n> c = atc.a(dmw.f.b.xmap(dmw.n::new, dmw.n::b).fieldOf("invert"));

      @Override
      public atc<? extends dmw.f> a() {
         return c;
      }

      public dmw.e a(dmw.g $$0) {
         return new dmw.m(this.a.apply($$0));
      }

      public dmw.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dmw.g, dmw.u> {
      Codec<dmw.o> b = jy.af.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dmw.o> a(io<Codec<? extends dmw.o>> $$0) {
         dmw.a($$0, "bandlands", dmw.b.c);
         dmw.a($$0, "block", dmw.d.d);
         dmw.a($$0, "sequence", dmw.q.c);
         return dmw.a($$0, "condition", dmw.x.d);
      }

      atc<? extends dmw.o> a();
   }

   static record p(List<dmw.u> a) implements dmw.u {
      @Nullable
      @Override
      public dgw tryApply(int $$0, int $$1, int $$2) {
         for (dmw.u $$3 : this.a) {
            dgw $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dmw.o> a) implements dmw.o {
      static final atc<dmw.q> c = atc.a(dmw.o.b.listOf().xmap(dmw.q::new, dmw.q::b).fieldOf("sequence"));

      @Override
      public atc<? extends dmw.o> a() {
         return c;
      }

      public dmw.u a(dmw.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dmw.u> $$1 = ImmutableList.builder();

            for (dmw.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dmw.p($$1.build());
         }
      }

      public List<dmw.o> b() {
         return this.a;
      }
   }

   static record r(dgw a) implements dmw.u {
      @Override
      public dgw tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dmw.f {
      a;

      static final atc<dmw.s> c = atc.a(MapCodec.unit(a));

      @Override
      public atc<? extends dmw.f> a() {
         return c;
      }

      public dmw.e a(dmw.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, dvq e) implements dmw.f {
      static final atc<dmw.t> f = atc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dmw.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dmw.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dmw.t::d),
                     dvq.c.fieldOf("surface_type").forGetter(dmw.t::e)
                  )
                  .apply($$0, dmw.t::new)
         )
      );

      @Override
      public atc<? extends dmw.f> a() {
         return f;
      }

      public dmw.e a(final dmw.g $$0) {
         final boolean $$1 = this.e == dvq.a;

         class a extends dmw.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)ati.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dgw tryApply(int var1, int var2, int var3);
   }

   static enum v implements dmw.f {
      a;

      static final atc<dmw.v> c = atc.a(MapCodec.unit(a));

      @Override
      public atc<? extends dmw.f> a() {
         return c;
      }

      public dmw.e a(dmw.g $$0) {
         return $$0.f;
      }
   }

   static record w(dmw.e a, dmw.u b) implements dmw.u {
      @Nullable
      @Override
      public dgw tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dmw.f a, dmw.o c) implements dmw.o {
      static final atc<dmw.x> d = atc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dmw.f.b.fieldOf("if_true").forGetter(dmw.x::b), dmw.o.b.fieldOf("then_run").forGetter(dmw.x::c)).apply($$0, dmw.x::new)
         )
      );

      @Override
      public atc<? extends dmw.o> a() {
         return d;
      }

      public dmw.u a(dmw.g $$0) {
         return new dmw.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dmw.f b() {
         return this.a;
      }
   }

   static record y(agg a, dmz c, dmz d) implements dmw.f {
      static final atc<dmw.y> e = atc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     agg.a.fieldOf("random_name").forGetter(dmw.y::b),
                     dmz.a.fieldOf("true_at_and_below").forGetter(dmw.y::c),
                     dmz.a.fieldOf("false_at_and_above").forGetter(dmw.y::d)
                  )
                  .apply($$0, dmw.y::new)
         )
      );

      @Override
      public atc<? extends dmw.f> a() {
         return e;
      }

      public dmw.e a(final dmw.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dms $$3 = $$0.j.a(this.b());

         class a extends dmw.k {
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
                  double $$1 = ati.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  ato $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public agg b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dmw.f {
      static final atc<dmw.z> e = atc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dmw.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dmw.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dmw.z::d)
                  )
                  .apply($$0, dmw.z::new)
         )
      );

      @Override
      public atc<? extends dmw.f> a() {
         return e;
      }

      public dmw.e a(final dmw.g $$0) {
         class a extends dmw.k {
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
