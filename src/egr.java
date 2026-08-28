import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class egr implements egg.a, egg.b {
   private final egv a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<egr.i> i;
   final List<egr.e> j;
   private final Map<egg, egg> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final efz m;
   private final egg n;
   private final egr.c o;
   private final ehp p;
   private final egr.g q;
   private final egr.g r;
   private final egh.c s;
   private long t = dio.c;
   private ehp.a u = new ehp.a(1.0, 0.0);
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
   private final egg.a J = new egg.a() {
      @Override
      public egg.b a(int $$0) {
         egr.this.B = ($$0 + egr.this.d) * egr.this.x;
         egr.this.G++;
         egr.this.E = 0;
         egr.this.I = $$0;
         return egr.this;
      }

      @Override
      public void a(double[] $$0, egg $$1) {
         for (int $$2 = 0; $$2 < egr.this.c + 1; $$2++) {
            egr.this.B = ($$2 + egr.this.d) * egr.this.x;
            egr.this.G++;
            egr.this.E = 0;
            egr.this.I = $$2;
            $$0[$$2] = $$1.a(egr.this);
         }
      }
   };

   public static egr a(ecl $$0, ehb $$1, egh.c $$2, egs $$3, efz.a $$4, ehp $$5) {
      egv $$6 = $$3.f().a($$0);
      dio $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new egr($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public egr(int $$0, ehb $$1, int $$2, int $$3, egv $$4, egh.c $$5, egs $$6, efz.a $$7, ehp $$8) {
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
      this.g = jq.a($$2);
      this.h = jq.a($$3);
      this.v = jq.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new egr.g(new egr.a(), false);
      this.r = new egr.g(new egr.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = jq.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = jq.c($$13);
            ehp.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      egt $$16 = $$1.a();
      egt $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = efz.a($$7);
      } else {
         int $$18 = jy.a($$2);
         int $$19 = jy.a($$3);
         this.m = efz.a(this, new dio($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<egr.c> $$20 = new ArrayList<>();
      egg $$21 = egh.e(egh.a($$17.l(), egh.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(egx.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new epw($$20.toArray(new egr.c[0]));
      this.n = $$17.k();
   }

   protected dkt.f a(egt $$0, List<dkt.d> $$1) {
      return new dkt.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected eao e() {
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
      int $$2 = jq.c(jq.a($$0));
      int $$3 = jq.c(jq.a($$1));
      return this.l.computeIfAbsent(arb.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = arb.a($$0);
      int $$2 = arb.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new egg.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public ehp d() {
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

         for (egr.i $$4 : this.i) {
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

   public egr c(int $$0) {
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
   public void a(double[] $$0, egg $$1) {
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
      for (egr.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (egr.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (egr.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (egr.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (egr.i $$2 : this.i) {
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
      this.i.forEach(egr.i::l);
   }

   public efz i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   ehp.a c(int $$0, int $$1) {
      long $$2 = dio.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         ehp.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected egg a(egg $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private egg b(egg $$0) {
      if ($$0 instanceof egh.l $$1) {
         return (egg)(switch ($$1.j()) {
            case a -> new egr.i($$1.k());
            case b -> new egr.g($$1.k(), true);
            case c -> new egr.d($$1.k());
            case d -> new egr.f($$1.k());
            case e -> new egr.e($$1.k());
         });
      } else {
         if (this.p != ehp.a()) {
            if ($$0 == egh.d.a) {
               return this.q;
            }

            if ($$0 == egh.f.a) {
               return this.r;
            }
         }

         if ($$0 == egh.b.a) {
            return this.s;
         } else {
            return $$0 instanceof egh.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements egr.h {
      @Override
      public egg k() {
         return egh.d.a;
      }

      @Override
      public egg a(egg.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(egg.b $$0) {
         return egr.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, egg.a $$1) {
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
      public azf<? extends egg> c() {
         return egh.d.e;
      }
   }

   class b implements egr.h {
      @Override
      public egg k() {
         return egh.f.a;
      }

      @Override
      public egg a(egg.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(egg.b $$0) {
         return egr.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, egg.a $$1) {
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
      public azf<? extends egg> c() {
         return egh.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      eao calculate(egg.b var1);
   }

   static class d implements egh.m, egr.h {
      private final egg a;
      private long e = dio.c;
      private double f;

      d(egg $$0) {
         this.a = $$0;
      }

      @Override
      public double a(egg.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dio.c($$1, $$2);
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
      public void a(double[] $$0, egg.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public egg k() {
         return this.a;
      }

      @Override
      public egh.l.a j() {
         return egh.l.a.c;
      }
   }

   class e implements egh.m, egr.h {
      final egg e;
      final double[] f;

      e(final egg $$0) {
         this.e = $$0;
         this.f = new double[egr.this.w * egr.this.w * egr.this.x];
         egr.this.j.add(this);
      }

      @Override
      public double a(egg.b $$0) {
         if ($$0 != egr.this) {
            return this.e.a($$0);
         } else if (!egr.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = egr.this.D;
            int $$2 = egr.this.E;
            int $$3 = egr.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < egr.this.w && $$2 < egr.this.x && $$3 < egr.this.w
               ? this.f[((egr.this.x - 1 - $$2) * egr.this.w + $$1) * egr.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, egg.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public egg k() {
         return this.e;
      }

      @Override
      public egh.l.a j() {
         return egh.l.a.e;
      }
   }

   class f implements egh.m, egr.h {
      private final egg e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final egg $$0) {
         this.e = $$0;
      }

      @Override
      public double a(egg.b $$0) {
         if ($$0 != egr.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == egr.this.H) {
            return this.i[egr.this.I];
         } else if (this.f == egr.this.G) {
            return this.h;
         } else {
            this.f = egr.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, egg.a $$1) {
         if (this.i != null && this.g == egr.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = egr.this.H;
         }
      }

      @Override
      public egg k() {
         return this.e;
      }

      @Override
      public egh.l.a j() {
         return egh.l.a.d;
      }
   }

   class g implements egh.m, egr.h {
      private final egg e;
      final double[][] f;

      g(final egg $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[egr.this.v + 1][egr.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= egr.this.v; $$2++) {
               int $$3 = egr.this.g + $$2;
               int $$4 = jq.c($$3);

               for (int $$5 = 0; $$5 <= egr.this.v; $$5++) {
                  int $$6 = egr.this.h + $$5;
                  int $$7 = jq.c($$6);
                  this.f[$$2][$$5] = $$0.a(new egg.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(egg.b $$0) {
         int $$1 = jq.a($$0.a());
         int $$2 = jq.a($$0.c());
         int $$3 = $$1 - egr.this.g;
         int $$4 = $$2 - egr.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, egg.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public egg k() {
         return this.e;
      }

      @Override
      public egh.l.a j() {
         return egh.l.a.b;
      }
   }

   interface h extends egg {
      egg k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements egh.m, egr.h {
      double[][] e;
      double[][] f;
      private final egg g;
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

      i(final egg $$1) {
         this.g = $$1;
         this.e = this.a(egr.this.c, egr.this.b);
         this.f = this.a(egr.this.c, egr.this.b);
         egr.this.i.add(this);
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
      public double a(egg.b $$0) {
         if ($$0 != egr.this) {
            return this.g.a($$0);
         } else if (!egr.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return egr.this.z
               ? azm.a(
                  (double)egr.this.D / (double)egr.this.w,
                  (double)egr.this.E / (double)egr.this.x,
                  (double)egr.this.F / (double)egr.this.w,
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
      public void a(double[] $$0, egg.a $$1) {
         if (egr.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public egg k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public egh.l.a j() {
         return egh.l.a.a;
      }
   }
}
