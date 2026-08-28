import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dzc implements dyr.a, dyr.b {
   private final dzg a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dzc.i> i;
   final List<dzc.e> j;
   private final Map<dyr, dyr> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dyk m;
   private final dyr n;
   private final dzc.c o;
   private final eaa p;
   private final dzc.g q;
   private final dzc.g r;
   private final dys.c s;
   private long t = dcd.a;
   private eaa.a u = new eaa.a(1.0, 0.0);
   final int v;
   final int w;
   final int x;
   boolean y;
   boolean z;
   private int A;
   int B;
   private int C;
   int D;
   int E;
   int F;
   long G;
   long H;
   int I;
   private final dyr.a J = new dyr.a() {
      @Override
      public dyr.b a(int $$0) {
         dzc.this.B = ($$0 + dzc.this.d) * dzc.this.x;
         dzc.this.G++;
         dzc.this.E = 0;
         dzc.this.I = $$0;
         return dzc.this;
      }

      @Override
      public void a(double[] $$0, dyr $$1) {
         for (int $$2 = 0; $$2 < dzc.this.c + 1; $$2++) {
            dzc.this.B = ($$2 + dzc.this.d) * dzc.this.x;
            dzc.this.G++;
            dzc.this.E = 0;
            dzc.this.I = $$2;
            $$0[$$2] = $$1.a(dzc.this);
         }
      }
   };

   public static dzc a(duy $$0, dzm $$1, dys.c $$2, dzd $$3, dyk.a $$4, eaa $$5) {
      dzg $$6 = $$3.f().a($$0);
      dcd $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dzc($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dzc(int $$0, dzm $$1, int $$2, int $$3, dzg $$4, dys.c $$5, dzd $$6, dyk.a $$7, eaa $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = ayo.a($$4.d(), this.x);
      this.d = ayo.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = jx.a($$2);
      this.h = jx.a($$3);
      this.v = jx.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dzc.g(new dzc.a(), false);
      this.r = new dzc.g(new dzc.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = jx.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = jx.c($$13);
            eaa.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dze $$16 = $$1.a();
      dze $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dyk.a($$7);
      } else {
         int $$18 = kf.a($$2);
         int $$19 = kf.a($$3);
         this.m = dyk.a(this, new dcd($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dzc.c> $$20 = ImmutableList.builder();
      dyr $$21 = dys.e(dys.a($$17.l(), dys.b.a)).a(this::a);
      $$20.add((dzc.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dzi.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new eie($$20.build());
      this.n = $$17.k();
   }

   protected def.f a(dze $$0, List<def.d> $$1) {
      return new def.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dtc e() {
      return this.o.calculate(this);
   }

   @Override
   public int a() {
      return this.A + this.D;
   }

   @Override
   public int b() {
      return this.B + this.E;
   }

   @Override
   public int c() {
      return this.C + this.F;
   }

   public int a(int $$0, int $$1) {
      int $$2 = jx.c(jx.a($$0));
      int $$3 = jx.c(jx.a($$1));
      return this.l.computeIfAbsent(aqi.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aqi.a($$0);
      int $$2 = aqi.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dyr.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public eaa d() {
      return this.p;
   }

   private void a(boolean $$0, int $$1) {
      this.A = $$1 * this.w;
      this.D = 0;

      for (int $$2 = 0; $$2 < this.b + 1; $$2++) {
         int $$3 = this.f + $$2;
         this.C = $$3 * this.w;
         this.F = 0;
         this.H++;

         for (dzc.i $$4 : this.i) {
            double[] $$5 = ($$0 ? $$4.e : $$4.f)[$$2];
            $$4.a($$5, this.J);
         }
      }

      this.H++;
   }

   public void f() {
      if (this.y) {
         throw new IllegalStateException("Staring interpolation twice");
      } else {
         this.y = true;
         this.G = 0L;
         this.a(true, this.e);
      }
   }

   public void b(int $$0) {
      this.a(false, this.e + $$0 + 1);
      this.A = (this.e + $$0) * this.w;
   }

   public dzc c(int $$0) {
      int $$1 = Math.floorMod($$0, this.w);
      int $$2 = Math.floorDiv($$0, this.w);
      int $$3 = Math.floorMod($$2, this.w);
      int $$4 = this.x - 1 - Math.floorDiv($$2, this.w);
      this.D = $$3;
      this.E = $$4;
      this.F = $$1;
      this.I = $$0;
      return this;
   }

   @Override
   public void a(double[] $$0, dyr $$1) {
      this.I = 0;

      for (int $$2 = this.x - 1; $$2 >= 0; $$2--) {
         this.E = $$2;

         for (int $$3 = 0; $$3 < this.w; $$3++) {
            this.D = $$3;

            for (int $$4 = 0; $$4 < this.w; $$4++) {
               this.F = $$4;
               $$0[this.I++] = $$1.a(this);
            }
         }
      }
   }

   public void b(int $$0, int $$1) {
      this.i.forEach($$2x -> $$2x.b($$0, $$1));
      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (dzc.e $$2 : this.j) {
         $$2.e.a($$2.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;
      this.i.forEach($$1x -> $$1x.a($$1));
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;
      this.i.forEach($$1x -> $$1x.b($$1));
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;
      this.i.forEach($$1x -> $$1x.c($$1));
   }

   public void g() {
      if (!this.y) {
         throw new IllegalStateException("Staring interpolation twice");
      } else {
         this.y = false;
      }
   }

   public void h() {
      this.i.forEach(dzc.i::l);
   }

   public dyk i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   eaa.a c(int $$0, int $$1) {
      long $$2 = dcd.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         eaa.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dyr a(dyr $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dyr b(dyr $$0) {
      if ($$0 instanceof dys.l $$1) {
         return (dyr)(switch ($$1.j()) {
            case a -> new dzc.i($$1.k());
            case b -> new dzc.g($$1.k(), true);
            case c -> new dzc.d($$1.k());
            case d -> new dzc.f($$1.k());
            case e -> new dzc.e($$1.k());
         });
      } else {
         if (this.p != eaa.a()) {
            if ($$0 == dys.d.a) {
               return this.q;
            }

            if ($$0 == dys.f.a) {
               return this.r;
            }
         }

         if ($$0 == dys.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dys.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dzc.h {
      @Override
      public dyr k() {
         return dys.d.a;
      }

      @Override
      public dyr a(dyr.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dyr.b $$0) {
         return dzc.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dyr.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public double a() {
         return 0.0;
      }

      @Override
      public double b() {
         return 1.0;
      }

      @Override
      public ayh<? extends dyr> c() {
         return dys.d.e;
      }
   }

   class b implements dzc.h {
      @Override
      public dyr k() {
         return dys.f.a;
      }

      @Override
      public dyr a(dyr.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dyr.b $$0) {
         return dzc.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dyr.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public double a() {
         return Double.NEGATIVE_INFINITY;
      }

      @Override
      public double b() {
         return Double.POSITIVE_INFINITY;
      }

      @Override
      public ayh<? extends dyr> c() {
         return dys.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dtc calculate(dyr.b var1);
   }

   static class d implements dys.m, dzc.h {
      private final dyr a;
      private long e = dcd.a;
      private double f;

      d(dyr $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dyr.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dcd.c($$1, $$2);
         if (this.e == $$3) {
            return this.f;
         } else {
            this.e = $$3;
            double $$4 = this.a.a($$0);
            this.f = $$4;
            return $$4;
         }
      }

      @Override
      public void a(double[] $$0, dyr.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dyr k() {
         return this.a;
      }

      @Override
      public dys.l.a j() {
         return dys.l.a.c;
      }
   }

   class e implements dys.m, dzc.h {
      final dyr e;
      final double[] f;

      e(final dyr $$0) {
         this.e = $$0;
         this.f = new double[dzc.this.w * dzc.this.w * dzc.this.x];
         dzc.this.j.add(this);
      }

      @Override
      public double a(dyr.b $$0) {
         if ($$0 != dzc.this) {
            return this.e.a($$0);
         } else if (!dzc.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dzc.this.D;
            int $$2 = dzc.this.E;
            int $$3 = dzc.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dzc.this.w && $$2 < dzc.this.x && $$3 < dzc.this.w
               ? this.f[((dzc.this.x - 1 - $$2) * dzc.this.w + $$1) * dzc.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dyr.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dyr k() {
         return this.e;
      }

      @Override
      public dys.l.a j() {
         return dys.l.a.e;
      }
   }

   class f implements dys.m, dzc.h {
      private final dyr e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final dyr $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dyr.b $$0) {
         if ($$0 != dzc.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dzc.this.H) {
            return this.i[dzc.this.I];
         } else if (this.f == dzc.this.G) {
            return this.h;
         } else {
            this.f = dzc.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dyr.a $$1) {
         if (this.i != null && this.g == dzc.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dzc.this.H;
         }
      }

      @Override
      public dyr k() {
         return this.e;
      }

      @Override
      public dys.l.a j() {
         return dys.l.a.d;
      }
   }

   class g implements dys.m, dzc.h {
      private final dyr e;
      final double[][] f;

      g(final dyr $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[dzc.this.v + 1][dzc.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dzc.this.v; $$2++) {
               int $$3 = dzc.this.g + $$2;
               int $$4 = jx.c($$3);

               for (int $$5 = 0; $$5 <= dzc.this.v; $$5++) {
                  int $$6 = dzc.this.h + $$5;
                  int $$7 = jx.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dyr.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dyr.b $$0) {
         int $$1 = jx.a($$0.a());
         int $$2 = jx.a($$0.c());
         int $$3 = $$1 - dzc.this.g;
         int $$4 = $$2 - dzc.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dyr.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dyr k() {
         return this.e;
      }

      @Override
      public dys.l.a j() {
         return dys.l.a.b;
      }
   }

   interface h extends dyr {
      dyr k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dys.m, dzc.h {
      double[][] e;
      double[][] f;
      private final dyr g;
      private double h;
      private double i;
      private double j;
      private double k;
      private double l;
      private double m;
      private double n;
      private double o;
      private double p;
      private double q;
      private double r;
      private double s;
      private double t;
      private double u;
      private double v;

      i(final dyr $$1) {
         this.g = $$1;
         this.e = this.a(dzc.this.c, dzc.this.b);
         this.f = this.a(dzc.this.c, dzc.this.b);
         dzc.this.i.add(this);
      }

      private double[][] a(int $$0, int $$1) {
         int $$2 = $$1 + 1;
         int $$3 = $$0 + 1;
         double[][] $$4 = new double[$$2][$$3];

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            $$4[$$5] = new double[$$3];
         }

         return $$4;
      }

      void b(int $$0, int $$1) {
         this.h = this.e[$$1][$$0];
         this.i = this.e[$$1 + 1][$$0];
         this.j = this.f[$$1][$$0];
         this.k = this.f[$$1 + 1][$$0];
         this.l = this.e[$$1][$$0 + 1];
         this.m = this.e[$$1 + 1][$$0 + 1];
         this.n = this.f[$$1][$$0 + 1];
         this.o = this.f[$$1 + 1][$$0 + 1];
      }

      void a(double $$0) {
         this.p = ayo.d($$0, this.h, this.l);
         this.q = ayo.d($$0, this.j, this.n);
         this.r = ayo.d($$0, this.i, this.m);
         this.s = ayo.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = ayo.d($$0, this.p, this.q);
         this.u = ayo.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = ayo.d($$0, this.t, this.u);
      }

      @Override
      public double a(dyr.b $$0) {
         if ($$0 != dzc.this) {
            return this.g.a($$0);
         } else if (!dzc.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dzc.this.z
               ? ayo.a(
                  (double)dzc.this.D / (double)dzc.this.w,
                  (double)dzc.this.E / (double)dzc.this.x,
                  (double)dzc.this.F / (double)dzc.this.w,
                  this.h,
                  this.j,
                  this.l,
                  this.n,
                  this.i,
                  this.k,
                  this.m,
                  this.o
               )
               : this.v;
         }
      }

      @Override
      public void a(double[] $$0, dyr.a $$1) {
         if (dzc.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dyr k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dys.l.a j() {
         return dys.l.a.a;
      }
   }
}
