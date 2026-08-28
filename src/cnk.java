import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cnk extends cmo {
   private static final int cb = 20;
   private static final int cc = 1;
   private static final int cd = 20;
   private static final int ce = 3;
   private static final int cf = 5;
   private static final int cg = 10;
   private static final float ch = 3.0F;
   private static final int ci = 1;
   private static final int cj = 80;
   public but a = new but();
   public but b = new but();
   public but c = new but();
   public but d = new but();
   public but bZ = new but();
   public but ca = new but();
   private int ck = 0;
   private int cl = 0;
   private static final cqi cm = ($$0, $$1, $$2) -> {
      $$1.dW().a(null, $$1, awv.cF, $$1.dn(), 1.0F, 1.0F);
      cqi.b.deflect($$0, $$1, $$2);
   };

   public static bxe.a m() {
      return bvz.C().a(bxf.v, 0.63F).a(bxf.s, 30.0).a(bxf.m, 24.0).a(bxf.c, 3.0);
   }

   public cnk(bvi<? extends cmo> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(euh.z, -1.0F);
      this.a(euh.o, -1.0F);
      this.bO = 10;
   }

   @Override
   protected bwz<?> a(Dynamic<?> $$0) {
      return cnl.a(this, this.ed().a($$0));
   }

   @Override
   public bwz<cnk> ec() {
      return (bwz<cnk>)super.ec();
   }

   @Override
   protected bwz.b<cnk> ed() {
      return bwz.a(cnl.f, cnl.e);
   }

   @Override
   public void a(aks<?> $$0) {
      if (this.dW().B_() && aq.equals($$0)) {
         this.gq();
         bwj $$1 = this.aw();
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
      bwj $$0 = this.aw();
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

      if ($$0 != bwj.p && this.b.b()) {
         this.c.a(this.af);
         this.b.a();
      }

      if ($$0 == bwj.a) {
         this.a.b(this.af);
      }

      this.cl = this.cl == 0 ? this.ae.a(1, 80) : this.cl - 1;
      if (this.cl == 0) {
         this.x();
      }

      super.h();
   }

   public cnk p() {
      this.ck = 0;
      return this;
   }

   public void t() {
      if (++this.ck <= 5) {
         dxo $$0 = !this.dx().l() ? this.dx() : this.bu();
         fbr $$1 = this.dz();
         fbr $$2 = this.du().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dW().a(new lk(ls.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bZ()) {
         fbr $$1 = this.cR().f();
         fbr $$2 = new fbr($$1.d, this.du().e, $$1.f);
         dxo $$3 = !this.dx().l() ? this.dx() : this.bu();
         if ($$3.o() != dqo.a) {
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
      this.dW().a(this, awv.cP, this.dn(), $$1, $$0);
   }

   @Override
   public cqi a(cqh $$0) {
      if ($$0.aq() != bvi.s && $$0.aq() != bvi.bH) {
         return this.aq().a(axo.r) ? cm : cqi.a;
      } else {
         return cqi.a;
      }
   }

   @Override
   public aww dn() {
      return aww.f;
   }

   @Override
   protected awu o_() {
      return awv.cN;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.cO;
   }

   @Override
   protected awu u() {
      return this.aJ() ? awv.cH : awv.cI;
   }

   public Optional<bvx> go() {
      return this.ec().c(cfb.x).map(btr::d).filter($$0 -> $$0 instanceof bvx).map($$0 -> (bvx)$$0);
   }

   public boolean k(fbr $$0) {
      fbr $$1 = this.dw().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void a(arx $$0) {
      bpj $$1 = bpi.a();
      $$1.a("breezeBrain");
      this.ec().a($$0, this);
      $$1.b("breezeActivityUpdate");
      cnl.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void Y() {
      super.Y();
      agy.a((bvx)this);
      agy.a(this);
   }

   @Override
   public boolean a(bvi<?> $$0) {
      return $$0 == bvi.bS || $$0 == bvi.aq;
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
   public boolean a(arx $$0, btr $$1) {
      return $$1.d() instanceof cnk || super.a($$0, $$1);
   }

   @Override
   public double dq() {
      return (double)this.cS();
   }

   @Override
   public boolean a(float $$0, float $$1, btr $$2) {
      if ($$0 > 3.0F) {
         this.a(awv.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bvb.c bg() {
      return bvb.c.c;
   }

   @Nullable
   @Override
   public bvx O_() {
      return this.O();
   }
}
