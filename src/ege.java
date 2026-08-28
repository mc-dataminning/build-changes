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

public class ege {
   public static final ege.f a = a(0, false, epc.b);
   public static final ege.f b = a(0, true, epc.b);
   public static final ege.f c = a(0, true, 6, epc.b);
   public static final ege.f d = a(0, true, 30, epc.b);
   public static final ege.f e = a(0, false, epc.a);
   public static final ege.f f = a(0, true, epc.a);

   public static ege.f a(int $$0, boolean $$1, epc $$2) {
      return new ege.t($$0, $$1, 0, $$2);
   }

   public static ege.f a(int $$0, boolean $$1, int $$2, epc $$3) {
      return new ege.t($$0, $$1, $$2, $$3);
   }

   public static ege.f a(ege.f $$0) {
      return new ege.n($$0);
   }

   public static ege.f a(egh $$0, int $$1) {
      return new ege.aa($$0, $$1, false);
   }

   public static ege.f b(egh $$0, int $$1) {
      return new ege.aa($$0, $$1, true);
   }

   public static ege.f a(int $$0, int $$1) {
      return new ege.z($$0, $$1, false);
   }

   public static ege.f b(int $$0, int $$1) {
      return new ege.z($$0, $$1, true);
   }

   @SafeVarargs
   public static ege.f a(ald<djs>... $$0) {
      return a(List.of($$0));
   }

   private static ege.c a(List<ald<djs>> $$0) {
      return new ege.c($$0);
   }

   public static ege.f a(ald<euy.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static ege.f a(ald<euy.a> $$0, double $$1, double $$2) {
      return new ege.l($$0, $$1, $$2);
   }

   public static ege.f a(String $$0, egh $$1, egh $$2) {
      return new ege.y(ale.a($$0), $$1, $$2);
   }

   public static ege.f a() {
      return ege.s.a;
   }

   public static ege.f b() {
      return ege.h.a;
   }

   public static ege.f c() {
      return ege.a.a;
   }

   public static ege.f d() {
      return ege.v.a;
   }

   public static ege.o a(ege.f $$0, ege.o $$1) {
      return new ege.x($$0, $$1);
   }

   public static ege.o a(ege.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new ege.q(Arrays.asList($$0));
      }
   }

   public static ege.o a(dzo $$0) {
      return new ege.d($$0);
   }

   public static ege.o e() {
      return ege.b.a;
   }

   static <A> MapCodec<? extends A> a(jr<MapCodec<? extends A>> $$0, String $$1, azd<? extends A> $$2) {
      return jr.a($$0, $$1, $$2.a());
   }

   static enum a implements ege.f {
      a;

      static final azd<ege.a> c = azd.a(MapCodec.unit(a));

      @Override
      public azd<? extends ege.f> a() {
         return c;
      }

      public ege.e a(ege.g $$0) {
         return $$0.i;
      }
   }

   static record aa(egh a, int c, boolean d) implements ege.f {
      static final azd<ege.aa> e = azd.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     egh.a.fieldOf("anchor").forGetter(ege.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ege.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(ege.aa::d)
                  )
                  .apply($$0, ege.aa::new)
         )
      );

      @Override
      public azd<? extends ege.f> a() {
         return e;
      }

      public ege.e a(final ege.g $$0) {
         class a extends ege.k {
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

      public egh b() {
         return this.a;
      }
   }

   static enum b implements ege.o {
      a;

      static final azd<ege.b> c = azd.a(MapCodec.unit(a));

      @Override
      public azd<? extends ege.o> a() {
         return c;
      }

      public ege.u a(ege.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements ege.f {
      static final azd<ege.c> a = azd.a(ald.a(mg.aG).listOf().fieldOf("biome_is").xmap(ege::a, $$0 -> $$0.c));
      private final List<ald<djs>> c;
      final Predicate<ald<djs>> d;

      c(List<ald<djs>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public azd<? extends ege.f> a() {
         return a;
      }

      public ege.e a(final ege.g $$0) {
         class a extends ege.k {
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
            return $$0 instanceof ege.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dzo a, ege.r c) implements ege.o {
      static final azd<ege.d> d = azd.a(dzo.a.xmap(ege.d::new, ege.d::b).fieldOf("result_state"));

      d(dzo $$0) {
         this($$0, new ege.r($$0));
      }

      @Override
      public azd<? extends ege.o> a() {
         return d;
      }

      public ege.u a(ege.g $$0) {
         return this.c;
      }

      public dzo b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<ege.g, ege.e> {
      Codec<ege.f> b = mf.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ege.f> a(jr<MapCodec<? extends ege.f>> $$0) {
         ege.a($$0, "biome", ege.c.a);
         ege.a($$0, "noise_threshold", ege.l.e);
         ege.a($$0, "vertical_gradient", ege.y.e);
         ege.a($$0, "y_above", ege.aa.e);
         ege.a($$0, "water", ege.z.e);
         ege.a($$0, "temperature", ege.v.c);
         ege.a($$0, "steep", ege.s.c);
         ege.a($$0, "not", ege.n.c);
         ege.a($$0, "hole", ege.h.c);
         ege.a($$0, "above_preliminary_surface", ege.a.c);
         return ege.a($$0, "stone_depth", ege.t.f);
      }

      azd<? extends ege.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final egf e;
      final ege.e f = new ege.g.d(this);
      final ege.e g = new ege.g.c(this);
      final ege.e h = new ege.g.b(this);
      final ege.e i = new ege.g.a();
      final egb j;
      final ebl k;
      private final efr l;
      private final Function<iu, je<djs>> m;
      final egk n;
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
      final iu.a z = new iu.a();
      Supplier<je<djs>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(egf $$0, egb $$1, ebl $$2, efr $$3, Function<iu, je<djs>> $$4, jr<djs> $$5, egk $$6) {
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
            long $$2 = dhw.c($$0, $$1);
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

      final class a implements ege.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends ege.j {
         b(ege.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends ege.j {
         c(ege.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            ebl $$4 = this.c.k;
            int $$5 = $$4.a(efn.a.a, $$0, $$2);
            int $$6 = $$4.a(efn.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(efn.a.a, $$7, $$1);
               int $$10 = $$4.a(efn.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends ege.k {
         d(ege.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements ege.f {
      a;

      static final azd<ege.h> c = azd.a(MapCodec.unit(a));

      @Override
      public azd<? extends ege.f> a() {
         return c;
      }

      public ege.e a(ege.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements ege.e {
      protected final ege.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(ege.g $$0) {
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

   abstract static class j extends ege.i {
      protected j(ege.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends ege.i {
      protected k(ege.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(ald<euy.a> a, double c, double d) implements ege.f {
      static final azd<ege.l> e = azd.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ald.a(mg.aW).fieldOf("noise").forGetter(ege.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(ege.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(ege.l::d)
                  )
                  .apply($$0, ege.l::new)
         )
      );

      @Override
      public azd<? extends ege.f> a() {
         return e;
      }

      public ege.e a(final ege.g $$0) {
         final euy $$1 = $$0.j.a(this.a);

         class a extends ege.j {
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

      public ald<euy.a> b() {
         return this.a;
      }
   }

   static record m(ege.e a) implements ege.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(ege.f a) implements ege.f {
      static final azd<ege.n> c = azd.a(ege.f.b.xmap(ege.n::new, ege.n::b).fieldOf("invert"));

      @Override
      public azd<? extends ege.f> a() {
         return c;
      }

      public ege.e a(ege.g $$0) {
         return new ege.m(this.a.apply($$0));
      }

      public ege.f b() {
         return this.a;
      }
   }

   public interface o extends Function<ege.g, ege.u> {
      Codec<ege.o> b = mf.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ege.o> a(jr<MapCodec<? extends ege.o>> $$0) {
         ege.a($$0, "bandlands", ege.b.c);
         ege.a($$0, "block", ege.d.d);
         ege.a($$0, "sequence", ege.q.c);
         return ege.a($$0, "condition", ege.x.d);
      }

      azd<? extends ege.o> a();
   }

   static record p(List<ege.u> a) implements ege.u {
      @Nullable
      @Override
      public dzo tryApply(int $$0, int $$1, int $$2) {
         for (ege.u $$3 : this.a) {
            dzo $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<ege.o> a) implements ege.o {
      static final azd<ege.q> c = azd.a(ege.o.b.listOf().xmap(ege.q::new, ege.q::b).fieldOf("sequence"));

      @Override
      public azd<? extends ege.o> a() {
         return c;
      }

      public ege.u a(ege.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<ege.u> $$1 = ImmutableList.builder();

            for (ege.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new ege.p($$1.build());
         }
      }

      public List<ege.o> b() {
         return this.a;
      }
   }

   static record r(dzo a) implements ege.u {
      @Override
      public dzo tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements ege.f {
      a;

      static final azd<ege.s> c = azd.a(MapCodec.unit(a));

      @Override
      public azd<? extends ege.f> a() {
         return c;
      }

      public ege.e a(ege.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, epc e) implements ege.f {
      static final azd<ege.t> f = azd.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(ege.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(ege.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(ege.t::d),
                     epc.c.fieldOf("surface_type").forGetter(ege.t::e)
                  )
                  .apply($$0, ege.t::new)
         )
      );

      @Override
      public azd<? extends ege.f> a() {
         return f;
      }

      public ege.e a(final ege.g $$0) {
         final boolean $$1 = this.e == epc.a;

         class a extends ege.k {
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
      dzo tryApply(int var1, int var2, int var3);
   }

   static enum v implements ege.f {
      a;

      static final azd<ege.v> c = azd.a(MapCodec.unit(a));

      @Override
      public azd<? extends ege.f> a() {
         return c;
      }

      public ege.e a(ege.g $$0) {
         return $$0.f;
      }
   }

   static record w(ege.e a, ege.u b) implements ege.u {
      @Nullable
      @Override
      public dzo tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(ege.f a, ege.o c) implements ege.o {
      static final azd<ege.x> d = azd.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(ege.f.b.fieldOf("if_true").forGetter(ege.x::b), ege.o.b.fieldOf("then_run").forGetter(ege.x::c)).apply($$0, ege.x::new)
         )
      );

      @Override
      public azd<? extends ege.o> a() {
         return d;
      }

      public ege.u a(ege.g $$0) {
         return new ege.w(this.a.apply($$0), this.c.apply($$0));
      }

      public ege.f b() {
         return this.a;
      }
   }

   static record y(ale a, egh c, egh d) implements ege.f {
      static final azd<ege.y> e = azd.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ale.a.fieldOf("random_name").forGetter(ege.y::b),
                     egh.a.fieldOf("true_at_and_below").forGetter(ege.y::c),
                     egh.a.fieldOf("false_at_and_above").forGetter(ege.y::d)
                  )
                  .apply($$0, ege.y::new)
         )
      );

      @Override
      public azd<? extends ege.f> a() {
         return e;
      }

      public ege.e a(final ege.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final ega $$3 = $$0.j.a(this.b());

         class a extends ege.k {
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
                  azt $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public ale b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements ege.f {
      static final azd<ege.z> e = azd.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(ege.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ege.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(ege.z::d)
                  )
                  .apply($$0, ege.z::new)
         )
      );

      @Override
      public azd<? extends ege.f> a() {
         return e;
      }

      public ege.e a(final ege.g $$0) {
         class a extends ege.k {
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
