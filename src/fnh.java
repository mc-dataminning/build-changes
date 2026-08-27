import com.mojang.authlib.GameProfile;

public class fnh extends fnd {
   private ehn cm = ehn.b;
   private int cn;

   public fnh(fix $$0, GameProfile $$1) {
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
   public boolean a(bho $$0, float $$1) {
      return true;
   }

   @Override
   public void l() {
      super.l();
      this.q(false);
   }

   @Override
   public void b_() {
      if (this.bn > 0) {
         this.a(this.bn, this.bo, this.bp, this.bq, this.br, this.bs);
         this.bn--;
      }

      if (this.bu > 0) {
         this.a(this.bu, this.bt);
         this.bu--;
      }

      if (this.cn > 0) {
         this.g(new ehn((this.cm.c - this.do().c) / (double)this.cn, (this.cm.d - this.do().d) / (double)this.cn, (this.cm.e - this.do().e) / (double)this.cn));
         this.cn--;
      }

      this.bV = this.bW;
      this.eP();
      float $$1;
      if (this.aB() && !this.ev()) {
         $$1 = (float)Math.min(0.1, this.do().h());
      } else {
         $$1 = 0.0F;
      }

      this.bW = this.bW + ($$1 - this.bW) * 0.4F;
      this.dL().ad().a("push");
      this.fh();
      this.dL().ad().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.cm = new ehn($$0, $$1, $$2);
      this.cn = this.ah().p() + 1;
   }

   @Override
   protected void fL() {
   }

   @Override
   public void a(tl $$0) {
      eqv $$1 = eqv.O();
      $$1.l.d().a($$0);
   }
}
