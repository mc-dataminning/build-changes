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

public class ehe {
   public static final ehe.f a = a(0, false, eqc.b);
   public static final ehe.f b = a(0, true, eqc.b);
   public static final ehe.f c = a(0, true, 6, eqc.b);
   public static final ehe.f d = a(0, true, 30, eqc.b);
   public static final ehe.f e = a(0, false, eqc.a);
   public static final ehe.f f = a(0, true, eqc.a);

   public static ehe.f a(int $$0, boolean $$1, eqc $$2) {
      return new ehe.t($$0, $$1, 0, $$2);
   }

   public static ehe.f a(int $$0, boolean $$1, int $$2, eqc $$3) {
      return new ehe.t($$0, $$1, $$2, $$3);
   }

   public static ehe.f a(ehe.f $$0) {
      return new ehe.n($$0);
   }

   public static ehe.f a(ehh $$0, int $$1) {
      return new ehe.aa($$0, $$1, false);
   }

   public static ehe.f b(ehh $$0, int $$1) {
      return new ehe.aa($$0, $$1, true);
   }

   public static ehe.f a(int $$0, int $$1) {
      return new ehe.z($$0, $$1, false);
   }

   public static ehe.f b(int $$0, int $$1) {
      return new ehe.z($$0, $$1, true);
   }

   @SafeVarargs
   public static ehe.f a(alf<dkk>... $$0) {
      return a(List.of($$0));
   }

   private static ehe.c a(List<alf<dkk>> $$0) {
      return new ehe.c($$0);
   }

   public static ehe.f a(alf<evy.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static ehe.f a(alf<evy.a> $$0, double $$1, double $$2) {
      return new ehe.l($$0, $$1, $$2);
   }

   public static ehe.f a(String $$0, ehh $$1, ehh $$2) {
      return new ehe.y(alg.a($$0), $$1, $$2);
   }

   public static ehe.f a() {
      return ehe.s.a;
   }

   public static ehe.f b() {
      return ehe.h.a;
   }

   public static ehe.f c() {
      return ehe.a.a;
   }

   public static ehe.f d() {
      return ehe.v.a;
   }

   public static ehe.o a(ehe.f $$0, ehe.o $$1) {
      return new ehe.x($$0, $$1);
   }

   public static ehe.o a(ehe.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new ehe.q(Arrays.asList($$0));
      }
   }

   public static ehe.o a(eao $$0) {
      return new ehe.d($$0);
   }

   public static ehe.o e() {
      return ehe.b.a;
   }

   static <A> MapCodec<? extends A> a(js<MapCodec<? extends A>> $$0, String $$1, azf<? extends A> $$2) {
      return js.a($$0, $$1, $$2.a());
   }

   static enum a implements ehe.f {
      a;

      static final azf<ehe.a> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends ehe.f> a() {
         return c;
      }

      public ehe.e a(ehe.g $$0) {
         return $$0.i;
      }
   }

   static record aa(ehh a, int c, boolean d) implements ehe.f {
      static final azf<ehe.aa> e = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ehh.a.fieldOf("anchor").forGetter(ehe.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ehe.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(ehe.aa::d)
                  )
                  .apply($$0, ehe.aa::new)
         )
      );

      @Override
      public azf<? extends ehe.f> a() {
         return e;
      }

      public ehe.e a(final ehe.g $$0) {
         class a extends ehe.k {
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

      public ehh b() {
         return this.a;
      }
   }

   static enum b implements ehe.o {
      a;

      static final azf<ehe.b> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends ehe.o> a() {
         return c;
      }

      public ehe.u a(ehe.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements ehe.f {
      static final azf<ehe.c> a = azf.a(alf.a(mh.aG).listOf().fieldOf("biome_is").xmap(ehe::a, $$0 -> $$0.c));
      private final List<alf<dkk>> c;
      final Predicate<alf<dkk>> d;

      c(List<alf<dkk>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public azf<? extends ehe.f> a() {
         return a;
      }

      public ehe.e a(final ehe.g $$0) {
         class a extends ehe.k {
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
            return $$0 instanceof ehe.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(eao a, ehe.r c) implements ehe.o {
      static final azf<ehe.d> d = azf.a(eao.a.xmap(ehe.d::new, ehe.d::b).fieldOf("result_state"));

      d(eao $$0) {
         this($$0, new ehe.r($$0));
      }

      @Override
      public azf<? extends ehe.o> a() {
         return d;
      }

      public ehe.u a(ehe.g $$0) {
         return this.c;
      }

      public eao b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<ehe.g, ehe.e> {
      Codec<ehe.f> b = mg.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ehe.f> a(js<MapCodec<? extends ehe.f>> $$0) {
         ehe.a($$0, "biome", ehe.c.a);
         ehe.a($$0, "noise_threshold", ehe.l.e);
         ehe.a($$0, "vertical_gradient", ehe.y.e);
         ehe.a($$0, "y_above", ehe.aa.e);
         ehe.a($$0, "water", ehe.z.e);
         ehe.a($$0, "temperature", ehe.v.c);
         ehe.a($$0, "steep", ehe.s.c);
         ehe.a($$0, "not", ehe.n.c);
         ehe.a($$0, "hole", ehe.h.c);
         ehe.a($$0, "above_preliminary_surface", ehe.a.c);
         return ehe.a($$0, "stone_depth", ehe.t.f);
      }

      azf<? extends ehe.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final ehf e;
      final ehe.e f = new ehe.g.d(this);
      final ehe.e g = new ehe.g.c(this);
      final ehe.e h = new ehe.g.b(this);
      final ehe.e i = new ehe.g.a();
      final ehb j;
      final ecl k;
      private final egr l;
      private final Function<iv, jf<dkk>> m;
      final ehk n;
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
      Supplier<jf<dkk>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(ehf $$0, ehb $$1, ecl $$2, egr $$3, Function<iv, jf<dkk>> $$4, js<dkk> $$5, ehk $$6) {
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
            long $$2 = dio.c($$0, $$1);
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

      final class a implements ehe.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends ehe.j {
         b(ehe.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends ehe.j {
         c(ehe.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            ecl $$4 = this.c.k;
            int $$5 = $$4.a(egn.a.a, $$0, $$2);
            int $$6 = $$4.a(egn.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(egn.a.a, $$7, $$1);
               int $$10 = $$4.a(egn.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends ehe.k {
         d(ehe.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements ehe.f {
      a;

      static final azf<ehe.h> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends ehe.f> a() {
         return c;
      }

      public ehe.e a(ehe.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements ehe.e {
      protected final ehe.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(ehe.g $$0) {
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

   abstract static class j extends ehe.i {
      protected j(ehe.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends ehe.i {
      protected k(ehe.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(alf<evy.a> a, double c, double d) implements ehe.f {
      static final azf<ehe.l> e = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alf.a(mh.aY).fieldOf("noise").forGetter(ehe.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(ehe.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(ehe.l::d)
                  )
                  .apply($$0, ehe.l::new)
         )
      );

      @Override
      public azf<? extends ehe.f> a() {
         return e;
      }

      public ehe.e a(final ehe.g $$0) {
         final evy $$1 = $$0.j.a(this.a);

         class a extends ehe.j {
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

      public alf<evy.a> b() {
         return this.a;
      }
   }

   static record m(ehe.e a) implements ehe.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(ehe.f a) implements ehe.f {
      static final azf<ehe.n> c = azf.a(ehe.f.b.xmap(ehe.n::new, ehe.n::b).fieldOf("invert"));

      @Override
      public azf<? extends ehe.f> a() {
         return c;
      }

      public ehe.e a(ehe.g $$0) {
         return new ehe.m(this.a.apply($$0));
      }

      public ehe.f b() {
         return this.a;
      }
   }

   public interface o extends Function<ehe.g, ehe.u> {
      Codec<ehe.o> b = mg.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ehe.o> a(js<MapCodec<? extends ehe.o>> $$0) {
         ehe.a($$0, "bandlands", ehe.b.c);
         ehe.a($$0, "block", ehe.d.d);
         ehe.a($$0, "sequence", ehe.q.c);
         return ehe.a($$0, "condition", ehe.x.d);
      }

      azf<? extends ehe.o> a();
   }

   static record p(List<ehe.u> a) implements ehe.u {
      @Nullable
      @Override
      public eao tryApply(int $$0, int $$1, int $$2) {
         for (ehe.u $$3 : this.a) {
            eao $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<ehe.o> a) implements ehe.o {
      static final azf<ehe.q> c = azf.a(ehe.o.b.listOf().xmap(ehe.q::new, ehe.q::b).fieldOf("sequence"));

      @Override
      public azf<? extends ehe.o> a() {
         return c;
      }

      public ehe.u a(ehe.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<ehe.u> $$1 = ImmutableList.builder();

            for (ehe.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new ehe.p($$1.build());
         }
      }

      public List<ehe.o> b() {
         return this.a;
      }
   }

   static record r(eao a) implements ehe.u {
      @Override
      public eao tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements ehe.f {
      a;

      static final azf<ehe.s> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends ehe.f> a() {
         return c;
      }

      public ehe.e a(ehe.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, eqc e) implements ehe.f {
      static final azf<ehe.t> f = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(ehe.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(ehe.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(ehe.t::d),
                     eqc.c.fieldOf("surface_type").forGetter(ehe.t::e)
                  )
                  .apply($$0, ehe.t::new)
         )
      );

      @Override
      public azf<? extends ehe.f> a() {
         return f;
      }

      public ehe.e a(final ehe.g $$0) {
         final boolean $$1 = this.e == eqc.a;

         class a extends ehe.k {
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
      eao tryApply(int var1, int var2, int var3);
   }

   static enum v implements ehe.f {
      a;

      static final azf<ehe.v> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends ehe.f> a() {
         return c;
      }

      public ehe.e a(ehe.g $$0) {
         return $$0.f;
      }
   }

   static record w(ehe.e a, ehe.u b) implements ehe.u {
      @Nullable
      @Override
      public eao tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(ehe.f a, ehe.o c) implements ehe.o {
      static final azf<ehe.x> d = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(ehe.f.b.fieldOf("if_true").forGetter(ehe.x::b), ehe.o.b.fieldOf("then_run").forGetter(ehe.x::c)).apply($$0, ehe.x::new)
         )
      );

      @Override
      public azf<? extends ehe.o> a() {
         return d;
      }

      public ehe.u a(ehe.g $$0) {
         return new ehe.w(this.a.apply($$0), this.c.apply($$0));
      }

      public ehe.f b() {
         return this.a;
      }
   }

   static record y(alg a, ehh c, ehh d) implements ehe.f {
      static final azf<ehe.y> e = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alg.a.fieldOf("random_name").forGetter(ehe.y::b),
                     ehh.a.fieldOf("true_at_and_below").forGetter(ehe.y::c),
                     ehh.a.fieldOf("false_at_and_above").forGetter(ehe.y::d)
                  )
                  .apply($$0, ehe.y::new)
         )
      );

      @Override
      public azf<? extends ehe.f> a() {
         return e;
      }

      public ehe.e a(final ehe.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final eha $$3 = $$0.j.a(this.b());

         class a extends ehe.k {
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
                  azv $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public alg b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements ehe.f {
      static final azf<ehe.z> e = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(ehe.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ehe.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(ehe.z::d)
                  )
                  .apply($$0, ehe.z::new)
         )
      );

      @Override
      public azf<? extends ehe.f> a() {
         return e;
      }

      public ehe.e a(final ehe.g $$0) {
         class a extends ehe.k {
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
