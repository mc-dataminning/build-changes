import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpa extends cod {
   private static final int bI = 20;
   private static final int bJ = 1;
   private static final int bK = 20;
   private static final int bL = 3;
   private static final int bM = 5;
   private static final int bN = 10;
   private static final float bO = 3.0F;
   private static final int bP = 1;
   private static final int bQ = 80;
   public bvw a = new bvw();
   public bvw b = new bvw();
   public bvw c = new bvw();
   public bvw d = new bvw();
   public bvw bG = new bvw();
   public bvw bH = new bvw();
   private int bR = 0;
   private int bS = 0;
   private static final cry bT = ($$0, $$1, $$2) -> {
      $$1.dV().a(null, $$1, awn.cF, $$1.dm(), 1.0F, 1.0F);
      cry.b.deflect($$0, $$1, $$2);
   };

   public static byj.a j() {
      return bxg.E().a(byk.v, 0.63F).a(byk.s, 30.0).a(byk.m, 24.0).a(byk.c, 3.0);
   }

   public cpa(bwo<? extends cod> $$0, dja $$1) {
      super($$0, $$1);
      this.a(exf.z, -1.0F);
      this.a(exf.o, -1.0F);
      this.by = 10;
   }

   @Override
   protected bye<?> a(Dynamic<?> $$0) {
      return cpb.a(this, this.ed().a($$0));
   }

   @Override
   public bye<cpa> ec() {
      return (bye<cpa>)super.ec();
   }

   @Override
   protected bye.b<cpa> ed() {
      return bye.a(cpb.f, cpb.e);
   }

   @Override
   public void a(akj<?> $$0) {
      if (this.dV().w_() && aq.equals($$0)) {
         this.gr();
         bxq $$1 = this.aw();
         switch ($$1) {
            case q:
               this.bG.b(this.af);
               break;
            case r:
               this.bH.b(this.af);
               break;
            case p:
               this.b.b(this.af);
         }
      }

      super.a($$0);
   }

   private void gr() {
      this.bG.a();
      this.a.a();
      this.bH.a();
      this.d.a();
   }

   @Override
   public void h() {
      bxq $$0 = this.aw();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.m().b(1 + this.dY().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.d.b(this.af);
            this.n();
      }

      this.a.b(this.af);
      if ($$0 != bxq.p && this.b.b()) {
         this.c.a(this.af);
         this.b.a();
      }

      this.bS = this.bS == 0 ? this.ae.a(1, 80) : this.bS - 1;
      if (this.bS == 0) {
         this.q();
      }

      super.h();
   }

   public cpa m() {
      this.bR = 0;
      return this;
   }

   public void n() {
      if (++this.bR <= 5) {
         eah $$0 = !this.dw().l() ? this.dw() : this.bt();
         feq $$1 = this.dy();
         feq $$2 = this.dt().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dV().a(new lp(lx.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bZ()) {
         feq $$1 = this.cR().f();
         feq $$2 = new feq($$1.d, this.dt().e, $$1.f);
         eah $$3 = !this.dw().l() ? this.dw() : this.bt();
         if ($$3.o() != dss.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dV().a(new lp(lx.b, $$3), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void T() {
      if (this.f() == null || !this.aJ()) {
         this.dV().a(this, this.u(), this.dm(), 1.0F, 1.0F);
      }
   }

   @Override
   public void q() {
      float $$0 = 0.7F + 0.4F * this.ae.i();
      float $$1 = 0.8F + 0.2F * this.ae.i();
      this.dV().a(this, awn.cP, this.dm(), $$1, $$0);
   }

   @Override
   public cry a(crx $$0) {
      if ($$0.aq() != bwo.s && $$0.aq() != bwo.bH) {
         return this.aq().a(axf.r) ? bT : cry.a;
      } else {
         return cry.a;
      }
   }

   @Override
   public awo dm() {
      return awo.f;
   }

   @Override
   protected awm l_() {
      return awn.cN;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.cO;
   }

   @Override
   protected awm u() {
      return this.aJ() ? awn.cH : awn.cI;
   }

   public Optional<bxe> t() {
      return this.ec().c(cgg.y).map(buu::d).filter($$0 -> $$0 instanceof bxe).map($$0 -> (bxe)$$0);
   }

   public boolean l(feq $$0) {
      feq $$1 = this.dv().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void a(arq $$0) {
      bqo $$1 = bqn.a();
      $$1.a("breezeBrain");
      this.ec().a($$0, this);
      $$1.b("breezeActivityUpdate");
      cpb.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a((bxe)this);
      agm.a(this);
   }

   @Override
   public boolean a(bwo<?> $$0) {
      return $$0 == bwo.bS || $$0 == bwo.ap;
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
      return this.dC() + (double)(this.dr() / 2.0F) + 0.3F;
   }

   @Override
   public boolean a(arq $$0, buu $$1) {
      return $$1.d() instanceof cpa || super.a($$0, $$1);
   }

   @Override
   public double dp() {
      return (double)this.cS();
   }

   @Override
   public boolean a(double $$0, float $$1, buu $$2) {
      if ($$0 > 3.0) {
         this.a(awn.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bwf.d bg() {
      return bwf.d.c;
   }

   @Nullable
   @Override
   public bxe f() {
      return this.Q();
   }
}
