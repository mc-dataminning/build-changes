import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class bup {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final bli a;
   protected final csa b;
   @Nullable
   protected edh c;
   protected double d;
   protected int e;
   protected int f;
   protected eju g = eju.b;
   protected iw h = iw.g;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected edg o;
   @Nullable
   private ht s;
   private int t;
   private float u = 1.0F;
   private final edj v;
   private boolean w;

   public bup(bli $$0, csa $$1) {
      this.a = $$0;
      this.b = $$1;
      int $$2 = atm.a($$0.b(bmm.g) * 16.0);
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

   protected abstract edj a(int var1);

   public void a(double $$0) {
      this.d = $$0;
   }

   public void i() {
      if (this.b.W() - this.n > 20L) {
         if (this.s != null) {
            this.c = null;
            this.c = this.a(this.s, this.t);
            this.n = this.b.W();
            this.m = false;
         }
      } else {
         this.m = true;
      }
   }

   @Nullable
   public final edh a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(ht.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public edh a(Stream<ht> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public edh a(Set<ht> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public edh a(ht $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public edh a(ht $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public edh a(bkq $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.dn()), 16, true, $$1);
   }

   @Nullable
   protected edh a(Set<ht> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, (float)this.a.b(bmm.g));
   }

   @Nullable
   protected edh a(Set<ht> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.du() < (double)this.b.I_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         this.b.ae().a("pathfind");
         ht $$5 = $$2 ? this.a.dn().c() : this.a.dn();
         int $$6 = (int)($$4 + (float)$$1);
         csn $$7 = new csn(this.b, $$5.b(-$$6, -$$6, -$$6), $$5.b($$6, $$6, $$6));
         edh $$8 = this.v.a($$7, this.a, $$0, $$4, $$3, this.u);
         this.b.ae().c();
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

   public boolean a(bkq $$0, double $$1) {
      edh $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable edh $$0, double $$1) {
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
            this.T_();
            if (this.c.e() <= 0) {
               return false;
            } else {
               this.d = $$1;
               eju $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public edh j() {
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
            eju $$0 = this.b();
            eju $$1 = this.c.a(this.a);
            if ($$0.d > $$1.d && !this.a.aC() && atm.a($$0.c) == atm.a($$1.c) && atm.a($$0.e) == atm.a($$1.e)) {
               this.c.a();
            }
         }

         ack.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            eju $$2 = this.c.a(this.a);
            this.a.K().a($$2.c, this.a($$2), $$2.e, this.d);
         }
      }
   }

   protected double a(eju $$0) {
      ht $$1 = ht.a($$0);
      return this.b.a_($$1.d()).i() ? $$0.d : edm.a(this.b, $$1);
   }

   protected void k() {
      eju $$0 = this.b();
      this.l = this.a.dh() > 0.75F ? this.a.dh() / 2.0F : 0.75F - this.a.dh() / 2.0F;
      iw $$1 = this.c.g();
      double $$2 = Math.abs(this.a.ds() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.du() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dy() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(eju $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         eju $$1 = eju.c(this.c.g());
         if (!$$0.a((im)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            eju $$2 = eju.c(this.c.d(this.c.f() + 1));
            eju $$3 = $$1.d($$0);
            eju $$4 = $$2.d($$0);
            double $$5 = $$3.g();
            double $$6 = $$4.g();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               eju $$9 = $$3.d();
               eju $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(eju $$0) {
      if (this.e - this.f > 100) {
         float $$1 = this.a.fg() >= 1.0F ? this.a.fg() : this.a.fg() * this.a.fg();
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
         long $$4 = this.b.W();
         if ($$3.equals(this.h)) {
            this.i = this.i + ($$4 - this.j);
         } else {
            this.h = $$3;
            double $$5 = $$0.f(eju.c(this.h));
            this.k = this.a.fg() > 0.0F ? $$5 / (double)this.a.fg() * 20.0 : 0.0;
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

   protected abstract eju b();

   protected abstract boolean a();

   protected void T_() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            edf $$1 = this.c.a($$0);
            edf $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            dhi $$3 = this.b.a_(new ht($$1.a, $$1.b, $$1.c));
            if ($$3.a(arg.bk)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(eju $$0, eju $$1) {
      return false;
   }

   public boolean b(edd $$0) {
      return $$0 != edd.n && $$0 != edd.p && $$0 != edd.d;
   }

   protected static boolean a(bli $$0, eju $$1, eju $$2, boolean $$3) {
      eju $$4 = new eju($$2.c, $$2.d + (double)$$0.di() * 0.5, $$2.e);
      return $$0.dN().a(new crj($$1, $$4, crj.a.a, $$3 ? crj.b.c : crj.b.a, $$0)).c() == ejs.a.a;
   }

   public boolean a(ht $$0) {
      ht $$1 = $$0.d();
      return this.b.a_($$1).i(this.b, $$1);
   }

   public edg o() {
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
         edf $$1 = this.c.d();
         eju $$2 = new eju(((double)$$1.a + this.a.ds()) / 2.0, ((double)$$1.b + this.a.du()) / 2.0, ((double)$$1.c + this.a.dy()) / 2.0);
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
