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

public class eca {
   public static final eca.f a = a(0, false, ekv.b);
   public static final eca.f b = a(0, true, ekv.b);
   public static final eca.f c = a(0, true, 6, ekv.b);
   public static final eca.f d = a(0, true, 30, ekv.b);
   public static final eca.f e = a(0, false, ekv.a);
   public static final eca.f f = a(0, true, ekv.a);

   public static eca.f a(int $$0, boolean $$1, ekv $$2) {
      return new eca.t($$0, $$1, 0, $$2);
   }

   public static eca.f a(int $$0, boolean $$1, int $$2, ekv $$3) {
      return new eca.t($$0, $$1, $$2, $$3);
   }

   public static eca.f a(eca.f $$0) {
      return new eca.n($$0);
   }

   public static eca.f a(ecd $$0, int $$1) {
      return new eca.aa($$0, $$1, false);
   }

   public static eca.f b(ecd $$0, int $$1) {
      return new eca.aa($$0, $$1, true);
   }

   public static eca.f a(int $$0, int $$1) {
      return new eca.z($$0, $$1, false);
   }

   public static eca.f b(int $$0, int $$1) {
      return new eca.z($$0, $$1, true);
   }

   @SafeVarargs
   public static eca.f a(alk<dgh>... $$0) {
      return a(List.of($$0));
   }

   private static eca.c a(List<alk<dgh>> $$0) {
      return new eca.c($$0);
   }

   public static eca.f a(alk<eqr.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static eca.f a(alk<eqr.a> $$0, double $$1, double $$2) {
      return new eca.l($$0, $$1, $$2);
   }

   public static eca.f a(String $$0, ecd $$1, ecd $$2) {
      return new eca.y(all.a($$0), $$1, $$2);
   }

   public static eca.f a() {
      return eca.s.a;
   }

   public static eca.f b() {
      return eca.h.a;
   }

   public static eca.f c() {
      return eca.a.a;
   }

   public static eca.f d() {
      return eca.v.a;
   }

   public static eca.o a(eca.f $$0, eca.o $$1) {
      return new eca.x($$0, $$1);
   }

   public static eca.o a(eca.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new eca.q(Arrays.asList($$0));
      }
   }

   public static eca.o a(dvo $$0) {
      return new eca.d($$0);
   }

   public static eca.o e() {
      return eca.b.a;
   }

   static <A> MapCodec<? extends A> a(kd<MapCodec<? extends A>> $$0, String $$1, azg<? extends A> $$2) {
      return kd.a($$0, $$1, $$2.a());
   }

   static enum a implements eca.f {
      a;

      static final azg<eca.a> c = azg.a(MapCodec.unit(a));

      @Override
      public azg<? extends eca.f> a() {
         return c;
      }

      public eca.e a(eca.g $$0) {
         return $$0.i;
      }
   }

   static record aa(ecd a, int c, boolean d) implements eca.f {
      static final azg<eca.aa> e = azg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ecd.a.fieldOf("anchor").forGetter(eca.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(eca.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(eca.aa::d)
                  )
                  .apply($$0, eca.aa::new)
         )
      );

      @Override
      public azg<? extends eca.f> a() {
         return e;
      }

      public eca.e a(final eca.g $$0) {
         class a extends eca.k {
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

      public ecd b() {
         return this.a;
      }
   }

   static enum b implements eca.o {
      a;

      static final azg<eca.b> c = azg.a(MapCodec.unit(a));

      @Override
      public azg<? extends eca.o> a() {
         return c;
      }

      public eca.u a(eca.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements eca.f {
      static final azg<eca.c> a = azg.a(alk.a(ma.aG).listOf().fieldOf("biome_is").xmap(eca::a, $$0 -> $$0.c));
      private final List<alk<dgh>> c;
      final Predicate<alk<dgh>> d;

      c(List<alk<dgh>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public azg<? extends eca.f> a() {
         return a;
      }

      public eca.e a(final eca.g $$0) {
         class a extends eca.k {
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
            return $$0 instanceof eca.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dvo a, eca.r c) implements eca.o {
      static final azg<eca.d> d = azg.a(dvo.a.xmap(eca.d::new, eca.d::b).fieldOf("result_state"));

      d(dvo $$0) {
         this($$0, new eca.r($$0));
      }

      @Override
      public azg<? extends eca.o> a() {
         return d;
      }

      public eca.u a(eca.g $$0) {
         return this.c;
      }

      public dvo b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<eca.g, eca.e> {
      Codec<eca.f> b = lz.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends eca.f> a(kd<MapCodec<? extends eca.f>> $$0) {
         eca.a($$0, "biome", eca.c.a);
         eca.a($$0, "noise_threshold", eca.l.e);
         eca.a($$0, "vertical_gradient", eca.y.e);
         eca.a($$0, "y_above", eca.aa.e);
         eca.a($$0, "water", eca.z.e);
         eca.a($$0, "temperature", eca.v.c);
         eca.a($$0, "steep", eca.s.c);
         eca.a($$0, "not", eca.n.c);
         eca.a($$0, "hole", eca.h.c);
         eca.a($$0, "above_preliminary_surface", eca.a.c);
         return eca.a($$0, "stone_depth", eca.t.f);
      }

      azg<? extends eca.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final ecb e;
      final eca.e f = new eca.g.d(this);
      final eca.e g = new eca.g.c(this);
      final eca.e h = new eca.g.b(this);
      final eca.e i = new eca.g.a();
      final ebx j;
      final dxj k;
      private final ebn l;
      private final Function<jh, jq<dgh>> m;
      final ecg n;
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
      Supplier<jq<dgh>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(ecb $$0, ebx $$1, dxj $$2, ebn $$3, Function<jh, jq<dgh>> $$4, kd<dgh> $$5, ecg $$6) {
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
            long $$2 = del.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = azn.a(
               azn.a(
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

      final class a implements eca.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends eca.j {
         b(eca.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends eca.j {
         c(eca.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dxj $$4 = this.c.k;
            int $$5 = $$4.a(ebj.a.a, $$0, $$2);
            int $$6 = $$4.a(ebj.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(ebj.a.a, $$7, $$1);
               int $$10 = $$4.a(ebj.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends eca.k {
         d(eca.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements eca.f {
      a;

      static final azg<eca.h> c = azg.a(MapCodec.unit(a));

      @Override
      public azg<? extends eca.f> a() {
         return c;
      }

      public eca.e a(eca.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements eca.e {
      protected final eca.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(eca.g $$0) {
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

   abstract static class j extends eca.i {
      protected j(eca.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends eca.i {
      protected k(eca.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(alk<eqr.a> a, double c, double d) implements eca.f {
      static final azg<eca.l> e = azg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alk.a(ma.aQ).fieldOf("noise").forGetter(eca.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(eca.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(eca.l::d)
                  )
                  .apply($$0, eca.l::new)
         )
      );

      @Override
      public azg<? extends eca.f> a() {
         return e;
      }

      public eca.e a(final eca.g $$0) {
         final eqr $$1 = $$0.j.a(this.a);

         class a extends eca.j {
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

      public alk<eqr.a> b() {
         return this.a;
      }
   }

   static record m(eca.e a) implements eca.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(eca.f a) implements eca.f {
      static final azg<eca.n> c = azg.a(eca.f.b.xmap(eca.n::new, eca.n::b).fieldOf("invert"));

      @Override
      public azg<? extends eca.f> a() {
         return c;
      }

      public eca.e a(eca.g $$0) {
         return new eca.m(this.a.apply($$0));
      }

      public eca.f b() {
         return this.a;
      }
   }

   public interface o extends Function<eca.g, eca.u> {
      Codec<eca.o> b = lz.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends eca.o> a(kd<MapCodec<? extends eca.o>> $$0) {
         eca.a($$0, "bandlands", eca.b.c);
         eca.a($$0, "block", eca.d.d);
         eca.a($$0, "sequence", eca.q.c);
         return eca.a($$0, "condition", eca.x.d);
      }

      azg<? extends eca.o> a();
   }

   static record p(List<eca.u> a) implements eca.u {
      @Nullable
      @Override
      public dvo tryApply(int $$0, int $$1, int $$2) {
         for (eca.u $$3 : this.a) {
            dvo $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<eca.o> a) implements eca.o {
      static final azg<eca.q> c = azg.a(eca.o.b.listOf().xmap(eca.q::new, eca.q::b).fieldOf("sequence"));

      @Override
      public azg<? extends eca.o> a() {
         return c;
      }

      public eca.u a(eca.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<eca.u> $$1 = ImmutableList.builder();

            for (eca.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new eca.p($$1.build());
         }
      }

      public List<eca.o> b() {
         return this.a;
      }
   }

   static record r(dvo a) implements eca.u {
      @Override
      public dvo tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements eca.f {
      a;

      static final azg<eca.s> c = azg.a(MapCodec.unit(a));

      @Override
      public azg<? extends eca.f> a() {
         return c;
      }

      public eca.e a(eca.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, ekv e) implements eca.f {
      static final azg<eca.t> f = azg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(eca.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(eca.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(eca.t::d),
                     ekv.c.fieldOf("surface_type").forGetter(eca.t::e)
                  )
                  .apply($$0, eca.t::new)
         )
      );

      @Override
      public azg<? extends eca.f> a() {
         return f;
      }

      public eca.e a(final eca.g $$0) {
         final boolean $$1 = this.e == ekv.a;

         class a extends eca.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)azn.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dvo tryApply(int var1, int var2, int var3);
   }

   static enum v implements eca.f {
      a;

      static final azg<eca.v> c = azg.a(MapCodec.unit(a));

      @Override
      public azg<? extends eca.f> a() {
         return c;
      }

      public eca.e a(eca.g $$0) {
         return $$0.f;
      }
   }

   static record w(eca.e a, eca.u b) implements eca.u {
      @Nullable
      @Override
      public dvo tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(eca.f a, eca.o c) implements eca.o {
      static final azg<eca.x> d = azg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(eca.f.b.fieldOf("if_true").forGetter(eca.x::b), eca.o.b.fieldOf("then_run").forGetter(eca.x::c)).apply($$0, eca.x::new)
         )
      );

      @Override
      public azg<? extends eca.o> a() {
         return d;
      }

      public eca.u a(eca.g $$0) {
         return new eca.w(this.a.apply($$0), this.c.apply($$0));
      }

      public eca.f b() {
         return this.a;
      }
   }

   static record y(all a, ecd c, ecd d) implements eca.f {
      static final azg<eca.y> e = azg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     all.a.fieldOf("random_name").forGetter(eca.y::b),
                     ecd.a.fieldOf("true_at_and_below").forGetter(eca.y::c),
                     ecd.a.fieldOf("false_at_and_above").forGetter(eca.y::d)
                  )
                  .apply($$0, eca.y::new)
         )
      );

      @Override
      public azg<? extends eca.f> a() {
         return e;
      }

      public eca.e a(final eca.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final ebw $$3 = $$0.j.a(this.b());

         class a extends eca.k {
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
                  double $$1 = azn.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  azv $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public all b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements eca.f {
      static final azg<eca.z> e = azg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(eca.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(eca.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(eca.z::d)
                  )
                  .apply($$0, eca.z::new)
         )
      );

      @Override
      public azg<? extends eca.f> a() {
         return e;
      }

      public eca.e a(final eca.g $$0) {
         class a extends eca.k {
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
