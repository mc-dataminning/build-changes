import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ebn implements ebc.a, ebc.b {
   private final ebr a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<ebn.i> i;
   final List<ebn.e> j;
   private final Map<ebc, ebc> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final eav m;
   private final ebc n;
   private final ebn.c o;
   private final ecl p;
   private final ebn.g q;
   private final ebn.g r;
   private final ebd.c s;
   private long t = del.c;
   private ecl.a u = new ecl.a(1.0, 0.0);
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
   private final ebc.a J = new ebc.a() {
      @Override
      public ebc.b a(int $$0) {
         ebn.this.B = ($$0 + ebn.this.d) * ebn.this.x;
         ebn.this.G++;
         ebn.this.E = 0;
         ebn.this.I = $$0;
         return ebn.this;
      }

      @Override
      public void a(double[] $$0, ebc $$1) {
         for (int $$2 = 0; $$2 < ebn.this.c + 1; $$2++) {
            ebn.this.B = ($$2 + ebn.this.d) * ebn.this.x;
            ebn.this.G++;
            ebn.this.E = 0;
            ebn.this.I = $$2;
            $$0[$$2] = $$1.a(ebn.this);
         }
      }
   };

   public static ebn a(dxj $$0, ebx $$1, ebd.c $$2, ebo $$3, eav.a $$4, ecl $$5) {
      ebr $$6 = $$3.f().a($$0);
      del $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new ebn($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public ebn(int $$0, ebx $$1, int $$2, int $$3, ebr $$4, ebd.c $$5, ebo $$6, eav.a $$7, ecl $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = azn.a($$4.d(), this.x);
      this.d = azn.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = kb.a($$2);
      this.h = kb.a($$3);
      this.v = kb.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new ebn.g(new ebn.a(), false);
      this.r = new ebn.g(new ebn.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = kb.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = kb.c($$13);
            ecl.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      ebp $$16 = $$1.a();
      ebp $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = eav.a($$7);
      } else {
         int $$18 = kj.a($$2);
         int $$19 = kj.a($$3);
         this.m = eav.a(this, new del($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<ebn.c> $$20 = new ArrayList<>();
      ebc $$21 = ebd.e(ebd.a($$17.l(), ebd.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(ebt.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new ekp($$20.toArray(new ebn.c[0]));
      this.n = $$17.k();
   }

   protected dgq.f a(ebp $$0, List<dgq.d> $$1) {
      return new dgq.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dvo e() {
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
      int $$2 = kb.c(kb.a($$0));
      int $$3 = kb.c(kb.a($$1));
      return this.l.computeIfAbsent(ard.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = ard.a($$0);
      int $$2 = ard.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new ebc.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public ecl d() {
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

         for (ebn.i $$4 : this.i) {
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

   public ebn c(int $$0) {
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
   public void a(double[] $$0, ebc $$1) {
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
      for (ebn.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (ebn.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (ebn.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (ebn.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (ebn.i $$2 : this.i) {
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
      this.i.forEach(ebn.i::l);
   }

   public eav i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   ecl.a c(int $$0, int $$1) {
      long $$2 = del.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         ecl.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected ebc a(ebc $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private ebc b(ebc $$0) {
      if ($$0 instanceof ebd.l $$1) {
         return (ebc)(switch ($$1.j()) {
            case a -> new ebn.i($$1.k());
            case b -> new ebn.g($$1.k(), true);
            case c -> new ebn.d($$1.k());
            case d -> new ebn.f($$1.k());
            case e -> new ebn.e($$1.k());
         });
      } else {
         if (this.p != ecl.a()) {
            if ($$0 == ebd.d.a) {
               return this.q;
            }

            if ($$0 == ebd.f.a) {
               return this.r;
            }
         }

         if ($$0 == ebd.b.a) {
            return this.s;
         } else {
            return $$0 instanceof ebd.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements ebn.h {
      @Override
      public ebc k() {
         return ebd.d.a;
      }

      @Override
      public ebc a(ebc.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(ebc.b $$0) {
         return ebn.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, ebc.a $$1) {
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
      public azg<? extends ebc> c() {
         return ebd.d.e;
      }
   }

   class b implements ebn.h {
      @Override
      public ebc k() {
         return ebd.f.a;
      }

      @Override
      public ebc a(ebc.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(ebc.b $$0) {
         return ebn.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, ebc.a $$1) {
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
      public azg<? extends ebc> c() {
         return ebd.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dvo calculate(ebc.b var1);
   }

   static class d implements ebd.m, ebn.h {
      private final ebc a;
      private long e = del.c;
      private double f;

      d(ebc $$0) {
         this.a = $$0;
      }

      @Override
      public double a(ebc.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = del.c($$1, $$2);
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
      public void a(double[] $$0, ebc.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public ebc k() {
         return this.a;
      }

      @Override
      public ebd.l.a j() {
         return ebd.l.a.c;
      }
   }

   class e implements ebd.m, ebn.h {
      final ebc e;
      final double[] f;

      e(final ebc $$0) {
         this.e = $$0;
         this.f = new double[ebn.this.w * ebn.this.w * ebn.this.x];
         ebn.this.j.add(this);
      }

      @Override
      public double a(ebc.b $$0) {
         if ($$0 != ebn.this) {
            return this.e.a($$0);
         } else if (!ebn.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = ebn.this.D;
            int $$2 = ebn.this.E;
            int $$3 = ebn.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < ebn.this.w && $$2 < ebn.this.x && $$3 < ebn.this.w
               ? this.f[((ebn.this.x - 1 - $$2) * ebn.this.w + $$1) * ebn.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, ebc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ebc k() {
         return this.e;
      }

      @Override
      public ebd.l.a j() {
         return ebd.l.a.e;
      }
   }

   class f implements ebd.m, ebn.h {
      private final ebc e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final ebc $$0) {
         this.e = $$0;
      }

      @Override
      public double a(ebc.b $$0) {
         if ($$0 != ebn.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == ebn.this.H) {
            return this.i[ebn.this.I];
         } else if (this.f == ebn.this.G) {
            return this.h;
         } else {
            this.f = ebn.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, ebc.a $$1) {
         if (this.i != null && this.g == ebn.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = ebn.this.H;
         }
      }

      @Override
      public ebc k() {
         return this.e;
      }

      @Override
      public ebd.l.a j() {
         return ebd.l.a.d;
      }
   }

   class g implements ebd.m, ebn.h {
      private final ebc e;
      final double[][] f;

      g(final ebc $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[ebn.this.v + 1][ebn.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= ebn.this.v; $$2++) {
               int $$3 = ebn.this.g + $$2;
               int $$4 = kb.c($$3);

               for (int $$5 = 0; $$5 <= ebn.this.v; $$5++) {
                  int $$6 = ebn.this.h + $$5;
                  int $$7 = kb.c($$6);
                  this.f[$$2][$$5] = $$0.a(new ebc.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(ebc.b $$0) {
         int $$1 = kb.a($$0.a());
         int $$2 = kb.a($$0.c());
         int $$3 = $$1 - ebn.this.g;
         int $$4 = $$2 - ebn.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, ebc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ebc k() {
         return this.e;
      }

      @Override
      public ebd.l.a j() {
         return ebd.l.a.b;
      }
   }

   interface h extends ebc {
      ebc k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements ebd.m, ebn.h {
      double[][] e;
      double[][] f;
      private final ebc g;
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

      i(final ebc $$1) {
         this.g = $$1;
         this.e = this.a(ebn.this.c, ebn.this.b);
         this.f = this.a(ebn.this.c, ebn.this.b);
         ebn.this.i.add(this);
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
         this.p = azn.d($$0, this.h, this.l);
         this.q = azn.d($$0, this.j, this.n);
         this.r = azn.d($$0, this.i, this.m);
         this.s = azn.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = azn.d($$0, this.p, this.q);
         this.u = azn.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = azn.d($$0, this.t, this.u);
      }

      @Override
      public double a(ebc.b $$0) {
         if ($$0 != ebn.this) {
            return this.g.a($$0);
         } else if (!ebn.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return ebn.this.z
               ? azn.a(
                  (double)ebn.this.D / (double)ebn.this.w,
                  (double)ebn.this.E / (double)ebn.this.x,
                  (double)ebn.this.F / (double)ebn.this.w,
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
      public void a(double[] $$0, ebc.a $$1) {
         if (ebn.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public ebc k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public ebd.l.a j() {
         return ebd.l.a.a;
      }
   }
}
