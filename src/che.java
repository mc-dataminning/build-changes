import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class che {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final bxw a;
   protected final djx b;
   @Nullable
   protected eyc c;
   protected double d;
   protected int e;
   protected int f;
   protected ffq g = ffq.c;
   protected ka h = ka.i;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected eyb o;
   @Nullable
   private iv s;
   private int t;
   private float u = 1.0F;
   private final eye v;
   private boolean w;
   private float x = 16.0F;

   public che(bxw $$0, djx $$1) {
      this.a = $$0;
      this.b = $$1;
      this.v = this.a(azo.a($$0.i(bza.m) * 16.0));
   }

   public void e() {
      int $$0 = azo.d(this.r() * 16.0F);
      this.v.a($$0);
   }

   public void a(float $$0) {
      this.x = $$0;
      this.e();
   }

   private float r() {
      return Math.max((float)this.a.h(bza.m), this.x);
   }

   public void f() {
      this.u = 1.0F;
   }

   public void b(float $$0) {
      this.u = $$0;
   }

   @Nullable
   public iv g() {
      return this.s;
   }

   protected abstract eye a(int var1);

   public void a(double $$0) {
      this.d = $$0;
   }

   public void h() {
      if (this.b.ae() - this.n > 20L) {
         if (this.s != null) {
            this.c = null;
            this.c = this.a(this.s, this.t);
            this.n = this.b.ae();
            this.m = false;
         }
      } else {
         this.m = true;
      }
   }

   @Nullable
   public final eyc a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(iv.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public eyc a(Stream<iv> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public eyc a(Set<iv> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public eyc a(iv $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public eyc a(iv $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public eyc a(bwt $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.dv()), 16, true, $$1);
   }

   @Nullable
   protected eyc a(Set<iv> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.r());
   }

   @Nullable
   protected eyc a(Set<iv> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.dC() < (double)this.b.K_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         brb $$5 = bra.a();
         $$5.a("pathfind");
         iv $$6 = $$2 ? this.a.dv().d() : this.a.dv();
         int $$7 = (int)($$4 + (float)$$1);
         dkk $$8 = new dkk(this.b, $$6.b(-$$7, -$$7, -$$7), $$6.b($$7, $$7, $$7));
         eyc $$9 = this.v.a($$8, this.a, $$0, $$4, $$3, this.u);
         $$5.c();
         if ($$9 != null && $$9.l() != null) {
            this.s = $$9.l();
            this.t = $$3;
            this.t();
         }

         return $$9;
      }
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.a(this.a($$0, $$1, $$2, 1), $$3);
   }

   public boolean a(double $$0, double $$1, double $$2, int $$3, double $$4) {
      return this.a(this.a($$0, $$1, $$2, $$3), $$4);
   }

   public boolean a(bwt $$0, double $$1) {
      eyc $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable eyc $$0, double $$1) {
      if ($$0 == null) {
         this.c = null;
         return false;
      } else {
         if (!$$0.a(this.c)) {
            this.c = $$0;
         }

         if (this.k()) {
            return false;
         } else {
            this.d();
            if (this.c.e() <= 0) {
               return false;
            } else {
               this.d = $$1;
               ffq $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public eyc i() {
      return this.c;
   }

   public void c() {
      this.e++;
      if (this.m) {
         this.h();
      }

      if (!this.k()) {
         if (this.a()) {
            this.j();
         } else if (this.c != null && !this.c.c()) {
            ffq $$0 = this.b();
            ffq $$1 = this.c.a(this.a);
            if ($$0.e > $$1.e && !this.a.aH() && azo.a($$0.d) == azo.a($$1.d) && azo.a($$0.f) == azo.a($$1.f)) {
               this.c.a();
            }
         }

         ago.a(this.b, this.a, this.c, this.l);
         if (!this.k()) {
            ffq $$2 = this.c.a(this.a);
            this.a.L().a($$2.d, this.a($$2), $$2.f, this.d);
         }
      }
   }

   protected double a(ffq $$0) {
      iv $$1 = iv.a((jp)$$0);
      return this.b.a_($$1.e()).l() ? $$0.e : eyk.a(this.b, $$1);
   }

   protected void j() {
      ffq $$0 = this.b();
      this.l = this.a.dq() > 0.75F ? this.a.dq() / 2.0F : 0.75F - this.a.dq() / 2.0F;
      ka $$1 = this.c.g();
      double $$2 = Math.abs(this.a.dA() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.dC() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dG() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(ffq $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         ffq $$1 = ffq.c(this.c.g());
         if (!$$0.a((jp)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            ffq $$2 = ffq.c(this.c.d(this.c.f() + 1));
            ffq $$3 = $$1.d($$0);
            ffq $$4 = $$2.d($$0);
            double $$5 = $$3.h();
            double $$6 = $$4.h();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               ffq $$9 = $$3.d();
               ffq $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(ffq $$0) {
      if (this.e - this.f > 100) {
         float $$1 = this.a.fo() >= 1.0F ? this.a.fo() : this.a.fo() * this.a.fo();
         float $$2 = $$1 * 100.0F * 0.25F;
         if ($$0.g(this.g) < (double)($$2 * $$2)) {
            this.w = true;
            this.m();
         } else {
            this.w = false;
         }

         this.f = this.e;
         this.g = $$0;
      }

      if (this.c != null && !this.c.c()) {
         ka $$3 = this.c.g();
         long $$4 = this.b.ae();
         if ($$3.equals(this.h)) {
            this.i = this.i + ($$4 - this.j);
         } else {
            this.h = $$3;
            double $$5 = $$0.f(ffq.c(this.h));
            this.k = this.a.fo() > 0.0F ? $$5 / (double)this.a.fo() * 20.0 : 0.0;
         }

         if (this.k > 0.0 && (double)this.i > this.k * 3.0) {
            this.s();
         }

         this.j = $$4;
      }
   }

   private void s() {
      this.t();
      this.m();
   }

   private void t() {
      this.h = ka.i;
      this.i = 0L;
      this.k = 0.0;
      this.w = false;
   }

   public boolean k() {
      return this.c == null || this.c.c();
   }

   public boolean l() {
      return !this.k();
   }

   public void m() {
      this.c = null;
   }

   protected abstract ffq b();

   protected abstract boolean a();

   protected void d() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eya $$1 = this.c.a($$0);
            eya $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            ebe $$3 = this.b.a_(new iv($$1.a, $$1.b, $$1.c));
            if ($$3.a(axe.bo)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(ffq $$0, ffq $$1) {
      return false;
   }

   public boolean b(eyf $$0) {
      return $$0 != eyf.n && $$0 != eyf.p && $$0 != eyf.d;
   }

   protected static boolean a(bxw $$0, ffq $$1, ffq $$2, boolean $$3) {
      ffq $$4 = new ffq($$2.d, $$2.e + (double)$$0.dr() * 0.5, $$2.f);
      return $$0.dV().a(new dje($$1, $$4, dje.a.a, $$3 ? dje.b.c : dje.b.a, $$0)).d() == ffo.a.a;
   }

   public boolean a(iv $$0) {
      iv $$1 = $$0.e();
      return this.b.a_($$1).s();
   }

   public eyb n() {
      return this.o;
   }

   public void a(boolean $$0) {
      this.o.c($$0);
   }

   public boolean o() {
      return this.o.f();
   }

   public boolean b(iv $$0) {
      if (this.m) {
         return false;
      } else if (this.c != null && !this.c.c() && this.c.e() != 0) {
         eya $$1 = this.c.d();
         ffq $$2 = new ffq(((double)$$1.a + this.a.dA()) / 2.0, ((double)$$1.b + this.a.dC()) / 2.0, ((double)$$1.c + this.a.dG()) / 2.0);
         return $$0.a($$2, (double)(this.c.e() - this.c.f()));
      } else {
         return false;
      }
   }

   public float p() {
      return this.l;
   }

   public boolean q() {
      return this.w;
   }
}
