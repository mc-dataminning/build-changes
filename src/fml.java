public record fml(int a, int b) {
   public static fml a(fmj $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fml($$1, $$2);
         case b -> new fml($$2, $$1);
      };
   }

   public fml a(fmk $$0) {
      return switch ($$0) {
         case b -> new fml(this.a, this.b + 1);
         case a -> new fml(this.a, this.b - 1);
         case c -> new fml(this.a - 1, this.b);
         case d -> new fml(this.a + 1, this.b);
      };
   }

   public int a(fmj $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
