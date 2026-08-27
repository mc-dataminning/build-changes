public class frl extends fqn {
   protected frl(fns $$0, double $$1, double $$2, double $$3, double $$4, frq $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements fqy<ka> {
      private final frq a;

      public a(frq $$0) {
         this.a = $$0;
      }

      public fqv a(ka $$0, fns $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new frl($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
