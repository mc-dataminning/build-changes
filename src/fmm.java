public class fmm extends flo {
   protected fmm(fiz $$0, double $$1, double $$2, double $$3, double $$4, fmr $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements flz<ja> {
      private final fmr a;

      public a(fmr $$0) {
         this.a = $$0;
      }

      public flw a(ja $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fmm($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
