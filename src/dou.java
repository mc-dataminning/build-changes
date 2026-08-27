import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dou implements doj.a, doj.b {
   private final doy a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dou.i> i;
   final List<dou.e> j;
   private final Map<doj, doj> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final doc m;
   private final doj n;
   private final dou.c o;
   private final dps p;
   private final dou.g q;
   private final dou.g r;
   private final dok.c s;
   private long t = csw.a;
   private dps.a u = new dps.a(1.0, 0.0);
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
   private final doj.a J = new doj.a() {
      @Override
      public doj.b a(int $$0) {
         dou.this.B = ($$0 + dou.this.d) * dou.this.x;
         dou.this.G++;
         dou.this.E = 0;
         dou.this.I = $$0;
         return dou.this;
      }

      @Override
      public void a(double[] $$0, doj $$1) {
         for (int $$2 = 0; $$2 < dou.this.c + 1; $$2++) {
            dou.this.B = ($$2 + dou.this.d) * dou.this.x;
            dou.this.G++;
            dou.this.E = 0;
            dou.this.I = $$2;
            $$0[$$2] = $$1.a(dou.this);
         }
      }
   };

   public static dou a(dld $$0, dpe $$1, dok.c $$2, dov $$3, doc.a $$4, dps $$5) {
      doy $$6 = $$3.f().a($$0);
      csw $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dou($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dou(int $$0, dpe $$1, int $$2, int $$3, doy $$4, dok.c $$5, dov $$6, doc.a $$7, dps $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = auo.a($$4.d(), this.x);
      this.d = auo.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = is.a($$2);
      this.h = is.a($$3);
      this.v = is.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dou.g(new dou.a(), false);
      this.r = new dou.g(new dou.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = is.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = is.c($$13);
            dps.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dow $$16 = $$1.a();
      dow $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = doc.a($$7);
      } else {
         int $$18 = iz.a($$2);
         int $$19 = iz.a($$3);
         this.m = doc.a(this, new csw($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dou.c> $$20 = ImmutableList.builder();
      doj $$21 = dok.e(dok.a($$17.l(), dok.b.a)).a(this::a);
      $$20.add((dou.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dpa.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new dxu($$20.build());
      this.n = $$17.k();
   }

   protected cux.f a(dow $$0, List<cux.d> $$1) {
      return new cux.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected djh e() {
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
      int $$2 = is.c(is.a($$0));
      int $$3 = is.c(is.a($$1));
      return this.l.computeIfAbsent(amt.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = amt.a($$0);
      int $$2 = amt.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new doj.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dps d() {
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

         for (dou.i $$4 : this.i) {
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

   public dou c(int $$0) {
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
   public void a(double[] $$0, doj $$1) {
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

      for (dou.e $$2 : this.j) {
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
      this.i.forEach(dou.i::l);
   }

   public doc i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dps.a c(int $$0, int $$1) {
      long $$2 = csw.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dps.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected doj a(doj $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private doj b(doj $$0) {
      if ($$0 instanceof dok.l $$1) {
         return (doj)(switch ($$1.j()) {
            case a -> new dou.i($$1.k());
            case b -> new dou.g($$1.k(), true);
            case c -> new dou.d($$1.k());
            case d -> new dou.f($$1.k());
            case e -> new dou.e($$1.k());
         });
      } else {
         if (this.p != dps.a()) {
            if ($$0 == dok.d.a) {
               return this.q;
            }

            if ($$0 == dok.f.a) {
               return this.r;
            }
         }

         if ($$0 == dok.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dok.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dou.h {
      @Override
      public doj k() {
         return dok.d.a;
      }

      @Override
      public doj a(doj.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(doj.b $$0) {
         return dou.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, doj.a $$1) {
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
      public aui<? extends doj> c() {
         return dok.d.e;
      }
   }

   class b implements dou.h {
      @Override
      public doj k() {
         return dok.f.a;
      }

      @Override
      public doj a(doj.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(doj.b $$0) {
         return dou.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, doj.a $$1) {
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
      public aui<? extends doj> c() {
         return dok.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      djh calculate(doj.b var1);
   }

   static class d implements dok.m, dou.h {
      private final doj a;
      private long e = csw.a;
      private double f;

      d(doj $$0) {
         this.a = $$0;
      }

      @Override
      public double a(doj.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = csw.c($$1, $$2);
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
      public void a(double[] $$0, doj.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public doj k() {
         return this.a;
      }

      @Override
      public dok.l.a j() {
         return dok.l.a.c;
      }
   }

   class e implements dok.m, dou.h {
      final doj e;
      final double[] f;

      e(doj $$0) {
         this.e = $$0;
         this.f = new double[dou.this.w * dou.this.w * dou.this.x];
         dou.this.j.add(this);
      }

      @Override
      public double a(doj.b $$0) {
         if ($$0 != dou.this) {
            return this.e.a($$0);
         } else if (!dou.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dou.this.D;
            int $$2 = dou.this.E;
            int $$3 = dou.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dou.this.w && $$2 < dou.this.x && $$3 < dou.this.w
               ? this.f[((dou.this.x - 1 - $$2) * dou.this.w + $$1) * dou.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, doj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public doj k() {
         return this.e;
      }

      @Override
      public dok.l.a j() {
         return dok.l.a.e;
      }
   }

   class f implements dok.m, dou.h {
      private final doj e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(doj $$0) {
         this.e = $$0;
      }

      @Override
      public double a(doj.b $$0) {
         if ($$0 != dou.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dou.this.H) {
            return this.i[dou.this.I];
         } else if (this.f == dou.this.G) {
            return this.h;
         } else {
            this.f = dou.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, doj.a $$1) {
         if (this.i != null && this.g == dou.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dou.this.H;
         }
      }

      @Override
      public doj k() {
         return this.e;
      }

      @Override
      public dok.l.a j() {
         return dok.l.a.d;
      }
   }

   class g implements dok.m, dou.h {
      private final doj e;
      final double[][] f;

      g(doj $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dou.this.v + 1][dou.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dou.this.v; $$2++) {
               int $$3 = dou.this.g + $$2;
               int $$4 = is.c($$3);

               for (int $$5 = 0; $$5 <= dou.this.v; $$5++) {
                  int $$6 = dou.this.h + $$5;
                  int $$7 = is.c($$6);
                  this.f[$$2][$$5] = $$0.a(new doj.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(doj.b $$0) {
         int $$1 = is.a($$0.a());
         int $$2 = is.a($$0.c());
         int $$3 = $$1 - dou.this.g;
         int $$4 = $$2 - dou.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, doj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public doj k() {
         return this.e;
      }

      @Override
      public dok.l.a j() {
         return dok.l.a.b;
      }
   }

   interface h extends doj {
      doj k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dok.m, dou.h {
      double[][] e;
      double[][] f;
      private final doj g;
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

      i(doj $$1) {
         this.g = $$1;
         this.e = this.a(dou.this.c, dou.this.b);
         this.f = this.a(dou.this.c, dou.this.b);
         dou.this.i.add(this);
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
         this.p = auo.d($$0, this.h, this.l);
         this.q = auo.d($$0, this.j, this.n);
         this.r = auo.d($$0, this.i, this.m);
         this.s = auo.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = auo.d($$0, this.p, this.q);
         this.u = auo.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = auo.d($$0, this.t, this.u);
      }

      @Override
      public double a(doj.b $$0) {
         if ($$0 != dou.this) {
            return this.g.a($$0);
         } else if (!dou.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dou.this.z
               ? auo.a(
                  (double)dou.this.D / (double)dou.this.w,
                  (double)dou.this.E / (double)dou.this.x,
                  (double)dou.this.F / (double)dou.this.w,
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
      public void a(double[] $$0, doj.a $$1) {
         if (dou.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public doj k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dok.l.a j() {
         return dok.l.a.a;
      }
   }
}
