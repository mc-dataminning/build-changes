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

public class dvr {
   public static final dvr.f a = a(0, false, eel.b);
   public static final dvr.f b = a(0, true, eel.b);
   public static final dvr.f c = a(0, true, 6, eel.b);
   public static final dvr.f d = a(0, true, 30, eel.b);
   public static final dvr.f e = a(0, false, eel.a);
   public static final dvr.f f = a(0, true, eel.a);

   public static dvr.f a(int $$0, boolean $$1, eel $$2) {
      return new dvr.t($$0, $$1, 0, $$2);
   }

   public static dvr.f a(int $$0, boolean $$1, int $$2, eel $$3) {
      return new dvr.t($$0, $$1, $$2, $$3);
   }

   public static dvr.f a(dvr.f $$0) {
      return new dvr.n($$0);
   }

   public static dvr.f a(dvu $$0, int $$1) {
      return new dvr.aa($$0, $$1, false);
   }

   public static dvr.f b(dvu $$0, int $$1) {
      return new dvr.aa($$0, $$1, true);
   }

   public static dvr.f a(int $$0, int $$1) {
      return new dvr.z($$0, $$1, false);
   }

   public static dvr.f b(int $$0, int $$1) {
      return new dvr.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dvr.f a(aju<daf>... $$0) {
      return a(List.of($$0));
   }

   private static dvr.c a(List<aju<daf>> $$0) {
      return new dvr.c($$0);
   }

   public static dvr.f a(aju<eke.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dvr.f a(aju<eke.a> $$0, double $$1, double $$2) {
      return new dvr.l($$0, $$1, $$2);
   }

   public static dvr.f a(String $$0, dvu $$1, dvu $$2) {
      return new dvr.y(new ajv($$0), $$1, $$2);
   }

   public static dvr.f a() {
      return dvr.s.a;
   }

   public static dvr.f b() {
      return dvr.h.a;
   }

   public static dvr.f c() {
      return dvr.a.a;
   }

   public static dvr.f d() {
      return dvr.v.a;
   }

   public static dvr.o a(dvr.f $$0, dvr.o $$1) {
      return new dvr.x($$0, $$1);
   }

   public static dvr.o a(dvr.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dvr.q(Arrays.asList($$0));
      }
   }

   public static dvr.o a(dpi $$0) {
      return new dvr.d($$0);
   }

   public static dvr.o e() {
      return dvr.b.a;
   }

   static <A> Codec<? extends A> a(ja<Codec<? extends A>> $$0, String $$1, axg<? extends A> $$2) {
      return ja.a($$0, $$1, $$2.a());
   }

   static enum a implements dvr.f {
      a;

      static final axg<dvr.a> c = axg.a(MapCodec.unit(a));

      @Override
      public axg<? extends dvr.f> a() {
         return c;
      }

      public dvr.e a(dvr.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dvu a, int c, boolean d) implements dvr.f {
      static final axg<dvr.aa> e = axg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dvu.a.fieldOf("anchor").forGetter(dvr.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dvr.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dvr.aa::d)
                  )
                  .apply($$0, dvr.aa::new)
         )
      );

      @Override
      public axg<? extends dvr.f> a() {
         return e;
      }

      public dvr.e a(final dvr.g $$0) {
         class a extends dvr.k {
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

      public dvu b() {
         return this.a;
      }
   }

   static enum b implements dvr.o {
      a;

      static final axg<dvr.b> c = axg.a(MapCodec.unit(a));

      @Override
      public axg<? extends dvr.o> a() {
         return c;
      }

      public dvr.u a(dvr.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dvr.f {
      static final axg<dvr.c> a = axg.a(aju.a(ku.aw).listOf().fieldOf("biome_is").xmap(dvr::a, $$0 -> $$0.c));
      private final List<aju<daf>> c;
      final Predicate<aju<daf>> d;

      c(List<aju<daf>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public axg<? extends dvr.f> a() {
         return a;
      }

      public dvr.e a(final dvr.g $$0) {
         class a extends dvr.k {
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
            return $$0 instanceof dvr.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dpi a, dvr.r c) implements dvr.o {
      static final axg<dvr.d> d = axg.a(dpi.b.xmap(dvr.d::new, dvr.d::b).fieldOf("result_state"));

      d(dpi $$0) {
         this($$0, new dvr.r($$0));
      }

      @Override
      public axg<? extends dvr.o> a() {
         return d;
      }

      public dvr.u a(dvr.g $$0) {
         return this.c;
      }

      public dpi b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dvr.g, dvr.e> {
      Codec<dvr.f> b = kt.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dvr.f> a(ja<Codec<? extends dvr.f>> $$0) {
         dvr.a($$0, "biome", dvr.c.a);
         dvr.a($$0, "noise_threshold", dvr.l.e);
         dvr.a($$0, "vertical_gradient", dvr.y.e);
         dvr.a($$0, "y_above", dvr.aa.e);
         dvr.a($$0, "water", dvr.z.e);
         dvr.a($$0, "temperature", dvr.v.c);
         dvr.a($$0, "steep", dvr.s.c);
         dvr.a($$0, "not", dvr.n.c);
         dvr.a($$0, "hole", dvr.h.c);
         dvr.a($$0, "above_preliminary_surface", dvr.a.c);
         return dvr.a($$0, "stone_depth", dvr.t.f);
      }

      axg<? extends dvr.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dvs e;
      final dvr.e f = new dvr.g.d(this);
      final dvr.e g = new dvr.g.c(this);
      final dvr.e h = new dvr.g.b(this);
      final dvr.e i = new dvr.g.a();
      final dvo j;
      final dre k;
      private final dve l;
      private final Function<id, in<daf>> m;
      final dvx n;
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
      final id.a z = new id.a();
      Supplier<in<daf>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dvs $$0, dvo $$1, dre $$2, dve $$3, Function<id, in<daf>> $$4, ja<daf> $$5, dvx $$6) {
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
            long $$2 = cyn.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = axm.a(
               axm.a(
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

      final class a implements dvr.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dvr.j {
         b(dvr.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dvr.j {
         c(dvr.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dre $$4 = this.c.k;
            int $$5 = $$4.a(dva.a.a, $$0, $$2);
            int $$6 = $$4.a(dva.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dva.a.a, $$7, $$1);
               int $$10 = $$4.a(dva.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dvr.k {
         d(dvr.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dvr.f {
      a;

      static final axg<dvr.h> c = axg.a(MapCodec.unit(a));

      @Override
      public axg<? extends dvr.f> a() {
         return c;
      }

      public dvr.e a(dvr.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dvr.e {
      protected final dvr.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dvr.g $$0) {
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

   abstract static class j extends dvr.i {
      protected j(dvr.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dvr.i {
      protected k(dvr.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(aju<eke.a> a, double c, double d) implements dvr.f {
      static final axg<dvr.l> e = axg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aju.a(ku.aE).fieldOf("noise").forGetter(dvr.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dvr.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dvr.l::d)
                  )
                  .apply($$0, dvr.l::new)
         )
      );

      @Override
      public axg<? extends dvr.f> a() {
         return e;
      }

      public dvr.e a(final dvr.g $$0) {
         final eke $$1 = $$0.j.a(this.a);

         class a extends dvr.j {
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

      public aju<eke.a> b() {
         return this.a;
      }
   }

   static record m(dvr.e a) implements dvr.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dvr.f a) implements dvr.f {
      static final axg<dvr.n> c = axg.a(dvr.f.b.xmap(dvr.n::new, dvr.n::b).fieldOf("invert"));

      @Override
      public axg<? extends dvr.f> a() {
         return c;
      }

      public dvr.e a(dvr.g $$0) {
         return new dvr.m(this.a.apply($$0));
      }

      public dvr.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dvr.g, dvr.u> {
      Codec<dvr.o> b = kt.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dvr.o> a(ja<Codec<? extends dvr.o>> $$0) {
         dvr.a($$0, "bandlands", dvr.b.c);
         dvr.a($$0, "block", dvr.d.d);
         dvr.a($$0, "sequence", dvr.q.c);
         return dvr.a($$0, "condition", dvr.x.d);
      }

      axg<? extends dvr.o> a();
   }

   static record p(List<dvr.u> a) implements dvr.u {
      @Nullable
      @Override
      public dpi tryApply(int $$0, int $$1, int $$2) {
         for (dvr.u $$3 : this.a) {
            dpi $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dvr.o> a) implements dvr.o {
      static final axg<dvr.q> c = axg.a(dvr.o.b.listOf().xmap(dvr.q::new, dvr.q::b).fieldOf("sequence"));

      @Override
      public axg<? extends dvr.o> a() {
         return c;
      }

      public dvr.u a(dvr.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dvr.u> $$1 = ImmutableList.builder();

            for (dvr.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dvr.p($$1.build());
         }
      }

      public List<dvr.o> b() {
         return this.a;
      }
   }

   static record r(dpi a) implements dvr.u {
      @Override
      public dpi tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dvr.f {
      a;

      static final axg<dvr.s> c = axg.a(MapCodec.unit(a));

      @Override
      public axg<? extends dvr.f> a() {
         return c;
      }

      public dvr.e a(dvr.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, eel e) implements dvr.f {
      static final axg<dvr.t> f = axg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dvr.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dvr.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dvr.t::d),
                     eel.c.fieldOf("surface_type").forGetter(dvr.t::e)
                  )
                  .apply($$0, dvr.t::new)
         )
      );

      @Override
      public axg<? extends dvr.f> a() {
         return f;
      }

      public dvr.e a(final dvr.g $$0) {
         final boolean $$1 = this.e == eel.a;

         class a extends dvr.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)axm.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dpi tryApply(int var1, int var2, int var3);
   }

   static enum v implements dvr.f {
      a;

      static final axg<dvr.v> c = axg.a(MapCodec.unit(a));

      @Override
      public axg<? extends dvr.f> a() {
         return c;
      }

      public dvr.e a(dvr.g $$0) {
         return $$0.f;
      }
   }

   static record w(dvr.e a, dvr.u b) implements dvr.u {
      @Nullable
      @Override
      public dpi tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dvr.f a, dvr.o c) implements dvr.o {
      static final axg<dvr.x> d = axg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dvr.f.b.fieldOf("if_true").forGetter(dvr.x::b), dvr.o.b.fieldOf("then_run").forGetter(dvr.x::c)).apply($$0, dvr.x::new)
         )
      );

      @Override
      public axg<? extends dvr.o> a() {
         return d;
      }

      public dvr.u a(dvr.g $$0) {
         return new dvr.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dvr.f b() {
         return this.a;
      }
   }

   static record y(ajv a, dvu c, dvu d) implements dvr.f {
      static final axg<dvr.y> e = axg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ajv.a.fieldOf("random_name").forGetter(dvr.y::b),
                     dvu.a.fieldOf("true_at_and_below").forGetter(dvr.y::c),
                     dvu.a.fieldOf("false_at_and_above").forGetter(dvr.y::d)
                  )
                  .apply($$0, dvr.y::new)
         )
      );

      @Override
      public axg<? extends dvr.f> a() {
         return e;
      }

      public dvr.e a(final dvr.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dvn $$3 = $$0.j.a(this.b());

         class a extends dvr.k {
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
                  double $$1 = axm.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  axt $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public ajv b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dvr.f {
      static final axg<dvr.z> e = axg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dvr.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dvr.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dvr.z::d)
                  )
                  .apply($$0, dvr.z::new)
         )
      );

      @Override
      public axg<? extends dvr.f> a() {
         return e;
      }

      public dvr.e a(final dvr.g $$0) {
         class a extends dvr.k {
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
