import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dyz implements dyo.a, dyo.b {
   private final dzd a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dyz.i> i;
   final List<dyz.e> j;
   private final Map<dyo, dyo> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dyh m;
   private final dyo n;
   private final dyz.c o;
   private final dzx p;
   private final dyz.g q;
   private final dyz.g r;
   private final dyp.c s;
   private long t = dcb.a;
   private dzx.a u = new dzx.a(1.0, 0.0);
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
   private final dyo.a J = new dyo.a() {
      @Override
      public dyo.b a(int $$0) {
         dyz.this.B = ($$0 + dyz.this.d) * dyz.this.x;
         dyz.this.G++;
         dyz.this.E = 0;
         dyz.this.I = $$0;
         return dyz.this;
      }

      @Override
      public void a(double[] $$0, dyo $$1) {
         for (int $$2 = 0; $$2 < dyz.this.c + 1; $$2++) {
            dyz.this.B = ($$2 + dyz.this.d) * dyz.this.x;
            dyz.this.G++;
            dyz.this.E = 0;
            dyz.this.I = $$2;
            $$0[$$2] = $$1.a(dyz.this);
         }
      }
   };

   public static dyz a(duw $$0, dzj $$1, dyp.c $$2, dza $$3, dyh.a $$4, dzx $$5) {
      dzd $$6 = $$3.f().a($$0);
      dcb $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dyz($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dyz(int $$0, dzj $$1, int $$2, int $$3, dzd $$4, dyp.c $$5, dza $$6, dyh.a $$7, dzx $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = ayn.a($$4.d(), this.x);
      this.d = ayn.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = jx.a($$2);
      this.h = jx.a($$3);
      this.v = jx.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dyz.g(new dyz.a(), false);
      this.r = new dyz.g(new dyz.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = jx.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = jx.c($$13);
            dzx.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dzb $$16 = $$1.a();
      dzb $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dyh.a($$7);
      } else {
         int $$18 = kf.a($$2);
         int $$19 = kf.a($$3);
         this.m = dyh.a(this, new dcb($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dyz.c> $$20 = ImmutableList.builder();
      dyo $$21 = dyp.e(dyp.a($$17.l(), dyp.b.a)).a(this::a);
      $$20.add((dyz.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dzf.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new eia($$20.build());
      this.n = $$17.k();
   }

   protected ded.f a(dzb $$0, List<ded.d> $$1) {
      return new ded.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dta e() {
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
      return this.l.computeIfAbsent(aqh.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aqh.a($$0);
      int $$2 = aqh.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dyo.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dzx d() {
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

         for (dyz.i $$4 : this.i) {
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

   public dyz c(int $$0) {
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
   public void a(double[] $$0, dyo $$1) {
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

      for (dyz.e $$2 : this.j) {
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
      this.i.forEach(dyz.i::l);
   }

   public dyh i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dzx.a c(int $$0, int $$1) {
      long $$2 = dcb.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dzx.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dyo a(dyo $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dyo b(dyo $$0) {
      if ($$0 instanceof dyp.l $$1) {
         return (dyo)(switch ($$1.j()) {
            case a -> new dyz.i($$1.k());
            case b -> new dyz.g($$1.k(), true);
            case c -> new dyz.d($$1.k());
            case d -> new dyz.f($$1.k());
            case e -> new dyz.e($$1.k());
         });
      } else {
         if (this.p != dzx.a()) {
            if ($$0 == dyp.d.a) {
               return this.q;
            }

            if ($$0 == dyp.f.a) {
               return this.r;
            }
         }

         if ($$0 == dyp.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dyp.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dyz.h {
      @Override
      public dyo k() {
         return dyp.d.a;
      }

      @Override
      public dyo a(dyo.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dyo.b $$0) {
         return dyz.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dyo.a $$1) {
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
      public ayg<? extends dyo> c() {
         return dyp.d.e;
      }
   }

   class b implements dyz.h {
      @Override
      public dyo k() {
         return dyp.f.a;
      }

      @Override
      public dyo a(dyo.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dyo.b $$0) {
         return dyz.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dyo.a $$1) {
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
      public ayg<? extends dyo> c() {
         return dyp.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dta calculate(dyo.b var1);
   }

   static class d implements dyp.m, dyz.h {
      private final dyo a;
      private long e = dcb.a;
      private double f;

      d(dyo $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dyo.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dcb.c($$1, $$2);
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
      public void a(double[] $$0, dyo.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dyo k() {
         return this.a;
      }

      @Override
      public dyp.l.a j() {
         return dyp.l.a.c;
      }
   }

   class e implements dyp.m, dyz.h {
      final dyo e;
      final double[] f;

      e(final dyo $$0) {
         this.e = $$0;
         this.f = new double[dyz.this.w * dyz.this.w * dyz.this.x];
         dyz.this.j.add(this);
      }

      @Override
      public double a(dyo.b $$0) {
         if ($$0 != dyz.this) {
            return this.e.a($$0);
         } else if (!dyz.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dyz.this.D;
            int $$2 = dyz.this.E;
            int $$3 = dyz.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dyz.this.w && $$2 < dyz.this.x && $$3 < dyz.this.w
               ? this.f[((dyz.this.x - 1 - $$2) * dyz.this.w + $$1) * dyz.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dyo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dyo k() {
         return this.e;
      }

      @Override
      public dyp.l.a j() {
         return dyp.l.a.e;
      }
   }

   class f implements dyp.m, dyz.h {
      private final dyo e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final dyo $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dyo.b $$0) {
         if ($$0 != dyz.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dyz.this.H) {
            return this.i[dyz.this.I];
         } else if (this.f == dyz.this.G) {
            return this.h;
         } else {
            this.f = dyz.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dyo.a $$1) {
         if (this.i != null && this.g == dyz.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dyz.this.H;
         }
      }

      @Override
      public dyo k() {
         return this.e;
      }

      @Override
      public dyp.l.a j() {
         return dyp.l.a.d;
      }
   }

   class g implements dyp.m, dyz.h {
      private final dyo e;
      final double[][] f;

      g(final dyo $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[dyz.this.v + 1][dyz.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dyz.this.v; $$2++) {
               int $$3 = dyz.this.g + $$2;
               int $$4 = jx.c($$3);

               for (int $$5 = 0; $$5 <= dyz.this.v; $$5++) {
                  int $$6 = dyz.this.h + $$5;
                  int $$7 = jx.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dyo.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dyo.b $$0) {
         int $$1 = jx.a($$0.a());
         int $$2 = jx.a($$0.c());
         int $$3 = $$1 - dyz.this.g;
         int $$4 = $$2 - dyz.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dyo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dyo k() {
         return this.e;
      }

      @Override
      public dyp.l.a j() {
         return dyp.l.a.b;
      }
   }

   interface h extends dyo {
      dyo k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dyp.m, dyz.h {
      double[][] e;
      double[][] f;
      private final dyo g;
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

      i(final dyo $$1) {
         this.g = $$1;
         this.e = this.a(dyz.this.c, dyz.this.b);
         this.f = this.a(dyz.this.c, dyz.this.b);
         dyz.this.i.add(this);
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
         this.p = ayn.d($$0, this.h, this.l);
         this.q = ayn.d($$0, this.j, this.n);
         this.r = ayn.d($$0, this.i, this.m);
         this.s = ayn.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = ayn.d($$0, this.p, this.q);
         this.u = ayn.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = ayn.d($$0, this.t, this.u);
      }

      @Override
      public double a(dyo.b $$0) {
         if ($$0 != dyz.this) {
            return this.g.a($$0);
         } else if (!dyz.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dyz.this.z
               ? ayn.a(
                  (double)dyz.this.D / (double)dyz.this.w,
                  (double)dyz.this.E / (double)dyz.this.x,
                  (double)dyz.this.F / (double)dyz.this.w,
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
      public void a(double[] $$0, dyo.a $$1) {
         if (dyz.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dyo k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dyp.l.a j() {
         return dyp.l.a.a;
      }
   }
}
