public record exl(int a, int b) {
   public static exl a(exj $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new exl($$1, $$2);
         case b -> new exl($$2, $$1);
      };
   }

   public exl a(exk $$0) {
      return switch ($$0) {
         case b -> new exl(this.a, this.b + 1);
         case a -> new exl(this.a, this.b - 1);
         case c -> new exl(this.a - 1, this.b);
         case d -> new exl(this.a + 1, this.b);
      };
   }

   public int a(exj $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
