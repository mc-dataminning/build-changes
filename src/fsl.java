public record fsl(int a, int b) {
   public static fsl a(fsj $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fsl($$1, $$2);
         case b -> new fsl($$2, $$1);
      };
   }

   public fsl a(fsk $$0) {
      return switch ($$0) {
         case b -> new fsl(this.a, this.b + 1);
         case a -> new fsl(this.a, this.b - 1);
         case c -> new fsl(this.a - 1, this.b);
         case d -> new fsl(this.a + 1, this.b);
      };
   }

   public int a(fsj $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
