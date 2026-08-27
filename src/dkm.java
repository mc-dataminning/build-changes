import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dkm implements dkb.a, dkb.b {
   private final dkq a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dkm.i> i;
   final List<dkm.e> j;
   private final Map<dkb, dkb> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dju m;
   private final dkb n;
   private final dkm.c o;
   private final dlk p;
   private final dkm.g q;
   private final dkm.g r;
   private final dkc.c s;
   private long t = cos.a;
   private dlk.a u = new dlk.a(1.0, 0.0);
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
   private final dkb.a J = new dkb.a() {
      @Override
      public dkb.b a(int $$0) {
         dkm.this.B = ($$0 + dkm.this.d) * dkm.this.x;
         dkm.this.G++;
         dkm.this.E = 0;
         dkm.this.I = $$0;
         return dkm.this;
      }

      @Override
      public void a(double[] $$0, dkb $$1) {
         for (int $$2 = 0; $$2 < dkm.this.c + 1; $$2++) {
            dkm.this.B = ($$2 + dkm.this.d) * dkm.this.x;
            dkm.this.G++;
            dkm.this.E = 0;
            dkm.this.I = $$2;
            $$0[$$2] = $$1.a(dkm.this);
         }
      }
   };

   public static dkm a(dgv $$0, dkw $$1, dkc.c $$2, dkn $$3, dju.a $$4, dlk $$5) {
      dkq $$6 = $$3.f().a($$0);
      cos $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dkm($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dkm(int $$0, dkw $$1, int $$2, int $$3, dkq $$4, dkc.c $$5, dkn $$6, dju.a $$7, dlk $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = arp.a($$4.d(), this.x);
      this.d = arp.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = hq.a($$2);
      this.h = hq.a($$3);
      this.v = hq.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new dkm.g(new dkm.a(), false);
      this.r = new dkm.g(new dkm.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = hq.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = hq.c($$13);
            dlk.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dko $$16 = $$1.a();
      dko $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dju.a($$7);
      } else {
         int $$18 = hx.a($$2);
         int $$19 = hx.a($$3);
         this.m = dju.a(this, new cos($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dkm.c> $$20 = ImmutableList.builder();
      dkb $$21 = dkc.e(dkc.a($$17.l(), dkc.b.a)).a(this::a);
      $$20.add((dkm.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dks.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new dtm($$20.build());
      this.n = $$17.k();
   }

   protected cqs.f a(dko $$0, List<cqs.d> $$1) {
      return new cqs.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dez e() {
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
      int $$2 = hq.c(hq.a($$0));
      int $$3 = hq.c(hq.a($$1));
      return this.l.computeIfAbsent(aka.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aka.a($$0);
      int $$2 = aka.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dkb.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dlk d() {
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

         for (dkm.i $$4 : this.i) {
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

   public dkm c(int $$0) {
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
   public void a(double[] $$0, dkb $$1) {
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

      for (dkm.e $$2 : this.j) {
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
      this.i.forEach(dkm.i::l);
   }

   public dju i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dlk.a c(int $$0, int $$1) {
      long $$2 = cos.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dlk.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dkb a(dkb $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dkb b(dkb $$0) {
      if ($$0 instanceof dkc.l $$1) {
         return (dkb)(switch ($$1.j()) {
            case a -> new dkm.i($$1.k());
            case b -> new dkm.g($$1.k(), true);
            case c -> new dkm.d($$1.k());
            case d -> new dkm.f($$1.k());
            case e -> new dkm.e($$1.k());
         });
      } else {
         if (this.p != dlk.a()) {
            if ($$0 == dkc.d.a) {
               return this.q;
            }

            if ($$0 == dkc.f.a) {
               return this.r;
            }
         }

         if ($$0 == dkc.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dkc.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dkm.h {
      @Override
      public dkb k() {
         return dkc.d.a;
      }

      @Override
      public dkb a(dkb.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dkb.b $$0) {
         return dkm.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dkb.a $$1) {
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
      public arj<? extends dkb> c() {
         return dkc.d.e;
      }
   }

   class b implements dkm.h {
      @Override
      public dkb k() {
         return dkc.f.a;
      }

      @Override
      public dkb a(dkb.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dkb.b $$0) {
         return dkm.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dkb.a $$1) {
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
      public arj<? extends dkb> c() {
         return dkc.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dez calculate(dkb.b var1);
   }

   static class d implements dkc.m, dkm.h {
      private final dkb a;
      private long e = cos.a;
      private double f;

      d(dkb $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dkb.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = cos.c($$1, $$2);
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
      public void a(double[] $$0, dkb.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dkb k() {
         return this.a;
      }

      @Override
      public dkc.l.a j() {
         return dkc.l.a.c;
      }
   }

   class e implements dkc.m, dkm.h {
      final dkb e;
      final double[] f;

      e(dkb $$0) {
         this.e = $$0;
         this.f = new double[dkm.this.w * dkm.this.w * dkm.this.x];
         dkm.this.j.add(this);
      }

      @Override
      public double a(dkb.b $$0) {
         if ($$0 != dkm.this) {
            return this.e.a($$0);
         } else if (!dkm.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dkm.this.D;
            int $$2 = dkm.this.E;
            int $$3 = dkm.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dkm.this.w && $$2 < dkm.this.x && $$3 < dkm.this.w
               ? this.f[((dkm.this.x - 1 - $$2) * dkm.this.w + $$1) * dkm.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dkb.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkb k() {
         return this.e;
      }

      @Override
      public dkc.l.a j() {
         return dkc.l.a.e;
      }
   }

   class f implements dkc.m, dkm.h {
      private final dkb e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dkb $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dkb.b $$0) {
         if ($$0 != dkm.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dkm.this.H) {
            return this.i[dkm.this.I];
         } else if (this.f == dkm.this.G) {
            return this.h;
         } else {
            this.f = dkm.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dkb.a $$1) {
         if (this.i != null && this.g == dkm.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dkm.this.H;
         }
      }

      @Override
      public dkb k() {
         return this.e;
      }

      @Override
      public dkc.l.a j() {
         return dkc.l.a.d;
      }
   }

   class g implements dkc.m, dkm.h {
      private final dkb e;
      final double[][] f;

      g(dkb $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dkm.this.v + 1][dkm.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dkm.this.v; $$2++) {
               int $$3 = dkm.this.g + $$2;
               int $$4 = hq.c($$3);

               for (int $$5 = 0; $$5 <= dkm.this.v; $$5++) {
                  int $$6 = dkm.this.h + $$5;
                  int $$7 = hq.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dkb.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dkb.b $$0) {
         int $$1 = hq.a($$0.a());
         int $$2 = hq.a($$0.c());
         int $$3 = $$1 - dkm.this.g;
         int $$4 = $$2 - dkm.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dkb.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkb k() {
         return this.e;
      }

      @Override
      public dkc.l.a j() {
         return dkc.l.a.b;
      }
   }

   interface h extends dkb {
      dkb k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dkc.m, dkm.h {
      double[][] e;
      double[][] f;
      private final dkb g;
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

      i(dkb $$1) {
         this.g = $$1;
         this.e = this.a(dkm.this.c, dkm.this.b);
         this.f = this.a(dkm.this.c, dkm.this.b);
         dkm.this.i.add(this);
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
         this.p = arp.d($$0, this.h, this.l);
         this.q = arp.d($$0, this.j, this.n);
         this.r = arp.d($$0, this.i, this.m);
         this.s = arp.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = arp.d($$0, this.p, this.q);
         this.u = arp.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = arp.d($$0, this.t, this.u);
      }

      @Override
      public double a(dkb.b $$0) {
         if ($$0 != dkm.this) {
            return this.g.a($$0);
         } else if (!dkm.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dkm.this.z
               ? arp.a(
                  (double)dkm.this.D / (double)dkm.this.w,
                  (double)dkm.this.E / (double)dkm.this.x,
                  (double)dkm.this.F / (double)dkm.this.w,
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
      public void a(double[] $$0, dkb.a $$1) {
         if (dkm.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dkb k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dkc.l.a j() {
         return dkc.l.a.a;
      }
   }
}
