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

public class dla {
   public static final dla.f a = a(0, false, dtu.b);
   public static final dla.f b = a(0, true, dtu.b);
   public static final dla.f c = a(0, true, 6, dtu.b);
   public static final dla.f d = a(0, true, 30, dtu.b);
   public static final dla.f e = a(0, false, dtu.a);
   public static final dla.f f = a(0, true, dtu.a);

   public static dla.f a(int $$0, boolean $$1, dtu $$2) {
      return new dla.t($$0, $$1, 0, $$2);
   }

   public static dla.f a(int $$0, boolean $$1, int $$2, dtu $$3) {
      return new dla.t($$0, $$1, $$2, $$3);
   }

   public static dla.f a(dla.f $$0) {
      return new dla.n($$0);
   }

   public static dla.f a(dld $$0, int $$1) {
      return new dla.aa($$0, $$1, false);
   }

   public static dla.f b(dld $$0, int $$1) {
      return new dla.aa($$0, $$1, true);
   }

   public static dla.f a(int $$0, int $$1) {
      return new dla.z($$0, $$1, false);
   }

   public static dla.f b(int $$0, int $$1) {
      return new dla.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dla.f a(aeq<cqk>... $$0) {
      return a(List.of($$0));
   }

   private static dla.c a(List<aeq<cqk>> $$0) {
      return new dla.c($$0);
   }

   public static dla.f a(aeq<dzg.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dla.f a(aeq<dzg.a> $$0, double $$1, double $$2) {
      return new dla.l($$0, $$1, $$2);
   }

   public static dla.f a(String $$0, dld $$1, dld $$2) {
      return new dla.y(new aer($$0), $$1, $$2);
   }

   public static dla.f a() {
      return dla.s.a;
   }

   public static dla.f b() {
      return dla.h.a;
   }

   public static dla.f c() {
      return dla.a.a;
   }

   public static dla.f d() {
      return dla.v.a;
   }

   public static dla.o a(dla.f $$0, dla.o $$1) {
      return new dla.x($$0, $$1);
   }

   public static dla.o a(dla.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dla.q(Arrays.asList($$0));
      }
   }

   public static dla.o a(dfa $$0) {
      return new dla.d($$0);
   }

   public static dla.o e() {
      return dla.b.a;
   }

   static <A> Codec<? extends A> a(hr<Codec<? extends A>> $$0, String $$1, arj<? extends A> $$2) {
      return hr.a($$0, $$1, $$2.a());
   }

   static enum a implements dla.f {
      a;

      static final arj<dla.a> c = arj.a(MapCodec.unit(a));

      @Override
      public arj<? extends dla.f> a() {
         return c;
      }

      public dla.e a(dla.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dld a, int c, boolean d) implements dla.f {
      static final arj<dla.aa> e = arj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dld.a.fieldOf("anchor").forGetter(dla.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dla.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dla.aa::d)
                  )
                  .apply($$0, dla.aa::new)
         )
      );

      @Override
      public arj<? extends dla.f> a() {
         return e;
      }

      public dla.e a(final dla.g $$0) {
         class a extends dla.k {
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

      public dld b() {
         return this.a;
      }
   }

   static enum b implements dla.o {
      a;

      static final arj<dla.b> c = arj.a(MapCodec.unit(a));

      @Override
      public arj<? extends dla.o> a() {
         return c;
      }

      public dla.u a(dla.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dla.f {
      static final arj<dla.c> a = arj.a(aeq.a(jc.ap).listOf().fieldOf("biome_is").xmap(dla::a, $$0 -> $$0.c));
      private final List<aeq<cqk>> c;
      final Predicate<aeq<cqk>> d;

      c(List<aeq<cqk>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public arj<? extends dla.f> a() {
         return a;
      }

      public dla.e a(final dla.g $$0) {
         class a extends dla.k {
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
            return $$0 instanceof dla.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dfa a, dla.r c) implements dla.o {
      static final arj<dla.d> d = arj.a(dfa.b.xmap(dla.d::new, dla.d::b).fieldOf("result_state"));

      d(dfa $$0) {
         this($$0, new dla.r($$0));
      }

      @Override
      public arj<? extends dla.o> a() {
         return d;
      }

      public dla.u a(dla.g $$0) {
         return this.c;
      }

      public dfa b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dla.g, dla.e> {
      Codec<dla.f> b = jb.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dla.f> a(hr<Codec<? extends dla.f>> $$0) {
         dla.a($$0, "biome", dla.c.a);
         dla.a($$0, "noise_threshold", dla.l.e);
         dla.a($$0, "vertical_gradient", dla.y.e);
         dla.a($$0, "y_above", dla.aa.e);
         dla.a($$0, "water", dla.z.e);
         dla.a($$0, "temperature", dla.v.c);
         dla.a($$0, "steep", dla.s.c);
         dla.a($$0, "not", dla.n.c);
         dla.a($$0, "hole", dla.h.c);
         dla.a($$0, "above_preliminary_surface", dla.a.c);
         return dla.a($$0, "stone_depth", dla.t.f);
      }

      arj<? extends dla.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dlb e;
      final dla.e f = new dla.g.d(this);
      final dla.e g = new dla.g.c(this);
      final dla.e h = new dla.g.b(this);
      final dla.e i = new dla.g.a();
      final dkx j;
      final dgw k;
      private final dkn l;
      private final Function<gu, he<cqk>> m;
      final dlg n;
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
      Supplier<he<cqk>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dlb $$0, dkx $$1, dgw $$2, dkn $$3, Function<gu, he<cqk>> $$4, hr<cqk> $$5, dlg $$6) {
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
            long $$2 = cot.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = arp.a(
               arp.a(
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

      final class a implements dla.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dla.j {
         b(dla.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dla.j {
         c(dla.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dgw $$4 = this.c.k;
            int $$5 = $$4.a(dkj.a.a, $$0, $$2);
            int $$6 = $$4.a(dkj.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dkj.a.a, $$7, $$1);
               int $$10 = $$4.a(dkj.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dla.k {
         d(dla.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dla.f {
      a;

      static final arj<dla.h> c = arj.a(MapCodec.unit(a));

      @Override
      public arj<? extends dla.f> a() {
         return c;
      }

      public dla.e a(dla.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dla.e {
      protected final dla.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dla.g $$0) {
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

   abstract static class j extends dla.i {
      protected j(dla.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dla.i {
      protected k(dla.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(aeq<dzg.a> a, double c, double d) implements dla.f {
      static final arj<dla.l> e = arj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aeq.a(jc.ax).fieldOf("noise").forGetter(dla.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dla.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dla.l::d)
                  )
                  .apply($$0, dla.l::new)
         )
      );

      @Override
      public arj<? extends dla.f> a() {
         return e;
      }

      public dla.e a(final dla.g $$0) {
         final dzg $$1 = $$0.j.a(this.a);

         class a extends dla.j {
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

      public aeq<dzg.a> b() {
         return this.a;
      }
   }

   static record m(dla.e a) implements dla.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dla.f a) implements dla.f {
      static final arj<dla.n> c = arj.a(dla.f.b.xmap(dla.n::new, dla.n::b).fieldOf("invert"));

      @Override
      public arj<? extends dla.f> a() {
         return c;
      }

      public dla.e a(dla.g $$0) {
         return new dla.m(this.a.apply($$0));
      }

      public dla.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dla.g, dla.u> {
      Codec<dla.o> b = jb.af.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dla.o> a(hr<Codec<? extends dla.o>> $$0) {
         dla.a($$0, "bandlands", dla.b.c);
         dla.a($$0, "block", dla.d.d);
         dla.a($$0, "sequence", dla.q.c);
         return dla.a($$0, "condition", dla.x.d);
      }

      arj<? extends dla.o> a();
   }

   static record p(List<dla.u> a) implements dla.u {
      @Nullable
      @Override
      public dfa tryApply(int $$0, int $$1, int $$2) {
         for (dla.u $$3 : this.a) {
            dfa $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dla.o> a) implements dla.o {
      static final arj<dla.q> c = arj.a(dla.o.b.listOf().xmap(dla.q::new, dla.q::b).fieldOf("sequence"));

      @Override
      public arj<? extends dla.o> a() {
         return c;
      }

      public dla.u a(dla.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dla.u> $$1 = ImmutableList.builder();

            for (dla.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dla.p($$1.build());
         }
      }

      public List<dla.o> b() {
         return this.a;
      }
   }

   static record r(dfa a) implements dla.u {
      @Override
      public dfa tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dla.f {
      a;

      static final arj<dla.s> c = arj.a(MapCodec.unit(a));

      @Override
      public arj<? extends dla.f> a() {
         return c;
      }

      public dla.e a(dla.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, dtu e) implements dla.f {
      static final arj<dla.t> f = arj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dla.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dla.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dla.t::d),
                     dtu.c.fieldOf("surface_type").forGetter(dla.t::e)
                  )
                  .apply($$0, dla.t::new)
         )
      );

      @Override
      public arj<? extends dla.f> a() {
         return f;
      }

      public dla.e a(final dla.g $$0) {
         final boolean $$1 = this.e == dtu.a;

         class a extends dla.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)arp.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dfa tryApply(int var1, int var2, int var3);
   }

   static enum v implements dla.f {
      a;

      static final arj<dla.v> c = arj.a(MapCodec.unit(a));

      @Override
      public arj<? extends dla.f> a() {
         return c;
      }

      public dla.e a(dla.g $$0) {
         return $$0.f;
      }
   }

   static record w(dla.e a, dla.u b) implements dla.u {
      @Nullable
      @Override
      public dfa tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dla.f a, dla.o c) implements dla.o {
      static final arj<dla.x> d = arj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dla.f.b.fieldOf("if_true").forGetter(dla.x::b), dla.o.b.fieldOf("then_run").forGetter(dla.x::c)).apply($$0, dla.x::new)
         )
      );

      @Override
      public arj<? extends dla.o> a() {
         return d;
      }

      public dla.u a(dla.g $$0) {
         return new dla.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dla.f b() {
         return this.a;
      }
   }

   static record y(aer a, dld c, dld d) implements dla.f {
      static final arj<dla.y> e = arj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aer.a.fieldOf("random_name").forGetter(dla.y::b),
                     dld.a.fieldOf("true_at_and_below").forGetter(dla.y::c),
                     dld.a.fieldOf("false_at_and_above").forGetter(dla.y::d)
                  )
                  .apply($$0, dla.y::new)
         )
      );

      @Override
      public arj<? extends dla.f> a() {
         return e;
      }

      public dla.e a(final dla.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dkw $$3 = $$0.j.a(this.b());

         class a extends dla.k {
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
                  double $$1 = arp.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  aru $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public aer b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dla.f {
      static final arj<dla.z> e = arj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dla.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dla.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dla.z::d)
                  )
                  .apply($$0, dla.z::new)
         )
      );

      @Override
      public arj<? extends dla.f> a() {
         return e;
      }

      public dla.e a(final dla.g $$0) {
         class a extends dla.k {
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
