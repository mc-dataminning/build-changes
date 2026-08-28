import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class ckj extends cki {
   private static final akk<cvx> f = ako.a(ckj.class, akm.h);
   private static final akk<Integer> g = ako.a(ckj.class, akm.b);
   public static final int e = 8;
   private static final float h = 0.0625F;
   private static final float i = 0.75F;
   private static final float j = 0.75F;
   private float k = 1.0F;
   private boolean l;

   public ckj(bug<? extends ckj> $$0, dev $$1) {
      super($$0, $$1);
   }

   public ckj(dev $$0, jg $$1, jl $$2) {
      this(bug.ai, $$0, $$1, $$2);
   }

   public ckj(bug<? extends ckj> $$0, dev $$1, jg $$2, jl $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(f, cvx.k);
      $$0.a(g, 0);
   }

   @Override
   protected void a(jl $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.w(0.0F);
         this.v((float)(this.d.e() * 90));
      } else {
         this.w((float)(-90 * $$0.f().a()));
         this.v(0.0F);
      }

      this.P = this.dP();
      this.O = this.dN();
      this.m();
   }

   @Override
   protected ezc a(jg $$0, jl $$1) {
      float $$2 = 0.46875F;
      ezh $$3 = ezh.b($$0).a($$1, -0.46875);
      jl.a $$4 = $$1.o();
      double $$5 = $$4 == jl.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == jl.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == jl.a.c ? 0.0625 : 0.75;
      return ezc.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean o() {
      if (this.l) {
         return true;
      } else if (!this.dX().g(this)) {
         return false;
      } else {
         dvd $$0 = this.dX().a_(this.b.a(this.d.g()));
         return $$0.e() || this.d.o().d() && dka.n($$0) ? this.dX().a(this, this.cS(), c).isEmpty() : false;
      }
   }

   @Override
   public void a(buz $$0, ezh $$1) {
      if (!this.l) {
         super.a($$0, $$1);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.l) {
         super.j($$0, $$1, $$2);
      }
   }

   @Override
   public void at() {
      this.d(this.C());
      super.at();
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      if (this.l) {
         return !$$0.a(axb.d) && !$$0.h() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(axb.l) && !this.C().f()) {
         if (!this.dX().C) {
            this.b($$0.d(), false);
            this.a(eaa.c, $$0.d());
            this.a(this.t(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public awj t() {
      return awk.ny;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cL();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void b(@Nullable btz $$0) {
      this.a(this.v(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(eaa.c, $$0);
   }

   public awj v() {
      return awk.nw;
   }

   @Override
   public void B() {
      this.a(this.w(), 1.0F, 1.0F);
   }

   public awj w() {
      return awk.nx;
   }

   private void b(@Nullable btz $$0, boolean $$1) {
      if (!this.l) {
         cvx $$2 = this.C();
         this.c(cvx.k);
         if (!this.dX().ac().b(der.i)) {
            if ($$0 == null) {
               this.d($$2);
            }
         } else {
            if ($$0 instanceof coh $$3 && $$3.fX()) {
               this.d($$2);
               return;
            }

            if ($$1) {
               this.b(this.z());
            }

            if (!$$2.f()) {
               $$2 = $$2.v();
               this.d($$2);
               if (this.af.i() < this.k) {
                  this.b($$2);
               }
            }
         }
      }
   }

   private void d(cvx $$0) {
      esw $$1 = this.a($$0);
      if ($$1 != null) {
         esy $$2 = cwk.a($$1, this.dX());
         if ($$2 != null) {
            $$2.a(this.b, this.ar());
         }
      }

      $$0.a(null);
   }

   public cvx C() {
      return this.av().a(f);
   }

   @Nullable
   public esw a(cvx $$0) {
      return $$0.a(kt.K);
   }

   public boolean D() {
      return this.C().b(kt.K);
   }

   public void c(cvx $$0) {
      this.a($$0, true);
   }

   public void a(cvx $$0, boolean $$1) {
      if (!$$0.f()) {
         $$0 = $$0.c(1);
      }

      this.e($$0);
      this.av().a(f, $$0);
      if (!$$0.f()) {
         this.a(this.x(), 1.0F, 1.0F);
      }

      if ($$1 && this.b != null) {
         this.dX().c(this.b, dia.a);
      }
   }

   public awj x() {
      return awk.nv;
   }

   @Override
   public bvn a_(int $$0) {
      return $$0 == 0 ? bvn.a(this::C, this::c) : super.a_($$0);
   }

   @Override
   public void a(akk<?> $$0) {
      if ($$0.equals(f)) {
         this.e(this.C());
      }
   }

   private void e(cvx $$0) {
      if (!$$0.f() && $$0.H() != this) {
         $$0.a(this);
      }

      this.m();
   }

   public int E() {
      return this.av().a(g);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.av().a(g, $$0 % 8);
      if ($$1 && this.b != null) {
         this.dX().c(this.b, dia.a);
      }
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      if (!this.C().f()) {
         $$0.a("Item", this.C().a(this.dZ()));
         $$0.a("ItemRotation", (byte)this.E());
         $$0.a("ItemDropChance", this.k);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.cq());
      $$0.a("Fixed", this.l);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      cvx $$2;
      if ($$0.b("Item", 10)) {
         uj $$1 = $$0.p("Item");
         $$2 = cvx.a(this.dZ(), (vg)$$1).orElse(cvx.k);
      } else {
         $$2 = cvx.k;
      }

      cvx $$4 = this.C();
      if (!$$4.f() && !cvx.a($$2, $$4)) {
         this.d($$4);
      }

      this.a($$2, false);
      if (!$$2.f()) {
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.k = $$0.j("ItemDropChance");
         }
      }

      this.a(jl.a($$0.f("Facing")));
      this.k($$0.q("Invisible"));
      this.l = $$0.q("Fixed");
   }

   @Override
   public bry a(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      boolean $$3 = !this.C().f();
      boolean $$4 = !$$2.f();
      if (this.l) {
         return bry.e;
      } else if (!$$0.dX().C) {
         if (!$$3) {
            if ($$4 && !this.dS()) {
               if ($$2.a(cwb.rV)) {
                  esy $$5 = cwk.b($$2, this.dX());
                  if ($$5 != null && $$5.a(256)) {
                     return bry.d;
                  }
               }

               this.c($$2);
               this.a(eaa.c, $$0);
               $$2.a(1, $$0);
               return bry.a;
            } else {
               return bry.e;
            }
         } else {
            this.a(this.y(), 1.0F, 1.0F);
            this.b(this.E() + 1);
            this.a(eaa.c, $$0);
            return bry.a;
         }
      } else {
         return (bry)(!$$3 && !$$4 ? bry.e : bry.a);
      }
   }

   public awj y() {
      return awk.nz;
   }

   public int F() {
      return this.C().f() ? 0 : this.E() % 8 + 1;
   }

   @Override
   public zo<acd> a(arl $$0) {
      return new ace(this, this.d.d(), this.q());
   }

   @Override
   public void a(ace $$0) {
      super.a($$0);
      this.a(jl.a($$0.p()));
   }

   @Override
   public cvx dK() {
      cvx $$0 = this.C();
      return $$0.f() ? this.z() : $$0.v();
   }

   protected cvx z() {
      return new cvx(cwb.ue);
   }

   @Override
   public float dO() {
      jl $$0 = this.cP();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)azj.b(180 + $$0.e() * 90 + this.E() * 45 + $$1);
   }
}
