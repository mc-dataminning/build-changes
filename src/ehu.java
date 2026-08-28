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

public class ehu {
   public static final ehu.f a = a(0, false, eqv.b);
   public static final ehu.f b = a(0, true, eqv.b);
   public static final ehu.f c = a(0, true, 6, eqv.b);
   public static final ehu.f d = a(0, true, 30, eqv.b);
   public static final ehu.f e = a(0, false, eqv.a);
   public static final ehu.f f = a(0, true, eqv.a);

   public static ehu.f a(int $$0, boolean $$1, eqv $$2) {
      return new ehu.t($$0, $$1, 0, $$2);
   }

   public static ehu.f a(int $$0, boolean $$1, int $$2, eqv $$3) {
      return new ehu.t($$0, $$1, $$2, $$3);
   }

   public static ehu.f a(ehu.f $$0) {
      return new ehu.n($$0);
   }

   public static ehu.f a(ehx $$0, int $$1) {
      return new ehu.aa($$0, $$1, false);
   }

   public static ehu.f b(ehx $$0, int $$1) {
      return new ehu.aa($$0, $$1, true);
   }

   public static ehu.f a(int $$0, int $$1) {
      return new ehu.z($$0, $$1, false);
   }

   public static ehu.f b(int $$0, int $$1) {
      return new ehu.z($$0, $$1, true);
   }

   @SafeVarargs
   public static ehu.f a(alh<dla>... $$0) {
      return a(List.of($$0));
   }

   private static ehu.c a(List<alh<dla>> $$0) {
      return new ehu.c($$0);
   }

   public static ehu.f a(alh<ewr.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static ehu.f a(alh<ewr.a> $$0, double $$1, double $$2) {
      return new ehu.l($$0, $$1, $$2);
   }

   public static ehu.f a(String $$0, ehx $$1, ehx $$2) {
      return new ehu.y(ali.a($$0), $$1, $$2);
   }

   public static ehu.f a() {
      return ehu.s.a;
   }

   public static ehu.f b() {
      return ehu.h.a;
   }

   public static ehu.f c() {
      return ehu.a.a;
   }

   public static ehu.f d() {
      return ehu.v.a;
   }

   public static ehu.o a(ehu.f $$0, ehu.o $$1) {
      return new ehu.x($$0, $$1);
   }

   public static ehu.o a(ehu.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new ehu.q(Arrays.asList($$0));
      }
   }

   public static ehu.o a(ebe $$0) {
      return new ehu.d($$0);
   }

   public static ehu.o e() {
      return ehu.b.a;
   }

   static <A> MapCodec<? extends A> a(js<MapCodec<? extends A>> $$0, String $$1, azh<? extends A> $$2) {
      return js.a($$0, $$1, $$2.a());
   }

   static enum a implements ehu.f {
      a;

      static final azh<ehu.a> c = azh.a(MapCodec.unit(a));

      @Override
      public azh<? extends ehu.f> a() {
         return c;
      }

      public ehu.e a(ehu.g $$0) {
         return $$0.i;
      }
   }

   static record aa(ehx a, int c, boolean d) implements ehu.f {
      static final azh<ehu.aa> e = azh.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ehx.a.fieldOf("anchor").forGetter(ehu.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ehu.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(ehu.aa::d)
                  )
                  .apply($$0, ehu.aa::new)
         )
      );

      @Override
      public azh<? extends ehu.f> a() {
         return e;
      }

      public ehu.e a(final ehu.g $$0) {
         class a extends ehu.k {
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

      public ehx b() {
         return this.a;
      }
   }

   static enum b implements ehu.o {
      a;

      static final azh<ehu.b> c = azh.a(MapCodec.unit(a));

      @Override
      public azh<? extends ehu.o> a() {
         return c;
      }

      public ehu.u a(ehu.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements ehu.f {
      static final azh<ehu.c> a = azh.a(alh.a(mh.aG).listOf().fieldOf("biome_is").xmap(ehu::a, $$0 -> $$0.c));
      private final List<alh<dla>> c;
      final Predicate<alh<dla>> d;

      c(List<alh<dla>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public azh<? extends ehu.f> a() {
         return a;
      }

      public ehu.e a(final ehu.g $$0) {
         class a extends ehu.k {
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
            return $$0 instanceof ehu.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(ebe a, ehu.r c) implements ehu.o {
      static final azh<ehu.d> d = azh.a(ebe.a.xmap(ehu.d::new, ehu.d::b).fieldOf("result_state"));

      d(ebe $$0) {
         this($$0, new ehu.r($$0));
      }

      @Override
      public azh<? extends ehu.o> a() {
         return d;
      }

      public ehu.u a(ehu.g $$0) {
         return this.c;
      }

      public ebe b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<ehu.g, ehu.e> {
      Codec<ehu.f> b = mg.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ehu.f> a(js<MapCodec<? extends ehu.f>> $$0) {
         ehu.a($$0, "biome", ehu.c.a);
         ehu.a($$0, "noise_threshold", ehu.l.e);
         ehu.a($$0, "vertical_gradient", ehu.y.e);
         ehu.a($$0, "y_above", ehu.aa.e);
         ehu.a($$0, "water", ehu.z.e);
         ehu.a($$0, "temperature", ehu.v.c);
         ehu.a($$0, "steep", ehu.s.c);
         ehu.a($$0, "not", ehu.n.c);
         ehu.a($$0, "hole", ehu.h.c);
         ehu.a($$0, "above_preliminary_surface", ehu.a.c);
         return ehu.a($$0, "stone_depth", ehu.t.f);
      }

      azh<? extends ehu.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final ehv e;
      final ehu.e f = new ehu.g.d(this);
      final ehu.e g = new ehu.g.c(this);
      final ehu.e h = new ehu.g.b(this);
      final ehu.e i = new ehu.g.a();
      final ehr j;
      final edb k;
      private final ehh l;
      private final Function<iv, jf<dla>> m;
      final eia n;
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
      final iv.a z = new iv.a();
      Supplier<jf<dla>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(ehv $$0, ehr $$1, edb $$2, ehh $$3, Function<iv, jf<dla>> $$4, js<dla> $$5, eia $$6) {
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

      public int b() {
         return this.e.a();
      }

      private static int a(int $$0) {
         return $$0 >> 4;
      }

      private static int b(int $$0) {
         return $$0 << 4;
      }

      protected int c() {
         if (this.w != this.q) {
            this.w = this.q;
            int $$0 = a(this.r);
            int $$1 = a(this.s);
            long $$2 = djc.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = azo.a(
               azo.a(
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

      final class a implements ehu.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends ehu.j {
         b(ehu.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends ehu.j {
         c(ehu.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            edb $$4 = this.c.k;
            int $$5 = $$4.a(ehd.a.a, $$0, $$2);
            int $$6 = $$4.a(ehd.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(ehd.a.a, $$7, $$1);
               int $$10 = $$4.a(ehd.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends ehu.k {
         d(ehu.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements ehu.f {
      a;

      static final azh<ehu.h> c = azh.a(MapCodec.unit(a));

      @Override
      public azh<? extends ehu.f> a() {
         return c;
      }

      public ehu.e a(ehu.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements ehu.e {
      protected final ehu.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(ehu.g $$0) {
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

   abstract static class j extends ehu.i {
      protected j(ehu.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends ehu.i {
      protected k(ehu.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(alh<ewr.a> a, double c, double d) implements ehu.f {
      static final azh<ehu.l> e = azh.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alh.a(mh.aY).fieldOf("noise").forGetter(ehu.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(ehu.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(ehu.l::d)
                  )
                  .apply($$0, ehu.l::new)
         )
      );

      @Override
      public azh<? extends ehu.f> a() {
         return e;
      }

      public ehu.e a(final ehu.g $$0) {
         final ewr $$1 = $$0.j.a(this.a);

         class a extends ehu.j {
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

      public alh<ewr.a> b() {
         return this.a;
      }
   }

   static record m(ehu.e a) implements ehu.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(ehu.f a) implements ehu.f {
      static final azh<ehu.n> c = azh.a(ehu.f.b.xmap(ehu.n::new, ehu.n::b).fieldOf("invert"));

      @Override
      public azh<? extends ehu.f> a() {
         return c;
      }

      public ehu.e a(ehu.g $$0) {
         return new ehu.m(this.a.apply($$0));
      }

      public ehu.f b() {
         return this.a;
      }
   }

   public interface o extends Function<ehu.g, ehu.u> {
      Codec<ehu.o> b = mg.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ehu.o> a(js<MapCodec<? extends ehu.o>> $$0) {
         ehu.a($$0, "bandlands", ehu.b.c);
         ehu.a($$0, "block", ehu.d.d);
         ehu.a($$0, "sequence", ehu.q.c);
         return ehu.a($$0, "condition", ehu.x.d);
      }

      azh<? extends ehu.o> a();
   }

   static record p(List<ehu.u> a) implements ehu.u {
      @Nullable
      @Override
      public ebe tryApply(int $$0, int $$1, int $$2) {
         for (ehu.u $$3 : this.a) {
            ebe $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<ehu.o> a) implements ehu.o {
      static final azh<ehu.q> c = azh.a(ehu.o.b.listOf().xmap(ehu.q::new, ehu.q::b).fieldOf("sequence"));

      @Override
      public azh<? extends ehu.o> a() {
         return c;
      }

      public ehu.u a(ehu.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<ehu.u> $$1 = ImmutableList.builder();

            for (ehu.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new ehu.p($$1.build());
         }
      }

      public List<ehu.o> b() {
         return this.a;
      }
   }

   static record r(ebe a) implements ehu.u {
      @Override
      public ebe tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements ehu.f {
      a;

      static final azh<ehu.s> c = azh.a(MapCodec.unit(a));

      @Override
      public azh<? extends ehu.f> a() {
         return c;
      }

      public ehu.e a(ehu.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, eqv e) implements ehu.f {
      static final azh<ehu.t> f = azh.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(ehu.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(ehu.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(ehu.t::d),
                     eqv.c.fieldOf("surface_type").forGetter(ehu.t::e)
                  )
                  .apply($$0, ehu.t::new)
         )
      );

      @Override
      public azh<? extends ehu.f> a() {
         return f;
      }

      public ehu.e a(final ehu.g $$0) {
         final boolean $$1 = this.e == eqv.a;

         class a extends ehu.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)azo.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      ebe tryApply(int var1, int var2, int var3);
   }

   static enum v implements ehu.f {
      a;

      static final azh<ehu.v> c = azh.a(MapCodec.unit(a));

      @Override
      public azh<? extends ehu.f> a() {
         return c;
      }

      public ehu.e a(ehu.g $$0) {
         return $$0.f;
      }
   }

   static record w(ehu.e a, ehu.u b) implements ehu.u {
      @Nullable
      @Override
      public ebe tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(ehu.f a, ehu.o c) implements ehu.o {
      static final azh<ehu.x> d = azh.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(ehu.f.b.fieldOf("if_true").forGetter(ehu.x::b), ehu.o.b.fieldOf("then_run").forGetter(ehu.x::c)).apply($$0, ehu.x::new)
         )
      );

      @Override
      public azh<? extends ehu.o> a() {
         return d;
      }

      public ehu.u a(ehu.g $$0) {
         return new ehu.w(this.a.apply($$0), this.c.apply($$0));
      }

      public ehu.f b() {
         return this.a;
      }
   }

   static record y(ali a, ehx c, ehx d) implements ehu.f {
      static final azh<ehu.y> e = azh.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ali.a.fieldOf("random_name").forGetter(ehu.y::b),
                     ehx.a.fieldOf("true_at_and_below").forGetter(ehu.y::c),
                     ehx.a.fieldOf("false_at_and_above").forGetter(ehu.y::d)
                  )
                  .apply($$0, ehu.y::new)
         )
      );

      @Override
      public azh<? extends ehu.f> a() {
         return e;
      }

      public ehu.e a(final ehu.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final ehq $$3 = $$0.j.a(this.b());

         class a extends ehu.k {
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
                  double $$1 = azo.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  azx $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public ali b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements ehu.f {
      static final azh<ehu.z> e = azh.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(ehu.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ehu.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(ehu.z::d)
                  )
                  .apply($$0, ehu.z::new)
         )
      );

      @Override
      public azh<? extends ehu.f> a() {
         return e;
      }

      public ehu.e a(final ehu.g $$0) {
         class a extends ehu.k {
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
