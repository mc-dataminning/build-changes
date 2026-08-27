public record fhu(int a, int b) {
   public static fhu a(fhs $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fhu($$1, $$2);
         case b -> new fhu($$2, $$1);
      };
   }

   public fhu a(fht $$0) {
      return switch ($$0) {
         case b -> new fhu(this.a, this.b + 1);
         case a -> new fhu(this.a, this.b - 1);
         case c -> new fhu(this.a - 1, this.b);
         case d -> new fhu(this.a + 1, this.b);
      };
   }

   public int a(fhs $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
