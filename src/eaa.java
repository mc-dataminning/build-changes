import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class eaa implements dzp.a, dzp.b {
   private final eae a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<eaa.i> i;
   final List<eaa.e> j;
   private final Map<dzp, dzp> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dzi m;
   private final dzp n;
   private final eaa.c o;
   private final eay p;
   private final eaa.g q;
   private final eaa.g r;
   private final dzq.c s;
   private long t = dcy.a;
   private eay.a u = new eay.a(1.0, 0.0);
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
   private final dzp.a J = new dzp.a() {
      @Override
      public dzp.b a(int $$0) {
         eaa.this.B = ($$0 + eaa.this.d) * eaa.this.x;
         eaa.this.G++;
         eaa.this.E = 0;
         eaa.this.I = $$0;
         return eaa.this;
      }

      @Override
      public void a(double[] $$0, dzp $$1) {
         for (int $$2 = 0; $$2 < eaa.this.c + 1; $$2++) {
            eaa.this.B = ($$2 + eaa.this.d) * eaa.this.x;
            eaa.this.G++;
            eaa.this.E = 0;
            eaa.this.I = $$2;
            $$0[$$2] = $$1.a(eaa.this);
         }
      }
   };

   public static eaa a(dvw $$0, eak $$1, dzq.c $$2, eab $$3, dzi.a $$4, eay $$5) {
      eae $$6 = $$3.f().a($$0);
      dcy $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new eaa($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public eaa(int $$0, eak $$1, int $$2, int $$3, eae $$4, dzq.c $$5, eab $$6, dzi.a $$7, eay $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = azc.a($$4.d(), this.x);
      this.d = azc.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = jy.a($$2);
      this.h = jy.a($$3);
      this.v = jy.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new eaa.g(new eaa.a(), false);
      this.r = new eaa.g(new eaa.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = jy.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = jy.c($$13);
            eay.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      eac $$16 = $$1.a();
      eac $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dzi.a($$7);
      } else {
         int $$18 = kg.a($$2);
         int $$19 = kg.a($$3);
         this.m = dzi.a(this, new dcy($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<eaa.c> $$20 = new ArrayList<>();
      dzp $$21 = dzq.e(dzq.a($$17.l(), dzq.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(eag.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new ejc($$20.toArray(new eaa.c[0]));
      this.n = $$17.k();
   }

   protected dfc.f a(eac $$0, List<dfc.d> $$1) {
      return new dfc.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dua e() {
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
      int $$2 = jy.c(jy.a($$0));
      int $$3 = jy.c(jy.a($$1));
      return this.l.computeIfAbsent(aqt.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aqt.a($$0);
      int $$2 = aqt.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dzp.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public eay d() {
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

         for (eaa.i $$4 : this.i) {
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

   public eaa c(int $$0) {
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
   public void a(double[] $$0, dzp $$1) {
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
      for (eaa.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (eaa.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (eaa.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (eaa.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (eaa.i $$2 : this.i) {
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
      this.i.forEach(eaa.i::l);
   }

   public dzi i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   eay.a c(int $$0, int $$1) {
      long $$2 = dcy.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         eay.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dzp a(dzp $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dzp b(dzp $$0) {
      if ($$0 instanceof dzq.l $$1) {
         return (dzp)(switch ($$1.j()) {
            case a -> new eaa.i($$1.k());
            case b -> new eaa.g($$1.k(), true);
            case c -> new eaa.d($$1.k());
            case d -> new eaa.f($$1.k());
            case e -> new eaa.e($$1.k());
         });
      } else {
         if (this.p != eay.a()) {
            if ($$0 == dzq.d.a) {
               return this.q;
            }

            if ($$0 == dzq.f.a) {
               return this.r;
            }
         }

         if ($$0 == dzq.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dzq.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements eaa.h {
      @Override
      public dzp k() {
         return dzq.d.a;
      }

      @Override
      public dzp a(dzp.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dzp.b $$0) {
         return eaa.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dzp.a $$1) {
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
      public ayv<? extends dzp> c() {
         return dzq.d.e;
      }
   }

   class b implements eaa.h {
      @Override
      public dzp k() {
         return dzq.f.a;
      }

      @Override
      public dzp a(dzp.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dzp.b $$0) {
         return eaa.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dzp.a $$1) {
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
      public ayv<? extends dzp> c() {
         return dzq.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dua calculate(dzp.b var1);
   }

   static class d implements dzq.m, eaa.h {
      private final dzp a;
      private long e = dcy.a;
      private double f;

      d(dzp $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dzp.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dcy.c($$1, $$2);
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
      public void a(double[] $$0, dzp.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dzp k() {
         return this.a;
      }

      @Override
      public dzq.l.a j() {
         return dzq.l.a.c;
      }
   }

   class e implements dzq.m, eaa.h {
      final dzp e;
      final double[] f;

      e(final dzp $$0) {
         this.e = $$0;
         this.f = new double[eaa.this.w * eaa.this.w * eaa.this.x];
         eaa.this.j.add(this);
      }

      @Override
      public double a(dzp.b $$0) {
         if ($$0 != eaa.this) {
            return this.e.a($$0);
         } else if (!eaa.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = eaa.this.D;
            int $$2 = eaa.this.E;
            int $$3 = eaa.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < eaa.this.w && $$2 < eaa.this.x && $$3 < eaa.this.w
               ? this.f[((eaa.this.x - 1 - $$2) * eaa.this.w + $$1) * eaa.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dzp.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dzp k() {
         return this.e;
      }

      @Override
      public dzq.l.a j() {
         return dzq.l.a.e;
      }
   }

   class f implements dzq.m, eaa.h {
      private final dzp e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final dzp $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dzp.b $$0) {
         if ($$0 != eaa.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == eaa.this.H) {
            return this.i[eaa.this.I];
         } else if (this.f == eaa.this.G) {
            return this.h;
         } else {
            this.f = eaa.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dzp.a $$1) {
         if (this.i != null && this.g == eaa.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = eaa.this.H;
         }
      }

      @Override
      public dzp k() {
         return this.e;
      }

      @Override
      public dzq.l.a j() {
         return dzq.l.a.d;
      }
   }

   class g implements dzq.m, eaa.h {
      private final dzp e;
      final double[][] f;

      g(final dzp $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[eaa.this.v + 1][eaa.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= eaa.this.v; $$2++) {
               int $$3 = eaa.this.g + $$2;
               int $$4 = jy.c($$3);

               for (int $$5 = 0; $$5 <= eaa.this.v; $$5++) {
                  int $$6 = eaa.this.h + $$5;
                  int $$7 = jy.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dzp.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dzp.b $$0) {
         int $$1 = jy.a($$0.a());
         int $$2 = jy.a($$0.c());
         int $$3 = $$1 - eaa.this.g;
         int $$4 = $$2 - eaa.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dzp.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dzp k() {
         return this.e;
      }

      @Override
      public dzq.l.a j() {
         return dzq.l.a.b;
      }
   }

   interface h extends dzp {
      dzp k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dzq.m, eaa.h {
      double[][] e;
      double[][] f;
      private final dzp g;
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

      i(final dzp $$1) {
         this.g = $$1;
         this.e = this.a(eaa.this.c, eaa.this.b);
         this.f = this.a(eaa.this.c, eaa.this.b);
         eaa.this.i.add(this);
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
         this.p = azc.d($$0, this.h, this.l);
         this.q = azc.d($$0, this.j, this.n);
         this.r = azc.d($$0, this.i, this.m);
         this.s = azc.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = azc.d($$0, this.p, this.q);
         this.u = azc.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = azc.d($$0, this.t, this.u);
      }

      @Override
      public double a(dzp.b $$0) {
         if ($$0 != eaa.this) {
            return this.g.a($$0);
         } else if (!eaa.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return eaa.this.z
               ? azc.a(
                  (double)eaa.this.D / (double)eaa.this.w,
                  (double)eaa.this.E / (double)eaa.this.x,
                  (double)eaa.this.F / (double)eaa.this.w,
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
      public void a(double[] $$0, dzp.a $$1) {
         if (eaa.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dzp k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dzq.l.a j() {
         return dzq.l.a.a;
      }
   }
}
