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

public class egp {
   public static final egp.f a = a(0, false, epn.b);
   public static final egp.f b = a(0, true, epn.b);
   public static final egp.f c = a(0, true, 6, epn.b);
   public static final egp.f d = a(0, true, 30, epn.b);
   public static final egp.f e = a(0, false, epn.a);
   public static final egp.f f = a(0, true, epn.a);

   public static egp.f a(int $$0, boolean $$1, epn $$2) {
      return new egp.t($$0, $$1, 0, $$2);
   }

   public static egp.f a(int $$0, boolean $$1, int $$2, epn $$3) {
      return new egp.t($$0, $$1, $$2, $$3);
   }

   public static egp.f a(egp.f $$0) {
      return new egp.n($$0);
   }

   public static egp.f a(egs $$0, int $$1) {
      return new egp.aa($$0, $$1, false);
   }

   public static egp.f b(egs $$0, int $$1) {
      return new egp.aa($$0, $$1, true);
   }

   public static egp.f a(int $$0, int $$1) {
      return new egp.z($$0, $$1, false);
   }

   public static egp.f b(int $$0, int $$1) {
      return new egp.z($$0, $$1, true);
   }

   @SafeVarargs
   public static egp.f a(alf<djy>... $$0) {
      return a(List.of($$0));
   }

   private static egp.c a(List<alf<djy>> $$0) {
      return new egp.c($$0);
   }

   public static egp.f a(alf<evj.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static egp.f a(alf<evj.a> $$0, double $$1, double $$2) {
      return new egp.l($$0, $$1, $$2);
   }

   public static egp.f a(String $$0, egs $$1, egs $$2) {
      return new egp.y(alg.a($$0), $$1, $$2);
   }

   public static egp.f a() {
      return egp.s.a;
   }

   public static egp.f b() {
      return egp.h.a;
   }

   public static egp.f c() {
      return egp.a.a;
   }

   public static egp.f d() {
      return egp.v.a;
   }

   public static egp.o a(egp.f $$0, egp.o $$1) {
      return new egp.x($$0, $$1);
   }

   public static egp.o a(egp.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new egp.q(Arrays.asList($$0));
      }
   }

   public static egp.o a(dzz $$0) {
      return new egp.d($$0);
   }

   public static egp.o e() {
      return egp.b.a;
   }

   static <A> MapCodec<? extends A> a(jr<MapCodec<? extends A>> $$0, String $$1, azf<? extends A> $$2) {
      return jr.a($$0, $$1, $$2.a());
   }

   static enum a implements egp.f {
      a;

      static final azf<egp.a> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends egp.f> a() {
         return c;
      }

      public egp.e a(egp.g $$0) {
         return $$0.i;
      }
   }

   static record aa(egs a, int c, boolean d) implements egp.f {
      static final azf<egp.aa> e = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     egs.a.fieldOf("anchor").forGetter(egp.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(egp.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(egp.aa::d)
                  )
                  .apply($$0, egp.aa::new)
         )
      );

      @Override
      public azf<? extends egp.f> a() {
         return e;
      }

      public egp.e a(final egp.g $$0) {
         class a extends egp.k {
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

      public egs b() {
         return this.a;
      }
   }

   static enum b implements egp.o {
      a;

      static final azf<egp.b> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends egp.o> a() {
         return c;
      }

      public egp.u a(egp.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements egp.f {
      static final azf<egp.c> a = azf.a(alf.a(mg.aG).listOf().fieldOf("biome_is").xmap(egp::a, $$0 -> $$0.c));
      private final List<alf<djy>> c;
      final Predicate<alf<djy>> d;

      c(List<alf<djy>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public azf<? extends egp.f> a() {
         return a;
      }

      public egp.e a(final egp.g $$0) {
         class a extends egp.k {
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
            return $$0 instanceof egp.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dzz a, egp.r c) implements egp.o {
      static final azf<egp.d> d = azf.a(dzz.a.xmap(egp.d::new, egp.d::b).fieldOf("result_state"));

      d(dzz $$0) {
         this($$0, new egp.r($$0));
      }

      @Override
      public azf<? extends egp.o> a() {
         return d;
      }

      public egp.u a(egp.g $$0) {
         return this.c;
      }

      public dzz b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<egp.g, egp.e> {
      Codec<egp.f> b = mf.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends egp.f> a(jr<MapCodec<? extends egp.f>> $$0) {
         egp.a($$0, "biome", egp.c.a);
         egp.a($$0, "noise_threshold", egp.l.e);
         egp.a($$0, "vertical_gradient", egp.y.e);
         egp.a($$0, "y_above", egp.aa.e);
         egp.a($$0, "water", egp.z.e);
         egp.a($$0, "temperature", egp.v.c);
         egp.a($$0, "steep", egp.s.c);
         egp.a($$0, "not", egp.n.c);
         egp.a($$0, "hole", egp.h.c);
         egp.a($$0, "above_preliminary_surface", egp.a.c);
         return egp.a($$0, "stone_depth", egp.t.f);
      }

      azf<? extends egp.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final egq e;
      final egp.e f = new egp.g.d(this);
      final egp.e g = new egp.g.c(this);
      final egp.e h = new egp.g.b(this);
      final egp.e i = new egp.g.a();
      final egm j;
      final ebw k;
      private final egc l;
      private final Function<iu, je<djy>> m;
      final egv n;
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
      Supplier<je<djy>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(egq $$0, egm $$1, ebw $$2, egc $$3, Function<iu, je<djy>> $$4, jr<djy> $$5, egv $$6) {
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
            long $$2 = dic.c($$0, $$1);
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

      final class a implements egp.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends egp.j {
         b(egp.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends egp.j {
         c(egp.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            ebw $$4 = this.c.k;
            int $$5 = $$4.a(efy.a.a, $$0, $$2);
            int $$6 = $$4.a(efy.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(efy.a.a, $$7, $$1);
               int $$10 = $$4.a(efy.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends egp.k {
         d(egp.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements egp.f {
      a;

      static final azf<egp.h> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends egp.f> a() {
         return c;
      }

      public egp.e a(egp.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements egp.e {
      protected final egp.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(egp.g $$0) {
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

   abstract static class j extends egp.i {
      protected j(egp.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends egp.i {
      protected k(egp.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(alf<evj.a> a, double c, double d) implements egp.f {
      static final azf<egp.l> e = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alf.a(mg.aX).fieldOf("noise").forGetter(egp.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(egp.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(egp.l::d)
                  )
                  .apply($$0, egp.l::new)
         )
      );

      @Override
      public azf<? extends egp.f> a() {
         return e;
      }

      public egp.e a(final egp.g $$0) {
         final evj $$1 = $$0.j.a(this.a);

         class a extends egp.j {
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

      public alf<evj.a> b() {
         return this.a;
      }
   }

   static record m(egp.e a) implements egp.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(egp.f a) implements egp.f {
      static final azf<egp.n> c = azf.a(egp.f.b.xmap(egp.n::new, egp.n::b).fieldOf("invert"));

      @Override
      public azf<? extends egp.f> a() {
         return c;
      }

      public egp.e a(egp.g $$0) {
         return new egp.m(this.a.apply($$0));
      }

      public egp.f b() {
         return this.a;
      }
   }

   public interface o extends Function<egp.g, egp.u> {
      Codec<egp.o> b = mf.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends egp.o> a(jr<MapCodec<? extends egp.o>> $$0) {
         egp.a($$0, "bandlands", egp.b.c);
         egp.a($$0, "block", egp.d.d);
         egp.a($$0, "sequence", egp.q.c);
         return egp.a($$0, "condition", egp.x.d);
      }

      azf<? extends egp.o> a();
   }

   static record p(List<egp.u> a) implements egp.u {
      @Nullable
      @Override
      public dzz tryApply(int $$0, int $$1, int $$2) {
         for (egp.u $$3 : this.a) {
            dzz $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<egp.o> a) implements egp.o {
      static final azf<egp.q> c = azf.a(egp.o.b.listOf().xmap(egp.q::new, egp.q::b).fieldOf("sequence"));

      @Override
      public azf<? extends egp.o> a() {
         return c;
      }

      public egp.u a(egp.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<egp.u> $$1 = ImmutableList.builder();

            for (egp.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new egp.p($$1.build());
         }
      }

      public List<egp.o> b() {
         return this.a;
      }
   }

   static record r(dzz a) implements egp.u {
      @Override
      public dzz tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements egp.f {
      a;

      static final azf<egp.s> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends egp.f> a() {
         return c;
      }

      public egp.e a(egp.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, epn e) implements egp.f {
      static final azf<egp.t> f = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(egp.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(egp.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(egp.t::d),
                     epn.c.fieldOf("surface_type").forGetter(egp.t::e)
                  )
                  .apply($$0, egp.t::new)
         )
      );

      @Override
      public azf<? extends egp.f> a() {
         return f;
      }

      public egp.e a(final egp.g $$0) {
         final boolean $$1 = this.e == epn.a;

         class a extends egp.k {
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
      dzz tryApply(int var1, int var2, int var3);
   }

   static enum v implements egp.f {
      a;

      static final azf<egp.v> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends egp.f> a() {
         return c;
      }

      public egp.e a(egp.g $$0) {
         return $$0.f;
      }
   }

   static record w(egp.e a, egp.u b) implements egp.u {
      @Nullable
      @Override
      public dzz tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(egp.f a, egp.o c) implements egp.o {
      static final azf<egp.x> d = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(egp.f.b.fieldOf("if_true").forGetter(egp.x::b), egp.o.b.fieldOf("then_run").forGetter(egp.x::c)).apply($$0, egp.x::new)
         )
      );

      @Override
      public azf<? extends egp.o> a() {
         return d;
      }

      public egp.u a(egp.g $$0) {
         return new egp.w(this.a.apply($$0), this.c.apply($$0));
      }

      public egp.f b() {
         return this.a;
      }
   }

   static record y(alg a, egs c, egs d) implements egp.f {
      static final azf<egp.y> e = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alg.a.fieldOf("random_name").forGetter(egp.y::b),
                     egs.a.fieldOf("true_at_and_below").forGetter(egp.y::c),
                     egs.a.fieldOf("false_at_and_above").forGetter(egp.y::d)
                  )
                  .apply($$0, egp.y::new)
         )
      );

      @Override
      public azf<? extends egp.f> a() {
         return e;
      }

      public egp.e a(final egp.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final egl $$3 = $$0.j.a(this.b());

         class a extends egp.k {
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

   static record z(int a, int c, boolean d) implements egp.f {
      static final azf<egp.z> e = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(egp.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(egp.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(egp.z::d)
                  )
                  .apply($$0, egp.z::new)
         )
      );

      @Override
      public azf<? extends egp.f> a() {
         return e;
      }

      public egp.e a(final egp.g $$0) {
         class a extends egp.k {
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
