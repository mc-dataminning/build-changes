import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cer {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final bvh a;
   protected final dgg b;
   @Nullable
   protected etl c;
   protected double d;
   protected int e;
   protected int f;
   protected fay g = fay.c;
   protected km h;
   protected long i;
   protected long j;
   protected double k;
   protected float l;
   protected boolean m;
   protected long n;
   protected etk o;
   @Nullable
   private ji s;
   private int t;
   private float u;
   private final etn v;
   private boolean w;
   private float x;

   public cer(bvh $$0, dgg $$1) {
      this.h = km.h;
      this.l = 0.5F;
      this.u = 1.0F;
      this.x = 16.0F;
      this.a = $$0;
      this.b = $$1;
      this.v = this.a(ayy.a($$0.i(bwn.m) * 16.0));
   }

   public void e() {
      int $$0 = ayy.d(this.r() * 16.0F);
      this.v.a($$0);
   }

   public void a(float $$0) {
      this.x = $$0;
      this.e();
   }

   private float r() {
      return Math.max((float)this.a.h(bwn.m), this.x);
   }

   public void f() {
      this.u = 1.0F;
   }

   public void b(float $$0) {
      this.u = $$0;
   }

   @Nullable
   public ji g() {
      return this.s;
   }

   protected abstract etn a(int var1);

   public void a(double $$0) {
      this.d = $$0;
   }

   public void h() {
      if (this.b.ad() - this.n > 20L) {
         if (this.s != null) {
            this.c = null;
            this.c = this.a(this.s, this.t);
            this.n = this.b.ad();
            this.m = false;
         }
      } else {
         this.m = true;
      }
   }

   @Nullable
   public final etl a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(ji.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public etl a(Stream<ji> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public etl a(Set<ji> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public etl a(ji $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public etl a(ji $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public etl a(buj $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.dw()), 16, true, $$1);
   }

   @Nullable
   protected etl a(Set<ji> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.r());
   }

   @Nullable
   protected etl a(Set<ji> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.dD() < (double)this.b.L_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         bor $$5 = boq.a();
         $$5.a("pathfind");
         ji $$6 = $$2 ? this.a.dw().d() : this.a.dw();
         int $$7 = (int)($$4 + (float)$$1);
         dgt $$8 = new dgt(this.b, $$6.b(-$$7, -$$7, -$$7), $$6.b($$7, $$7, $$7));
         etl $$9 = this.v.a($$8, this.a, $$0, $$4, $$3, this.u);
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

   public boolean a(buj $$0, double $$1) {
      etl $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable etl $$0, double $$1) {
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
               fay $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public etl i() {
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
            fay $$0 = this.b();
            fay $$1 = this.c.a(this.a);
            if ($$0.e > $$1.e && !this.a.aJ() && ayy.a($$0.d) == ayy.a($$1.d) && ayy.a($$0.f) == ayy.a($$1.f)) {
               this.c.a();
            }
         }

         agc.a(this.b, this.a, this.c, this.l);
         if (!this.k()) {
            fay $$2 = this.c.a(this.a);
            this.a.I().a($$2.d, this.a($$2), $$2.f, this.d);
         }
      }
   }

   protected double a(fay $$0) {
      ji $$1 = ji.a((kb)$$0);
      return this.b.a_($$1.e()).l() ? $$0.e : ett.a(this.b, $$1);
   }

   protected void j() {
      fay $$0 = this.b();
      this.l = this.a.dr() > 0.75F ? this.a.dr() / 2.0F : 0.75F - this.a.dr() / 2.0F;
      km $$1 = this.c.g();
      double $$2 = Math.abs(this.a.dB() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.dD() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dH() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(fay $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         fay $$1 = fay.c(this.c.g());
         if (!$$0.a((kb)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            fay $$2 = fay.c(this.c.d(this.c.f() + 1));
            fay $$3 = $$1.d($$0);
            fay $$4 = $$2.d($$0);
            double $$5 = $$3.h();
            double $$6 = $$4.h();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               fay $$9 = $$3.d();
               fay $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(fay $$0) {
      if (this.e - this.f > 100) {
         float $$1 = this.a.fp() >= 1.0F ? this.a.fp() : this.a.fp() * this.a.fp();
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
         km $$3 = this.c.g();
         long $$4 = this.b.ad();
         if ($$3.equals(this.h)) {
            this.i = this.i + ($$4 - this.j);
         } else {
            this.h = $$3;
            double $$5 = $$0.f(fay.c(this.h));
            this.k = this.a.fp() > 0.0F ? $$5 / (double)this.a.fp() * 20.0 : 0.0;
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
      this.h = km.h;
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

   protected abstract fay b();

   protected abstract boolean a();

   protected void d() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            etj $$1 = this.c.a($$0);
            etj $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            dwv $$3 = this.b.a_(new ji($$1.a, $$1.b, $$1.c));
            if ($$3.a(awo.bn)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(fay $$0, fay $$1) {
      return false;
   }

   public boolean b(eto $$0) {
      return $$0 != eto.n && $$0 != eto.p && $$0 != eto.d;
   }

   protected static boolean a(bvh $$0, fay $$1, fay $$2, boolean $$3) {
      fay $$4 = new fay($$2.d, $$2.e + (double)$$0.ds() * 0.5, $$2.f);
      return $$0.dW().a(new dfo($$1, $$4, dfo.a.a, $$3 ? dfo.b.c : dfo.b.a, $$0)).d() == faw.a.a;
   }

   public boolean a(ji $$0) {
      ji $$1 = $$0.e();
      return this.b.a_($$1).s();
   }

   public etk n() {
      return this.o;
   }

   public void a(boolean $$0) {
      this.o.c($$0);
   }

   public boolean o() {
      return this.o.f();
   }

   public boolean b(ji $$0) {
      if (this.m) {
         return false;
      } else if (this.c != null && !this.c.c() && this.c.e() != 0) {
         etj $$1 = this.c.d();
         fay $$2 = new fay(((double)$$1.a + this.a.dB()) / 2.0, ((double)$$1.b + this.a.dD()) / 2.0, ((double)$$1.c + this.a.dH()) / 2.0);
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
