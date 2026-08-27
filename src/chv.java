import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class chv extends cgz {
   private static final int bZ = 20;
   private static final int ca = 1;
   private static final int cb = 20;
   private static final int cc = 3;
   private static final int cd = 5;
   private static final int ce = 10;
   private static final float cf = 3.0F;
   private static final int cg = 1;
   private static final int ch = 80;
   public bpq b = new bpq();
   public bpq c = new bpq();
   public bpq d = new bpq();
   public bpq e = new bpq();
   public bpq bX = new bpq();
   public bpq bY = new bpq();
   private int ci = 0;
   private int cj = 0;
   private static final ckm ck = ($$0, $$1, $$2) -> {
      $$1.dM().a($$1, aum.cF, $$1.db(), 1.0F, 1.0F);
      ckm.b.deflect($$0, $$1, $$2);
   };

   public static bru.a r() {
      return bqq.A().a(brv.r, 0.63F).a(brv.q, 30.0).a(brv.k, 24.0).a(brv.c, 3.0);
   }

   public chv(bqb<? extends cgz> $$0, cyx $$1) {
      super($$0, $$1);
      this.a(elj.z, -1.0F);
      this.a(elj.o, -1.0F);
      this.bM = 10;
   }

   @Override
   protected brp<?> a(Dynamic<?> $$0) {
      return chw.a(this.dQ().a($$0));
   }

   @Override
   public brp<chv> dP() {
      return (brp<chv>)super.dP();
   }

   @Override
   protected brp.b<chv> dQ() {
      return brp.a(chw.f, chw.e);
   }

   @Override
   public void a(aiy<?> $$0) {
      if (this.dM().x_() && as.equals($$0)) {
         this.gq();
         bqz $$1 = this.ap();
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
      bqz $$0 = this.ap();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.u().b(1 + this.ei().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.y();
      }

      if ($$0 != bqz.p && this.c.c()) {
         this.d.a(this.ah);
         this.c.a();
      }

      this.cj = this.cj == 0 ? this.ag.a(1, 80) : this.cj - 1;
      if (this.cj == 0) {
         this.gn();
      }

      super.l();
   }

   public chv u() {
      this.ci = 0;
      return this;
   }

   public void y() {
      if (++this.ci <= 5) {
         doz $$0 = !this.dn().i() ? this.dn() : this.bn();
         esa $$1 = this.dp();
         esa $$2 = this.dk().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dM().a(new kd(kl.c, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bO()) {
         esa $$1 = this.cH().f();
         esa $$2 = new esa($$1.c, this.dk().d, $$1.e);
         doz $$3 = !this.dn().i() ? this.dn() : this.bn();
         if ($$3.l() != did.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dM().a(new kd(kl.c, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
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
      this.dM().a(this, aum.cP, this.db(), $$1, $$0);
   }

   @Override
   public ckm a(ckl $$0) {
      return $$0.ai() == bqb.n ? ckm.a : ck;
   }

   @Override
   public aun db() {
      return aun.f;
   }

   @Override
   protected aul o_() {
      return aum.cN;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.cO;
   }

   @Override
   protected aul v() {
      return this.aC() ? aum.cH : aum.cI;
   }

   public Optional<bqo> go() {
      return this.dP().c(bzr.x).map(bot::d).filter($$0 -> $$0 instanceof bqo).map($$0 -> (bqo)$$0);
   }

   public boolean j(esa $$0) {
      esa $$1 = this.dm().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Y() {
      this.dM().af().a("breezeBrain");
      this.dP().a((aps)this.dM(), this);
      this.dM().af().b("breezeActivityUpdate");
      chw.a(this);
      this.dM().af().c();
      super.Y();
   }

   @Override
   protected void X() {
      super.X();
      afi.a((bqo)this);
      afi.a(this);
   }

   @Override
   public boolean a(bqb<?> $$0) {
      return $$0 == bqb.bx || $$0 == bqb.af;
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
   public boolean b(bot $$0) {
      return $$0.a(ave.b) || $$0.d() instanceof chv || super.b($$0);
   }

   @Override
   public double df() {
      return (double)this.cI();
   }

   @Override
   public boolean a(float $$0, float $$1, bot $$2) {
      if ($$0 > 3.0F) {
         this.a(aum.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bpv.b aZ() {
      return bpv.b.c;
   }
}
