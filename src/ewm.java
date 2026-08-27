public record ewm(agi a, agi b, agi c, agi d) {
   public ewm(agi $$0, agi $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public ewm(agi $$0, agi $$1, agi $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public agi a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
