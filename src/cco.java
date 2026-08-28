import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cco {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final bte a;
   protected final dcg b;
   @Nullable
   protected eox c;
   protected double d;
   protected int e;
   protected int f;
   protected ewh g = ewh.b;
   protected ke h = ke.g;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected eow o;
   @Nullable
   private ja s;
   private int t;
   private float u = 1.0F;
   private final eoz v;
   private boolean w;

   public cco(bte $$0, dcg $$1) {
      this.a = $$0;
      this.b = $$1;
      int $$2 = ayg.a($$0.g(buk.m) * 16.0);
      this.v = this.a($$2);
   }

   public void g() {
      this.u = 1.0F;
   }

   public void a(float $$0) {
      this.u = $$0;
   }

   @Nullable
   public ja h() {
      return this.s;
   }

   protected abstract eoz a(int var1);

   public void a(double $$0) {
      this.d = $$0;
   }

   public void i() {
      if (this.b.Z() - this.n > 20L) {
         if (this.s != null) {
            this.c = null;
            this.c = this.a(this.s, this.t);
            this.n = this.b.Z();
            this.m = false;
         }
      } else {
         this.m = true;
      }
   }

   @Nullable
   public final eox a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(ja.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public eox a(Stream<ja> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public eox a(Set<ja> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public eox a(ja $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public eox a(ja $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public eox a(bsh $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.dr()), 16, true, $$1);
   }

   @Nullable
   protected eox a(Set<ja> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, (float)this.a.g(buk.m));
   }

   @Nullable
   protected eox a(Set<ja> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.dy() < (double)this.b.I_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         this.b.ag().a("pathfind");
         ja $$5 = $$2 ? this.a.dr().c() : this.a.dr();
         int $$6 = (int)($$4 + (float)$$1);
         dct $$7 = new dct(this.b, $$5.b(-$$6, -$$6, -$$6), $$5.b($$6, $$6, $$6));
         eox $$8 = this.v.a($$7, this.a, $$0, $$4, $$3, this.u);
         this.b.ag().c();
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

   public boolean a(bsh $$0, double $$1) {
      eox $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable eox $$0, double $$1) {
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
               ewh $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public eox j() {
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
            ewh $$0 = this.b();
            ewh $$1 = this.c.a(this.a);
            if ($$0.d > $$1.d && !this.a.aG() && ayg.a($$0.c) == ayg.a($$1.c) && ayg.a($$0.e) == ayg.a($$1.e)) {
               this.c.a();
            }
         }

         afy.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            ewh $$2 = this.c.a(this.a);
            this.a.H().a($$2.c, this.a($$2), $$2.e, this.d);
         }
      }
   }

   protected double a(ewh $$0) {
      ja $$1 = ja.a($$0);
      return this.b.a_($$1.d()).i() ? $$0.d : epf.a(this.b, $$1);
   }

   protected void k() {
      ewh $$0 = this.b();
      this.l = this.a.dl() > 0.75F ? this.a.dl() / 2.0F : 0.75F - this.a.dl() / 2.0F;
      ke $$1 = this.c.g();
      double $$2 = Math.abs(this.a.dw() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.dy() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dC() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(ewh $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         ewh $$1 = ewh.c(this.c.g());
         if (!$$0.a((jt)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            ewh $$2 = ewh.c(this.c.d(this.c.f() + 1));
            ewh $$3 = $$1.d($$0);
            ewh $$4 = $$2.d($$0);
            double $$5 = $$3.g();
            double $$6 = $$4.g();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               ewh $$9 = $$3.d();
               ewh $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(ewh $$0) {
      if (this.e - this.f > 100) {
         float $$1 = this.a.fl() >= 1.0F ? this.a.fl() : this.a.fl() * this.a.fl();
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
         ke $$3 = this.c.g();
         long $$4 = this.b.Z();
         if ($$3.equals(this.h)) {
            this.i = this.i + ($$4 - this.j);
         } else {
            this.h = $$3;
            double $$5 = $$0.f(ewh.c(this.h));
            this.k = this.a.fl() > 0.0F ? $$5 / (double)this.a.fl() * 20.0 : 0.0;
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
      this.h = ke.g;
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

   protected abstract ewh b();

   protected abstract boolean a();

   protected void S_() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eov $$1 = this.c.a($$0);
            eov $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            dsl $$3 = this.b.a_(new ja($$1.a, $$1.b, $$1.c));
            if ($$3.a(avw.bl)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(ewh $$0, ewh $$1) {
      return false;
   }

   public boolean b(epa $$0) {
      return $$0 != epa.n && $$0 != epa.p && $$0 != epa.d;
   }

   protected static boolean a(bte $$0, ewh $$1, ewh $$2, boolean $$3) {
      ewh $$4 = new ewh($$2.c, $$2.d + (double)$$0.dm() * 0.5, $$2.e);
      return $$0.dR().a(new dbp($$1, $$4, dbp.a.a, $$3 ? dbp.b.c : dbp.b.a, $$0)).c() == ewf.a.a;
   }

   public boolean a(ja $$0) {
      ja $$1 = $$0.d();
      return this.b.a_($$1).i(this.b, $$1);
   }

   public eow o() {
      return this.o;
   }

   public void a(boolean $$0) {
      this.o.c($$0);
   }

   public boolean p() {
      return this.o.f();
   }

   public boolean b(ja $$0) {
      if (this.m) {
         return false;
      } else if (this.c != null && !this.c.c() && this.c.e() != 0) {
         eov $$1 = this.c.d();
         ewh $$2 = new ewh(((double)$$1.a + this.a.dw()) / 2.0, ((double)$$1.b + this.a.dy()) / 2.0, ((double)$$1.c + this.a.dC()) / 2.0);
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
