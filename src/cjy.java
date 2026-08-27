import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cjy extends cjc {
   private static final int ca = 20;
   private static final int cb = 1;
   private static final int cc = 20;
   private static final int cd = 3;
   private static final int ce = 5;
   private static final int cf = 10;
   private static final float cg = 3.0F;
   private static final int ch = 1;
   private static final int ci = 80;
   public brp b = new brp();
   public brp c = new brp();
   public brp d = new brp();
   public brp e = new brp();
   public brp bY = new brp();
   public brp bZ = new brp();
   private int cj = 0;
   private int ck = 0;
   private static final cmp cl = ($$0, $$1, $$2) -> {
      $$1.dP().a($$1, avh.cF, $$1.de(), 1.0F, 1.0F);
      cmp.b.deflect($$0, $$1, $$2);
   };

   public static btv.a s() {
      return bsq.A().a(btw.r, 0.63F).a(btw.q, 30.0).a(btw.k, 24.0).a(btw.c, 3.0);
   }

   public cjy(bsa<? extends cjc> $$0, dax $$1) {
      super($$0, $$1);
      this.a(enl.z, -1.0F);
      this.a(enl.o, -1.0F);
      this.bN = 10;
   }

   @Override
   protected btq<?> a(Dynamic<?> $$0) {
      return cjz.a(this.dT().a($$0));
   }

   @Override
   public btq<cjy> dS() {
      return (btq<cjy>)super.dS();
   }

   @Override
   protected btq.b<cjy> dT() {
      return btq.a(cjz.f, cjz.e);
   }

   @Override
   public void a(ajr<?> $$0) {
      if (this.dP().x_() && at.equals($$0)) {
         this.gs();
         bta $$1 = this.ar();
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
      bta $$0 = this.ar();
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

      if ($$0 != bta.p && this.c.c()) {
         this.d.a(this.ai);
         this.c.a();
      }

      this.ck = this.ck == 0 ? this.ah.a(1, 80) : this.ck - 1;
      if (this.ck == 0) {
         this.gp();
      }

      super.l();
   }

   public cjy u() {
      this.cj = 0;
      return this;
   }

   public void y() {
      if (++this.cj <= 5) {
         drb $$0 = !this.dq().i() ? this.dq() : this.bp();
         euk $$1 = this.ds();
         euk $$2 = this.dn().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dP().a(new kp(ky.b, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bR()) {
         euk $$1 = this.cK().f();
         euk $$2 = new euk($$1.c, this.dn().d, $$1.e);
         drb $$3 = !this.dq().i() ? this.dq() : this.bp();
         if ($$3.l() != dke.a) {
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
      this.dP().a(this, avh.cP, this.de(), $$1, $$0);
   }

   @Override
   public cmp a(cmo $$0) {
      return $$0.ak() == bsa.n ? cmp.a : cl;
   }

   @Override
   public avi de() {
      return avi.f;
   }

   @Override
   protected avg o_() {
      return avh.cN;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.cO;
   }

   @Override
   protected avg v() {
      return this.aE() ? avh.cH : avh.cI;
   }

   public Optional<bso> gq() {
      return this.dS().c(cbs.x).map(bqn::d).filter($$0 -> $$0 instanceof bso).map($$0 -> (bso)$$0);
   }

   public boolean j(euk $$0) {
      euk $$1 = this.dp().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Y() {
      this.dP().af().a("breezeBrain");
      this.dS().a((aqm)this.dP(), this);
      this.dP().af().b("breezeActivityUpdate");
      cjz.a(this);
      this.dP().af().c();
      super.Y();
   }

   @Override
   protected void X() {
      super.X();
      aga.a((bso)this);
      aga.a(this);
   }

   @Override
   public boolean a(bsa<?> $$0) {
      return $$0 == bsa.by || $$0 == bsa.af;
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
   public boolean b(bqn $$0) {
      return $$0.a(avy.b) || $$0.d() instanceof cjy || super.b($$0);
   }

   @Override
   public double di() {
      return (double)this.cL();
   }

   @Override
   public boolean a(float $$0, float $$1, bqn $$2) {
      if ($$0 > 3.0F) {
         this.a(avh.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bru.b bb() {
      return bru.b.c;
   }
}
