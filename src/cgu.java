import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cgu extends cfy {
   private static final int bZ = 20;
   private static final int ca = 1;
   private static final int cb = 20;
   private static final int cc = 3;
   private static final int cd = 5;
   private static final int ce = 10;
   private static final float cf = 3.0F;
   private static final int cg = 1;
   private static final int ch = 80;
   public bos b = new bos();
   public bos c = new bos();
   public bos d = new bos();
   public bos e = new bos();
   public bos bX = new bos();
   public bos bY = new bos();
   private int ci = 0;
   private int cj = 0;
   private static final cjl ck = ($$0, $$1, $$2) -> {
      $$1.dM().a($$1, aty.cA, $$1.db(), 1.0F, 1.0F);
      cjl.b.deflect($$0, $$1, $$2);
   };

   public static bqu.a r() {
      return bpq.A().a(bqv.r, 0.63F).a(bqv.q, 30.0).a(bqv.k, 24.0).a(bqv.c, 3.0);
   }

   public cgu(bpc<? extends cfy> $$0, cwz $$1) {
      super($$0, $$1);
      this.a(eiy.z, -1.0F);
      this.a(eiy.o, -1.0F);
      this.bM = 10;
   }

   @Override
   protected bqp<?> a(Dynamic<?> $$0) {
      return cgv.a(this.dQ().a($$0));
   }

   @Override
   public bqp<cgu> dP() {
      return (bqp<cgu>)super.dP();
   }

   @Override
   protected bqp.b<cgu> dQ() {
      return bqp.a(cgv.f, cgv.e);
   }

   @Override
   public void a(aim<?> $$0) {
      if (this.dM().x_() && as.equals($$0)) {
         this.gq();
         bpz $$1 = this.ap();
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
      bpz $$0 = this.ap();
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

      if ($$0 != bpz.p && this.c.c()) {
         this.d.a(this.ah);
         this.c.a();
      }

      this.cj = this.cj == 0 ? this.ag.a(1, 80) : this.cj - 1;
      if (this.cj == 0) {
         this.gn();
      }

      super.l();
   }

   public cgu s() {
      this.ci = 0;
      return this;
   }

   public void y() {
      if (++this.ci <= 5) {
         dmz $$0 = !this.dn().i() ? this.dn() : this.bn();
         epr $$1 = this.dp();
         epr $$2 = this.dk().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dM().a(new ju(kc.c, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bO()) {
         epr $$1 = this.cH().f();
         epr $$2 = new epr($$1.c, this.dk().d, $$1.e);
         dmz $$3 = !this.dn().i() ? this.dn() : this.bn();
         if ($$3.l() != dgf.a) {
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
      this.dM().a(this, aty.cK, this.db(), $$1, $$0);
   }

   @Override
   public cjl a(cjk $$0) {
      return $$0.ai() == bpc.bm ? cjl.a : ck;
   }

   @Override
   public atz db() {
      return atz.f;
   }

   @Override
   protected atx n_() {
      return aty.cI;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.cJ;
   }

   @Override
   protected atx v() {
      return this.aC() ? aty.cC : aty.cD;
   }

   public Optional<bpo> go() {
      return this.dP().c(byr.x).map(bnv::d).filter($$0 -> $$0 instanceof bpo).map($$0 -> (bpo)$$0);
   }

   public boolean j(epr $$0) {
      epr $$1 = this.dm().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Y() {
      this.dM().ae().a("breezeBrain");
      this.dP().a((apf)this.dM(), this);
      this.dM().ae().b("breezeActivityUpdate");
      cgv.a(this);
      this.dM().ae().c();
      super.Y();
   }

   @Override
   protected void X() {
      super.X();
      aew.a((bpo)this);
      aew.a(this);
   }

   @Override
   public boolean a(bpc<?> $$0) {
      return $$0 == bpc.bx || $$0 == bpc.af;
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
   public boolean b(bnv $$0) {
      return $$0.a(aup.b) || $$0.d() instanceof cgu || super.b($$0);
   }

   @Override
   public double df() {
      return (double)this.cI();
   }

   @Override
   public boolean a(float $$0, float $$1, bnv $$2) {
      if ($$0 > 3.0F) {
         this.a(aty.cG, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bow.b aZ() {
      return bow.b.c;
   }
}
