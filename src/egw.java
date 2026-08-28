import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class egw implements egl.a, egl.b {
   private final eha a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<egw.i> i;
   final List<egw.e> j;
   private final Map<egl, egl> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final ege m;
   private final egl n;
   private final egw.c o;
   private final ehu p;
   private final egw.g q;
   private final egw.g r;
   private final egm.c s;
   private long t = dir.c;
   private ehu.a u = new ehu.a(1.0, 0.0);
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
   private final egl.a J = new egl.a() {
      @Override
      public egl.b a(int $$0) {
         egw.this.B = ($$0 + egw.this.d) * egw.this.x;
         egw.this.G++;
         egw.this.E = 0;
         egw.this.I = $$0;
         return egw.this;
      }

      @Override
      public void a(double[] $$0, egl $$1) {
         for (int $$2 = 0; $$2 < egw.this.c + 1; $$2++) {
            egw.this.B = ($$2 + egw.this.d) * egw.this.x;
            egw.this.G++;
            egw.this.E = 0;
            egw.this.I = $$2;
            $$0[$$2] = $$1.a(egw.this);
         }
      }
   };

   public static egw a(ecq $$0, ehg $$1, egm.c $$2, egx $$3, ege.a $$4, ehu $$5) {
      eha $$6 = $$3.f().a($$0);
      dir $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new egw($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public egw(int $$0, ehg $$1, int $$2, int $$3, eha $$4, egm.c $$5, egx $$6, ege.a $$7, ehu $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = azm.a($$4.d(), this.x);
      this.d = azm.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = jq.a($$2);
      this.h = jq.a($$3);
      this.v = jq.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new egw.g(new egw.a(), false);
      this.r = new egw.g(new egw.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = jq.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = jq.c($$13);
            ehu.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      egy $$16 = $$1.a();
      egy $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = ege.a($$7);
      } else {
         int $$18 = jy.a($$2);
         int $$19 = jy.a($$3);
         this.m = ege.a(this, new dir($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<egw.c> $$20 = new ArrayList<>();
      egl $$21 = egm.e(egm.a($$17.l(), egm.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(ehc.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new eqb($$20.toArray(new egw.c[0]));
      this.n = $$17.k();
   }

   protected dky.f a(egy $$0, List<dky.d> $$1) {
      return new dky.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected eat e() {
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
      int $$2 = jq.c(jq.a($$0));
      int $$3 = jq.c(jq.a($$1));
      return this.l.computeIfAbsent(arb.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = arb.a($$0);
      int $$2 = arb.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new egl.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public ehu d() {
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

         for (egw.i $$4 : this.i) {
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

   public egw c(int $$0) {
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
   public void a(double[] $$0, egl $$1) {
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
      for (egw.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (egw.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (egw.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (egw.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (egw.i $$2 : this.i) {
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
      this.i.forEach(egw.i::l);
   }

   public ege i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   ehu.a c(int $$0, int $$1) {
      long $$2 = dir.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         ehu.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected egl a(egl $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private egl b(egl $$0) {
      if ($$0 instanceof egm.l $$1) {
         return (egl)(switch ($$1.j()) {
            case a -> new egw.i($$1.k());
            case b -> new egw.g($$1.k(), true);
            case c -> new egw.d($$1.k());
            case d -> new egw.f($$1.k());
            case e -> new egw.e($$1.k());
         });
      } else {
         if (this.p != ehu.a()) {
            if ($$0 == egm.d.a) {
               return this.q;
            }

            if ($$0 == egm.f.a) {
               return this.r;
            }
         }

         if ($$0 == egm.b.a) {
            return this.s;
         } else {
            return $$0 instanceof egm.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements egw.h {
      @Override
      public egl k() {
         return egm.d.a;
      }

      @Override
      public egl a(egl.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(egl.b $$0) {
         return egw.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, egl.a $$1) {
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
      public azf<? extends egl> c() {
         return egm.d.e;
      }
   }

   class b implements egw.h {
      @Override
      public egl k() {
         return egm.f.a;
      }

      @Override
      public egl a(egl.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(egl.b $$0) {
         return egw.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, egl.a $$1) {
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
      public azf<? extends egl> c() {
         return egm.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      eat calculate(egl.b var1);
   }

   static class d implements egm.m, egw.h {
      private final egl a;
      private long e = dir.c;
      private double f;

      d(egl $$0) {
         this.a = $$0;
      }

      @Override
      public double a(egl.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dir.c($$1, $$2);
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
      public void a(double[] $$0, egl.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public egl k() {
         return this.a;
      }

      @Override
      public egm.l.a j() {
         return egm.l.a.c;
      }
   }

   class e implements egm.m, egw.h {
      final egl e;
      final double[] f;

      e(final egl $$0) {
         this.e = $$0;
         this.f = new double[egw.this.w * egw.this.w * egw.this.x];
         egw.this.j.add(this);
      }

      @Override
      public double a(egl.b $$0) {
         if ($$0 != egw.this) {
            return this.e.a($$0);
         } else if (!egw.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = egw.this.D;
            int $$2 = egw.this.E;
            int $$3 = egw.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < egw.this.w && $$2 < egw.this.x && $$3 < egw.this.w
               ? this.f[((egw.this.x - 1 - $$2) * egw.this.w + $$1) * egw.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, egl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public egl k() {
         return this.e;
      }

      @Override
      public egm.l.a j() {
         return egm.l.a.e;
      }
   }

   class f implements egm.m, egw.h {
      private final egl e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final egl $$0) {
         this.e = $$0;
      }

      @Override
      public double a(egl.b $$0) {
         if ($$0 != egw.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == egw.this.H) {
            return this.i[egw.this.I];
         } else if (this.f == egw.this.G) {
            return this.h;
         } else {
            this.f = egw.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, egl.a $$1) {
         if (this.i != null && this.g == egw.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = egw.this.H;
         }
      }

      @Override
      public egl k() {
         return this.e;
      }

      @Override
      public egm.l.a j() {
         return egm.l.a.d;
      }
   }

   class g implements egm.m, egw.h {
      private final egl e;
      final double[][] f;

      g(final egl $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[egw.this.v + 1][egw.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= egw.this.v; $$2++) {
               int $$3 = egw.this.g + $$2;
               int $$4 = jq.c($$3);

               for (int $$5 = 0; $$5 <= egw.this.v; $$5++) {
                  int $$6 = egw.this.h + $$5;
                  int $$7 = jq.c($$6);
                  this.f[$$2][$$5] = $$0.a(new egl.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(egl.b $$0) {
         int $$1 = jq.a($$0.a());
         int $$2 = jq.a($$0.c());
         int $$3 = $$1 - egw.this.g;
         int $$4 = $$2 - egw.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, egl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public egl k() {
         return this.e;
      }

      @Override
      public egm.l.a j() {
         return egm.l.a.b;
      }
   }

   interface h extends egl {
      egl k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements egm.m, egw.h {
      double[][] e;
      double[][] f;
      private final egl g;
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

      i(final egl $$1) {
         this.g = $$1;
         this.e = this.a(egw.this.c, egw.this.b);
         this.f = this.a(egw.this.c, egw.this.b);
         egw.this.i.add(this);
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
         this.p = azm.d($$0, this.h, this.l);
         this.q = azm.d($$0, this.j, this.n);
         this.r = azm.d($$0, this.i, this.m);
         this.s = azm.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = azm.d($$0, this.p, this.q);
         this.u = azm.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = azm.d($$0, this.t, this.u);
      }

      @Override
      public double a(egl.b $$0) {
         if ($$0 != egw.this) {
            return this.g.a($$0);
         } else if (!egw.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return egw.this.z
               ? azm.a(
                  (double)egw.this.D / (double)egw.this.w,
                  (double)egw.this.E / (double)egw.this.x,
                  (double)egw.this.F / (double)egw.this.w,
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
      public void a(double[] $$0, egl.a $$1) {
         if (egw.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public egl k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public egm.l.a j() {
         return egm.l.a.a;
      }
   }
}
