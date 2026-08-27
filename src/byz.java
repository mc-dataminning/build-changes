import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class byz {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final bpq a;
   protected final cwz b;
   @Nullable
   protected ejc c;
   protected double d;
   protected int e;
   protected int f;
   protected epr g = epr.b;
   protected jg h = jg.g;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected ejb o;
   @Nullable
   private ib s;
   private int t;
   private float u = 1.0F;
   private final eje v;
   private boolean w;

   public byz(bpq $$0, cwz $$1) {
      this.a = $$0;
      this.b = $$1;
      int $$2 = aww.a($$0.g(bqv.k) * 16.0);
      this.v = this.a($$2);
   }

   public void g() {
      this.u = 1.0F;
   }

   public void a(float $$0) {
      this.u = $$0;
   }

   @Nullable
   public ib h() {
      return this.s;
   }

   protected abstract eje a(int var1);

   public void a(double $$0) {
      this.d = $$0;
   }

   public void i() {
      if (this.b.X() - this.n > 20L) {
         if (this.s != null) {
            this.c = null;
            this.c = this.a(this.s, this.t);
            this.n = this.b.X();
            this.m = false;
         }
      } else {
         this.m = true;
      }
   }

   @Nullable
   public final ejc a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(ib.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public ejc a(Stream<ib> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public ejc a(Set<ib> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public ejc a(ib $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public ejc a(ib $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public ejc a(bow $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.dm()), 16, true, $$1);
   }

   @Nullable
   protected ejc a(Set<ib> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, (float)this.a.g(bqv.k));
   }

   @Nullable
   protected ejc a(Set<ib> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.dt() < (double)this.b.I_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         this.b.ae().a("pathfind");
         ib $$5 = $$2 ? this.a.dm().c() : this.a.dm();
         int $$6 = (int)($$4 + (float)$$1);
         cxm $$7 = new cxm(this.b, $$5.b(-$$6, -$$6, -$$6), $$5.b($$6, $$6, $$6));
         ejc $$8 = this.v.a($$7, this.a, $$0, $$4, $$3, this.u);
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

   public boolean a(bow $$0, double $$1) {
      ejc $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable ejc $$0, double $$1) {
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
            this.S_();
            if (this.c.e() <= 0) {
               return false;
            } else {
               this.d = $$1;
               epr $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public ejc j() {
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
            epr $$0 = this.b();
            epr $$1 = this.c.a(this.a);
            if ($$0.d > $$1.d && !this.a.aC() && aww.a($$0.c) == aww.a($$1.c) && aww.a($$0.e) == aww.a($$1.e)) {
               this.c.a();
            }
         }

         aew.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            epr $$2 = this.c.a(this.a);
            this.a.H().a($$2.c, this.a($$2), $$2.e, this.d);
         }
      }
   }

   protected double a(epr $$0) {
      ib $$1 = ib.a($$0);
      return this.b.a_($$1.d()).i() ? $$0.d : ejh.a(this.b, $$1);
   }

   protected void k() {
      epr $$0 = this.b();
      this.l = this.a.dg() > 0.75F ? this.a.dg() / 2.0F : 0.75F - this.a.dg() / 2.0F;
      jg $$1 = this.c.g();
      double $$2 = Math.abs(this.a.dr() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.dt() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dx() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(epr $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         epr $$1 = epr.c(this.c.g());
         if (!$$0.a((iv)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            epr $$2 = epr.c(this.c.d(this.c.f() + 1));
            epr $$3 = $$1.d($$0);
            epr $$4 = $$2.d($$0);
            double $$5 = $$3.g();
            double $$6 = $$4.g();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               epr $$9 = $$3.d();
               epr $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(epr $$0) {
      if (this.e - this.f > 100) {
         float $$1 = this.a.fk() >= 1.0F ? this.a.fk() : this.a.fk() * this.a.fk();
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
         jg $$3 = this.c.g();
         long $$4 = this.b.X();
         if ($$3.equals(this.h)) {
            this.i = this.i + ($$4 - this.j);
         } else {
            this.h = $$3;
            double $$5 = $$0.f(epr.c(this.h));
            this.k = this.a.fk() > 0.0F ? $$5 / (double)this.a.fk() * 20.0 : 0.0;
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
      this.h = jg.g;
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

   protected abstract epr b();

   protected abstract boolean a();

   protected void S_() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eja $$1 = this.c.a($$0);
            eja $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            dmz $$3 = this.b.a_(new ib($$1.a, $$1.b, $$1.c));
            if ($$3.a(aun.bl)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(epr $$0, epr $$1) {
      return false;
   }

   public boolean b(eiy $$0) {
      return $$0 != eiy.n && $$0 != eiy.p && $$0 != eiy.d;
   }

   protected static boolean a(bpq $$0, epr $$1, epr $$2, boolean $$3) {
      epr $$4 = new epr($$2.c, $$2.d + (double)$$0.dh() * 0.5, $$2.e);
      return $$0.dM().a(new cwi($$1, $$4, cwi.a.a, $$3 ? cwi.b.c : cwi.b.a, $$0)).c() == epp.a.a;
   }

   public boolean a(ib $$0) {
      ib $$1 = $$0.d();
      return this.b.a_($$1).i(this.b, $$1);
   }

   public ejb o() {
      return this.o;
   }

   public void a(boolean $$0) {
      this.o.c($$0);
   }

   public boolean p() {
      return this.o.f();
   }

   public boolean b(ib $$0) {
      if (this.m) {
         return false;
      } else if (this.c != null && !this.c.c() && this.c.e() != 0) {
         eja $$1 = this.c.d();
         epr $$2 = new epr(((double)$$1.a + this.a.dr()) / 2.0, ((double)$$1.b + this.a.dt()) / 2.0, ((double)$$1.c + this.a.dx()) / 2.0);
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
