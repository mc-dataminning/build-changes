import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cin extends chr {
   private static final int ca = 20;
   private static final int cb = 1;
   private static final int cc = 20;
   private static final int cd = 3;
   private static final int ce = 5;
   private static final int cf = 10;
   private static final float cg = 3.0F;
   private static final int ch = 1;
   private static final int ci = 80;
   public bqg b = new bqg();
   public bqg c = new bqg();
   public bqg d = new bqg();
   public bqg e = new bqg();
   public bqg bY = new bqg();
   public bqg bZ = new bqg();
   private int cj = 0;
   private int ck = 0;
   private static final cle cl = ($$0, $$1, $$2) -> {
      $$1.dN().a($$1, auz.cF, $$1.dc(), 1.0F, 1.0F);
      cle.b.deflect($$0, $$1, $$2);
   };

   public static bsk.a r() {
      return brg.A().a(bsl.r, 0.63F).a(bsl.q, 30.0).a(bsl.k, 24.0).a(bsl.c, 3.0);
   }

   public cin(bqr<? extends chr> $$0, czu $$1) {
      super($$0, $$1);
      this.a(emi.z, -1.0F);
      this.a(emi.o, -1.0F);
      this.bN = 10;
   }

   @Override
   protected bsf<?> a(Dynamic<?> $$0) {
      return cio.a(this.dR().a($$0));
   }

   @Override
   public bsf<cin> dQ() {
      return (bsf<cin>)super.dQ();
   }

   @Override
   protected bsf.b<cin> dR() {
      return bsf.a(cio.f, cio.e);
   }

   @Override
   public void a(ajk<?> $$0) {
      if (this.dN().x_() && at.equals($$0)) {
         this.gs();
         brp $$1 = this.ap();
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
      brp $$0 = this.ap();
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

      if ($$0 != brp.p && this.c.c()) {
         this.d.a(this.ai);
         this.c.a();
      }

      this.ck = this.ck == 0 ? this.ah.a(1, 80) : this.ck - 1;
      if (this.ck == 0) {
         this.gp();
      }

      super.l();
   }

   public cin u() {
      this.cj = 0;
      return this;
   }

   public void y() {
      if (++this.cj <= 5) {
         dpy $$0 = !this.do().i() ? this.do() : this.bn();
         etf $$1 = this.dq();
         etf $$2 = this.dl().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dN().a(new kn(kw.b, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bP()) {
         etf $$1 = this.cI().f();
         etf $$2 = new etf($$1.c, this.dl().d, $$1.e);
         dpy $$3 = !this.do().i() ? this.do() : this.bn();
         if ($$3.l() != djb.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dN().a(new kn(kw.b, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
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
      this.dN().a(this, auz.cP, this.dc(), $$1, $$0);
   }

   @Override
   public cle a(cld $$0) {
      return $$0.ai() == bqr.n ? cle.a : cl;
   }

   @Override
   public ava dc() {
      return ava.f;
   }

   @Override
   protected auy o_() {
      return auz.cN;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.cO;
   }

   @Override
   protected auy v() {
      return this.aC() ? auz.cH : auz.cI;
   }

   public Optional<bre> gq() {
      return this.dQ().c(cah.x).map(bpj::d).filter($$0 -> $$0 instanceof bre).map($$0 -> (bre)$$0);
   }

   public boolean j(etf $$0) {
      etf $$1 = this.dn().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Y() {
      this.dN().af().a("breezeBrain");
      this.dQ().a((aqe)this.dN(), this);
      this.dN().af().b("breezeActivityUpdate");
      cio.a(this);
      this.dN().af().c();
      super.Y();
   }

   @Override
   protected void X() {
      super.X();
      afu.a((bre)this);
      afu.a(this);
   }

   @Override
   public boolean a(bqr<?> $$0) {
      return $$0 == bqr.bx || $$0 == bqr.af;
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
   public boolean b(bpj $$0) {
      return $$0.a(avq.b) || $$0.d() instanceof cin || super.b($$0);
   }

   @Override
   public double dg() {
      return (double)this.cJ();
   }

   @Override
   public boolean a(float $$0, float $$1, bpj $$2) {
      if ($$0 > 3.0F) {
         this.a(auz.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bql.b aZ() {
      return bql.b.c;
   }
}
