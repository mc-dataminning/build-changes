import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cky extends ckc {
   private static final int ca = 20;
   private static final int cb = 1;
   private static final int cc = 20;
   private static final int cd = 3;
   private static final int ce = 5;
   private static final int cf = 10;
   private static final float cg = 3.0F;
   private static final int ch = 1;
   private static final int ci = 80;
   public bso b = new bso();
   public bso c = new bso();
   public bso d = new bso();
   public bso e = new bso();
   public bso bY = new bso();
   public bso bZ = new bso();
   private int cj = 0;
   private int ck = 0;
   private static final cnp cl = ($$0, $$1, $$2) -> {
      $$1.dP().a($$1, avz.cF, $$1.de(), 1.0F, 1.0F);
      cnp.b.deflect($$0, $$1, $$2);
   };

   public static buv.a s() {
      return btq.A().a(buw.r, 0.63F).a(buw.q, 30.0).a(buw.k, 24.0).a(buw.c, 3.0);
   }

   public cky(bsz<? extends ckc> $$0, dbx $$1) {
      super($$0, $$1);
      this.a(eol.z, -1.0F);
      this.a(eol.o, -1.0F);
      this.bN = 10;
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return ckz.a(this.dT().a($$0));
   }

   @Override
   public buq<cky> dS() {
      return (buq<cky>)super.dS();
   }

   @Override
   protected buq.b<cky> dT() {
      return buq.a(ckz.f, ckz.e);
   }

   @Override
   public void a(akj<?> $$0) {
      if (this.dP().x_() && at.equals($$0)) {
         this.gt();
         bua $$1 = this.ar();
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
      bua $$0 = this.ar();
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

      if ($$0 != bua.p && this.c.c()) {
         this.d.a(this.ai);
         this.c.a();
      }

      this.ck = this.ck == 0 ? this.ah.a(1, 80) : this.ck - 1;
      if (this.ck == 0) {
         this.gq();
      }

      super.l();
   }

   public cky u() {
      this.cj = 0;
      return this;
   }

   public void y() {
      if (++this.cj <= 5) {
         dsb $$0 = !this.dq().i() ? this.dq() : this.bp();
         evq $$1 = this.ds();
         evq $$2 = this.dn().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dP().a(new la(li.b, $$0), $$2.c, $$2.d, $$2.e, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bR()) {
         evq $$1 = this.cK().f();
         evq $$2 = new evq($$1.c, this.dn().d, $$1.e);
         dsb $$3 = !this.dq().i() ? this.dq() : this.bp();
         if ($$3.l() != dle.a) {
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
      this.dP().a(this, avz.cP, this.de(), $$1, $$0);
   }

   @Override
   public cnp a(cno $$0) {
      return $$0.ak() != bsz.n && $$0.ak() != bsz.bn ? cl : cnp.a;
   }

   @Override
   public awa de() {
      return awa.f;
   }

   @Override
   protected avy o_() {
      return avz.cN;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.cO;
   }

   @Override
   protected avy v() {
      return this.aE() ? avz.cH : avz.cI;
   }

   public Optional<bto> gr() {
      return this.dS().c(ccs.x).map(brm::d).filter($$0 -> $$0 instanceof bto).map($$0 -> (bto)$$0);
   }

   public boolean k(evq $$0) {
      evq $$1 = this.dp().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("breezeBrain");
      this.dS().a((are)this.dP(), this);
      this.dP().ag().b("breezeActivityUpdate");
      ckz.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      ags.a((bto)this);
      ags.a(this);
   }

   @Override
   public boolean a(bsz<?> $$0) {
      return $$0 == bsz.by || $$0 == bsz.af;
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
   public boolean b(brm $$0) {
      return $$0.a(awq.b) || $$0.d() instanceof cky || super.b($$0);
   }

   @Override
   public double di() {
      return (double)this.cL();
   }

   @Override
   public boolean a(float $$0, float $$1, brm $$2) {
      if ($$0 > 3.0F) {
         this.a(avz.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bst.b bb() {
      return bst.b.c;
   }

   @Nullable
   @Override
   public bto p() {
      return this.N();
   }
}
