import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ecv implements eck.a, eck.b {
   private final ecz a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<ecv.i> i;
   final List<ecv.e> j;
   private final Map<eck, eck> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final ecd m;
   private final eck n;
   private final ecv.c o;
   private final edt p;
   private final ecv.g q;
   private final ecv.g r;
   private final ecl.c s;
   private long t = dfn.c;
   private edt.a u = new edt.a(1.0, 0.0);
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
   private final eck.a J = new eck.a() {
      @Override
      public eck.b a(int $$0) {
         ecv.this.B = ($$0 + ecv.this.d) * ecv.this.x;
         ecv.this.G++;
         ecv.this.E = 0;
         ecv.this.I = $$0;
         return ecv.this;
      }

      @Override
      public void a(double[] $$0, eck $$1) {
         for (int $$2 = 0; $$2 < ecv.this.c + 1; $$2++) {
            ecv.this.B = ($$2 + ecv.this.d) * ecv.this.x;
            ecv.this.G++;
            ecv.this.E = 0;
            ecv.this.I = $$2;
            $$0[$$2] = $$1.a(ecv.this);
         }
      }
   };

   public static ecv a(dyr $$0, edf $$1, ecl.c $$2, ecw $$3, ecd.a $$4, edt $$5) {
      ecz $$6 = $$3.f().a($$0);
      dfn $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new ecv($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public ecv(int $$0, edf $$1, int $$2, int $$3, ecz $$4, ecl.c $$5, ecw $$6, ecd.a $$7, edt $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = ayz.a($$4.d(), this.x);
      this.d = ayz.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = kc.a($$2);
      this.h = kc.a($$3);
      this.v = kc.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new ecv.g(new ecv.a(), false);
      this.r = new ecv.g(new ecv.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = kc.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = kc.c($$13);
            edt.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      ecx $$16 = $$1.a();
      ecx $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = ecd.a($$7);
      } else {
         int $$18 = kk.a($$2);
         int $$19 = kk.a($$3);
         this.m = ecd.a(this, new dfn($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<ecv.c> $$20 = new ArrayList<>();
      eck $$21 = ecl.e(ecl.a($$17.l(), ecl.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(edb.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new elz($$20.toArray(new ecv.c[0]));
      this.n = $$17.k();
   }

   protected dhs.f a(ecx $$0, List<dhs.d> $$1) {
      return new dhs.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dww e() {
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
      int $$2 = kc.c(kc.a($$0));
      int $$3 = kc.c(kc.a($$1));
      return this.l.computeIfAbsent(aqp.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aqp.a($$0);
      int $$2 = aqp.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new eck.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public edt d() {
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

         for (ecv.i $$4 : this.i) {
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

   public ecv c(int $$0) {
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
   public void a(double[] $$0, eck $$1) {
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
      for (ecv.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (ecv.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (ecv.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (ecv.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (ecv.i $$2 : this.i) {
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
      this.i.forEach(ecv.i::l);
   }

   public ecd i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   edt.a c(int $$0, int $$1) {
      long $$2 = dfn.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         edt.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected eck a(eck $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private eck b(eck $$0) {
      if ($$0 instanceof ecl.l $$1) {
         return (eck)(switch ($$1.j()) {
            case a -> new ecv.i($$1.k());
            case b -> new ecv.g($$1.k(), true);
            case c -> new ecv.d($$1.k());
            case d -> new ecv.f($$1.k());
            case e -> new ecv.e($$1.k());
         });
      } else {
         if (this.p != edt.a()) {
            if ($$0 == ecl.d.a) {
               return this.q;
            }

            if ($$0 == ecl.f.a) {
               return this.r;
            }
         }

         if ($$0 == ecl.b.a) {
            return this.s;
         } else {
            return $$0 instanceof ecl.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements ecv.h {
      @Override
      public eck k() {
         return ecl.d.a;
      }

      @Override
      public eck a(eck.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(eck.b $$0) {
         return ecv.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, eck.a $$1) {
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
      public ays<? extends eck> c() {
         return ecl.d.e;
      }
   }

   class b implements ecv.h {
      @Override
      public eck k() {
         return ecl.f.a;
      }

      @Override
      public eck a(eck.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(eck.b $$0) {
         return ecv.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, eck.a $$1) {
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
      public ays<? extends eck> c() {
         return ecl.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dww calculate(eck.b var1);
   }

   static class d implements ecl.m, ecv.h {
      private final eck a;
      private long e = dfn.c;
      private double f;

      d(eck $$0) {
         this.a = $$0;
      }

      @Override
      public double a(eck.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dfn.c($$1, $$2);
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
      public void a(double[] $$0, eck.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public eck k() {
         return this.a;
      }

      @Override
      public ecl.l.a j() {
         return ecl.l.a.c;
      }
   }

   class e implements ecl.m, ecv.h {
      final eck e;
      final double[] f;

      e(final eck $$0) {
         this.e = $$0;
         this.f = new double[ecv.this.w * ecv.this.w * ecv.this.x];
         ecv.this.j.add(this);
      }

      @Override
      public double a(eck.b $$0) {
         if ($$0 != ecv.this) {
            return this.e.a($$0);
         } else if (!ecv.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = ecv.this.D;
            int $$2 = ecv.this.E;
            int $$3 = ecv.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < ecv.this.w && $$2 < ecv.this.x && $$3 < ecv.this.w
               ? this.f[((ecv.this.x - 1 - $$2) * ecv.this.w + $$1) * ecv.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, eck.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eck k() {
         return this.e;
      }

      @Override
      public ecl.l.a j() {
         return ecl.l.a.e;
      }
   }

   class f implements ecl.m, ecv.h {
      private final eck e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final eck $$0) {
         this.e = $$0;
      }

      @Override
      public double a(eck.b $$0) {
         if ($$0 != ecv.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == ecv.this.H) {
            return this.i[ecv.this.I];
         } else if (this.f == ecv.this.G) {
            return this.h;
         } else {
            this.f = ecv.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, eck.a $$1) {
         if (this.i != null && this.g == ecv.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = ecv.this.H;
         }
      }

      @Override
      public eck k() {
         return this.e;
      }

      @Override
      public ecl.l.a j() {
         return ecl.l.a.d;
      }
   }

   class g implements ecl.m, ecv.h {
      private final eck e;
      final double[][] f;

      g(final eck $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[ecv.this.v + 1][ecv.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= ecv.this.v; $$2++) {
               int $$3 = ecv.this.g + $$2;
               int $$4 = kc.c($$3);

               for (int $$5 = 0; $$5 <= ecv.this.v; $$5++) {
                  int $$6 = ecv.this.h + $$5;
                  int $$7 = kc.c($$6);
                  this.f[$$2][$$5] = $$0.a(new eck.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(eck.b $$0) {
         int $$1 = kc.a($$0.a());
         int $$2 = kc.a($$0.c());
         int $$3 = $$1 - ecv.this.g;
         int $$4 = $$2 - ecv.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, eck.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eck k() {
         return this.e;
      }

      @Override
      public ecl.l.a j() {
         return ecl.l.a.b;
      }
   }

   interface h extends eck {
      eck k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements ecl.m, ecv.h {
      double[][] e;
      double[][] f;
      private final eck g;
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

      i(final eck $$1) {
         this.g = $$1;
         this.e = this.a(ecv.this.c, ecv.this.b);
         this.f = this.a(ecv.this.c, ecv.this.b);
         ecv.this.i.add(this);
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
         this.p = ayz.d($$0, this.h, this.l);
         this.q = ayz.d($$0, this.j, this.n);
         this.r = ayz.d($$0, this.i, this.m);
         this.s = ayz.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = ayz.d($$0, this.p, this.q);
         this.u = ayz.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = ayz.d($$0, this.t, this.u);
      }

      @Override
      public double a(eck.b $$0) {
         if ($$0 != ecv.this) {
            return this.g.a($$0);
         } else if (!ecv.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return ecv.this.z
               ? ayz.a(
                  (double)ecv.this.D / (double)ecv.this.w,
                  (double)ecv.this.E / (double)ecv.this.x,
                  (double)ecv.this.F / (double)ecv.this.w,
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
      public void a(double[] $$0, eck.a $$1) {
         if (ecv.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public eck k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public ecl.l.a j() {
         return ecl.l.a.a;
      }
   }
}
