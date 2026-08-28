public record fpo(int a, int b) {
   public static fpo a(fpm $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fpo($$1, $$2);
         case b -> new fpo($$2, $$1);
      };
   }

   public fpo a(fpn $$0) {
      return switch ($$0) {
         case b -> new fpo(this.a, this.b + 1);
         case a -> new fpo(this.a, this.b - 1);
         case c -> new fpo(this.a - 1, this.b);
         case d -> new fpo(this.a + 1, this.b);
      };
   }

   public int a(fpm $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
