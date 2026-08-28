import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ehh implements egw.a, egw.b {
   private final ehl a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<ehh.i> i;
   final List<ehh.e> j;
   private final Map<egw, egw> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final egp m;
   private final egw n;
   private final ehh.c o;
   private final eif p;
   private final ehh.g q;
   private final ehh.g r;
   private final egx.c s;
   private long t = djc.c;
   private eif.a u = new eif.a(1.0, 0.0);
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
   private final egw.a J = new egw.a() {
      @Override
      public egw.b a(int $$0) {
         ehh.this.B = ($$0 + ehh.this.d) * ehh.this.x;
         ehh.this.G++;
         ehh.this.E = 0;
         ehh.this.I = $$0;
         return ehh.this;
      }

      @Override
      public void a(double[] $$0, egw $$1) {
         for (int $$2 = 0; $$2 < ehh.this.c + 1; $$2++) {
            ehh.this.B = ($$2 + ehh.this.d) * ehh.this.x;
            ehh.this.G++;
            ehh.this.E = 0;
            ehh.this.I = $$2;
            $$0[$$2] = $$1.a(ehh.this);
         }
      }
   };

   public static ehh a(edb $$0, ehr $$1, egx.c $$2, ehi $$3, egp.a $$4, eif $$5) {
      ehl $$6 = $$3.f().a($$0);
      djc $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new ehh($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public ehh(int $$0, ehr $$1, int $$2, int $$3, ehl $$4, egx.c $$5, ehi $$6, egp.a $$7, eif $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = azo.a($$4.d(), this.x);
      this.d = azo.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = jq.a($$2);
      this.h = jq.a($$3);
      this.v = jq.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new ehh.g(new ehh.a(), false);
      this.r = new ehh.g(new ehh.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = jq.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = jq.c($$13);
            eif.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      ehj $$16 = $$1.a();
      ehj $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = egp.a($$7);
      } else {
         int $$18 = jy.a($$2);
         int $$19 = jy.a($$3);
         this.m = egp.a(this, new djc($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<ehh.c> $$20 = new ArrayList<>();
      egw $$21 = egx.e(egx.a($$17.l(), egx.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(ehn.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new eqp($$20.toArray(new ehh.c[0]));
      this.n = $$17.k();
   }

   protected dlj.f a(ehj $$0, List<dlj.d> $$1) {
      return new dlj.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected ebe e() {
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
      return this.l.computeIfAbsent(ard.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = ard.a($$0);
      int $$2 = ard.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new egw.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public eif d() {
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

         for (ehh.i $$4 : this.i) {
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

   public ehh c(int $$0) {
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
   public void a(double[] $$0, egw $$1) {
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
      for (ehh.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (ehh.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (ehh.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (ehh.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (ehh.i $$2 : this.i) {
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
      this.i.forEach(ehh.i::l);
   }

   public egp i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   eif.a c(int $$0, int $$1) {
      long $$2 = djc.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         eif.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected egw a(egw $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private egw b(egw $$0) {
      if ($$0 instanceof egx.l $$1) {
         return (egw)(switch ($$1.j()) {
            case a -> new ehh.i($$1.k());
            case b -> new ehh.g($$1.k(), true);
            case c -> new ehh.d($$1.k());
            case d -> new ehh.f($$1.k());
            case e -> new ehh.e($$1.k());
         });
      } else {
         if (this.p != eif.a()) {
            if ($$0 == egx.d.a) {
               return this.q;
            }

            if ($$0 == egx.f.a) {
               return this.r;
            }
         }

         if ($$0 == egx.b.a) {
            return this.s;
         } else {
            return $$0 instanceof egx.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements ehh.h {
      @Override
      public egw k() {
         return egx.d.a;
      }

      @Override
      public egw a(egw.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(egw.b $$0) {
         return ehh.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, egw.a $$1) {
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
      public azh<? extends egw> c() {
         return egx.d.e;
      }
   }

   class b implements ehh.h {
      @Override
      public egw k() {
         return egx.f.a;
      }

      @Override
      public egw a(egw.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(egw.b $$0) {
         return ehh.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, egw.a $$1) {
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
      public azh<? extends egw> c() {
         return egx.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      ebe calculate(egw.b var1);
   }

   static class d implements egx.m, ehh.h {
      private final egw a;
      private long e = djc.c;
      private double f;

      d(egw $$0) {
         this.a = $$0;
      }

      @Override
      public double a(egw.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = djc.c($$1, $$2);
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
      public void a(double[] $$0, egw.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public egw k() {
         return this.a;
      }

      @Override
      public egx.l.a j() {
         return egx.l.a.c;
      }
   }

   class e implements egx.m, ehh.h {
      final egw e;
      final double[] f;

      e(final egw $$0) {
         this.e = $$0;
         this.f = new double[ehh.this.w * ehh.this.w * ehh.this.x];
         ehh.this.j.add(this);
      }

      @Override
      public double a(egw.b $$0) {
         if ($$0 != ehh.this) {
            return this.e.a($$0);
         } else if (!ehh.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = ehh.this.D;
            int $$2 = ehh.this.E;
            int $$3 = ehh.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < ehh.this.w && $$2 < ehh.this.x && $$3 < ehh.this.w
               ? this.f[((ehh.this.x - 1 - $$2) * ehh.this.w + $$1) * ehh.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, egw.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public egw k() {
         return this.e;
      }

      @Override
      public egx.l.a j() {
         return egx.l.a.e;
      }
   }

   class f implements egx.m, ehh.h {
      private final egw e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final egw $$0) {
         this.e = $$0;
      }

      @Override
      public double a(egw.b $$0) {
         if ($$0 != ehh.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == ehh.this.H) {
            return this.i[ehh.this.I];
         } else if (this.f == ehh.this.G) {
            return this.h;
         } else {
            this.f = ehh.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, egw.a $$1) {
         if (this.i != null && this.g == ehh.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = ehh.this.H;
         }
      }

      @Override
      public egw k() {
         return this.e;
      }

      @Override
      public egx.l.a j() {
         return egx.l.a.d;
      }
   }

   class g implements egx.m, ehh.h {
      private final egw e;
      final double[][] f;

      g(final egw $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[ehh.this.v + 1][ehh.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= ehh.this.v; $$2++) {
               int $$3 = ehh.this.g + $$2;
               int $$4 = jq.c($$3);

               for (int $$5 = 0; $$5 <= ehh.this.v; $$5++) {
                  int $$6 = ehh.this.h + $$5;
                  int $$7 = jq.c($$6);
                  this.f[$$2][$$5] = $$0.a(new egw.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(egw.b $$0) {
         int $$1 = jq.a($$0.a());
         int $$2 = jq.a($$0.c());
         int $$3 = $$1 - ehh.this.g;
         int $$4 = $$2 - ehh.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, egw.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public egw k() {
         return this.e;
      }

      @Override
      public egx.l.a j() {
         return egx.l.a.b;
      }
   }

   interface h extends egw {
      egw k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements egx.m, ehh.h {
      double[][] e;
      double[][] f;
      private final egw g;
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

      i(final egw $$1) {
         this.g = $$1;
         this.e = this.a(ehh.this.c, ehh.this.b);
         this.f = this.a(ehh.this.c, ehh.this.b);
         ehh.this.i.add(this);
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
         this.p = azo.d($$0, this.h, this.l);
         this.q = azo.d($$0, this.j, this.n);
         this.r = azo.d($$0, this.i, this.m);
         this.s = azo.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = azo.d($$0, this.p, this.q);
         this.u = azo.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = azo.d($$0, this.t, this.u);
      }

      @Override
      public double a(egw.b $$0) {
         if ($$0 != ehh.this) {
            return this.g.a($$0);
         } else if (!ehh.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return ehh.this.z
               ? azo.a(
                  (double)ehh.this.D / (double)ehh.this.w,
                  (double)ehh.this.E / (double)ehh.this.x,
                  (double)ehh.this.F / (double)ehh.this.w,
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
      public void a(double[] $$0, egw.a $$1) {
         if (ehh.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public egw k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public egx.l.a j() {
         return egx.l.a.a;
      }
   }
}
