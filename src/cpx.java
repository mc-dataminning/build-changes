import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpx extends cpb {
   private static final int bI = 20;
   private static final int bJ = 1;
   private static final int bK = 20;
   private static final int bL = 3;
   private static final int bM = 5;
   private static final int bN = 10;
   private static final float bO = 3.0F;
   private static final int bP = 1;
   private static final int bQ = 80;
   public bwm a = new bwm();
   public bwm b = new bwm();
   public bwm c = new bwm();
   public bwm d = new bwm();
   public bwm e = new bwm();
   public bwm f = new bwm();
   private int bR = 0;
   private int bS = 0;
   private static final csv bT = ($$0, $$1, $$2) -> {
      $$1.dV().a(null, $$1, awr.cF, $$1.dm(), 1.0F, 1.0F);
      csv.b.deflect($$0, $$1, $$2);
   };

   public static bzb.a j() {
      return bxy.E().a(bzc.v, 0.63F).a(bzc.s, 30.0).a(bzc.m, 24.0).a(bzc.c, 3.0);
   }

   public cpx(bxe<? extends cpb> $$0, djz $$1) {
      super($$0, $$1);
      this.a(eyh.z, -1.0F);
      this.a(eyh.o, -1.0F);
      this.bA = 10;
   }

   @Override
   protected byw<?> a(Dynamic<?> $$0) {
      return cpy.a(this, this.ed().a($$0));
   }

   @Override
   public byw<cpx> ec() {
      return (byw<cpx>)super.ec();
   }

   @Override
   protected byw.b<cpx> ed() {
      return byw.a(cpy.f, cpy.e);
   }

   @Override
   public void a(akn<?> $$0) {
      if (this.dV().A_() && aq.equals($$0)) {
         this.gu();
         byi $$1 = this.at();
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

   private void gu() {
      this.e.a();
      this.a.a();
      this.f.a();
      this.d.a();
   }

   @Override
   public void h() {
      byi $$0 = this.at();
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
      if ($$0 != byi.p && this.b.b()) {
         this.c.a(this.af);
         this.b.a();
      }

      this.bS = this.bS == 0 ? this.ae.a(1, 80) : this.bS - 1;
      if (this.bS == 0) {
         this.q();
      }

      super.h();
   }

   public cpx m() {
      this.bR = 0;
      return this;
   }

   public void n() {
      if (++this.bR <= 5) {
         ebg $$0 = !this.dw().l() ? this.dw() : this.bs();
         ffs $$1 = this.dy();
         ffs $$2 = this.dt().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dV().a(new lr(lz.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bY()) {
         ffs $$1 = this.cR().f();
         ffs $$2 = new ffs($$1.d, this.dt().e, $$1.f);
         ebg $$3 = !this.dw().l() ? this.dw() : this.bs();
         if ($$3.o() != dtr.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dV().a(new lr(lz.b, $$3), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void T() {
      if (this.f() == null || !this.aH()) {
         this.dV().a(this, this.u(), this.dm(), 1.0F, 1.0F);
      }
   }

   @Override
   public void q() {
      float $$0 = 0.7F + 0.4F * this.ae.i();
      float $$1 = 0.8F + 0.2F * this.ae.i();
      this.dV().a(this, awr.cP, this.dm(), $$1, $$0);
   }

   @Override
   public csv a(csu $$0) {
      if ($$0.an() != bxe.t && $$0.an() != bxe.bI) {
         return this.an().a(axj.r) ? bT : csv.a;
      } else {
         return csv.a;
      }
   }

   @Override
   public aws dm() {
      return aws.f;
   }

   @Override
   protected awq l_() {
      return awr.cN;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.cO;
   }

   @Override
   protected awq u() {
      return this.aH() ? awr.cH : awr.cI;
   }

   public Optional<bxw> t() {
      return this.ec().c(cgy.y).map(bvk::d).filter($$0 -> $$0 instanceof bxw).map($$0 -> (bxw)$$0);
   }

   public boolean l(ffs $$0) {
      ffs $$1 = this.dv().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void a(aru $$0) {
      brd $$1 = brc.a();
      $$1.a("breezeBrain");
      this.ec().a($$0, this);
      $$1.b("breezeActivityUpdate");
      cpy.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ac() {
      super.ac();
      agq.a((bxw)this);
      agq.a(this);
   }

   @Override
   public boolean a(bxe<?> $$0) {
      return $$0 == bxe.bT || $$0 == bxe.aq;
   }

   @Override
   public int af() {
      return 30;
   }

   @Override
   public int ah() {
      return 25;
   }

   public double x() {
      return this.dC() + (double)(this.dr() / 2.0F) + 0.3F;
   }

   @Override
   public boolean a(aru $$0, bvk $$1) {
      return $$1.d() instanceof cpx || super.a($$0, $$1);
   }

   @Override
   public double dp() {
      return (double)this.cS();
   }

   @Override
   public boolean a(double $$0, float $$1, bvk $$2) {
      if ($$0 > 3.0) {
         this.a(awr.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bwv.c bf() {
      return bwv.c.c;
   }

   @Nullable
   @Override
   public bxw f() {
      return this.Q();
   }
}
