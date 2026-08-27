public record ewr(int a, int b) {
   public static ewr a(ewp $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new ewr($$1, $$2);
         case b -> new ewr($$2, $$1);
      };
   }

   public ewr a(ewq $$0) {
      return switch ($$0) {
         case b -> new ewr(this.a, this.b + 1);
         case a -> new ewr(this.a, this.b - 1);
         case c -> new ewr(this.a - 1, this.b);
         case d -> new ewr(this.a + 1, this.b);
      };
   }

   public int a(ewp $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
