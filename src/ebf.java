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

public class ebf {
   public static final ebf.f a = a(0, false, eka.b);
   public static final ebf.f b = a(0, true, eka.b);
   public static final ebf.f c = a(0, true, 6, eka.b);
   public static final ebf.f d = a(0, true, 30, eka.b);
   public static final ebf.f e = a(0, false, eka.a);
   public static final ebf.f f = a(0, true, eka.a);

   public static ebf.f a(int $$0, boolean $$1, eka $$2) {
      return new ebf.t($$0, $$1, 0, $$2);
   }

   public static ebf.f a(int $$0, boolean $$1, int $$2, eka $$3) {
      return new ebf.t($$0, $$1, $$2, $$3);
   }

   public static ebf.f a(ebf.f $$0) {
      return new ebf.n($$0);
   }

   public static ebf.f a(ebi $$0, int $$1) {
      return new ebf.aa($$0, $$1, false);
   }

   public static ebf.f b(ebi $$0, int $$1) {
      return new ebf.aa($$0, $$1, true);
   }

   public static ebf.f a(int $$0, int $$1) {
      return new ebf.z($$0, $$1, false);
   }

   public static ebf.f b(int $$0, int $$1) {
      return new ebf.z($$0, $$1, true);
   }

   @SafeVarargs
   public static ebf.f a(ald<dfk>... $$0) {
      return a(List.of($$0));
   }

   private static ebf.c a(List<ald<dfk>> $$0) {
      return new ebf.c($$0);
   }

   public static ebf.f a(ald<epw.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static ebf.f a(ald<epw.a> $$0, double $$1, double $$2) {
      return new ebf.l($$0, $$1, $$2);
   }

   public static ebf.f a(String $$0, ebi $$1, ebi $$2) {
      return new ebf.y(ale.a($$0), $$1, $$2);
   }

   public static ebf.f a() {
      return ebf.s.a;
   }

   public static ebf.f b() {
      return ebf.h.a;
   }

   public static ebf.f c() {
      return ebf.a.a;
   }

   public static ebf.f d() {
      return ebf.v.a;
   }

   public static ebf.o a(ebf.f $$0, ebf.o $$1) {
      return new ebf.x($$0, $$1);
   }

   public static ebf.o a(ebf.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new ebf.q(Arrays.asList($$0));
      }
   }

   public static ebf.o a(dus $$0) {
      return new ebf.d($$0);
   }

   public static ebf.o e() {
      return ebf.b.a;
   }

   static <A> MapCodec<? extends A> a(kb<MapCodec<? extends A>> $$0, String $$1, ayy<? extends A> $$2) {
      return kb.a($$0, $$1, $$2.a());
   }

   static enum a implements ebf.f {
      a;

      static final ayy<ebf.a> c = ayy.a(MapCodec.unit(a));

      @Override
      public ayy<? extends ebf.f> a() {
         return c;
      }

      public ebf.e a(ebf.g $$0) {
         return $$0.i;
      }
   }

   static record aa(ebi a, int c, boolean d) implements ebf.f {
      static final ayy<ebf.aa> e = ayy.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ebi.a.fieldOf("anchor").forGetter(ebf.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ebf.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(ebf.aa::d)
                  )
                  .apply($$0, ebf.aa::new)
         )
      );

      @Override
      public ayy<? extends ebf.f> a() {
         return e;
      }

      public ebf.e a(final ebf.g $$0) {
         class a extends ebf.k {
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

      public ebi b() {
         return this.a;
      }
   }

   static enum b implements ebf.o {
      a;

      static final ayy<ebf.b> c = ayy.a(MapCodec.unit(a));

      @Override
      public ayy<? extends ebf.o> a() {
         return c;
      }

      public ebf.u a(ebf.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements ebf.f {
      static final ayy<ebf.c> a = ayy.a(ald.a(lw.aH).listOf().fieldOf("biome_is").xmap(ebf::a, $$0 -> $$0.c));
      private final List<ald<dfk>> c;
      final Predicate<ald<dfk>> d;

      c(List<ald<dfk>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public ayy<? extends ebf.f> a() {
         return a;
      }

      public ebf.e a(final ebf.g $$0) {
         class a extends ebf.k {
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
            return $$0 instanceof ebf.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dus a, ebf.r c) implements ebf.o {
      static final ayy<ebf.d> d = ayy.a(dus.a.xmap(ebf.d::new, ebf.d::b).fieldOf("result_state"));

      d(dus $$0) {
         this($$0, new ebf.r($$0));
      }

      @Override
      public ayy<? extends ebf.o> a() {
         return d;
      }

      public ebf.u a(ebf.g $$0) {
         return this.c;
      }

      public dus b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<ebf.g, ebf.e> {
      Codec<ebf.f> b = lv.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ebf.f> a(kb<MapCodec<? extends ebf.f>> $$0) {
         ebf.a($$0, "biome", ebf.c.a);
         ebf.a($$0, "noise_threshold", ebf.l.e);
         ebf.a($$0, "vertical_gradient", ebf.y.e);
         ebf.a($$0, "y_above", ebf.aa.e);
         ebf.a($$0, "water", ebf.z.e);
         ebf.a($$0, "temperature", ebf.v.c);
         ebf.a($$0, "steep", ebf.s.c);
         ebf.a($$0, "not", ebf.n.c);
         ebf.a($$0, "hole", ebf.h.c);
         ebf.a($$0, "above_preliminary_surface", ebf.a.c);
         return ebf.a($$0, "stone_depth", ebf.t.f);
      }

      ayy<? extends ebf.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final ebg e;
      final ebf.e f = new ebf.g.d(this);
      final ebf.e g = new ebf.g.c(this);
      final ebf.e h = new ebf.g.b(this);
      final ebf.e i = new ebf.g.a();
      final ebc j;
      final dwo k;
      private final eas l;
      private final Function<jf, jo<dfk>> m;
      final ebl n;
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
      final jf.a z = new jf.a();
      Supplier<jo<dfk>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(ebg $$0, ebc $$1, dwo $$2, eas $$3, Function<jf, jo<dfk>> $$4, kb<dfk> $$5, ebl $$6) {
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
            long $$2 = ddp.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = azf.a(
               azf.a(
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

      final class a implements ebf.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends ebf.j {
         b(ebf.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends ebf.j {
         c(ebf.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dwo $$4 = this.c.k;
            int $$5 = $$4.a(eao.a.a, $$0, $$2);
            int $$6 = $$4.a(eao.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(eao.a.a, $$7, $$1);
               int $$10 = $$4.a(eao.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends ebf.k {
         d(ebf.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements ebf.f {
      a;

      static final ayy<ebf.h> c = ayy.a(MapCodec.unit(a));

      @Override
      public ayy<? extends ebf.f> a() {
         return c;
      }

      public ebf.e a(ebf.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements ebf.e {
      protected final ebf.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(ebf.g $$0) {
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

   abstract static class j extends ebf.i {
      protected j(ebf.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends ebf.i {
      protected k(ebf.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(ald<epw.a> a, double c, double d) implements ebf.f {
      static final ayy<ebf.l> e = ayy.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ald.a(lw.aR).fieldOf("noise").forGetter(ebf.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(ebf.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(ebf.l::d)
                  )
                  .apply($$0, ebf.l::new)
         )
      );

      @Override
      public ayy<? extends ebf.f> a() {
         return e;
      }

      public ebf.e a(final ebf.g $$0) {
         final epw $$1 = $$0.j.a(this.a);

         class a extends ebf.j {
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

      public ald<epw.a> b() {
         return this.a;
      }
   }

   static record m(ebf.e a) implements ebf.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(ebf.f a) implements ebf.f {
      static final ayy<ebf.n> c = ayy.a(ebf.f.b.xmap(ebf.n::new, ebf.n::b).fieldOf("invert"));

      @Override
      public ayy<? extends ebf.f> a() {
         return c;
      }

      public ebf.e a(ebf.g $$0) {
         return new ebf.m(this.a.apply($$0));
      }

      public ebf.f b() {
         return this.a;
      }
   }

   public interface o extends Function<ebf.g, ebf.u> {
      Codec<ebf.o> b = lv.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ebf.o> a(kb<MapCodec<? extends ebf.o>> $$0) {
         ebf.a($$0, "bandlands", ebf.b.c);
         ebf.a($$0, "block", ebf.d.d);
         ebf.a($$0, "sequence", ebf.q.c);
         return ebf.a($$0, "condition", ebf.x.d);
      }

      ayy<? extends ebf.o> a();
   }

   static record p(List<ebf.u> a) implements ebf.u {
      @Nullable
      @Override
      public dus tryApply(int $$0, int $$1, int $$2) {
         for (ebf.u $$3 : this.a) {
            dus $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<ebf.o> a) implements ebf.o {
      static final ayy<ebf.q> c = ayy.a(ebf.o.b.listOf().xmap(ebf.q::new, ebf.q::b).fieldOf("sequence"));

      @Override
      public ayy<? extends ebf.o> a() {
         return c;
      }

      public ebf.u a(ebf.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<ebf.u> $$1 = ImmutableList.builder();

            for (ebf.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new ebf.p($$1.build());
         }
      }

      public List<ebf.o> b() {
         return this.a;
      }
   }

   static record r(dus a) implements ebf.u {
      @Override
      public dus tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements ebf.f {
      a;

      static final ayy<ebf.s> c = ayy.a(MapCodec.unit(a));

      @Override
      public ayy<? extends ebf.f> a() {
         return c;
      }

      public ebf.e a(ebf.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, eka e) implements ebf.f {
      static final ayy<ebf.t> f = ayy.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(ebf.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(ebf.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(ebf.t::d),
                     eka.c.fieldOf("surface_type").forGetter(ebf.t::e)
                  )
                  .apply($$0, ebf.t::new)
         )
      );

      @Override
      public ayy<? extends ebf.f> a() {
         return f;
      }

      public ebf.e a(final ebf.g $$0) {
         final boolean $$1 = this.e == eka.a;

         class a extends ebf.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)azf.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dus tryApply(int var1, int var2, int var3);
   }

   static enum v implements ebf.f {
      a;

      static final ayy<ebf.v> c = ayy.a(MapCodec.unit(a));

      @Override
      public ayy<? extends ebf.f> a() {
         return c;
      }

      public ebf.e a(ebf.g $$0) {
         return $$0.f;
      }
   }

   static record w(ebf.e a, ebf.u b) implements ebf.u {
      @Nullable
      @Override
      public dus tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(ebf.f a, ebf.o c) implements ebf.o {
      static final ayy<ebf.x> d = ayy.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(ebf.f.b.fieldOf("if_true").forGetter(ebf.x::b), ebf.o.b.fieldOf("then_run").forGetter(ebf.x::c)).apply($$0, ebf.x::new)
         )
      );

      @Override
      public ayy<? extends ebf.o> a() {
         return d;
      }

      public ebf.u a(ebf.g $$0) {
         return new ebf.w(this.a.apply($$0), this.c.apply($$0));
      }

      public ebf.f b() {
         return this.a;
      }
   }

   static record y(ale a, ebi c, ebi d) implements ebf.f {
      static final ayy<ebf.y> e = ayy.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ale.a.fieldOf("random_name").forGetter(ebf.y::b),
                     ebi.a.fieldOf("true_at_and_below").forGetter(ebf.y::c),
                     ebi.a.fieldOf("false_at_and_above").forGetter(ebf.y::d)
                  )
                  .apply($$0, ebf.y::new)
         )
      );

      @Override
      public ayy<? extends ebf.f> a() {
         return e;
      }

      public ebf.e a(final ebf.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final ebb $$3 = $$0.j.a(this.b());

         class a extends ebf.k {
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
                  double $$1 = azf.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  azn $$2 = $$3.a(this.c.r, $$0, this.c.s);
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

   static record z(int a, int c, boolean d) implements ebf.f {
      static final ayy<ebf.z> e = ayy.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(ebf.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ebf.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(ebf.z::d)
                  )
                  .apply($$0, ebf.z::new)
         )
      );

      @Override
      public ayy<? extends ebf.f> a() {
         return e;
      }

      public ebf.e a(final ebf.g $$0) {
         class a extends ebf.k {
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
