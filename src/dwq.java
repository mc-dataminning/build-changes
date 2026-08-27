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

public class dwq {
   public static final dwq.f a = a(0, false, efk.b);
   public static final dwq.f b = a(0, true, efk.b);
   public static final dwq.f c = a(0, true, 6, efk.b);
   public static final dwq.f d = a(0, true, 30, efk.b);
   public static final dwq.f e = a(0, false, efk.a);
   public static final dwq.f f = a(0, true, efk.a);

   public static dwq.f a(int $$0, boolean $$1, efk $$2) {
      return new dwq.t($$0, $$1, 0, $$2);
   }

   public static dwq.f a(int $$0, boolean $$1, int $$2, efk $$3) {
      return new dwq.t($$0, $$1, $$2, $$3);
   }

   public static dwq.f a(dwq.f $$0) {
      return new dwq.n($$0);
   }

   public static dwq.f a(dwt $$0, int $$1) {
      return new dwq.aa($$0, $$1, false);
   }

   public static dwq.f b(dwt $$0, int $$1) {
      return new dwq.aa($$0, $$1, true);
   }

   public static dwq.f a(int $$0, int $$1) {
      return new dwq.z($$0, $$1, false);
   }

   public static dwq.f b(int $$0, int $$1) {
      return new dwq.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dwq.f a(akg<dbc>... $$0) {
      return a(List.of($$0));
   }

   private static dwq.c a(List<akg<dbc>> $$0) {
      return new dwq.c($$0);
   }

   public static dwq.f a(akg<eld.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dwq.f a(akg<eld.a> $$0, double $$1, double $$2) {
      return new dwq.l($$0, $$1, $$2);
   }

   public static dwq.f a(String $$0, dwt $$1, dwt $$2) {
      return new dwq.y(new akh($$0), $$1, $$2);
   }

   public static dwq.f a() {
      return dwq.s.a;
   }

   public static dwq.f b() {
      return dwq.h.a;
   }

   public static dwq.f c() {
      return dwq.a.a;
   }

   public static dwq.f d() {
      return dwq.v.a;
   }

   public static dwq.o a(dwq.f $$0, dwq.o $$1) {
      return new dwq.x($$0, $$1);
   }

   public static dwq.o a(dwq.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dwq.q(Arrays.asList($$0));
      }
   }

   public static dwq.o a(dqh $$0) {
      return new dwq.d($$0);
   }

   public static dwq.o e() {
      return dwq.b.a;
   }

   static <A> Codec<? extends A> a(jj<Codec<? extends A>> $$0, String $$1, axt<? extends A> $$2) {
      return jj.a($$0, $$1, $$2.a());
   }

   static enum a implements dwq.f {
      a;

      static final axt<dwq.a> c = axt.a(MapCodec.unit(a));

      @Override
      public axt<? extends dwq.f> a() {
         return c;
      }

      public dwq.e a(dwq.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dwt a, int c, boolean d) implements dwq.f {
      static final axt<dwq.aa> e = axt.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dwt.a.fieldOf("anchor").forGetter(dwq.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dwq.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dwq.aa::d)
                  )
                  .apply($$0, dwq.aa::new)
         )
      );

      @Override
      public axt<? extends dwq.f> a() {
         return e;
      }

      public dwq.e a(final dwq.g $$0) {
         class a extends dwq.k {
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

      public dwt b() {
         return this.a;
      }
   }

   static enum b implements dwq.o {
      a;

      static final axt<dwq.b> c = axt.a(MapCodec.unit(a));

      @Override
      public axt<? extends dwq.o> a() {
         return c;
      }

      public dwq.u a(dwq.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dwq.f {
      static final axt<dwq.c> a = axt.a(akg.a(le.az).listOf().fieldOf("biome_is").xmap(dwq::a, $$0 -> $$0.c));
      private final List<akg<dbc>> c;
      final Predicate<akg<dbc>> d;

      c(List<akg<dbc>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public axt<? extends dwq.f> a() {
         return a;
      }

      public dwq.e a(final dwq.g $$0) {
         class a extends dwq.k {
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
            return $$0 instanceof dwq.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dqh a, dwq.r c) implements dwq.o {
      static final axt<dwq.d> d = axt.a(dqh.b.xmap(dwq.d::new, dwq.d::b).fieldOf("result_state"));

      d(dqh $$0) {
         this($$0, new dwq.r($$0));
      }

      @Override
      public axt<? extends dwq.o> a() {
         return d;
      }

      public dwq.u a(dwq.g $$0) {
         return this.c;
      }

      public dqh b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dwq.g, dwq.e> {
      Codec<dwq.f> b = ld.ad.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dwq.f> a(jj<Codec<? extends dwq.f>> $$0) {
         dwq.a($$0, "biome", dwq.c.a);
         dwq.a($$0, "noise_threshold", dwq.l.e);
         dwq.a($$0, "vertical_gradient", dwq.y.e);
         dwq.a($$0, "y_above", dwq.aa.e);
         dwq.a($$0, "water", dwq.z.e);
         dwq.a($$0, "temperature", dwq.v.c);
         dwq.a($$0, "steep", dwq.s.c);
         dwq.a($$0, "not", dwq.n.c);
         dwq.a($$0, "hole", dwq.h.c);
         dwq.a($$0, "above_preliminary_surface", dwq.a.c);
         return dwq.a($$0, "stone_depth", dwq.t.f);
      }

      axt<? extends dwq.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dwr e;
      final dwq.e f = new dwq.g.d(this);
      final dwq.e g = new dwq.g.c(this);
      final dwq.e h = new dwq.g.b(this);
      final dwq.e i = new dwq.g.a();
      final dwn j;
      final dsd k;
      private final dwd l;
      private final Function<in, iw<dbc>> m;
      final dww n;
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
      final in.a z = new in.a();
      Supplier<iw<dbc>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dwr $$0, dwn $$1, dsd $$2, dwd $$3, Function<in, iw<dbc>> $$4, jj<dbc> $$5, dww $$6) {
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
            long $$2 = czk.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = axz.a(
               axz.a(
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

      final class a implements dwq.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dwq.j {
         b(dwq.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dwq.j {
         c(dwq.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dsd $$4 = this.c.k;
            int $$5 = $$4.a(dvz.a.a, $$0, $$2);
            int $$6 = $$4.a(dvz.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dvz.a.a, $$7, $$1);
               int $$10 = $$4.a(dvz.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dwq.k {
         d(dwq.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dwq.f {
      a;

      static final axt<dwq.h> c = axt.a(MapCodec.unit(a));

      @Override
      public axt<? extends dwq.f> a() {
         return c;
      }

      public dwq.e a(dwq.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dwq.e {
      protected final dwq.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dwq.g $$0) {
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

   abstract static class j extends dwq.i {
      protected j(dwq.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dwq.i {
      protected k(dwq.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(akg<eld.a> a, double c, double d) implements dwq.f {
      static final axt<dwq.l> e = axt.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     akg.a(le.aH).fieldOf("noise").forGetter(dwq.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dwq.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dwq.l::d)
                  )
                  .apply($$0, dwq.l::new)
         )
      );

      @Override
      public axt<? extends dwq.f> a() {
         return e;
      }

      public dwq.e a(final dwq.g $$0) {
         final eld $$1 = $$0.j.a(this.a);

         class a extends dwq.j {
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

      public akg<eld.a> b() {
         return this.a;
      }
   }

   static record m(dwq.e a) implements dwq.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dwq.f a) implements dwq.f {
      static final axt<dwq.n> c = axt.a(dwq.f.b.xmap(dwq.n::new, dwq.n::b).fieldOf("invert"));

      @Override
      public axt<? extends dwq.f> a() {
         return c;
      }

      public dwq.e a(dwq.g $$0) {
         return new dwq.m(this.a.apply($$0));
      }

      public dwq.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dwq.g, dwq.u> {
      Codec<dwq.o> b = ld.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dwq.o> a(jj<Codec<? extends dwq.o>> $$0) {
         dwq.a($$0, "bandlands", dwq.b.c);
         dwq.a($$0, "block", dwq.d.d);
         dwq.a($$0, "sequence", dwq.q.c);
         return dwq.a($$0, "condition", dwq.x.d);
      }

      axt<? extends dwq.o> a();
   }

   static record p(List<dwq.u> a) implements dwq.u {
      @Nullable
      @Override
      public dqh tryApply(int $$0, int $$1, int $$2) {
         for (dwq.u $$3 : this.a) {
            dqh $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dwq.o> a) implements dwq.o {
      static final axt<dwq.q> c = axt.a(dwq.o.b.listOf().xmap(dwq.q::new, dwq.q::b).fieldOf("sequence"));

      @Override
      public axt<? extends dwq.o> a() {
         return c;
      }

      public dwq.u a(dwq.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dwq.u> $$1 = ImmutableList.builder();

            for (dwq.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dwq.p($$1.build());
         }
      }

      public List<dwq.o> b() {
         return this.a;
      }
   }

   static record r(dqh a) implements dwq.u {
      @Override
      public dqh tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dwq.f {
      a;

      static final axt<dwq.s> c = axt.a(MapCodec.unit(a));

      @Override
      public axt<? extends dwq.f> a() {
         return c;
      }

      public dwq.e a(dwq.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, efk e) implements dwq.f {
      static final axt<dwq.t> f = axt.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dwq.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dwq.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dwq.t::d),
                     efk.c.fieldOf("surface_type").forGetter(dwq.t::e)
                  )
                  .apply($$0, dwq.t::new)
         )
      );

      @Override
      public axt<? extends dwq.f> a() {
         return f;
      }

      public dwq.e a(final dwq.g $$0) {
         final boolean $$1 = this.e == efk.a;

         class a extends dwq.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)axz.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dqh tryApply(int var1, int var2, int var3);
   }

   static enum v implements dwq.f {
      a;

      static final axt<dwq.v> c = axt.a(MapCodec.unit(a));

      @Override
      public axt<? extends dwq.f> a() {
         return c;
      }

      public dwq.e a(dwq.g $$0) {
         return $$0.f;
      }
   }

   static record w(dwq.e a, dwq.u b) implements dwq.u {
      @Nullable
      @Override
      public dqh tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dwq.f a, dwq.o c) implements dwq.o {
      static final axt<dwq.x> d = axt.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dwq.f.b.fieldOf("if_true").forGetter(dwq.x::b), dwq.o.b.fieldOf("then_run").forGetter(dwq.x::c)).apply($$0, dwq.x::new)
         )
      );

      @Override
      public axt<? extends dwq.o> a() {
         return d;
      }

      public dwq.u a(dwq.g $$0) {
         return new dwq.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dwq.f b() {
         return this.a;
      }
   }

   static record y(akh a, dwt c, dwt d) implements dwq.f {
      static final axt<dwq.y> e = axt.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     akh.a.fieldOf("random_name").forGetter(dwq.y::b),
                     dwt.a.fieldOf("true_at_and_below").forGetter(dwq.y::c),
                     dwt.a.fieldOf("false_at_and_above").forGetter(dwq.y::d)
                  )
                  .apply($$0, dwq.y::new)
         )
      );

      @Override
      public axt<? extends dwq.f> a() {
         return e;
      }

      public dwq.e a(final dwq.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dwm $$3 = $$0.j.a(this.b());

         class a extends dwq.k {
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
                  double $$1 = axz.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  ayg $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public akh b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dwq.f {
      static final axt<dwq.z> e = axt.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dwq.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dwq.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dwq.z::d)
                  )
                  .apply($$0, dwq.z::new)
         )
      );

      @Override
      public axt<? extends dwq.f> a() {
         return e;
      }

      public dwq.e a(final dwq.g $$0) {
         class a extends dwq.k {
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
