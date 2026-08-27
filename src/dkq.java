import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dkq implements dkf.a, dkf.b {
   private final dku a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dkq.i> i;
   final List<dkq.e> j;
   private final Map<dkf, dkf> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final djy m;
   private final dkf n;
   private final dkq.c o;
   private final dlo p;
   private final dkq.g q;
   private final dkq.g r;
   private final dkg.c s;
   private long t = cpi.a;
   private dlo.a u = new dlo.a(1.0, 0.0);
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
   private final dkf.a J = new dkf.a() {
      @Override
      public dkf.b a(int $$0) {
         dkq.this.B = ($$0 + dkq.this.d) * dkq.this.x;
         dkq.this.G++;
         dkq.this.E = 0;
         dkq.this.I = $$0;
         return dkq.this;
      }

      @Override
      public void a(double[] $$0, dkf $$1) {
         for (int $$2 = 0; $$2 < dkq.this.c + 1; $$2++) {
            dkq.this.B = ($$2 + dkq.this.d) * dkq.this.x;
            dkq.this.G++;
            dkq.this.E = 0;
            dkq.this.I = $$2;
            $$0[$$2] = $$1.a(dkq.this);
         }
      }
   };

   public static dkq a(dgz $$0, dla $$1, dkg.c $$2, dkr $$3, djy.a $$4, dlo $$5) {
      dku $$6 = $$3.f().a($$0);
      cpi $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dkq($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dkq(int $$0, dla $$1, int $$2, int $$3, dku $$4, dkg.c $$5, dkr $$6, djy.a $$7, dlo $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = asb.a($$4.d(), this.x);
      this.d = asb.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = hp.a($$2);
      this.h = hp.a($$3);
      this.v = hp.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dkq.g(new dkq.a(), false);
      this.r = new dkq.g(new dkq.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = hp.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = hp.c($$13);
            dlo.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dks $$16 = $$1.a();
      dks $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = djy.a($$7);
      } else {
         int $$18 = hw.a($$2);
         int $$19 = hw.a($$3);
         this.m = djy.a(this, new cpi($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dkq.c> $$20 = ImmutableList.builder();
      dkf $$21 = dkg.e(dkg.a($$17.l(), dkg.b.a)).a(this::a);
      $$20.add((dkq.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dkw.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new dtq($$20.build());
      this.n = $$17.k();
   }

   protected cri.f a(dks $$0, List<cri.d> $$1) {
      return new cri.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dfd e() {
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
      return this.l.computeIfAbsent(akj.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = akj.a($$0);
      int $$2 = akj.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dkf.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dlo d() {
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

         for (dkq.i $$4 : this.i) {
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

   public dkq c(int $$0) {
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
   public void a(double[] $$0, dkf $$1) {
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

      for (dkq.e $$2 : this.j) {
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
      this.i.forEach(dkq.i::l);
   }

   public djy i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dlo.a c(int $$0, int $$1) {
      long $$2 = cpi.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dlo.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dkf a(dkf $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dkf b(dkf $$0) {
      if ($$0 instanceof dkg.l $$1) {
         return (dkf)(switch ($$1.j()) {
            case a -> new dkq.i($$1.k());
            case b -> new dkq.g($$1.k(), true);
            case c -> new dkq.d($$1.k());
            case d -> new dkq.f($$1.k());
            case e -> new dkq.e($$1.k());
         });
      } else {
         if (this.p != dlo.a()) {
            if ($$0 == dkg.d.a) {
               return this.q;
            }

            if ($$0 == dkg.f.a) {
               return this.r;
            }
         }

         if ($$0 == dkg.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dkg.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dkq.h {
      @Override
      public dkf k() {
         return dkg.d.a;
      }

      @Override
      public dkf a(dkf.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dkf.b $$0) {
         return dkq.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dkf.a $$1) {
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
      public arv<? extends dkf> c() {
         return dkg.d.e;
      }
   }

   class b implements dkq.h {
      @Override
      public dkf k() {
         return dkg.f.a;
      }

      @Override
      public dkf a(dkf.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dkf.b $$0) {
         return dkq.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dkf.a $$1) {
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
      public arv<? extends dkf> c() {
         return dkg.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dfd calculate(dkf.b var1);
   }

   static class d implements dkg.m, dkq.h {
      private final dkf a;
      private long e = cpi.a;
      private double f;

      d(dkf $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dkf.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = cpi.c($$1, $$2);
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
      public void a(double[] $$0, dkf.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dkf k() {
         return this.a;
      }

      @Override
      public dkg.l.a j() {
         return dkg.l.a.c;
      }
   }

   class e implements dkg.m, dkq.h {
      final dkf e;
      final double[] f;

      e(dkf $$0) {
         this.e = $$0;
         this.f = new double[dkq.this.w * dkq.this.w * dkq.this.x];
         dkq.this.j.add(this);
      }

      @Override
      public double a(dkf.b $$0) {
         if ($$0 != dkq.this) {
            return this.e.a($$0);
         } else if (!dkq.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dkq.this.D;
            int $$2 = dkq.this.E;
            int $$3 = dkq.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dkq.this.w && $$2 < dkq.this.x && $$3 < dkq.this.w
               ? this.f[((dkq.this.x - 1 - $$2) * dkq.this.w + $$1) * dkq.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dkf.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkf k() {
         return this.e;
      }

      @Override
      public dkg.l.a j() {
         return dkg.l.a.e;
      }
   }

   class f implements dkg.m, dkq.h {
      private final dkf e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dkf $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dkf.b $$0) {
         if ($$0 != dkq.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dkq.this.H) {
            return this.i[dkq.this.I];
         } else if (this.f == dkq.this.G) {
            return this.h;
         } else {
            this.f = dkq.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dkf.a $$1) {
         if (this.i != null && this.g == dkq.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dkq.this.H;
         }
      }

      @Override
      public dkf k() {
         return this.e;
      }

      @Override
      public dkg.l.a j() {
         return dkg.l.a.d;
      }
   }

   class g implements dkg.m, dkq.h {
      private final dkf e;
      final double[][] f;

      g(dkf $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dkq.this.v + 1][dkq.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dkq.this.v; $$2++) {
               int $$3 = dkq.this.g + $$2;
               int $$4 = hp.c($$3);

               for (int $$5 = 0; $$5 <= dkq.this.v; $$5++) {
                  int $$6 = dkq.this.h + $$5;
                  int $$7 = hp.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dkf.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dkf.b $$0) {
         int $$1 = hp.a($$0.a());
         int $$2 = hp.a($$0.c());
         int $$3 = $$1 - dkq.this.g;
         int $$4 = $$2 - dkq.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dkf.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkf k() {
         return this.e;
      }

      @Override
      public dkg.l.a j() {
         return dkg.l.a.b;
      }
   }

   interface h extends dkf {
      dkf k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dkg.m, dkq.h {
      double[][] e;
      double[][] f;
      private final dkf g;
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

      i(dkf $$1) {
         this.g = $$1;
         this.e = this.a(dkq.this.c, dkq.this.b);
         this.f = this.a(dkq.this.c, dkq.this.b);
         dkq.this.i.add(this);
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
         this.p = asb.d($$0, this.h, this.l);
         this.q = asb.d($$0, this.j, this.n);
         this.r = asb.d($$0, this.i, this.m);
         this.s = asb.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = asb.d($$0, this.p, this.q);
         this.u = asb.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = asb.d($$0, this.t, this.u);
      }

      @Override
      public double a(dkf.b $$0) {
         if ($$0 != dkq.this) {
            return this.g.a($$0);
         } else if (!dkq.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dkq.this.z
               ? asb.a(
                  (double)dkq.this.D / (double)dkq.this.w,
                  (double)dkq.this.E / (double)dkq.this.x,
                  (double)dkq.this.F / (double)dkq.this.w,
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
      public void a(double[] $$0, dkf.a $$1) {
         if (dkq.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dkf k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dkg.l.a j() {
         return dkg.l.a.a;
      }
   }
}
