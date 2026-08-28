public record fli(int a, int b) {
   public static fli a(flg $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fli($$1, $$2);
         case b -> new fli($$2, $$1);
      };
   }

   public fli a(flh $$0) {
      return switch ($$0) {
         case b -> new fli(this.a, this.b + 1);
         case a -> new fli(this.a, this.b - 1);
         case c -> new fli(this.a - 1, this.b);
         case d -> new fli(this.a + 1, this.b);
      };
   }

   public int a(flg $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
