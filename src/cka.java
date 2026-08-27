import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cka extends cjd {
   private static final int cj = 20;
   private static final int ck = 1;
   private static final int cl = 20;
   private static final int cm = 3;
   private static final int cn = 5;
   private static final int co = 10;
   private static final float cp = 3.0F;
   private static final int cq = 1;
   private static final int cr = 80;
   public brq b = new brq();
   public brq c = new brq();
   public brq d = new brq();
   public brq e = new brq();
   public brq ch = new brq();
   public brq ci = new brq();
   private int cs = 0;
   private int ct = 0;
   private static final cmt cu = ($$0, $$1, $$2) -> {
      $$1.dU().a($$1, avo.cK, $$1.dj(), 1.0F, 1.0F);
      cmt.b.deflect($$0, $$1, $$2);
   };

   public static btu.a r() {
      return bsq.A().a(btv.r, 0.63F).a(btv.q, 30.0).a(btv.k, 24.0).a(btv.c, 3.0);
   }

   public cka(bsb<? extends cjd> $$0, dca $$1) {
      super($$0, $$1);
      this.a(epv.z, -1.0F);
      this.a(epv.o, -1.0F);
      this.bW = 10;
   }

   @Override
   protected btp<?> a(Dynamic<?> $$0) {
      return ckb.a(this.ea().a($$0));
   }

   @Override
   public btp<cka> dZ() {
      return (btp<cka>)super.dZ();
   }

   @Override
   protected btp.b<cka> ea() {
      return btp.a(ckb.f, ckb.e);
   }

   @Override
   public void a(ajy<?> $$0) {
      if (this.dU().x_() && ax.equals($$0)) {
         this.gB();
         bsz $$1 = this.ar();
         switch ($$1) {
            case q:
               this.ch.b(this.am);
               break;
            case r:
               this.e.b(this.am);
               break;
            case p:
               this.c.b(this.am);
         }
      }

      super.a($$0);
   }

   private void gB() {
      this.ch.a();
      this.b.a();
      this.ci.a();
      this.e.a();
   }

   @Override
   public void l() {
      bsz $$0 = this.ar();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.t().b(1 + this.et().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.x();
      }

      if ($$0 != bsz.p && this.c.c()) {
         this.d.a(this.am);
         this.c.a();
      }

      this.ct = this.ct == 0 ? this.al.a(1, 80) : this.ct - 1;
      if (this.ct == 0) {
         this.gy();
      }

      super.l();
   }

   public cka t() {
      this.cs = 0;
      return this;
   }

   public void x() {
      if (++this.cs <= 5) {
         dtc $$0 = !this.dv().i() ? this.dv() : this.bt();
         ewu $$1 = this.dx();
         ewu $$2 = this.ds().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dU().a(new ks(lb.b, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bW()) {
         ewu $$1 = this.cP().f();
         ewu $$2 = new ewu($$1.c, this.ds().d, $$1.e);
         dtc $$3 = !this.dv().i() ? this.dv() : this.bt();
         if ($$3.l() != dlw.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dU().a(new ks(lb.b, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void P() {
      if (this.p() == null || !this.aE()) {
         this.dU().a(this, this.u(), this.dj(), 1.0F, 1.0F);
      }
   }

   public void gy() {
      float $$0 = 0.7F + 0.4F * this.al.i();
      float $$1 = 0.8F + 0.2F * this.al.i();
      this.dU().a(this, avo.cU, this.dj(), $$1, $$0);
   }

   @Override
   public cmt a(cms $$0) {
      return $$0.ak() == bsb.p ? cmt.a : cu;
   }

   @Override
   public avq dj() {
      return avq.f;
   }

   @Override
   protected avn n_() {
      return avo.cS;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.cT;
   }

   @Override
   protected avn u() {
      return this.aE() ? avo.cM : avo.cN;
   }

   public Optional<bso> gz() {
      return this.dZ().c(cbr.x).map(bqt::d).filter($$0 -> $$0 instanceof bso).map($$0 -> (bso)$$0);
   }

   public boolean j(ewu $$0) {
      ewu $$1 = this.du().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Y() {
      this.dU().ag().a("breezeBrain");
      this.dZ().a((aqt)this.dU(), this);
      this.dU().ag().b("breezeActivityUpdate");
      ckb.a(this);
      this.dU().ag().c();
      super.Y();
   }

   @Override
   protected void X() {
      super.X();
      agi.a((bso)this);
      agi.a(this);
   }

   @Override
   public boolean a(bsb<?> $$0) {
      return $$0 == bsb.bE || $$0 == bsb.ah;
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   public int ac() {
      return 25;
   }

   public double gA() {
      return this.dD() - 0.4;
   }

   @Override
   public boolean b(bqt $$0) {
      return $$0.a(awg.b) || $$0.d() instanceof cka || super.b($$0);
   }

   @Override
   public double dn() {
      return (double)this.cQ();
   }

   @Override
   public boolean a(float $$0, float $$1, bqt $$2) {
      if ($$0 > 3.0F) {
         this.a(avo.cQ, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected brv.c bf() {
      return brv.c.c;
   }
}
