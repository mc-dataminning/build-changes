import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ebd implements eas.a, eas.b {
   private final ebh a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<ebd.i> i;
   final List<ebd.e> j;
   private final Map<eas, eas> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final eal m;
   private final eas n;
   private final ebd.c o;
   private final ecb p;
   private final ebd.g q;
   private final ebd.g r;
   private final eat.c s;
   private long t = deb.a;
   private ecb.a u = new ecb.a(1.0, 0.0);
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
   private final eas.a J = new eas.a() {
      @Override
      public eas.b a(int $$0) {
         ebd.this.B = ($$0 + ebd.this.d) * ebd.this.x;
         ebd.this.G++;
         ebd.this.E = 0;
         ebd.this.I = $$0;
         return ebd.this;
      }

      @Override
      public void a(double[] $$0, eas $$1) {
         for (int $$2 = 0; $$2 < ebd.this.c + 1; $$2++) {
            ebd.this.B = ($$2 + ebd.this.d) * ebd.this.x;
            ebd.this.G++;
            ebd.this.E = 0;
            ebd.this.I = $$2;
            $$0[$$2] = $$1.a(ebd.this);
         }
      }
   };

   public static ebd a(dwz $$0, ebn $$1, eat.c $$2, ebe $$3, eal.a $$4, ecb $$5) {
      ebh $$6 = $$3.f().a($$0);
      deb $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new ebd($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public ebd(int $$0, ebn $$1, int $$2, int $$3, ebh $$4, eat.c $$5, ebe $$6, eal.a $$7, ecb $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = azj.a($$4.d(), this.x);
      this.d = azj.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = ka.a($$2);
      this.h = ka.a($$3);
      this.v = ka.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new ebd.g(new ebd.a(), false);
      this.r = new ebd.g(new ebd.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = ka.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = ka.c($$13);
            ecb.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      ebf $$16 = $$1.a();
      ebf $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = eal.a($$7);
      } else {
         int $$18 = ki.a($$2);
         int $$19 = ki.a($$3);
         this.m = eal.a(this, new deb($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<ebd.c> $$20 = new ArrayList<>();
      eas $$21 = eat.e(eat.a($$17.l(), eat.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(ebj.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new ekf($$20.toArray(new ebd.c[0]));
      this.n = $$17.k();
   }

   protected dgf.f a(ebf $$0, List<dgf.d> $$1) {
      return new dgf.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dvd e() {
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
      int $$2 = ka.c(ka.a($$0));
      int $$3 = ka.c(ka.a($$1));
      return this.l.computeIfAbsent(aqz.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aqz.a($$0);
      int $$2 = aqz.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new eas.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public ecb d() {
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

         for (ebd.i $$4 : this.i) {
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

   public ebd c(int $$0) {
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
   public void a(double[] $$0, eas $$1) {
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
      for (ebd.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (ebd.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (ebd.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (ebd.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (ebd.i $$2 : this.i) {
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
      this.i.forEach(ebd.i::l);
   }

   public eal i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   ecb.a c(int $$0, int $$1) {
      long $$2 = deb.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         ecb.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected eas a(eas $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private eas b(eas $$0) {
      if ($$0 instanceof eat.l $$1) {
         return (eas)(switch ($$1.j()) {
            case a -> new ebd.i($$1.k());
            case b -> new ebd.g($$1.k(), true);
            case c -> new ebd.d($$1.k());
            case d -> new ebd.f($$1.k());
            case e -> new ebd.e($$1.k());
         });
      } else {
         if (this.p != ecb.a()) {
            if ($$0 == eat.d.a) {
               return this.q;
            }

            if ($$0 == eat.f.a) {
               return this.r;
            }
         }

         if ($$0 == eat.b.a) {
            return this.s;
         } else {
            return $$0 instanceof eat.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements ebd.h {
      @Override
      public eas k() {
         return eat.d.a;
      }

      @Override
      public eas a(eas.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(eas.b $$0) {
         return ebd.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, eas.a $$1) {
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
      public azc<? extends eas> c() {
         return eat.d.e;
      }
   }

   class b implements ebd.h {
      @Override
      public eas k() {
         return eat.f.a;
      }

      @Override
      public eas a(eas.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(eas.b $$0) {
         return ebd.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, eas.a $$1) {
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
      public azc<? extends eas> c() {
         return eat.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dvd calculate(eas.b var1);
   }

   static class d implements eat.m, ebd.h {
      private final eas a;
      private long e = deb.a;
      private double f;

      d(eas $$0) {
         this.a = $$0;
      }

      @Override
      public double a(eas.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = deb.c($$1, $$2);
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
      public void a(double[] $$0, eas.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public eas k() {
         return this.a;
      }

      @Override
      public eat.l.a j() {
         return eat.l.a.c;
      }
   }

   class e implements eat.m, ebd.h {
      final eas e;
      final double[] f;

      e(final eas $$0) {
         this.e = $$0;
         this.f = new double[ebd.this.w * ebd.this.w * ebd.this.x];
         ebd.this.j.add(this);
      }

      @Override
      public double a(eas.b $$0) {
         if ($$0 != ebd.this) {
            return this.e.a($$0);
         } else if (!ebd.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = ebd.this.D;
            int $$2 = ebd.this.E;
            int $$3 = ebd.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < ebd.this.w && $$2 < ebd.this.x && $$3 < ebd.this.w
               ? this.f[((ebd.this.x - 1 - $$2) * ebd.this.w + $$1) * ebd.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, eas.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eas k() {
         return this.e;
      }

      @Override
      public eat.l.a j() {
         return eat.l.a.e;
      }
   }

   class f implements eat.m, ebd.h {
      private final eas e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final eas $$0) {
         this.e = $$0;
      }

      @Override
      public double a(eas.b $$0) {
         if ($$0 != ebd.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == ebd.this.H) {
            return this.i[ebd.this.I];
         } else if (this.f == ebd.this.G) {
            return this.h;
         } else {
            this.f = ebd.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, eas.a $$1) {
         if (this.i != null && this.g == ebd.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = ebd.this.H;
         }
      }

      @Override
      public eas k() {
         return this.e;
      }

      @Override
      public eat.l.a j() {
         return eat.l.a.d;
      }
   }

   class g implements eat.m, ebd.h {
      private final eas e;
      final double[][] f;

      g(final eas $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[ebd.this.v + 1][ebd.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= ebd.this.v; $$2++) {
               int $$3 = ebd.this.g + $$2;
               int $$4 = ka.c($$3);

               for (int $$5 = 0; $$5 <= ebd.this.v; $$5++) {
                  int $$6 = ebd.this.h + $$5;
                  int $$7 = ka.c($$6);
                  this.f[$$2][$$5] = $$0.a(new eas.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(eas.b $$0) {
         int $$1 = ka.a($$0.a());
         int $$2 = ka.a($$0.c());
         int $$3 = $$1 - ebd.this.g;
         int $$4 = $$2 - ebd.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, eas.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public eas k() {
         return this.e;
      }

      @Override
      public eat.l.a j() {
         return eat.l.a.b;
      }
   }

   interface h extends eas {
      eas k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements eat.m, ebd.h {
      double[][] e;
      double[][] f;
      private final eas g;
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

      i(final eas $$1) {
         this.g = $$1;
         this.e = this.a(ebd.this.c, ebd.this.b);
         this.f = this.a(ebd.this.c, ebd.this.b);
         ebd.this.i.add(this);
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
         this.p = azj.d($$0, this.h, this.l);
         this.q = azj.d($$0, this.j, this.n);
         this.r = azj.d($$0, this.i, this.m);
         this.s = azj.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = azj.d($$0, this.p, this.q);
         this.u = azj.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = azj.d($$0, this.t, this.u);
      }

      @Override
      public double a(eas.b $$0) {
         if ($$0 != ebd.this) {
            return this.g.a($$0);
         } else if (!ebd.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return ebd.this.z
               ? azj.a(
                  (double)ebd.this.D / (double)ebd.this.w,
                  (double)ebd.this.E / (double)ebd.this.x,
                  (double)ebd.this.F / (double)ebd.this.w,
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
      public void a(double[] $$0, eas.a $$1) {
         if (ebd.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public eas k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public eat.l.a j() {
         return eat.l.a.a;
      }
   }
}
