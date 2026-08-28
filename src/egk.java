import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class egk implements efz.a, efz.b {
   private final ego a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<egk.i> i;
   final List<egk.e> j;
   private final Map<efz, efz> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final efs m;
   private final efz n;
   private final egk.c o;
   private final ehi p;
   private final egk.g q;
   private final egk.g r;
   private final ega.c s;
   private long t = dih.c;
   private ehi.a u = new ehi.a(1.0, 0.0);
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
   private final efz.a J = new efz.a() {
      @Override
      public efz.b a(int $$0) {
         egk.this.B = ($$0 + egk.this.d) * egk.this.x;
         egk.this.G++;
         egk.this.E = 0;
         egk.this.I = $$0;
         return egk.this;
      }

      @Override
      public void a(double[] $$0, efz $$1) {
         for (int $$2 = 0; $$2 < egk.this.c + 1; $$2++) {
            egk.this.B = ($$2 + egk.this.d) * egk.this.x;
            egk.this.G++;
            egk.this.E = 0;
            egk.this.I = $$2;
            $$0[$$2] = $$1.a(egk.this);
         }
      }
   };

   public static egk a(ece $$0, egu $$1, ega.c $$2, egl $$3, efs.a $$4, ehi $$5) {
      ego $$6 = $$3.f().a($$0);
      dih $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new egk($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public egk(int $$0, egu $$1, int $$2, int $$3, ego $$4, ega.c $$5, egl $$6, efs.a $$7, ehi $$8) {
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
      this.g = jp.a($$2);
      this.h = jp.a($$3);
      this.v = jp.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new egk.g(new egk.a(), false);
      this.r = new egk.g(new egk.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = jp.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = jp.c($$13);
            ehi.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      egm $$16 = $$1.a();
      egm $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = efs.a($$7);
      } else {
         int $$18 = jx.a($$2);
         int $$19 = jx.a($$3);
         this.m = efs.a(this, new dih($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<egk.c> $$20 = new ArrayList<>();
      efz $$21 = ega.e(ega.a($$17.l(), ega.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(egq.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new epp($$20.toArray(new egk.c[0]));
      this.n = $$17.k();
   }

   protected dkm.f a(egm $$0, List<dkm.d> $$1) {
      return new dkm.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected eah e() {
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
      int $$2 = jp.c(jp.a($$0));
      int $$3 = jp.c(jp.a($$1));
      return this.l.computeIfAbsent(arb.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = arb.a($$0);
      int $$2 = arb.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new efz.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public ehi d() {
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

         for (egk.i $$4 : this.i) {
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

   public egk c(int $$0) {
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
   public void a(double[] $$0, efz $$1) {
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
      for (egk.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (egk.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (egk.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (egk.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (egk.i $$2 : this.i) {
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
      this.i.forEach(egk.i::l);
   }

   public efs i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   ehi.a c(int $$0, int $$1) {
      long $$2 = dih.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         ehi.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected efz a(efz $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private efz b(efz $$0) {
      if ($$0 instanceof ega.l $$1) {
         return (efz)(switch ($$1.j()) {
            case a -> new egk.i($$1.k());
            case b -> new egk.g($$1.k(), true);
            case c -> new egk.d($$1.k());
            case d -> new egk.f($$1.k());
            case e -> new egk.e($$1.k());
         });
      } else {
         if (this.p != ehi.a()) {
            if ($$0 == ega.d.a) {
               return this.q;
            }

            if ($$0 == ega.f.a) {
               return this.r;
            }
         }

         if ($$0 == ega.b.a) {
            return this.s;
         } else {
            return $$0 instanceof ega.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements egk.h {
      @Override
      public efz k() {
         return ega.d.a;
      }

      @Override
      public efz a(efz.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(efz.b $$0) {
         return egk.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, efz.a $$1) {
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
      public azf<? extends efz> c() {
         return ega.d.e;
      }
   }

   class b implements egk.h {
      @Override
      public efz k() {
         return ega.f.a;
      }

      @Override
      public efz a(efz.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(efz.b $$0) {
         return egk.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, efz.a $$1) {
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
      public azf<? extends efz> c() {
         return ega.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      eah calculate(efz.b var1);
   }

   static class d implements ega.m, egk.h {
      private final efz a;
      private long e = dih.c;
      private double f;

      d(efz $$0) {
         this.a = $$0;
      }

      @Override
      public double a(efz.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dih.c($$1, $$2);
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
      public void a(double[] $$0, efz.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public efz k() {
         return this.a;
      }

      @Override
      public ega.l.a j() {
         return ega.l.a.c;
      }
   }

   class e implements ega.m, egk.h {
      final efz e;
      final double[] f;

      e(final efz $$0) {
         this.e = $$0;
         this.f = new double[egk.this.w * egk.this.w * egk.this.x];
         egk.this.j.add(this);
      }

      @Override
      public double a(efz.b $$0) {
         if ($$0 != egk.this) {
            return this.e.a($$0);
         } else if (!egk.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = egk.this.D;
            int $$2 = egk.this.E;
            int $$3 = egk.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < egk.this.w && $$2 < egk.this.x && $$3 < egk.this.w
               ? this.f[((egk.this.x - 1 - $$2) * egk.this.w + $$1) * egk.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, efz.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public efz k() {
         return this.e;
      }

      @Override
      public ega.l.a j() {
         return ega.l.a.e;
      }
   }

   class f implements ega.m, egk.h {
      private final efz e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final efz $$0) {
         this.e = $$0;
      }

      @Override
      public double a(efz.b $$0) {
         if ($$0 != egk.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == egk.this.H) {
            return this.i[egk.this.I];
         } else if (this.f == egk.this.G) {
            return this.h;
         } else {
            this.f = egk.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, efz.a $$1) {
         if (this.i != null && this.g == egk.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = egk.this.H;
         }
      }

      @Override
      public efz k() {
         return this.e;
      }

      @Override
      public ega.l.a j() {
         return ega.l.a.d;
      }
   }

   class g implements ega.m, egk.h {
      private final efz e;
      final double[][] f;

      g(final efz $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[egk.this.v + 1][egk.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= egk.this.v; $$2++) {
               int $$3 = egk.this.g + $$2;
               int $$4 = jp.c($$3);

               for (int $$5 = 0; $$5 <= egk.this.v; $$5++) {
                  int $$6 = egk.this.h + $$5;
                  int $$7 = jp.c($$6);
                  this.f[$$2][$$5] = $$0.a(new efz.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(efz.b $$0) {
         int $$1 = jp.a($$0.a());
         int $$2 = jp.a($$0.c());
         int $$3 = $$1 - egk.this.g;
         int $$4 = $$2 - egk.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, efz.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public efz k() {
         return this.e;
      }

      @Override
      public ega.l.a j() {
         return ega.l.a.b;
      }
   }

   interface h extends efz {
      efz k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements ega.m, egk.h {
      double[][] e;
      double[][] f;
      private final efz g;
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

      i(final efz $$1) {
         this.g = $$1;
         this.e = this.a(egk.this.c, egk.this.b);
         this.f = this.a(egk.this.c, egk.this.b);
         egk.this.i.add(this);
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
      public double a(efz.b $$0) {
         if ($$0 != egk.this) {
            return this.g.a($$0);
         } else if (!egk.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return egk.this.z
               ? azm.a(
                  (double)egk.this.D / (double)egk.this.w,
                  (double)egk.this.E / (double)egk.this.x,
                  (double)egk.this.F / (double)egk.this.w,
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
      public void a(double[] $$0, efz.a $$1) {
         if (egk.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public efz k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public ega.l.a j() {
         return ega.l.a.a;
      }
   }
}
