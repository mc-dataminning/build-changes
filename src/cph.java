import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cph extends cok {
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
   private static final csf bT = ($$0, $$1, $$2) -> {
      $$1.dU().a(null, $$1, awn.cF, $$1.dl(), 1.0F, 1.0F);
      csf.b.deflect($$0, $$1, $$2);
   };

   public static byo.a j() {
      return bxl.E().a(byp.v, 0.63F).a(byp.s, 30.0).a(byp.m, 24.0).a(byp.c, 3.0);
   }

   public cph(bwr<? extends cok> $$0, djh $$1) {
      super($$0, $$1);
      this.a(exm.z, -1.0F);
      this.a(exm.o, -1.0F);
      this.by = 10;
   }

   @Override
   protected byj<?> a(Dynamic<?> $$0) {
      return cpi.a(this, this.ec().a($$0));
   }

   @Override
   public byj<cph> eb() {
      return (byj<cph>)super.eb();
   }

   @Override
   protected byj.b<cph> ec() {
      return byj.a(cpi.f, cpi.e);
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

   public cph m() {
      this.bR = 0;
      return this;
   }

   public void n() {
      if (++this.bR <= 5) {
         eao $$0 = !this.dv().l() ? this.dv() : this.br();
         fex $$1 = this.dx();
         fex $$2 = this.ds().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dU().a(new lq(ly.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bX()) {
         fex $$1 = this.cQ().f();
         fex $$2 = new fex($$1.d, this.ds().e, $$1.f);
         eao $$3 = !this.dv().l() ? this.dv() : this.br();
         if ($$3.o() != dsz.a) {
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
   public csf a(cse $$0) {
      if ($$0.an() != bwr.s && $$0.an() != bwr.bH) {
         return this.an().a(axf.r) ? bT : csf.a;
      } else {
         return csf.a;
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

   public boolean l(fex $$0) {
      fex $$1 = this.du().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void a(arq $$0) {
      bqq $$1 = bqp.a();
      $$1.a("breezeBrain");
      this.eb().a($$0, this);
      $$1.b("breezeActivityUpdate");
      cpi.a(this);
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
      return $$1.d() instanceof cph || super.a($$0, $$1);
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
