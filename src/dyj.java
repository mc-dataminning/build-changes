import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dyj implements dxy.a, dxy.b {
   private final dyn a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dyj.i> i;
   final List<dyj.e> j;
   private final Map<dxy, dxy> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dxr m;
   private final dxy n;
   private final dyj.c o;
   private final dzh p;
   private final dyj.g q;
   private final dyj.g r;
   private final dxz.c s;
   private long t = dbm.a;
   private dzh.a u = new dzh.a(1.0, 0.0);
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
   private final dxy.a J = new dxy.a() {
      @Override
      public dxy.b a(int $$0) {
         dyj.this.B = ($$0 + dyj.this.d) * dyj.this.x;
         dyj.this.G++;
         dyj.this.E = 0;
         dyj.this.I = $$0;
         return dyj.this;
      }

      @Override
      public void a(double[] $$0, dxy $$1) {
         for (int $$2 = 0; $$2 < dyj.this.c + 1; $$2++) {
            dyj.this.B = ($$2 + dyj.this.d) * dyj.this.x;
            dyj.this.G++;
            dyj.this.E = 0;
            dyj.this.I = $$2;
            $$0[$$2] = $$1.a(dyj.this);
         }
      }
   };

   public static dyj a(dug $$0, dyt $$1, dxz.c $$2, dyk $$3, dxr.a $$4, dzh $$5) {
      dyn $$6 = $$3.f().a($$0);
      dbm $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dyj($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dyj(int $$0, dyt $$1, int $$2, int $$3, dyn $$4, dxz.c $$5, dyk $$6, dxr.a $$7, dzh $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = ayg.a($$4.d(), this.x);
      this.d = ayg.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = ju.a($$2);
      this.h = ju.a($$3);
      this.v = ju.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dyj.g(new dyj.a(), false);
      this.r = new dyj.g(new dyj.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = ju.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = ju.c($$13);
            dzh.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dyl $$16 = $$1.a();
      dyl $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dxr.a($$7);
      } else {
         int $$18 = kc.a($$2);
         int $$19 = kc.a($$3);
         this.m = dxr.a(this, new dbm($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dyj.c> $$20 = ImmutableList.builder();
      dxy $$21 = dxz.e(dxz.a($$17.l(), dxz.b.a)).a(this::a);
      $$20.add((dyj.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dyp.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new ehk($$20.build());
      this.n = $$17.k();
   }

   protected ddo.f a(dyl $$0, List<ddo.d> $$1) {
      return new ddo.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dsk e() {
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
      int $$2 = ju.c(ju.a($$0));
      int $$3 = ju.c(ju.a($$1));
      return this.l.computeIfAbsent(aqa.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aqa.a($$0);
      int $$2 = aqa.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dxy.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dzh d() {
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

         for (dyj.i $$4 : this.i) {
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

   public dyj c(int $$0) {
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
   public void a(double[] $$0, dxy $$1) {
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

      for (dyj.e $$2 : this.j) {
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
      this.i.forEach(dyj.i::l);
   }

   public dxr i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dzh.a c(int $$0, int $$1) {
      long $$2 = dbm.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dzh.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dxy a(dxy $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dxy b(dxy $$0) {
      if ($$0 instanceof dxz.l $$1) {
         return (dxy)(switch ($$1.j()) {
            case a -> new dyj.i($$1.k());
            case b -> new dyj.g($$1.k(), true);
            case c -> new dyj.d($$1.k());
            case d -> new dyj.f($$1.k());
            case e -> new dyj.e($$1.k());
         });
      } else {
         if (this.p != dzh.a()) {
            if ($$0 == dxz.d.a) {
               return this.q;
            }

            if ($$0 == dxz.f.a) {
               return this.r;
            }
         }

         if ($$0 == dxz.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dxz.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dyj.h {
      @Override
      public dxy k() {
         return dxz.d.a;
      }

      @Override
      public dxy a(dxy.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dxy.b $$0) {
         return dyj.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dxy.a $$1) {
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
      public axz<? extends dxy> c() {
         return dxz.d.e;
      }
   }

   class b implements dyj.h {
      @Override
      public dxy k() {
         return dxz.f.a;
      }

      @Override
      public dxy a(dxy.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dxy.b $$0) {
         return dyj.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dxy.a $$1) {
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
      public axz<? extends dxy> c() {
         return dxz.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dsk calculate(dxy.b var1);
   }

   static class d implements dxz.m, dyj.h {
      private final dxy a;
      private long e = dbm.a;
      private double f;

      d(dxy $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dxy.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dbm.c($$1, $$2);
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
      public void a(double[] $$0, dxy.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dxy k() {
         return this.a;
      }

      @Override
      public dxz.l.a j() {
         return dxz.l.a.c;
      }
   }

   class e implements dxz.m, dyj.h {
      final dxy e;
      final double[] f;

      e(final dxy $$0) {
         this.e = $$0;
         this.f = new double[dyj.this.w * dyj.this.w * dyj.this.x];
         dyj.this.j.add(this);
      }

      @Override
      public double a(dxy.b $$0) {
         if ($$0 != dyj.this) {
            return this.e.a($$0);
         } else if (!dyj.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dyj.this.D;
            int $$2 = dyj.this.E;
            int $$3 = dyj.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dyj.this.w && $$2 < dyj.this.x && $$3 < dyj.this.w
               ? this.f[((dyj.this.x - 1 - $$2) * dyj.this.w + $$1) * dyj.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dxy.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxy k() {
         return this.e;
      }

      @Override
      public dxz.l.a j() {
         return dxz.l.a.e;
      }
   }

   class f implements dxz.m, dyj.h {
      private final dxy e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final dxy $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dxy.b $$0) {
         if ($$0 != dyj.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dyj.this.H) {
            return this.i[dyj.this.I];
         } else if (this.f == dyj.this.G) {
            return this.h;
         } else {
            this.f = dyj.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dxy.a $$1) {
         if (this.i != null && this.g == dyj.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dyj.this.H;
         }
      }

      @Override
      public dxy k() {
         return this.e;
      }

      @Override
      public dxz.l.a j() {
         return dxz.l.a.d;
      }
   }

   class g implements dxz.m, dyj.h {
      private final dxy e;
      final double[][] f;

      g(final dxy $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[dyj.this.v + 1][dyj.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dyj.this.v; $$2++) {
               int $$3 = dyj.this.g + $$2;
               int $$4 = ju.c($$3);

               for (int $$5 = 0; $$5 <= dyj.this.v; $$5++) {
                  int $$6 = dyj.this.h + $$5;
                  int $$7 = ju.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dxy.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dxy.b $$0) {
         int $$1 = ju.a($$0.a());
         int $$2 = ju.a($$0.c());
         int $$3 = $$1 - dyj.this.g;
         int $$4 = $$2 - dyj.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dxy.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxy k() {
         return this.e;
      }

      @Override
      public dxz.l.a j() {
         return dxz.l.a.b;
      }
   }

   interface h extends dxy {
      dxy k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dxz.m, dyj.h {
      double[][] e;
      double[][] f;
      private final dxy g;
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

      i(final dxy $$1) {
         this.g = $$1;
         this.e = this.a(dyj.this.c, dyj.this.b);
         this.f = this.a(dyj.this.c, dyj.this.b);
         dyj.this.i.add(this);
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
         this.p = ayg.d($$0, this.h, this.l);
         this.q = ayg.d($$0, this.j, this.n);
         this.r = ayg.d($$0, this.i, this.m);
         this.s = ayg.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = ayg.d($$0, this.p, this.q);
         this.u = ayg.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = ayg.d($$0, this.t, this.u);
      }

      @Override
      public double a(dxy.b $$0) {
         if ($$0 != dyj.this) {
            return this.g.a($$0);
         } else if (!dyj.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dyj.this.z
               ? ayg.a(
                  (double)dyj.this.D / (double)dyj.this.w,
                  (double)dyj.this.E / (double)dyj.this.x,
                  (double)dyj.this.F / (double)dyj.this.w,
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
      public void a(double[] $$0, dxy.a $$1) {
         if (dyj.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dxy k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dxz.l.a j() {
         return dxz.l.a.a;
      }
   }
}
