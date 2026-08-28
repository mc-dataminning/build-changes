import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class eas implements eah.a, eah.b {
   private final eaw a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<eas.i> i;
   final List<eas.e> j;
   private final Map<eah, eah> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final eaa m;
   private final eah n;
   private final eas.c o;
   private final ebq p;
   private final eas.g q;
   private final eas.g r;
   private final eai.c s;
   private long t = ddp.a;
   private ebq.a u = new ebq.a(1.0, 0.0);
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
   private final eah.a J = new eah.a() {
      @Override
      public eah.b a(int $$0) {
         eas.this.B = ($$0 + eas.this.d) * eas.this.x;
         eas.this.G++;
         eas.this.E = 0;
         eas.this.I = $$0;
         return eas.this;
      }

      @Override
      public void a(double[] $$0, eah $$1) {
         for (int $$2 = 0; $$2 < eas.this.c + 1; $$2++) {
            eas.this.B = ($$2 + eas.this.d) * eas.this.x;
            eas.this.G++;
            eas.this.E = 0;
            eas.this.I = $$2;
            $$0[$$2] = $$1.a(eas.this);
         }
      }
   };

   public static eas a(dwo $$0, ebc $$1, eai.c $$2, eat $$3, eaa.a $$4, ebq $$5) {
      eaw $$6 = $$3.f().a($$0);
      ddp $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new eas($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public eas(int $$0, ebc $$1, int $$2, int $$3, eaw $$4, eai.c $$5, eat $$6, eaa.a $$7, ebq $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = azf.a($$4.d(), this.x);
      this.d = azf.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = jz.a($$2);
      this.h = jz.a($$3);
      this.v = jz.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new eas.g(new eas.a(), false);
      this.r = new eas.g(new eas.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = jz.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = jz.c($$13);
            ebq.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      eau $$16 = $$1.a();
      eau $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = eaa.a($$7);
      } else {
         int $$18 = kh.a($$2);
         int $$19 = kh.a($$3);
         this.m = eaa.a(this, new ddp($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<eas.c> $$20 = new ArrayList<>();
      eah $$21 = eai.e(eai.a($$17.l(), eai.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(eay.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new eju($$20.toArray(new eas.c[0]));
      this.n = $$17.k();
   }

   protected dft.f a(eau $$0, List<dft.d> $$1) {
      return new dft.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dus e() {
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
      int $$2 = jz.c(jz.a($$0));
      int $$3 = jz.c(jz.a($$1));
      return this.l.computeIfAbsent(aqw.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aqw.a($$0);
      int $$2 = aqw.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new eah.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public ebq d() {
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

         for (eas.i $$4 : this.i) {
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

   public eas c(int $$0) {
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
   public void a(double[] $$0, eah $$1) {
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
      for (eas.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (eas.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (eas.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (eas.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (eas.i $$2 : this.i) {
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
      this.i.forEach(eas.i::l);
   }

   public eaa i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   ebq.a c(int $$0, int $$1) {
      long $$2 = ddp.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         ebq.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected eah a(eah $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private eah b(eah $$0) {
      if ($$0 instanceof eai.l $$1) {
         return (eah)(switch ($$1.j()) {
            case a -> new eas.i($$1.k());
            case b -> new eas.g($$1.k(), true);
            case c -> new eas.d($$1.k());
            case d -> new eas.f($$1.k());
            case e -> new eas.e($$1.k());
         });
      } else {
         if (this.p != ebq.a()) {
            if ($$0 == eai.d.a) {
               return this.q;
            }

            if ($$0 == eai.f.a) {
               return this.r;
            }
         }

         if ($$0 == eai.b.a) {
            return this.s;
         } else {
            return $$0 instanceof eai.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements eas.h {
      @Override
      public eah k() {
         return eai.d.a;
      }

      @Override
      public eah a(eah.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(eah.b $$0) {
         return eas.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, eah.a $$1) {
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
      public ayy<? extends eah> c() {
         return eai.d.e;
      }
   }

   class b implements eas.h {
      @Override
      public eah k() {
         return eai.f.a;
      }

      @Override
      public eah a(eah.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(eah.b $$0) {
         return eas.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, eah.a $$1) {
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
      public ayy<? extends eah> c() {
         return eai.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dus calculate(eah.b var1);
   }

   static class d implements eai.m, eas.h {
      private final eah a;
      private long e = ddp.a;
      private double f;

      d(eah $$0) {
         this.a = $$0;
      }

      @Override
      public double a(eah.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = ddp.c($$1, $$2);
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
      public void a(double[] $$0, eah.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public eah k() {
         return this.a;
      }

      @Override
      public eai.l.a j() {
         return eai.l.a.c;
      }
   }

   class e implements eai.m, eas.h {
      final eah e;
      final double[] f;

      e(final eah $$0) {
         this.e = $$0;
         this.f = new double[eas.this.w * eas.this.w * eas.this.x];
         eas.this.j.add(this);
      }

      @Override
      public double a(eah.b $$0) {
         if ($$0 != eas.this) {
            return this.e.a($$0);
         } else if (!eas.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = eas.this.D;
            int $$2 = eas.this.E;
            int $$3 = eas.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < eas.this.w && $$2 < eas.this.x && $$3 < eas.this.w
               ? this.f[((eas.this.x - 1 - $$2) * eas.this.w + $$1) * eas.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, eah.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eah k() {
         return this.e;
      }

      @Override
      public eai.l.a j() {
         return eai.l.a.e;
      }
   }

   class f implements eai.m, eas.h {
      private final eah e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final eah $$0) {
         this.e = $$0;
      }

      @Override
      public double a(eah.b $$0) {
         if ($$0 != eas.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == eas.this.H) {
            return this.i[eas.this.I];
         } else if (this.f == eas.this.G) {
            return this.h;
         } else {
            this.f = eas.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, eah.a $$1) {
         if (this.i != null && this.g == eas.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = eas.this.H;
         }
      }

      @Override
      public eah k() {
         return this.e;
      }

      @Override
      public eai.l.a j() {
         return eai.l.a.d;
      }
   }

   class g implements eai.m, eas.h {
      private final eah e;
      final double[][] f;

      g(final eah $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[eas.this.v + 1][eas.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= eas.this.v; $$2++) {
               int $$3 = eas.this.g + $$2;
               int $$4 = jz.c($$3);

               for (int $$5 = 0; $$5 <= eas.this.v; $$5++) {
                  int $$6 = eas.this.h + $$5;
                  int $$7 = jz.c($$6);
                  this.f[$$2][$$5] = $$0.a(new eah.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(eah.b $$0) {
         int $$1 = jz.a($$0.a());
         int $$2 = jz.a($$0.c());
         int $$3 = $$1 - eas.this.g;
         int $$4 = $$2 - eas.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, eah.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eah k() {
         return this.e;
      }

      @Override
      public eai.l.a j() {
         return eai.l.a.b;
      }
   }

   interface h extends eah {
      eah k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements eai.m, eas.h {
      double[][] e;
      double[][] f;
      private final eah g;
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

      i(final eah $$1) {
         this.g = $$1;
         this.e = this.a(eas.this.c, eas.this.b);
         this.f = this.a(eas.this.c, eas.this.b);
         eas.this.i.add(this);
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
         this.p = azf.d($$0, this.h, this.l);
         this.q = azf.d($$0, this.j, this.n);
         this.r = azf.d($$0, this.i, this.m);
         this.s = azf.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = azf.d($$0, this.p, this.q);
         this.u = azf.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = azf.d($$0, this.t, this.u);
      }

      @Override
      public double a(eah.b $$0) {
         if ($$0 != eas.this) {
            return this.g.a($$0);
         } else if (!eas.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return eas.this.z
               ? azf.a(
                  (double)eas.this.D / (double)eas.this.w,
                  (double)eas.this.E / (double)eas.this.x,
                  (double)eas.this.F / (double)eas.this.w,
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
      public void a(double[] $$0, eah.a $$1) {
         if (eas.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public eah k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public eai.l.a j() {
         return eai.l.a.a;
      }
   }
}
