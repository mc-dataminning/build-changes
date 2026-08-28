public record fsy(int a, int b) {
   public static fsy a(fsw $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fsy($$1, $$2);
         case b -> new fsy($$2, $$1);
      };
   }

   public fsy a(fsx $$0) {
      return switch ($$0) {
         case b -> new fsy(this.a, this.b + 1);
         case a -> new fsy(this.a, this.b - 1);
         case c -> new fsy(this.a - 1, this.b);
         case d -> new fsy(this.a + 1, this.b);
      };
   }

   public int a(fsw $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
