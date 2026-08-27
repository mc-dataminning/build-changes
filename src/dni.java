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

public class dni {
   public static final dni.f a = a(0, false, dwc.b);
   public static final dni.f b = a(0, true, dwc.b);
   public static final dni.f c = a(0, true, 6, dwc.b);
   public static final dni.f d = a(0, true, 30, dwc.b);
   public static final dni.f e = a(0, false, dwc.a);
   public static final dni.f f = a(0, true, dwc.a);

   public static dni.f a(int $$0, boolean $$1, dwc $$2) {
      return new dni.t($$0, $$1, 0, $$2);
   }

   public static dni.f a(int $$0, boolean $$1, int $$2, dwc $$3) {
      return new dni.t($$0, $$1, $$2, $$3);
   }

   public static dni.f a(dni.f $$0) {
      return new dni.n($$0);
   }

   public static dni.f a(dnl $$0, int $$1) {
      return new dni.aa($$0, $$1, false);
   }

   public static dni.f b(dnl $$0, int $$1) {
      return new dni.aa($$0, $$1, true);
   }

   public static dni.f a(int $$0, int $$1) {
      return new dni.z($$0, $$1, false);
   }

   public static dni.f b(int $$0, int $$1) {
      return new dni.z($$0, $$1, true);
   }

   @SafeVarargs
   public static dni.f a(agh<csy>... $$0) {
      return a(List.of($$0));
   }

   private static dni.c a(List<agh<csy>> $$0) {
      return new dni.c($$0);
   }

   public static dni.f a(agh<ebv.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static dni.f a(agh<ebv.a> $$0, double $$1, double $$2) {
      return new dni.l($$0, $$1, $$2);
   }

   public static dni.f a(String $$0, dnl $$1, dnl $$2) {
      return new dni.y(new agi($$0), $$1, $$2);
   }

   public static dni.f a() {
      return dni.s.a;
   }

   public static dni.f b() {
      return dni.h.a;
   }

   public static dni.f c() {
      return dni.a.a;
   }

   public static dni.f d() {
      return dni.v.a;
   }

   public static dni.o a(dni.f $$0, dni.o $$1) {
      return new dni.x($$0, $$1);
   }

   public static dni.o a(dni.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new dni.q(Arrays.asList($$0));
      }
   }

   public static dni.o a(dhi $$0) {
      return new dni.d($$0);
   }

   public static dni.o e() {
      return dni.b.a;
   }

   static <A> Codec<? extends A> a(io<Codec<? extends A>> $$0, String $$1, atg<? extends A> $$2) {
      return io.a($$0, $$1, $$2.a());
   }

   static enum a implements dni.f {
      a;

      static final atg<dni.a> c = atg.a(MapCodec.unit(a));

      @Override
      public atg<? extends dni.f> a() {
         return c;
      }

      public dni.e a(dni.g $$0) {
         return $$0.i;
      }
   }

   static record aa(dnl a, int c, boolean d) implements dni.f {
      static final atg<dni.aa> e = atg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dnl.a.fieldOf("anchor").forGetter(dni.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dni.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dni.aa::d)
                  )
                  .apply($$0, dni.aa::new)
         )
      );

      @Override
      public atg<? extends dni.f> a() {
         return e;
      }

      public dni.e a(final dni.g $$0) {
         class a extends dni.k {
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

      public dnl b() {
         return this.a;
      }
   }

   static enum b implements dni.o {
      a;

      static final atg<dni.b> c = atg.a(MapCodec.unit(a));

      @Override
      public atg<? extends dni.o> a() {
         return c;
      }

      public dni.u a(dni.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements dni.f {
      static final atg<dni.c> a = atg.a(agh.a(jz.ar).listOf().fieldOf("biome_is").xmap(dni::a, $$0 -> $$0.c));
      private final List<agh<csy>> c;
      final Predicate<agh<csy>> d;

      c(List<agh<csy>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public atg<? extends dni.f> a() {
         return a;
      }

      public dni.e a(final dni.g $$0) {
         class a extends dni.k {
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
            return $$0 instanceof dni.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(dhi a, dni.r c) implements dni.o {
      static final atg<dni.d> d = atg.a(dhi.b.xmap(dni.d::new, dni.d::b).fieldOf("result_state"));

      d(dhi $$0) {
         this($$0, new dni.r($$0));
      }

      @Override
      public atg<? extends dni.o> a() {
         return d;
      }

      public dni.u a(dni.g $$0) {
         return this.c;
      }

      public dhi b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<dni.g, dni.e> {
      Codec<dni.f> b = jy.ae.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dni.f> a(io<Codec<? extends dni.f>> $$0) {
         dni.a($$0, "biome", dni.c.a);
         dni.a($$0, "noise_threshold", dni.l.e);
         dni.a($$0, "vertical_gradient", dni.y.e);
         dni.a($$0, "y_above", dni.aa.e);
         dni.a($$0, "water", dni.z.e);
         dni.a($$0, "temperature", dni.v.c);
         dni.a($$0, "steep", dni.s.c);
         dni.a($$0, "not", dni.n.c);
         dni.a($$0, "hole", dni.h.c);
         dni.a($$0, "above_preliminary_surface", dni.a.c);
         return dni.a($$0, "stone_depth", dni.t.f);
      }

      atg<? extends dni.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final dnj e;
      final dni.e f = new dni.g.d(this);
      final dni.e g = new dni.g.c(this);
      final dni.e h = new dni.g.b(this);
      final dni.e i = new dni.g.a();
      final dnf j;
      final dje k;
      private final dmv l;
      private final Function<ht, ib<csy>> m;
      final dno n;
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
      final ht.a z = new ht.a();
      Supplier<ib<csy>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(dnj $$0, dnf $$1, dje $$2, dmv $$3, Function<ht, ib<csy>> $$4, io<csy> $$5, dno $$6) {
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
            long $$2 = crh.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = atm.a(
               atm.a(
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

      final class a implements dni.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.b();
         }
      }

      static final class b extends dni.j {
         b(dni.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends dni.j {
         c(dni.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            dje $$4 = this.c.k;
            int $$5 = $$4.a(dmr.a.a, $$0, $$2);
            int $$6 = $$4.a(dmr.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(dmr.a.a, $$7, $$1);
               int $$10 = $$4.a(dmr.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends dni.k {
         d(dni.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s));
         }
      }
   }

   static enum h implements dni.f {
      a;

      static final atg<dni.h> c = atg.a(MapCodec.unit(a));

      @Override
      public atg<? extends dni.f> a() {
         return c;
      }

      public dni.e a(dni.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements dni.e {
      protected final dni.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(dni.g $$0) {
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

   abstract static class j extends dni.i {
      protected j(dni.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends dni.i {
      protected k(dni.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(agh<ebv.a> a, double c, double d) implements dni.f {
      static final atg<dni.l> e = atg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     agh.a(jz.az).fieldOf("noise").forGetter(dni.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(dni.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(dni.l::d)
                  )
                  .apply($$0, dni.l::new)
         )
      );

      @Override
      public atg<? extends dni.f> a() {
         return e;
      }

      public dni.e a(final dni.g $$0) {
         final ebv $$1 = $$0.j.a(this.a);

         class a extends dni.j {
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

      public agh<ebv.a> b() {
         return this.a;
      }
   }

   static record m(dni.e a) implements dni.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(dni.f a) implements dni.f {
      static final atg<dni.n> c = atg.a(dni.f.b.xmap(dni.n::new, dni.n::b).fieldOf("invert"));

      @Override
      public atg<? extends dni.f> a() {
         return c;
      }

      public dni.e a(dni.g $$0) {
         return new dni.m(this.a.apply($$0));
      }

      public dni.f b() {
         return this.a;
      }
   }

   public interface o extends Function<dni.g, dni.u> {
      Codec<dni.o> b = jy.af.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static Codec<? extends dni.o> a(io<Codec<? extends dni.o>> $$0) {
         dni.a($$0, "bandlands", dni.b.c);
         dni.a($$0, "block", dni.d.d);
         dni.a($$0, "sequence", dni.q.c);
         return dni.a($$0, "condition", dni.x.d);
      }

      atg<? extends dni.o> a();
   }

   static record p(List<dni.u> a) implements dni.u {
      @Nullable
      @Override
      public dhi tryApply(int $$0, int $$1, int $$2) {
         for (dni.u $$3 : this.a) {
            dhi $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<dni.o> a) implements dni.o {
      static final atg<dni.q> c = atg.a(dni.o.b.listOf().xmap(dni.q::new, dni.q::b).fieldOf("sequence"));

      @Override
      public atg<? extends dni.o> a() {
         return c;
      }

      public dni.u a(dni.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<dni.u> $$1 = ImmutableList.builder();

            for (dni.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new dni.p($$1.build());
         }
      }

      public List<dni.o> b() {
         return this.a;
      }
   }

   static record r(dhi a) implements dni.u {
      @Override
      public dhi tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements dni.f {
      a;

      static final atg<dni.s> c = atg.a(MapCodec.unit(a));

      @Override
      public atg<? extends dni.f> a() {
         return c;
      }

      public dni.e a(dni.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, dwc e) implements dni.f {
      static final atg<dni.t> f = atg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dni.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(dni.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(dni.t::d),
                     dwc.c.fieldOf("surface_type").forGetter(dni.t::e)
                  )
                  .apply($$0, dni.t::new)
         )
      );

      @Override
      public atg<? extends dni.f> a() {
         return f;
      }

      public dni.e a(final dni.g $$0) {
         final boolean $$1 = this.e == dwc.a;

         class a extends dni.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)atm.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
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
      dhi tryApply(int var1, int var2, int var3);
   }

   static enum v implements dni.f {
      a;

      static final atg<dni.v> c = atg.a(MapCodec.unit(a));

      @Override
      public atg<? extends dni.f> a() {
         return c;
      }

      public dni.e a(dni.g $$0) {
         return $$0.f;
      }
   }

   static record w(dni.e a, dni.u b) implements dni.u {
      @Nullable
      @Override
      public dhi tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(dni.f a, dni.o c) implements dni.o {
      static final atg<dni.x> d = atg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(dni.f.b.fieldOf("if_true").forGetter(dni.x::b), dni.o.b.fieldOf("then_run").forGetter(dni.x::c)).apply($$0, dni.x::new)
         )
      );

      @Override
      public atg<? extends dni.o> a() {
         return d;
      }

      public dni.u a(dni.g $$0) {
         return new dni.w(this.a.apply($$0), this.c.apply($$0));
      }

      public dni.f b() {
         return this.a;
      }
   }

   static record y(agi a, dnl c, dnl d) implements dni.f {
      static final atg<dni.y> e = atg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     agi.a.fieldOf("random_name").forGetter(dni.y::b),
                     dnl.a.fieldOf("true_at_and_below").forGetter(dni.y::c),
                     dnl.a.fieldOf("false_at_and_above").forGetter(dni.y::d)
                  )
                  .apply($$0, dni.y::new)
         )
      );

      @Override
      public atg<? extends dni.f> a() {
         return e;
      }

      public dni.e a(final dni.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final dne $$3 = $$0.j.a(this.b());

         class a extends dni.k {
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
                  double $$1 = atm.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  ats $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return (double)$$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public agi b() {
         return this.a;
      }
   }

   static record z(int a, int c, boolean d) implements dni.f {
      static final atg<dni.z> e = atg.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(dni.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(dni.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(dni.z::d)
                  )
                  .apply($$0, dni.z::new)
         )
      );

      @Override
      public atg<? extends dni.f> a() {
         return e;
      }

      public dni.e a(final dni.g $$0) {
         class a extends dni.k {
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
