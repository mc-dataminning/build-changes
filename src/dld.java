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

public class dld {
   public static final dld.f a = a(0, false, dtx.b);
   public static final dld.f b = a(0, true, dtx.b);
   public static final dld.f c = a(0, true, 6, dtx.b);
   public static final dld.f d = a(0, true, 30, dtx.b);
   public static final dld.f e = a(0, false, dtx.a);
   public static final dld.f f = a(0, true, dtx.a);

   public static dld.f a(int $$0, boolean $$1, dtx $$2) {
      return new dld.t($$0, $$1, 0, $$2);
   }

   public static dld.f a(int $$0, boolean $$1, int $$2, dtx $$3) {
      return new dld.t($$0, $$1, $$2, $$3);
   }

   public static dld.f a(dld.f $$0) {
      return new dld.n($$0);
   }

   public static dld.f a(dlg $$0, int $$1) {
      return new dld.aa($$0, $$1, false);
   }

   public static dld.f b(dlg $$0, int $$1) {
      return new dld.aa($$0, $$1, true);
   }

   public static dld.f a(int $$0, int $$1) {
      return new dld.z($$0, $$1, false);
   }

   public static dld.f b(int $$0, int $$1) {
      return new dld.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dld.f a(aey<cqz>... $$0) {
      return a(List.of($$0));
   }

   private static dld.c a(List<aey<cqz>> $$0) {
      return new dld.c($$0);
   }

   public static dld.f a(aey<dzj.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dld.f a(aey<dzj.a> $$0, double $$1, double $$2) {
      return new dld.l($$0, $$1, $$2);
   }

   public static dld.f a(String $$0, dlg $$1, dlg $$2) {
      return new dld.y(new aez($$0), $$1, $$2);
   }

   public static dld.f a() {
      return dld.s.a;
   }

   public static dld.f b() {
      return dld.h.a;
   }

   public static dld.f c() {
      return dld.a.a;
   }

   public static dld.f d() {
      return dld.v.a;
   }

   public static dld.o a(dld.f $$0, dld.o $$1) {
      return new dld.x($$0, $$1);
   }

   public static dld.o a(dld.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dld.q(Arrays.asList($$0));
      }
   }

   public static dld.o a(dfd $$0) {
      return new dld.d($$0);
   }

   public static dld.o e() {
      return dld.b.a;
   }

   static <A> Codec<? extends A> a(hq<Codec<? extends A>> $$0, String $$1, arv<? extends A> $$2) {
      return hq.a($$0, $$1, $$2.a());
   }

   static enum a implements dld.f {
      a;

      static final arv<dld.a> c = arv.a(MapCodec.unit(a));

      @Override
      public arv<? extends dld.f> a() {
         return c;
      }

      public dld.e a(dld.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dlg a, int c, boolean d) implements dld.f {
      static final arv<dld.aa> e = arv.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dlg.a.fieldOf("anchor").forGetter(dld.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dld.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dld.aa::d)
                  )
                  .apply($$0, dld.aa::new)
         )
      );

      @Override
      public arv<? extends dld.f> a() {
         return e;
      }

      public dld.e a(final dld.g $$0) {
         class a extends dld.k {
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

      public dlg b() {
         return this.a;
      }
   }

   static enum b implements dld.o {
      a;

      static final arv<dld.b> c = arv.a(MapCodec.unit(a));

      @Override
      public arv<? extends dld.o> a() {
         return c;
      }

      public dld.u a(dld.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dld.f {
      static final arv<dld.c> a = arv.a(aey.a(jc.aq).listOf().fieldOf("biome_is").xmap(dld::a, $$0 -> $$0.c));
      private final List<aey<cqz>> c;
      final Predicate<aey<cqz>> d;

      c(List<aey<cqz>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public arv<? extends dld.f> a() {
         return a;
      }

      public dld.e a(final dld.g $$0) {
         class a extends dld.k {
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
            return $$0 instanceof dld.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dfd a, dld.r c) implements dld.o {
      static final arv<dld.d> d = arv.a(dfd.b.xmap(dld.d::new, dld.d::b).fieldOf("result_state"));

      d(dfd $$0) {
         this($$0, new dld.r($$0));
      }

      @Override
      public arv<? extends dld.o> a() {
         return d;
      }

      public dld.u a(dld.g $$0) {
         return this.c;
      }

      public dfd b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dld.g, dld.e> {
      Codec<dld.f> b = jb.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dld.f> a(hq<Codec<? extends dld.f>> $$0) {
         dld.a($$0, "biome", dld.c.a);
         dld.a($$0, "noise_threshold", dld.l.e);
         dld.a($$0, "vertical_gradient", dld.y.e);
         dld.a($$0, "y_above", dld.aa.e);
         dld.a($$0, "water", dld.z.e);
         dld.a($$0, "temperature", dld.v.c);
         dld.a($$0, "steep", dld.s.c);
         dld.a($$0, "not", dld.n.c);
         dld.a($$0, "hole", dld.h.c);
         dld.a($$0, "above_preliminary_surface", dld.a.c);
         return dld.a($$0, "stone_depth", dld.t.f);
      }

      arv<? extends dld.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dle e;
      final dld.e f = new dld.g.d(this);
      final dld.e g = new dld.g.c(this);
      final dld.e h = new dld.g.b(this);
      final dld.e i = new dld.g.a();
      final dla j;
      final dgz k;
      private final dkq l;
      private final Function<gw, he<cqz>> m;
      final dlj n;
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
      Supplier<he<cqz>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dle $$0, dla $$1, dgz $$2, dkq $$3, Function<gw, he<cqz>> $$4, hq<cqz> $$5, dlj $$6) {
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
            long $$2 = cpi.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = asb.a(
               asb.a(
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

      final class a implements dld.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dld.j {
         b(dld.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dld.j {
         c(dld.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dgz $$4 = this.c.k;
            int $$5 = $$4.a(dkm.a.a, $$0, $$2);
            int $$6 = $$4.a(dkm.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dkm.a.a, $$7, $$1);
               int $$10 = $$4.a(dkm.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dld.k {
         d(dld.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dld.f {
      a;

      static final arv<dld.h> c = arv.a(MapCodec.unit(a));

      @Override
      public arv<? extends dld.f> a() {
         return c;
      }

      public dld.e a(dld.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dld.e {
      protected final dld.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dld.g $$0) {
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

   abstract static class j extends dld.i {
      protected j(dld.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dld.i {
      protected k(dld.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(aey<dzj.a> a, double c, double d) implements dld.f {
      static final arv<dld.l> e = arv.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aey.a(jc.ay).fieldOf("noise").forGetter(dld.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dld.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dld.l::d)
                  )
                  .apply($$0, dld.l::new)
         )
      );

      @Override
      public arv<? extends dld.f> a() {
         return e;
      }

      public dld.e a(final dld.g $$0) {
         final dzj $$1 = $$0.j.a(this.a);

         class a extends dld.j {
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

      public aey<dzj.a> b() {
         return this.a;
      }
   }

   static record m(dld.e a) implements dld.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dld.f a) implements dld.f {
      static final arv<dld.n> c = arv.a(dld.f.b.xmap(dld.n::new, dld.n::b).fieldOf("invert"));

      @Override
      public arv<? extends dld.f> a() {
         return c;
      }

      public dld.e a(dld.g $$0) {
         return new dld.m(this.a.apply($$0));
      }

      public dld.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dld.g, dld.u> {
      Codec<dld.o> b = jb.af.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dld.o> a(hq<Codec<? extends dld.o>> $$0) {
         dld.a($$0, "bandlands", dld.b.c);
         dld.a($$0, "block", dld.d.d);
         dld.a($$0, "sequence", dld.q.c);
         return dld.a($$0, "condition", dld.x.d);
      }

      arv<? extends dld.o> a();
   }

   static record p(List<dld.u> a) implements dld.u {
      @Nullable
      @Override
      public dfd tryApply(int $$0, int $$1, int $$2) {
         for (dld.u $$3 : this.a) {
            dfd $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dld.o> a) implements dld.o {
      static final arv<dld.q> c = arv.a(dld.o.b.listOf().xmap(dld.q::new, dld.q::b).fieldOf("sequence"));

      @Override
      public arv<? extends dld.o> a() {
         return c;
      }

      public dld.u a(dld.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dld.u> $$1 = ImmutableList.builder();

            for (dld.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dld.p($$1.build());
         }
      }

      public List<dld.o> b() {
         return this.a;
      }
   }

   static record r(dfd a) implements dld.u {
      @Override
      public dfd tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dld.f {
      a;

      static final arv<dld.s> c = arv.a(MapCodec.unit(a));

      @Override
      public arv<? extends dld.f> a() {
         return c;
      }

      public dld.e a(dld.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, dtx e) implements dld.f {
      static final arv<dld.t> f = arv.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dld.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dld.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dld.t::d),
                     dtx.c.fieldOf("surface_type").forGetter(dld.t::e)
                  )
                  .apply($$0, dld.t::new)
         )
      );

      @Override
      public arv<? extends dld.f> a() {
         return f;
      }

      public dld.e a(final dld.g $$0) {
         final boolean $$1 = this.e == dtx.a;

         class a extends dld.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)asb.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dfd tryApply(int var1, int var2, int var3);
   }

   static enum v implements dld.f {
      a;

      static final arv<dld.v> c = arv.a(MapCodec.unit(a));

      @Override
      public arv<? extends dld.f> a() {
         return c;
      }

      public dld.e a(dld.g $$0) {
         return $$0.f;
      }
   }

   static record w(dld.e a, dld.u b) implements dld.u {
      @Nullable
      @Override
      public dfd tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dld.f a, dld.o c) implements dld.o {
      static final arv<dld.x> d = arv.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dld.f.b.fieldOf("if_true").forGetter(dld.x::b), dld.o.b.fieldOf("then_run").forGetter(dld.x::c)).apply($$0, dld.x::new)
         )
      );

      @Override
      public arv<? extends dld.o> a() {
         return d;
      }

      public dld.u a(dld.g $$0) {
         return new dld.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dld.f b() {
         return this.a;
      }
   }

   static record y(aez a, dlg c, dlg d) implements dld.f {
      static final arv<dld.y> e = arv.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aez.a.fieldOf("random_name").forGetter(dld.y::b),
                     dlg.a.fieldOf("true_at_and_below").forGetter(dld.y::c),
                     dlg.a.fieldOf("false_at_and_above").forGetter(dld.y::d)
                  )
                  .apply($$0, dld.y::new)
         )
      );

      @Override
      public arv<? extends dld.f> a() {
         return e;
      }

      public dld.e a(final dld.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dkz $$3 = $$0.j.a(this.b());

         class a extends dld.k {
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
                  double $$1 = asb.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  ash $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public aez b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dld.f {
      static final arv<dld.z> e = arv.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dld.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dld.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dld.z::d)
                  )
                  .apply($$0, dld.z::new)
         )
      );

      @Override
      public arv<? extends dld.f> a() {
         return e;
      }

      public dld.e a(final dld.g $$0) {
         class a extends dld.k {
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
