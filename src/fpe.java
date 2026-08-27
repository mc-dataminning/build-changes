public class fpe extends fof {
   protected fpe(flo $$0, double $$1, double $$2, double $$3, double $$4, fpj $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements foq<jz> {
      private final fpj a;

      public a(fpj $$0) {
         this.a = $$0;
      }

      public fon a(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fpe($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
