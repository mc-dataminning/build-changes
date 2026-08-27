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

public class dvi {
   public static final dvi.f a = a(0, false, eec.b);
   public static final dvi.f b = a(0, true, eec.b);
   public static final dvi.f c = a(0, true, 6, eec.b);
   public static final dvi.f d = a(0, true, 30, eec.b);
   public static final dvi.f e = a(0, false, eec.a);
   public static final dvi.f f = a(0, true, eec.a);

   public static dvi.f a(int $$0, boolean $$1, eec $$2) {
      return new dvi.t($$0, $$1, 0, $$2);
   }

   public static dvi.f a(int $$0, boolean $$1, int $$2, eec $$3) {
      return new dvi.t($$0, $$1, $$2, $$3);
   }

   public static dvi.f a(dvi.f $$0) {
      return new dvi.n($$0);
   }

   public static dvi.f a(dvl $$0, int $$1) {
      return new dvi.aa($$0, $$1, false);
   }

   public static dvi.f b(dvl $$0, int $$1) {
      return new dvi.aa($$0, $$1, true);
   }

   public static dvi.f a(int $$0, int $$1) {
      return new dvi.z($$0, $$1, false);
   }

   public static dvi.f b(int $$0, int $$1) {
      return new dvi.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dvi.f a(ajs<czw>... $$0) {
      return a(List.of($$0));
   }

   private static dvi.c a(List<ajs<czw>> $$0) {
      return new dvi.c($$0);
   }

   public static dvi.f a(ajs<ejv.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dvi.f a(ajs<ejv.a> $$0, double $$1, double $$2) {
      return new dvi.l($$0, $$1, $$2);
   }

   public static dvi.f a(String $$0, dvl $$1, dvl $$2) {
      return new dvi.y(new ajt($$0), $$1, $$2);
   }

   public static dvi.f a() {
      return dvi.s.a;
   }

   public static dvi.f b() {
      return dvi.h.a;
   }

   public static dvi.f c() {
      return dvi.a.a;
   }

   public static dvi.f d() {
      return dvi.v.a;
   }

   public static dvi.o a(dvi.f $$0, dvi.o $$1) {
      return new dvi.x($$0, $$1);
   }

   public static dvi.o a(dvi.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dvi.q(Arrays.asList($$0));
      }
   }

   public static dvi.o a(doz $$0) {
      return new dvi.d($$0);
   }

   public static dvi.o e() {
      return dvi.b.a;
   }

   static <A> Codec<? extends A> a(iy<Codec<? extends A>> $$0, String $$1, axe<? extends A> $$2) {
      return iy.a($$0, $$1, $$2.a());
   }

   static enum a implements dvi.f {
      a;

      static final axe<dvi.a> c = axe.a(MapCodec.unit(a));

      @Override
      public axe<? extends dvi.f> a() {
         return c;
      }

      public dvi.e a(dvi.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dvl a, int c, boolean d) implements dvi.f {
      static final axe<dvi.aa> e = axe.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dvl.a.fieldOf("anchor").forGetter(dvi.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dvi.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dvi.aa::d)
                  )
                  .apply($$0, dvi.aa::new)
         )
      );

      @Override
      public axe<? extends dvi.f> a() {
         return e;
      }

      public dvi.e a(final dvi.g $$0) {
         class a extends dvi.k {
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

      public dvl b() {
         return this.a;
      }
   }

   static enum b implements dvi.o {
      a;

      static final axe<dvi.b> c = axe.a(MapCodec.unit(a));

      @Override
      public axe<? extends dvi.o> a() {
         return c;
      }

      public dvi.u a(dvi.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dvi.f {
      static final axe<dvi.c> a = axe.a(ajs.a(ks.av).listOf().fieldOf("biome_is").xmap(dvi::a, $$0 -> $$0.c));
      private final List<ajs<czw>> c;
      final Predicate<ajs<czw>> d;

      c(List<ajs<czw>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public axe<? extends dvi.f> a() {
         return a;
      }

      public dvi.e a(final dvi.g $$0) {
         class a extends dvi.k {
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
            return $$0 instanceof dvi.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(doz a, dvi.r c) implements dvi.o {
      static final axe<dvi.d> d = axe.a(doz.b.xmap(dvi.d::new, dvi.d::b).fieldOf("result_state"));

      d(doz $$0) {
         this($$0, new dvi.r($$0));
      }

      @Override
      public axe<? extends dvi.o> a() {
         return d;
      }

      public dvi.u a(dvi.g $$0) {
         return this.c;
      }

      public doz b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dvi.g, dvi.e> {
      Codec<dvi.f> b = kr.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dvi.f> a(iy<Codec<? extends dvi.f>> $$0) {
         dvi.a($$0, "biome", dvi.c.a);
         dvi.a($$0, "noise_threshold", dvi.l.e);
         dvi.a($$0, "vertical_gradient", dvi.y.e);
         dvi.a($$0, "y_above", dvi.aa.e);
         dvi.a($$0, "water", dvi.z.e);
         dvi.a($$0, "temperature", dvi.v.c);
         dvi.a($$0, "steep", dvi.s.c);
         dvi.a($$0, "not", dvi.n.c);
         dvi.a($$0, "hole", dvi.h.c);
         dvi.a($$0, "above_preliminary_surface", dvi.a.c);
         return dvi.a($$0, "stone_depth", dvi.t.f);
      }

      axe<? extends dvi.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dvj e;
      final dvi.e f = new dvi.g.d(this);
      final dvi.e g = new dvi.g.c(this);
      final dvi.e h = new dvi.g.b(this);
      final dvi.e i = new dvi.g.a();
      final dvf j;
      final dqv k;
      private final duv l;
      private final Function<ib, il<czw>> m;
      final dvo n;
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
      final ib.a z = new ib.a();
      Supplier<il<czw>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dvj $$0, dvf $$1, dqv $$2, duv $$3, Function<ib, il<czw>> $$4, iy<czw> $$5, dvo $$6) {
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
            long $$2 = cye.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = axk.a(
               axk.a(
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

      final class a implements dvi.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dvi.j {
         b(dvi.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dvi.j {
         c(dvi.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dqv $$4 = this.c.k;
            int $$5 = $$4.a(dur.a.a, $$0, $$2);
            int $$6 = $$4.a(dur.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dur.a.a, $$7, $$1);
               int $$10 = $$4.a(dur.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dvi.k {
         d(dvi.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dvi.f {
      a;

      static final axe<dvi.h> c = axe.a(MapCodec.unit(a));

      @Override
      public axe<? extends dvi.f> a() {
         return c;
      }

      public dvi.e a(dvi.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dvi.e {
      protected final dvi.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dvi.g $$0) {
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

   abstract static class j extends dvi.i {
      protected j(dvi.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dvi.i {
      protected k(dvi.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(ajs<ejv.a> a, double c, double d) implements dvi.f {
      static final axe<dvi.l> e = axe.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ajs.a(ks.aD).fieldOf("noise").forGetter(dvi.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dvi.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dvi.l::d)
                  )
                  .apply($$0, dvi.l::new)
         )
      );

      @Override
      public axe<? extends dvi.f> a() {
         return e;
      }

      public dvi.e a(final dvi.g $$0) {
         final ejv $$1 = $$0.j.a(this.a);

         class a extends dvi.j {
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

      public ajs<ejv.a> b() {
         return this.a;
      }
   }

   static record m(dvi.e a) implements dvi.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dvi.f a) implements dvi.f {
      static final axe<dvi.n> c = axe.a(dvi.f.b.xmap(dvi.n::new, dvi.n::b).fieldOf("invert"));

      @Override
      public axe<? extends dvi.f> a() {
         return c;
      }

      public dvi.e a(dvi.g $$0) {
         return new dvi.m(this.a.apply($$0));
      }

      public dvi.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dvi.g, dvi.u> {
      Codec<dvi.o> b = kr.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dvi.o> a(iy<Codec<? extends dvi.o>> $$0) {
         dvi.a($$0, "bandlands", dvi.b.c);
         dvi.a($$0, "block", dvi.d.d);
         dvi.a($$0, "sequence", dvi.q.c);
         return dvi.a($$0, "condition", dvi.x.d);
      }

      axe<? extends dvi.o> a();
   }

   static record p(List<dvi.u> a) implements dvi.u {
      @Nullable
      @Override
      public doz tryApply(int $$0, int $$1, int $$2) {
         for (dvi.u $$3 : this.a) {
            doz $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dvi.o> a) implements dvi.o {
      static final axe<dvi.q> c = axe.a(dvi.o.b.listOf().xmap(dvi.q::new, dvi.q::b).fieldOf("sequence"));

      @Override
      public axe<? extends dvi.o> a() {
         return c;
      }

      public dvi.u a(dvi.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dvi.u> $$1 = ImmutableList.builder();

            for (dvi.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dvi.p($$1.build());
         }
      }

      public List<dvi.o> b() {
         return this.a;
      }
   }

   static record r(doz a) implements dvi.u {
      @Override
      public doz tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dvi.f {
      a;

      static final axe<dvi.s> c = axe.a(MapCodec.unit(a));

      @Override
      public axe<? extends dvi.f> a() {
         return c;
      }

      public dvi.e a(dvi.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, eec e) implements dvi.f {
      static final axe<dvi.t> f = axe.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dvi.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dvi.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dvi.t::d),
                     eec.c.fieldOf("surface_type").forGetter(dvi.t::e)
                  )
                  .apply($$0, dvi.t::new)
         )
      );

      @Override
      public axe<? extends dvi.f> a() {
         return f;
      }

      public dvi.e a(final dvi.g $$0) {
         final boolean $$1 = this.e == eec.a;

         class a extends dvi.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)axk.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      doz tryApply(int var1, int var2, int var3);
   }

   static enum v implements dvi.f {
      a;

      static final axe<dvi.v> c = axe.a(MapCodec.unit(a));

      @Override
      public axe<? extends dvi.f> a() {
         return c;
      }

      public dvi.e a(dvi.g $$0) {
         return $$0.f;
      }
   }

   static record w(dvi.e a, dvi.u b) implements dvi.u {
      @Nullable
      @Override
      public doz tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dvi.f a, dvi.o c) implements dvi.o {
      static final axe<dvi.x> d = axe.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dvi.f.b.fieldOf("if_true").forGetter(dvi.x::b), dvi.o.b.fieldOf("then_run").forGetter(dvi.x::c)).apply($$0, dvi.x::new)
         )
      );

      @Override
      public axe<? extends dvi.o> a() {
         return d;
      }

      public dvi.u a(dvi.g $$0) {
         return new dvi.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dvi.f b() {
         return this.a;
      }
   }

   static record y(ajt a, dvl c, dvl d) implements dvi.f {
      static final axe<dvi.y> e = axe.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ajt.a.fieldOf("random_name").forGetter(dvi.y::b),
                     dvl.a.fieldOf("true_at_and_below").forGetter(dvi.y::c),
                     dvl.a.fieldOf("false_at_and_above").forGetter(dvi.y::d)
                  )
                  .apply($$0, dvi.y::new)
         )
      );

      @Override
      public axe<? extends dvi.f> a() {
         return e;
      }

      public dvi.e a(final dvi.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dve $$3 = $$0.j.a(this.b());

         class a extends dvi.k {
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
                  double $$1 = axk.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  axr $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public ajt b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dvi.f {
      static final axe<dvi.z> e = axe.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dvi.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dvi.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dvi.z::d)
                  )
                  .apply($$0, dvi.z::new)
         )
      );

      @Override
      public axe<? extends dvi.f> a() {
         return e;
      }

      public dvi.e a(final dvi.g $$0) {
         class a extends dvi.k {
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
