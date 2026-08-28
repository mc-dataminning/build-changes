public record fsf(int a, int b) {
   public static fsf a(fsd $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fsf($$1, $$2);
         case b -> new fsf($$2, $$1);
      };
   }

   public fsf a(fse $$0) {
      return switch ($$0) {
         case b -> new fsf(this.a, this.b + 1);
         case a -> new fsf(this.a, this.b - 1);
         case c -> new fsf(this.a - 1, this.b);
         case d -> new fsf(this.a + 1, this.b);
      };
   }

   public int a(fsd $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
