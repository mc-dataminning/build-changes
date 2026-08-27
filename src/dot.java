import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dot implements doi.a, doi.b {
   private final dox a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dot.i> i;
   final List<dot.e> j;
   private final Map<doi, doi> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dob m;
   private final doi n;
   private final dot.c o;
   private final dpr p;
   private final dot.g q;
   private final dot.g r;
   private final doj.c s;
   private long t = csv.a;
   private dpr.a u = new dpr.a(1.0, 0.0);
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
   private final doi.a J = new doi.a() {
      @Override
      public doi.b a(int $$0) {
         dot.this.B = ($$0 + dot.this.d) * dot.this.x;
         dot.this.G++;
         dot.this.E = 0;
         dot.this.I = $$0;
         return dot.this;
      }

      @Override
      public void a(double[] $$0, doi $$1) {
         for (int $$2 = 0; $$2 < dot.this.c + 1; $$2++) {
            dot.this.B = ($$2 + dot.this.d) * dot.this.x;
            dot.this.G++;
            dot.this.E = 0;
            dot.this.I = $$2;
            $$0[$$2] = $$1.a(dot.this);
         }
      }
   };

   public static dot a(dlc $$0, dpd $$1, doj.c $$2, dou $$3, dob.a $$4, dpr $$5) {
      dox $$6 = $$3.f().a($$0);
      csv $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dot($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dot(int $$0, dpd $$1, int $$2, int $$3, dox $$4, doj.c $$5, dou $$6, dob.a $$7, dpr $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = aun.a($$4.d(), this.x);
      this.d = aun.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = is.a($$2);
      this.h = is.a($$3);
      this.v = is.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dot.g(new dot.a(), false);
      this.r = new dot.g(new dot.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = is.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = is.c($$13);
            dpr.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dov $$16 = $$1.a();
      dov $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dob.a($$7);
      } else {
         int $$18 = iz.a($$2);
         int $$19 = iz.a($$3);
         this.m = dob.a(this, new csv($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dot.c> $$20 = ImmutableList.builder();
      doi $$21 = doj.e(doj.a($$17.l(), doj.b.a)).a(this::a);
      $$20.add((dot.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(doz.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new dxt($$20.build());
      this.n = $$17.k();
   }

   protected cuw.f a(dov $$0, List<cuw.d> $$1) {
      return new cuw.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected djg e() {
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
      int $$2 = is.c(is.a($$0));
      int $$3 = is.c(is.a($$1));
      return this.l.computeIfAbsent(amt.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = amt.a($$0);
      int $$2 = amt.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new doi.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dpr d() {
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

         for (dot.i $$4 : this.i) {
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

   public dot c(int $$0) {
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
   public void a(double[] $$0, doi $$1) {
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

      for (dot.e $$2 : this.j) {
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
      this.i.forEach(dot.i::l);
   }

   public dob i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dpr.a c(int $$0, int $$1) {
      long $$2 = csv.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dpr.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected doi a(doi $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private doi b(doi $$0) {
      if ($$0 instanceof doj.l $$1) {
         return (doi)(switch ($$1.j()) {
            case a -> new dot.i($$1.k());
            case b -> new dot.g($$1.k(), true);
            case c -> new dot.d($$1.k());
            case d -> new dot.f($$1.k());
            case e -> new dot.e($$1.k());
         });
      } else {
         if (this.p != dpr.a()) {
            if ($$0 == doj.d.a) {
               return this.q;
            }

            if ($$0 == doj.f.a) {
               return this.r;
            }
         }

         if ($$0 == doj.b.a) {
            return this.s;
         } else {
            return $$0 instanceof doj.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dot.h {
      @Override
      public doi k() {
         return doj.d.a;
      }

      @Override
      public doi a(doi.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(doi.b $$0) {
         return dot.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, doi.a $$1) {
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
      public auh<? extends doi> c() {
         return doj.d.e;
      }
   }

   class b implements dot.h {
      @Override
      public doi k() {
         return doj.f.a;
      }

      @Override
      public doi a(doi.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(doi.b $$0) {
         return dot.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, doi.a $$1) {
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
      public auh<? extends doi> c() {
         return doj.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      djg calculate(doi.b var1);
   }

   static class d implements doj.m, dot.h {
      private final doi a;
      private long e = csv.a;
      private double f;

      d(doi $$0) {
         this.a = $$0;
      }

      @Override
      public double a(doi.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = csv.c($$1, $$2);
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
      public void a(double[] $$0, doi.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public doi k() {
         return this.a;
      }

      @Override
      public doj.l.a j() {
         return doj.l.a.c;
      }
   }

   class e implements doj.m, dot.h {
      final doi e;
      final double[] f;

      e(doi $$0) {
         this.e = $$0;
         this.f = new double[dot.this.w * dot.this.w * dot.this.x];
         dot.this.j.add(this);
      }

      @Override
      public double a(doi.b $$0) {
         if ($$0 != dot.this) {
            return this.e.a($$0);
         } else if (!dot.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dot.this.D;
            int $$2 = dot.this.E;
            int $$3 = dot.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dot.this.w && $$2 < dot.this.x && $$3 < dot.this.w
               ? this.f[((dot.this.x - 1 - $$2) * dot.this.w + $$1) * dot.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, doi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public doi k() {
         return this.e;
      }

      @Override
      public doj.l.a j() {
         return doj.l.a.e;
      }
   }

   class f implements doj.m, dot.h {
      private final doi e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(doi $$0) {
         this.e = $$0;
      }

      @Override
      public double a(doi.b $$0) {
         if ($$0 != dot.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dot.this.H) {
            return this.i[dot.this.I];
         } else if (this.f == dot.this.G) {
            return this.h;
         } else {
            this.f = dot.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, doi.a $$1) {
         if (this.i != null && this.g == dot.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dot.this.H;
         }
      }

      @Override
      public doi k() {
         return this.e;
      }

      @Override
      public doj.l.a j() {
         return doj.l.a.d;
      }
   }

   class g implements doj.m, dot.h {
      private final doi e;
      final double[][] f;

      g(doi $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dot.this.v + 1][dot.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dot.this.v; $$2++) {
               int $$3 = dot.this.g + $$2;
               int $$4 = is.c($$3);

               for (int $$5 = 0; $$5 <= dot.this.v; $$5++) {
                  int $$6 = dot.this.h + $$5;
                  int $$7 = is.c($$6);
                  this.f[$$2][$$5] = $$0.a(new doi.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(doi.b $$0) {
         int $$1 = is.a($$0.a());
         int $$2 = is.a($$0.c());
         int $$3 = $$1 - dot.this.g;
         int $$4 = $$2 - dot.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, doi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public doi k() {
         return this.e;
      }

      @Override
      public doj.l.a j() {
         return doj.l.a.b;
      }
   }

   interface h extends doi {
      doi k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements doj.m, dot.h {
      double[][] e;
      double[][] f;
      private final doi g;
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

      i(doi $$1) {
         this.g = $$1;
         this.e = this.a(dot.this.c, dot.this.b);
         this.f = this.a(dot.this.c, dot.this.b);
         dot.this.i.add(this);
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
         this.p = aun.d($$0, this.h, this.l);
         this.q = aun.d($$0, this.j, this.n);
         this.r = aun.d($$0, this.i, this.m);
         this.s = aun.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = aun.d($$0, this.p, this.q);
         this.u = aun.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = aun.d($$0, this.t, this.u);
      }

      @Override
      public double a(doi.b $$0) {
         if ($$0 != dot.this) {
            return this.g.a($$0);
         } else if (!dot.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dot.this.z
               ? aun.a(
                  (double)dot.this.D / (double)dot.this.w,
                  (double)dot.this.E / (double)dot.this.x,
                  (double)dot.this.F / (double)dot.this.w,
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
      public void a(double[] $$0, doi.a $$1) {
         if (dot.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public doi k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public doj.l.a j() {
         return doj.l.a.a;
      }
   }
}
