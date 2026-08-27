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

public class drf {
   public static final drf.f a = a(0, false, dzz.b);
   public static final drf.f b = a(0, true, dzz.b);
   public static final drf.f c = a(0, true, 6, dzz.b);
   public static final drf.f d = a(0, true, 30, dzz.b);
   public static final drf.f e = a(0, false, dzz.a);
   public static final drf.f f = a(0, true, dzz.a);

   public static drf.f a(int $$0, boolean $$1, dzz $$2) {
      return new drf.t($$0, $$1, 0, $$2);
   }

   public static drf.f a(int $$0, boolean $$1, int $$2, dzz $$3) {
      return new drf.t($$0, $$1, $$2, $$3);
   }

   public static drf.f a(drf.f $$0) {
      return new drf.n($$0);
   }

   public static drf.f a(dri $$0, int $$1) {
      return new drf.aa($$0, $$1, false);
   }

   public static drf.f b(dri $$0, int $$1) {
      return new drf.aa($$0, $$1, true);
   }

   public static drf.f a(int $$0, int $$1) {
      return new drf.z($$0, $$1, false);
   }

   public static drf.f b(int $$0, int $$1) {
      return new drf.z($$0, $$1, true);
   }

   @SafeVarargs
   public static drf.f a(aix<cwm>... $$0) {
      return a(List.of($$0));
   }

   private static drf.c a(List<aix<cwm>> $$0) {
      return new drf.c($$0);
   }

   public static drf.f a(aix<efs.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static drf.f a(aix<efs.a> $$0, double $$1, double $$2) {
      return new drf.l($$0, $$1, $$2);
   }

   public static drf.f a(String $$0, dri $$1, dri $$2) {
      return new drf.y(new aiy($$0), $$1, $$2);
   }

   public static drf.f a() {
      return drf.s.a;
   }

   public static drf.f b() {
      return drf.h.a;
   }

   public static drf.f c() {
      return drf.a.a;
   }

   public static drf.f d() {
      return drf.v.a;
   }

   public static drf.o a(drf.f $$0, drf.o $$1) {
      return new drf.x($$0, $$1);
   }

   public static drf.o a(drf.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new drf.q(Arrays.asList($$0));
      }
   }

   public static drf.o a(dlf $$0) {
      return new drf.d($$0);
   }

   public static drf.o e() {
      return drf.b.a;
   }

   static <A> Codec<? extends A> a(iv<Codec<? extends A>> $$0, String $$1, awb<? extends A> $$2) {
      return iv.a($$0, $$1, $$2.a());
   }

   static enum a implements drf.f {
      a;

      static final awb<drf.a> c = awb.a(MapCodec.unit(a));

      @Override
      public awb<? extends drf.f> a() {
         return c;
      }

      public drf.e a(drf.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dri a, int c, boolean d) implements drf.f {
      static final awb<drf.aa> e = awb.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dri.a.fieldOf("anchor").forGetter(drf.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(drf.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(drf.aa::d)
                  )
                  .apply($$0, drf.aa::new)
         )
      );

      @Override
      public awb<? extends drf.f> a() {
         return e;
      }

      public drf.e a(final drf.g $$0) {
         class a extends drf.k {
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

      public dri b() {
         return this.a;
      }
   }

   static enum b implements drf.o {
      a;

      static final awb<drf.b> c = awb.a(MapCodec.unit(a));

      @Override
      public awb<? extends drf.o> a() {
         return c;
      }

      public drf.u a(drf.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements drf.f {
      static final awb<drf.c> a = awb.a(aix.a(kg.at).listOf().fieldOf("biome_is").xmap(drf::a, $$0 -> $$0.c));
      private final List<aix<cwm>> c;
      final Predicate<aix<cwm>> d;

      c(List<aix<cwm>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public awb<? extends drf.f> a() {
         return a;
      }

      public drf.e a(final drf.g $$0) {
         class a extends drf.k {
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
            return $$0 instanceof drf.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dlf a, drf.r c) implements drf.o {
      static final awb<drf.d> d = awb.a(dlf.b.xmap(drf.d::new, drf.d::b).fieldOf("result_state"));

      d(dlf $$0) {
         this($$0, new drf.r($$0));
      }

      @Override
      public awb<? extends drf.o> a() {
         return d;
      }

      public drf.u a(drf.g $$0) {
         return this.c;
      }

      public dlf b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<drf.g, drf.e> {
      Codec<drf.f> b = kf.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends drf.f> a(iv<Codec<? extends drf.f>> $$0) {
         drf.a($$0, "biome", drf.c.a);
         drf.a($$0, "noise_threshold", drf.l.e);
         drf.a($$0, "vertical_gradient", drf.y.e);
         drf.a($$0, "y_above", drf.aa.e);
         drf.a($$0, "water", drf.z.e);
         drf.a($$0, "temperature", drf.v.c);
         drf.a($$0, "steep", drf.s.c);
         drf.a($$0, "not", drf.n.c);
         drf.a($$0, "hole", drf.h.c);
         drf.a($$0, "above_preliminary_surface", drf.a.c);
         return drf.a($$0, "stone_depth", drf.t.f);
      }

      awb<? extends drf.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final drg e;
      final drf.e f = new drf.g.d(this);
      final drf.e g = new drf.g.c(this);
      final drf.e h = new drf.g.b(this);
      final drf.e i = new drf.g.a();
      final drc j;
      final dnb k;
      private final dqs l;
      private final Function<hz, ij<cwm>> m;
      final drl n;
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
      Supplier<ij<cwm>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(drg $$0, drc $$1, dnb $$2, dqs $$3, Function<hz, ij<cwm>> $$4, iv<cwm> $$5, drl $$6) {
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
            long $$2 = cuu.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = awh.a(
               awh.a(
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

      final class a implements drf.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends drf.j {
         b(drf.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends drf.j {
         c(drf.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dnb $$4 = this.c.k;
            int $$5 = $$4.a(dqo.a.a, $$0, $$2);
            int $$6 = $$4.a(dqo.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dqo.a.a, $$7, $$1);
               int $$10 = $$4.a(dqo.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends drf.k {
         d(drf.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements drf.f {
      a;

      static final awb<drf.h> c = awb.a(MapCodec.unit(a));

      @Override
      public awb<? extends drf.f> a() {
         return c;
      }

      public drf.e a(drf.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements drf.e {
      protected final drf.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(drf.g $$0) {
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

   abstract static class j extends drf.i {
      protected j(drf.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends drf.i {
      protected k(drf.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(aix<efs.a> a, double c, double d) implements drf.f {
      static final awb<drf.l> e = awb.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aix.a(kg.aB).fieldOf("noise").forGetter(drf.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(drf.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(drf.l::d)
                  )
                  .apply($$0, drf.l::new)
         )
      );

      @Override
      public awb<? extends drf.f> a() {
         return e;
      }

      public drf.e a(final drf.g $$0) {
         final efs $$1 = $$0.j.a(this.a);

         class a extends drf.j {
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

      public aix<efs.a> b() {
         return this.a;
      }
   }

   static record m(drf.e a) implements drf.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(drf.f a) implements drf.f {
      static final awb<drf.n> c = awb.a(drf.f.b.xmap(drf.n::new, drf.n::b).fieldOf("invert"));

      @Override
      public awb<? extends drf.f> a() {
         return c;
      }

      public drf.e a(drf.g $$0) {
         return new drf.m(this.a.apply($$0));
      }

      public drf.f b() {
         return this.a;
      }
   }

   public interface o extends Function<drf.g, drf.u> {
      Codec<drf.o> b = kf.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends drf.o> a(iv<Codec<? extends drf.o>> $$0) {
         drf.a($$0, "bandlands", drf.b.c);
         drf.a($$0, "block", drf.d.d);
         drf.a($$0, "sequence", drf.q.c);
         return drf.a($$0, "condition", drf.x.d);
      }

      awb<? extends drf.o> a();
   }

   static record p(List<drf.u> a) implements drf.u {
      @Nullable
      @Override
      public dlf tryApply(int $$0, int $$1, int $$2) {
         for (drf.u $$3 : this.a) {
            dlf $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<drf.o> a) implements drf.o {
      static final awb<drf.q> c = awb.a(drf.o.b.listOf().xmap(drf.q::new, drf.q::b).fieldOf("sequence"));

      @Override
      public awb<? extends drf.o> a() {
         return c;
      }

      public drf.u a(drf.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<drf.u> $$1 = ImmutableList.builder();

            for (drf.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new drf.p($$1.build());
         }
      }

      public List<drf.o> b() {
         return this.a;
      }
   }

   static record r(dlf a) implements drf.u {
      @Override
      public dlf tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements drf.f {
      a;

      static final awb<drf.s> c = awb.a(MapCodec.unit(a));

      @Override
      public awb<? extends drf.f> a() {
         return c;
      }

      public drf.e a(drf.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, dzz e) implements drf.f {
      static final awb<drf.t> f = awb.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(drf.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(drf.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(drf.t::d),
                     dzz.c.fieldOf("surface_type").forGetter(drf.t::e)
                  )
                  .apply($$0, drf.t::new)
         )
      );

      @Override
      public awb<? extends drf.f> a() {
         return f;
      }

      public drf.e a(final drf.g $$0) {
         final boolean $$1 = this.e == dzz.a;

         class a extends drf.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)awh.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dlf tryApply(int var1, int var2, int var3);
   }

   static enum v implements drf.f {
      a;

      static final awb<drf.v> c = awb.a(MapCodec.unit(a));

      @Override
      public awb<? extends drf.f> a() {
         return c;
      }

      public drf.e a(drf.g $$0) {
         return $$0.f;
      }
   }

   static record w(drf.e a, drf.u b) implements drf.u {
      @Nullable
      @Override
      public dlf tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(drf.f a, drf.o c) implements drf.o {
      static final awb<drf.x> d = awb.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(drf.f.b.fieldOf("if_true").forGetter(drf.x::b), drf.o.b.fieldOf("then_run").forGetter(drf.x::c)).apply($$0, drf.x::new)
         )
      );

      @Override
      public awb<? extends drf.o> a() {
         return d;
      }

      public drf.u a(drf.g $$0) {
         return new drf.w(this.a.apply($$0), this.c.apply($$0));
      }

      public drf.f b() {
         return this.a;
      }
   }

   static record y(aiy a, dri c, dri d) implements drf.f {
      static final awb<drf.y> e = awb.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aiy.a.fieldOf("random_name").forGetter(drf.y::b),
                     dri.a.fieldOf("true_at_and_below").forGetter(drf.y::c),
                     dri.a.fieldOf("false_at_and_above").forGetter(drf.y::d)
                  )
                  .apply($$0, drf.y::new)
         )
      );

      @Override
      public awb<? extends drf.f> a() {
         return e;
      }

      public drf.e a(final drf.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final drb $$3 = $$0.j.a(this.b());

         class a extends drf.k {
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
                  double $$1 = awh.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  awo $$2 = $$3.a(this.c.r, $$0, this.c.s);
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

   static record z(int a, int c, boolean d) implements drf.f {
      static final awb<drf.z> e = awb.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(drf.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(drf.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(drf.z::d)
                  )
                  .apply($$0, drf.z::new)
         )
      );

      @Override
      public awb<? extends drf.f> a() {
         return e;
      }

      public drf.e a(final drf.g $$0) {
         class a extends drf.k {
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
