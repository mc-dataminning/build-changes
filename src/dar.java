public class dar extends daa {
   public dar() {
      super(daa.a(awy.bR, 2, 3, daa.a(15, 9), daa.a(65, 9), 4, cpl.a(cpn.c), btb.a));
   }

   @Override
   public void c(btp $$0, bsu $$1, int $$2) {
      float $$3 = 0.25F + 0.25F * (float)$$2;
      $$0.dP().a(null, null, new dar.a($$3), $$0.du(), $$0.dw(), $$0.dA(), 3.5F, false, dby.a.e, li.A, li.z, awa.Cm);
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public boolean l() {
      return false;
   }

   static final class a extends cof.a {
      private final float a;

      public a(float $$0) {
         this.a = $$0;
      }

      @Override
      public float a(bsu $$0) {
         boolean var10000;
         label17: {
            if ($$0 instanceof cmx $$1 && $$1.gd().b) {
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
