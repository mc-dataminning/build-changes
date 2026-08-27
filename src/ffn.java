public record ffn(int a, int b) {
   public static ffn a(ffl $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new ffn($$1, $$2);
         case b -> new ffn($$2, $$1);
      };
   }

   public ffn a(ffm $$0) {
      return switch ($$0) {
         case b -> new ffn(this.a, this.b + 1);
         case a -> new ffn(this.a, this.b - 1);
         case c -> new ffn(this.a - 1, this.b);
         case d -> new ffn(this.a + 1, this.b);
      };
   }

   public int a(ffl $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
