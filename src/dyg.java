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

public class dyg {
   public static final dyg.f a = a(0, false, eha.b);
   public static final dyg.f b = a(0, true, eha.b);
   public static final dyg.f c = a(0, true, 6, eha.b);
   public static final dyg.f d = a(0, true, 30, eha.b);
   public static final dyg.f e = a(0, false, eha.a);
   public static final dyg.f f = a(0, true, eha.a);

   public static dyg.f a(int $$0, boolean $$1, eha $$2) {
      return new dyg.t($$0, $$1, 0, $$2);
   }

   public static dyg.f a(int $$0, boolean $$1, int $$2, eha $$3) {
      return new dyg.t($$0, $$1, $$2, $$3);
   }

   public static dyg.f a(dyg.f $$0) {
      return new dyg.n($$0);
   }

   public static dyg.f a(dyj $$0, int $$1) {
      return new dyg.aa($$0, $$1, false);
   }

   public static dyg.f b(dyj $$0, int $$1) {
      return new dyg.aa($$0, $$1, true);
   }

   public static dyg.f a(int $$0, int $$1) {
      return new dyg.z($$0, $$1, false);
   }

   public static dyg.f b(int $$0, int $$1) {
      return new dyg.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dyg.f a(ala<dcs>... $$0) {
      return a(List.of($$0));
   }

   private static dyg.c a(List<ala<dcs>> $$0) {
      return new dyg.c($$0);
   }

   public static dyg.f a(ala<emt.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dyg.f a(ala<emt.a> $$0, double $$1, double $$2) {
      return new dyg.l($$0, $$1, $$2);
   }

   public static dyg.f a(String $$0, dyj $$1, dyj $$2) {
      return new dyg.y(new alb($$0), $$1, $$2);
   }

   public static dyg.f a() {
      return dyg.s.a;
   }

   public static dyg.f b() {
      return dyg.h.a;
   }

   public static dyg.f c() {
      return dyg.a.a;
   }

   public static dyg.f d() {
      return dyg.v.a;
   }

   public static dyg.o a(dyg.f $$0, dyg.o $$1) {
      return new dyg.x($$0, $$1);
   }

   public static dyg.o a(dyg.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dyg.q(Arrays.asList($$0));
      }
   }

   public static dyg.o a(drx $$0) {
      return new dyg.d($$0);
   }

   public static dyg.o e() {
      return dyg.b.a;
   }

   static <A> MapCodec<? extends A> a(jv<MapCodec<? extends A>> $$0, String $$1, ayn<? extends A> $$2) {
      return jv.a($$0, $$1, $$2.a());
   }

   static enum a implements dyg.f {
      a;

      static final ayn<dyg.a> c = ayn.a(MapCodec.unit(a));

      @Override
      public ayn<? extends dyg.f> a() {
         return c;
      }

      public dyg.e a(dyg.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dyj a, int c, boolean d) implements dyg.f {
      static final ayn<dyg.aa> e = ayn.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dyj.a.fieldOf("anchor").forGetter(dyg.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dyg.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dyg.aa::d)
                  )
                  .apply($$0, dyg.aa::new)
         )
      );

      @Override
      public ayn<? extends dyg.f> a() {
         return e;
      }

      public dyg.e a(final dyg.g $$0) {
         class a extends dyg.k {
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

      public dyj b() {
         return this.a;
      }
   }

   static enum b implements dyg.o {
      a;

      static final ayn<dyg.b> c = ayn.a(MapCodec.unit(a));

      @Override
      public ayn<? extends dyg.o> a() {
         return c;
      }

      public dyg.u a(dyg.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dyg.f {
      static final ayn<dyg.c> a = ayn.a(ala.a(lq.az).listOf().fieldOf("biome_is").xmap(dyg::a, $$0 -> $$0.c));
      private final List<ala<dcs>> c;
      final Predicate<ala<dcs>> d;

      c(List<ala<dcs>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public ayn<? extends dyg.f> a() {
         return a;
      }

      public dyg.e a(final dyg.g $$0) {
         class a extends dyg.k {
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
            return $$0 instanceof dyg.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(drx a, dyg.r c) implements dyg.o {
      static final ayn<dyg.d> d = ayn.a(drx.b.xmap(dyg.d::new, dyg.d::b).fieldOf("result_state"));

      d(drx $$0) {
         this($$0, new dyg.r($$0));
      }

      @Override
      public ayn<? extends dyg.o> a() {
         return d;
      }

      public dyg.u a(dyg.g $$0) {
         return this.c;
      }

      public drx b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dyg.g, dyg.e> {
      Codec<dyg.f> b = lp.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dyg.f> a(jv<MapCodec<? extends dyg.f>> $$0) {
         dyg.a($$0, "biome", dyg.c.a);
         dyg.a($$0, "noise_threshold", dyg.l.e);
         dyg.a($$0, "vertical_gradient", dyg.y.e);
         dyg.a($$0, "y_above", dyg.aa.e);
         dyg.a($$0, "water", dyg.z.e);
         dyg.a($$0, "temperature", dyg.v.c);
         dyg.a($$0, "steep", dyg.s.c);
         dyg.a($$0, "not", dyg.n.c);
         dyg.a($$0, "hole", dyg.h.c);
         dyg.a($$0, "above_preliminary_surface", dyg.a.c);
         return dyg.a($$0, "stone_depth", dyg.t.f);
      }

      ayn<? extends dyg.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dyh e;
      final dyg.e f = new dyg.g.d(this);
      final dyg.e g = new dyg.g.c(this);
      final dyg.e h = new dyg.g.b(this);
      final dyg.e i = new dyg.g.a();
      final dyd j;
      final dtt k;
      private final dxt l;
      private final Function<iz, ji<dcs>> m;
      final dym n;
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
      Supplier<ji<dcs>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dyh $$0, dyd $$1, dtt $$2, dxt $$3, Function<iz, ji<dcs>> $$4, jv<dcs> $$5, dym $$6) {
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
            long $$2 = dba.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = ayu.a(
               ayu.a(
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

      final class a implements dyg.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dyg.j {
         b(dyg.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dyg.j {
         c(dyg.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dtt $$4 = this.c.k;
            int $$5 = $$4.a(dxp.a.a, $$0, $$2);
            int $$6 = $$4.a(dxp.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dxp.a.a, $$7, $$1);
               int $$10 = $$4.a(dxp.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dyg.k {
         d(dyg.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dyg.f {
      a;

      static final ayn<dyg.h> c = ayn.a(MapCodec.unit(a));

      @Override
      public ayn<? extends dyg.f> a() {
         return c;
      }

      public dyg.e a(dyg.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dyg.e {
      protected final dyg.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dyg.g $$0) {
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

   abstract static class j extends dyg.i {
      protected j(dyg.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dyg.i {
      protected k(dyg.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(ala<emt.a> a, double c, double d) implements dyg.f {
      static final ayn<dyg.l> e = ayn.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ala.a(lq.aH).fieldOf("noise").forGetter(dyg.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dyg.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dyg.l::d)
                  )
                  .apply($$0, dyg.l::new)
         )
      );

      @Override
      public ayn<? extends dyg.f> a() {
         return e;
      }

      public dyg.e a(final dyg.g $$0) {
         final emt $$1 = $$0.j.a(this.a);

         class a extends dyg.j {
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

      public ala<emt.a> b() {
         return this.a;
      }
   }

   static record m(dyg.e a) implements dyg.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dyg.f a) implements dyg.f {
      static final ayn<dyg.n> c = ayn.a(dyg.f.b.xmap(dyg.n::new, dyg.n::b).fieldOf("invert"));

      @Override
      public ayn<? extends dyg.f> a() {
         return c;
      }

      public dyg.e a(dyg.g $$0) {
         return new dyg.m(this.a.apply($$0));
      }

      public dyg.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dyg.g, dyg.u> {
      Codec<dyg.o> b = lp.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dyg.o> a(jv<MapCodec<? extends dyg.o>> $$0) {
         dyg.a($$0, "bandlands", dyg.b.c);
         dyg.a($$0, "block", dyg.d.d);
         dyg.a($$0, "sequence", dyg.q.c);
         return dyg.a($$0, "condition", dyg.x.d);
      }

      ayn<? extends dyg.o> a();
   }

   static record p(List<dyg.u> a) implements dyg.u {
      @Nullable
      @Override
      public drx tryApply(int $$0, int $$1, int $$2) {
         for (dyg.u $$3 : this.a) {
            drx $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dyg.o> a) implements dyg.o {
      static final ayn<dyg.q> c = ayn.a(dyg.o.b.listOf().xmap(dyg.q::new, dyg.q::b).fieldOf("sequence"));

      @Override
      public ayn<? extends dyg.o> a() {
         return c;
      }

      public dyg.u a(dyg.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dyg.u> $$1 = ImmutableList.builder();

            for (dyg.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dyg.p($$1.build());
         }
      }

      public List<dyg.o> b() {
         return this.a;
      }
   }

   static record r(drx a) implements dyg.u {
      @Override
      public drx tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dyg.f {
      a;

      static final ayn<dyg.s> c = ayn.a(MapCodec.unit(a));

      @Override
      public ayn<? extends dyg.f> a() {
         return c;
      }

      public dyg.e a(dyg.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, eha e) implements dyg.f {
      static final ayn<dyg.t> f = ayn.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dyg.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dyg.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dyg.t::d),
                     eha.c.fieldOf("surface_type").forGetter(dyg.t::e)
                  )
                  .apply($$0, dyg.t::new)
         )
      );

      @Override
      public ayn<? extends dyg.f> a() {
         return f;
      }

      public dyg.e a(final dyg.g $$0) {
         final boolean $$1 = this.e == eha.a;

         class a extends dyg.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)ayu.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      drx tryApply(int var1, int var2, int var3);
   }

   static enum v implements dyg.f {
      a;

      static final ayn<dyg.v> c = ayn.a(MapCodec.unit(a));

      @Override
      public ayn<? extends dyg.f> a() {
         return c;
      }

      public dyg.e a(dyg.g $$0) {
         return $$0.f;
      }
   }

   static record w(dyg.e a, dyg.u b) implements dyg.u {
      @Nullable
      @Override
      public drx tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dyg.f a, dyg.o c) implements dyg.o {
      static final ayn<dyg.x> d = ayn.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dyg.f.b.fieldOf("if_true").forGetter(dyg.x::b), dyg.o.b.fieldOf("then_run").forGetter(dyg.x::c)).apply($$0, dyg.x::new)
         )
      );

      @Override
      public ayn<? extends dyg.o> a() {
         return d;
      }

      public dyg.u a(dyg.g $$0) {
         return new dyg.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dyg.f b() {
         return this.a;
      }
   }

   static record y(alb a, dyj c, dyj d) implements dyg.f {
      static final ayn<dyg.y> e = ayn.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alb.a.fieldOf("random_name").forGetter(dyg.y::b),
                     dyj.a.fieldOf("true_at_and_below").forGetter(dyg.y::c),
                     dyj.a.fieldOf("false_at_and_above").forGetter(dyg.y::d)
                  )
                  .apply($$0, dyg.y::new)
         )
      );

      @Override
      public ayn<? extends dyg.f> a() {
         return e;
      }

      public dyg.e a(final dyg.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dyc $$3 = $$0.j.a(this.b());

         class a extends dyg.k {
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
                  double $$1 = ayu.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  azc $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public alb b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dyg.f {
      static final ayn<dyg.z> e = ayn.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dyg.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dyg.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dyg.z::d)
                  )
                  .apply($$0, dyg.z::new)
         )
      );

      @Override
      public ayn<? extends dyg.f> a() {
         return e;
      }

      public dyg.e a(final dyg.g $$0) {
         class a extends dyg.k {
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
