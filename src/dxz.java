import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dxz implements dxo.a, dxo.b {
   private final dyd a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dxz.i> i;
   final List<dxz.e> j;
   private final Map<dxo, dxo> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dxh m;
   private final dxo n;
   private final dxz.c o;
   private final dyx p;
   private final dxz.g q;
   private final dxz.g r;
   private final dxp.c s;
   private long t = dbg.a;
   private dyx.a u = new dyx.a(1.0, 0.0);
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
   private final dxo.a J = new dxo.a() {
      @Override
      public dxo.b a(int $$0) {
         dxz.this.B = ($$0 + dxz.this.d) * dxz.this.x;
         dxz.this.G++;
         dxz.this.E = 0;
         dxz.this.I = $$0;
         return dxz.this;
      }

      @Override
      public void a(double[] $$0, dxo $$1) {
         for (int $$2 = 0; $$2 < dxz.this.c + 1; $$2++) {
            dxz.this.B = ($$2 + dxz.this.d) * dxz.this.x;
            dxz.this.G++;
            dxz.this.E = 0;
            dxz.this.I = $$2;
            $$0[$$2] = $$1.a(dxz.this);
         }
      }
   };

   public static dxz a(dtz $$0, dyj $$1, dxp.c $$2, dya $$3, dxh.a $$4, dyx $$5) {
      dyd $$6 = $$3.f().a($$0);
      dbg $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dxz($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dxz(int $$0, dyj $$1, int $$2, int $$3, dyd $$4, dxp.c $$5, dya $$6, dxh.a $$7, dyx $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = ayz.a($$4.d(), this.x);
      this.d = ayz.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = jt.a($$2);
      this.h = jt.a($$3);
      this.v = jt.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dxz.g(new dxz.a(), false);
      this.r = new dxz.g(new dxz.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = jt.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = jt.c($$13);
            dyx.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dyb $$16 = $$1.a();
      dyb $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dxh.a($$7);
      } else {
         int $$18 = kb.a($$2);
         int $$19 = kb.a($$3);
         this.m = dxh.a(this, new dbg($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dxz.c> $$20 = ImmutableList.builder();
      dxo $$21 = dxp.e(dxp.a($$17.l(), dxp.b.a)).a(this::a);
      $$20.add((dxz.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dyf.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new egz($$20.build());
      this.n = $$17.k();
   }

   protected ddh.f a(dyb $$0, List<ddh.d> $$1) {
      return new ddh.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dsd e() {
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
      return this.l.computeIfAbsent(aqv.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aqv.a($$0);
      int $$2 = aqv.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dxo.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dyx d() {
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

         for (dxz.i $$4 : this.i) {
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

   public dxz c(int $$0) {
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
   public void a(double[] $$0, dxo $$1) {
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

      for (dxz.e $$2 : this.j) {
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
      this.i.forEach(dxz.i::l);
   }

   public dxh i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dyx.a c(int $$0, int $$1) {
      long $$2 = dbg.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dyx.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dxo a(dxo $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dxo b(dxo $$0) {
      if ($$0 instanceof dxp.l $$1) {
         return (dxo)(switch ($$1.j()) {
            case a -> new dxz.i($$1.k());
            case b -> new dxz.g($$1.k(), true);
            case c -> new dxz.d($$1.k());
            case d -> new dxz.f($$1.k());
            case e -> new dxz.e($$1.k());
         });
      } else {
         if (this.p != dyx.a()) {
            if ($$0 == dxp.d.a) {
               return this.q;
            }

            if ($$0 == dxp.f.a) {
               return this.r;
            }
         }

         if ($$0 == dxp.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dxp.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dxz.h {
      @Override
      public dxo k() {
         return dxp.d.a;
      }

      @Override
      public dxo a(dxo.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dxo.b $$0) {
         return dxz.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dxo.a $$1) {
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
      public ays<? extends dxo> c() {
         return dxp.d.e;
      }
   }

   class b implements dxz.h {
      @Override
      public dxo k() {
         return dxp.f.a;
      }

      @Override
      public dxo a(dxo.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dxo.b $$0) {
         return dxz.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dxo.a $$1) {
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
      public ays<? extends dxo> c() {
         return dxp.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dsd calculate(dxo.b var1);
   }

   static class d implements dxp.m, dxz.h {
      private final dxo a;
      private long e = dbg.a;
      private double f;

      d(dxo $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dxo.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dbg.c($$1, $$2);
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
      public void a(double[] $$0, dxo.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dxo k() {
         return this.a;
      }

      @Override
      public dxp.l.a j() {
         return dxp.l.a.c;
      }
   }

   class e implements dxp.m, dxz.h {
      final dxo e;
      final double[] f;

      e(final dxo $$0) {
         this.e = $$0;
         this.f = new double[dxz.this.w * dxz.this.w * dxz.this.x];
         dxz.this.j.add(this);
      }

      @Override
      public double a(dxo.b $$0) {
         if ($$0 != dxz.this) {
            return this.e.a($$0);
         } else if (!dxz.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dxz.this.D;
            int $$2 = dxz.this.E;
            int $$3 = dxz.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dxz.this.w && $$2 < dxz.this.x && $$3 < dxz.this.w
               ? this.f[((dxz.this.x - 1 - $$2) * dxz.this.w + $$1) * dxz.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dxo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxo k() {
         return this.e;
      }

      @Override
      public dxp.l.a j() {
         return dxp.l.a.e;
      }
   }

   class f implements dxp.m, dxz.h {
      private final dxo e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final dxo $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dxo.b $$0) {
         if ($$0 != dxz.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dxz.this.H) {
            return this.i[dxz.this.I];
         } else if (this.f == dxz.this.G) {
            return this.h;
         } else {
            this.f = dxz.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dxo.a $$1) {
         if (this.i != null && this.g == dxz.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dxz.this.H;
         }
      }

      @Override
      public dxo k() {
         return this.e;
      }

      @Override
      public dxp.l.a j() {
         return dxp.l.a.d;
      }
   }

   class g implements dxp.m, dxz.h {
      private final dxo e;
      final double[][] f;

      g(final dxo $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[dxz.this.v + 1][dxz.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dxz.this.v; $$2++) {
               int $$3 = dxz.this.g + $$2;
               int $$4 = jt.c($$3);

               for (int $$5 = 0; $$5 <= dxz.this.v; $$5++) {
                  int $$6 = dxz.this.h + $$5;
                  int $$7 = jt.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dxo.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dxo.b $$0) {
         int $$1 = jt.a($$0.a());
         int $$2 = jt.a($$0.c());
         int $$3 = $$1 - dxz.this.g;
         int $$4 = $$2 - dxz.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dxo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxo k() {
         return this.e;
      }

      @Override
      public dxp.l.a j() {
         return dxp.l.a.b;
      }
   }

   interface h extends dxo {
      dxo k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dxp.m, dxz.h {
      double[][] e;
      double[][] f;
      private final dxo g;
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

      i(final dxo $$1) {
         this.g = $$1;
         this.e = this.a(dxz.this.c, dxz.this.b);
         this.f = this.a(dxz.this.c, dxz.this.b);
         dxz.this.i.add(this);
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
         this.p = ayz.d($$0, this.h, this.l);
         this.q = ayz.d($$0, this.j, this.n);
         this.r = ayz.d($$0, this.i, this.m);
         this.s = ayz.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = ayz.d($$0, this.p, this.q);
         this.u = ayz.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = ayz.d($$0, this.t, this.u);
      }

      @Override
      public double a(dxo.b $$0) {
         if ($$0 != dxz.this) {
            return this.g.a($$0);
         } else if (!dxz.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dxz.this.z
               ? ayz.a(
                  (double)dxz.this.D / (double)dxz.this.w,
                  (double)dxz.this.E / (double)dxz.this.x,
                  (double)dxz.this.F / (double)dxz.this.w,
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
      public void a(double[] $$0, dxo.a $$1) {
         if (dxz.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dxo k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dxp.l.a j() {
         return dxp.l.a.a;
      }
   }
}
