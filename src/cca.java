import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cca {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final bsq a;
   protected final dax b;
   @Nullable
   protected eni c;
   protected double d;
   protected int e;
   protected int f;
   protected euk g = euk.b;
   protected js h = js.g;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected enh o;
   @Nullable
   private io s;
   private int t;
   private float u = 1.0F;
   private final enk v;
   private boolean w;

   public cca(bsq $$0, dax $$1) {
      this.a = $$0;
      this.b = $$1;
      int $$2 = ayd.a($$0.g(btw.k) * 16.0);
      this.v = this.a($$2);
   }

   public void g() {
      this.u = 1.0F;
   }

   public void a(float $$0) {
      this.u = $$0;
   }

   @Nullable
   public io h() {
      return this.s;
   }

   protected abstract enk a(int var1);

   public void a(double $$0) {
      this.d = $$0;
   }

   public void i() {
      if (this.b.Y() - this.n > 20L) {
         if (this.s != null) {
            this.c = null;
            this.c = this.a(this.s, this.t);
            this.n = this.b.Y();
            this.m = false;
         }
      } else {
         this.m = true;
      }
   }

   @Nullable
   public final eni a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(io.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public eni a(Stream<io> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public eni a(Set<io> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public eni a(io $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public eni a(io $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public eni a(bru $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.dp()), 16, true, $$1);
   }

   @Nullable
   protected eni a(Set<io> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, (float)this.a.g(btw.k));
   }

   @Nullable
   protected eni a(Set<io> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.dw() < (double)this.b.I_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         this.b.af().a("pathfind");
         io $$5 = $$2 ? this.a.dp().c() : this.a.dp();
         int $$6 = (int)($$4 + (float)$$1);
         dbk $$7 = new dbk(this.b, $$5.b(-$$6, -$$6, -$$6), $$5.b($$6, $$6, $$6));
         eni $$8 = this.v.a($$7, this.a, $$0, $$4, $$3, this.u);
         this.b.af().c();
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

   public boolean a(double $$0, double $$1, double $$2, int $$3, double $$4) {
      return this.a(this.a($$0, $$1, $$2, $$3), $$4);
   }

   public boolean a(bru $$0, double $$1) {
      eni $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable eni $$0, double $$1) {
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
               euk $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public eni j() {
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
            euk $$0 = this.b();
            euk $$1 = this.c.a(this.a);
            if ($$0.d > $$1.d && !this.a.aE() && ayd.a($$0.c) == ayd.a($$1.c) && ayd.a($$0.e) == ayd.a($$1.e)) {
               this.c.a();
            }
         }

         aga.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            euk $$2 = this.c.a(this.a);
            this.a.H().a($$2.c, this.a($$2), $$2.e, this.d);
         }
      }
   }

   protected double a(euk $$0) {
      io $$1 = io.a($$0);
      return this.b.a_($$1.d()).i() ? $$0.d : enq.a(this.b, $$1);
   }

   protected void k() {
      euk $$0 = this.b();
      this.l = this.a.dj() > 0.75F ? this.a.dj() / 2.0F : 0.75F - this.a.dj() / 2.0F;
      js $$1 = this.c.g();
      double $$2 = Math.abs(this.a.du() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.dw() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dA() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(euk $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         euk $$1 = euk.c(this.c.g());
         if (!$$0.a((jh)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            euk $$2 = euk.c(this.c.d(this.c.f() + 1));
            euk $$3 = $$1.d($$0);
            euk $$4 = $$2.d($$0);
            double $$5 = $$3.g();
            double $$6 = $$4.g();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               euk $$9 = $$3.d();
               euk $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(euk $$0) {
      if (this.e - this.f > 100) {
         float $$1 = this.a.fn() >= 1.0F ? this.a.fn() : this.a.fn() * this.a.fn();
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
         js $$3 = this.c.g();
         long $$4 = this.b.Y();
         if ($$3.equals(this.h)) {
            this.i = this.i + ($$4 - this.j);
         } else {
            this.h = $$3;
            double $$5 = $$0.f(euk.c(this.h));
            this.k = this.a.fn() > 0.0F ? $$5 / (double)this.a.fn() * 20.0 : 0.0;
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
      this.h = js.g;
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

   protected abstract euk b();

   protected abstract boolean a();

   protected void S_() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eng $$1 = this.c.a($$0);
            eng $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            drb $$3 = this.b.a_(new io($$1.a, $$1.b, $$1.c));
            if ($$3.a(avw.bl)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(euk $$0, euk $$1) {
      return false;
   }

   public boolean b(enl $$0) {
      return $$0 != enl.n && $$0 != enl.p && $$0 != enl.d;
   }

   protected static boolean a(bsq $$0, euk $$1, euk $$2, boolean $$3) {
      euk $$4 = new euk($$2.c, $$2.d + (double)$$0.dk() * 0.5, $$2.e);
      return $$0.dP().a(new dag($$1, $$4, dag.a.a, $$3 ? dag.b.c : dag.b.a, $$0)).c() == eui.a.a;
   }

   public boolean a(io $$0) {
      io $$1 = $$0.d();
      return this.b.a_($$1).i(this.b, $$1);
   }

   public enh o() {
      return this.o;
   }

   public void a(boolean $$0) {
      this.o.c($$0);
   }

   public boolean p() {
      return this.o.f();
   }

   public boolean b(io $$0) {
      if (this.m) {
         return false;
      } else if (this.c != null && !this.c.c() && this.c.e() != 0) {
         eng $$1 = this.c.d();
         euk $$2 = new euk(((double)$$1.a + this.a.du()) / 2.0, ((double)$$1.b + this.a.dw()) / 2.0, ((double)$$1.c + this.a.dA()) / 2.0);
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
