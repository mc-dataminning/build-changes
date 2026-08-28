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

public class eea {
   public static final eea.f a = a(0, false, emx.b);
   public static final eea.f b = a(0, true, emx.b);
   public static final eea.f c = a(0, true, 6, emx.b);
   public static final eea.f d = a(0, true, 30, emx.b);
   public static final eea.f e = a(0, false, emx.a);
   public static final eea.f f = a(0, true, emx.a);

   public static eea.f a(int $$0, boolean $$1, emx $$2) {
      return new eea.t($$0, $$1, 0, $$2);
   }

   public static eea.f a(int $$0, boolean $$1, int $$2, emx $$3) {
      return new eea.t($$0, $$1, $$2, $$3);
   }

   public static eea.f a(eea.f $$0) {
      return new eea.n($$0);
   }

   public static eea.f a(eed $$0, int $$1) {
      return new eea.aa($$0, $$1, false);
   }

   public static eea.f b(eed $$0, int $$1) {
      return new eea.aa($$0, $$1, true);
   }

   public static eea.f a(int $$0, int $$1) {
      return new eea.z($$0, $$1, false);
   }

   public static eea.f b(int $$0, int $$1) {
      return new eea.z($$0, $$1, true);
   }

   @SafeVarargs
   public static eea.f a(alo<dib>... $$0) {
      return a(List.of($$0));
   }

   private static eea.c a(List<alo<dib>> $$0) {
      return new eea.c($$0);
   }

   public static eea.f a(alo<est.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static eea.f a(alo<est.a> $$0, double $$1, double $$2) {
      return new eea.l($$0, $$1, $$2);
   }

   public static eea.f a(String $$0, eed $$1, eed $$2) {
      return new eea.y(alp.a($$0), $$1, $$2);
   }

   public static eea.f a() {
      return eea.s.a;
   }

   public static eea.f b() {
      return eea.h.a;
   }

   public static eea.f c() {
      return eea.a.a;
   }

   public static eea.f d() {
      return eea.v.a;
   }

   public static eea.o a(eea.f $$0, eea.o $$1) {
      return new eea.x($$0, $$1);
   }

   public static eea.o a(eea.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new eea.q(Arrays.asList($$0));
      }
   }

   public static eea.o a(dxo $$0) {
      return new eea.d($$0);
   }

   public static eea.o e() {
      return eea.b.a;
   }

   static <A> MapCodec<? extends A> a(kd<MapCodec<? extends A>> $$0, String $$1, azn<? extends A> $$2) {
      return kd.a($$0, $$1, $$2.a());
   }

   static enum a implements eea.f {
      a;

      static final azn<eea.a> c = azn.a(MapCodec.unit(a));

      @Override
      public azn<? extends eea.f> a() {
         return c;
      }

      public eea.e a(eea.g $$0) {
         return $$0.i;
      }
   }

   static record aa(eed a, int c, boolean d) implements eea.f {
      static final azn<eea.aa> e = azn.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     eed.a.fieldOf("anchor").forGetter(eea.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(eea.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(eea.aa::d)
                  )
                  .apply($$0, eea.aa::new)
         )
      );

      @Override
      public azn<? extends eea.f> a() {
         return e;
      }

      public eea.e a(final eea.g $$0) {
         class a extends eea.k {
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

      public eed b() {
         return this.a;
      }
   }

   static enum b implements eea.o {
      a;

      static final azn<eea.b> c = azn.a(MapCodec.unit(a));

      @Override
      public azn<? extends eea.o> a() {
         return c;
      }

      public eea.u a(eea.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements eea.f {
      static final azn<eea.c> a = azn.a(alo.a(mb.aI).listOf().fieldOf("biome_is").xmap(eea::a, $$0 -> $$0.c));
      private final List<alo<dib>> c;
      final Predicate<alo<dib>> d;

      c(List<alo<dib>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public azn<? extends eea.f> a() {
         return a;
      }

      public eea.e a(final eea.g $$0) {
         class a extends eea.k {
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
            return $$0 instanceof eea.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dxo a, eea.r c) implements eea.o {
      static final azn<eea.d> d = azn.a(dxo.a.xmap(eea.d::new, eea.d::b).fieldOf("result_state"));

      d(dxo $$0) {
         this($$0, new eea.r($$0));
      }

      @Override
      public azn<? extends eea.o> a() {
         return d;
      }

      public eea.u a(eea.g $$0) {
         return this.c;
      }

      public dxo b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<eea.g, eea.e> {
      Codec<eea.f> b = ma.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends eea.f> a(kd<MapCodec<? extends eea.f>> $$0) {
         eea.a($$0, "biome", eea.c.a);
         eea.a($$0, "noise_threshold", eea.l.e);
         eea.a($$0, "vertical_gradient", eea.y.e);
         eea.a($$0, "y_above", eea.aa.e);
         eea.a($$0, "water", eea.z.e);
         eea.a($$0, "temperature", eea.v.c);
         eea.a($$0, "steep", eea.s.c);
         eea.a($$0, "not", eea.n.c);
         eea.a($$0, "hole", eea.h.c);
         eea.a($$0, "above_preliminary_surface", eea.a.c);
         return eea.a($$0, "stone_depth", eea.t.f);
      }

      azn<? extends eea.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final eeb e;
      final eea.e f = new eea.g.d(this);
      final eea.e g = new eea.g.c(this);
      final eea.e h = new eea.g.b(this);
      final eea.e i = new eea.g.a();
      final edx j;
      final dzj k;
      private final edn l;
      private final Function<jh, jq<dib>> m;
      final eeg n;
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
      Supplier<jq<dib>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(eeb $$0, edx $$1, dzj $$2, edn $$3, Function<jh, jq<dib>> $$4, kd<dib> $$5, eeg $$6) {
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
            long $$2 = dgf.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = azu.a(
               azu.a(
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

      final class a implements eea.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends eea.j {
         b(eea.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends eea.j {
         c(eea.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dzj $$4 = this.c.k;
            int $$5 = $$4.a(edj.a.a, $$0, $$2);
            int $$6 = $$4.a(edj.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(edj.a.a, $$7, $$1);
               int $$10 = $$4.a(edj.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends eea.k {
         d(eea.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements eea.f {
      a;

      static final azn<eea.h> c = azn.a(MapCodec.unit(a));

      @Override
      public azn<? extends eea.f> a() {
         return c;
      }

      public eea.e a(eea.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements eea.e {
      protected final eea.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(eea.g $$0) {
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

   abstract static class j extends eea.i {
      protected j(eea.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends eea.i {
      protected k(eea.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(alo<est.a> a, double c, double d) implements eea.f {
      static final azn<eea.l> e = azn.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alo.a(mb.aS).fieldOf("noise").forGetter(eea.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(eea.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(eea.l::d)
                  )
                  .apply($$0, eea.l::new)
         )
      );

      @Override
      public azn<? extends eea.f> a() {
         return e;
      }

      public eea.e a(final eea.g $$0) {
         final est $$1 = $$0.j.a(this.a);

         class a extends eea.j {
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

      public alo<est.a> b() {
         return this.a;
      }
   }

   static record m(eea.e a) implements eea.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(eea.f a) implements eea.f {
      static final azn<eea.n> c = azn.a(eea.f.b.xmap(eea.n::new, eea.n::b).fieldOf("invert"));

      @Override
      public azn<? extends eea.f> a() {
         return c;
      }

      public eea.e a(eea.g $$0) {
         return new eea.m(this.a.apply($$0));
      }

      public eea.f b() {
         return this.a;
      }
   }

   public interface o extends Function<eea.g, eea.u> {
      Codec<eea.o> b = ma.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends eea.o> a(kd<MapCodec<? extends eea.o>> $$0) {
         eea.a($$0, "bandlands", eea.b.c);
         eea.a($$0, "block", eea.d.d);
         eea.a($$0, "sequence", eea.q.c);
         return eea.a($$0, "condition", eea.x.d);
      }

      azn<? extends eea.o> a();
   }

   static record p(List<eea.u> a) implements eea.u {
      @Nullable
      @Override
      public dxo tryApply(int $$0, int $$1, int $$2) {
         for (eea.u $$3 : this.a) {
            dxo $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<eea.o> a) implements eea.o {
      static final azn<eea.q> c = azn.a(eea.o.b.listOf().xmap(eea.q::new, eea.q::b).fieldOf("sequence"));

      @Override
      public azn<? extends eea.o> a() {
         return c;
      }

      public eea.u a(eea.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<eea.u> $$1 = ImmutableList.builder();

            for (eea.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new eea.p($$1.build());
         }
      }

      public List<eea.o> b() {
         return this.a;
      }
   }

   static record r(dxo a) implements eea.u {
      @Override
      public dxo tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements eea.f {
      a;

      static final azn<eea.s> c = azn.a(MapCodec.unit(a));

      @Override
      public azn<? extends eea.f> a() {
         return c;
      }

      public eea.e a(eea.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, emx e) implements eea.f {
      static final azn<eea.t> f = azn.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(eea.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(eea.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(eea.t::d),
                     emx.c.fieldOf("surface_type").forGetter(eea.t::e)
                  )
                  .apply($$0, eea.t::new)
         )
      );

      @Override
      public azn<? extends eea.f> a() {
         return f;
      }

      public eea.e a(final eea.g $$0) {
         final boolean $$1 = this.e == emx.a;

         class a extends eea.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)azu.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dxo tryApply(int var1, int var2, int var3);
   }

   static enum v implements eea.f {
      a;

      static final azn<eea.v> c = azn.a(MapCodec.unit(a));

      @Override
      public azn<? extends eea.f> a() {
         return c;
      }

      public eea.e a(eea.g $$0) {
         return $$0.f;
      }
   }

   static record w(eea.e a, eea.u b) implements eea.u {
      @Nullable
      @Override
      public dxo tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(eea.f a, eea.o c) implements eea.o {
      static final azn<eea.x> d = azn.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(eea.f.b.fieldOf("if_true").forGetter(eea.x::b), eea.o.b.fieldOf("then_run").forGetter(eea.x::c)).apply($$0, eea.x::new)
         )
      );

      @Override
      public azn<? extends eea.o> a() {
         return d;
      }

      public eea.u a(eea.g $$0) {
         return new eea.w(this.a.apply($$0), this.c.apply($$0));
      }

      public eea.f b() {
         return this.a;
      }
   }

   static record y(alp a, eed c, eed d) implements eea.f {
      static final azn<eea.y> e = azn.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alp.a.fieldOf("random_name").forGetter(eea.y::b),
                     eed.a.fieldOf("true_at_and_below").forGetter(eea.y::c),
                     eed.a.fieldOf("false_at_and_above").forGetter(eea.y::d)
                  )
                  .apply($$0, eea.y::new)
         )
      );

      @Override
      public azn<? extends eea.f> a() {
         return e;
      }

      public eea.e a(final eea.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final edw $$3 = $$0.j.a(this.b());

         class a extends eea.k {
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
                  double $$1 = azu.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  bac $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public alp b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements eea.f {
      static final azn<eea.z> e = azn.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(eea.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(eea.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(eea.z::d)
                  )
                  .apply($$0, eea.z::new)
         )
      );

      @Override
      public azn<? extends eea.f> a() {
         return e;
      }

      public eea.e a(final eea.g $$0) {
         class a extends eea.k {
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
