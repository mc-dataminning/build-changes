import javax.annotation.Nullable;

public class chw extends chp {
   private static final bvd bF = bvi.C.n().a(0.5F).b(0.665F);

   public chw(bvi<? extends chw> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(0, new ccq(this));
      this.bC.a(1, new cdp(this, 2.0));
      this.bC.a(2, new cci(this, 1.0));
      this.bC.a(3, new cee(this, 1.25, $$0 -> $$0.a(awy.ad), false));
      this.bC.a(4, new ccv(this, 1.25));
      this.bC.a(5, new cej(this, 1.0));
      this.bC.a(6, new cde(this, cpr.class, 6.0F));
      this.bC.a(7, new cdr(this));
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.ad);
   }

   public static bxf.a q() {
      return chp.gx().a(bxg.s, 10.0).a(bxg.v, 0.2F);
   }

   @Override
   protected avz u() {
      return awa.gd;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.gf;
   }

   @Override
   protected avz l_() {
      return awa.ge;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.gh, 0.15F, 1.0F);
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if ($$2.a(cxl.rh) && !this.n_()) {
         $$0.a(awa.gg, 1.0F, 1.0F);
         cxh $$3 = cxk.a($$2, $$0, cxl.rn.n());
         $$0.a($$1, $$3);
         return bsy.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public chw b(ard $$0, buq $$1) {
      return bvi.C.a($$0, bvh.e);
   }

   @Override
   public bvd e(bwk $$0) {
      return this.n_() ? bF : super.e($$0);
   }
}
