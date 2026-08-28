import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class clb extends ckf {
   private static final int ca = 20;
   private static final int cb = 1;
   private static final int cc = 20;
   private static final int cd = 3;
   private static final int ce = 5;
   private static final int cf = 10;
   private static final float cg = 3.0F;
   private static final int ch = 1;
   private static final int ci = 80;
   public bsr b = new bsr();
   public bsr c = new bsr();
   public bsr d = new bsr();
   public bsr e = new bsr();
   public bsr bY = new bsr();
   public bsr bZ = new bsr();
   private int cj = 0;
   private int ck = 0;
   private static final cns cl = ($$0, $$1, $$2) -> {
      $$1.dP().a($$1, awa.cF, $$1.de(), 1.0F, 1.0F);
      cns.b.deflect($$0, $$1, $$2);
   };

   public static buy.a s() {
      return btt.A().a(buz.r, 0.63F).a(buz.q, 30.0).a(buz.k, 24.0).a(buz.c, 3.0);
   }

   public clb(btc<? extends ckf> $$0, dca $$1) {
      super($$0, $$1);
      this.a(eoo.z, -1.0F);
      this.a(eoo.o, -1.0F);
      this.bN = 10;
   }

   @Override
   protected but<?> a(Dynamic<?> $$0) {
      return clc.a(this.dT().a($$0));
   }

   @Override
   public but<clb> dS() {
      return (but<clb>)super.dS();
   }

   @Override
   protected but.b<clb> dT() {
      return but.a(clc.f, clc.e);
   }

   @Override
   public void a(akk<?> $$0) {
      if (this.dP().x_() && at.equals($$0)) {
         this.gt();
         bud $$1 = this.ar();
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
      bud $$0 = this.ar();
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

      if ($$0 != bud.p && this.c.c()) {
         this.d.a(this.ai);
         this.c.a();
      }

      this.ck = this.ck == 0 ? this.ah.a(1, 80) : this.ck - 1;
      if (this.ck == 0) {
         this.gq();
      }

      super.l();
   }

   public clb u() {
      this.cj = 0;
      return this;
   }

   public void y() {
      if (++this.cj <= 5) {
         dse $$0 = !this.dq().i() ? this.dq() : this.bp();
         evt $$1 = this.ds();
         evt $$2 = this.dn().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dP().a(new la(li.b, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bR()) {
         evt $$1 = this.cK().f();
         evt $$2 = new evt($$1.c, this.dn().d, $$1.e);
         dse $$3 = !this.dq().i() ? this.dq() : this.bp();
         if ($$3.l() != dlh.a) {
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
   public cns a(cnr $$0) {
      return $$0.ak() != btc.n && $$0.ak() != btc.bn ? cl : cns.a;
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
   protected avz d(brp $$0) {
      return awa.cO;
   }

   @Override
   protected avz v() {
      return this.aE() ? awa.cH : awa.cI;
   }

   public Optional<btr> gr() {
      return this.dS().c(ccv.x).map(brp::d).filter($$0 -> $$0 instanceof btr).map($$0 -> (btr)$$0);
   }

   public boolean k(evt $$0) {
      evt $$1 = this.dp().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("breezeBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().b("breezeActivityUpdate");
      clc.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a((btr)this);
      agt.a(this);
   }

   @Override
   public boolean a(btc<?> $$0) {
      return $$0 == btc.by || $$0 == btc.af;
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
   public boolean b(brp $$0) {
      return $$0.a(awr.b) || $$0.d() instanceof clb || super.b($$0);
   }

   @Override
   public double di() {
      return (double)this.cL();
   }

   @Override
   public boolean a(float $$0, float $$1, brp $$2) {
      if ($$0 > 3.0F) {
         this.a(awa.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bsw.b bb() {
      return bsw.b.c;
   }

   @Nullable
   @Override
   public btr p() {
      return this.N();
   }
}
