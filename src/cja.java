import java.util.Optional;
import javax.annotation.Nullable;

public class cja extends ciu {
   private static final bwi bO = bwo.z.n().a(0.5F).b(0.2975F);
   private static final akj<je<cjb>> bP = akn.a(cja.class, akl.y);
   public float bG;
   public float bH;
   public float bI;
   public float bK;
   public float bL = 1.0F;
   private float bQ = 1.0F;
   public int bM = this.ae.a(6000) + 6000;
   public boolean bN;

   public cja(bwo<? extends cja> $$0, dja $$1) {
      super($$0, $$1);
      this.a(exf.j, 0.0F);
   }

   @Override
   protected void D() {
      this.bD.a(0, new cdu(this));
      this.bD.a(1, new cet(this, 1.4));
      this.bD.a(2, new cdm(this, 1.0));
      this.bD.a(3, new cfi(this, 1.0, $$0 -> $$0.a(axk.ao), false));
      this.bD.a(4, new cdz(this, 1.1));
      this.bD.a(5, new cfn(this, 1.0));
      this.bD.a(6, new cei(this, crc.class, 6.0F));
      this.bD.a(7, new cev(this));
   }

   @Override
   public bwi e(bxq $$0) {
      return this.n_() ? bO : super.e($$0);
   }

   public static byj.a q() {
      return ciu.gw().a(byk.s, 4.0).a(byk.v, 0.25);
   }

   @Override
   public void k_() {
      super.k_();
      this.bK = this.bG;
      this.bI = this.bH;
      this.bH = this.bH + (this.aJ() ? -1.0F : 4.0F) * 0.3F;
      this.bH = azm.a(this.bH, 0.0F, 1.0F);
      if (!this.aJ() && this.bL < 1.0F) {
         this.bL = 1.0F;
      }

      this.bL *= 0.9F;
      feq $$0 = this.dy();
      if (!this.aJ() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.bG = this.bG + this.bL * 2.0F;
      if (this.dV() instanceof arq $$1 && this.bK() && !this.n_() && !this.x() && --this.bM <= 0) {
         if (this.a($$1, ezd.aI, this::a)) {
            this.a(awn.eX, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(efh.t);
         }

         this.bM = this.ae.a(6000) + 6000;
      }
   }

   @Override
   protected boolean ba() {
      return this.Y > this.bQ;
   }

   @Override
   protected void aZ() {
      this.bQ = this.Y + this.bH / 2.0F;
   }

   @Override
   protected awm u() {
      return awn.eV;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.eY;
   }

   @Override
   protected awm l_() {
      return awn.eW;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.eZ, 0.15F, 1.0F);
   }

   @Nullable
   public cja b(arq $$0, bvv $$1) {
      cja $$2 = bwo.z.a($$0, bwn.e);
      if ($$2 != null && $$1 instanceof cja $$3) {
         $$2.j(this.ae.h() ? this.t() : $$3.t());
      }

      return $$2;
   }

   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      cjc.a(this.ae, this.dX(), cti.a($$0, this.dv())).ifPresent(this::j);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean i(czd $$0) {
      return $$0.a(axk.ao);
   }

   @Override
   protected int e(arq $$0) {
      return this.x() ? 10 : super.e($$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bP, ctl.a(this.dX(), cjc.a));
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.bN = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.bM = $$0.h("EggLayTime");
      }

      ctl.a($$0, this.dX(), mg.aJ).ifPresent(this::j);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.bN);
      $$0.a("EggLayTime", this.bM);
      ctl.a($$0, this.t());
   }

   public void j(je<cjb> $$0) {
      this.al.a(bP, $$0);
   }

   public je<cjb> t() {
      return this.al.a(bP);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aI ? c((ki<T>)$$0, new cye<>(this.t())) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aI);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aI) {
         Optional<je<cjb>> $$2 = c(kj.aI, $$1).a(this.dX());
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
   protected void a(bwf $$0, bwf.b $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bxe) {
         ((bxe)$$0).aV = this.aV;
      }
   }

   public boolean x() {
      return this.bN;
   }

   public void w(boolean $$0) {
      this.bN = $$0;
   }
}
