import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class bts {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final bkl a;
   protected final cqz b;
   @Nullable
   protected ebt c;
   protected double d;
   protected int e;
   protected int f;
   protected eif g = eif.b;
   protected iw h = iw.g;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected ebs o;
   @Nullable
   private ht s;
   private int t;
   private float u = 1.0F;
   private final ebv v;
   private boolean w;

   public bts(bkl $$0, cqz $$1) {
      this.a = $$0;
      this.b = $$1;
      int $$2 = asy.a($$0.b(blp.g) * 16.0);
      this.v = this.a($$2);
   }

   public void g() {
      this.u = 1.0F;
   }

   public void a(float $$0) {
      this.u = $$0;
   }

   @Nullable
   public ht h() {
      return this.s;
   }

   protected abstract ebv a(int var1);

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
   public final ebt a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(ht.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public ebt a(Stream<ht> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public ebt a(Set<ht> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public ebt a(ht $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public ebt a(ht $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public ebt a(bjt $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.dl()), 16, true, $$1);
   }

   @Nullable
   protected ebt a(Set<ht> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, (float)this.a.b(blp.g));
   }

   @Nullable
   protected ebt a(Set<ht> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.ds() < (double)this.b.I_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         this.b.ad().a("pathfind");
         ht $$5 = $$2 ? this.a.dl().c() : this.a.dl();
         int $$6 = (int)($$4 + (float)$$1);
         crm $$7 = new crm(this.b, $$5.b(-$$6, -$$6, -$$6), $$5.b($$6, $$6, $$6));
         ebt $$8 = this.v.a($$7, this.a, $$0, $$4, $$3, this.u);
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

   public boolean a(bjt $$0, double $$1) {
      ebt $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable ebt $$0, double $$1) {
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
            this.S_();
            if (this.c.e() <= 0) {
               return false;
            } else {
               this.d = $$1;
               eif $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public ebt j() {
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
            eif $$0 = this.b();
            eif $$1 = this.c.a(this.a);
            if ($$0.d > $$1.d && !this.a.aA() && asy.a($$0.c) == asy.a($$1.c) && asy.a($$0.e) == asy.a($$1.e)) {
               this.c.a();
            }
         }

         abz.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            eif $$2 = this.c.a(this.a);
            this.a.I().a($$2.c, this.a($$2), $$2.e, this.d);
         }
      }
   }

   protected double a(eif $$0) {
      ht $$1 = ht.a($$0);
      return this.b.a_($$1.d()).i() ? $$0.d : eby.a(this.b, $$1);
   }

   protected void k() {
      eif $$0 = this.b();
      this.l = this.a.df() > 0.75F ? this.a.df() / 2.0F : 0.75F - this.a.df() / 2.0F;
      iw $$1 = this.c.g();
      double $$2 = Math.abs(this.a.dq() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.ds() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dw() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(eif $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         eif $$1 = eif.c(this.c.g());
         if (!$$0.a((im)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            eif $$2 = eif.c(this.c.d(this.c.f() + 1));
            eif $$3 = $$1.d($$0);
            eif $$4 = $$2.d($$0);
            double $$5 = $$3.g();
            double $$6 = $$4.g();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               eif $$9 = $$3.d();
               eif $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(eif $$0) {
      if (this.e - this.f > 100) {
         float $$1 = this.a.fe() >= 1.0F ? this.a.fe() : this.a.fe() * this.a.fe();
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
         iw $$3 = this.c.g();
         long $$4 = this.b.V();
         if ($$3.equals(this.h)) {
            this.i = this.i + ($$4 - this.j);
         } else {
            this.h = $$3;
            double $$5 = $$0.f(eif.c(this.h));
            this.k = this.a.fe() > 0.0F ? $$5 / (double)this.a.fe() * 20.0 : 0.0;
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
      this.h = iw.g;
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

   protected abstract eif b();

   protected abstract boolean a();

   protected void S_() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            ebr $$1 = this.c.a($$0);
            ebr $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            dgb $$3 = this.b.a_(new ht($$1.a, $$1.b, $$1.c));
            if ($$3.a(aqs.bk)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(eif $$0, eif $$1) {
      return false;
   }

   public boolean b(ebp $$0) {
      return $$0 != ebp.n && $$0 != ebp.p && $$0 != ebp.d;
   }

   protected static boolean a(bkl $$0, eif $$1, eif $$2, boolean $$3) {
      eif $$4 = new eif($$2.c, $$2.d + (double)$$0.dg() * 0.5, $$2.e);
      return $$0.dL().a(new cqi($$1, $$4, cqi.a.a, $$3 ? cqi.b.c : cqi.b.a, $$0)).c() == eid.a.a;
   }

   public boolean a(ht $$0) {
      ht $$1 = $$0.d();
      return this.b.a_($$1).i(this.b, $$1);
   }

   public ebs o() {
      return this.o;
   }

   public void a(boolean $$0) {
      this.o.c($$0);
   }

   public boolean p() {
      return this.o.f();
   }

   public boolean b(ht $$0) {
      if (this.m) {
         return false;
      } else if (this.c != null && !this.c.c() && this.c.e() != 0) {
         ebr $$1 = this.c.d();
         eif $$2 = new eif(((double)$$1.a + this.a.dq()) / 2.0, ((double)$$1.b + this.a.ds()) / 2.0, ((double)$$1.c + this.a.dw()) / 2.0);
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
