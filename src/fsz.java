public record fsz(int a, int b) {
   public static fsz a(fsx $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fsz($$1, $$2);
         case b -> new fsz($$2, $$1);
      };
   }

   public fsz a(fsy $$0) {
      return switch ($$0) {
         case b -> new fsz(this.a, this.b + 1);
         case a -> new fsz(this.a, this.b - 1);
         case c -> new fsz(this.a - 1, this.b);
         case d -> new fsz(this.a + 1, this.b);
      };
   }

   public int a(fsx $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
