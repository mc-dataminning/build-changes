public class frk extends fqm {
   protected frk(fnr $$0, double $$1, double $$2, double $$3, double $$4, frp $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements fqx<ka> {
      private final frp a;

      public a(frp $$0) {
         this.a = $$0;
      }

      public fqu a(ka $$0, fnr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new frk($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
