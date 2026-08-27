import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dwx implements dwm.a, dwm.b {
   private final dxb a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dwx.i> i;
   final List<dwx.e> j;
   private final Map<dwm, dwm> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dwf m;
   private final dwm n;
   private final dwx.c o;
   private final dxv p;
   private final dwx.g q;
   private final dwx.g r;
   private final dwn.c s;
   private long t = dae.a;
   private dxv.a u = new dxv.a(1.0, 0.0);
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
   private final dwm.a J = new dwm.a() {
      @Override
      public dwm.b a(int $$0) {
         dwx.this.B = ($$0 + dwx.this.d) * dwx.this.x;
         dwx.this.G++;
         dwx.this.E = 0;
         dwx.this.I = $$0;
         return dwx.this;
      }

      @Override
      public void a(double[] $$0, dwm $$1) {
         for (int $$2 = 0; $$2 < dwx.this.c + 1; $$2++) {
            dwx.this.B = ($$2 + dwx.this.d) * dwx.this.x;
            dwx.this.G++;
            dwx.this.E = 0;
            dwx.this.I = $$2;
            $$0[$$2] = $$1.a(dwx.this);
         }
      }
   };

   public static dwx a(dsx $$0, dxh $$1, dwn.c $$2, dwy $$3, dwf.a $$4, dxv $$5) {
      dxb $$6 = $$3.f().a($$0);
      dae $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dwx($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dwx(int $$0, dxh $$1, int $$2, int $$3, dxb $$4, dwn.c $$5, dwy $$6, dwf.a $$7, dxv $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = ayd.a($$4.d(), this.x);
      this.d = ayd.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = ji.a($$2);
      this.h = ji.a($$3);
      this.v = ji.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dwx.g(new dwx.a(), false);
      this.r = new dwx.g(new dwx.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = ji.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = ji.c($$13);
            dxv.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dwz $$16 = $$1.a();
      dwz $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dwf.a($$7);
      } else {
         int $$18 = jq.a($$2);
         int $$19 = jq.a($$3);
         this.m = dwf.a(this, new dae($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dwx.c> $$20 = ImmutableList.builder();
      dwm $$21 = dwn.e(dwn.a($$17.l(), dwn.b.a)).a(this::a);
      $$20.add((dwx.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dxd.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new efx($$20.build());
      this.n = $$17.k();
   }

   protected dcf.f a(dwz $$0, List<dcf.d> $$1) {
      return new dcf.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected drb e() {
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
      int $$2 = ji.c(ji.a($$0));
      int $$3 = ji.c(ji.a($$1));
      return this.l.computeIfAbsent(aqc.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aqc.a($$0);
      int $$2 = aqc.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dwm.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dxv d() {
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

         for (dwx.i $$4 : this.i) {
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

   public dwx c(int $$0) {
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
   public void a(double[] $$0, dwm $$1) {
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

      for (dwx.e $$2 : this.j) {
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
      this.i.forEach(dwx.i::l);
   }

   public dwf i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dxv.a c(int $$0, int $$1) {
      long $$2 = dae.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dxv.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dwm a(dwm $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dwm b(dwm $$0) {
      if ($$0 instanceof dwn.l $$1) {
         return (dwm)(switch ($$1.j()) {
            case a -> new dwx.i($$1.k());
            case b -> new dwx.g($$1.k(), true);
            case c -> new dwx.d($$1.k());
            case d -> new dwx.f($$1.k());
            case e -> new dwx.e($$1.k());
         });
      } else {
         if (this.p != dxv.a()) {
            if ($$0 == dwn.d.a) {
               return this.q;
            }

            if ($$0 == dwn.f.a) {
               return this.r;
            }
         }

         if ($$0 == dwn.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dwn.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dwx.h {
      @Override
      public dwm k() {
         return dwn.d.a;
      }

      @Override
      public dwm a(dwm.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dwm.b $$0) {
         return dwx.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dwm.a $$1) {
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
      public axx<? extends dwm> c() {
         return dwn.d.e;
      }
   }

   class b implements dwx.h {
      @Override
      public dwm k() {
         return dwn.f.a;
      }

      @Override
      public dwm a(dwm.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dwm.b $$0) {
         return dwx.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dwm.a $$1) {
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
      public axx<? extends dwm> c() {
         return dwn.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      drb calculate(dwm.b var1);
   }

   static class d implements dwn.m, dwx.h {
      private final dwm a;
      private long e = dae.a;
      private double f;

      d(dwm $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dwm.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dae.c($$1, $$2);
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
      public void a(double[] $$0, dwm.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dwm k() {
         return this.a;
      }

      @Override
      public dwn.l.a j() {
         return dwn.l.a.c;
      }
   }

   class e implements dwn.m, dwx.h {
      final dwm e;
      final double[] f;

      e(dwm $$0) {
         this.e = $$0;
         this.f = new double[dwx.this.w * dwx.this.w * dwx.this.x];
         dwx.this.j.add(this);
      }

      @Override
      public double a(dwm.b $$0) {
         if ($$0 != dwx.this) {
            return this.e.a($$0);
         } else if (!dwx.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dwx.this.D;
            int $$2 = dwx.this.E;
            int $$3 = dwx.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dwx.this.w && $$2 < dwx.this.x && $$3 < dwx.this.w
               ? this.f[((dwx.this.x - 1 - $$2) * dwx.this.w + $$1) * dwx.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dwm.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dwm k() {
         return this.e;
      }

      @Override
      public dwn.l.a j() {
         return dwn.l.a.e;
      }
   }

   class f implements dwn.m, dwx.h {
      private final dwm e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dwm $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dwm.b $$0) {
         if ($$0 != dwx.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dwx.this.H) {
            return this.i[dwx.this.I];
         } else if (this.f == dwx.this.G) {
            return this.h;
         } else {
            this.f = dwx.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dwm.a $$1) {
         if (this.i != null && this.g == dwx.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dwx.this.H;
         }
      }

      @Override
      public dwm k() {
         return this.e;
      }

      @Override
      public dwn.l.a j() {
         return dwn.l.a.d;
      }
   }

   class g implements dwn.m, dwx.h {
      private final dwm e;
      final double[][] f;

      g(dwm $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dwx.this.v + 1][dwx.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dwx.this.v; $$2++) {
               int $$3 = dwx.this.g + $$2;
               int $$4 = ji.c($$3);

               for (int $$5 = 0; $$5 <= dwx.this.v; $$5++) {
                  int $$6 = dwx.this.h + $$5;
                  int $$7 = ji.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dwm.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dwm.b $$0) {
         int $$1 = ji.a($$0.a());
         int $$2 = ji.a($$0.c());
         int $$3 = $$1 - dwx.this.g;
         int $$4 = $$2 - dwx.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dwm.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dwm k() {
         return this.e;
      }

      @Override
      public dwn.l.a j() {
         return dwn.l.a.b;
      }
   }

   interface h extends dwm {
      dwm k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dwn.m, dwx.h {
      double[][] e;
      double[][] f;
      private final dwm g;
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

      i(dwm $$1) {
         this.g = $$1;
         this.e = this.a(dwx.this.c, dwx.this.b);
         this.f = this.a(dwx.this.c, dwx.this.b);
         dwx.this.i.add(this);
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
         this.p = ayd.d($$0, this.h, this.l);
         this.q = ayd.d($$0, this.j, this.n);
         this.r = ayd.d($$0, this.i, this.m);
         this.s = ayd.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = ayd.d($$0, this.p, this.q);
         this.u = ayd.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = ayd.d($$0, this.t, this.u);
      }

      @Override
      public double a(dwm.b $$0) {
         if ($$0 != dwx.this) {
            return this.g.a($$0);
         } else if (!dwx.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dwx.this.z
               ? ayd.a(
                  (double)dwx.this.D / (double)dwx.this.w,
                  (double)dwx.this.E / (double)dwx.this.x,
                  (double)dwx.this.F / (double)dwx.this.w,
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
      public void a(double[] $$0, dwm.a $$1) {
         if (dwx.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dwm k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dwn.l.a j() {
         return dwn.l.a.a;
      }
   }
}
