public class chm extends chy {
   public static final float a = 8.0F;

   @Override
   protected boolean a(aru $$0, bxw $$1, bxw $$2) {
      return this.b($$1, $$2) && $$2.bi() && (this.b($$2) || this.a($$1, $$2)) && cie.c($$0, $$1, $$2);
   }

   private boolean a(bxw $$0, bxw $$1) {
      return !$$0.ec().a(cgy.V) && $$1.an().a(axj.j);
   }

   private boolean b(bxw $$0) {
      return $$0.an().a(axj.i);
   }

   private boolean b(bxw $$0, bxw $$1) {
      return $$1.g($$0) <= 64.0;
   }

   @Override
   protected cgy<bxw> b() {
      return cgy.C;
   }
}
