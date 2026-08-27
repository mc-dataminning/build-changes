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

public class dky {
   public static final dky.f a = a(0, false, dts.b);
   public static final dky.f b = a(0, true, dts.b);
   public static final dky.f c = a(0, true, 6, dts.b);
   public static final dky.f d = a(0, true, 30, dts.b);
   public static final dky.f e = a(0, false, dts.a);
   public static final dky.f f = a(0, true, dts.a);

   public static dky.f a(int $$0, boolean $$1, dts $$2) {
      return new dky.t($$0, $$1, 0, $$2);
   }

   public static dky.f a(int $$0, boolean $$1, int $$2, dts $$3) {
      return new dky.t($$0, $$1, $$2, $$3);
   }

   public static dky.f a(dky.f $$0) {
      return new dky.n($$0);
   }

   public static dky.f a(dlb $$0, int $$1) {
      return new dky.aa($$0, $$1, false);
   }

   public static dky.f b(dlb $$0, int $$1) {
      return new dky.aa($$0, $$1, true);
   }

   public static dky.f a(int $$0, int $$1) {
      return new dky.z($$0, $$1, false);
   }

   public static dky.f b(int $$0, int $$1) {
      return new dky.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dky.f a(aeo<cqi>... $$0) {
      return a(List.of($$0));
   }

   private static dky.c a(List<aeo<cqi>> $$0) {
      return new dky.c($$0);
   }

   public static dky.f a(aeo<dze.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dky.f a(aeo<dze.a> $$0, double $$1, double $$2) {
      return new dky.l($$0, $$1, $$2);
   }

   public static dky.f a(String $$0, dlb $$1, dlb $$2) {
      return new dky.y(new aep($$0), $$1, $$2);
   }

   public static dky.f a() {
      return dky.s.a;
   }

   public static dky.f b() {
      return dky.h.a;
   }

   public static dky.f c() {
      return dky.a.a;
   }

   public static dky.f d() {
      return dky.v.a;
   }

   public static dky.o a(dky.f $$0, dky.o $$1) {
      return new dky.x($$0, $$1);
   }

   public static dky.o a(dky.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dky.q(Arrays.asList($$0));
      }
   }

   public static dky.o a(dey $$0) {
      return new dky.d($$0);
   }

   public static dky.o e() {
      return dky.b.a;
   }

   static <A> Codec<? extends A> a(hs<Codec<? extends A>> $$0, String $$1, ari<? extends A> $$2) {
      return hs.a($$0, $$1, $$2.a());
   }

   static enum a implements dky.f {
      a;

      static final ari<dky.a> c = ari.a(MapCodec.unit(a));

      @Override
      public ari<? extends dky.f> a() {
         return c;
      }

      public dky.e a(dky.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dlb a, int c, boolean d) implements dky.f {
      static final ari<dky.aa> e = ari.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dlb.a.fieldOf("anchor").forGetter(dky.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dky.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dky.aa::d)
                  )
                  .apply($$0, dky.aa::new)
         )
      );

      @Override
      public ari<? extends dky.f> a() {
         return e;
      }

      public dky.e a(final dky.g $$0) {
         class a extends dky.k {
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

      public dlb b() {
         return this.a;
      }
   }

   static enum b implements dky.o {
      a;

      static final ari<dky.b> c = ari.a(MapCodec.unit(a));

      @Override
      public ari<? extends dky.o> a() {
         return c;
      }

      public dky.u a(dky.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dky.f {
      static final ari<dky.c> a = ari.a(aeo.a(jd.ap).listOf().fieldOf("biome_is").xmap(dky::a, $$0 -> $$0.c));
      private final List<aeo<cqi>> c;
      final Predicate<aeo<cqi>> d;

      c(List<aeo<cqi>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public ari<? extends dky.f> a() {
         return a;
      }

      public dky.e a(final dky.g $$0) {
         class a extends dky.k {
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
            return $$0 instanceof dky.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dey a, dky.r c) implements dky.o {
      static final ari<dky.d> d = ari.a(dey.b.xmap(dky.d::new, dky.d::b).fieldOf("result_state"));

      d(dey $$0) {
         this($$0, new dky.r($$0));
      }

      @Override
      public ari<? extends dky.o> a() {
         return d;
      }

      public dky.u a(dky.g $$0) {
         return this.c;
      }

      public dey b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dky.g, dky.e> {
      Codec<dky.f> b = jc.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dky.f> a(hs<Codec<? extends dky.f>> $$0) {
         dky.a($$0, "biome", dky.c.a);
         dky.a($$0, "noise_threshold", dky.l.e);
         dky.a($$0, "vertical_gradient", dky.y.e);
         dky.a($$0, "y_above", dky.aa.e);
         dky.a($$0, "water", dky.z.e);
         dky.a($$0, "temperature", dky.v.c);
         dky.a($$0, "steep", dky.s.c);
         dky.a($$0, "not", dky.n.c);
         dky.a($$0, "hole", dky.h.c);
         dky.a($$0, "above_preliminary_surface", dky.a.c);
         return dky.a($$0, "stone_depth", dky.t.f);
      }

      ari<? extends dky.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dkz e;
      final dky.e f = new dky.g.d(this);
      final dky.e g = new dky.g.c(this);
      final dky.e h = new dky.g.b(this);
      final dky.e i = new dky.g.a();
      final dkv j;
      final dgu k;
      private final dkl l;
      private final Function<gv, hf<cqi>> m;
      final dle n;
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
      final gv.a z = new gv.a();
      Supplier<hf<cqi>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dkz $$0, dkv $$1, dgu $$2, dkl $$3, Function<gv, hf<cqi>> $$4, hs<cqi> $$5, dle $$6) {
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
            long $$2 = cor.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = aro.a(
               aro.a(
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

      final class a implements dky.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dky.j {
         b(dky.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dky.j {
         c(dky.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dgu $$4 = this.c.k;
            int $$5 = $$4.a(dkh.a.a, $$0, $$2);
            int $$6 = $$4.a(dkh.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dkh.a.a, $$7, $$1);
               int $$10 = $$4.a(dkh.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dky.k {
         d(dky.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dky.f {
      a;

      static final ari<dky.h> c = ari.a(MapCodec.unit(a));

      @Override
      public ari<? extends dky.f> a() {
         return c;
      }

      public dky.e a(dky.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dky.e {
      protected final dky.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dky.g $$0) {
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

   abstract static class j extends dky.i {
      protected j(dky.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dky.i {
      protected k(dky.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(aeo<dze.a> a, double c, double d) implements dky.f {
      static final ari<dky.l> e = ari.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aeo.a(jd.ax).fieldOf("noise").forGetter(dky.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dky.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dky.l::d)
                  )
                  .apply($$0, dky.l::new)
         )
      );

      @Override
      public ari<? extends dky.f> a() {
         return e;
      }

      public dky.e a(final dky.g $$0) {
         final dze $$1 = $$0.j.a(this.a);

         class a extends dky.j {
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

      public aeo<dze.a> b() {
         return this.a;
      }
   }

   static record m(dky.e a) implements dky.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dky.f a) implements dky.f {
      static final ari<dky.n> c = ari.a(dky.f.b.xmap(dky.n::new, dky.n::b).fieldOf("invert"));

      @Override
      public ari<? extends dky.f> a() {
         return c;
      }

      public dky.e a(dky.g $$0) {
         return new dky.m(this.a.apply($$0));
      }

      public dky.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dky.g, dky.u> {
      Codec<dky.o> b = jc.af.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dky.o> a(hs<Codec<? extends dky.o>> $$0) {
         dky.a($$0, "bandlands", dky.b.c);
         dky.a($$0, "block", dky.d.d);
         dky.a($$0, "sequence", dky.q.c);
         return dky.a($$0, "condition", dky.x.d);
      }

      ari<? extends dky.o> a();
   }

   static record p(List<dky.u> a) implements dky.u {
      @Nullable
      @Override
      public dey tryApply(int $$0, int $$1, int $$2) {
         for (dky.u $$3 : this.a) {
            dey $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dky.o> a) implements dky.o {
      static final ari<dky.q> c = ari.a(dky.o.b.listOf().xmap(dky.q::new, dky.q::b).fieldOf("sequence"));

      @Override
      public ari<? extends dky.o> a() {
         return c;
      }

      public dky.u a(dky.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dky.u> $$1 = ImmutableList.builder();

            for (dky.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dky.p($$1.build());
         }
      }

      public List<dky.o> b() {
         return this.a;
      }
   }

   static record r(dey a) implements dky.u {
      @Override
      public dey tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dky.f {
      a;

      static final ari<dky.s> c = ari.a(MapCodec.unit(a));

      @Override
      public ari<? extends dky.f> a() {
         return c;
      }

      public dky.e a(dky.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, dts e) implements dky.f {
      static final ari<dky.t> f = ari.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dky.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dky.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dky.t::d),
                     dts.c.fieldOf("surface_type").forGetter(dky.t::e)
                  )
                  .apply($$0, dky.t::new)
         )
      );

      @Override
      public ari<? extends dky.f> a() {
         return f;
      }

      public dky.e a(final dky.g $$0) {
         final boolean $$1 = this.e == dts.a;

         class a extends dky.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)aro.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dey tryApply(int var1, int var2, int var3);
   }

   static enum v implements dky.f {
      a;

      static final ari<dky.v> c = ari.a(MapCodec.unit(a));

      @Override
      public ari<? extends dky.f> a() {
         return c;
      }

      public dky.e a(dky.g $$0) {
         return $$0.f;
      }
   }

   static record w(dky.e a, dky.u b) implements dky.u {
      @Nullable
      @Override
      public dey tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dky.f a, dky.o c) implements dky.o {
      static final ari<dky.x> d = ari.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dky.f.b.fieldOf("if_true").forGetter(dky.x::b), dky.o.b.fieldOf("then_run").forGetter(dky.x::c)).apply($$0, dky.x::new)
         )
      );

      @Override
      public ari<? extends dky.o> a() {
         return d;
      }

      public dky.u a(dky.g $$0) {
         return new dky.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dky.f b() {
         return this.a;
      }
   }

   static record y(aep a, dlb c, dlb d) implements dky.f {
      static final ari<dky.y> e = ari.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aep.a.fieldOf("random_name").forGetter(dky.y::b),
                     dlb.a.fieldOf("true_at_and_below").forGetter(dky.y::c),
                     dlb.a.fieldOf("false_at_and_above").forGetter(dky.y::d)
                  )
                  .apply($$0, dky.y::new)
         )
      );

      @Override
      public ari<? extends dky.f> a() {
         return e;
      }

      public dky.e a(final dky.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dku $$3 = $$0.j.a(this.b());

         class a extends dky.k {
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
                  double $$1 = aro.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  art $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public aep b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dky.f {
      static final ari<dky.z> e = ari.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dky.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dky.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dky.z::d)
                  )
                  .apply($$0, dky.z::new)
         )
      );

      @Override
      public ari<? extends dky.f> a() {
         return e;
      }

      public dky.e a(final dky.g $$0) {
         class a extends dky.k {
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
