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

public class eeh {
   public static final eeh.f a = a(0, false, ene.b);
   public static final eeh.f b = a(0, true, ene.b);
   public static final eeh.f c = a(0, true, 6, ene.b);
   public static final eeh.f d = a(0, true, 30, ene.b);
   public static final eeh.f e = a(0, false, ene.a);
   public static final eeh.f f = a(0, true, ene.a);

   public static eeh.f a(int $$0, boolean $$1, ene $$2) {
      return new eeh.t($$0, $$1, 0, $$2);
   }

   public static eeh.f a(int $$0, boolean $$1, int $$2, ene $$3) {
      return new eeh.t($$0, $$1, $$2, $$3);
   }

   public static eeh.f a(eeh.f $$0) {
      return new eeh.n($$0);
   }

   public static eeh.f a(eek $$0, int $$1) {
      return new eeh.aa($$0, $$1, false);
   }

   public static eeh.f b(eek $$0, int $$1) {
      return new eeh.aa($$0, $$1, true);
   }

   public static eeh.f a(int $$0, int $$1) {
      return new eeh.z($$0, $$1, false);
   }

   public static eeh.f b(int $$0, int $$1) {
      return new eeh.z($$0, $$1, true);
   }

   @SafeVarargs
   public static eeh.f a(aly<dik>... $$0) {
      return a(List.of($$0));
   }

   private static eeh.c a(List<aly<dik>> $$0) {
      return new eeh.c($$0);
   }

   public static eeh.f a(aly<eta.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static eeh.f a(aly<eta.a> $$0, double $$1, double $$2) {
      return new eeh.l($$0, $$1, $$2);
   }

   public static eeh.f a(String $$0, eek $$1, eek $$2) {
      return new eeh.y(alz.a($$0), $$1, $$2);
   }

   public static eeh.f a() {
      return eeh.s.a;
   }

   public static eeh.f b() {
      return eeh.h.a;
   }

   public static eeh.f c() {
      return eeh.a.a;
   }

   public static eeh.f d() {
      return eeh.v.a;
   }

   public static eeh.o a(eeh.f $$0, eeh.o $$1) {
      return new eeh.x($$0, $$1);
   }

   public static eeh.o a(eeh.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new eeh.q(Arrays.asList($$0));
      }
   }

   public static eeh.o a(dxv $$0) {
      return new eeh.d($$0);
   }

   public static eeh.o e() {
      return eeh.b.a;
   }

   static <A> MapCodec<? extends A> a(kd<MapCodec<? extends A>> $$0, String $$1, azx<? extends A> $$2) {
      return kd.a($$0, $$1, $$2.a());
   }

   static enum a implements eeh.f {
      a;

      static final azx<eeh.a> c = azx.a(MapCodec.unit(a));

      @Override
      public azx<? extends eeh.f> a() {
         return c;
      }

      public eeh.e a(eeh.g $$0) {
         return $$0.i;
      }
   }

   static record aa(eek a, int c, boolean d) implements eeh.f {
      static final azx<eeh.aa> e = azx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     eek.a.fieldOf("anchor").forGetter(eeh.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(eeh.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(eeh.aa::d)
                  )
                  .apply($$0, eeh.aa::new)
         )
      );

      @Override
      public azx<? extends eeh.f> a() {
         return e;
      }

      public eeh.e a(final eeh.g $$0) {
         class a extends eeh.k {
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

      public eek b() {
         return this.a;
      }
   }

   static enum b implements eeh.o {
      a;

      static final azx<eeh.b> c = azx.a(MapCodec.unit(a));

      @Override
      public azx<? extends eeh.o> a() {
         return c;
      }

      public eeh.u a(eeh.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements eeh.f {
      static final azx<eeh.c> a = azx.a(aly.a(mb.aI).listOf().fieldOf("biome_is").xmap(eeh::a, $$0 -> $$0.c));
      private final List<aly<dik>> c;
      final Predicate<aly<dik>> d;

      c(List<aly<dik>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public azx<? extends eeh.f> a() {
         return a;
      }

      public eeh.e a(final eeh.g $$0) {
         class a extends eeh.k {
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
            return $$0 instanceof eeh.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dxv a, eeh.r c) implements eeh.o {
      static final azx<eeh.d> d = azx.a(dxv.a.xmap(eeh.d::new, eeh.d::b).fieldOf("result_state"));

      d(dxv $$0) {
         this($$0, new eeh.r($$0));
      }

      @Override
      public azx<? extends eeh.o> a() {
         return d;
      }

      public eeh.u a(eeh.g $$0) {
         return this.c;
      }

      public dxv b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<eeh.g, eeh.e> {
      Codec<eeh.f> b = ma.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends eeh.f> a(kd<MapCodec<? extends eeh.f>> $$0) {
         eeh.a($$0, "biome", eeh.c.a);
         eeh.a($$0, "noise_threshold", eeh.l.e);
         eeh.a($$0, "vertical_gradient", eeh.y.e);
         eeh.a($$0, "y_above", eeh.aa.e);
         eeh.a($$0, "water", eeh.z.e);
         eeh.a($$0, "temperature", eeh.v.c);
         eeh.a($$0, "steep", eeh.s.c);
         eeh.a($$0, "not", eeh.n.c);
         eeh.a($$0, "hole", eeh.h.c);
         eeh.a($$0, "above_preliminary_surface", eeh.a.c);
         return eeh.a($$0, "stone_depth", eeh.t.f);
      }

      azx<? extends eeh.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final eei e;
      final eeh.e f = new eeh.g.d(this);
      final eeh.e g = new eeh.g.c(this);
      final eeh.e h = new eeh.g.b(this);
      final eeh.e i = new eeh.g.a();
      final eee j;
      final dzq k;
      private final edu l;
      private final Function<jh, jq<dik>> m;
      final een n;
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
      final jh.a z = new jh.a();
      Supplier<jq<dik>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(eei $$0, eee $$1, dzq $$2, edu $$3, Function<jh, jq<dik>> $$4, kd<dik> $$5, een $$6) {
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
            long $$2 = dgo.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = bae.a(
               bae.a(
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

      final class a implements eeh.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends eeh.j {
         b(eeh.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends eeh.j {
         c(eeh.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dzq $$4 = this.c.k;
            int $$5 = $$4.a(edq.a.a, $$0, $$2);
            int $$6 = $$4.a(edq.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(edq.a.a, $$7, $$1);
               int $$10 = $$4.a(edq.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends eeh.k {
         d(eeh.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements eeh.f {
      a;

      static final azx<eeh.h> c = azx.a(MapCodec.unit(a));

      @Override
      public azx<? extends eeh.f> a() {
         return c;
      }

      public eeh.e a(eeh.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements eeh.e {
      protected final eeh.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(eeh.g $$0) {
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

   abstract static class j extends eeh.i {
      protected j(eeh.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends eeh.i {
      protected k(eeh.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(aly<eta.a> a, double c, double d) implements eeh.f {
      static final azx<eeh.l> e = azx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aly.a(mb.aS).fieldOf("noise").forGetter(eeh.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(eeh.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(eeh.l::d)
                  )
                  .apply($$0, eeh.l::new)
         )
      );

      @Override
      public azx<? extends eeh.f> a() {
         return e;
      }

      public eeh.e a(final eeh.g $$0) {
         final eta $$1 = $$0.j.a(this.a);

         class a extends eeh.j {
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

      public aly<eta.a> b() {
         return this.a;
      }
   }

   static record m(eeh.e a) implements eeh.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(eeh.f a) implements eeh.f {
      static final azx<eeh.n> c = azx.a(eeh.f.b.xmap(eeh.n::new, eeh.n::b).fieldOf("invert"));

      @Override
      public azx<? extends eeh.f> a() {
         return c;
      }

      public eeh.e a(eeh.g $$0) {
         return new eeh.m(this.a.apply($$0));
      }

      public eeh.f b() {
         return this.a;
      }
   }

   public interface o extends Function<eeh.g, eeh.u> {
      Codec<eeh.o> b = ma.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends eeh.o> a(kd<MapCodec<? extends eeh.o>> $$0) {
         eeh.a($$0, "bandlands", eeh.b.c);
         eeh.a($$0, "block", eeh.d.d);
         eeh.a($$0, "sequence", eeh.q.c);
         return eeh.a($$0, "condition", eeh.x.d);
      }

      azx<? extends eeh.o> a();
   }

   static record p(List<eeh.u> a) implements eeh.u {
      @Nullable
      @Override
      public dxv tryApply(int $$0, int $$1, int $$2) {
         for (eeh.u $$3 : this.a) {
            dxv $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<eeh.o> a) implements eeh.o {
      static final azx<eeh.q> c = azx.a(eeh.o.b.listOf().xmap(eeh.q::new, eeh.q::b).fieldOf("sequence"));

      @Override
      public azx<? extends eeh.o> a() {
         return c;
      }

      public eeh.u a(eeh.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<eeh.u> $$1 = ImmutableList.builder();

            for (eeh.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new eeh.p($$1.build());
         }
      }

      public List<eeh.o> b() {
         return this.a;
      }
   }

   static record r(dxv a) implements eeh.u {
      @Override
      public dxv tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements eeh.f {
      a;

      static final azx<eeh.s> c = azx.a(MapCodec.unit(a));

      @Override
      public azx<? extends eeh.f> a() {
         return c;
      }

      public eeh.e a(eeh.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, ene e) implements eeh.f {
      static final azx<eeh.t> f = azx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(eeh.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(eeh.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(eeh.t::d),
                     ene.c.fieldOf("surface_type").forGetter(eeh.t::e)
                  )
                  .apply($$0, eeh.t::new)
         )
      );

      @Override
      public azx<? extends eeh.f> a() {
         return f;
      }

      public eeh.e a(final eeh.g $$0) {
         final boolean $$1 = this.e == ene.a;

         class a extends eeh.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)bae.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dxv tryApply(int var1, int var2, int var3);
   }

   static enum v implements eeh.f {
      a;

      static final azx<eeh.v> c = azx.a(MapCodec.unit(a));

      @Override
      public azx<? extends eeh.f> a() {
         return c;
      }

      public eeh.e a(eeh.g $$0) {
         return $$0.f;
      }
   }

   static record w(eeh.e a, eeh.u b) implements eeh.u {
      @Nullable
      @Override
      public dxv tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(eeh.f a, eeh.o c) implements eeh.o {
      static final azx<eeh.x> d = azx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(eeh.f.b.fieldOf("if_true").forGetter(eeh.x::b), eeh.o.b.fieldOf("then_run").forGetter(eeh.x::c)).apply($$0, eeh.x::new)
         )
      );

      @Override
      public azx<? extends eeh.o> a() {
         return d;
      }

      public eeh.u a(eeh.g $$0) {
         return new eeh.w(this.a.apply($$0), this.c.apply($$0));
      }

      public eeh.f b() {
         return this.a;
      }
   }

   static record y(alz a, eek c, eek d) implements eeh.f {
      static final azx<eeh.y> e = azx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alz.a.fieldOf("random_name").forGetter(eeh.y::b),
                     eek.a.fieldOf("true_at_and_below").forGetter(eeh.y::c),
                     eek.a.fieldOf("false_at_and_above").forGetter(eeh.y::d)
                  )
                  .apply($$0, eeh.y::new)
         )
      );

      @Override
      public azx<? extends eeh.f> a() {
         return e;
      }

      public eeh.e a(final eeh.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final eed $$3 = $$0.j.a(this.b());

         class a extends eeh.k {
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
                  double $$1 = bae.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  bam $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public alz b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements eeh.f {
      static final azx<eeh.z> e = azx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(eeh.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(eeh.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(eeh.z::d)
                  )
                  .apply($$0, eeh.z::new)
         )
      );

      @Override
      public azx<? extends eeh.f> a() {
         return e;
      }

      public eeh.e a(final eeh.g $$0) {
         class a extends eeh.k {
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
