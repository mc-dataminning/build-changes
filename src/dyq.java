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

public class dyq {
   public static final dyq.f a = a(0, false, ehl.b);
   public static final dyq.f b = a(0, true, ehl.b);
   public static final dyq.f c = a(0, true, 6, ehl.b);
   public static final dyq.f d = a(0, true, 30, ehl.b);
   public static final dyq.f e = a(0, false, ehl.a);
   public static final dyq.f f = a(0, true, ehl.a);

   public static dyq.f a(int $$0, boolean $$1, ehl $$2) {
      return new dyq.t($$0, $$1, 0, $$2);
   }

   public static dyq.f a(int $$0, boolean $$1, int $$2, ehl $$3) {
      return new dyq.t($$0, $$1, $$2, $$3);
   }

   public static dyq.f a(dyq.f $$0) {
      return new dyq.n($$0);
   }

   public static dyq.f a(dyt $$0, int $$1) {
      return new dyq.aa($$0, $$1, false);
   }

   public static dyq.f b(dyt $$0, int $$1) {
      return new dyq.aa($$0, $$1, true);
   }

   public static dyq.f a(int $$0, int $$1) {
      return new dyq.z($$0, $$1, false);
   }

   public static dyq.f b(int $$0, int $$1) {
      return new dyq.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dyq.f a(akj<ddd>... $$0) {
      return a(List.of($$0));
   }

   private static dyq.c a(List<akj<ddd>> $$0) {
      return new dyq.c($$0);
   }

   public static dyq.f a(akj<ene.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dyq.f a(akj<ene.a> $$0, double $$1, double $$2) {
      return new dyq.l($$0, $$1, $$2);
   }

   public static dyq.f a(String $$0, dyt $$1, dyt $$2) {
      return new dyq.y(new akk($$0), $$1, $$2);
   }

   public static dyq.f a() {
      return dyq.s.a;
   }

   public static dyq.f b() {
      return dyq.h.a;
   }

   public static dyq.f c() {
      return dyq.a.a;
   }

   public static dyq.f d() {
      return dyq.v.a;
   }

   public static dyq.o a(dyq.f $$0, dyq.o $$1) {
      return new dyq.x($$0, $$1);
   }

   public static dyq.o a(dyq.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dyq.q(Arrays.asList($$0));
      }
   }

   public static dyq.o a(dsh $$0) {
      return new dyq.d($$0);
   }

   public static dyq.o e() {
      return dyq.b.a;
   }

   static <A> MapCodec<? extends A> a(jw<MapCodec<? extends A>> $$0, String $$1, axx<? extends A> $$2) {
      return jw.a($$0, $$1, $$2.a());
   }

   static enum a implements dyq.f {
      a;

      static final axx<dyq.a> c = axx.a(MapCodec.unit(a));

      @Override
      public axx<? extends dyq.f> a() {
         return c;
      }

      public dyq.e a(dyq.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dyt a, int c, boolean d) implements dyq.f {
      static final axx<dyq.aa> e = axx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dyt.a.fieldOf("anchor").forGetter(dyq.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dyq.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dyq.aa::d)
                  )
                  .apply($$0, dyq.aa::new)
         )
      );

      @Override
      public axx<? extends dyq.f> a() {
         return e;
      }

      public dyq.e a(final dyq.g $$0) {
         class a extends dyq.k {
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

      public dyt b() {
         return this.a;
      }
   }

   static enum b implements dyq.o {
      a;

      static final axx<dyq.b> c = axx.a(MapCodec.unit(a));

      @Override
      public axx<? extends dyq.o> a() {
         return c;
      }

      public dyq.u a(dyq.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dyq.f {
      static final axx<dyq.c> a = axx.a(akj.a(lr.aE).listOf().fieldOf("biome_is").xmap(dyq::a, $$0 -> $$0.c));
      private final List<akj<ddd>> c;
      final Predicate<akj<ddd>> d;

      c(List<akj<ddd>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public axx<? extends dyq.f> a() {
         return a;
      }

      public dyq.e a(final dyq.g $$0) {
         class a extends dyq.k {
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
            return $$0 instanceof dyq.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dsh a, dyq.r c) implements dyq.o {
      static final axx<dyq.d> d = axx.a(dsh.b.xmap(dyq.d::new, dyq.d::b).fieldOf("result_state"));

      d(dsh $$0) {
         this($$0, new dyq.r($$0));
      }

      @Override
      public axx<? extends dyq.o> a() {
         return d;
      }

      public dyq.u a(dyq.g $$0) {
         return this.c;
      }

      public dsh b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dyq.g, dyq.e> {
      Codec<dyq.f> b = lq.ab.r().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dyq.f> a(jw<MapCodec<? extends dyq.f>> $$0) {
         dyq.a($$0, "biome", dyq.c.a);
         dyq.a($$0, "noise_threshold", dyq.l.e);
         dyq.a($$0, "vertical_gradient", dyq.y.e);
         dyq.a($$0, "y_above", dyq.aa.e);
         dyq.a($$0, "water", dyq.z.e);
         dyq.a($$0, "temperature", dyq.v.c);
         dyq.a($$0, "steep", dyq.s.c);
         dyq.a($$0, "not", dyq.n.c);
         dyq.a($$0, "hole", dyq.h.c);
         dyq.a($$0, "above_preliminary_surface", dyq.a.c);
         return dyq.a($$0, "stone_depth", dyq.t.f);
      }

      axx<? extends dyq.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dyr e;
      final dyq.e f = new dyq.g.d(this);
      final dyq.e g = new dyq.g.c(this);
      final dyq.e h = new dyq.g.b(this);
      final dyq.e i = new dyq.g.a();
      final dyn j;
      final dud k;
      private final dyd l;
      private final Function<ja, jj<ddd>> m;
      final dyw n;
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
      final ja.a z = new ja.a();
      Supplier<jj<ddd>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dyr $$0, dyn $$1, dud $$2, dyd $$3, Function<ja, jj<ddd>> $$4, jw<ddd> $$5, dyw $$6) {
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
            long $$2 = dbk.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = aye.a(
               aye.a(
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

      final class a implements dyq.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dyq.j {
         b(dyq.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dyq.j {
         c(dyq.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dud $$4 = this.c.k;
            int $$5 = $$4.a(dxz.a.a, $$0, $$2);
            int $$6 = $$4.a(dxz.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dxz.a.a, $$7, $$1);
               int $$10 = $$4.a(dxz.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dyq.k {
         d(dyq.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dyq.f {
      a;

      static final axx<dyq.h> c = axx.a(MapCodec.unit(a));

      @Override
      public axx<? extends dyq.f> a() {
         return c;
      }

      public dyq.e a(dyq.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dyq.e {
      protected final dyq.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dyq.g $$0) {
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

   abstract static class j extends dyq.i {
      protected j(dyq.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dyq.i {
      protected k(dyq.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(akj<ene.a> a, double c, double d) implements dyq.f {
      static final axx<dyq.l> e = axx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     akj.a(lr.aO).fieldOf("noise").forGetter(dyq.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dyq.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dyq.l::d)
                  )
                  .apply($$0, dyq.l::new)
         )
      );

      @Override
      public axx<? extends dyq.f> a() {
         return e;
      }

      public dyq.e a(final dyq.g $$0) {
         final ene $$1 = $$0.j.a(this.a);

         class a extends dyq.j {
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

      public akj<ene.a> b() {
         return this.a;
      }
   }

   static record m(dyq.e a) implements dyq.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dyq.f a) implements dyq.f {
      static final axx<dyq.n> c = axx.a(dyq.f.b.xmap(dyq.n::new, dyq.n::b).fieldOf("invert"));

      @Override
      public axx<? extends dyq.f> a() {
         return c;
      }

      public dyq.e a(dyq.g $$0) {
         return new dyq.m(this.a.apply($$0));
      }

      public dyq.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dyq.g, dyq.u> {
      Codec<dyq.o> b = lq.ac.r().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dyq.o> a(jw<MapCodec<? extends dyq.o>> $$0) {
         dyq.a($$0, "bandlands", dyq.b.c);
         dyq.a($$0, "block", dyq.d.d);
         dyq.a($$0, "sequence", dyq.q.c);
         return dyq.a($$0, "condition", dyq.x.d);
      }

      axx<? extends dyq.o> a();
   }

   static record p(List<dyq.u> a) implements dyq.u {
      @Nullable
      @Override
      public dsh tryApply(int $$0, int $$1, int $$2) {
         for (dyq.u $$3 : this.a) {
            dsh $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dyq.o> a) implements dyq.o {
      static final axx<dyq.q> c = axx.a(dyq.o.b.listOf().xmap(dyq.q::new, dyq.q::b).fieldOf("sequence"));

      @Override
      public axx<? extends dyq.o> a() {
         return c;
      }

      public dyq.u a(dyq.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dyq.u> $$1 = ImmutableList.builder();

            for (dyq.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dyq.p($$1.build());
         }
      }

      public List<dyq.o> b() {
         return this.a;
      }
   }

   static record r(dsh a) implements dyq.u {
      @Override
      public dsh tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dyq.f {
      a;

      static final axx<dyq.s> c = axx.a(MapCodec.unit(a));

      @Override
      public axx<? extends dyq.f> a() {
         return c;
      }

      public dyq.e a(dyq.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, ehl e) implements dyq.f {
      static final axx<dyq.t> f = axx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dyq.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dyq.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dyq.t::d),
                     ehl.c.fieldOf("surface_type").forGetter(dyq.t::e)
                  )
                  .apply($$0, dyq.t::new)
         )
      );

      @Override
      public axx<? extends dyq.f> a() {
         return f;
      }

      public dyq.e a(final dyq.g $$0) {
         final boolean $$1 = this.e == ehl.a;

         class a extends dyq.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)aye.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dsh tryApply(int var1, int var2, int var3);
   }

   static enum v implements dyq.f {
      a;

      static final axx<dyq.v> c = axx.a(MapCodec.unit(a));

      @Override
      public axx<? extends dyq.f> a() {
         return c;
      }

      public dyq.e a(dyq.g $$0) {
         return $$0.f;
      }
   }

   static record w(dyq.e a, dyq.u b) implements dyq.u {
      @Nullable
      @Override
      public dsh tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dyq.f a, dyq.o c) implements dyq.o {
      static final axx<dyq.x> d = axx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dyq.f.b.fieldOf("if_true").forGetter(dyq.x::b), dyq.o.b.fieldOf("then_run").forGetter(dyq.x::c)).apply($$0, dyq.x::new)
         )
      );

      @Override
      public axx<? extends dyq.o> a() {
         return d;
      }

      public dyq.u a(dyq.g $$0) {
         return new dyq.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dyq.f b() {
         return this.a;
      }
   }

   static record y(akk a, dyt c, dyt d) implements dyq.f {
      static final axx<dyq.y> e = axx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     akk.a.fieldOf("random_name").forGetter(dyq.y::b),
                     dyt.a.fieldOf("true_at_and_below").forGetter(dyq.y::c),
                     dyt.a.fieldOf("false_at_and_above").forGetter(dyq.y::d)
                  )
                  .apply($$0, dyq.y::new)
         )
      );

      @Override
      public axx<? extends dyq.f> a() {
         return e;
      }

      public dyq.e a(final dyq.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dym $$3 = $$0.j.a(this.b());

         class a extends dyq.k {
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
                  double $$1 = aye.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  aym $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public akk b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dyq.f {
      static final axx<dyq.z> e = axx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dyq.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dyq.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dyq.z::d)
                  )
                  .apply($$0, dyq.z::new)
         )
      );

      @Override
      public axx<? extends dyq.f> a() {
         return e;
      }

      public dyq.e a(final dyq.g $$0) {
         class a extends dyq.k {
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
