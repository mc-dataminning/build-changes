import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class bvy {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final bmq a;
   protected final ctx b;
   @Nullable
   protected efo c;
   protected double d;
   protected int e;
   protected int f;
   protected emc g = emc.b;
   protected jb h = jb.g;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected efn o;
   @Nullable
   private hx s;
   private int t;
   private float u = 1.0F;
   private final efq v;
   private boolean w;

   public bvy(bmq $$0, ctx $$1) {
      this.a = $$0;
      this.b = $$1;
      int $$2 = aup.a($$0.g(bnu.i) * 16.0);
      this.v = this.a($$2);
   }

   public void g() {
      this.u = 1.0F;
   }

   public void a(float $$0) {
      this.u = $$0;
   }

   @Nullable
   public hx h() {
      return this.s;
   }

   protected abstract efq a(int var1);

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
   public final efo a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(hx.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public efo a(Stream<hx> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public efo a(Set<hx> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public efo a(hx $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public efo a(hx $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public efo a(blw $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.dl()), 16, true, $$1);
   }

   @Nullable
   protected efo a(Set<hx> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, (float)this.a.g(bnu.i));
   }

   @Nullable
   protected efo a(Set<hx> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.ds() < (double)this.b.J_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         this.b.af().a("pathfind");
         hx $$5 = $$2 ? this.a.dl().c() : this.a.dl();
         int $$6 = (int)($$4 + (float)$$1);
         cuk $$7 = new cuk(this.b, $$5.b(-$$6, -$$6, -$$6), $$5.b($$6, $$6, $$6));
         efo $$8 = this.v.a($$7, this.a, $$0, $$4, $$3, this.u);
         this.b.af().c();
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

   public boolean a(blw $$0, double $$1) {
      efo $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable efo $$0, double $$1) {
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
               emc $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public efo j() {
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
            emc $$0 = this.b();
            emc $$1 = this.c.a(this.a);
            if ($$0.d > $$1.d && !this.a.aC() && aup.a($$0.c) == aup.a($$1.c) && aup.a($$0.e) == aup.a($$1.e)) {
               this.c.a();
            }
         }

         adj.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            emc $$2 = this.c.a(this.a);
            this.a.K().a($$2.c, this.a($$2), $$2.e, this.d);
         }
      }
   }

   protected double a(emc $$0) {
      hx $$1 = hx.a($$0);
      return this.b.a_($$1.d()).i() ? $$0.d : eft.a(this.b, $$1);
   }

   protected void k() {
      emc $$0 = this.b();
      this.l = this.a.dg() > 0.75F ? this.a.dg() / 2.0F : 0.75F - this.a.dg() / 2.0F;
      jb $$1 = this.c.g();
      double $$2 = Math.abs(this.a.dq() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.ds() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dw() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(emc $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         emc $$1 = emc.c(this.c.g());
         if (!$$0.a((ir)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            emc $$2 = emc.c(this.c.d(this.c.f() + 1));
            emc $$3 = $$1.d($$0);
            emc $$4 = $$2.d($$0);
            double $$5 = $$3.g();
            double $$6 = $$4.g();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               emc $$9 = $$3.d();
               emc $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(emc $$0) {
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
         jb $$3 = this.c.g();
         long $$4 = this.b.X();
         if ($$3.equals(this.h)) {
            this.i = this.i + ($$4 - this.j);
         } else {
            this.h = $$3;
            double $$5 = $$0.f(emc.c(this.h));
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
      this.h = jb.g;
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

   protected abstract emc b();

   protected abstract boolean a();

   protected void U_() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            efm $$1 = this.c.a($$0);
            efm $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            djp $$3 = this.b.a_(new hx($$1.a, $$1.b, $$1.c));
            if ($$3.a(asi.bk)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(emc $$0, emc $$1) {
      return false;
   }

   public boolean b(efk $$0) {
      return $$0 != efk.n && $$0 != efk.p && $$0 != efk.d;
   }

   protected static boolean a(bmq $$0, emc $$1, emc $$2, boolean $$3) {
      emc $$4 = new emc($$2.c, $$2.d + (double)$$0.dh() * 0.5, $$2.e);
      return $$0.dL().a(new ctg($$1, $$4, ctg.a.a, $$3 ? ctg.b.c : ctg.b.a, $$0)).c() == ema.a.a;
   }

   public boolean a(hx $$0) {
      hx $$1 = $$0.d();
      return this.b.a_($$1).i(this.b, $$1);
   }

   public efn o() {
      return this.o;
   }

   public void a(boolean $$0) {
      this.o.c($$0);
   }

   public boolean p() {
      return this.o.f();
   }

   public boolean b(hx $$0) {
      if (this.m) {
         return false;
      } else if (this.c != null && !this.c.c() && this.c.e() != 0) {
         efm $$1 = this.c.d();
         emc $$2 = new emc(((double)$$1.a + this.a.dq()) / 2.0, ((double)$$1.b + this.a.ds()) / 2.0, ((double)$$1.c + this.a.dw()) / 2.0);
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
