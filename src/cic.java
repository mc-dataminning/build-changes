import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cic extends chg {
   private static final int bZ = 20;
   private static final int ca = 1;
   private static final int cb = 20;
   private static final int cc = 3;
   private static final int cd = 5;
   private static final int ce = 10;
   private static final float cf = 3.0F;
   private static final int cg = 1;
   private static final int ch = 80;
   public bpv b = new bpv();
   public bpv c = new bpv();
   public bpv d = new bpv();
   public bpv e = new bpv();
   public bpv bX = new bpv();
   public bpv bY = new bpv();
   private int ci = 0;
   private int cj = 0;
   private static final ckt ck = ($$0, $$1, $$2) -> {
      $$1.dM().a($$1, auo.cF, $$1.db(), 1.0F, 1.0F);
      ckt.b.deflect($$0, $$1, $$2);
   };

   public static brz.a r() {
      return bqv.A().a(bsa.r, 0.63F).a(bsa.q, 30.0).a(bsa.k, 24.0).a(bsa.c, 3.0);
   }

   public cic(bqg<? extends chg> $$0, czg $$1) {
      super($$0, $$1);
      this.a(els.z, -1.0F);
      this.a(els.o, -1.0F);
      this.bM = 10;
   }

   @Override
   protected bru<?> a(Dynamic<?> $$0) {
      return cid.a(this.dQ().a($$0));
   }

   @Override
   public bru<cic> dP() {
      return (bru<cic>)super.dP();
   }

   @Override
   protected bru.b<cic> dQ() {
      return bru.a(cid.f, cid.e);
   }

   @Override
   public void a(aja<?> $$0) {
      if (this.dM().x_() && as.equals($$0)) {
         this.gq();
         bre $$1 = this.ap();
         switch ($$1) {
            case q:
               this.bX.b(this.ah);
               break;
            case r:
               this.e.b(this.ah);
               break;
            case p:
               this.c.b(this.ah);
         }
      }

      super.a($$0);
   }

   private void gq() {
      this.bX.a();
      this.b.a();
      this.bY.a();
      this.e.a();
   }

   @Override
   public void l() {
      bre $$0 = this.ap();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.u().b(1 + this.ei().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.y();
      }

      if ($$0 != bre.p && this.c.c()) {
         this.d.a(this.ah);
         this.c.a();
      }

      this.cj = this.cj == 0 ? this.ag.a(1, 80) : this.cj - 1;
      if (this.cj == 0) {
         this.gn();
      }

      super.l();
   }

   public cic u() {
      this.ci = 0;
      return this;
   }

   public void y() {
      if (++this.ci <= 5) {
         dpi $$0 = !this.dn().i() ? this.dn() : this.bn();
         esj $$1 = this.dp();
         esj $$2 = this.dk().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dM().a(new kf(kn.c, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bO()) {
         esj $$1 = this.cH().f();
         esj $$2 = new esj($$1.c, this.dk().d, $$1.e);
         dpi $$3 = !this.dn().i() ? this.dn() : this.bn();
         if ($$3.l() != dim.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dM().a(new kf(kn.c, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void P() {
      if (this.p() == null || !this.aC()) {
         this.dM().a(this, this.v(), this.db(), 1.0F, 1.0F);
      }
   }

   public void gn() {
      float $$0 = 0.7F + 0.4F * this.ag.i();
      float $$1 = 0.8F + 0.2F * this.ag.i();
      this.dM().a(this, auo.cP, this.db(), $$1, $$0);
   }

   @Override
   public ckt a(cks $$0) {
      return $$0.ai() == bqg.n ? ckt.a : ck;
   }

   @Override
   public aup db() {
      return aup.f;
   }

   @Override
   protected aun o_() {
      return auo.cN;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.cO;
   }

   @Override
   protected aun v() {
      return this.aC() ? auo.cH : auo.cI;
   }

   public Optional<bqt> go() {
      return this.dP().c(bzw.x).map(boy::d).filter($$0 -> $$0 instanceof bqt).map($$0 -> (bqt)$$0);
   }

   public boolean j(esj $$0) {
      esj $$1 = this.dm().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Y() {
      this.dM().af().a("breezeBrain");
      this.dP().a((apu)this.dM(), this);
      this.dM().af().b("breezeActivityUpdate");
      cid.a(this);
      this.dM().af().c();
      super.Y();
   }

   @Override
   protected void X() {
      super.X();
      afk.a((bqt)this);
      afk.a(this);
   }

   @Override
   public boolean a(bqg<?> $$0) {
      return $$0 == bqg.bx || $$0 == bqg.af;
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   public int fN() {
      return 25;
   }

   public double gp() {
      return this.dv() - 0.4;
   }

   @Override
   public boolean b(boy $$0) {
      return $$0.a(avg.b) || $$0.d() instanceof cic || super.b($$0);
   }

   @Override
   public double df() {
      return (double)this.cI();
   }

   @Override
   public boolean a(float $$0, float $$1, boy $$2) {
      if ($$0 > 3.0F) {
         this.a(auo.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bqa.b aZ() {
      return bqa.b.c;
   }
}
