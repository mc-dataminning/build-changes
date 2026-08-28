import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class edt implements edi.a, edi.b {
   private final edx a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<edt.i> i;
   final List<edt.e> j;
   private final Map<edi, edi> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final edb m;
   private final edi n;
   private final edt.c o;
   private final eer p;
   private final edt.g q;
   private final edt.g r;
   private final edj.c s;
   private long t = dgn.c;
   private eer.a u = new eer.a(1.0, 0.0);
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
   private final edi.a J = new edi.a() {
      @Override
      public edi.b a(int $$0) {
         edt.this.B = ($$0 + edt.this.d) * edt.this.x;
         edt.this.G++;
         edt.this.E = 0;
         edt.this.I = $$0;
         return edt.this;
      }

      @Override
      public void a(double[] $$0, edi $$1) {
         for (int $$2 = 0; $$2 < edt.this.c + 1; $$2++) {
            edt.this.B = ($$2 + edt.this.d) * edt.this.x;
            edt.this.G++;
            edt.this.E = 0;
            edt.this.I = $$2;
            $$0[$$2] = $$1.a(edt.this);
         }
      }
   };

   public static edt a(dzp $$0, eed $$1, edj.c $$2, edu $$3, edb.a $$4, eer $$5) {
      edx $$6 = $$3.f().a($$0);
      dgn $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new edt($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public edt(int $$0, eed $$1, int $$2, int $$3, edx $$4, edj.c $$5, edu $$6, edb.a $$7, eer $$8) {
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
      this.q = new edt.g(new edt.a(), false);
      this.r = new edt.g(new edt.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = kb.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = kb.c($$13);
            eer.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      edv $$16 = $$1.a();
      edv $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = edb.a($$7);
      } else {
         int $$18 = kj.a($$2);
         int $$19 = kj.a($$3);
         this.m = edb.a(this, new dgn($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      List<edt.c> $$20 = new ArrayList<>();
      edi $$21 = edj.e(edj.a($$17.l(), edj.b.a)).a(this::a);
      $$20.add($$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(edz.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new emx($$20.toArray(new edt.c[0]));
      this.n = $$17.k();
   }

   protected dis.f a(edv $$0, List<dis.d> $$1) {
      return new dis.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dxu e() {
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
         if (this.n.a(new edi.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public eer d() {
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

         for (edt.i $$4 : this.i) {
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

   public edt c(int $$0) {
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
   public void a(double[] $$0, edi $$1) {
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
      for (edt.i $$2 : this.i) {
         $$2.b($$0, $$1);
      }

      this.z = true;
      this.B = ($$0 + this.d) * this.x;
      this.C = (this.f + $$1) * this.w;
      this.H++;

      for (edt.e $$3 : this.j) {
         $$3.e.a($$3.f, this);
      }

      this.H++;
      this.z = false;
   }

   public void a(int $$0, double $$1) {
      this.E = $$0 - this.B;

      for (edt.i $$2 : this.i) {
         $$2.a($$1);
      }
   }

   public void b(int $$0, double $$1) {
      this.D = $$0 - this.A;

      for (edt.i $$2 : this.i) {
         $$2.b($$1);
      }
   }

   public void c(int $$0, double $$1) {
      this.F = $$0 - this.C;
      this.G++;

      for (edt.i $$2 : this.i) {
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
      this.i.forEach(edt.i::l);
   }

   public edb i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   eer.a c(int $$0, int $$1) {
      long $$2 = dgn.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         eer.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected edi a(edi $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private edi b(edi $$0) {
      if ($$0 instanceof edj.l $$1) {
         return (edi)(switch ($$1.j()) {
            case a -> new edt.i($$1.k());
            case b -> new edt.g($$1.k(), true);
            case c -> new edt.d($$1.k());
            case d -> new edt.f($$1.k());
            case e -> new edt.e($$1.k());
         });
      } else {
         if (this.p != eer.a()) {
            if ($$0 == edj.d.a) {
               return this.q;
            }

            if ($$0 == edj.f.a) {
               return this.r;
            }
         }

         if ($$0 == edj.b.a) {
            return this.s;
         } else {
            return $$0 instanceof edj.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements edt.h {
      @Override
      public edi k() {
         return edj.d.a;
      }

      @Override
      public edi a(edi.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(edi.b $$0) {
         return edt.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, edi.a $$1) {
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
      public azx<? extends edi> c() {
         return edj.d.e;
      }
   }

   class b implements edt.h {
      @Override
      public edi k() {
         return edj.f.a;
      }

      @Override
      public edi a(edi.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(edi.b $$0) {
         return edt.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, edi.a $$1) {
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
      public azx<? extends edi> c() {
         return edj.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dxu calculate(edi.b var1);
   }

   static class d implements edj.m, edt.h {
      private final edi a;
      private long e = dgn.c;
      private double f;

      d(edi $$0) {
         this.a = $$0;
      }

      @Override
      public double a(edi.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = dgn.c($$1, $$2);
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
      public void a(double[] $$0, edi.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public edi k() {
         return this.a;
      }

      @Override
      public edj.l.a j() {
         return edj.l.a.c;
      }
   }

   class e implements edj.m, edt.h {
      final edi e;
      final double[] f;

      e(final edi $$0) {
         this.e = $$0;
         this.f = new double[edt.this.w * edt.this.w * edt.this.x];
         edt.this.j.add(this);
      }

      @Override
      public double a(edi.b $$0) {
         if ($$0 != edt.this) {
            return this.e.a($$0);
         } else if (!edt.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = edt.this.D;
            int $$2 = edt.this.E;
            int $$3 = edt.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < edt.this.w && $$2 < edt.this.x && $$3 < edt.this.w
               ? this.f[((edt.this.x - 1 - $$2) * edt.this.w + $$1) * edt.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, edi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edi k() {
         return this.e;
      }

      @Override
      public edj.l.a j() {
         return edj.l.a.e;
      }
   }

   class f implements edj.m, edt.h {
      private final edi e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(final edi $$0) {
         this.e = $$0;
      }

      @Override
      public double a(edi.b $$0) {
         if ($$0 != edt.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == edt.this.H) {
            return this.i[edt.this.I];
         } else if (this.f == edt.this.G) {
            return this.h;
         } else {
            this.f = edt.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, edi.a $$1) {
         if (this.i != null && this.g == edt.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = edt.this.H;
         }
      }

      @Override
      public edi k() {
         return this.e;
      }

      @Override
      public edj.l.a j() {
         return edj.l.a.d;
      }
   }

   class g implements edj.m, edt.h {
      private final edi e;
      final double[][] f;

      g(final edi $$0, final boolean $$1) {
         this.e = $$0;
         this.f = new double[edt.this.v + 1][edt.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= edt.this.v; $$2++) {
               int $$3 = edt.this.g + $$2;
               int $$4 = kb.c($$3);

               for (int $$5 = 0; $$5 <= edt.this.v; $$5++) {
                  int $$6 = edt.this.h + $$5;
                  int $$7 = kb.c($$6);
                  this.f[$$2][$$5] = $$0.a(new edi.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(edi.b $$0) {
         int $$1 = kb.a($$0.a());
         int $$2 = kb.a($$0.c());
         int $$3 = $$1 - edt.this.g;
         int $$4 = $$2 - edt.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, edi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public edi k() {
         return this.e;
      }

      @Override
      public edj.l.a j() {
         return edj.l.a.b;
      }
   }

   interface h extends edi {
      edi k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements edj.m, edt.h {
      double[][] e;
      double[][] f;
      private final edi g;
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

      i(final edi $$1) {
         this.g = $$1;
         this.e = this.a(edt.this.c, edt.this.b);
         this.f = this.a(edt.this.c, edt.this.b);
         edt.this.i.add(this);
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
      public double a(edi.b $$0) {
         if ($$0 != edt.this) {
            return this.g.a($$0);
         } else if (!edt.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return edt.this.z
               ? bae.a(
                  (double)edt.this.D / (double)edt.this.w,
                  (double)edt.this.E / (double)edt.this.x,
                  (double)edt.this.F / (double)edt.this.w,
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
      public void a(double[] $$0, edi.a $$1) {
         if (edt.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public edi k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public edj.l.a j() {
         return edj.l.a.a;
      }
   }
}
