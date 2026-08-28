import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class edu implements edj.a, edj.b {
   private final edy a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<edu.i> i;
   final List<edu.e> j;
   private final Map<edj, edj> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final edc m;
   private final edj n;
   private final edu.c o;
   private final ees p;
   private final edu.g q;
   private final edu.g r;
   private final edk.c s;
   private long t = dgo.c;
   private ees.a u = new ees.a(1.0, 0.0);
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
   private final edj.a J = new edj.a() {
      @Override
      public edj.b a(int $$0) {
         edu.this.B = ($$0 + edu.this.d) * edu.this.x;
         edu.this.G++;
         edu.this.E = 0;
         edu.this.I = $$0;
         return edu.this;
      }

      @Override
      public void a(double[] $$0, edj $$1) {
         for (int $$2 = 0; $$2 < edu.this.c + 1; $$2++) {
            edu.this.B = ($$2 + edu.this.d) * edu.this.x;
            edu.this.G++;
            edu.this.E = 0;
            edu.this.I = $$2;
            $$0[$$2] = $$1.a(edu.this);
         }
      }
   };

   public static edu a(dzq $$0, eee $$1, edk.c $$2, edv $$3, edc.a $$4, ees $$5) {
      edy $$6 = $$3.f().a($$0);
      dgo $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new edu($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public edu(int $$0, eee $$1, int $$2, int $$3, edy $$4, edk.c $$5, edv $$6, edc.a $$7, ees $$8) {
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
      this.q = new edu.g(new edu.a(), false);
      this.r = new edu.g(new edu.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = kb.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = kb.c($$13);
            ees.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      edw $$16 = $$1.a();
      edw $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = edc.a($$7);
      } else {
         int $$18 = kj.a($$2);
         int $$19 = kj.a($$3);
         this.m = edc.a(this, new dgo($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<edu.c> $$20 = new ArrayList<>();
      edj $$21 = edk.e(edk.a($$17.l(), edk.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(eea.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new emy($$20.toArray(new edu.c[0]));
      this.n = $$17.k();
   }

   protected dit.f a(edw $$0, List<dit.d> $$1) {
      return new dit.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dxv e() {
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
         if (this.n.a(new edj.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public ees d() {
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

         for (edu.i $$4 : this.i) {
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

   public edu c(int $$0) {
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
   public void a(double[] $$0, edj $$1) {
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
      for (edu.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (edu.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (edu.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (edu.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (edu.i $$2 : this.i) {
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
      this.i.forEach(edu.i::l);
   }

   public edc i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   ees.a c(int $$0, int $$1) {
      long $$2 = dgo.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         ees.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected edj a(edj $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private edj b(edj $$0) {
      if ($$0 instanceof edk.l $$1) {
         return (edj)(switch ($$1.j()) {
            case a -> new edu.i($$1.k());
            case b -> new edu.g($$1.k(), true);
            case c -> new edu.d($$1.k());
            case d -> new edu.f($$1.k());
            case e -> new edu.e($$1.k());
         });
      } else {
         if (this.p != ees.a()) {
            if ($$0 == edk.d.a) {
               return this.q;
            }

            if ($$0 == edk.f.a) {
               return this.r;
            }
         }

         if ($$0 == edk.b.a) {
            return this.s;
         } else {
            return $$0 instanceof edk.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements edu.h {
      @Override
      public edj k() {
         return edk.d.a;
      }

      @Override
      public edj a(edj.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(edj.b $$0) {
         return edu.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, edj.a $$1) {
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
      public azx<? extends edj> c() {
         return edk.d.e;
      }
   }

   class b implements edu.h {
      @Override
      public edj k() {
         return edk.f.a;
      }

      @Override
      public edj a(edj.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(edj.b $$0) {
         return edu.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, edj.a $$1) {
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
      public azx<? extends edj> c() {
         return edk.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dxv calculate(edj.b var1);
   }

   static class d implements edk.m, edu.h {
      private final edj a;
      private long e = dgo.c;
      private double f;

      d(edj $$0) {
         this.a = $$0;
      }

      @Override
      public double a(edj.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dgo.c($$1, $$2);
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
      public void a(double[] $$0, edj.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public edj k() {
         return this.a;
      }

      @Override
      public edk.l.a j() {
         return edk.l.a.c;
      }
   }

   class e implements edk.m, edu.h {
      final edj e;
      final double[] f;

      e(final edj $$0) {
         this.e = $$0;
         this.f = new double[edu.this.w * edu.this.w * edu.this.x];
         edu.this.j.add(this);
      }

      @Override
      public double a(edj.b $$0) {
         if ($$0 != edu.this) {
            return this.e.a($$0);
         } else if (!edu.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = edu.this.D;
            int $$2 = edu.this.E;
            int $$3 = edu.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < edu.this.w && $$2 < edu.this.x && $$3 < edu.this.w
               ? this.f[((edu.this.x - 1 - $$2) * edu.this.w + $$1) * edu.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, edj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edj k() {
         return this.e;
      }

      @Override
      public edk.l.a j() {
         return edk.l.a.e;
      }
   }

   class f implements edk.m, edu.h {
      private final edj e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final edj $$0) {
         this.e = $$0;
      }

      @Override
      public double a(edj.b $$0) {
         if ($$0 != edu.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == edu.this.H) {
            return this.i[edu.this.I];
         } else if (this.f == edu.this.G) {
            return this.h;
         } else {
            this.f = edu.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, edj.a $$1) {
         if (this.i != null && this.g == edu.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = edu.this.H;
         }
      }

      @Override
      public edj k() {
         return this.e;
      }

      @Override
      public edk.l.a j() {
         return edk.l.a.d;
      }
   }

   class g implements edk.m, edu.h {
      private final edj e;
      final double[][] f;

      g(final edj $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[edu.this.v + 1][edu.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= edu.this.v; $$2++) {
               int $$3 = edu.this.g + $$2;
               int $$4 = kb.c($$3);

               for (int $$5 = 0; $$5 <= edu.this.v; $$5++) {
                  int $$6 = edu.this.h + $$5;
                  int $$7 = kb.c($$6);
                  this.f[$$2][$$5] = $$0.a(new edj.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(edj.b $$0) {
         int $$1 = kb.a($$0.a());
         int $$2 = kb.a($$0.c());
         int $$3 = $$1 - edu.this.g;
         int $$4 = $$2 - edu.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, edj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edj k() {
         return this.e;
      }

      @Override
      public edk.l.a j() {
         return edk.l.a.b;
      }
   }

   interface h extends edj {
      edj k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements edk.m, edu.h {
      double[][] e;
      double[][] f;
      private final edj g;
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

      i(final edj $$1) {
         this.g = $$1;
         this.e = this.a(edu.this.c, edu.this.b);
         this.f = this.a(edu.this.c, edu.this.b);
         edu.this.i.add(this);
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
      public double a(edj.b $$0) {
         if ($$0 != edu.this) {
            return this.g.a($$0);
         } else if (!edu.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return edu.this.z
               ? bae.a(
                  (double)edu.this.D / (double)edu.this.w,
                  (double)edu.this.E / (double)edu.this.x,
                  (double)edu.this.F / (double)edu.this.w,
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
      public void a(double[] $$0, edj.a $$1) {
         if (edu.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public edj k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public edk.l.a j() {
         return edk.l.a.a;
      }
   }
}
