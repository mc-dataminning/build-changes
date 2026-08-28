import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckx extends ckb {
   private static final int cc = 20;
   private static final int cd = 1;
   private static final int ce = 20;
   private static final int cf = 3;
   private static final int cg = 5;
   private static final int ch = 10;
   private static final float ci = 3.0F;
   private static final int cj = 1;
   private static final int ck = 80;
   public bsl b = new bsl();
   public bsl c = new bsl();
   public bsl d = new bsl();
   public bsl e = new bsl();
   public bsl ca = new bsl();
   public bsl cb = new bsl();
   private int cl = 0;
   private int cm = 0;
   private static final cno cn = ($$0, $$1, $$2) -> {
      $$1.dQ().a(null, $$1, avo.cF, $$1.df(), 1.0F, 1.0F);
      cno.b.deflect($$0, $$1, $$2);
   };

   public static but.a s() {
      return btn.A().a(buu.v, 0.63F).a(buu.s, 30.0).a(buu.m, 24.0).a(buu.c, 3.0);
   }

   public ckx(bsw<? extends ckb> $$0, dcu $$1) {
      super($$0, $$1);
      this.a(epp.z, -1.0F);
      this.a(epp.o, -1.0F);
      this.bP = 10;
   }

   @Override
   protected buo<?> a(Dynamic<?> $$0) {
      return cky.a(this, this.dV().a($$0));
   }

   @Override
   public buo<ckx> dU() {
      return (buo<ckx>)super.dU();
   }

   @Override
   protected buo.b<ckx> dV() {
      return buo.a(cky.f, cky.e);
   }

   @Override
   public void a(ajv<?> $$0) {
      if (this.dQ().x_() && at.equals($$0)) {
         this.gp();
         bty $$1 = this.at();
         switch ($$1) {
            case q:
               this.ca.b(this.ai);
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

   private void gp() {
      this.ca.a();
      this.b.a();
      this.cb.a();
      this.e.a();
   }

   @Override
   public void l() {
      bty $$0 = this.at();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.t().b(1 + this.dT().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.x();
      }

      if ($$0 != bty.p && this.c.c()) {
         this.d.a(this.ai);
         this.c.a();
      }

      this.cm = this.cm == 0 ? this.ah.a(1, 80) : this.cm - 1;
      if (this.cm == 0) {
         this.gm();
      }

      super.l();
   }

   public ckx t() {
      this.cl = 0;
      return this;
   }

   public void x() {
      if (++this.cl <= 5) {
         dta $$0 = !this.dr().i() ? this.dr() : this.bq();
         eww $$1 = this.dt();
         eww $$2 = this.do().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dQ().a(new le(lm.b, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bS()) {
         eww $$1 = this.cL().f();
         eww $$2 = new eww($$1.c, this.do().d, $$1.e);
         dta $$3 = !this.dr().i() ? this.dr() : this.bq();
         if ($$3.l() != dmd.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dQ().a(new le(lm.b, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void Q() {
      if (this.p() == null || !this.aF()) {
         this.dQ().a(this, this.v(), this.df(), 1.0F, 1.0F);
      }
   }

   public void gm() {
      float $$0 = 0.7F + 0.4F * this.ah.i();
      float $$1 = 0.8F + 0.2F * this.ah.i();
      this.dQ().a(this, avo.cP, this.df(), $$1, $$0);
   }

   @Override
   public cno a(cnn $$0) {
      if ($$0.am() != bsw.n && $$0.am() != bsw.bn) {
         return this.am().a(awh.r) ? cn : cno.a;
      } else {
         return cno.a;
      }
   }

   @Override
   public avp df() {
      return avp.f;
   }

   @Override
   protected avn n_() {
      return avo.cN;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.cO;
   }

   @Override
   protected avn v() {
      return this.aF() ? avo.cH : avo.cI;
   }

   public Optional<btl> gn() {
      return this.dU().c(ccq.x).map(brj::d).filter($$0 -> $$0 instanceof btl).map($$0 -> (btl)$$0);
   }

   public boolean b(eww $$0) {
      eww $$1 = this.dq().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("breezeBrain");
      this.dU().a((aqt)this.dQ(), this);
      this.dQ().ag().b("breezeActivityUpdate");
      cky.a(this);
      this.dQ().ag().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      age.a((btl)this);
      age.a(this);
   }

   @Override
   public boolean a(bsw<?> $$0) {
      return $$0 == bsw.by || $$0 == bsw.af;
   }

   @Override
   public int ab() {
      return 30;
   }

   @Override
   public int ae() {
      return 25;
   }

   public double go() {
      return this.dz() - 0.4;
   }

   @Override
   public boolean b(brj $$0) {
      return $$0.d() instanceof ckx || super.b($$0);
   }

   @Override
   public double dj() {
      return (double)this.cM();
   }

   @Override
   public boolean a(float $$0, float $$1, brj $$2) {
      if ($$0 > 3.0F) {
         this.a(avo.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bsq.b bc() {
      return bsq.b.c;
   }

   @Nullable
   @Override
   public btl p() {
      return this.N();
   }
}
