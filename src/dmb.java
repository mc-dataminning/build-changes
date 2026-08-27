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

public class dmb {
   public static final dmb.f a = a(0, false, duv.b);
   public static final dmb.f b = a(0, true, duv.b);
   public static final dmb.f c = a(0, true, 6, duv.b);
   public static final dmb.f d = a(0, true, 30, duv.b);
   public static final dmb.f e = a(0, false, duv.a);
   public static final dmb.f f = a(0, true, duv.a);

   public static dmb.f a(int $$0, boolean $$1, duv $$2) {
      return new dmb.t($$0, $$1, 0, $$2);
   }

   public static dmb.f a(int $$0, boolean $$1, int $$2, duv $$3) {
      return new dmb.t($$0, $$1, $$2, $$3);
   }

   public static dmb.f a(dmb.f $$0) {
      return new dmb.n($$0);
   }

   public static dmb.f a(dme $$0, int $$1) {
      return new dmb.aa($$0, $$1, false);
   }

   public static dmb.f b(dme $$0, int $$1) {
      return new dmb.aa($$0, $$1, true);
   }

   public static dmb.f a(int $$0, int $$1) {
      return new dmb.z($$0, $$1, false);
   }

   public static dmb.f b(int $$0, int $$1) {
      return new dmb.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dmb.f a(afv<crx>... $$0) {
      return a(List.of($$0));
   }

   private static dmb.c a(List<afv<crx>> $$0) {
      return new dmb.c($$0);
   }

   public static dmb.f a(afv<eah.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dmb.f a(afv<eah.a> $$0, double $$1, double $$2) {
      return new dmb.l($$0, $$1, $$2);
   }

   public static dmb.f a(String $$0, dme $$1, dme $$2) {
      return new dmb.y(new afw($$0), $$1, $$2);
   }

   public static dmb.f a() {
      return dmb.s.a;
   }

   public static dmb.f b() {
      return dmb.h.a;
   }

   public static dmb.f c() {
      return dmb.a.a;
   }

   public static dmb.f d() {
      return dmb.v.a;
   }

   public static dmb.o a(dmb.f $$0, dmb.o $$1) {
      return new dmb.x($$0, $$1);
   }

   public static dmb.o a(dmb.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dmb.q(Arrays.asList($$0));
      }
   }

   public static dmb.o a(dgb $$0) {
      return new dmb.d($$0);
   }

   public static dmb.o e() {
      return dmb.b.a;
   }

   static <A> Codec<? extends A> a(io<Codec<? extends A>> $$0, String $$1, ass<? extends A> $$2) {
      return io.a($$0, $$1, $$2.a());
   }

   static enum a implements dmb.f {
      a;

      static final ass<dmb.a> c = ass.a(MapCodec.unit(a));

      @Override
      public ass<? extends dmb.f> a() {
         return c;
      }

      public dmb.e a(dmb.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dme a, int c, boolean d) implements dmb.f {
      static final ass<dmb.aa> e = ass.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dme.a.fieldOf("anchor").forGetter(dmb.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dmb.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dmb.aa::d)
                  )
                  .apply($$0, dmb.aa::new)
         )
      );

      @Override
      public ass<? extends dmb.f> a() {
         return e;
      }

      public dmb.e a(final dmb.g $$0) {
         class a extends dmb.k {
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

      public dme b() {
         return this.a;
      }
   }

   static enum b implements dmb.o {
      a;

      static final ass<dmb.b> c = ass.a(MapCodec.unit(a));

      @Override
      public ass<? extends dmb.o> a() {
         return c;
      }

      public dmb.u a(dmb.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dmb.f {
      static final ass<dmb.c> a = ass.a(afv.a(jz.aq).listOf().fieldOf("biome_is").xmap(dmb::a, $$0 -> $$0.c));
      private final List<afv<crx>> c;
      final Predicate<afv<crx>> d;

      c(List<afv<crx>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public ass<? extends dmb.f> a() {
         return a;
      }

      public dmb.e a(final dmb.g $$0) {
         class a extends dmb.k {
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
            return $$0 instanceof dmb.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dgb a, dmb.r c) implements dmb.o {
      static final ass<dmb.d> d = ass.a(dgb.b.xmap(dmb.d::new, dmb.d::b).fieldOf("result_state"));

      d(dgb $$0) {
         this($$0, new dmb.r($$0));
      }

      @Override
      public ass<? extends dmb.o> a() {
         return d;
      }

      public dmb.u a(dmb.g $$0) {
         return this.c;
      }

      public dgb b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dmb.g, dmb.e> {
      Codec<dmb.f> b = jy.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dmb.f> a(io<Codec<? extends dmb.f>> $$0) {
         dmb.a($$0, "biome", dmb.c.a);
         dmb.a($$0, "noise_threshold", dmb.l.e);
         dmb.a($$0, "vertical_gradient", dmb.y.e);
         dmb.a($$0, "y_above", dmb.aa.e);
         dmb.a($$0, "water", dmb.z.e);
         dmb.a($$0, "temperature", dmb.v.c);
         dmb.a($$0, "steep", dmb.s.c);
         dmb.a($$0, "not", dmb.n.c);
         dmb.a($$0, "hole", dmb.h.c);
         dmb.a($$0, "above_preliminary_surface", dmb.a.c);
         return dmb.a($$0, "stone_depth", dmb.t.f);
      }

      ass<? extends dmb.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dmc e;
      final dmb.e f = new dmb.g.d(this);
      final dmb.e g = new dmb.g.c(this);
      final dmb.e h = new dmb.g.b(this);
      final dmb.e i = new dmb.g.a();
      final dly j;
      final dhx k;
      private final dlo l;
      private final Function<ht, ib<crx>> m;
      final dmh n;
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
      final ht.a z = new ht.a();
      Supplier<ib<crx>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dmc $$0, dly $$1, dhx $$2, dlo $$3, Function<ht, ib<crx>> $$4, io<crx> $$5, dmh $$6) {
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
            long $$2 = cqg.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = asy.a(
               asy.a(
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

      final class a implements dmb.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dmb.j {
         b(dmb.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dmb.j {
         c(dmb.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dhx $$4 = this.c.k;
            int $$5 = $$4.a(dlk.a.a, $$0, $$2);
            int $$6 = $$4.a(dlk.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dlk.a.a, $$7, $$1);
               int $$10 = $$4.a(dlk.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dmb.k {
         d(dmb.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dmb.f {
      a;

      static final ass<dmb.h> c = ass.a(MapCodec.unit(a));

      @Override
      public ass<? extends dmb.f> a() {
         return c;
      }

      public dmb.e a(dmb.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dmb.e {
      protected final dmb.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dmb.g $$0) {
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

   abstract static class j extends dmb.i {
      protected j(dmb.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dmb.i {
      protected k(dmb.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(afv<eah.a> a, double c, double d) implements dmb.f {
      static final ass<dmb.l> e = ass.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     afv.a(jz.ay).fieldOf("noise").forGetter(dmb.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dmb.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dmb.l::d)
                  )
                  .apply($$0, dmb.l::new)
         )
      );

      @Override
      public ass<? extends dmb.f> a() {
         return e;
      }

      public dmb.e a(final dmb.g $$0) {
         final eah $$1 = $$0.j.a(this.a);

         class a extends dmb.j {
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

      public afv<eah.a> b() {
         return this.a;
      }
   }

   static record m(dmb.e a) implements dmb.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dmb.f a) implements dmb.f {
      static final ass<dmb.n> c = ass.a(dmb.f.b.xmap(dmb.n::new, dmb.n::b).fieldOf("invert"));

      @Override
      public ass<? extends dmb.f> a() {
         return c;
      }

      public dmb.e a(dmb.g $$0) {
         return new dmb.m(this.a.apply($$0));
      }

      public dmb.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dmb.g, dmb.u> {
      Codec<dmb.o> b = jy.af.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dmb.o> a(io<Codec<? extends dmb.o>> $$0) {
         dmb.a($$0, "bandlands", dmb.b.c);
         dmb.a($$0, "block", dmb.d.d);
         dmb.a($$0, "sequence", dmb.q.c);
         return dmb.a($$0, "condition", dmb.x.d);
      }

      ass<? extends dmb.o> a();
   }

   static record p(List<dmb.u> a) implements dmb.u {
      @Nullable
      @Override
      public dgb tryApply(int $$0, int $$1, int $$2) {
         for (dmb.u $$3 : this.a) {
            dgb $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dmb.o> a) implements dmb.o {
      static final ass<dmb.q> c = ass.a(dmb.o.b.listOf().xmap(dmb.q::new, dmb.q::b).fieldOf("sequence"));

      @Override
      public ass<? extends dmb.o> a() {
         return c;
      }

      public dmb.u a(dmb.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dmb.u> $$1 = ImmutableList.builder();

            for (dmb.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dmb.p($$1.build());
         }
      }

      public List<dmb.o> b() {
         return this.a;
      }
   }

   static record r(dgb a) implements dmb.u {
      @Override
      public dgb tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dmb.f {
      a;

      static final ass<dmb.s> c = ass.a(MapCodec.unit(a));

      @Override
      public ass<? extends dmb.f> a() {
         return c;
      }

      public dmb.e a(dmb.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, duv e) implements dmb.f {
      static final ass<dmb.t> f = ass.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dmb.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dmb.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dmb.t::d),
                     duv.c.fieldOf("surface_type").forGetter(dmb.t::e)
                  )
                  .apply($$0, dmb.t::new)
         )
      );

      @Override
      public ass<? extends dmb.f> a() {
         return f;
      }

      public dmb.e a(final dmb.g $$0) {
         final boolean $$1 = this.e == duv.a;

         class a extends dmb.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)asy.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dgb tryApply(int var1, int var2, int var3);
   }

   static enum v implements dmb.f {
      a;

      static final ass<dmb.v> c = ass.a(MapCodec.unit(a));

      @Override
      public ass<? extends dmb.f> a() {
         return c;
      }

      public dmb.e a(dmb.g $$0) {
         return $$0.f;
      }
   }

   static record w(dmb.e a, dmb.u b) implements dmb.u {
      @Nullable
      @Override
      public dgb tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dmb.f a, dmb.o c) implements dmb.o {
      static final ass<dmb.x> d = ass.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dmb.f.b.fieldOf("if_true").forGetter(dmb.x::b), dmb.o.b.fieldOf("then_run").forGetter(dmb.x::c)).apply($$0, dmb.x::new)
         )
      );

      @Override
      public ass<? extends dmb.o> a() {
         return d;
      }

      public dmb.u a(dmb.g $$0) {
         return new dmb.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dmb.f b() {
         return this.a;
      }
   }

   static record y(afw a, dme c, dme d) implements dmb.f {
      static final ass<dmb.y> e = ass.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     afw.a.fieldOf("random_name").forGetter(dmb.y::b),
                     dme.a.fieldOf("true_at_and_below").forGetter(dmb.y::c),
                     dme.a.fieldOf("false_at_and_above").forGetter(dmb.y::d)
                  )
                  .apply($$0, dmb.y::new)
         )
      );

      @Override
      public ass<? extends dmb.f> a() {
         return e;
      }

      public dmb.e a(final dmb.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dlx $$3 = $$0.j.a(this.b());

         class a extends dmb.k {
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
                  double $$1 = asy.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  ate $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public afw b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dmb.f {
      static final ass<dmb.z> e = ass.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dmb.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dmb.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dmb.z::d)
                  )
                  .apply($$0, dmb.z::new)
         )
      );

      @Override
      public ass<? extends dmb.f> a() {
         return e;
      }

      public dmb.e a(final dmb.g $$0) {
         class a extends dmb.k {
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
