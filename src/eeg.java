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

public class eeg {
   public static final eeg.f a = a(0, false, end.b);
   public static final eeg.f b = a(0, true, end.b);
   public static final eeg.f c = a(0, true, 6, end.b);
   public static final eeg.f d = a(0, true, 30, end.b);
   public static final eeg.f e = a(0, false, end.a);
   public static final eeg.f f = a(0, true, end.a);

   public static eeg.f a(int $$0, boolean $$1, end $$2) {
      return new eeg.t($$0, $$1, 0, $$2);
   }

   public static eeg.f a(int $$0, boolean $$1, int $$2, end $$3) {
      return new eeg.t($$0, $$1, $$2, $$3);
   }

   public static eeg.f a(eeg.f $$0) {
      return new eeg.n($$0);
   }

   public static eeg.f a(eej $$0, int $$1) {
      return new eeg.aa($$0, $$1, false);
   }

   public static eeg.f b(eej $$0, int $$1) {
      return new eeg.aa($$0, $$1, true);
   }

   public static eeg.f a(int $$0, int $$1) {
      return new eeg.z($$0, $$1, false);
   }

   public static eeg.f b(int $$0, int $$1) {
      return new eeg.z($$0, $$1, true);
   }

   @SafeVarargs
   public static eeg.f a(aly<dij>... $$0) {
      return a(List.of($$0));
   }

   private static eeg.c a(List<aly<dij>> $$0) {
      return new eeg.c($$0);
   }

   public static eeg.f a(aly<esz.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static eeg.f a(aly<esz.a> $$0, double $$1, double $$2) {
      return new eeg.l($$0, $$1, $$2);
   }

   public static eeg.f a(String $$0, eej $$1, eej $$2) {
      return new eeg.y(alz.a($$0), $$1, $$2);
   }

   public static eeg.f a() {
      return eeg.s.a;
   }

   public static eeg.f b() {
      return eeg.h.a;
   }

   public static eeg.f c() {
      return eeg.a.a;
   }

   public static eeg.f d() {
      return eeg.v.a;
   }

   public static eeg.o a(eeg.f $$0, eeg.o $$1) {
      return new eeg.x($$0, $$1);
   }

   public static eeg.o a(eeg.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new eeg.q(Arrays.asList($$0));
      }
   }

   public static eeg.o a(dxu $$0) {
      return new eeg.d($$0);
   }

   public static eeg.o e() {
      return eeg.b.a;
   }

   static <A> MapCodec<? extends A> a(kd<MapCodec<? extends A>> $$0, String $$1, azx<? extends A> $$2) {
      return kd.a($$0, $$1, $$2.a());
   }

   static enum a implements eeg.f {
      a;

      static final azx<eeg.a> c = azx.a(MapCodec.unit(a));

      @Override
      public azx<? extends eeg.f> a() {
         return c;
      }

      public eeg.e a(eeg.g $$0) {
         return $$0.i;
      }
   }

   static record aa(eej a, int c, boolean d) implements eeg.f {
      static final azx<eeg.aa> e = azx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     eej.a.fieldOf("anchor").forGetter(eeg.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(eeg.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(eeg.aa::d)
                  )
                  .apply($$0, eeg.aa::new)
         )
      );

      @Override
      public azx<? extends eeg.f> a() {
         return e;
      }

      public eeg.e a(final eeg.g $$0) {
         class a extends eeg.k {
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

      public eej b() {
         return this.a;
      }
   }

   static enum b implements eeg.o {
      a;

      static final azx<eeg.b> c = azx.a(MapCodec.unit(a));

      @Override
      public azx<? extends eeg.o> a() {
         return c;
      }

      public eeg.u a(eeg.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements eeg.f {
      static final azx<eeg.c> a = azx.a(aly.a(mb.aI).listOf().fieldOf("biome_is").xmap(eeg::a, $$0 -> $$0.c));
      private final List<aly<dij>> c;
      final Predicate<aly<dij>> d;

      c(List<aly<dij>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public azx<? extends eeg.f> a() {
         return a;
      }

      public eeg.e a(final eeg.g $$0) {
         class a extends eeg.k {
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
            return $$0 instanceof eeg.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dxu a, eeg.r c) implements eeg.o {
      static final azx<eeg.d> d = azx.a(dxu.a.xmap(eeg.d::new, eeg.d::b).fieldOf("result_state"));

      d(dxu $$0) {
         this($$0, new eeg.r($$0));
      }

      @Override
      public azx<? extends eeg.o> a() {
         return d;
      }

      public eeg.u a(eeg.g $$0) {
         return this.c;
      }

      public dxu b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<eeg.g, eeg.e> {
      Codec<eeg.f> b = ma.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends eeg.f> a(kd<MapCodec<? extends eeg.f>> $$0) {
         eeg.a($$0, "biome", eeg.c.a);
         eeg.a($$0, "noise_threshold", eeg.l.e);
         eeg.a($$0, "vertical_gradient", eeg.y.e);
         eeg.a($$0, "y_above", eeg.aa.e);
         eeg.a($$0, "water", eeg.z.e);
         eeg.a($$0, "temperature", eeg.v.c);
         eeg.a($$0, "steep", eeg.s.c);
         eeg.a($$0, "not", eeg.n.c);
         eeg.a($$0, "hole", eeg.h.c);
         eeg.a($$0, "above_preliminary_surface", eeg.a.c);
         return eeg.a($$0, "stone_depth", eeg.t.f);
      }

      azx<? extends eeg.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final eeh e;
      final eeg.e f = new eeg.g.d(this);
      final eeg.e g = new eeg.g.c(this);
      final eeg.e h = new eeg.g.b(this);
      final eeg.e i = new eeg.g.a();
      final eed j;
      final dzp k;
      private final edt l;
      private final Function<jh, jq<dij>> m;
      final eem n;
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
      Supplier<jq<dij>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(eeh $$0, eed $$1, dzp $$2, edt $$3, Function<jh, jq<dij>> $$4, kd<dij> $$5, eem $$6) {
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
            long $$2 = dgn.c($$0, $$1);
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

      final class a implements eeg.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends eeg.j {
         b(eeg.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends eeg.j {
         c(eeg.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dzp $$4 = this.c.k;
            int $$5 = $$4.a(edp.a.a, $$0, $$2);
            int $$6 = $$4.a(edp.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(edp.a.a, $$7, $$1);
               int $$10 = $$4.a(edp.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends eeg.k {
         d(eeg.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements eeg.f {
      a;

      static final azx<eeg.h> c = azx.a(MapCodec.unit(a));

      @Override
      public azx<? extends eeg.f> a() {
         return c;
      }

      public eeg.e a(eeg.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements eeg.e {
      protected final eeg.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(eeg.g $$0) {
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

   abstract static class j extends eeg.i {
      protected j(eeg.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends eeg.i {
      protected k(eeg.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(aly<esz.a> a, double c, double d) implements eeg.f {
      static final azx<eeg.l> e = azx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aly.a(mb.aS).fieldOf("noise").forGetter(eeg.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(eeg.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(eeg.l::d)
                  )
                  .apply($$0, eeg.l::new)
         )
      );

      @Override
      public azx<? extends eeg.f> a() {
         return e;
      }

      public eeg.e a(final eeg.g $$0) {
         final esz $$1 = $$0.j.a(this.a);

         class a extends eeg.j {
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

      public aly<esz.a> b() {
         return this.a;
      }
   }

   static record m(eeg.e a) implements eeg.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(eeg.f a) implements eeg.f {
      static final azx<eeg.n> c = azx.a(eeg.f.b.xmap(eeg.n::new, eeg.n::b).fieldOf("invert"));

      @Override
      public azx<? extends eeg.f> a() {
         return c;
      }

      public eeg.e a(eeg.g $$0) {
         return new eeg.m(this.a.apply($$0));
      }

      public eeg.f b() {
         return this.a;
      }
   }

   public interface o extends Function<eeg.g, eeg.u> {
      Codec<eeg.o> b = ma.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends eeg.o> a(kd<MapCodec<? extends eeg.o>> $$0) {
         eeg.a($$0, "bandlands", eeg.b.c);
         eeg.a($$0, "block", eeg.d.d);
         eeg.a($$0, "sequence", eeg.q.c);
         return eeg.a($$0, "condition", eeg.x.d);
      }

      azx<? extends eeg.o> a();
   }

   static record p(List<eeg.u> a) implements eeg.u {
      @Nullable
      @Override
      public dxu tryApply(int $$0, int $$1, int $$2) {
         for (eeg.u $$3 : this.a) {
            dxu $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<eeg.o> a) implements eeg.o {
      static final azx<eeg.q> c = azx.a(eeg.o.b.listOf().xmap(eeg.q::new, eeg.q::b).fieldOf("sequence"));

      @Override
      public azx<? extends eeg.o> a() {
         return c;
      }

      public eeg.u a(eeg.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<eeg.u> $$1 = ImmutableList.builder();

            for (eeg.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new eeg.p($$1.build());
         }
      }

      public List<eeg.o> b() {
         return this.a;
      }
   }

   static record r(dxu a) implements eeg.u {
      @Override
      public dxu tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements eeg.f {
      a;

      static final azx<eeg.s> c = azx.a(MapCodec.unit(a));

      @Override
      public azx<? extends eeg.f> a() {
         return c;
      }

      public eeg.e a(eeg.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, end e) implements eeg.f {
      static final azx<eeg.t> f = azx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(eeg.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(eeg.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(eeg.t::d),
                     end.c.fieldOf("surface_type").forGetter(eeg.t::e)
                  )
                  .apply($$0, eeg.t::new)
         )
      );

      @Override
      public azx<? extends eeg.f> a() {
         return f;
      }

      public eeg.e a(final eeg.g $$0) {
         final boolean $$1 = this.e == end.a;

         class a extends eeg.k {
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
      dxu tryApply(int var1, int var2, int var3);
   }

   static enum v implements eeg.f {
      a;

      static final azx<eeg.v> c = azx.a(MapCodec.unit(a));

      @Override
      public azx<? extends eeg.f> a() {
         return c;
      }

      public eeg.e a(eeg.g $$0) {
         return $$0.f;
      }
   }

   static record w(eeg.e a, eeg.u b) implements eeg.u {
      @Nullable
      @Override
      public dxu tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(eeg.f a, eeg.o c) implements eeg.o {
      static final azx<eeg.x> d = azx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(eeg.f.b.fieldOf("if_true").forGetter(eeg.x::b), eeg.o.b.fieldOf("then_run").forGetter(eeg.x::c)).apply($$0, eeg.x::new)
         )
      );

      @Override
      public azx<? extends eeg.o> a() {
         return d;
      }

      public eeg.u a(eeg.g $$0) {
         return new eeg.w(this.a.apply($$0), this.c.apply($$0));
      }

      public eeg.f b() {
         return this.a;
      }
   }

   static record y(alz a, eej c, eej d) implements eeg.f {
      static final azx<eeg.y> e = azx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alz.a.fieldOf("random_name").forGetter(eeg.y::b),
                     eej.a.fieldOf("true_at_and_below").forGetter(eeg.y::c),
                     eej.a.fieldOf("false_at_and_above").forGetter(eeg.y::d)
                  )
                  .apply($$0, eeg.y::new)
         )
      );

      @Override
      public azx<? extends eeg.f> a() {
         return e;
      }

      public eeg.e a(final eeg.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final eec $$3 = $$0.j.a(this.b());

         class a extends eeg.k {
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

   static record z(int a, int c, boolean d) implements eeg.f {
      static final azx<eeg.z> e = azx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(eeg.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(eeg.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(eeg.z::d)
                  )
                  .apply($$0, eeg.z::new)
         )
      );

      @Override
      public azx<? extends eeg.f> a() {
         return e;
      }

      public eeg.e a(final eeg.g $$0) {
         class a extends eeg.k {
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
