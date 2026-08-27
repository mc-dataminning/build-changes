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

public class dtd {
   public static final dtd.f a = a(0, false, ebx.b);
   public static final dtd.f b = a(0, true, ebx.b);
   public static final dtd.f c = a(0, true, 6, ebx.b);
   public static final dtd.f d = a(0, true, 30, ebx.b);
   public static final dtd.f e = a(0, false, ebx.a);
   public static final dtd.f f = a(0, true, ebx.a);

   public static dtd.f a(int $$0, boolean $$1, ebx $$2) {
      return new dtd.t($$0, $$1, 0, $$2);
   }

   public static dtd.f a(int $$0, boolean $$1, int $$2, ebx $$3) {
      return new dtd.t($$0, $$1, $$2, $$3);
   }

   public static dtd.f a(dtd.f $$0) {
      return new dtd.n($$0);
   }

   public static dtd.f a(dtg $$0, int $$1) {
      return new dtd.aa($$0, $$1, false);
   }

   public static dtd.f b(dtg $$0, int $$1) {
      return new dtd.aa($$0, $$1, true);
   }

   public static dtd.f a(int $$0, int $$1) {
      return new dtd.z($$0, $$1, false);
   }

   public static dtd.f b(int $$0, int $$1) {
      return new dtd.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dtd.f a(ajg<cxy>... $$0) {
      return a(List.of($$0));
   }

   private static dtd.c a(List<ajg<cxy>> $$0) {
      return new dtd.c($$0);
   }

   public static dtd.f a(ajg<ehq.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dtd.f a(ajg<ehq.a> $$0, double $$1, double $$2) {
      return new dtd.l($$0, $$1, $$2);
   }

   public static dtd.f a(String $$0, dtg $$1, dtg $$2) {
      return new dtd.y(new ajh($$0), $$1, $$2);
   }

   public static dtd.f a() {
      return dtd.s.a;
   }

   public static dtd.f b() {
      return dtd.h.a;
   }

   public static dtd.f c() {
      return dtd.a.a;
   }

   public static dtd.f d() {
      return dtd.v.a;
   }

   public static dtd.o a(dtd.f $$0, dtd.o $$1) {
      return new dtd.x($$0, $$1);
   }

   public static dtd.o a(dtd.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dtd.q(Arrays.asList($$0));
      }
   }

   public static dtd.o a(dmz $$0) {
      return new dtd.d($$0);
   }

   public static dtd.o e() {
      return dtd.b.a;
   }

   static <A> Codec<? extends A> a(iy<Codec<? extends A>> $$0, String $$1, awq<? extends A> $$2) {
      return iy.a($$0, $$1, $$2.a());
   }

   static enum a implements dtd.f {
      a;

      static final awq<dtd.a> c = awq.a(MapCodec.unit(a));

      @Override
      public awq<? extends dtd.f> a() {
         return c;
      }

      public dtd.e a(dtd.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dtg a, int c, boolean d) implements dtd.f {
      static final awq<dtd.aa> e = awq.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dtg.a.fieldOf("anchor").forGetter(dtd.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dtd.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dtd.aa::d)
                  )
                  .apply($$0, dtd.aa::new)
         )
      );

      @Override
      public awq<? extends dtd.f> a() {
         return e;
      }

      public dtd.e a(final dtd.g $$0) {
         class a extends dtd.k {
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

      public dtg b() {
         return this.a;
      }
   }

   static enum b implements dtd.o {
      a;

      static final awq<dtd.b> c = awq.a(MapCodec.unit(a));

      @Override
      public awq<? extends dtd.o> a() {
         return c;
      }

      public dtd.u a(dtd.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dtd.f {
      static final awq<dtd.c> a = awq.a(ajg.a(kj.au).listOf().fieldOf("biome_is").xmap(dtd::a, $$0 -> $$0.c));
      private final List<ajg<cxy>> c;
      final Predicate<ajg<cxy>> d;

      c(List<ajg<cxy>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public awq<? extends dtd.f> a() {
         return a;
      }

      public dtd.e a(final dtd.g $$0) {
         class a extends dtd.k {
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
            return $$0 instanceof dtd.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dmz a, dtd.r c) implements dtd.o {
      static final awq<dtd.d> d = awq.a(dmz.b.xmap(dtd.d::new, dtd.d::b).fieldOf("result_state"));

      d(dmz $$0) {
         this($$0, new dtd.r($$0));
      }

      @Override
      public awq<? extends dtd.o> a() {
         return d;
      }

      public dtd.u a(dtd.g $$0) {
         return this.c;
      }

      public dmz b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dtd.g, dtd.e> {
      Codec<dtd.f> b = ki.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dtd.f> a(iy<Codec<? extends dtd.f>> $$0) {
         dtd.a($$0, "biome", dtd.c.a);
         dtd.a($$0, "noise_threshold", dtd.l.e);
         dtd.a($$0, "vertical_gradient", dtd.y.e);
         dtd.a($$0, "y_above", dtd.aa.e);
         dtd.a($$0, "water", dtd.z.e);
         dtd.a($$0, "temperature", dtd.v.c);
         dtd.a($$0, "steep", dtd.s.c);
         dtd.a($$0, "not", dtd.n.c);
         dtd.a($$0, "hole", dtd.h.c);
         dtd.a($$0, "above_preliminary_surface", dtd.a.c);
         return dtd.a($$0, "stone_depth", dtd.t.f);
      }

      awq<? extends dtd.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dte e;
      final dtd.e f = new dtd.g.d(this);
      final dtd.e g = new dtd.g.c(this);
      final dtd.e h = new dtd.g.b(this);
      final dtd.e i = new dtd.g.a();
      final dta j;
      final dov k;
      private final dsq l;
      private final Function<ib, il<cxy>> m;
      final dtj n;
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
      Supplier<il<cxy>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dte $$0, dta $$1, dov $$2, dsq $$3, Function<ib, il<cxy>> $$4, iy<cxy> $$5, dtj $$6) {
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
            long $$2 = cwg.c($$0, $$1);
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

      final class a implements dtd.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dtd.j {
         b(dtd.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dtd.j {
         c(dtd.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dov $$4 = this.c.k;
            int $$5 = $$4.a(dsm.a.a, $$0, $$2);
            int $$6 = $$4.a(dsm.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dsm.a.a, $$7, $$1);
               int $$10 = $$4.a(dsm.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dtd.k {
         d(dtd.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dtd.f {
      a;

      static final awq<dtd.h> c = awq.a(MapCodec.unit(a));

      @Override
      public awq<? extends dtd.f> a() {
         return c;
      }

      public dtd.e a(dtd.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dtd.e {
      protected final dtd.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dtd.g $$0) {
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

   abstract static class j extends dtd.i {
      protected j(dtd.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dtd.i {
      protected k(dtd.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(ajg<ehq.a> a, double c, double d) implements dtd.f {
      static final awq<dtd.l> e = awq.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ajg.a(kj.aC).fieldOf("noise").forGetter(dtd.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dtd.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dtd.l::d)
                  )
                  .apply($$0, dtd.l::new)
         )
      );

      @Override
      public awq<? extends dtd.f> a() {
         return e;
      }

      public dtd.e a(final dtd.g $$0) {
         final ehq $$1 = $$0.j.a(this.a);

         class a extends dtd.j {
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

      public ajg<ehq.a> b() {
         return this.a;
      }
   }

   static record m(dtd.e a) implements dtd.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dtd.f a) implements dtd.f {
      static final awq<dtd.n> c = awq.a(dtd.f.b.xmap(dtd.n::new, dtd.n::b).fieldOf("invert"));

      @Override
      public awq<? extends dtd.f> a() {
         return c;
      }

      public dtd.e a(dtd.g $$0) {
         return new dtd.m(this.a.apply($$0));
      }

      public dtd.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dtd.g, dtd.u> {
      Codec<dtd.o> b = ki.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dtd.o> a(iy<Codec<? extends dtd.o>> $$0) {
         dtd.a($$0, "bandlands", dtd.b.c);
         dtd.a($$0, "block", dtd.d.d);
         dtd.a($$0, "sequence", dtd.q.c);
         return dtd.a($$0, "condition", dtd.x.d);
      }

      awq<? extends dtd.o> a();
   }

   static record p(List<dtd.u> a) implements dtd.u {
      @Nullable
      @Override
      public dmz tryApply(int $$0, int $$1, int $$2) {
         for (dtd.u $$3 : this.a) {
            dmz $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dtd.o> a) implements dtd.o {
      static final awq<dtd.q> c = awq.a(dtd.o.b.listOf().xmap(dtd.q::new, dtd.q::b).fieldOf("sequence"));

      @Override
      public awq<? extends dtd.o> a() {
         return c;
      }

      public dtd.u a(dtd.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dtd.u> $$1 = ImmutableList.builder();

            for (dtd.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dtd.p($$1.build());
         }
      }

      public List<dtd.o> b() {
         return this.a;
      }
   }

   static record r(dmz a) implements dtd.u {
      @Override
      public dmz tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dtd.f {
      a;

      static final awq<dtd.s> c = awq.a(MapCodec.unit(a));

      @Override
      public awq<? extends dtd.f> a() {
         return c;
      }

      public dtd.e a(dtd.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, ebx e) implements dtd.f {
      static final awq<dtd.t> f = awq.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dtd.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dtd.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dtd.t::d),
                     ebx.c.fieldOf("surface_type").forGetter(dtd.t::e)
                  )
                  .apply($$0, dtd.t::new)
         )
      );

      @Override
      public awq<? extends dtd.f> a() {
         return f;
      }

      public dtd.e a(final dtd.g $$0) {
         final boolean $$1 = this.e == ebx.a;

         class a extends dtd.k {
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
      dmz tryApply(int var1, int var2, int var3);
   }

   static enum v implements dtd.f {
      a;

      static final awq<dtd.v> c = awq.a(MapCodec.unit(a));

      @Override
      public awq<? extends dtd.f> a() {
         return c;
      }

      public dtd.e a(dtd.g $$0) {
         return $$0.f;
      }
   }

   static record w(dtd.e a, dtd.u b) implements dtd.u {
      @Nullable
      @Override
      public dmz tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dtd.f a, dtd.o c) implements dtd.o {
      static final awq<dtd.x> d = awq.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dtd.f.b.fieldOf("if_true").forGetter(dtd.x::b), dtd.o.b.fieldOf("then_run").forGetter(dtd.x::c)).apply($$0, dtd.x::new)
         )
      );

      @Override
      public awq<? extends dtd.o> a() {
         return d;
      }

      public dtd.u a(dtd.g $$0) {
         return new dtd.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dtd.f b() {
         return this.a;
      }
   }

   static record y(ajh a, dtg c, dtg d) implements dtd.f {
      static final awq<dtd.y> e = awq.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ajh.a.fieldOf("random_name").forGetter(dtd.y::b),
                     dtg.a.fieldOf("true_at_and_below").forGetter(dtd.y::c),
                     dtg.a.fieldOf("false_at_and_above").forGetter(dtd.y::d)
                  )
                  .apply($$0, dtd.y::new)
         )
      );

      @Override
      public awq<? extends dtd.f> a() {
         return e;
      }

      public dtd.e a(final dtd.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dsz $$3 = $$0.j.a(this.b());

         class a extends dtd.k {
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

   static record z(int a, int c, boolean d) implements dtd.f {
      static final awq<dtd.z> e = awq.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dtd.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dtd.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dtd.z::d)
                  )
                  .apply($$0, dtd.z::new)
         )
      );

      @Override
      public awq<? extends dtd.f> a() {
         return e;
      }

      public dtd.e a(final dtd.g $$0) {
         class a extends dtd.k {
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
