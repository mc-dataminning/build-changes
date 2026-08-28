import java.util.Optional;
import javax.annotation.Nullable;

public class cjq extends cjk {
   private static final bww bQ = bxc.A.n().a(0.5F).b(0.2975F);
   private static final akl<jf<cjr>> bR = akp.a(cjq.class, akn.y);
   private static final boolean bS = false;
   public float bI;
   public float bJ;
   public float bK;
   public float bM;
   public float bN = 1.0F;
   private float bT = 1.0F;
   public int bO;
   public boolean bP = false;

   public cjq(bxc<? extends cjq> $$0, djx $$1) {
      super($$0, $$1);
      this.bO = this.ae.a(6000) + 6000;
      this.a(eyf.j, 0.0F);
   }

   @Override
   protected void D() {
      this.bF.a(0, new cek(this));
      this.bF.a(1, new cfj(this, 1.4));
      this.bF.a(2, new cec(this, 1.0));
      this.bF.a(3, new cfy(this, 1.0, $$0 -> $$0.a(axm.ao), false));
      this.bF.a(4, new cep(this, 1.1));
      this.bF.a(5, new cgd(this, 1.0));
      this.bF.a(6, new cey(this, crx.class, 6.0F));
      this.bF.a(7, new cfl(this));
   }

   @Override
   public bww e(byg $$0) {
      return this.n_() ? bQ : super.e($$0);
   }

   public static byz.a q() {
      return cjk.gz().a(bza.s, 4.0).a(bza.v, 0.25);
   }

   @Override
   public void k_() {
      super.k_();
      this.bM = this.bI;
      this.bK = this.bJ;
      this.bJ = this.bJ + (this.aH() ? -1.0F : 4.0F) * 0.3F;
      this.bJ = azo.a(this.bJ, 0.0F, 1.0F);
      if (!this.aH() && this.bN < 1.0F) {
         this.bN = 1.0F;
      }

      this.bN *= 0.9F;
      ffq $$0 = this.dy();
      if (!this.aH() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.bI = this.bI + this.bN * 2.0F;
      if (this.dV() instanceof ars $$1 && this.bJ() && !this.n_() && !this.x() && --this.bO <= 0) {
         if (this.a($$1, fad.aI, this::a)) {
            this.a(awp.eX, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(ege.t);
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
   protected awo u() {
      return awp.eV;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.eY;
   }

   @Override
   protected awo l_() {
      return awp.eW;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.eZ, 0.15F, 1.0F);
   }

   @Nullable
   public cjq b(ars $$0, bwj $$1) {
      cjq $$2 = bxc.A.a($$0, bxb.e);
      if ($$2 != null && $$1 instanceof cjq $$3) {
         $$2.j(this.ae.h() ? this.t() : $$3.t());
      }

      return $$2;
   }

   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      cjs.a(this.ae, this.dX(), cud.a($$0, this.dv())).ifPresent(this::j);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean i(czy $$0) {
      return $$0.a(axm.ao);
   }

   @Override
   protected int e(ars $$0) {
      return this.x() ? 10 : super.e($$0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bR, cug.a(this.dX(), cjs.a));
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.bP = $$0.b("IsChickenJockey", false);
      $$0.e("EggLayTime").ifPresent($$0x -> this.bO = $$0x);
      cug.a($$0, this.dX(), mh.aJ).ifPresent(this::j);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.bP);
      $$0.a("EggLayTime", this.bO);
      cug.a($$0, this.t());
   }

   public void j(jf<cjr> $$0) {
      this.al.a(bR, $$0);
   }

   public jf<cjr> t() {
      return this.al.a(bR);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aJ ? c((kj<T>)$$0, new cyz<>(this.t())) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aJ);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aJ) {
         Optional<jf<cjr>> $$2 = c(kk.aJ, $$1).a(this.dX());
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
   protected void a(bwt $$0, bwt.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bxu) {
         ((bxu)$$0).aV = this.aV;
      }
   }

   public boolean x() {
      return this.bP;
   }

   public void w(boolean $$0) {
      this.bP = $$0;
   }
}
