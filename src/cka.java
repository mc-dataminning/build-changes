import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cka extends cje {
   private static final int ca = 20;
   private static final int cb = 1;
   private static final int cc = 20;
   private static final int cd = 3;
   private static final int ce = 5;
   private static final int cf = 10;
   private static final float cg = 3.0F;
   private static final int ch = 1;
   private static final int ci = 80;
   public brr b = new brr();
   public brr c = new brr();
   public brr d = new brr();
   public brr e = new brr();
   public brr bY = new brr();
   public brr bZ = new brr();
   private int cj = 0;
   private int ck = 0;
   private static final cmr cl = ($$0, $$1, $$2) -> {
      $$1.dP().a($$1, avi.cF, $$1.de(), 1.0F, 1.0F);
      cmr.b.deflect($$0, $$1, $$2);
   };

   public static btx.a s() {
      return bss.A().a(bty.r, 0.63F).a(bty.q, 30.0).a(bty.k, 24.0).a(bty.c, 3.0);
   }

   public cka(bsc<? extends cje> $$0, daz $$1) {
      super($$0, $$1);
      this.a(enn.z, -1.0F);
      this.a(enn.o, -1.0F);
      this.bN = 10;
   }

   @Override
   protected bts<?> a(Dynamic<?> $$0) {
      return ckb.a(this.dT().a($$0));
   }

   @Override
   public bts<cka> dS() {
      return (bts<cka>)super.dS();
   }

   @Override
   protected bts.b<cka> dT() {
      return bts.a(ckb.f, ckb.e);
   }

   @Override
   public void a(ajs<?> $$0) {
      if (this.dP().x_() && at.equals($$0)) {
         this.gs();
         btc $$1 = this.ar();
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
      btc $$0 = this.ar();
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

      if ($$0 != btc.p && this.c.c()) {
         this.d.a(this.ai);
         this.c.a();
      }

      this.ck = this.ck == 0 ? this.ah.a(1, 80) : this.ck - 1;
      if (this.ck == 0) {
         this.gp();
      }

      super.l();
   }

   public cka u() {
      this.cj = 0;
      return this;
   }

   public void y() {
      if (++this.cj <= 5) {
         drd $$0 = !this.dq().i() ? this.dq() : this.bp();
         eum $$1 = this.ds();
         eum $$2 = this.dn().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dP().a(new kp(ky.b, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bR()) {
         eum $$1 = this.cK().f();
         eum $$2 = new eum($$1.c, this.dn().d, $$1.e);
         drd $$3 = !this.dq().i() ? this.dq() : this.bp();
         if ($$3.l() != dkg.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dP().a(new kp(ky.b, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void P() {
      if (this.p() == null || !this.aE()) {
         this.dP().a(this, this.v(), this.de(), 1.0F, 1.0F);
      }
   }

   public void gp() {
      float $$0 = 0.7F + 0.4F * this.ah.i();
      float $$1 = 0.8F + 0.2F * this.ah.i();
      this.dP().a(this, avi.cP, this.de(), $$1, $$0);
   }

   @Override
   public cmr a(cmq $$0) {
      return $$0.ak() != bsc.n && $$0.ak() != bsc.bn ? cl : cmr.a;
   }

   @Override
   public avj de() {
      return avj.f;
   }

   @Override
   protected avh o_() {
      return avi.cN;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.cO;
   }

   @Override
   protected avh v() {
      return this.aE() ? avi.cH : avi.cI;
   }

   public Optional<bsq> gq() {
      return this.dS().c(cbu.x).map(bqp::d).filter($$0 -> $$0 instanceof bsq).map($$0 -> (bsq)$$0);
   }

   public boolean j(eum $$0) {
      eum $$1 = this.dp().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Y() {
      this.dP().af().a("breezeBrain");
      this.dS().a((aqn)this.dP(), this);
      this.dP().af().b("breezeActivityUpdate");
      ckb.a(this);
      this.dP().af().c();
      super.Y();
   }

   @Override
   protected void X() {
      super.X();
      agb.a((bsq)this);
      agb.a(this);
   }

   @Override
   public boolean a(bsc<?> $$0) {
      return $$0 == bsc.by || $$0 == bsc.af;
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   public int ad() {
      return 25;
   }

   public double gr() {
      return this.dy() - 0.4;
   }

   @Override
   public boolean b(bqp $$0) {
      return $$0.a(avz.b) || $$0.d() instanceof cka || super.b($$0);
   }

   @Override
   public double di() {
      return (double)this.cL();
   }

   @Override
   public boolean a(float $$0, float $$1, bqp $$2) {
      if ($$0 > 3.0F) {
         this.a(avi.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected brw.b bb() {
      return brw.b.c;
   }
}
