public class bsv extends btf {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bjg $$0, bjg $$1) {
      return this.f($$0, $$1) && $$1.ba() && (this.b($$1) || this.e($$0, $$1)) && btl.c($$0, $$1);
   }

   private boolean e(bjg $$0, bjg $$1) {
      return !$$0.dN().a(bsh.T) && $$1.ag().a(apw.h);
   }

   private boolean b(bjg $$0) {
      return $$0.ag().a(apw.g);
   }

   private boolean f(bjg $$0, bjg $$1) {
      return $$1.f((biq)$$0) <= 64.0;
   }

   @Override
   protected bsh<bjg> b() {
      return bsh.B;
   }
}
