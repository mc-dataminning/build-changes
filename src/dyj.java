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

public class dyj {
   public static final dyj.f a = a(0, false, ehd.b);
   public static final dyj.f b = a(0, true, ehd.b);
   public static final dyj.f c = a(0, true, 6, ehd.b);
   public static final dyj.f d = a(0, true, 30, ehd.b);
   public static final dyj.f e = a(0, false, ehd.a);
   public static final dyj.f f = a(0, true, ehd.a);

   public static dyj.f a(int $$0, boolean $$1, ehd $$2) {
      return new dyj.t($$0, $$1, 0, $$2);
   }

   public static dyj.f a(int $$0, boolean $$1, int $$2, ehd $$3) {
      return new dyj.t($$0, $$1, $$2, $$3);
   }

   public static dyj.f a(dyj.f $$0) {
      return new dyj.n($$0);
   }

   public static dyj.f a(dym $$0, int $$1) {
      return new dyj.aa($$0, $$1, false);
   }

   public static dyj.f b(dym $$0, int $$1) {
      return new dyj.aa($$0, $$1, true);
   }

   public static dyj.f a(int $$0, int $$1) {
      return new dyj.z($$0, $$1, false);
   }

   public static dyj.f b(int $$0, int $$1) {
      return new dyj.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dyj.f a(ald<dcv>... $$0) {
      return a(List.of($$0));
   }

   private static dyj.c a(List<ald<dcv>> $$0) {
      return new dyj.c($$0);
   }

   public static dyj.f a(ald<emw.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dyj.f a(ald<emw.a> $$0, double $$1, double $$2) {
      return new dyj.l($$0, $$1, $$2);
   }

   public static dyj.f a(String $$0, dym $$1, dym $$2) {
      return new dyj.y(new ale($$0), $$1, $$2);
   }

   public static dyj.f a() {
      return dyj.s.a;
   }

   public static dyj.f b() {
      return dyj.h.a;
   }

   public static dyj.f c() {
      return dyj.a.a;
   }

   public static dyj.f d() {
      return dyj.v.a;
   }

   public static dyj.o a(dyj.f $$0, dyj.o $$1) {
      return new dyj.x($$0, $$1);
   }

   public static dyj.o a(dyj.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dyj.q(Arrays.asList($$0));
      }
   }

   public static dyj.o a(dsa $$0) {
      return new dyj.d($$0);
   }

   public static dyj.o e() {
      return dyj.b.a;
   }

   static <A> MapCodec<? extends A> a(jv<MapCodec<? extends A>> $$0, String $$1, ayq<? extends A> $$2) {
      return jv.a($$0, $$1, $$2.a());
   }

   static enum a implements dyj.f {
      a;

      static final ayq<dyj.a> c = ayq.a(MapCodec.unit(a));

      @Override
      public ayq<? extends dyj.f> a() {
         return c;
      }

      public dyj.e a(dyj.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dym a, int c, boolean d) implements dyj.f {
      static final ayq<dyj.aa> e = ayq.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dym.a.fieldOf("anchor").forGetter(dyj.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dyj.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dyj.aa::d)
                  )
                  .apply($$0, dyj.aa::new)
         )
      );

      @Override
      public ayq<? extends dyj.f> a() {
         return e;
      }

      public dyj.e a(final dyj.g $$0) {
         class a extends dyj.k {
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

      public dym b() {
         return this.a;
      }
   }

   static enum b implements dyj.o {
      a;

      static final ayq<dyj.b> c = ayq.a(MapCodec.unit(a));

      @Override
      public ayq<? extends dyj.o> a() {
         return c;
      }

      public dyj.u a(dyj.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dyj.f {
      static final ayq<dyj.c> a = ayq.a(ald.a(lq.az).listOf().fieldOf("biome_is").xmap(dyj::a, $$0 -> $$0.c));
      private final List<ald<dcv>> c;
      final Predicate<ald<dcv>> d;

      c(List<ald<dcv>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public ayq<? extends dyj.f> a() {
         return a;
      }

      public dyj.e a(final dyj.g $$0) {
         class a extends dyj.k {
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
            return $$0 instanceof dyj.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dsa a, dyj.r c) implements dyj.o {
      static final ayq<dyj.d> d = ayq.a(dsa.b.xmap(dyj.d::new, dyj.d::b).fieldOf("result_state"));

      d(dsa $$0) {
         this($$0, new dyj.r($$0));
      }

      @Override
      public ayq<? extends dyj.o> a() {
         return d;
      }

      public dyj.u a(dyj.g $$0) {
         return this.c;
      }

      public dsa b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dyj.g, dyj.e> {
      Codec<dyj.f> b = lp.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dyj.f> a(jv<MapCodec<? extends dyj.f>> $$0) {
         dyj.a($$0, "biome", dyj.c.a);
         dyj.a($$0, "noise_threshold", dyj.l.e);
         dyj.a($$0, "vertical_gradient", dyj.y.e);
         dyj.a($$0, "y_above", dyj.aa.e);
         dyj.a($$0, "water", dyj.z.e);
         dyj.a($$0, "temperature", dyj.v.c);
         dyj.a($$0, "steep", dyj.s.c);
         dyj.a($$0, "not", dyj.n.c);
         dyj.a($$0, "hole", dyj.h.c);
         dyj.a($$0, "above_preliminary_surface", dyj.a.c);
         return dyj.a($$0, "stone_depth", dyj.t.f);
      }

      ayq<? extends dyj.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dyk e;
      final dyj.e f = new dyj.g.d(this);
      final dyj.e g = new dyj.g.c(this);
      final dyj.e h = new dyj.g.b(this);
      final dyj.e i = new dyj.g.a();
      final dyg j;
      final dtw k;
      private final dxw l;
      private final Function<iz, ji<dcv>> m;
      final dyp n;
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
      Supplier<ji<dcv>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dyk $$0, dyg $$1, dtw $$2, dxw $$3, Function<iz, ji<dcv>> $$4, jv<dcv> $$5, dyp $$6) {
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
            long $$2 = dbd.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = ayx.a(
               ayx.a(
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

      final class a implements dyj.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dyj.j {
         b(dyj.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dyj.j {
         c(dyj.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dtw $$4 = this.c.k;
            int $$5 = $$4.a(dxs.a.a, $$0, $$2);
            int $$6 = $$4.a(dxs.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dxs.a.a, $$7, $$1);
               int $$10 = $$4.a(dxs.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dyj.k {
         d(dyj.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dyj.f {
      a;

      static final ayq<dyj.h> c = ayq.a(MapCodec.unit(a));

      @Override
      public ayq<? extends dyj.f> a() {
         return c;
      }

      public dyj.e a(dyj.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dyj.e {
      protected final dyj.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dyj.g $$0) {
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

   abstract static class j extends dyj.i {
      protected j(dyj.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dyj.i {
      protected k(dyj.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(ald<emw.a> a, double c, double d) implements dyj.f {
      static final ayq<dyj.l> e = ayq.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ald.a(lq.aH).fieldOf("noise").forGetter(dyj.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dyj.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dyj.l::d)
                  )
                  .apply($$0, dyj.l::new)
         )
      );

      @Override
      public ayq<? extends dyj.f> a() {
         return e;
      }

      public dyj.e a(final dyj.g $$0) {
         final emw $$1 = $$0.j.a(this.a);

         class a extends dyj.j {
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

      public ald<emw.a> b() {
         return this.a;
      }
   }

   static record m(dyj.e a) implements dyj.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dyj.f a) implements dyj.f {
      static final ayq<dyj.n> c = ayq.a(dyj.f.b.xmap(dyj.n::new, dyj.n::b).fieldOf("invert"));

      @Override
      public ayq<? extends dyj.f> a() {
         return c;
      }

      public dyj.e a(dyj.g $$0) {
         return new dyj.m(this.a.apply($$0));
      }

      public dyj.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dyj.g, dyj.u> {
      Codec<dyj.o> b = lp.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dyj.o> a(jv<MapCodec<? extends dyj.o>> $$0) {
         dyj.a($$0, "bandlands", dyj.b.c);
         dyj.a($$0, "block", dyj.d.d);
         dyj.a($$0, "sequence", dyj.q.c);
         return dyj.a($$0, "condition", dyj.x.d);
      }

      ayq<? extends dyj.o> a();
   }

   static record p(List<dyj.u> a) implements dyj.u {
      @Nullable
      @Override
      public dsa tryApply(int $$0, int $$1, int $$2) {
         for (dyj.u $$3 : this.a) {
            dsa $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dyj.o> a) implements dyj.o {
      static final ayq<dyj.q> c = ayq.a(dyj.o.b.listOf().xmap(dyj.q::new, dyj.q::b).fieldOf("sequence"));

      @Override
      public ayq<? extends dyj.o> a() {
         return c;
      }

      public dyj.u a(dyj.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dyj.u> $$1 = ImmutableList.builder();

            for (dyj.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dyj.p($$1.build());
         }
      }

      public List<dyj.o> b() {
         return this.a;
      }
   }

   static record r(dsa a) implements dyj.u {
      @Override
      public dsa tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dyj.f {
      a;

      static final ayq<dyj.s> c = ayq.a(MapCodec.unit(a));

      @Override
      public ayq<? extends dyj.f> a() {
         return c;
      }

      public dyj.e a(dyj.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, ehd e) implements dyj.f {
      static final ayq<dyj.t> f = ayq.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dyj.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dyj.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dyj.t::d),
                     ehd.c.fieldOf("surface_type").forGetter(dyj.t::e)
                  )
                  .apply($$0, dyj.t::new)
         )
      );

      @Override
      public ayq<? extends dyj.f> a() {
         return f;
      }

      public dyj.e a(final dyj.g $$0) {
         final boolean $$1 = this.e == ehd.a;

         class a extends dyj.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)ayx.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dsa tryApply(int var1, int var2, int var3);
   }

   static enum v implements dyj.f {
      a;

      static final ayq<dyj.v> c = ayq.a(MapCodec.unit(a));

      @Override
      public ayq<? extends dyj.f> a() {
         return c;
      }

      public dyj.e a(dyj.g $$0) {
         return $$0.f;
      }
   }

   static record w(dyj.e a, dyj.u b) implements dyj.u {
      @Nullable
      @Override
      public dsa tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dyj.f a, dyj.o c) implements dyj.o {
      static final ayq<dyj.x> d = ayq.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dyj.f.b.fieldOf("if_true").forGetter(dyj.x::b), dyj.o.b.fieldOf("then_run").forGetter(dyj.x::c)).apply($$0, dyj.x::new)
         )
      );

      @Override
      public ayq<? extends dyj.o> a() {
         return d;
      }

      public dyj.u a(dyj.g $$0) {
         return new dyj.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dyj.f b() {
         return this.a;
      }
   }

   static record y(ale a, dym c, dym d) implements dyj.f {
      static final ayq<dyj.y> e = ayq.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ale.a.fieldOf("random_name").forGetter(dyj.y::b),
                     dym.a.fieldOf("true_at_and_below").forGetter(dyj.y::c),
                     dym.a.fieldOf("false_at_and_above").forGetter(dyj.y::d)
                  )
                  .apply($$0, dyj.y::new)
         )
      );

      @Override
      public ayq<? extends dyj.f> a() {
         return e;
      }

      public dyj.e a(final dyj.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dyf $$3 = $$0.j.a(this.b());

         class a extends dyj.k {
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
                  double $$1 = ayx.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  azf $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public ale b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dyj.f {
      static final ayq<dyj.z> e = ayq.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dyj.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dyj.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dyj.z::d)
                  )
                  .apply($$0, dyj.z::new)
         )
      );

      @Override
      public ayq<? extends dyj.f> a() {
         return e;
      }

      public dyj.e a(final dyj.g $$0) {
         class a extends dyj.k {
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
