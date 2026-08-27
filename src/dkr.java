import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dkr implements dkg.a, dkg.b {
   private final dkv a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dkr.i> i;
   final List<dkr.e> j;
   private final Map<dkg, dkg> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final djz m;
   private final dkg n;
   private final dkr.c o;
   private final dlp p;
   private final dkr.g q;
   private final dkr.g r;
   private final dkh.c s;
   private long t = cox.a;
   private dlp.a u = new dlp.a(1.0, 0.0);
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
   private final dkg.a J = new dkg.a() {
      @Override
      public dkg.b a(int $$0) {
         dkr.this.B = ($$0 + dkr.this.d) * dkr.this.x;
         dkr.this.G++;
         dkr.this.E = 0;
         dkr.this.I = $$0;
         return dkr.this;
      }

      @Override
      public void a(double[] $$0, dkg $$1) {
         for (int $$2 = 0; $$2 < dkr.this.c + 1; $$2++) {
            dkr.this.B = ($$2 + dkr.this.d) * dkr.this.x;
            dkr.this.G++;
            dkr.this.E = 0;
            dkr.this.I = $$2;
            $$0[$$2] = $$1.a(dkr.this);
         }
      }
   };

   public static dkr a(dha $$0, dlb $$1, dkh.c $$2, dks $$3, djz.a $$4, dlp $$5) {
      dkv $$6 = $$3.f().a($$0);
      cox $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dkr($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dkr(int $$0, dlb $$1, int $$2, int $$3, dkv $$4, dkh.c $$5, dks $$6, djz.a $$7, dlp $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = ars.a($$4.d(), this.x);
      this.d = ars.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = hs.a($$2);
      this.h = hs.a($$3);
      this.v = hs.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dkr.g(new dkr.a(), false);
      this.r = new dkr.g(new dkr.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = hs.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = hs.c($$13);
            dlp.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dkt $$16 = $$1.a();
      dkt $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = djz.a($$7);
      } else {
         int $$18 = hz.a($$2);
         int $$19 = hz.a($$3);
         this.m = djz.a(this, new cox($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dkr.c> $$20 = ImmutableList.builder();
      dkg $$21 = dkh.e(dkh.a($$17.l(), dkh.b.a)).a(this::a);
      $$20.add((dkr.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dkx.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new dtr($$20.build());
      this.n = $$17.k();
   }

   protected cqx.f a(dkt $$0, List<cqx.d> $$1) {
      return new cqx.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dfe e() {
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
      int $$2 = hs.c(hs.a($$0));
      int $$3 = hs.c(hs.a($$1));
      return this.l.computeIfAbsent(akd.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = akd.a($$0);
      int $$2 = akd.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dkg.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dlp d() {
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

         for (dkr.i $$4 : this.i) {
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

   public dkr c(int $$0) {
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
   public void a(double[] $$0, dkg $$1) {
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

      for (dkr.e $$2 : this.j) {
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
      this.i.forEach(dkr.i::l);
   }

   public djz i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dlp.a c(int $$0, int $$1) {
      long $$2 = cox.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dlp.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dkg a(dkg $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dkg b(dkg $$0) {
      if ($$0 instanceof dkh.l $$1) {
         return (dkg)(switch ($$1.j()) {
            case a -> new dkr.i($$1.k());
            case b -> new dkr.g($$1.k(), true);
            case c -> new dkr.d($$1.k());
            case d -> new dkr.f($$1.k());
            case e -> new dkr.e($$1.k());
         });
      } else {
         if (this.p != dlp.a()) {
            if ($$0 == dkh.d.a) {
               return this.q;
            }

            if ($$0 == dkh.f.a) {
               return this.r;
            }
         }

         if ($$0 == dkh.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dkh.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dkr.h {
      @Override
      public dkg k() {
         return dkh.d.a;
      }

      @Override
      public dkg a(dkg.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dkg.b $$0) {
         return dkr.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dkg.a $$1) {
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
      public arm<? extends dkg> c() {
         return dkh.d.e;
      }
   }

   class b implements dkr.h {
      @Override
      public dkg k() {
         return dkh.f.a;
      }

      @Override
      public dkg a(dkg.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dkg.b $$0) {
         return dkr.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dkg.a $$1) {
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
      public arm<? extends dkg> c() {
         return dkh.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dfe calculate(dkg.b var1);
   }

   static class d implements dkh.m, dkr.h {
      private final dkg a;
      private long e = cox.a;
      private double f;

      d(dkg $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dkg.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = cox.c($$1, $$2);
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
      public void a(double[] $$0, dkg.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dkg k() {
         return this.a;
      }

      @Override
      public dkh.l.a j() {
         return dkh.l.a.c;
      }
   }

   class e implements dkh.m, dkr.h {
      final dkg e;
      final double[] f;

      e(dkg $$0) {
         this.e = $$0;
         this.f = new double[dkr.this.w * dkr.this.w * dkr.this.x];
         dkr.this.j.add(this);
      }

      @Override
      public double a(dkg.b $$0) {
         if ($$0 != dkr.this) {
            return this.e.a($$0);
         } else if (!dkr.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dkr.this.D;
            int $$2 = dkr.this.E;
            int $$3 = dkr.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dkr.this.w && $$2 < dkr.this.x && $$3 < dkr.this.w
               ? this.f[((dkr.this.x - 1 - $$2) * dkr.this.w + $$1) * dkr.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dkg.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkg k() {
         return this.e;
      }

      @Override
      public dkh.l.a j() {
         return dkh.l.a.e;
      }
   }

   class f implements dkh.m, dkr.h {
      private final dkg e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dkg $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dkg.b $$0) {
         if ($$0 != dkr.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dkr.this.H) {
            return this.i[dkr.this.I];
         } else if (this.f == dkr.this.G) {
            return this.h;
         } else {
            this.f = dkr.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dkg.a $$1) {
         if (this.i != null && this.g == dkr.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dkr.this.H;
         }
      }

      @Override
      public dkg k() {
         return this.e;
      }

      @Override
      public dkh.l.a j() {
         return dkh.l.a.d;
      }
   }

   class g implements dkh.m, dkr.h {
      private final dkg e;
      final double[][] f;

      g(dkg $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dkr.this.v + 1][dkr.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dkr.this.v; $$2++) {
               int $$3 = dkr.this.g + $$2;
               int $$4 = hs.c($$3);

               for (int $$5 = 0; $$5 <= dkr.this.v; $$5++) {
                  int $$6 = dkr.this.h + $$5;
                  int $$7 = hs.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dkg.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dkg.b $$0) {
         int $$1 = hs.a($$0.a());
         int $$2 = hs.a($$0.c());
         int $$3 = $$1 - dkr.this.g;
         int $$4 = $$2 - dkr.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dkg.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkg k() {
         return this.e;
      }

      @Override
      public dkh.l.a j() {
         return dkh.l.a.b;
      }
   }

   interface h extends dkg {
      dkg k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dkh.m, dkr.h {
      double[][] e;
      double[][] f;
      private final dkg g;
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

      i(dkg $$1) {
         this.g = $$1;
         this.e = this.a(dkr.this.c, dkr.this.b);
         this.f = this.a(dkr.this.c, dkr.this.b);
         dkr.this.i.add(this);
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
         this.p = ars.d($$0, this.h, this.l);
         this.q = ars.d($$0, this.j, this.n);
         this.r = ars.d($$0, this.i, this.m);
         this.s = ars.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = ars.d($$0, this.p, this.q);
         this.u = ars.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = ars.d($$0, this.t, this.u);
      }

      @Override
      public double a(dkg.b $$0) {
         if ($$0 != dkr.this) {
            return this.g.a($$0);
         } else if (!dkr.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dkr.this.z
               ? ars.a(
                  (double)dkr.this.D / (double)dkr.this.w,
                  (double)dkr.this.E / (double)dkr.this.x,
                  (double)dkr.this.F / (double)dkr.this.w,
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
      public void a(double[] $$0, dkg.a $$1) {
         if (dkr.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dkg k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dkh.l.a j() {
         return dkh.l.a.a;
      }
   }
}
