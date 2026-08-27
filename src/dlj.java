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

public class dlj {
   public static final dlj.f a = a(0, false, dud.b);
   public static final dlj.f b = a(0, true, dud.b);
   public static final dlj.f c = a(0, true, 6, dud.b);
   public static final dlj.f d = a(0, true, 30, dud.b);
   public static final dlj.f e = a(0, false, dud.a);
   public static final dlj.f f = a(0, true, dud.a);

   public static dlj.f a(int $$0, boolean $$1, dud $$2) {
      return new dlj.t($$0, $$1, 0, $$2);
   }

   public static dlj.f a(int $$0, boolean $$1, int $$2, dud $$3) {
      return new dlj.t($$0, $$1, $$2, $$3);
   }

   public static dlj.f a(dlj.f $$0) {
      return new dlj.n($$0);
   }

   public static dlj.f a(dlm $$0, int $$1) {
      return new dlj.aa($$0, $$1, false);
   }

   public static dlj.f b(dlm $$0, int $$1) {
      return new dlj.aa($$0, $$1, true);
   }

   public static dlj.f a(int $$0, int $$1) {
      return new dlj.z($$0, $$1, false);
   }

   public static dlj.f b(int $$0, int $$1) {
      return new dlj.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dlj.f a(aew<cqt>... $$0) {
      return a(List.of($$0));
   }

   private static dlj.c a(List<aew<cqt>> $$0) {
      return new dlj.c($$0);
   }

   public static dlj.f a(aew<dzp.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dlj.f a(aew<dzp.a> $$0, double $$1, double $$2) {
      return new dlj.l($$0, $$1, $$2);
   }

   public static dlj.f a(String $$0, dlm $$1, dlm $$2) {
      return new dlj.y(new aex($$0), $$1, $$2);
   }

   public static dlj.f a() {
      return dlj.s.a;
   }

   public static dlj.f b() {
      return dlj.h.a;
   }

   public static dlj.f c() {
      return dlj.a.a;
   }

   public static dlj.f d() {
      return dlj.v.a;
   }

   public static dlj.o a(dlj.f $$0, dlj.o $$1) {
      return new dlj.x($$0, $$1);
   }

   public static dlj.o a(dlj.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dlj.q(Arrays.asList($$0));
      }
   }

   public static dlj.o a(dfj $$0) {
      return new dlj.d($$0);
   }

   public static dlj.o e() {
      return dlj.b.a;
   }

   static <A> Codec<? extends A> a(ht<Codec<? extends A>> $$0, String $$1, arr<? extends A> $$2) {
      return ht.a($$0, $$1, $$2.a());
   }

   static enum a implements dlj.f {
      a;

      static final arr<dlj.a> c = arr.a(MapCodec.unit(a));

      @Override
      public arr<? extends dlj.f> a() {
         return c;
      }

      public dlj.e a(dlj.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dlm a, int c, boolean d) implements dlj.f {
      static final arr<dlj.aa> e = arr.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dlm.a.fieldOf("anchor").forGetter(dlj.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dlj.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dlj.aa::d)
                  )
                  .apply($$0, dlj.aa::new)
         )
      );

      @Override
      public arr<? extends dlj.f> a() {
         return e;
      }

      public dlj.e a(final dlj.g $$0) {
         class a extends dlj.k {
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

      public dlm b() {
         return this.a;
      }
   }

   static enum b implements dlj.o {
      a;

      static final arr<dlj.b> c = arr.a(MapCodec.unit(a));

      @Override
      public arr<? extends dlj.o> a() {
         return c;
      }

      public dlj.u a(dlj.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dlj.f {
      static final arr<dlj.c> a = arr.a(aew.a(je.ap).listOf().fieldOf("biome_is").xmap(dlj::a, $$0 -> $$0.c));
      private final List<aew<cqt>> c;
      final Predicate<aew<cqt>> d;

      c(List<aew<cqt>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public arr<? extends dlj.f> a() {
         return a;
      }

      public dlj.e a(final dlj.g $$0) {
         class a extends dlj.k {
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
            return $$0 instanceof dlj.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dfj a, dlj.r c) implements dlj.o {
      static final arr<dlj.d> d = arr.a(dfj.b.xmap(dlj.d::new, dlj.d::b).fieldOf("result_state"));

      d(dfj $$0) {
         this($$0, new dlj.r($$0));
      }

      @Override
      public arr<? extends dlj.o> a() {
         return d;
      }

      public dlj.u a(dlj.g $$0) {
         return this.c;
      }

      public dfj b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dlj.g, dlj.e> {
      Codec<dlj.f> b = jd.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dlj.f> a(ht<Codec<? extends dlj.f>> $$0) {
         dlj.a($$0, "biome", dlj.c.a);
         dlj.a($$0, "noise_threshold", dlj.l.e);
         dlj.a($$0, "vertical_gradient", dlj.y.e);
         dlj.a($$0, "y_above", dlj.aa.e);
         dlj.a($$0, "water", dlj.z.e);
         dlj.a($$0, "temperature", dlj.v.c);
         dlj.a($$0, "steep", dlj.s.c);
         dlj.a($$0, "not", dlj.n.c);
         dlj.a($$0, "hole", dlj.h.c);
         dlj.a($$0, "above_preliminary_surface", dlj.a.c);
         return dlj.a($$0, "stone_depth", dlj.t.f);
      }

      arr<? extends dlj.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dlk e;
      final dlj.e f = new dlj.g.d(this);
      final dlj.e g = new dlj.g.c(this);
      final dlj.e h = new dlj.g.b(this);
      final dlj.e i = new dlj.g.a();
      final dlg j;
      final dhf k;
      private final dkw l;
      private final Function<gw, hg<cqt>> m;
      final dlp n;
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
      final gw.a z = new gw.a();
      Supplier<hg<cqt>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dlk $$0, dlg $$1, dhf $$2, dkw $$3, Function<gw, hg<cqt>> $$4, ht<cqt> $$5, dlp $$6) {
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

      private static int a(int $$0) {
         return $$0 >> 4;
      }

      private static int b(int $$0) {
         return $$0 << 4;
      }

      protected int b() {
         if (this.w != this.q) {
            this.w = this.q;
            int $$0 = a(this.r);
            int $$1 = a(this.s);
            long $$2 = cpc.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = arx.a(
               arx.a(
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

      final class a implements dlj.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dlj.j {
         b(dlj.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dlj.j {
         c(dlj.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dhf $$4 = this.c.k;
            int $$5 = $$4.a(dks.a.a, $$0, $$2);
            int $$6 = $$4.a(dks.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dks.a.a, $$7, $$1);
               int $$10 = $$4.a(dks.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dlj.k {
         d(dlj.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dlj.f {
      a;

      static final arr<dlj.h> c = arr.a(MapCodec.unit(a));

      @Override
      public arr<? extends dlj.f> a() {
         return c;
      }

      public dlj.e a(dlj.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dlj.e {
      protected final dlj.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dlj.g $$0) {
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

   abstract static class j extends dlj.i {
      protected j(dlj.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dlj.i {
      protected k(dlj.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(aew<dzp.a> a, double c, double d) implements dlj.f {
      static final arr<dlj.l> e = arr.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aew.a(je.ax).fieldOf("noise").forGetter(dlj.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dlj.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dlj.l::d)
                  )
                  .apply($$0, dlj.l::new)
         )
      );

      @Override
      public arr<? extends dlj.f> a() {
         return e;
      }

      public dlj.e a(final dlj.g $$0) {
         final dzp $$1 = $$0.j.a(this.a);

         class a extends dlj.j {
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

      public aew<dzp.a> b() {
         return this.a;
      }
   }

   static record m(dlj.e a) implements dlj.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dlj.f a) implements dlj.f {
      static final arr<dlj.n> c = arr.a(dlj.f.b.xmap(dlj.n::new, dlj.n::b).fieldOf("invert"));

      @Override
      public arr<? extends dlj.f> a() {
         return c;
      }

      public dlj.e a(dlj.g $$0) {
         return new dlj.m(this.a.apply($$0));
      }

      public dlj.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dlj.g, dlj.u> {
      Codec<dlj.o> b = jd.af.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dlj.o> a(ht<Codec<? extends dlj.o>> $$0) {
         dlj.a($$0, "bandlands", dlj.b.c);
         dlj.a($$0, "block", dlj.d.d);
         dlj.a($$0, "sequence", dlj.q.c);
         return dlj.a($$0, "condition", dlj.x.d);
      }

      arr<? extends dlj.o> a();
   }

   static record p(List<dlj.u> a) implements dlj.u {
      @Nullable
      @Override
      public dfj tryApply(int $$0, int $$1, int $$2) {
         for (dlj.u $$3 : this.a) {
            dfj $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dlj.o> a) implements dlj.o {
      static final arr<dlj.q> c = arr.a(dlj.o.b.listOf().xmap(dlj.q::new, dlj.q::b).fieldOf("sequence"));

      @Override
      public arr<? extends dlj.o> a() {
         return c;
      }

      public dlj.u a(dlj.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dlj.u> $$1 = ImmutableList.builder();

            for (dlj.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dlj.p($$1.build());
         }
      }

      public List<dlj.o> b() {
         return this.a;
      }
   }

   static record r(dfj a) implements dlj.u {
      @Override
      public dfj tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dlj.f {
      a;

      static final arr<dlj.s> c = arr.a(MapCodec.unit(a));

      @Override
      public arr<? extends dlj.f> a() {
         return c;
      }

      public dlj.e a(dlj.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, dud e) implements dlj.f {
      static final arr<dlj.t> f = arr.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dlj.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dlj.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dlj.t::d),
                     dud.c.fieldOf("surface_type").forGetter(dlj.t::e)
                  )
                  .apply($$0, dlj.t::new)
         )
      );

      @Override
      public arr<? extends dlj.f> a() {
         return f;
      }

      public dlj.e a(final dlj.g $$0) {
         final boolean $$1 = this.e == dud.a;

         class a extends dlj.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)arx.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dfj tryApply(int var1, int var2, int var3);
   }

   static enum v implements dlj.f {
      a;

      static final arr<dlj.v> c = arr.a(MapCodec.unit(a));

      @Override
      public arr<? extends dlj.f> a() {
         return c;
      }

      public dlj.e a(dlj.g $$0) {
         return $$0.f;
      }
   }

   static record w(dlj.e a, dlj.u b) implements dlj.u {
      @Nullable
      @Override
      public dfj tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dlj.f a, dlj.o c) implements dlj.o {
      static final arr<dlj.x> d = arr.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dlj.f.b.fieldOf("if_true").forGetter(dlj.x::b), dlj.o.b.fieldOf("then_run").forGetter(dlj.x::c)).apply($$0, dlj.x::new)
         )
      );

      @Override
      public arr<? extends dlj.o> a() {
         return d;
      }

      public dlj.u a(dlj.g $$0) {
         return new dlj.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dlj.f b() {
         return this.a;
      }
   }

   static record y(aex a, dlm c, dlm d) implements dlj.f {
      static final arr<dlj.y> e = arr.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aex.a.fieldOf("random_name").forGetter(dlj.y::b),
                     dlm.a.fieldOf("true_at_and_below").forGetter(dlj.y::c),
                     dlm.a.fieldOf("false_at_and_above").forGetter(dlj.y::d)
                  )
                  .apply($$0, dlj.y::new)
         )
      );

      @Override
      public arr<? extends dlj.f> a() {
         return e;
      }

      public dlj.e a(final dlj.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dlf $$3 = $$0.j.a(this.b());

         class a extends dlj.k {
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
                  double $$1 = arx.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  asc $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public aex b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dlj.f {
      static final arr<dlj.z> e = arr.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dlj.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dlj.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dlj.z::d)
                  )
                  .apply($$0, dlj.z::new)
         )
      );

      @Override
      public arr<? extends dlj.f> a() {
         return e;
      }

      public dlj.e a(final dlj.g $$0) {
         class a extends dlj.k {
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
