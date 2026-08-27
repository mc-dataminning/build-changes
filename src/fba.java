public record fba(int a, int b) {
   public static fba a(fay $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fba($$1, $$2);
         case b -> new fba($$2, $$1);
      };
   }

   public fba a(faz $$0) {
      return switch ($$0) {
         case b -> new fba(this.a, this.b + 1);
         case a -> new fba(this.a, this.b - 1);
         case c -> new fba(this.a - 1, this.b);
         case d -> new fba(this.a + 1, this.b);
      };
   }

   public int a(fay $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
