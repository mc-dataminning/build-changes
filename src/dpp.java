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

public class dpp {
   public static final dpp.f a = a(0, false, dyj.b);
   public static final dpp.f b = a(0, true, dyj.b);
   public static final dpp.f c = a(0, true, 6, dyj.b);
   public static final dpp.f d = a(0, true, 30, dyj.b);
   public static final dpp.f e = a(0, false, dyj.a);
   public static final dpp.f f = a(0, true, dyj.a);

   public static dpp.f a(int $$0, boolean $$1, dyj $$2) {
      return new dpp.t($$0, $$1, 0, $$2);
   }

   public static dpp.f a(int $$0, boolean $$1, int $$2, dyj $$3) {
      return new dpp.t($$0, $$1, $$2, $$3);
   }

   public static dpp.f a(dpp.f $$0) {
      return new dpp.n($$0);
   }

   public static dpp.f a(dps $$0, int $$1) {
      return new dpp.aa($$0, $$1, false);
   }

   public static dpp.f b(dps $$0, int $$1) {
      return new dpp.aa($$0, $$1, true);
   }

   public static dpp.f a(int $$0, int $$1) {
      return new dpp.z($$0, $$1, false);
   }

   public static dpp.f b(int $$0, int $$1) {
      return new dpp.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dpp.f a(ahg<cuw>... $$0) {
      return a(List.of($$0));
   }

   private static dpp.c a(List<ahg<cuw>> $$0) {
      return new dpp.c($$0);
   }

   public static dpp.f a(ahg<eec.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dpp.f a(ahg<eec.a> $$0, double $$1, double $$2) {
      return new dpp.l($$0, $$1, $$2);
   }

   public static dpp.f a(String $$0, dps $$1, dps $$2) {
      return new dpp.y(new ahh($$0), $$1, $$2);
   }

   public static dpp.f a() {
      return dpp.s.a;
   }

   public static dpp.f b() {
      return dpp.h.a;
   }

   public static dpp.f c() {
      return dpp.a.a;
   }

   public static dpp.f d() {
      return dpp.v.a;
   }

   public static dpp.o a(dpp.f $$0, dpp.o $$1) {
      return new dpp.x($$0, $$1);
   }

   public static dpp.o a(dpp.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dpp.q(Arrays.asList($$0));
      }
   }

   public static dpp.o a(djp $$0) {
      return new dpp.d($$0);
   }

   public static dpp.o e() {
      return dpp.b.a;
   }

   static <A> Codec<? extends A> a(it<Codec<? extends A>> $$0, String $$1, auj<? extends A> $$2) {
      return it.a($$0, $$1, $$2.a());
   }

   static enum a implements dpp.f {
      a;

      static final auj<dpp.a> c = auj.a(MapCodec.unit(a));

      @Override
      public auj<? extends dpp.f> a() {
         return c;
      }

      public dpp.e a(dpp.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dps a, int c, boolean d) implements dpp.f {
      static final auj<dpp.aa> e = auj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dps.a.fieldOf("anchor").forGetter(dpp.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dpp.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dpp.aa::d)
                  )
                  .apply($$0, dpp.aa::new)
         )
      );

      @Override
      public auj<? extends dpp.f> a() {
         return e;
      }

      public dpp.e a(final dpp.g $$0) {
         class a extends dpp.k {
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

      public dps b() {
         return this.a;
      }
   }

   static enum b implements dpp.o {
      a;

      static final auj<dpp.b> c = auj.a(MapCodec.unit(a));

      @Override
      public auj<? extends dpp.o> a() {
         return c;
      }

      public dpp.u a(dpp.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dpp.f {
      static final auj<dpp.c> a = auj.a(ahg.a(ke.at).listOf().fieldOf("biome_is").xmap(dpp::a, $$0 -> $$0.c));
      private final List<ahg<cuw>> c;
      final Predicate<ahg<cuw>> d;

      c(List<ahg<cuw>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public auj<? extends dpp.f> a() {
         return a;
      }

      public dpp.e a(final dpp.g $$0) {
         class a extends dpp.k {
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
            return $$0 instanceof dpp.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(djp a, dpp.r c) implements dpp.o {
      static final auj<dpp.d> d = auj.a(djp.b.xmap(dpp.d::new, dpp.d::b).fieldOf("result_state"));

      d(djp $$0) {
         this($$0, new dpp.r($$0));
      }

      @Override
      public auj<? extends dpp.o> a() {
         return d;
      }

      public dpp.u a(dpp.g $$0) {
         return this.c;
      }

      public djp b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dpp.g, dpp.e> {
      Codec<dpp.f> b = kd.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dpp.f> a(it<Codec<? extends dpp.f>> $$0) {
         dpp.a($$0, "biome", dpp.c.a);
         dpp.a($$0, "noise_threshold", dpp.l.e);
         dpp.a($$0, "vertical_gradient", dpp.y.e);
         dpp.a($$0, "y_above", dpp.aa.e);
         dpp.a($$0, "water", dpp.z.e);
         dpp.a($$0, "temperature", dpp.v.c);
         dpp.a($$0, "steep", dpp.s.c);
         dpp.a($$0, "not", dpp.n.c);
         dpp.a($$0, "hole", dpp.h.c);
         dpp.a($$0, "above_preliminary_surface", dpp.a.c);
         return dpp.a($$0, "stone_depth", dpp.t.f);
      }

      auj<? extends dpp.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dpq e;
      final dpp.e f = new dpp.g.d(this);
      final dpp.e g = new dpp.g.c(this);
      final dpp.e h = new dpp.g.b(this);
      final dpp.e i = new dpp.g.a();
      final dpm j;
      final dll k;
      private final dpc l;
      private final Function<hx, ih<cuw>> m;
      final dpv n;
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
      Supplier<ih<cuw>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dpq $$0, dpm $$1, dll $$2, dpc $$3, Function<hx, ih<cuw>> $$4, it<cuw> $$5, dpv $$6) {
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
            long $$2 = cte.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = aup.a(
               aup.a(
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

      final class a implements dpp.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dpp.j {
         b(dpp.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dpp.j {
         c(dpp.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dll $$4 = this.c.k;
            int $$5 = $$4.a(doy.a.a, $$0, $$2);
            int $$6 = $$4.a(doy.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(doy.a.a, $$7, $$1);
               int $$10 = $$4.a(doy.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dpp.k {
         d(dpp.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dpp.f {
      a;

      static final auj<dpp.h> c = auj.a(MapCodec.unit(a));

      @Override
      public auj<? extends dpp.f> a() {
         return c;
      }

      public dpp.e a(dpp.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dpp.e {
      protected final dpp.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dpp.g $$0) {
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

   abstract static class j extends dpp.i {
      protected j(dpp.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dpp.i {
      protected k(dpp.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(ahg<eec.a> a, double c, double d) implements dpp.f {
      static final auj<dpp.l> e = auj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ahg.a(ke.aB).fieldOf("noise").forGetter(dpp.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dpp.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dpp.l::d)
                  )
                  .apply($$0, dpp.l::new)
         )
      );

      @Override
      public auj<? extends dpp.f> a() {
         return e;
      }

      public dpp.e a(final dpp.g $$0) {
         final eec $$1 = $$0.j.a(this.a);

         class a extends dpp.j {
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

      public ahg<eec.a> b() {
         return this.a;
      }
   }

   static record m(dpp.e a) implements dpp.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dpp.f a) implements dpp.f {
      static final auj<dpp.n> c = auj.a(dpp.f.b.xmap(dpp.n::new, dpp.n::b).fieldOf("invert"));

      @Override
      public auj<? extends dpp.f> a() {
         return c;
      }

      public dpp.e a(dpp.g $$0) {
         return new dpp.m(this.a.apply($$0));
      }

      public dpp.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dpp.g, dpp.u> {
      Codec<dpp.o> b = kd.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dpp.o> a(it<Codec<? extends dpp.o>> $$0) {
         dpp.a($$0, "bandlands", dpp.b.c);
         dpp.a($$0, "block", dpp.d.d);
         dpp.a($$0, "sequence", dpp.q.c);
         return dpp.a($$0, "condition", dpp.x.d);
      }

      auj<? extends dpp.o> a();
   }

   static record p(List<dpp.u> a) implements dpp.u {
      @Nullable
      @Override
      public djp tryApply(int $$0, int $$1, int $$2) {
         for (dpp.u $$3 : this.a) {
            djp $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dpp.o> a) implements dpp.o {
      static final auj<dpp.q> c = auj.a(dpp.o.b.listOf().xmap(dpp.q::new, dpp.q::b).fieldOf("sequence"));

      @Override
      public auj<? extends dpp.o> a() {
         return c;
      }

      public dpp.u a(dpp.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dpp.u> $$1 = ImmutableList.builder();

            for (dpp.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dpp.p($$1.build());
         }
      }

      public List<dpp.o> b() {
         return this.a;
      }
   }

   static record r(djp a) implements dpp.u {
      @Override
      public djp tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dpp.f {
      a;

      static final auj<dpp.s> c = auj.a(MapCodec.unit(a));

      @Override
      public auj<? extends dpp.f> a() {
         return c;
      }

      public dpp.e a(dpp.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, dyj e) implements dpp.f {
      static final auj<dpp.t> f = auj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dpp.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dpp.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dpp.t::d),
                     dyj.c.fieldOf("surface_type").forGetter(dpp.t::e)
                  )
                  .apply($$0, dpp.t::new)
         )
      );

      @Override
      public auj<? extends dpp.f> a() {
         return f;
      }

      public dpp.e a(final dpp.g $$0) {
         final boolean $$1 = this.e == dyj.a;

         class a extends dpp.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)aup.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      djp tryApply(int var1, int var2, int var3);
   }

   static enum v implements dpp.f {
      a;

      static final auj<dpp.v> c = auj.a(MapCodec.unit(a));

      @Override
      public auj<? extends dpp.f> a() {
         return c;
      }

      public dpp.e a(dpp.g $$0) {
         return $$0.f;
      }
   }

   static record w(dpp.e a, dpp.u b) implements dpp.u {
      @Nullable
      @Override
      public djp tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dpp.f a, dpp.o c) implements dpp.o {
      static final auj<dpp.x> d = auj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dpp.f.b.fieldOf("if_true").forGetter(dpp.x::b), dpp.o.b.fieldOf("then_run").forGetter(dpp.x::c)).apply($$0, dpp.x::new)
         )
      );

      @Override
      public auj<? extends dpp.o> a() {
         return d;
      }

      public dpp.u a(dpp.g $$0) {
         return new dpp.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dpp.f b() {
         return this.a;
      }
   }

   static record y(ahh a, dps c, dps d) implements dpp.f {
      static final auj<dpp.y> e = auj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ahh.a.fieldOf("random_name").forGetter(dpp.y::b),
                     dps.a.fieldOf("true_at_and_below").forGetter(dpp.y::c),
                     dps.a.fieldOf("false_at_and_above").forGetter(dpp.y::d)
                  )
                  .apply($$0, dpp.y::new)
         )
      );

      @Override
      public auj<? extends dpp.f> a() {
         return e;
      }

      public dpp.e a(final dpp.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dpl $$3 = $$0.j.a(this.b());

         class a extends dpp.k {
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
                  double $$1 = aup.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  auw $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public ahh b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dpp.f {
      static final auj<dpp.z> e = auj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dpp.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dpp.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dpp.z::d)
                  )
                  .apply($$0, dpp.z::new)
         )
      );

      @Override
      public auj<? extends dpp.f> a() {
         return e;
      }

      public dpp.e a(final dpp.g $$0) {
         class a extends dpp.k {
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
