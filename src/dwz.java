import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dwz implements dwo.a, dwo.b {
   private final dxd a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dwz.i> i;
   final List<dwz.e> j;
   private final Map<dwo, dwo> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dwh m;
   private final dwo n;
   private final dwz.c o;
   private final dxx p;
   private final dwz.g q;
   private final dwz.g r;
   private final dwp.c s;
   private long t = dag.a;
   private dxx.a u = new dxx.a(1.0, 0.0);
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
   private final dwo.a J = new dwo.a() {
      @Override
      public dwo.b a(int $$0) {
         dwz.this.B = ($$0 + dwz.this.d) * dwz.this.x;
         dwz.this.G++;
         dwz.this.E = 0;
         dwz.this.I = $$0;
         return dwz.this;
      }

      @Override
      public void a(double[] $$0, dwo $$1) {
         for (int $$2 = 0; $$2 < dwz.this.c + 1; $$2++) {
            dwz.this.B = ($$2 + dwz.this.d) * dwz.this.x;
            dwz.this.G++;
            dwz.this.E = 0;
            dwz.this.I = $$2;
            $$0[$$2] = $$1.a(dwz.this);
         }
      }
   };

   public static dwz a(dsz $$0, dxj $$1, dwp.c $$2, dxa $$3, dwh.a $$4, dxx $$5) {
      dxd $$6 = $$3.f().a($$0);
      dag $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dwz($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dwz(int $$0, dxj $$1, int $$2, int $$3, dxd $$4, dwp.c $$5, dxa $$6, dwh.a $$7, dxx $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = ayf.a($$4.d(), this.x);
      this.d = ayf.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = ji.a($$2);
      this.h = ji.a($$3);
      this.v = ji.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dwz.g(new dwz.a(), false);
      this.r = new dwz.g(new dwz.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = ji.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = ji.c($$13);
            dxx.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dxb $$16 = $$1.a();
      dxb $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dwh.a($$7);
      } else {
         int $$18 = jq.a($$2);
         int $$19 = jq.a($$3);
         this.m = dwh.a(this, new dag($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dwz.c> $$20 = ImmutableList.builder();
      dwo $$21 = dwp.e(dwp.a($$17.l(), dwp.b.a)).a(this::a);
      $$20.add((dwz.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dxf.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new efz($$20.build());
      this.n = $$17.k();
   }

   protected dch.f a(dxb $$0, List<dch.d> $$1) {
      return new dch.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected drd e() {
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
      int $$2 = ji.c(ji.a($$0));
      int $$3 = ji.c(ji.a($$1));
      return this.l.computeIfAbsent(aqd.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aqd.a($$0);
      int $$2 = aqd.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dwo.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dxx d() {
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

         for (dwz.i $$4 : this.i) {
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

   public dwz c(int $$0) {
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
   public void a(double[] $$0, dwo $$1) {
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

      for (dwz.e $$2 : this.j) {
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
      this.i.forEach(dwz.i::l);
   }

   public dwh i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dxx.a c(int $$0, int $$1) {
      long $$2 = dag.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dxx.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dwo a(dwo $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dwo b(dwo $$0) {
      if ($$0 instanceof dwp.l $$1) {
         return (dwo)(switch ($$1.j()) {
            case a -> new dwz.i($$1.k());
            case b -> new dwz.g($$1.k(), true);
            case c -> new dwz.d($$1.k());
            case d -> new dwz.f($$1.k());
            case e -> new dwz.e($$1.k());
         });
      } else {
         if (this.p != dxx.a()) {
            if ($$0 == dwp.d.a) {
               return this.q;
            }

            if ($$0 == dwp.f.a) {
               return this.r;
            }
         }

         if ($$0 == dwp.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dwp.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dwz.h {
      @Override
      public dwo k() {
         return dwp.d.a;
      }

      @Override
      public dwo a(dwo.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dwo.b $$0) {
         return dwz.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dwo.a $$1) {
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
      public axy<? extends dwo> c() {
         return dwp.d.e;
      }
   }

   class b implements dwz.h {
      @Override
      public dwo k() {
         return dwp.f.a;
      }

      @Override
      public dwo a(dwo.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dwo.b $$0) {
         return dwz.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dwo.a $$1) {
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
      public axy<? extends dwo> c() {
         return dwp.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      drd calculate(dwo.b var1);
   }

   static class d implements dwp.m, dwz.h {
      private final dwo a;
      private long e = dag.a;
      private double f;

      d(dwo $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dwo.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dag.c($$1, $$2);
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
      public void a(double[] $$0, dwo.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dwo k() {
         return this.a;
      }

      @Override
      public dwp.l.a j() {
         return dwp.l.a.c;
      }
   }

   class e implements dwp.m, dwz.h {
      final dwo e;
      final double[] f;

      e(dwo $$0) {
         this.e = $$0;
         this.f = new double[dwz.this.w * dwz.this.w * dwz.this.x];
         dwz.this.j.add(this);
      }

      @Override
      public double a(dwo.b $$0) {
         if ($$0 != dwz.this) {
            return this.e.a($$0);
         } else if (!dwz.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dwz.this.D;
            int $$2 = dwz.this.E;
            int $$3 = dwz.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dwz.this.w && $$2 < dwz.this.x && $$3 < dwz.this.w
               ? this.f[((dwz.this.x - 1 - $$2) * dwz.this.w + $$1) * dwz.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dwo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dwo k() {
         return this.e;
      }

      @Override
      public dwp.l.a j() {
         return dwp.l.a.e;
      }
   }

   class f implements dwp.m, dwz.h {
      private final dwo e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dwo $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dwo.b $$0) {
         if ($$0 != dwz.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dwz.this.H) {
            return this.i[dwz.this.I];
         } else if (this.f == dwz.this.G) {
            return this.h;
         } else {
            this.f = dwz.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dwo.a $$1) {
         if (this.i != null && this.g == dwz.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dwz.this.H;
         }
      }

      @Override
      public dwo k() {
         return this.e;
      }

      @Override
      public dwp.l.a j() {
         return dwp.l.a.d;
      }
   }

   class g implements dwp.m, dwz.h {
      private final dwo e;
      final double[][] f;

      g(dwo $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dwz.this.v + 1][dwz.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dwz.this.v; $$2++) {
               int $$3 = dwz.this.g + $$2;
               int $$4 = ji.c($$3);

               for (int $$5 = 0; $$5 <= dwz.this.v; $$5++) {
                  int $$6 = dwz.this.h + $$5;
                  int $$7 = ji.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dwo.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dwo.b $$0) {
         int $$1 = ji.a($$0.a());
         int $$2 = ji.a($$0.c());
         int $$3 = $$1 - dwz.this.g;
         int $$4 = $$2 - dwz.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dwo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dwo k() {
         return this.e;
      }

      @Override
      public dwp.l.a j() {
         return dwp.l.a.b;
      }
   }

   interface h extends dwo {
      dwo k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dwp.m, dwz.h {
      double[][] e;
      double[][] f;
      private final dwo g;
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

      i(dwo $$1) {
         this.g = $$1;
         this.e = this.a(dwz.this.c, dwz.this.b);
         this.f = this.a(dwz.this.c, dwz.this.b);
         dwz.this.i.add(this);
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
         this.p = ayf.d($$0, this.h, this.l);
         this.q = ayf.d($$0, this.j, this.n);
         this.r = ayf.d($$0, this.i, this.m);
         this.s = ayf.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = ayf.d($$0, this.p, this.q);
         this.u = ayf.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = ayf.d($$0, this.t, this.u);
      }

      @Override
      public double a(dwo.b $$0) {
         if ($$0 != dwz.this) {
            return this.g.a($$0);
         } else if (!dwz.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dwz.this.z
               ? ayf.a(
                  (double)dwz.this.D / (double)dwz.this.w,
                  (double)dwz.this.E / (double)dwz.this.x,
                  (double)dwz.this.F / (double)dwz.this.w,
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
      public void a(double[] $$0, dwo.a $$1) {
         if (dwz.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dwo k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dwp.l.a j() {
         return dwp.l.a.a;
      }
   }
}
