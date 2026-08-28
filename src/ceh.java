import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class ceh {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final bux a;
   protected final dev b;
   @Nullable
   protected ers c;
   protected double d;
   protected int e;
   protected int f;
   protected ezh g = ezh.c;
   protected kk h = kk.g;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected err o;
   @Nullable
   private jg s;
   private int t;
   private float u = 1.0F;
   private final eru v;
   private boolean w;
   private float x = 16.0F;

   public ceh(bux $$0, dev $$1) {
      this.a = $$0;
      this.b = $$1;
      this.v = this.a(azj.a($$0.i(bwd.m) * 16.0));
   }

   public void g() {
      int $$0 = azj.d(this.e() * 16.0F);
      this.v.a($$0);
   }

   public void a(float $$0) {
      this.x = $$0;
      this.g();
   }

   private float e() {
      return Math.max((float)this.a.h(bwd.m), this.x);
   }

   public void h() {
      this.u = 1.0F;
   }

   public void b(float $$0) {
      this.u = $$0;
   }

   @Nullable
   public jg i() {
      return this.s;
   }

   protected abstract eru a(int var1);

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
   public final ers a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(jg.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public ers a(Stream<jg> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public ers a(Set<jg> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public ers a(jg $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public ers a(jg $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public ers a(btz $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.dx()), 16, true, $$1);
   }

   @Nullable
   protected ers a(Set<jg> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.e());
   }

   @Nullable
   protected ers a(Set<jg> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.dE() < (double)this.b.I_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         this.b.ah().a("pathfind");
         jg $$5 = $$2 ? this.a.dx().d() : this.a.dx();
         int $$6 = (int)($$4 + (float)$$1);
         dfi $$7 = new dfi(this.b, $$5.b(-$$6, -$$6, -$$6), $$5.b($$6, $$6, $$6));
         ers $$8 = this.v.a($$7, this.a, $$0, $$4, $$3, this.u);
         this.b.ah().c();
         if ($$8 != null && $$8.l() != null) {
            this.s = $$8.l();
            this.t = $$3;
            this.t();
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

   public boolean a(btz $$0, double $$1) {
      ers $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable ers $$0, double $$1) {
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
               ezh $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public ers k() {
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
            ezh $$0 = this.b();
            ezh $$1 = this.c.a(this.a);
            if ($$0.e > $$1.e && !this.a.aJ() && azj.a($$0.d) == azj.a($$1.d) && azj.a($$0.f) == azj.a($$1.f)) {
               this.c.a();
            }
         }

         agr.a(this.b, this.a, this.c, this.l);
         if (!this.m()) {
            ezh $$2 = this.c.a(this.a);
            this.a.M().a($$2.d, this.a($$2), $$2.f, this.d);
         }
      }
   }

   protected double a(ezh $$0) {
      jg $$1 = jg.a((jz)$$0);
      return this.b.a_($$1.e()).l() ? $$0.e : esa.a(this.b, $$1);
   }

   protected void l() {
      ezh $$0 = this.b();
      this.l = this.a.ds() > 0.75F ? this.a.ds() / 2.0F : 0.75F - this.a.ds() / 2.0F;
      kk $$1 = this.c.g();
      double $$2 = Math.abs(this.a.dC() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.dE() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dI() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(ezh $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         ezh $$1 = ezh.c(this.c.g());
         if (!$$0.a((jz)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            ezh $$2 = ezh.c(this.c.d(this.c.f() + 1));
            ezh $$3 = $$1.d($$0);
            ezh $$4 = $$2.d($$0);
            double $$5 = $$3.h();
            double $$6 = $$4.h();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               ezh $$9 = $$3.d();
               ezh $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(ezh $$0) {
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
         kk $$3 = this.c.g();
         long $$4 = this.b.aa();
         if ($$3.equals(this.h)) {
            this.i = this.i + ($$4 - this.j);
         } else {
            this.h = $$3;
            double $$5 = $$0.f(ezh.c(this.h));
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
      this.h = kk.g;
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

   protected abstract ezh b();

   protected abstract boolean a();

   protected void W_() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            erq $$1 = this.c.a($$0);
            erq $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            dvd $$3 = this.b.a_(new jg($$1.a, $$1.b, $$1.c));
            if ($$3.a(awz.bm)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(ezh $$0, ezh $$1) {
      return false;
   }

   public boolean b(erv $$0) {
      return $$0 != erv.n && $$0 != erv.p && $$0 != erv.d;
   }

   protected static boolean a(bux $$0, ezh $$1, ezh $$2, boolean $$3) {
      ezh $$4 = new ezh($$2.d, $$2.e + (double)$$0.dt() * 0.5, $$2.f);
      return $$0.dX().a(new ded($$1, $$4, ded.a.a, $$3 ? ded.b.c : ded.b.a, $$0)).d() == ezf.a.a;
   }

   public boolean a(jg $$0) {
      jg $$1 = $$0.e();
      return this.b.a_($$1).s();
   }

   public err p() {
      return this.o;
   }

   public void a(boolean $$0) {
      this.o.c($$0);
   }

   public boolean q() {
      return this.o.f();
   }

   public boolean b(jg $$0) {
      if (this.m) {
         return false;
      } else if (this.c != null && !this.c.c() && this.c.e() != 0) {
         erq $$1 = this.c.d();
         ezh $$2 = new ezh(((double)$$1.a + this.a.dC()) / 2.0, ((double)$$1.b + this.a.dE()) / 2.0, ((double)$$1.c + this.a.dI()) / 2.0);
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
