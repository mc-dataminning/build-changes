import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dxt implements dxi.a, dxi.b {
   private final dxx a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dxt.i> i;
   final List<dxt.e> j;
   private final Map<dxi, dxi> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dxb m;
   private final dxi n;
   private final dxt.c o;
   private final dyr p;
   private final dxt.g q;
   private final dxt.g r;
   private final dxj.c s;
   private long t = dba.a;
   private dyr.a u = new dyr.a(1.0, 0.0);
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
   private final dxi.a J = new dxi.a() {
      @Override
      public dxi.b a(int $$0) {
         dxt.this.B = ($$0 + dxt.this.d) * dxt.this.x;
         dxt.this.G++;
         dxt.this.E = 0;
         dxt.this.I = $$0;
         return dxt.this;
      }

      @Override
      public void a(double[] $$0, dxi $$1) {
         for (int $$2 = 0; $$2 < dxt.this.c + 1; $$2++) {
            dxt.this.B = ($$2 + dxt.this.d) * dxt.this.x;
            dxt.this.G++;
            dxt.this.E = 0;
            dxt.this.I = $$2;
            $$0[$$2] = $$1.a(dxt.this);
         }
      }
   };

   public static dxt a(dtt $$0, dyd $$1, dxj.c $$2, dxu $$3, dxb.a $$4, dyr $$5) {
      dxx $$6 = $$3.f().a($$0);
      dba $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dxt($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dxt(int $$0, dyd $$1, int $$2, int $$3, dxx $$4, dxj.c $$5, dxu $$6, dxb.a $$7, dyr $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = ayu.a($$4.d(), this.x);
      this.d = ayu.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = jt.a($$2);
      this.h = jt.a($$3);
      this.v = jt.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dxt.g(new dxt.a(), false);
      this.r = new dxt.g(new dxt.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = jt.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = jt.c($$13);
            dyr.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dxv $$16 = $$1.a();
      dxv $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dxb.a($$7);
      } else {
         int $$18 = kb.a($$2);
         int $$19 = kb.a($$3);
         this.m = dxb.a(this, new dba($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dxt.c> $$20 = ImmutableList.builder();
      dxi $$21 = dxj.e(dxj.a($$17.l(), dxj.b.a)).a(this::a);
      $$20.add((dxt.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dxz.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new egt($$20.build());
      this.n = $$17.k();
   }

   protected ddb.f a(dxv $$0, List<ddb.d> $$1) {
      return new ddb.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected drx e() {
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
      return this.l.computeIfAbsent(aqr.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aqr.a($$0);
      int $$2 = aqr.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dxi.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dyr d() {
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

         for (dxt.i $$4 : this.i) {
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

   public dxt c(int $$0) {
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
   public void a(double[] $$0, dxi $$1) {
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

      for (dxt.e $$2 : this.j) {
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
      this.i.forEach(dxt.i::l);
   }

   public dxb i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dyr.a c(int $$0, int $$1) {
      long $$2 = dba.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dyr.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dxi a(dxi $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dxi b(dxi $$0) {
      if ($$0 instanceof dxj.l $$1) {
         return (dxi)(switch ($$1.j()) {
            case a -> new dxt.i($$1.k());
            case b -> new dxt.g($$1.k(), true);
            case c -> new dxt.d($$1.k());
            case d -> new dxt.f($$1.k());
            case e -> new dxt.e($$1.k());
         });
      } else {
         if (this.p != dyr.a()) {
            if ($$0 == dxj.d.a) {
               return this.q;
            }

            if ($$0 == dxj.f.a) {
               return this.r;
            }
         }

         if ($$0 == dxj.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dxj.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dxt.h {
      @Override
      public dxi k() {
         return dxj.d.a;
      }

      @Override
      public dxi a(dxi.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dxi.b $$0) {
         return dxt.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dxi.a $$1) {
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
      public ayn<? extends dxi> c() {
         return dxj.d.e;
      }
   }

   class b implements dxt.h {
      @Override
      public dxi k() {
         return dxj.f.a;
      }

      @Override
      public dxi a(dxi.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dxi.b $$0) {
         return dxt.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dxi.a $$1) {
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
      public ayn<? extends dxi> c() {
         return dxj.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      drx calculate(dxi.b var1);
   }

   static class d implements dxj.m, dxt.h {
      private final dxi a;
      private long e = dba.a;
      private double f;

      d(dxi $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dxi.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dba.c($$1, $$2);
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
      public void a(double[] $$0, dxi.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dxi k() {
         return this.a;
      }

      @Override
      public dxj.l.a j() {
         return dxj.l.a.c;
      }
   }

   class e implements dxj.m, dxt.h {
      final dxi e;
      final double[] f;

      e(final dxi $$0) {
         this.e = $$0;
         this.f = new double[dxt.this.w * dxt.this.w * dxt.this.x];
         dxt.this.j.add(this);
      }

      @Override
      public double a(dxi.b $$0) {
         if ($$0 != dxt.this) {
            return this.e.a($$0);
         } else if (!dxt.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dxt.this.D;
            int $$2 = dxt.this.E;
            int $$3 = dxt.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dxt.this.w && $$2 < dxt.this.x && $$3 < dxt.this.w
               ? this.f[((dxt.this.x - 1 - $$2) * dxt.this.w + $$1) * dxt.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dxi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxi k() {
         return this.e;
      }

      @Override
      public dxj.l.a j() {
         return dxj.l.a.e;
      }
   }

   class f implements dxj.m, dxt.h {
      private final dxi e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final dxi $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dxi.b $$0) {
         if ($$0 != dxt.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dxt.this.H) {
            return this.i[dxt.this.I];
         } else if (this.f == dxt.this.G) {
            return this.h;
         } else {
            this.f = dxt.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dxi.a $$1) {
         if (this.i != null && this.g == dxt.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dxt.this.H;
         }
      }

      @Override
      public dxi k() {
         return this.e;
      }

      @Override
      public dxj.l.a j() {
         return dxj.l.a.d;
      }
   }

   class g implements dxj.m, dxt.h {
      private final dxi e;
      final double[][] f;

      g(final dxi $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[dxt.this.v + 1][dxt.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dxt.this.v; $$2++) {
               int $$3 = dxt.this.g + $$2;
               int $$4 = jt.c($$3);

               for (int $$5 = 0; $$5 <= dxt.this.v; $$5++) {
                  int $$6 = dxt.this.h + $$5;
                  int $$7 = jt.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dxi.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dxi.b $$0) {
         int $$1 = jt.a($$0.a());
         int $$2 = jt.a($$0.c());
         int $$3 = $$1 - dxt.this.g;
         int $$4 = $$2 - dxt.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dxi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxi k() {
         return this.e;
      }

      @Override
      public dxj.l.a j() {
         return dxj.l.a.b;
      }
   }

   interface h extends dxi {
      dxi k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dxj.m, dxt.h {
      double[][] e;
      double[][] f;
      private final dxi g;
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

      i(final dxi $$1) {
         this.g = $$1;
         this.e = this.a(dxt.this.c, dxt.this.b);
         this.f = this.a(dxt.this.c, dxt.this.b);
         dxt.this.i.add(this);
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
         this.p = ayu.d($$0, this.h, this.l);
         this.q = ayu.d($$0, this.j, this.n);
         this.r = ayu.d($$0, this.i, this.m);
         this.s = ayu.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = ayu.d($$0, this.p, this.q);
         this.u = ayu.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = ayu.d($$0, this.t, this.u);
      }

      @Override
      public double a(dxi.b $$0) {
         if ($$0 != dxt.this) {
            return this.g.a($$0);
         } else if (!dxt.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dxt.this.z
               ? ayu.a(
                  (double)dxt.this.D / (double)dxt.this.w,
                  (double)dxt.this.E / (double)dxt.this.x,
                  (double)dxt.this.F / (double)dxt.this.w,
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
      public void a(double[] $$0, dxi.a $$1) {
         if (dxt.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dxi k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dxj.l.a j() {
         return dxj.l.a.a;
      }
   }
}
