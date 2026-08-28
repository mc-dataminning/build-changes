import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class ceq {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final bvg a;
   protected final dff b;
   @Nullable
   protected esc c;
   protected double d;
   protected int e;
   protected int f;
   protected ezr g = ezr.c;
   protected kl h = kl.g;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected esb o;
   @Nullable
   private jh s;
   private int t;
   private float u = 1.0F;
   private final ese v;
   private boolean w;
   private float x = 16.0F;

   public ceq(bvg $$0, dff $$1) {
      this.a = $$0;
      this.b = $$1;
      this.v = this.a(azn.a($$0.i(bwm.m) * 16.0));
   }

   public void g() {
      int $$0 = azn.d(this.e() * 16.0F);
      this.v.a($$0);
   }

   public void a(float $$0) {
      this.x = $$0;
      this.g();
   }

   private float e() {
      return Math.max((float)this.a.h(bwm.m), this.x);
   }

   public void h() {
      this.u = 1.0F;
   }

   public void b(float $$0) {
      this.u = $$0;
   }

   @Nullable
   public jh i() {
      return this.s;
   }

   protected abstract ese a(int var1);

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
   public final esc a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(jh.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public esc a(Stream<jh> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public esc a(Set<jh> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public esc a(jh $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public esc a(jh $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public esc a(bui $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.dy()), 16, true, $$1);
   }

   @Nullable
   protected esc a(Set<jh> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.e());
   }

   @Nullable
   protected esc a(Set<jh> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.dF() < (double)this.b.I_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         bor $$5 = boq.a();
         $$5.a("pathfind");
         jh $$6 = $$2 ? this.a.dy().d() : this.a.dy();
         int $$7 = (int)($$4 + (float)$$1);
         dfs $$8 = new dfs(this.b, $$6.b(-$$7, -$$7, -$$7), $$6.b($$7, $$7, $$7));
         esc $$9 = this.v.a($$8, this.a, $$0, $$4, $$3, this.u);
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

   public boolean a(bui $$0, double $$1) {
      esc $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable esc $$0, double $$1) {
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
            this.W_();
            if (this.c.e() <= 0) {
               return false;
            } else {
               this.d = $$1;
               ezr $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public esc k() {
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
            ezr $$0 = this.b();
            ezr $$1 = this.c.a(this.a);
            if ($$0.e > $$1.e && !this.a.aL() && azn.a($$0.d) == azn.a($$1.d) && azn.a($$0.f) == azn.a($$1.f)) {
               this.c.a();
            }
         }

         agv.a(this.b, this.a, this.c, this.l);
         if (!this.m()) {
            ezr $$2 = this.c.a(this.a);
            this.a.M().a($$2.d, this.a($$2), $$2.f, this.d);
         }
      }
   }

   protected double a(ezr $$0) {
      jh $$1 = jh.a((ka)$$0);
      return this.b.a_($$1.e()).l() ? $$0.e : esk.a(this.b, $$1);
   }

   protected void l() {
      ezr $$0 = this.b();
      this.l = this.a.dt() > 0.75F ? this.a.dt() / 2.0F : 0.75F - this.a.dt() / 2.0F;
      kl $$1 = this.c.g();
      double $$2 = Math.abs(this.a.dD() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.dF() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dJ() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(ezr $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         ezr $$1 = ezr.c(this.c.g());
         if (!$$0.a((ka)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            ezr $$2 = ezr.c(this.c.d(this.c.f() + 1));
            ezr $$3 = $$1.d($$0);
            ezr $$4 = $$2.d($$0);
            double $$5 = $$3.h();
            double $$6 = $$4.h();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               ezr $$9 = $$3.d();
               ezr $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(ezr $$0) {
      if (this.e - this.f > 100) {
         float $$1 = this.a.fs() >= 1.0F ? this.a.fs() : this.a.fs() * this.a.fs();
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
         kl $$3 = this.c.g();
         long $$4 = this.b.aa();
         if ($$3.equals(this.h)) {
            this.i = this.i + ($$4 - this.j);
         } else {
            this.h = $$3;
            double $$5 = $$0.f(ezr.c(this.h));
            this.k = this.a.fs() > 0.0F ? $$5 / (double)this.a.fs() * 20.0 : 0.0;
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
      this.h = kl.g;
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

   protected abstract ezr b();

   protected abstract boolean a();

   protected void W_() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            esa $$1 = this.c.a($$0);
            esa $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            dvo $$3 = this.b.a_(new jh($$1.a, $$1.b, $$1.c));
            if ($$3.a(axd.bm)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(ezr $$0, ezr $$1) {
      return false;
   }

   public boolean b(esf $$0) {
      return $$0 != esf.n && $$0 != esf.p && $$0 != esf.d;
   }

   protected static boolean a(bvg $$0, ezr $$1, ezr $$2, boolean $$3) {
      ezr $$4 = new ezr($$2.d, $$2.e + (double)$$0.du() * 0.5, $$2.f);
      return $$0.dY().a(new den($$1, $$4, den.a.a, $$3 ? den.b.c : den.b.a, $$0)).d() == ezp.a.a;
   }

   public boolean a(jh $$0) {
      jh $$1 = $$0.e();
      return this.b.a_($$1).s();
   }

   public esb p() {
      return this.o;
   }

   public void a(boolean $$0) {
      this.o.c($$0);
   }

   public boolean q() {
      return this.o.f();
   }

   public boolean b(jh $$0) {
      if (this.m) {
         return false;
      } else if (this.c != null && !this.c.c() && this.c.e() != 0) {
         esa $$1 = this.c.d();
         ezr $$2 = new ezr(((double)$$1.a + this.a.dD()) / 2.0, ((double)$$1.b + this.a.dF()) / 2.0, ((double)$$1.c + this.a.dJ()) / 2.0);
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
