public record fcv(ajh a, ajh b, ajh c, ajh d) {
   public fcv(ajh $$0, ajh $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fcv(ajh $$0, ajh $$1, ajh $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public ajh a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
