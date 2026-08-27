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

public class dkz {
   public static final dkz.f a = a(0, false, dtt.b);
   public static final dkz.f b = a(0, true, dtt.b);
   public static final dkz.f c = a(0, true, 6, dtt.b);
   public static final dkz.f d = a(0, true, 30, dtt.b);
   public static final dkz.f e = a(0, false, dtt.a);
   public static final dkz.f f = a(0, true, dtt.a);

   public static dkz.f a(int $$0, boolean $$1, dtt $$2) {
      return new dkz.t($$0, $$1, 0, $$2);
   }

   public static dkz.f a(int $$0, boolean $$1, int $$2, dtt $$3) {
      return new dkz.t($$0, $$1, $$2, $$3);
   }

   public static dkz.f a(dkz.f $$0) {
      return new dkz.n($$0);
   }

   public static dkz.f a(dlc $$0, int $$1) {
      return new dkz.aa($$0, $$1, false);
   }

   public static dkz.f b(dlc $$0, int $$1) {
      return new dkz.aa($$0, $$1, true);
   }

   public static dkz.f a(int $$0, int $$1) {
      return new dkz.z($$0, $$1, false);
   }

   public static dkz.f b(int $$0, int $$1) {
      return new dkz.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dkz.f a(aeq<cqj>... $$0) {
      return a(List.of($$0));
   }

   private static dkz.c a(List<aeq<cqj>> $$0) {
      return new dkz.c($$0);
   }

   public static dkz.f a(aeq<dzf.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dkz.f a(aeq<dzf.a> $$0, double $$1, double $$2) {
      return new dkz.l($$0, $$1, $$2);
   }

   public static dkz.f a(String $$0, dlc $$1, dlc $$2) {
      return new dkz.y(new aer($$0), $$1, $$2);
   }

   public static dkz.f a() {
      return dkz.s.a;
   }

   public static dkz.f b() {
      return dkz.h.a;
   }

   public static dkz.f c() {
      return dkz.a.a;
   }

   public static dkz.f d() {
      return dkz.v.a;
   }

   public static dkz.o a(dkz.f $$0, dkz.o $$1) {
      return new dkz.x($$0, $$1);
   }

   public static dkz.o a(dkz.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dkz.q(Arrays.asList($$0));
      }
   }

   public static dkz.o a(dez $$0) {
      return new dkz.d($$0);
   }

   public static dkz.o e() {
      return dkz.b.a;
   }

   static <A> Codec<? extends A> a(hr<Codec<? extends A>> $$0, String $$1, arj<? extends A> $$2) {
      return hr.a($$0, $$1, $$2.a());
   }

   static enum a implements dkz.f {
      a;

      static final arj<dkz.a> c = arj.a(MapCodec.unit(a));

      @Override
      public arj<? extends dkz.f> a() {
         return c;
      }

      public dkz.e a(dkz.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dlc a, int c, boolean d) implements dkz.f {
      static final arj<dkz.aa> e = arj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dlc.a.fieldOf("anchor").forGetter(dkz.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dkz.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dkz.aa::d)
                  )
                  .apply($$0, dkz.aa::new)
         )
      );

      @Override
      public arj<? extends dkz.f> a() {
         return e;
      }

      public dkz.e a(final dkz.g $$0) {
         class a extends dkz.k {
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

      public dlc b() {
         return this.a;
      }
   }

   static enum b implements dkz.o {
      a;

      static final arj<dkz.b> c = arj.a(MapCodec.unit(a));

      @Override
      public arj<? extends dkz.o> a() {
         return c;
      }

      public dkz.u a(dkz.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dkz.f {
      static final arj<dkz.c> a = arj.a(aeq.a(jc.ap).listOf().fieldOf("biome_is").xmap(dkz::a, $$0 -> $$0.c));
      private final List<aeq<cqj>> c;
      final Predicate<aeq<cqj>> d;

      c(List<aeq<cqj>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public arj<? extends dkz.f> a() {
         return a;
      }

      public dkz.e a(final dkz.g $$0) {
         class a extends dkz.k {
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
            return $$0 instanceof dkz.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dez a, dkz.r c) implements dkz.o {
      static final arj<dkz.d> d = arj.a(dez.b.xmap(dkz.d::new, dkz.d::b).fieldOf("result_state"));

      d(dez $$0) {
         this($$0, new dkz.r($$0));
      }

      @Override
      public arj<? extends dkz.o> a() {
         return d;
      }

      public dkz.u a(dkz.g $$0) {
         return this.c;
      }

      public dez b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dkz.g, dkz.e> {
      Codec<dkz.f> b = jb.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dkz.f> a(hr<Codec<? extends dkz.f>> $$0) {
         dkz.a($$0, "biome", dkz.c.a);
         dkz.a($$0, "noise_threshold", dkz.l.e);
         dkz.a($$0, "vertical_gradient", dkz.y.e);
         dkz.a($$0, "y_above", dkz.aa.e);
         dkz.a($$0, "water", dkz.z.e);
         dkz.a($$0, "temperature", dkz.v.c);
         dkz.a($$0, "steep", dkz.s.c);
         dkz.a($$0, "not", dkz.n.c);
         dkz.a($$0, "hole", dkz.h.c);
         dkz.a($$0, "above_preliminary_surface", dkz.a.c);
         return dkz.a($$0, "stone_depth", dkz.t.f);
      }

      arj<? extends dkz.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dla e;
      final dkz.e f = new dkz.g.d(this);
      final dkz.e g = new dkz.g.c(this);
      final dkz.e h = new dkz.g.b(this);
      final dkz.e i = new dkz.g.a();
      final dkw j;
      final dgv k;
      private final dkm l;
      private final Function<gu, he<cqj>> m;
      final dlf n;
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
      final gu.a z = new gu.a();
      Supplier<he<cqj>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dla $$0, dkw $$1, dgv $$2, dkm $$3, Function<gu, he<cqj>> $$4, hr<cqj> $$5, dlf $$6) {
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
            long $$2 = cos.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = arp.a(
               arp.a(
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

      final class a implements dkz.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dkz.j {
         b(dkz.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dkz.j {
         c(dkz.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dgv $$4 = this.c.k;
            int $$5 = $$4.a(dki.a.a, $$0, $$2);
            int $$6 = $$4.a(dki.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dki.a.a, $$7, $$1);
               int $$10 = $$4.a(dki.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dkz.k {
         d(dkz.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dkz.f {
      a;

      static final arj<dkz.h> c = arj.a(MapCodec.unit(a));

      @Override
      public arj<? extends dkz.f> a() {
         return c;
      }

      public dkz.e a(dkz.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dkz.e {
      protected final dkz.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dkz.g $$0) {
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

   abstract static class j extends dkz.i {
      protected j(dkz.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dkz.i {
      protected k(dkz.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(aeq<dzf.a> a, double c, double d) implements dkz.f {
      static final arj<dkz.l> e = arj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aeq.a(jc.ax).fieldOf("noise").forGetter(dkz.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dkz.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dkz.l::d)
                  )
                  .apply($$0, dkz.l::new)
         )
      );

      @Override
      public arj<? extends dkz.f> a() {
         return e;
      }

      public dkz.e a(final dkz.g $$0) {
         final dzf $$1 = $$0.j.a(this.a);

         class a extends dkz.j {
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

      public aeq<dzf.a> b() {
         return this.a;
      }
   }

   static record m(dkz.e a) implements dkz.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dkz.f a) implements dkz.f {
      static final arj<dkz.n> c = arj.a(dkz.f.b.xmap(dkz.n::new, dkz.n::b).fieldOf("invert"));

      @Override
      public arj<? extends dkz.f> a() {
         return c;
      }

      public dkz.e a(dkz.g $$0) {
         return new dkz.m(this.a.apply($$0));
      }

      public dkz.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dkz.g, dkz.u> {
      Codec<dkz.o> b = jb.af.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dkz.o> a(hr<Codec<? extends dkz.o>> $$0) {
         dkz.a($$0, "bandlands", dkz.b.c);
         dkz.a($$0, "block", dkz.d.d);
         dkz.a($$0, "sequence", dkz.q.c);
         return dkz.a($$0, "condition", dkz.x.d);
      }

      arj<? extends dkz.o> a();
   }

   static record p(List<dkz.u> a) implements dkz.u {
      @Nullable
      @Override
      public dez tryApply(int $$0, int $$1, int $$2) {
         for (dkz.u $$3 : this.a) {
            dez $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dkz.o> a) implements dkz.o {
      static final arj<dkz.q> c = arj.a(dkz.o.b.listOf().xmap(dkz.q::new, dkz.q::b).fieldOf("sequence"));

      @Override
      public arj<? extends dkz.o> a() {
         return c;
      }

      public dkz.u a(dkz.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dkz.u> $$1 = ImmutableList.builder();

            for (dkz.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dkz.p($$1.build());
         }
      }

      public List<dkz.o> b() {
         return this.a;
      }
   }

   static record r(dez a) implements dkz.u {
      @Override
      public dez tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dkz.f {
      a;

      static final arj<dkz.s> c = arj.a(MapCodec.unit(a));

      @Override
      public arj<? extends dkz.f> a() {
         return c;
      }

      public dkz.e a(dkz.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, dtt e) implements dkz.f {
      static final arj<dkz.t> f = arj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dkz.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dkz.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dkz.t::d),
                     dtt.c.fieldOf("surface_type").forGetter(dkz.t::e)
                  )
                  .apply($$0, dkz.t::new)
         )
      );

      @Override
      public arj<? extends dkz.f> a() {
         return f;
      }

      public dkz.e a(final dkz.g $$0) {
         final boolean $$1 = this.e == dtt.a;

         class a extends dkz.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)arp.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dez tryApply(int var1, int var2, int var3);
   }

   static enum v implements dkz.f {
      a;

      static final arj<dkz.v> c = arj.a(MapCodec.unit(a));

      @Override
      public arj<? extends dkz.f> a() {
         return c;
      }

      public dkz.e a(dkz.g $$0) {
         return $$0.f;
      }
   }

   static record w(dkz.e a, dkz.u b) implements dkz.u {
      @Nullable
      @Override
      public dez tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dkz.f a, dkz.o c) implements dkz.o {
      static final arj<dkz.x> d = arj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dkz.f.b.fieldOf("if_true").forGetter(dkz.x::b), dkz.o.b.fieldOf("then_run").forGetter(dkz.x::c)).apply($$0, dkz.x::new)
         )
      );

      @Override
      public arj<? extends dkz.o> a() {
         return d;
      }

      public dkz.u a(dkz.g $$0) {
         return new dkz.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dkz.f b() {
         return this.a;
      }
   }

   static record y(aer a, dlc c, dlc d) implements dkz.f {
      static final arj<dkz.y> e = arj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aer.a.fieldOf("random_name").forGetter(dkz.y::b),
                     dlc.a.fieldOf("true_at_and_below").forGetter(dkz.y::c),
                     dlc.a.fieldOf("false_at_and_above").forGetter(dkz.y::d)
                  )
                  .apply($$0, dkz.y::new)
         )
      );

      @Override
      public arj<? extends dkz.f> a() {
         return e;
      }

      public dkz.e a(final dkz.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dkv $$3 = $$0.j.a(this.b());

         class a extends dkz.k {
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
                  double $$1 = arp.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  aru $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public aer b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dkz.f {
      static final arj<dkz.z> e = arj.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dkz.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dkz.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dkz.z::d)
                  )
                  .apply($$0, dkz.z::new)
         )
      );

      @Override
      public arj<? extends dkz.f> a() {
         return e;
      }

      public dkz.e a(final dkz.g $$0) {
         class a extends dkz.k {
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
