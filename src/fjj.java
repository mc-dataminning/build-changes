public record fjj(int a, int b) {
   public static fjj a(fjh $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fjj($$1, $$2);
         case b -> new fjj($$2, $$1);
      };
   }

   public fjj a(fji $$0) {
      return switch ($$0) {
         case b -> new fjj(this.a, this.b + 1);
         case a -> new fjj(this.a, this.b - 1);
         case c -> new fjj(this.a - 1, this.b);
         case d -> new fjj(this.a + 1, this.b);
      };
   }

   public int a(fjh $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
