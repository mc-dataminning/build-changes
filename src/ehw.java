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

public class ehw {
   public static final ehw.f a = a(0, false, eqx.b);
   public static final ehw.f b = a(0, true, eqx.b);
   public static final ehw.f c = a(0, true, 6, eqx.b);
   public static final ehw.f d = a(0, true, 30, eqx.b);
   public static final ehw.f e = a(0, false, eqx.a);
   public static final ehw.f f = a(0, true, eqx.a);

   public static ehw.f a(int $$0, boolean $$1, eqx $$2) {
      return new ehw.t($$0, $$1, 0, $$2);
   }

   public static ehw.f a(int $$0, boolean $$1, int $$2, eqx $$3) {
      return new ehw.t($$0, $$1, $$2, $$3);
   }

   public static ehw.f a(ehw.f $$0) {
      return new ehw.n($$0);
   }

   public static ehw.f a(ehz $$0, int $$1) {
      return new ehw.aa($$0, $$1, false);
   }

   public static ehw.f b(ehz $$0, int $$1) {
      return new ehw.aa($$0, $$1, true);
   }

   public static ehw.f a(int $$0, int $$1) {
      return new ehw.z($$0, $$1, false);
   }

   public static ehw.f b(int $$0, int $$1) {
      return new ehw.z($$0, $$1, true);
   }

   @SafeVarargs
   public static ehw.f a(alj<dlc>... $$0) {
      return a(List.of($$0));
   }

   private static ehw.c a(List<alj<dlc>> $$0) {
      return new ehw.c($$0);
   }

   public static ehw.f a(alj<ewt.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static ehw.f a(alj<ewt.a> $$0, double $$1, double $$2) {
      return new ehw.l($$0, $$1, $$2);
   }

   public static ehw.f a(String $$0, ehz $$1, ehz $$2) {
      return new ehw.y(alk.a($$0), $$1, $$2);
   }

   public static ehw.f a() {
      return ehw.s.a;
   }

   public static ehw.f b() {
      return ehw.h.a;
   }

   public static ehw.f c() {
      return ehw.a.a;
   }

   public static ehw.f d() {
      return ehw.v.a;
   }

   public static ehw.o a(ehw.f $$0, ehw.o $$1) {
      return new ehw.x($$0, $$1);
   }

   public static ehw.o a(ehw.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new ehw.q(Arrays.asList($$0));
      }
   }

   public static ehw.o a(ebg $$0) {
      return new ehw.d($$0);
   }

   public static ehw.o e() {
      return ehw.b.a;
   }

   static <A> MapCodec<? extends A> a(jt<MapCodec<? extends A>> $$0, String $$1, azj<? extends A> $$2) {
      return jt.a($$0, $$1, $$2.a());
   }

   static enum a implements ehw.f {
      a;

      static final azj<ehw.a> c = azj.a(MapCodec.unit(a));

      @Override
      public azj<? extends ehw.f> a() {
         return c;
      }

      public ehw.e a(ehw.g $$0) {
         return $$0.i;
      }
   }

   static record aa(ehz a, int c, boolean d) implements ehw.f {
      static final azj<ehw.aa> e = azj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ehz.a.fieldOf("anchor").forGetter(ehw.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ehw.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(ehw.aa::d)
                  )
                  .apply($$0, ehw.aa::new)
         )
      );

      @Override
      public azj<? extends ehw.f> a() {
         return e;
      }

      public ehw.e a(final ehw.g $$0) {
         class a extends ehw.k {
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

      public ehz b() {
         return this.a;
      }
   }

   static enum b implements ehw.o {
      a;

      static final azj<ehw.b> c = azj.a(MapCodec.unit(a));

      @Override
      public azj<? extends ehw.o> a() {
         return c;
      }

      public ehw.u a(ehw.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements ehw.f {
      static final azj<ehw.c> a = azj.a(alj.a(mi.aG).listOf().fieldOf("biome_is").xmap(ehw::a, $$0 -> $$0.c));
      private final List<alj<dlc>> c;
      final Predicate<alj<dlc>> d;

      c(List<alj<dlc>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public azj<? extends ehw.f> a() {
         return a;
      }

      public ehw.e a(final ehw.g $$0) {
         class a extends ehw.k {
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
            return $$0 instanceof ehw.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(ebg a, ehw.r c) implements ehw.o {
      static final azj<ehw.d> d = azj.a(ebg.a.xmap(ehw.d::new, ehw.d::b).fieldOf("result_state"));

      d(ebg $$0) {
         this($$0, new ehw.r($$0));
      }

      @Override
      public azj<? extends ehw.o> a() {
         return d;
      }

      public ehw.u a(ehw.g $$0) {
         return this.c;
      }

      public ebg b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<ehw.g, ehw.e> {
      Codec<ehw.f> b = mh.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ehw.f> a(jt<MapCodec<? extends ehw.f>> $$0) {
         ehw.a($$0, "biome", ehw.c.a);
         ehw.a($$0, "noise_threshold", ehw.l.e);
         ehw.a($$0, "vertical_gradient", ehw.y.e);
         ehw.a($$0, "y_above", ehw.aa.e);
         ehw.a($$0, "water", ehw.z.e);
         ehw.a($$0, "temperature", ehw.v.c);
         ehw.a($$0, "steep", ehw.s.c);
         ehw.a($$0, "not", ehw.n.c);
         ehw.a($$0, "hole", ehw.h.c);
         ehw.a($$0, "above_preliminary_surface", ehw.a.c);
         return ehw.a($$0, "stone_depth", ehw.t.f);
      }

      azj<? extends ehw.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final ehx e;
      final ehw.e f = new ehw.g.d(this);
      final ehw.e g = new ehw.g.c(this);
      final ehw.e h = new ehw.g.b(this);
      final ehw.e i = new ehw.g.a();
      final eht j;
      final edd k;
      private final ehj l;
      private final Function<iw, jg<dlc>> m;
      final eic n;
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
      Supplier<jg<dlc>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(ehx $$0, eht $$1, edd $$2, ehj $$3, Function<iw, jg<dlc>> $$4, jt<dlc> $$5, eic $$6) {
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
            long $$2 = dje.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = azq.a(
               azq.a(
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

      final class a implements ehw.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends ehw.j {
         b(ehw.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends ehw.j {
         c(ehw.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            edd $$4 = this.c.k;
            int $$5 = $$4.a(ehf.a.a, $$0, $$2);
            int $$6 = $$4.a(ehf.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(ehf.a.a, $$7, $$1);
               int $$10 = $$4.a(ehf.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends ehw.k {
         d(ehw.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements ehw.f {
      a;

      static final azj<ehw.h> c = azj.a(MapCodec.unit(a));

      @Override
      public azj<? extends ehw.f> a() {
         return c;
      }

      public ehw.e a(ehw.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements ehw.e {
      protected final ehw.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(ehw.g $$0) {
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

   abstract static class j extends ehw.i {
      protected j(ehw.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends ehw.i {
      protected k(ehw.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(alj<ewt.a> a, double c, double d) implements ehw.f {
      static final azj<ehw.l> e = azj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alj.a(mi.aY).fieldOf("noise").forGetter(ehw.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(ehw.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(ehw.l::d)
                  )
                  .apply($$0, ehw.l::new)
         )
      );

      @Override
      public azj<? extends ehw.f> a() {
         return e;
      }

      public ehw.e a(final ehw.g $$0) {
         final ewt $$1 = $$0.j.a(this.a);

         class a extends ehw.j {
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

      public alj<ewt.a> b() {
         return this.a;
      }
   }

   static record m(ehw.e a) implements ehw.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(ehw.f a) implements ehw.f {
      static final azj<ehw.n> c = azj.a(ehw.f.b.xmap(ehw.n::new, ehw.n::b).fieldOf("invert"));

      @Override
      public azj<? extends ehw.f> a() {
         return c;
      }

      public ehw.e a(ehw.g $$0) {
         return new ehw.m(this.a.apply($$0));
      }

      public ehw.f b() {
         return this.a;
      }
   }

   public interface o extends Function<ehw.g, ehw.u> {
      Codec<ehw.o> b = mh.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ehw.o> a(jt<MapCodec<? extends ehw.o>> $$0) {
         ehw.a($$0, "bandlands", ehw.b.c);
         ehw.a($$0, "block", ehw.d.d);
         ehw.a($$0, "sequence", ehw.q.c);
         return ehw.a($$0, "condition", ehw.x.d);
      }

      azj<? extends ehw.o> a();
   }

   static record p(List<ehw.u> a) implements ehw.u {
      @Nullable
      @Override
      public ebg tryApply(int $$0, int $$1, int $$2) {
         for (ehw.u $$3 : this.a) {
            ebg $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<ehw.o> a) implements ehw.o {
      static final azj<ehw.q> c = azj.a(ehw.o.b.listOf().xmap(ehw.q::new, ehw.q::b).fieldOf("sequence"));

      @Override
      public azj<? extends ehw.o> a() {
         return c;
      }

      public ehw.u a(ehw.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<ehw.u> $$1 = ImmutableList.builder();

            for (ehw.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new ehw.p($$1.build());
         }
      }

      public List<ehw.o> b() {
         return this.a;
      }
   }

   static record r(ebg a) implements ehw.u {
      @Override
      public ebg tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements ehw.f {
      a;

      static final azj<ehw.s> c = azj.a(MapCodec.unit(a));

      @Override
      public azj<? extends ehw.f> a() {
         return c;
      }

      public ehw.e a(ehw.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, eqx e) implements ehw.f {
      static final azj<ehw.t> f = azj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(ehw.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(ehw.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(ehw.t::d),
                     eqx.c.fieldOf("surface_type").forGetter(ehw.t::e)
                  )
                  .apply($$0, ehw.t::new)
         )
      );

      @Override
      public azj<? extends ehw.f> a() {
         return f;
      }

      public ehw.e a(final ehw.g $$0) {
         final boolean $$1 = this.e == eqx.a;

         class a extends ehw.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)azq.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      ebg tryApply(int var1, int var2, int var3);
   }

   static enum v implements ehw.f {
      a;

      static final azj<ehw.v> c = azj.a(MapCodec.unit(a));

      @Override
      public azj<? extends ehw.f> a() {
         return c;
      }

      public ehw.e a(ehw.g $$0) {
         return $$0.f;
      }
   }

   static record w(ehw.e a, ehw.u b) implements ehw.u {
      @Nullable
      @Override
      public ebg tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(ehw.f a, ehw.o c) implements ehw.o {
      static final azj<ehw.x> d = azj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(ehw.f.b.fieldOf("if_true").forGetter(ehw.x::b), ehw.o.b.fieldOf("then_run").forGetter(ehw.x::c)).apply($$0, ehw.x::new)
         )
      );

      @Override
      public azj<? extends ehw.o> a() {
         return d;
      }

      public ehw.u a(ehw.g $$0) {
         return new ehw.w(this.a.apply($$0), this.c.apply($$0));
      }

      public ehw.f b() {
         return this.a;
      }
   }

   static record y(alk a, ehz c, ehz d) implements ehw.f {
      static final azj<ehw.y> e = azj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alk.a.fieldOf("random_name").forGetter(ehw.y::b),
                     ehz.a.fieldOf("true_at_and_below").forGetter(ehw.y::c),
                     ehz.a.fieldOf("false_at_and_above").forGetter(ehw.y::d)
                  )
                  .apply($$0, ehw.y::new)
         )
      );

      @Override
      public azj<? extends ehw.f> a() {
         return e;
      }

      public ehw.e a(final ehw.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final ehs $$3 = $$0.j.a(this.b());

         class a extends ehw.k {
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
                  double $$1 = azq.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  azz $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public alk b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements ehw.f {
      static final azj<ehw.z> e = azj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(ehw.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ehw.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(ehw.z::d)
                  )
                  .apply($$0, ehw.z::new)
         )
      );

      @Override
      public azj<? extends ehw.f> a() {
         return e;
      }

      public ehw.e a(final ehw.g $$0) {
         class a extends ehw.k {
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
