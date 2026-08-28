import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class coq extends cnt {
   private static final int bH = 20;
   private static final int bI = 1;
   private static final int bJ = 20;
   private static final int bK = 3;
   private static final int bL = 5;
   private static final int bM = 10;
   private static final float bN = 3.0F;
   private static final int bO = 1;
   private static final int bP = 80;
   public bvr a = new bvr();
   public bvr b = new bvr();
   public bvr c = new bvr();
   public bvr d = new bvr();
   public bvr bF = new bvr();
   public bvr bG = new bvr();
   private int bQ = 0;
   private int bR = 0;
   private static final crn bS = ($$0, $$1, $$2) -> {
      $$1.dV().a(null, $$1, awl.cF, $$1.dm(), 1.0F, 1.0F);
      crn.b.deflect($$0, $$1, $$2);
   };

   public static bye.a j() {
      return bxb.E().a(byf.v, 0.63F).a(byf.s, 30.0).a(byf.m, 24.0).a(byf.c, 3.0);
   }

   public coq(bwj<? extends cnt> $$0, dip $$1) {
      super($$0, $$1);
      this.a(ewm.z, -1.0F);
      this.a(ewm.o, -1.0F);
      this.bx = 10;
   }

   @Override
   protected bxz<?> a(Dynamic<?> $$0) {
      return cor.a(this, this.ec().a($$0));
   }

   @Override
   public bxz<coq> eb() {
      return (bxz<coq>)super.eb();
   }

   @Override
   protected bxz.b<coq> ec() {
      return bxz.a(cor.f, cor.e);
   }

   @Override
   public void a(akh<?> $$0) {
      if (this.dV().w_() && aq.equals($$0)) {
         this.gq();
         bxl $$1 = this.aw();
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
      bxl $$0 = this.aw();
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
      if ($$0 != bxl.p && this.b.b()) {
         this.c.a(this.af);
         this.b.a();
      }

      this.bR = this.bR == 0 ? this.ae.a(1, 80) : this.bR - 1;
      if (this.bR == 0) {
         this.q();
      }

      super.h();
   }

   public coq m() {
      this.bQ = 0;
      return this;
   }

   public void n() {
      if (++this.bQ <= 5) {
         dzo $$0 = !this.dw().l() ? this.dw() : this.bt();
         fdw $$1 = this.dy();
         fdw $$2 = this.dt().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dV().a(new lp(lx.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bZ()) {
         fdw $$1 = this.cR().f();
         fdw $$2 = new fdw($$1.d, this.dt().e, $$1.f);
         dzo $$3 = !this.dw().l() ? this.dw() : this.bt();
         if ($$3.o() != dsf.a) {
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
      this.dV().a(this, awl.cP, this.dm(), $$1, $$0);
   }

   @Override
   public crn a(crm $$0) {
      if ($$0.aq() != bwj.s && $$0.aq() != bwj.bH) {
         return this.aq().a(axd.r) ? bS : crn.a;
      } else {
         return crn.a;
      }
   }

   @Override
   public awm dm() {
      return awm.f;
   }

   @Override
   protected awk l_() {
      return awl.cN;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.cO;
   }

   @Override
   protected awk u() {
      return this.aJ() ? awl.cH : awl.cI;
   }

   public Optional<bwz> t() {
      return this.eb().c(cgb.y).map(bup::d).filter($$0 -> $$0 instanceof bwz).map($$0 -> (bwz)$$0);
   }

   public boolean l(fdw $$0) {
      fdw $$1 = this.dv().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void a(aro $$0) {
      bqj $$1 = bqi.a();
      $$1.a("breezeBrain");
      this.eb().a($$0, this);
      $$1.b("breezeActivityUpdate");
      cor.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ab() {
      super.ab();
      agk.a((bwz)this);
      agk.a(this);
   }

   @Override
   public boolean a(bwj<?> $$0) {
      return $$0 == bwj.bS || $$0 == bwj.ap;
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
   public boolean a(aro $$0, bup $$1) {
      return $$1.d() instanceof coq || super.a($$0, $$1);
   }

   @Override
   public double dp() {
      return (double)this.cS();
   }

   @Override
   public boolean a(double $$0, float $$1, bup $$2) {
      if ($$0 > 3.0) {
         this.a(awl.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bwa.d bg() {
      return bwa.d.c;
   }

   @Nullable
   @Override
   public bwz f() {
      return this.Q();
   }
}
