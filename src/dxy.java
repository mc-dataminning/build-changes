import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dxy implements dxn.a, dxn.b {
   private final dyc a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dxy.i> i;
   final List<dxy.e> j;
   private final Map<dxn, dxn> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dxg m;
   private final dxn n;
   private final dxy.c o;
   private final dyw p;
   private final dxy.g q;
   private final dxy.g r;
   private final dxo.c s;
   private long t = dbf.a;
   private dyw.a u = new dyw.a(1.0, 0.0);
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
   private final dxn.a J = new dxn.a() {
      @Override
      public dxn.b a(int $$0) {
         dxy.this.B = ($$0 + dxy.this.d) * dxy.this.x;
         dxy.this.G++;
         dxy.this.E = 0;
         dxy.this.I = $$0;
         return dxy.this;
      }

      @Override
      public void a(double[] $$0, dxn $$1) {
         for (int $$2 = 0; $$2 < dxy.this.c + 1; $$2++) {
            dxy.this.B = ($$2 + dxy.this.d) * dxy.this.x;
            dxy.this.G++;
            dxy.this.E = 0;
            dxy.this.I = $$2;
            $$0[$$2] = $$1.a(dxy.this);
         }
      }
   };

   public static dxy a(dty $$0, dyi $$1, dxo.c $$2, dxz $$3, dxg.a $$4, dyw $$5) {
      dyc $$6 = $$3.f().a($$0);
      dbf $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dxy($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dxy(int $$0, dyi $$1, int $$2, int $$3, dyc $$4, dxo.c $$5, dxz $$6, dxg.a $$7, dyw $$8) {
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
      this.g = jt.a($$2);
      this.h = jt.a($$3);
      this.v = jt.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dxy.g(new dxy.a(), false);
      this.r = new dxy.g(new dxy.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = jt.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = jt.c($$13);
            dyw.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dya $$16 = $$1.a();
      dya $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dxg.a($$7);
      } else {
         int $$18 = kb.a($$2);
         int $$19 = kb.a($$3);
         this.m = dxg.a(this, new dbf($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dxy.c> $$20 = ImmutableList.builder();
      dxn $$21 = dxo.e(dxo.a($$17.l(), dxo.b.a)).a(this::a);
      $$20.add((dxy.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dye.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new egy($$20.build());
      this.n = $$17.k();
   }

   protected ddg.f a(dya $$0, List<ddg.d> $$1) {
      return new ddg.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dsc e() {
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
      return this.l.computeIfAbsent(aqv.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aqv.a($$0);
      int $$2 = aqv.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dxn.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dyw d() {
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

         for (dxy.i $$4 : this.i) {
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

   public dxy c(int $$0) {
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
   public void a(double[] $$0, dxn $$1) {
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

      for (dxy.e $$2 : this.j) {
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
      this.i.forEach(dxy.i::l);
   }

   public dxg i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dyw.a c(int $$0, int $$1) {
      long $$2 = dbf.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dyw.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dxn a(dxn $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dxn b(dxn $$0) {
      if ($$0 instanceof dxo.l $$1) {
         return (dxn)(switch ($$1.j()) {
            case a -> new dxy.i($$1.k());
            case b -> new dxy.g($$1.k(), true);
            case c -> new dxy.d($$1.k());
            case d -> new dxy.f($$1.k());
            case e -> new dxy.e($$1.k());
         });
      } else {
         if (this.p != dyw.a()) {
            if ($$0 == dxo.d.a) {
               return this.q;
            }

            if ($$0 == dxo.f.a) {
               return this.r;
            }
         }

         if ($$0 == dxo.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dxo.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dxy.h {
      @Override
      public dxn k() {
         return dxo.d.a;
      }

      @Override
      public dxn a(dxn.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dxn.b $$0) {
         return dxy.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dxn.a $$1) {
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
      public ays<? extends dxn> c() {
         return dxo.d.e;
      }
   }

   class b implements dxy.h {
      @Override
      public dxn k() {
         return dxo.f.a;
      }

      @Override
      public dxn a(dxn.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dxn.b $$0) {
         return dxy.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dxn.a $$1) {
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
      public ays<? extends dxn> c() {
         return dxo.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dsc calculate(dxn.b var1);
   }

   static class d implements dxo.m, dxy.h {
      private final dxn a;
      private long e = dbf.a;
      private double f;

      d(dxn $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dxn.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dbf.c($$1, $$2);
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
      public void a(double[] $$0, dxn.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dxn k() {
         return this.a;
      }

      @Override
      public dxo.l.a j() {
         return dxo.l.a.c;
      }
   }

   class e implements dxo.m, dxy.h {
      final dxn e;
      final double[] f;

      e(final dxn $$0) {
         this.e = $$0;
         this.f = new double[dxy.this.w * dxy.this.w * dxy.this.x];
         dxy.this.j.add(this);
      }

      @Override
      public double a(dxn.b $$0) {
         if ($$0 != dxy.this) {
            return this.e.a($$0);
         } else if (!dxy.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dxy.this.D;
            int $$2 = dxy.this.E;
            int $$3 = dxy.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dxy.this.w && $$2 < dxy.this.x && $$3 < dxy.this.w
               ? this.f[((dxy.this.x - 1 - $$2) * dxy.this.w + $$1) * dxy.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dxn.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxn k() {
         return this.e;
      }

      @Override
      public dxo.l.a j() {
         return dxo.l.a.e;
      }
   }

   class f implements dxo.m, dxy.h {
      private final dxn e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final dxn $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dxn.b $$0) {
         if ($$0 != dxy.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dxy.this.H) {
            return this.i[dxy.this.I];
         } else if (this.f == dxy.this.G) {
            return this.h;
         } else {
            this.f = dxy.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dxn.a $$1) {
         if (this.i != null && this.g == dxy.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dxy.this.H;
         }
      }

      @Override
      public dxn k() {
         return this.e;
      }

      @Override
      public dxo.l.a j() {
         return dxo.l.a.d;
      }
   }

   class g implements dxo.m, dxy.h {
      private final dxn e;
      final double[][] f;

      g(final dxn $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[dxy.this.v + 1][dxy.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dxy.this.v; $$2++) {
               int $$3 = dxy.this.g + $$2;
               int $$4 = jt.c($$3);

               for (int $$5 = 0; $$5 <= dxy.this.v; $$5++) {
                  int $$6 = dxy.this.h + $$5;
                  int $$7 = jt.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dxn.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dxn.b $$0) {
         int $$1 = jt.a($$0.a());
         int $$2 = jt.a($$0.c());
         int $$3 = $$1 - dxy.this.g;
         int $$4 = $$2 - dxy.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dxn.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dxn k() {
         return this.e;
      }

      @Override
      public dxo.l.a j() {
         return dxo.l.a.b;
      }
   }

   interface h extends dxn {
      dxn k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dxo.m, dxy.h {
      double[][] e;
      double[][] f;
      private final dxn g;
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

      i(final dxn $$1) {
         this.g = $$1;
         this.e = this.a(dxy.this.c, dxy.this.b);
         this.f = this.a(dxy.this.c, dxy.this.b);
         dxy.this.i.add(this);
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
      public double a(dxn.b $$0) {
         if ($$0 != dxy.this) {
            return this.g.a($$0);
         } else if (!dxy.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dxy.this.z
               ? ayz.a(
                  (double)dxy.this.D / (double)dxy.this.w,
                  (double)dxy.this.E / (double)dxy.this.x,
                  (double)dxy.this.F / (double)dxy.this.w,
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
      public void a(double[] $$0, dxn.a $$1) {
         if (dxy.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dxn k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dxo.l.a j() {
         return dxo.l.a.a;
      }
   }
}
