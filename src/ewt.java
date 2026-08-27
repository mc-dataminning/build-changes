public record ewt(int a, int b) {
   public static ewt a(ewr $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new ewt($$1, $$2);
         case b -> new ewt($$2, $$1);
      };
   }

   public ewt a(ews $$0) {
      return switch ($$0) {
         case b -> new ewt(this.a, this.b + 1);
         case a -> new ewt(this.a, this.b - 1);
         case c -> new ewt(this.a - 1, this.b);
         case d -> new ewt(this.a + 1, this.b);
      };
   }

   public int a(ewr $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
