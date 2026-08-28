public record flj(int a, int b) {
   public static flj a(flh $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new flj($$1, $$2);
         case b -> new flj($$2, $$1);
      };
   }

   public flj a(fli $$0) {
      return switch ($$0) {
         case b -> new flj(this.a, this.b + 1);
         case a -> new flj(this.a, this.b - 1);
         case c -> new flj(this.a - 1, this.b);
         case d -> new flj(this.a + 1, this.b);
      };
   }

   public int a(flh $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
