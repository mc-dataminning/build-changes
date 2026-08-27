import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class dkn implements dkc.a, dkc.b {
   private final dkr a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<dkn.i> i;
   final List<dkn.e> j;
   private final Map<dkc, dkc> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final djv m;
   private final dkc n;
   private final dkn.c o;
   private final dll p;
   private final dkn.g q;
   private final dkn.g r;
   private final dkd.c s;
   private long t = cot.a;
   private dll.a u = new dll.a(1.0, 0.0);
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
   private final dkc.a J = new dkc.a() {
      @Override
      public dkc.b a(int $$0) {
         dkn.this.B = ($$0 + dkn.this.d) * dkn.this.x;
         dkn.this.G++;
         dkn.this.E = 0;
         dkn.this.I = $$0;
         return dkn.this;
      }

      @Override
      public void a(double[] $$0, dkc $$1) {
         for (int $$2 = 0; $$2 < dkn.this.c + 1; $$2++) {
            dkn.this.B = ($$2 + dkn.this.d) * dkn.this.x;
            dkn.this.G++;
            dkn.this.E = 0;
            dkn.this.I = $$2;
            $$0[$$2] = $$1.a(dkn.this);
         }
      }
   };

   public static dkn a(dgw $$0, dkx $$1, dkd.c $$2, dko $$3, djv.a $$4, dll $$5) {
      dkr $$6 = $$3.f().a($$0);
      cot $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new dkn($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public dkn(int $$0, dkx $$1, int $$2, int $$3, dkr $$4, dkd.c $$5, dko $$6, djv.a $$7, dll $$8) {
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
      this.q = new dkn.g(new dkn.a(), false);
      this.r = new dkn.g(new dkn.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = hq.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = hq.c($$13);
            dll.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dkp $$16 = $$1.a();
      dkp $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = djv.a($$7);
      } else {
         int $$18 = hx.a($$2);
         int $$19 = hx.a($$3);
         this.m = djv.a(this, new cot($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<dkn.c> $$20 = ImmutableList.builder();
      dkc $$21 = dkd.e(dkd.a($$17.l(), dkd.b.a)).a(this::a);
      $$20.add((dkn.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dkt.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new dtn($$20.build());
      this.n = $$17.k();
   }

   protected cqt.f a(dkp $$0, List<cqt.d> $$1) {
      return new cqt.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dfa e() {
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
         if (this.n.a(new dkc.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dll d() {
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

         for (dkn.i $$4 : this.i) {
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

   public dkn c(int $$0) {
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
   public void a(double[] $$0, dkc $$1) {
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

      for (dkn.e $$2 : this.j) {
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
      this.i.forEach(dkn.i::l);
   }

   public djv i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dll.a c(int $$0, int $$1) {
      long $$2 = cot.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dll.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dkc a(dkc $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dkc b(dkc $$0) {
      if ($$0 instanceof dkd.l $$1) {
         return (dkc)(switch ($$1.j()) {
            case a -> new dkn.i($$1.k());
            case b -> new dkn.g($$1.k(), true);
            case c -> new dkn.d($$1.k());
            case d -> new dkn.f($$1.k());
            case e -> new dkn.e($$1.k());
         });
      } else {
         if (this.p != dll.a()) {
            if ($$0 == dkd.d.a) {
               return this.q;
            }

            if ($$0 == dkd.f.a) {
               return this.r;
            }
         }

         if ($$0 == dkd.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dkd.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements dkn.h {
      @Override
      public dkc k() {
         return dkd.d.a;
      }

      @Override
      public dkc a(dkc.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dkc.b $$0) {
         return dkn.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dkc.a $$1) {
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
      public arj<? extends dkc> c() {
         return dkd.d.e;
      }
   }

   class b implements dkn.h {
      @Override
      public dkc k() {
         return dkd.f.a;
      }

      @Override
      public dkc a(dkc.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dkc.b $$0) {
         return dkn.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dkc.a $$1) {
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
      public arj<? extends dkc> c() {
         return dkd.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dfa calculate(dkc.b var1);
   }

   static class d implements dkd.m, dkn.h {
      private final dkc a;
      private long e = cot.a;
      private double f;

      d(dkc $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dkc.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = cot.c($$1, $$2);
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
      public void a(double[] $$0, dkc.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dkc k() {
         return this.a;
      }

      @Override
      public dkd.l.a j() {
         return dkd.l.a.c;
      }
   }

   class e implements dkd.m, dkn.h {
      final dkc e;
      final double[] f;

      e(dkc $$0) {
         this.e = $$0;
         this.f = new double[dkn.this.w * dkn.this.w * dkn.this.x];
         dkn.this.j.add(this);
      }

      @Override
      public double a(dkc.b $$0) {
         if ($$0 != dkn.this) {
            return this.e.a($$0);
         } else if (!dkn.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = dkn.this.D;
            int $$2 = dkn.this.E;
            int $$3 = dkn.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < dkn.this.w && $$2 < dkn.this.x && $$3 < dkn.this.w
               ? this.f[((dkn.this.x - 1 - $$2) * dkn.this.w + $$1) * dkn.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dkc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkc k() {
         return this.e;
      }

      @Override
      public dkd.l.a j() {
         return dkd.l.a.e;
      }
   }

   class f implements dkd.m, dkn.h {
      private final dkc e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dkc $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dkc.b $$0) {
         if ($$0 != dkn.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == dkn.this.H) {
            return this.i[dkn.this.I];
         } else if (this.f == dkn.this.G) {
            return this.h;
         } else {
            this.f = dkn.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dkc.a $$1) {
         if (this.i != null && this.g == dkn.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = dkn.this.H;
         }
      }

      @Override
      public dkc k() {
         return this.e;
      }

      @Override
      public dkd.l.a j() {
         return dkd.l.a.d;
      }
   }

   class g implements dkd.m, dkn.h {
      private final dkc e;
      final double[][] f;

      g(dkc $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[dkn.this.v + 1][dkn.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= dkn.this.v; $$2++) {
               int $$3 = dkn.this.g + $$2;
               int $$4 = hq.c($$3);

               for (int $$5 = 0; $$5 <= dkn.this.v; $$5++) {
                  int $$6 = dkn.this.h + $$5;
                  int $$7 = hq.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dkc.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dkc.b $$0) {
         int $$1 = hq.a($$0.a());
         int $$2 = hq.a($$0.c());
         int $$3 = $$1 - dkn.this.g;
         int $$4 = $$2 - dkn.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dkc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dkc k() {
         return this.e;
      }

      @Override
      public dkd.l.a j() {
         return dkd.l.a.b;
      }
   }

   interface h extends dkc {
      dkc k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dkd.m, dkn.h {
      double[][] e;
      double[][] f;
      private final dkc g;
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

      i(dkc $$1) {
         this.g = $$1;
         this.e = this.a(dkn.this.c, dkn.this.b);
         this.f = this.a(dkn.this.c, dkn.this.b);
         dkn.this.i.add(this);
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
      public double a(dkc.b $$0) {
         if ($$0 != dkn.this) {
            return this.g.a($$0);
         } else if (!dkn.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return dkn.this.z
               ? arp.a(
                  (double)dkn.this.D / (double)dkn.this.w,
                  (double)dkn.this.E / (double)dkn.this.x,
                  (double)dkn.this.F / (double)dkn.this.w,
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
      public void a(double[] $$0, dkc.a $$1) {
         if (dkn.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dkc k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dkd.l.a j() {
         return dkd.l.a.a;
      }
   }
}
