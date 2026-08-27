public class fng extends fmi {
   protected fng(fjr $$0, double $$1, double $$2, double $$3, double $$4, fnl $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements fmt<jv> {
      private final fnl a;

      public a(fnl $$0) {
         this.a = $$0;
      }

      public fmq a(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fng($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
