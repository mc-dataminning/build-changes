public record ezg(int a, int b) {
   public static ezg a(eze $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new ezg($$1, $$2);
         case b -> new ezg($$2, $$1);
      };
   }

   public ezg a(ezf $$0) {
      return switch ($$0) {
         case b -> new ezg(this.a, this.b + 1);
         case a -> new ezg(this.a, this.b - 1);
         case c -> new ezg(this.a - 1, this.b);
         case d -> new ezg(this.a + 1, this.b);
      };
   }

   public int a(eze $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
