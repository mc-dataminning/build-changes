import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cjj extends cin {
   private static final int ca = 20;
   private static final int cb = 1;
   private static final int cc = 20;
   private static final int cd = 3;
   private static final int ce = 5;
   private static final int cf = 10;
   private static final float cg = 3.0F;
   private static final int ch = 1;
   private static final int ci = 80;
   public brc b = new brc();
   public brc c = new brc();
   public brc d = new brc();
   public brc e = new brc();
   public brc bY = new brc();
   public brc bZ = new brc();
   private int cj = 0;
   private int ck = 0;
   private static final cma cl = ($$0, $$1, $$2) -> {
      $$1.dN().a($$1, avc.cF, $$1.dc(), 1.0F, 1.0F);
      cma.b.deflect($$0, $$1, $$2);
   };

   public static btg.a r() {
      return bsc.A().a(bth.r, 0.63F).a(bth.q, 30.0).a(bth.k, 24.0).a(bth.c, 3.0);
   }

   public cjj(brn<? extends cin> $$0, dad $$1) {
      super($$0, $$1);
      this.a(emr.z, -1.0F);
      this.a(emr.o, -1.0F);
      this.bN = 10;
   }

   @Override
   protected btb<?> a(Dynamic<?> $$0) {
      return cjk.a(this.dR().a($$0));
   }

   @Override
   public btb<cjj> dQ() {
      return (btb<cjj>)super.dQ();
   }

   @Override
   protected btb.b<cjj> dR() {
      return btb.a(cjk.f, cjk.e);
   }

   @Override
   public void a(ajm<?> $$0) {
      if (this.dN().x_() && at.equals($$0)) {
         this.gs();
         bsl $$1 = this.ap();
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

   private void gs() {
      this.bY.a();
      this.b.a();
      this.bZ.a();
      this.e.a();
   }

   @Override
   public void l() {
      bsl $$0 = this.ap();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.u().b(1 + this.ej().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.y();
      }

      if ($$0 != bsl.p && this.c.c()) {
         this.d.a(this.ai);
         this.c.a();
      }

      this.ck = this.ck == 0 ? this.ah.a(1, 80) : this.ck - 1;
      if (this.ck == 0) {
         this.gp();
      }

      super.l();
   }

   public cjj u() {
      this.cj = 0;
      return this;
   }

   public void y() {
      if (++this.cj <= 5) {
         dqh $$0 = !this.do().i() ? this.do() : this.bn();
         etp $$1 = this.dq();
         etp $$2 = this.dl().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dN().a(new ko(kx.b, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bP()) {
         etp $$1 = this.cI().f();
         etp $$2 = new etp($$1.c, this.dl().d, $$1.e);
         dqh $$3 = !this.do().i() ? this.do() : this.bn();
         if ($$3.l() != djk.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dN().a(new ko(kx.b, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void P() {
      if (this.p() == null || !this.aC()) {
         this.dN().a(this, this.v(), this.dc(), 1.0F, 1.0F);
      }
   }

   public void gp() {
      float $$0 = 0.7F + 0.4F * this.ah.i();
      float $$1 = 0.8F + 0.2F * this.ah.i();
      this.dN().a(this, avc.cP, this.dc(), $$1, $$0);
   }

   @Override
   public cma a(clz $$0) {
      return $$0.ai() == brn.n ? cma.a : cl;
   }

   @Override
   public avd dc() {
      return avd.f;
   }

   @Override
   protected avb o_() {
      return avc.cN;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.cO;
   }

   @Override
   protected avb v() {
      return this.aC() ? avc.cH : avc.cI;
   }

   public Optional<bsa> gq() {
      return this.dQ().c(cbd.x).map(bqf::d).filter($$0 -> $$0 instanceof bsa).map($$0 -> (bsa)$$0);
   }

   public boolean j(etp $$0) {
      etp $$1 = this.dn().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Y() {
      this.dN().af().a("breezeBrain");
      this.dQ().a((aqh)this.dN(), this);
      this.dN().af().b("breezeActivityUpdate");
      cjk.a(this);
      this.dN().af().c();
      super.Y();
   }

   @Override
   protected void X() {
      super.X();
      afw.a((bsa)this);
      afw.a(this);
   }

   @Override
   public boolean a(brn<?> $$0) {
      return $$0 == brn.bx || $$0 == brn.af;
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   public int fO() {
      return 25;
   }

   public double gr() {
      return this.dw() - 0.4;
   }

   @Override
   public boolean b(bqf $$0) {
      return $$0.a(avt.b) || $$0.d() instanceof cjj || super.b($$0);
   }

   @Override
   public double dg() {
      return (double)this.cJ();
   }

   @Override
   public boolean a(float $$0, float $$1, bqf $$2) {
      if ($$0 > 3.0F) {
         this.a(avc.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected brh.b aZ() {
      return brh.b.c;
   }
}
