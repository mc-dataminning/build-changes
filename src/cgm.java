import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cgm {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final bxe a;
   protected final div b;
   @Nullable
   protected ewu c;
   protected double d;
   protected int e;
   protected int f;
   protected fei g = fei.c;
   protected jz h = jz.i;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected ewt o;
   @Nullable
   private iu s;
   private int t;
   private float u = 1.0F;
   private final eww v;
   private boolean w;
   private float x = 16.0F;

   public cgm(bxe $$0, div $$1) {
      this.a = $$0;
      this.b = $$1;
      this.v = this.a(azm.a($$0.i(byi.m) * 16.0));
   }

   public void e() {
      int $$0 = azm.d(this.r() * 16.0F);
      this.v.a($$0);
   }

   public void a(float $$0) {
      this.x = $$0;
      this.e();
   }

   private float r() {
      return Math.max((float)this.a.h(byi.m), this.x);
   }

   public void f() {
      this.u = 1.0F;
   }

   public void b(float $$0) {
      this.u = $$0;
   }

   @Nullable
   public iu g() {
      return this.s;
   }

   protected abstract eww a(int var1);

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
   public final ewu a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(iu.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public ewu a(Stream<iu> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public ewu a(Set<iu> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public ewu a(iu $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public ewu a(iu $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public ewu a(bwd $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.dv()), 16, true, $$1);
   }

   @Nullable
   protected ewu a(Set<iu> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.r());
   }

   @Nullable
   protected ewu a(Set<iu> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.dC() < (double)this.b.G_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         bqm $$5 = bql.a();
         $$5.a("pathfind");
         iu $$6 = $$2 ? this.a.dv().d() : this.a.dv();
         int $$7 = (int)($$4 + (float)$$1);
         dji $$8 = new dji(this.b, $$6.b(-$$7, -$$7, -$$7), $$6.b($$7, $$7, $$7));
         ewu $$9 = this.v.a($$8, this.a, $$0, $$4, $$3, this.u);
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

   public boolean a(bwd $$0, double $$1) {
      ewu $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable ewu $$0, double $$1) {
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
               fei $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public ewu i() {
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
            fei $$0 = this.b();
            fei $$1 = this.c.a(this.a);
            if ($$0.e > $$1.e && !this.a.aJ() && azm.a($$0.d) == azm.a($$1.d) && azm.a($$0.f) == azm.a($$1.f)) {
               this.c.a();
            }
         }

         agm.a(this.b, this.a, this.c, this.l);
         if (!this.k()) {
            fei $$2 = this.c.a(this.a);
            this.a.L().a($$2.d, this.a($$2), $$2.f, this.d);
         }
      }
   }

   protected double a(fei $$0) {
      iu $$1 = iu.a((jo)$$0);
      return this.b.a_($$1.e()).l() ? $$0.e : exc.a(this.b, $$1);
   }

   protected void j() {
      fei $$0 = this.b();
      this.l = this.a.dq() > 0.75F ? this.a.dq() / 2.0F : 0.75F - this.a.dq() / 2.0F;
      jz $$1 = this.c.g();
      double $$2 = Math.abs(this.a.dA() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.dC() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dG() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(fei $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         fei $$1 = fei.c(this.c.g());
         if (!$$0.a((jo)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            fei $$2 = fei.c(this.c.d(this.c.f() + 1));
            fei $$3 = $$1.d($$0);
            fei $$4 = $$2.d($$0);
            double $$5 = $$3.h();
            double $$6 = $$4.h();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               fei $$9 = $$3.d();
               fei $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(fei $$0) {
      if (this.e - this.f > 100) {
         float $$1 = this.a.fn() >= 1.0F ? this.a.fn() : this.a.fn() * this.a.fn();
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
         jz $$3 = this.c.g();
         long $$4 = this.b.ae();
         if ($$3.equals(this.h)) {
            this.i = this.i + ($$4 - this.j);
         } else {
            this.h = $$3;
            double $$5 = $$0.f(fei.c(this.h));
            this.k = this.a.fn() > 0.0F ? $$5 / (double)this.a.fn() * 20.0 : 0.0;
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
      this.h = jz.i;
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

   protected abstract fei b();

   protected abstract boolean a();

   protected void d() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            ews $$1 = this.c.a($$0);
            ews $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            dzz $$3 = this.b.a_(new iu($$1.a, $$1.b, $$1.c));
            if ($$3.a(axc.bn)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(fei $$0, fei $$1) {
      return false;
   }

   public boolean b(ewx $$0) {
      return $$0 != ewx.n && $$0 != ewx.p && $$0 != ewx.d;
   }

   protected static boolean a(bxe $$0, fei $$1, fei $$2, boolean $$3) {
      fei $$4 = new fei($$2.d, $$2.e + (double)$$0.dr() * 0.5, $$2.f);
      return $$0.dV().a(new die($$1, $$4, die.a.a, $$3 ? die.b.c : die.b.a, $$0)).d() == feg.a.a;
   }

   public boolean a(iu $$0) {
      iu $$1 = $$0.e();
      return this.b.a_($$1).s();
   }

   public ewt n() {
      return this.o;
   }

   public void a(boolean $$0) {
      this.o.c($$0);
   }

   public boolean o() {
      return this.o.f();
   }

   public boolean b(iu $$0) {
      if (this.m) {
         return false;
      } else if (this.c != null && !this.c.c() && this.c.e() != 0) {
         ews $$1 = this.c.d();
         fei $$2 = new fei(((double)$$1.a + this.a.dA()) / 2.0, ((double)$$1.b + this.a.dC()) / 2.0, ((double)$$1.c + this.a.dG()) / 2.0);
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
