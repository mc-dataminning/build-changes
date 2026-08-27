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

public class dtf {
   public static final dtf.f a = a(0, false, ebz.b);
   public static final dtf.f b = a(0, true, ebz.b);
   public static final dtf.f c = a(0, true, 6, ebz.b);
   public static final dtf.f d = a(0, true, 30, ebz.b);
   public static final dtf.f e = a(0, false, ebz.a);
   public static final dtf.f f = a(0, true, ebz.a);

   public static dtf.f a(int $$0, boolean $$1, ebz $$2) {
      return new dtf.t($$0, $$1, 0, $$2);
   }

   public static dtf.f a(int $$0, boolean $$1, int $$2, ebz $$3) {
      return new dtf.t($$0, $$1, $$2, $$3);
   }

   public static dtf.f a(dtf.f $$0) {
      return new dtf.n($$0);
   }

   public static dtf.f a(dti $$0, int $$1) {
      return new dtf.aa($$0, $$1, false);
   }

   public static dtf.f b(dti $$0, int $$1) {
      return new dtf.aa($$0, $$1, true);
   }

   public static dtf.f a(int $$0, int $$1) {
      return new dtf.z($$0, $$1, false);
   }

   public static dtf.f b(int $$0, int $$1) {
      return new dtf.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dtf.f a(ajg<cya>... $$0) {
      return a(List.of($$0));
   }

   private static dtf.c a(List<ajg<cya>> $$0) {
      return new dtf.c($$0);
   }

   public static dtf.f a(ajg<ehs.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dtf.f a(ajg<ehs.a> $$0, double $$1, double $$2) {
      return new dtf.l($$0, $$1, $$2);
   }

   public static dtf.f a(String $$0, dti $$1, dti $$2) {
      return new dtf.y(new ajh($$0), $$1, $$2);
   }

   public static dtf.f a() {
      return dtf.s.a;
   }

   public static dtf.f b() {
      return dtf.h.a;
   }

   public static dtf.f c() {
      return dtf.a.a;
   }

   public static dtf.f d() {
      return dtf.v.a;
   }

   public static dtf.o a(dtf.f $$0, dtf.o $$1) {
      return new dtf.x($$0, $$1);
   }

   public static dtf.o a(dtf.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dtf.q(Arrays.asList($$0));
      }
   }

   public static dtf.o a(dnb $$0) {
      return new dtf.d($$0);
   }

   public static dtf.o e() {
      return dtf.b.a;
   }

   static <A> Codec<? extends A> a(iy<Codec<? extends A>> $$0, String $$1, awq<? extends A> $$2) {
      return iy.a($$0, $$1, $$2.a());
   }

   static enum a implements dtf.f {
      a;

      static final awq<dtf.a> c = awq.a(MapCodec.unit(a));

      @Override
      public awq<? extends dtf.f> a() {
         return c;
      }

      public dtf.e a(dtf.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dti a, int c, boolean d) implements dtf.f {
      static final awq<dtf.aa> e = awq.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dti.a.fieldOf("anchor").forGetter(dtf.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dtf.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dtf.aa::d)
                  )
                  .apply($$0, dtf.aa::new)
         )
      );

      @Override
      public awq<? extends dtf.f> a() {
         return e;
      }

      public dtf.e a(final dtf.g $$0) {
         class a extends dtf.k {
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

      public dti b() {
         return this.a;
      }
   }

   static enum b implements dtf.o {
      a;

      static final awq<dtf.b> c = awq.a(MapCodec.unit(a));

      @Override
      public awq<? extends dtf.o> a() {
         return c;
      }

      public dtf.u a(dtf.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dtf.f {
      static final awq<dtf.c> a = awq.a(ajg.a(kj.au).listOf().fieldOf("biome_is").xmap(dtf::a, $$0 -> $$0.c));
      private final List<ajg<cya>> c;
      final Predicate<ajg<cya>> d;

      c(List<ajg<cya>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public awq<? extends dtf.f> a() {
         return a;
      }

      public dtf.e a(final dtf.g $$0) {
         class a extends dtf.k {
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
            return $$0 instanceof dtf.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dnb a, dtf.r c) implements dtf.o {
      static final awq<dtf.d> d = awq.a(dnb.b.xmap(dtf.d::new, dtf.d::b).fieldOf("result_state"));

      d(dnb $$0) {
         this($$0, new dtf.r($$0));
      }

      @Override
      public awq<? extends dtf.o> a() {
         return d;
      }

      public dtf.u a(dtf.g $$0) {
         return this.c;
      }

      public dnb b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dtf.g, dtf.e> {
      Codec<dtf.f> b = ki.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dtf.f> a(iy<Codec<? extends dtf.f>> $$0) {
         dtf.a($$0, "biome", dtf.c.a);
         dtf.a($$0, "noise_threshold", dtf.l.e);
         dtf.a($$0, "vertical_gradient", dtf.y.e);
         dtf.a($$0, "y_above", dtf.aa.e);
         dtf.a($$0, "water", dtf.z.e);
         dtf.a($$0, "temperature", dtf.v.c);
         dtf.a($$0, "steep", dtf.s.c);
         dtf.a($$0, "not", dtf.n.c);
         dtf.a($$0, "hole", dtf.h.c);
         dtf.a($$0, "above_preliminary_surface", dtf.a.c);
         return dtf.a($$0, "stone_depth", dtf.t.f);
      }

      awq<? extends dtf.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dtg e;
      final dtf.e f = new dtf.g.d(this);
      final dtf.e g = new dtf.g.c(this);
      final dtf.e h = new dtf.g.b(this);
      final dtf.e i = new dtf.g.a();
      final dtc j;
      final dox k;
      private final dss l;
      private final Function<ib, il<cya>> m;
      final dtl n;
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
      Supplier<il<cya>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dtg $$0, dtc $$1, dox $$2, dss $$3, Function<ib, il<cya>> $$4, iy<cya> $$5, dtl $$6) {
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
            long $$2 = cwi.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = aww.a(
               aww.a(
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

      final class a implements dtf.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dtf.j {
         b(dtf.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dtf.j {
         c(dtf.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dox $$4 = this.c.k;
            int $$5 = $$4.a(dso.a.a, $$0, $$2);
            int $$6 = $$4.a(dso.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dso.a.a, $$7, $$1);
               int $$10 = $$4.a(dso.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dtf.k {
         d(dtf.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dtf.f {
      a;

      static final awq<dtf.h> c = awq.a(MapCodec.unit(a));

      @Override
      public awq<? extends dtf.f> a() {
         return c;
      }

      public dtf.e a(dtf.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dtf.e {
      protected final dtf.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dtf.g $$0) {
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

   abstract static class j extends dtf.i {
      protected j(dtf.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dtf.i {
      protected k(dtf.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(ajg<ehs.a> a, double c, double d) implements dtf.f {
      static final awq<dtf.l> e = awq.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ajg.a(kj.aC).fieldOf("noise").forGetter(dtf.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dtf.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dtf.l::d)
                  )
                  .apply($$0, dtf.l::new)
         )
      );

      @Override
      public awq<? extends dtf.f> a() {
         return e;
      }

      public dtf.e a(final dtf.g $$0) {
         final ehs $$1 = $$0.j.a(this.a);

         class a extends dtf.j {
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

      public ajg<ehs.a> b() {
         return this.a;
      }
   }

   static record m(dtf.e a) implements dtf.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dtf.f a) implements dtf.f {
      static final awq<dtf.n> c = awq.a(dtf.f.b.xmap(dtf.n::new, dtf.n::b).fieldOf("invert"));

      @Override
      public awq<? extends dtf.f> a() {
         return c;
      }

      public dtf.e a(dtf.g $$0) {
         return new dtf.m(this.a.apply($$0));
      }

      public dtf.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dtf.g, dtf.u> {
      Codec<dtf.o> b = ki.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dtf.o> a(iy<Codec<? extends dtf.o>> $$0) {
         dtf.a($$0, "bandlands", dtf.b.c);
         dtf.a($$0, "block", dtf.d.d);
         dtf.a($$0, "sequence", dtf.q.c);
         return dtf.a($$0, "condition", dtf.x.d);
      }

      awq<? extends dtf.o> a();
   }

   static record p(List<dtf.u> a) implements dtf.u {
      @Nullable
      @Override
      public dnb tryApply(int $$0, int $$1, int $$2) {
         for (dtf.u $$3 : this.a) {
            dnb $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dtf.o> a) implements dtf.o {
      static final awq<dtf.q> c = awq.a(dtf.o.b.listOf().xmap(dtf.q::new, dtf.q::b).fieldOf("sequence"));

      @Override
      public awq<? extends dtf.o> a() {
         return c;
      }

      public dtf.u a(dtf.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dtf.u> $$1 = ImmutableList.builder();

            for (dtf.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dtf.p($$1.build());
         }
      }

      public List<dtf.o> b() {
         return this.a;
      }
   }

   static record r(dnb a) implements dtf.u {
      @Override
      public dnb tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dtf.f {
      a;

      static final awq<dtf.s> c = awq.a(MapCodec.unit(a));

      @Override
      public awq<? extends dtf.f> a() {
         return c;
      }

      public dtf.e a(dtf.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, ebz e) implements dtf.f {
      static final awq<dtf.t> f = awq.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dtf.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dtf.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dtf.t::d),
                     ebz.c.fieldOf("surface_type").forGetter(dtf.t::e)
                  )
                  .apply($$0, dtf.t::new)
         )
      );

      @Override
      public awq<? extends dtf.f> a() {
         return f;
      }

      public dtf.e a(final dtf.g $$0) {
         final boolean $$1 = this.e == ebz.a;

         class a extends dtf.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)aww.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dnb tryApply(int var1, int var2, int var3);
   }

   static enum v implements dtf.f {
      a;

      static final awq<dtf.v> c = awq.a(MapCodec.unit(a));

      @Override
      public awq<? extends dtf.f> a() {
         return c;
      }

      public dtf.e a(dtf.g $$0) {
         return $$0.f;
      }
   }

   static record w(dtf.e a, dtf.u b) implements dtf.u {
      @Nullable
      @Override
      public dnb tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dtf.f a, dtf.o c) implements dtf.o {
      static final awq<dtf.x> d = awq.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dtf.f.b.fieldOf("if_true").forGetter(dtf.x::b), dtf.o.b.fieldOf("then_run").forGetter(dtf.x::c)).apply($$0, dtf.x::new)
         )
      );

      @Override
      public awq<? extends dtf.o> a() {
         return d;
      }

      public dtf.u a(dtf.g $$0) {
         return new dtf.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dtf.f b() {
         return this.a;
      }
   }

   static record y(ajh a, dti c, dti d) implements dtf.f {
      static final awq<dtf.y> e = awq.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ajh.a.fieldOf("random_name").forGetter(dtf.y::b),
                     dti.a.fieldOf("true_at_and_below").forGetter(dtf.y::c),
                     dti.a.fieldOf("false_at_and_above").forGetter(dtf.y::d)
                  )
                  .apply($$0, dtf.y::new)
         )
      );

      @Override
      public awq<? extends dtf.f> a() {
         return e;
      }

      public dtf.e a(final dtf.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dtb $$3 = $$0.j.a(this.b());

         class a extends dtf.k {
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
                  double $$1 = aww.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  axd $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public ajh b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dtf.f {
      static final awq<dtf.z> e = awq.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dtf.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dtf.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dtf.z::d)
                  )
                  .apply($$0, dtf.z::new)
         )
      );

      @Override
      public awq<? extends dtf.f> a() {
         return e;
      }

      public dtf.e a(final dtf.g $$0) {
         class a extends dtf.k {
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
