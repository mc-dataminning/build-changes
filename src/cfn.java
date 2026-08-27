import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cfn extends cer {
   private static final int bV = 20;
   private static final int bW = 1;
   private static final int bX = 20;
   private static final int bY = 3;
   private static final int bZ = 5;
   private static final int ca = 10;
   private static final float cb = 3.0F;
   private static final int cc = 1;
   private static final int cd = 80;
   public bnm b = new bnm();
   public bnm c = new bnm();
   public bnm d = new bnm();
   public bnm e = new bnm();
   public bnm bT = new bnm();
   public bnm bU = new bnm();
   private int ce = 0;
   private int cf = 0;
   private static final cie cg = ($$0, $$1, $$2) -> {
      $$1.dM().a($$1, atl.cy, $$1.db(), 1.0F, 1.0F);
      cie.b.deflect($$0, $$1, $$2);
   };

   public static bpo.a u() {
      return bok.C().a(bpp.o, 0.63F).a(bpp.n, 30.0).a(bpp.i, 24.0).a(bpp.c, 3.0);
   }

   public cfn(bnw<? extends cer> $$0, cvr $$1) {
      super($$0, $$1);
      this.a(ehh.z, -1.0F);
      this.a(ehh.o, -1.0F);
      this.bJ = 10;
   }

   @Override
   protected bpj<?> a(Dynamic<?> $$0) {
      return cfo.a(this.dP().a($$0));
   }

   @Override
   public bpj<cfn> dO() {
      return (bpj<cfn>)super.dO();
   }

   @Override
   protected bpj.b<cfn> dP() {
      return bpj.a(cfo.f, cfo.e);
   }

   @Override
   public void a(aie<?> $$0) {
      if (this.dM().y_() && ar.equals($$0)) {
         this.gj();
         bot $$1 = this.ap();
         switch ($$1) {
            case q:
               this.bT.b(this.ag);
               break;
            case r:
               this.e.b(this.ag);
               break;
            case p:
               this.c.b(this.ag);
         }
      }

      super.a($$0);
   }

   private void gj() {
      this.bT.a();
      this.b.a();
      this.bU.a();
      this.e.a();
   }

   @Override
   public void l() {
      bot $$0 = this.ap();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.w().b(1 + this.eh().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.A();
      }

      if ($$0 != bot.p && this.c.c()) {
         this.d.a(this.ag);
         this.c.a();
      }

      this.cf = this.cf == 0 ? this.af.a(1, 80) : this.cf - 1;
      if (this.cf == 0) {
         this.gg();
      }

      super.l();
   }

   public cfn w() {
      this.ce = 0;
      return this;
   }

   public void A() {
      if (++this.ce <= 5) {
         dlj $$0 = !this.dn().i() ? this.dn() : this.bk();
         enz $$1 = this.dp();
         enz $$2 = this.dk().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dM().a(new jr(jz.c, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bO()) {
         enz $$1 = this.cH().f();
         enz $$2 = new enz($$1.c, this.dk().d, $$1.e);
         dlj $$3 = !this.dn().i() ? this.dn() : this.bk();
         if ($$3.l() != dex.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dM().a(new jr(jz.c, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void R() {
      if (this.q() == null || !this.aC()) {
         this.dM().a(this, this.y(), this.db(), 1.0F, 1.0F);
      }
   }

   public void gg() {
      float $$0 = 0.7F + 0.4F * this.af.i();
      float $$1 = 0.8F + 0.2F * this.af.i();
      this.dM().a(this, atl.cI, this.db(), $$1, $$0);
   }

   @Override
   public cie a(cid $$0) {
      return $$0.ai() == bnw.bl && Optional.ofNullable($$0.w()).map(bnq::ai).map($$0x -> $$0x == bnw.bw).orElse(false) ? cie.a : cg;
   }

   @Override
   public atm db() {
      return atm.f;
   }

   @Override
   protected atk n_() {
      return atl.cG;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.cH;
   }

   @Override
   protected atk y() {
      return this.aC() ? atl.cA : atl.cB;
   }

   public Optional<boi> gh() {
      return this.dO().c(bxl.x).map(bmp::d).filter($$0 -> $$0 instanceof boi).map($$0 -> (boi)$$0);
   }

   public boolean j(enz $$0) {
      enz $$1 = this.dm().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void aa() {
      this.dM().ae().a("breezeBrain");
      this.dO().a((aow)this.dM(), this);
      this.dM().ae().b("breezeActivityUpdate");
      cfo.a(this);
      this.dM().ae().c();
      super.aa();
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a((boi)this);
      aep.a(this);
   }

   @Override
   public boolean a(bnw<?> $$0) {
      return $$0 == bnw.bw || $$0 == bnw.ae;
   }

   @Override
   public int fH() {
      return 30;
   }

   @Override
   public int fJ() {
      return 25;
   }

   public double gi() {
      return this.dv() - 0.4;
   }

   @Override
   public boolean b(bmp $$0) {
      return $$0.a(auc.b) || $$0.d() instanceof cfn || super.b($$0);
   }

   @Override
   public double df() {
      return (double)this.cI();
   }

   @Override
   public boolean a(float $$0, float $$1, bmp $$2) {
      if ($$0 > 3.0F) {
         this.a(atl.cE, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bnq.b aW() {
      return bnq.b.c;
   }
}
