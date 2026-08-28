import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cla extends cke {
   private static final int ca = 20;
   private static final int cb = 1;
   private static final int cc = 20;
   private static final int cd = 3;
   private static final int ce = 5;
   private static final int cf = 10;
   private static final float cg = 3.0F;
   private static final int ch = 1;
   private static final int ci = 80;
   public bsq b = new bsq();
   public bsq c = new bsq();
   public bsq d = new bsq();
   public bsq e = new bsq();
   public bsq bY = new bsq();
   public bsq bZ = new bsq();
   private int cj = 0;
   private int ck = 0;
   private static final cnr cl = ($$0, $$1, $$2) -> {
      $$1.dP().a($$1, awa.cF, $$1.de(), 1.0F, 1.0F);
      cnr.b.deflect($$0, $$1, $$2);
   };

   public static bux.a s() {
      return bts.A().a(buy.r, 0.63F).a(buy.q, 30.0).a(buy.k, 24.0).a(buy.c, 3.0);
   }

   public cla(btb<? extends cke> $$0, dbz $$1) {
      super($$0, $$1);
      this.a(eon.z, -1.0F);
      this.a(eon.o, -1.0F);
      this.bN = 10;
   }

   @Override
   protected bus<?> a(Dynamic<?> $$0) {
      return clb.a(this.dT().a($$0));
   }

   @Override
   public bus<cla> dS() {
      return (bus<cla>)super.dS();
   }

   @Override
   protected bus.b<cla> dT() {
      return bus.a(clb.f, clb.e);
   }

   @Override
   public void a(akk<?> $$0) {
      if (this.dP().x_() && at.equals($$0)) {
         this.gt();
         buc $$1 = this.ar();
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

   private void gt() {
      this.bY.a();
      this.b.a();
      this.bZ.a();
      this.e.a();
   }

   @Override
   public void l() {
      buc $$0 = this.ar();
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

      if ($$0 != buc.p && this.c.c()) {
         this.d.a(this.ai);
         this.c.a();
      }

      this.ck = this.ck == 0 ? this.ah.a(1, 80) : this.ck - 1;
      if (this.ck == 0) {
         this.gq();
      }

      super.l();
   }

   public cla u() {
      this.cj = 0;
      return this;
   }

   public void y() {
      if (++this.cj <= 5) {
         dsd $$0 = !this.dq().i() ? this.dq() : this.bp();
         evs $$1 = this.ds();
         evs $$2 = this.dn().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dP().a(new la(li.b, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bR()) {
         evs $$1 = this.cK().f();
         evs $$2 = new evs($$1.c, this.dn().d, $$1.e);
         dsd $$3 = !this.dq().i() ? this.dq() : this.bp();
         if ($$3.l() != dlg.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dP().a(new la(li.b, $$3), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
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

   public void gq() {
      float $$0 = 0.7F + 0.4F * this.ah.i();
      float $$1 = 0.8F + 0.2F * this.ah.i();
      this.dP().a(this, awa.cP, this.de(), $$1, $$0);
   }

   @Override
   public cnr a(cnq $$0) {
      return $$0.ak() != btb.n && $$0.ak() != btb.bn ? cl : cnr.a;
   }

   @Override
   public awb de() {
      return awb.f;
   }

   @Override
   protected avz o_() {
      return awa.cN;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.cO;
   }

   @Override
   protected avz v() {
      return this.aE() ? awa.cH : awa.cI;
   }

   public Optional<btq> gr() {
      return this.dS().c(ccu.x).map(bro::d).filter($$0 -> $$0 instanceof btq).map($$0 -> (btq)$$0);
   }

   public boolean k(evs $$0) {
      evs $$1 = this.dp().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("breezeBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().b("breezeActivityUpdate");
      clb.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a((btq)this);
      agt.a(this);
   }

   @Override
   public boolean a(btb<?> $$0) {
      return $$0 == btb.by || $$0 == btb.af;
   }

   @Override
   public int ab() {
      return 30;
   }

   @Override
   public int ae() {
      return 25;
   }

   public double gs() {
      return this.dy() - 0.4;
   }

   @Override
   public boolean b(bro $$0) {
      return $$0.a(awr.b) || $$0.d() instanceof cla || super.b($$0);
   }

   @Override
   public double di() {
      return (double)this.cL();
   }

   @Override
   public boolean a(float $$0, float $$1, bro $$2) {
      if ($$0 > 3.0F) {
         this.a(awa.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bsv.b bb() {
      return bsv.b.c;
   }

   @Nullable
   @Override
   public btq p() {
      return this.N();
   }
}
