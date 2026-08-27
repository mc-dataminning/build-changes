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

public class dsh {
   public static final dsh.f a = a(0, false, ebb.b);
   public static final dsh.f b = a(0, true, ebb.b);
   public static final dsh.f c = a(0, true, 6, ebb.b);
   public static final dsh.f d = a(0, true, 30, ebb.b);
   public static final dsh.f e = a(0, false, ebb.a);
   public static final dsh.f f = a(0, true, ebb.a);

   public static dsh.f a(int $$0, boolean $$1, ebb $$2) {
      return new dsh.t($$0, $$1, 0, $$2);
   }

   public static dsh.f a(int $$0, boolean $$1, int $$2, ebb $$3) {
      return new dsh.t($$0, $$1, $$2, $$3);
   }

   public static dsh.f a(dsh.f $$0) {
      return new dsh.n($$0);
   }

   public static dsh.f a(dsk $$0, int $$1) {
      return new dsh.aa($$0, $$1, false);
   }

   public static dsh.f b(dsk $$0, int $$1) {
      return new dsh.aa($$0, $$1, true);
   }

   public static dsh.f a(int $$0, int $$1) {
      return new dsh.z($$0, $$1, false);
   }

   public static dsh.f b(int $$0, int $$1) {
      return new dsh.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dsh.f a(ajb<cxd>... $$0) {
      return a(List.of($$0));
   }

   private static dsh.c a(List<ajb<cxd>> $$0) {
      return new dsh.c($$0);
   }

   public static dsh.f a(ajb<egu.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dsh.f a(ajb<egu.a> $$0, double $$1, double $$2) {
      return new dsh.l($$0, $$1, $$2);
   }

   public static dsh.f a(String $$0, dsk $$1, dsk $$2) {
      return new dsh.y(new ajc($$0), $$1, $$2);
   }

   public static dsh.f a() {
      return dsh.s.a;
   }

   public static dsh.f b() {
      return dsh.h.a;
   }

   public static dsh.f c() {
      return dsh.a.a;
   }

   public static dsh.f d() {
      return dsh.v.a;
   }

   public static dsh.o a(dsh.f $$0, dsh.o $$1) {
      return new dsh.x($$0, $$1);
   }

   public static dsh.o a(dsh.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dsh.q(Arrays.asList($$0));
      }
   }

   public static dsh.o a(dme $$0) {
      return new dsh.d($$0);
   }

   public static dsh.o e() {
      return dsh.b.a;
   }

   static <A> Codec<? extends A> a(ix<Codec<? extends A>> $$0, String $$1, awg<? extends A> $$2) {
      return ix.a($$0, $$1, $$2.a());
   }

   static enum a implements dsh.f {
      a;

      static final awg<dsh.a> c = awg.a(MapCodec.unit(a));

      @Override
      public awg<? extends dsh.f> a() {
         return c;
      }

      public dsh.e a(dsh.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dsk a, int c, boolean d) implements dsh.f {
      static final awg<dsh.aa> e = awg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dsk.a.fieldOf("anchor").forGetter(dsh.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dsh.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dsh.aa::d)
                  )
                  .apply($$0, dsh.aa::new)
         )
      );

      @Override
      public awg<? extends dsh.f> a() {
         return e;
      }

      public dsh.e a(final dsh.g $$0) {
         class a extends dsh.k {
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

      public dsk b() {
         return this.a;
      }
   }

   static enum b implements dsh.o {
      a;

      static final awg<dsh.b> c = awg.a(MapCodec.unit(a));

      @Override
      public awg<? extends dsh.o> a() {
         return c;
      }

      public dsh.u a(dsh.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dsh.f {
      static final awg<dsh.c> a = awg.a(ajb.a(ki.au).listOf().fieldOf("biome_is").xmap(dsh::a, $$0 -> $$0.c));
      private final List<ajb<cxd>> c;
      final Predicate<ajb<cxd>> d;

      c(List<ajb<cxd>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public awg<? extends dsh.f> a() {
         return a;
      }

      public dsh.e a(final dsh.g $$0) {
         class a extends dsh.k {
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
            return $$0 instanceof dsh.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dme a, dsh.r c) implements dsh.o {
      static final awg<dsh.d> d = awg.a(dme.b.xmap(dsh.d::new, dsh.d::b).fieldOf("result_state"));

      d(dme $$0) {
         this($$0, new dsh.r($$0));
      }

      @Override
      public awg<? extends dsh.o> a() {
         return d;
      }

      public dsh.u a(dsh.g $$0) {
         return this.c;
      }

      public dme b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dsh.g, dsh.e> {
      Codec<dsh.f> b = kh.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dsh.f> a(ix<Codec<? extends dsh.f>> $$0) {
         dsh.a($$0, "biome", dsh.c.a);
         dsh.a($$0, "noise_threshold", dsh.l.e);
         dsh.a($$0, "vertical_gradient", dsh.y.e);
         dsh.a($$0, "y_above", dsh.aa.e);
         dsh.a($$0, "water", dsh.z.e);
         dsh.a($$0, "temperature", dsh.v.c);
         dsh.a($$0, "steep", dsh.s.c);
         dsh.a($$0, "not", dsh.n.c);
         dsh.a($$0, "hole", dsh.h.c);
         dsh.a($$0, "above_preliminary_surface", dsh.a.c);
         return dsh.a($$0, "stone_depth", dsh.t.f);
      }

      awg<? extends dsh.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dsi e;
      final dsh.e f = new dsh.g.d(this);
      final dsh.e g = new dsh.g.c(this);
      final dsh.e h = new dsh.g.b(this);
      final dsh.e i = new dsh.g.a();
      final dse j;
      final doa k;
      private final dru l;
      private final Function<ib, il<cxd>> m;
      final dsn n;
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
      Supplier<il<cxd>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dsi $$0, dse $$1, doa $$2, dru $$3, Function<ib, il<cxd>> $$4, ix<cxd> $$5, dsn $$6) {
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
            long $$2 = cvl.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = awm.a(
               awm.a(
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

      final class a implements dsh.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dsh.j {
         b(dsh.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dsh.j {
         c(dsh.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            doa $$4 = this.c.k;
            int $$5 = $$4.a(drq.a.a, $$0, $$2);
            int $$6 = $$4.a(drq.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(drq.a.a, $$7, $$1);
               int $$10 = $$4.a(drq.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dsh.k {
         d(dsh.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dsh.f {
      a;

      static final awg<dsh.h> c = awg.a(MapCodec.unit(a));

      @Override
      public awg<? extends dsh.f> a() {
         return c;
      }

      public dsh.e a(dsh.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dsh.e {
      protected final dsh.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dsh.g $$0) {
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

   abstract static class j extends dsh.i {
      protected j(dsh.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dsh.i {
      protected k(dsh.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(ajb<egu.a> a, double c, double d) implements dsh.f {
      static final awg<dsh.l> e = awg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ajb.a(ki.aC).fieldOf("noise").forGetter(dsh.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dsh.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dsh.l::d)
                  )
                  .apply($$0, dsh.l::new)
         )
      );

      @Override
      public awg<? extends dsh.f> a() {
         return e;
      }

      public dsh.e a(final dsh.g $$0) {
         final egu $$1 = $$0.j.a(this.a);

         class a extends dsh.j {
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

      public ajb<egu.a> b() {
         return this.a;
      }
   }

   static record m(dsh.e a) implements dsh.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dsh.f a) implements dsh.f {
      static final awg<dsh.n> c = awg.a(dsh.f.b.xmap(dsh.n::new, dsh.n::b).fieldOf("invert"));

      @Override
      public awg<? extends dsh.f> a() {
         return c;
      }

      public dsh.e a(dsh.g $$0) {
         return new dsh.m(this.a.apply($$0));
      }

      public dsh.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dsh.g, dsh.u> {
      Codec<dsh.o> b = kh.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dsh.o> a(ix<Codec<? extends dsh.o>> $$0) {
         dsh.a($$0, "bandlands", dsh.b.c);
         dsh.a($$0, "block", dsh.d.d);
         dsh.a($$0, "sequence", dsh.q.c);
         return dsh.a($$0, "condition", dsh.x.d);
      }

      awg<? extends dsh.o> a();
   }

   static record p(List<dsh.u> a) implements dsh.u {
      @Nullable
      @Override
      public dme tryApply(int $$0, int $$1, int $$2) {
         for (dsh.u $$3 : this.a) {
            dme $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dsh.o> a) implements dsh.o {
      static final awg<dsh.q> c = awg.a(dsh.o.b.listOf().xmap(dsh.q::new, dsh.q::b).fieldOf("sequence"));

      @Override
      public awg<? extends dsh.o> a() {
         return c;
      }

      public dsh.u a(dsh.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dsh.u> $$1 = ImmutableList.builder();

            for (dsh.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dsh.p($$1.build());
         }
      }

      public List<dsh.o> b() {
         return this.a;
      }
   }

   static record r(dme a) implements dsh.u {
      @Override
      public dme tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dsh.f {
      a;

      static final awg<dsh.s> c = awg.a(MapCodec.unit(a));

      @Override
      public awg<? extends dsh.f> a() {
         return c;
      }

      public dsh.e a(dsh.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, ebb e) implements dsh.f {
      static final awg<dsh.t> f = awg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dsh.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dsh.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dsh.t::d),
                     ebb.c.fieldOf("surface_type").forGetter(dsh.t::e)
                  )
                  .apply($$0, dsh.t::new)
         )
      );

      @Override
      public awg<? extends dsh.f> a() {
         return f;
      }

      public dsh.e a(final dsh.g $$0) {
         final boolean $$1 = this.e == ebb.a;

         class a extends dsh.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)awm.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dme tryApply(int var1, int var2, int var3);
   }

   static enum v implements dsh.f {
      a;

      static final awg<dsh.v> c = awg.a(MapCodec.unit(a));

      @Override
      public awg<? extends dsh.f> a() {
         return c;
      }

      public dsh.e a(dsh.g $$0) {
         return $$0.f;
      }
   }

   static record w(dsh.e a, dsh.u b) implements dsh.u {
      @Nullable
      @Override
      public dme tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dsh.f a, dsh.o c) implements dsh.o {
      static final awg<dsh.x> d = awg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dsh.f.b.fieldOf("if_true").forGetter(dsh.x::b), dsh.o.b.fieldOf("then_run").forGetter(dsh.x::c)).apply($$0, dsh.x::new)
         )
      );

      @Override
      public awg<? extends dsh.o> a() {
         return d;
      }

      public dsh.u a(dsh.g $$0) {
         return new dsh.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dsh.f b() {
         return this.a;
      }
   }

   static record y(ajc a, dsk c, dsk d) implements dsh.f {
      static final awg<dsh.y> e = awg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ajc.a.fieldOf("random_name").forGetter(dsh.y::b),
                     dsk.a.fieldOf("true_at_and_below").forGetter(dsh.y::c),
                     dsk.a.fieldOf("false_at_and_above").forGetter(dsh.y::d)
                  )
                  .apply($$0, dsh.y::new)
         )
      );

      @Override
      public awg<? extends dsh.f> a() {
         return e;
      }

      public dsh.e a(final dsh.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dsd $$3 = $$0.j.a(this.b());

         class a extends dsh.k {
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
                  double $$1 = awm.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  awt $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public ajc b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dsh.f {
      static final awg<dsh.z> e = awg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dsh.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dsh.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dsh.z::d)
                  )
                  .apply($$0, dsh.z::new)
         )
      );

      @Override
      public awg<? extends dsh.f> a() {
         return e;
      }

      public dsh.e a(final dsh.g $$0) {
         class a extends dsh.k {
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
