import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cet {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final bvj a;
   protected final dfm b;
   @Nullable
   protected esj c;
   protected double d;
   protected int e;
   protected int f;
   protected ezy g = ezy.c;
   protected kl h = kl.g;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected esi o;
   @Nullable
   private jh s;
   private int t;
   private float u = 1.0F;
   private final esl v;
   private boolean w;
   private float x = 16.0F;

   public cet(bvj $$0, dfm $$1) {
      this.a = $$0;
      this.b = $$1;
      this.v = this.a(azm.a($$0.i(bwp.m) * 16.0));
   }

   public void g() {
      int $$0 = azm.d(this.e() * 16.0F);
      this.v.a($$0);
   }

   public void a(float $$0) {
      this.x = $$0;
      this.g();
   }

   private float e() {
      return Math.max((float)this.a.h(bwp.m), this.x);
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

   protected abstract esl a(int var1);

   public void a(double $$0) {
      this.d = $$0;
   }

   public void j() {
      if (this.b.ab() - this.n > 20L) {
         if (this.s != null) {
            this.c = null;
            this.c = this.a(this.s, this.t);
            this.n = this.b.ab();
            this.m = false;
         }
      } else {
         this.m = true;
      }
   }

   @Nullable
   public final esj a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(jh.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public esj a(Stream<jh> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public esj a(Set<jh> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public esj a(jh $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public esj a(jh $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public esj a(bul $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.dv()), 16, true, $$1);
   }

   @Nullable
   protected esj a(Set<jh> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.e());
   }

   @Nullable
   protected esj a(Set<jh> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.dC() < (double)this.b.K_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         bou $$5 = bot.a();
         $$5.a("pathfind");
         jh $$6 = $$2 ? this.a.dv().d() : this.a.dv();
         int $$7 = (int)($$4 + (float)$$1);
         dfz $$8 = new dfz(this.b, $$6.b(-$$7, -$$7, -$$7), $$6.b($$7, $$7, $$7));
         esj $$9 = this.v.a($$8, this.a, $$0, $$4, $$3, this.u);
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

   public boolean a(bul $$0, double $$1) {
      esj $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable esj $$0, double $$1) {
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
               ezy $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public esj k() {
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
            ezy $$0 = this.b();
            ezy $$1 = this.c.a(this.a);
            if ($$0.e > $$1.e && !this.a.aJ() && azm.a($$0.d) == azm.a($$1.d) && azm.a($$0.f) == azm.a($$1.f)) {
               this.c.a();
            }
         }

         agt.a(this.b, this.a, this.c, this.l);
         if (!this.m()) {
            ezy $$2 = this.c.a(this.a);
            this.a.I().a($$2.d, this.a($$2), $$2.f, this.d);
         }
      }
   }

   protected double a(ezy $$0) {
      jh $$1 = jh.a((ka)$$0);
      return this.b.a_($$1.e()).l() ? $$0.e : esr.a(this.b, $$1);
   }

   protected void l() {
      ezy $$0 = this.b();
      this.l = this.a.dq() > 0.75F ? this.a.dq() / 2.0F : 0.75F - this.a.dq() / 2.0F;
      kl $$1 = this.c.g();
      double $$2 = Math.abs(this.a.dA() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.dC() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dG() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(ezy $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         ezy $$1 = ezy.c(this.c.g());
         if (!$$0.a((ka)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            ezy $$2 = ezy.c(this.c.d(this.c.f() + 1));
            ezy $$3 = $$1.d($$0);
            ezy $$4 = $$2.d($$0);
            double $$5 = $$3.h();
            double $$6 = $$4.h();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               ezy $$9 = $$3.d();
               ezy $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(ezy $$0) {
      if (this.e - this.f > 100) {
         float $$1 = this.a.fn() >= 1.0F ? this.a.fn() : this.a.fn() * this.a.fn();
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
         long $$4 = this.b.ab();
         if ($$3.equals(this.h)) {
            this.i = this.i + ($$4 - this.j);
         } else {
            this.h = $$3;
            double $$5 = $$0.f(ezy.c(this.h));
            this.k = this.a.fn() > 0.0F ? $$5 / (double)this.a.fn() * 20.0 : 0.0;
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

   protected abstract ezy b();

   protected abstract boolean a();

   protected void U_() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            esh $$1 = this.c.a($$0);
            esh $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            dvv $$3 = this.b.a_(new jh($$1.a, $$1.b, $$1.c));
            if ($$3.a(axc.bm)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(ezy $$0, ezy $$1) {
      return false;
   }

   public boolean b(esm $$0) {
      return $$0 != esm.n && $$0 != esm.p && $$0 != esm.d;
   }

   protected static boolean a(bvj $$0, ezy $$1, ezy $$2, boolean $$3) {
      ezy $$4 = new ezy($$2.d, $$2.e + (double)$$0.dr() * 0.5, $$2.f);
      return $$0.dV().a(new deu($$1, $$4, deu.a.a, $$3 ? deu.b.c : deu.b.a, $$0)).d() == ezw.a.a;
   }

   public boolean a(jh $$0) {
      jh $$1 = $$0.e();
      return this.b.a_($$1).s();
   }

   public esi p() {
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
         esh $$1 = this.c.d();
         ezy $$2 = new ezy(((double)$$1.a + this.a.dA()) / 2.0, ((double)$$1.b + this.a.dC()) / 2.0, ((double)$$1.c + this.a.dG()) / 2.0);
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
