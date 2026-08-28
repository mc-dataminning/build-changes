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

public class edk {
   public static final edk.f a = a(0, false, emh.b);
   public static final edk.f b = a(0, true, emh.b);
   public static final edk.f c = a(0, true, 6, emh.b);
   public static final edk.f d = a(0, true, 30, emh.b);
   public static final edk.f e = a(0, false, emh.a);
   public static final edk.f f = a(0, true, emh.a);

   public static edk.f a(int $$0, boolean $$1, emh $$2) {
      return new edk.t($$0, $$1, 0, $$2);
   }

   public static edk.f a(int $$0, boolean $$1, int $$2, emh $$3) {
      return new edk.t($$0, $$1, $$2, $$3);
   }

   public static edk.f a(edk.f $$0) {
      return new edk.n($$0);
   }

   public static edk.f a(edn $$0, int $$1) {
      return new edk.aa($$0, $$1, false);
   }

   public static edk.f b(edn $$0, int $$1) {
      return new edk.aa($$0, $$1, true);
   }

   public static edk.f a(int $$0, int $$1) {
      return new edk.z($$0, $$1, false);
   }

   public static edk.f b(int $$0, int $$1) {
      return new edk.z($$0, $$1, true);
   }

   @SafeVarargs
   public static edk.f a(aku<dhl>... $$0) {
      return a(List.of($$0));
   }

   private static edk.c a(List<aku<dhl>> $$0) {
      return new edk.c($$0);
   }

   public static edk.f a(aku<esd.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static edk.f a(aku<esd.a> $$0, double $$1, double $$2) {
      return new edk.l($$0, $$1, $$2);
   }

   public static edk.f a(String $$0, edn $$1, edn $$2) {
      return new edk.y(akv.a($$0), $$1, $$2);
   }

   public static edk.f a() {
      return edk.s.a;
   }

   public static edk.f b() {
      return edk.h.a;
   }

   public static edk.f c() {
      return edk.a.a;
   }

   public static edk.f d() {
      return edk.v.a;
   }

   public static edk.o a(edk.f $$0, edk.o $$1) {
      return new edk.x($$0, $$1);
   }

   public static edk.o a(edk.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new edk.q(Arrays.asList($$0));
      }
   }

   public static edk.o a(dwy $$0) {
      return new edk.d($$0);
   }

   public static edk.o e() {
      return edk.b.a;
   }

   static <A> MapCodec<? extends A> a(ke<MapCodec<? extends A>> $$0, String $$1, ays<? extends A> $$2) {
      return ke.a($$0, $$1, $$2.a());
   }

   static enum a implements edk.f {
      a;

      static final ays<edk.a> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends edk.f> a() {
         return c;
      }

      public edk.e a(edk.g $$0) {
         return $$0.i;
      }
   }

   static record aa(edn a, int c, boolean d) implements edk.f {
      static final ays<edk.aa> e = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     edn.a.fieldOf("anchor").forGetter(edk.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(edk.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(edk.aa::d)
                  )
                  .apply($$0, edk.aa::new)
         )
      );

      @Override
      public ays<? extends edk.f> a() {
         return e;
      }

      public edk.e a(final edk.g $$0) {
         class a extends edk.k {
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

      public edn b() {
         return this.a;
      }
   }

   static enum b implements edk.o {
      a;

      static final ays<edk.b> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends edk.o> a() {
         return c;
      }

      public edk.u a(edk.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements edk.f {
      static final ays<edk.c> a = ays.a(aku.a(mc.aI).listOf().fieldOf("biome_is").xmap(edk::a, $$0 -> $$0.c));
      private final List<aku<dhl>> c;
      final Predicate<aku<dhl>> d;

      c(List<aku<dhl>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public ays<? extends edk.f> a() {
         return a;
      }

      public edk.e a(final edk.g $$0) {
         class a extends edk.k {
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
            return $$0 instanceof edk.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dwy a, edk.r c) implements edk.o {
      static final ays<edk.d> d = ays.a(dwy.a.xmap(edk.d::new, edk.d::b).fieldOf("result_state"));

      d(dwy $$0) {
         this($$0, new edk.r($$0));
      }

      @Override
      public ays<? extends edk.o> a() {
         return d;
      }

      public edk.u a(edk.g $$0) {
         return this.c;
      }

      public dwy b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<edk.g, edk.e> {
      Codec<edk.f> b = mb.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends edk.f> a(ke<MapCodec<? extends edk.f>> $$0) {
         edk.a($$0, "biome", edk.c.a);
         edk.a($$0, "noise_threshold", edk.l.e);
         edk.a($$0, "vertical_gradient", edk.y.e);
         edk.a($$0, "y_above", edk.aa.e);
         edk.a($$0, "water", edk.z.e);
         edk.a($$0, "temperature", edk.v.c);
         edk.a($$0, "steep", edk.s.c);
         edk.a($$0, "not", edk.n.c);
         edk.a($$0, "hole", edk.h.c);
         edk.a($$0, "above_preliminary_surface", edk.a.c);
         return edk.a($$0, "stone_depth", edk.t.f);
      }

      ays<? extends edk.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final edl e;
      final edk.e f = new edk.g.d(this);
      final edk.e g = new edk.g.c(this);
      final edk.e h = new edk.g.b(this);
      final edk.e i = new edk.g.a();
      final edh j;
      final dyt k;
      private final ecx l;
      private final Function<ji, jr<dhl>> m;
      final edq n;
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
      final ji.a z = new ji.a();
      Supplier<jr<dhl>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(edl $$0, edh $$1, dyt $$2, ecx $$3, Function<ji, jr<dhl>> $$4, ke<dhl> $$5, edq $$6) {
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
            long $$2 = dfp.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = ayz.a(
               ayz.a(
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

      final class a implements edk.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends edk.j {
         b(edk.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends edk.j {
         c(edk.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dyt $$4 = this.c.k;
            int $$5 = $$4.a(ect.a.a, $$0, $$2);
            int $$6 = $$4.a(ect.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(ect.a.a, $$7, $$1);
               int $$10 = $$4.a(ect.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends edk.k {
         d(edk.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements edk.f {
      a;

      static final ays<edk.h> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends edk.f> a() {
         return c;
      }

      public edk.e a(edk.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements edk.e {
      protected final edk.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(edk.g $$0) {
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

   abstract static class j extends edk.i {
      protected j(edk.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends edk.i {
      protected k(edk.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(aku<esd.a> a, double c, double d) implements edk.f {
      static final ays<edk.l> e = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aku.a(mc.aS).fieldOf("noise").forGetter(edk.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(edk.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(edk.l::d)
                  )
                  .apply($$0, edk.l::new)
         )
      );

      @Override
      public ays<? extends edk.f> a() {
         return e;
      }

      public edk.e a(final edk.g $$0) {
         final esd $$1 = $$0.j.a(this.a);

         class a extends edk.j {
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

      public aku<esd.a> b() {
         return this.a;
      }
   }

   static record m(edk.e a) implements edk.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(edk.f a) implements edk.f {
      static final ays<edk.n> c = ays.a(edk.f.b.xmap(edk.n::new, edk.n::b).fieldOf("invert"));

      @Override
      public ays<? extends edk.f> a() {
         return c;
      }

      public edk.e a(edk.g $$0) {
         return new edk.m(this.a.apply($$0));
      }

      public edk.f b() {
         return this.a;
      }
   }

   public interface o extends Function<edk.g, edk.u> {
      Codec<edk.o> b = mb.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends edk.o> a(ke<MapCodec<? extends edk.o>> $$0) {
         edk.a($$0, "bandlands", edk.b.c);
         edk.a($$0, "block", edk.d.d);
         edk.a($$0, "sequence", edk.q.c);
         return edk.a($$0, "condition", edk.x.d);
      }

      ays<? extends edk.o> a();
   }

   static record p(List<edk.u> a) implements edk.u {
      @Nullable
      @Override
      public dwy tryApply(int $$0, int $$1, int $$2) {
         for (edk.u $$3 : this.a) {
            dwy $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<edk.o> a) implements edk.o {
      static final ays<edk.q> c = ays.a(edk.o.b.listOf().xmap(edk.q::new, edk.q::b).fieldOf("sequence"));

      @Override
      public ays<? extends edk.o> a() {
         return c;
      }

      public edk.u a(edk.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<edk.u> $$1 = ImmutableList.builder();

            for (edk.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new edk.p($$1.build());
         }
      }

      public List<edk.o> b() {
         return this.a;
      }
   }

   static record r(dwy a) implements edk.u {
      @Override
      public dwy tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements edk.f {
      a;

      static final ays<edk.s> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends edk.f> a() {
         return c;
      }

      public edk.e a(edk.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, emh e) implements edk.f {
      static final ays<edk.t> f = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(edk.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(edk.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(edk.t::d),
                     emh.c.fieldOf("surface_type").forGetter(edk.t::e)
                  )
                  .apply($$0, edk.t::new)
         )
      );

      @Override
      public ays<? extends edk.f> a() {
         return f;
      }

      public edk.e a(final edk.g $$0) {
         final boolean $$1 = this.e == emh.a;

         class a extends edk.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)ayz.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dwy tryApply(int var1, int var2, int var3);
   }

   static enum v implements edk.f {
      a;

      static final ays<edk.v> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends edk.f> a() {
         return c;
      }

      public edk.e a(edk.g $$0) {
         return $$0.f;
      }
   }

   static record w(edk.e a, edk.u b) implements edk.u {
      @Nullable
      @Override
      public dwy tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(edk.f a, edk.o c) implements edk.o {
      static final ays<edk.x> d = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(edk.f.b.fieldOf("if_true").forGetter(edk.x::b), edk.o.b.fieldOf("then_run").forGetter(edk.x::c)).apply($$0, edk.x::new)
         )
      );

      @Override
      public ays<? extends edk.o> a() {
         return d;
      }

      public edk.u a(edk.g $$0) {
         return new edk.w(this.a.apply($$0), this.c.apply($$0));
      }

      public edk.f b() {
         return this.a;
      }
   }

   static record y(akv a, edn c, edn d) implements edk.f {
      static final ays<edk.y> e = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     akv.a.fieldOf("random_name").forGetter(edk.y::b),
                     edn.a.fieldOf("true_at_and_below").forGetter(edk.y::c),
                     edn.a.fieldOf("false_at_and_above").forGetter(edk.y::d)
                  )
                  .apply($$0, edk.y::new)
         )
      );

      @Override
      public ays<? extends edk.f> a() {
         return e;
      }

      public edk.e a(final edk.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final edg $$3 = $$0.j.a(this.b());

         class a extends edk.k {
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
                  double $$1 = ayz.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  azh $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public akv b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements edk.f {
      static final ays<edk.z> e = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(edk.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(edk.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(edk.z::d)
                  )
                  .apply($$0, edk.z::new)
         )
      );

      @Override
      public ays<? extends edk.f> a() {
         return e;
      }

      public edk.e a(final edk.g $$0) {
         class a extends edk.k {
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
