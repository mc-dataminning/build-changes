import javax.annotation.Nullable;

public class cnj extends cma {
   public cnj(bvi<? extends cnj> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(eun.i, 8.0F);
   }

   @Override
   protected void D() {
      this.bD.a(3, new cep<>(this, coe.class, true));
      super.D();
   }

   @Override
   protected avz u() {
      return awa.DB;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.DD;
   }

   @Override
   protected avz l_() {
      return awa.DC;
   }

   @Override
   avz m() {
      return awa.DE;
   }

   @Override
   public axf<cxd> Y() {
      return null;
   }

   @Override
   public boolean g(cxh $$0) {
      return !$$0.a(awy.bW) && super.g($$0);
   }

   @Override
   protected void a(ard $$0, btp $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cme $$4 && $$4.x()) {
         $$4.gs();
         this.a($$0, cxl.vn);
      }
   }

   @Override
   protected void a(azh $$0, bsw $$1) {
      this.a(bvj.a, new cxh(cxl.py));
   }

   @Override
   protected void a(dhq $$0, azh $$1, bsw $$2) {
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      bwr $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bxg.c).a(4.0);
      this.n();
      return $$4;
   }

   @Override
   public boolean c(ard $$0, bva $$1) {
      if (!super.c($$0, $$1)) {
         return false;
      } else {
         if ($$1 instanceof bvy) {
            ((bvy)$$1).b(new bue(bug.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cpy a(cxh $$0, float $$1, @Nullable cxh $$2) {
      cpy $$3 = super.a($$0, $$1, $$2);
      $$3.e(100.0F);
      return $$3;
   }

   @Override
   public boolean b(bue $$0) {
      return $$0.a(bug.t) ? false : super.b($$0);
   }
}
