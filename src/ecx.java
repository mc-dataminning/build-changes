import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ecx implements ecm.a, ecm.b {
   private final edb a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<ecx.i> i;
   final List<ecx.e> j;
   private final Map<ecm, ecm> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final ecf m;
   private final ecm n;
   private final ecx.c o;
   private final edv p;
   private final ecx.g q;
   private final ecx.g r;
   private final ecn.c s;
   private long t = dfp.c;
   private edv.a u = new edv.a(1.0, 0.0);
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
   private final ecm.a J = new ecm.a() {
      @Override
      public ecm.b a(int $$0) {
         ecx.this.B = ($$0 + ecx.this.d) * ecx.this.x;
         ecx.this.G++;
         ecx.this.E = 0;
         ecx.this.I = $$0;
         return ecx.this;
      }

      @Override
      public void a(double[] $$0, ecm $$1) {
         for (int $$2 = 0; $$2 < ecx.this.c + 1; $$2++) {
            ecx.this.B = ($$2 + ecx.this.d) * ecx.this.x;
            ecx.this.G++;
            ecx.this.E = 0;
            ecx.this.I = $$2;
            $$0[$$2] = $$1.a(ecx.this);
         }
      }
   };

   public static ecx a(dyt $$0, edh $$1, ecn.c $$2, ecy $$3, ecf.a $$4, edv $$5) {
      edb $$6 = $$3.f().a($$0);
      dfp $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new ecx($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public ecx(int $$0, edh $$1, int $$2, int $$3, edb $$4, ecn.c $$5, ecy $$6, ecf.a $$7, edv $$8) {
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
      this.q = new ecx.g(new ecx.a(), false);
      this.r = new ecx.g(new ecx.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = kc.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = kc.c($$13);
            edv.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      ecz $$16 = $$1.a();
      ecz $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = ecf.a($$7);
      } else {
         int $$18 = kk.a($$2);
         int $$19 = kk.a($$3);
         this.m = ecf.a(this, new dfp($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<ecx.c> $$20 = new ArrayList<>();
      ecm $$21 = ecn.e(ecn.a($$17.l(), ecn.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(edd.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new emb($$20.toArray(new ecx.c[0]));
      this.n = $$17.k();
   }

   protected dhu.f a(ecz $$0, List<dhu.d> $$1) {
      return new dhu.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dwy e() {
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
      return this.l.computeIfAbsent(aqp.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aqp.a($$0);
      int $$2 = aqp.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new ecm.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public edv d() {
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

         for (ecx.i $$4 : this.i) {
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

   public ecx c(int $$0) {
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
   public void a(double[] $$0, ecm $$1) {
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
      for (ecx.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (ecx.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (ecx.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (ecx.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (ecx.i $$2 : this.i) {
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
      this.i.forEach(ecx.i::l);
   }

   public ecf i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   edv.a c(int $$0, int $$1) {
      long $$2 = dfp.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         edv.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected ecm a(ecm $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private ecm b(ecm $$0) {
      if ($$0 instanceof ecn.l $$1) {
         return (ecm)(switch ($$1.j()) {
            case a -> new ecx.i($$1.k());
            case b -> new ecx.g($$1.k(), true);
            case c -> new ecx.d($$1.k());
            case d -> new ecx.f($$1.k());
            case e -> new ecx.e($$1.k());
         });
      } else {
         if (this.p != edv.a()) {
            if ($$0 == ecn.d.a) {
               return this.q;
            }

            if ($$0 == ecn.f.a) {
               return this.r;
            }
         }

         if ($$0 == ecn.b.a) {
            return this.s;
         } else {
            return $$0 instanceof ecn.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements ecx.h {
      @Override
      public ecm k() {
         return ecn.d.a;
      }

      @Override
      public ecm a(ecm.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(ecm.b $$0) {
         return ecx.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, ecm.a $$1) {
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
      public ays<? extends ecm> c() {
         return ecn.d.e;
      }
   }

   class b implements ecx.h {
      @Override
      public ecm k() {
         return ecn.f.a;
      }

      @Override
      public ecm a(ecm.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(ecm.b $$0) {
         return ecx.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, ecm.a $$1) {
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
      public ays<? extends ecm> c() {
         return ecn.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dwy calculate(ecm.b var1);
   }

   static class d implements ecn.m, ecx.h {
      private final ecm a;
      private long e = dfp.c;
      private double f;

      d(ecm $$0) {
         this.a = $$0;
      }

      @Override
      public double a(ecm.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dfp.c($$1, $$2);
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
      public void a(double[] $$0, ecm.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public ecm k() {
         return this.a;
      }

      @Override
      public ecn.l.a j() {
         return ecn.l.a.c;
      }
   }

   class e implements ecn.m, ecx.h {
      final ecm e;
      final double[] f;

      e(final ecm $$0) {
         this.e = $$0;
         this.f = new double[ecx.this.w * ecx.this.w * ecx.this.x];
         ecx.this.j.add(this);
      }

      @Override
      public double a(ecm.b $$0) {
         if ($$0 != ecx.this) {
            return this.e.a($$0);
         } else if (!ecx.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = ecx.this.D;
            int $$2 = ecx.this.E;
            int $$3 = ecx.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < ecx.this.w && $$2 < ecx.this.x && $$3 < ecx.this.w
               ? this.f[((ecx.this.x - 1 - $$2) * ecx.this.w + $$1) * ecx.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, ecm.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ecm k() {
         return this.e;
      }

      @Override
      public ecn.l.a j() {
         return ecn.l.a.e;
      }
   }

   class f implements ecn.m, ecx.h {
      private final ecm e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final ecm $$0) {
         this.e = $$0;
      }

      @Override
      public double a(ecm.b $$0) {
         if ($$0 != ecx.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == ecx.this.H) {
            return this.i[ecx.this.I];
         } else if (this.f == ecx.this.G) {
            return this.h;
         } else {
            this.f = ecx.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, ecm.a $$1) {
         if (this.i != null && this.g == ecx.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = ecx.this.H;
         }
      }

      @Override
      public ecm k() {
         return this.e;
      }

      @Override
      public ecn.l.a j() {
         return ecn.l.a.d;
      }
   }

   class g implements ecn.m, ecx.h {
      private final ecm e;
      final double[][] f;

      g(final ecm $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[ecx.this.v + 1][ecx.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= ecx.this.v; $$2++) {
               int $$3 = ecx.this.g + $$2;
               int $$4 = kc.c($$3);

               for (int $$5 = 0; $$5 <= ecx.this.v; $$5++) {
                  int $$6 = ecx.this.h + $$5;
                  int $$7 = kc.c($$6);
                  this.f[$$2][$$5] = $$0.a(new ecm.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(ecm.b $$0) {
         int $$1 = kc.a($$0.a());
         int $$2 = kc.a($$0.c());
         int $$3 = $$1 - ecx.this.g;
         int $$4 = $$2 - ecx.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, ecm.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ecm k() {
         return this.e;
      }

      @Override
      public ecn.l.a j() {
         return ecn.l.a.b;
      }
   }

   interface h extends ecm {
      ecm k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements ecn.m, ecx.h {
      double[][] e;
      double[][] f;
      private final ecm g;
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

      i(final ecm $$1) {
         this.g = $$1;
         this.e = this.a(ecx.this.c, ecx.this.b);
         this.f = this.a(ecx.this.c, ecx.this.b);
         ecx.this.i.add(this);
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
      public double a(ecm.b $$0) {
         if ($$0 != ecx.this) {
            return this.g.a($$0);
         } else if (!ecx.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return ecx.this.z
               ? ayz.a(
                  (double)ecx.this.D / (double)ecx.this.w,
                  (double)ecx.this.E / (double)ecx.this.x,
                  (double)ecx.this.F / (double)ecx.this.w,
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
      public void a(double[] $$0, ecm.a $$1) {
         if (ecx.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public ecm k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public ecn.l.a j() {
         return ecn.l.a.a;
      }
   }
}
