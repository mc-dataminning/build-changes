public record faj(int a, int b) {
   public static faj a(fah $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new faj($$1, $$2);
         case b -> new faj($$2, $$1);
      };
   }

   public faj a(fai $$0) {
      return switch ($$0) {
         case b -> new faj(this.a, this.b + 1);
         case a -> new faj(this.a, this.b - 1);
         case c -> new faj(this.a - 1, this.b);
         case d -> new faj(this.a + 1, this.b);
      };
   }

   public int a(fah $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
