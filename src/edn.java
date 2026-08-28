import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class edn implements edc.a, edc.b {
   private final edr a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<edn.i> i;
   final List<edn.e> j;
   private final Map<edc, edc> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final ecv m;
   private final edc n;
   private final edn.c o;
   private final eel p;
   private final edn.g q;
   private final edn.g r;
   private final edd.c s;
   private long t = dgf.c;
   private eel.a u = new eel.a(1.0, 0.0);
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
   private final edc.a J = new edc.a() {
      @Override
      public edc.b a(int $$0) {
         edn.this.B = ($$0 + edn.this.d) * edn.this.x;
         edn.this.G++;
         edn.this.E = 0;
         edn.this.I = $$0;
         return edn.this;
      }

      @Override
      public void a(double[] $$0, edc $$1) {
         for (int $$2 = 0; $$2 < edn.this.c + 1; $$2++) {
            edn.this.B = ($$2 + edn.this.d) * edn.this.x;
            edn.this.G++;
            edn.this.E = 0;
            edn.this.I = $$2;
            $$0[$$2] = $$1.a(edn.this);
         }
      }
   };

   public static edn a(dzj $$0, edx $$1, edd.c $$2, edo $$3, ecv.a $$4, eel $$5) {
      edr $$6 = $$3.f().a($$0);
      dgf $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new edn($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public edn(int $$0, edx $$1, int $$2, int $$3, edr $$4, edd.c $$5, edo $$6, ecv.a $$7, eel $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = azu.a($$4.d(), this.x);
      this.d = azu.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = kb.a($$2);
      this.h = kb.a($$3);
      this.v = kb.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new edn.g(new edn.a(), false);
      this.r = new edn.g(new edn.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = kb.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = kb.c($$13);
            eel.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      edp $$16 = $$1.a();
      edp $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = ecv.a($$7);
      } else {
         int $$18 = kj.a($$2);
         int $$19 = kj.a($$3);
         this.m = ecv.a(this, new dgf($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<edn.c> $$20 = new ArrayList<>();
      edc $$21 = edd.e(edd.a($$17.l(), edd.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(edt.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new emr($$20.toArray(new edn.c[0]));
      this.n = $$17.k();
   }

   protected dik.f a(edp $$0, List<dik.d> $$1) {
      return new dik.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dxo e() {
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
      return this.l.computeIfAbsent(arj.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = arj.a($$0);
      int $$2 = arj.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new edc.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public eel d() {
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

         for (edn.i $$4 : this.i) {
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

   public edn c(int $$0) {
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
   public void a(double[] $$0, edc $$1) {
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
      for (edn.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (edn.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (edn.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (edn.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (edn.i $$2 : this.i) {
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
      this.i.forEach(edn.i::l);
   }

   public ecv i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   eel.a c(int $$0, int $$1) {
      long $$2 = dgf.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         eel.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected edc a(edc $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private edc b(edc $$0) {
      if ($$0 instanceof edd.l $$1) {
         return (edc)(switch ($$1.j()) {
            case a -> new edn.i($$1.k());
            case b -> new edn.g($$1.k(), true);
            case c -> new edn.d($$1.k());
            case d -> new edn.f($$1.k());
            case e -> new edn.e($$1.k());
         });
      } else {
         if (this.p != eel.a()) {
            if ($$0 == edd.d.a) {
               return this.q;
            }

            if ($$0 == edd.f.a) {
               return this.r;
            }
         }

         if ($$0 == edd.b.a) {
            return this.s;
         } else {
            return $$0 instanceof edd.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements edn.h {
      @Override
      public edc k() {
         return edd.d.a;
      }

      @Override
      public edc a(edc.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(edc.b $$0) {
         return edn.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, edc.a $$1) {
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
      public azn<? extends edc> c() {
         return edd.d.e;
      }
   }

   class b implements edn.h {
      @Override
      public edc k() {
         return edd.f.a;
      }

      @Override
      public edc a(edc.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(edc.b $$0) {
         return edn.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, edc.a $$1) {
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
      public azn<? extends edc> c() {
         return edd.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dxo calculate(edc.b var1);
   }

   static class d implements edd.m, edn.h {
      private final edc a;
      private long e = dgf.c;
      private double f;

      d(edc $$0) {
         this.a = $$0;
      }

      @Override
      public double a(edc.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dgf.c($$1, $$2);
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
      public void a(double[] $$0, edc.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public edc k() {
         return this.a;
      }

      @Override
      public edd.l.a j() {
         return edd.l.a.c;
      }
   }

   class e implements edd.m, edn.h {
      final edc e;
      final double[] f;

      e(final edc $$0) {
         this.e = $$0;
         this.f = new double[edn.this.w * edn.this.w * edn.this.x];
         edn.this.j.add(this);
      }

      @Override
      public double a(edc.b $$0) {
         if ($$0 != edn.this) {
            return this.e.a($$0);
         } else if (!edn.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = edn.this.D;
            int $$2 = edn.this.E;
            int $$3 = edn.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < edn.this.w && $$2 < edn.this.x && $$3 < edn.this.w
               ? this.f[((edn.this.x - 1 - $$2) * edn.this.w + $$1) * edn.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, edc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edc k() {
         return this.e;
      }

      @Override
      public edd.l.a j() {
         return edd.l.a.e;
      }
   }

   class f implements edd.m, edn.h {
      private final edc e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final edc $$0) {
         this.e = $$0;
      }

      @Override
      public double a(edc.b $$0) {
         if ($$0 != edn.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == edn.this.H) {
            return this.i[edn.this.I];
         } else if (this.f == edn.this.G) {
            return this.h;
         } else {
            this.f = edn.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, edc.a $$1) {
         if (this.i != null && this.g == edn.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = edn.this.H;
         }
      }

      @Override
      public edc k() {
         return this.e;
      }

      @Override
      public edd.l.a j() {
         return edd.l.a.d;
      }
   }

   class g implements edd.m, edn.h {
      private final edc e;
      final double[][] f;

      g(final edc $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[edn.this.v + 1][edn.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= edn.this.v; $$2++) {
               int $$3 = edn.this.g + $$2;
               int $$4 = kb.c($$3);

               for (int $$5 = 0; $$5 <= edn.this.v; $$5++) {
                  int $$6 = edn.this.h + $$5;
                  int $$7 = kb.c($$6);
                  this.f[$$2][$$5] = $$0.a(new edc.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(edc.b $$0) {
         int $$1 = kb.a($$0.a());
         int $$2 = kb.a($$0.c());
         int $$3 = $$1 - edn.this.g;
         int $$4 = $$2 - edn.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, edc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edc k() {
         return this.e;
      }

      @Override
      public edd.l.a j() {
         return edd.l.a.b;
      }
   }

   interface h extends edc {
      edc k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements edd.m, edn.h {
      double[][] e;
      double[][] f;
      private final edc g;
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

      i(final edc $$1) {
         this.g = $$1;
         this.e = this.a(edn.this.c, edn.this.b);
         this.f = this.a(edn.this.c, edn.this.b);
         edn.this.i.add(this);
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
         this.p = azu.d($$0, this.h, this.l);
         this.q = azu.d($$0, this.j, this.n);
         this.r = azu.d($$0, this.i, this.m);
         this.s = azu.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = azu.d($$0, this.p, this.q);
         this.u = azu.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = azu.d($$0, this.t, this.u);
      }

      @Override
      public double a(edc.b $$0) {
         if ($$0 != edn.this) {
            return this.g.a($$0);
         } else if (!edn.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return edn.this.z
               ? azu.a(
                  (double)edn.this.D / (double)edn.this.w,
                  (double)edn.this.E / (double)edn.this.x,
                  (double)edn.this.F / (double)edn.this.w,
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
      public void a(double[] $$0, edc.a $$1) {
         if (edn.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public edc k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public edd.l.a j() {
         return edd.l.a.a;
      }
   }
}
