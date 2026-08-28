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

public class ebb {
   public static final ebb.f a = a(0, false, ejw.b);
   public static final ebb.f b = a(0, true, ejw.b);
   public static final ebb.f c = a(0, true, 6, ejw.b);
   public static final ebb.f d = a(0, true, 30, ejw.b);
   public static final ebb.f e = a(0, false, ejw.a);
   public static final ebb.f f = a(0, true, ejw.a);

   public static ebb.f a(int $$0, boolean $$1, ejw $$2) {
      return new ebb.t($$0, $$1, 0, $$2);
   }

   public static ebb.f a(int $$0, boolean $$1, int $$2, ejw $$3) {
      return new ebb.t($$0, $$1, $$2, $$3);
   }

   public static ebb.f a(ebb.f $$0) {
      return new ebb.n($$0);
   }

   public static ebb.f a(ebe $$0, int $$1) {
      return new ebb.aa($$0, $$1, false);
   }

   public static ebb.f b(ebe $$0, int $$1) {
      return new ebb.aa($$0, $$1, true);
   }

   public static ebb.f a(int $$0, int $$1) {
      return new ebb.z($$0, $$1, false);
   }

   public static ebb.f b(int $$0, int $$1) {
      return new ebb.z($$0, $$1, true);
   }

   @SafeVarargs
   public static ebb.f a(alb<dfh>... $$0) {
      return a(List.of($$0));
   }

   private static ebb.c a(List<alb<dfh>> $$0) {
      return new ebb.c($$0);
   }

   public static ebb.f a(alb<eps.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static ebb.f a(alb<eps.a> $$0, double $$1, double $$2) {
      return new ebb.l($$0, $$1, $$2);
   }

   public static ebb.f a(String $$0, ebe $$1, ebe $$2) {
      return new ebb.y(alc.a($$0), $$1, $$2);
   }

   public static ebb.f a() {
      return ebb.s.a;
   }

   public static ebb.f b() {
      return ebb.h.a;
   }

   public static ebb.f c() {
      return ebb.a.a;
   }

   public static ebb.f d() {
      return ebb.v.a;
   }

   public static ebb.o a(ebb.f $$0, ebb.o $$1) {
      return new ebb.x($$0, $$1);
   }

   public static ebb.o a(ebb.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new ebb.q(Arrays.asList($$0));
      }
   }

   public static ebb.o a(duo $$0) {
      return new ebb.d($$0);
   }

   public static ebb.o e() {
      return ebb.b.a;
   }

   static <A> MapCodec<? extends A> a(ka<MapCodec<? extends A>> $$0, String $$1, ayw<? extends A> $$2) {
      return ka.a($$0, $$1, $$2.a());
   }

   static enum a implements ebb.f {
      a;

      static final ayw<ebb.a> c = ayw.a(MapCodec.unit(a));

      @Override
      public ayw<? extends ebb.f> a() {
         return c;
      }

      public ebb.e a(ebb.g $$0) {
         return $$0.i;
      }
   }

   static record aa(ebe a, int c, boolean d) implements ebb.f {
      static final ayw<ebb.aa> e = ayw.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ebe.a.fieldOf("anchor").forGetter(ebb.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ebb.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(ebb.aa::d)
                  )
                  .apply($$0, ebb.aa::new)
         )
      );

      @Override
      public ayw<? extends ebb.f> a() {
         return e;
      }

      public ebb.e a(final ebb.g $$0) {
         class a extends ebb.k {
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

      public ebe b() {
         return this.a;
      }
   }

   static enum b implements ebb.o {
      a;

      static final ayw<ebb.b> c = ayw.a(MapCodec.unit(a));

      @Override
      public ayw<? extends ebb.o> a() {
         return c;
      }

      public ebb.u a(ebb.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements ebb.f {
      static final ayw<ebb.c> a = ayw.a(alb.a(lv.aG).listOf().fieldOf("biome_is").xmap(ebb::a, $$0 -> $$0.c));
      private final List<alb<dfh>> c;
      final Predicate<alb<dfh>> d;

      c(List<alb<dfh>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public ayw<? extends ebb.f> a() {
         return a;
      }

      public ebb.e a(final ebb.g $$0) {
         class a extends ebb.k {
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
            return $$0 instanceof ebb.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(duo a, ebb.r c) implements ebb.o {
      static final ayw<ebb.d> d = ayw.a(duo.a.xmap(ebb.d::new, ebb.d::b).fieldOf("result_state"));

      d(duo $$0) {
         this($$0, new ebb.r($$0));
      }

      @Override
      public ayw<? extends ebb.o> a() {
         return d;
      }

      public ebb.u a(ebb.g $$0) {
         return this.c;
      }

      public duo b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<ebb.g, ebb.e> {
      Codec<ebb.f> b = lu.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ebb.f> a(ka<MapCodec<? extends ebb.f>> $$0) {
         ebb.a($$0, "biome", ebb.c.a);
         ebb.a($$0, "noise_threshold", ebb.l.e);
         ebb.a($$0, "vertical_gradient", ebb.y.e);
         ebb.a($$0, "y_above", ebb.aa.e);
         ebb.a($$0, "water", ebb.z.e);
         ebb.a($$0, "temperature", ebb.v.c);
         ebb.a($$0, "steep", ebb.s.c);
         ebb.a($$0, "not", ebb.n.c);
         ebb.a($$0, "hole", ebb.h.c);
         ebb.a($$0, "above_preliminary_surface", ebb.a.c);
         return ebb.a($$0, "stone_depth", ebb.t.f);
      }

      ayw<? extends ebb.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final ebc e;
      final ebb.e f = new ebb.g.d(this);
      final ebb.e g = new ebb.g.c(this);
      final ebb.e h = new ebb.g.b(this);
      final ebb.e i = new ebb.g.a();
      final eay j;
      final dwk k;
      private final eao l;
      private final Function<je, jn<dfh>> m;
      final ebh n;
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
      final je.a z = new je.a();
      Supplier<jn<dfh>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(ebc $$0, eay $$1, dwk $$2, eao $$3, Function<je, jn<dfh>> $$4, ka<dfh> $$5, ebh $$6) {
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
            long $$2 = ddm.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = azd.a(
               azd.a(
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

      final class a implements ebb.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends ebb.j {
         b(ebb.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends ebb.j {
         c(ebb.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dwk $$4 = this.c.k;
            int $$5 = $$4.a(eak.a.a, $$0, $$2);
            int $$6 = $$4.a(eak.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(eak.a.a, $$7, $$1);
               int $$10 = $$4.a(eak.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends ebb.k {
         d(ebb.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements ebb.f {
      a;

      static final ayw<ebb.h> c = ayw.a(MapCodec.unit(a));

      @Override
      public ayw<? extends ebb.f> a() {
         return c;
      }

      public ebb.e a(ebb.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements ebb.e {
      protected final ebb.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(ebb.g $$0) {
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

   abstract static class j extends ebb.i {
      protected j(ebb.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends ebb.i {
      protected k(ebb.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(alb<eps.a> a, double c, double d) implements ebb.f {
      static final ayw<ebb.l> e = ayw.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alb.a(lv.aQ).fieldOf("noise").forGetter(ebb.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(ebb.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(ebb.l::d)
                  )
                  .apply($$0, ebb.l::new)
         )
      );

      @Override
      public ayw<? extends ebb.f> a() {
         return e;
      }

      public ebb.e a(final ebb.g $$0) {
         final eps $$1 = $$0.j.a(this.a);

         class a extends ebb.j {
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

      public alb<eps.a> b() {
         return this.a;
      }
   }

   static record m(ebb.e a) implements ebb.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(ebb.f a) implements ebb.f {
      static final ayw<ebb.n> c = ayw.a(ebb.f.b.xmap(ebb.n::new, ebb.n::b).fieldOf("invert"));

      @Override
      public ayw<? extends ebb.f> a() {
         return c;
      }

      public ebb.e a(ebb.g $$0) {
         return new ebb.m(this.a.apply($$0));
      }

      public ebb.f b() {
         return this.a;
      }
   }

   public interface o extends Function<ebb.g, ebb.u> {
      Codec<ebb.o> b = lu.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ebb.o> a(ka<MapCodec<? extends ebb.o>> $$0) {
         ebb.a($$0, "bandlands", ebb.b.c);
         ebb.a($$0, "block", ebb.d.d);
         ebb.a($$0, "sequence", ebb.q.c);
         return ebb.a($$0, "condition", ebb.x.d);
      }

      ayw<? extends ebb.o> a();
   }

   static record p(List<ebb.u> a) implements ebb.u {
      @Nullable
      @Override
      public duo tryApply(int $$0, int $$1, int $$2) {
         for (ebb.u $$3 : this.a) {
            duo $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<ebb.o> a) implements ebb.o {
      static final ayw<ebb.q> c = ayw.a(ebb.o.b.listOf().xmap(ebb.q::new, ebb.q::b).fieldOf("sequence"));

      @Override
      public ayw<? extends ebb.o> a() {
         return c;
      }

      public ebb.u a(ebb.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<ebb.u> $$1 = ImmutableList.builder();

            for (ebb.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new ebb.p($$1.build());
         }
      }

      public List<ebb.o> b() {
         return this.a;
      }
   }

   static record r(duo a) implements ebb.u {
      @Override
      public duo tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements ebb.f {
      a;

      static final ayw<ebb.s> c = ayw.a(MapCodec.unit(a));

      @Override
      public ayw<? extends ebb.f> a() {
         return c;
      }

      public ebb.e a(ebb.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, ejw e) implements ebb.f {
      static final ayw<ebb.t> f = ayw.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(ebb.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(ebb.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(ebb.t::d),
                     ejw.c.fieldOf("surface_type").forGetter(ebb.t::e)
                  )
                  .apply($$0, ebb.t::new)
         )
      );

      @Override
      public ayw<? extends ebb.f> a() {
         return f;
      }

      public ebb.e a(final ebb.g $$0) {
         final boolean $$1 = this.e == ejw.a;

         class a extends ebb.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)azd.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      duo tryApply(int var1, int var2, int var3);
   }

   static enum v implements ebb.f {
      a;

      static final ayw<ebb.v> c = ayw.a(MapCodec.unit(a));

      @Override
      public ayw<? extends ebb.f> a() {
         return c;
      }

      public ebb.e a(ebb.g $$0) {
         return $$0.f;
      }
   }

   static record w(ebb.e a, ebb.u b) implements ebb.u {
      @Nullable
      @Override
      public duo tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(ebb.f a, ebb.o c) implements ebb.o {
      static final ayw<ebb.x> d = ayw.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(ebb.f.b.fieldOf("if_true").forGetter(ebb.x::b), ebb.o.b.fieldOf("then_run").forGetter(ebb.x::c)).apply($$0, ebb.x::new)
         )
      );

      @Override
      public ayw<? extends ebb.o> a() {
         return d;
      }

      public ebb.u a(ebb.g $$0) {
         return new ebb.w(this.a.apply($$0), this.c.apply($$0));
      }

      public ebb.f b() {
         return this.a;
      }
   }

   static record y(alc a, ebe c, ebe d) implements ebb.f {
      static final ayw<ebb.y> e = ayw.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alc.a.fieldOf("random_name").forGetter(ebb.y::b),
                     ebe.a.fieldOf("true_at_and_below").forGetter(ebb.y::c),
                     ebe.a.fieldOf("false_at_and_above").forGetter(ebb.y::d)
                  )
                  .apply($$0, ebb.y::new)
         )
      );

      @Override
      public ayw<? extends ebb.f> a() {
         return e;
      }

      public ebb.e a(final ebb.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final eax $$3 = $$0.j.a(this.b());

         class a extends ebb.k {
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
                  double $$1 = azd.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  azl $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public alc b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements ebb.f {
      static final ayw<ebb.z> e = ayw.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(ebb.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ebb.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(ebb.z::d)
                  )
                  .apply($$0, ebb.z::new)
         )
      );

      @Override
      public ayw<? extends ebb.f> a() {
         return e;
      }

      public ebb.e a(final ebb.g $$0) {
         class a extends ebb.k {
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
