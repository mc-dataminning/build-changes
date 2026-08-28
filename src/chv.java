public class chv extends cih {
   public static final float a = 8.0F;

   @Override
   protected boolean a(asb $$0, byf $$1, byf $$2) {
      return this.b($$1, $$2) && $$2.bi() && (this.b($$2) || this.a($$1, $$2)) && cin.c($$0, $$1, $$2);
   }

   private boolean a(byf $$0, byf $$1) {
      return !$$0.ec().a(chh.V) && $$1.an().a(axq.j);
   }

   private boolean b(byf $$0) {
      return $$0.an().a(axq.i);
   }

   private boolean b(byf $$0, byf $$1) {
      return $$1.g($$0) <= 64.0;
   }

   @Override
   protected chh<byf> b() {
      return chh.C;
   }
}
