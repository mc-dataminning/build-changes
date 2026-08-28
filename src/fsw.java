public record fsw(int a, int b) {
   public static fsw a(fsu $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fsw($$1, $$2);
         case b -> new fsw($$2, $$1);
      };
   }

   public fsw a(fsv $$0) {
      return switch ($$0) {
         case b -> new fsw(this.a, this.b + 1);
         case a -> new fsw(this.a, this.b - 1);
         case c -> new fsw(this.a - 1, this.b);
         case d -> new fsw(this.a + 1, this.b);
      };
   }

   public int a(fsu $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
