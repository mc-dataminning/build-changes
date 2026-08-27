import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cfj extends cen {
   private static final int bV = 20;
   private static final int bW = 1;
   private static final int bX = 20;
   private static final int bY = 3;
   private static final int bZ = 5;
   private static final int ca = 10;
   private static final float cb = 3.0F;
   private static final int cc = 1;
   private static final int cd = 80;
   public bnk b = new bnk();
   public bnk c = new bnk();
   public bnk d = new bnk();
   public bnk e = new bnk();
   public bnk bT = new bnk();
   public bnk bU = new bnk();
   private int ce = 0;
   private int cf = 0;
   private static final cia cg = ($$0, $$1, $$2) -> {
      $$1.dM().a($$1, atk.cx, $$1.db(), 1.0F, 1.0F);
      cia.b.deflect($$0, $$1, $$2);
   };

   public static bpk.a u() {
      return boi.C().a(bpl.o, 0.63F).a(bpl.n, 30.0).a(bpl.i, 24.0).a(bpl.c, 3.0);
   }

   public cfj(bnu<? extends cen> $$0, cvn $$1) {
      super($$0, $$1);
      this.a(eha.z, -1.0F);
      this.a(eha.o, -1.0F);
      this.bJ = 10;
   }

   @Override
   protected bpf<?> a(Dynamic<?> $$0) {
      return cfk.a(this.dP().a($$0));
   }

   @Override
   public bpf<cfj> dO() {
      return (bpf<cfj>)super.dO();
   }

   @Override
   protected bpf.b<cfj> dP() {
      return bpf.a(cfk.f, cfk.e);
   }

   @Override
   public boolean c(bog $$0) {
      return $$0.ai() != bnu.m && super.c($$0);
   }

   @Override
   public void a(aie<?> $$0) {
      if (this.dM().y_() && ar.equals($$0)) {
         this.gj();
         bor $$1 = this.ap();
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
      bor $$0 = this.ap();
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
            this.gg();
      }

      if ($$0 != bor.p && this.c.c()) {
         this.d.a(this.ag);
         this.c.a();
      }

      this.cf = this.cf == 0 ? this.af.a(1, 80) : this.cf - 1;
      if (this.cf == 0) {
         this.gh();
      }

      super.l();
   }

   public cfj w() {
      this.ce = 0;
      return this;
   }

   public cfj A() {
      ens $$0 = this.dk().b(0.0, 0.1F, 0.0);

      for (int $$1 = 0; $$1 < 20; $$1++) {
         this.dM().a(jz.aV, $$0.c, $$0.d, $$0.e, 0.0, 0.0, 0.0);
      }

      return this;
   }

   public void gg() {
      if (++this.ce <= 5) {
         dlf $$0 = !this.dn().i() ? this.dn() : this.bk();
         ens $$1 = this.dp();
         ens $$2 = this.dk().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dM().a(new jr(jz.c, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bO()) {
         ens $$1 = this.cH().f();
         ens $$2 = new ens($$1.c, this.dk().d, $$1.e);
         dlf $$3 = !this.dn().i() ? this.dn() : this.bk();
         if ($$3.l() != det.a) {
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

   public void gh() {
      float $$0 = 0.7F + 0.4F * this.af.i();
      float $$1 = 0.8F + 0.2F * this.af.i();
      this.dM().a(this, atk.cH, this.db(), $$1, $$0);
   }

   @Override
   public cia a(chz $$0) {
      return $$0.ai() == bnu.bl && Optional.ofNullable($$0.w()).map(bno::ai).map($$0x -> $$0x == bnu.bw).orElse(false) ? cia.a : cg;
   }

   @Override
   public atl db() {
      return atl.f;
   }

   @Override
   protected atj n_() {
      return atk.cF;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.cG;
   }

   @Override
   protected atj y() {
      return this.aC() ? atk.cz : atk.cA;
   }

   public boolean j(ens $$0) {
      ens $$1 = this.dm().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void aa() {
      this.dM().af().a("breezeBrain");
      this.dO().a((aov)this.dM(), this);
      this.dM().af().b("breezeActivityUpdate");
      cfk.a(this);
      this.dM().af().c();
      super.aa();
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a((bog)this);
      aep.a(this);
   }

   @Override
   public boolean a(bnu<?> $$0) {
      return $$0 == bnu.bw;
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
   public boolean b(bmn $$0) {
      return $$0.a(aub.b) || $$0.d() instanceof cfj || super.b($$0);
   }

   @Override
   public double df() {
      return (double)this.cI();
   }

   @Override
   public boolean a(float $$0, float $$1, bmn $$2) {
      if ($$0 > 3.0F) {
         this.a(atk.cD, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bno.b aW() {
      return bno.b.c;
   }
}
