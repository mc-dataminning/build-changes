import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cdq {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final buh a;
   protected final dds b;
   @Nullable
   protected eqp c;
   protected double d;
   protected int e;
   protected int f;
   protected eye g = eye.c;
   protected ki h = ki.g;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected eqo o;
   @Nullable
   private je s;
   private int t;
   private float u = 1.0F;
   private final eqr v;
   private boolean w;
   private float x = 16.0F;

   public cdq(buh $$0, dds $$1) {
      this.a = $$0;
      this.b = $$1;
      this.v = this.a(azc.a($$0.i(bvm.m) * 16.0));
   }

   public void g() {
      int $$0 = azc.d(this.e() * 16.0F);
      this.v.a($$0);
   }

   public void a(float $$0) {
      this.x = $$0;
      this.g();
   }

   private float e() {
      return Math.max((float)this.a.h(bvm.m), this.x);
   }

   public void h() {
      this.u = 1.0F;
   }

   public void b(float $$0) {
      this.u = $$0;
   }

   @Nullable
   public je i() {
      return this.s;
   }

   protected abstract eqr a(int var1);

   public void a(double $$0) {
      this.d = $$0;
   }

   public void j() {
      if (this.b.aa() - this.n > 20L) {
         if (this.s != null) {
            this.c = null;
            this.c = this.a(this.s, this.t);
            this.n = this.b.aa();
            this.m = false;
         }
      } else {
         this.m = true;
      }
   }

   @Nullable
   public final eqp a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(je.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public eqp a(Stream<je> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public eqp a(Set<je> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public eqp a(je $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public eqp a(je $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public eqp a(btj $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.ds()), 16, true, $$1);
   }

   @Nullable
   protected eqp a(Set<je> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.e());
   }

   @Nullable
   protected eqp a(Set<je> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.dz() < (double)this.b.G_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         this.b.ah().a("pathfind");
         je $$5 = $$2 ? this.a.ds().d() : this.a.ds();
         int $$6 = (int)($$4 + (float)$$1);
         def $$7 = new def(this.b, $$5.b(-$$6, -$$6, -$$6), $$5.b($$6, $$6, $$6));
         eqp $$8 = this.v.a($$7, this.a, $$0, $$4, $$3, this.u);
         this.b.ah().c();
         if ($$8 != null && $$8.l() != null) {
            this.s = $$8.l();
            this.t = $$3;
            this.t();
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

   public boolean a(btj $$0, double $$1) {
      eqp $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable eqp $$0, double $$1) {
      if ($$0 == null) {
         this.c = null;
         return false;
      } else {
         if (!$$0.a(this.c)) {
            this.c = $$0;
         }

         if (this.m()) {
            return false;
         } else {
            this.U_();
            if (this.c.e() <= 0) {
               return false;
            } else {
               this.d = $$1;
               eye $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public eqp k() {
      return this.c;
   }

   public void c() {
      this.e++;
      if (this.m) {
         this.j();
      }

      if (!this.m()) {
         if (this.a()) {
            this.l();
         } else if (this.c != null && !this.c.c()) {
            eye $$0 = this.b();
            eye $$1 = this.c.a(this.a);
            if ($$0.e > $$1.e && !this.a.aH() && azc.a($$0.d) == azc.a($$1.d) && azc.a($$0.f) == azc.a($$1.f)) {
               this.c.a();
            }
         }

         agn.a(this.b, this.a, this.c, this.l);
         if (!this.m()) {
            eye $$2 = this.c.a(this.a);
            this.a.M().a($$2.d, this.a($$2), $$2.f, this.d);
         }
      }
   }

   protected double a(eye $$0) {
      je $$1 = je.a((jx)$$0);
      return this.b.a_($$1.e()).l() ? $$0.e : eqx.a(this.b, $$1);
   }

   protected void l() {
      eye $$0 = this.b();
      this.l = this.a.dn() > 0.75F ? this.a.dn() / 2.0F : 0.75F - this.a.dn() / 2.0F;
      ki $$1 = this.c.g();
      double $$2 = Math.abs(this.a.dx() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.dz() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dD() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(eye $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         eye $$1 = eye.c(this.c.g());
         if (!$$0.a((jx)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            eye $$2 = eye.c(this.c.d(this.c.f() + 1));
            eye $$3 = $$1.d($$0);
            eye $$4 = $$2.d($$0);
            double $$5 = $$3.h();
            double $$6 = $$4.h();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               eye $$9 = $$3.d();
               eye $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(eye $$0) {
      if (this.e - this.f > 100) {
         float $$1 = this.a.fm() >= 1.0F ? this.a.fm() : this.a.fm() * this.a.fm();
         float $$2 = $$1 * 100.0F * 0.25F;
         if ($$0.g(this.g) < (double)($$2 * $$2)) {
            this.w = true;
            this.o();
         } else {
            this.w = false;
         }

         this.f = this.e;
         this.g = $$0;
      }

      if (this.c != null && !this.c.c()) {
         ki $$3 = this.c.g();
         long $$4 = this.b.aa();
         if ($$3.equals(this.h)) {
            this.i = this.i + ($$4 - this.j);
         } else {
            this.h = $$3;
            double $$5 = $$0.f(eye.c(this.h));
            this.k = this.a.fm() > 0.0F ? $$5 / (double)this.a.fm() * 20.0 : 0.0;
         }

         if (this.k > 0.0 && (double)this.i > this.k * 3.0) {
            this.f();
         }

         this.j = $$4;
      }
   }

   private void f() {
      this.t();
      this.o();
   }

   private void t() {
      this.h = ki.g;
      this.i = 0L;
      this.k = 0.0;
      this.w = false;
   }

   public boolean m() {
      return this.c == null || this.c.c();
   }

   public boolean n() {
      return !this.m();
   }

   public void o() {
      this.c = null;
   }

   protected abstract eye b();

   protected abstract boolean a();

   protected void U_() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eqn $$1 = this.c.a($$0);
            eqn $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            dua $$3 = this.b.a_(new je($$1.a, $$1.b, $$1.c));
            if ($$3.a(aws.bm)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(eye $$0, eye $$1) {
      return false;
   }

   public boolean b(eqs $$0) {
      return $$0 != eqs.n && $$0 != eqs.p && $$0 != eqs.d;
   }

   protected static boolean a(buh $$0, eye $$1, eye $$2, boolean $$3) {
      eye $$4 = new eye($$2.d, $$2.e + (double)$$0.do() * 0.5, $$2.f);
      return $$0.dS().a(new dda($$1, $$4, dda.a.a, $$3 ? dda.b.c : dda.b.a, $$0)).c() == eyc.a.a;
   }

   public boolean a(je $$0) {
      je $$1 = $$0.e();
      return this.b.a_($$1).s();
   }

   public eqo p() {
      return this.o;
   }

   public void a(boolean $$0) {
      this.o.c($$0);
   }

   public boolean q() {
      return this.o.f();
   }

   public boolean b(je $$0) {
      if (this.m) {
         return false;
      } else if (this.c != null && !this.c.c() && this.c.e() != 0) {
         eqn $$1 = this.c.d();
         eye $$2 = new eye(((double)$$1.a + this.a.dx()) / 2.0, ((double)$$1.b + this.a.dz()) / 2.0, ((double)$$1.c + this.a.dD()) / 2.0);
         return $$0.a($$2, (double)(this.c.e() - this.c.f()));
      } else {
         return false;
      }
   }

   public float r() {
      return this.l;
   }

   public boolean s() {
      return this.w;
   }
}
