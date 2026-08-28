public class dap extends czy {
   public dap() {
      super(czy.a(awx.bR, 2, 3, czy.a(15, 9), czy.a(65, 9), 4, cpj.a(cpl.c), bsz.a));
   }

   @Override
   public void c(btn $$0, bss $$1, int $$2) {
      float $$3 = 0.25F + 0.25F * (float)$$2;
      $$0.dP().a(null, null, new dap.a($$3), $$0.du(), $$0.dw(), $$0.dA(), 3.5F, false, dbw.a.e, li.A, li.z, avz.Cm);
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public boolean l() {
      return false;
   }

   static final class a extends cod.a {
      private final float a;

      public a(float $$0) {
         this.a = $$0;
      }

      @Override
      public float a(bss $$0) {
         boolean var10000;
         label17: {
            if ($$0 instanceof cmv $$1 && $$1.gd().b) {
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
