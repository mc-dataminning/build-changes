import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckz extends ckd {
   private static final int cc = 20;
   private static final int cd = 1;
   private static final int ce = 20;
   private static final int cf = 3;
   private static final int cg = 5;
   private static final int ch = 10;
   private static final float ci = 3.0F;
   private static final int cj = 1;
   private static final int ck = 80;
   public bsm b = new bsm();
   public bsm c = new bsm();
   public bsm d = new bsm();
   public bsm e = new bsm();
   public bsm ca = new bsm();
   public bsm cb = new bsm();
   private int cl = 0;
   private int cm = 0;
   private static final cnq cn = ($$0, $$1, $$2) -> {
      $$1.dO().a(null, $$1, avp.cF, $$1.de(), 1.0F, 1.0F);
      cnq.b.deflect($$0, $$1, $$2);
   };

   public static buv.a s() {
      return btp.C().a(buw.v, 0.63F).a(buw.s, 30.0).a(buw.m, 24.0).a(buw.c, 3.0);
   }

   public ckz(bsx<? extends ckd> $$0, dcw $$1) {
      super($$0, $$1);
      this.a(epv.z, -1.0F);
      this.a(epv.o, -1.0F);
      this.bP = 10;
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return cla.a(this, this.dU().a($$0));
   }

   @Override
   public buq<ckz> dT() {
      return (buq<ckz>)super.dT();
   }

   @Override
   protected buq.b<ckz> dU() {
      return buq.a(cla.f, cla.e);
   }

   @Override
   public void a(ajw<?> $$0) {
      if (this.dO().x_() && at.equals($$0)) {
         this.gn();
         bua $$1 = this.at();
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

   private void gn() {
      this.ca.a();
      this.b.a();
      this.cb.a();
      this.e.a();
   }

   @Override
   public void l() {
      bua $$0 = this.at();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.t().b(1 + this.dR().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.x();
      }

      if ($$0 != bua.p && this.c.c()) {
         this.d.a(this.ai);
         this.c.a();
      }

      this.cm = this.cm == 0 ? this.ah.a(1, 80) : this.cm - 1;
      if (this.cm == 0) {
         this.gk();
      }

      super.l();
   }

   public ckz t() {
      this.cl = 0;
      return this;
   }

   public void x() {
      if (++this.cl <= 5) {
         dtc $$0 = !this.dp().i() ? this.dp() : this.bq();
         exc $$1 = this.dr();
         exc $$2 = this.dm().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dO().a(new le(lm.b, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bS()) {
         exc $$1 = this.cK().f();
         exc $$2 = new exc($$1.c, this.dm().d, $$1.e);
         dtc $$3 = !this.dp().i() ? this.dp() : this.bq();
         if ($$3.l() != dmf.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dO().a(new le(lm.b, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void S() {
      if (this.p() == null || !this.aF()) {
         this.dO().a(this, this.v(), this.de(), 1.0F, 1.0F);
      }
   }

   public void gk() {
      float $$0 = 0.7F + 0.4F * this.ah.i();
      float $$1 = 0.8F + 0.2F * this.ah.i();
      this.dO().a(this, avp.cP, this.de(), $$1, $$0);
   }

   @Override
   public cnq a(cnp $$0) {
      if ($$0.am() != bsx.n && $$0.am() != bsx.bn) {
         return this.am().a(awi.r) ? cn : cnq.a;
      } else {
         return cnq.a;
      }
   }

   @Override
   public avq de() {
      return avq.f;
   }

   @Override
   protected avo n_() {
      return avp.cN;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.cO;
   }

   @Override
   protected avo v() {
      return this.aF() ? avp.cH : avp.cI;
   }

   public Optional<btn> gl() {
      return this.dT().c(ccs.x).map(brk::d).filter($$0 -> $$0 instanceof btn).map($$0 -> (btn)$$0);
   }

   public boolean b(exc $$0) {
      exc $$1 = this.do().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void ab() {
      this.dO().ag().a("breezeBrain");
      this.dT().a((aqu)this.dO(), this);
      this.dO().ag().b("breezeActivityUpdate");
      cla.a(this);
      this.dO().ag().c();
      super.ab();
   }

   @Override
   protected void aa() {
      super.aa();
      agf.a((btn)this);
      agf.a(this);
   }

   @Override
   public boolean a(bsx<?> $$0) {
      return $$0 == bsx.by || $$0 == bsx.af;
   }

   @Override
   public int ae() {
      return 30;
   }

   @Override
   public int fM() {
      return 25;
   }

   public double gm() {
      return this.dx() - 0.4;
   }

   @Override
   public boolean b(brk $$0) {
      return $$0.d() instanceof ckz || super.b($$0);
   }

   @Override
   public double di() {
      return (double)this.cL();
   }

   @Override
   public boolean a(float $$0, float $$1, brk $$2) {
      if ($$0 > 3.0F) {
         this.a(avp.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bsr.b bc() {
      return bsr.b.c;
   }

   @Nullable
   @Override
   public btn p() {
      return this.P();
   }
}
