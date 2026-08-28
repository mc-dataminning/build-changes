import javax.annotation.Nullable;

public class cht extends cho {
   private static final bve ch = bvi.z.n().a(0.5F).b(0.2975F);
   public float bZ;
   public float ca;
   public float cb;
   public float cd;
   public float ce = 1.0F;
   private float ci = 1.0F;
   public int cf = this.ae.a(6000) + 6000;
   public boolean cg;

   public cht(bvi<? extends cht> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(euh.j, 0.0F);
   }

   @Override
   protected void B() {
      this.bT.a(0, new ccp(this));
      this.bT.a(1, new cdo(this, 1.4));
      this.bT.a(2, new cch(this, 1.0));
      this.bT.a(3, new ced(this, 1.0, $$0 -> $$0.a(axt.ap), false));
      this.bT.a(4, new ccu(this, 1.1));
      this.bT.a(5, new cei(this, 1.0));
      this.bT.a(6, new cdd(this, cpo.class, 6.0F));
      this.bT.a(7, new cdq(this));
   }

   @Override
   public bve e(bwj $$0) {
      return this.e_() ? ch : super.e($$0);
   }

   public static bxe.a p() {
      return cho.gt().a(bxf.s, 4.0).a(bxf.v, 0.25);
   }

   @Override
   public void d_() {
      super.d_();
      this.cd = this.bZ;
      this.cb = this.ca;
      this.ca = this.ca + (this.aJ() ? -1.0F : 4.0F) * 0.3F;
      this.ca = azu.a(this.ca, 0.0F, 1.0F);
      if (!this.aJ() && this.ce < 1.0F) {
         this.ce = 1.0F;
      }

      this.ce *= 0.9F;
      fbr $$0 = this.dz();
      if (!this.aJ() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.bZ = this.bZ + this.ce * 2.0F;
      if (this.dW() instanceof arx $$1 && this.bL() && !this.e_() && !this.t() && --this.cf <= 0) {
         if (this.a($$1, ewe.aI, this::a)) {
            this.a(awv.eV, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(eck.t);
         }

         this.cf = this.ae.a(6000) + 6000;
      }
   }

   @Override
   protected boolean ba() {
      return this.Y > this.ci;
   }

   @Override
   protected void aZ() {
      this.ci = this.Y + this.ca / 2.0F;
   }

   @Override
   protected awu u() {
      return awv.eT;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.eW;
   }

   @Override
   protected awu o_() {
      return awv.eU;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.eX, 0.15F, 1.0F);
   }

   @Nullable
   public cht b(arx $$0, bus $$1) {
      return bvi.z.a($$0, bvh.e);
   }

   @Override
   public boolean j(cxg $$0) {
      return $$0.a(axt.ap);
   }

   @Override
   protected int e(arx $$0) {
      return this.t() ? 10 : super.e($$0);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.cg = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.cf = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.cg);
      $$0.a("EggLayTime", this.cf);
   }

   @Override
   public boolean h(double $$0) {
      return this.t();
   }

   @Override
   protected void a(bvb $$0, bvb.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bvx) {
         ((bvx)$$0).aX = this.aX;
      }
   }

   public boolean t() {
      return this.cg;
   }

   public void x(boolean $$0) {
      this.cg = $$0;
   }
}
