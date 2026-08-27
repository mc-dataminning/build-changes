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

public class dop {
   public static final dop.f a = a(0, false, dxj.b);
   public static final dop.f b = a(0, true, dxj.b);
   public static final dop.f c = a(0, true, 6, dxj.b);
   public static final dop.f d = a(0, true, 30, dxj.b);
   public static final dop.f e = a(0, false, dxj.a);
   public static final dop.f f = a(0, true, dxj.a);

   public static dop.f a(int $$0, boolean $$1, dxj $$2) {
      return new dop.t($$0, $$1, 0, $$2);
   }

   public static dop.f a(int $$0, boolean $$1, int $$2, dxj $$3) {
      return new dop.t($$0, $$1, $$2, $$3);
   }

   public static dop.f a(dop.f $$0) {
      return new dop.n($$0);
   }

   public static dop.f a(dos $$0, int $$1) {
      return new dop.aa($$0, $$1, false);
   }

   public static dop.f b(dos $$0, int $$1) {
      return new dop.aa($$0, $$1, true);
   }

   public static dop.f a(int $$0, int $$1) {
      return new dop.z($$0, $$1, false);
   }

   public static dop.f b(int $$0, int $$1) {
      return new dop.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dop.f a(ags<ctx>... $$0) {
      return a(List.of($$0));
   }

   private static dop.c a(List<ags<ctx>> $$0) {
      return new dop.c($$0);
   }

   public static dop.f a(ags<edc.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dop.f a(ags<edc.a> $$0, double $$1, double $$2) {
      return new dop.l($$0, $$1, $$2);
   }

   public static dop.f a(String $$0, dos $$1, dos $$2) {
      return new dop.y(new agt($$0), $$1, $$2);
   }

   public static dop.f a() {
      return dop.s.a;
   }

   public static dop.f b() {
      return dop.h.a;
   }

   public static dop.f c() {
      return dop.a.a;
   }

   public static dop.f d() {
      return dop.v.a;
   }

   public static dop.o a(dop.f $$0, dop.o $$1) {
      return new dop.x($$0, $$1);
   }

   public static dop.o a(dop.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dop.q(Arrays.asList($$0));
      }
   }

   public static dop.o a(dip $$0) {
      return new dop.d($$0);
   }

   public static dop.o e() {
      return dop.b.a;
   }

   static <A> Codec<? extends A> a(ir<Codec<? extends A>> $$0, String $$1, ats<? extends A> $$2) {
      return ir.a($$0, $$1, $$2.a());
   }

   static enum a implements dop.f {
      a;

      static final ats<dop.a> c = ats.a(MapCodec.unit(a));

      @Override
      public ats<? extends dop.f> a() {
         return c;
      }

      public dop.e a(dop.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dos a, int c, boolean d) implements dop.f {
      static final ats<dop.aa> e = ats.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dos.a.fieldOf("anchor").forGetter(dop.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dop.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dop.aa::d)
                  )
                  .apply($$0, dop.aa::new)
         )
      );

      @Override
      public ats<? extends dop.f> a() {
         return e;
      }

      public dop.e a(final dop.g $$0) {
         class a extends dop.k {
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

      public dos b() {
         return this.a;
      }
   }

   static enum b implements dop.o {
      a;

      static final ats<dop.b> c = ats.a(MapCodec.unit(a));

      @Override
      public ats<? extends dop.o> a() {
         return c;
      }

      public dop.u a(dop.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dop.f {
      static final ats<dop.c> a = ats.a(ags.a(kc.as).listOf().fieldOf("biome_is").xmap(dop::a, $$0 -> $$0.c));
      private final List<ags<ctx>> c;
      final Predicate<ags<ctx>> d;

      c(List<ags<ctx>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public ats<? extends dop.f> a() {
         return a;
      }

      public dop.e a(final dop.g $$0) {
         class a extends dop.k {
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
            return $$0 instanceof dop.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dip a, dop.r c) implements dop.o {
      static final ats<dop.d> d = ats.a(dip.b.xmap(dop.d::new, dop.d::b).fieldOf("result_state"));

      d(dip $$0) {
         this($$0, new dop.r($$0));
      }

      @Override
      public ats<? extends dop.o> a() {
         return d;
      }

      public dop.u a(dop.g $$0) {
         return this.c;
      }

      public dip b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dop.g, dop.e> {
      Codec<dop.f> b = kb.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dop.f> a(ir<Codec<? extends dop.f>> $$0) {
         dop.a($$0, "biome", dop.c.a);
         dop.a($$0, "noise_threshold", dop.l.e);
         dop.a($$0, "vertical_gradient", dop.y.e);
         dop.a($$0, "y_above", dop.aa.e);
         dop.a($$0, "water", dop.z.e);
         dop.a($$0, "temperature", dop.v.c);
         dop.a($$0, "steep", dop.s.c);
         dop.a($$0, "not", dop.n.c);
         dop.a($$0, "hole", dop.h.c);
         dop.a($$0, "above_preliminary_surface", dop.a.c);
         return dop.a($$0, "stone_depth", dop.t.f);
      }

      ats<? extends dop.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final doq e;
      final dop.e f = new dop.g.d(this);
      final dop.e g = new dop.g.c(this);
      final dop.e h = new dop.g.b(this);
      final dop.e i = new dop.g.a();
      final dom j;
      final dkl k;
      private final doc l;
      private final Function<hv, ie<ctx>> m;
      final dov n;
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
      final hv.a z = new hv.a();
      Supplier<ie<ctx>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(doq $$0, dom $$1, dkl $$2, doc $$3, Function<hv, ie<ctx>> $$4, ir<ctx> $$5, dov $$6) {
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
            long $$2 = csf.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = aty.a(
               aty.a(
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

      final class a implements dop.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dop.j {
         b(dop.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dop.j {
         c(dop.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dkl $$4 = this.c.k;
            int $$5 = $$4.a(dny.a.a, $$0, $$2);
            int $$6 = $$4.a(dny.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dny.a.a, $$7, $$1);
               int $$10 = $$4.a(dny.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dop.k {
         d(dop.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dop.f {
      a;

      static final ats<dop.h> c = ats.a(MapCodec.unit(a));

      @Override
      public ats<? extends dop.f> a() {
         return c;
      }

      public dop.e a(dop.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dop.e {
      protected final dop.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dop.g $$0) {
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

   abstract static class j extends dop.i {
      protected j(dop.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dop.i {
      protected k(dop.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(ags<edc.a> a, double c, double d) implements dop.f {
      static final ats<dop.l> e = ats.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ags.a(kc.aA).fieldOf("noise").forGetter(dop.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dop.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dop.l::d)
                  )
                  .apply($$0, dop.l::new)
         )
      );

      @Override
      public ats<? extends dop.f> a() {
         return e;
      }

      public dop.e a(final dop.g $$0) {
         final edc $$1 = $$0.j.a(this.a);

         class a extends dop.j {
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

      public ags<edc.a> b() {
         return this.a;
      }
   }

   static record m(dop.e a) implements dop.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dop.f a) implements dop.f {
      static final ats<dop.n> c = ats.a(dop.f.b.xmap(dop.n::new, dop.n::b).fieldOf("invert"));

      @Override
      public ats<? extends dop.f> a() {
         return c;
      }

      public dop.e a(dop.g $$0) {
         return new dop.m(this.a.apply($$0));
      }

      public dop.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dop.g, dop.u> {
      Codec<dop.o> b = kb.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dop.o> a(ir<Codec<? extends dop.o>> $$0) {
         dop.a($$0, "bandlands", dop.b.c);
         dop.a($$0, "block", dop.d.d);
         dop.a($$0, "sequence", dop.q.c);
         return dop.a($$0, "condition", dop.x.d);
      }

      ats<? extends dop.o> a();
   }

   static record p(List<dop.u> a) implements dop.u {
      @Nullable
      @Override
      public dip tryApply(int $$0, int $$1, int $$2) {
         for (dop.u $$3 : this.a) {
            dip $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dop.o> a) implements dop.o {
      static final ats<dop.q> c = ats.a(dop.o.b.listOf().xmap(dop.q::new, dop.q::b).fieldOf("sequence"));

      @Override
      public ats<? extends dop.o> a() {
         return c;
      }

      public dop.u a(dop.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dop.u> $$1 = ImmutableList.builder();

            for (dop.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dop.p($$1.build());
         }
      }

      public List<dop.o> b() {
         return this.a;
      }
   }

   static record r(dip a) implements dop.u {
      @Override
      public dip tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dop.f {
      a;

      static final ats<dop.s> c = ats.a(MapCodec.unit(a));

      @Override
      public ats<? extends dop.f> a() {
         return c;
      }

      public dop.e a(dop.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, dxj e) implements dop.f {
      static final ats<dop.t> f = ats.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dop.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dop.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dop.t::d),
                     dxj.c.fieldOf("surface_type").forGetter(dop.t::e)
                  )
                  .apply($$0, dop.t::new)
         )
      );

      @Override
      public ats<? extends dop.f> a() {
         return f;
      }

      public dop.e a(final dop.g $$0) {
         final boolean $$1 = this.e == dxj.a;

         class a extends dop.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)aty.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dip tryApply(int var1, int var2, int var3);
   }

   static enum v implements dop.f {
      a;

      static final ats<dop.v> c = ats.a(MapCodec.unit(a));

      @Override
      public ats<? extends dop.f> a() {
         return c;
      }

      public dop.e a(dop.g $$0) {
         return $$0.f;
      }
   }

   static record w(dop.e a, dop.u b) implements dop.u {
      @Nullable
      @Override
      public dip tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dop.f a, dop.o c) implements dop.o {
      static final ats<dop.x> d = ats.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dop.f.b.fieldOf("if_true").forGetter(dop.x::b), dop.o.b.fieldOf("then_run").forGetter(dop.x::c)).apply($$0, dop.x::new)
         )
      );

      @Override
      public ats<? extends dop.o> a() {
         return d;
      }

      public dop.u a(dop.g $$0) {
         return new dop.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dop.f b() {
         return this.a;
      }
   }

   static record y(agt a, dos c, dos d) implements dop.f {
      static final ats<dop.y> e = ats.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     agt.a.fieldOf("random_name").forGetter(dop.y::b),
                     dos.a.fieldOf("true_at_and_below").forGetter(dop.y::c),
                     dos.a.fieldOf("false_at_and_above").forGetter(dop.y::d)
                  )
                  .apply($$0, dop.y::new)
         )
      );

      @Override
      public ats<? extends dop.f> a() {
         return e;
      }

      public dop.e a(final dop.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dol $$3 = $$0.j.a(this.b());

         class a extends dop.k {
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
                  double $$1 = aty.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  auf $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public agt b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dop.f {
      static final ats<dop.z> e = ats.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dop.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dop.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dop.z::d)
                  )
                  .apply($$0, dop.z::new)
         )
      );

      @Override
      public ats<? extends dop.f> a() {
         return e;
      }

      public dop.e a(final dop.g $$0) {
         class a extends dop.k {
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
