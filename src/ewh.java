public record ewh(int a, int b) {
   public static ewh a(ewf $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new ewh($$1, $$2);
         case b -> new ewh($$2, $$1);
      };
   }

   public ewh a(ewg $$0) {
      return switch ($$0) {
         case b -> new ewh(this.a, this.b + 1);
         case a -> new ewh(this.a, this.b - 1);
         case c -> new ewh(this.a - 1, this.b);
         case d -> new ewh(this.a + 1, this.b);
      };
   }

   public int a(ewf $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
