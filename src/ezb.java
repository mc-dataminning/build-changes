public record ezb(int a, int b) {
   public static ezb a(eyz $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new ezb($$1, $$2);
         case b -> new ezb($$2, $$1);
      };
   }

   public ezb a(eza $$0) {
      return switch ($$0) {
         case b -> new ezb(this.a, this.b + 1);
         case a -> new ezb(this.a, this.b - 1);
         case c -> new ezb(this.a - 1, this.b);
         case d -> new ezb(this.a + 1, this.b);
      };
   }

   public int a(eyz $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
