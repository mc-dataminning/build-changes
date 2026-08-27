import com.mojang.authlib.GameProfile;

public class fsw extends fss {
   private emc cq = emc.b;
   private int cr;

   public fsw(foe $$0, GameProfile $$1) {
      super($$0, $$1);
      this.af = true;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cH().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cA();
      return $$0 < $$1 * $$1;
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      return true;
   }

   @Override
   public void l() {
      super.l();
      this.q(false);
   }

   @Override
   public void d_() {
      if (this.bn > 0) {
         this.a(this.bn, this.bo, this.bp, this.bq, this.br, this.bs);
         this.bn--;
      }

      if (this.bu > 0) {
         this.a(this.bu, this.bt);
         this.bu--;
      }

      if (this.cr > 0) {
         this.h(new emc((this.cq.c - this.do().c) / (double)this.cr, (this.cq.d - this.do().d) / (double)this.cr, (this.cq.e - this.do().e) / (double)this.cr));
         this.cr--;
      }

      this.bZ = this.ca;
      this.eQ();
      float $$1;
      if (this.aC() && !this.ew()) {
         $$1 = (float)Math.min(0.1, this.do().h());
      } else {
         $$1 = 0.0F;
      }

      this.ca = this.ca + ($$1 - this.ca) * 0.4F;
      this.dL().af().a("push");
      this.M_();
      this.dL().af().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.cq = new emc($$0, $$1, $$2);
      this.cr = this.ai().p() + 1;
   }

   @Override
   protected void fM() {
   }

   @Override
   public void a(vg $$0) {
      evr $$1 = evr.O();
      $$1.l.d().a($$0);
   }

   @Override
   public void a(zc $$0) {
      super.a($$0);
      this.bp();
   }
}
