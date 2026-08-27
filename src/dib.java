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

public class dib {
   public static final dib.f a = a(0, false, dqv.b);
   public static final dib.f b = a(0, true, dqv.b);
   public static final dib.f c = a(0, true, 6, dqv.b);
   public static final dib.f d = a(0, true, 30, dqv.b);
   public static final dib.f e = a(0, false, dqv.a);
   public static final dib.f f = a(0, true, dqv.a);

   public static dib.f a(int $$0, boolean $$1, dqv $$2) {
      return new dib.t($$0, $$1, 0, $$2);
   }

   public static dib.f a(int $$0, boolean $$1, int $$2, dqv $$3) {
      return new dib.t($$0, $$1, $$2, $$3);
   }

   public static dib.f a(dib.f $$0) {
      return new dib.n($$0);
   }

   public static dib.f a(die $$0, int $$1) {
      return new dib.aa($$0, $$1, false);
   }

   public static dib.f b(die $$0, int $$1) {
      return new dib.aa($$0, $$1, true);
   }

   public static dib.f a(int $$0, int $$1) {
      return new dib.z($$0, $$1, false);
   }

   public static dib.f b(int $$0, int $$1) {
      return new dib.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dib.f a(acp<cnk>... $$0) {
      return a(List.of($$0));
   }

   private static dib.c a(List<acp<cnk>> $$0) {
      return new dib.c($$0);
   }

   public static dib.f a(acp<dwh.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dib.f a(acp<dwh.a> $$0, double $$1, double $$2) {
      return new dib.l($$0, $$1, $$2);
   }

   public static dib.f a(String $$0, die $$1, die $$2) {
      return new dib.y(new acq($$0), $$1, $$2);
   }

   public static dib.f a() {
      return dib.s.a;
   }

   public static dib.f b() {
      return dib.h.a;
   }

   public static dib.f c() {
      return dib.a.a;
   }

   public static dib.f d() {
      return dib.v.a;
   }

   public static dib.o a(dib.f $$0, dib.o $$1) {
      return new dib.x($$0, $$1);
   }

   public static dib.o a(dib.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dib.q(Arrays.asList($$0));
      }
   }

   public static dib.o a(dcb $$0) {
      return new dib.d($$0);
   }

   public static dib.o e() {
      return dib.b.a;
   }

   static <A> Codec<? extends A> a(hr<Codec<? extends A>> $$0, String $$1, aou<? extends A> $$2) {
      return hr.a($$0, $$1, $$2.a());
   }

   static enum a implements dib.f {
      a;

      static final aou<dib.a> c = aou.a(MapCodec.unit(a));

      @Override
      public aou<? extends dib.f> a() {
         return c;
      }

      public dib.e a(dib.g $$0) {
         return $$0.i;
      }
   }

   static record aa(die a, int c, boolean d) implements dib.f {
      static final aou<dib.aa> e = aou.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     die.a.fieldOf("anchor").forGetter(dib.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dib.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dib.aa::d)
                  )
                  .apply($$0, dib.aa::new)
         )
      );

      @Override
      public aou<? extends dib.f> a() {
         return e;
      }

      public dib.e a(final dib.g $$0) {
         class a extends dib.k {
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

      public die b() {
         return this.a;
      }
   }

   static enum b implements dib.o {
      a;

      static final aou<dib.b> c = aou.a(MapCodec.unit(a));

      @Override
      public aou<? extends dib.o> a() {
         return c;
      }

      public dib.u a(dib.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dib.f {
      static final aou<dib.c> a = aou.a(acp.a(jc.ap).listOf().fieldOf("biome_is").xmap(dib::a, $$0 -> $$0.c));
      private final List<acp<cnk>> c;
      final Predicate<acp<cnk>> d;

      c(List<acp<cnk>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public aou<? extends dib.f> a() {
         return a;
      }

      public dib.e a(final dib.g $$0) {
         class a extends dib.k {
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
            return $$0 instanceof dib.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dcb a, dib.r c) implements dib.o {
      static final aou<dib.d> d = aou.a(dcb.b.xmap(dib.d::new, dib.d::b).fieldOf("result_state"));

      d(dcb $$0) {
         this($$0, new dib.r($$0));
      }

      @Override
      public aou<? extends dib.o> a() {
         return d;
      }

      public dib.u a(dib.g $$0) {
         return this.c;
      }

      public dcb b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dib.g, dib.e> {
      Codec<dib.f> b = jb.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dib.f> a(hr<Codec<? extends dib.f>> $$0) {
         dib.a($$0, "biome", dib.c.a);
         dib.a($$0, "noise_threshold", dib.l.e);
         dib.a($$0, "vertical_gradient", dib.y.e);
         dib.a($$0, "y_above", dib.aa.e);
         dib.a($$0, "water", dib.z.e);
         dib.a($$0, "temperature", dib.v.c);
         dib.a($$0, "steep", dib.s.c);
         dib.a($$0, "not", dib.n.c);
         dib.a($$0, "hole", dib.h.c);
         dib.a($$0, "above_preliminary_surface", dib.a.c);
         return dib.a($$0, "stone_depth", dib.t.f);
      }

      aou<? extends dib.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dic e;
      final dib.e f = new dib.g.d(this);
      final dib.e g = new dib.g.c(this);
      final dib.e h = new dib.g.b(this);
      final dib.e i = new dib.g.a();
      final dhy j;
      final ddx k;
      private final dho l;
      private final Function<gu, he<cnk>> m;
      final dih n;
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
      final gu.a z = new gu.a();
      Supplier<he<cnk>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dic $$0, dhy $$1, ddx $$2, dho $$3, Function<gu, he<cnk>> $$4, hr<cnk> $$5, dih $$6) {
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
            long $$2 = clt.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = apa.a(
               apa.a(
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

      final class a implements dib.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dib.j {
         b(dib.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dib.j {
         c(dib.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            ddx $$4 = this.c.k;
            int $$5 = $$4.a(dhk.a.a, $$0, $$2);
            int $$6 = $$4.a(dhk.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dhk.a.a, $$7, $$1);
               int $$10 = $$4.a(dhk.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dib.k {
         d(dib.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dib.f {
      a;

      static final aou<dib.h> c = aou.a(MapCodec.unit(a));

      @Override
      public aou<? extends dib.f> a() {
         return c;
      }

      public dib.e a(dib.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dib.e {
      protected final dib.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dib.g $$0) {
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

   abstract static class j extends dib.i {
      protected j(dib.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dib.i {
      protected k(dib.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(acp<dwh.a> a, double c, double d) implements dib.f {
      static final aou<dib.l> e = aou.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     acp.a(jc.ax).fieldOf("noise").forGetter(dib.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dib.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dib.l::d)
                  )
                  .apply($$0, dib.l::new)
         )
      );

      @Override
      public aou<? extends dib.f> a() {
         return e;
      }

      public dib.e a(final dib.g $$0) {
         final dwh $$1 = $$0.j.a(this.a);

         class a extends dib.j {
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

      public acp<dwh.a> b() {
         return this.a;
      }
   }

   static record m(dib.e a) implements dib.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dib.f a) implements dib.f {
      static final aou<dib.n> c = aou.a(dib.f.b.xmap(dib.n::new, dib.n::b).fieldOf("invert"));

      @Override
      public aou<? extends dib.f> a() {
         return c;
      }

      public dib.e a(dib.g $$0) {
         return new dib.m(this.a.apply($$0));
      }

      public dib.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dib.g, dib.u> {
      Codec<dib.o> b = jb.af.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dib.o> a(hr<Codec<? extends dib.o>> $$0) {
         dib.a($$0, "bandlands", dib.b.c);
         dib.a($$0, "block", dib.d.d);
         dib.a($$0, "sequence", dib.q.c);
         return dib.a($$0, "condition", dib.x.d);
      }

      aou<? extends dib.o> a();
   }

   static record p(List<dib.u> a) implements dib.u {
      @Nullable
      @Override
      public dcb tryApply(int $$0, int $$1, int $$2) {
         for (dib.u $$3 : this.a) {
            dcb $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dib.o> a) implements dib.o {
      static final aou<dib.q> c = aou.a(dib.o.b.listOf().xmap(dib.q::new, dib.q::b).fieldOf("sequence"));

      @Override
      public aou<? extends dib.o> a() {
         return c;
      }

      public dib.u a(dib.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dib.u> $$1 = ImmutableList.builder();

            for (dib.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dib.p($$1.build());
         }
      }

      public List<dib.o> b() {
         return this.a;
      }
   }

   static record r(dcb a) implements dib.u {
      @Override
      public dcb tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dib.f {
      a;

      static final aou<dib.s> c = aou.a(MapCodec.unit(a));

      @Override
      public aou<? extends dib.f> a() {
         return c;
      }

      public dib.e a(dib.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, dqv e) implements dib.f {
      static final aou<dib.t> f = aou.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dib.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dib.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dib.t::d),
                     dqv.c.fieldOf("surface_type").forGetter(dib.t::e)
                  )
                  .apply($$0, dib.t::new)
         )
      );

      @Override
      public aou<? extends dib.f> a() {
         return f;
      }

      public dib.e a(final dib.g $$0) {
         final boolean $$1 = this.e == dqv.a;

         class a extends dib.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)apa.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dcb tryApply(int var1, int var2, int var3);
   }

   static enum v implements dib.f {
      a;

      static final aou<dib.v> c = aou.a(MapCodec.unit(a));

      @Override
      public aou<? extends dib.f> a() {
         return c;
      }

      public dib.e a(dib.g $$0) {
         return $$0.f;
      }
   }

   static record w(dib.e a, dib.u b) implements dib.u {
      @Nullable
      @Override
      public dcb tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dib.f a, dib.o c) implements dib.o {
      static final aou<dib.x> d = aou.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dib.f.b.fieldOf("if_true").forGetter(dib.x::b), dib.o.b.fieldOf("then_run").forGetter(dib.x::c)).apply($$0, dib.x::new)
         )
      );

      @Override
      public aou<? extends dib.o> a() {
         return d;
      }

      public dib.u a(dib.g $$0) {
         return new dib.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dib.f b() {
         return this.a;
      }
   }

   static record y(acq a, die c, die d) implements dib.f {
      static final aou<dib.y> e = aou.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     acq.a.fieldOf("random_name").forGetter(dib.y::b),
                     die.a.fieldOf("true_at_and_below").forGetter(dib.y::c),
                     die.a.fieldOf("false_at_and_above").forGetter(dib.y::d)
                  )
                  .apply($$0, dib.y::new)
         )
      );

      @Override
      public aou<? extends dib.f> a() {
         return e;
      }

      public dib.e a(final dib.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dhx $$3 = $$0.j.a(this.b());

         class a extends dib.k {
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
                  double $$1 = apa.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  apf $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public acq b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dib.f {
      static final aou<dib.z> e = aou.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dib.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dib.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dib.z::d)
                  )
                  .apply($$0, dib.z::new)
         )
      );

      @Override
      public aou<? extends dib.f> a() {
         return e;
      }

      public dib.e a(final dib.g $$0) {
         class a extends dib.k {
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
