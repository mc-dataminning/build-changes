import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class eao implements ead.a, ead.b {
   private final eas a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<eao.i> i;
   final List<eao.e> j;
   private final Map<ead, ead> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dzw m;
   private final ead n;
   private final eao.c o;
   private final ebm p;
   private final eao.g q;
   private final eao.g r;
   private final eae.c s;
   private long t = ddm.a;
   private ebm.a u = new ebm.a(1.0, 0.0);
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
   private final ead.a J = new ead.a() {
      @Override
      public ead.b a(int $$0) {
         eao.this.B = ($$0 + eao.this.d) * eao.this.x;
         eao.this.G++;
         eao.this.E = 0;
         eao.this.I = $$0;
         return eao.this;
      }

      @Override
      public void a(double[] $$0, ead $$1) {
         for (int $$2 = 0; $$2 < eao.this.c + 1; $$2++) {
            eao.this.B = ($$2 + eao.this.d) * eao.this.x;
            eao.this.G++;
            eao.this.E = 0;
            eao.this.I = $$2;
            $$0[$$2] = $$1.a(eao.this);
         }
      }
   };

   public static eao a(dwk $$0, eay $$1, eae.c $$2, eap $$3, dzw.a $$4, ebm $$5) {
      eas $$6 = $$3.f().a($$0);
      ddm $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new eao($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public eao(int $$0, eay $$1, int $$2, int $$3, eas $$4, eae.c $$5, eap $$6, dzw.a $$7, ebm $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = azd.a($$4.d(), this.x);
      this.d = azd.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = jy.a($$2);
      this.h = jy.a($$3);
      this.v = jy.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new eao.g(new eao.a(), false);
      this.r = new eao.g(new eao.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = jy.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = jy.c($$13);
            ebm.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      eaq $$16 = $$1.a();
      eaq $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dzw.a($$7);
      } else {
         int $$18 = kg.a($$2);
         int $$19 = kg.a($$3);
         this.m = dzw.a(this, new ddm($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<eao.c> $$20 = new ArrayList<>();
      ead $$21 = eae.e(eae.a($$17.l(), eae.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(eau.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new ejq($$20.toArray(new eao.c[0]));
      this.n = $$17.k();
   }

   protected dfq.f a(eaq $$0, List<dfq.d> $$1) {
      return new dfq.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected duo e() {
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
      int $$2 = jy.c(jy.a($$0));
      int $$3 = jy.c(jy.a($$1));
      return this.l.computeIfAbsent(aqu.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = aqu.a($$0);
      int $$2 = aqu.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new ead.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public ebm d() {
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

         for (eao.i $$4 : this.i) {
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

   public eao c(int $$0) {
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
   public void a(double[] $$0, ead $$1) {
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
      for (eao.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (eao.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (eao.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (eao.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (eao.i $$2 : this.i) {
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
      this.i.forEach(eao.i::l);
   }

   public dzw i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   ebm.a c(int $$0, int $$1) {
      long $$2 = ddm.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         ebm.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected ead a(ead $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private ead b(ead $$0) {
      if ($$0 instanceof eae.l $$1) {
         return (ead)(switch ($$1.j()) {
            case a -> new eao.i($$1.k());
            case b -> new eao.g($$1.k(), true);
            case c -> new eao.d($$1.k());
            case d -> new eao.f($$1.k());
            case e -> new eao.e($$1.k());
         });
      } else {
         if (this.p != ebm.a()) {
            if ($$0 == eae.d.a) {
               return this.q;
            }

            if ($$0 == eae.f.a) {
               return this.r;
            }
         }

         if ($$0 == eae.b.a) {
            return this.s;
         } else {
            return $$0 instanceof eae.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements eao.h {
      @Override
      public ead k() {
         return eae.d.a;
      }

      @Override
      public ead a(ead.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(ead.b $$0) {
         return eao.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, ead.a $$1) {
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
      public ayw<? extends ead> c() {
         return eae.d.e;
      }
   }

   class b implements eao.h {
      @Override
      public ead k() {
         return eae.f.a;
      }

      @Override
      public ead a(ead.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(ead.b $$0) {
         return eao.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, ead.a $$1) {
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
      public ayw<? extends ead> c() {
         return eae.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      duo calculate(ead.b var1);
   }

   static class d implements eae.m, eao.h {
      private final ead a;
      private long e = ddm.a;
      private double f;

      d(ead $$0) {
         this.a = $$0;
      }

      @Override
      public double a(ead.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = ddm.c($$1, $$2);
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
      public void a(double[] $$0, ead.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public ead k() {
         return this.a;
      }

      @Override
      public eae.l.a j() {
         return eae.l.a.c;
      }
   }

   class e implements eae.m, eao.h {
      final ead e;
      final double[] f;

      e(final ead $$0) {
         this.e = $$0;
         this.f = new double[eao.this.w * eao.this.w * eao.this.x];
         eao.this.j.add(this);
      }

      @Override
      public double a(ead.b $$0) {
         if ($$0 != eao.this) {
            return this.e.a($$0);
         } else if (!eao.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = eao.this.D;
            int $$2 = eao.this.E;
            int $$3 = eao.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < eao.this.w && $$2 < eao.this.x && $$3 < eao.this.w
               ? this.f[((eao.this.x - 1 - $$2) * eao.this.w + $$1) * eao.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, ead.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ead k() {
         return this.e;
      }

      @Override
      public eae.l.a j() {
         return eae.l.a.e;
      }
   }

   class f implements eae.m, eao.h {
      private final ead e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final ead $$0) {
         this.e = $$0;
      }

      @Override
      public double a(ead.b $$0) {
         if ($$0 != eao.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == eao.this.H) {
            return this.i[eao.this.I];
         } else if (this.f == eao.this.G) {
            return this.h;
         } else {
            this.f = eao.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, ead.a $$1) {
         if (this.i != null && this.g == eao.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = eao.this.H;
         }
      }

      @Override
      public ead k() {
         return this.e;
      }

      @Override
      public eae.l.a j() {
         return eae.l.a.d;
      }
   }

   class g implements eae.m, eao.h {
      private final ead e;
      final double[][] f;

      g(final ead $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[eao.this.v + 1][eao.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= eao.this.v; $$2++) {
               int $$3 = eao.this.g + $$2;
               int $$4 = jy.c($$3);

               for (int $$5 = 0; $$5 <= eao.this.v; $$5++) {
                  int $$6 = eao.this.h + $$5;
                  int $$7 = jy.c($$6);
                  this.f[$$2][$$5] = $$0.a(new ead.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(ead.b $$0) {
         int $$1 = jy.a($$0.a());
         int $$2 = jy.a($$0.c());
         int $$3 = $$1 - eao.this.g;
         int $$4 = $$2 - eao.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, ead.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ead k() {
         return this.e;
      }

      @Override
      public eae.l.a j() {
         return eae.l.a.b;
      }
   }

   interface h extends ead {
      ead k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements eae.m, eao.h {
      double[][] e;
      double[][] f;
      private final ead g;
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

      i(final ead $$1) {
         this.g = $$1;
         this.e = this.a(eao.this.c, eao.this.b);
         this.f = this.a(eao.this.c, eao.this.b);
         eao.this.i.add(this);
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
         this.p = azd.d($$0, this.h, this.l);
         this.q = azd.d($$0, this.j, this.n);
         this.r = azd.d($$0, this.i, this.m);
         this.s = azd.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = azd.d($$0, this.p, this.q);
         this.u = azd.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = azd.d($$0, this.t, this.u);
      }

      @Override
      public double a(ead.b $$0) {
         if ($$0 != eao.this) {
            return this.g.a($$0);
         } else if (!eao.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return eao.this.z
               ? azd.a(
                  (double)eao.this.D / (double)eao.this.w,
                  (double)eao.this.E / (double)eao.this.x,
                  (double)eao.this.F / (double)eao.this.w,
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
      public void a(double[] $$0, ead.a $$1) {
         if (eao.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public ead k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public eae.l.a j() {
         return eae.l.a.a;
      }
   }
}
