public record ewg(int a, int b) {
   public static ewg a(ewe $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new ewg($$1, $$2);
         case b -> new ewg($$2, $$1);
      };
   }

   public ewg a(ewf $$0) {
      return switch ($$0) {
         case b -> new ewg(this.a, this.b + 1);
         case a -> new ewg(this.a, this.b - 1);
         case c -> new ewg(this.a - 1, this.b);
         case d -> new ewg(this.a + 1, this.b);
      };
   }

   public int a(ewe $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
