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

public class ehj {
   public static final ehj.f a = a(0, false, eqh.b);
   public static final ehj.f b = a(0, true, eqh.b);
   public static final ehj.f c = a(0, true, 6, eqh.b);
   public static final ehj.f d = a(0, true, 30, eqh.b);
   public static final ehj.f e = a(0, false, eqh.a);
   public static final ehj.f f = a(0, true, eqh.a);

   public static ehj.f a(int $$0, boolean $$1, eqh $$2) {
      return new ehj.t($$0, $$1, 0, $$2);
   }

   public static ehj.f a(int $$0, boolean $$1, int $$2, eqh $$3) {
      return new ehj.t($$0, $$1, $$2, $$3);
   }

   public static ehj.f a(ehj.f $$0) {
      return new ehj.n($$0);
   }

   public static ehj.f a(ehm $$0, int $$1) {
      return new ehj.aa($$0, $$1, false);
   }

   public static ehj.f b(ehm $$0, int $$1) {
      return new ehj.aa($$0, $$1, true);
   }

   public static ehj.f a(int $$0, int $$1) {
      return new ehj.z($$0, $$1, false);
   }

   public static ehj.f b(int $$0, int $$1) {
      return new ehj.z($$0, $$1, true);
   }

   @SafeVarargs
   public static ehj.f a(alf<dkp>... $$0) {
      return a(List.of($$0));
   }

   private static ehj.c a(List<alf<dkp>> $$0) {
      return new ehj.c($$0);
   }

   public static ehj.f a(alf<ewd.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static ehj.f a(alf<ewd.a> $$0, double $$1, double $$2) {
      return new ehj.l($$0, $$1, $$2);
   }

   public static ehj.f a(String $$0, ehm $$1, ehm $$2) {
      return new ehj.y(alg.a($$0), $$1, $$2);
   }

   public static ehj.f a() {
      return ehj.s.a;
   }

   public static ehj.f b() {
      return ehj.h.a;
   }

   public static ehj.f c() {
      return ehj.a.a;
   }

   public static ehj.f d() {
      return ehj.v.a;
   }

   public static ehj.o a(ehj.f $$0, ehj.o $$1) {
      return new ehj.x($$0, $$1);
   }

   public static ehj.o a(ehj.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new ehj.q(Arrays.asList($$0));
      }
   }

   public static ehj.o a(eat $$0) {
      return new ehj.d($$0);
   }

   public static ehj.o e() {
      return ehj.b.a;
   }

   static <A> MapCodec<? extends A> a(js<MapCodec<? extends A>> $$0, String $$1, azf<? extends A> $$2) {
      return js.a($$0, $$1, $$2.a());
   }

   static enum a implements ehj.f {
      a;

      static final azf<ehj.a> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends ehj.f> a() {
         return c;
      }

      public ehj.e a(ehj.g $$0) {
         return $$0.i;
      }
   }

   static record aa(ehm a, int c, boolean d) implements ehj.f {
      static final azf<ehj.aa> e = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ehm.a.fieldOf("anchor").forGetter(ehj.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ehj.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(ehj.aa::d)
                  )
                  .apply($$0, ehj.aa::new)
         )
      );

      @Override
      public azf<? extends ehj.f> a() {
         return e;
      }

      public ehj.e a(final ehj.g $$0) {
         class a extends ehj.k {
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

      public ehm b() {
         return this.a;
      }
   }

   static enum b implements ehj.o {
      a;

      static final azf<ehj.b> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends ehj.o> a() {
         return c;
      }

      public ehj.u a(ehj.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements ehj.f {
      static final azf<ehj.c> a = azf.a(alf.a(mh.aG).listOf().fieldOf("biome_is").xmap(ehj::a, $$0 -> $$0.c));
      private final List<alf<dkp>> c;
      final Predicate<alf<dkp>> d;

      c(List<alf<dkp>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public azf<? extends ehj.f> a() {
         return a;
      }

      public ehj.e a(final ehj.g $$0) {
         class a extends ehj.k {
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
            return $$0 instanceof ehj.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(eat a, ehj.r c) implements ehj.o {
      static final azf<ehj.d> d = azf.a(eat.a.xmap(ehj.d::new, ehj.d::b).fieldOf("result_state"));

      d(eat $$0) {
         this($$0, new ehj.r($$0));
      }

      @Override
      public azf<? extends ehj.o> a() {
         return d;
      }

      public ehj.u a(ehj.g $$0) {
         return this.c;
      }

      public eat b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<ehj.g, ehj.e> {
      Codec<ehj.f> b = mg.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ehj.f> a(js<MapCodec<? extends ehj.f>> $$0) {
         ehj.a($$0, "biome", ehj.c.a);
         ehj.a($$0, "noise_threshold", ehj.l.e);
         ehj.a($$0, "vertical_gradient", ehj.y.e);
         ehj.a($$0, "y_above", ehj.aa.e);
         ehj.a($$0, "water", ehj.z.e);
         ehj.a($$0, "temperature", ehj.v.c);
         ehj.a($$0, "steep", ehj.s.c);
         ehj.a($$0, "not", ehj.n.c);
         ehj.a($$0, "hole", ehj.h.c);
         ehj.a($$0, "above_preliminary_surface", ehj.a.c);
         return ehj.a($$0, "stone_depth", ehj.t.f);
      }

      azf<? extends ehj.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final ehk e;
      final ehj.e f = new ehj.g.d(this);
      final ehj.e g = new ehj.g.c(this);
      final ehj.e h = new ehj.g.b(this);
      final ehj.e i = new ehj.g.a();
      final ehg j;
      final ecq k;
      private final egw l;
      private final Function<iv, jf<dkp>> m;
      final ehp n;
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
      Supplier<jf<dkp>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(ehk $$0, ehg $$1, ecq $$2, egw $$3, Function<iv, jf<dkp>> $$4, js<dkp> $$5, ehp $$6) {
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
            long $$2 = dir.c($$0, $$1);
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

      final class a implements ehj.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends ehj.j {
         b(ehj.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends ehj.j {
         c(ehj.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            ecq $$4 = this.c.k;
            int $$5 = $$4.a(egs.a.a, $$0, $$2);
            int $$6 = $$4.a(egs.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(egs.a.a, $$7, $$1);
               int $$10 = $$4.a(egs.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends ehj.k {
         d(ehj.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements ehj.f {
      a;

      static final azf<ehj.h> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends ehj.f> a() {
         return c;
      }

      public ehj.e a(ehj.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements ehj.e {
      protected final ehj.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(ehj.g $$0) {
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

   abstract static class j extends ehj.i {
      protected j(ehj.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends ehj.i {
      protected k(ehj.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(alf<ewd.a> a, double c, double d) implements ehj.f {
      static final azf<ehj.l> e = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alf.a(mh.aY).fieldOf("noise").forGetter(ehj.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(ehj.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(ehj.l::d)
                  )
                  .apply($$0, ehj.l::new)
         )
      );

      @Override
      public azf<? extends ehj.f> a() {
         return e;
      }

      public ehj.e a(final ehj.g $$0) {
         final ewd $$1 = $$0.j.a(this.a);

         class a extends ehj.j {
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

      public alf<ewd.a> b() {
         return this.a;
      }
   }

   static record m(ehj.e a) implements ehj.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(ehj.f a) implements ehj.f {
      static final azf<ehj.n> c = azf.a(ehj.f.b.xmap(ehj.n::new, ehj.n::b).fieldOf("invert"));

      @Override
      public azf<? extends ehj.f> a() {
         return c;
      }

      public ehj.e a(ehj.g $$0) {
         return new ehj.m(this.a.apply($$0));
      }

      public ehj.f b() {
         return this.a;
      }
   }

   public interface o extends Function<ehj.g, ehj.u> {
      Codec<ehj.o> b = mg.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ehj.o> a(js<MapCodec<? extends ehj.o>> $$0) {
         ehj.a($$0, "bandlands", ehj.b.c);
         ehj.a($$0, "block", ehj.d.d);
         ehj.a($$0, "sequence", ehj.q.c);
         return ehj.a($$0, "condition", ehj.x.d);
      }

      azf<? extends ehj.o> a();
   }

   static record p(List<ehj.u> a) implements ehj.u {
      @Nullable
      @Override
      public eat tryApply(int $$0, int $$1, int $$2) {
         for (ehj.u $$3 : this.a) {
            eat $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<ehj.o> a) implements ehj.o {
      static final azf<ehj.q> c = azf.a(ehj.o.b.listOf().xmap(ehj.q::new, ehj.q::b).fieldOf("sequence"));

      @Override
      public azf<? extends ehj.o> a() {
         return c;
      }

      public ehj.u a(ehj.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<ehj.u> $$1 = ImmutableList.builder();

            for (ehj.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new ehj.p($$1.build());
         }
      }

      public List<ehj.o> b() {
         return this.a;
      }
   }

   static record r(eat a) implements ehj.u {
      @Override
      public eat tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements ehj.f {
      a;

      static final azf<ehj.s> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends ehj.f> a() {
         return c;
      }

      public ehj.e a(ehj.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, eqh e) implements ehj.f {
      static final azf<ehj.t> f = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(ehj.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(ehj.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(ehj.t::d),
                     eqh.c.fieldOf("surface_type").forGetter(ehj.t::e)
                  )
                  .apply($$0, ehj.t::new)
         )
      );

      @Override
      public azf<? extends ehj.f> a() {
         return f;
      }

      public ehj.e a(final ehj.g $$0) {
         final boolean $$1 = this.e == eqh.a;

         class a extends ehj.k {
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
      eat tryApply(int var1, int var2, int var3);
   }

   static enum v implements ehj.f {
      a;

      static final azf<ehj.v> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends ehj.f> a() {
         return c;
      }

      public ehj.e a(ehj.g $$0) {
         return $$0.f;
      }
   }

   static record w(ehj.e a, ehj.u b) implements ehj.u {
      @Nullable
      @Override
      public eat tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(ehj.f a, ehj.o c) implements ehj.o {
      static final azf<ehj.x> d = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(ehj.f.b.fieldOf("if_true").forGetter(ehj.x::b), ehj.o.b.fieldOf("then_run").forGetter(ehj.x::c)).apply($$0, ehj.x::new)
         )
      );

      @Override
      public azf<? extends ehj.o> a() {
         return d;
      }

      public ehj.u a(ehj.g $$0) {
         return new ehj.w(this.a.apply($$0), this.c.apply($$0));
      }

      public ehj.f b() {
         return this.a;
      }
   }

   static record y(alg a, ehm c, ehm d) implements ehj.f {
      static final azf<ehj.y> e = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alg.a.fieldOf("random_name").forGetter(ehj.y::b),
                     ehm.a.fieldOf("true_at_and_below").forGetter(ehj.y::c),
                     ehm.a.fieldOf("false_at_and_above").forGetter(ehj.y::d)
                  )
                  .apply($$0, ehj.y::new)
         )
      );

      @Override
      public azf<? extends ehj.f> a() {
         return e;
      }

      public ehj.e a(final ehj.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final ehf $$3 = $$0.j.a(this.b());

         class a extends ehj.k {
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

   static record z(int a, int c, boolean d) implements ehj.f {
      static final azf<ehj.z> e = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(ehj.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ehj.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(ehj.z::d)
                  )
                  .apply($$0, ehj.z::new)
         )
      );

      @Override
      public azf<? extends ehj.f> a() {
         return e;
      }

      public ehj.e a(final ehj.g $$0) {
         class a extends ehj.k {
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
