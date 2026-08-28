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

public class edi {
   public static final edi.f a = a(0, false, emf.b);
   public static final edi.f b = a(0, true, emf.b);
   public static final edi.f c = a(0, true, 6, emf.b);
   public static final edi.f d = a(0, true, 30, emf.b);
   public static final edi.f e = a(0, false, emf.a);
   public static final edi.f f = a(0, true, emf.a);

   public static edi.f a(int $$0, boolean $$1, emf $$2) {
      return new edi.t($$0, $$1, 0, $$2);
   }

   public static edi.f a(int $$0, boolean $$1, int $$2, emf $$3) {
      return new edi.t($$0, $$1, $$2, $$3);
   }

   public static edi.f a(edi.f $$0) {
      return new edi.n($$0);
   }

   public static edi.f a(edl $$0, int $$1) {
      return new edi.aa($$0, $$1, false);
   }

   public static edi.f b(edl $$0, int $$1) {
      return new edi.aa($$0, $$1, true);
   }

   public static edi.f a(int $$0, int $$1) {
      return new edi.z($$0, $$1, false);
   }

   public static edi.f b(int $$0, int $$1) {
      return new edi.z($$0, $$1, true);
   }

   @SafeVarargs
   public static edi.f a(aku<dhj>... $$0) {
      return a(List.of($$0));
   }

   private static edi.c a(List<aku<dhj>> $$0) {
      return new edi.c($$0);
   }

   public static edi.f a(aku<esb.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static edi.f a(aku<esb.a> $$0, double $$1, double $$2) {
      return new edi.l($$0, $$1, $$2);
   }

   public static edi.f a(String $$0, edl $$1, edl $$2) {
      return new edi.y(akv.a($$0), $$1, $$2);
   }

   public static edi.f a() {
      return edi.s.a;
   }

   public static edi.f b() {
      return edi.h.a;
   }

   public static edi.f c() {
      return edi.a.a;
   }

   public static edi.f d() {
      return edi.v.a;
   }

   public static edi.o a(edi.f $$0, edi.o $$1) {
      return new edi.x($$0, $$1);
   }

   public static edi.o a(edi.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new edi.q(Arrays.asList($$0));
      }
   }

   public static edi.o a(dww $$0) {
      return new edi.d($$0);
   }

   public static edi.o e() {
      return edi.b.a;
   }

   static <A> MapCodec<? extends A> a(ke<MapCodec<? extends A>> $$0, String $$1, ays<? extends A> $$2) {
      return ke.a($$0, $$1, $$2.a());
   }

   static enum a implements edi.f {
      a;

      static final ays<edi.a> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends edi.f> a() {
         return c;
      }

      public edi.e a(edi.g $$0) {
         return $$0.i;
      }
   }

   static record aa(edl a, int c, boolean d) implements edi.f {
      static final ays<edi.aa> e = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     edl.a.fieldOf("anchor").forGetter(edi.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(edi.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(edi.aa::d)
                  )
                  .apply($$0, edi.aa::new)
         )
      );

      @Override
      public ays<? extends edi.f> a() {
         return e;
      }

      public edi.e a(final edi.g $$0) {
         class a extends edi.k {
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

      public edl b() {
         return this.a;
      }
   }

   static enum b implements edi.o {
      a;

      static final ays<edi.b> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends edi.o> a() {
         return c;
      }

      public edi.u a(edi.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements edi.f {
      static final ays<edi.c> a = ays.a(aku.a(mc.aI).listOf().fieldOf("biome_is").xmap(edi::a, $$0 -> $$0.c));
      private final List<aku<dhj>> c;
      final Predicate<aku<dhj>> d;

      c(List<aku<dhj>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public ays<? extends edi.f> a() {
         return a;
      }

      public edi.e a(final edi.g $$0) {
         class a extends edi.k {
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
            return $$0 instanceof edi.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dww a, edi.r c) implements edi.o {
      static final ays<edi.d> d = ays.a(dww.a.xmap(edi.d::new, edi.d::b).fieldOf("result_state"));

      d(dww $$0) {
         this($$0, new edi.r($$0));
      }

      @Override
      public ays<? extends edi.o> a() {
         return d;
      }

      public edi.u a(edi.g $$0) {
         return this.c;
      }

      public dww b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<edi.g, edi.e> {
      Codec<edi.f> b = mb.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends edi.f> a(ke<MapCodec<? extends edi.f>> $$0) {
         edi.a($$0, "biome", edi.c.a);
         edi.a($$0, "noise_threshold", edi.l.e);
         edi.a($$0, "vertical_gradient", edi.y.e);
         edi.a($$0, "y_above", edi.aa.e);
         edi.a($$0, "water", edi.z.e);
         edi.a($$0, "temperature", edi.v.c);
         edi.a($$0, "steep", edi.s.c);
         edi.a($$0, "not", edi.n.c);
         edi.a($$0, "hole", edi.h.c);
         edi.a($$0, "above_preliminary_surface", edi.a.c);
         return edi.a($$0, "stone_depth", edi.t.f);
      }

      ays<? extends edi.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final edj e;
      final edi.e f = new edi.g.d(this);
      final edi.e g = new edi.g.c(this);
      final edi.e h = new edi.g.b(this);
      final edi.e i = new edi.g.a();
      final edf j;
      final dyr k;
      private final ecv l;
      private final Function<ji, jr<dhj>> m;
      final edo n;
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
      final ji.a z = new ji.a();
      Supplier<jr<dhj>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(edj $$0, edf $$1, dyr $$2, ecv $$3, Function<ji, jr<dhj>> $$4, ke<dhj> $$5, edo $$6) {
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
            long $$2 = dfn.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = ayz.a(
               ayz.a(
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

      final class a implements edi.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends edi.j {
         b(edi.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends edi.j {
         c(edi.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dyr $$4 = this.c.k;
            int $$5 = $$4.a(ecr.a.a, $$0, $$2);
            int $$6 = $$4.a(ecr.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(ecr.a.a, $$7, $$1);
               int $$10 = $$4.a(ecr.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends edi.k {
         d(edi.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements edi.f {
      a;

      static final ays<edi.h> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends edi.f> a() {
         return c;
      }

      public edi.e a(edi.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements edi.e {
      protected final edi.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(edi.g $$0) {
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

   abstract static class j extends edi.i {
      protected j(edi.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends edi.i {
      protected k(edi.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(aku<esb.a> a, double c, double d) implements edi.f {
      static final ays<edi.l> e = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aku.a(mc.aS).fieldOf("noise").forGetter(edi.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(edi.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(edi.l::d)
                  )
                  .apply($$0, edi.l::new)
         )
      );

      @Override
      public ays<? extends edi.f> a() {
         return e;
      }

      public edi.e a(final edi.g $$0) {
         final esb $$1 = $$0.j.a(this.a);

         class a extends edi.j {
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

      public aku<esb.a> b() {
         return this.a;
      }
   }

   static record m(edi.e a) implements edi.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(edi.f a) implements edi.f {
      static final ays<edi.n> c = ays.a(edi.f.b.xmap(edi.n::new, edi.n::b).fieldOf("invert"));

      @Override
      public ays<? extends edi.f> a() {
         return c;
      }

      public edi.e a(edi.g $$0) {
         return new edi.m(this.a.apply($$0));
      }

      public edi.f b() {
         return this.a;
      }
   }

   public interface o extends Function<edi.g, edi.u> {
      Codec<edi.o> b = mb.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends edi.o> a(ke<MapCodec<? extends edi.o>> $$0) {
         edi.a($$0, "bandlands", edi.b.c);
         edi.a($$0, "block", edi.d.d);
         edi.a($$0, "sequence", edi.q.c);
         return edi.a($$0, "condition", edi.x.d);
      }

      ays<? extends edi.o> a();
   }

   static record p(List<edi.u> a) implements edi.u {
      @Nullable
      @Override
      public dww tryApply(int $$0, int $$1, int $$2) {
         for (edi.u $$3 : this.a) {
            dww $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<edi.o> a) implements edi.o {
      static final ays<edi.q> c = ays.a(edi.o.b.listOf().xmap(edi.q::new, edi.q::b).fieldOf("sequence"));

      @Override
      public ays<? extends edi.o> a() {
         return c;
      }

      public edi.u a(edi.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<edi.u> $$1 = ImmutableList.builder();

            for (edi.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new edi.p($$1.build());
         }
      }

      public List<edi.o> b() {
         return this.a;
      }
   }

   static record r(dww a) implements edi.u {
      @Override
      public dww tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements edi.f {
      a;

      static final ays<edi.s> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends edi.f> a() {
         return c;
      }

      public edi.e a(edi.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, emf e) implements edi.f {
      static final ays<edi.t> f = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(edi.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(edi.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(edi.t::d),
                     emf.c.fieldOf("surface_type").forGetter(edi.t::e)
                  )
                  .apply($$0, edi.t::new)
         )
      );

      @Override
      public ays<? extends edi.f> a() {
         return f;
      }

      public edi.e a(final edi.g $$0) {
         final boolean $$1 = this.e == emf.a;

         class a extends edi.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)ayz.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dww tryApply(int var1, int var2, int var3);
   }

   static enum v implements edi.f {
      a;

      static final ays<edi.v> c = ays.a(MapCodec.unit(a));

      @Override
      public ays<? extends edi.f> a() {
         return c;
      }

      public edi.e a(edi.g $$0) {
         return $$0.f;
      }
   }

   static record w(edi.e a, edi.u b) implements edi.u {
      @Nullable
      @Override
      public dww tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(edi.f a, edi.o c) implements edi.o {
      static final ays<edi.x> d = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(edi.f.b.fieldOf("if_true").forGetter(edi.x::b), edi.o.b.fieldOf("then_run").forGetter(edi.x::c)).apply($$0, edi.x::new)
         )
      );

      @Override
      public ays<? extends edi.o> a() {
         return d;
      }

      public edi.u a(edi.g $$0) {
         return new edi.w(this.a.apply($$0), this.c.apply($$0));
      }

      public edi.f b() {
         return this.a;
      }
   }

   static record y(akv a, edl c, edl d) implements edi.f {
      static final ays<edi.y> e = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     akv.a.fieldOf("random_name").forGetter(edi.y::b),
                     edl.a.fieldOf("true_at_and_below").forGetter(edi.y::c),
                     edl.a.fieldOf("false_at_and_above").forGetter(edi.y::d)
                  )
                  .apply($$0, edi.y::new)
         )
      );

      @Override
      public ays<? extends edi.f> a() {
         return e;
      }

      public edi.e a(final edi.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final ede $$3 = $$0.j.a(this.b());

         class a extends edi.k {
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
                  double $$1 = ayz.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  azh $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public akv b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements edi.f {
      static final ays<edi.z> e = ays.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(edi.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(edi.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(edi.z::d)
                  )
                  .apply($$0, edi.z::new)
         )
      );

      @Override
      public ays<? extends edi.f> a() {
         return e;
      }

      public edi.e a(final edi.g $$0) {
         class a extends edi.k {
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
