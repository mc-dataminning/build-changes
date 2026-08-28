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

public class edz {
   public static final edz.f a = a(0, false, emw.b);
   public static final edz.f b = a(0, true, emw.b);
   public static final edz.f c = a(0, true, 6, emw.b);
   public static final edz.f d = a(0, true, 30, emw.b);
   public static final edz.f e = a(0, false, emw.a);
   public static final edz.f f = a(0, true, emw.a);

   public static edz.f a(int $$0, boolean $$1, emw $$2) {
      return new edz.t($$0, $$1, 0, $$2);
   }

   public static edz.f a(int $$0, boolean $$1, int $$2, emw $$3) {
      return new edz.t($$0, $$1, $$2, $$3);
   }

   public static edz.f a(edz.f $$0) {
      return new edz.n($$0);
   }

   public static edz.f a(eec $$0, int $$1) {
      return new edz.aa($$0, $$1, false);
   }

   public static edz.f b(eec $$0, int $$1) {
      return new edz.aa($$0, $$1, true);
   }

   public static edz.f a(int $$0, int $$1) {
      return new edz.z($$0, $$1, false);
   }

   public static edz.f b(int $$0, int $$1) {
      return new edz.z($$0, $$1, true);
   }

   @SafeVarargs
   public static edz.f a(aly<dic>... $$0) {
      return a(List.of($$0));
   }

   private static edz.c a(List<aly<dic>> $$0) {
      return new edz.c($$0);
   }

   public static edz.f a(aly<ess.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static edz.f a(aly<ess.a> $$0, double $$1, double $$2) {
      return new edz.l($$0, $$1, $$2);
   }

   public static edz.f a(String $$0, eec $$1, eec $$2) {
      return new edz.y(alz.a($$0), $$1, $$2);
   }

   public static edz.f a() {
      return edz.s.a;
   }

   public static edz.f b() {
      return edz.h.a;
   }

   public static edz.f c() {
      return edz.a.a;
   }

   public static edz.f d() {
      return edz.v.a;
   }

   public static edz.o a(edz.f $$0, edz.o $$1) {
      return new edz.x($$0, $$1);
   }

   public static edz.o a(edz.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new edz.q(Arrays.asList($$0));
      }
   }

   public static edz.o a(dxn $$0) {
      return new edz.d($$0);
   }

   public static edz.o e() {
      return edz.b.a;
   }

   static <A> MapCodec<? extends A> a(kd<MapCodec<? extends A>> $$0, String $$1, azx<? extends A> $$2) {
      return kd.a($$0, $$1, $$2.a());
   }

   static enum a implements edz.f {
      a;

      static final azx<edz.a> c = azx.a(MapCodec.unit(a));

      @Override
      public azx<? extends edz.f> a() {
         return c;
      }

      public edz.e a(edz.g $$0) {
         return $$0.i;
      }
   }

   static record aa(eec a, int c, boolean d) implements edz.f {
      static final azx<edz.aa> e = azx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     eec.a.fieldOf("anchor").forGetter(edz.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(edz.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(edz.aa::d)
                  )
                  .apply($$0, edz.aa::new)
         )
      );

      @Override
      public azx<? extends edz.f> a() {
         return e;
      }

      public edz.e a(final edz.g $$0) {
         class a extends edz.k {
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

      public eec b() {
         return this.a;
      }
   }

   static enum b implements edz.o {
      a;

      static final azx<edz.b> c = azx.a(MapCodec.unit(a));

      @Override
      public azx<? extends edz.o> a() {
         return c;
      }

      public edz.u a(edz.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements edz.f {
      static final azx<edz.c> a = azx.a(aly.a(mb.aH).listOf().fieldOf("biome_is").xmap(edz::a, $$0 -> $$0.c));
      private final List<aly<dic>> c;
      final Predicate<aly<dic>> d;

      c(List<aly<dic>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public azx<? extends edz.f> a() {
         return a;
      }

      public edz.e a(final edz.g $$0) {
         class a extends edz.k {
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
            return $$0 instanceof edz.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dxn a, edz.r c) implements edz.o {
      static final azx<edz.d> d = azx.a(dxn.a.xmap(edz.d::new, edz.d::b).fieldOf("result_state"));

      d(dxn $$0) {
         this($$0, new edz.r($$0));
      }

      @Override
      public azx<? extends edz.o> a() {
         return d;
      }

      public edz.u a(edz.g $$0) {
         return this.c;
      }

      public dxn b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<edz.g, edz.e> {
      Codec<edz.f> b = ma.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends edz.f> a(kd<MapCodec<? extends edz.f>> $$0) {
         edz.a($$0, "biome", edz.c.a);
         edz.a($$0, "noise_threshold", edz.l.e);
         edz.a($$0, "vertical_gradient", edz.y.e);
         edz.a($$0, "y_above", edz.aa.e);
         edz.a($$0, "water", edz.z.e);
         edz.a($$0, "temperature", edz.v.c);
         edz.a($$0, "steep", edz.s.c);
         edz.a($$0, "not", edz.n.c);
         edz.a($$0, "hole", edz.h.c);
         edz.a($$0, "above_preliminary_surface", edz.a.c);
         return edz.a($$0, "stone_depth", edz.t.f);
      }

      azx<? extends edz.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final eea e;
      final edz.e f = new edz.g.d(this);
      final edz.e g = new edz.g.c(this);
      final edz.e h = new edz.g.b(this);
      final edz.e i = new edz.g.a();
      final edw j;
      final dzi k;
      private final edm l;
      private final Function<jh, jq<dic>> m;
      final eef n;
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
      Supplier<jq<dic>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(eea $$0, edw $$1, dzi $$2, edm $$3, Function<jh, jq<dic>> $$4, kd<dic> $$5, eef $$6) {
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
            long $$2 = dgg.c($$0, $$1);
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

      final class a implements edz.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends edz.j {
         b(edz.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends edz.j {
         c(edz.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dzi $$4 = this.c.k;
            int $$5 = $$4.a(edi.a.a, $$0, $$2);
            int $$6 = $$4.a(edi.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(edi.a.a, $$7, $$1);
               int $$10 = $$4.a(edi.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends edz.k {
         d(edz.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements edz.f {
      a;

      static final azx<edz.h> c = azx.a(MapCodec.unit(a));

      @Override
      public azx<? extends edz.f> a() {
         return c;
      }

      public edz.e a(edz.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements edz.e {
      protected final edz.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(edz.g $$0) {
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

   abstract static class j extends edz.i {
      protected j(edz.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends edz.i {
      protected k(edz.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(aly<ess.a> a, double c, double d) implements edz.f {
      static final azx<edz.l> e = azx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aly.a(mb.aR).fieldOf("noise").forGetter(edz.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(edz.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(edz.l::d)
                  )
                  .apply($$0, edz.l::new)
         )
      );

      @Override
      public azx<? extends edz.f> a() {
         return e;
      }

      public edz.e a(final edz.g $$0) {
         final ess $$1 = $$0.j.a(this.a);

         class a extends edz.j {
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

      public aly<ess.a> b() {
         return this.a;
      }
   }

   static record m(edz.e a) implements edz.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(edz.f a) implements edz.f {
      static final azx<edz.n> c = azx.a(edz.f.b.xmap(edz.n::new, edz.n::b).fieldOf("invert"));

      @Override
      public azx<? extends edz.f> a() {
         return c;
      }

      public edz.e a(edz.g $$0) {
         return new edz.m(this.a.apply($$0));
      }

      public edz.f b() {
         return this.a;
      }
   }

   public interface o extends Function<edz.g, edz.u> {
      Codec<edz.o> b = ma.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends edz.o> a(kd<MapCodec<? extends edz.o>> $$0) {
         edz.a($$0, "bandlands", edz.b.c);
         edz.a($$0, "block", edz.d.d);
         edz.a($$0, "sequence", edz.q.c);
         return edz.a($$0, "condition", edz.x.d);
      }

      azx<? extends edz.o> a();
   }

   static record p(List<edz.u> a) implements edz.u {
      @Nullable
      @Override
      public dxn tryApply(int $$0, int $$1, int $$2) {
         for (edz.u $$3 : this.a) {
            dxn $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<edz.o> a) implements edz.o {
      static final azx<edz.q> c = azx.a(edz.o.b.listOf().xmap(edz.q::new, edz.q::b).fieldOf("sequence"));

      @Override
      public azx<? extends edz.o> a() {
         return c;
      }

      public edz.u a(edz.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<edz.u> $$1 = ImmutableList.builder();

            for (edz.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new edz.p($$1.build());
         }
      }

      public List<edz.o> b() {
         return this.a;
      }
   }

   static record r(dxn a) implements edz.u {
      @Override
      public dxn tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements edz.f {
      a;

      static final azx<edz.s> c = azx.a(MapCodec.unit(a));

      @Override
      public azx<? extends edz.f> a() {
         return c;
      }

      public edz.e a(edz.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, emw e) implements edz.f {
      static final azx<edz.t> f = azx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(edz.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(edz.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(edz.t::d),
                     emw.c.fieldOf("surface_type").forGetter(edz.t::e)
                  )
                  .apply($$0, edz.t::new)
         )
      );

      @Override
      public azx<? extends edz.f> a() {
         return f;
      }

      public edz.e a(final edz.g $$0) {
         final boolean $$1 = this.e == emw.a;

         class a extends edz.k {
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
      dxn tryApply(int var1, int var2, int var3);
   }

   static enum v implements edz.f {
      a;

      static final azx<edz.v> c = azx.a(MapCodec.unit(a));

      @Override
      public azx<? extends edz.f> a() {
         return c;
      }

      public edz.e a(edz.g $$0) {
         return $$0.f;
      }
   }

   static record w(edz.e a, edz.u b) implements edz.u {
      @Nullable
      @Override
      public dxn tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(edz.f a, edz.o c) implements edz.o {
      static final azx<edz.x> d = azx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(edz.f.b.fieldOf("if_true").forGetter(edz.x::b), edz.o.b.fieldOf("then_run").forGetter(edz.x::c)).apply($$0, edz.x::new)
         )
      );

      @Override
      public azx<? extends edz.o> a() {
         return d;
      }

      public edz.u a(edz.g $$0) {
         return new edz.w(this.a.apply($$0), this.c.apply($$0));
      }

      public edz.f b() {
         return this.a;
      }
   }

   static record y(alz a, eec c, eec d) implements edz.f {
      static final azx<edz.y> e = azx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alz.a.fieldOf("random_name").forGetter(edz.y::b),
                     eec.a.fieldOf("true_at_and_below").forGetter(edz.y::c),
                     eec.a.fieldOf("false_at_and_above").forGetter(edz.y::d)
                  )
                  .apply($$0, edz.y::new)
         )
      );

      @Override
      public azx<? extends edz.f> a() {
         return e;
      }

      public edz.e a(final edz.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final edv $$3 = $$0.j.a(this.b());

         class a extends edz.k {
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

   static record z(int a, int c, boolean d) implements edz.f {
      static final azx<edz.z> e = azx.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(edz.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(edz.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(edz.z::d)
                  )
                  .apply($$0, edz.z::new)
         )
      );

      @Override
      public azx<? extends edz.f> a() {
         return e;
      }

      public edz.e a(final edz.g $$0) {
         class a extends edz.k {
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
