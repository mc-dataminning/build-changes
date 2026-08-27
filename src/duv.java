import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class duv implements duk.a, duk.b {
   private final duz a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<duv.i> i;
   final List<duv.e> j;
   private final Map<duk, duk> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dud m;
   private final duk n;
   private final duv.c o;
   private final dvt p;
   private final duv.g q;
   private final duv.g r;
   private final dul.c s;
   private long t = cye.a;
   private dvt.a u = new dvt.a(1.0, 0.0);
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
   private final duk.a J = new duk.a() {
      @Override
      public duk.b a(int $$0) {
         duv.this.B = ($$0 + duv.this.d) * duv.this.x;
         duv.this.G++;
         duv.this.E = 0;
         duv.this.I = $$0;
         return duv.this;
      }

      @Override
      public void a(double[] $$0, duk $$1) {
         for (int $$2 = 0; $$2 < duv.this.c + 1; $$2++) {
            duv.this.B = ($$2 + duv.this.d) * duv.this.x;
            duv.this.G++;
            duv.this.E = 0;
            duv.this.I = $$2;
            $$0[$$2] = $$1.a(duv.this);
         }
      }
   };

   public static duv a(dqv $$0, dvf $$1, dul.c $$2, duw $$3, dud.a $$4, dvt $$5) {
      duz $$6 = $$3.f().a($$0);
      cye $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new duv($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public duv(int $$0, dvf $$1, int $$2, int $$3, duz $$4, dul.c $$5, duw $$6, dud.a $$7, dvt $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = axk.a($$4.d(), this.x);
      this.d = axk.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = iw.a($$2);
      this.h = iw.a($$3);
      this.v = iw.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new duv.g(new duv.a(), false);
      this.r = new duv.g(new duv.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = iw.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = iw.c($$13);
            dvt.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dux $$16 = $$1.a();
      dux $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dud.a($$7);
      } else {
         int $$18 = je.a($$2);
         int $$19 = je.a($$3);
         this.m = dud.a(this, new cye($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<duv.c> $$20 = ImmutableList.builder();
      duk $$21 = dul.e(dul.a($$17.l(), dul.b.a)).a(this::a);
      $$20.add((duv.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dvb.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new edv($$20.build());
      this.n = $$17.k();
   }

   protected daf.f a(dux $$0, List<daf.d> $$1) {
      return new daf.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected doz e() {
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
      return this.l.computeIfAbsent(api.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = api.a($$0);
      int $$2 = api.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new duk.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dvt d() {
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

         for (duv.i $$4 : this.i) {
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

   public duv c(int $$0) {
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
   public void a(double[] $$0, duk $$1) {
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

      for (duv.e $$2 : this.j) {
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
      this.i.forEach(duv.i::l);
   }

   public dud i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dvt.a c(int $$0, int $$1) {
      long $$2 = cye.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dvt.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected duk a(duk $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private duk b(duk $$0) {
      if ($$0 instanceof dul.l $$1) {
         return (duk)(switch ($$1.j()) {
            case a -> new duv.i($$1.k());
            case b -> new duv.g($$1.k(), true);
            case c -> new duv.d($$1.k());
            case d -> new duv.f($$1.k());
            case e -> new duv.e($$1.k());
         });
      } else {
         if (this.p != dvt.a()) {
            if ($$0 == dul.d.a) {
               return this.q;
            }

            if ($$0 == dul.f.a) {
               return this.r;
            }
         }

         if ($$0 == dul.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dul.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements duv.h {
      @Override
      public duk k() {
         return dul.d.a;
      }

      @Override
      public duk a(duk.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(duk.b $$0) {
         return duv.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, duk.a $$1) {
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
      public axe<? extends duk> c() {
         return dul.d.e;
      }
   }

   class b implements duv.h {
      @Override
      public duk k() {
         return dul.f.a;
      }

      @Override
      public duk a(duk.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(duk.b $$0) {
         return duv.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, duk.a $$1) {
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
      public axe<? extends duk> c() {
         return dul.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      doz calculate(duk.b var1);
   }

   static class d implements dul.m, duv.h {
      private final duk a;
      private long e = cye.a;
      private double f;

      d(duk $$0) {
         this.a = $$0;
      }

      @Override
      public double a(duk.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = cye.c($$1, $$2);
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
      public void a(double[] $$0, duk.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public duk k() {
         return this.a;
      }

      @Override
      public dul.l.a j() {
         return dul.l.a.c;
      }
   }

   class e implements dul.m, duv.h {
      final duk e;
      final double[] f;

      e(duk $$0) {
         this.e = $$0;
         this.f = new double[duv.this.w * duv.this.w * duv.this.x];
         duv.this.j.add(this);
      }

      @Override
      public double a(duk.b $$0) {
         if ($$0 != duv.this) {
            return this.e.a($$0);
         } else if (!duv.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = duv.this.D;
            int $$2 = duv.this.E;
            int $$3 = duv.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < duv.this.w && $$2 < duv.this.x && $$3 < duv.this.w
               ? this.f[((duv.this.x - 1 - $$2) * duv.this.w + $$1) * duv.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, duk.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public duk k() {
         return this.e;
      }

      @Override
      public dul.l.a j() {
         return dul.l.a.e;
      }
   }

   class f implements dul.m, duv.h {
      private final duk e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(duk $$0) {
         this.e = $$0;
      }

      @Override
      public double a(duk.b $$0) {
         if ($$0 != duv.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == duv.this.H) {
            return this.i[duv.this.I];
         } else if (this.f == duv.this.G) {
            return this.h;
         } else {
            this.f = duv.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, duk.a $$1) {
         if (this.i != null && this.g == duv.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = duv.this.H;
         }
      }

      @Override
      public duk k() {
         return this.e;
      }

      @Override
      public dul.l.a j() {
         return dul.l.a.d;
      }
   }

   class g implements dul.m, duv.h {
      private final duk e;
      final double[][] f;

      g(duk $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[duv.this.v + 1][duv.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= duv.this.v; $$2++) {
               int $$3 = duv.this.g + $$2;
               int $$4 = iw.c($$3);

               for (int $$5 = 0; $$5 <= duv.this.v; $$5++) {
                  int $$6 = duv.this.h + $$5;
                  int $$7 = iw.c($$6);
                  this.f[$$2][$$5] = $$0.a(new duk.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(duk.b $$0) {
         int $$1 = iw.a($$0.a());
         int $$2 = iw.a($$0.c());
         int $$3 = $$1 - duv.this.g;
         int $$4 = $$2 - duv.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, duk.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public duk k() {
         return this.e;
      }

      @Override
      public dul.l.a j() {
         return dul.l.a.b;
      }
   }

   interface h extends duk {
      duk k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dul.m, duv.h {
      double[][] e;
      double[][] f;
      private final duk g;
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

      i(duk $$1) {
         this.g = $$1;
         this.e = this.a(duv.this.c, duv.this.b);
         this.f = this.a(duv.this.c, duv.this.b);
         duv.this.i.add(this);
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
         this.p = axk.d($$0, this.h, this.l);
         this.q = axk.d($$0, this.j, this.n);
         this.r = axk.d($$0, this.i, this.m);
         this.s = axk.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = axk.d($$0, this.p, this.q);
         this.u = axk.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = axk.d($$0, this.t, this.u);
      }

      @Override
      public double a(duk.b $$0) {
         if ($$0 != duv.this) {
            return this.g.a($$0);
         } else if (!duv.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return duv.this.z
               ? axk.a(
                  (double)duv.this.D / (double)duv.this.w,
                  (double)duv.this.E / (double)duv.this.x,
                  (double)duv.this.F / (double)duv.this.w,
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
      public void a(double[] $$0, duk.a $$1) {
         if (duv.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public duk k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dul.l.a j() {
         return dul.l.a.a;
      }
   }
}
