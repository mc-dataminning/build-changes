import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dho implements dhd.a, dhd.b {
   private final dhs a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dho.i> i;
   final List<dho.e> j;
   private final Map<dhd, dhd> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dgw m;
   private final dhd n;
   private final dho.c o;
   private final dim p;
   private final dho.g q;
   private final dho.g r;
   private final dhe.c s;
   private long t = clt.a;
   private dim.a u = new dim.a(1.0, 0.0);
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
   private final dhd.a J = new dhd.a() {
      @Override
      public dhd.b a(int $$0) {
         dho.this.B = ($$0 + dho.this.d) * dho.this.x;
         dho.this.G++;
         dho.this.E = 0;
         dho.this.I = $$0;
         return dho.this;
      }

      @Override
      public void a(double[] $$0, dhd $$1) {
         for (int $$2 = 0; $$2 < dho.this.c + 1; $$2++) {
            dho.this.B = ($$2 + dho.this.d) * dho.this.x;
            dho.this.G++;
            dho.this.E = 0;
            dho.this.I = $$2;
            $$0[$$2] = $$1.a(dho.this);
         }
      }
   };

   public static dho a(ddx $$0, dhy $$1, dhe.c $$2, dhp $$3, dgw.a $$4, dim $$5) {
      dhs $$6 = $$3.f().a($$0);
      clt $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dho($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dho(int $$0, dhy $$1, int $$2, int $$3, dhs $$4, dhe.c $$5, dhp $$6, dgw.a $$7, dim $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = apa.a($$4.d(), this.x);
      this.d = apa.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = hq.a($$2);
      this.h = hq.a($$3);
      this.v = hq.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dho.g(new dho.a(), false);
      this.r = new dho.g(new dho.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = hq.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = hq.c($$13);
            dim.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dhq $$16 = $$1.a();
      dhq $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dgw.a($$7);
      } else {
         int $$18 = hx.a($$2);
         int $$19 = hx.a($$3);
         this.m = dgw.a(this, new clt($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dho.c> $$20 = ImmutableList.builder();
      dhd $$21 = dhe.e(dhe.a($$17.l(), dhe.b.a)).a(this::a);
      $$20.add((dho.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dhu.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new dqo($$20.build());
      this.n = $$17.k();
   }

   protected cnt.f a(dhq $$0, List<cnt.d> $$1) {
      return new cnt.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dcb e() {
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
      int $$2 = hq.c(hq.a($$0));
      int $$3 = hq.c(hq.a($$1));
      return this.l.computeIfAbsent(ahv.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = ahv.a($$0);
      int $$2 = ahv.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dhd.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dim d() {
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

         for (dho.i $$4 : this.i) {
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

   public dho c(int $$0) {
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
   public void a(double[] $$0, dhd $$1) {
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

      for (dho.e $$2 : this.j) {
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
      this.i.forEach(dho.i::l);
   }

   public dgw i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dim.a c(int $$0, int $$1) {
      long $$2 = clt.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dim.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dhd a(dhd $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dhd b(dhd $$0) {
      if ($$0 instanceof dhe.l $$1) {
         return (dhd)(switch ($$1.j()) {
            case a -> new dho.i($$1.k());
            case b -> new dho.g($$1.k(), true);
            case c -> new dho.d($$1.k());
            case d -> new dho.f($$1.k());
            case e -> new dho.e($$1.k());
         });
      } else {
         if (this.p != dim.a()) {
            if ($$0 == dhe.d.a) {
               return this.q;
            }

            if ($$0 == dhe.f.a) {
               return this.r;
            }
         }

         if ($$0 == dhe.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dhe.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dho.h {
      @Override
      public dhd k() {
         return dhe.d.a;
      }

      @Override
      public dhd a(dhd.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dhd.b $$0) {
         return dho.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dhd.a $$1) {
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
      public aou<? extends dhd> c() {
         return dhe.d.e;
      }
   }

   class b implements dho.h {
      @Override
      public dhd k() {
         return dhe.f.a;
      }

      @Override
      public dhd a(dhd.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dhd.b $$0) {
         return dho.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dhd.a $$1) {
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
      public aou<? extends dhd> c() {
         return dhe.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dcb calculate(dhd.b var1);
   }

   static class d implements dhe.m, dho.h {
      private final dhd a;
      private long e = clt.a;
      private double f;

      d(dhd $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dhd.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = clt.c($$1, $$2);
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
      public void a(double[] $$0, dhd.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dhd k() {
         return this.a;
      }

      @Override
      public dhe.l.a j() {
         return dhe.l.a.c;
      }
   }

   class e implements dhe.m, dho.h {
      final dhd e;
      final double[] f;

      e(dhd $$0) {
         this.e = $$0;
         this.f = new double[dho.this.w * dho.this.w * dho.this.x];
         dho.this.j.add(this);
      }

      @Override
      public double a(dhd.b $$0) {
         if ($$0 != dho.this) {
            return this.e.a($$0);
         } else if (!dho.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dho.this.D;
            int $$2 = dho.this.E;
            int $$3 = dho.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dho.this.w && $$2 < dho.this.x && $$3 < dho.this.w
               ? this.f[((dho.this.x - 1 - $$2) * dho.this.w + $$1) * dho.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dhd.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dhd k() {
         return this.e;
      }

      @Override
      public dhe.l.a j() {
         return dhe.l.a.e;
      }
   }

   class f implements dhe.m, dho.h {
      private final dhd e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dhd $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dhd.b $$0) {
         if ($$0 != dho.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dho.this.H) {
            return this.i[dho.this.I];
         } else if (this.f == dho.this.G) {
            return this.h;
         } else {
            this.f = dho.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dhd.a $$1) {
         if (this.i != null && this.g == dho.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dho.this.H;
         }
      }

      @Override
      public dhd k() {
         return this.e;
      }

      @Override
      public dhe.l.a j() {
         return dhe.l.a.d;
      }
   }

   class g implements dhe.m, dho.h {
      private final dhd e;
      final double[][] f;

      g(dhd $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dho.this.v + 1][dho.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dho.this.v; $$2++) {
               int $$3 = dho.this.g + $$2;
               int $$4 = hq.c($$3);

               for (int $$5 = 0; $$5 <= dho.this.v; $$5++) {
                  int $$6 = dho.this.h + $$5;
                  int $$7 = hq.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dhd.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dhd.b $$0) {
         int $$1 = hq.a($$0.a());
         int $$2 = hq.a($$0.c());
         int $$3 = $$1 - dho.this.g;
         int $$4 = $$2 - dho.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dhd.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dhd k() {
         return this.e;
      }

      @Override
      public dhe.l.a j() {
         return dhe.l.a.b;
      }
   }

   interface h extends dhd {
      dhd k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dhe.m, dho.h {
      double[][] e;
      double[][] f;
      private final dhd g;
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

      i(dhd $$1) {
         this.g = $$1;
         this.e = this.a(dho.this.c, dho.this.b);
         this.f = this.a(dho.this.c, dho.this.b);
         dho.this.i.add(this);
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
         this.p = apa.d($$0, this.h, this.l);
         this.q = apa.d($$0, this.j, this.n);
         this.r = apa.d($$0, this.i, this.m);
         this.s = apa.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = apa.d($$0, this.p, this.q);
         this.u = apa.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = apa.d($$0, this.t, this.u);
      }

      @Override
      public double a(dhd.b $$0) {
         if ($$0 != dho.this) {
            return this.g.a($$0);
         } else if (!dho.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dho.this.z
               ? apa.a(
                  (double)dho.this.D / (double)dho.this.w,
                  (double)dho.this.E / (double)dho.this.x,
                  (double)dho.this.F / (double)dho.this.w,
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
      public void a(double[] $$0, dhd.a $$1) {
         if (dho.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dhd k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dhe.l.a j() {
         return dhe.l.a.a;
      }
   }
}
