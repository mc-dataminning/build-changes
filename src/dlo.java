import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dlo implements dld.a, dld.b {
   private final dls a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dlo.i> i;
   final List<dlo.e> j;
   private final Map<dld, dld> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dkw m;
   private final dld n;
   private final dlo.c o;
   private final dmm p;
   private final dlo.g q;
   private final dlo.g r;
   private final dle.c s;
   private long t = cqg.a;
   private dmm.a u = new dmm.a(1.0, 0.0);
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
   private final dld.a J = new dld.a() {
      @Override
      public dld.b a(int $$0) {
         dlo.this.B = ($$0 + dlo.this.d) * dlo.this.x;
         dlo.this.G++;
         dlo.this.E = 0;
         dlo.this.I = $$0;
         return dlo.this;
      }

      @Override
      public void a(double[] $$0, dld $$1) {
         for (int $$2 = 0; $$2 < dlo.this.c + 1; $$2++) {
            dlo.this.B = ($$2 + dlo.this.d) * dlo.this.x;
            dlo.this.G++;
            dlo.this.E = 0;
            dlo.this.I = $$2;
            $$0[$$2] = $$1.a(dlo.this);
         }
      }
   };

   public static dlo a(dhx $$0, dly $$1, dle.c $$2, dlp $$3, dkw.a $$4, dmm $$5) {
      dls $$6 = $$3.f().a($$0);
      cqg $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dlo($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dlo(int $$0, dly $$1, int $$2, int $$3, dls $$4, dle.c $$5, dlp $$6, dkw.a $$7, dmm $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = asy.a($$4.d(), this.x);
      this.d = asy.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = in.a($$2);
      this.h = in.a($$3);
      this.v = in.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dlo.g(new dlo.a(), false);
      this.r = new dlo.g(new dlo.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = in.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = in.c($$13);
            dmm.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dlq $$16 = $$1.a();
      dlq $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dkw.a($$7);
      } else {
         int $$18 = iu.a($$2);
         int $$19 = iu.a($$3);
         this.m = dkw.a(this, new cqg($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dlo.c> $$20 = ImmutableList.builder();
      dld $$21 = dle.e(dle.a($$17.l(), dle.b.a)).a(this::a);
      $$20.add((dlo.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dlu.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new duo($$20.build());
      this.n = $$17.k();
   }

   protected csg.f a(dlq $$0, List<csg.d> $$1) {
      return new csg.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dgb e() {
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
      int $$2 = in.c(in.a($$0));
      int $$3 = in.c(in.a($$1));
      return this.l.computeIfAbsent(alg.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = alg.a($$0);
      int $$2 = alg.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dld.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dmm d() {
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

         for (dlo.i $$4 : this.i) {
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

   public dlo c(int $$0) {
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
   public void a(double[] $$0, dld $$1) {
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

      for (dlo.e $$2 : this.j) {
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
      this.i.forEach(dlo.i::l);
   }

   public dkw i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dmm.a c(int $$0, int $$1) {
      long $$2 = cqg.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dmm.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dld a(dld $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dld b(dld $$0) {
      if ($$0 instanceof dle.l $$1) {
         return (dld)(switch ($$1.j()) {
            case a -> new dlo.i($$1.k());
            case b -> new dlo.g($$1.k(), true);
            case c -> new dlo.d($$1.k());
            case d -> new dlo.f($$1.k());
            case e -> new dlo.e($$1.k());
         });
      } else {
         if (this.p != dmm.a()) {
            if ($$0 == dle.d.a) {
               return this.q;
            }

            if ($$0 == dle.f.a) {
               return this.r;
            }
         }

         if ($$0 == dle.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dle.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dlo.h {
      @Override
      public dld k() {
         return dle.d.a;
      }

      @Override
      public dld a(dld.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dld.b $$0) {
         return dlo.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dld.a $$1) {
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
      public ass<? extends dld> c() {
         return dle.d.e;
      }
   }

   class b implements dlo.h {
      @Override
      public dld k() {
         return dle.f.a;
      }

      @Override
      public dld a(dld.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dld.b $$0) {
         return dlo.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dld.a $$1) {
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
      public ass<? extends dld> c() {
         return dle.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dgb calculate(dld.b var1);
   }

   static class d implements dle.m, dlo.h {
      private final dld a;
      private long e = cqg.a;
      private double f;

      d(dld $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dld.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = cqg.c($$1, $$2);
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
      public void a(double[] $$0, dld.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dld k() {
         return this.a;
      }

      @Override
      public dle.l.a j() {
         return dle.l.a.c;
      }
   }

   class e implements dle.m, dlo.h {
      final dld e;
      final double[] f;

      e(dld $$0) {
         this.e = $$0;
         this.f = new double[dlo.this.w * dlo.this.w * dlo.this.x];
         dlo.this.j.add(this);
      }

      @Override
      public double a(dld.b $$0) {
         if ($$0 != dlo.this) {
            return this.e.a($$0);
         } else if (!dlo.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dlo.this.D;
            int $$2 = dlo.this.E;
            int $$3 = dlo.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dlo.this.w && $$2 < dlo.this.x && $$3 < dlo.this.w
               ? this.f[((dlo.this.x - 1 - $$2) * dlo.this.w + $$1) * dlo.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dld.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dld k() {
         return this.e;
      }

      @Override
      public dle.l.a j() {
         return dle.l.a.e;
      }
   }

   class f implements dle.m, dlo.h {
      private final dld e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dld $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dld.b $$0) {
         if ($$0 != dlo.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dlo.this.H) {
            return this.i[dlo.this.I];
         } else if (this.f == dlo.this.G) {
            return this.h;
         } else {
            this.f = dlo.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dld.a $$1) {
         if (this.i != null && this.g == dlo.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dlo.this.H;
         }
      }

      @Override
      public dld k() {
         return this.e;
      }

      @Override
      public dle.l.a j() {
         return dle.l.a.d;
      }
   }

   class g implements dle.m, dlo.h {
      private final dld e;
      final double[][] f;

      g(dld $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dlo.this.v + 1][dlo.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dlo.this.v; $$2++) {
               int $$3 = dlo.this.g + $$2;
               int $$4 = in.c($$3);

               for (int $$5 = 0; $$5 <= dlo.this.v; $$5++) {
                  int $$6 = dlo.this.h + $$5;
                  int $$7 = in.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dld.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dld.b $$0) {
         int $$1 = in.a($$0.a());
         int $$2 = in.a($$0.c());
         int $$3 = $$1 - dlo.this.g;
         int $$4 = $$2 - dlo.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dld.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dld k() {
         return this.e;
      }

      @Override
      public dle.l.a j() {
         return dle.l.a.b;
      }
   }

   interface h extends dld {
      dld k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dle.m, dlo.h {
      double[][] e;
      double[][] f;
      private final dld g;
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

      i(dld $$1) {
         this.g = $$1;
         this.e = this.a(dlo.this.c, dlo.this.b);
         this.f = this.a(dlo.this.c, dlo.this.b);
         dlo.this.i.add(this);
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
         this.p = asy.d($$0, this.h, this.l);
         this.q = asy.d($$0, this.j, this.n);
         this.r = asy.d($$0, this.i, this.m);
         this.s = asy.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = asy.d($$0, this.p, this.q);
         this.u = asy.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = asy.d($$0, this.t, this.u);
      }

      @Override
      public double a(dld.b $$0) {
         if ($$0 != dlo.this) {
            return this.g.a($$0);
         } else if (!dlo.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dlo.this.z
               ? asy.a(
                  (double)dlo.this.D / (double)dlo.this.w,
                  (double)dlo.this.E / (double)dlo.this.x,
                  (double)dlo.this.F / (double)dlo.this.w,
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
      public void a(double[] $$0, dld.a $$1) {
         if (dlo.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dld k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dle.l.a j() {
         return dle.l.a.a;
      }
   }
}
