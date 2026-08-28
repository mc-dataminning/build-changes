import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cfk {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final bwa a;
   protected final dgz b;
   @Nullable
   protected euk c;
   protected double d;
   protected int e;
   protected int f;
   protected fbx g = fbx.c;
   protected km h;
   protected long i;
   protected long j;
   protected double k;
   protected float l;
   protected boolean m;
   protected long n;
   protected euj o;
   @Nullable
   private ji s;
   private int t;
   private float u;
   private final eum v;
   private boolean w;
   private float x;

   public cfk(bwa $$0, dgz $$1) {
      this.h = km.h;
      this.l = 0.5F;
      this.u = 1.0F;
      this.x = 16.0F;
      this.a = $$0;
      this.b = $$1;
      this.v = this.a(ayz.a($$0.i(bxg.m) * 16.0));
   }

   public void e() {
      int $$0 = ayz.d(this.r() * 16.0F);
      this.v.a($$0);
   }

   public void a(float $$0) {
      this.x = $$0;
      this.e();
   }

   private float r() {
      return Math.max((float)this.a.h(bxg.m), this.x);
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

   protected abstract eum a(int var1);

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
   public final euk a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(ji.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public euk a(Stream<ji> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public euk a(Set<ji> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public euk a(ji $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public euk a(ji $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public euk a(bva $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.du()), 16, true, $$1);
   }

   @Nullable
   protected euk a(Set<ji> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.r());
   }

   @Nullable
   protected euk a(Set<ji> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.dB() < (double)this.b.G_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         bpj $$5 = bpi.a();
         $$5.a("pathfind");
         ji $$6 = $$2 ? this.a.du().d() : this.a.du();
         int $$7 = (int)($$4 + (float)$$1);
         dhm $$8 = new dhm(this.b, $$6.b(-$$7, -$$7, -$$7), $$6.b($$7, $$7, $$7));
         euk $$9 = this.v.a($$8, this.a, $$0, $$4, $$3, this.u);
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

   public boolean a(bva $$0, double $$1) {
      euk $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable euk $$0, double $$1) {
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
               fbx $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public euk i() {
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
            fbx $$0 = this.b();
            fbx $$1 = this.c.a(this.a);
            if ($$0.e > $$1.e && !this.a.aJ() && ayz.a($$0.d) == ayz.a($$1.d) && ayz.a($$0.f) == ayz.a($$1.f)) {
               this.c.a();
            }
         }

         agc.a(this.b, this.a, this.c, this.l);
         if (!this.k()) {
            fbx $$2 = this.c.a(this.a);
            this.a.L().a($$2.d, this.a($$2), $$2.f, this.d);
         }
      }
   }

   protected double a(fbx $$0) {
      ji $$1 = ji.a((kb)$$0);
      return this.b.a_($$1.e()).l() ? $$0.e : eus.a(this.b, $$1);
   }

   protected void j() {
      fbx $$0 = this.b();
      this.l = this.a.dp() > 0.75F ? this.a.dp() / 2.0F : 0.75F - this.a.dp() / 2.0F;
      km $$1 = this.c.g();
      double $$2 = Math.abs(this.a.dz() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.dB() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dF() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(fbx $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         fbx $$1 = fbx.c(this.c.g());
         if (!$$0.a((kb)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            fbx $$2 = fbx.c(this.c.d(this.c.f() + 1));
            fbx $$3 = $$1.d($$0);
            fbx $$4 = $$2.d($$0);
            double $$5 = $$3.h();
            double $$6 = $$4.h();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               fbx $$9 = $$3.d();
               fbx $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(fbx $$0) {
      if (this.e - this.f > 100) {
         float $$1 = this.a.fq() >= 1.0F ? this.a.fq() : this.a.fq() * this.a.fq();
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
         long $$4 = this.b.ae();
         if ($$3.equals(this.h)) {
            this.i = this.i + ($$4 - this.j);
         } else {
            this.h = $$3;
            double $$5 = $$0.f(fbx.c(this.h));
            this.k = this.a.fq() > 0.0F ? $$5 / (double)this.a.fq() * 20.0 : 0.0;
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

   protected abstract fbx b();

   protected abstract boolean a();

   protected void d() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eui $$1 = this.c.a($$0);
            eui $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            dxq $$3 = this.b.a_(new ji($$1.a, $$1.b, $$1.c));
            if ($$3.a(awp.bn)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(fbx $$0, fbx $$1) {
      return false;
   }

   public boolean b(eun $$0) {
      return $$0 != eun.n && $$0 != eun.p && $$0 != eun.d;
   }

   protected static boolean a(bwa $$0, fbx $$1, fbx $$2, boolean $$3) {
      fbx $$4 = new fbx($$2.d, $$2.e + (double)$$0.dq() * 0.5, $$2.f);
      return $$0.dU().a(new dgi($$1, $$4, dgi.a.a, $$3 ? dgi.b.c : dgi.b.a, $$0)).d() == fbv.a.a;
   }

   public boolean a(ji $$0) {
      ji $$1 = $$0.e();
      return this.b.a_($$1).s();
   }

   public euj n() {
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
         eui $$1 = this.c.d();
         fbx $$2 = new fbx(((double)$$1.a + this.a.dz()) / 2.0, ((double)$$1.b + this.a.dB()) / 2.0, ((double)$$1.c + this.a.dF()) / 2.0);
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
