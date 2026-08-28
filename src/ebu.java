import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ebu implements ebj.a, ebj.b {
   private final eby a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<ebu.i> i;
   final List<ebu.e> j;
   private final Map<ebj, ebj> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final ebc m;
   private final ebj n;
   private final ebu.c o;
   private final ecs p;
   private final ebu.g q;
   private final ebu.g r;
   private final ebk.c s;
   private long t = des.c;
   private ecs.a u = new ecs.a(1.0, 0.0);
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
   private final ebj.a J = new ebj.a() {
      @Override
      public ebj.b a(int $$0) {
         ebu.this.B = ($$0 + ebu.this.d) * ebu.this.x;
         ebu.this.G++;
         ebu.this.E = 0;
         ebu.this.I = $$0;
         return ebu.this;
      }

      @Override
      public void a(double[] $$0, ebj $$1) {
         for (int $$2 = 0; $$2 < ebu.this.c + 1; $$2++) {
            ebu.this.B = ($$2 + ebu.this.d) * ebu.this.x;
            ebu.this.G++;
            ebu.this.E = 0;
            ebu.this.I = $$2;
            $$0[$$2] = $$1.a(ebu.this);
         }
      }
   };

   public static ebu a(dxq $$0, ece $$1, ebk.c $$2, ebv $$3, ebc.a $$4, ecs $$5) {
      eby $$6 = $$3.f().a($$0);
      des $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new ebu($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public ebu(int $$0, ece $$1, int $$2, int $$3, eby $$4, ebk.c $$5, ebv $$6, ebc.a $$7, ecs $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = azm.a($$4.d(), this.x);
      this.d = azm.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = kb.a($$2);
      this.h = kb.a($$3);
      this.v = kb.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new ebu.g(new ebu.a(), false);
      this.r = new ebu.g(new ebu.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = kb.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = kb.c($$13);
            ecs.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      ebw $$16 = $$1.a();
      ebw $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = ebc.a($$7);
      } else {
         int $$18 = kj.a($$2);
         int $$19 = kj.a($$3);
         this.m = ebc.a(this, new des($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<ebu.c> $$20 = new ArrayList<>();
      ebj $$21 = ebk.e(ebk.a($$17.l(), ebk.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(eca.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new ekw($$20.toArray(new ebu.c[0]));
      this.n = $$17.k();
   }

   protected dgx.f a(ebw $$0, List<dgx.d> $$1) {
      return new dgx.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dvv e() {
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
      return this.l.computeIfAbsent(arb.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = arb.a($$0);
      int $$2 = arb.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new ebj.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public ecs d() {
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

         for (ebu.i $$4 : this.i) {
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

   public ebu c(int $$0) {
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
   public void a(double[] $$0, ebj $$1) {
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
      for (ebu.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (ebu.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (ebu.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (ebu.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (ebu.i $$2 : this.i) {
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
      this.i.forEach(ebu.i::l);
   }

   public ebc i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   ecs.a c(int $$0, int $$1) {
      long $$2 = des.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         ecs.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected ebj a(ebj $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private ebj b(ebj $$0) {
      if ($$0 instanceof ebk.l $$1) {
         return (ebj)(switch ($$1.j()) {
            case a -> new ebu.i($$1.k());
            case b -> new ebu.g($$1.k(), true);
            case c -> new ebu.d($$1.k());
            case d -> new ebu.f($$1.k());
            case e -> new ebu.e($$1.k());
         });
      } else {
         if (this.p != ecs.a()) {
            if ($$0 == ebk.d.a) {
               return this.q;
            }

            if ($$0 == ebk.f.a) {
               return this.r;
            }
         }

         if ($$0 == ebk.b.a) {
            return this.s;
         } else {
            return $$0 instanceof ebk.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements ebu.h {
      @Override
      public ebj k() {
         return ebk.d.a;
      }

      @Override
      public ebj a(ebj.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(ebj.b $$0) {
         return ebu.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, ebj.a $$1) {
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
      public azf<? extends ebj> c() {
         return ebk.d.e;
      }
   }

   class b implements ebu.h {
      @Override
      public ebj k() {
         return ebk.f.a;
      }

      @Override
      public ebj a(ebj.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(ebj.b $$0) {
         return ebu.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, ebj.a $$1) {
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
      public azf<? extends ebj> c() {
         return ebk.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dvv calculate(ebj.b var1);
   }

   static class d implements ebk.m, ebu.h {
      private final ebj a;
      private long e = des.c;
      private double f;

      d(ebj $$0) {
         this.a = $$0;
      }

      @Override
      public double a(ebj.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = des.c($$1, $$2);
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
      public void a(double[] $$0, ebj.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public ebj k() {
         return this.a;
      }

      @Override
      public ebk.l.a j() {
         return ebk.l.a.c;
      }
   }

   class e implements ebk.m, ebu.h {
      final ebj e;
      final double[] f;

      e(final ebj $$0) {
         this.e = $$0;
         this.f = new double[ebu.this.w * ebu.this.w * ebu.this.x];
         ebu.this.j.add(this);
      }

      @Override
      public double a(ebj.b $$0) {
         if ($$0 != ebu.this) {
            return this.e.a($$0);
         } else if (!ebu.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = ebu.this.D;
            int $$2 = ebu.this.E;
            int $$3 = ebu.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < ebu.this.w && $$2 < ebu.this.x && $$3 < ebu.this.w
               ? this.f[((ebu.this.x - 1 - $$2) * ebu.this.w + $$1) * ebu.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, ebj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ebj k() {
         return this.e;
      }

      @Override
      public ebk.l.a j() {
         return ebk.l.a.e;
      }
   }

   class f implements ebk.m, ebu.h {
      private final ebj e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final ebj $$0) {
         this.e = $$0;
      }

      @Override
      public double a(ebj.b $$0) {
         if ($$0 != ebu.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == ebu.this.H) {
            return this.i[ebu.this.I];
         } else if (this.f == ebu.this.G) {
            return this.h;
         } else {
            this.f = ebu.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, ebj.a $$1) {
         if (this.i != null && this.g == ebu.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = ebu.this.H;
         }
      }

      @Override
      public ebj k() {
         return this.e;
      }

      @Override
      public ebk.l.a j() {
         return ebk.l.a.d;
      }
   }

   class g implements ebk.m, ebu.h {
      private final ebj e;
      final double[][] f;

      g(final ebj $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[ebu.this.v + 1][ebu.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= ebu.this.v; $$2++) {
               int $$3 = ebu.this.g + $$2;
               int $$4 = kb.c($$3);

               for (int $$5 = 0; $$5 <= ebu.this.v; $$5++) {
                  int $$6 = ebu.this.h + $$5;
                  int $$7 = kb.c($$6);
                  this.f[$$2][$$5] = $$0.a(new ebj.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(ebj.b $$0) {
         int $$1 = kb.a($$0.a());
         int $$2 = kb.a($$0.c());
         int $$3 = $$1 - ebu.this.g;
         int $$4 = $$2 - ebu.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, ebj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ebj k() {
         return this.e;
      }

      @Override
      public ebk.l.a j() {
         return ebk.l.a.b;
      }
   }

   interface h extends ebj {
      ebj k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements ebk.m, ebu.h {
      double[][] e;
      double[][] f;
      private final ebj g;
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

      i(final ebj $$1) {
         this.g = $$1;
         this.e = this.a(ebu.this.c, ebu.this.b);
         this.f = this.a(ebu.this.c, ebu.this.b);
         ebu.this.i.add(this);
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
         this.p = azm.d($$0, this.h, this.l);
         this.q = azm.d($$0, this.j, this.n);
         this.r = azm.d($$0, this.i, this.m);
         this.s = azm.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = azm.d($$0, this.p, this.q);
         this.u = azm.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = azm.d($$0, this.t, this.u);
      }

      @Override
      public double a(ebj.b $$0) {
         if ($$0 != ebu.this) {
            return this.g.a($$0);
         } else if (!ebu.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return ebu.this.z
               ? azm.a(
                  (double)ebu.this.D / (double)ebu.this.w,
                  (double)ebu.this.E / (double)ebu.this.x,
                  (double)ebu.this.F / (double)ebu.this.w,
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
      public void a(double[] $$0, ebj.a $$1) {
         if (ebu.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public ebj k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public ebk.l.a j() {
         return ebk.l.a.a;
      }
   }
}
