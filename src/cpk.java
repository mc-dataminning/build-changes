import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpk extends coo {
   private static final int bI = 20;
   private static final int bJ = 1;
   private static final int bK = 20;
   private static final int bL = 3;
   private static final int bM = 5;
   private static final int bN = 10;
   private static final float bO = 3.0F;
   private static final int bP = 1;
   private static final int bQ = 80;
   public bvz a = new bvz();
   public bvz b = new bvz();
   public bvz c = new bvz();
   public bvz d = new bvz();
   public bvz bG = new bvz();
   public bvz bH = new bvz();
   private int bR = 0;
   private int bS = 0;
   private static final csi bT = ($$0, $$1, $$2) -> {
      $$1.dU().a(null, $$1, awn.cF, $$1.dl(), 1.0F, 1.0F);
      csi.b.deflect($$0, $$1, $$2);
   };

   public static byo.a j() {
      return bxl.E().a(byp.v, 0.63F).a(byp.s, 30.0).a(byp.m, 24.0).a(byp.c, 3.0);
   }

   public cpk(bwr<? extends coo> $$0, djm $$1) {
      super($$0, $$1);
      this.a(exr.z, -1.0F);
      this.a(exr.o, -1.0F);
      this.by = 10;
   }

   @Override
   protected byj<?> a(Dynamic<?> $$0) {
      return cpl.a(this, this.ec().a($$0));
   }

   @Override
   public byj<cpk> eb() {
      return (byj<cpk>)super.eb();
   }

   @Override
   protected byj.b<cpk> ec() {
      return byj.a(cpl.f, cpl.e);
   }

   @Override
   public void a(akj<?> $$0) {
      if (this.dU().w_() && aq.equals($$0)) {
         this.gt();
         bxv $$1 = this.at();
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

   private void gt() {
      this.bG.a();
      this.a.a();
      this.bH.a();
      this.d.a();
   }

   @Override
   public void h() {
      bxv $$0 = this.at();
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
      if ($$0 != bxv.p && this.b.b()) {
         this.c.a(this.af);
         this.b.a();
      }

      this.bS = this.bS == 0 ? this.ae.a(1, 80) : this.bS - 1;
      if (this.bS == 0) {
         this.q();
      }

      super.h();
   }

   public cpk m() {
      this.bR = 0;
      return this;
   }

   public void n() {
      if (++this.bR <= 5) {
         eat $$0 = !this.dv().l() ? this.dv() : this.br();
         ffc $$1 = this.dx();
         ffc $$2 = this.ds().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dU().a(new lq(ly.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bX()) {
         ffc $$1 = this.cQ().f();
         ffc $$2 = new ffc($$1.d, this.ds().e, $$1.f);
         eat $$3 = !this.dv().l() ? this.dv() : this.br();
         if ($$3.o() != dte.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dU().a(new lq(ly.b, $$3), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void T() {
      if (this.f() == null || !this.aH()) {
         this.dU().a(this, this.u(), this.dl(), 1.0F, 1.0F);
      }
   }

   @Override
   public void q() {
      float $$0 = 0.7F + 0.4F * this.ae.i();
      float $$1 = 0.8F + 0.2F * this.ae.i();
      this.dU().a(this, awn.cP, this.dl(), $$1, $$0);
   }

   @Override
   public csi a(csh $$0) {
      if ($$0.an() != bwr.s && $$0.an() != bwr.bH) {
         return this.an().a(axf.r) ? bT : csi.a;
      } else {
         return csi.a;
      }
   }

   @Override
   public awo dl() {
      return awo.f;
   }

   @Override
   protected awm l_() {
      return awn.cN;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.cO;
   }

   @Override
   protected awm u() {
      return this.aH() ? awn.cH : awn.cI;
   }

   public Optional<bxj> t() {
      return this.eb().c(cgl.y).map(bux::d).filter($$0 -> $$0 instanceof bxj).map($$0 -> (bxj)$$0);
   }

   public boolean l(ffc $$0) {
      ffc $$1 = this.du().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void a(arq $$0) {
      bqq $$1 = bqp.a();
      $$1.a("breezeBrain");
      this.eb().a($$0, this);
      $$1.b("breezeActivityUpdate");
      cpl.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ac() {
      super.ac();
      agm.a((bxj)this);
      agm.a(this);
   }

   @Override
   public boolean a(bwr<?> $$0) {
      return $$0 == bwr.bS || $$0 == bwr.ap;
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
      return this.dB() + (double)(this.dq() / 2.0F) + 0.3F;
   }

   @Override
   public boolean a(arq $$0, bux $$1) {
      return $$1.d() instanceof cpk || super.a($$0, $$1);
   }

   @Override
   public double do() {
      return (double)this.cR();
   }

   @Override
   public boolean a(double $$0, float $$1, bux $$2) {
      if ($$0 > 3.0) {
         this.a(awn.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bwi.c be() {
      return bwi.c.c;
   }

   @Nullable
   @Override
   public bxj f() {
      return this.Q();
   }
}
