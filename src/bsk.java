import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class bsk {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final bjd a;
   protected final cpq b;
   @Nullable
   protected eaw c;
   protected double d;
   protected int e;
   protected int f;
   protected ehi g = ehi.b;
   protected ib h = ib.g;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected eav o;
   @Nullable
   private gw s;
   private int t;
   private float u = 1.0F;
   private final eay v;
   private boolean w;

   public bsk(bjd $$0, cpq $$1) {
      this.a = $$0;
      this.b = $$1;
      int $$2 = ars.a($$0.b(bkh.b) * 16.0);
      this.v = this.a($$2);
   }

   public void g() {
      this.u = 1.0F;
   }

   public void a(float $$0) {
      this.u = $$0;
   }

   @Nullable
   public gw h() {
      return this.s;
   }

   protected abstract eay a(int var1);

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
   public final eaw a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(gw.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public eaw a(Stream<gw> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public eaw a(Set<gw> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public eaw a(gw $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public eaw a(gw $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public eaw a(bil $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.dk()), 16, true, $$1);
   }

   @Nullable
   protected eaw a(Set<gw> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, (float)this.a.b(bkh.b));
   }

   @Nullable
   protected eaw a(Set<gw> $$0, int $$1, boolean $$2, int $$3, float $$4) {
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
         gw $$5 = $$2 ? this.a.dk().c() : this.a.dk();
         int $$6 = (int)($$4 + (float)$$1);
         cqd $$7 = new cqd(this.b, $$5.b(-$$6, -$$6, -$$6), $$5.b($$6, $$6, $$6));
         eaw $$8 = this.v.a($$7, this.a, $$0, $$4, $$3, this.u);
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

   public boolean a(bil $$0, double $$1) {
      eaw $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable eaw $$0, double $$1) {
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
               ehi $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public eaw j() {
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
            ehi $$0 = this.b();
            ehi $$1 = this.c.a(this.a);
            if ($$0.d > $$1.d && !this.a.aA() && ars.a($$0.c) == ars.a($$1.c) && ars.a($$0.e) == ars.a($$1.e)) {
               this.c.a();
            }
         }

         aay.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            ehi $$2 = this.c.a(this.a);
            this.a.E().a($$2.c, this.a($$2), $$2.e, this.d);
         }
      }
   }

   protected double a(ehi $$0) {
      gw $$1 = gw.a($$0);
      return this.b.a_($$1.d()).i() ? $$0.d : ebb.a(this.b, $$1);
   }

   protected void k() {
      ehi $$0 = this.b();
      this.l = this.a.df() > 0.75F ? this.a.df() / 2.0F : 0.75F - this.a.df() / 2.0F;
      ib $$1 = this.c.g();
      double $$2 = Math.abs(this.a.dp() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.dr() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dv() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(ehi $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         ehi $$1 = ehi.c(this.c.g());
         if (!$$0.a((hq)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            ehi $$2 = ehi.c(this.c.d(this.c.f() + 1));
            ehi $$3 = $$1.d($$0);
            ehi $$4 = $$2.d($$0);
            double $$5 = $$3.g();
            double $$6 = $$4.g();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               ehi $$9 = $$3.d();
               ehi $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(ehi $$0) {
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
         ib $$3 = this.c.g();
         long $$4 = this.b.V();
         if ($$3.equals(this.h)) {
            this.i = this.i + ($$4 - this.j);
         } else {
            this.h = $$3;
            double $$5 = $$0.f(ehi.c(this.h));
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
      this.h = ib.g;
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

   protected abstract ehi b();

   protected abstract boolean a();

   protected void L_() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eau $$1 = this.c.a($$0);
            eau $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            dfe $$3 = this.b.a_(new gw($$1.a, $$1.b, $$1.c));
            if ($$3.a(apo.bk)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(ehi $$0, ehi $$1) {
      return false;
   }

   public boolean b(eas $$0) {
      return $$0 != eas.n && $$0 != eas.p && $$0 != eas.d;
   }

   protected static boolean a(bjd $$0, ehi $$1, ehi $$2, boolean $$3) {
      ehi $$4 = new ehi($$2.c, $$2.d + (double)$$0.dg() * 0.5, $$2.e);
      return $$0.dK().a(new coz($$1, $$4, coz.a.a, $$3 ? coz.b.c : coz.b.a, $$0)).c() == ehg.a.a;
   }

   public boolean a(gw $$0) {
      gw $$1 = $$0.d();
      return this.b.a_($$1).i(this.b, $$1);
   }

   public eav o() {
      return this.o;
   }

   public void a(boolean $$0) {
      this.o.c($$0);
   }

   public boolean p() {
      return this.o.f();
   }

   public boolean b(gw $$0) {
      if (this.m) {
         return false;
      } else if (this.c != null && !this.c.c() && this.c.e() != 0) {
         eau $$1 = this.c.d();
         ehi $$2 = new ehi(((double)$$1.a + this.a.dp()) / 2.0, ((double)$$1.b + this.a.dr()) / 2.0, ((double)$$1.c + this.a.dv()) / 2.0);
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
