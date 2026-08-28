import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckm extends cjq {
   private static final int cc = 20;
   private static final int cd = 1;
   private static final int ce = 20;
   private static final int cf = 3;
   private static final int cg = 5;
   private static final int ch = 10;
   private static final float ci = 3.0F;
   private static final int cj = 1;
   private static final int ck = 80;
   public bsb b = new bsb();
   public bsb c = new bsb();
   public bsb d = new bsb();
   public bsb e = new bsb();
   public bsb ca = new bsb();
   public bsb cb = new bsb();
   private int cl = 0;
   private int cm = 0;
   private static final cnd cn = ($$0, $$1, $$2) -> {
      $$1.dQ().a(null, $$1, avh.cF, $$1.df(), 1.0F, 1.0F);
      cnd.b.deflect($$0, $$1, $$2);
   };

   public static bui.a s() {
      return btd.A().a(buj.v, 0.63F).a(buj.s, 30.0).a(buj.m, 24.0).a(buj.c, 3.0);
   }

   public ckm(bsm<? extends cjq> $$0, dcf $$1) {
      super($$0, $$1);
      this.a(eoy.z, -1.0F);
      this.a(eoy.o, -1.0F);
      this.bP = 10;
   }

   @Override
   protected bud<?> a(Dynamic<?> $$0) {
      return ckn.a(this.dV().a($$0));
   }

   @Override
   public bud<ckm> dU() {
      return (bud<ckm>)super.dU();
   }

   @Override
   protected bud.b<ckm> dV() {
      return bud.a(ckn.f, ckn.e);
   }

   @Override
   public void a(ajp<?> $$0) {
      if (this.dQ().x_() && at.equals($$0)) {
         this.gr();
         btn $$1 = this.as();
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

   private void gr() {
      this.ca.a();
      this.b.a();
      this.cb.a();
      this.e.a();
   }

   @Override
   public void l() {
      btn $$0 = this.as();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.u().b(1 + this.dT().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.y();
      }

      if ($$0 != btn.p && this.c.c()) {
         this.d.a(this.ai);
         this.c.a();
      }

      this.cm = this.cm == 0 ? this.ah.a(1, 80) : this.cm - 1;
      if (this.cm == 0) {
         this.go();
      }

      super.l();
   }

   public ckm u() {
      this.cl = 0;
      return this;
   }

   public void y() {
      if (++this.cl <= 5) {
         dsk $$0 = !this.dr().i() ? this.dr() : this.bq();
         ewf $$1 = this.dt();
         ewf $$2 = this.do().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dQ().a(new lb(lj.b, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bS()) {
         ewf $$1 = this.cL().f();
         ewf $$2 = new ewf($$1.c, this.do().d, $$1.e);
         dsk $$3 = !this.dr().i() ? this.dr() : this.bq();
         if ($$3.l() != dln.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dQ().a(new lb(lj.b, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
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

   public void go() {
      float $$0 = 0.7F + 0.4F * this.ah.i();
      float $$1 = 0.8F + 0.2F * this.ah.i();
      this.dQ().a(this, avh.cP, this.df(), $$1, $$0);
   }

   @Override
   public cnd a(cnc $$0) {
      return $$0.al() != bsm.n && $$0.al() != bsm.bn ? cn : cnd.a;
   }

   @Override
   public avi df() {
      return avi.f;
   }

   @Override
   protected avg o_() {
      return avh.cN;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.cO;
   }

   @Override
   protected avg v() {
      return this.aF() ? avh.cH : avh.cI;
   }

   public Optional<btb> gp() {
      return this.dU().c(ccf.x).map(bqz::d).filter($$0 -> $$0 instanceof btb).map($$0 -> (btb)$$0);
   }

   public boolean l(ewf $$0) {
      ewf $$1 = this.dq().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("breezeBrain");
      this.dU().a((aqm)this.dQ(), this);
      this.dQ().ag().b("breezeActivityUpdate");
      ckn.a(this);
      this.dQ().ag().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a((btb)this);
      afy.a(this);
   }

   @Override
   public boolean a(bsm<?> $$0) {
      return $$0 == bsm.by || $$0 == bsm.af;
   }

   @Override
   public int ab() {
      return 30;
   }

   @Override
   public int ae() {
      return 25;
   }

   public double gq() {
      return this.dz() - 0.4;
   }

   @Override
   public boolean b(bqz $$0) {
      return $$0.a(avy.b) || $$0.d() instanceof ckm || super.b($$0);
   }

   @Override
   public double dj() {
      return (double)this.cM();
   }

   @Override
   public boolean a(float $$0, float $$1, bqz $$2) {
      if ($$0 > 3.0F) {
         this.a(avh.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bsg.b bc() {
      return bsg.b.c;
   }

   @Nullable
   @Override
   public btb p() {
      return this.N();
   }
}
