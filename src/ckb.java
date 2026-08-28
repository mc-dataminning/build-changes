import java.util.Optional;
import javax.annotation.Nullable;

public class ckb extends cjv {
   private static final bxh bQ = bxn.A.n().a(0.5F).b(0.2975F);
   private static final aku<jg<ckc>> bR = aky.a(ckb.class, akw.y);
   private static final boolean bS = false;
   public float bI;
   public float bJ;
   public float bK;
   public float bM;
   public float bN = 1.0F;
   private float bT = 1.0F;
   public int bO;
   public boolean bP = false;

   public ckb(bxn<? extends ckb> $$0, dkj $$1) {
      super($$0, $$1);
      this.bO = this.ae.a(6000) + 6000;
      this.a(eyr.j, 0.0F);
   }

   @Override
   protected void D() {
      this.bF.a(0, new cev(this));
      this.bF.a(1, new cfu(this, 1.4));
      this.bF.a(2, new cen(this, 1.0));
      this.bF.a(3, new cgj(this, 1.0, $$0 -> $$0.a(axv.ap), false));
      this.bF.a(4, new cfa(this, 1.1));
      this.bF.a(5, new cgo(this, 1.0));
      this.bF.a(6, new cfj(this, csi.class, 6.0F));
      this.bF.a(7, new cfw(this));
   }

   @Override
   public bxh e(byr $$0) {
      return this.n_() ? bQ : super.e($$0);
   }

   public static bzk.a q() {
      return cjv.gz().a(bzl.s, 4.0).a(bzl.v, 0.25);
   }

   @Override
   public void k_() {
      super.k_();
      this.bM = this.bI;
      this.bK = this.bJ;
      this.bJ = this.bJ + (this.aH() ? -1.0F : 4.0F) * 0.3F;
      this.bJ = azz.a(this.bJ, 0.0F, 1.0F);
      if (!this.aH() && this.bN < 1.0F) {
         this.bN = 1.0F;
      }

      this.bN *= 0.9F;
      fgc $$0 = this.dy();
      if (!this.aH() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.bI = this.bI + this.bN * 2.0F;
      if (this.dV() instanceof asb $$1 && this.bJ() && !this.n_() && !this.x() && --this.bO <= 0) {
         if (this.a($$1, fap.aI, this::a)) {
            this.a(awy.eX, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(egq.t);
         }

         this.bO = this.ae.a(6000) + 6000;
      }
   }

   @Override
   protected boolean aZ() {
      return this.Y > this.bT;
   }

   @Override
   protected void aY() {
      this.bT = this.Y + this.bJ / 2.0F;
   }

   @Override
   protected awx u() {
      return awy.eV;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.eY;
   }

   @Override
   protected awx l_() {
      return awy.eW;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.eZ, 0.15F, 1.0F);
   }

   @Nullable
   public ckb b(asb $$0, bwu $$1) {
      ckb $$2 = bxn.A.a($$0, bxm.e);
      if ($$2 != null && $$1 instanceof ckb $$3) {
         $$2.j(this.ae.h() ? this.t() : $$3.t());
      }

      return $$2;
   }

   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      ckd.a(this.ae, this.dX(), cuo.a($$0, this.dv())).ifPresent(this::j);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean i(dak $$0) {
      return $$0.a(axv.ap);
   }

   @Override
   protected int e(asb $$0) {
      return this.x() ? 10 : super.e($$0);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bR, cur.a(this.dX(), ckd.a));
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.bP = $$0.b("IsChickenJockey", false);
      $$0.e("EggLayTime").ifPresent($$0x -> this.bO = $$0x);
      cur.a($$0, this.dX(), mi.aJ).ifPresent(this::j);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.bP);
      $$0.a("EggLayTime", this.bO);
      cur.a($$0, this.t());
   }

   public void j(jg<ckc> $$0) {
      this.al.a(bR, $$0);
   }

   public jg<ckc> t() {
      return this.al.a(bR);
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aJ ? c((kk<T>)$$0, new czl<>(this.t())) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aJ);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aJ) {
         Optional<jg<ckc>> $$2 = c(kl.aJ, $$1).a(this.dX());
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
   protected void a(bxe $$0, bxe.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof byf) {
         ((byf)$$0).aV = this.aV;
      }
   }

   public boolean x() {
      return this.bP;
   }

   public void w(boolean $$0) {
      this.bP = $$0;
   }
}
