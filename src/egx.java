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

public class egx {
   public static final egx.f a = a(0, false, epv.b);
   public static final egx.f b = a(0, true, epv.b);
   public static final egx.f c = a(0, true, 6, epv.b);
   public static final egx.f d = a(0, true, 30, epv.b);
   public static final egx.f e = a(0, false, epv.a);
   public static final egx.f f = a(0, true, epv.a);

   public static egx.f a(int $$0, boolean $$1, epv $$2) {
      return new egx.t($$0, $$1, 0, $$2);
   }

   public static egx.f a(int $$0, boolean $$1, int $$2, epv $$3) {
      return new egx.t($$0, $$1, $$2, $$3);
   }

   public static egx.f a(egx.f $$0) {
      return new egx.n($$0);
   }

   public static egx.f a(eha $$0, int $$1) {
      return new egx.aa($$0, $$1, false);
   }

   public static egx.f b(eha $$0, int $$1) {
      return new egx.aa($$0, $$1, true);
   }

   public static egx.f a(int $$0, int $$1) {
      return new egx.z($$0, $$1, false);
   }

   public static egx.f b(int $$0, int $$1) {
      return new egx.z($$0, $$1, true);
   }

   @SafeVarargs
   public static egx.f a(alf<dkd>... $$0) {
      return a(List.of($$0));
   }

   private static egx.c a(List<alf<dkd>> $$0) {
      return new egx.c($$0);
   }

   public static egx.f a(alf<evr.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static egx.f a(alf<evr.a> $$0, double $$1, double $$2) {
      return new egx.l($$0, $$1, $$2);
   }

   public static egx.f a(String $$0, eha $$1, eha $$2) {
      return new egx.y(alg.a($$0), $$1, $$2);
   }

   public static egx.f a() {
      return egx.s.a;
   }

   public static egx.f b() {
      return egx.h.a;
   }

   public static egx.f c() {
      return egx.a.a;
   }

   public static egx.f d() {
      return egx.v.a;
   }

   public static egx.o a(egx.f $$0, egx.o $$1) {
      return new egx.x($$0, $$1);
   }

   public static egx.o a(egx.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new egx.q(Arrays.asList($$0));
      }
   }

   public static egx.o a(eah $$0) {
      return new egx.d($$0);
   }

   public static egx.o e() {
      return egx.b.a;
   }

   static <A> MapCodec<? extends A> a(jr<MapCodec<? extends A>> $$0, String $$1, azf<? extends A> $$2) {
      return jr.a($$0, $$1, $$2.a());
   }

   static enum a implements egx.f {
      a;

      static final azf<egx.a> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends egx.f> a() {
         return c;
      }

      public egx.e a(egx.g $$0) {
         return $$0.i;
      }
   }

   static record aa(eha a, int c, boolean d) implements egx.f {
      static final azf<egx.aa> e = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     eha.a.fieldOf("anchor").forGetter(egx.aa::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(egx.aa::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(egx.aa::d)
                  )
                  .apply($$0, egx.aa::new)
         )
      );

      @Override
      public azf<? extends egx.f> a() {
         return e;
      }

      public egx.e a(final egx.g $$0) {
         class a extends egx.k {
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

      public eha b() {
         return this.a;
      }
   }

   static enum b implements egx.o {
      a;

      static final azf<egx.b> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends egx.o> a() {
         return c;
      }

      public egx.u a(egx.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements egx.f {
      static final azf<egx.c> a = azf.a(alf.a(mg.aG).listOf().fieldOf("biome_is").xmap(egx::a, $$0 -> $$0.c));
      private final List<alf<dkd>> c;
      final Predicate<alf<dkd>> d;

      c(List<alf<dkd>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public azf<? extends egx.f> a() {
         return a;
      }

      public egx.e a(final egx.g $$0) {
         class a extends egx.k {
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
            return $$0 instanceof egx.c $$1 ? this.c.equals($$1.c) : false;
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

   static record d(eah a, egx.r c) implements egx.o {
      static final azf<egx.d> d = azf.a(eah.a.xmap(egx.d::new, egx.d::b).fieldOf("result_state"));

      d(eah $$0) {
         this($$0, new egx.r($$0));
      }

      @Override
      public azf<? extends egx.o> a() {
         return d;
      }

      public egx.u a(egx.g $$0) {
         return this.c;
      }

      public eah b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<egx.g, egx.e> {
      Codec<egx.f> b = mf.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends egx.f> a(jr<MapCodec<? extends egx.f>> $$0) {
         egx.a($$0, "biome", egx.c.a);
         egx.a($$0, "noise_threshold", egx.l.e);
         egx.a($$0, "vertical_gradient", egx.y.e);
         egx.a($$0, "y_above", egx.aa.e);
         egx.a($$0, "water", egx.z.e);
         egx.a($$0, "temperature", egx.v.c);
         egx.a($$0, "steep", egx.s.c);
         egx.a($$0, "not", egx.n.c);
         egx.a($$0, "hole", egx.h.c);
         egx.a($$0, "above_preliminary_surface", egx.a.c);
         return egx.a($$0, "stone_depth", egx.t.f);
      }

      azf<? extends egx.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final egy e;
      final egx.e f = new egx.g.d(this);
      final egx.e g = new egx.g.c(this);
      final egx.e h = new egx.g.b(this);
      final egx.e i = new egx.g.a();
      final egu j;
      final ece k;
      private final egk l;
      private final Function<iu, je<dkd>> m;
      final ehd n;
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
      Supplier<je<dkd>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(egy $$0, egu $$1, ece $$2, egk $$3, Function<iu, je<dkd>> $$4, jr<dkd> $$5, ehd $$6) {
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
            long $$2 = dih.c($$0, $$1);
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

      final class a implements egx.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends egx.j {
         b(egx.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends egx.j {
         c(egx.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            ece $$4 = this.c.k;
            int $$5 = $$4.a(egg.a.a, $$0, $$2);
            int $$6 = $$4.a(egg.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(egg.a.a, $$7, $$1);
               int $$10 = $$4.a(egg.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends egx.k {
         d(egx.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements egx.f {
      a;

      static final azf<egx.h> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends egx.f> a() {
         return c;
      }

      public egx.e a(egx.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements egx.e {
      protected final egx.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(egx.g $$0) {
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

   abstract static class j extends egx.i {
      protected j(egx.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends egx.i {
      protected k(egx.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   static record l(alf<evr.a> a, double c, double d) implements egx.f {
      static final azf<egx.l> e = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alf.a(mg.aY).fieldOf("noise").forGetter(egx.l::b),
                     Codec.DOUBLE.fieldOf("min_threshold").forGetter(egx.l::c),
                     Codec.DOUBLE.fieldOf("max_threshold").forGetter(egx.l::d)
                  )
                  .apply($$0, egx.l::new)
         )
      );

      @Override
      public azf<? extends egx.f> a() {
         return e;
      }

      public egx.e a(final egx.g $$0) {
         final evr $$1 = $$0.j.a(this.a);

         class a extends egx.j {
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

      public alf<evr.a> b() {
         return this.a;
      }
   }

   static record m(egx.e a) implements egx.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   static record n(egx.f a) implements egx.f {
      static final azf<egx.n> c = azf.a(egx.f.b.xmap(egx.n::new, egx.n::b).fieldOf("invert"));

      @Override
      public azf<? extends egx.f> a() {
         return c;
      }

      public egx.e a(egx.g $$0) {
         return new egx.m(this.a.apply($$0));
      }

      public egx.f b() {
         return this.a;
      }
   }

   public interface o extends Function<egx.g, egx.u> {
      Codec<egx.o> b = mf.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends egx.o> a(jr<MapCodec<? extends egx.o>> $$0) {
         egx.a($$0, "bandlands", egx.b.c);
         egx.a($$0, "block", egx.d.d);
         egx.a($$0, "sequence", egx.q.c);
         return egx.a($$0, "condition", egx.x.d);
      }

      azf<? extends egx.o> a();
   }

   static record p(List<egx.u> a) implements egx.u {
      @Nullable
      @Override
      public eah tryApply(int $$0, int $$1, int $$2) {
         for (egx.u $$3 : this.a) {
            eah $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   static record q(List<egx.o> a) implements egx.o {
      static final azf<egx.q> c = azf.a(egx.o.b.listOf().xmap(egx.q::new, egx.q::b).fieldOf("sequence"));

      @Override
      public azf<? extends egx.o> a() {
         return c;
      }

      public egx.u a(egx.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<egx.u> $$1 = ImmutableList.builder();

            for (egx.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new egx.p($$1.build());
         }
      }

      public List<egx.o> b() {
         return this.a;
      }
   }

   static record r(eah a) implements egx.u {
      @Override
      public eah tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements egx.f {
      a;

      static final azf<egx.s> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends egx.f> a() {
         return c;
      }

      public egx.e a(egx.g $$0) {
         return $$0.g;
      }
   }

   static record t(int a, boolean c, int d, epv e) implements egx.f {
      static final azf<egx.t> f = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(egx.t::b),
                     Codec.BOOL.fieldOf("add_surface_depth").forGetter(egx.t::c),
                     Codec.INT.fieldOf("secondary_depth_range").forGetter(egx.t::d),
                     epv.c.fieldOf("surface_type").forGetter(egx.t::e)
                  )
                  .apply($$0, egx.t::new)
         )
      );

      @Override
      public azf<? extends egx.f> a() {
         return f;
      }

      public egx.e a(final egx.g $$0) {
         final boolean $$1 = this.e == epv.a;

         class a extends egx.k {
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
      eah tryApply(int var1, int var2, int var3);
   }

   static enum v implements egx.f {
      a;

      static final azf<egx.v> c = azf.a(MapCodec.unit(a));

      @Override
      public azf<? extends egx.f> a() {
         return c;
      }

      public egx.e a(egx.g $$0) {
         return $$0.f;
      }
   }

   static record w(egx.e a, egx.u b) implements egx.u {
      @Nullable
      @Override
      public eah tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   static record x(egx.f a, egx.o c) implements egx.o {
      static final azf<egx.x> d = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(egx.f.b.fieldOf("if_true").forGetter(egx.x::b), egx.o.b.fieldOf("then_run").forGetter(egx.x::c)).apply($$0, egx.x::new)
         )
      );

      @Override
      public azf<? extends egx.o> a() {
         return d;
      }

      public egx.u a(egx.g $$0) {
         return new egx.w(this.a.apply($$0), this.c.apply($$0));
      }

      public egx.f b() {
         return this.a;
      }
   }

   static record y(alg a, eha c, eha d) implements egx.f {
      static final azf<egx.y> e = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     alg.a.fieldOf("random_name").forGetter(egx.y::b),
                     eha.a.fieldOf("true_at_and_below").forGetter(egx.y::c),
                     eha.a.fieldOf("false_at_and_above").forGetter(egx.y::d)
                  )
                  .apply($$0, egx.y::new)
         )
      );

      @Override
      public azf<? extends egx.f> a() {
         return e;
      }

      public egx.e a(final egx.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final egt $$3 = $$0.j.a(this.b());

         class a extends egx.k {
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

   static record z(int a, int c, boolean d) implements egx.f {
      static final azf<egx.z> e = azf.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     Codec.INT.fieldOf("offset").forGetter(egx.z::b),
                     Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(egx.z::c),
                     Codec.BOOL.fieldOf("add_stone_depth").forGetter(egx.z::d)
                  )
                  .apply($$0, egx.z::new)
         )
      );

      @Override
      public azf<? extends egx.f> a() {
         return e;
      }

      public egx.e a(final egx.g $$0) {
         class a extends egx.k {
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
