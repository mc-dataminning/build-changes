import com.mojang.serialization.Dynamic;

public class cds extends ccw {
   private static final int bW = 20;
   private static final int bX = 1;
   private static final int bY = 20;
   private static final int bZ = 3;
   private static final int ca = 5;
   private static final int cb = 10;
   private static final float cc = 3.0F;
   private static final int cd = 1;
   private static final int ce = 80;
   public bls b = new bls();
   public bls c = new bls();
   public bls d = new bls();
   public bls e = new bls();
   public bls bU = new bls();
   public bls bV = new bls();
   private int cf = 0;
   private int cg = 0;

   public static bnt.a u() {
      return bmq.C().a(bnu.o, 0.6F).a(bnu.n, 30.0).a(bnu.i, 24.0).a(bnu.c, 2.0);
   }

   public cds(bmc<? extends ccw> $$0, ctx $$1) {
      super($$0, $$1);
      this.a(efk.z, -1.0F);
      this.a(efk.o, -1.0F);
   }

   @Override
   protected bno<?> a(Dynamic<?> $$0) {
      return cdt.a(this.dO().a($$0));
   }

   @Override
   public bno<cds> dN() {
      return (bno<cds>)super.dN();
   }

   @Override
   protected bno.b<cds> dO() {
      return bno.a(cdt.f, cdt.e);
   }

   @Override
   public boolean c(bmo $$0) {
      return $$0.ai() != bmc.m && super.c($$0);
   }

   @Override
   public void a(agn<?> $$0) {
      if (this.dL().y_() && as.equals($$0)) {
         this.gi();
         bna $$1 = this.ap();
         switch ($$1) {
            case q:
               this.bU.b(this.ah);
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

   private void gi() {
      this.bU.a();
      this.b.a();
      this.bV.a();
      this.e.a();
   }

   @Override
   public void l() {
      bna $$0 = this.ap();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.w().b(1 + this.eg().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.gf();
      }

      if ($$0 != bna.p && this.c.c()) {
         this.d.a(this.ah);
         this.c.a();
      }

      this.cg = this.cg == 0 ? this.ag.a(1, 80) : this.cg - 1;
      if (this.cg == 0) {
         this.gg();
      }

      super.l();
   }

   public cds w() {
      this.cf = 0;
      return this;
   }

   public cds A() {
      emc $$0 = this.dj().b(0.0, 0.1F, 0.0);

      for (int $$1 = 0; $$1 < 20; $$1++) {
         this.dL().a(jx.aV, $$0.c, $$0.d, $$0.e, 0.0, 0.0, 0.0);
      }

      return this;
   }

   public void gf() {
      if (++this.cf <= 5) {
         djp $$0 = !this.dm().i() ? this.dm() : this.bk();
         emc $$1 = this.do();
         emc $$2 = this.dj().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dL().a(new jp(jx.c, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bO()) {
         emc $$1 = this.cH().f();
         emc $$2 = new emc($$1.c, this.dj().d, $$1.e);
         djp $$3 = !this.dm().i() ? this.dm() : this.bk();
         if ($$3.l() != ddd.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dL().a(new jp(jx.c, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void R() {
      if (this.q() == null || !this.aC()) {
         this.dL().a(this, this.y(), this.db(), 1.0F, 1.0F);
      }
   }

   public void gg() {
      float $$0 = 0.7F + 0.4F * this.ag.i();
      float $$1 = 0.8F + 0.2F * this.ag.i();
      this.dL().a(this, art.cH, this.db(), $$1, $$0);
   }

   @Override
   public void a(cgi $$0) {
      this.dL().a(this, art.cx, this.db(), 1.0F, 1.0F);
   }

   @Override
   public aru db() {
      return aru.f;
   }

   @Override
   protected ars n_() {
      return art.cF;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.cG;
   }

   @Override
   protected ars y() {
      return this.aC() ? art.cz : art.cA;
   }

   public boolean j(emc $$0) {
      emc $$1 = this.dl().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void aa() {
      this.dL().af().a("breezeBrain");
      this.dN().a((ane)this.dL(), this);
      this.dL().af().b("breezeActivityUpdate");
      cdt.a(this);
      this.dL().af().c();
      super.aa();
   }

   @Override
   protected void Z() {
      super.Z();
      adj.a((bmo)this);
      adj.a(this);
   }

   @Override
   public boolean a(bmc<?> $$0) {
      return $$0 == bmc.bw;
   }

   @Override
   public int fH() {
      return 30;
   }

   @Override
   public int fI() {
      return 25;
   }

   public double gh() {
      return this.du() - 0.4;
   }

   @Override
   public boolean b(bkv $$0) {
      return $$0.a(ask.b) || $$0.d() instanceof cds || super.b($$0);
   }

   @Override
   public double df() {
      return (double)this.cI();
   }

   @Override
   public boolean a(float $$0, float $$1, bkv $$2) {
      if ($$0 > 3.0F) {
         this.a(art.cD, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected blw.b aW() {
      return blw.b.c;
   }
}
