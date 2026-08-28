import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckj extends cjn {
   private static final int cc = 20;
   private static final int cd = 1;
   private static final int ce = 20;
   private static final int cf = 3;
   private static final int cg = 5;
   private static final int ch = 10;
   private static final float ci = 3.0F;
   private static final int cj = 1;
   private static final int ck = 80;
   public bry b = new bry();
   public bry c = new bry();
   public bry d = new bry();
   public bry e = new bry();
   public bry ca = new bry();
   public bry cb = new bry();
   private int cl = 0;
   private int cm = 0;
   private static final cna cn = ($$0, $$1, $$2) -> {
      $$1.dP().a(null, $$1, avf.cF, $$1.de(), 1.0F, 1.0F);
      cna.b.deflect($$0, $$1, $$2);
   };

   public static buf.a s() {
      return bta.A().a(bug.v, 0.63F).a(bug.s, 30.0).a(bug.m, 24.0).a(bug.c, 3.0);
   }

   public ckj(bsj<? extends cjn> $$0, dcd $$1) {
      super($$0, $$1);
      this.a(eos.z, -1.0F);
      this.a(eos.o, -1.0F);
      this.bP = 10;
   }

   @Override
   protected bua<?> a(Dynamic<?> $$0) {
      return ckk.a(this.dU().a($$0));
   }

   @Override
   public bua<ckj> dT() {
      return (bua<ckj>)super.dT();
   }

   @Override
   protected bua.b<ckj> dU() {
      return bua.a(ckk.f, ckk.e);
   }

   @Override
   public void a(ajp<?> $$0) {
      if (this.dP().x_() && at.equals($$0)) {
         this.gq();
         btk $$1 = this.ar();
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

   private void gq() {
      this.ca.a();
      this.b.a();
      this.cb.a();
      this.e.a();
   }

   @Override
   public void l() {
      btk $$0 = this.ar();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.u().b(1 + this.dS().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.y();
      }

      if ($$0 != btk.p && this.c.c()) {
         this.d.a(this.ai);
         this.c.a();
      }

      this.cm = this.cm == 0 ? this.ah.a(1, 80) : this.cm - 1;
      if (this.cm == 0) {
         this.gn();
      }

      super.l();
   }

   public ckj u() {
      this.cl = 0;
      return this;
   }

   public void y() {
      if (++this.cl <= 5) {
         dsh $$0 = !this.dq().i() ? this.dq() : this.bp();
         evz $$1 = this.ds();
         evz $$2 = this.dn().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dP().a(new lb(lj.b, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bR()) {
         evz $$1 = this.cK().f();
         evz $$2 = new evz($$1.c, this.dn().d, $$1.e);
         dsh $$3 = !this.dq().i() ? this.dq() : this.bp();
         if ($$3.l() != dll.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dP().a(new lb(lj.b, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void Q() {
      if (this.p() == null || !this.aE()) {
         this.dP().a(this, this.v(), this.de(), 1.0F, 1.0F);
      }
   }

   public void gn() {
      float $$0 = 0.7F + 0.4F * this.ah.i();
      float $$1 = 0.8F + 0.2F * this.ah.i();
      this.dP().a(this, avf.cP, this.de(), $$1, $$0);
   }

   @Override
   public cna a(cmz $$0) {
      return $$0.ak() != bsj.n && $$0.ak() != bsj.bn ? cn : cna.a;
   }

   @Override
   public avg de() {
      return avg.f;
   }

   @Override
   protected ave o_() {
      return avf.cN;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.cO;
   }

   @Override
   protected ave v() {
      return this.aE() ? avf.cH : avf.cI;
   }

   public Optional<bsy> go() {
      return this.dT().c(ccc.x).map(bqw::d).filter($$0 -> $$0 instanceof bsy).map($$0 -> (bsy)$$0);
   }

   public boolean k(evz $$0) {
      evz $$1 = this.dp().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("breezeBrain");
      this.dT().a((aqk)this.dP(), this);
      this.dP().ag().b("breezeActivityUpdate");
      ckk.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a((bsy)this);
      afy.a(this);
   }

   @Override
   public boolean a(bsj<?> $$0) {
      return $$0 == bsj.by || $$0 == bsj.af;
   }

   @Override
   public int ab() {
      return 30;
   }

   @Override
   public int ae() {
      return 25;
   }

   public double gp() {
      return this.dy() - 0.4;
   }

   @Override
   public boolean b(bqw $$0) {
      return $$0.a(avw.b) || $$0.d() instanceof ckj || super.b($$0);
   }

   @Override
   public double di() {
      return (double)this.cL();
   }

   @Override
   public boolean a(float $$0, float $$1, bqw $$2) {
      if ($$0 > 3.0F) {
         this.a(avf.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bsd.b bb() {
      return bsd.b.c;
   }

   @Nullable
   @Override
   public bsy p() {
      return this.N();
   }
}
