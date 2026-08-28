import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ecw implements ecl.a, ecl.b {
   private final eda a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<ecw.i> i;
   final List<ecw.e> j;
   private final Map<ecl, ecl> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final ece m;
   private final ecl n;
   private final ecw.c o;
   private final edu p;
   private final ecw.g q;
   private final ecw.g r;
   private final ecm.c s;
   private long t = dfo.c;
   private edu.a u = new edu.a(1.0, 0.0);
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
   private final ecl.a J = new ecl.a() {
      @Override
      public ecl.b a(int $$0) {
         ecw.this.B = ($$0 + ecw.this.d) * ecw.this.x;
         ecw.this.G++;
         ecw.this.E = 0;
         ecw.this.I = $$0;
         return ecw.this;
      }

      @Override
      public void a(double[] $$0, ecl $$1) {
         for (int $$2 = 0; $$2 < ecw.this.c + 1; $$2++) {
            ecw.this.B = ($$2 + ecw.this.d) * ecw.this.x;
            ecw.this.G++;
            ecw.this.E = 0;
            ecw.this.I = $$2;
            $$0[$$2] = $$1.a(ecw.this);
         }
      }
   };

   public static ecw a(dys $$0, edg $$1, ecm.c $$2, ecx $$3, ece.a $$4, edu $$5) {
      eda $$6 = $$3.f().a($$0);
      dfo $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new ecw($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public ecw(int $$0, edg $$1, int $$2, int $$3, eda $$4, ecm.c $$5, ecx $$6, ece.a $$7, edu $$8) {
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
      this.g = kc.a($$2);
      this.h = kc.a($$3);
      this.v = kc.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new ecw.g(new ecw.a(), false);
      this.r = new ecw.g(new ecw.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = kc.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = kc.c($$13);
            edu.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      ecy $$16 = $$1.a();
      ecy $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = ece.a($$7);
      } else {
         int $$18 = kk.a($$2);
         int $$19 = kk.a($$3);
         this.m = ece.a(this, new dfo($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<ecw.c> $$20 = new ArrayList<>();
      ecl $$21 = ecm.e(ecm.a($$17.l(), ecm.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(edc.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new ema($$20.toArray(new ecw.c[0]));
      this.n = $$17.k();
   }

   protected dht.f a(ecy $$0, List<dht.d> $$1) {
      return new dht.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dwx e() {
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
      int $$2 = kc.c(kc.a($$0));
      int $$3 = kc.c(kc.a($$1));
      return this.l.computeIfAbsent(aqo.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aqo.a($$0);
      int $$2 = aqo.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new ecl.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public edu d() {
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

         for (ecw.i $$4 : this.i) {
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

   public ecw c(int $$0) {
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
   public void a(double[] $$0, ecl $$1) {
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
      for (ecw.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (ecw.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (ecw.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (ecw.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (ecw.i $$2 : this.i) {
         $$2.c($$1);
      }
   }

   public void g() {
      if (!this.y) {
         throw new IllegalStateException("Staring interpolation twice");
      } else {
         this.y = false;
      }
   }

   public void h() {
      this.i.forEach(ecw.i::l);
   }

   public ece i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   edu.a c(int $$0, int $$1) {
      long $$2 = dfo.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         edu.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected ecl a(ecl $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private ecl b(ecl $$0) {
      if ($$0 instanceof ecm.l $$1) {
         return (ecl)(switch ($$1.j()) {
            case a -> new ecw.i($$1.k());
            case b -> new ecw.g($$1.k(), true);
            case c -> new ecw.d($$1.k());
            case d -> new ecw.f($$1.k());
            case e -> new ecw.e($$1.k());
         });
      } else {
         if (this.p != edu.a()) {
            if ($$0 == ecm.d.a) {
               return this.q;
            }

            if ($$0 == ecm.f.a) {
               return this.r;
            }
         }

         if ($$0 == ecm.b.a) {
            return this.s;
         } else {
            return $$0 instanceof ecm.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements ecw.h {
      @Override
      public ecl k() {
         return ecm.d.a;
      }

      @Override
      public ecl a(ecl.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(ecl.b $$0) {
         return ecw.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, ecl.a $$1) {
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
      public ays<? extends ecl> c() {
         return ecm.d.e;
      }
   }

   class b implements ecw.h {
      @Override
      public ecl k() {
         return ecm.f.a;
      }

      @Override
      public ecl a(ecl.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(ecl.b $$0) {
         return ecw.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, ecl.a $$1) {
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
      public ays<? extends ecl> c() {
         return ecm.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dwx calculate(ecl.b var1);
   }

   static class d implements ecm.m, ecw.h {
      private final ecl a;
      private long e = dfo.c;
      private double f;

      d(ecl $$0) {
         this.a = $$0;
      }

      @Override
      public double a(ecl.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dfo.c($$1, $$2);
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
      public void a(double[] $$0, ecl.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public ecl k() {
         return this.a;
      }

      @Override
      public ecm.l.a j() {
         return ecm.l.a.c;
      }
   }

   class e implements ecm.m, ecw.h {
      final ecl e;
      final double[] f;

      e(final ecl $$0) {
         this.e = $$0;
         this.f = new double[ecw.this.w * ecw.this.w * ecw.this.x];
         ecw.this.j.add(this);
      }

      @Override
      public double a(ecl.b $$0) {
         if ($$0 != ecw.this) {
            return this.e.a($$0);
         } else if (!ecw.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = ecw.this.D;
            int $$2 = ecw.this.E;
            int $$3 = ecw.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < ecw.this.w && $$2 < ecw.this.x && $$3 < ecw.this.w
               ? this.f[((ecw.this.x - 1 - $$2) * ecw.this.w + $$1) * ecw.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, ecl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ecl k() {
         return this.e;
      }

      @Override
      public ecm.l.a j() {
         return ecm.l.a.e;
      }
   }

   class f implements ecm.m, ecw.h {
      private final ecl e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final ecl $$0) {
         this.e = $$0;
      }

      @Override
      public double a(ecl.b $$0) {
         if ($$0 != ecw.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == ecw.this.H) {
            return this.i[ecw.this.I];
         } else if (this.f == ecw.this.G) {
            return this.h;
         } else {
            this.f = ecw.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, ecl.a $$1) {
         if (this.i != null && this.g == ecw.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = ecw.this.H;
         }
      }

      @Override
      public ecl k() {
         return this.e;
      }

      @Override
      public ecm.l.a j() {
         return ecm.l.a.d;
      }
   }

   class g implements ecm.m, ecw.h {
      private final ecl e;
      final double[][] f;

      g(final ecl $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[ecw.this.v + 1][ecw.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= ecw.this.v; $$2++) {
               int $$3 = ecw.this.g + $$2;
               int $$4 = kc.c($$3);

               for (int $$5 = 0; $$5 <= ecw.this.v; $$5++) {
                  int $$6 = ecw.this.h + $$5;
                  int $$7 = kc.c($$6);
                  this.f[$$2][$$5] = $$0.a(new ecl.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(ecl.b $$0) {
         int $$1 = kc.a($$0.a());
         int $$2 = kc.a($$0.c());
         int $$3 = $$1 - ecw.this.g;
         int $$4 = $$2 - ecw.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, ecl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ecl k() {
         return this.e;
      }

      @Override
      public ecm.l.a j() {
         return ecm.l.a.b;
      }
   }

   interface h extends ecl {
      ecl k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements ecm.m, ecw.h {
      double[][] e;
      double[][] f;
      private final ecl g;
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

      i(final ecl $$1) {
         this.g = $$1;
         this.e = this.a(ecw.this.c, ecw.this.b);
         this.f = this.a(ecw.this.c, ecw.this.b);
         ecw.this.i.add(this);
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
      public double a(ecl.b $$0) {
         if ($$0 != ecw.this) {
            return this.g.a($$0);
         } else if (!ecw.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return ecw.this.z
               ? ayz.a(
                  (double)ecw.this.D / (double)ecw.this.w,
                  (double)ecw.this.E / (double)ecw.this.x,
                  (double)ecw.this.F / (double)ecw.this.w,
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
      public void a(double[] $$0, ecl.a $$1) {
         if (ecw.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public ecl k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public ecm.l.a j() {
         return ecm.l.a.a;
      }
   }
}
