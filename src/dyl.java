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

public class dyl {
   public static final dyl.f a = a(0, false, ehf.b);
   public static final dyl.f b = a(0, true, ehf.b);
   public static final dyl.f c = a(0, true, 6, ehf.b);
   public static final dyl.f d = a(0, true, 30, ehf.b);
   public static final dyl.f e = a(0, false, ehf.a);
   public static final dyl.f f = a(0, true, ehf.a);

   public static dyl.f a(int $$0, boolean $$1, ehf $$2) {
      return new dyl.t($$0, $$1, 0, $$2);
   }

   public static dyl.f a(int $$0, boolean $$1, int $$2, ehf $$3) {
      return new dyl.t($$0, $$1, $$2, $$3);
   }

   public static dyl.f a(dyl.f $$0) {
      return new dyl.n($$0);
   }

   public static dyl.f a(dyo $$0, int $$1) {
      return new dyl.aa($$0, $$1, false);
   }

   public static dyl.f b(dyo $$0, int $$1) {
      return new dyl.aa($$0, $$1, true);
   }

   public static dyl.f a(int $$0, int $$1) {
      return new dyl.z($$0, $$1, false);
   }

   public static dyl.f b(int $$0, int $$1) {
      return new dyl.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dyl.f a(ale<dcx>... $$0) {
      return a(List.of($$0));
   }

   private static dyl.c a(List<ale<dcx>> $$0) {
      return new dyl.c($$0);
   }

   public static dyl.f a(ale<emy.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dyl.f a(ale<emy.a> $$0, double $$1, double $$2) {
      return new dyl.l($$0, $$1, $$2);
   }

   public static dyl.f a(String $$0, dyo $$1, dyo $$2) {
      return new dyl.y(new alf($$0), $$1, $$2);
   }

   public static dyl.f a() {
      return dyl.s.a;
   }

   public static dyl.f b() {
      return dyl.h.a;
   }

   public static dyl.f c() {
      return dyl.a.a;
   }

   public static dyl.f d() {
      return dyl.v.a;
   }

   public static dyl.o a(dyl.f $$0, dyl.o $$1) {
      return new dyl.x($$0, $$1);
   }

   public static dyl.o a(dyl.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dyl.q(Arrays.asList($$0));
      }
   }

   public static dyl.o a(dsc $$0) {
      return new dyl.d($$0);
   }

   public static dyl.o e() {
      return dyl.b.a;
   }

   static <A> MapCodec<? extends A> a(jv<MapCodec<? extends A>> $$0, String $$1, ays<? extends A> $$2) {
      return jv.a($$0, $$1, $$2.a());
   }

   static enum a implements dyl.f {
      a;

      static final ays<dyl.a> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends dyl.f> a() {
         return c;
      }

      public dyl.e a(dyl.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dyo a, int c, boolean d) implements dyl.f {
      static final ays<dyl.aa> e = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dyo.a.fieldOf("anchor").forGetter(dyl.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dyl.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dyl.aa::d)
                  )
                  .apply($$0, dyl.aa::new)
         )
      );

      @Override
      public ays<? extends dyl.f> a() {
         return e;
      }

      public dyl.e a(final dyl.g $$0) {
         class a extends dyl.k {
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

      public dyo b() {
         return this.a;
      }
   }

   static enum b implements dyl.o {
      a;

      static final ays<dyl.b> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends dyl.o> a() {
         return c;
      }

      public dyl.u a(dyl.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dyl.f {
      static final ays<dyl.c> a = ays.a(ale.a(lq.az).listOf().fieldOf("biome_is").xmap(dyl::a, $$0 -> $$0.c));
      private final List<ale<dcx>> c;
      final Predicate<ale<dcx>> d;

      c(List<ale<dcx>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public ays<? extends dyl.f> a() {
         return a;
      }

      public dyl.e a(final dyl.g $$0) {
         class a extends dyl.k {
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
            return $$0 instanceof dyl.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dsc a, dyl.r c) implements dyl.o {
      static final ays<dyl.d> d = ays.a(dsc.b.xmap(dyl.d::new, dyl.d::b).fieldOf("result_state"));

      d(dsc $$0) {
         this($$0, new dyl.r($$0));
      }

      @Override
      public ays<? extends dyl.o> a() {
         return d;
      }

      public dyl.u a(dyl.g $$0) {
         return this.c;
      }

      public dsc b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dyl.g, dyl.e> {
      Codec<dyl.f> b = lp.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dyl.f> a(jv<MapCodec<? extends dyl.f>> $$0) {
         dyl.a($$0, "biome", dyl.c.a);
         dyl.a($$0, "noise_threshold", dyl.l.e);
         dyl.a($$0, "vertical_gradient", dyl.y.e);
         dyl.a($$0, "y_above", dyl.aa.e);
         dyl.a($$0, "water", dyl.z.e);
         dyl.a($$0, "temperature", dyl.v.c);
         dyl.a($$0, "steep", dyl.s.c);
         dyl.a($$0, "not", dyl.n.c);
         dyl.a($$0, "hole", dyl.h.c);
         dyl.a($$0, "above_preliminary_surface", dyl.a.c);
         return dyl.a($$0, "stone_depth", dyl.t.f);
      }

      ays<? extends dyl.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dym e;
      final dyl.e f = new dyl.g.d(this);
      final dyl.e g = new dyl.g.c(this);
      final dyl.e h = new dyl.g.b(this);
      final dyl.e i = new dyl.g.a();
      final dyi j;
      final dty k;
      private final dxy l;
      private final Function<iz, ji<dcx>> m;
      final dyr n;
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
      Supplier<ji<dcx>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dym $$0, dyi $$1, dty $$2, dxy $$3, Function<iz, ji<dcx>> $$4, jv<dcx> $$5, dyr $$6) {
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
            long $$2 = dbf.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = ayz.a(
               ayz.a(
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

      final class a implements dyl.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dyl.j {
         b(dyl.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dyl.j {
         c(dyl.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dty $$4 = this.c.k;
            int $$5 = $$4.a(dxu.a.a, $$0, $$2);
            int $$6 = $$4.a(dxu.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dxu.a.a, $$7, $$1);
               int $$10 = $$4.a(dxu.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dyl.k {
         d(dyl.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dyl.f {
      a;

      static final ays<dyl.h> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends dyl.f> a() {
         return c;
      }

      public dyl.e a(dyl.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dyl.e {
      protected final dyl.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dyl.g $$0) {
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

   abstract static class j extends dyl.i {
      protected j(dyl.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dyl.i {
      protected k(dyl.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(ale<emy.a> a, double c, double d) implements dyl.f {
      static final ays<dyl.l> e = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ale.a(lq.aH).fieldOf("noise").forGetter(dyl.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dyl.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dyl.l::d)
                  )
                  .apply($$0, dyl.l::new)
         )
      );

      @Override
      public ays<? extends dyl.f> a() {
         return e;
      }

      public dyl.e a(final dyl.g $$0) {
         final emy $$1 = $$0.j.a(this.a);

         class a extends dyl.j {
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

      public ale<emy.a> b() {
         return this.a;
      }
   }

   static record m(dyl.e a) implements dyl.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dyl.f a) implements dyl.f {
      static final ays<dyl.n> c = ays.a(dyl.f.b.xmap(dyl.n::new, dyl.n::b).fieldOf("invert"));

      @Override
      public ays<? extends dyl.f> a() {
         return c;
      }

      public dyl.e a(dyl.g $$0) {
         return new dyl.m(this.a.apply($$0));
      }

      public dyl.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dyl.g, dyl.u> {
      Codec<dyl.o> b = lp.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends dyl.o> a(jv<MapCodec<? extends dyl.o>> $$0) {
         dyl.a($$0, "bandlands", dyl.b.c);
         dyl.a($$0, "block", dyl.d.d);
         dyl.a($$0, "sequence", dyl.q.c);
         return dyl.a($$0, "condition", dyl.x.d);
      }

      ays<? extends dyl.o> a();
   }

   static record p(List<dyl.u> a) implements dyl.u {
      @Nullable
      @Override
      public dsc tryApply(int $$0, int $$1, int $$2) {
         for (dyl.u $$3 : this.a) {
            dsc $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dyl.o> a) implements dyl.o {
      static final ays<dyl.q> c = ays.a(dyl.o.b.listOf().xmap(dyl.q::new, dyl.q::b).fieldOf("sequence"));

      @Override
      public ays<? extends dyl.o> a() {
         return c;
      }

      public dyl.u a(dyl.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dyl.u> $$1 = ImmutableList.builder();

            for (dyl.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dyl.p($$1.build());
         }
      }

      public List<dyl.o> b() {
         return this.a;
      }
   }

   static record r(dsc a) implements dyl.u {
      @Override
      public dsc tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dyl.f {
      a;

      static final ays<dyl.s> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends dyl.f> a() {
         return c;
      }

      public dyl.e a(dyl.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, ehf e) implements dyl.f {
      static final ays<dyl.t> f = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dyl.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dyl.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dyl.t::d),
                     ehf.c.fieldOf("surface_type").forGetter(dyl.t::e)
                  )
                  .apply($$0, dyl.t::new)
         )
      );

      @Override
      public ays<? extends dyl.f> a() {
         return f;
      }

      public dyl.e a(final dyl.g $$0) {
         final boolean $$1 = this.e == ehf.a;

         class a extends dyl.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)ayz.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dsc tryApply(int var1, int var2, int var3);
   }

   static enum v implements dyl.f {
      a;

      static final ays<dyl.v> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends dyl.f> a() {
         return c;
      }

      public dyl.e a(dyl.g $$0) {
         return $$0.f;
      }
   }

   static record w(dyl.e a, dyl.u b) implements dyl.u {
      @Nullable
      @Override
      public dsc tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dyl.f a, dyl.o c) implements dyl.o {
      static final ays<dyl.x> d = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dyl.f.b.fieldOf("if_true").forGetter(dyl.x::b), dyl.o.b.fieldOf("then_run").forGetter(dyl.x::c)).apply($$0, dyl.x::new)
         )
      );

      @Override
      public ays<? extends dyl.o> a() {
         return d;
      }

      public dyl.u a(dyl.g $$0) {
         return new dyl.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dyl.f b() {
         return this.a;
      }
   }

   static record y(alf a, dyo c, dyo d) implements dyl.f {
      static final ays<dyl.y> e = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alf.a.fieldOf("random_name").forGetter(dyl.y::b),
                     dyo.a.fieldOf("true_at_and_below").forGetter(dyl.y::c),
                     dyo.a.fieldOf("false_at_and_above").forGetter(dyl.y::d)
                  )
                  .apply($$0, dyl.y::new)
         )
      );

      @Override
      public ays<? extends dyl.f> a() {
         return e;
      }

      public dyl.e a(final dyl.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dyh $$3 = $$0.j.a(this.b());

         class a extends dyl.k {
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
                  double $$1 = ayz.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  azh $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public alf b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dyl.f {
      static final ays<dyl.z> e = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dyl.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dyl.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dyl.z::d)
                  )
                  .apply($$0, dyl.z::new)
         )
      );

      @Override
      public ays<? extends dyl.f> a() {
         return e;
      }

      public dyl.e a(final dyl.g $$0) {
         class a extends dyl.k {
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
