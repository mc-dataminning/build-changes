public record fov(int a, int b) {
   public static fov a(fot $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fov($$1, $$2);
         case b -> new fov($$2, $$1);
      };
   }

   public fov a(fou $$0) {
      return switch ($$0) {
         case b -> new fov(this.a, this.b + 1);
         case a -> new fov(this.a, this.b - 1);
         case c -> new fov(this.a - 1, this.b);
         case d -> new fov(this.a + 1, this.b);
      };
   }

   public int a(fot $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
