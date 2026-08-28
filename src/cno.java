import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cno extends cms {
   private static final int bH = 20;
   private static final int bI = 1;
   private static final int bJ = 20;
   private static final int bK = 3;
   private static final int bL = 5;
   private static final int bM = 10;
   private static final float bN = 3.0F;
   private static final int bO = 1;
   private static final int bP = 80;
   public bur a = new bur();
   public bur b = new bur();
   public bur c = new bur();
   public bur d = new bur();
   public bur bF = new bur();
   public bur bG = new bur();
   private int bQ = 0;
   private int bR = 0;
   private static final cql bS = ($$0, $$1, $$2) -> {
      $$1.dU().a(null, $$1, awa.cF, $$1.dl(), 1.0F, 1.0F);
      cql.b.deflect($$0, $$1, $$2);
   };

   public static bxf.a j() {
      return bwa.E().a(bxg.v, 0.63F).a(bxg.s, 30.0).a(bxg.m, 24.0).a(bxg.c, 3.0);
   }

   public cno(bvi<? extends cms> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(eun.z, -1.0F);
      this.a(eun.o, -1.0F);
      this.bx = 10;
   }

   @Override
   protected bxa<?> a(Dynamic<?> $$0) {
      return cnp.a(this, this.eb().a($$0));
   }

   @Override
   public bxa<cno> ea() {
      return (bxa<cno>)super.ea();
   }

   @Override
   protected bxa.b<cno> eb() {
      return bxa.a(cnp.f, cnp.e);
   }

   @Override
   public void a(ajx<?> $$0) {
      if (this.dU().w_() && aq.equals($$0)) {
         this.gs();
         bwk $$1 = this.aw();
         switch ($$1) {
            case q:
               this.bF.b(this.af);
               break;
            case r:
               this.bG.b(this.af);
               break;
            case p:
               this.b.b(this.af);
         }
      }

      super.a($$0);
   }

   private void gs() {
      this.bF.a();
      this.a.a();
      this.bG.a();
      this.d.a();
   }

   @Override
   public void h() {
      bwk $$0 = this.aw();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.m().b(1 + this.dX().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.d.b(this.af);
            this.n();
      }

      this.a.b(this.af);
      if ($$0 != bwk.p && this.b.b()) {
         this.c.a(this.af);
         this.b.a();
      }

      this.bR = this.bR == 0 ? this.ae.a(1, 80) : this.bR - 1;
      if (this.bR == 0) {
         this.q();
      }

      super.h();
   }

   public cno m() {
      this.bQ = 0;
      return this;
   }

   public void n() {
      if (++this.bQ <= 5) {
         dxq $$0 = !this.dv().l() ? this.dv() : this.bs();
         fbx $$1 = this.dx();
         fbx $$2 = this.ds().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dU().a(new ll(lt.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bY()) {
         fbx $$1 = this.cQ().f();
         fbx $$2 = new fbx($$1.d, this.ds().e, $$1.f);
         dxq $$3 = !this.dv().l() ? this.dv() : this.bs();
         if ($$3.o() != dqp.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dU().a(new ll(lt.b, $$3), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void T() {
      if (this.f() == null || !this.aJ()) {
         this.dU().a(this, this.u(), this.dl(), 1.0F, 1.0F);
      }
   }

   @Override
   public void q() {
      float $$0 = 0.7F + 0.4F * this.ae.i();
      float $$1 = 0.8F + 0.2F * this.ae.i();
      this.dU().a(this, awa.cP, this.dl(), $$1, $$0);
   }

   @Override
   public cql a(cqk $$0) {
      if ($$0.aq() != bvi.s && $$0.aq() != bvi.bG) {
         return this.aq().a(awt.r) ? bS : cql.a;
      } else {
         return cql.a;
      }
   }

   @Override
   public awb dl() {
      return awb.f;
   }

   @Override
   protected avz l_() {
      return awa.cN;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.cO;
   }

   @Override
   protected avz u() {
      return this.aJ() ? awa.cH : awa.cI;
   }

   public Optional<bvy> t() {
      return this.ea().c(cfc.x).map(btp::d).filter($$0 -> $$0 instanceof bvy).map($$0 -> (bvy)$$0);
   }

   public boolean l(fbx $$0) {
      fbx $$1 = this.du().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void a(ard $$0) {
      bpj $$1 = bpi.a();
      $$1.a("breezeBrain");
      this.ea().a($$0, this);
      $$1.b("breezeActivityUpdate");
      cnp.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ab() {
      super.ab();
      agc.a((bvy)this);
      agc.a(this);
   }

   @Override
   public boolean a(bvi<?> $$0) {
      return $$0 == bvi.bR || $$0 == bvi.ap;
   }

   @Override
   public int ad() {
      return 30;
   }

   @Override
   public int ag() {
      return 25;
   }

   public double x() {
      return this.dB() + (double)(this.dq() / 2.0F) + 0.3F;
   }

   @Override
   public boolean a(ard $$0, btp $$1) {
      return $$1.d() instanceof cno || super.a($$0, $$1);
   }

   @Override
   public double do() {
      return (double)this.cR();
   }

   @Override
   public boolean a(float $$0, float $$1, btp $$2) {
      if ($$0 > 3.0F) {
         this.a(awa.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bva.c bg() {
      return bva.c.c;
   }

   @Nullable
   @Override
   public bvy f() {
      return this.Q();
   }
}
