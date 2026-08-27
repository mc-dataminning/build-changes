public record etx(aeu a, aeu b, aeu c, aeu d) {
   public etx(aeu $$0, aeu $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public etx(aeu $$0, aeu $$1, aeu $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public aeu a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
