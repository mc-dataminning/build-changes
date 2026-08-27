import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dvu implements dvj.a, dvj.b {
   private final dvy a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dvu.i> i;
   final List<dvu.e> j;
   private final Map<dvj, dvj> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dvc m;
   private final dvj n;
   private final dvu.c o;
   private final dws p;
   private final dvu.g q;
   private final dvu.g r;
   private final dvk.c s;
   private long t = czb.a;
   private dws.a u = new dws.a(1.0, 0.0);
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
   private final dvj.a J = new dvj.a() {
      @Override
      public dvj.b a(int $$0) {
         dvu.this.B = ($$0 + dvu.this.d) * dvu.this.x;
         dvu.this.G++;
         dvu.this.E = 0;
         dvu.this.I = $$0;
         return dvu.this;
      }

      @Override
      public void a(double[] $$0, dvj $$1) {
         for (int $$2 = 0; $$2 < dvu.this.c + 1; $$2++) {
            dvu.this.B = ($$2 + dvu.this.d) * dvu.this.x;
            dvu.this.G++;
            dvu.this.E = 0;
            dvu.this.I = $$2;
            $$0[$$2] = $$1.a(dvu.this);
         }
      }
   };

   public static dvu a(dru $$0, dwe $$1, dvk.c $$2, dvv $$3, dvc.a $$4, dws $$5) {
      dvy $$6 = $$3.f().a($$0);
      czb $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dvu($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dvu(int $$0, dwe $$1, int $$2, int $$3, dvy $$4, dvk.c $$5, dvv $$6, dvc.a $$7, dws $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = axw.a($$4.d(), this.x);
      this.d = axw.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = jg.a($$2);
      this.h = jg.a($$3);
      this.v = jg.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dvu.g(new dvu.a(), false);
      this.r = new dvu.g(new dvu.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = jg.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = jg.c($$13);
            dws.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dvw $$16 = $$1.a();
      dvw $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dvc.a($$7);
      } else {
         int $$18 = jo.a($$2);
         int $$19 = jo.a($$3);
         this.m = dvc.a(this, new czb($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dvu.c> $$20 = ImmutableList.builder();
      dvj $$21 = dvk.e(dvk.a($$17.l(), dvk.b.a)).a(this::a);
      $$20.add((dvu.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dwa.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new eeu($$20.build());
      this.n = $$17.k();
   }

   protected dbc.f a(dvw $$0, List<dbc.d> $$1) {
      return new dbc.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dpy e() {
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
      int $$2 = jg.c(jg.a($$0));
      int $$3 = jg.c(jg.a($$1));
      return this.l.computeIfAbsent(apu.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = apu.a($$0);
      int $$2 = apu.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dvj.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dws d() {
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

         for (dvu.i $$4 : this.i) {
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

   public dvu c(int $$0) {
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
   public void a(double[] $$0, dvj $$1) {
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

      for (dvu.e $$2 : this.j) {
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
      this.i.forEach(dvu.i::l);
   }

   public dvc i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dws.a c(int $$0, int $$1) {
      long $$2 = czb.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dws.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dvj a(dvj $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dvj b(dvj $$0) {
      if ($$0 instanceof dvk.l $$1) {
         return (dvj)(switch ($$1.j()) {
            case a -> new dvu.i($$1.k());
            case b -> new dvu.g($$1.k(), true);
            case c -> new dvu.d($$1.k());
            case d -> new dvu.f($$1.k());
            case e -> new dvu.e($$1.k());
         });
      } else {
         if (this.p != dws.a()) {
            if ($$0 == dvk.d.a) {
               return this.q;
            }

            if ($$0 == dvk.f.a) {
               return this.r;
            }
         }

         if ($$0 == dvk.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dvk.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dvu.h {
      @Override
      public dvj k() {
         return dvk.d.a;
      }

      @Override
      public dvj a(dvj.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dvj.b $$0) {
         return dvu.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dvj.a $$1) {
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
      public axq<? extends dvj> c() {
         return dvk.d.e;
      }
   }

   class b implements dvu.h {
      @Override
      public dvj k() {
         return dvk.f.a;
      }

      @Override
      public dvj a(dvj.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dvj.b $$0) {
         return dvu.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dvj.a $$1) {
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
      public axq<? extends dvj> c() {
         return dvk.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dpy calculate(dvj.b var1);
   }

   static class d implements dvk.m, dvu.h {
      private final dvj a;
      private long e = czb.a;
      private double f;

      d(dvj $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dvj.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = czb.c($$1, $$2);
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
      public void a(double[] $$0, dvj.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dvj k() {
         return this.a;
      }

      @Override
      public dvk.l.a j() {
         return dvk.l.a.c;
      }
   }

   class e implements dvk.m, dvu.h {
      final dvj e;
      final double[] f;

      e(dvj $$0) {
         this.e = $$0;
         this.f = new double[dvu.this.w * dvu.this.w * dvu.this.x];
         dvu.this.j.add(this);
      }

      @Override
      public double a(dvj.b $$0) {
         if ($$0 != dvu.this) {
            return this.e.a($$0);
         } else if (!dvu.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dvu.this.D;
            int $$2 = dvu.this.E;
            int $$3 = dvu.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dvu.this.w && $$2 < dvu.this.x && $$3 < dvu.this.w
               ? this.f[((dvu.this.x - 1 - $$2) * dvu.this.w + $$1) * dvu.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dvj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dvj k() {
         return this.e;
      }

      @Override
      public dvk.l.a j() {
         return dvk.l.a.e;
      }
   }

   class f implements dvk.m, dvu.h {
      private final dvj e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dvj $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dvj.b $$0) {
         if ($$0 != dvu.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dvu.this.H) {
            return this.i[dvu.this.I];
         } else if (this.f == dvu.this.G) {
            return this.h;
         } else {
            this.f = dvu.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dvj.a $$1) {
         if (this.i != null && this.g == dvu.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dvu.this.H;
         }
      }

      @Override
      public dvj k() {
         return this.e;
      }

      @Override
      public dvk.l.a j() {
         return dvk.l.a.d;
      }
   }

   class g implements dvk.m, dvu.h {
      private final dvj e;
      final double[][] f;

      g(dvj $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dvu.this.v + 1][dvu.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dvu.this.v; $$2++) {
               int $$3 = dvu.this.g + $$2;
               int $$4 = jg.c($$3);

               for (int $$5 = 0; $$5 <= dvu.this.v; $$5++) {
                  int $$6 = dvu.this.h + $$5;
                  int $$7 = jg.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dvj.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dvj.b $$0) {
         int $$1 = jg.a($$0.a());
         int $$2 = jg.a($$0.c());
         int $$3 = $$1 - dvu.this.g;
         int $$4 = $$2 - dvu.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dvj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dvj k() {
         return this.e;
      }

      @Override
      public dvk.l.a j() {
         return dvk.l.a.b;
      }
   }

   interface h extends dvj {
      dvj k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dvk.m, dvu.h {
      double[][] e;
      double[][] f;
      private final dvj g;
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

      i(dvj $$1) {
         this.g = $$1;
         this.e = this.a(dvu.this.c, dvu.this.b);
         this.f = this.a(dvu.this.c, dvu.this.b);
         dvu.this.i.add(this);
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
         this.p = axw.d($$0, this.h, this.l);
         this.q = axw.d($$0, this.j, this.n);
         this.r = axw.d($$0, this.i, this.m);
         this.s = axw.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = axw.d($$0, this.p, this.q);
         this.u = axw.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = axw.d($$0, this.t, this.u);
      }

      @Override
      public double a(dvj.b $$0) {
         if ($$0 != dvu.this) {
            return this.g.a($$0);
         } else if (!dvu.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dvu.this.z
               ? axw.a(
                  (double)dvu.this.D / (double)dvu.this.w,
                  (double)dvu.this.E / (double)dvu.this.x,
                  (double)dvu.this.F / (double)dvu.this.w,
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
      public void a(double[] $$0, dvj.a $$1) {
         if (dvu.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dvj k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dvk.l.a j() {
         return dvk.l.a.a;
      }
   }
}
