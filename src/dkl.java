import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dkl implements dka.a, dka.b {
   private final dkp a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dkl.i> i;
   final List<dkl.e> j;
   private final Map<dka, dka> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final djt m;
   private final dka n;
   private final dkl.c o;
   private final dlj p;
   private final dkl.g q;
   private final dkl.g r;
   private final dkb.c s;
   private long t = cor.a;
   private dlj.a u = new dlj.a(1.0, 0.0);
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
   private final dka.a J = new dka.a() {
      @Override
      public dka.b a(int $$0) {
         dkl.this.B = ($$0 + dkl.this.d) * dkl.this.x;
         dkl.this.G++;
         dkl.this.E = 0;
         dkl.this.I = $$0;
         return dkl.this;
      }

      @Override
      public void a(double[] $$0, dka $$1) {
         for (int $$2 = 0; $$2 < dkl.this.c + 1; $$2++) {
            dkl.this.B = ($$2 + dkl.this.d) * dkl.this.x;
            dkl.this.G++;
            dkl.this.E = 0;
            dkl.this.I = $$2;
            $$0[$$2] = $$1.a(dkl.this);
         }
      }
   };

   public static dkl a(dgu $$0, dkv $$1, dkb.c $$2, dkm $$3, djt.a $$4, dlj $$5) {
      dkp $$6 = $$3.f().a($$0);
      cor $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dkl($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dkl(int $$0, dkv $$1, int $$2, int $$3, dkp $$4, dkb.c $$5, dkm $$6, djt.a $$7, dlj $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = aro.a($$4.d(), this.x);
      this.d = aro.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = hr.a($$2);
      this.h = hr.a($$3);
      this.v = hr.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dkl.g(new dkl.a(), false);
      this.r = new dkl.g(new dkl.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = hr.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = hr.c($$13);
            dlj.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dkn $$16 = $$1.a();
      dkn $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = djt.a($$7);
      } else {
         int $$18 = hy.a($$2);
         int $$19 = hy.a($$3);
         this.m = djt.a(this, new cor($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dkl.c> $$20 = ImmutableList.builder();
      dka $$21 = dkb.e(dkb.a($$17.l(), dkb.b.a)).a(this::a);
      $$20.add((dkl.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dkr.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new dtl($$20.build());
      this.n = $$17.k();
   }

   protected cqr.f a(dkn $$0, List<cqr.d> $$1) {
      return new cqr.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dey e() {
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
      int $$2 = hr.c(hr.a($$0));
      int $$3 = hr.c(hr.a($$1));
      return this.l.computeIfAbsent(ajy.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = ajy.a($$0);
      int $$2 = ajy.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dka.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dlj d() {
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

         for (dkl.i $$4 : this.i) {
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

   public dkl c(int $$0) {
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
   public void a(double[] $$0, dka $$1) {
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

      for (dkl.e $$2 : this.j) {
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
      this.i.forEach(dkl.i::l);
   }

   public djt i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dlj.a c(int $$0, int $$1) {
      long $$2 = cor.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dlj.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dka a(dka $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dka b(dka $$0) {
      if ($$0 instanceof dkb.l $$1) {
         return (dka)(switch ($$1.j()) {
            case a -> new dkl.i($$1.k());
            case b -> new dkl.g($$1.k(), true);
            case c -> new dkl.d($$1.k());
            case d -> new dkl.f($$1.k());
            case e -> new dkl.e($$1.k());
         });
      } else {
         if (this.p != dlj.a()) {
            if ($$0 == dkb.d.a) {
               return this.q;
            }

            if ($$0 == dkb.f.a) {
               return this.r;
            }
         }

         if ($$0 == dkb.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dkb.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dkl.h {
      @Override
      public dka k() {
         return dkb.d.a;
      }

      @Override
      public dka a(dka.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dka.b $$0) {
         return dkl.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dka.a $$1) {
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
      public ari<? extends dka> c() {
         return dkb.d.e;
      }
   }

   class b implements dkl.h {
      @Override
      public dka k() {
         return dkb.f.a;
      }

      @Override
      public dka a(dka.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dka.b $$0) {
         return dkl.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dka.a $$1) {
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
      public ari<? extends dka> c() {
         return dkb.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dey calculate(dka.b var1);
   }

   static class d implements dkb.m, dkl.h {
      private final dka a;
      private long e = cor.a;
      private double f;

      d(dka $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dka.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = cor.c($$1, $$2);
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
      public void a(double[] $$0, dka.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dka k() {
         return this.a;
      }

      @Override
      public dkb.l.a j() {
         return dkb.l.a.c;
      }
   }

   class e implements dkb.m, dkl.h {
      final dka e;
      final double[] f;

      e(dka $$0) {
         this.e = $$0;
         this.f = new double[dkl.this.w * dkl.this.w * dkl.this.x];
         dkl.this.j.add(this);
      }

      @Override
      public double a(dka.b $$0) {
         if ($$0 != dkl.this) {
            return this.e.a($$0);
         } else if (!dkl.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dkl.this.D;
            int $$2 = dkl.this.E;
            int $$3 = dkl.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dkl.this.w && $$2 < dkl.this.x && $$3 < dkl.this.w
               ? this.f[((dkl.this.x - 1 - $$2) * dkl.this.w + $$1) * dkl.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dka.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dka k() {
         return this.e;
      }

      @Override
      public dkb.l.a j() {
         return dkb.l.a.e;
      }
   }

   class f implements dkb.m, dkl.h {
      private final dka e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dka $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dka.b $$0) {
         if ($$0 != dkl.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dkl.this.H) {
            return this.i[dkl.this.I];
         } else if (this.f == dkl.this.G) {
            return this.h;
         } else {
            this.f = dkl.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dka.a $$1) {
         if (this.i != null && this.g == dkl.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dkl.this.H;
         }
      }

      @Override
      public dka k() {
         return this.e;
      }

      @Override
      public dkb.l.a j() {
         return dkb.l.a.d;
      }
   }

   class g implements dkb.m, dkl.h {
      private final dka e;
      final double[][] f;

      g(dka $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dkl.this.v + 1][dkl.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dkl.this.v; $$2++) {
               int $$3 = dkl.this.g + $$2;
               int $$4 = hr.c($$3);

               for (int $$5 = 0; $$5 <= dkl.this.v; $$5++) {
                  int $$6 = dkl.this.h + $$5;
                  int $$7 = hr.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dka.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dka.b $$0) {
         int $$1 = hr.a($$0.a());
         int $$2 = hr.a($$0.c());
         int $$3 = $$1 - dkl.this.g;
         int $$4 = $$2 - dkl.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dka.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dka k() {
         return this.e;
      }

      @Override
      public dkb.l.a j() {
         return dkb.l.a.b;
      }
   }

   interface h extends dka {
      dka k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dkb.m, dkl.h {
      double[][] e;
      double[][] f;
      private final dka g;
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

      i(dka $$1) {
         this.g = $$1;
         this.e = this.a(dkl.this.c, dkl.this.b);
         this.f = this.a(dkl.this.c, dkl.this.b);
         dkl.this.i.add(this);
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
         this.p = aro.d($$0, this.h, this.l);
         this.q = aro.d($$0, this.j, this.n);
         this.r = aro.d($$0, this.i, this.m);
         this.s = aro.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = aro.d($$0, this.p, this.q);
         this.u = aro.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = aro.d($$0, this.t, this.u);
      }

      @Override
      public double a(dka.b $$0) {
         if ($$0 != dkl.this) {
            return this.g.a($$0);
         } else if (!dkl.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dkl.this.z
               ? aro.a(
                  (double)dkl.this.D / (double)dkl.this.w,
                  (double)dkl.this.E / (double)dkl.this.x,
                  (double)dkl.this.F / (double)dkl.this.w,
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
      public void a(double[] $$0, dka.a $$1) {
         if (dkl.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dka k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dkb.l.a j() {
         return dkb.l.a.a;
      }
   }
}
