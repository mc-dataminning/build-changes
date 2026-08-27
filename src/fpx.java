import com.mojang.authlib.GameProfile;

public class fpx extends fpt {
   private eju cm = eju.b;
   private int cn;

   public fpx(flj $$0, GameProfile $$1) {
      super($$0, $$1);
      this.t(1.0F);
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
   public boolean a(bjo $$0, float $$1) {
      return true;
   }

   @Override
   public void l() {
      super.l();
      this.q(false);
   }

   @Override
   public void c_() {
      if (this.bn > 0) {
         this.a(this.bn, this.bo, this.bp, this.bq, this.br, this.bs);
         this.bn--;
      }

      if (this.bu > 0) {
         this.a(this.bu, this.bt);
         this.bu--;
      }

      if (this.cn > 0) {
         this.h(new eju((this.cm.c - this.dq().c) / (double)this.cn, (this.cm.d - this.dq().d) / (double)this.cn, (this.cm.e - this.dq().e) / (double)this.cn));
         this.cn--;
      }

      this.bV = this.bW;
      this.eR();
      float $$1;
      if (this.aC() && !this.ex()) {
         $$1 = (float)Math.min(0.1, this.dq().h());
      } else {
         $$1 = 0.0F;
      }

      this.bW = this.bW + ($$1 - this.bW) * 0.4F;
      this.dN().ae().a("push");
      this.L_();
      this.dN().ae().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.cm = new eju($$0, $$1, $$2);
      this.cn = this.ai().p() + 1;
   }

   @Override
   protected void fN() {
   }

   @Override
   public void a(ur $$0) {
      etd $$1 = etd.N();
      $$1.l.d().a($$0);
   }

   @Override
   public void a(ye $$0) {
      super.a($$0);
      this.bp();
   }
}
