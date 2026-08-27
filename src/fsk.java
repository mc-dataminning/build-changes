import com.mojang.authlib.GameProfile;

public class fsk extends fsg {
   private elt cm = elt.b;
   private int cn;

   public fsk(fns $$0, GameProfile $$1) {
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
   public boolean a(bkt $$0, float $$1) {
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

      if (this.cn > 0) {
         this.h(new elt((this.cm.c - this.dp().c) / (double)this.cn, (this.cm.d - this.dp().d) / (double)this.cn, (this.cm.e - this.dp().e) / (double)this.cn));
         this.cn--;
      }

      this.bV = this.bW;
      this.eQ();
      float $$1;
      if (this.aC() && !this.ew()) {
         $$1 = (float)Math.min(0.1, this.dp().h());
      } else {
         $$1 = 0.0F;
      }

      this.bW = this.bW + ($$1 - this.bW) * 0.4F;
      this.dM().af().a("push");
      this.M_();
      this.dM().af().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.cm = new elt($$0, $$1, $$2);
      this.cn = this.ai().p() + 1;
   }

   @Override
   protected void fM() {
   }

   @Override
   public void a(vf $$0) {
      evi $$1 = evi.O();
      $$1.l.d().a($$0);
   }

   @Override
   public void a(zb $$0) {
      super.a($$0);
      this.bp();
   }
}
