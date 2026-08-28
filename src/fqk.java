public record fqk(int a, int b) {
   public static fqk a(fqi $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fqk($$1, $$2);
         case b -> new fqk($$2, $$1);
      };
   }

   public fqk a(fqj $$0) {
      return switch ($$0) {
         case b -> new fqk(this.a, this.b + 1);
         case a -> new fqk(this.a, this.b - 1);
         case c -> new fqk(this.a - 1, this.b);
         case d -> new fqk(this.a + 1, this.b);
      };
   }

   public int a(fqi $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
