public class cgz extends chl {
   public static final float a = 8.0F;

   @Override
   protected boolean a(arq $$0, bxj $$1, bxj $$2) {
      return this.b($$1, $$2) && $$2.bh() && (this.b($$2) || this.a($$1, $$2)) && chr.c($$0, $$1, $$2);
   }

   private boolean a(bxj $$0, bxj $$1) {
      return !$$0.eb().a(cgl.V) && $$1.an().a(axf.j);
   }

   private boolean b(bxj $$0) {
      return $$0.an().a(axf.i);
   }

   private boolean b(bxj $$0, bxj $$1) {
      return $$1.g($$0) <= 64.0;
   }

   @Override
   protected cgl<bxj> b() {
      return cgl.C;
   }
}
