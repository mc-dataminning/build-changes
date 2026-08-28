import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class eep implements eee.a, eee.b {
   private final eet a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<eep.i> i;
   final List<eep.e> j;
   private final Map<eee, eee> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final edx m;
   private final eee n;
   private final eep.c o;
   private final efn p;
   private final eep.g q;
   private final eep.g r;
   private final eef.c s;
   private long t = dgw.c;
   private efn.a u = new efn.a(1.0, 0.0);
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
   private final eee.a J = new eee.a() {
      @Override
      public eee.b a(int $$0) {
         eep.this.B = ($$0 + eep.this.d) * eep.this.x;
         eep.this.G++;
         eep.this.E = 0;
         eep.this.I = $$0;
         return eep.this;
      }

      @Override
      public void a(double[] $$0, eee $$1) {
         for (int $$2 = 0; $$2 < eep.this.c + 1; $$2++) {
            eep.this.B = ($$2 + eep.this.d) * eep.this.x;
            eep.this.G++;
            eep.this.E = 0;
            eep.this.I = $$2;
            $$0[$$2] = $$1.a(eep.this);
         }
      }
   };

   public static eep a(eaj $$0, eez $$1, eef.c $$2, eeq $$3, edx.a $$4, efn $$5) {
      eet $$6 = $$3.f().a($$0);
      dgw $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new eep($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public eep(int $$0, eez $$1, int $$2, int $$3, eet $$4, eef.c $$5, eeq $$6, edx.a $$7, efn $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = azk.a($$4.d(), this.x);
      this.d = azk.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = kd.a($$2);
      this.h = kd.a($$3);
      this.v = kd.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new eep.g(new eep.a(), false);
      this.r = new eep.g(new eep.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = kd.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = kd.c($$13);
            efn.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      eer $$16 = $$1.a();
      eer $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = edx.a($$7);
      } else {
         int $$18 = kl.a($$2);
         int $$19 = kl.a($$3);
         this.m = edx.a(this, new dgw($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<eep.c> $$20 = new ArrayList<>();
      eee $$21 = eef.e(eef.a($$17.l(), eef.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(eev.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new enu($$20.toArray(new eep.c[0]));
      this.n = $$17.k();
   }

   protected djb.f a(eer $$0, List<djb.d> $$1) {
      return new djb.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dym e() {
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
      int $$2 = kd.c(kd.a($$0));
      int $$3 = kd.c(kd.a($$1));
      return this.l.computeIfAbsent(aqy.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aqy.a($$0);
      int $$2 = aqy.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new eee.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public efn d() {
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

         for (eep.i $$4 : this.i) {
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

   public eep c(int $$0) {
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
   public void a(double[] $$0, eee $$1) {
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
      for (eep.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (eep.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (eep.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (eep.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (eep.i $$2 : this.i) {
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
      this.i.forEach(eep.i::l);
   }

   public edx i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   efn.a c(int $$0, int $$1) {
      long $$2 = dgw.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         efn.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected eee a(eee $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private eee b(eee $$0) {
      if ($$0 instanceof eef.l $$1) {
         return (eee)(switch ($$1.j()) {
            case a -> new eep.i($$1.k());
            case b -> new eep.g($$1.k(), true);
            case c -> new eep.d($$1.k());
            case d -> new eep.f($$1.k());
            case e -> new eep.e($$1.k());
         });
      } else {
         if (this.p != efn.a()) {
            if ($$0 == eef.d.a) {
               return this.q;
            }

            if ($$0 == eef.f.a) {
               return this.r;
            }
         }

         if ($$0 == eef.b.a) {
            return this.s;
         } else {
            return $$0 instanceof eef.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements eep.h {
      @Override
      public eee k() {
         return eef.d.a;
      }

      @Override
      public eee a(eee.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(eee.b $$0) {
         return eep.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, eee.a $$1) {
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
      public azd<? extends eee> c() {
         return eef.d.e;
      }
   }

   class b implements eep.h {
      @Override
      public eee k() {
         return eef.f.a;
      }

      @Override
      public eee a(eee.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(eee.b $$0) {
         return eep.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, eee.a $$1) {
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
      public azd<? extends eee> c() {
         return eef.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dym calculate(eee.b var1);
   }

   static class d implements eef.m, eep.h {
      private final eee a;
      private long e = dgw.c;
      private double f;

      d(eee $$0) {
         this.a = $$0;
      }

      @Override
      public double a(eee.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dgw.c($$1, $$2);
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
      public void a(double[] $$0, eee.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public eee k() {
         return this.a;
      }

      @Override
      public eef.l.a j() {
         return eef.l.a.c;
      }
   }

   class e implements eef.m, eep.h {
      final eee e;
      final double[] f;

      e(final eee $$0) {
         this.e = $$0;
         this.f = new double[eep.this.w * eep.this.w * eep.this.x];
         eep.this.j.add(this);
      }

      @Override
      public double a(eee.b $$0) {
         if ($$0 != eep.this) {
            return this.e.a($$0);
         } else if (!eep.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = eep.this.D;
            int $$2 = eep.this.E;
            int $$3 = eep.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < eep.this.w && $$2 < eep.this.x && $$3 < eep.this.w
               ? this.f[((eep.this.x - 1 - $$2) * eep.this.w + $$1) * eep.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, eee.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eee k() {
         return this.e;
      }

      @Override
      public eef.l.a j() {
         return eef.l.a.e;
      }
   }

   class f implements eef.m, eep.h {
      private final eee e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final eee $$0) {
         this.e = $$0;
      }

      @Override
      public double a(eee.b $$0) {
         if ($$0 != eep.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == eep.this.H) {
            return this.i[eep.this.I];
         } else if (this.f == eep.this.G) {
            return this.h;
         } else {
            this.f = eep.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, eee.a $$1) {
         if (this.i != null && this.g == eep.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = eep.this.H;
         }
      }

      @Override
      public eee k() {
         return this.e;
      }

      @Override
      public eef.l.a j() {
         return eef.l.a.d;
      }
   }

   class g implements eef.m, eep.h {
      private final eee e;
      final double[][] f;

      g(final eee $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[eep.this.v + 1][eep.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= eep.this.v; $$2++) {
               int $$3 = eep.this.g + $$2;
               int $$4 = kd.c($$3);

               for (int $$5 = 0; $$5 <= eep.this.v; $$5++) {
                  int $$6 = eep.this.h + $$5;
                  int $$7 = kd.c($$6);
                  this.f[$$2][$$5] = $$0.a(new eee.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(eee.b $$0) {
         int $$1 = kd.a($$0.a());
         int $$2 = kd.a($$0.c());
         int $$3 = $$1 - eep.this.g;
         int $$4 = $$2 - eep.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, eee.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eee k() {
         return this.e;
      }

      @Override
      public eef.l.a j() {
         return eef.l.a.b;
      }
   }

   interface h extends eee {
      eee k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements eef.m, eep.h {
      double[][] e;
      double[][] f;
      private final eee g;
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

      i(final eee $$1) {
         this.g = $$1;
         this.e = this.a(eep.this.c, eep.this.b);
         this.f = this.a(eep.this.c, eep.this.b);
         eep.this.i.add(this);
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
         this.p = azk.d($$0, this.h, this.l);
         this.q = azk.d($$0, this.j, this.n);
         this.r = azk.d($$0, this.i, this.m);
         this.s = azk.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = azk.d($$0, this.p, this.q);
         this.u = azk.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = azk.d($$0, this.t, this.u);
      }

      @Override
      public double a(eee.b $$0) {
         if ($$0 != eep.this) {
            return this.g.a($$0);
         } else if (!eep.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return eep.this.z
               ? azk.a(
                  (double)eep.this.D / (double)eep.this.w,
                  (double)eep.this.E / (double)eep.this.x,
                  (double)eep.this.F / (double)eep.this.w,
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
      public void a(double[] $$0, eee.a $$1) {
         if (eep.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public eee k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public eef.l.a j() {
         return eef.l.a.a;
      }
   }
}
