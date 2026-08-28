import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ehj implements egy.a, egy.b {
   private final ehn a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<ehj.i> i;
   final List<ehj.e> j;
   private final Map<egy, egy> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final egr m;
   private final egy n;
   private final ehj.c o;
   private final eih p;
   private final ehj.g q;
   private final ehj.g r;
   private final egz.c s;
   private long t = dje.c;
   private eih.a u = new eih.a(1.0, 0.0);
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
   private final egy.a J = new egy.a() {
      @Override
      public egy.b a(int $$0) {
         ehj.this.B = ($$0 + ehj.this.d) * ehj.this.x;
         ehj.this.G++;
         ehj.this.E = 0;
         ehj.this.I = $$0;
         return ehj.this;
      }

      @Override
      public void a(double[] $$0, egy $$1) {
         for (int $$2 = 0; $$2 < ehj.this.c + 1; $$2++) {
            ehj.this.B = ($$2 + ehj.this.d) * ehj.this.x;
            ehj.this.G++;
            ehj.this.E = 0;
            ehj.this.I = $$2;
            $$0[$$2] = $$1.a(ehj.this);
         }
      }
   };

   public static ehj a(edd $$0, eht $$1, egz.c $$2, ehk $$3, egr.a $$4, eih $$5) {
      ehn $$6 = $$3.f().a($$0);
      dje $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new ehj($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public ehj(int $$0, eht $$1, int $$2, int $$3, ehn $$4, egz.c $$5, ehk $$6, egr.a $$7, eih $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = azq.a($$4.d(), this.x);
      this.d = azq.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = jr.a($$2);
      this.h = jr.a($$3);
      this.v = jr.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new ehj.g(new ehj.a(), false);
      this.r = new ehj.g(new ehj.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = jr.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = jr.c($$13);
            eih.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      ehl $$16 = $$1.a();
      ehl $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = egr.a($$7);
      } else {
         int $$18 = jz.a($$2);
         int $$19 = jz.a($$3);
         this.m = egr.a(this, new dje($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<ehj.c> $$20 = new ArrayList<>();
      egy $$21 = egz.e(egz.a($$17.l(), egz.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(ehp.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new eqr($$20.toArray(new ehj.c[0]));
      this.n = $$17.k();
   }

   protected dll.f a(ehl $$0, List<dll.d> $$1) {
      return new dll.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected ebg e() {
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
      int $$2 = jr.c(jr.a($$0));
      int $$3 = jr.c(jr.a($$1));
      return this.l.computeIfAbsent(arf.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = arf.a($$0);
      int $$2 = arf.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new egy.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public eih d() {
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

         for (ehj.i $$4 : this.i) {
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

   public ehj c(int $$0) {
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
   public void a(double[] $$0, egy $$1) {
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
      for (ehj.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (ehj.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (ehj.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (ehj.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (ehj.i $$2 : this.i) {
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
      this.i.forEach(ehj.i::l);
   }

   public egr i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   eih.a c(int $$0, int $$1) {
      long $$2 = dje.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         eih.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected egy a(egy $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private egy b(egy $$0) {
      if ($$0 instanceof egz.l $$1) {
         return (egy)(switch ($$1.j()) {
            case a -> new ehj.i($$1.k());
            case b -> new ehj.g($$1.k(), true);
            case c -> new ehj.d($$1.k());
            case d -> new ehj.f($$1.k());
            case e -> new ehj.e($$1.k());
         });
      } else {
         if (this.p != eih.a()) {
            if ($$0 == egz.d.a) {
               return this.q;
            }

            if ($$0 == egz.f.a) {
               return this.r;
            }
         }

         if ($$0 == egz.b.a) {
            return this.s;
         } else {
            return $$0 instanceof egz.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements ehj.h {
      @Override
      public egy k() {
         return egz.d.a;
      }

      @Override
      public egy a(egy.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(egy.b $$0) {
         return ehj.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, egy.a $$1) {
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
      public azj<? extends egy> c() {
         return egz.d.e;
      }
   }

   class b implements ehj.h {
      @Override
      public egy k() {
         return egz.f.a;
      }

      @Override
      public egy a(egy.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(egy.b $$0) {
         return ehj.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, egy.a $$1) {
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
      public azj<? extends egy> c() {
         return egz.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      ebg calculate(egy.b var1);
   }

   static class d implements egz.m, ehj.h {
      private final egy a;
      private long e = dje.c;
      private double f;

      d(egy $$0) {
         this.a = $$0;
      }

      @Override
      public double a(egy.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dje.c($$1, $$2);
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
      public void a(double[] $$0, egy.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public egy k() {
         return this.a;
      }

      @Override
      public egz.l.a j() {
         return egz.l.a.c;
      }
   }

   class e implements egz.m, ehj.h {
      final egy e;
      final double[] f;

      e(final egy $$0) {
         this.e = $$0;
         this.f = new double[ehj.this.w * ehj.this.w * ehj.this.x];
         ehj.this.j.add(this);
      }

      @Override
      public double a(egy.b $$0) {
         if ($$0 != ehj.this) {
            return this.e.a($$0);
         } else if (!ehj.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = ehj.this.D;
            int $$2 = ehj.this.E;
            int $$3 = ehj.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < ehj.this.w && $$2 < ehj.this.x && $$3 < ehj.this.w
               ? this.f[((ehj.this.x - 1 - $$2) * ehj.this.w + $$1) * ehj.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, egy.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public egy k() {
         return this.e;
      }

      @Override
      public egz.l.a j() {
         return egz.l.a.e;
      }
   }

   class f implements egz.m, ehj.h {
      private final egy e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final egy $$0) {
         this.e = $$0;
      }

      @Override
      public double a(egy.b $$0) {
         if ($$0 != ehj.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == ehj.this.H) {
            return this.i[ehj.this.I];
         } else if (this.f == ehj.this.G) {
            return this.h;
         } else {
            this.f = ehj.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, egy.a $$1) {
         if (this.i != null && this.g == ehj.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = ehj.this.H;
         }
      }

      @Override
      public egy k() {
         return this.e;
      }

      @Override
      public egz.l.a j() {
         return egz.l.a.d;
      }
   }

   class g implements egz.m, ehj.h {
      private final egy e;
      final double[][] f;

      g(final egy $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[ehj.this.v + 1][ehj.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= ehj.this.v; $$2++) {
               int $$3 = ehj.this.g + $$2;
               int $$4 = jr.c($$3);

               for (int $$5 = 0; $$5 <= ehj.this.v; $$5++) {
                  int $$6 = ehj.this.h + $$5;
                  int $$7 = jr.c($$6);
                  this.f[$$2][$$5] = $$0.a(new egy.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(egy.b $$0) {
         int $$1 = jr.a($$0.a());
         int $$2 = jr.a($$0.c());
         int $$3 = $$1 - ehj.this.g;
         int $$4 = $$2 - ehj.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, egy.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public egy k() {
         return this.e;
      }

      @Override
      public egz.l.a j() {
         return egz.l.a.b;
      }
   }

   interface h extends egy {
      egy k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements egz.m, ehj.h {
      double[][] e;
      double[][] f;
      private final egy g;
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

      i(final egy $$1) {
         this.g = $$1;
         this.e = this.a(ehj.this.c, ehj.this.b);
         this.f = this.a(ehj.this.c, ehj.this.b);
         ehj.this.i.add(this);
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
         this.p = azq.d($$0, this.h, this.l);
         this.q = azq.d($$0, this.j, this.n);
         this.r = azq.d($$0, this.i, this.m);
         this.s = azq.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = azq.d($$0, this.p, this.q);
         this.u = azq.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = azq.d($$0, this.t, this.u);
      }

      @Override
      public double a(egy.b $$0) {
         if ($$0 != ehj.this) {
            return this.g.a($$0);
         } else if (!ehj.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return ehj.this.z
               ? azq.a(
                  (double)ehj.this.D / (double)ehj.this.w,
                  (double)ehj.this.E / (double)ehj.this.x,
                  (double)ehj.this.F / (double)ehj.this.w,
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
      public void a(double[] $$0, egy.a $$1) {
         if (ehj.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public egy k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public egz.l.a j() {
         return egz.l.a.a;
      }
   }
}
