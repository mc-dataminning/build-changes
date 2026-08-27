public record fdl(int a, int b) {
   public static fdl a(fdj $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fdl($$1, $$2);
         case b -> new fdl($$2, $$1);
      };
   }

   public fdl a(fdk $$0) {
      return switch ($$0) {
         case b -> new fdl(this.a, this.b + 1);
         case a -> new fdl(this.a, this.b - 1);
         case c -> new fdl(this.a - 1, this.b);
         case d -> new fdl(this.a + 1, this.b);
      };
   }

   public int a(fdj $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
