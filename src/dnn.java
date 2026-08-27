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

public class dnn {
   public static final dnn.f a = a(0, false, dwh.b);
   public static final dnn.f b = a(0, true, dwh.b);
   public static final dnn.f c = a(0, true, 6, dwh.b);
   public static final dnn.f d = a(0, true, 30, dwh.b);
   public static final dnn.f e = a(0, false, dwh.a);
   public static final dnn.f f = a(0, true, dwh.a);

   public static dnn.f a(int $$0, boolean $$1, dwh $$2) {
      return new dnn.t($$0, $$1, 0, $$2);
   }

   public static dnn.f a(int $$0, boolean $$1, int $$2, dwh $$3) {
      return new dnn.t($$0, $$1, $$2, $$3);
   }

   public static dnn.f a(dnn.f $$0) {
      return new dnn.n($$0);
   }

   public static dnn.f a(dnq $$0, int $$1) {
      return new dnn.aa($$0, $$1, false);
   }

   public static dnn.f b(dnq $$0, int $$1) {
      return new dnn.aa($$0, $$1, true);
   }

   public static dnn.f a(int $$0, int $$1) {
      return new dnn.z($$0, $$1, false);
   }

   public static dnn.f b(int $$0, int $$1) {
      return new dnn.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dnn.f a(agl<ctd>... $$0) {
      return a(List.of($$0));
   }

   private static dnn.c a(List<agl<ctd>> $$0) {
      return new dnn.c($$0);
   }

   public static dnn.f a(agl<eca.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dnn.f a(agl<eca.a> $$0, double $$1, double $$2) {
      return new dnn.l($$0, $$1, $$2);
   }

   public static dnn.f a(String $$0, dnq $$1, dnq $$2) {
      return new dnn.y(new agm($$0), $$1, $$2);
   }

   public static dnn.f a() {
      return dnn.s.a;
   }

   public static dnn.f b() {
      return dnn.h.a;
   }

   public static dnn.f c() {
      return dnn.a.a;
   }

   public static dnn.f d() {
      return dnn.v.a;
   }

   public static dnn.o a(dnn.f $$0, dnn.o $$1) {
      return new dnn.x($$0, $$1);
   }

   public static dnn.o a(dnn.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dnn.q(Arrays.asList($$0));
      }
   }

   public static dnn.o a(dhn $$0) {
      return new dnn.d($$0);
   }

   public static dnn.o e() {
      return dnn.b.a;
   }

   static <A> Codec<? extends A> a(is<Codec<? extends A>> $$0, String $$1, atk<? extends A> $$2) {
      return is.a($$0, $$1, $$2.a());
   }

   static enum a implements dnn.f {
      a;

      static final atk<dnn.a> c = atk.a(MapCodec.unit(a));

      @Override
      public atk<? extends dnn.f> a() {
         return c;
      }

      public dnn.e a(dnn.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dnq a, int c, boolean d) implements dnn.f {
      static final atk<dnn.aa> e = atk.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dnq.a.fieldOf("anchor").forGetter(dnn.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dnn.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dnn.aa::d)
                  )
                  .apply($$0, dnn.aa::new)
         )
      );

      @Override
      public atk<? extends dnn.f> a() {
         return e;
      }

      public dnn.e a(final dnn.g $$0) {
         class a extends dnn.k {
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

      public dnq b() {
         return this.a;
      }
   }

   static enum b implements dnn.o {
      a;

      static final atk<dnn.b> c = atk.a(MapCodec.unit(a));

      @Override
      public atk<? extends dnn.o> a() {
         return c;
      }

      public dnn.u a(dnn.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dnn.f {
      static final atk<dnn.c> a = atk.a(agl.a(kd.ar).listOf().fieldOf("biome_is").xmap(dnn::a, $$0 -> $$0.c));
      private final List<agl<ctd>> c;
      final Predicate<agl<ctd>> d;

      c(List<agl<ctd>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public atk<? extends dnn.f> a() {
         return a;
      }

      public dnn.e a(final dnn.g $$0) {
         class a extends dnn.k {
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
            return $$0 instanceof dnn.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dhn a, dnn.r c) implements dnn.o {
      static final atk<dnn.d> d = atk.a(dhn.b.xmap(dnn.d::new, dnn.d::b).fieldOf("result_state"));

      d(dhn $$0) {
         this($$0, new dnn.r($$0));
      }

      @Override
      public atk<? extends dnn.o> a() {
         return d;
      }

      public dnn.u a(dnn.g $$0) {
         return this.c;
      }

      public dhn b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dnn.g, dnn.e> {
      Codec<dnn.f> b = kc.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dnn.f> a(is<Codec<? extends dnn.f>> $$0) {
         dnn.a($$0, "biome", dnn.c.a);
         dnn.a($$0, "noise_threshold", dnn.l.e);
         dnn.a($$0, "vertical_gradient", dnn.y.e);
         dnn.a($$0, "y_above", dnn.aa.e);
         dnn.a($$0, "water", dnn.z.e);
         dnn.a($$0, "temperature", dnn.v.c);
         dnn.a($$0, "steep", dnn.s.c);
         dnn.a($$0, "not", dnn.n.c);
         dnn.a($$0, "hole", dnn.h.c);
         dnn.a($$0, "above_preliminary_surface", dnn.a.c);
         return dnn.a($$0, "stone_depth", dnn.t.f);
      }

      atk<? extends dnn.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dno e;
      final dnn.e f = new dnn.g.d(this);
      final dnn.e g = new dnn.g.c(this);
      final dnn.e h = new dnn.g.b(this);
      final dnn.e i = new dnn.g.a();
      final dnk j;
      final djj k;
      private final dna l;
      private final Function<hx, ig<ctd>> m;
      final dnt n;
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
      final hx.a z = new hx.a();
      Supplier<ig<ctd>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dno $$0, dnk $$1, djj $$2, dna $$3, Function<hx, ig<ctd>> $$4, is<ctd> $$5, dnt $$6) {
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
            long $$2 = crm.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = atq.a(
               atq.a(
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

      final class a implements dnn.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dnn.j {
         b(dnn.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dnn.j {
         c(dnn.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            djj $$4 = this.c.k;
            int $$5 = $$4.a(dmw.a.a, $$0, $$2);
            int $$6 = $$4.a(dmw.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dmw.a.a, $$7, $$1);
               int $$10 = $$4.a(dmw.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dnn.k {
         d(dnn.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dnn.f {
      a;

      static final atk<dnn.h> c = atk.a(MapCodec.unit(a));

      @Override
      public atk<? extends dnn.f> a() {
         return c;
      }

      public dnn.e a(dnn.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dnn.e {
      protected final dnn.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dnn.g $$0) {
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

   abstract static class j extends dnn.i {
      protected j(dnn.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dnn.i {
      protected k(dnn.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(agl<eca.a> a, double c, double d) implements dnn.f {
      static final atk<dnn.l> e = atk.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     agl.a(kd.az).fieldOf("noise").forGetter(dnn.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dnn.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dnn.l::d)
                  )
                  .apply($$0, dnn.l::new)
         )
      );

      @Override
      public atk<? extends dnn.f> a() {
         return e;
      }

      public dnn.e a(final dnn.g $$0) {
         final eca $$1 = $$0.j.a(this.a);

         class a extends dnn.j {
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

      public agl<eca.a> b() {
         return this.a;
      }
   }

   static record m(dnn.e a) implements dnn.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dnn.f a) implements dnn.f {
      static final atk<dnn.n> c = atk.a(dnn.f.b.xmap(dnn.n::new, dnn.n::b).fieldOf("invert"));

      @Override
      public atk<? extends dnn.f> a() {
         return c;
      }

      public dnn.e a(dnn.g $$0) {
         return new dnn.m(this.a.apply($$0));
      }

      public dnn.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dnn.g, dnn.u> {
      Codec<dnn.o> b = kc.af.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dnn.o> a(is<Codec<? extends dnn.o>> $$0) {
         dnn.a($$0, "bandlands", dnn.b.c);
         dnn.a($$0, "block", dnn.d.d);
         dnn.a($$0, "sequence", dnn.q.c);
         return dnn.a($$0, "condition", dnn.x.d);
      }

      atk<? extends dnn.o> a();
   }

   static record p(List<dnn.u> a) implements dnn.u {
      @Nullable
      @Override
      public dhn tryApply(int $$0, int $$1, int $$2) {
         for (dnn.u $$3 : this.a) {
            dhn $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dnn.o> a) implements dnn.o {
      static final atk<dnn.q> c = atk.a(dnn.o.b.listOf().xmap(dnn.q::new, dnn.q::b).fieldOf("sequence"));

      @Override
      public atk<? extends dnn.o> a() {
         return c;
      }

      public dnn.u a(dnn.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dnn.u> $$1 = ImmutableList.builder();

            for (dnn.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dnn.p($$1.build());
         }
      }

      public List<dnn.o> b() {
         return this.a;
      }
   }

   static record r(dhn a) implements dnn.u {
      @Override
      public dhn tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dnn.f {
      a;

      static final atk<dnn.s> c = atk.a(MapCodec.unit(a));

      @Override
      public atk<? extends dnn.f> a() {
         return c;
      }

      public dnn.e a(dnn.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, dwh e) implements dnn.f {
      static final atk<dnn.t> f = atk.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dnn.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dnn.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dnn.t::d),
                     dwh.c.fieldOf("surface_type").forGetter(dnn.t::e)
                  )
                  .apply($$0, dnn.t::new)
         )
      );

      @Override
      public atk<? extends dnn.f> a() {
         return f;
      }

      public dnn.e a(final dnn.g $$0) {
         final boolean $$1 = this.e == dwh.a;

         class a extends dnn.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)atq.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dhn tryApply(int var1, int var2, int var3);
   }

   static enum v implements dnn.f {
      a;

      static final atk<dnn.v> c = atk.a(MapCodec.unit(a));

      @Override
      public atk<? extends dnn.f> a() {
         return c;
      }

      public dnn.e a(dnn.g $$0) {
         return $$0.f;
      }
   }

   static record w(dnn.e a, dnn.u b) implements dnn.u {
      @Nullable
      @Override
      public dhn tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dnn.f a, dnn.o c) implements dnn.o {
      static final atk<dnn.x> d = atk.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dnn.f.b.fieldOf("if_true").forGetter(dnn.x::b), dnn.o.b.fieldOf("then_run").forGetter(dnn.x::c)).apply($$0, dnn.x::new)
         )
      );

      @Override
      public atk<? extends dnn.o> a() {
         return d;
      }

      public dnn.u a(dnn.g $$0) {
         return new dnn.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dnn.f b() {
         return this.a;
      }
   }

   static record y(agm a, dnq c, dnq d) implements dnn.f {
      static final atk<dnn.y> e = atk.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     agm.a.fieldOf("random_name").forGetter(dnn.y::b),
                     dnq.a.fieldOf("true_at_and_below").forGetter(dnn.y::c),
                     dnq.a.fieldOf("false_at_and_above").forGetter(dnn.y::d)
                  )
                  .apply($$0, dnn.y::new)
         )
      );

      @Override
      public atk<? extends dnn.f> a() {
         return e;
      }

      public dnn.e a(final dnn.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dnj $$3 = $$0.j.a(this.b());

         class a extends dnn.k {
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
                  double $$1 = atq.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  atw $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public agm b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dnn.f {
      static final atk<dnn.z> e = atk.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dnn.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dnn.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dnn.z::d)
                  )
                  .apply($$0, dnn.z::new)
         )
      );

      @Override
      public atk<? extends dnn.f> a() {
         return e;
      }

      public dnn.e a(final dnn.g $$0) {
         class a extends dnn.k {
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
