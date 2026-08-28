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

public class ean {
   public static final ean.f a = a(0, false, eji.b);
   public static final ean.f b = a(0, true, eji.b);
   public static final ean.f c = a(0, true, 6, eji.b);
   public static final ean.f d = a(0, true, 30, eji.b);
   public static final ean.f e = a(0, false, eji.a);
   public static final ean.f f = a(0, true, eji.a);

   public static ean.f a(int $$0, boolean $$1, eji $$2) {
      return new ean.t($$0, $$1, 0, $$2);
   }

   public static ean.f a(int $$0, boolean $$1, int $$2, eji $$3) {
      return new ean.t($$0, $$1, $$2, $$3);
   }

   public static ean.f a(ean.f $$0) {
      return new ean.n($$0);
   }

   public static ean.f a(eaq $$0, int $$1) {
      return new ean.aa($$0, $$1, false);
   }

   public static ean.f b(eaq $$0, int $$1) {
      return new ean.aa($$0, $$1, true);
   }

   public static ean.f a(int $$0, int $$1) {
      return new ean.z($$0, $$1, false);
   }

   public static ean.f b(int $$0, int $$1) {
      return new ean.z($$0, $$1, true);
   }

   @SafeVarargs
   public static ean.f a(ala<det>... $$0) {
      return a(List.of($$0));
   }

   private static ean.c a(List<ala<det>> $$0) {
      return new ean.c($$0);
   }

   public static ean.f a(ala<epe.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static ean.f a(ala<epe.a> $$0, double $$1, double $$2) {
      return new ean.l($$0, $$1, $$2);
   }

   public static ean.f a(String $$0, eaq $$1, eaq $$2) {
      return new ean.y(alb.a($$0), $$1, $$2);
   }

   public static ean.f a() {
      return ean.s.a;
   }

   public static ean.f b() {
      return ean.h.a;
   }

   public static ean.f c() {
      return ean.a.a;
   }

   public static ean.f d() {
      return ean.v.a;
   }

   public static ean.o a(ean.f $$0, ean.o $$1) {
      return new ean.x($$0, $$1);
   }

   public static ean.o a(ean.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new ean.q(Arrays.asList($$0));
      }
   }

   public static ean.o a(dua $$0) {
      return new ean.d($$0);
   }

   public static ean.o e() {
      return ean.b.a;
   }

   static <A> MapCodec<? extends A> a(ka<MapCodec<? extends A>> $$0, String $$1, ayv<? extends A> $$2) {
      return ka.a($$0, $$1, $$2.a());
   }

   static enum a implements ean.f {
      a;

      static final ayv<ean.a> c = ayv.a(MapCodec.unit(a));

      @Override
      public ayv<? extends ean.f> a() {
         return c;
      }

      public ean.e a(ean.g $$0) {
         return $$0.i;
      }
   }

   static record aa(eaq a, int c, boolean d) implements ean.f {
      static final ayv<ean.aa> e = ayv.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     eaq.a.fieldOf("anchor").forGetter(ean.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ean.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(ean.aa::d)
                  )
                  .apply($$0, ean.aa::new)
         )
      );

      @Override
      public ayv<? extends ean.f> a() {
         return e;
      }

      public ean.e a(final ean.g $$0) {
         class a extends ean.k {
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

      public eaq b() {
         return this.a;
      }
   }

   static enum b implements ean.o {
      a;

      static final ayv<ean.b> c = ayv.a(MapCodec.unit(a));

      @Override
      public ayv<? extends ean.o> a() {
         return c;
      }

      public ean.u a(ean.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements ean.f {
      static final ayv<ean.c> a = ayv.a(ala.a(lv.aF).listOf().fieldOf("biome_is").xmap(ean::a, $$0 -> $$0.c));
      private final List<ala<det>> c;
      final Predicate<ala<det>> d;

      c(List<ala<det>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public ayv<? extends ean.f> a() {
         return a;
      }

      public ean.e a(final ean.g $$0) {
         class a extends ean.k {
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
            return $$0 instanceof ean.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dua a, ean.r c) implements ean.o {
      static final ayv<ean.d> d = ayv.a(dua.a.xmap(ean.d::new, ean.d::b).fieldOf("result_state"));

      d(dua $$0) {
         this($$0, new ean.r($$0));
      }

      @Override
      public ayv<? extends ean.o> a() {
         return d;
      }

      public ean.u a(ean.g $$0) {
         return this.c;
      }

      public dua b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<ean.g, ean.e> {
      Codec<ean.f> b = lu.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ean.f> a(ka<MapCodec<? extends ean.f>> $$0) {
         ean.a($$0, "biome", ean.c.a);
         ean.a($$0, "noise_threshold", ean.l.e);
         ean.a($$0, "vertical_gradient", ean.y.e);
         ean.a($$0, "y_above", ean.aa.e);
         ean.a($$0, "water", ean.z.e);
         ean.a($$0, "temperature", ean.v.c);
         ean.a($$0, "steep", ean.s.c);
         ean.a($$0, "not", ean.n.c);
         ean.a($$0, "hole", ean.h.c);
         ean.a($$0, "above_preliminary_surface", ean.a.c);
         return ean.a($$0, "stone_depth", ean.t.f);
      }

      ayv<? extends ean.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final eao e;
      final ean.e f = new ean.g.d(this);
      final ean.e g = new ean.g.c(this);
      final ean.e h = new ean.g.b(this);
      final ean.e i = new ean.g.a();
      final eak j;
      final dvw k;
      private final eaa l;
      private final Function<je, jn<det>> m;
      final eat n;
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
      Supplier<jn<det>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(eao $$0, eak $$1, dvw $$2, eaa $$3, Function<je, jn<det>> $$4, ka<det> $$5, eat $$6) {
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
            long $$2 = dcy.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = azc.a(
               azc.a(
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

      final class a implements ean.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends ean.j {
         b(ean.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends ean.j {
         c(ean.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dvw $$4 = this.c.k;
            int $$5 = $$4.a(dzw.a.a, $$0, $$2);
            int $$6 = $$4.a(dzw.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dzw.a.a, $$7, $$1);
               int $$10 = $$4.a(dzw.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends ean.k {
         d(ean.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements ean.f {
      a;

      static final ayv<ean.h> c = ayv.a(MapCodec.unit(a));

      @Override
      public ayv<? extends ean.f> a() {
         return c;
      }

      public ean.e a(ean.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements ean.e {
      protected final ean.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(ean.g $$0) {
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

   abstract static class j extends ean.i {
      protected j(ean.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends ean.i {
      protected k(ean.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(ala<epe.a> a, double c, double d) implements ean.f {
      static final ayv<ean.l> e = ayv.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ala.a(lv.aP).fieldOf("noise").forGetter(ean.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(ean.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(ean.l::d)
                  )
                  .apply($$0, ean.l::new)
         )
      );

      @Override
      public ayv<? extends ean.f> a() {
         return e;
      }

      public ean.e a(final ean.g $$0) {
         final epe $$1 = $$0.j.a(this.a);

         class a extends ean.j {
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

      public ala<epe.a> b() {
         return this.a;
      }
   }

   static record m(ean.e a) implements ean.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(ean.f a) implements ean.f {
      static final ayv<ean.n> c = ayv.a(ean.f.b.xmap(ean.n::new, ean.n::b).fieldOf("invert"));

      @Override
      public ayv<? extends ean.f> a() {
         return c;
      }

      public ean.e a(ean.g $$0) {
         return new ean.m(this.a.apply($$0));
      }

      public ean.f b() {
         return this.a;
      }
   }

   public interface o extends Function<ean.g, ean.u> {
      Codec<ean.o> b = lu.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ean.o> a(ka<MapCodec<? extends ean.o>> $$0) {
         ean.a($$0, "bandlands", ean.b.c);
         ean.a($$0, "block", ean.d.d);
         ean.a($$0, "sequence", ean.q.c);
         return ean.a($$0, "condition", ean.x.d);
      }

      ayv<? extends ean.o> a();
   }

   static record p(List<ean.u> a) implements ean.u {
      @Nullable
      @Override
      public dua tryApply(int $$0, int $$1, int $$2) {
         for (ean.u $$3 : this.a) {
            dua $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<ean.o> a) implements ean.o {
      static final ayv<ean.q> c = ayv.a(ean.o.b.listOf().xmap(ean.q::new, ean.q::b).fieldOf("sequence"));

      @Override
      public ayv<? extends ean.o> a() {
         return c;
      }

      public ean.u a(ean.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<ean.u> $$1 = ImmutableList.builder();

            for (ean.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new ean.p($$1.build());
         }
      }

      public List<ean.o> b() {
         return this.a;
      }
   }

   static record r(dua a) implements ean.u {
      @Override
      public dua tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements ean.f {
      a;

      static final ayv<ean.s> c = ayv.a(MapCodec.unit(a));

      @Override
      public ayv<? extends ean.f> a() {
         return c;
      }

      public ean.e a(ean.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, eji e) implements ean.f {
      static final ayv<ean.t> f = ayv.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(ean.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(ean.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(ean.t::d),
                     eji.c.fieldOf("surface_type").forGetter(ean.t::e)
                  )
                  .apply($$0, ean.t::new)
         )
      );

      @Override
      public ayv<? extends ean.f> a() {
         return f;
      }

      public ean.e a(final ean.g $$0) {
         final boolean $$1 = this.e == eji.a;

         class a extends ean.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)azc.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dua tryApply(int var1, int var2, int var3);
   }

   static enum v implements ean.f {
      a;

      static final ayv<ean.v> c = ayv.a(MapCodec.unit(a));

      @Override
      public ayv<? extends ean.f> a() {
         return c;
      }

      public ean.e a(ean.g $$0) {
         return $$0.f;
      }
   }

   static record w(ean.e a, ean.u b) implements ean.u {
      @Nullable
      @Override
      public dua tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(ean.f a, ean.o c) implements ean.o {
      static final ayv<ean.x> d = ayv.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(ean.f.b.fieldOf("if_true").forGetter(ean.x::b), ean.o.b.fieldOf("then_run").forGetter(ean.x::c)).apply($$0, ean.x::new)
         )
      );

      @Override
      public ayv<? extends ean.o> a() {
         return d;
      }

      public ean.u a(ean.g $$0) {
         return new ean.w(this.a.apply($$0), this.c.apply($$0));
      }

      public ean.f b() {
         return this.a;
      }
   }

   static record y(alb a, eaq c, eaq d) implements ean.f {
      static final ayv<ean.y> e = ayv.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alb.a.fieldOf("random_name").forGetter(ean.y::b),
                     eaq.a.fieldOf("true_at_and_below").forGetter(ean.y::c),
                     eaq.a.fieldOf("false_at_and_above").forGetter(ean.y::d)
                  )
                  .apply($$0, ean.y::new)
         )
      );

      @Override
      public ayv<? extends ean.f> a() {
         return e;
      }

      public ean.e a(final ean.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final eaj $$3 = $$0.j.a(this.b());

         class a extends ean.k {
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
                  double $$1 = azc.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  azk $$2 = $$3.a(this.c.r, $$0, this.c.s);
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

   static record z(int a, int c, boolean d) implements ean.f {
      static final ayv<ean.z> e = ayv.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(ean.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ean.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(ean.z::d)
                  )
                  .apply($$0, ean.z::new)
         )
      );

      @Override
      public ayv<? extends ean.f> a() {
         return e;
      }

      public ean.e a(final ean.g $$0) {
         class a extends ean.k {
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
