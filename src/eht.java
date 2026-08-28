import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class eht implements ehi.a, ehi.b {
   private final ehx a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<eht.i> i;
   final List<eht.e> j;
   private final Map<ehi, ehi> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final ehb m;
   private final ehi n;
   private final eht.c o;
   private final eir p;
   private final eht.g q;
   private final eht.g r;
   private final ehj.c s;
   private long t = djo.c;
   private eir.a u = new eir.a(1.0, 0.0);
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
   private final ehi.a J = new ehi.a() {
      @Override
      public ehi.b a(int $$0) {
         eht.this.B = ($$0 + eht.this.d) * eht.this.x;
         eht.this.G++;
         eht.this.E = 0;
         eht.this.I = $$0;
         return eht.this;
      }

      @Override
      public void a(double[] $$0, ehi $$1) {
         for (int $$2 = 0; $$2 < eht.this.c + 1; $$2++) {
            eht.this.B = ($$2 + eht.this.d) * eht.this.x;
            eht.this.G++;
            eht.this.E = 0;
            eht.this.I = $$2;
            $$0[$$2] = $$1.a(eht.this);
         }
      }
   };

   public static eht a(edn $$0, eid $$1, ehj.c $$2, ehu $$3, ehb.a $$4, eir $$5) {
      ehx $$6 = $$3.f().a($$0);
      djo $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new eht($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public eht(int $$0, eid $$1, int $$2, int $$3, ehx $$4, ehj.c $$5, ehu $$6, ehb.a $$7, eir $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = azz.a($$4.d(), this.x);
      this.d = azz.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = jr.a($$2);
      this.h = jr.a($$3);
      this.v = jr.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new eht.g(new eht.a(), false);
      this.r = new eht.g(new eht.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = jr.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = jr.c($$13);
            eir.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      ehv $$16 = $$1.a();
      ehv $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = ehb.a($$7);
      } else {
         int $$18 = jz.a($$2);
         int $$19 = jz.a($$3);
         this.m = ehb.a(this, new djo($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<eht.c> $$20 = new ArrayList<>();
      ehi $$21 = ehj.e(ehj.a($$17.l(), ehj.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(ehz.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new erb($$20.toArray(new eht.c[0]));
      this.n = $$17.k();
   }

   protected dlv.f a(ehv $$0, List<dlv.d> $$1) {
      return new dlv.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected ebq e() {
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
      int $$2 = jr.c(jr.a($$0));
      int $$3 = jr.c(jr.a($$1));
      return this.l.computeIfAbsent(arm.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = arm.a($$0);
      int $$2 = arm.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new ehi.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public eir d() {
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

         for (eht.i $$4 : this.i) {
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

   public eht c(int $$0) {
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
   public void a(double[] $$0, ehi $$1) {
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
      for (eht.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (eht.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (eht.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (eht.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (eht.i $$2 : this.i) {
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
      this.i.forEach(eht.i::l);
   }

   public ehb i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   eir.a c(int $$0, int $$1) {
      long $$2 = djo.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         eir.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected ehi a(ehi $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private ehi b(ehi $$0) {
      if ($$0 instanceof ehj.l $$1) {
         return (ehi)(switch ($$1.j()) {
            case a -> new eht.i($$1.k());
            case b -> new eht.g($$1.k(), true);
            case c -> new eht.d($$1.k());
            case d -> new eht.f($$1.k());
            case e -> new eht.e($$1.k());
         });
      } else {
         if (this.p != eir.a()) {
            if ($$0 == ehj.d.a) {
               return this.q;
            }

            if ($$0 == ehj.f.a) {
               return this.r;
            }
         }

         if ($$0 == ehj.b.a) {
            return this.s;
         } else {
            return $$0 instanceof ehj.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements eht.h {
      @Override
      public ehi k() {
         return ehj.d.a;
      }

      @Override
      public ehi a(ehi.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(ehi.b $$0) {
         return eht.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, ehi.a $$1) {
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
      public azs<? extends ehi> c() {
         return ehj.d.e;
      }
   }

   class b implements eht.h {
      @Override
      public ehi k() {
         return ehj.f.a;
      }

      @Override
      public ehi a(ehi.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(ehi.b $$0) {
         return eht.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, ehi.a $$1) {
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
      public azs<? extends ehi> c() {
         return ehj.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      ebq calculate(ehi.b var1);
   }

   static class d implements ehj.m, eht.h {
      private final ehi a;
      private long e = djo.c;
      private double f;

      d(ehi $$0) {
         this.a = $$0;
      }

      @Override
      public double a(ehi.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = djo.c($$1, $$2);
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
      public void a(double[] $$0, ehi.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public ehi k() {
         return this.a;
      }

      @Override
      public ehj.l.a j() {
         return ehj.l.a.c;
      }
   }

   class e implements ehj.m, eht.h {
      final ehi e;
      final double[] f;

      e(final ehi $$0) {
         this.e = $$0;
         this.f = new double[eht.this.w * eht.this.w * eht.this.x];
         eht.this.j.add(this);
      }

      @Override
      public double a(ehi.b $$0) {
         if ($$0 != eht.this) {
            return this.e.a($$0);
         } else if (!eht.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = eht.this.D;
            int $$2 = eht.this.E;
            int $$3 = eht.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < eht.this.w && $$2 < eht.this.x && $$3 < eht.this.w
               ? this.f[((eht.this.x - 1 - $$2) * eht.this.w + $$1) * eht.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, ehi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ehi k() {
         return this.e;
      }

      @Override
      public ehj.l.a j() {
         return ehj.l.a.e;
      }
   }

   class f implements ehj.m, eht.h {
      private final ehi e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final ehi $$0) {
         this.e = $$0;
      }

      @Override
      public double a(ehi.b $$0) {
         if ($$0 != eht.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == eht.this.H) {
            return this.i[eht.this.I];
         } else if (this.f == eht.this.G) {
            return this.h;
         } else {
            this.f = eht.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, ehi.a $$1) {
         if (this.i != null && this.g == eht.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = eht.this.H;
         }
      }

      @Override
      public ehi k() {
         return this.e;
      }

      @Override
      public ehj.l.a j() {
         return ehj.l.a.d;
      }
   }

   class g implements ehj.m, eht.h {
      private final ehi e;
      final double[][] f;

      g(final ehi $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[eht.this.v + 1][eht.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= eht.this.v; $$2++) {
               int $$3 = eht.this.g + $$2;
               int $$4 = jr.c($$3);

               for (int $$5 = 0; $$5 <= eht.this.v; $$5++) {
                  int $$6 = eht.this.h + $$5;
                  int $$7 = jr.c($$6);
                  this.f[$$2][$$5] = $$0.a(new ehi.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(ehi.b $$0) {
         int $$1 = jr.a($$0.a());
         int $$2 = jr.a($$0.c());
         int $$3 = $$1 - eht.this.g;
         int $$4 = $$2 - eht.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, ehi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ehi k() {
         return this.e;
      }

      @Override
      public ehj.l.a j() {
         return ehj.l.a.b;
      }
   }

   interface h extends ehi {
      ehi k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements ehj.m, eht.h {
      double[][] e;
      double[][] f;
      private final ehi g;
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

      i(final ehi $$1) {
         this.g = $$1;
         this.e = this.a(eht.this.c, eht.this.b);
         this.f = this.a(eht.this.c, eht.this.b);
         eht.this.i.add(this);
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
         this.p = azz.d($$0, this.h, this.l);
         this.q = azz.d($$0, this.j, this.n);
         this.r = azz.d($$0, this.i, this.m);
         this.s = azz.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = azz.d($$0, this.p, this.q);
         this.u = azz.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = azz.d($$0, this.t, this.u);
      }

      @Override
      public double a(ehi.b $$0) {
         if ($$0 != eht.this) {
            return this.g.a($$0);
         } else if (!eht.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return eht.this.z
               ? azz.a(
                  (double)eht.this.D / (double)eht.this.w,
                  (double)eht.this.E / (double)eht.this.x,
                  (double)eht.this.F / (double)eht.this.w,
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
      public void a(double[] $$0, ehi.a $$1) {
         if (eht.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public ehi k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public ehj.l.a j() {
         return ehj.l.a.a;
      }
   }
}
