import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class bvf {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final blx a;
   protected final csy b;
   @Nullable
   protected eeo c;
   protected double d;
   protected int e;
   protected int f;
   protected elb g = elb.b;
   protected iz h = iz.g;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected een o;
   @Nullable
   private hv s;
   private int t;
   private float u = 1.0F;
   private final eeq v;
   private boolean w;

   public bvf(blx $$0, csy $$1) {
      this.a = $$0;
      this.b = $$1;
      int $$2 = aty.a($$0.b(bnb.g) * 16.0);
      this.v = this.a($$2);
   }

   public void g() {
      this.u = 1.0F;
   }

   public void a(float $$0) {
      this.u = $$0;
   }

   @Nullable
   public hv h() {
      return this.s;
   }

   protected abstract eeq a(int var1);

   public void a(double $$0) {
      this.d = $$0;
   }

   public void i() {
      if (this.b.W() - this.n > 20L) {
         if (this.s != null) {
            this.c = null;
            this.c = this.a(this.s, this.t);
            this.n = this.b.W();
            this.m = false;
         }
      } else {
         this.m = true;
      }
   }

   @Nullable
   public final eeo a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(hv.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public eeo a(Stream<hv> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public eeo a(Set<hv> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public eeo a(hv $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public eeo a(hv $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public eeo a(blf $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.dm()), 16, true, $$1);
   }

   @Nullable
   protected eeo a(Set<hv> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, (float)this.a.b(bnb.g));
   }

   @Nullable
   protected eeo a(Set<hv> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.dt() < (double)this.b.J_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         this.b.ae().a("pathfind");
         hv $$5 = $$2 ? this.a.dm().c() : this.a.dm();
         int $$6 = (int)($$4 + (float)$$1);
         ctl $$7 = new ctl(this.b, $$5.b(-$$6, -$$6, -$$6), $$5.b($$6, $$6, $$6));
         eeo $$8 = this.v.a($$7, this.a, $$0, $$4, $$3, this.u);
         this.b.ae().c();
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

   public boolean a(blf $$0, double $$1) {
      eeo $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable eeo $$0, double $$1) {
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
            this.U_();
            if (this.c.e() <= 0) {
               return false;
            } else {
               this.d = $$1;
               elb $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public eeo j() {
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
            elb $$0 = this.b();
            elb $$1 = this.c.a(this.a);
            if ($$0.d > $$1.d && !this.a.aC() && aty.a($$0.c) == aty.a($$1.c) && aty.a($$0.e) == aty.a($$1.e)) {
               this.c.a();
            }
         }

         acv.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            elb $$2 = this.c.a(this.a);
            this.a.K().a($$2.c, this.a($$2), $$2.e, this.d);
         }
      }
   }

   protected double a(elb $$0) {
      hv $$1 = hv.a($$0);
      return this.b.a_($$1.d()).i() ? $$0.d : eet.a(this.b, $$1);
   }

   protected void k() {
      elb $$0 = this.b();
      this.l = this.a.dg() > 0.75F ? this.a.dg() / 2.0F : 0.75F - this.a.dg() / 2.0F;
      iz $$1 = this.c.g();
      double $$2 = Math.abs(this.a.dr() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.dt() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dx() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(elb $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         elb $$1 = elb.c(this.c.g());
         if (!$$0.a((ip)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            elb $$2 = elb.c(this.c.d(this.c.f() + 1));
            elb $$3 = $$1.d($$0);
            elb $$4 = $$2.d($$0);
            double $$5 = $$3.g();
            double $$6 = $$4.g();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               elb $$9 = $$3.d();
               elb $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(elb $$0) {
      if (this.e - this.f > 100) {
         float $$1 = this.a.ff() >= 1.0F ? this.a.ff() : this.a.ff() * this.a.ff();
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
         iz $$3 = this.c.g();
         long $$4 = this.b.W();
         if ($$3.equals(this.h)) {
            this.i = this.i + ($$4 - this.j);
         } else {
            this.h = $$3;
            double $$5 = $$0.f(elb.c(this.h));
            this.k = this.a.ff() > 0.0F ? $$5 / (double)this.a.ff() * 20.0 : 0.0;
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
      this.h = iz.g;
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

   protected abstract elb b();

   protected abstract boolean a();

   protected void U_() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eem $$1 = this.c.a($$0);
            eem $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            dip $$3 = this.b.a_(new hv($$1.a, $$1.b, $$1.c));
            if ($$3.a(arr.bk)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(elb $$0, elb $$1) {
      return false;
   }

   public boolean b(eek $$0) {
      return $$0 != eek.n && $$0 != eek.p && $$0 != eek.d;
   }

   protected static boolean a(blx $$0, elb $$1, elb $$2, boolean $$3) {
      elb $$4 = new elb($$2.c, $$2.d + (double)$$0.dh() * 0.5, $$2.e);
      return $$0.dM().a(new csh($$1, $$4, csh.a.a, $$3 ? csh.b.c : csh.b.a, $$0)).c() == ekz.a.a;
   }

   public boolean a(hv $$0) {
      hv $$1 = $$0.d();
      return this.b.a_($$1).i(this.b, $$1);
   }

   public een o() {
      return this.o;
   }

   public void a(boolean $$0) {
      this.o.c($$0);
   }

   public boolean p() {
      return this.o.f();
   }

   public boolean b(hv $$0) {
      if (this.m) {
         return false;
      } else if (this.c != null && !this.c.c() && this.c.e() != 0) {
         eem $$1 = this.c.d();
         elb $$2 = new elb(((double)$$1.a + this.a.dr()) / 2.0, ((double)$$1.b + this.a.dt()) / 2.0, ((double)$$1.c + this.a.dx()) / 2.0);
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
