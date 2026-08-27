import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dkw implements dkl.a, dkl.b {
   private final dla a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dkw.i> i;
   final List<dkw.e> j;
   private final Map<dkl, dkl> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dke m;
   private final dkl n;
   private final dkw.c o;
   private final dlu p;
   private final dkw.g q;
   private final dkw.g r;
   private final dkm.c s;
   private long t = cpc.a;
   private dlu.a u = new dlu.a(1.0, 0.0);
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
   private final dkl.a J = new dkl.a() {
      @Override
      public dkl.b a(int $$0) {
         dkw.this.B = ($$0 + dkw.this.d) * dkw.this.x;
         dkw.this.G++;
         dkw.this.E = 0;
         dkw.this.I = $$0;
         return dkw.this;
      }

      @Override
      public void a(double[] $$0, dkl $$1) {
         for (int $$2 = 0; $$2 < dkw.this.c + 1; $$2++) {
            dkw.this.B = ($$2 + dkw.this.d) * dkw.this.x;
            dkw.this.G++;
            dkw.this.E = 0;
            dkw.this.I = $$2;
            $$0[$$2] = $$1.a(dkw.this);
         }
      }
   };

   public static dkw a(dhf $$0, dlg $$1, dkm.c $$2, dkx $$3, dke.a $$4, dlu $$5) {
      dla $$6 = $$3.f().a($$0);
      cpc $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dkw($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dkw(int $$0, dlg $$1, int $$2, int $$3, dla $$4, dkm.c $$5, dkx $$6, dke.a $$7, dlu $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = arw.a($$4.d(), this.x);
      this.d = arw.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = hp.a($$2);
      this.h = hp.a($$3);
      this.v = hp.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dkw.g(new dkw.a(), false);
      this.r = new dkw.g(new dkw.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = hp.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = hp.c($$13);
            dlu.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dky $$16 = $$1.a();
      dky $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dke.a($$7);
      } else {
         int $$18 = hw.a($$2);
         int $$19 = hw.a($$3);
         this.m = dke.a(this, new cpc($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dkw.c> $$20 = ImmutableList.builder();
      dkl $$21 = dkm.e(dkm.a($$17.l(), dkm.b.a)).a(this::a);
      $$20.add((dkw.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dlc.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new dtw($$20.build());
      this.n = $$17.k();
   }

   protected crc.f a(dky $$0, List<crc.d> $$1) {
      return new crc.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dfj e() {
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
      int $$2 = hp.c(hp.a($$0));
      int $$3 = hp.c(hp.a($$1));
      return this.l.computeIfAbsent(akg.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = akg.a($$0);
      int $$2 = akg.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dkl.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dlu d() {
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

         for (dkw.i $$4 : this.i) {
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

   public dkw c(int $$0) {
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
   public void a(double[] $$0, dkl $$1) {
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

      for (dkw.e $$2 : this.j) {
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
      this.i.forEach(dkw.i::l);
   }

   public dke i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dlu.a c(int $$0, int $$1) {
      long $$2 = cpc.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dlu.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dkl a(dkl $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dkl b(dkl $$0) {
      if ($$0 instanceof dkm.l $$1) {
         return (dkl)(switch ($$1.j()) {
            case a -> new dkw.i($$1.k());
            case b -> new dkw.g($$1.k(), true);
            case c -> new dkw.d($$1.k());
            case d -> new dkw.f($$1.k());
            case e -> new dkw.e($$1.k());
         });
      } else {
         if (this.p != dlu.a()) {
            if ($$0 == dkm.d.a) {
               return this.q;
            }

            if ($$0 == dkm.f.a) {
               return this.r;
            }
         }

         if ($$0 == dkm.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dkm.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dkw.h {
      @Override
      public dkl k() {
         return dkm.d.a;
      }

      @Override
      public dkl a(dkl.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dkl.b $$0) {
         return dkw.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dkl.a $$1) {
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
      public arq<? extends dkl> c() {
         return dkm.d.e;
      }
   }

   class b implements dkw.h {
      @Override
      public dkl k() {
         return dkm.f.a;
      }

      @Override
      public dkl a(dkl.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dkl.b $$0) {
         return dkw.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dkl.a $$1) {
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
      public arq<? extends dkl> c() {
         return dkm.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dfj calculate(dkl.b var1);
   }

   static class d implements dkm.m, dkw.h {
      private final dkl a;
      private long e = cpc.a;
      private double f;

      d(dkl $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dkl.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = cpc.c($$1, $$2);
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
      public void a(double[] $$0, dkl.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dkl k() {
         return this.a;
      }

      @Override
      public dkm.l.a j() {
         return dkm.l.a.c;
      }
   }

   class e implements dkm.m, dkw.h {
      final dkl e;
      final double[] f;

      e(dkl $$0) {
         this.e = $$0;
         this.f = new double[dkw.this.w * dkw.this.w * dkw.this.x];
         dkw.this.j.add(this);
      }

      @Override
      public double a(dkl.b $$0) {
         if ($$0 != dkw.this) {
            return this.e.a($$0);
         } else if (!dkw.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dkw.this.D;
            int $$2 = dkw.this.E;
            int $$3 = dkw.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dkw.this.w && $$2 < dkw.this.x && $$3 < dkw.this.w
               ? this.f[((dkw.this.x - 1 - $$2) * dkw.this.w + $$1) * dkw.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dkl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkl k() {
         return this.e;
      }

      @Override
      public dkm.l.a j() {
         return dkm.l.a.e;
      }
   }

   class f implements dkm.m, dkw.h {
      private final dkl e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dkl $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dkl.b $$0) {
         if ($$0 != dkw.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dkw.this.H) {
            return this.i[dkw.this.I];
         } else if (this.f == dkw.this.G) {
            return this.h;
         } else {
            this.f = dkw.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dkl.a $$1) {
         if (this.i != null && this.g == dkw.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dkw.this.H;
         }
      }

      @Override
      public dkl k() {
         return this.e;
      }

      @Override
      public dkm.l.a j() {
         return dkm.l.a.d;
      }
   }

   class g implements dkm.m, dkw.h {
      private final dkl e;
      final double[][] f;

      g(dkl $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dkw.this.v + 1][dkw.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dkw.this.v; $$2++) {
               int $$3 = dkw.this.g + $$2;
               int $$4 = hp.c($$3);

               for (int $$5 = 0; $$5 <= dkw.this.v; $$5++) {
                  int $$6 = dkw.this.h + $$5;
                  int $$7 = hp.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dkl.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dkl.b $$0) {
         int $$1 = hp.a($$0.a());
         int $$2 = hp.a($$0.c());
         int $$3 = $$1 - dkw.this.g;
         int $$4 = $$2 - dkw.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dkl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkl k() {
         return this.e;
      }

      @Override
      public dkm.l.a j() {
         return dkm.l.a.b;
      }
   }

   interface h extends dkl {
      dkl k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dkm.m, dkw.h {
      double[][] e;
      double[][] f;
      private final dkl g;
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

      i(dkl $$1) {
         this.g = $$1;
         this.e = this.a(dkw.this.c, dkw.this.b);
         this.f = this.a(dkw.this.c, dkw.this.b);
         dkw.this.i.add(this);
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
         this.p = arw.d($$0, this.h, this.l);
         this.q = arw.d($$0, this.j, this.n);
         this.r = arw.d($$0, this.i, this.m);
         this.s = arw.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = arw.d($$0, this.p, this.q);
         this.u = arw.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = arw.d($$0, this.t, this.u);
      }

      @Override
      public double a(dkl.b $$0) {
         if ($$0 != dkw.this) {
            return this.g.a($$0);
         } else if (!dkw.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dkw.this.z
               ? arw.a(
                  (double)dkw.this.D / (double)dkw.this.w,
                  (double)dkw.this.E / (double)dkw.this.x,
                  (double)dkw.this.F / (double)dkw.this.w,
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
      public void a(double[] $$0, dkl.a $$1) {
         if (dkw.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dkl k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dkm.l.a j() {
         return dkm.l.a.a;
      }
   }
}
