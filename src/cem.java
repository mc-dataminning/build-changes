import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cem {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final bvc a;
   protected final dfb b;
   @Nullable
   protected ery c;
   protected double d;
   protected int e;
   protected int f;
   protected ezn g = ezn.c;
   protected kl h = kl.g;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected erx o;
   @Nullable
   private jh s;
   private int t;
   private float u = 1.0F;
   private final esa v;
   private boolean w;
   private float x = 16.0F;

   public cem(bvc $$0, dfb $$1) {
      this.a = $$0;
      this.b = $$1;
      this.v = this.a(azk.a($$0.i(bwi.m) * 16.0));
   }

   public void g() {
      int $$0 = azk.d(this.e() * 16.0F);
      this.v.a($$0);
   }

   public void a(float $$0) {
      this.x = $$0;
      this.g();
   }

   private float e() {
      return Math.max((float)this.a.h(bwi.m), this.x);
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

   protected abstract esa a(int var1);

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
   public final ery a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(jh.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public ery a(Stream<jh> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public ery a(Set<jh> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public ery a(jh $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public ery a(jh $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public ery a(bue $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.dx()), 16, true, $$1);
   }

   @Nullable
   protected ery a(Set<jh> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.e());
   }

   @Nullable
   protected ery a(Set<jh> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.dE() < (double)this.b.I_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         bon $$5 = bom.a();
         $$5.a("pathfind");
         jh $$6 = $$2 ? this.a.dx().d() : this.a.dx();
         int $$7 = (int)($$4 + (float)$$1);
         dfo $$8 = new dfo(this.b, $$6.b(-$$7, -$$7, -$$7), $$6.b($$7, $$7, $$7));
         ery $$9 = this.v.a($$8, this.a, $$0, $$4, $$3, this.u);
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

   public boolean a(bue $$0, double $$1) {
      ery $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable ery $$0, double $$1) {
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
               ezn $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public ery k() {
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
            ezn $$0 = this.b();
            ezn $$1 = this.c.a(this.a);
            if ($$0.e > $$1.e && !this.a.aK() && azk.a($$0.d) == azk.a($$1.d) && azk.a($$0.f) == azk.a($$1.f)) {
               this.c.a();
            }
         }

         ags.a(this.b, this.a, this.c, this.l);
         if (!this.m()) {
            ezn $$2 = this.c.a(this.a);
            this.a.M().a($$2.d, this.a($$2), $$2.f, this.d);
         }
      }
   }

   protected double a(ezn $$0) {
      jh $$1 = jh.a((ka)$$0);
      return this.b.a_($$1.e()).l() ? $$0.e : esg.a(this.b, $$1);
   }

   protected void l() {
      ezn $$0 = this.b();
      this.l = this.a.ds() > 0.75F ? this.a.ds() / 2.0F : 0.75F - this.a.ds() / 2.0F;
      kl $$1 = this.c.g();
      double $$2 = Math.abs(this.a.dC() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.dE() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dI() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(ezn $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         ezn $$1 = ezn.c(this.c.g());
         if (!$$0.a((ka)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            ezn $$2 = ezn.c(this.c.d(this.c.f() + 1));
            ezn $$3 = $$1.d($$0);
            ezn $$4 = $$2.d($$0);
            double $$5 = $$3.h();
            double $$6 = $$4.h();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               ezn $$9 = $$3.d();
               ezn $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(ezn $$0) {
      if (this.e - this.f > 100) {
         float $$1 = this.a.fr() >= 1.0F ? this.a.fr() : this.a.fr() * this.a.fr();
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
            double $$5 = $$0.f(ezn.c(this.h));
            this.k = this.a.fr() > 0.0F ? $$5 / (double)this.a.fr() * 20.0 : 0.0;
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

   protected abstract ezn b();

   protected abstract boolean a();

   protected void W_() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            erw $$1 = this.c.a($$0);
            erw $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            dvj $$3 = this.b.a_(new jh($$1.a, $$1.b, $$1.c));
            if ($$3.a(axa.bm)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(ezn $$0, ezn $$1) {
      return false;
   }

   public boolean b(esb $$0) {
      return $$0 != esb.n && $$0 != esb.p && $$0 != esb.d;
   }

   protected static boolean a(bvc $$0, ezn $$1, ezn $$2, boolean $$3) {
      ezn $$4 = new ezn($$2.d, $$2.e + (double)$$0.dt() * 0.5, $$2.f);
      return $$0.dX().a(new dej($$1, $$4, dej.a.a, $$3 ? dej.b.c : dej.b.a, $$0)).d() == ezl.a.a;
   }

   public boolean a(jh $$0) {
      jh $$1 = $$0.e();
      return this.b.a_($$1).s();
   }

   public erx p() {
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
         erw $$1 = this.c.d();
         ezn $$2 = new ezn(((double)$$1.a + this.a.dC()) / 2.0, ((double)$$1.b + this.a.dE()) / 2.0, ((double)$$1.c + this.a.dI()) / 2.0);
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
