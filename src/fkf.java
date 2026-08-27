public record fkf(int a, int b) {
   public static fkf a(fkd $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fkf($$1, $$2);
         case b -> new fkf($$2, $$1);
      };
   }

   public fkf a(fke $$0) {
      return switch ($$0) {
         case b -> new fkf(this.a, this.b + 1);
         case a -> new fkf(this.a, this.b - 1);
         case c -> new fkf(this.a - 1, this.b);
         case d -> new fkf(this.a + 1, this.b);
      };
   }

   public int a(fkd $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
