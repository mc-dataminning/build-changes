import java.util.Optional;
import javax.annotation.Nullable;

public class cjs extends cjm {
   private static final bwy bQ = bxe.A.n().a(0.5F).b(0.2975F);
   private static final akn<jg<cjt>> bR = akr.a(cjs.class, akp.y);
   private static final boolean bS = false;
   public float bI;
   public float bJ;
   public float bK;
   public float bM;
   public float bN = 1.0F;
   private float bT = 1.0F;
   public int bO;
   public boolean bP = false;

   public cjs(bxe<? extends cjs> $$0, djz $$1) {
      super($$0, $$1);
      this.bO = this.ae.a(6000) + 6000;
      this.a(eyh.j, 0.0F);
   }

   @Override
   protected void D() {
      this.bF.a(0, new cem(this));
      this.bF.a(1, new cfl(this, 1.4));
      this.bF.a(2, new cee(this, 1.0));
      this.bF.a(3, new cga(this, 1.0, $$0 -> $$0.a(axo.ap), false));
      this.bF.a(4, new cer(this, 1.1));
      this.bF.a(5, new cgf(this, 1.0));
      this.bF.a(6, new cfa(this, crz.class, 6.0F));
      this.bF.a(7, new cfn(this));
   }

   @Override
   public bwy e(byi $$0) {
      return this.n_() ? bQ : super.e($$0);
   }

   public static bzb.a q() {
      return cjm.gz().a(bzc.s, 4.0).a(bzc.v, 0.25);
   }

   @Override
   public void k_() {
      super.k_();
      this.bM = this.bI;
      this.bK = this.bJ;
      this.bJ = this.bJ + (this.aH() ? -1.0F : 4.0F) * 0.3F;
      this.bJ = azq.a(this.bJ, 0.0F, 1.0F);
      if (!this.aH() && this.bN < 1.0F) {
         this.bN = 1.0F;
      }

      this.bN *= 0.9F;
      ffs $$0 = this.dy();
      if (!this.aH() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.bI = this.bI + this.bN * 2.0F;
      if (this.dV() instanceof aru $$1 && this.bJ() && !this.n_() && !this.x() && --this.bO <= 0) {
         if (this.a($$1, faf.aI, this::a)) {
            this.a(awr.eX, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(egg.t);
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
   protected awq u() {
      return awr.eV;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.eY;
   }

   @Override
   protected awq l_() {
      return awr.eW;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.eZ, 0.15F, 1.0F);
   }

   @Nullable
   public cjs b(aru $$0, bwl $$1) {
      cjs $$2 = bxe.A.a($$0, bxd.e);
      if ($$2 != null && $$1 instanceof cjs $$3) {
         $$2.j(this.ae.h() ? this.t() : $$3.t());
      }

      return $$2;
   }

   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      cju.a(this.ae, this.dX(), cuf.a($$0, this.dv())).ifPresent(this::j);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean i(daa $$0) {
      return $$0.a(axo.ap);
   }

   @Override
   protected int e(aru $$0) {
      return this.x() ? 10 : super.e($$0);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bR, cui.a(this.dX(), cju.a));
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.bP = $$0.b("IsChickenJockey", false);
      $$0.e("EggLayTime").ifPresent($$0x -> this.bO = $$0x);
      cui.a($$0, this.dX(), mi.aJ).ifPresent(this::j);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.bP);
      $$0.a("EggLayTime", this.bO);
      cui.a($$0, this.t());
   }

   public void j(jg<cjt> $$0) {
      this.al.a(bR, $$0);
   }

   public jg<cjt> t() {
      return this.al.a(bR);
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aJ ? c((kk<T>)$$0, new czb<>(this.t())) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aJ);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aJ) {
         Optional<jg<cjt>> $$2 = c(kl.aJ, $$1).a(this.dX());
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
   protected void a(bwv $$0, bwv.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bxw) {
         ((bxw)$$0).aV = this.aV;
      }
   }

   public boolean x() {
      return this.bP;
   }

   public void w(boolean $$0) {
      this.bP = $$0;
   }
}
