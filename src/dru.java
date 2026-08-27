import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dru implements drj.a, drj.b {
   private final dry a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dru.i> i;
   final List<dru.e> j;
   private final Map<drj, drj> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final drc m;
   private final drj n;
   private final dru.c o;
   private final dss p;
   private final dru.g q;
   private final dru.g r;
   private final drk.c s;
   private long t = cvl.a;
   private dss.a u = new dss.a(1.0, 0.0);
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
   private final drj.a J = new drj.a() {
      @Override
      public drj.b a(int $$0) {
         dru.this.B = ($$0 + dru.this.d) * dru.this.x;
         dru.this.G++;
         dru.this.E = 0;
         dru.this.I = $$0;
         return dru.this;
      }

      @Override
      public void a(double[] $$0, drj $$1) {
         for (int $$2 = 0; $$2 < dru.this.c + 1; $$2++) {
            dru.this.B = ($$2 + dru.this.d) * dru.this.x;
            dru.this.G++;
            dru.this.E = 0;
            dru.this.I = $$2;
            $$0[$$2] = $$1.a(dru.this);
         }
      }
   };

   public static dru a(doa $$0, dse $$1, drk.c $$2, drv $$3, drc.a $$4, dss $$5) {
      dry $$6 = $$3.f().a($$0);
      cvl $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dru($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dru(int $$0, dse $$1, int $$2, int $$3, dry $$4, drk.c $$5, drv $$6, drc.a $$7, dss $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = awm.a($$4.d(), this.x);
      this.d = awm.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = iw.a($$2);
      this.h = iw.a($$3);
      this.v = iw.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dru.g(new dru.a(), false);
      this.r = new dru.g(new dru.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = iw.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = iw.c($$13);
            dss.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      drw $$16 = $$1.a();
      drw $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = drc.a($$7);
      } else {
         int $$18 = jd.a($$2);
         int $$19 = jd.a($$3);
         this.m = drc.a(this, new cvl($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dru.c> $$20 = ImmutableList.builder();
      drj $$21 = drk.e(drk.a($$17.l(), drk.b.a)).a(this::a);
      $$20.add((dru.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dsa.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new eau($$20.build());
      this.n = $$17.k();
   }

   protected cxm.f a(drw $$0, List<cxm.d> $$1) {
      return new cxm.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dme e() {
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
      int $$2 = iw.c(iw.a($$0));
      int $$3 = iw.c(iw.a($$1));
      return this.l.computeIfAbsent(aoq.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aoq.a($$0);
      int $$2 = aoq.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new drj.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dss d() {
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

         for (dru.i $$4 : this.i) {
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

   public dru c(int $$0) {
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
   public void a(double[] $$0, drj $$1) {
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

      for (dru.e $$2 : this.j) {
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
      this.i.forEach(dru.i::l);
   }

   public drc i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dss.a c(int $$0, int $$1) {
      long $$2 = cvl.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dss.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected drj a(drj $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private drj b(drj $$0) {
      if ($$0 instanceof drk.l $$1) {
         return (drj)(switch ($$1.j()) {
            case a -> new dru.i($$1.k());
            case b -> new dru.g($$1.k(), true);
            case c -> new dru.d($$1.k());
            case d -> new dru.f($$1.k());
            case e -> new dru.e($$1.k());
         });
      } else {
         if (this.p != dss.a()) {
            if ($$0 == drk.d.a) {
               return this.q;
            }

            if ($$0 == drk.f.a) {
               return this.r;
            }
         }

         if ($$0 == drk.b.a) {
            return this.s;
         } else {
            return $$0 instanceof drk.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dru.h {
      @Override
      public drj k() {
         return drk.d.a;
      }

      @Override
      public drj a(drj.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(drj.b $$0) {
         return dru.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, drj.a $$1) {
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
      public awg<? extends drj> c() {
         return drk.d.e;
      }
   }

   class b implements dru.h {
      @Override
      public drj k() {
         return drk.f.a;
      }

      @Override
      public drj a(drj.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(drj.b $$0) {
         return dru.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, drj.a $$1) {
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
      public awg<? extends drj> c() {
         return drk.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dme calculate(drj.b var1);
   }

   static class d implements drk.m, dru.h {
      private final drj a;
      private long e = cvl.a;
      private double f;

      d(drj $$0) {
         this.a = $$0;
      }

      @Override
      public double a(drj.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = cvl.c($$1, $$2);
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
      public void a(double[] $$0, drj.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public drj k() {
         return this.a;
      }

      @Override
      public drk.l.a j() {
         return drk.l.a.c;
      }
   }

   class e implements drk.m, dru.h {
      final drj e;
      final double[] f;

      e(drj $$0) {
         this.e = $$0;
         this.f = new double[dru.this.w * dru.this.w * dru.this.x];
         dru.this.j.add(this);
      }

      @Override
      public double a(drj.b $$0) {
         if ($$0 != dru.this) {
            return this.e.a($$0);
         } else if (!dru.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dru.this.D;
            int $$2 = dru.this.E;
            int $$3 = dru.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dru.this.w && $$2 < dru.this.x && $$3 < dru.this.w
               ? this.f[((dru.this.x - 1 - $$2) * dru.this.w + $$1) * dru.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, drj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public drj k() {
         return this.e;
      }

      @Override
      public drk.l.a j() {
         return drk.l.a.e;
      }
   }

   class f implements drk.m, dru.h {
      private final drj e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(drj $$0) {
         this.e = $$0;
      }

      @Override
      public double a(drj.b $$0) {
         if ($$0 != dru.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dru.this.H) {
            return this.i[dru.this.I];
         } else if (this.f == dru.this.G) {
            return this.h;
         } else {
            this.f = dru.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, drj.a $$1) {
         if (this.i != null && this.g == dru.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dru.this.H;
         }
      }

      @Override
      public drj k() {
         return this.e;
      }

      @Override
      public drk.l.a j() {
         return drk.l.a.d;
      }
   }

   class g implements drk.m, dru.h {
      private final drj e;
      final double[][] f;

      g(drj $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dru.this.v + 1][dru.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dru.this.v; $$2++) {
               int $$3 = dru.this.g + $$2;
               int $$4 = iw.c($$3);

               for (int $$5 = 0; $$5 <= dru.this.v; $$5++) {
                  int $$6 = dru.this.h + $$5;
                  int $$7 = iw.c($$6);
                  this.f[$$2][$$5] = $$0.a(new drj.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(drj.b $$0) {
         int $$1 = iw.a($$0.a());
         int $$2 = iw.a($$0.c());
         int $$3 = $$1 - dru.this.g;
         int $$4 = $$2 - dru.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, drj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public drj k() {
         return this.e;
      }

      @Override
      public drk.l.a j() {
         return drk.l.a.b;
      }
   }

   interface h extends drj {
      drj k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements drk.m, dru.h {
      double[][] e;
      double[][] f;
      private final drj g;
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

      i(drj $$1) {
         this.g = $$1;
         this.e = this.a(dru.this.c, dru.this.b);
         this.f = this.a(dru.this.c, dru.this.b);
         dru.this.i.add(this);
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
         this.p = awm.d($$0, this.h, this.l);
         this.q = awm.d($$0, this.j, this.n);
         this.r = awm.d($$0, this.i, this.m);
         this.s = awm.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = awm.d($$0, this.p, this.q);
         this.u = awm.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = awm.d($$0, this.t, this.u);
      }

      @Override
      public double a(drj.b $$0) {
         if ($$0 != dru.this) {
            return this.g.a($$0);
         } else if (!dru.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dru.this.z
               ? awm.a(
                  (double)dru.this.D / (double)dru.this.w,
                  (double)dru.this.E / (double)dru.this.x,
                  (double)dru.this.F / (double)dru.this.w,
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
      public void a(double[] $$0, drj.a $$1) {
         if (dru.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public drj k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public drk.l.a j() {
         return drk.l.a.a;
      }
   }
}
