import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class clr extends ckv {
   private static final int cb = 20;
   private static final int cc = 1;
   private static final int cd = 20;
   private static final int ce = 3;
   private static final int cf = 5;
   private static final int cg = 10;
   private static final float ch = 3.0F;
   private static final int ci = 1;
   private static final int cj = 80;
   public btd b = new btd();
   public btd c = new btd();
   public btd d = new btd();
   public btd e = new btd();
   public btd bZ = new btd();
   public btd ca = new btd();
   private int ck = 0;
   private int cl = 0;
   private static final coj cm = ($$0, $$1, $$2) -> {
      $$1.dS().a(null, $$1, awd.cF, $$1.di(), 1.0F, 1.0F);
      coj.b.deflect($$0, $$1, $$2);
   };

   public static bvl.a q() {
      return buh.E().a(bvm.v, 0.63F).a(bvm.s, 30.0).a(bvm.m, 24.0).a(bvm.c, 3.0);
   }

   public clr(btq<? extends ckv> $$0, dds $$1) {
      super($$0, $$1);
      this.a(eqs.z, -1.0F);
      this.a(eqs.o, -1.0F);
      this.bO = 10;
   }

   @Override
   protected bvg<?> a(Dynamic<?> $$0) {
      return cls.a(this, this.dY().a($$0));
   }

   @Override
   public bvg<clr> dX() {
      return (bvg<clr>)super.dX();
   }

   @Override
   protected bvg.b<clr> dY() {
      return bvg.a(cls.f, cls.e);
   }

   @Override
   public void a(akg<?> $$0) {
      if (this.dS().w_() && ar.equals($$0)) {
         this.gr();
         bur $$1 = this.av();
         switch ($$1) {
            case q:
               this.bZ.b(this.ag);
               break;
            case r:
               this.ca.b(this.ag);
               break;
            case p:
               this.c.b(this.ag);
         }
      }

      super.a($$0);
   }

   private void gr() {
      this.bZ.a();
      this.b.a();
      this.ca.a();
      this.e.a();
   }

   @Override
   public void l() {
      bur $$0 = this.av();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.t().b(1 + this.dV().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.e.b(this.ag);
            this.y();
      }

      if ($$0 != bur.p && this.c.b()) {
         this.d.a(this.ag);
         this.c.a();
      }

      this.cl = this.cl == 0 ? this.af.a(1, 80) : this.cl - 1;
      if (this.cl == 0) {
         this.go();
      }

      super.l();
   }

   public clr t() {
      this.ck = 0;
      return this;
   }

   public void y() {
      if (++this.ck <= 5) {
         dua $$0 = !this.dt().l() ? this.dt() : this.bt();
         eye $$1 = this.dv();
         eye $$2 = this.dq().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dS().a(new lf(ln.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bW()) {
         eye $$1 = this.cO().f();
         eye $$2 = new eye($$1.d, this.dq().e, $$1.f);
         dua $$3 = !this.dt().l() ? this.dt() : this.bt();
         if ($$3.o() != dnc.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dS().a(new lf(ln.b, $$3), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void U() {
      if (this.m() == null || !this.aH()) {
         this.dS().a(this, this.w(), this.di(), 1.0F, 1.0F);
      }
   }

   public void go() {
      float $$0 = 0.7F + 0.4F * this.af.i();
      float $$1 = 0.8F + 0.2F * this.af.i();
      this.dS().a(this, awd.cP, this.di(), $$1, $$0);
   }

   @Override
   public coj a(coi $$0) {
      if ($$0.ao() != btq.n && $$0.ao() != btq.bn) {
         return this.ao().a(aww.r) ? cm : coj.a;
      } else {
         return coj.a;
      }
   }

   @Override
   public awe di() {
      return awe.f;
   }

   @Override
   protected awc n_() {
      return awd.cN;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.cO;
   }

   @Override
   protected awc w() {
      return this.aH() ? awd.cH : awd.cI;
   }

   public Optional<buf> gp() {
      return this.dX().c(cdi.x).map(bsb::d).filter($$0 -> $$0 instanceof buf).map($$0 -> (buf)$$0);
   }

   public boolean k(eye $$0) {
      eye $$1 = this.ds().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void ad() {
      this.dS().ah().a("breezeBrain");
      this.dX().a((arg)this.dS(), this);
      this.dS().ah().b("breezeActivityUpdate");
      cls.a(this);
      this.dS().ah().c();
      super.ad();
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a((buf)this);
      agn.a(this);
   }

   @Override
   public boolean a(btq<?> $$0) {
      return $$0 == btq.by || $$0 == btq.af;
   }

   @Override
   public int ag() {
      return 30;
   }

   @Override
   public int fQ() {
      return 25;
   }

   public double gq() {
      return this.dB() - 0.4;
   }

   @Override
   public boolean b(bsb $$0) {
      return $$0.d() instanceof clr || super.b($$0);
   }

   @Override
   public double dm() {
      return (double)this.cP();
   }

   @Override
   public boolean a(float $$0, float $$1, bsb $$2) {
      if ($$0 > 3.0F) {
         this.a(awd.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected btj.b bf() {
      return btj.b.c;
   }

   @Nullable
   @Override
   public buf m() {
      return this.R();
   }
}
