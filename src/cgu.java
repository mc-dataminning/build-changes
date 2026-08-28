public class cgu extends chg {
   public static final float a = 8.0F;

   @Override
   protected boolean a(arq $$0, bxe $$1, bxe $$2) {
      return this.b($$1, $$2) && $$2.bj() && (this.b($$2) || this.a($$1, $$2)) && chm.c($$0, $$1, $$2);
   }

   private boolean a(bxe $$0, bxe $$1) {
      return !$$0.ec().a(cgg.V) && $$1.aq().a(axf.j);
   }

   private boolean b(bxe $$0) {
      return $$0.aq().a(axf.i);
   }

   private boolean b(bxe $$0, bxe $$1) {
      return $$1.g($$0) <= 64.0;
   }

   @Override
   protected cgg<bxe> b() {
      return cgg.C;
   }
}
