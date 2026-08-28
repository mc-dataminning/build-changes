import java.util.Optional;
import javax.annotation.Nullable;

public class cjf extends ciz {
   private static final bwl bO = bwr.z.n().a(0.5F).b(0.2975F);
   private static final akj<jf<cjg>> bP = akn.a(cjf.class, akl.y);
   public float bG;
   public float bH;
   public float bI;
   public float bK;
   public float bL = 1.0F;
   private float bQ = 1.0F;
   public int bM = this.ae.a(6000) + 6000;
   public boolean bN;

   public cjf(bwr<? extends cjf> $$0, djh $$1) {
      super($$0, $$1);
      this.a(exm.j, 0.0F);
   }

   @Override
   protected void D() {
      this.bD.a(0, new cdz(this));
      this.bD.a(1, new cey(this, 1.4));
      this.bD.a(2, new cdr(this, 1.0));
      this.bD.a(3, new cfn(this, 1.0, $$0 -> $$0.a(axk.ao), false));
      this.bD.a(4, new cee(this, 1.1));
      this.bD.a(5, new cfs(this, 1.0));
      this.bD.a(6, new cen(this, crj.class, 6.0F));
      this.bD.a(7, new cfa(this));
   }

   @Override
   public bwl e(bxv $$0) {
      return this.n_() ? bO : super.e($$0);
   }

   public static byo.a q() {
      return ciz.gy().a(byp.s, 4.0).a(byp.v, 0.25);
   }

   @Override
   public void k_() {
      super.k_();
      this.bK = this.bG;
      this.bI = this.bH;
      this.bH = this.bH + (this.aH() ? -1.0F : 4.0F) * 0.3F;
      this.bH = azm.a(this.bH, 0.0F, 1.0F);
      if (!this.aH() && this.bL < 1.0F) {
         this.bL = 1.0F;
      }

      this.bL *= 0.9F;
      fex $$0 = this.dx();
      if (!this.aH() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.bG = this.bG + this.bL * 2.0F;
      if (this.dU() instanceof arq $$1 && this.bI() && !this.n_() && !this.x() && --this.bM <= 0) {
         if (this.a($$1, ezk.aI, this::a)) {
            this.a(awn.eX, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(efo.t);
         }

         this.bM = this.ae.a(6000) + 6000;
      }
   }

   @Override
   protected boolean aY() {
      return this.Y > this.bQ;
   }

   @Override
   protected void aX() {
      this.bQ = this.Y + this.bH / 2.0F;
   }

   @Override
   protected awm u() {
      return awn.eV;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.eY;
   }

   @Override
   protected awm l_() {
      return awn.eW;
   }

   @Override
   protected void b(iv $$0, eao $$1) {
      this.a(awn.eZ, 0.15F, 1.0F);
   }

   @Nullable
   public cjf b(arq $$0, bvy $$1) {
      cjf $$2 = bwr.z.a($$0, bwq.e);
      if ($$2 != null && $$1 instanceof cjf $$3) {
         $$2.j(this.ae.h() ? this.t() : $$3.t());
      }

      return $$2;
   }

   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      cjh.a(this.ae, this.dW(), ctp.a($$0, this.du())).ifPresent(this::j);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean i(czk $$0) {
      return $$0.a(axk.ao);
   }

   @Override
   protected int e(arq $$0) {
      return this.x() ? 10 : super.e($$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bP, cts.a(this.dW(), cjh.a));
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.bN = $$0.o("IsChickenJockey");
      if ($$0.c("EggLayTime")) {
         this.bM = $$0.f("EggLayTime");
      }

      cts.a($$0, this.dW(), mh.aJ).ifPresent(this::j);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.bN);
      $$0.a("EggLayTime", this.bM);
      cts.a($$0, this.t());
   }

   public void j(jf<cjg> $$0) {
      this.al.a(bP, $$0);
   }

   public jf<cjg> t() {
      return this.al.a(bP);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aI ? c((kj<T>)$$0, new cyl<>(this.t())) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aI);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aI) {
         Optional<jf<cjg>> $$2 = c(kk.aI, $$1).a(this.dW());
         if ($$2.isPresent()) {
            this.j($$2.get());
            return true;
         } else {
            return false;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.x();
   }

   @Override
   protected void a(bwi $$0, bwi.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bxj) {
         ((bxj)$$0).aV = this.aV;
      }
   }

   public boolean x() {
      return this.bN;
   }

   public void w(boolean $$0) {
      this.bN = $$0;
   }
}
