import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class eds implements edh.a, edh.b {
   private final edw a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<eds.i> i;
   final List<eds.e> j;
   private final Map<edh, edh> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final eda m;
   private final edh n;
   private final eds.c o;
   private final eeq p;
   private final eds.g q;
   private final eds.g r;
   private final edi.c s;
   private long t = dgg.c;
   private eeq.a u = new eeq.a(1.0, 0.0);
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
   private final edh.a J = new edh.a() {
      @Override
      public edh.b a(int $$0) {
         eds.this.B = ($$0 + eds.this.d) * eds.this.x;
         eds.this.G++;
         eds.this.E = 0;
         eds.this.I = $$0;
         return eds.this;
      }

      @Override
      public void a(double[] $$0, edh $$1) {
         for (int $$2 = 0; $$2 < eds.this.c + 1; $$2++) {
            eds.this.B = ($$2 + eds.this.d) * eds.this.x;
            eds.this.G++;
            eds.this.E = 0;
            eds.this.I = $$2;
            $$0[$$2] = $$1.a(eds.this);
         }
      }
   };

   public static eds a(dzm $$0, eec $$1, edi.c $$2, edt $$3, eda.a $$4, eeq $$5) {
      edw $$6 = $$3.f().a($$0);
      dgg $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new eds($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public eds(int $$0, eec $$1, int $$2, int $$3, edw $$4, edi.c $$5, edt $$6, eda.a $$7, eeq $$8) {
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
      this.q = new eds.g(new eds.a(), false);
      this.r = new eds.g(new eds.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = kc.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = kc.c($$13);
            eeq.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      edu $$16 = $$1.a();
      edu $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = eda.a($$7);
      } else {
         int $$18 = kk.a($$2);
         int $$19 = kk.a($$3);
         this.m = eda.a(this, new dgg($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<eds.c> $$20 = new ArrayList<>();
      edh $$21 = edi.e(edi.a($$17.l(), edi.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(edy.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new emx($$20.toArray(new eds.c[0]));
      this.n = $$17.k();
   }

   protected dil.f a(edu $$0, List<dil.d> $$1) {
      return new dil.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dxq e() {
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
      return this.l.computeIfAbsent(aqo.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aqo.a($$0);
      int $$2 = aqo.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new edh.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public eeq d() {
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

         for (eds.i $$4 : this.i) {
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

   public eds c(int $$0) {
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
   public void a(double[] $$0, edh $$1) {
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
      for (eds.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (eds.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (eds.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (eds.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (eds.i $$2 : this.i) {
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
      this.i.forEach(eds.i::l);
   }

   public eda i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   eeq.a c(int $$0, int $$1) {
      long $$2 = dgg.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         eeq.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected edh a(edh $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private edh b(edh $$0) {
      if ($$0 instanceof edi.l $$1) {
         return (edh)(switch ($$1.j()) {
            case a -> new eds.i($$1.k());
            case b -> new eds.g($$1.k(), true);
            case c -> new eds.d($$1.k());
            case d -> new eds.f($$1.k());
            case e -> new eds.e($$1.k());
         });
      } else {
         if (this.p != eeq.a()) {
            if ($$0 == edi.d.a) {
               return this.q;
            }

            if ($$0 == edi.f.a) {
               return this.r;
            }
         }

         if ($$0 == edi.b.a) {
            return this.s;
         } else {
            return $$0 instanceof edi.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements eds.h {
      @Override
      public edh k() {
         return edi.d.a;
      }

      @Override
      public edh a(edh.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(edh.b $$0) {
         return eds.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, edh.a $$1) {
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
      public ays<? extends edh> c() {
         return edi.d.e;
      }
   }

   class b implements eds.h {
      @Override
      public edh k() {
         return edi.f.a;
      }

      @Override
      public edh a(edh.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(edh.b $$0) {
         return eds.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, edh.a $$1) {
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
      public ays<? extends edh> c() {
         return edi.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dxq calculate(edh.b var1);
   }

   static class d implements edi.m, eds.h {
      private final edh a;
      private long e = dgg.c;
      private double f;

      d(edh $$0) {
         this.a = $$0;
      }

      @Override
      public double a(edh.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dgg.c($$1, $$2);
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
      public void a(double[] $$0, edh.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public edh k() {
         return this.a;
      }

      @Override
      public edi.l.a j() {
         return edi.l.a.c;
      }
   }

   class e implements edi.m, eds.h {
      final edh e;
      final double[] f;

      e(final edh $$0) {
         this.e = $$0;
         this.f = new double[eds.this.w * eds.this.w * eds.this.x];
         eds.this.j.add(this);
      }

      @Override
      public double a(edh.b $$0) {
         if ($$0 != eds.this) {
            return this.e.a($$0);
         } else if (!eds.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = eds.this.D;
            int $$2 = eds.this.E;
            int $$3 = eds.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < eds.this.w && $$2 < eds.this.x && $$3 < eds.this.w
               ? this.f[((eds.this.x - 1 - $$2) * eds.this.w + $$1) * eds.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, edh.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edh k() {
         return this.e;
      }

      @Override
      public edi.l.a j() {
         return edi.l.a.e;
      }
   }

   class f implements edi.m, eds.h {
      private final edh e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final edh $$0) {
         this.e = $$0;
      }

      @Override
      public double a(edh.b $$0) {
         if ($$0 != eds.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == eds.this.H) {
            return this.i[eds.this.I];
         } else if (this.f == eds.this.G) {
            return this.h;
         } else {
            this.f = eds.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, edh.a $$1) {
         if (this.i != null && this.g == eds.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = eds.this.H;
         }
      }

      @Override
      public edh k() {
         return this.e;
      }

      @Override
      public edi.l.a j() {
         return edi.l.a.d;
      }
   }

   class g implements edi.m, eds.h {
      private final edh e;
      final double[][] f;

      g(final edh $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[eds.this.v + 1][eds.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= eds.this.v; $$2++) {
               int $$3 = eds.this.g + $$2;
               int $$4 = kc.c($$3);

               for (int $$5 = 0; $$5 <= eds.this.v; $$5++) {
                  int $$6 = eds.this.h + $$5;
                  int $$7 = kc.c($$6);
                  this.f[$$2][$$5] = $$0.a(new edh.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(edh.b $$0) {
         int $$1 = kc.a($$0.a());
         int $$2 = kc.a($$0.c());
         int $$3 = $$1 - eds.this.g;
         int $$4 = $$2 - eds.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, edh.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edh k() {
         return this.e;
      }

      @Override
      public edi.l.a j() {
         return edi.l.a.b;
      }
   }

   interface h extends edh {
      edh k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements edi.m, eds.h {
      double[][] e;
      double[][] f;
      private final edh g;
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

      i(final edh $$1) {
         this.g = $$1;
         this.e = this.a(eds.this.c, eds.this.b);
         this.f = this.a(eds.this.c, eds.this.b);
         eds.this.i.add(this);
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
      public double a(edh.b $$0) {
         if ($$0 != eds.this) {
            return this.g.a($$0);
         } else if (!eds.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return eds.this.z
               ? ayz.a(
                  (double)eds.this.D / (double)eds.this.w,
                  (double)eds.this.E / (double)eds.this.x,
                  (double)eds.this.F / (double)eds.this.w,
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
      public void a(double[] $$0, edh.a $$1) {
         if (eds.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public edh k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public edi.l.a j() {
         return edi.l.a.a;
      }
   }
}
