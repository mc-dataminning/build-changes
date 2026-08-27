import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dqs implements dqh.a, dqh.b {
   private final dqw a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dqs.i> i;
   final List<dqs.e> j;
   private final Map<dqh, dqh> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dqa m;
   private final dqh n;
   private final dqs.c o;
   private final drq p;
   private final dqs.g q;
   private final dqs.g r;
   private final dqi.c s;
   private long t = cuu.a;
   private drq.a u = new drq.a(1.0, 0.0);
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
   private final dqh.a J = new dqh.a() {
      @Override
      public dqh.b a(int $$0) {
         dqs.this.B = ($$0 + dqs.this.d) * dqs.this.x;
         dqs.this.G++;
         dqs.this.E = 0;
         dqs.this.I = $$0;
         return dqs.this;
      }

      @Override
      public void a(double[] $$0, dqh $$1) {
         for (int $$2 = 0; $$2 < dqs.this.c + 1; $$2++) {
            dqs.this.B = ($$2 + dqs.this.d) * dqs.this.x;
            dqs.this.G++;
            dqs.this.E = 0;
            dqs.this.I = $$2;
            $$0[$$2] = $$1.a(dqs.this);
         }
      }
   };

   public static dqs a(dnb $$0, drc $$1, dqi.c $$2, dqt $$3, dqa.a $$4, drq $$5) {
      dqw $$6 = $$3.f().a($$0);
      cuu $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dqs($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dqs(int $$0, drc $$1, int $$2, int $$3, dqw $$4, dqi.c $$5, dqt $$6, dqa.a $$7, drq $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = awh.a($$4.d(), this.x);
      this.d = awh.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = iu.a($$2);
      this.h = iu.a($$3);
      this.v = iu.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dqs.g(new dqs.a(), false);
      this.r = new dqs.g(new dqs.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = iu.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = iu.c($$13);
            drq.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dqu $$16 = $$1.a();
      dqu $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dqa.a($$7);
      } else {
         int $$18 = jb.a($$2);
         int $$19 = jb.a($$3);
         this.m = dqa.a(this, new cuu($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dqs.c> $$20 = ImmutableList.builder();
      dqh $$21 = dqi.e(dqi.a($$17.l(), dqi.b.a)).a(this::a);
      $$20.add((dqs.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dqy.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new dzs($$20.build());
      this.n = $$17.k();
   }

   protected cwv.f a(dqu $$0, List<cwv.d> $$1) {
      return new cwv.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dlf e() {
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
      int $$2 = iu.c(iu.a($$0));
      int $$3 = iu.c(iu.a($$1));
      return this.l.computeIfAbsent(aol.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aol.a($$0);
      int $$2 = aol.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dqh.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public drq d() {
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

         for (dqs.i $$4 : this.i) {
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

   public dqs c(int $$0) {
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
   public void a(double[] $$0, dqh $$1) {
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

      for (dqs.e $$2 : this.j) {
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
      this.i.forEach(dqs.i::l);
   }

   public dqa i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   drq.a c(int $$0, int $$1) {
      long $$2 = cuu.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         drq.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dqh a(dqh $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dqh b(dqh $$0) {
      if ($$0 instanceof dqi.l $$1) {
         return (dqh)(switch ($$1.j()) {
            case a -> new dqs.i($$1.k());
            case b -> new dqs.g($$1.k(), true);
            case c -> new dqs.d($$1.k());
            case d -> new dqs.f($$1.k());
            case e -> new dqs.e($$1.k());
         });
      } else {
         if (this.p != drq.a()) {
            if ($$0 == dqi.d.a) {
               return this.q;
            }

            if ($$0 == dqi.f.a) {
               return this.r;
            }
         }

         if ($$0 == dqi.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dqi.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dqs.h {
      @Override
      public dqh k() {
         return dqi.d.a;
      }

      @Override
      public dqh a(dqh.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dqh.b $$0) {
         return dqs.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dqh.a $$1) {
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
      public awb<? extends dqh> c() {
         return dqi.d.e;
      }
   }

   class b implements dqs.h {
      @Override
      public dqh k() {
         return dqi.f.a;
      }

      @Override
      public dqh a(dqh.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dqh.b $$0) {
         return dqs.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dqh.a $$1) {
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
      public awb<? extends dqh> c() {
         return dqi.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dlf calculate(dqh.b var1);
   }

   static class d implements dqi.m, dqs.h {
      private final dqh a;
      private long e = cuu.a;
      private double f;

      d(dqh $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dqh.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = cuu.c($$1, $$2);
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
      public void a(double[] $$0, dqh.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dqh k() {
         return this.a;
      }

      @Override
      public dqi.l.a j() {
         return dqi.l.a.c;
      }
   }

   class e implements dqi.m, dqs.h {
      final dqh e;
      final double[] f;

      e(dqh $$0) {
         this.e = $$0;
         this.f = new double[dqs.this.w * dqs.this.w * dqs.this.x];
         dqs.this.j.add(this);
      }

      @Override
      public double a(dqh.b $$0) {
         if ($$0 != dqs.this) {
            return this.e.a($$0);
         } else if (!dqs.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dqs.this.D;
            int $$2 = dqs.this.E;
            int $$3 = dqs.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dqs.this.w && $$2 < dqs.this.x && $$3 < dqs.this.w
               ? this.f[((dqs.this.x - 1 - $$2) * dqs.this.w + $$1) * dqs.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dqh.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dqh k() {
         return this.e;
      }

      @Override
      public dqi.l.a j() {
         return dqi.l.a.e;
      }
   }

   class f implements dqi.m, dqs.h {
      private final dqh e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dqh $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dqh.b $$0) {
         if ($$0 != dqs.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dqs.this.H) {
            return this.i[dqs.this.I];
         } else if (this.f == dqs.this.G) {
            return this.h;
         } else {
            this.f = dqs.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dqh.a $$1) {
         if (this.i != null && this.g == dqs.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dqs.this.H;
         }
      }

      @Override
      public dqh k() {
         return this.e;
      }

      @Override
      public dqi.l.a j() {
         return dqi.l.a.d;
      }
   }

   class g implements dqi.m, dqs.h {
      private final dqh e;
      final double[][] f;

      g(dqh $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dqs.this.v + 1][dqs.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dqs.this.v; $$2++) {
               int $$3 = dqs.this.g + $$2;
               int $$4 = iu.c($$3);

               for (int $$5 = 0; $$5 <= dqs.this.v; $$5++) {
                  int $$6 = dqs.this.h + $$5;
                  int $$7 = iu.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dqh.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dqh.b $$0) {
         int $$1 = iu.a($$0.a());
         int $$2 = iu.a($$0.c());
         int $$3 = $$1 - dqs.this.g;
         int $$4 = $$2 - dqs.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dqh.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dqh k() {
         return this.e;
      }

      @Override
      public dqi.l.a j() {
         return dqi.l.a.b;
      }
   }

   interface h extends dqh {
      dqh k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dqi.m, dqs.h {
      double[][] e;
      double[][] f;
      private final dqh g;
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

      i(dqh $$1) {
         this.g = $$1;
         this.e = this.a(dqs.this.c, dqs.this.b);
         this.f = this.a(dqs.this.c, dqs.this.b);
         dqs.this.i.add(this);
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
         this.p = awh.d($$0, this.h, this.l);
         this.q = awh.d($$0, this.j, this.n);
         this.r = awh.d($$0, this.i, this.m);
         this.s = awh.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = awh.d($$0, this.p, this.q);
         this.u = awh.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = awh.d($$0, this.t, this.u);
      }

      @Override
      public double a(dqh.b $$0) {
         if ($$0 != dqs.this) {
            return this.g.a($$0);
         } else if (!dqs.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dqs.this.z
               ? awh.a(
                  (double)dqs.this.D / (double)dqs.this.w,
                  (double)dqs.this.E / (double)dqs.this.x,
                  (double)dqs.this.F / (double)dqs.this.w,
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
      public void a(double[] $$0, dqh.a $$1) {
         if (dqs.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dqh k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dqi.l.a j() {
         return dqi.l.a.a;
      }
   }
}
