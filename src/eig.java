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

public class eig {
   public static final eig.f a = a(0, false, erh.b);
   public static final eig.f b = a(0, true, erh.b);
   public static final eig.f c = a(0, true, 6, erh.b);
   public static final eig.f d = a(0, true, 30, erh.b);
   public static final eig.f e = a(0, false, erh.a);
   public static final eig.f f = a(0, true, erh.a);

   public static eig.f a(int $$0, boolean $$1, erh $$2) {
      return new eig.t($$0, $$1, 0, $$2);
   }

   public static eig.f a(int $$0, boolean $$1, int $$2, erh $$3) {
      return new eig.t($$0, $$1, $$2, $$3);
   }

   public static eig.f a(eig.f $$0) {
      return new eig.n($$0);
   }

   public static eig.f a(eij $$0, int $$1) {
      return new eig.aa($$0, $$1, false);
   }

   public static eig.f b(eij $$0, int $$1) {
      return new eig.aa($$0, $$1, true);
   }

   public static eig.f a(int $$0, int $$1) {
      return new eig.z($$0, $$1, false);
   }

   public static eig.f b(int $$0, int $$1) {
      return new eig.z($$0, $$1, true);
   }

   @SafeVarargs
   public static eig.f a(alq<dlm>... $$0) {
      return a(List.of($$0));
   }

   private static eig.c a(List<alq<dlm>> $$0) {
      return new eig.c($$0);
   }

   public static eig.f a(alq<exd.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static eig.f a(alq<exd.a> $$0, double $$1, double $$2) {
      return new eig.l($$0, $$1, $$2);
   }

   public static eig.f a(String $$0, eij $$1, eij $$2) {
      return new eig.y(alr.a($$0), $$1, $$2);
   }

   public static eig.f a() {
      return eig.s.a;
   }

   public static eig.f b() {
      return eig.h.a;
   }

   public static eig.f c() {
      return eig.a.a;
   }

   public static eig.f d() {
      return eig.v.a;
   }

   public static eig.o a(eig.f $$0, eig.o $$1) {
      return new eig.x($$0, $$1);
   }

   public static eig.o a(eig.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new eig.q(Arrays.asList($$0));
      }
   }

   public static eig.o a(ebq $$0) {
      return new eig.d($$0);
   }

   public static eig.o e() {
      return eig.b.a;
   }

   static <A> MapCodec<? extends A> a(jt<MapCodec<? extends A>> $$0, String $$1, azs<? extends A> $$2) {
      return jt.a($$0, $$1, $$2.a());
   }

   static enum a implements eig.f {
      a;

      static final azs<eig.a> c = azs.a(MapCodec.unit(a));

      @Override
      public azs<? extends eig.f> a() {
         return c;
      }

      public eig.e a(eig.g $$0) {
         return $$0.i;
      }
   }

   static record aa(eij a, int c, boolean d) implements eig.f {
      static final azs<eig.aa> e = azs.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     eij.a.fieldOf("anchor").forGetter(eig.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(eig.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(eig.aa::d)
                  )
                  .apply($$0, eig.aa::new)
         )
      );

      @Override
      public azs<? extends eig.f> a() {
         return e;
      }

      public eig.e a(final eig.g $$0) {
         class a extends eig.k {
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

      public eij b() {
         return this.a;
      }
   }

   static enum b implements eig.o {
      a;

      static final azs<eig.b> c = azs.a(MapCodec.unit(a));

      @Override
      public azs<? extends eig.o> a() {
         return c;
      }

      public eig.u a(eig.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements eig.f {
      static final azs<eig.c> a = azs.a(alq.a(mi.aG).listOf().fieldOf("biome_is").xmap(eig::a, $$0 -> $$0.c));
      private final List<alq<dlm>> c;
      final Predicate<alq<dlm>> d;

      c(List<alq<dlm>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public azs<? extends eig.f> a() {
         return a;
      }

      public eig.e a(final eig.g $$0) {
         class a extends eig.k {
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
            return $$0 instanceof eig.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(ebq a, eig.r c) implements eig.o {
      static final azs<eig.d> d = azs.a(ebq.a.xmap(eig.d::new, eig.d::b).fieldOf("result_state"));

      d(ebq $$0) {
         this($$0, new eig.r($$0));
      }

      @Override
      public azs<? extends eig.o> a() {
         return d;
      }

      public eig.u a(eig.g $$0) {
         return this.c;
      }

      public ebq b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<eig.g, eig.e> {
      Codec<eig.f> b = mh.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends eig.f> a(jt<MapCodec<? extends eig.f>> $$0) {
         eig.a($$0, "biome", eig.c.a);
         eig.a($$0, "noise_threshold", eig.l.e);
         eig.a($$0, "vertical_gradient", eig.y.e);
         eig.a($$0, "y_above", eig.aa.e);
         eig.a($$0, "water", eig.z.e);
         eig.a($$0, "temperature", eig.v.c);
         eig.a($$0, "steep", eig.s.c);
         eig.a($$0, "not", eig.n.c);
         eig.a($$0, "hole", eig.h.c);
         eig.a($$0, "above_preliminary_surface", eig.a.c);
         return eig.a($$0, "stone_depth", eig.t.f);
      }

      azs<? extends eig.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final eih e;
      final eig.e f = new eig.g.d(this);
      final eig.e g = new eig.g.c(this);
      final eig.e h = new eig.g.b(this);
      final eig.e i = new eig.g.a();
      final eid j;
      final edn k;
      private final eht l;
      private final Function<iw, jg<dlm>> m;
      final eim n;
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
      final iw.a z = new iw.a();
      Supplier<jg<dlm>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(eih $$0, eid $$1, edn $$2, eht $$3, Function<iw, jg<dlm>> $$4, jt<dlm> $$5, eim $$6) {
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
            long $$2 = djo.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = azz.a(
               azz.a(
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

      final class a implements eig.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends eig.j {
         b(eig.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends eig.j {
         c(eig.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            edn $$4 = this.c.k;
            int $$5 = $$4.a(ehp.a.a, $$0, $$2);
            int $$6 = $$4.a(ehp.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(ehp.a.a, $$7, $$1);
               int $$10 = $$4.a(ehp.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends eig.k {
         d(eig.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements eig.f {
      a;

      static final azs<eig.h> c = azs.a(MapCodec.unit(a));

      @Override
      public azs<? extends eig.f> a() {
         return c;
      }

      public eig.e a(eig.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements eig.e {
      protected final eig.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(eig.g $$0) {
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

   abstract static class j extends eig.i {
      protected j(eig.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends eig.i {
      protected k(eig.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(alq<exd.a> a, double c, double d) implements eig.f {
      static final azs<eig.l> e = azs.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alq.a(mi.aY).fieldOf("noise").forGetter(eig.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(eig.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(eig.l::d)
                  )
                  .apply($$0, eig.l::new)
         )
      );

      @Override
      public azs<? extends eig.f> a() {
         return e;
      }

      public eig.e a(final eig.g $$0) {
         final exd $$1 = $$0.j.a(this.a);

         class a extends eig.j {
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

      public alq<exd.a> b() {
         return this.a;
      }
   }

   static record m(eig.e a) implements eig.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(eig.f a) implements eig.f {
      static final azs<eig.n> c = azs.a(eig.f.b.xmap(eig.n::new, eig.n::b).fieldOf("invert"));

      @Override
      public azs<? extends eig.f> a() {
         return c;
      }

      public eig.e a(eig.g $$0) {
         return new eig.m(this.a.apply($$0));
      }

      public eig.f b() {
         return this.a;
      }
   }

   public interface o extends Function<eig.g, eig.u> {
      Codec<eig.o> b = mh.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends eig.o> a(jt<MapCodec<? extends eig.o>> $$0) {
         eig.a($$0, "bandlands", eig.b.c);
         eig.a($$0, "block", eig.d.d);
         eig.a($$0, "sequence", eig.q.c);
         return eig.a($$0, "condition", eig.x.d);
      }

      azs<? extends eig.o> a();
   }

   static record p(List<eig.u> a) implements eig.u {
      @Nullable
      @Override
      public ebq tryApply(int $$0, int $$1, int $$2) {
         for (eig.u $$3 : this.a) {
            ebq $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<eig.o> a) implements eig.o {
      static final azs<eig.q> c = azs.a(eig.o.b.listOf().xmap(eig.q::new, eig.q::b).fieldOf("sequence"));

      @Override
      public azs<? extends eig.o> a() {
         return c;
      }

      public eig.u a(eig.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<eig.u> $$1 = ImmutableList.builder();

            for (eig.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new eig.p($$1.build());
         }
      }

      public List<eig.o> b() {
         return this.a;
      }
   }

   static record r(ebq a) implements eig.u {
      @Override
      public ebq tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements eig.f {
      a;

      static final azs<eig.s> c = azs.a(MapCodec.unit(a));

      @Override
      public azs<? extends eig.f> a() {
         return c;
      }

      public eig.e a(eig.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, erh e) implements eig.f {
      static final azs<eig.t> f = azs.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(eig.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(eig.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(eig.t::d),
                     erh.c.fieldOf("surface_type").forGetter(eig.t::e)
                  )
                  .apply($$0, eig.t::new)
         )
      );

      @Override
      public azs<? extends eig.f> a() {
         return f;
      }

      public eig.e a(final eig.g $$0) {
         final boolean $$1 = this.e == erh.a;

         class a extends eig.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)azz.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      ebq tryApply(int var1, int var2, int var3);
   }

   static enum v implements eig.f {
      a;

      static final azs<eig.v> c = azs.a(MapCodec.unit(a));

      @Override
      public azs<? extends eig.f> a() {
         return c;
      }

      public eig.e a(eig.g $$0) {
         return $$0.f;
      }
   }

   static record w(eig.e a, eig.u b) implements eig.u {
      @Nullable
      @Override
      public ebq tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(eig.f a, eig.o c) implements eig.o {
      static final azs<eig.x> d = azs.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(eig.f.b.fieldOf("if_true").forGetter(eig.x::b), eig.o.b.fieldOf("then_run").forGetter(eig.x::c)).apply($$0, eig.x::new)
         )
      );

      @Override
      public azs<? extends eig.o> a() {
         return d;
      }

      public eig.u a(eig.g $$0) {
         return new eig.w(this.a.apply($$0), this.c.apply($$0));
      }

      public eig.f b() {
         return this.a;
      }
   }

   static record y(alr a, eij c, eij d) implements eig.f {
      static final azs<eig.y> e = azs.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alr.a.fieldOf("random_name").forGetter(eig.y::b),
                     eij.a.fieldOf("true_at_and_below").forGetter(eig.y::c),
                     eij.a.fieldOf("false_at_and_above").forGetter(eig.y::d)
                  )
                  .apply($$0, eig.y::new)
         )
      );

      @Override
      public azs<? extends eig.f> a() {
         return e;
      }

      public eig.e a(final eig.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final eic $$3 = $$0.j.a(this.b());

         class a extends eig.k {
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
                  double $$1 = azz.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  bai $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public alr b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements eig.f {
      static final azs<eig.z> e = azs.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(eig.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(eig.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(eig.z::d)
                  )
                  .apply($$0, eig.z::new)
         )
      );

      @Override
      public azs<? extends eig.f> a() {
         return e;
      }

      public eig.e a(final eig.g $$0) {
         class a extends eig.k {
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
