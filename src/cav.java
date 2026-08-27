public class cav extends cbh {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bre $$0, bre $$1) {
      return this.f($$0, $$1) && $$1.bf() && (this.b($$1) || this.e($$0, $$1)) && cbn.c($$0, $$1);
   }

   private boolean e(bre $$0, bre $$1) {
      return !$$0.dQ().a(cah.U) && $$1.ai().a(avr.j);
   }

   private boolean b(bre $$0) {
      return $$0.ai().a(avr.i);
   }

   private boolean f(bre $$0, bre $$1) {
      return $$1.g((bql)$$0) <= 64.0;
   }

   @Override
   protected cah<bre> b() {
      return cah.B;
   }
}
