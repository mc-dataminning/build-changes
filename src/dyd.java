import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dyd implements dxs.a, dxs.b {
   private final dyh a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dyd.i> i;
   final List<dyd.e> j;
   private final Map<dxs, dxs> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dxl m;
   private final dxs n;
   private final dyd.c o;
   private final dzb p;
   private final dyd.g q;
   private final dyd.g r;
   private final dxt.c s;
   private long t = dbk.a;
   private dzb.a u = new dzb.a(1.0, 0.0);
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
   private final dxs.a J = new dxs.a() {
      @Override
      public dxs.b a(int $$0) {
         dyd.this.B = ($$0 + dyd.this.d) * dyd.this.x;
         dyd.this.G++;
         dyd.this.E = 0;
         dyd.this.I = $$0;
         return dyd.this;
      }

      @Override
      public void a(double[] $$0, dxs $$1) {
         for (int $$2 = 0; $$2 < dyd.this.c + 1; $$2++) {
            dyd.this.B = ($$2 + dyd.this.d) * dyd.this.x;
            dyd.this.G++;
            dyd.this.E = 0;
            dyd.this.I = $$2;
            $$0[$$2] = $$1.a(dyd.this);
         }
      }
   };

   public static dyd a(dud $$0, dyn $$1, dxt.c $$2, dye $$3, dxl.a $$4, dzb $$5) {
      dyh $$6 = $$3.f().a($$0);
      dbk $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dyd($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dyd(int $$0, dyn $$1, int $$2, int $$3, dyh $$4, dxt.c $$5, dye $$6, dxl.a $$7, dzb $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = aye.a($$4.d(), this.x);
      this.d = aye.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = ju.a($$2);
      this.h = ju.a($$3);
      this.v = ju.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dyd.g(new dyd.a(), false);
      this.r = new dyd.g(new dyd.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = ju.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = ju.c($$13);
            dzb.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dyf $$16 = $$1.a();
      dyf $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dxl.a($$7);
      } else {
         int $$18 = kc.a($$2);
         int $$19 = kc.a($$3);
         this.m = dxl.a(this, new dbk($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dyd.c> $$20 = ImmutableList.builder();
      dxs $$21 = dxt.e(dxt.a($$17.l(), dxt.b.a)).a(this::a);
      $$20.add((dyd.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dyj.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new ehe($$20.build());
      this.n = $$17.k();
   }

   protected ddm.f a(dyf $$0, List<ddm.d> $$1) {
      return new ddm.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dsh e() {
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
         if (this.n.a(new dxs.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dzb d() {
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

         for (dyd.i $$4 : this.i) {
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

   public dyd c(int $$0) {
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
   public void a(double[] $$0, dxs $$1) {
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

      for (dyd.e $$2 : this.j) {
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
      this.i.forEach(dyd.i::l);
   }

   public dxl i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dzb.a c(int $$0, int $$1) {
      long $$2 = dbk.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dzb.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dxs a(dxs $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dxs b(dxs $$0) {
      if ($$0 instanceof dxt.l $$1) {
         return (dxs)(switch ($$1.j()) {
            case a -> new dyd.i($$1.k());
            case b -> new dyd.g($$1.k(), true);
            case c -> new dyd.d($$1.k());
            case d -> new dyd.f($$1.k());
            case e -> new dyd.e($$1.k());
         });
      } else {
         if (this.p != dzb.a()) {
            if ($$0 == dxt.d.a) {
               return this.q;
            }

            if ($$0 == dxt.f.a) {
               return this.r;
            }
         }

         if ($$0 == dxt.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dxt.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dyd.h {
      @Override
      public dxs k() {
         return dxt.d.a;
      }

      @Override
      public dxs a(dxs.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dxs.b $$0) {
         return dyd.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dxs.a $$1) {
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
      public axx<? extends dxs> c() {
         return dxt.d.e;
      }
   }

   class b implements dyd.h {
      @Override
      public dxs k() {
         return dxt.f.a;
      }

      @Override
      public dxs a(dxs.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dxs.b $$0) {
         return dyd.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dxs.a $$1) {
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
      public axx<? extends dxs> c() {
         return dxt.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dsh calculate(dxs.b var1);
   }

   static class d implements dxt.m, dyd.h {
      private final dxs a;
      private long e = dbk.a;
      private double f;

      d(dxs $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dxs.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dbk.c($$1, $$2);
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
      public void a(double[] $$0, dxs.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dxs k() {
         return this.a;
      }

      @Override
      public dxt.l.a j() {
         return dxt.l.a.c;
      }
   }

   class e implements dxt.m, dyd.h {
      final dxs e;
      final double[] f;

      e(final dxs $$0) {
         this.e = $$0;
         this.f = new double[dyd.this.w * dyd.this.w * dyd.this.x];
         dyd.this.j.add(this);
      }

      @Override
      public double a(dxs.b $$0) {
         if ($$0 != dyd.this) {
            return this.e.a($$0);
         } else if (!dyd.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dyd.this.D;
            int $$2 = dyd.this.E;
            int $$3 = dyd.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dyd.this.w && $$2 < dyd.this.x && $$3 < dyd.this.w
               ? this.f[((dyd.this.x - 1 - $$2) * dyd.this.w + $$1) * dyd.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dxs.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxs k() {
         return this.e;
      }

      @Override
      public dxt.l.a j() {
         return dxt.l.a.e;
      }
   }

   class f implements dxt.m, dyd.h {
      private final dxs e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final dxs $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dxs.b $$0) {
         if ($$0 != dyd.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dyd.this.H) {
            return this.i[dyd.this.I];
         } else if (this.f == dyd.this.G) {
            return this.h;
         } else {
            this.f = dyd.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dxs.a $$1) {
         if (this.i != null && this.g == dyd.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dyd.this.H;
         }
      }

      @Override
      public dxs k() {
         return this.e;
      }

      @Override
      public dxt.l.a j() {
         return dxt.l.a.d;
      }
   }

   class g implements dxt.m, dyd.h {
      private final dxs e;
      final double[][] f;

      g(final dxs $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[dyd.this.v + 1][dyd.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dyd.this.v; $$2++) {
               int $$3 = dyd.this.g + $$2;
               int $$4 = ju.c($$3);

               for (int $$5 = 0; $$5 <= dyd.this.v; $$5++) {
                  int $$6 = dyd.this.h + $$5;
                  int $$7 = ju.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dxs.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dxs.b $$0) {
         int $$1 = ju.a($$0.a());
         int $$2 = ju.a($$0.c());
         int $$3 = $$1 - dyd.this.g;
         int $$4 = $$2 - dyd.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dxs.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxs k() {
         return this.e;
      }

      @Override
      public dxt.l.a j() {
         return dxt.l.a.b;
      }
   }

   interface h extends dxs {
      dxs k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dxt.m, dyd.h {
      double[][] e;
      double[][] f;
      private final dxs g;
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

      i(final dxs $$1) {
         this.g = $$1;
         this.e = this.a(dyd.this.c, dyd.this.b);
         this.f = this.a(dyd.this.c, dyd.this.b);
         dyd.this.i.add(this);
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
         this.p = aye.d($$0, this.h, this.l);
         this.q = aye.d($$0, this.j, this.n);
         this.r = aye.d($$0, this.i, this.m);
         this.s = aye.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = aye.d($$0, this.p, this.q);
         this.u = aye.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = aye.d($$0, this.t, this.u);
      }

      @Override
      public double a(dxs.b $$0) {
         if ($$0 != dyd.this) {
            return this.g.a($$0);
         } else if (!dyd.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dyd.this.z
               ? aye.a(
                  (double)dyd.this.D / (double)dyd.this.w,
                  (double)dyd.this.E / (double)dyd.this.x,
                  (double)dyd.this.F / (double)dyd.this.w,
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
      public void a(double[] $$0, dxs.a $$1) {
         if (dyd.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dxs k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dxt.l.a j() {
         return dxt.l.a.a;
      }
   }
}
