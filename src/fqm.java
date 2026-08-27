public class fqm extends fpo {
   protected fqm(fmt $$0, double $$1, double $$2, double $$3, double $$4, fqr $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements fpz<jy> {
      private final fqr a;

      public a(fqr $$0) {
         this.a = $$0;
      }

      public fpw a(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fqm($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
