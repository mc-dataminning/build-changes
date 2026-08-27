public class fpa extends fpb<jp> {
   protected fpa(fmt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, jp $$7, fqr $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public static class a implements fpz<jp> {
      private final fqr a;

      public a(fqr $$0) {
         this.a = $$0;
      }

      public fpw a(jp $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fpa($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0, this.a);
      }
   }
}
