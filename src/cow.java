import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cow extends cnz {
   private static final int bH = 20;
   private static final int bI = 1;
   private static final int bJ = 20;
   private static final int bK = 3;
   private static final int bL = 5;
   private static final int bM = 10;
   private static final float bN = 3.0F;
   private static final int bO = 1;
   private static final int bP = 80;
   public bvu a = new bvu();
   public bvu b = new bvu();
   public bvu c = new bvu();
   public bvu d = new bvu();
   public bvu bF = new bvu();
   public bvu bG = new bvu();
   private int bQ = 0;
   private int bR = 0;
   private static final crt bS = ($$0, $$1, $$2) -> {
      $$1.dV().a(null, $$1, awn.cF, $$1.dm(), 1.0F, 1.0F);
      crt.b.deflect($$0, $$1, $$2);
   };

   public static byh.a j() {
      return bxe.E().a(byi.v, 0.63F).a(byi.s, 30.0).a(byi.m, 24.0).a(byi.c, 3.0);
   }

   public cow(bwm<? extends cnz> $$0, div $$1) {
      super($$0, $$1);
      this.a(ewx.z, -1.0F);
      this.a(ewx.o, -1.0F);
      this.bx = 10;
   }

   @Override
   protected byc<?> a(Dynamic<?> $$0) {
      return cox.a(this, this.ec().a($$0));
   }

   @Override
   public byc<cow> eb() {
      return (byc<cow>)super.eb();
   }

   @Override
   protected byc.b<cow> ec() {
      return byc.a(cox.f, cox.e);
   }

   @Override
   public void a(akj<?> $$0) {
      if (this.dV().w_() && aq.equals($$0)) {
         this.gq();
         bxo $$1 = this.aw();
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

   private void gq() {
      this.bF.a();
      this.a.a();
      this.bG.a();
      this.d.a();
   }

   @Override
   public void h() {
      bxo $$0 = this.aw();
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
      if ($$0 != bxo.p && this.b.b()) {
         this.c.a(this.af);
         this.b.a();
      }

      this.bR = this.bR == 0 ? this.ae.a(1, 80) : this.bR - 1;
      if (this.bR == 0) {
         this.q();
      }

      super.h();
   }

   public cow m() {
      this.bQ = 0;
      return this;
   }

   public void n() {
      if (++this.bQ <= 5) {
         dzz $$0 = !this.dw().l() ? this.dw() : this.bt();
         fei $$1 = this.dy();
         fei $$2 = this.dt().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dV().a(new lp(lx.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bZ()) {
         fei $$1 = this.cR().f();
         fei $$2 = new fei($$1.d, this.dt().e, $$1.f);
         dzz $$3 = !this.dw().l() ? this.dw() : this.bt();
         if ($$3.o() != dsm.a) {
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
   public crt a(crs $$0) {
      if ($$0.aq() != bwm.s && $$0.aq() != bwm.bH) {
         return this.aq().a(axf.r) ? bS : crt.a;
      } else {
         return crt.a;
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
   protected awm e(bus $$0) {
      return awn.cO;
   }

   @Override
   protected awm u() {
      return this.aJ() ? awn.cH : awn.cI;
   }

   public Optional<bxc> t() {
      return this.eb().c(cge.y).map(bus::d).filter($$0 -> $$0 instanceof bxc).map($$0 -> (bxc)$$0);
   }

   public boolean l(fei $$0) {
      fei $$1 = this.dv().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void a(arq $$0) {
      bqm $$1 = bql.a();
      $$1.a("breezeBrain");
      this.eb().a($$0, this);
      $$1.b("breezeActivityUpdate");
      cox.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a((bxc)this);
      agm.a(this);
   }

   @Override
   public boolean a(bwm<?> $$0) {
      return $$0 == bwm.bS || $$0 == bwm.ap;
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
   public boolean a(arq $$0, bus $$1) {
      return $$1.d() instanceof cow || super.a($$0, $$1);
   }

   @Override
   public double dp() {
      return (double)this.cS();
   }

   @Override
   public boolean a(double $$0, float $$1, bus $$2) {
      if ($$0 > 3.0) {
         this.a(awn.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bwd.d bg() {
      return bwd.d.c;
   }

   @Nullable
   @Override
   public bxc f() {
      return this.Q();
   }
}
