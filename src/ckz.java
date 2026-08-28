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
      $$1.dP().a(null, $$1, avp.cF, $$1.df(), 1.0F, 1.0F);
      cnq.b.deflect($$0, $$1, $$2);
   };

   public static buv.a s() {
      return btp.C().a(buw.v, 0.63F).a(buw.s, 30.0).a(buw.m, 24.0).a(buw.c, 3.0);
   }

   public ckz(bsx<? extends ckd> $$0, dcw $$1) {
      super($$0, $$1);
      this.a(ept.z, -1.0F);
      this.a(ept.o, -1.0F);
      this.bP = 10;
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return cla.a(this, this.dV().a($$0));
   }

   @Override
   public buq<ckz> dU() {
      return (buq<ckz>)super.dU();
   }

   @Override
   protected buq.b<ckz> dV() {
      return buq.a(cla.f, cla.e);
   }

   @Override
   public void a(ajw<?> $$0) {
      if (this.dP().x_() && at.equals($$0)) {
         this.go();
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

   private void go() {
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
            this.t().b(1 + this.dS().a(1));
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
         this.gl();
      }

      super.l();
   }

   public ckz t() {
      this.cl = 0;
      return this;
   }

   public void x() {
      if (++this.cl <= 5) {
         dtc $$0 = !this.dq().i() ? this.dq() : this.bq();
         exa $$1 = this.ds();
         exa $$2 = this.dn().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dP().a(new le(lm.b, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bS()) {
         exa $$1 = this.cL().f();
         exa $$2 = new exa($$1.c, this.dn().d, $$1.e);
         dtc $$3 = !this.dq().i() ? this.dq() : this.bq();
         if ($$3.l() != dmf.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dP().a(new le(lm.b, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void S() {
      if (this.p() == null || !this.aF()) {
         this.dP().a(this, this.v(), this.df(), 1.0F, 1.0F);
      }
   }

   public void gl() {
      float $$0 = 0.7F + 0.4F * this.ah.i();
      float $$1 = 0.8F + 0.2F * this.ah.i();
      this.dP().a(this, avp.cP, this.df(), $$1, $$0);
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
   public avq df() {
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

   public Optional<btn> gm() {
      return this.dU().c(ccs.x).map(brk::d).filter($$0 -> $$0 instanceof btn).map($$0 -> (btn)$$0);
   }

   public boolean b(exa $$0) {
      exa $$1 = this.dp().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void ab() {
      this.dP().ag().a("breezeBrain");
      this.dU().a((aqu)this.dP(), this);
      this.dP().ag().b("breezeActivityUpdate");
      cla.a(this);
      this.dP().ag().c();
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
   public int fN() {
      return 25;
   }

   public double gn() {
      return this.dy() - 0.4;
   }

   @Override
   public boolean b(brk $$0) {
      return $$0.d() instanceof ckz || super.b($$0);
   }

   @Override
   public double dj() {
      return (double)this.cM();
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
