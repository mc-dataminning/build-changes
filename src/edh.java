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

public class edh {
   public static final edh.f a = a(0, false, eme.b);
   public static final edh.f b = a(0, true, eme.b);
   public static final edh.f c = a(0, true, 6, eme.b);
   public static final edh.f d = a(0, true, 30, eme.b);
   public static final edh.f e = a(0, false, eme.a);
   public static final edh.f f = a(0, true, eme.a);

   public static edh.f a(int $$0, boolean $$1, eme $$2) {
      return new edh.t($$0, $$1, 0, $$2);
   }

   public static edh.f a(int $$0, boolean $$1, int $$2, eme $$3) {
      return new edh.t($$0, $$1, $$2, $$3);
   }

   public static edh.f a(edh.f $$0) {
      return new edh.n($$0);
   }

   public static edh.f a(edk $$0, int $$1) {
      return new edh.aa($$0, $$1, false);
   }

   public static edh.f b(edk $$0, int $$1) {
      return new edh.aa($$0, $$1, true);
   }

   public static edh.f a(int $$0, int $$1) {
      return new edh.z($$0, $$1, false);
   }

   public static edh.f b(int $$0, int $$1) {
      return new edh.z($$0, $$1, true);
   }

   @SafeVarargs
   public static edh.f a(akt<dhi>... $$0) {
      return a(List.of($$0));
   }

   private static edh.c a(List<akt<dhi>> $$0) {
      return new edh.c($$0);
   }

   public static edh.f a(akt<esa.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static edh.f a(akt<esa.a> $$0, double $$1, double $$2) {
      return new edh.l($$0, $$1, $$2);
   }

   public static edh.f a(String $$0, edk $$1, edk $$2) {
      return new edh.y(aku.a($$0), $$1, $$2);
   }

   public static edh.f a() {
      return edh.s.a;
   }

   public static edh.f b() {
      return edh.h.a;
   }

   public static edh.f c() {
      return edh.a.a;
   }

   public static edh.f d() {
      return edh.v.a;
   }

   public static edh.o a(edh.f $$0, edh.o $$1) {
      return new edh.x($$0, $$1);
   }

   public static edh.o a(edh.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new edh.q(Arrays.asList($$0));
      }
   }

   public static edh.o a(dwv $$0) {
      return new edh.d($$0);
   }

   public static edh.o e() {
      return edh.b.a;
   }

   static <A> MapCodec<? extends A> a(ke<MapCodec<? extends A>> $$0, String $$1, ayr<? extends A> $$2) {
      return ke.a($$0, $$1, $$2.a());
   }

   static enum a implements edh.f {
      a;

      static final ayr<edh.a> c = ayr.a(MapCodec.unit(a));

      @Override
      public ayr<? extends edh.f> a() {
         return c;
      }

      public edh.e a(edh.g $$0) {
         return $$0.i;
      }
   }

   static record aa(edk a, int c, boolean d) implements edh.f {
      static final ayr<edh.aa> e = ayr.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     edk.a.fieldOf("anchor").forGetter(edh.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(edh.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(edh.aa::d)
                  )
                  .apply($$0, edh.aa::new)
         )
      );

      @Override
      public ayr<? extends edh.f> a() {
         return e;
      }

      public edh.e a(final edh.g $$0) {
         class a extends edh.k {
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

      public edk b() {
         return this.a;
      }
   }

   static enum b implements edh.o {
      a;

      static final ayr<edh.b> c = ayr.a(MapCodec.unit(a));

      @Override
      public ayr<? extends edh.o> a() {
         return c;
      }

      public edh.u a(edh.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements edh.f {
      static final ayr<edh.c> a = ayr.a(akt.a(mc.aI).listOf().fieldOf("biome_is").xmap(edh::a, $$0 -> $$0.c));
      private final List<akt<dhi>> c;
      final Predicate<akt<dhi>> d;

      c(List<akt<dhi>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public ayr<? extends edh.f> a() {
         return a;
      }

      public edh.e a(final edh.g $$0) {
         class a extends edh.k {
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
            return $$0 instanceof edh.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dwv a, edh.r c) implements edh.o {
      static final ayr<edh.d> d = ayr.a(dwv.a.xmap(edh.d::new, edh.d::b).fieldOf("result_state"));

      d(dwv $$0) {
         this($$0, new edh.r($$0));
      }

      @Override
      public ayr<? extends edh.o> a() {
         return d;
      }

      public edh.u a(edh.g $$0) {
         return this.c;
      }

      public dwv b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<edh.g, edh.e> {
      Codec<edh.f> b = mb.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends edh.f> a(ke<MapCodec<? extends edh.f>> $$0) {
         edh.a($$0, "biome", edh.c.a);
         edh.a($$0, "noise_threshold", edh.l.e);
         edh.a($$0, "vertical_gradient", edh.y.e);
         edh.a($$0, "y_above", edh.aa.e);
         edh.a($$0, "water", edh.z.e);
         edh.a($$0, "temperature", edh.v.c);
         edh.a($$0, "steep", edh.s.c);
         edh.a($$0, "not", edh.n.c);
         edh.a($$0, "hole", edh.h.c);
         edh.a($$0, "above_preliminary_surface", edh.a.c);
         return edh.a($$0, "stone_depth", edh.t.f);
      }

      ayr<? extends edh.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final edi e;
      final edh.e f = new edh.g.d(this);
      final edh.e g = new edh.g.c(this);
      final edh.e h = new edh.g.b(this);
      final edh.e i = new edh.g.a();
      final ede j;
      final dyq k;
      private final ecu l;
      private final Function<ji, jr<dhi>> m;
      final edn n;
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
      Supplier<jr<dhi>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(edi $$0, ede $$1, dyq $$2, ecu $$3, Function<ji, jr<dhi>> $$4, ke<dhi> $$5, edn $$6) {
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
            long $$2 = dfm.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = ayy.a(
               ayy.a(
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

      final class a implements edh.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends edh.j {
         b(edh.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends edh.j {
         c(edh.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dyq $$4 = this.c.k;
            int $$5 = $$4.a(ecq.a.a, $$0, $$2);
            int $$6 = $$4.a(ecq.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(ecq.a.a, $$7, $$1);
               int $$10 = $$4.a(ecq.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends edh.k {
         d(edh.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements edh.f {
      a;

      static final ayr<edh.h> c = ayr.a(MapCodec.unit(a));

      @Override
      public ayr<? extends edh.f> a() {
         return c;
      }

      public edh.e a(edh.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements edh.e {
      protected final edh.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(edh.g $$0) {
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

   abstract static class j extends edh.i {
      protected j(edh.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends edh.i {
      protected k(edh.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(akt<esa.a> a, double c, double d) implements edh.f {
      static final ayr<edh.l> e = ayr.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     akt.a(mc.aS).fieldOf("noise").forGetter(edh.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(edh.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(edh.l::d)
                  )
                  .apply($$0, edh.l::new)
         )
      );

      @Override
      public ayr<? extends edh.f> a() {
         return e;
      }

      public edh.e a(final edh.g $$0) {
         final esa $$1 = $$0.j.a(this.a);

         class a extends edh.j {
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

      public akt<esa.a> b() {
         return this.a;
      }
   }

   static record m(edh.e a) implements edh.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(edh.f a) implements edh.f {
      static final ayr<edh.n> c = ayr.a(edh.f.b.xmap(edh.n::new, edh.n::b).fieldOf("invert"));

      @Override
      public ayr<? extends edh.f> a() {
         return c;
      }

      public edh.e a(edh.g $$0) {
         return new edh.m(this.a.apply($$0));
      }

      public edh.f b() {
         return this.a;
      }
   }

   public interface o extends Function<edh.g, edh.u> {
      Codec<edh.o> b = mb.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends edh.o> a(ke<MapCodec<? extends edh.o>> $$0) {
         edh.a($$0, "bandlands", edh.b.c);
         edh.a($$0, "block", edh.d.d);
         edh.a($$0, "sequence", edh.q.c);
         return edh.a($$0, "condition", edh.x.d);
      }

      ayr<? extends edh.o> a();
   }

   static record p(List<edh.u> a) implements edh.u {
      @Nullable
      @Override
      public dwv tryApply(int $$0, int $$1, int $$2) {
         for (edh.u $$3 : this.a) {
            dwv $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<edh.o> a) implements edh.o {
      static final ayr<edh.q> c = ayr.a(edh.o.b.listOf().xmap(edh.q::new, edh.q::b).fieldOf("sequence"));

      @Override
      public ayr<? extends edh.o> a() {
         return c;
      }

      public edh.u a(edh.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<edh.u> $$1 = ImmutableList.builder();

            for (edh.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new edh.p($$1.build());
         }
      }

      public List<edh.o> b() {
         return this.a;
      }
   }

   static record r(dwv a) implements edh.u {
      @Override
      public dwv tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements edh.f {
      a;

      static final ayr<edh.s> c = ayr.a(MapCodec.unit(a));

      @Override
      public ayr<? extends edh.f> a() {
         return c;
      }

      public edh.e a(edh.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, eme e) implements edh.f {
      static final ayr<edh.t> f = ayr.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(edh.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(edh.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(edh.t::d),
                     eme.c.fieldOf("surface_type").forGetter(edh.t::e)
                  )
                  .apply($$0, edh.t::new)
         )
      );

      @Override
      public ayr<? extends edh.f> a() {
         return f;
      }

      public edh.e a(final edh.g $$0) {
         final boolean $$1 = this.e == eme.a;

         class a extends edh.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)ayy.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dwv tryApply(int var1, int var2, int var3);
   }

   static enum v implements edh.f {
      a;

      static final ayr<edh.v> c = ayr.a(MapCodec.unit(a));

      @Override
      public ayr<? extends edh.f> a() {
         return c;
      }

      public edh.e a(edh.g $$0) {
         return $$0.f;
      }
   }

   static record w(edh.e a, edh.u b) implements edh.u {
      @Nullable
      @Override
      public dwv tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(edh.f a, edh.o c) implements edh.o {
      static final ayr<edh.x> d = ayr.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(edh.f.b.fieldOf("if_true").forGetter(edh.x::b), edh.o.b.fieldOf("then_run").forGetter(edh.x::c)).apply($$0, edh.x::new)
         )
      );

      @Override
      public ayr<? extends edh.o> a() {
         return d;
      }

      public edh.u a(edh.g $$0) {
         return new edh.w(this.a.apply($$0), this.c.apply($$0));
      }

      public edh.f b() {
         return this.a;
      }
   }

   static record y(aku a, edk c, edk d) implements edh.f {
      static final ayr<edh.y> e = ayr.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aku.a.fieldOf("random_name").forGetter(edh.y::b),
                     edk.a.fieldOf("true_at_and_below").forGetter(edh.y::c),
                     edk.a.fieldOf("false_at_and_above").forGetter(edh.y::d)
                  )
                  .apply($$0, edh.y::new)
         )
      );

      @Override
      public ayr<? extends edh.f> a() {
         return e;
      }

      public edh.e a(final edh.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final edd $$3 = $$0.j.a(this.b());

         class a extends edh.k {
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
                  double $$1 = ayy.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  azg $$2 = $$3.a(this.c.r, $$0, this.c.s);
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

   static record z(int a, int c, boolean d) implements edh.f {
      static final ayr<edh.z> e = ayr.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(edh.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(edh.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(edh.z::d)
                  )
                  .apply($$0, edh.z::new)
         )
      );

      @Override
      public ayr<? extends edh.f> a() {
         return e;
      }

      public edh.e a(final edh.g $$0) {
         class a extends edh.k {
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
