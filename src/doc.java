import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class doc implements dnr.a, dnr.b {
   private final dog a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<doc.i> i;
   final List<doc.e> j;
   private final Map<dnr, dnr> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dnk m;
   private final dnr n;
   private final doc.c o;
   private final dpa p;
   private final doc.g q;
   private final doc.g r;
   private final dns.c s;
   private long t = csf.a;
   private dpa.a u = new dpa.a(1.0, 0.0);
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
   private final dnr.a J = new dnr.a() {
      @Override
      public dnr.b a(int $$0) {
         doc.this.B = ($$0 + doc.this.d) * doc.this.x;
         doc.this.G++;
         doc.this.E = 0;
         doc.this.I = $$0;
         return doc.this;
      }

      @Override
      public void a(double[] $$0, dnr $$1) {
         for (int $$2 = 0; $$2 < doc.this.c + 1; $$2++) {
            doc.this.B = ($$2 + doc.this.d) * doc.this.x;
            doc.this.G++;
            doc.this.E = 0;
            doc.this.I = $$2;
            $$0[$$2] = $$1.a(doc.this);
         }
      }
   };

   public static doc a(dkl $$0, dom $$1, dns.c $$2, dod $$3, dnk.a $$4, dpa $$5) {
      dog $$6 = $$3.f().a($$0);
      csf $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new doc($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public doc(int $$0, dom $$1, int $$2, int $$3, dog $$4, dns.c $$5, dod $$6, dnk.a $$7, dpa $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = aty.a($$4.d(), this.x);
      this.d = aty.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = iq.a($$2);
      this.h = iq.a($$3);
      this.v = iq.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new doc.g(new doc.a(), false);
      this.r = new doc.g(new doc.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = iq.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = iq.c($$13);
            dpa.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      doe $$16 = $$1.a();
      doe $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dnk.a($$7);
      } else {
         int $$18 = ix.a($$2);
         int $$19 = ix.a($$3);
         this.m = dnk.a(this, new csf($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<doc.c> $$20 = ImmutableList.builder();
      dnr $$21 = dns.e(dns.a($$17.l(), dns.b.a)).a(this::a);
      $$20.add((doc.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(doi.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new dxc($$20.build());
      this.n = $$17.k();
   }

   protected cug.f a(doe $$0, List<cug.d> $$1) {
      return new cug.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dip e() {
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
      int $$2 = iq.c(iq.a($$0));
      int $$3 = iq.c(iq.a($$1));
      return this.l.computeIfAbsent(amf.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = amf.a($$0);
      int $$2 = amf.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new dnr.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dpa d() {
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

         for (doc.i $$4 : this.i) {
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

   public doc c(int $$0) {
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
   public void a(double[] $$0, dnr $$1) {
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

      for (doc.e $$2 : this.j) {
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
      this.i.forEach(doc.i::l);
   }

   public dnk i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dpa.a c(int $$0, int $$1) {
      long $$2 = csf.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dpa.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected dnr a(dnr $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private dnr b(dnr $$0) {
      if ($$0 instanceof dns.l $$1) {
         return (dnr)(switch ($$1.j()) {
            case a -> new doc.i($$1.k());
            case b -> new doc.g($$1.k(), true);
            case c -> new doc.d($$1.k());
            case d -> new doc.f($$1.k());
            case e -> new doc.e($$1.k());
         });
      } else {
         if (this.p != dpa.a()) {
            if ($$0 == dns.d.a) {
               return this.q;
            }

            if ($$0 == dns.f.a) {
               return this.r;
            }
         }

         if ($$0 == dns.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dns.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements doc.h {
      @Override
      public dnr k() {
         return dns.d.a;
      }

      @Override
      public dnr a(dnr.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dnr.b $$0) {
         return doc.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, dnr.a $$1) {
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
      public ats<? extends dnr> c() {
         return dns.d.e;
      }
   }

   class b implements doc.h {
      @Override
      public dnr k() {
         return dns.f.a;
      }

      @Override
      public dnr a(dnr.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(dnr.b $$0) {
         return doc.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, dnr.a $$1) {
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
      public ats<? extends dnr> c() {
         return dns.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dip calculate(dnr.b var1);
   }

   static class d implements dns.m, doc.h {
      private final dnr a;
      private long e = csf.a;
      private double f;

      d(dnr $$0) {
         this.a = $$0;
      }

      @Override
      public double a(dnr.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = csf.c($$1, $$2);
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
      public void a(double[] $$0, dnr.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public dnr k() {
         return this.a;
      }

      @Override
      public dns.l.a j() {
         return dns.l.a.c;
      }
   }

   class e implements dns.m, doc.h {
      final dnr e;
      final double[] f;

      e(dnr $$0) {
         this.e = $$0;
         this.f = new double[doc.this.w * doc.this.w * doc.this.x];
         doc.this.j.add(this);
      }

      @Override
      public double a(dnr.b $$0) {
         if ($$0 != doc.this) {
            return this.e.a($$0);
         } else if (!doc.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = doc.this.D;
            int $$2 = doc.this.E;
            int $$3 = doc.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < doc.this.w && $$2 < doc.this.x && $$3 < doc.this.w
               ? this.f[((doc.this.x - 1 - $$2) * doc.this.w + $$1) * doc.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, dnr.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dnr k() {
         return this.e;
      }

      @Override
      public dns.l.a j() {
         return dns.l.a.e;
      }
   }

   class f implements dns.m, doc.h {
      private final dnr e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(dnr $$0) {
         this.e = $$0;
      }

      @Override
      public double a(dnr.b $$0) {
         if ($$0 != doc.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == doc.this.H) {
            return this.i[doc.this.I];
         } else if (this.f == doc.this.G) {
            return this.h;
         } else {
            this.f = doc.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, dnr.a $$1) {
         if (this.i != null && this.g == doc.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = doc.this.H;
         }
      }

      @Override
      public dnr k() {
         return this.e;
      }

      @Override
      public dns.l.a j() {
         return dns.l.a.d;
      }
   }

   class g implements dns.m, doc.h {
      private final dnr e;
      final double[][] f;

      g(dnr $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[doc.this.v + 1][doc.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= doc.this.v; $$2++) {
               int $$3 = doc.this.g + $$2;
               int $$4 = iq.c($$3);

               for (int $$5 = 0; $$5 <= doc.this.v; $$5++) {
                  int $$6 = doc.this.h + $$5;
                  int $$7 = iq.c($$6);
                  this.f[$$2][$$5] = $$0.a(new dnr.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(dnr.b $$0) {
         int $$1 = iq.a($$0.a());
         int $$2 = iq.a($$0.c());
         int $$3 = $$1 - doc.this.g;
         int $$4 = $$2 - doc.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, dnr.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public dnr k() {
         return this.e;
      }

      @Override
      public dns.l.a j() {
         return dns.l.a.b;
      }
   }

   interface h extends dnr {
      dnr k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dns.m, doc.h {
      double[][] e;
      double[][] f;
      private final dnr g;
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

      i(dnr $$1) {
         this.g = $$1;
         this.e = this.a(doc.this.c, doc.this.b);
         this.f = this.a(doc.this.c, doc.this.b);
         doc.this.i.add(this);
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
         this.p = aty.d($$0, this.h, this.l);
         this.q = aty.d($$0, this.j, this.n);
         this.r = aty.d($$0, this.i, this.m);
         this.s = aty.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = aty.d($$0, this.p, this.q);
         this.u = aty.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = aty.d($$0, this.t, this.u);
      }

      @Override
      public double a(dnr.b $$0) {
         if ($$0 != doc.this) {
            return this.g.a($$0);
         } else if (!doc.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return doc.this.z
               ? aty.a(
                  (double)doc.this.D / (double)doc.this.w,
                  (double)doc.this.E / (double)doc.this.x,
                  (double)doc.this.F / (double)doc.this.w,
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
      public void a(double[] $$0, dnr.a $$1) {
         if (doc.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public dnr k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dns.l.a j() {
         return dns.l.a.a;
      }
   }
}
