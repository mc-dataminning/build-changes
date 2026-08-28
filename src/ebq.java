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

public class ebq {
   public static final ebq.f a = a(0, false, ekl.b);
   public static final ebq.f b = a(0, true, ekl.b);
   public static final ebq.f c = a(0, true, 6, ekl.b);
   public static final ebq.f d = a(0, true, 30, ekl.b);
   public static final ebq.f e = a(0, false, ekl.a);
   public static final ebq.f f = a(0, true, ekl.a);

   public static ebq.f a(int $$0, boolean $$1, ekl $$2) {
      return new ebq.t($$0, $$1, 0, $$2);
   }

   public static ebq.f a(int $$0, boolean $$1, int $$2, ekl $$3) {
      return new ebq.t($$0, $$1, $$2, $$3);
   }

   public static ebq.f a(ebq.f $$0) {
      return new ebq.n($$0);
   }

   public static ebq.f a(ebt $$0, int $$1) {
      return new ebq.aa($$0, $$1, false);
   }

   public static ebq.f b(ebt $$0, int $$1) {
      return new ebq.aa($$0, $$1, true);
   }

   public static ebq.f a(int $$0, int $$1) {
      return new ebq.z($$0, $$1, false);
   }

   public static ebq.f b(int $$0, int $$1) {
      return new ebq.z($$0, $$1, true);
   }

   @SafeVarargs
   public static ebq.f a(alg<dfw>... $$0) {
      return a(List.of($$0));
   }

   private static ebq.c a(List<alg<dfw>> $$0) {
      return new ebq.c($$0);
   }

   public static ebq.f a(alg<eqh.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static ebq.f a(alg<eqh.a> $$0, double $$1, double $$2) {
      return new ebq.l($$0, $$1, $$2);
   }

   public static ebq.f a(String $$0, ebt $$1, ebt $$2) {
      return new ebq.y(alh.a($$0), $$1, $$2);
   }

   public static ebq.f a() {
      return ebq.s.a;
   }

   public static ebq.f b() {
      return ebq.h.a;
   }

   public static ebq.f c() {
      return ebq.a.a;
   }

   public static ebq.f d() {
      return ebq.v.a;
   }

   public static ebq.o a(ebq.f $$0, ebq.o $$1) {
      return new ebq.x($$0, $$1);
   }

   public static ebq.o a(ebq.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new ebq.q(Arrays.asList($$0));
      }
   }

   public static ebq.o a(dvd $$0) {
      return new ebq.d($$0);
   }

   public static ebq.o e() {
      return ebq.b.a;
   }

   static <A> MapCodec<? extends A> a(kc<MapCodec<? extends A>> $$0, String $$1, azc<? extends A> $$2) {
      return kc.a($$0, $$1, $$2.a());
   }

   static enum a implements ebq.f {
      a;

      static final azc<ebq.a> c = azc.a(MapCodec.unit(a));

      @Override
      public azc<? extends ebq.f> a() {
         return c;
      }

      public ebq.e a(ebq.g $$0) {
         return $$0.i;
      }
   }

   static record aa(ebt a, int c, boolean d) implements ebq.f {
      static final azc<ebq.aa> e = azc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ebt.a.fieldOf("anchor").forGetter(ebq.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ebq.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(ebq.aa::d)
                  )
                  .apply($$0, ebq.aa::new)
         )
      );

      @Override
      public azc<? extends ebq.f> a() {
         return e;
      }

      public ebq.e a(final ebq.g $$0) {
         class a extends ebq.k {
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

      public ebt b() {
         return this.a;
      }
   }

   static enum b implements ebq.o {
      a;

      static final azc<ebq.b> c = azc.a(MapCodec.unit(a));

      @Override
      public azc<? extends ebq.o> a() {
         return c;
      }

      public ebq.u a(ebq.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements ebq.f {
      static final azc<ebq.c> a = azc.a(alg.a(ly.aG).listOf().fieldOf("biome_is").xmap(ebq::a, $$0 -> $$0.c));
      private final List<alg<dfw>> c;
      final Predicate<alg<dfw>> d;

      c(List<alg<dfw>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public azc<? extends ebq.f> a() {
         return a;
      }

      public ebq.e a(final ebq.g $$0) {
         class a extends ebq.k {
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
            return $$0 instanceof ebq.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dvd a, ebq.r c) implements ebq.o {
      static final azc<ebq.d> d = azc.a(dvd.a.xmap(ebq.d::new, ebq.d::b).fieldOf("result_state"));

      d(dvd $$0) {
         this($$0, new ebq.r($$0));
      }

      @Override
      public azc<? extends ebq.o> a() {
         return d;
      }

      public ebq.u a(ebq.g $$0) {
         return this.c;
      }

      public dvd b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<ebq.g, ebq.e> {
      Codec<ebq.f> b = lx.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ebq.f> a(kc<MapCodec<? extends ebq.f>> $$0) {
         ebq.a($$0, "biome", ebq.c.a);
         ebq.a($$0, "noise_threshold", ebq.l.e);
         ebq.a($$0, "vertical_gradient", ebq.y.e);
         ebq.a($$0, "y_above", ebq.aa.e);
         ebq.a($$0, "water", ebq.z.e);
         ebq.a($$0, "temperature", ebq.v.c);
         ebq.a($$0, "steep", ebq.s.c);
         ebq.a($$0, "not", ebq.n.c);
         ebq.a($$0, "hole", ebq.h.c);
         ebq.a($$0, "above_preliminary_surface", ebq.a.c);
         return ebq.a($$0, "stone_depth", ebq.t.f);
      }

      azc<? extends ebq.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final ebr e;
      final ebq.e f = new ebq.g.d(this);
      final ebq.e g = new ebq.g.c(this);
      final ebq.e h = new ebq.g.b(this);
      final ebq.e i = new ebq.g.a();
      final ebn j;
      final dwz k;
      private final ebd l;
      private final Function<jg, jp<dfw>> m;
      final ebw n;
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
      final jg.a z = new jg.a();
      Supplier<jp<dfw>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(ebr $$0, ebn $$1, dwz $$2, ebd $$3, Function<jg, jp<dfw>> $$4, kc<dfw> $$5, ebw $$6) {
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
            long $$2 = deb.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = azj.a(
               azj.a(
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

      final class a implements ebq.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends ebq.j {
         b(ebq.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends ebq.j {
         c(ebq.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dwz $$4 = this.c.k;
            int $$5 = $$4.a(eaz.a.a, $$0, $$2);
            int $$6 = $$4.a(eaz.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(eaz.a.a, $$7, $$1);
               int $$10 = $$4.a(eaz.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends ebq.k {
         d(ebq.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements ebq.f {
      a;

      static final azc<ebq.h> c = azc.a(MapCodec.unit(a));

      @Override
      public azc<? extends ebq.f> a() {
         return c;
      }

      public ebq.e a(ebq.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements ebq.e {
      protected final ebq.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(ebq.g $$0) {
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

   abstract static class j extends ebq.i {
      protected j(ebq.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends ebq.i {
      protected k(ebq.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(alg<eqh.a> a, double c, double d) implements ebq.f {
      static final azc<ebq.l> e = azc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alg.a(ly.aQ).fieldOf("noise").forGetter(ebq.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(ebq.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(ebq.l::d)
                  )
                  .apply($$0, ebq.l::new)
         )
      );

      @Override
      public azc<? extends ebq.f> a() {
         return e;
      }

      public ebq.e a(final ebq.g $$0) {
         final eqh $$1 = $$0.j.a(this.a);

         class a extends ebq.j {
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

      public alg<eqh.a> b() {
         return this.a;
      }
   }

   static record m(ebq.e a) implements ebq.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(ebq.f a) implements ebq.f {
      static final azc<ebq.n> c = azc.a(ebq.f.b.xmap(ebq.n::new, ebq.n::b).fieldOf("invert"));

      @Override
      public azc<? extends ebq.f> a() {
         return c;
      }

      public ebq.e a(ebq.g $$0) {
         return new ebq.m(this.a.apply($$0));
      }

      public ebq.f b() {
         return this.a;
      }
   }

   public interface o extends Function<ebq.g, ebq.u> {
      Codec<ebq.o> b = lx.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ebq.o> a(kc<MapCodec<? extends ebq.o>> $$0) {
         ebq.a($$0, "bandlands", ebq.b.c);
         ebq.a($$0, "block", ebq.d.d);
         ebq.a($$0, "sequence", ebq.q.c);
         return ebq.a($$0, "condition", ebq.x.d);
      }

      azc<? extends ebq.o> a();
   }

   static record p(List<ebq.u> a) implements ebq.u {
      @Nullable
      @Override
      public dvd tryApply(int $$0, int $$1, int $$2) {
         for (ebq.u $$3 : this.a) {
            dvd $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<ebq.o> a) implements ebq.o {
      static final azc<ebq.q> c = azc.a(ebq.o.b.listOf().xmap(ebq.q::new, ebq.q::b).fieldOf("sequence"));

      @Override
      public azc<? extends ebq.o> a() {
         return c;
      }

      public ebq.u a(ebq.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<ebq.u> $$1 = ImmutableList.builder();

            for (ebq.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new ebq.p($$1.build());
         }
      }

      public List<ebq.o> b() {
         return this.a;
      }
   }

   static record r(dvd a) implements ebq.u {
      @Override
      public dvd tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements ebq.f {
      a;

      static final azc<ebq.s> c = azc.a(MapCodec.unit(a));

      @Override
      public azc<? extends ebq.f> a() {
         return c;
      }

      public ebq.e a(ebq.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, ekl e) implements ebq.f {
      static final azc<ebq.t> f = azc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(ebq.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(ebq.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(ebq.t::d),
                     ekl.c.fieldOf("surface_type").forGetter(ebq.t::e)
                  )
                  .apply($$0, ebq.t::new)
         )
      );

      @Override
      public azc<? extends ebq.f> a() {
         return f;
      }

      public ebq.e a(final ebq.g $$0) {
         final boolean $$1 = this.e == ekl.a;

         class a extends ebq.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)azj.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dvd tryApply(int var1, int var2, int var3);
   }

   static enum v implements ebq.f {
      a;

      static final azc<ebq.v> c = azc.a(MapCodec.unit(a));

      @Override
      public azc<? extends ebq.f> a() {
         return c;
      }

      public ebq.e a(ebq.g $$0) {
         return $$0.f;
      }
   }

   static record w(ebq.e a, ebq.u b) implements ebq.u {
      @Nullable
      @Override
      public dvd tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(ebq.f a, ebq.o c) implements ebq.o {
      static final azc<ebq.x> d = azc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(ebq.f.b.fieldOf("if_true").forGetter(ebq.x::b), ebq.o.b.fieldOf("then_run").forGetter(ebq.x::c)).apply($$0, ebq.x::new)
         )
      );

      @Override
      public azc<? extends ebq.o> a() {
         return d;
      }

      public ebq.u a(ebq.g $$0) {
         return new ebq.w(this.a.apply($$0), this.c.apply($$0));
      }

      public ebq.f b() {
         return this.a;
      }
   }

   static record y(alh a, ebt c, ebt d) implements ebq.f {
      static final azc<ebq.y> e = azc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alh.a.fieldOf("random_name").forGetter(ebq.y::b),
                     ebt.a.fieldOf("true_at_and_below").forGetter(ebq.y::c),
                     ebt.a.fieldOf("false_at_and_above").forGetter(ebq.y::d)
                  )
                  .apply($$0, ebq.y::new)
         )
      );

      @Override
      public azc<? extends ebq.f> a() {
         return e;
      }

      public ebq.e a(final ebq.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final ebm $$3 = $$0.j.a(this.b());

         class a extends ebq.k {
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
                  double $$1 = azj.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  azr $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public alh b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements ebq.f {
      static final azc<ebq.z> e = azc.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(ebq.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ebq.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(ebq.z::d)
                  )
                  .apply($$0, ebq.z::new)
         )
      );

      @Override
      public azc<? extends ebq.f> a() {
         return e;
      }

      public ebq.e a(final ebq.g $$0) {
         class a extends ebq.k {
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
