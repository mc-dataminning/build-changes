public record fiz(int a, int b) {
   public static fiz a(fix $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fiz($$1, $$2);
         case b -> new fiz($$2, $$1);
      };
   }

   public fiz a(fiy $$0) {
      return switch ($$0) {
         case b -> new fiz(this.a, this.b + 1);
         case a -> new fiz(this.a, this.b - 1);
         case c -> new fiz(this.a - 1, this.b);
         case d -> new fiz(this.a + 1, this.b);
      };
   }

   public int a(fix $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
