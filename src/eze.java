public record eze(ahh a, ahh b, ahh c, ahh d) {
   public eze(ahh $$0, ahh $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public eze(ahh $$0, ahh $$1, ahh $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public ahh a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
