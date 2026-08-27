import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class bpj {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final bgb a;
   protected final cmm b;
   @Nullable
   protected dxt c;
   protected double d;
   protected int e;
   protected int f;
   protected eei g = eei.b;
   protected hz h = hz.g;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected dxs o;
   @Nullable
   private gu s;
   private int t;
   private float u = 1.0F;
   private final dxv v;
   private boolean w;

   public bpj(bgb $$0, cmm $$1) {
      this.a = $$0;
      this.b = $$1;
      int $$2 = apa.a($$0.b(bhg.b) * 16.0);
      this.v = this.a($$2);
   }

   public void g() {
      this.u = 1.0F;
   }

   public void a(float $$0) {
      this.u = $$0;
   }

   @Nullable
   public gu h() {
      return this.s;
   }

   protected abstract dxv a(int var1);

   public void a(double $$0) {
      this.d = $$0;
   }

   public void i() {
      if (this.b.V() - this.n > 20L) {
         if (this.s != null) {
            this.c = null;
            this.c = this.a(this.s, this.t);
            this.n = this.b.V();
            this.m = false;
         }
      } else {
         this.m = true;
      }
   }

   @Nullable
   public final dxt a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(gu.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public dxt a(Stream<gu> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public dxt a(Set<gu> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public dxt a(gu $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public dxt a(gu $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public dxt a(bfj $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.di()), 16, true, $$1);
   }

   @Nullable
   protected dxt a(Set<gu> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, (float)this.a.b(bhg.b));
   }

   @Nullable
   protected dxt a(Set<gu> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.dp() < (double)this.b.C_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         this.b.ad().a("pathfind");
         gu $$5 = $$2 ? this.a.di().c() : this.a.di();
         int $$6 = (int)($$4 + (float)$$1);
         cmz $$7 = new cmz(this.b, $$5.b(-$$6, -$$6, -$$6), $$5.b($$6, $$6, $$6));
         dxt $$8 = this.v.a($$7, this.a, $$0, $$4, $$3, this.u);
         this.b.ad().c();
         if ($$8 != null && $$8.m() != null) {
            this.s = $$8.m();
            this.t = $$3;
            this.f();
         }

         return $$8;
      }
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.a(this.a($$0, $$1, $$2, 1), $$3);
   }

   public boolean a(bfj $$0, double $$1) {
      dxt $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable dxt $$0, double $$1) {
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
            this.L_();
            if (this.c.e() <= 0) {
               return false;
            } else {
               this.d = $$1;
               eei $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public dxt j() {
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
            eei $$0 = this.b();
            eei $$1 = this.c.a(this.a);
            if ($$0.d > $$1.d && !this.a.ay() && apa.a($$0.c) == apa.a($$1.c) && apa.a($$0.e) == apa.a($$1.e)) {
               this.c.a();
            }
         }

         za.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            eei $$2 = this.c.a(this.a);
            this.a.G().a($$2.c, this.a($$2), $$2.e, this.d);
         }
      }
   }

   protected double a(eei $$0) {
      gu $$1 = gu.a($$0);
      return this.b.a_($$1.d()).i() ? $$0.d : dxy.a(this.b, $$1);
   }

   protected void k() {
      eei $$0 = this.b();
      this.l = this.a.dd() > 0.75F ? this.a.dd() / 2.0F : 0.75F - this.a.dd() / 2.0F;
      hz $$1 = this.c.g();
      double $$2 = Math.abs(this.a.dn() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.dp() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dt() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(eei $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         eei $$1 = eei.c(this.c.g());
         if (!$$0.a((ho)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            eei $$2 = eei.c(this.c.d(this.c.f() + 1));
            eei $$3 = $$1.d($$0);
            eei $$4 = $$2.d($$0);
            double $$5 = $$3.g();
            double $$6 = $$4.g();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               eei $$9 = $$3.d();
               eei $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(eei $$0) {
      if (this.e - this.f > 100) {
         float $$1 = this.a.fa() >= 1.0F ? this.a.fa() : this.a.fa() * this.a.fa();
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
         hz $$3 = this.c.g();
         long $$4 = this.b.V();
         if ($$3.equals(this.h)) {
            this.i = this.i + ($$4 - this.j);
         } else {
            this.h = $$3;
            double $$5 = $$0.f(eei.c(this.h));
            this.k = this.a.fa() > 0.0F ? $$5 / (double)this.a.fa() * 20.0 : 0.0;
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
      this.h = hz.g;
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

   protected abstract eei b();

   protected abstract boolean a();

   protected boolean o() {
      return this.a.aY() || this.a.bi();
   }

   protected void L_() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            dxr $$1 = this.c.a($$0);
            dxr $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            dcb $$3 = this.b.a_(new gu($$1.a, $$1.b, $$1.c));
            if ($$3.a(amw.bj)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(eei $$0, eei $$1) {
      return false;
   }

   public boolean b(dxp $$0) {
      return $$0 != dxp.n && $$0 != dxp.p && $$0 != dxp.d;
   }

   protected static boolean a(bgb $$0, eei $$1, eei $$2, boolean $$3) {
      eei $$4 = new eei($$2.c, $$2.d + (double)$$0.de() * 0.5, $$2.e);
      return $$0.dI().a(new clv($$1, $$4, clv.a.a, $$3 ? clv.b.c : clv.b.a, $$0)).c() == eeg.a.a;
   }

   public boolean a(gu $$0) {
      gu $$1 = $$0.d();
      return this.b.a_($$1).i(this.b, $$1);
   }

   public dxs p() {
      return this.o;
   }

   public void a(boolean $$0) {
      this.o.c($$0);
   }

   public boolean q() {
      return this.o.f();
   }

   public boolean b(gu $$0) {
      if (this.m) {
         return false;
      } else if (this.c != null && !this.c.c() && this.c.e() != 0) {
         dxr $$1 = this.c.d();
         eei $$2 = new eei(((double)$$1.a + this.a.dn()) / 2.0, ((double)$$1.b + this.a.dp()) / 2.0, ((double)$$1.c + this.a.dt()) / 2.0);
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
