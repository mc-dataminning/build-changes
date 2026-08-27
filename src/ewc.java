public record ewc(int a, int b) {
   public static ewc a(ewa $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new ewc($$1, $$2);
         case b -> new ewc($$2, $$1);
      };
   }

   public ewc a(ewb $$0) {
      return switch ($$0) {
         case b -> new ewc(this.a, this.b + 1);
         case a -> new ewc(this.a, this.b - 1);
         case c -> new ewc(this.a - 1, this.b);
         case d -> new ewc(this.a + 1, this.b);
      };
   }

   public int a(ewa $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
