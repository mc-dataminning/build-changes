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

public class edj {
   public static final edj.f a = a(0, false, emg.b);
   public static final edj.f b = a(0, true, emg.b);
   public static final edj.f c = a(0, true, 6, emg.b);
   public static final edj.f d = a(0, true, 30, emg.b);
   public static final edj.f e = a(0, false, emg.a);
   public static final edj.f f = a(0, true, emg.a);

   public static edj.f a(int $$0, boolean $$1, emg $$2) {
      return new edj.t($$0, $$1, 0, $$2);
   }

   public static edj.f a(int $$0, boolean $$1, int $$2, emg $$3) {
      return new edj.t($$0, $$1, $$2, $$3);
   }

   public static edj.f a(edj.f $$0) {
      return new edj.n($$0);
   }

   public static edj.f a(edm $$0, int $$1) {
      return new edj.aa($$0, $$1, false);
   }

   public static edj.f b(edm $$0, int $$1) {
      return new edj.aa($$0, $$1, true);
   }

   public static edj.f a(int $$0, int $$1) {
      return new edj.z($$0, $$1, false);
   }

   public static edj.f b(int $$0, int $$1) {
      return new edj.z($$0, $$1, true);
   }

   @SafeVarargs
   public static edj.f a(akt<dhk>... $$0) {
      return a(List.of($$0));
   }

   private static edj.c a(List<akt<dhk>> $$0) {
      return new edj.c($$0);
   }

   public static edj.f a(akt<esc.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static edj.f a(akt<esc.a> $$0, double $$1, double $$2) {
      return new edj.l($$0, $$1, $$2);
   }

   public static edj.f a(String $$0, edm $$1, edm $$2) {
      return new edj.y(aku.a($$0), $$1, $$2);
   }

   public static edj.f a() {
      return edj.s.a;
   }

   public static edj.f b() {
      return edj.h.a;
   }

   public static edj.f c() {
      return edj.a.a;
   }

   public static edj.f d() {
      return edj.v.a;
   }

   public static edj.o a(edj.f $$0, edj.o $$1) {
      return new edj.x($$0, $$1);
   }

   public static edj.o a(edj.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new edj.q(Arrays.asList($$0));
      }
   }

   public static edj.o a(dwx $$0) {
      return new edj.d($$0);
   }

   public static edj.o e() {
      return edj.b.a;
   }

   static <A> MapCodec<? extends A> a(ke<MapCodec<? extends A>> $$0, String $$1, ays<? extends A> $$2) {
      return ke.a($$0, $$1, $$2.a());
   }

   static enum a implements edj.f {
      a;

      static final ays<edj.a> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends edj.f> a() {
         return c;
      }

      public edj.e a(edj.g $$0) {
         return $$0.i;
      }
   }

   static record aa(edm a, int c, boolean d) implements edj.f {
      static final ays<edj.aa> e = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     edm.a.fieldOf("anchor").forGetter(edj.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(edj.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(edj.aa::d)
                  )
                  .apply($$0, edj.aa::new)
         )
      );

      @Override
      public ays<? extends edj.f> a() {
         return e;
      }

      public edj.e a(final edj.g $$0) {
         class a extends edj.k {
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

      public edm b() {
         return this.a;
      }
   }

   static enum b implements edj.o {
      a;

      static final ays<edj.b> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends edj.o> a() {
         return c;
      }

      public edj.u a(edj.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements edj.f {
      static final ays<edj.c> a = ays.a(akt.a(mc.aI).listOf().fieldOf("biome_is").xmap(edj::a, $$0 -> $$0.c));
      private final List<akt<dhk>> c;
      final Predicate<akt<dhk>> d;

      c(List<akt<dhk>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public ays<? extends edj.f> a() {
         return a;
      }

      public edj.e a(final edj.g $$0) {
         class a extends edj.k {
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
            return $$0 instanceof edj.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dwx a, edj.r c) implements edj.o {
      static final ays<edj.d> d = ays.a(dwx.a.xmap(edj.d::new, edj.d::b).fieldOf("result_state"));

      d(dwx $$0) {
         this($$0, new edj.r($$0));
      }

      @Override
      public ays<? extends edj.o> a() {
         return d;
      }

      public edj.u a(edj.g $$0) {
         return this.c;
      }

      public dwx b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<edj.g, edj.e> {
      Codec<edj.f> b = mb.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends edj.f> a(ke<MapCodec<? extends edj.f>> $$0) {
         edj.a($$0, "biome", edj.c.a);
         edj.a($$0, "noise_threshold", edj.l.e);
         edj.a($$0, "vertical_gradient", edj.y.e);
         edj.a($$0, "y_above", edj.aa.e);
         edj.a($$0, "water", edj.z.e);
         edj.a($$0, "temperature", edj.v.c);
         edj.a($$0, "steep", edj.s.c);
         edj.a($$0, "not", edj.n.c);
         edj.a($$0, "hole", edj.h.c);
         edj.a($$0, "above_preliminary_surface", edj.a.c);
         return edj.a($$0, "stone_depth", edj.t.f);
      }

      ays<? extends edj.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final edk e;
      final edj.e f = new edj.g.d(this);
      final edj.e g = new edj.g.c(this);
      final edj.e h = new edj.g.b(this);
      final edj.e i = new edj.g.a();
      final edg j;
      final dys k;
      private final ecw l;
      private final Function<ji, jr<dhk>> m;
      final edp n;
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
      final ji.a z = new ji.a();
      Supplier<jr<dhk>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(edk $$0, edg $$1, dys $$2, ecw $$3, Function<ji, jr<dhk>> $$4, ke<dhk> $$5, edp $$6) {
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

      public int b() {
         return this.e.a();
      }

      private static int a(int $$0) {
         return $$0 >> 4;
      }

      private static int b(int $$0) {
         return $$0 << 4;
      }

      protected int c() {
         if (this.w != this.q) {
            this.w = this.q;
            int $$0 = a(this.r);
            int $$1 = a(this.s);
            long $$2 = dfo.c($$0, $$1);
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

      final class a implements edj.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends edj.j {
         b(edj.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends edj.j {
         c(edj.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dys $$4 = this.c.k;
            int $$5 = $$4.a(ecs.a.a, $$0, $$2);
            int $$6 = $$4.a(ecs.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(ecs.a.a, $$7, $$1);
               int $$10 = $$4.a(ecs.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends edj.k {
         d(edj.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements edj.f {
      a;

      static final ays<edj.h> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends edj.f> a() {
         return c;
      }

      public edj.e a(edj.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements edj.e {
      protected final edj.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(edj.g $$0) {
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

   abstract static class j extends edj.i {
      protected j(edj.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends edj.i {
      protected k(edj.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(akt<esc.a> a, double c, double d) implements edj.f {
      static final ays<edj.l> e = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     akt.a(mc.aS).fieldOf("noise").forGetter(edj.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(edj.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(edj.l::d)
                  )
                  .apply($$0, edj.l::new)
         )
      );

      @Override
      public ays<? extends edj.f> a() {
         return e;
      }

      public edj.e a(final edj.g $$0) {
         final esc $$1 = $$0.j.a(this.a);

         class a extends edj.j {
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

      public akt<esc.a> b() {
         return this.a;
      }
   }

   static record m(edj.e a) implements edj.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(edj.f a) implements edj.f {
      static final ays<edj.n> c = ays.a(edj.f.b.xmap(edj.n::new, edj.n::b).fieldOf("invert"));

      @Override
      public ays<? extends edj.f> a() {
         return c;
      }

      public edj.e a(edj.g $$0) {
         return new edj.m(this.a.apply($$0));
      }

      public edj.f b() {
         return this.a;
      }
   }

   public interface o extends Function<edj.g, edj.u> {
      Codec<edj.o> b = mb.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends edj.o> a(ke<MapCodec<? extends edj.o>> $$0) {
         edj.a($$0, "bandlands", edj.b.c);
         edj.a($$0, "block", edj.d.d);
         edj.a($$0, "sequence", edj.q.c);
         return edj.a($$0, "condition", edj.x.d);
      }

      ays<? extends edj.o> a();
   }

   static record p(List<edj.u> a) implements edj.u {
      @Nullable
      @Override
      public dwx tryApply(int $$0, int $$1, int $$2) {
         for (edj.u $$3 : this.a) {
            dwx $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<edj.o> a) implements edj.o {
      static final ays<edj.q> c = ays.a(edj.o.b.listOf().xmap(edj.q::new, edj.q::b).fieldOf("sequence"));

      @Override
      public ays<? extends edj.o> a() {
         return c;
      }

      public edj.u a(edj.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<edj.u> $$1 = ImmutableList.builder();

            for (edj.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new edj.p($$1.build());
         }
      }

      public List<edj.o> b() {
         return this.a;
      }
   }

   static record r(dwx a) implements edj.u {
      @Override
      public dwx tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements edj.f {
      a;

      static final ays<edj.s> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends edj.f> a() {
         return c;
      }

      public edj.e a(edj.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, emg e) implements edj.f {
      static final ays<edj.t> f = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(edj.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(edj.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(edj.t::d),
                     emg.c.fieldOf("surface_type").forGetter(edj.t::e)
                  )
                  .apply($$0, edj.t::new)
         )
      );

      @Override
      public ays<? extends edj.f> a() {
         return f;
      }

      public edj.e a(final edj.g $$0) {
         final boolean $$1 = this.e == emg.a;

         class a extends edj.k {
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
      dwx tryApply(int var1, int var2, int var3);
   }

   static enum v implements edj.f {
      a;

      static final ays<edj.v> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends edj.f> a() {
         return c;
      }

      public edj.e a(edj.g $$0) {
         return $$0.f;
      }
   }

   static record w(edj.e a, edj.u b) implements edj.u {
      @Nullable
      @Override
      public dwx tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(edj.f a, edj.o c) implements edj.o {
      static final ays<edj.x> d = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(edj.f.b.fieldOf("if_true").forGetter(edj.x::b), edj.o.b.fieldOf("then_run").forGetter(edj.x::c)).apply($$0, edj.x::new)
         )
      );

      @Override
      public ays<? extends edj.o> a() {
         return d;
      }

      public edj.u a(edj.g $$0) {
         return new edj.w(this.a.apply($$0), this.c.apply($$0));
      }

      public edj.f b() {
         return this.a;
      }
   }

   static record y(aku a, edm c, edm d) implements edj.f {
      static final ays<edj.y> e = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aku.a.fieldOf("random_name").forGetter(edj.y::b),
                     edm.a.fieldOf("true_at_and_below").forGetter(edj.y::c),
                     edm.a.fieldOf("false_at_and_above").forGetter(edj.y::d)
                  )
                  .apply($$0, edj.y::new)
         )
      );

      @Override
      public ays<? extends edj.f> a() {
         return e;
      }

      public edj.e a(final edj.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final edf $$3 = $$0.j.a(this.b());

         class a extends edj.k {
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

      public aku b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements edj.f {
      static final ays<edj.z> e = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(edj.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(edj.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(edj.z::d)
                  )
                  .apply($$0, edj.z::new)
         )
      );

      @Override
      public ays<? extends edj.f> a() {
         return e;
      }

      public edj.e a(final edj.g $$0) {
         class a extends edj.k {
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
