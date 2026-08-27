import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class don implements doc.a, doc.b {
   private final dor a;
   final int b;
   final int c;
   final int d;
   private final int e;
   private final int f;
   final int g;
   final int h;
   final List<don.i> i;
   final List<don.e> j;
   private final Map<doc, doc> k = new HashMap<>();
   private final Long2IntMap l = new Long2IntOpenHashMap();
   private final dnv m;
   private final doc n;
   private final don.c o;
   private final dpl p;
   private final don.g q;
   private final don.g r;
   private final dod.c s;
   private long t = csp.a;
   private dpl.a u = new dpl.a(1.0, 0.0);
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
   private final doc.a J = new doc.a() {
      @Override
      public doc.b a(int $$0) {
         don.this.B = ($$0 + don.this.d) * don.this.x;
         don.this.G++;
         don.this.E = 0;
         don.this.I = $$0;
         return don.this;
      }

      @Override
      public void a(double[] $$0, doc $$1) {
         for (int $$2 = 0; $$2 < don.this.c + 1; $$2++) {
            don.this.B = ($$2 + don.this.d) * don.this.x;
            don.this.G++;
            don.this.E = 0;
            don.this.I = $$2;
            $$0[$$2] = $$1.a(don.this);
         }
      }
   };

   public static don a(dkw $$0, dox $$1, dod.c $$2, doo $$3, dnv.a $$4, dpl $$5) {
      dor $$6 = $$3.f().a($$0);
      csp $$7 = $$0.f();
      int $$8 = 16 / $$6.b();
      return new don($$8, $$1, $$7.d(), $$7.e(), $$6, $$2, $$3, $$4, $$5);
   }

   public don(int $$0, dox $$1, int $$2, int $$3, dor $$4, dod.c $$5, doo $$6, dnv.a $$7, dpl $$8) {
      this.a = $$4;
      this.w = $$4.b();
      this.x = $$4.a();
      this.b = $$0;
      this.c = aui.a($$4.d(), this.x);
      this.d = aui.a($$4.c(), this.x);
      this.e = Math.floorDiv($$2, this.w);
      this.f = Math.floorDiv($$3, this.w);
      this.i = Lists.newArrayList();
      this.j = Lists.newArrayList();
      this.g = is.a($$2);
      this.h = is.a($$3);
      this.v = is.a($$0 * this.w);
      this.p = $$8;
      this.s = $$5;
      this.q = new don.g(new don.a(), false);
      this.r = new don.g(new don.b(), false);

      for (int $$9 = 0; $$9 <= this.v; $$9++) {
         int $$10 = this.g + $$9;
         int $$11 = is.c($$10);

         for (int $$12 = 0; $$12 <= this.v; $$12++) {
            int $$13 = this.h + $$12;
            int $$14 = is.c($$13);
            dpl.a $$15 = $$8.a($$11, $$14);
            this.q.f[$$9][$$12] = $$15.a();
            this.r.f[$$9][$$12] = $$15.b();
         }
      }

      dop $$16 = $$1.a();
      dop $$17 = $$16.a(this::a);
      if (!$$6.b()) {
         this.m = dnv.a($$7);
      } else {
         int $$18 = iz.a($$2);
         int $$19 = iz.a($$3);
         this.m = dnv.a(this, new csp($$18, $$19), $$17, $$1.d(), $$4.c(), $$4.d(), $$7);
      }

      Builder<don.c> $$20 = ImmutableList.builder();
      doc $$21 = dod.e(dod.a($$17.l(), dod.b.a)).a(this::a);
      $$20.add((don.c)$$1x -> this.m.a($$1x, $$21.a($$1x)));
      if ($$6.c()) {
         $$20.add(dot.a($$17.m(), $$17.n(), $$17.o(), $$1.e()));
      }

      this.o = new dxn($$20.build());
      this.n = $$17.k();
   }

   protected cuq.f a(dop $$0, List<cuq.d> $$1) {
      return new cuq.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
   }

   @Nullable
   protected dja e() {
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
      int $$2 = is.c(is.a($$0));
      int $$3 = is.c(is.a($$1));
      return this.l.computeIfAbsent(amp.a($$2, $$3), this::a);
   }

   private int a(long $$0) {
      int $$1 = amp.a($$0);
      int $$2 = amp.b($$0);
      int $$3 = this.a.c();

      for (int $$4 = $$3 + this.a.d(); $$4 >= $$3; $$4 -= this.x) {
         if (this.n.a(new doc.e($$1, $$4, $$2)) > 0.390625) {
            return $$4;
         }
      }

      return Integer.MAX_VALUE;
   }

   @Override
   public dpl d() {
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

         for (don.i $$4 : this.i) {
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

   public don c(int $$0) {
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
   public void a(double[] $$0, doc $$1) {
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

      for (don.e $$2 : this.j) {
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
      this.i.forEach(don.i::l);
   }

   public dnv i() {
      return this.m;
   }

   protected int j() {
      return this.w;
   }

   protected int k() {
      return this.x;
   }

   dpl.a c(int $$0, int $$1) {
      long $$2 = csp.c($$0, $$1);
      if (this.t == $$2) {
         return this.u;
      } else {
         this.t = $$2;
         dpl.a $$3 = this.p.a($$0, $$1);
         this.u = $$3;
         return $$3;
      }
   }

   protected doc a(doc $$0) {
      return this.k.computeIfAbsent($$0, this::b);
   }

   private doc b(doc $$0) {
      if ($$0 instanceof dod.l $$1) {
         return (doc)(switch ($$1.j()) {
            case a -> new don.i($$1.k());
            case b -> new don.g($$1.k(), true);
            case c -> new don.d($$1.k());
            case d -> new don.f($$1.k());
            case e -> new don.e($$1.k());
         });
      } else {
         if (this.p != dpl.a()) {
            if ($$0 == dod.d.a) {
               return this.q;
            }

            if ($$0 == dod.f.a) {
               return this.r;
            }
         }

         if ($$0 == dod.b.a) {
            return this.s;
         } else {
            return $$0 instanceof dod.j $$2 ? $$2.j().a() : $$0;
         }
      }
   }

   class a implements don.h {
      @Override
      public doc k() {
         return dod.d.a;
      }

      @Override
      public doc a(doc.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(doc.b $$0) {
         return don.this.c($$0.a(), $$0.c()).a();
      }

      @Override
      public void a(double[] $$0, doc.a $$1) {
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
      public auc<? extends doc> c() {
         return dod.d.e;
      }
   }

   class b implements don.h {
      @Override
      public doc k() {
         return dod.f.a;
      }

      @Override
      public doc a(doc.f $$0) {
         return this.k().a($$0);
      }

      @Override
      public double a(doc.b $$0) {
         return don.this.c($$0.a(), $$0.c()).b();
      }

      @Override
      public void a(double[] $$0, doc.a $$1) {
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
      public auc<? extends doc> c() {
         return dod.f.e;
      }
   }

   @FunctionalInterface
   public interface c {
      @Nullable
      dja calculate(doc.b var1);
   }

   static class d implements dod.m, don.h {
      private final doc a;
      private long e = csp.a;
      private double f;

      d(doc $$0) {
         this.a = $$0;
      }

      @Override
      public double a(doc.b $$0) {
         int $$1 = $$0.a();
         int $$2 = $$0.c();
         long $$3 = csp.c($$1, $$2);
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
      public void a(double[] $$0, doc.a $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public doc k() {
         return this.a;
      }

      @Override
      public dod.l.a j() {
         return dod.l.a.c;
      }
   }

   class e implements dod.m, don.h {
      final doc e;
      final double[] f;

      e(doc $$0) {
         this.e = $$0;
         this.f = new double[don.this.w * don.this.w * don.this.x];
         don.this.j.add(this);
      }

      @Override
      public double a(doc.b $$0) {
         if ($$0 != don.this) {
            return this.e.a($$0);
         } else if (!don.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            int $$1 = don.this.D;
            int $$2 = don.this.E;
            int $$3 = don.this.F;
            return $$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < don.this.w && $$2 < don.this.x && $$3 < don.this.w
               ? this.f[((don.this.x - 1 - $$2) * don.this.w + $$1) * don.this.w + $$3]
               : this.e.a($$0);
         }
      }

      @Override
      public void a(double[] $$0, doc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public doc k() {
         return this.e;
      }

      @Override
      public dod.l.a j() {
         return dod.l.a.e;
      }
   }

   class f implements dod.m, don.h {
      private final doc e;
      private long f;
      private long g;
      private double h;
      @Nullable
      private double[] i;

      f(doc $$0) {
         this.e = $$0;
      }

      @Override
      public double a(doc.b $$0) {
         if ($$0 != don.this) {
            return this.e.a($$0);
         } else if (this.i != null && this.g == don.this.H) {
            return this.i[don.this.I];
         } else if (this.f == don.this.G) {
            return this.h;
         } else {
            this.f = don.this.G;
            double $$1 = this.e.a($$0);
            this.h = $$1;
            return $$1;
         }
      }

      @Override
      public void a(double[] $$0, doc.a $$1) {
         if (this.i != null && this.g == don.this.H) {
            System.arraycopy(this.i, 0, $$0, 0, $$0.length);
         } else {
            this.k().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
               System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
               this.i = (double[])$$0.clone();
            }

            this.g = don.this.H;
         }
      }

      @Override
      public doc k() {
         return this.e;
      }

      @Override
      public dod.l.a j() {
         return dod.l.a.d;
      }
   }

   class g implements dod.m, don.h {
      private final doc e;
      final double[][] f;

      g(doc $$0, boolean $$1) {
         this.e = $$0;
         this.f = new double[don.this.v + 1][don.this.v + 1];
         if ($$1) {
            for (int $$2 = 0; $$2 <= don.this.v; $$2++) {
               int $$3 = don.this.g + $$2;
               int $$4 = is.c($$3);

               for (int $$5 = 0; $$5 <= don.this.v; $$5++) {
                  int $$6 = don.this.h + $$5;
                  int $$7 = is.c($$6);
                  this.f[$$2][$$5] = $$0.a(new doc.e($$4, 0, $$7));
               }
            }
         }
      }

      @Override
      public double a(doc.b $$0) {
         int $$1 = is.a($$0.a());
         int $$2 = is.a($$0.c());
         int $$3 = $$1 - don.this.g;
         int $$4 = $$2 - don.this.h;
         int $$5 = this.f.length;
         return $$3 >= 0 && $$4 >= 0 && $$3 < $$5 && $$4 < $$5 ? this.f[$$3][$$4] : this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, doc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public doc k() {
         return this.e;
      }

      @Override
      public dod.l.a j() {
         return dod.l.a.b;
      }
   }

   interface h extends doc {
      doc k();

      @Override
      default double a() {
         return this.k().a();
      }

      @Override
      default double b() {
         return this.k().b();
      }
   }

   public class i implements dod.m, don.h {
      double[][] e;
      double[][] f;
      private final doc g;
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

      i(doc $$1) {
         this.g = $$1;
         this.e = this.a(don.this.c, don.this.b);
         this.f = this.a(don.this.c, don.this.b);
         don.this.i.add(this);
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
         this.p = aui.d($$0, this.h, this.l);
         this.q = aui.d($$0, this.j, this.n);
         this.r = aui.d($$0, this.i, this.m);
         this.s = aui.d($$0, this.k, this.o);
      }

      void b(double $$0) {
         this.t = aui.d($$0, this.p, this.q);
         this.u = aui.d($$0, this.r, this.s);
      }

      void c(double $$0) {
         this.v = aui.d($$0, this.t, this.u);
      }

      @Override
      public double a(doc.b $$0) {
         if ($$0 != don.this) {
            return this.g.a($$0);
         } else if (!don.this.y) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
         } else {
            return don.this.z
               ? aui.a(
                  (double)don.this.D / (double)don.this.w,
                  (double)don.this.E / (double)don.this.x,
                  (double)don.this.F / (double)don.this.w,
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
      public void a(double[] $$0, doc.a $$1) {
         if (don.this.z) {
            $$1.a($$0, this);
         } else {
            this.k().a($$0, $$1);
         }
      }

      @Override
      public doc k() {
         return this.g;
      }

      private void l() {
         double[][] $$0 = this.e;
         this.e = this.f;
         this.f = $$0;
      }

      @Override
      public dod.l.a j() {
         return dod.l.a.a;
      }
   }
}
