import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ebj implements eay.a, eay.b {
   private final ebn a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<ebj.i> i;
   final List<ebj.e> j;
   private final Map<eay, eay> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final ear m;
   private final eay n;
   private final ebj.c o;
   private final ech p;
   private final ebj.g q;
   private final ebj.g r;
   private final eaz.c s;
   private long t = deh.c;
   private ech.a u = new ech.a(1.0, 0.0);
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
   private final eay.a J = new eay.a() {
      @Override
      public eay.b a(int $$0) {
         ebj.this.B = ($$0 + ebj.this.d) * ebj.this.x;
         ebj.this.G++;
         ebj.this.E = 0;
         ebj.this.I = $$0;
         return ebj.this;
      }

      @Override
      public void a(double[] $$0, eay $$1) {
         for (int $$2 = 0; $$2 < ebj.this.c + 1; $$2++) {
            ebj.this.B = ($$2 + ebj.this.d) * ebj.this.x;
            ebj.this.G++;
            ebj.this.E = 0;
            ebj.this.I = $$2;
            $$0[$$2] = $$1.a(ebj.this);
         }
      }
   };

   public static ebj a(dxf $$0, ebt $$1, eaz.c $$2, ebk $$3, ear.a $$4, ech $$5) {
      ebn $$6 = $$3.f().a($$0);
      deh $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new ebj($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public ebj(int $$0, ebt $$1, int $$2, int $$3, ebn $$4, eaz.c $$5, ebk $$6, ear.a $$7, ech $$8) {
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
      this.g = kb.a($$2);
      this.h = kb.a($$3);
      this.v = kb.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new ebj.g(new ebj.a(), false);
      this.r = new ebj.g(new ebj.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = kb.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = kb.c($$13);
            ech.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      ebl $$16 = $$1.a();
      ebl $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = ear.a($$7);
      } else {
         int $$18 = kj.a($$2);
         int $$19 = kj.a($$3);
         this.m = ear.a(this, new deh($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<ebj.c> $$20 = new ArrayList<>();
      eay $$21 = eaz.e(eaz.a($$17.l(), eaz.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(ebp.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new ekl($$20.toArray(new ebj.c[0]));
      this.n = $$17.k();
   }

   protected dgl.f a(ebl $$0, List<dgl.d> $$1) {
      return new dgl.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dvj e() {
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
      return this.l.computeIfAbsent(ara.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = ara.a($$0);
      int $$2 = ara.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new eay.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public ech d() {
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

         for (ebj.i $$4 : this.i) {
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

   public ebj c(int $$0) {
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
   public void a(double[] $$0, eay $$1) {
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
      for (ebj.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (ebj.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (ebj.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (ebj.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (ebj.i $$2 : this.i) {
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
      this.i.forEach(ebj.i::l);
   }

   public ear i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   ech.a c(int $$0, int $$1) {
      long $$2 = deh.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         ech.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected eay a(eay $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private eay b(eay $$0) {
      if ($$0 instanceof eaz.l $$1) {
         return (eay)(switch ($$1.j()) {
            case a -> new ebj.i($$1.k());
            case b -> new ebj.g($$1.k(), true);
            case c -> new ebj.d($$1.k());
            case d -> new ebj.f($$1.k());
            case e -> new ebj.e($$1.k());
         });
      } else {
         if (this.p != ech.a()) {
            if ($$0 == eaz.d.a) {
               return this.q;
            }

            if ($$0 == eaz.f.a) {
               return this.r;
            }
         }

         if ($$0 == eaz.b.a) {
            return this.s;
         } else {
            return $$0 instanceof eaz.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements ebj.h {
      @Override
      public eay k() {
         return eaz.d.a;
      }

      @Override
      public eay a(eay.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(eay.b $$0) {
         return ebj.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, eay.a $$1) {
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
      public azd<? extends eay> c() {
         return eaz.d.e;
      }
   }

   class b implements ebj.h {
      @Override
      public eay k() {
         return eaz.f.a;
      }

      @Override
      public eay a(eay.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(eay.b $$0) {
         return ebj.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, eay.a $$1) {
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
      public azd<? extends eay> c() {
         return eaz.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dvj calculate(eay.b var1);
   }

   static class d implements eaz.m, ebj.h {
      private final eay a;
      private long e = deh.c;
      private double f;

      d(eay $$0) {
         this.a = $$0;
      }

      @Override
      public double a(eay.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = deh.c($$1, $$2);
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
      public void a(double[] $$0, eay.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public eay k() {
         return this.a;
      }

      @Override
      public eaz.l.a j() {
         return eaz.l.a.c;
      }
   }

   class e implements eaz.m, ebj.h {
      final eay e;
      final double[] f;

      e(final eay $$0) {
         this.e = $$0;
         this.f = new double[ebj.this.w * ebj.this.w * ebj.this.x];
         ebj.this.j.add(this);
      }

      @Override
      public double a(eay.b $$0) {
         if ($$0 != ebj.this) {
            return this.e.a($$0);
         } else if (!ebj.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = ebj.this.D;
            int $$2 = ebj.this.E;
            int $$3 = ebj.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < ebj.this.w && $$2 < ebj.this.x && $$3 < ebj.this.w
               ? this.f[((ebj.this.x - 1 - $$2) * ebj.this.w + $$1) * ebj.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, eay.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eay k() {
         return this.e;
      }

      @Override
      public eaz.l.a j() {
         return eaz.l.a.e;
      }
   }

   class f implements eaz.m, ebj.h {
      private final eay e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final eay $$0) {
         this.e = $$0;
      }

      @Override
      public double a(eay.b $$0) {
         if ($$0 != ebj.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == ebj.this.H) {
            return this.i[ebj.this.I];
         } else if (this.f == ebj.this.G) {
            return this.h;
         } else {
            this.f = ebj.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, eay.a $$1) {
         if (this.i != null && this.g == ebj.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = ebj.this.H;
         }
      }

      @Override
      public eay k() {
         return this.e;
      }

      @Override
      public eaz.l.a j() {
         return eaz.l.a.d;
      }
   }

   class g implements eaz.m, ebj.h {
      private final eay e;
      final double[][] f;

      g(final eay $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[ebj.this.v + 1][ebj.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= ebj.this.v; $$2++) {
               int $$3 = ebj.this.g + $$2;
               int $$4 = kb.c($$3);

               for (int $$5 = 0; $$5 <= ebj.this.v; $$5++) {
                  int $$6 = ebj.this.h + $$5;
                  int $$7 = kb.c($$6);
                  this.f[$$2][$$5] = $$0.a(new eay.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(eay.b $$0) {
         int $$1 = kb.a($$0.a());
         int $$2 = kb.a($$0.c());
         int $$3 = $$1 - ebj.this.g;
         int $$4 = $$2 - ebj.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, eay.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eay k() {
         return this.e;
      }

      @Override
      public eaz.l.a j() {
         return eaz.l.a.b;
      }
   }

   interface h extends eay {
      eay k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements eaz.m, ebj.h {
      double[][] e;
      double[][] f;
      private final eay g;
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

      i(final eay $$1) {
         this.g = $$1;
         this.e = this.a(ebj.this.c, ebj.this.b);
         this.f = this.a(ebj.this.c, ebj.this.b);
         ebj.this.i.add(this);
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
      public double a(eay.b $$0) {
         if ($$0 != ebj.this) {
            return this.g.a($$0);
         } else if (!ebj.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return ebj.this.z
               ? azk.a(
                  (double)ebj.this.D / (double)ebj.this.w,
                  (double)ebj.this.E / (double)ebj.this.x,
                  (double)ebj.this.F / (double)ebj.this.w,
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
      public void a(double[] $$0, eay.a $$1) {
         if (ebj.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public eay k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public eaz.l.a j() {
         return eaz.l.a.a;
      }
   }
}
