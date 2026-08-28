import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cda {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final btp a;
   protected final dcw b;
   @Nullable
   protected epq c;
   protected double d;
   protected int e;
   protected int f;
   protected exa g = exa.b;
   protected kh h = kh.g;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected epp o;
   @Nullable
   private jd s;
   private int t;
   private float u = 1.0F;
   private final eps v;
   private boolean w;

   public cda(btp $$0, dcw $$1) {
      this.a = $$0;
      this.b = $$1;
      int $$2 = ayo.a($$0.g(buw.m) * 16.0);
      this.v = this.a($$2);
   }

   public void g() {
      this.u = 1.0F;
   }

   public void a(float $$0) {
      this.u = $$0;
   }

   @Nullable
   public jd h() {
      return this.s;
   }

   protected abstract eps a(int var1);

   public void a(double $$0) {
      this.d = $$0;
   }

   public void i() {
      if (this.b.Z() - this.n > 20L) {
         if (this.s != null) {
            this.c = null;
            this.c = this.a(this.s, this.t);
            this.n = this.b.Z();
            this.m = false;
         }
      } else {
         this.m = true;
      }
   }

   @Nullable
   public final epq a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(jd.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public epq a(Stream<jd> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public epq a(Set<jd> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public epq a(jd $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public epq a(jd $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public epq a(bsr $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.dp()), 16, true, $$1);
   }

   @Nullable
   protected epq a(Set<jd> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, (float)this.a.g(buw.m));
   }

   @Nullable
   protected epq a(Set<jd> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.dw() < (double)this.b.I_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         this.b.ag().a("pathfind");
         jd $$5 = $$2 ? this.a.dp().d() : this.a.dp();
         int $$6 = (int)($$4 + (float)$$1);
         ddj $$7 = new ddj(this.b, $$5.b(-$$6, -$$6, -$$6), $$5.b($$6, $$6, $$6));
         epq $$8 = this.v.a($$7, this.a, $$0, $$4, $$3, this.u);
         this.b.ag().c();
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

   public boolean a(double $$0, double $$1, double $$2, int $$3, double $$4) {
      return this.a(this.a($$0, $$1, $$2, $$3), $$4);
   }

   public boolean a(bsr $$0, double $$1) {
      epq $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable epq $$0, double $$1) {
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
            this.W_();
            if (this.c.e() <= 0) {
               return false;
            } else {
               this.d = $$1;
               exa $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public epq j() {
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
            exa $$0 = this.b();
            exa $$1 = this.c.a(this.a);
            if ($$0.d > $$1.d && !this.a.aF() && ayo.a($$0.c) == ayo.a($$1.c) && ayo.a($$0.e) == ayo.a($$1.e)) {
               this.c.a();
            }
         }

         agf.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            exa $$2 = this.c.a(this.a);
            this.a.J().a($$2.c, this.a($$2), $$2.e, this.d);
         }
      }
   }

   protected double a(exa $$0) {
      jd $$1 = jd.a((jw)$$0);
      return this.b.a_($$1.e()).i() ? $$0.d : epy.a(this.b, $$1);
   }

   protected void k() {
      exa $$0 = this.b();
      this.l = this.a.dk() > 0.75F ? this.a.dk() / 2.0F : 0.75F - this.a.dk() / 2.0F;
      kh $$1 = this.c.g();
      double $$2 = Math.abs(this.a.du() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.dw() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dA() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(exa $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         exa $$1 = exa.c(this.c.g());
         if (!$$0.a((jw)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            exa $$2 = exa.c(this.c.d(this.c.f() + 1));
            exa $$3 = $$1.d($$0);
            exa $$4 = $$2.d($$0);
            double $$5 = $$3.g();
            double $$6 = $$4.g();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               exa $$9 = $$3.d();
               exa $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(exa $$0) {
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
         kh $$3 = this.c.g();
         long $$4 = this.b.Z();
         if ($$3.equals(this.h)) {
            this.i = this.i + ($$4 - this.j);
         } else {
            this.h = $$3;
            double $$5 = $$0.f(exa.c(this.h));
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
      this.h = kh.g;
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

   protected abstract exa b();

   protected abstract boolean a();

   protected void W_() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            epo $$1 = this.c.a($$0);
            epo $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            dtc $$3 = this.b.a_(new jd($$1.a, $$1.b, $$1.c));
            if ($$3.a(awe.bl)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(exa $$0, exa $$1) {
      return false;
   }

   public boolean b(ept $$0) {
      return $$0 != ept.n && $$0 != ept.p && $$0 != ept.d;
   }

   protected static boolean a(btp $$0, exa $$1, exa $$2, boolean $$3) {
      exa $$4 = new exa($$2.c, $$2.d + (double)$$0.dl() * 0.5, $$2.e);
      return $$0.dP().a(new dcf($$1, $$4, dcf.a.a, $$3 ? dcf.b.c : dcf.b.a, $$0)).c() == ewy.a.a;
   }

   public boolean a(jd $$0) {
      jd $$1 = $$0.e();
      return this.b.a_($$1).i(this.b, $$1);
   }

   public epp o() {
      return this.o;
   }

   public void a(boolean $$0) {
      this.o.c($$0);
   }

   public boolean p() {
      return this.o.f();
   }

   public boolean b(jd $$0) {
      if (this.m) {
         return false;
      } else if (this.c != null && !this.c.c() && this.c.e() != 0) {
         epo $$1 = this.c.d();
         exa $$2 = new exa(((double)$$1.a + this.a.du()) / 2.0, ((double)$$1.b + this.a.dw()) / 2.0, ((double)$$1.c + this.a.dA()) / 2.0);
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
