public class ftp extends fsr {
   protected ftp(fpx $$0, double $$1, double $$2, double $$3, double $$4, ftu $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements ftc<kc> {
      private final ftu a;

      public a(ftu $$0) {
         this.a = $$0;
      }

      public fsz a(kc $$0, fpx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new ftp($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
