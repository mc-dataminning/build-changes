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

public class dxm {
   public static final dxm.f a = a(0, false, egg.b);
   public static final dxm.f b = a(0, true, egg.b);
   public static final dxm.f c = a(0, true, 6, egg.b);
   public static final dxm.f d = a(0, true, 30, egg.b);
   public static final dxm.f e = a(0, false, egg.a);
   public static final dxm.f f = a(0, true, egg.a);

   public static dxm.f a(int $$0, boolean $$1, egg $$2) {
      return new dxm.t($$0, $$1, 0, $$2);
   }

   public static dxm.f a(int $$0, boolean $$1, int $$2, egg $$3) {
      return new dxm.t($$0, $$1, $$2, $$3);
   }

   public static dxm.f a(dxm.f $$0) {
      return new dxm.n($$0);
   }

   public static dxm.f a(dxp $$0, int $$1) {
      return new dxm.aa($$0, $$1, false);
   }

   public static dxm.f b(dxp $$0, int $$1) {
      return new dxm.aa($$0, $$1, true);
   }

   public static dxm.f a(int $$0, int $$1) {
      return new dxm.z($$0, $$1, false);
   }

   public static dxm.f b(int $$0, int $$1) {
      return new dxm.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dxm.f a(akm<dby>... $$0) {
      return a(List.of($$0));
   }

   private static dxm.c a(List<akm<dby>> $$0) {
      return new dxm.c($$0);
   }

   public static dxm.f a(akm<elz.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dxm.f a(akm<elz.a> $$0, double $$1, double $$2) {
      return new dxm.l($$0, $$1, $$2);
   }

   public static dxm.f a(String $$0, dxp $$1, dxp $$2) {
      return new dxm.y(new akn($$0), $$1, $$2);
   }

   public static dxm.f a() {
      return dxm.s.a;
   }

   public static dxm.f b() {
      return dxm.h.a;
   }

   public static dxm.f c() {
      return dxm.a.a;
   }

   public static dxm.f d() {
      return dxm.v.a;
   }

   public static dxm.o a(dxm.f $$0, dxm.o $$1) {
      return new dxm.x($$0, $$1);
   }

   public static dxm.o a(dxm.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dxm.q(Arrays.asList($$0));
      }
   }

   public static dxm.o a(drd $$0) {
      return new dxm.d($$0);
   }

   public static dxm.o e() {
      return dxm.b.a;
   }

   static <A> MapCodec<? extends A> a(jk<MapCodec<? extends A>> $$0, String $$1, axy<? extends A> $$2) {
      return jk.a($$0, $$1, $$2.a());
   }

   static enum a implements dxm.f {
      a;

      static final axy<dxm.a> c = axy.a(MapCodec.unit(a));

      @Override
      public axy<? extends dxm.f> a() {
         return c;
      }

      public dxm.e a(dxm.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dxp a, int c, boolean d) implements dxm.f {
      static final axy<dxm.aa> e = axy.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dxp.a.fieldOf("anchor").forGetter(dxm.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dxm.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dxm.aa::d)
                  )
                  .apply($$0, dxm.aa::new)
         )
      );

      @Override
      public axy<? extends dxm.f> a() {
         return e;
      }

      public dxm.e a(final dxm.g $$0) {
         class a extends dxm.k {
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

      public dxp b() {
         return this.a;
      }
   }

   static enum b implements dxm.o {
      a;

      static final axy<dxm.b> c = axy.a(MapCodec.unit(a));

      @Override
      public axy<? extends dxm.o> a() {
         return c;
      }

      public dxm.u a(dxm.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dxm.f {
      static final axy<dxm.c> a = axy.a(akm.a(lf.az).listOf().fieldOf("biome_is").xmap(dxm::a, $$0 -> $$0.c));
      private final List<akm<dby>> c;
      final Predicate<akm<dby>> d;

      c(List<akm<dby>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public axy<? extends dxm.f> a() {
         return a;
      }

      public dxm.e a(final dxm.g $$0) {
         class a extends dxm.k {
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
            return $$0 instanceof dxm.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(drd a, dxm.r c) implements dxm.o {
      static final axy<dxm.d> d = axy.a(drd.b.xmap(dxm.d::new, dxm.d::b).fieldOf("result_state"));

      d(drd $$0) {
         this($$0, new dxm.r($$0));
      }

      @Override
      public axy<? extends dxm.o> a() {
         return d;
      }

      public dxm.u a(dxm.g $$0) {
         return this.c;
      }

      public drd b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dxm.g, dxm.e> {
      Codec<dxm.f> b = le.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dxm.f> a(jk<MapCodec<? extends dxm.f>> $$0) {
         dxm.a($$0, "biome", dxm.c.a);
         dxm.a($$0, "noise_threshold", dxm.l.e);
         dxm.a($$0, "vertical_gradient", dxm.y.e);
         dxm.a($$0, "y_above", dxm.aa.e);
         dxm.a($$0, "water", dxm.z.e);
         dxm.a($$0, "temperature", dxm.v.c);
         dxm.a($$0, "steep", dxm.s.c);
         dxm.a($$0, "not", dxm.n.c);
         dxm.a($$0, "hole", dxm.h.c);
         dxm.a($$0, "above_preliminary_surface", dxm.a.c);
         return dxm.a($$0, "stone_depth", dxm.t.f);
      }

      axy<? extends dxm.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dxn e;
      final dxm.e f = new dxm.g.d(this);
      final dxm.e g = new dxm.g.c(this);
      final dxm.e h = new dxm.g.b(this);
      final dxm.e i = new dxm.g.a();
      final dxj j;
      final dsz k;
      private final dwz l;
      private final Function<io, ix<dby>> m;
      final dxs n;
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
      final io.a z = new io.a();
      Supplier<ix<dby>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dxn $$0, dxj $$1, dsz $$2, dwz $$3, Function<io, ix<dby>> $$4, jk<dby> $$5, dxs $$6) {
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
            long $$2 = dag.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = ayf.a(
               ayf.a(
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

      final class a implements dxm.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dxm.j {
         b(dxm.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dxm.j {
         c(dxm.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dsz $$4 = this.c.k;
            int $$5 = $$4.a(dwv.a.a, $$0, $$2);
            int $$6 = $$4.a(dwv.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dwv.a.a, $$7, $$1);
               int $$10 = $$4.a(dwv.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dxm.k {
         d(dxm.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dxm.f {
      a;

      static final axy<dxm.h> c = axy.a(MapCodec.unit(a));

      @Override
      public axy<? extends dxm.f> a() {
         return c;
      }

      public dxm.e a(dxm.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dxm.e {
      protected final dxm.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dxm.g $$0) {
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

   abstract static class j extends dxm.i {
      protected j(dxm.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dxm.i {
      protected k(dxm.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(akm<elz.a> a, double c, double d) implements dxm.f {
      static final axy<dxm.l> e = axy.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     akm.a(lf.aH).fieldOf("noise").forGetter(dxm.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dxm.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dxm.l::d)
                  )
                  .apply($$0, dxm.l::new)
         )
      );

      @Override
      public axy<? extends dxm.f> a() {
         return e;
      }

      public dxm.e a(final dxm.g $$0) {
         final elz $$1 = $$0.j.a(this.a);

         class a extends dxm.j {
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

      public akm<elz.a> b() {
         return this.a;
      }
   }

   static record m(dxm.e a) implements dxm.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dxm.f a) implements dxm.f {
      static final axy<dxm.n> c = axy.a(dxm.f.b.xmap(dxm.n::new, dxm.n::b).fieldOf("invert"));

      @Override
      public axy<? extends dxm.f> a() {
         return c;
      }

      public dxm.e a(dxm.g $$0) {
         return new dxm.m(this.a.apply($$0));
      }

      public dxm.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dxm.g, dxm.u> {
      Codec<dxm.o> b = le.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dxm.o> a(jk<MapCodec<? extends dxm.o>> $$0) {
         dxm.a($$0, "bandlands", dxm.b.c);
         dxm.a($$0, "block", dxm.d.d);
         dxm.a($$0, "sequence", dxm.q.c);
         return dxm.a($$0, "condition", dxm.x.d);
      }

      axy<? extends dxm.o> a();
   }

   static record p(List<dxm.u> a) implements dxm.u {
      @Nullable
      @Override
      public drd tryApply(int $$0, int $$1, int $$2) {
         for (dxm.u $$3 : this.a) {
            drd $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dxm.o> a) implements dxm.o {
      static final axy<dxm.q> c = axy.a(dxm.o.b.listOf().xmap(dxm.q::new, dxm.q::b).fieldOf("sequence"));

      @Override
      public axy<? extends dxm.o> a() {
         return c;
      }

      public dxm.u a(dxm.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dxm.u> $$1 = ImmutableList.builder();

            for (dxm.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dxm.p($$1.build());
         }
      }

      public List<dxm.o> b() {
         return this.a;
      }
   }

   static record r(drd a) implements dxm.u {
      @Override
      public drd tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dxm.f {
      a;

      static final axy<dxm.s> c = axy.a(MapCodec.unit(a));

      @Override
      public axy<? extends dxm.f> a() {
         return c;
      }

      public dxm.e a(dxm.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, egg e) implements dxm.f {
      static final axy<dxm.t> f = axy.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dxm.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dxm.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dxm.t::d),
                     egg.c.fieldOf("surface_type").forGetter(dxm.t::e)
                  )
                  .apply($$0, dxm.t::new)
         )
      );

      @Override
      public axy<? extends dxm.f> a() {
         return f;
      }

      public dxm.e a(final dxm.g $$0) {
         final boolean $$1 = this.e == egg.a;

         class a extends dxm.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)ayf.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      drd tryApply(int var1, int var2, int var3);
   }

   static enum v implements dxm.f {
      a;

      static final axy<dxm.v> c = axy.a(MapCodec.unit(a));

      @Override
      public axy<? extends dxm.f> a() {
         return c;
      }

      public dxm.e a(dxm.g $$0) {
         return $$0.f;
      }
   }

   static record w(dxm.e a, dxm.u b) implements dxm.u {
      @Nullable
      @Override
      public drd tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dxm.f a, dxm.o c) implements dxm.o {
      static final axy<dxm.x> d = axy.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dxm.f.b.fieldOf("if_true").forGetter(dxm.x::b), dxm.o.b.fieldOf("then_run").forGetter(dxm.x::c)).apply($$0, dxm.x::new)
         )
      );

      @Override
      public axy<? extends dxm.o> a() {
         return d;
      }

      public dxm.u a(dxm.g $$0) {
         return new dxm.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dxm.f b() {
         return this.a;
      }
   }

   static record y(akn a, dxp c, dxp d) implements dxm.f {
      static final axy<dxm.y> e = axy.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     akn.a.fieldOf("random_name").forGetter(dxm.y::b),
                     dxp.a.fieldOf("true_at_and_below").forGetter(dxm.y::c),
                     dxp.a.fieldOf("false_at_and_above").forGetter(dxm.y::d)
                  )
                  .apply($$0, dxm.y::new)
         )
      );

      @Override
      public axy<? extends dxm.f> a() {
         return e;
      }

      public dxm.e a(final dxm.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dxi $$3 = $$0.j.a(this.b());

         class a extends dxm.k {
            a(dxm.y $$0x) {
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
                  double $$1 = ayf.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  aym $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a(this);
      }

      public akn b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dxm.f {
      static final axy<dxm.z> e = axy.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dxm.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dxm.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dxm.z::d)
                  )
                  .apply($$0, dxm.z::new)
         )
      );

      @Override
      public axy<? extends dxm.f> a() {
         return e;
      }

      public dxm.e a(final dxm.g $$0) {
         class a extends dxm.k {
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
