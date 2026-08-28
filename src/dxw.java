import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dxw implements dxl.a, dxl.b {
   private final dya a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dxw.i> i;
   final List<dxw.e> j;
   private final Map<dxl, dxl> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dxe m;
   private final dxl n;
   private final dxw.c o;
   private final dyu p;
   private final dxw.g q;
   private final dxw.g r;
   private final dxm.c s;
   private long t = dbd.a;
   private dyu.a u = new dyu.a(1.0, 0.0);
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
   private final dxl.a J = new dxl.a() {
      @Override
      public dxl.b a(int $$0) {
         dxw.this.B = ($$0 + dxw.this.d) * dxw.this.x;
         dxw.this.G++;
         dxw.this.E = 0;
         dxw.this.I = $$0;
         return dxw.this;
      }

      @Override
      public void a(double[] $$0, dxl $$1) {
         for (int $$2 = 0; $$2 < dxw.this.c + 1; $$2++) {
            dxw.this.B = ($$2 + dxw.this.d) * dxw.this.x;
            dxw.this.G++;
            dxw.this.E = 0;
            dxw.this.I = $$2;
            $$0[$$2] = $$1.a(dxw.this);
         }
      }
   };

   public static dxw a(dtw $$0, dyg $$1, dxm.c $$2, dxx $$3, dxe.a $$4, dyu $$5) {
      dya $$6 = $$3.f().a($$0);
      dbd $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dxw($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dxw(int $$0, dyg $$1, int $$2, int $$3, dya $$4, dxm.c $$5, dxx $$6, dxe.a $$7, dyu $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = ayx.a($$4.d(), this.x);
      this.d = ayx.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = jt.a($$2);
      this.h = jt.a($$3);
      this.v = jt.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dxw.g(new dxw.a(), false);
      this.r = new dxw.g(new dxw.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = jt.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = jt.c($$13);
            dyu.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dxy $$16 = $$1.a();
      dxy $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dxe.a($$7);
      } else {
         int $$18 = kb.a($$2);
         int $$19 = kb.a($$3);
         this.m = dxe.a(this, new dbd($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dxw.c> $$20 = ImmutableList.builder();
      dxl $$21 = dxm.e(dxm.a($$17.l(), dxm.b.a)).a(this::a);
      $$20.add((dxw.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dyc.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new egw($$20.build());
      this.n = $$17.k();
   }

   protected dde.f a(dxy $$0, List<dde.d> $$1) {
      return new dde.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dsa e() {
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
      int $$2 = jt.c(jt.a($$0));
      int $$3 = jt.c(jt.a($$1));
      return this.l.computeIfAbsent(aqu.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aqu.a($$0);
      int $$2 = aqu.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dxl.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dyu d() {
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

         for (dxw.i $$4 : this.i) {
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

   public dxw c(int $$0) {
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
   public void a(double[] $$0, dxl $$1) {
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

      for (dxw.e $$2 : this.j) {
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
      this.i.forEach(dxw.i::l);
   }

   public dxe i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dyu.a c(int $$0, int $$1) {
      long $$2 = dbd.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dyu.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dxl a(dxl $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dxl b(dxl $$0) {
      if ($$0 instanceof dxm.l $$1) {
         return (dxl)(switch ($$1.j()) {
            case a -> new dxw.i($$1.k());
            case b -> new dxw.g($$1.k(), true);
            case c -> new dxw.d($$1.k());
            case d -> new dxw.f($$1.k());
            case e -> new dxw.e($$1.k());
         });
      } else {
         if (this.p != dyu.a()) {
            if ($$0 == dxm.d.a) {
               return this.q;
            }

            if ($$0 == dxm.f.a) {
               return this.r;
            }
         }

         if ($$0 == dxm.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dxm.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dxw.h {
      @Override
      public dxl k() {
         return dxm.d.a;
      }

      @Override
      public dxl a(dxl.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dxl.b $$0) {
         return dxw.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dxl.a $$1) {
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
      public ayq<? extends dxl> c() {
         return dxm.d.e;
      }
   }

   class b implements dxw.h {
      @Override
      public dxl k() {
         return dxm.f.a;
      }

      @Override
      public dxl a(dxl.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dxl.b $$0) {
         return dxw.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dxl.a $$1) {
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
      public ayq<? extends dxl> c() {
         return dxm.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dsa calculate(dxl.b var1);
   }

   static class d implements dxm.m, dxw.h {
      private final dxl a;
      private long e = dbd.a;
      private double f;

      d(dxl $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dxl.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dbd.c($$1, $$2);
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
      public void a(double[] $$0, dxl.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dxl k() {
         return this.a;
      }

      @Override
      public dxm.l.a j() {
         return dxm.l.a.c;
      }
   }

   class e implements dxm.m, dxw.h {
      final dxl e;
      final double[] f;

      e(final dxl $$0) {
         this.e = $$0;
         this.f = new double[dxw.this.w * dxw.this.w * dxw.this.x];
         dxw.this.j.add(this);
      }

      @Override
      public double a(dxl.b $$0) {
         if ($$0 != dxw.this) {
            return this.e.a($$0);
         } else if (!dxw.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dxw.this.D;
            int $$2 = dxw.this.E;
            int $$3 = dxw.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dxw.this.w && $$2 < dxw.this.x && $$3 < dxw.this.w
               ? this.f[((dxw.this.x - 1 - $$2) * dxw.this.w + $$1) * dxw.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dxl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxl k() {
         return this.e;
      }

      @Override
      public dxm.l.a j() {
         return dxm.l.a.e;
      }
   }

   class f implements dxm.m, dxw.h {
      private final dxl e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final dxl $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dxl.b $$0) {
         if ($$0 != dxw.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dxw.this.H) {
            return this.i[dxw.this.I];
         } else if (this.f == dxw.this.G) {
            return this.h;
         } else {
            this.f = dxw.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dxl.a $$1) {
         if (this.i != null && this.g == dxw.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dxw.this.H;
         }
      }

      @Override
      public dxl k() {
         return this.e;
      }

      @Override
      public dxm.l.a j() {
         return dxm.l.a.d;
      }
   }

   class g implements dxm.m, dxw.h {
      private final dxl e;
      final double[][] f;

      g(final dxl $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[dxw.this.v + 1][dxw.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dxw.this.v; $$2++) {
               int $$3 = dxw.this.g + $$2;
               int $$4 = jt.c($$3);

               for (int $$5 = 0; $$5 <= dxw.this.v; $$5++) {
                  int $$6 = dxw.this.h + $$5;
                  int $$7 = jt.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dxl.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dxl.b $$0) {
         int $$1 = jt.a($$0.a());
         int $$2 = jt.a($$0.c());
         int $$3 = $$1 - dxw.this.g;
         int $$4 = $$2 - dxw.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dxl.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxl k() {
         return this.e;
      }

      @Override
      public dxm.l.a j() {
         return dxm.l.a.b;
      }
   }

   interface h extends dxl {
      dxl k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dxm.m, dxw.h {
      double[][] e;
      double[][] f;
      private final dxl g;
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

      i(final dxl $$1) {
         this.g = $$1;
         this.e = this.a(dxw.this.c, dxw.this.b);
         this.f = this.a(dxw.this.c, dxw.this.b);
         dxw.this.i.add(this);
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
         this.p = ayx.d($$0, this.h, this.l);
         this.q = ayx.d($$0, this.j, this.n);
         this.r = ayx.d($$0, this.i, this.m);
         this.s = ayx.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = ayx.d($$0, this.p, this.q);
         this.u = ayx.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = ayx.d($$0, this.t, this.u);
      }

      @Override
      public double a(dxl.b $$0) {
         if ($$0 != dxw.this) {
            return this.g.a($$0);
         } else if (!dxw.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dxw.this.z
               ? ayx.a(
                  (double)dxw.this.D / (double)dxw.this.w,
                  (double)dxw.this.E / (double)dxw.this.x,
                  (double)dxw.this.F / (double)dxw.this.w,
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
      public void a(double[] $$0, dxl.a $$1) {
         if (dxw.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dxl k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dxm.l.a j() {
         return dxm.l.a.a;
      }
   }
}
