import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dyy implements dyn.a, dyn.b {
   private final dzc a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dyy.i> i;
   final List<dyy.e> j;
   private final Map<dyn, dyn> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dyg m;
   private final dyn n;
   private final dyy.c o;
   private final dzw p;
   private final dyy.g q;
   private final dyy.g r;
   private final dyo.c s;
   private long t = dbh.a;
   private dzw.a u = new dzw.a(1.0, 0.0);
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
   private final dyn.a J = new dyn.a() {
      @Override
      public dyn.b a(int $$0) {
         dyy.this.B = ($$0 + dyy.this.d) * dyy.this.x;
         dyy.this.G++;
         dyy.this.E = 0;
         dyy.this.I = $$0;
         return dyy.this;
      }

      @Override
      public void a(double[] $$0, dyn $$1) {
         for (int $$2 = 0; $$2 < dyy.this.c + 1; $$2++) {
            dyy.this.B = ($$2 + dyy.this.d) * dyy.this.x;
            dyy.this.G++;
            dyy.this.E = 0;
            dyy.this.I = $$2;
            $$0[$$2] = $$1.a(dyy.this);
         }
      }
   };

   public static dyy a(duy $$0, dzi $$1, dyo.c $$2, dyz $$3, dyg.a $$4, dzw $$5) {
      dzc $$6 = $$3.f().a($$0);
      dbh $$7 = $$0.g();
      int $$8 = 16 / $$6.b();
      return new dyy($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dyy(int $$0, dzi $$1, int $$2, int $$3, dzc $$4, dyo.c $$5, dyz $$6, dyg.a $$7, dzw $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = aym.a($$4.d(), this.x);
      this.d = aym.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = jl.a($$2);
      this.h = jl.a($$3);
      this.v = jl.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dyy.g(new dyy.a(), false);
      this.r = new dyy.g(new dyy.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = jl.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = jl.c($$13);
            dzw.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dza $$16 = $$1.a();
      dza $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dyg.a($$7);
      } else {
         int $$18 = jt.a($$2);
         int $$19 = jt.a($$3);
         this.m = dyg.a(this, new dbh($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dyy.c> $$20 = ImmutableList.builder();
      dyn $$21 = dyo.e(dyo.a($$17.l(), dyo.b.a)).a(this::a);
      $$20.add((dyy.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dze.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new eig($$20.build());
      this.n = $$17.k();
   }

   protected ddi.f a(dza $$0, List<ddi.d> $$1) {
      return new ddi.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
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
      int $$2 = jl.c(jl.a($$0));
      int $$3 = jl.c(jl.a($$1));
      return this.l.computeIfAbsent(aqj.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aqj.a($$0);
      int $$2 = aqj.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dyn.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dzw d() {
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

         for (dyy.i $$4 : this.i) {
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

   public dyy c(int $$0) {
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
   public void a(double[] $$0, dyn $$1) {
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

      for (dyy.e $$2 : this.j) {
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
      this.i.forEach(dyy.i::l);
   }

   public dyg i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dzw.a c(int $$0, int $$1) {
      long $$2 = dbh.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dzw.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dyn a(dyn $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dyn b(dyn $$0) {
      if ($$0 instanceof dyo.l $$1) {
         return (dyn)(switch ($$1.j()) {
            case a -> new dyy.i($$1.k());
            case b -> new dyy.g($$1.k(), true);
            case c -> new dyy.d($$1.k());
            case d -> new dyy.f($$1.k());
            case e -> new dyy.e($$1.k());
         });
      } else {
         if (this.p != dzw.a()) {
            if ($$0 == dyo.d.a) {
               return this.q;
            }

            if ($$0 == dyo.f.a) {
               return this.r;
            }
         }

         if ($$0 == dyo.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dyo.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dyy.h {
      @Override
      public dyn k() {
         return dyo.d.a;
      }

      @Override
      public dyn a(dyn.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dyn.b $$0) {
         return dyy.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dyn.a $$1) {
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
      public ayg<? extends dyn> c() {
         return dyo.d.e;
      }
   }

   class b implements dyy.h {
      @Override
      public dyn k() {
         return dyo.f.a;
      }

      @Override
      public dyn a(dyn.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dyn.b $$0) {
         return dyy.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dyn.a $$1) {
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
      public ayg<? extends dyn> c() {
         return dyo.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dtc calculate(dyn.b var1);
   }

   static class d implements dyo.m, dyy.h {
      private final dyn a;
      private long e = dbh.a;
      private double f;

      d(dyn $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dyn.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dbh.c($$1, $$2);
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
      public void a(double[] $$0, dyn.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dyn k() {
         return this.a;
      }

      @Override
      public dyo.l.a j() {
         return dyo.l.a.c;
      }
   }

   class e implements dyo.m, dyy.h {
      final dyn e;
      final double[] f;

      e(dyn $$0) {
         this.e = $$0;
         this.f = new double[dyy.this.w * dyy.this.w * dyy.this.x];
         dyy.this.j.add(this);
      }

      @Override
      public double a(dyn.b $$0) {
         if ($$0 != dyy.this) {
            return this.e.a($$0);
         } else if (!dyy.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dyy.this.D;
            int $$2 = dyy.this.E;
            int $$3 = dyy.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dyy.this.w && $$2 < dyy.this.x && $$3 < dyy.this.w
               ? this.f[((dyy.this.x - 1 - $$2) * dyy.this.w + $$1) * dyy.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dyn.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dyn k() {
         return this.e;
      }

      @Override
      public dyo.l.a j() {
         return dyo.l.a.e;
      }
   }

   class f implements dyo.m, dyy.h {
      private final dyn e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dyn $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dyn.b $$0) {
         if ($$0 != dyy.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dyy.this.H) {
            return this.i[dyy.this.I];
         } else if (this.f == dyy.this.G) {
            return this.h;
         } else {
            this.f = dyy.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dyn.a $$1) {
         if (this.i != null && this.g == dyy.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dyy.this.H;
         }
      }

      @Override
      public dyn k() {
         return this.e;
      }

      @Override
      public dyo.l.a j() {
         return dyo.l.a.d;
      }
   }

   class g implements dyo.m, dyy.h {
      private final dyn e;
      final double[][] f;

      g(dyn $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dyy.this.v + 1][dyy.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dyy.this.v; $$2++) {
               int $$3 = dyy.this.g + $$2;
               int $$4 = jl.c($$3);

               for (int $$5 = 0; $$5 <= dyy.this.v; $$5++) {
                  int $$6 = dyy.this.h + $$5;
                  int $$7 = jl.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dyn.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dyn.b $$0) {
         int $$1 = jl.a($$0.a());
         int $$2 = jl.a($$0.c());
         int $$3 = $$1 - dyy.this.g;
         int $$4 = $$2 - dyy.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dyn.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dyn k() {
         return this.e;
      }

      @Override
      public dyo.l.a j() {
         return dyo.l.a.b;
      }
   }

   interface h extends dyn {
      dyn k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dyo.m, dyy.h {
      double[][] e;
      double[][] f;
      private final dyn g;
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

      i(dyn $$1) {
         this.g = $$1;
         this.e = this.a(dyy.this.c, dyy.this.b);
         this.f = this.a(dyy.this.c, dyy.this.b);
         dyy.this.i.add(this);
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
         this.p = aym.d($$0, this.h, this.l);
         this.q = aym.d($$0, this.j, this.n);
         this.r = aym.d($$0, this.i, this.m);
         this.s = aym.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = aym.d($$0, this.p, this.q);
         this.u = aym.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = aym.d($$0, this.t, this.u);
      }

      @Override
      public double a(dyn.b $$0) {
         if ($$0 != dyy.this) {
            return this.g.a($$0);
         } else if (!dyy.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dyy.this.z
               ? aym.a(
                  (double)dyy.this.D / (double)dyy.this.w,
                  (double)dyy.this.E / (double)dyy.this.x,
                  (double)dyy.this.F / (double)dyy.this.w,
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
      public void a(double[] $$0, dyn.a $$1) {
         if (dyy.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dyn k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dyo.l.a j() {
         return dyo.l.a.a;
      }
   }
}
