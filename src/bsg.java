import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class bsg {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final biy a;
   protected final cpk b;
   @Nullable
   protected eaq c;
   protected double d;
   protected int e;
   protected int f;
   protected ehf g = ehf.b;
   protected ia h = ia.g;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected eap o;
   @Nullable
   private gv s;
   private int t;
   private float u = 1.0F;
   private final eas v;
   private boolean w;

   public bsg(biy $$0, cpk $$1) {
      this.a = $$0;
      this.b = $$1;
      int $$2 = aro.a($$0.b(bkd.b) * 16.0);
      this.v = this.a($$2);
   }

   public void g() {
      this.u = 1.0F;
   }

   public void a(float $$0) {
      this.u = $$0;
   }

   @Nullable
   public gv h() {
      return this.s;
   }

   protected abstract eas a(int var1);

   public void a(double $$0) {
      this.d = $$0;
   }

   public void i() {
      if (this.b.V() - this.n > 20L) {
         if (this.s != null) {
            this.c = null;
            this.c = this.a(this.s, this.t);
            this.n = this.b.V();
            this.m = false;
         }
      } else {
         this.m = true;
      }
   }

   @Nullable
   public final eaq a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(gv.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public eaq a(Stream<gv> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public eaq a(Set<gv> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public eaq a(gv $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public eaq a(gv $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public eaq a(big $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.dk()), 16, true, $$1);
   }

   @Nullable
   protected eaq a(Set<gv> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, (float)this.a.b(bkd.b));
   }

   @Nullable
   protected eaq a(Set<gv> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.dr() < (double)this.b.C_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         this.b.ad().a("pathfind");
         gv $$5 = $$2 ? this.a.dk().c() : this.a.dk();
         int $$6 = (int)($$4 + (float)$$1);
         cpx $$7 = new cpx(this.b, $$5.b(-$$6, -$$6, -$$6), $$5.b($$6, $$6, $$6));
         eaq $$8 = this.v.a($$7, this.a, $$0, $$4, $$3, this.u);
         this.b.ad().c();
         if ($$8 != null && $$8.l() != null) {
            this.s = $$8.l();
            this.t = $$3;
            this.f();
         }

         return $$8;
      }
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.a(this.a($$0, $$1, $$2, 1), $$3);
   }

   public boolean a(big $$0, double $$1) {
      eaq $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable eaq $$0, double $$1) {
      if ($$0 == null) {
         this.c = null;
         return false;
      } else {
         if (!$$0.a(this.c)) {
            this.c = $$0;
         }

         if (this.l()) {
            return false;
         } else {
            this.L_();
            if (this.c.e() <= 0) {
               return false;
            } else {
               this.d = $$1;
               ehf $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public eaq j() {
      return this.c;
   }

   public void c() {
      this.e++;
      if (this.m) {
         this.i();
      }

      if (!this.l()) {
         if (this.a()) {
            this.k();
         } else if (this.c != null && !this.c.c()) {
            ehf $$0 = this.b();
            ehf $$1 = this.c.a(this.a);
            if ($$0.d > $$1.d && !this.a.aA() && aro.a($$0.c) == aro.a($$1.c) && aro.a($$0.e) == aro.a($$1.e)) {
               this.c.a();
            }
         }

         aau.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            ehf $$2 = this.c.a(this.a);
            this.a.E().a($$2.c, this.a($$2), $$2.e, this.d);
         }
      }
   }

   protected double a(ehf $$0) {
      gv $$1 = gv.a($$0);
      return this.b.a_($$1.d()).i() ? $$0.d : eav.a(this.b, $$1);
   }

   protected void k() {
      ehf $$0 = this.b();
      this.l = this.a.df() > 0.75F ? this.a.df() / 2.0F : 0.75F - this.a.df() / 2.0F;
      ia $$1 = this.c.g();
      double $$2 = Math.abs(this.a.dp() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.dr() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dv() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(ehf $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         ehf $$1 = ehf.c(this.c.g());
         if (!$$0.a((hp)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            ehf $$2 = ehf.c(this.c.d(this.c.f() + 1));
            ehf $$3 = $$1.d($$0);
            ehf $$4 = $$2.d($$0);
            double $$5 = $$3.g();
            double $$6 = $$4.g();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               ehf $$9 = $$3.d();
               ehf $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(ehf $$0) {
      if (this.e - this.f > 100) {
         float $$1 = this.a.fd() >= 1.0F ? this.a.fd() : this.a.fd() * this.a.fd();
         float $$2 = $$1 * 100.0F * 0.25F;
         if ($$0.g(this.g) < (double)($$2 * $$2)) {
            this.w = true;
            this.n();
         } else {
            this.w = false;
         }

         this.f = this.e;
         this.g = $$0;
      }

      if (this.c != null && !this.c.c()) {
         ia $$3 = this.c.g();
         long $$4 = this.b.V();
         if ($$3.equals(this.h)) {
            this.i = this.i + ($$4 - this.j);
         } else {
            this.h = $$3;
            double $$5 = $$0.f(ehf.c(this.h));
            this.k = this.a.fd() > 0.0F ? $$5 / (double)this.a.fd() * 20.0 : 0.0;
         }

         if (this.k > 0.0 && (double)this.i > this.k * 3.0) {
            this.e();
         }

         this.j = $$4;
      }
   }

   private void e() {
      this.f();
      this.n();
   }

   private void f() {
      this.h = ia.g;
      this.i = 0L;
      this.k = 0.0;
      this.w = false;
   }

   public boolean l() {
      return this.c == null || this.c.c();
   }

   public boolean m() {
      return !this.l();
   }

   public void n() {
      this.c = null;
   }

   protected abstract ehf b();

   protected abstract boolean a();

   protected void L_() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eao $$1 = this.c.a($$0);
            eao $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            dey $$3 = this.b.a_(new gv($$1.a, $$1.b, $$1.c));
            if ($$3.a(apj.bk)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(ehf $$0, ehf $$1) {
      return false;
   }

   public boolean b(eam $$0) {
      return $$0 != eam.n && $$0 != eam.p && $$0 != eam.d;
   }

   protected static boolean a(biy $$0, ehf $$1, ehf $$2, boolean $$3) {
      ehf $$4 = new ehf($$2.c, $$2.d + (double)$$0.dg() * 0.5, $$2.e);
      return $$0.dK().a(new cot($$1, $$4, cot.a.a, $$3 ? cot.b.c : cot.b.a, $$0)).c() == ehd.a.a;
   }

   public boolean a(gv $$0) {
      gv $$1 = $$0.d();
      return this.b.a_($$1).i(this.b, $$1);
   }

   public eap o() {
      return this.o;
   }

   public void a(boolean $$0) {
      this.o.c($$0);
   }

   public boolean p() {
      return this.o.f();
   }

   public boolean b(gv $$0) {
      if (this.m) {
         return false;
      } else if (this.c != null && !this.c.c() && this.c.e() != 0) {
         eao $$1 = this.c.d();
         ehf $$2 = new ehf(((double)$$1.a + this.a.dp()) / 2.0, ((double)$$1.b + this.a.dr()) / 2.0, ((double)$$1.c + this.a.dv()) / 2.0);
         return $$0.a($$2, (double)(this.c.e() - this.c.f()));
      } else {
         return false;
      }
   }

   public float q() {
      return this.l;
   }

   public boolean r() {
      return this.w;
   }
}
