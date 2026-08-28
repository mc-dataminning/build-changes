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

public class efc {
   public static final efc.f a = a(0, false, eoa.b);
   public static final efc.f b = a(0, true, eoa.b);
   public static final efc.f c = a(0, true, 6, eoa.b);
   public static final efc.f d = a(0, true, 30, eoa.b);
   public static final efc.f e = a(0, false, eoa.a);
   public static final efc.f f = a(0, true, eoa.a);

   public static efc.f a(int $$0, boolean $$1, eoa $$2) {
      return new efc.t($$0, $$1, 0, $$2);
   }

   public static efc.f a(int $$0, boolean $$1, int $$2, eoa $$3) {
      return new efc.t($$0, $$1, $$2, $$3);
   }

   public static efc.f a(efc.f $$0) {
      return new efc.n($$0);
   }

   public static efc.f a(eff $$0, int $$1) {
      return new efc.aa($$0, $$1, false);
   }

   public static efc.f b(eff $$0, int $$1) {
      return new efc.aa($$0, $$1, true);
   }

   public static efc.f a(int $$0, int $$1) {
      return new efc.z($$0, $$1, false);
   }

   public static efc.f b(int $$0, int $$1) {
      return new efc.z($$0, $$1, true);
   }

   @SafeVarargs
   public static efc.f a(alc<dis>... $$0) {
      return a(List.of($$0));
   }

   private static efc.c a(List<alc<dis>> $$0) {
      return new efc.c($$0);
   }

   public static efc.f a(alc<etw.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static efc.f a(alc<etw.a> $$0, double $$1, double $$2) {
      return new efc.l($$0, $$1, $$2);
   }

   public static efc.f a(String $$0, eff $$1, eff $$2) {
      return new efc.y(ald.a($$0), $$1, $$2);
   }

   public static efc.f a() {
      return efc.s.a;
   }

   public static efc.f b() {
      return efc.h.a;
   }

   public static efc.f c() {
      return efc.a.a;
   }

   public static efc.f d() {
      return efc.v.a;
   }

   public static efc.o a(efc.f $$0, efc.o $$1) {
      return new efc.x($$0, $$1);
   }

   public static efc.o a(efc.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new efc.q(Arrays.asList($$0));
      }
   }

   public static efc.o a(dym $$0) {
      return new efc.d($$0);
   }

   public static efc.o e() {
      return efc.b.a;
   }

   static <A> MapCodec<? extends A> a(kf<MapCodec<? extends A>> $$0, String $$1, azd<? extends A> $$2) {
      return kf.a($$0, $$1, $$2.a());
   }

   static enum a implements efc.f {
      a;

      static final azd<efc.a> c = azd.a(MapCodec.unit(a));

      @Override
      public azd<? extends efc.f> a() {
         return c;
      }

      public efc.e a(efc.g $$0) {
         return $$0.i;
      }
   }

   static record aa(eff a, int c, boolean d) implements efc.f {
      static final azd<efc.aa> e = azd.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     eff.a.fieldOf("anchor").forGetter(efc.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(efc.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(efc.aa::d)
                  )
                  .apply($$0, efc.aa::new)
         )
      );

      @Override
      public azd<? extends efc.f> a() {
         return e;
      }

      public efc.e a(final efc.g $$0) {
         class a extends efc.k {
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

      public eff b() {
         return this.a;
      }
   }

   static enum b implements efc.o {
      a;

      static final azd<efc.b> c = azd.a(MapCodec.unit(a));

      @Override
      public azd<? extends efc.o> a() {
         return c;
      }

      public efc.u a(efc.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements efc.f {
      static final azd<efc.c> a = azd.a(alc.a(me.aM).listOf().fieldOf("biome_is").xmap(efc::a, $$0 -> $$0.c));
      private final List<alc<dis>> c;
      final Predicate<alc<dis>> d;

      c(List<alc<dis>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public azd<? extends efc.f> a() {
         return a;
      }

      public efc.e a(final efc.g $$0) {
         class a extends efc.k {
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
            return $$0 instanceof efc.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dym a, efc.r c) implements efc.o {
      static final azd<efc.d> d = azd.a(dym.a.xmap(efc.d::new, efc.d::b).fieldOf("result_state"));

      d(dym $$0) {
         this($$0, new efc.r($$0));
      }

      @Override
      public azd<? extends efc.o> a() {
         return d;
      }

      public efc.u a(efc.g $$0) {
         return this.c;
      }

      public dym b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<efc.g, efc.e> {
      Codec<efc.f> b = md.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends efc.f> a(kf<MapCodec<? extends efc.f>> $$0) {
         efc.a($$0, "biome", efc.c.a);
         efc.a($$0, "noise_threshold", efc.l.e);
         efc.a($$0, "vertical_gradient", efc.y.e);
         efc.a($$0, "y_above", efc.aa.e);
         efc.a($$0, "water", efc.z.e);
         efc.a($$0, "temperature", efc.v.c);
         efc.a($$0, "steep", efc.s.c);
         efc.a($$0, "not", efc.n.c);
         efc.a($$0, "hole", efc.h.c);
         efc.a($$0, "above_preliminary_surface", efc.a.c);
         return efc.a($$0, "stone_depth", efc.t.f);
      }

      azd<? extends efc.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final efd e;
      final efc.e f = new efc.g.d(this);
      final efc.e g = new efc.g.c(this);
      final efc.e h = new efc.g.b(this);
      final efc.e i = new efc.g.a();
      final eez j;
      final eaj k;
      private final eep l;
      private final Function<jj, js<dis>> m;
      final efi n;
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
      final jj.a z = new jj.a();
      Supplier<js<dis>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(efd $$0, eez $$1, eaj $$2, eep $$3, Function<jj, js<dis>> $$4, kf<dis> $$5, efi $$6) {
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
            long $$2 = dgw.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = azk.a(
               azk.a(
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

      final class a implements efc.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends efc.j {
         b(efc.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends efc.j {
         c(efc.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            eaj $$4 = this.c.k;
            int $$5 = $$4.a(eel.a.a, $$0, $$2);
            int $$6 = $$4.a(eel.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(eel.a.a, $$7, $$1);
               int $$10 = $$4.a(eel.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends efc.k {
         d(efc.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements efc.f {
      a;

      static final azd<efc.h> c = azd.a(MapCodec.unit(a));

      @Override
      public azd<? extends efc.f> a() {
         return c;
      }

      public efc.e a(efc.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements efc.e {
      protected final efc.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(efc.g $$0) {
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

   abstract static class j extends efc.i {
      protected j(efc.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends efc.i {
      protected k(efc.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(alc<etw.a> a, double c, double d) implements efc.f {
      static final azd<efc.l> e = azd.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alc.a(me.aW).fieldOf("noise").forGetter(efc.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(efc.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(efc.l::d)
                  )
                  .apply($$0, efc.l::new)
         )
      );

      @Override
      public azd<? extends efc.f> a() {
         return e;
      }

      public efc.e a(final efc.g $$0) {
         final etw $$1 = $$0.j.a(this.a);

         class a extends efc.j {
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

      public alc<etw.a> b() {
         return this.a;
      }
   }

   static record m(efc.e a) implements efc.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(efc.f a) implements efc.f {
      static final azd<efc.n> c = azd.a(efc.f.b.xmap(efc.n::new, efc.n::b).fieldOf("invert"));

      @Override
      public azd<? extends efc.f> a() {
         return c;
      }

      public efc.e a(efc.g $$0) {
         return new efc.m(this.a.apply($$0));
      }

      public efc.f b() {
         return this.a;
      }
   }

   public interface o extends Function<efc.g, efc.u> {
      Codec<efc.o> b = md.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends efc.o> a(kf<MapCodec<? extends efc.o>> $$0) {
         efc.a($$0, "bandlands", efc.b.c);
         efc.a($$0, "block", efc.d.d);
         efc.a($$0, "sequence", efc.q.c);
         return efc.a($$0, "condition", efc.x.d);
      }

      azd<? extends efc.o> a();
   }

   static record p(List<efc.u> a) implements efc.u {
      @Nullable
      @Override
      public dym tryApply(int $$0, int $$1, int $$2) {
         for (efc.u $$3 : this.a) {
            dym $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<efc.o> a) implements efc.o {
      static final azd<efc.q> c = azd.a(efc.o.b.listOf().xmap(efc.q::new, efc.q::b).fieldOf("sequence"));

      @Override
      public azd<? extends efc.o> a() {
         return c;
      }

      public efc.u a(efc.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<efc.u> $$1 = ImmutableList.builder();

            for (efc.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new efc.p($$1.build());
         }
      }

      public List<efc.o> b() {
         return this.a;
      }
   }

   static record r(dym a) implements efc.u {
      @Override
      public dym tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements efc.f {
      a;

      static final azd<efc.s> c = azd.a(MapCodec.unit(a));

      @Override
      public azd<? extends efc.f> a() {
         return c;
      }

      public efc.e a(efc.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, eoa e) implements efc.f {
      static final azd<efc.t> f = azd.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(efc.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(efc.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(efc.t::d),
                     eoa.c.fieldOf("surface_type").forGetter(efc.t::e)
                  )
                  .apply($$0, efc.t::new)
         )
      );

      @Override
      public azd<? extends efc.f> a() {
         return f;
      }

      public efc.e a(final efc.g $$0) {
         final boolean $$1 = this.e == eoa.a;

         class a extends efc.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)azk.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dym tryApply(int var1, int var2, int var3);
   }

   static enum v implements efc.f {
      a;

      static final azd<efc.v> c = azd.a(MapCodec.unit(a));

      @Override
      public azd<? extends efc.f> a() {
         return c;
      }

      public efc.e a(efc.g $$0) {
         return $$0.f;
      }
   }

   static record w(efc.e a, efc.u b) implements efc.u {
      @Nullable
      @Override
      public dym tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(efc.f a, efc.o c) implements efc.o {
      static final azd<efc.x> d = azd.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(efc.f.b.fieldOf("if_true").forGetter(efc.x::b), efc.o.b.fieldOf("then_run").forGetter(efc.x::c)).apply($$0, efc.x::new)
         )
      );

      @Override
      public azd<? extends efc.o> a() {
         return d;
      }

      public efc.u a(efc.g $$0) {
         return new efc.w(this.a.apply($$0), this.c.apply($$0));
      }

      public efc.f b() {
         return this.a;
      }
   }

   static record y(ald a, eff c, eff d) implements efc.f {
      static final azd<efc.y> e = azd.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ald.a.fieldOf("random_name").forGetter(efc.y::b),
                     eff.a.fieldOf("true_at_and_below").forGetter(efc.y::c),
                     eff.a.fieldOf("false_at_and_above").forGetter(efc.y::d)
                  )
                  .apply($$0, efc.y::new)
         )
      );

      @Override
      public azd<? extends efc.f> a() {
         return e;
      }

      public efc.e a(final efc.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final eey $$3 = $$0.j.a(this.b());

         class a extends efc.k {
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
                  double $$1 = azk.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  azs $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public ald b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements efc.f {
      static final azd<efc.z> e = azd.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(efc.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(efc.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(efc.z::d)
                  )
                  .apply($$0, efc.z::new)
         )
      );

      @Override
      public azd<? extends efc.f> a() {
         return e;
      }

      public efc.e a(final efc.g $$0) {
         class a extends efc.k {
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
