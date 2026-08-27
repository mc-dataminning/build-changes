public record eyo(int a, int b) {
   public static eyo a(eym $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new eyo($$1, $$2);
         case b -> new eyo($$2, $$1);
      };
   }

   public eyo a(eyn $$0) {
      return switch ($$0) {
         case b -> new eyo(this.a, this.b + 1);
         case a -> new eyo(this.a, this.b - 1);
         case c -> new eyo(this.a - 1, this.b);
         case d -> new eyo(this.a + 1, this.b);
      };
   }

   public int a(eym $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
