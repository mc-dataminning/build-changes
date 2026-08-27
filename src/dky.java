import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dky implements dkn.a, dkn.b {
   private final dlc a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dky.i> i;
   final List<dky.e> j;
   private final Map<dkn, dkn> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dkg m;
   private final dkn n;
   private final dky.c o;
   private final dlw p;
   private final dky.g q;
   private final dky.g r;
   private final dko.c s;
   private long t = cpe.a;
   private dlw.a u = new dlw.a(1.0, 0.0);
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
   private final dkn.a J = new dkn.a() {
      @Override
      public dkn.b a(int $$0) {
         dky.this.B = ($$0 + dky.this.d) * dky.this.x;
         dky.this.G++;
         dky.this.E = 0;
         dky.this.I = $$0;
         return dky.this;
      }

      @Override
      public void a(double[] $$0, dkn $$1) {
         for (int $$2 = 0; $$2 < dky.this.c + 1; $$2++) {
            dky.this.B = ($$2 + dky.this.d) * dky.this.x;
            dky.this.G++;
            dky.this.E = 0;
            dky.this.I = $$2;
            $$0[$$2] = $$1.a(dky.this);
         }
      }
   };

   public static dky a(dhh $$0, dli $$1, dko.c $$2, dkz $$3, dkg.a $$4, dlw $$5) {
      dlc $$6 = $$3.f().a($$0);
      cpe $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dky($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dky(int $$0, dli $$1, int $$2, int $$3, dlc $$4, dko.c $$5, dkz $$6, dkg.a $$7, dlw $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = ary.a($$4.d(), this.x);
      this.d = ary.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = hs.a($$2);
      this.h = hs.a($$3);
      this.v = hs.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dky.g(new dky.a(), false);
      this.r = new dky.g(new dky.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = hs.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = hs.c($$13);
            dlw.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dla $$16 = $$1.a();
      dla $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dkg.a($$7);
      } else {
         int $$18 = hz.a($$2);
         int $$19 = hz.a($$3);
         this.m = dkg.a(this, new cpe($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dky.c> $$20 = ImmutableList.builder();
      dkn $$21 = dko.e(dko.a($$17.l(), dko.b.a)).a(this::a);
      $$20.add((dky.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dle.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new dty($$20.build());
      this.n = $$17.k();
   }

   protected cre.f a(dla $$0, List<cre.d> $$1) {
      return new cre.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dfl e() {
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
      int $$2 = hs.c(hs.a($$0));
      int $$3 = hs.c(hs.a($$1));
      return this.l.computeIfAbsent(aki.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aki.a($$0);
      int $$2 = aki.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dkn.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dlw d() {
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

         for (dky.i $$4 : this.i) {
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

   public dky c(int $$0) {
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
   public void a(double[] $$0, dkn $$1) {
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

      for (dky.e $$2 : this.j) {
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
      this.i.forEach(dky.i::l);
   }

   public dkg i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dlw.a c(int $$0, int $$1) {
      long $$2 = cpe.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dlw.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dkn a(dkn $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dkn b(dkn $$0) {
      if ($$0 instanceof dko.l $$1) {
         return (dkn)(switch ($$1.j()) {
            case a -> new dky.i($$1.k());
            case b -> new dky.g($$1.k(), true);
            case c -> new dky.d($$1.k());
            case d -> new dky.f($$1.k());
            case e -> new dky.e($$1.k());
         });
      } else {
         if (this.p != dlw.a()) {
            if ($$0 == dko.d.a) {
               return this.q;
            }

            if ($$0 == dko.f.a) {
               return this.r;
            }
         }

         if ($$0 == dko.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dko.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dky.h {
      @Override
      public dkn k() {
         return dko.d.a;
      }

      @Override
      public dkn a(dkn.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dkn.b $$0) {
         return dky.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dkn.a $$1) {
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
      public ars<? extends dkn> c() {
         return dko.d.e;
      }
   }

   class b implements dky.h {
      @Override
      public dkn k() {
         return dko.f.a;
      }

      @Override
      public dkn a(dkn.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dkn.b $$0) {
         return dky.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dkn.a $$1) {
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
      public ars<? extends dkn> c() {
         return dko.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dfl calculate(dkn.b var1);
   }

   static class d implements dko.m, dky.h {
      private final dkn a;
      private long e = cpe.a;
      private double f;

      d(dkn $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dkn.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = cpe.c($$1, $$2);
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
      public void a(double[] $$0, dkn.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dkn k() {
         return this.a;
      }

      @Override
      public dko.l.a j() {
         return dko.l.a.c;
      }
   }

   class e implements dko.m, dky.h {
      final dkn e;
      final double[] f;

      e(dkn $$0) {
         this.e = $$0;
         this.f = new double[dky.this.w * dky.this.w * dky.this.x];
         dky.this.j.add(this);
      }

      @Override
      public double a(dkn.b $$0) {
         if ($$0 != dky.this) {
            return this.e.a($$0);
         } else if (!dky.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dky.this.D;
            int $$2 = dky.this.E;
            int $$3 = dky.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dky.this.w && $$2 < dky.this.x && $$3 < dky.this.w
               ? this.f[((dky.this.x - 1 - $$2) * dky.this.w + $$1) * dky.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dkn.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkn k() {
         return this.e;
      }

      @Override
      public dko.l.a j() {
         return dko.l.a.e;
      }
   }

   class f implements dko.m, dky.h {
      private final dkn e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dkn $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dkn.b $$0) {
         if ($$0 != dky.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dky.this.H) {
            return this.i[dky.this.I];
         } else if (this.f == dky.this.G) {
            return this.h;
         } else {
            this.f = dky.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dkn.a $$1) {
         if (this.i != null && this.g == dky.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dky.this.H;
         }
      }

      @Override
      public dkn k() {
         return this.e;
      }

      @Override
      public dko.l.a j() {
         return dko.l.a.d;
      }
   }

   class g implements dko.m, dky.h {
      private final dkn e;
      final double[][] f;

      g(dkn $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dky.this.v + 1][dky.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dky.this.v; $$2++) {
               int $$3 = dky.this.g + $$2;
               int $$4 = hs.c($$3);

               for (int $$5 = 0; $$5 <= dky.this.v; $$5++) {
                  int $$6 = dky.this.h + $$5;
                  int $$7 = hs.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dkn.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dkn.b $$0) {
         int $$1 = hs.a($$0.a());
         int $$2 = hs.a($$0.c());
         int $$3 = $$1 - dky.this.g;
         int $$4 = $$2 - dky.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dkn.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkn k() {
         return this.e;
      }

      @Override
      public dko.l.a j() {
         return dko.l.a.b;
      }
   }

   interface h extends dkn {
      dkn k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dko.m, dky.h {
      double[][] e;
      double[][] f;
      private final dkn g;
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

      i(dkn $$1) {
         this.g = $$1;
         this.e = this.a(dky.this.c, dky.this.b);
         this.f = this.a(dky.this.c, dky.this.b);
         dky.this.i.add(this);
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
         this.p = ary.d($$0, this.h, this.l);
         this.q = ary.d($$0, this.j, this.n);
         this.r = ary.d($$0, this.i, this.m);
         this.s = ary.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = ary.d($$0, this.p, this.q);
         this.u = ary.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = ary.d($$0, this.t, this.u);
      }

      @Override
      public double a(dkn.b $$0) {
         if ($$0 != dky.this) {
            return this.g.a($$0);
         } else if (!dky.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dky.this.z
               ? ary.a(
                  (double)dky.this.D / (double)dky.this.w,
                  (double)dky.this.E / (double)dky.this.x,
                  (double)dky.this.F / (double)dky.this.w,
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
      public void a(double[] $$0, dkn.a $$1) {
         if (dky.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dkn k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dko.l.a j() {
         return dko.l.a.a;
      }
   }
}
