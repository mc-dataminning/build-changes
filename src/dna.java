import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dna implements dmp.a, dmp.b {
   private final dne a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dna.i> i;
   final List<dna.e> j;
   private final Map<dmp, dmp> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dmi m;
   private final dmp n;
   private final dna.c o;
   private final dny p;
   private final dna.g q;
   private final dna.g r;
   private final dmq.c s;
   private long t = crm.a;
   private dny.a u = new dny.a(1.0, 0.0);
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
   private final dmp.a J = new dmp.a() {
      @Override
      public dmp.b a(int $$0) {
         dna.this.B = ($$0 + dna.this.d) * dna.this.x;
         dna.this.G++;
         dna.this.E = 0;
         dna.this.I = $$0;
         return dna.this;
      }

      @Override
      public void a(double[] $$0, dmp $$1) {
         for (int $$2 = 0; $$2 < dna.this.c + 1; $$2++) {
            dna.this.B = ($$2 + dna.this.d) * dna.this.x;
            dna.this.G++;
            dna.this.E = 0;
            dna.this.I = $$2;
            $$0[$$2] = $$1.a(dna.this);
         }
      }
   };

   public static dna a(djj $$0, dnk $$1, dmq.c $$2, dnb $$3, dmi.a $$4, dny $$5) {
      dne $$6 = $$3.f().a($$0);
      crm $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dna($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dna(int $$0, dnk $$1, int $$2, int $$3, dne $$4, dmq.c $$5, dnb $$6, dmi.a $$7, dny $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = atq.a($$4.d(), this.x);
      this.d = atq.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = ir.a($$2);
      this.h = ir.a($$3);
      this.v = ir.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dna.g(new dna.a(), false);
      this.r = new dna.g(new dna.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = ir.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = ir.c($$13);
            dny.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dnc $$16 = $$1.a();
      dnc $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dmi.a($$7);
      } else {
         int $$18 = iy.a($$2);
         int $$19 = iy.a($$3);
         this.m = dmi.a(this, new crm($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dna.c> $$20 = ImmutableList.builder();
      dmp $$21 = dmq.e(dmq.a($$17.l(), dmq.b.a)).a(this::a);
      $$20.add((dna.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dng.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new dwa($$20.build());
      this.n = $$17.k();
   }

   protected ctm.f a(dnc $$0, List<ctm.d> $$1) {
      return new ctm.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dhn e() {
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
      int $$2 = ir.c(ir.a($$0));
      int $$3 = ir.c(ir.a($$1));
      return this.l.computeIfAbsent(aly.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aly.a($$0);
      int $$2 = aly.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dmp.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dny d() {
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

         for (dna.i $$4 : this.i) {
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

   public dna c(int $$0) {
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
   public void a(double[] $$0, dmp $$1) {
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

      for (dna.e $$2 : this.j) {
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
      this.i.forEach(dna.i::l);
   }

   public dmi i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dny.a c(int $$0, int $$1) {
      long $$2 = crm.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dny.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dmp a(dmp $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dmp b(dmp $$0) {
      if ($$0 instanceof dmq.l $$1) {
         return (dmp)(switch ($$1.j()) {
            case a -> new dna.i($$1.k());
            case b -> new dna.g($$1.k(), true);
            case c -> new dna.d($$1.k());
            case d -> new dna.f($$1.k());
            case e -> new dna.e($$1.k());
         });
      } else {
         if (this.p != dny.a()) {
            if ($$0 == dmq.d.a) {
               return this.q;
            }

            if ($$0 == dmq.f.a) {
               return this.r;
            }
         }

         if ($$0 == dmq.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dmq.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dna.h {
      @Override
      public dmp k() {
         return dmq.d.a;
      }

      @Override
      public dmp a(dmp.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dmp.b $$0) {
         return dna.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dmp.a $$1) {
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
      public atk<? extends dmp> c() {
         return dmq.d.e;
      }
   }

   class b implements dna.h {
      @Override
      public dmp k() {
         return dmq.f.a;
      }

      @Override
      public dmp a(dmp.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dmp.b $$0) {
         return dna.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dmp.a $$1) {
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
      public atk<? extends dmp> c() {
         return dmq.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dhn calculate(dmp.b var1);
   }

   static class d implements dmq.m, dna.h {
      private final dmp a;
      private long e = crm.a;
      private double f;

      d(dmp $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dmp.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = crm.c($$1, $$2);
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
      public void a(double[] $$0, dmp.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dmp k() {
         return this.a;
      }

      @Override
      public dmq.l.a j() {
         return dmq.l.a.c;
      }
   }

   class e implements dmq.m, dna.h {
      final dmp e;
      final double[] f;

      e(dmp $$0) {
         this.e = $$0;
         this.f = new double[dna.this.w * dna.this.w * dna.this.x];
         dna.this.j.add(this);
      }

      @Override
      public double a(dmp.b $$0) {
         if ($$0 != dna.this) {
            return this.e.a($$0);
         } else if (!dna.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dna.this.D;
            int $$2 = dna.this.E;
            int $$3 = dna.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dna.this.w && $$2 < dna.this.x && $$3 < dna.this.w
               ? this.f[((dna.this.x - 1 - $$2) * dna.this.w + $$1) * dna.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dmp.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dmp k() {
         return this.e;
      }

      @Override
      public dmq.l.a j() {
         return dmq.l.a.e;
      }
   }

   class f implements dmq.m, dna.h {
      private final dmp e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dmp $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dmp.b $$0) {
         if ($$0 != dna.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dna.this.H) {
            return this.i[dna.this.I];
         } else if (this.f == dna.this.G) {
            return this.h;
         } else {
            this.f = dna.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dmp.a $$1) {
         if (this.i != null && this.g == dna.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dna.this.H;
         }
      }

      @Override
      public dmp k() {
         return this.e;
      }

      @Override
      public dmq.l.a j() {
         return dmq.l.a.d;
      }
   }

   class g implements dmq.m, dna.h {
      private final dmp e;
      final double[][] f;

      g(dmp $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dna.this.v + 1][dna.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dna.this.v; $$2++) {
               int $$3 = dna.this.g + $$2;
               int $$4 = ir.c($$3);

               for (int $$5 = 0; $$5 <= dna.this.v; $$5++) {
                  int $$6 = dna.this.h + $$5;
                  int $$7 = ir.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dmp.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dmp.b $$0) {
         int $$1 = ir.a($$0.a());
         int $$2 = ir.a($$0.c());
         int $$3 = $$1 - dna.this.g;
         int $$4 = $$2 - dna.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dmp.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dmp k() {
         return this.e;
      }

      @Override
      public dmq.l.a j() {
         return dmq.l.a.b;
      }
   }

   interface h extends dmp {
      dmp k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dmq.m, dna.h {
      double[][] e;
      double[][] f;
      private final dmp g;
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

      i(dmp $$1) {
         this.g = $$1;
         this.e = this.a(dna.this.c, dna.this.b);
         this.f = this.a(dna.this.c, dna.this.b);
         dna.this.i.add(this);
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
         this.p = atq.d($$0, this.h, this.l);
         this.q = atq.d($$0, this.j, this.n);
         this.r = atq.d($$0, this.i, this.m);
         this.s = atq.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = atq.d($$0, this.p, this.q);
         this.u = atq.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = atq.d($$0, this.t, this.u);
      }

      @Override
      public double a(dmp.b $$0) {
         if ($$0 != dna.this) {
            return this.g.a($$0);
         } else if (!dna.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dna.this.z
               ? atq.a(
                  (double)dna.this.D / (double)dna.this.w,
                  (double)dna.this.E / (double)dna.this.x,
                  (double)dna.this.F / (double)dna.this.w,
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
      public void a(double[] $$0, dmp.a $$1) {
         if (dna.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dmp k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dmq.l.a j() {
         return dmq.l.a.a;
      }
   }
}
