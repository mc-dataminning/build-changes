import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dmv implements dmk.a, dmk.b {
   private final dmz a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dmv.i> i;
   final List<dmv.e> j;
   private final Map<dmk, dmk> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dmd m;
   private final dmk n;
   private final dmv.c o;
   private final dnt p;
   private final dmv.g q;
   private final dmv.g r;
   private final dml.c s;
   private long t = crh.a;
   private dnt.a u = new dnt.a(1.0, 0.0);
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
   private final dmk.a J = new dmk.a() {
      @Override
      public dmk.b a(int $$0) {
         dmv.this.B = ($$0 + dmv.this.d) * dmv.this.x;
         dmv.this.G++;
         dmv.this.E = 0;
         dmv.this.I = $$0;
         return dmv.this;
      }

      @Override
      public void a(double[] $$0, dmk $$1) {
         for (int $$2 = 0; $$2 < dmv.this.c + 1; $$2++) {
            dmv.this.B = ($$2 + dmv.this.d) * dmv.this.x;
            dmv.this.G++;
            dmv.this.E = 0;
            dmv.this.I = $$2;
            $$0[$$2] = $$1.a(dmv.this);
         }
      }
   };

   public static dmv a(dje $$0, dnf $$1, dml.c $$2, dmw $$3, dmd.a $$4, dnt $$5) {
      dmz $$6 = $$3.f().a($$0);
      crh $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dmv($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dmv(int $$0, dnf $$1, int $$2, int $$3, dmz $$4, dml.c $$5, dmw $$6, dmd.a $$7, dnt $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = atm.a($$4.d(), this.x);
      this.d = atm.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = in.a($$2);
      this.h = in.a($$3);
      this.v = in.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dmv.g(new dmv.a(), false);
      this.r = new dmv.g(new dmv.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = in.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = in.c($$13);
            dnt.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dmx $$16 = $$1.a();
      dmx $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dmd.a($$7);
      } else {
         int $$18 = iu.a($$2);
         int $$19 = iu.a($$3);
         this.m = dmd.a(this, new crh($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dmv.c> $$20 = ImmutableList.builder();
      dmk $$21 = dml.e(dml.a($$17.l(), dml.b.a)).a(this::a);
      $$20.add((dmv.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dnb.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new dvv($$20.build());
      this.n = $$17.k();
   }

   protected cth.f a(dmx $$0, List<cth.d> $$1) {
      return new cth.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dhi e() {
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
      int $$2 = in.c(in.a($$0));
      int $$3 = in.c(in.a($$1));
      return this.l.computeIfAbsent(alu.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = alu.a($$0);
      int $$2 = alu.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dmk.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dnt d() {
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

         for (dmv.i $$4 : this.i) {
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

   public dmv c(int $$0) {
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
   public void a(double[] $$0, dmk $$1) {
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

      for (dmv.e $$2 : this.j) {
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
      this.i.forEach(dmv.i::l);
   }

   public dmd i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dnt.a c(int $$0, int $$1) {
      long $$2 = crh.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dnt.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dmk a(dmk $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dmk b(dmk $$0) {
      if ($$0 instanceof dml.l $$1) {
         return (dmk)(switch ($$1.j()) {
            case a -> new dmv.i($$1.k());
            case b -> new dmv.g($$1.k(), true);
            case c -> new dmv.d($$1.k());
            case d -> new dmv.f($$1.k());
            case e -> new dmv.e($$1.k());
         });
      } else {
         if (this.p != dnt.a()) {
            if ($$0 == dml.d.a) {
               return this.q;
            }

            if ($$0 == dml.f.a) {
               return this.r;
            }
         }

         if ($$0 == dml.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dml.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dmv.h {
      @Override
      public dmk k() {
         return dml.d.a;
      }

      @Override
      public dmk a(dmk.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dmk.b $$0) {
         return dmv.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dmk.a $$1) {
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
      public atg<? extends dmk> c() {
         return dml.d.e;
      }
   }

   class b implements dmv.h {
      @Override
      public dmk k() {
         return dml.f.a;
      }

      @Override
      public dmk a(dmk.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dmk.b $$0) {
         return dmv.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dmk.a $$1) {
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
      public atg<? extends dmk> c() {
         return dml.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dhi calculate(dmk.b var1);
   }

   static class d implements dml.m, dmv.h {
      private final dmk a;
      private long e = crh.a;
      private double f;

      d(dmk $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dmk.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = crh.c($$1, $$2);
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
      public void a(double[] $$0, dmk.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dmk k() {
         return this.a;
      }

      @Override
      public dml.l.a j() {
         return dml.l.a.c;
      }
   }

   class e implements dml.m, dmv.h {
      final dmk e;
      final double[] f;

      e(dmk $$0) {
         this.e = $$0;
         this.f = new double[dmv.this.w * dmv.this.w * dmv.this.x];
         dmv.this.j.add(this);
      }

      @Override
      public double a(dmk.b $$0) {
         if ($$0 != dmv.this) {
            return this.e.a($$0);
         } else if (!dmv.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dmv.this.D;
            int $$2 = dmv.this.E;
            int $$3 = dmv.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dmv.this.w && $$2 < dmv.this.x && $$3 < dmv.this.w
               ? this.f[((dmv.this.x - 1 - $$2) * dmv.this.w + $$1) * dmv.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dmk.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dmk k() {
         return this.e;
      }

      @Override
      public dml.l.a j() {
         return dml.l.a.e;
      }
   }

   class f implements dml.m, dmv.h {
      private final dmk e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dmk $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dmk.b $$0) {
         if ($$0 != dmv.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dmv.this.H) {
            return this.i[dmv.this.I];
         } else if (this.f == dmv.this.G) {
            return this.h;
         } else {
            this.f = dmv.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dmk.a $$1) {
         if (this.i != null && this.g == dmv.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dmv.this.H;
         }
      }

      @Override
      public dmk k() {
         return this.e;
      }

      @Override
      public dml.l.a j() {
         return dml.l.a.d;
      }
   }

   class g implements dml.m, dmv.h {
      private final dmk e;
      final double[][] f;

      g(dmk $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dmv.this.v + 1][dmv.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dmv.this.v; $$2++) {
               int $$3 = dmv.this.g + $$2;
               int $$4 = in.c($$3);

               for (int $$5 = 0; $$5 <= dmv.this.v; $$5++) {
                  int $$6 = dmv.this.h + $$5;
                  int $$7 = in.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dmk.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dmk.b $$0) {
         int $$1 = in.a($$0.a());
         int $$2 = in.a($$0.c());
         int $$3 = $$1 - dmv.this.g;
         int $$4 = $$2 - dmv.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dmk.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dmk k() {
         return this.e;
      }

      @Override
      public dml.l.a j() {
         return dml.l.a.b;
      }
   }

   interface h extends dmk {
      dmk k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dml.m, dmv.h {
      double[][] e;
      double[][] f;
      private final dmk g;
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

      i(dmk $$1) {
         this.g = $$1;
         this.e = this.a(dmv.this.c, dmv.this.b);
         this.f = this.a(dmv.this.c, dmv.this.b);
         dmv.this.i.add(this);
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
         this.p = atm.d($$0, this.h, this.l);
         this.q = atm.d($$0, this.j, this.n);
         this.r = atm.d($$0, this.i, this.m);
         this.s = atm.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = atm.d($$0, this.p, this.q);
         this.u = atm.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = atm.d($$0, this.t, this.u);
      }

      @Override
      public double a(dmk.b $$0) {
         if ($$0 != dmv.this) {
            return this.g.a($$0);
         } else if (!dmv.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dmv.this.z
               ? atm.a(
                  (double)dmv.this.D / (double)dmv.this.w,
                  (double)dmv.this.E / (double)dmv.this.x,
                  (double)dmv.this.F / (double)dmv.this.w,
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
      public void a(double[] $$0, dmk.a $$1) {
         if (dmv.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dmk k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dml.l.a j() {
         return dml.l.a.a;
      }
   }
}
