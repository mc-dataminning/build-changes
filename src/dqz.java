import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dqz implements dqo.a, dqo.b {
   private final drd a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dqz.i> i;
   final List<dqz.e> j;
   private final Map<dqo, dqo> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dqh m;
   private final dqo n;
   private final dqz.c o;
   private final drx p;
   private final dqz.g q;
   private final dqz.g r;
   private final dqp.c s;
   private long t = cuy.a;
   private drx.a u = new drx.a(1.0, 0.0);
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
   private final dqo.a J = new dqo.a() {
      @Override
      public dqo.b a(int $$0) {
         dqz.this.B = ($$0 + dqz.this.d) * dqz.this.x;
         dqz.this.G++;
         dqz.this.E = 0;
         dqz.this.I = $$0;
         return dqz.this;
      }

      @Override
      public void a(double[] $$0, dqo $$1) {
         for (int $$2 = 0; $$2 < dqz.this.c + 1; $$2++) {
            dqz.this.B = ($$2 + dqz.this.d) * dqz.this.x;
            dqz.this.G++;
            dqz.this.E = 0;
            dqz.this.I = $$2;
            $$0[$$2] = $$1.a(dqz.this);
         }
      }
   };

   public static dqz a(dnf $$0, drj $$1, dqp.c $$2, dra $$3, dqh.a $$4, drx $$5) {
      drd $$6 = $$3.f().a($$0);
      cuy $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dqz($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dqz(int $$0, drj $$1, int $$2, int $$3, drd $$4, dqp.c $$5, dra $$6, dqh.a $$7, drx $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = awi.a($$4.d(), this.x);
      this.d = awi.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = iu.a($$2);
      this.h = iu.a($$3);
      this.v = iu.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dqz.g(new dqz.a(), false);
      this.r = new dqz.g(new dqz.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = iu.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = iu.c($$13);
            drx.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      drb $$16 = $$1.a();
      drb $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dqh.a($$7);
      } else {
         int $$18 = jb.a($$2);
         int $$19 = jb.a($$3);
         this.m = dqh.a(this, new cuy($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dqz.c> $$20 = ImmutableList.builder();
      dqo $$21 = dqp.e(dqp.a($$17.l(), dqp.b.a)).a(this::a);
      $$20.add((dqz.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(drf.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new dzz($$20.build());
      this.n = $$17.k();
   }

   protected cwz.f a(drb $$0, List<cwz.d> $$1) {
      return new cwz.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dlj e() {
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
      return this.l.computeIfAbsent(aom.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aom.a($$0);
      int $$2 = aom.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dqo.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public drx d() {
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

         for (dqz.i $$4 : this.i) {
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

   public dqz c(int $$0) {
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
   public void a(double[] $$0, dqo $$1) {
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

      for (dqz.e $$2 : this.j) {
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
      this.i.forEach(dqz.i::l);
   }

   public dqh i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   drx.a c(int $$0, int $$1) {
      long $$2 = cuy.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         drx.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dqo a(dqo $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dqo b(dqo $$0) {
      if ($$0 instanceof dqp.l $$1) {
         return (dqo)(switch ($$1.j()) {
            case a -> new dqz.i($$1.k());
            case b -> new dqz.g($$1.k(), true);
            case c -> new dqz.d($$1.k());
            case d -> new dqz.f($$1.k());
            case e -> new dqz.e($$1.k());
         });
      } else {
         if (this.p != drx.a()) {
            if ($$0 == dqp.d.a) {
               return this.q;
            }

            if ($$0 == dqp.f.a) {
               return this.r;
            }
         }

         if ($$0 == dqp.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dqp.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dqz.h {
      @Override
      public dqo k() {
         return dqp.d.a;
      }

      @Override
      public dqo a(dqo.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dqo.b $$0) {
         return dqz.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dqo.a $$1) {
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
      public awc<? extends dqo> c() {
         return dqp.d.e;
      }
   }

   class b implements dqz.h {
      @Override
      public dqo k() {
         return dqp.f.a;
      }

      @Override
      public dqo a(dqo.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dqo.b $$0) {
         return dqz.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dqo.a $$1) {
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
      public awc<? extends dqo> c() {
         return dqp.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dlj calculate(dqo.b var1);
   }

   static class d implements dqp.m, dqz.h {
      private final dqo a;
      private long e = cuy.a;
      private double f;

      d(dqo $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dqo.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = cuy.c($$1, $$2);
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
      public void a(double[] $$0, dqo.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dqo k() {
         return this.a;
      }

      @Override
      public dqp.l.a j() {
         return dqp.l.a.c;
      }
   }

   class e implements dqp.m, dqz.h {
      final dqo e;
      final double[] f;

      e(dqo $$0) {
         this.e = $$0;
         this.f = new double[dqz.this.w * dqz.this.w * dqz.this.x];
         dqz.this.j.add(this);
      }

      @Override
      public double a(dqo.b $$0) {
         if ($$0 != dqz.this) {
            return this.e.a($$0);
         } else if (!dqz.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dqz.this.D;
            int $$2 = dqz.this.E;
            int $$3 = dqz.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dqz.this.w && $$2 < dqz.this.x && $$3 < dqz.this.w
               ? this.f[((dqz.this.x - 1 - $$2) * dqz.this.w + $$1) * dqz.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dqo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dqo k() {
         return this.e;
      }

      @Override
      public dqp.l.a j() {
         return dqp.l.a.e;
      }
   }

   class f implements dqp.m, dqz.h {
      private final dqo e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dqo $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dqo.b $$0) {
         if ($$0 != dqz.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dqz.this.H) {
            return this.i[dqz.this.I];
         } else if (this.f == dqz.this.G) {
            return this.h;
         } else {
            this.f = dqz.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dqo.a $$1) {
         if (this.i != null && this.g == dqz.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dqz.this.H;
         }
      }

      @Override
      public dqo k() {
         return this.e;
      }

      @Override
      public dqp.l.a j() {
         return dqp.l.a.d;
      }
   }

   class g implements dqp.m, dqz.h {
      private final dqo e;
      final double[][] f;

      g(dqo $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dqz.this.v + 1][dqz.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dqz.this.v; $$2++) {
               int $$3 = dqz.this.g + $$2;
               int $$4 = iu.c($$3);

               for (int $$5 = 0; $$5 <= dqz.this.v; $$5++) {
                  int $$6 = dqz.this.h + $$5;
                  int $$7 = iu.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dqo.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dqo.b $$0) {
         int $$1 = iu.a($$0.a());
         int $$2 = iu.a($$0.c());
         int $$3 = $$1 - dqz.this.g;
         int $$4 = $$2 - dqz.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dqo.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dqo k() {
         return this.e;
      }

      @Override
      public dqp.l.a j() {
         return dqp.l.a.b;
      }
   }

   interface h extends dqo {
      dqo k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dqp.m, dqz.h {
      double[][] e;
      double[][] f;
      private final dqo g;
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

      i(dqo $$1) {
         this.g = $$1;
         this.e = this.a(dqz.this.c, dqz.this.b);
         this.f = this.a(dqz.this.c, dqz.this.b);
         dqz.this.i.add(this);
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
         this.p = awi.d($$0, this.h, this.l);
         this.q = awi.d($$0, this.j, this.n);
         this.r = awi.d($$0, this.i, this.m);
         this.s = awi.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = awi.d($$0, this.p, this.q);
         this.u = awi.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = awi.d($$0, this.t, this.u);
      }

      @Override
      public double a(dqo.b $$0) {
         if ($$0 != dqz.this) {
            return this.g.a($$0);
         } else if (!dqz.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dqz.this.z
               ? awi.a(
                  (double)dqz.this.D / (double)dqz.this.w,
                  (double)dqz.this.E / (double)dqz.this.x,
                  (double)dqz.this.F / (double)dqz.this.w,
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
      public void a(double[] $$0, dqo.a $$1) {
         if (dqz.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dqo k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dqp.l.a j() {
         return dqp.l.a.a;
      }
   }
}
