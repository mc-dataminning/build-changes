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

public class ech {
   public static final ech.f a = a(0, false, elc.b);
   public static final ech.f b = a(0, true, elc.b);
   public static final ech.f c = a(0, true, 6, elc.b);
   public static final ech.f d = a(0, true, 30, elc.b);
   public static final ech.f e = a(0, false, elc.a);
   public static final ech.f f = a(0, true, elc.a);

   public static ech.f a(int $$0, boolean $$1, elc $$2) {
      return new ech.t($$0, $$1, 0, $$2);
   }

   public static ech.f a(int $$0, boolean $$1, int $$2, elc $$3) {
      return new ech.t($$0, $$1, $$2, $$3);
   }

   public static ech.f a(ech.f $$0) {
      return new ech.n($$0);
   }

   public static ech.f a(eck $$0, int $$1) {
      return new ech.aa($$0, $$1, false);
   }

   public static ech.f b(eck $$0, int $$1) {
      return new ech.aa($$0, $$1, true);
   }

   public static ech.f a(int $$0, int $$1) {
      return new ech.z($$0, $$1, false);
   }

   public static ech.f b(int $$0, int $$1) {
      return new ech.z($$0, $$1, true);
   }

   @SafeVarargs
   public static ech.f a(ali<dgo>... $$0) {
      return a(List.of($$0));
   }

   private static ech.c a(List<ali<dgo>> $$0) {
      return new ech.c($$0);
   }

   public static ech.f a(ali<eqy.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static ech.f a(ali<eqy.a> $$0, double $$1, double $$2) {
      return new ech.l($$0, $$1, $$2);
   }

   public static ech.f a(String $$0, eck $$1, eck $$2) {
      return new ech.y(alj.a($$0), $$1, $$2);
   }

   public static ech.f a() {
      return ech.s.a;
   }

   public static ech.f b() {
      return ech.h.a;
   }

   public static ech.f c() {
      return ech.a.a;
   }

   public static ech.f d() {
      return ech.v.a;
   }

   public static ech.o a(ech.f $$0, ech.o $$1) {
      return new ech.x($$0, $$1);
   }

   public static ech.o a(ech.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new ech.q(Arrays.asList($$0));
      }
   }

   public static ech.o a(dvv $$0) {
      return new ech.d($$0);
   }

   public static ech.o e() {
      return ech.b.a;
   }

   static <A> MapCodec<? extends A> a(kd<MapCodec<? extends A>> $$0, String $$1, azf<? extends A> $$2) {
      return kd.a($$0, $$1, $$2.a());
   }

   static enum a implements ech.f {
      a;

      static final azf<ech.a> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends ech.f> a() {
         return c;
      }

      public ech.e a(ech.g $$0) {
         return $$0.i;
      }
   }

   static record aa(eck a, int c, boolean d) implements ech.f {
      static final azf<ech.aa> e = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     eck.a.fieldOf("anchor").forGetter(ech.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ech.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(ech.aa::d)
                  )
                  .apply($$0, ech.aa::new)
         )
      );

      @Override
      public azf<? extends ech.f> a() {
         return e;
      }

      public ech.e a(final ech.g $$0) {
         class a extends ech.k {
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

      public eck b() {
         return this.a;
      }
   }

   static enum b implements ech.o {
      a;

      static final azf<ech.b> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends ech.o> a() {
         return c;
      }

      public ech.u a(ech.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements ech.f {
      static final azf<ech.c> a = azf.a(ali.a(ma.aG).listOf().fieldOf("biome_is").xmap(ech::a, $$0 -> $$0.c));
      private final List<ali<dgo>> c;
      final Predicate<ali<dgo>> d;

      c(List<ali<dgo>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public azf<? extends ech.f> a() {
         return a;
      }

      public ech.e a(final ech.g $$0) {
         class a extends ech.k {
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
            return $$0 instanceof ech.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dvv a, ech.r c) implements ech.o {
      static final azf<ech.d> d = azf.a(dvv.a.xmap(ech.d::new, ech.d::b).fieldOf("result_state"));

      d(dvv $$0) {
         this($$0, new ech.r($$0));
      }

      @Override
      public azf<? extends ech.o> a() {
         return d;
      }

      public ech.u a(ech.g $$0) {
         return this.c;
      }

      public dvv b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<ech.g, ech.e> {
      Codec<ech.f> b = lz.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ech.f> a(kd<MapCodec<? extends ech.f>> $$0) {
         ech.a($$0, "biome", ech.c.a);
         ech.a($$0, "noise_threshold", ech.l.e);
         ech.a($$0, "vertical_gradient", ech.y.e);
         ech.a($$0, "y_above", ech.aa.e);
         ech.a($$0, "water", ech.z.e);
         ech.a($$0, "temperature", ech.v.c);
         ech.a($$0, "steep", ech.s.c);
         ech.a($$0, "not", ech.n.c);
         ech.a($$0, "hole", ech.h.c);
         ech.a($$0, "above_preliminary_surface", ech.a.c);
         return ech.a($$0, "stone_depth", ech.t.f);
      }

      azf<? extends ech.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final eci e;
      final ech.e f = new ech.g.d(this);
      final ech.e g = new ech.g.c(this);
      final ech.e h = new ech.g.b(this);
      final ech.e i = new ech.g.a();
      final ece j;
      final dxq k;
      private final ebu l;
      private final Function<jh, jq<dgo>> m;
      final ecn n;
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
      Supplier<jq<dgo>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(eci $$0, ece $$1, dxq $$2, ebu $$3, Function<jh, jq<dgo>> $$4, kd<dgo> $$5, ecn $$6) {
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
            long $$2 = des.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = azm.a(
               azm.a(
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

      final class a implements ech.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends ech.j {
         b(ech.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends ech.j {
         c(ech.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dxq $$4 = this.c.k;
            int $$5 = $$4.a(ebq.a.a, $$0, $$2);
            int $$6 = $$4.a(ebq.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(ebq.a.a, $$7, $$1);
               int $$10 = $$4.a(ebq.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends ech.k {
         d(ech.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements ech.f {
      a;

      static final azf<ech.h> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends ech.f> a() {
         return c;
      }

      public ech.e a(ech.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements ech.e {
      protected final ech.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(ech.g $$0) {
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

   abstract static class j extends ech.i {
      protected j(ech.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends ech.i {
      protected k(ech.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(ali<eqy.a> a, double c, double d) implements ech.f {
      static final azf<ech.l> e = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ali.a(ma.aQ).fieldOf("noise").forGetter(ech.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(ech.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(ech.l::d)
                  )
                  .apply($$0, ech.l::new)
         )
      );

      @Override
      public azf<? extends ech.f> a() {
         return e;
      }

      public ech.e a(final ech.g $$0) {
         final eqy $$1 = $$0.j.a(this.a);

         class a extends ech.j {
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

      public ali<eqy.a> b() {
         return this.a;
      }
   }

   static record m(ech.e a) implements ech.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(ech.f a) implements ech.f {
      static final azf<ech.n> c = azf.a(ech.f.b.xmap(ech.n::new, ech.n::b).fieldOf("invert"));

      @Override
      public azf<? extends ech.f> a() {
         return c;
      }

      public ech.e a(ech.g $$0) {
         return new ech.m(this.a.apply($$0));
      }

      public ech.f b() {
         return this.a;
      }
   }

   public interface o extends Function<ech.g, ech.u> {
      Codec<ech.o> b = lz.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ech.o> a(kd<MapCodec<? extends ech.o>> $$0) {
         ech.a($$0, "bandlands", ech.b.c);
         ech.a($$0, "block", ech.d.d);
         ech.a($$0, "sequence", ech.q.c);
         return ech.a($$0, "condition", ech.x.d);
      }

      azf<? extends ech.o> a();
   }

   static record p(List<ech.u> a) implements ech.u {
      @Nullable
      @Override
      public dvv tryApply(int $$0, int $$1, int $$2) {
         for (ech.u $$3 : this.a) {
            dvv $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<ech.o> a) implements ech.o {
      static final azf<ech.q> c = azf.a(ech.o.b.listOf().xmap(ech.q::new, ech.q::b).fieldOf("sequence"));

      @Override
      public azf<? extends ech.o> a() {
         return c;
      }

      public ech.u a(ech.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<ech.u> $$1 = ImmutableList.builder();

            for (ech.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new ech.p($$1.build());
         }
      }

      public List<ech.o> b() {
         return this.a;
      }
   }

   static record r(dvv a) implements ech.u {
      @Override
      public dvv tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements ech.f {
      a;

      static final azf<ech.s> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends ech.f> a() {
         return c;
      }

      public ech.e a(ech.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, elc e) implements ech.f {
      static final azf<ech.t> f = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(ech.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(ech.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(ech.t::d),
                     elc.c.fieldOf("surface_type").forGetter(ech.t::e)
                  )
                  .apply($$0, ech.t::new)
         )
      );

      @Override
      public azf<? extends ech.f> a() {
         return f;
      }

      public ech.e a(final ech.g $$0) {
         final boolean $$1 = this.e == elc.a;

         class a extends ech.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)azm.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dvv tryApply(int var1, int var2, int var3);
   }

   static enum v implements ech.f {
      a;

      static final azf<ech.v> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends ech.f> a() {
         return c;
      }

      public ech.e a(ech.g $$0) {
         return $$0.f;
      }
   }

   static record w(ech.e a, ech.u b) implements ech.u {
      @Nullable
      @Override
      public dvv tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(ech.f a, ech.o c) implements ech.o {
      static final azf<ech.x> d = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(ech.f.b.fieldOf("if_true").forGetter(ech.x::b), ech.o.b.fieldOf("then_run").forGetter(ech.x::c)).apply($$0, ech.x::new)
         )
      );

      @Override
      public azf<? extends ech.o> a() {
         return d;
      }

      public ech.u a(ech.g $$0) {
         return new ech.w(this.a.apply($$0), this.c.apply($$0));
      }

      public ech.f b() {
         return this.a;
      }
   }

   static record y(alj a, eck c, eck d) implements ech.f {
      static final azf<ech.y> e = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alj.a.fieldOf("random_name").forGetter(ech.y::b),
                     eck.a.fieldOf("true_at_and_below").forGetter(ech.y::c),
                     eck.a.fieldOf("false_at_and_above").forGetter(ech.y::d)
                  )
                  .apply($$0, ech.y::new)
         )
      );

      @Override
      public azf<? extends ech.f> a() {
         return e;
      }

      public ech.e a(final ech.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final ecd $$3 = $$0.j.a(this.b());

         class a extends ech.k {
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
                  double $$1 = azm.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  azu $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public alj b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements ech.f {
      static final azf<ech.z> e = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(ech.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ech.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(ech.z::d)
                  )
                  .apply($$0, ech.z::new)
         )
      );

      @Override
      public azf<? extends ech.f> a() {
         return e;
      }

      public ech.e a(final ech.g $$0) {
         class a extends ech.k {
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
