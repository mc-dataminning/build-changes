public record fsm(int a, int b) {
   public static fsm a(fsk $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fsm($$1, $$2);
         case b -> new fsm($$2, $$1);
      };
   }

   public fsm a(fsl $$0) {
      return switch ($$0) {
         case b -> new fsm(this.a, this.b + 1);
         case a -> new fsm(this.a, this.b - 1);
         case c -> new fsm(this.a - 1, this.b);
         case d -> new fsm(this.a + 1, this.b);
      };
   }

   public int a(fsk $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
