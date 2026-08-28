import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cku extends cjy {
   private static final int ca = 20;
   private static final int cb = 1;
   private static final int cc = 20;
   private static final int cd = 3;
   private static final int ce = 5;
   private static final int cf = 10;
   private static final float cg = 3.0F;
   private static final int ch = 1;
   private static final int ci = 80;
   public bsk b = new bsk();
   public bsk c = new bsk();
   public bsk d = new bsk();
   public bsk e = new bsk();
   public bsk bY = new bsk();
   public bsk bZ = new bsk();
   private int cj = 0;
   private int ck = 0;
   private static final cnl cl = ($$0, $$1, $$2) -> {
      $$1.dP().a($$1, avw.cF, $$1.de(), 1.0F, 1.0F);
      cnl.b.deflect($$0, $$1, $$2);
   };

   public static bur.a s() {
      return btm.A().a(bus.r, 0.63F).a(bus.q, 30.0).a(bus.k, 24.0).a(bus.c, 3.0);
   }

   public cku(bsv<? extends cjy> $$0, dbt $$1) {
      super($$0, $$1);
      this.a(eoh.z, -1.0F);
      this.a(eoh.o, -1.0F);
      this.bN = 10;
   }

   @Override
   protected bum<?> a(Dynamic<?> $$0) {
      return ckv.a(this.dT().a($$0));
   }

   @Override
   public bum<cku> dS() {
      return (bum<cku>)super.dS();
   }

   @Override
   protected bum.b<cku> dT() {
      return bum.a(ckv.f, ckv.e);
   }

   @Override
   public void a(akg<?> $$0) {
      if (this.dP().x_() && at.equals($$0)) {
         this.gt();
         btw $$1 = this.ar();
         switch ($$1) {
            case q:
               this.bY.b(this.ai);
               break;
            case r:
               this.e.b(this.ai);
               break;
            case p:
               this.c.b(this.ai);
         }
      }

      super.a($$0);
   }

   private void gt() {
      this.bY.a();
      this.b.a();
      this.bZ.a();
      this.e.a();
   }

   @Override
   public void l() {
      btw $$0 = this.ar();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.u().b(1 + this.el().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.y();
      }

      if ($$0 != btw.p && this.c.c()) {
         this.d.a(this.ai);
         this.c.a();
      }

      this.ck = this.ck == 0 ? this.ah.a(1, 80) : this.ck - 1;
      if (this.ck == 0) {
         this.gq();
      }

      super.l();
   }

   public cku u() {
      this.cj = 0;
      return this;
   }

   public void y() {
      if (++this.cj <= 5) {
         drx $$0 = !this.dq().i() ? this.dq() : this.bp();
         evm $$1 = this.ds();
         evm $$2 = this.dn().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dP().a(new la(lj.b, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bR()) {
         evm $$1 = this.cK().f();
         evm $$2 = new evm($$1.c, this.dn().d, $$1.e);
         drx $$3 = !this.dq().i() ? this.dq() : this.bp();
         if ($$3.l() != dla.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dP().a(new la(lj.b, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void Q() {
      if (this.p() == null || !this.aE()) {
         this.dP().a(this, this.v(), this.de(), 1.0F, 1.0F);
      }
   }

   public void gq() {
      float $$0 = 0.7F + 0.4F * this.ah.i();
      float $$1 = 0.8F + 0.2F * this.ah.i();
      this.dP().a(this, avw.cP, this.de(), $$1, $$0);
   }

   @Override
   public cnl a(cnk $$0) {
      return $$0.ak() != bsv.n && $$0.ak() != bsv.bn ? cl : cnl.a;
   }

   @Override
   public avx de() {
      return avx.f;
   }

   @Override
   protected avv o_() {
      return avw.cN;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.cO;
   }

   @Override
   protected avv v() {
      return this.aE() ? avw.cH : avw.cI;
   }

   public Optional<btk> gr() {
      return this.dS().c(cco.x).map(bri::d).filter($$0 -> $$0 instanceof btk).map($$0 -> (btk)$$0);
   }

   public boolean k(evm $$0) {
      evm $$1 = this.dp().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("breezeBrain");
      this.dS().a((arb)this.dP(), this);
      this.dP().ag().b("breezeActivityUpdate");
      ckv.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      agp.a((btk)this);
      agp.a(this);
   }

   @Override
   public boolean a(bsv<?> $$0) {
      return $$0 == bsv.by || $$0 == bsv.af;
   }

   @Override
   public int ab() {
      return 30;
   }

   @Override
   public int ae() {
      return 25;
   }

   public double gs() {
      return this.dy() - 0.4;
   }

   @Override
   public boolean b(bri $$0) {
      return $$0.a(awn.b) || $$0.d() instanceof cku || super.b($$0);
   }

   @Override
   public double di() {
      return (double)this.cL();
   }

   @Override
   public boolean a(float $$0, float $$1, bri $$2) {
      if ($$0 > 3.0F) {
         this.a(avw.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bsp.b bb() {
      return bsp.b.c;
   }

   @Nullable
   @Override
   public btk p() {
      return this.N();
   }
}
