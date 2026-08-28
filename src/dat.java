public class dat extends dac {
   public dat() {
      super(dac.a(awy.bR, 2, 3, dac.a(15, 9), dac.a(65, 9), 4, cpn.a(cpp.c), btd.a));
   }

   @Override
   public void c(btr $$0, bsw $$1, int $$2) {
      float $$3 = 0.25F + 0.25F * (float)$$2;
      $$0.dP().a(null, null, new dat.a($$3), $$0.du(), $$0.dw(), $$0.dA(), 3.5F, false, dca.a.e, li.A, li.z, awa.Cm);
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public boolean l() {
      return false;
   }

   static final class a extends coh.a {
      private final float a;

      public a(float $$0) {
         this.a = $$0;
      }

      @Override
      public float a(bsw $$0) {
         boolean var10000;
         label17: {
            if ($$0 instanceof cmz $$1 && $$1.gd().b) {
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
