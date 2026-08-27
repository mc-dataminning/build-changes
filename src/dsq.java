import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dsq implements dsf.a, dsf.b {
   private final dsu a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dsq.i> i;
   final List<dsq.e> j;
   private final Map<dsf, dsf> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dry m;
   private final dsf n;
   private final dsq.c o;
   private final dto p;
   private final dsq.g q;
   private final dsq.g r;
   private final dsg.c s;
   private long t = cwg.a;
   private dto.a u = new dto.a(1.0, 0.0);
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
   private final dsf.a J = new dsf.a() {
      @Override
      public dsf.b a(int $$0) {
         dsq.this.B = ($$0 + dsq.this.d) * dsq.this.x;
         dsq.this.G++;
         dsq.this.E = 0;
         dsq.this.I = $$0;
         return dsq.this;
      }

      @Override
      public void a(double[] $$0, dsf $$1) {
         for (int $$2 = 0; $$2 < dsq.this.c + 1; $$2++) {
            dsq.this.B = ($$2 + dsq.this.d) * dsq.this.x;
            dsq.this.G++;
            dsq.this.E = 0;
            dsq.this.I = $$2;
            $$0[$$2] = $$1.a(dsq.this);
         }
      }
   };

   public static dsq a(dov $$0, dta $$1, dsg.c $$2, dsr $$3, dry.a $$4, dto $$5) {
      dsu $$6 = $$3.f().a($$0);
      cwg $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dsq($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dsq(int $$0, dta $$1, int $$2, int $$3, dsu $$4, dsg.c $$5, dsr $$6, dry.a $$7, dto $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = aww.a($$4.d(), this.x);
      this.d = aww.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = iw.a($$2);
      this.h = iw.a($$3);
      this.v = iw.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dsq.g(new dsq.a(), false);
      this.r = new dsq.g(new dsq.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = iw.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = iw.c($$13);
            dto.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dss $$16 = $$1.a();
      dss $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dry.a($$7);
      } else {
         int $$18 = je.a($$2);
         int $$19 = je.a($$3);
         this.m = dry.a(this, new cwg($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dsq.c> $$20 = ImmutableList.builder();
      dsf $$21 = dsg.e(dsg.a($$17.l(), dsg.b.a)).a(this::a);
      $$20.add((dsq.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dsw.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new ebq($$20.build());
      this.n = $$17.k();
   }

   protected cyh.f a(dss $$0, List<cyh.d> $$1) {
      return new cyh.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dmz e() {
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
      int $$2 = iw.c(iw.a($$0));
      int $$3 = iw.c(iw.a($$1));
      return this.l.computeIfAbsent(aov.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aov.a($$0);
      int $$2 = aov.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dsf.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dto d() {
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

         for (dsq.i $$4 : this.i) {
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

   public dsq c(int $$0) {
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
   public void a(double[] $$0, dsf $$1) {
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

      for (dsq.e $$2 : this.j) {
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
      this.i.forEach(dsq.i::l);
   }

   public dry i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dto.a c(int $$0, int $$1) {
      long $$2 = cwg.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dto.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dsf a(dsf $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dsf b(dsf $$0) {
      if ($$0 instanceof dsg.l $$1) {
         return (dsf)(switch ($$1.j()) {
            case a -> new dsq.i($$1.k());
            case b -> new dsq.g($$1.k(), true);
            case c -> new dsq.d($$1.k());
            case d -> new dsq.f($$1.k());
            case e -> new dsq.e($$1.k());
         });
      } else {
         if (this.p != dto.a()) {
            if ($$0 == dsg.d.a) {
               return this.q;
            }

            if ($$0 == dsg.f.a) {
               return this.r;
            }
         }

         if ($$0 == dsg.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dsg.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dsq.h {
      @Override
      public dsf k() {
         return dsg.d.a;
      }

      @Override
      public dsf a(dsf.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dsf.b $$0) {
         return dsq.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dsf.a $$1) {
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
      public awq<? extends dsf> c() {
         return dsg.d.e;
      }
   }

   class b implements dsq.h {
      @Override
      public dsf k() {
         return dsg.f.a;
      }

      @Override
      public dsf a(dsf.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dsf.b $$0) {
         return dsq.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dsf.a $$1) {
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
      public awq<? extends dsf> c() {
         return dsg.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dmz calculate(dsf.b var1);
   }

   static class d implements dsg.m, dsq.h {
      private final dsf a;
      private long e = cwg.a;
      private double f;

      d(dsf $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dsf.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = cwg.c($$1, $$2);
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
      public void a(double[] $$0, dsf.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dsf k() {
         return this.a;
      }

      @Override
      public dsg.l.a j() {
         return dsg.l.a.c;
      }
   }

   class e implements dsg.m, dsq.h {
      final dsf e;
      final double[] f;

      e(dsf $$0) {
         this.e = $$0;
         this.f = new double[dsq.this.w * dsq.this.w * dsq.this.x];
         dsq.this.j.add(this);
      }

      @Override
      public double a(dsf.b $$0) {
         if ($$0 != dsq.this) {
            return this.e.a($$0);
         } else if (!dsq.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dsq.this.D;
            int $$2 = dsq.this.E;
            int $$3 = dsq.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dsq.this.w && $$2 < dsq.this.x && $$3 < dsq.this.w
               ? this.f[((dsq.this.x - 1 - $$2) * dsq.this.w + $$1) * dsq.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dsf.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dsf k() {
         return this.e;
      }

      @Override
      public dsg.l.a j() {
         return dsg.l.a.e;
      }
   }

   class f implements dsg.m, dsq.h {
      private final dsf e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dsf $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dsf.b $$0) {
         if ($$0 != dsq.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dsq.this.H) {
            return this.i[dsq.this.I];
         } else if (this.f == dsq.this.G) {
            return this.h;
         } else {
            this.f = dsq.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dsf.a $$1) {
         if (this.i != null && this.g == dsq.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dsq.this.H;
         }
      }

      @Override
      public dsf k() {
         return this.e;
      }

      @Override
      public dsg.l.a j() {
         return dsg.l.a.d;
      }
   }

   class g implements dsg.m, dsq.h {
      private final dsf e;
      final double[][] f;

      g(dsf $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dsq.this.v + 1][dsq.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dsq.this.v; $$2++) {
               int $$3 = dsq.this.g + $$2;
               int $$4 = iw.c($$3);

               for (int $$5 = 0; $$5 <= dsq.this.v; $$5++) {
                  int $$6 = dsq.this.h + $$5;
                  int $$7 = iw.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dsf.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dsf.b $$0) {
         int $$1 = iw.a($$0.a());
         int $$2 = iw.a($$0.c());
         int $$3 = $$1 - dsq.this.g;
         int $$4 = $$2 - dsq.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dsf.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dsf k() {
         return this.e;
      }

      @Override
      public dsg.l.a j() {
         return dsg.l.a.b;
      }
   }

   interface h extends dsf {
      dsf k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dsg.m, dsq.h {
      double[][] e;
      double[][] f;
      private final dsf g;
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

      i(dsf $$1) {
         this.g = $$1;
         this.e = this.a(dsq.this.c, dsq.this.b);
         this.f = this.a(dsq.this.c, dsq.this.b);
         dsq.this.i.add(this);
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
         this.p = aww.d($$0, this.h, this.l);
         this.q = aww.d($$0, this.j, this.n);
         this.r = aww.d($$0, this.i, this.m);
         this.s = aww.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = aww.d($$0, this.p, this.q);
         this.u = aww.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = aww.d($$0, this.t, this.u);
      }

      @Override
      public double a(dsf.b $$0) {
         if ($$0 != dsq.this) {
            return this.g.a($$0);
         } else if (!dsq.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dsq.this.z
               ? aww.a(
                  (double)dsq.this.D / (double)dsq.this.w,
                  (double)dsq.this.E / (double)dsq.this.x,
                  (double)dsq.this.F / (double)dsq.this.w,
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
      public void a(double[] $$0, dsf.a $$1) {
         if (dsq.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dsf k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dsg.l.a j() {
         return dsg.l.a.a;
      }
   }
}
