public class cgs extends che {
   public static final float a = 8.0F;

   @Override
   protected boolean a(arq $$0, bxc $$1, bxc $$2) {
      return this.b($$1, $$2) && $$2.bj() && (this.b($$2) || this.a($$1, $$2)) && chk.c($$0, $$1, $$2);
   }

   private boolean a(bxc $$0, bxc $$1) {
      return !$$0.eb().a(cge.V) && $$1.aq().a(axf.j);
   }

   private boolean b(bxc $$0) {
      return $$0.aq().a(axf.i);
   }

   private boolean b(bxc $$0, bxc $$1) {
      return $$1.g($$0) <= 64.0;
   }

   @Override
   protected cge<bxc> b() {
      return cge.C;
   }
}
