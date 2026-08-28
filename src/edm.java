import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class edm implements edb.a, edb.b {
   private final edq a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<edm.i> i;
   final List<edm.e> j;
   private final Map<edb, edb> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final ecu m;
   private final edb n;
   private final edm.c o;
   private final eek p;
   private final edm.g q;
   private final edm.g r;
   private final edc.c s;
   private long t = dgg.c;
   private eek.a u = new eek.a(1.0, 0.0);
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
   private final edb.a J = new edb.a() {
      @Override
      public edb.b a(int $$0) {
         edm.this.B = ($$0 + edm.this.d) * edm.this.x;
         edm.this.G++;
         edm.this.E = 0;
         edm.this.I = $$0;
         return edm.this;
      }

      @Override
      public void a(double[] $$0, edb $$1) {
         for (int $$2 = 0; $$2 < edm.this.c + 1; $$2++) {
            edm.this.B = ($$2 + edm.this.d) * edm.this.x;
            edm.this.G++;
            edm.this.E = 0;
            edm.this.I = $$2;
            $$0[$$2] = $$1.a(edm.this);
         }
      }
   };

   public static edm a(dzi $$0, edw $$1, edc.c $$2, edn $$3, ecu.a $$4, eek $$5) {
      edq $$6 = $$3.f().a($$0);
      dgg $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new edm($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public edm(int $$0, edw $$1, int $$2, int $$3, edq $$4, edc.c $$5, edn $$6, ecu.a $$7, eek $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = bae.a($$4.d(), this.x);
      this.d = bae.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = kb.a($$2);
      this.h = kb.a($$3);
      this.v = kb.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new edm.g(new edm.a(), false);
      this.r = new edm.g(new edm.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = kb.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = kb.c($$13);
            eek.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      edo $$16 = $$1.a();
      edo $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = ecu.a($$7);
      } else {
         int $$18 = kj.a($$2);
         int $$19 = kj.a($$3);
         this.m = ecu.a(this, new dgg($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<edm.c> $$20 = new ArrayList<>();
      edb $$21 = edc.e(edc.a($$17.l(), edc.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(eds.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new emq($$20.toArray(new edm.c[0]));
      this.n = $$17.k();
   }

   protected dil.f a(edo $$0, List<dil.d> $$1) {
      return new dil.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dxn e() {
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
      int $$2 = kb.c(kb.a($$0));
      int $$3 = kb.c(kb.a($$1));
      return this.l.computeIfAbsent(art.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = art.a($$0);
      int $$2 = art.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new edb.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public eek d() {
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

         for (edm.i $$4 : this.i) {
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

   public edm c(int $$0) {
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
   public void a(double[] $$0, edb $$1) {
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
      for (edm.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (edm.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (edm.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (edm.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (edm.i $$2 : this.i) {
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
      this.i.forEach(edm.i::l);
   }

   public ecu i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   eek.a c(int $$0, int $$1) {
      long $$2 = dgg.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         eek.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected edb a(edb $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private edb b(edb $$0) {
      if ($$0 instanceof edc.l $$1) {
         return (edb)(switch ($$1.j()) {
            case a -> new edm.i($$1.k());
            case b -> new edm.g($$1.k(), true);
            case c -> new edm.d($$1.k());
            case d -> new edm.f($$1.k());
            case e -> new edm.e($$1.k());
         });
      } else {
         if (this.p != eek.a()) {
            if ($$0 == edc.d.a) {
               return this.q;
            }

            if ($$0 == edc.f.a) {
               return this.r;
            }
         }

         if ($$0 == edc.b.a) {
            return this.s;
         } else {
            return $$0 instanceof edc.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements edm.h {
      @Override
      public edb k() {
         return edc.d.a;
      }

      @Override
      public edb a(edb.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(edb.b $$0) {
         return edm.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, edb.a $$1) {
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
      public azx<? extends edb> c() {
         return edc.d.e;
      }
   }

   class b implements edm.h {
      @Override
      public edb k() {
         return edc.f.a;
      }

      @Override
      public edb a(edb.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(edb.b $$0) {
         return edm.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, edb.a $$1) {
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
      public azx<? extends edb> c() {
         return edc.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dxn calculate(edb.b var1);
   }

   static class d implements edc.m, edm.h {
      private final edb a;
      private long e = dgg.c;
      private double f;

      d(edb $$0) {
         this.a = $$0;
      }

      @Override
      public double a(edb.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dgg.c($$1, $$2);
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
      public void a(double[] $$0, edb.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public edb k() {
         return this.a;
      }

      @Override
      public edc.l.a j() {
         return edc.l.a.c;
      }
   }

   class e implements edc.m, edm.h {
      final edb e;
      final double[] f;

      e(final edb $$0) {
         this.e = $$0;
         this.f = new double[edm.this.w * edm.this.w * edm.this.x];
         edm.this.j.add(this);
      }

      @Override
      public double a(edb.b $$0) {
         if ($$0 != edm.this) {
            return this.e.a($$0);
         } else if (!edm.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = edm.this.D;
            int $$2 = edm.this.E;
            int $$3 = edm.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < edm.this.w && $$2 < edm.this.x && $$3 < edm.this.w
               ? this.f[((edm.this.x - 1 - $$2) * edm.this.w + $$1) * edm.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, edb.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edb k() {
         return this.e;
      }

      @Override
      public edc.l.a j() {
         return edc.l.a.e;
      }
   }

   class f implements edc.m, edm.h {
      private final edb e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final edb $$0) {
         this.e = $$0;
      }

      @Override
      public double a(edb.b $$0) {
         if ($$0 != edm.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == edm.this.H) {
            return this.i[edm.this.I];
         } else if (this.f == edm.this.G) {
            return this.h;
         } else {
            this.f = edm.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, edb.a $$1) {
         if (this.i != null && this.g == edm.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = edm.this.H;
         }
      }

      @Override
      public edb k() {
         return this.e;
      }

      @Override
      public edc.l.a j() {
         return edc.l.a.d;
      }
   }

   class g implements edc.m, edm.h {
      private final edb e;
      final double[][] f;

      g(final edb $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[edm.this.v + 1][edm.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= edm.this.v; $$2++) {
               int $$3 = edm.this.g + $$2;
               int $$4 = kb.c($$3);

               for (int $$5 = 0; $$5 <= edm.this.v; $$5++) {
                  int $$6 = edm.this.h + $$5;
                  int $$7 = kb.c($$6);
                  this.f[$$2][$$5] = $$0.a(new edb.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(edb.b $$0) {
         int $$1 = kb.a($$0.a());
         int $$2 = kb.a($$0.c());
         int $$3 = $$1 - edm.this.g;
         int $$4 = $$2 - edm.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, edb.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edb k() {
         return this.e;
      }

      @Override
      public edc.l.a j() {
         return edc.l.a.b;
      }
   }

   interface h extends edb {
      edb k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements edc.m, edm.h {
      double[][] e;
      double[][] f;
      private final edb g;
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

      i(final edb $$1) {
         this.g = $$1;
         this.e = this.a(edm.this.c, edm.this.b);
         this.f = this.a(edm.this.c, edm.this.b);
         edm.this.i.add(this);
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
         this.p = bae.d($$0, this.h, this.l);
         this.q = bae.d($$0, this.j, this.n);
         this.r = bae.d($$0, this.i, this.m);
         this.s = bae.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = bae.d($$0, this.p, this.q);
         this.u = bae.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = bae.d($$0, this.t, this.u);
      }

      @Override
      public double a(edb.b $$0) {
         if ($$0 != edm.this) {
            return this.g.a($$0);
         } else if (!edm.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return edm.this.z
               ? bae.a(
                  (double)edm.this.D / (double)edm.this.w,
                  (double)edm.this.E / (double)edm.this.x,
                  (double)edm.this.F / (double)edm.this.w,
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
      public void a(double[] $$0, edb.a $$1) {
         if (edm.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public edb k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public edc.l.a j() {
         return edc.l.a.a;
      }
   }
}
