import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cnt extends cmx {
   private static final int cb = 20;
   private static final int cc = 1;
   private static final int cd = 20;
   private static final int ce = 3;
   private static final int cf = 5;
   private static final int cg = 10;
   private static final float ch = 3.0F;
   private static final int ci = 1;
   private static final int cj = 80;
   public bvc a = new bvc();
   public bvc b = new bvc();
   public bvc c = new bvc();
   public bvc d = new bvc();
   public bvc bZ = new bvc();
   public bvc ca = new bvc();
   private int ck = 0;
   private int cl = 0;
   private static final cqr cm = ($$0, $$1, $$2) -> {
      $$1.dW().a(null, $$1, axf.cF, $$1.dn(), 1.0F, 1.0F);
      cqr.b.deflect($$0, $$1, $$2);
   };

   public static bxn.a m() {
      return bwi.C().a(bxo.v, 0.63F).a(bxo.s, 30.0).a(bxo.m, 24.0).a(bxo.c, 3.0);
   }

   public cnt(bvr<? extends cmx> $$0, dhi $$1) {
      super($$0, $$1);
      this.a(euo.z, -1.0F);
      this.a(euo.o, -1.0F);
      this.bO = 10;
   }

   @Override
   protected bxi<?> a(Dynamic<?> $$0) {
      return cnu.a(this, this.ed().a($$0));
   }

   @Override
   public bxi<cnt> ec() {
      return (bxi<cnt>)super.ec();
   }

   @Override
   protected bxi.b<cnt> ed() {
      return bxi.a(cnu.f, cnu.e);
   }

   @Override
   public void a(alc<?> $$0) {
      if (this.dW().B_() && aq.equals($$0)) {
         this.gq();
         bws $$1 = this.aw();
         switch ($$1) {
            case q:
               this.bZ.b(this.af);
               break;
            case r:
               this.ca.b(this.af);
               break;
            case p:
               this.b.b(this.af);
         }
      }

      super.a($$0);
   }

   private void gq() {
      this.bZ.a();
      this.a.a();
      this.ca.a();
      this.d.a();
   }

   @Override
   public void h() {
      bws $$0 = this.aw();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.p().b(1 + this.dZ().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.d.b(this.af);
            this.t();
      }

      if ($$0 != bws.p && this.b.b()) {
         this.c.a(this.af);
         this.b.a();
      }

      if ($$0 == bws.a) {
         this.a.b(this.af);
      }

      this.cl = this.cl == 0 ? this.ae.a(1, 80) : this.cl - 1;
      if (this.cl == 0) {
         this.x();
      }

      super.h();
   }

   public cnt p() {
      this.ck = 0;
      return this;
   }

   public void t() {
      if (++this.ck <= 5) {
         dxv $$0 = !this.dx().l() ? this.dx() : this.bu();
         fby $$1 = this.dz();
         fby $$2 = this.du().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dW().a(new lk(ls.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bZ()) {
         fby $$1 = this.cR().f();
         fby $$2 = new fby($$1.d, this.du().e, $$1.f);
         dxv $$3 = !this.dx().l() ? this.dx() : this.bu();
         if ($$3.o() != dqv.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dW().a(new lk(ls.b, $$3), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void R() {
      if (this.O_() == null || !this.aJ()) {
         this.dW().a(this, this.u(), this.dn(), 1.0F, 1.0F);
      }
   }

   public void x() {
      float $$0 = 0.7F + 0.4F * this.ae.i();
      float $$1 = 0.8F + 0.2F * this.ae.i();
      this.dW().a(this, axf.cP, this.dn(), $$1, $$0);
   }

   @Override
   public cqr a(cqq $$0) {
      if ($$0.aq() != bvr.s && $$0.aq() != bvr.bH) {
         return this.aq().a(axy.r) ? cm : cqr.a;
      } else {
         return cqr.a;
      }
   }

   @Override
   public axg dn() {
      return axg.f;
   }

   @Override
   protected axe o_() {
      return axf.cN;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.cO;
   }

   @Override
   protected axe u() {
      return this.aJ() ? axf.cH : axf.cI;
   }

   public Optional<bwg> go() {
      return this.ec().c(cfk.x).map(bua::d).filter($$0 -> $$0 instanceof bwg).map($$0 -> (bwg)$$0);
   }

   public boolean k(fby $$0) {
      fby $$1 = this.dw().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void a(ash $$0) {
      bpt $$1 = bps.a();
      $$1.a("breezeBrain");
      this.ec().a($$0, this);
      $$1.b("breezeActivityUpdate");
      cnu.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a((bwg)this);
      ahj.a(this);
   }

   @Override
   public boolean a(bvr<?> $$0) {
      return $$0 == bvr.bS || $$0 == bvr.aq;
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   public int ac() {
      return 25;
   }

   public double gp() {
      return this.dD() + (double)(this.ds() / 2.0F) + 0.3F;
   }

   @Override
   public boolean a(ash $$0, bua $$1) {
      return $$1.d() instanceof cnt || super.a($$0, $$1);
   }

   @Override
   public double dq() {
      return (double)this.cS();
   }

   @Override
   public boolean a(float $$0, float $$1, bua $$2) {
      if ($$0 > 3.0F) {
         this.a(axf.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bvk.c bg() {
      return bvk.c.c;
   }

   @Nullable
   @Override
   public bwg O_() {
      return this.O();
   }
}
