import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cqg extends cpk {
   private static final int bI = 20;
   private static final int bJ = 1;
   private static final int bK = 20;
   private static final int bL = 3;
   private static final int bM = 5;
   private static final int bN = 10;
   private static final float bO = 3.0F;
   private static final int bP = 1;
   private static final int bQ = 80;
   public bwv a = new bwv();
   public bwv b = new bwv();
   public bwv c = new bwv();
   public bwv d = new bwv();
   public bwv e = new bwv();
   public bwv f = new bwv();
   private int bR = 0;
   private int bS = 0;
   private static final cte bT = ($$0, $$1, $$2) -> {
      $$1.dV().a(null, $$1, awy.cF, $$1.dm(), 1.0F, 1.0F);
      cte.b.deflect($$0, $$1, $$2);
   };

   public static bzk.a m() {
      return byh.D().a(bzl.v, 0.63F).a(bzl.s, 30.0).a(bzl.m, 24.0).a(bzl.c, 3.0);
   }

   public cqg(bxn<? extends cpk> $$0, dkj $$1) {
      super($$0, $$1);
      this.a(eyr.z, -1.0F);
      this.a(eyr.o, -1.0F);
      this.bA = 10;
   }

   @Override
   protected bzf<?> a(Dynamic<?> $$0) {
      return cqh.a(this, this.ed().a($$0));
   }

   @Override
   public bzf<cqg> ec() {
      return (bzf<cqg>)super.ec();
   }

   @Override
   protected bzf.b<cqg> ed() {
      return bzf.a(cqh.f, cqh.e);
   }

   @Override
   public void a(aku<?> $$0) {
      if (this.dV().A_() && aq.equals($$0)) {
         this.gx();
         byr $$1 = this.at();
         switch ($$1) {
            case q:
               this.e.b(this.af);
               break;
            case r:
               this.f.b(this.af);
               break;
            case p:
               this.b.b(this.af);
         }
      }

      super.a($$0);
   }

   private void gx() {
      this.e.a();
      this.a.a();
      this.f.a();
      this.d.a();
   }

   @Override
   public void g() {
      byr $$0 = this.at();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.p().b(1 + this.dY().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.d.b(this.af);
            this.u();
      }

      this.a.b(this.af);
      if ($$0 != byr.p && this.b.b()) {
         this.c.a(this.af);
         this.b.a();
      }

      this.bS = this.bS == 0 ? this.ae.a(1, 80) : this.bS - 1;
      if (this.bS == 0) {
         this.gu();
      }

      super.g();
   }

   public cqg p() {
      this.bR = 0;
      return this;
   }

   public void u() {
      if (++this.bR <= 5) {
         ebq $$0 = !this.dw().l() ? this.dw() : this.bs();
         fgc $$1 = this.dy();
         fgc $$2 = this.dt().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dV().a(new lr(lz.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bY()) {
         fgc $$1 = this.cR().f();
         fgc $$2 = new fgc($$1.d, this.dt().e, $$1.f);
         ebq $$3 = !this.dw().l() ? this.dw() : this.bs();
         if ($$3.o() != dub.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dV().a(new lr(lz.b, $$3), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void S() {
      if (this.e() == null || !this.aH()) {
         this.dV().a(this, this.s(), this.dm(), 1.0F, 1.0F);
      }
   }

   public void gu() {
      float $$0 = 0.7F + 0.4F * this.ae.i();
      float $$1 = 0.8F + 0.2F * this.ae.i();
      this.dV().a(this, awy.cP, this.dm(), $$1, $$0);
   }

   @Override
   public cte a(ctd $$0) {
      if ($$0.an() != bxn.t && $$0.an() != bxn.bI) {
         return this.an().a(axq.r) ? bT : cte.a;
      } else {
         return cte.a;
      }
   }

   @Override
   public awz dm() {
      return awz.f;
   }

   @Override
   protected awx j_() {
      return awy.cN;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.cO;
   }

   @Override
   protected awx s() {
      return this.aH() ? awy.cH : awy.cI;
   }

   public Optional<byf> gv() {
      return this.ec().c(chh.y).map(bvt::d).filter($$0 -> $$0 instanceof byf).map($$0 -> (byf)$$0);
   }

   public boolean l(fgc $$0) {
      fgc $$1 = this.dv().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void a(asb $$0) {
      brm $$1 = brl.a();
      $$1.a("breezeBrain");
      this.ec().a($$0, this);
      $$1.b("breezeActivityUpdate");
      cqh.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ab() {
      super.ab();
      agx.a((byf)this);
      agx.a(this);
   }

   @Override
   public boolean a(bxn<?> $$0) {
      return $$0 == bxn.bT || $$0 == bxn.aq;
   }

   @Override
   public int ae() {
      return 30;
   }

   @Override
   public int ag() {
      return 25;
   }

   public double gw() {
      return this.dC() + (double)(this.dr() / 2.0F) + 0.3F;
   }

   @Override
   public boolean a(asb $$0, bvt $$1) {
      return $$1.d() instanceof cqg || super.a($$0, $$1);
   }

   @Override
   public double dp() {
      return (double)this.cS();
   }

   @Override
   public boolean a(double $$0, float $$1, bvt $$2) {
      if ($$0 > 3.0) {
         this.a(awy.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bxe.c bf() {
      return bxe.c.c;
   }

   @Nullable
   @Override
   public byf e() {
      return this.P();
   }
}
