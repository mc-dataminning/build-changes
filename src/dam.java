public class dam extends czv {
   public dam() {
      super(czv.a(awu.bR, 2, 3, czv.a(15, 9), czv.a(65, 9), 4, cpg.a(cpi.c), bsw.a));
   }

   @Override
   public void c(btk $$0, bsp $$1, int $$2) {
      float $$3 = 0.25F + 0.25F * (float)$$2;
      $$0.dP().a(null, null, new dam.a($$3), $$0.du(), $$0.dw(), $$0.dA(), 3.5F, false, dbt.a.e, lj.A, lj.z, avw.Cm);
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public boolean l() {
      return false;
   }

   static final class a extends coa.a {
      private final float a;

      public a(float $$0) {
         this.a = $$0;
      }

      @Override
      public float a(bsp $$0) {
         boolean var10000;
         label17: {
            if ($$0 instanceof cms $$1 && $$1.gd().b) {
               var10000 = true;
               break label17;
            }

            var10000 = false;
         }

         boolean $$2 = var10000;
         return !$$2 ? this.a : 0.0F;
      }
   }
}
