import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cgw extends cga {
   private static final int bZ = 20;
   private static final int ca = 1;
   private static final int cb = 20;
   private static final int cc = 3;
   private static final int cd = 5;
   private static final int ce = 10;
   private static final float cf = 3.0F;
   private static final int cg = 1;
   private static final int ch = 80;
   public bot b = new bot();
   public bot c = new bot();
   public bot d = new bot();
   public bot e = new bot();
   public bot bX = new bot();
   public bot bY = new bot();
   private int ci = 0;
   private int cj = 0;
   private static final cjn ck = ($$0, $$1, $$2) -> {
      $$1.dM().a($$1, aty.cE, $$1.db(), 1.0F, 1.0F);
      cjn.b.deflect($$0, $$1, $$2);
   };

   public static bqv.a r() {
      return bpr.A().a(bqw.r, 0.63F).a(bqw.q, 30.0).a(bqw.k, 24.0).a(bqw.c, 3.0);
   }

   public cgw(bpd<? extends cga> $$0, cxb $$1) {
      super($$0, $$1);
      this.a(ejg.z, -1.0F);
      this.a(ejg.o, -1.0F);
      this.bM = 10;
   }

   @Override
   protected bqq<?> a(Dynamic<?> $$0) {
      return cgx.a(this.dQ().a($$0));
   }

   @Override
   public bqq<cgw> dP() {
      return (bqq<cgw>)super.dP();
   }

   @Override
   protected bqq.b<cgw> dQ() {
      return bqq.a(cgx.f, cgx.e);
   }

   @Override
   public void a(aim<?> $$0) {
      if (this.dM().x_() && as.equals($$0)) {
         this.gq();
         bqa $$1 = this.ap();
         switch ($$1) {
            case q:
               this.bX.b(this.ah);
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

   private void gq() {
      this.bX.a();
      this.b.a();
      this.bY.a();
      this.e.a();
   }

   @Override
   public void l() {
      bqa $$0 = this.ap();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.s().b(1 + this.ei().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.y();
      }

      if ($$0 != bqa.p && this.c.c()) {
         this.d.a(this.ah);
         this.c.a();
      }

      this.cj = this.cj == 0 ? this.ag.a(1, 80) : this.cj - 1;
      if (this.cj == 0) {
         this.gn();
      }

      super.l();
   }

   public cgw s() {
      this.ci = 0;
      return this;
   }

   public void y() {
      if (++this.ci <= 5) {
         dnb $$0 = !this.dn().i() ? this.dn() : this.bn();
         ept $$1 = this.dp();
         ept $$2 = this.dk().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dM().a(new ju(kc.c, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bO()) {
         ept $$1 = this.cH().f();
         ept $$2 = new ept($$1.c, this.dk().d, $$1.e);
         dnb $$3 = !this.dn().i() ? this.dn() : this.bn();
         if ($$3.l() != dgh.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dM().a(new ju(kc.c, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void P() {
      if (this.p() == null || !this.aC()) {
         this.dM().a(this, this.v(), this.db(), 1.0F, 1.0F);
      }
   }

   public void gn() {
      float $$0 = 0.7F + 0.4F * this.ag.i();
      float $$1 = 0.8F + 0.2F * this.ag.i();
      this.dM().a(this, aty.cO, this.db(), $$1, $$0);
   }

   @Override
   public cjn a(cjm $$0) {
      return $$0.ai() == bpd.o ? cjn.a : ck;
   }

   @Override
   public atz db() {
      return atz.f;
   }

   @Override
   protected atx n_() {
      return aty.cM;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.cN;
   }

   @Override
   protected atx v() {
      return this.aC() ? aty.cG : aty.cH;
   }

   public Optional<bpp> go() {
      return this.dP().c(bys.x).map(bnw::d).filter($$0 -> $$0 instanceof bpp).map($$0 -> (bpp)$$0);
   }

   public boolean j(ept $$0) {
      ept $$1 = this.dm().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Y() {
      this.dM().ae().a("breezeBrain");
      this.dP().a((apf)this.dM(), this);
      this.dM().ae().b("breezeActivityUpdate");
      cgx.a(this);
      this.dM().ae().c();
      super.Y();
   }

   @Override
   protected void X() {
      super.X();
      aew.a((bpp)this);
      aew.a(this);
   }

   @Override
   public boolean a(bpd<?> $$0) {
      return $$0 == bpd.by || $$0 == bpd.ag;
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   public int fN() {
      return 25;
   }

   public double gp() {
      return this.dv() - 0.4;
   }

   @Override
   public boolean b(bnw $$0) {
      return $$0.a(aup.b) || $$0.d() instanceof cgw || super.b($$0);
   }

   @Override
   public double df() {
      return (double)this.cI();
   }

   @Override
   public boolean a(float $$0, float $$1, bnw $$2) {
      if ($$0 > 3.0F) {
         this.a(aty.cK, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected box.b aZ() {
      return box.b.c;
   }
}
