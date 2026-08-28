import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dxx implements dxm.a, dxm.b {
   private final dyb a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dxx.i> i;
   final List<dxx.e> j;
   private final Map<dxm, dxm> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dxf m;
   private final dxm n;
   private final dxx.c o;
   private final dyv p;
   private final dxx.g q;
   private final dxx.g r;
   private final dxn.c s;
   private long t = dbe.a;
   private dyv.a u = new dyv.a(1.0, 0.0);
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
   private final dxm.a J = new dxm.a() {
      @Override
      public dxm.b a(int $$0) {
         dxx.this.B = ($$0 + dxx.this.d) * dxx.this.x;
         dxx.this.G++;
         dxx.this.E = 0;
         dxx.this.I = $$0;
         return dxx.this;
      }

      @Override
      public void a(double[] $$0, dxm $$1) {
         for (int $$2 = 0; $$2 < dxx.this.c + 1; $$2++) {
            dxx.this.B = ($$2 + dxx.this.d) * dxx.this.x;
            dxx.this.G++;
            dxx.this.E = 0;
            dxx.this.I = $$2;
            $$0[$$2] = $$1.a(dxx.this);
         }
      }
   };

   public static dxx a(dtx $$0, dyh $$1, dxn.c $$2, dxy $$3, dxf.a $$4, dyv $$5) {
      dyb $$6 = $$3.f().a($$0);
      dbe $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dxx($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dxx(int $$0, dyh $$1, int $$2, int $$3, dyb $$4, dxn.c $$5, dxy $$6, dxf.a $$7, dyv $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = ayy.a($$4.d(), this.x);
      this.d = ayy.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = jt.a($$2);
      this.h = jt.a($$3);
      this.v = jt.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dxx.g(new dxx.a(), false);
      this.r = new dxx.g(new dxx.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = jt.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = jt.c($$13);
            dyv.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dxz $$16 = $$1.a();
      dxz $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dxf.a($$7);
      } else {
         int $$18 = kb.a($$2);
         int $$19 = kb.a($$3);
         this.m = dxf.a(this, new dbe($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dxx.c> $$20 = ImmutableList.builder();
      dxm $$21 = dxn.e(dxn.a($$17.l(), dxn.b.a)).a(this::a);
      $$20.add((dxx.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dyd.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new egx($$20.build());
      this.n = $$17.k();
   }

   protected ddf.f a(dxz $$0, List<ddf.d> $$1) {
      return new ddf.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dsb e() {
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
      int $$2 = jt.c(jt.a($$0));
      int $$3 = jt.c(jt.a($$1));
      return this.l.computeIfAbsent(aqu.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aqu.a($$0);
      int $$2 = aqu.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dxm.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dyv d() {
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

         for (dxx.i $$4 : this.i) {
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

   public dxx c(int $$0) {
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
   public void a(double[] $$0, dxm $$1) {
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

      for (dxx.e $$2 : this.j) {
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
      this.i.forEach(dxx.i::l);
   }

   public dxf i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dyv.a c(int $$0, int $$1) {
      long $$2 = dbe.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dyv.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dxm a(dxm $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dxm b(dxm $$0) {
      if ($$0 instanceof dxn.l $$1) {
         return (dxm)(switch ($$1.j()) {
            case a -> new dxx.i($$1.k());
            case b -> new dxx.g($$1.k(), true);
            case c -> new dxx.d($$1.k());
            case d -> new dxx.f($$1.k());
            case e -> new dxx.e($$1.k());
         });
      } else {
         if (this.p != dyv.a()) {
            if ($$0 == dxn.d.a) {
               return this.q;
            }

            if ($$0 == dxn.f.a) {
               return this.r;
            }
         }

         if ($$0 == dxn.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dxn.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dxx.h {
      @Override
      public dxm k() {
         return dxn.d.a;
      }

      @Override
      public dxm a(dxm.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dxm.b $$0) {
         return dxx.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dxm.a $$1) {
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
      public ayr<? extends dxm> c() {
         return dxn.d.e;
      }
   }

   class b implements dxx.h {
      @Override
      public dxm k() {
         return dxn.f.a;
      }

      @Override
      public dxm a(dxm.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dxm.b $$0) {
         return dxx.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dxm.a $$1) {
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
      public ayr<? extends dxm> c() {
         return dxn.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dsb calculate(dxm.b var1);
   }

   static class d implements dxn.m, dxx.h {
      private final dxm a;
      private long e = dbe.a;
      private double f;

      d(dxm $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dxm.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dbe.c($$1, $$2);
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
      public void a(double[] $$0, dxm.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dxm k() {
         return this.a;
      }

      @Override
      public dxn.l.a j() {
         return dxn.l.a.c;
      }
   }

   class e implements dxn.m, dxx.h {
      final dxm e;
      final double[] f;

      e(final dxm $$0) {
         this.e = $$0;
         this.f = new double[dxx.this.w * dxx.this.w * dxx.this.x];
         dxx.this.j.add(this);
      }

      @Override
      public double a(dxm.b $$0) {
         if ($$0 != dxx.this) {
            return this.e.a($$0);
         } else if (!dxx.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dxx.this.D;
            int $$2 = dxx.this.E;
            int $$3 = dxx.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dxx.this.w && $$2 < dxx.this.x && $$3 < dxx.this.w
               ? this.f[((dxx.this.x - 1 - $$2) * dxx.this.w + $$1) * dxx.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dxm.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxm k() {
         return this.e;
      }

      @Override
      public dxn.l.a j() {
         return dxn.l.a.e;
      }
   }

   class f implements dxn.m, dxx.h {
      private final dxm e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final dxm $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dxm.b $$0) {
         if ($$0 != dxx.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dxx.this.H) {
            return this.i[dxx.this.I];
         } else if (this.f == dxx.this.G) {
            return this.h;
         } else {
            this.f = dxx.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dxm.a $$1) {
         if (this.i != null && this.g == dxx.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dxx.this.H;
         }
      }

      @Override
      public dxm k() {
         return this.e;
      }

      @Override
      public dxn.l.a j() {
         return dxn.l.a.d;
      }
   }

   class g implements dxn.m, dxx.h {
      private final dxm e;
      final double[][] f;

      g(final dxm $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[dxx.this.v + 1][dxx.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dxx.this.v; $$2++) {
               int $$3 = dxx.this.g + $$2;
               int $$4 = jt.c($$3);

               for (int $$5 = 0; $$5 <= dxx.this.v; $$5++) {
                  int $$6 = dxx.this.h + $$5;
                  int $$7 = jt.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dxm.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dxm.b $$0) {
         int $$1 = jt.a($$0.a());
         int $$2 = jt.a($$0.c());
         int $$3 = $$1 - dxx.this.g;
         int $$4 = $$2 - dxx.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dxm.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxm k() {
         return this.e;
      }

      @Override
      public dxn.l.a j() {
         return dxn.l.a.b;
      }
   }

   interface h extends dxm {
      dxm k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dxn.m, dxx.h {
      double[][] e;
      double[][] f;
      private final dxm g;
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

      i(final dxm $$1) {
         this.g = $$1;
         this.e = this.a(dxx.this.c, dxx.this.b);
         this.f = this.a(dxx.this.c, dxx.this.b);
         dxx.this.i.add(this);
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
         this.p = ayy.d($$0, this.h, this.l);
         this.q = ayy.d($$0, this.j, this.n);
         this.r = ayy.d($$0, this.i, this.m);
         this.s = ayy.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = ayy.d($$0, this.p, this.q);
         this.u = ayy.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = ayy.d($$0, this.t, this.u);
      }

      @Override
      public double a(dxm.b $$0) {
         if ($$0 != dxx.this) {
            return this.g.a($$0);
         } else if (!dxx.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dxx.this.z
               ? ayy.a(
                  (double)dxx.this.D / (double)dxx.this.w,
                  (double)dxx.this.E / (double)dxx.this.x,
                  (double)dxx.this.F / (double)dxx.this.w,
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
      public void a(double[] $$0, dxm.a $$1) {
         if (dxx.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dxm k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dxn.l.a j() {
         return dxn.l.a.a;
      }
   }
}
