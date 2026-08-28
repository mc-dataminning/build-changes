import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckz extends ckd {
   private static final int ca = 20;
   private static final int cb = 1;
   private static final int cc = 20;
   private static final int cd = 3;
   private static final int ce = 5;
   private static final int cf = 10;
   private static final float cg = 3.0F;
   private static final int ch = 1;
   private static final int ci = 80;
   public bsp b = new bsp();
   public bsp c = new bsp();
   public bsp d = new bsp();
   public bsp e = new bsp();
   public bsp bY = new bsp();
   public bsp bZ = new bsp();
   private int cj = 0;
   private int ck = 0;
   private static final cnq cl = ($$0, $$1, $$2) -> {
      $$1.dP().a($$1, awa.cF, $$1.de(), 1.0F, 1.0F);
      cnq.b.deflect($$0, $$1, $$2);
   };

   public static buw.a s() {
      return btr.A().a(bux.r, 0.63F).a(bux.q, 30.0).a(bux.k, 24.0).a(bux.c, 3.0);
   }

   public ckz(bta<? extends ckd> $$0, dby $$1) {
      super($$0, $$1);
      this.a(eom.z, -1.0F);
      this.a(eom.o, -1.0F);
      this.bN = 10;
   }

   @Override
   protected bur<?> a(Dynamic<?> $$0) {
      return cla.a(this.dT().a($$0));
   }

   @Override
   public bur<ckz> dS() {
      return (bur<ckz>)super.dS();
   }

   @Override
   protected bur.b<ckz> dT() {
      return bur.a(cla.f, cla.e);
   }

   @Override
   public void a(akk<?> $$0) {
      if (this.dP().x_() && at.equals($$0)) {
         this.gt();
         bub $$1 = this.ar();
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
      bub $$0 = this.ar();
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

      if ($$0 != bub.p && this.c.c()) {
         this.d.a(this.ai);
         this.c.a();
      }

      this.ck = this.ck == 0 ? this.ah.a(1, 80) : this.ck - 1;
      if (this.ck == 0) {
         this.gq();
      }

      super.l();
   }

   public ckz u() {
      this.cj = 0;
      return this;
   }

   public void y() {
      if (++this.cj <= 5) {
         dsc $$0 = !this.dq().i() ? this.dq() : this.bp();
         evr $$1 = this.ds();
         evr $$2 = this.dn().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dP().a(new la(li.b, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bR()) {
         evr $$1 = this.cK().f();
         evr $$2 = new evr($$1.c, this.dn().d, $$1.e);
         dsc $$3 = !this.dq().i() ? this.dq() : this.bp();
         if ($$3.l() != dlf.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dP().a(new la(li.b, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
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
      this.dP().a(this, awa.cP, this.de(), $$1, $$0);
   }

   @Override
   public cnq a(cnp $$0) {
      return $$0.ak() != bta.n && $$0.ak() != bta.bn ? cl : cnq.a;
   }

   @Override
   public awb de() {
      return awb.f;
   }

   @Override
   protected avz o_() {
      return awa.cN;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.cO;
   }

   @Override
   protected avz v() {
      return this.aE() ? awa.cH : awa.cI;
   }

   public Optional<btp> gr() {
      return this.dS().c(cct.x).map(brn::d).filter($$0 -> $$0 instanceof btp).map($$0 -> (btp)$$0);
   }

   public boolean k(evr $$0) {
      evr $$1 = this.dp().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("breezeBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().b("breezeActivityUpdate");
      cla.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a((btp)this);
      agt.a(this);
   }

   @Override
   public boolean a(bta<?> $$0) {
      return $$0 == bta.by || $$0 == bta.af;
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
   public boolean b(brn $$0) {
      return $$0.a(awr.b) || $$0.d() instanceof ckz || super.b($$0);
   }

   @Override
   public double di() {
      return (double)this.cL();
   }

   @Override
   public boolean a(float $$0, float $$1, brn $$2) {
      if ($$0 > 3.0F) {
         this.a(awa.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bsu.b bb() {
      return bsu.b.c;
   }

   @Nullable
   @Override
   public btp p() {
      return this.N();
   }
}
