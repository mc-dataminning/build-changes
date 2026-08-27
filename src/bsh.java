import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class bsh {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final bja a;
   protected final cpl b;
   @Nullable
   protected ear c;
   protected double d;
   protected int e;
   protected int f;
   protected ehd g = ehd.b;
   protected hz h = hz.g;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected eaq o;
   @Nullable
   private gu s;
   private int t;
   private float u = 1.0F;
   private final eat v;
   private boolean w;

   public bsh(bja $$0, cpl $$1) {
      this.a = $$0;
      this.b = $$1;
      int $$2 = arp.a($$0.b(bke.b) * 16.0);
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

   protected abstract eat a(int var1);

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
   public final ear a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(gu.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public ear a(Stream<gu> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public ear a(Set<gu> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public ear a(gu $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public ear a(gu $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public ear a(bii $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.dk()), 16, true, $$1);
   }

   @Nullable
   protected ear a(Set<gu> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, (float)this.a.b(bke.b));
   }

   @Nullable
   protected ear a(Set<gu> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.dr() < (double)this.b.C_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         this.b.ad().a("pathfind");
         gu $$5 = $$2 ? this.a.dk().c() : this.a.dk();
         int $$6 = (int)($$4 + (float)$$1);
         cpy $$7 = new cpy(this.b, $$5.b(-$$6, -$$6, -$$6), $$5.b($$6, $$6, $$6));
         ear $$8 = this.v.a($$7, this.a, $$0, $$4, $$3, this.u);
         this.b.ad().c();
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

   public boolean a(bii $$0, double $$1) {
      ear $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable ear $$0, double $$1) {
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
               ehd $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public ear j() {
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
            ehd $$0 = this.b();
            ehd $$1 = this.c.a(this.a);
            if ($$0.d > $$1.d && !this.a.aA() && arp.a($$0.c) == arp.a($$1.c) && arp.a($$0.e) == arp.a($$1.e)) {
               this.c.a();
            }
         }

         aav.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            ehd $$2 = this.c.a(this.a);
            this.a.E().a($$2.c, this.a($$2), $$2.e, this.d);
         }
      }
   }

   protected double a(ehd $$0) {
      gu $$1 = gu.a($$0);
      return this.b.a_($$1.d()).i() ? $$0.d : eaw.a(this.b, $$1);
   }

   protected void k() {
      ehd $$0 = this.b();
      this.l = this.a.df() > 0.75F ? this.a.df() / 2.0F : 0.75F - this.a.df() / 2.0F;
      hz $$1 = this.c.g();
      double $$2 = Math.abs(this.a.dp() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.dr() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dv() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(ehd $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         ehd $$1 = ehd.c(this.c.g());
         if (!$$0.a((ho)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            ehd $$2 = ehd.c(this.c.d(this.c.f() + 1));
            ehd $$3 = $$1.d($$0);
            ehd $$4 = $$2.d($$0);
            double $$5 = $$3.g();
            double $$6 = $$4.g();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               ehd $$9 = $$3.d();
               ehd $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(ehd $$0) {
      if (this.e - this.f > 100) {
         float $$1 = this.a.fd() >= 1.0F ? this.a.fd() : this.a.fd() * this.a.fd();
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
            double $$5 = $$0.f(ehd.c(this.h));
            this.k = this.a.fd() > 0.0F ? $$5 / (double)this.a.fd() * 20.0 : 0.0;
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

   protected abstract ehd b();

   protected abstract boolean a();

   protected void L_() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eap $$1 = this.c.a($$0);
            eap $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            dez $$3 = this.b.a_(new gu($$1.a, $$1.b, $$1.c));
            if ($$3.a(apl.bk)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(ehd $$0, ehd $$1) {
      return false;
   }

   public boolean b(ean $$0) {
      return $$0 != ean.n && $$0 != ean.p && $$0 != ean.d;
   }

   protected static boolean a(bja $$0, ehd $$1, ehd $$2, boolean $$3) {
      ehd $$4 = new ehd($$2.c, $$2.d + (double)$$0.dg() * 0.5, $$2.e);
      return $$0.dK().a(new cou($$1, $$4, cou.a.a, $$3 ? cou.b.c : cou.b.a, $$0)).c() == ehb.a.a;
   }

   public boolean a(gu $$0) {
      gu $$1 = $$0.d();
      return this.b.a_($$1).i(this.b, $$1);
   }

   public eaq o() {
      return this.o;
   }

   public void a(boolean $$0) {
      this.o.c($$0);
   }

   public boolean p() {
      return this.o.f();
   }

   public boolean b(gu $$0) {
      if (this.m) {
         return false;
      } else if (this.c != null && !this.c.c() && this.c.e() != 0) {
         eap $$1 = this.c.d();
         ehd $$2 = new ehd(((double)$$1.a + this.a.dp()) / 2.0, ((double)$$1.b + this.a.dr()) / 2.0, ((double)$$1.c + this.a.dv()) / 2.0);
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
