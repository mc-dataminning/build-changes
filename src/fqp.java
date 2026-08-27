public class fqp extends fpf {
   fqp(fmt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fqr $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements fpz<jy> {
      private final fqr a;

      public a(fqr $$0) {
         this.a = $$0;
      }

      public fpw a(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fqp($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
