public class bzg extends bzs {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bpp $$0, bpp $$1) {
      return this.f($$0, $$1) && $$1.bf() && (this.b($$1) || this.e($$0, $$1)) && bzy.c($$0, $$1);
   }

   private boolean e(bpp $$0, bpp $$1) {
      return !$$0.dP().a(bys.U) && $$1.ai().a(auq.j);
   }

   private boolean b(bpp $$0) {
      return $$0.ai().a(auq.i);
   }

   private boolean f(bpp $$0, bpp $$1) {
      return $$1.g((box)$$0) <= 64.0;
   }

   @Override
   protected bys<bpp> b() {
      return bys.B;
   }
}
