import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dwd implements dvs.a, dvs.b {
   private final dwh a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dwd.i> i;
   final List<dwd.e> j;
   private final Map<dvs, dvs> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dvl m;
   private final dvs n;
   private final dwd.c o;
   private final dxb p;
   private final dwd.g q;
   private final dwd.g r;
   private final dvt.c s;
   private long t = czk.a;
   private dxb.a u = new dxb.a(1.0, 0.0);
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
   private final dvs.a J = new dvs.a() {
      @Override
      public dvs.b a(int $$0) {
         dwd.this.B = ($$0 + dwd.this.d) * dwd.this.x;
         dwd.this.G++;
         dwd.this.E = 0;
         dwd.this.I = $$0;
         return dwd.this;
      }

      @Override
      public void a(double[] $$0, dvs $$1) {
         for (int $$2 = 0; $$2 < dwd.this.c + 1; $$2++) {
            dwd.this.B = ($$2 + dwd.this.d) * dwd.this.x;
            dwd.this.G++;
            dwd.this.E = 0;
            dwd.this.I = $$2;
            $$0[$$2] = $$1.a(dwd.this);
         }
      }
   };

   public static dwd a(dsd $$0, dwn $$1, dvt.c $$2, dwe $$3, dvl.a $$4, dxb $$5) {
      dwh $$6 = $$3.f().a($$0);
      czk $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dwd($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dwd(int $$0, dwn $$1, int $$2, int $$3, dwh $$4, dvt.c $$5, dwe $$6, dvl.a $$7, dxb $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = axz.a($$4.d(), this.x);
      this.d = axz.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = jh.a($$2);
      this.h = jh.a($$3);
      this.v = jh.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dwd.g(new dwd.a(), false);
      this.r = new dwd.g(new dwd.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = jh.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = jh.c($$13);
            dxb.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dwf $$16 = $$1.a();
      dwf $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dvl.a($$7);
      } else {
         int $$18 = jp.a($$2);
         int $$19 = jp.a($$3);
         this.m = dvl.a(this, new czk($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dwd.c> $$20 = ImmutableList.builder();
      dvs $$21 = dvt.e(dvt.a($$17.l(), dvt.b.a)).a(this::a);
      $$20.add((dwd.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dwj.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new efd($$20.build());
      this.n = $$17.k();
   }

   protected dbl.f a(dwf $$0, List<dbl.d> $$1) {
      return new dbl.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dqh e() {
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
      int $$2 = jh.c(jh.a($$0));
      int $$3 = jh.c(jh.a($$1));
      return this.l.computeIfAbsent(apx.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = apx.a($$0);
      int $$2 = apx.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dvs.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dxb d() {
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

         for (dwd.i $$4 : this.i) {
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

   public dwd c(int $$0) {
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
   public void a(double[] $$0, dvs $$1) {
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

      for (dwd.e $$2 : this.j) {
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
      this.i.forEach(dwd.i::l);
   }

   public dvl i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dxb.a c(int $$0, int $$1) {
      long $$2 = czk.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dxb.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dvs a(dvs $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dvs b(dvs $$0) {
      if ($$0 instanceof dvt.l $$1) {
         return (dvs)(switch ($$1.j()) {
            case a -> new dwd.i($$1.k());
            case b -> new dwd.g($$1.k(), true);
            case c -> new dwd.d($$1.k());
            case d -> new dwd.f($$1.k());
            case e -> new dwd.e($$1.k());
         });
      } else {
         if (this.p != dxb.a()) {
            if ($$0 == dvt.d.a) {
               return this.q;
            }

            if ($$0 == dvt.f.a) {
               return this.r;
            }
         }

         if ($$0 == dvt.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dvt.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dwd.h {
      @Override
      public dvs k() {
         return dvt.d.a;
      }

      @Override
      public dvs a(dvs.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dvs.b $$0) {
         return dwd.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dvs.a $$1) {
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
      public axt<? extends dvs> c() {
         return dvt.d.e;
      }
   }

   class b implements dwd.h {
      @Override
      public dvs k() {
         return dvt.f.a;
      }

      @Override
      public dvs a(dvs.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dvs.b $$0) {
         return dwd.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dvs.a $$1) {
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
      public axt<? extends dvs> c() {
         return dvt.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dqh calculate(dvs.b var1);
   }

   static class d implements dvt.m, dwd.h {
      private final dvs a;
      private long e = czk.a;
      private double f;

      d(dvs $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dvs.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = czk.c($$1, $$2);
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
      public void a(double[] $$0, dvs.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dvs k() {
         return this.a;
      }

      @Override
      public dvt.l.a j() {
         return dvt.l.a.c;
      }
   }

   class e implements dvt.m, dwd.h {
      final dvs e;
      final double[] f;

      e(dvs $$0) {
         this.e = $$0;
         this.f = new double[dwd.this.w * dwd.this.w * dwd.this.x];
         dwd.this.j.add(this);
      }

      @Override
      public double a(dvs.b $$0) {
         if ($$0 != dwd.this) {
            return this.e.a($$0);
         } else if (!dwd.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dwd.this.D;
            int $$2 = dwd.this.E;
            int $$3 = dwd.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dwd.this.w && $$2 < dwd.this.x && $$3 < dwd.this.w
               ? this.f[((dwd.this.x - 1 - $$2) * dwd.this.w + $$1) * dwd.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dvs.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dvs k() {
         return this.e;
      }

      @Override
      public dvt.l.a j() {
         return dvt.l.a.e;
      }
   }

   class f implements dvt.m, dwd.h {
      private final dvs e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dvs $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dvs.b $$0) {
         if ($$0 != dwd.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dwd.this.H) {
            return this.i[dwd.this.I];
         } else if (this.f == dwd.this.G) {
            return this.h;
         } else {
            this.f = dwd.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dvs.a $$1) {
         if (this.i != null && this.g == dwd.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dwd.this.H;
         }
      }

      @Override
      public dvs k() {
         return this.e;
      }

      @Override
      public dvt.l.a j() {
         return dvt.l.a.d;
      }
   }

   class g implements dvt.m, dwd.h {
      private final dvs e;
      final double[][] f;

      g(dvs $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dwd.this.v + 1][dwd.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dwd.this.v; $$2++) {
               int $$3 = dwd.this.g + $$2;
               int $$4 = jh.c($$3);

               for (int $$5 = 0; $$5 <= dwd.this.v; $$5++) {
                  int $$6 = dwd.this.h + $$5;
                  int $$7 = jh.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dvs.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dvs.b $$0) {
         int $$1 = jh.a($$0.a());
         int $$2 = jh.a($$0.c());
         int $$3 = $$1 - dwd.this.g;
         int $$4 = $$2 - dwd.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dvs.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dvs k() {
         return this.e;
      }

      @Override
      public dvt.l.a j() {
         return dvt.l.a.b;
      }
   }

   interface h extends dvs {
      dvs k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dvt.m, dwd.h {
      double[][] e;
      double[][] f;
      private final dvs g;
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

      i(dvs $$1) {
         this.g = $$1;
         this.e = this.a(dwd.this.c, dwd.this.b);
         this.f = this.a(dwd.this.c, dwd.this.b);
         dwd.this.i.add(this);
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
         this.p = axz.d($$0, this.h, this.l);
         this.q = axz.d($$0, this.j, this.n);
         this.r = axz.d($$0, this.i, this.m);
         this.s = axz.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = axz.d($$0, this.p, this.q);
         this.u = axz.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = axz.d($$0, this.t, this.u);
      }

      @Override
      public double a(dvs.b $$0) {
         if ($$0 != dwd.this) {
            return this.g.a($$0);
         } else if (!dwd.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dwd.this.z
               ? axz.a(
                  (double)dwd.this.D / (double)dwd.this.w,
                  (double)dwd.this.E / (double)dwd.this.x,
                  (double)dwd.this.F / (double)dwd.this.w,
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
      public void a(double[] $$0, dvs.a $$1) {
         if (dwd.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dvs k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dvt.l.a j() {
         return dvt.l.a.a;
      }
   }
}
